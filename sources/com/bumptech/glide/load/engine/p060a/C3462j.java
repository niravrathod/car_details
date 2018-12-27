package com.bumptech.glide.load.engine.p060a;

import android.util.Log;
import com.bumptech.glide.p055g.C1178i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.j */
public final class C3462j implements C1230b {
    /* renamed from: a */
    private final C1234h<C3460a, Object> f14399a;
    /* renamed from: b */
    private final C3461b f14400b;
    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f14401c;
    /* renamed from: d */
    private final Map<Class<?>, C1229a<?>> f14402d;
    /* renamed from: e */
    private final int f14403e;
    /* renamed from: f */
    private int f14404f;

    /* renamed from: com.bumptech.glide.load.engine.a.j$a */
    private static final class C3460a implements C1237m {
        /* renamed from: a */
        int f14396a;
        /* renamed from: b */
        private final C3461b f14397b;
        /* renamed from: c */
        private Class<?> f14398c;

        C3460a(C3461b c3461b) {
            this.f14397b = c3461b;
        }

        /* renamed from: a */
        void m17586a(int i, Class<?> cls) {
            this.f14396a = i;
            this.f14398c = cls;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C3460a)) {
                return false;
            }
            C3460a c3460a = (C3460a) obj;
            if (this.f14396a == c3460a.f14396a && this.f14398c == c3460a.f14398c) {
                z = true;
            }
            return z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key{size=");
            stringBuilder.append(this.f14396a);
            stringBuilder.append("array=");
            stringBuilder.append(this.f14398c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public void mo994a() {
            this.f14397b.m5029a(this);
        }

        public int hashCode() {
            return (this.f14396a * 31) + (this.f14398c != null ? this.f14398c.hashCode() : 0);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.j$b */
    private static final class C3461b extends C1231d<C3460a> {
        /* renamed from: b */
        protected /* synthetic */ C1237m mo995b() {
            return m17587a();
        }

        C3461b() {
        }

        /* renamed from: a */
        C3460a m17588a(int i, Class<?> cls) {
            C3460a c3460a = (C3460a) m5031c();
            c3460a.m17586a(i, cls);
            return c3460a;
        }

        /* renamed from: a */
        protected C3460a m17587a() {
            return new C3460a(this);
        }
    }

    public C3462j() {
        this.f14399a = new C1234h();
        this.f14400b = new C3461b();
        this.f14401c = new HashMap();
        this.f14402d = new HashMap();
        this.f14403e = 4194304;
    }

    public C3462j(int i) {
        this.f14399a = new C1234h();
        this.f14400b = new C3461b();
        this.f14401c = new HashMap();
        this.f14402d = new HashMap();
        this.f14403e = i;
    }

    /* renamed from: a */
    public synchronized <T> void mo1014a(T t) {
        Class cls = t.getClass();
        C1229a b = m17594b(cls);
        int a = b.mo1007a((Object) t);
        int b2 = b.mo1010b() * a;
        if (m17597b(b2)) {
            C3460a a2 = this.f14400b.m17588a(a, cls);
            this.f14399a.m5046a(a2, t);
            t = m17592a(cls);
            Integer num = (Integer) t.get(Integer.valueOf(a2.f14396a));
            Integer valueOf = Integer.valueOf(a2.f14396a);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            t.put(valueOf, Integer.valueOf(i));
            this.f14404f += b2;
            m17598c();
        }
    }

    /* renamed from: b */
    public synchronized <T> T mo1015b(int i, Class<T> cls) {
        return m17591a(this.f14400b.m17588a(i, cls), (Class) cls);
    }

    /* renamed from: a */
    public synchronized <T> T mo1011a(int i, Class<T> cls) {
        C3460a a;
        Integer num = (Integer) m17592a((Class) cls).ceilingKey(Integer.valueOf(i));
        if (m17593a(i, num)) {
            a = this.f14400b.m17588a(num.intValue(), cls);
        } else {
            a = this.f14400b.m17588a(i, cls);
        }
        return m17591a(a, (Class) cls);
    }

    /* renamed from: a */
    private <T> T m17591a(C3460a c3460a, Class<T> cls) {
        C1229a b = m17594b((Class) cls);
        Object a = m17590a(c3460a);
        if (a != null) {
            this.f14404f -= b.mo1007a(a) * b.mo1010b();
            m17600c(b.mo1007a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(b.mo1009a(), 2) != null) {
            cls = b.mo1009a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Allocated ");
            stringBuilder.append(c3460a.f14396a);
            stringBuilder.append(" bytes");
            Log.v(cls, stringBuilder.toString());
        }
        return b.mo1008a(c3460a.f14396a);
    }

    /* renamed from: a */
    private <T> T m17590a(C3460a c3460a) {
        return this.f14399a.m5045a((C1237m) c3460a);
    }

    /* renamed from: b */
    private boolean m17597b(int i) {
        return i <= this.f14403e / 2;
    }

    /* renamed from: a */
    private boolean m17593a(int i, Integer num) {
        return num != null && (m17596b() || num.intValue() <= i * 8);
    }

    /* renamed from: b */
    private boolean m17596b() {
        if (this.f14404f != 0) {
            if (this.f14403e / this.f14404f < 2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo1012a() {
        m17599c(0);
    }

    /* renamed from: a */
    public synchronized void mo1013a(int i) {
        if (i >= 40) {
            mo1012a();
        } else if (i >= 20 || i == 15) {
            m17599c(this.f14403e / 2);
        }
    }

    /* renamed from: c */
    private void m17598c() {
        m17599c(this.f14403e);
    }

    /* renamed from: c */
    private void m17599c(int i) {
        while (this.f14404f > i) {
            Object a = this.f14399a.m5044a();
            C1178i.m4880a(a);
            C1229a b = m17595b(a);
            this.f14404f -= b.mo1007a(a) * b.mo1010b();
            m17600c(b.mo1007a(a), a.getClass());
            if (Log.isLoggable(b.mo1009a(), 2)) {
                String a2 = b.mo1009a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("evicted: ");
                stringBuilder.append(b.mo1007a(a));
                Log.v(a2, stringBuilder.toString());
            }
        }
    }

    /* renamed from: c */
    private void m17600c(int i, Class<?> cls) {
        cls = m17592a((Class) cls);
        Integer num = (Integer) cls.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(i);
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num.intValue() == 1) {
            cls.remove(Integer.valueOf(i));
        } else {
            cls.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m17592a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f14401c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f14401c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    private <T> C1229a<T> m17595b(T t) {
        return m17594b(t.getClass());
    }

    /* renamed from: b */
    private <T> C1229a<T> m17594b(Class<T> cls) {
        C1229a<T> c1229a = (C1229a) this.f14402d.get(cls);
        if (c1229a == null) {
            if (cls.equals(int[].class)) {
                c1229a = new C3459i();
            } else if (cls.equals(byte[].class)) {
                c1229a = new C3458g();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No array pool found for: ");
                stringBuilder.append(cls.getSimpleName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f14402d.put(cls, c1229a);
        }
        return c1229a;
    }
}
