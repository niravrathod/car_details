package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent.C1320a;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2796g;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.p147b.C2784f;
import io.fabric.sdk.android.services.p147b.C2785i;
import io.fabric.sdk.android.services.settings.C2839b;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.crashlytics.android.answers.i */
class C4529i implements C3562t {
    /* renamed from: a */
    final C1335u f18838a;
    /* renamed from: b */
    C2784f f18839b;
    /* renamed from: c */
    C2796g f18840c = new C2796g();
    /* renamed from: d */
    C1331j f18841d = new C3554l();
    /* renamed from: e */
    boolean f18842e = true;
    /* renamed from: f */
    boolean f18843f = true;
    /* renamed from: g */
    volatile int f18844g = -1;
    /* renamed from: h */
    boolean f18845h = false;
    /* renamed from: i */
    boolean f18846i = false;
    /* renamed from: j */
    private final C2771h f18847j;
    /* renamed from: k */
    private final C2834c f18848k;
    /* renamed from: l */
    private final Context f18849l;
    /* renamed from: m */
    private final C3557p f18850m;
    /* renamed from: n */
    private final ScheduledExecutorService f18851n;
    /* renamed from: o */
    private final AtomicReference<ScheduledFuture<?>> f18852o = new AtomicReference();
    /* renamed from: p */
    private final C1332k f18853p;

    public C4529i(C2771h c2771h, Context context, ScheduledExecutorService scheduledExecutorService, C3557p c3557p, C2834c c2834c, C1335u c1335u, C1332k c1332k) {
        this.f18847j = c2771h;
        this.f18849l = context;
        this.f18851n = scheduledExecutorService;
        this.f18850m = c3557p;
        this.f18848k = c2834c;
        this.f18838a = c1335u;
        this.f18853p = c1332k;
    }

    /* renamed from: a */
    public void mo3913a(C2839b c2839b, String str) {
        this.f18839b = C3553g.m18038a(new C3558q(this.f18847j, str, c2839b.f11993a, this.f18848k, this.f18840c.m13679a(this.f18849l)));
        this.f18850m.m18045a(c2839b);
        this.f18845h = c2839b.f11998f;
        this.f18846i = c2839b.f11999g;
        str = C2766c.m13524h();
        String str2 = Answers.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase analytics forwarding ");
        stringBuilder.append(this.f18845h ? "enabled" : "disabled");
        str.mo3554a(str2, stringBuilder.toString());
        str = C2766c.m13524h();
        str2 = Answers.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase analytics including purchase events ");
        stringBuilder.append(this.f18846i ? "enabled" : "disabled");
        str.mo3554a(str2, stringBuilder.toString());
        this.f18842e = c2839b.f12000h;
        str = C2766c.m13524h();
        str2 = Answers.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Custom event tracking ");
        stringBuilder.append(this.f18842e ? "enabled" : "disabled");
        str.mo3554a(str2, stringBuilder.toString());
        this.f18843f = c2839b.f12001i;
        str = C2766c.m13524h();
        str2 = Answers.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Predefined event tracking ");
        stringBuilder.append(this.f18843f ? "enabled" : "disabled");
        str.mo3554a(str2, stringBuilder.toString());
        if (c2839b.f12003k > 1) {
            C2766c.m13524h().mo3554a(Answers.TAG, "Event sampling enabled");
            this.f18841d = new C3556o(c2839b.f12003k);
        }
        this.f18844g = c2839b.f11994b;
        m25003a((long) null, (long) this.f18844g);
    }

