package com.crashlytics.android.answers;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent.C1320a;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.p147b.C2782d;
import io.fabric.sdk.android.services.settings.C2839b;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.crashlytics.android.answers.c */
class C3551c implements C2782d {
    /* renamed from: a */
    final ScheduledExecutorService f14638a;
    /* renamed from: b */
    C3562t f14639b = new C4528h();
    /* renamed from: c */
    private final C2771h f14640c;
    /* renamed from: d */
    private final Context f14641d;
    /* renamed from: e */
    private final C1329d f14642e;
    /* renamed from: f */
    private final C1336w f14643f;
    /* renamed from: g */
    private final C2834c f14644g;
    /* renamed from: h */
    private final C1332k f14645h;

    /* renamed from: com.crashlytics.android.answers.c$2 */
    class C13242 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3551c f4177a;

        C13242(C3551c c3551c) {
            this.f4177a = c3551c;
        }

        public void run() {
            try {
                C3562t c3562t = this.f4177a.f14639b;
                this.f4177a.f14639b = new C4528h();
                c3562t.mo3914b();
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(Answers.TAG, "Failed to disable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.c$3 */
    class C13253 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3551c f4178a;

        C13253(C3551c c3551c) {
            this.f4178a = c3551c;
        }

        public void run() {
            try {
                this.f4178a.f14639b.mo3911a();
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(Answers.TAG, "Failed to send events files", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.c$4 */
    class C13264 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3551c f4179a;

        C13264(C3551c c3551c) {
            this.f4179a = c3551c;
        }

        public void run() {
            try {
                C1335u a = this.f4179a.f14643f.m5386a();
                C3557p a2 = this.f4179a.f14642e.m5376a();
                a2.m13566a(this.f4179a);
                this.f4179a.f14639b = new C4529i(this.f4179a.f14640c, this.f4179a.f14641d, this.f4179a.f14638a, a2, this.f4179a.f14644g, a, this.f4179a.f14645h);
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(Answers.TAG, "Failed to enable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.answers.c$5 */
    class C13275 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3551c f4180a;

        C13275(C3551c c3551c) {
            this.f4180a = c3551c;
        }

        public void run() {
            try {
                this.f4180a.f14639b.mo3915c();
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(Answers.TAG, "Failed to flush events", e);
            }
        }
    }

    public C3551c(C2771h c2771h, Context context, C1329d c1329d, C1336w c1336w, C2834c c2834c, ScheduledExecutorService scheduledExecutorService, C1332k c1332k) {
        this.f14640c = c2771h;
        this.f14641d = context;
        this.f14642e = c1329d;
        this.f14643f = c1336w;
        this.f14644g = c2834c;
        this.f14638a = scheduledExecutorService;
        this.f14645h = c1332k;
    }

    /* renamed from: a */
    public void m18023a(C1320a c1320a) {
        m18024a(c1320a, false, false);
    }

    /* renamed from: b */
    public void m18028b(C1320a c1320a) {
        m18024a(c1320a, false, true);
    }

    /* renamed from: c */
    public void m18030c(C1320a c1320a) {
        m18024a(c1320a, true, false);
    }

    /* renamed from: a */
    public void m18025a(final C2839b c2839b, final String str) {
        m18017b(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C3551c f4176c;

            public void run() {
                try {
                    this.f4176c.f14639b.mo3913a(c2839b, str);
                } catch (Throwable e) {
                    C2766c.m13524h().mo3562e(Answers.TAG, "Failed to set analytics settings data", e);
                }
            }
        });
    }

    /* renamed from: a */
    public void m18022a() {
        m18017b(new C13242(this));
    }

    /* renamed from: a */
    public void mo1101a(String str) {
        m18017b(new C13253(this));
    }

    /* renamed from: b */
    public void m18027b() {
        m18017b(new C13264(this));
    }

    /* renamed from: c */
    public void m18029c() {
        m18017b(new C13275(this));
    }

    /* renamed from: a */
    void m18024a(final C1320a c1320a, boolean z, final boolean z2) {
        Runnable c13286 = new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C3551c f4183c;

            public void run() {
                try {
                    this.f4183c.f14639b.mo3912a(c1320a);
                    if (z2) {
                        this.f4183c.f14639b.mo3915c();
                    }
                } catch (Throwable e) {
                    C2766c.m13524h().mo3562e(Answers.TAG, "Failed to process event", e);
                }
            }
        };
        if (z) {
            m18015a(c13286);
        } else {
            m18017b(c13286);
        }
    }

    /* renamed from: a */
    private void m18015a(Runnable runnable) {
        try {
            this.f14638a.submit(runnable).get();
        } catch (Runnable runnable2) {
            C2766c.m13524h().mo3562e(Answers.TAG, "Failed to run events task", runnable2);
        }
    }

    /* renamed from: b */
    private void m18017b(Runnable runnable) {
        try {
            this.f14638a.submit(runnable);
        } catch (Runnable runnable2) {
            C2766c.m13524h().mo3562e(Answers.TAG, "Failed to submit events task", runnable2);
        }
    }
}
