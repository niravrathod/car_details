package android.support.v7.view;

import android.support.v4.view.C0568v;
import android.support.v4.view.C0569w;
import android.support.v4.view.C3173x;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public class C0713h {
    /* renamed from: a */
    final ArrayList<C0568v> f2295a = new ArrayList();
    /* renamed from: b */
    C0569w f2296b;
    /* renamed from: c */
    private long f2297c = -1;
    /* renamed from: d */
    private Interpolator f2298d;
    /* renamed from: e */
    private boolean f2299e;
    /* renamed from: f */
    private final C3173x f2300f = new C44591(this);

    /* renamed from: android.support.v7.view.h$1 */
    class C44591 extends C3173x {
        /* renamed from: a */
        final /* synthetic */ C0713h f18489a;
        /* renamed from: b */
        private boolean f18490b = false;
        /* renamed from: c */
        private int f18491c = 0;

        C44591(C0713h c0713h) {
            this.f18489a = c0713h;
        }

        /* renamed from: a */
        public void mo452a(View view) {
            if (this.f18490b == null) {
                this.f18490b = true;
                if (this.f18489a.f2296b != null) {
                    this.f18489a.f2296b.mo452a(null);
                }
            }
        }

        /* renamed from: a */
        void m24417a() {
            this.f18491c = 0;
            this.f18490b = false;
            this.f18489a.m2807b();
        }

        /* renamed from: b */
        public void mo453b(View view) {
            view = this.f18491c + 1;
            this.f18491c = view;
            if (view == this.f18489a.f2295a.size()) {
                if (this.f18489a.f2296b != null) {
                    this.f18489a.f2296b.mo453b(null);
                }
                m24417a();
            }
        }
    }

    /* renamed from: a */
    public C0713h m2802a(C0568v c0568v) {
        if (!this.f2299e) {
            this.f2295a.add(c0568v);
        }
        return this;
    }

    /* renamed from: a */
    public C0713h m2803a(C0568v c0568v, C0568v c0568v2) {
        this.f2295a.add(c0568v);
        c0568v2.m2242b(c0568v.m2235a());
        this.f2295a.add(c0568v2);
        return this;
    }

    /* renamed from: a */
    public void m2806a() {
        if (!this.f2299e) {
            Iterator it = this.f2295a.iterator();
            while (it.hasNext()) {
                C0568v c0568v = (C0568v) it.next();
                if (this.f2297c >= 0) {
                    c0568v.m2237a(this.f2297c);
                }
                if (this.f2298d != null) {
                    c0568v.m2240a(this.f2298d);
                }
                if (this.f2296b != null) {
                    c0568v.m2238a(this.f2300f);
                }
                c0568v.m2244c();
            }
            this.f2299e = true;
        }
    }

    /* renamed from: b */
    void m2807b() {
        this.f2299e = false;
    }

    /* renamed from: c */
    public void m2808c() {
        if (this.f2299e) {
            Iterator it = this.f2295a.iterator();
            while (it.hasNext()) {
                ((C0568v) it.next()).m2243b();
            }
            this.f2299e = false;
        }
    }

    /* renamed from: a */
    public C0713h m2801a(long j) {
        if (!this.f2299e) {
            this.f2297c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0713h m2805a(Interpolator interpolator) {
        if (!this.f2299e) {
            this.f2298d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0713h m2804a(C0569w c0569w) {
        if (!this.f2299e) {
            this.f2296b = c0569w;
        }
        return this;
    }
}
