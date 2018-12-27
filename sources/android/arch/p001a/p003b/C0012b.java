package android.arch.p001a.p003b;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0012b<K, V> implements Iterable<Entry<K, V>> {
    /* renamed from: a */
    private C0010c<K, V> f15a;
    /* renamed from: b */
    private C0010c<K, V> f16b;
    /* renamed from: c */
    private WeakHashMap<C0011f<K, V>, Boolean> f17c = new WeakHashMap();
    /* renamed from: d */
    private int f18d = 0;

    /* renamed from: android.arch.a.b.b$c */
    static class C0010c<K, V> implements Entry<K, V> {
        /* renamed from: a */
        final K f11a;
        /* renamed from: b */
        final V f12b;
        /* renamed from: c */
        C0010c<K, V> f13c;
        /* renamed from: d */
        C0010c<K, V> f14d;

        C0010c(K k, V v) {
            this.f11a = k;
            this.f12b = v;
        }

        public K getKey() {
            return this.f11a;
        }

        public V getValue() {
            return this.f12b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f11a);
            stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuilder.append(this.f12b);
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0010c)) {
                return false;
            }
            C0010c c0010c = (C0010c) obj;
            if (!this.f11a.equals(c0010c.f11a) || this.f12b.equals(c0010c.f12b) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    interface C0011f<K, V> {
        void a_(C0010c<K, V> c0010c);
    }

    /* renamed from: android.arch.a.b.b$d */
    private class C3000d implements C0011f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0012b f12706a;
        /* renamed from: b */
        private C0010c<K, V> f12707b;
        /* renamed from: c */
        private boolean f12708c;

        private C3000d(C0012b c0012b) {
            this.f12706a = c0012b;
            this.f12708c = true;
        }

        public /* synthetic */ Object next() {
            return m14690a();
        }

        public void a_(C0010c<K, V> c0010c) {
            if (c0010c == this.f12707b) {
                this.f12707b = this.f12707b.f14d;
                this.f12708c = this.f12707b == null ? true : null;
            }
        }

        public boolean hasNext() {
            boolean z = false;
            if (this.f12708c) {
                if (this.f12706a.f15a != null) {
                    z = true;
                }
                return z;
            }
            if (!(this.f12707b == null || this.f12707b.f13c == null)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public Entry<K, V> m14690a() {
            if (this.f12708c) {
                this.f12708c = false;
                this.f12707b = this.f12706a.f15a;
            } else {
                this.f12707b = this.f12707b != null ? this.f12707b.f13c : null;
            }
            return this.f12707b;
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    private static abstract class C3001e<K, V> implements C0011f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        C0010c<K, V> f12709a;
        /* renamed from: b */
        C0010c<K, V> f12710b;

        /* renamed from: a */
        abstract C0010c<K, V> mo3691a(C0010c<K, V> c0010c);

        /* renamed from: b */
        abstract C0010c<K, V> mo3692b(C0010c<K, V> c0010c);

        public /* synthetic */ Object next() {
            return m14693a();
        }

        C3001e(C0010c<K, V> c0010c, C0010c<K, V> c0010c2) {
            this.f12709a = c0010c2;
            this.f12710b = c0010c;
        }

        public boolean hasNext() {
            return this.f12710b != null;
        }

        public void a_(C0010c<K, V> c0010c) {
            if (this.f12709a == c0010c && c0010c == this.f12710b) {
                this.f12710b = null;
                this.f12709a = null;
            }
            if (this.f12709a == c0010c) {
                this.f12709a = mo3692b(this.f12709a);
            }
            if (this.f12710b == c0010c) {
                this.f12710b = m14691b();
            }
        }

        /* renamed from: b */
        private C0010c<K, V> m14691b() {
            if (this.f12710b != this.f12709a) {
                if (this.f12709a != null) {
                    return mo3691a(this.f12710b);
                }
            }
            return null;
        }

        /* renamed from: a */
        public Entry<K, V> m14693a() {
            Entry entry = this.f12710b;
            this.f12710b = m14691b();
            return entry;
        }
    }

    /* renamed from: android.arch.a.b.b$a */
    static class C4395a<K, V> extends C3001e<K, V> {
        C4395a(C0010c<K, V> c0010c, C0010c<K, V> c0010c2) {
            super(c0010c, c0010c2);
        }

        /* renamed from: a */
        C0010c<K, V> mo3691a(C0010c<K, V> c0010c) {
            return c0010c.f13c;
        }

        /* renamed from: b */
        C0010c<K, V> mo3692b(C0010c<K, V> c0010c) {
            return c0010c.f14d;
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    private static class C4396b<K, V> extends C3001e<K, V> {
        C4396b(C0010c<K, V> c0010c, C0010c<K, V> c0010c2) {
            super(c0010c, c0010c2);
        }

        /* renamed from: a */
        C0010c<K, V> mo3691a(C0010c<K, V> c0010c) {
            return c0010c.f14d;
        }

        /* renamed from: b */
        C0010c<K, V> mo3692b(C0010c<K, V> c0010c) {
            return c0010c.f13c;
        }
    }

    /* renamed from: a */
    protected C0010c<K, V> mo4a(K k) {
        C0010c<K, V> c0010c = this.f15a;
        while (c0010c != null) {
            if (c0010c.f11a.equals(k)) {
                break;
            }
            c0010c = c0010c.f13c;
        }
        return c0010c;
    }

    /* renamed from: a */
    public V mo5a(K k, V v) {
        C0010c a = mo4a((Object) k);
        if (a != null) {
            return a.f12b;
        }
        m16b(k, v);
        return null;
    }

    /* renamed from: b */
    protected C0010c<K, V> m16b(K k, V v) {
        C0010c<K, V> c0010c = new C0010c(k, v);
        this.f18d++;
        if (this.f16b == null) {
            this.f15a = c0010c;
            this.f16b = this.f15a;
            return c0010c;
        }
        this.f16b.f13c = c0010c;
        c0010c.f14d = this.f16b;
        this.f16b = c0010c;
        return c0010c;
    }

    /* renamed from: b */
    public V mo6b(K k) {
        k = mo4a((Object) k);
        if (k == null) {
            return null;
        }
        this.f18d--;
        if (!this.f17c.isEmpty()) {
            for (C0011f a_ : this.f17c.keySet()) {
                a_.a_(k);
            }
        }
        if (k.f14d != null) {
            k.f14d.f13c = k.f13c;
        } else {
            this.f15a = k.f13c;
        }
        if (k.f13c != null) {
            k.f13c.f14d = k.f14d;
        } else {
            this.f16b = k.f14d;
        }
        k.f13c = null;
        k.f14d = null;
        return k.f12b;
    }

    /* renamed from: a */
    public int m13a() {
        return this.f18d;
    }

    public Iterator<Entry<K, V>> iterator() {
        Iterator c4395a = new C4395a(this.f15a, this.f16b);
        this.f17c.put(c4395a, Boolean.valueOf(false));
        return c4395a;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> m18b() {
        Iterator c4396b = new C4396b(this.f16b, this.f15a);
        this.f17c.put(c4396b, Boolean.valueOf(false));
        return c4396b;
    }

    /* renamed from: c */
    public C3000d m19c() {
        C3000d c3000d = new C3000d();
        this.f17c.put(c3000d, Boolean.valueOf(false));
        return c3000d;
    }

    /* renamed from: d */
    public Entry<K, V> m20d() {
        return this.f15a;
    }

    /* renamed from: e */
    public Entry<K, V> m21e() {
        return this.f16b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0012b)) {
            return false;
        }
        C0012b c0012b = (C0012b) obj;
        if (m13a() != c0012b.m13a()) {
            return false;
        }
        Iterator it = iterator();
        obj = c0012b.iterator();
        while (it.hasNext() && obj.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = obj.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || obj.hasNext() != null) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
