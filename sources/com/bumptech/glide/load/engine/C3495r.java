package com.bumptech.glide.load.engine;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.p056a.C1167a;
import com.bumptech.glide.p055g.p056a.C1167a.C1164a;
import com.bumptech.glide.p055g.p056a.C1167a.C1165c;
import com.bumptech.glide.p055g.p056a.C1170c;

/* renamed from: com.bumptech.glide.load.engine.r */
final class C3495r<Z> implements C1165c, C1277s<Z> {
    /* renamed from: a */
    private static final C0430a<C3495r<?>> f14509a = C1167a.m4845b(20, new C34941());
    /* renamed from: b */
    private final C1170c f14510b = C1170c.m4851a();
    /* renamed from: c */
    private C1277s<Z> f14511c;
    /* renamed from: d */
    private boolean f14512d;
    /* renamed from: e */
    private boolean f14513e;

    /* renamed from: com.bumptech.glide.load.engine.r$1 */
    class C34941 implements C1164a<C3495r<?>> {
        C34941() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo955b() {
            return m17732a();
        }

        /* renamed from: a */
        public C3495r<?> m17732a() {
            return new C3495r();
        }
    }

    /* renamed from: a */
    static <Z> C3495r<Z> m17734a(C1277s<Z> c1277s) {
        C3495r<Z> c3495r = (C3495r) C1178i.m4880a((C3495r) f14509a.mo338a());
        c3495r.m17736b(c1277s);
        return c3495r;
    }

    C3495r() {
    }

    /* renamed from: b */
    private void m17736b(C1277s<Z> c1277s) {
        this.f14513e = false;
        this.f14512d = true;
        this.f14511c = c1277s;
    }

    /* renamed from: b */
    private void m17735b() {
        this.f14511c = null;
        f14509a.mo339a(this);
    }

    /* renamed from: a */
    synchronized void m17737a() {
        this.f14510b.mo957b();
        if (this.f14512d) {
            this.f14512d = false;
            if (this.f14513e) {
                mo1048f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: c */
    public Class<Z> mo1045c() {
        return this.f14511c.mo1045c();
    }

    /* renamed from: d */
    public Z mo1046d() {
        return this.f14511c.mo1046d();
    }

    /* renamed from: e */
    public int mo1047e() {
        return this.f14511c.mo1047e();
    }

    /* renamed from: f */
    public synchronized void mo1048f() {
        this.f14510b.mo957b();
        this.f14513e = true;
        if (!this.f14512d) {
            this.f14511c.mo1048f();
            m17735b();
        }
    }

    public C1170c e_() {
        return this.f14510b;
    }
}
