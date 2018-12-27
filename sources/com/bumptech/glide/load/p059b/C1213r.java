package com.bumptech.glide.load.p059b;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p055g.C1178i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.r */
public class C1213r {
    /* renamed from: a */
    private static final C1212c f3892a = new C1212c();
    /* renamed from: b */
    private static final C1206n<Object, Object> f3893b = new C3431a();
    /* renamed from: c */
    private final List<C1211b<?, ?>> f3894c;
    /* renamed from: d */
    private final C1212c f3895d;
    /* renamed from: e */
    private final Set<C1211b<?, ?>> f3896e;
    /* renamed from: f */
    private final C0430a<List<Throwable>> f3897f;

    /* renamed from: com.bumptech.glide.load.b.r$b */
    private static class C1211b<Model, Data> {
        /* renamed from: a */
        final Class<Data> f3889a;
        /* renamed from: b */
        final C1207o<? extends Model, ? extends Data> f3890b;
        /* renamed from: c */
        private final Class<Model> f3891c;

        public C1211b(Class<Model> cls, Class<Data> cls2, C1207o<? extends Model, ? extends Data> c1207o) {
            this.f3891c = cls;
            this.f3889a = cls2;
            this.f3890b = c1207o;
        }

        /* renamed from: a */
        public boolean m4972a(Class<?> cls, Class<?> cls2) {
            return (m4971a(cls) == null || this.f3889a.isAssignableFrom(cls2) == null) ? null : true;
        }

        /* renamed from: a */
        public boolean m4971a(Class<?> cls) {
            return this.f3891c.isAssignableFrom(cls);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.r$c */
    static class C1212c {
        C1212c() {
        }

        /* renamed from: a */
        public <Model, Data> C3430q<Model, Data> m4973a(List<C1206n<Model, Data>> list, C0430a<List<Throwable>> c0430a) {
            return new C3430q(list, c0430a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.r$a */
    private static class C3431a implements C1206n<Object, Object> {
        /* renamed from: a */
        public C1205a<Object> mo971a(Object obj, int i, int i2, C3452e c3452e) {
            return null;
        }

        /* renamed from: a */
        public boolean mo972a(Object obj) {
            return false;
        }

        C3431a() {
        }
    }

    public C1213r(C0430a<List<Throwable>> c0430a) {
        this(c0430a, f3892a);
    }

    C1213r(C0430a<List<Throwable>> c0430a, C1212c c1212c) {
        this.f3894c = new ArrayList();
        this.f3896e = new HashSet();
        this.f3897f = c0430a;
        this.f3895d = c1212c;
    }

    /* renamed from: a */
    synchronized <Model, Data> void m4979a(Class<Model> cls, Class<Data> cls2, C1207o<? extends Model, ? extends Data> c1207o) {
        m4976a(cls, cls2, c1207o, true);
    }

    /* renamed from: a */
    private <Model, Data> void m4976a(Class<Model> cls, Class<Data> cls2, C1207o<? extends Model, ? extends Data> c1207o, boolean z) {
        this.f3894c.add(z ? this.f3894c.size() : null, new C1211b(cls, cls2, c1207o));
    }

    /* renamed from: a */
    synchronized <Model> List<C1206n<Model, ?>> m4978a(Class<Model> cls) {
        List<C1206n<Model, ?>> arrayList;
        try {
            arrayList = new ArrayList();
            for (C1211b c1211b : this.f3894c) {
                if (!this.f3896e.contains(c1211b)) {
                    if (c1211b.m4971a(cls)) {
                        this.f3896e.add(c1211b);
                        arrayList.add(m4975a(c1211b));
                        this.f3896e.remove(c1211b);
                    }
                }
            }
        } catch (Throwable th) {
            this.f3896e.clear();
        }
        return arrayList;
    }

    /* renamed from: b */
    synchronized List<Class<?>> m4980b(Class<?> cls) {
        List<Class<?>> arrayList;
        arrayList = new ArrayList();
        for (C1211b c1211b : this.f3894c) {
            if (!arrayList.contains(c1211b.f3889a) && c1211b.m4971a(cls)) {
                arrayList.add(c1211b.f3889a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> C1206n<Model, Data> m4977a(Class<Model> cls, Class<Data> cls2) {
        try {
            List arrayList = new ArrayList();
            Object obj = null;
            for (C1211b c1211b : this.f3894c) {
                if (this.f3896e.contains(c1211b)) {
                    obj = 1;
                } else if (c1211b.m4972a(cls, cls2)) {
                    this.f3896e.add(c1211b);
                    arrayList.add(m4975a(c1211b));
                    this.f3896e.remove(c1211b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f3895d.m4973a(arrayList, this.f3897f);
            } else if (arrayList.size() == 1) {
                return (C1206n) arrayList.get(0);
            } else if (obj != null) {
                return C1213r.m4974a();
            } else {
                throw new NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f3896e.clear();
        }
    }

    /* renamed from: a */
    private <Model, Data> C1206n<Model, Data> m4975a(C1211b<?, ?> c1211b) {
        return (C1206n) C1178i.m4880a(c1211b.f3890b.mo970a(this));
    }

    /* renamed from: a */
    private static <Model, Data> C1206n<Model, Data> m4974a() {
        return f3893b;
    }
}
