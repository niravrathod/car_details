package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0032o.C0031a;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.n */
public class C3009n implements C0023f {
    /* renamed from: i */
    private static final C3009n f12722i = new C3009n();
    /* renamed from: a */
    private int f12723a = 0;
    /* renamed from: b */
    private int f12724b = 0;
    /* renamed from: c */
    private boolean f12725c = true;
    /* renamed from: d */
    private boolean f12726d = true;
    /* renamed from: e */
    private Handler f12727e;
    /* renamed from: f */
    private final C3004g f12728f = new C3004g(this);
    /* renamed from: g */
    private Runnable f12729g = new C00301(this);
    /* renamed from: h */
    private C0031a f12730h = new C30072(this);

    /* renamed from: android.arch.lifecycle.n$1 */
    class C00301 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3009n f56a;

        C00301(C3009n c3009n) {
            this.f56a = c3009n;
        }

        public void run() {
            this.f56a.m14732e();
            this.f56a.m14733f();
        }
    }

    /* renamed from: android.arch.lifecycle.n$2 */
    class C30072 implements C0031a {
        /* renamed from: a */
        final /* synthetic */ C3009n f12720a;

        /* renamed from: a */
        public void mo20a() {
        }

        C30072(C3009n c3009n) {
            this.f12720a = c3009n;
        }

        /* renamed from: b */
        public void mo21b() {
            this.f12720a.m14734a();
        }

        /* renamed from: c */
        public void mo22c() {
            this.f12720a.m14735b();
        }
    }

    /* renamed from: android.arch.lifecycle.n$3 */
    class C30083 extends C0019b {
        /* renamed from: a */
        final /* synthetic */ C3009n f12721a;

        C30083(C3009n c3009n) {
            this.f12721a = c3009n;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0032o.m79b(activity).m83a(this.f12721a.f12730h);
        }

        public void onActivityPaused(Activity activity) {
            this.f12721a.m14737c();
        }

        public void onActivityStopped(Activity activity) {
            this.f12721a.m14738d();
        }
    }

    /* renamed from: a */
    static void m14729a(Context context) {
        f12722i.m14736b(context);
    }

    /* renamed from: a */
    void m14734a() {
        this.f12723a++;
        if (this.f12723a == 1 && this.f12726d) {
            this.f12728f.m14718a(Event.ON_START);
            this.f12726d = false;
        }
    }

    /* renamed from: b */
    void m14735b() {
        this.f12724b++;
        if (this.f12724b != 1) {
            return;
        }
        if (this.f12725c) {
            this.f12728f.m14718a(Event.ON_RESUME);
            this.f12725c = false;
            return;
        }
        this.f12727e.removeCallbacks(this.f12729g);
    }

    /* renamed from: c */
    void m14737c() {
        this.f12724b--;
        if (this.f12724b == 0) {
            this.f12727e.postDelayed(this.f12729g, 700);
        }
    }

    /* renamed from: d */
    void m14738d() {
        this.f12723a--;
        m14733f();
    }

    /* renamed from: e */
    private void m14732e() {
        if (this.f12724b == 0) {
            this.f12725c = true;
            this.f12728f.m14718a(Event.ON_PAUSE);
        }
    }

    /* renamed from: f */
    private void m14733f() {
        if (this.f12723a == 0 && this.f12725c) {
            this.f12728f.m14718a(Event.ON_STOP);
            this.f12726d = true;
        }
    }

    private C3009n() {
    }

    /* renamed from: b */
    void m14736b(Context context) {
        this.f12727e = new Handler();
        this.f12728f.m14718a(Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C30083(this));
    }

    public Lifecycle getLifecycle() {
        return this.f12728f;
    }
}
