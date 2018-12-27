package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Activity;
import io.fabric.sdk.android.C2764a;
import io.fabric.sdk.android.C2764a.C2763b;
import java.util.concurrent.ExecutorService;

@TargetApi(14)
/* renamed from: com.crashlytics.android.beta.b */
class C4530b extends C3564a {
    /* renamed from: a */
    private final C2763b f18854a = new C35651(this);
    /* renamed from: b */
    private final ExecutorService f18855b;

    /* renamed from: com.crashlytics.android.beta.b$1 */
    class C35651 extends C2763b {
        /* renamed from: a */
        final /* synthetic */ C4530b f14674a;

        /* renamed from: com.crashlytics.android.beta.b$1$1 */
        class C13381 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C35651 f4207a;

            C13381(C35651 c35651) {
                this.f4207a = c35651;
            }

            public void run() {
                this.f4207a.f14674a.m18075c();
            }
        }

        C35651(C4530b c4530b) {
            this.f14674a = c4530b;
        }

        /* renamed from: a */
        public void mo1102a(Activity activity) {
            if (this.f14674a.m18073a() != null) {
                this.f14674a.f18855b.submit(new C13381(this));
            }
        }
    }

    public C4530b(C2764a c2764a, ExecutorService executorService) {
        this.f18855b = executorService;
        c2764a.m13510a(this.f18854a);
    }
}
