package com.bumptech.glide.p054e;

import android.support.v4.p017f.C3131a;
import com.bumptech.glide.load.engine.C1264g;
import com.bumptech.glide.load.engine.C1276q;
import com.bumptech.glide.load.resource.p066e.C3543g;
import com.bumptech.glide.p055g.C1177h;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.e.c */
public class C1151c {
    /* renamed from: a */
    private static final C1276q<?, ?, ?> f3770a = new C1276q(Object.class, Object.class, Object.class, Collections.singletonList(new C1264g(Object.class, Object.class, Object.class, Collections.emptyList(), new C3543g(), null)), null);
    /* renamed from: b */
    private final C3131a<C1177h, C1276q<?, ?, ?>> f3771b = new C3131a();
    /* renamed from: c */
    private final AtomicReference<C1177h> f3772c = new AtomicReference();

    /* renamed from: a */
    public boolean m4803a(C1276q<?, ?, ?> c1276q) {
        return f3770a.equals(c1276q);
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1276q<Data, TResource, Transcode> m4801a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1276q c1276q;
        cls = m4800b(cls, cls2, cls3);
        synchronized (this.f3771b) {
            c1276q = (C1276q) this.f3771b.get(cls);
        }
        this.f3772c.set(cls);
        return c1276q;
    }

    /* renamed from: a */
    public void m4802a(Class<?> cls, Class<?> cls2, Class<?> cls3, C1276q<?, ?, ?> c1276q) {
        synchronized (this.f3771b) {
            C3131a c3131a = this.f3771b;
            C1177h c1177h = new C1177h(cls, cls2, cls3);
            if (c1276q == null) {
                c1276q = f3770a;
            }
            c3131a.put(c1177h, c1276q);
        }
    }

    /* renamed from: b */
    private C1177h m4800b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1177h c1177h = (C1177h) this.f3772c.getAndSet(null);
        if (c1177h == null) {
            c1177h = new C1177h();
        }
        c1177h.m4879a(cls, cls2, cls3);
        return c1177h;
    }
}
