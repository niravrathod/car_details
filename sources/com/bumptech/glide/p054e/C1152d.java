package com.bumptech.glide.p054e;

import android.support.v4.p017f.C3131a;
import com.bumptech.glide.p055g.C1177h;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.e.d */
public class C1152d {
    /* renamed from: a */
    private final AtomicReference<C1177h> f3773a = new AtomicReference();
    /* renamed from: b */
    private final C3131a<C1177h, List<Class<?>>> f3774b = new C3131a();

    /* renamed from: a */
    public List<Class<?>> m4804a(Class<?> cls, Class<?> cls2) {
        List list;
        Object obj = (C1177h) this.f3773a.getAndSet(null);
        if (obj == null) {
            obj = new C1177h(cls, cls2);
        } else {
            obj.m4878a(cls, cls2);
        }
        synchronized (this.f3774b) {
            list = (List) this.f3774b.get(obj);
        }
        this.f3773a.set(obj);
        return list;
    }

    /* renamed from: a */
    public void m4805a(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.f3774b) {
            this.f3774b.put(new C1177h(cls, cls2), list);
        }
    }
}
