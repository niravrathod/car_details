package com.crashlytics.android.beta;

import android.annotation.SuppressLint;
import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2796g;
import io.fabric.sdk.android.services.common.C2799j;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.p148c.C2787c;
import io.fabric.sdk.android.services.settings.C2843f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.crashlytics.android.beta.a */
abstract class C3564a implements C1342h {
    /* renamed from: a */
    private final AtomicBoolean f14663a;
    /* renamed from: b */
    private final AtomicBoolean f14664b;
    /* renamed from: c */
    private Context f14665c;
    /* renamed from: d */
    private Beta f14666d;
    /* renamed from: e */
    private IdManager f14667e;
    /* renamed from: f */
    private C2843f f14668f;
    /* renamed from: g */
    private C1339c f14669g;
    /* renamed from: h */
    private C2787c f14670h;
    /* renamed from: i */
    private C2799j f14671i;
    /* renamed from: j */
    private C2834c f14672j;
    /* renamed from: k */
    private long f14673k;

    public C3564a() {
        this(false);
    }

    public C3564a(boolean z) {
        this.f14663a = new AtomicBoolean();
        this.f14673k = 0;
        this.f14664b = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public void mo1120a(Context context, Beta beta, IdManager idManager, C2843f c2843f, C1339c c1339c, C2787c c2787c, C2799j c2799j, C2834c c2834c) {
        this.f14665c = context;
        this.f14666d = beta;
        this.f14667e = idManager;
        this.f14668f = c2843f;
        this.f14669g = c1339c;
        this.f14670h = c2787c;
        this.f14671i = c2799j;
        this.f14672j = c2834c;
        if (m18074b() != null) {
            m18075c();
        }
    }

    /* renamed from: a */
    protected boolean m18073a() {
        this.f14664b.set(true);
        return this.f14663a.get();
    }

    /* renamed from: b */
    boolean m18074b() {
        this.f14663a.set(true);
        return this.f14664b.get();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    protected void m18075c() {
        synchronized (this.f14670h) {
            if (this.f14670h.mo3576a().contains("last_update_check")) {
                this.f14670h.mo3577a(this.f14670h.mo3578b().remove("last_update_check"));
            }
        }
        long a = this.f14671i.mo3580a();
        long j = ((long) this.f14668f.f12026b) * 1000;
        C2774k h = C2766c.m13524h();
        String str = Beta.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Check for updates delay: ");
        stringBuilder.append(j);
        h.mo3554a(str, stringBuilder.toString());
        h = C2766c.m13524h();
        str = Beta.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Check for updates last check time: ");
        stringBuilder.append(m18076d());
        h.mo3554a(str, stringBuilder.toString());
        long d = m18076d() + j;
        C2774k h2 = C2766c.m13524h();
        String str2 = Beta.TAG;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Check for updates current time: ");
        stringBuilder.append(a);
        stringBuilder.append(", next check time: ");
        stringBuilder.append(d);
        h2.mo3554a(str2, stringBuilder.toString());
        if (a >= d) {
            try {
                m18070e();
            } finally {
                m18071a(a);
            }
        } else {
            C2766c.m13524h().mo3554a(Beta.TAG, "Check for updates next check time was not passed");
        }
    }

    /* renamed from: e */
    private void m18070e() {
        C2766c.m13524h().mo3554a(Beta.TAG, "Performing update check");
        new C3566d(this.f14666d, this.f14666d.getOverridenSpiEndpoint(), this.f14668f.f12025a, this.f14672j, new C1341f()).m18081a(new C2796g().m13679a(this.f14665c), (String) this.f14667e.m13655h().get(DeviceIdentifierType.FONT_TOKEN), this.f14669g);
    }

    /* renamed from: a */
    void m18071a(long j) {
        this.f14673k = j;
    }

    /* renamed from: d */
    long m18076d() {
        return this.f14673k;
    }
}
