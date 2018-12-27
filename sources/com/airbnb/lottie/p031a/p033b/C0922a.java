package com.airbnb.lottie.p031a.p033b;

import com.airbnb.lottie.p037e.C0959a;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.a */
public abstract class C0922a<K, A> {
    /* renamed from: a */
    final List<C0921a> f3098a = new ArrayList();
    /* renamed from: b */
    protected C0961c<A> f3099b;
    /* renamed from: c */
    private boolean f3100c = false;
    /* renamed from: d */
    private final List<? extends C0959a<K>> f3101d;
    /* renamed from: e */
    private float f3102e = 0.0f;
    /* renamed from: f */
    private C0959a<K> f3103f;

    /* renamed from: com.airbnb.lottie.a.b.a$a */
    public interface C0921a {
        /* renamed from: a */
        void mo866a();
    }

    /* renamed from: a */
    abstract A mo869a(C0959a<K> c0959a, float f);

    C0922a(List<? extends C0959a<K>> list) {
        this.f3101d = list;
    }

    /* renamed from: a */
    public void m3987a() {
        this.f3100c = true;
    }

    /* renamed from: a */
    public void m3989a(C0921a c0921a) {
        this.f3098a.add(c0921a);
    }

    /* renamed from: a */
    public void mo870a(float f) {
        if (f < m3985i()) {
            f = m3985i();
        } else if (f > mo874d()) {
            f = mo874d();
        }
        if (f != this.f3102e) {
            this.f3102e = f;
            mo873b();
        }
    }

    /* renamed from: b */
    public void mo873b() {
        for (int i = 0; i < this.f3098a.size(); i++) {
            ((C0921a) this.f3098a.get(i)).mo866a();
        }
    }

    /* renamed from: g */
    private C0959a<K> mo872g() {
        if (this.f3103f != null && this.f3103f.m4128a(this.f3102e)) {
            return this.f3103f;
        }
        C0959a<K> c0959a = (C0959a) this.f3101d.get(this.f3101d.size() - 1);
        if (this.f3102e < c0959a.m4129b()) {
            for (int size = this.f3101d.size() - 1; size >= 0; size--) {
                c0959a = (C0959a) this.f3101d.get(size);
                if (c0959a.m4128a(this.f3102e)) {
                    break;
                }
            }
        }
        this.f3103f = c0959a;
        return c0959a;
    }

    /* renamed from: c */
    float m3992c() {
        if (this.f3100c) {
            return 0.0f;
        }
        C0959a g = mo872g();
        if (g.m4131d()) {
            return 0.0f;
        }
        return (this.f3102e - g.m4129b()) / (g.m4130c() - g.m4129b());
    }

    /* renamed from: h */
    private float m3984h() {
        C0959a g = mo872g();
        if (g.m4131d()) {
            return 0.0f;
        }
        return g.f3166c.getInterpolation(m3992c());
    }

    /* renamed from: i */
    private float m3985i() {
        return this.f3101d.isEmpty() ? 0.0f : ((C0959a) this.f3101d.get(0)).m4129b();
    }

    /* renamed from: d */
    float mo874d() {
        return this.f3101d.isEmpty() ? 1.0f : ((C0959a) this.f3101d.get(this.f3101d.size() - 1)).m4130c();
    }

    /* renamed from: e */
    public A mo871e() {
        return mo869a(mo872g(), m3984h());
    }

    /* renamed from: f */
    public float m3995f() {
        return this.f3102e;
    }

    /* renamed from: a */
    public void m3990a(C0961c<A> c0961c) {
        if (this.f3099b != null) {
            this.f3099b.m4135a(null);
        }
        this.f3099b = c0961c;
        if (c0961c != null) {
            c0961c.m4135a(this);
        }
    }
}