    /* renamed from: a */
    public void mo3912a(C1320a c1320a) {
        C2774k h;
        String str;
        StringBuilder stringBuilder;
        c1320a = c1320a.m5359a(this.f18838a);
        C2774k h2;
        String str2;
        StringBuilder stringBuilder2;
        if (!this.f18842e && Type.CUSTOM.equals(c1320a.f4162c)) {
            h2 = C2766c.m13524h();
            str2 = Answers.TAG;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Custom events tracking disabled - skipping event: ");
            stringBuilder2.append(c1320a);
            h2.mo3554a(str2, stringBuilder2.toString());
        } else if (!this.f18843f && Type.PREDEFINED.equals(c1320a.f4162c)) {
            h2 = C2766c.m13524h();
            str2 = Answers.TAG;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Predefined events tracking disabled - skipping event: ");
            stringBuilder2.append(c1320a);
            h2.mo3554a(str2, stringBuilder2.toString());
        } else if (this.f18841d.mo1110a(c1320a)) {
            h2 = C2766c.m13524h();
            str2 = Answers.TAG;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Skipping filtered event: ");
            stringBuilder2.append(c1320a);
            h2.mo3554a(str2, stringBuilder2.toString());
        } else {
            Object obj;
            boolean equals;
            try {
                this.f18850m.m13567a((Object) c1320a);
            } catch (Throwable e) {
                h = C2766c.m13524h();
                str = Answers.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to write event: ");
                stringBuilder.append(c1320a);
                h.mo3562e(str, stringBuilder.toString(), e);
            }
            m25009e();
            if (!Type.CUSTOM.equals(c1320a.f4162c)) {
                if (!Type.PREDEFINED.equals(c1320a.f4162c)) {
                    obj = null;
                    equals = "purchase".equals(c1320a.f4166g);
                    if (this.f18845h) {
                        if (obj == null) {
                            if (equals || this.f18846i) {
                                try {
                                    this.f18853p.m5382a(c1320a);
                                } catch (Throwable e2) {
                                    h = C2766c.m13524h();
                                    str = Answers.TAG;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failed to map event to Firebase: ");
                                    stringBuilder.append(c1320a);
                                    h.mo3562e(str, stringBuilder.toString(), e2);
                                }
                            }
                            return;
                        }
                    }
                }
            }
            obj = 1;
            equals = "purchase".equals(c1320a.f4166g);
            if (this.f18845h) {
                if (obj == null) {
                    if (equals) {
                    }
                    this.f18853p.m5382a(c1320a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m25009e() {
        if ((this.f18844g != -1 ? 1 : null) != null) {
            m25003a((long) this.f18844g, (long) this.f18844g);
        }
    }

    /* renamed from: a */
    public void mo3911a() {
        if (this.f18839b == null) {
            CommonUtils.m13610a(this.f18849l, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.m13610a(this.f18849l, "Sending all files");
        List e = this.f18850m.m13572e();
        int i = 0;
        while (e.size() > 0) {
            try {
                CommonUtils.m13610a(this.f18849l, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(e.size())}));
                boolean a = this.f18839b.mo1109a(e);
                if (a) {
                    i += e.size();
                    this.f18850m.m13568a(e);
                }
                if (!a) {
                    break;
                }
                e = this.f18850m.m13572e();
            } catch (Throwable e2) {
                Context context = this.f18849l;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to send batch of analytics files to server: ");
                stringBuilder.append(e2.getMessage());
                CommonUtils.m13611a(context, stringBuilder.toString(), e2);
            }
        }
        if (i == 0) {
            this.f18850m.m13574g();
        }
    }

    /* renamed from: d */
    public void mo3916d() {
        if (this.f18852o.get() != null) {
            CommonUtils.m13610a(this.f18849l, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f18852o.get()).cancel(false);
            this.f18852o.set(null);
        }
    }

    /* renamed from: b */
    public void mo3914b() {
        this.f18850m.m13573f();
    }

    /* renamed from: c */
    public boolean mo3915c() {
        try {
            return this.f18850m.m13571d();
        } catch (Throwable e) {
            CommonUtils.m13611a(this.f18849l, "Failed to roll file over.", e);
            return false;
        }
    }

    /* renamed from: a */
    void m25003a(long j, long j2) {
        if ((this.f18852o.get() == null ? 1 : null) != null) {
            Runnable c2785i = new C2785i(this.f18849l, this);
            Context context = this.f18849l;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scheduling time based file roll over every ");
            stringBuilder.append(j2);
            stringBuilder.append(" seconds");
            CommonUtils.m13610a(context, stringBuilder.toString());
            try {
                this.f18852o.set(this.f18851n.scheduleAtFixedRate(c2785i, j, j2, TimeUnit.SECONDS));
            } catch (Throwable e) {
                CommonUtils.m13611a(this.f18849l, "Failed to schedule time based file roll over", e);
            }
        }
    }
}
