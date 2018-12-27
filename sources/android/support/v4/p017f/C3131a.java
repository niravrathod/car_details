package android.support.v4.p017f;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.f.a */
public class C3131a<K, V> extends C0433m<K, V> implements Map<K, V> {
    /* renamed from: a */
    C0427h<K, V> f13233a;

    /* renamed from: android.support.v4.f.a$1 */
    class C31301 extends C0427h<K, V> {
        /* renamed from: a */
        final /* synthetic */ C3131a f13232a;

        C31301(C3131a c3131a) {
            this.f13232a = c3131a;
        }

        /* renamed from: a */
        protected int mo329a() {
            return this.f13232a.h;
        }

        /* renamed from: a */
        protected Object mo331a(int i, int i2) {
            return this.f13232a.g[(i << 1) + i2];
        }

        /* renamed from: a */
        protected int mo330a(Object obj) {
            return this.f13232a.m1579a(obj);
        }

        /* renamed from: b */
        protected int mo335b(Object obj) {
            return this.f13232a.m1584b(obj);
        }

        /* renamed from: b */
        protected Map<K, V> mo336b() {
            return this.f13232a;
        }

        /* renamed from: a */
        protected void mo334a(K k, V v) {
            this.f13232a.put(k, v);
        }

        /* renamed from: a */
        protected V mo332a(int i, V v) {
            return this.f13232a.mo3893a(i, (Object) v);
        }

        /* renamed from: a */
        protected void mo333a(int i) {
            this.f13232a.mo3896d(i);
        }

        /* renamed from: c */
        protected void mo337c() {
            this.f13232a.clear();
        }
    }

    public C3131a(int i) {
        super(i);
    }

    public C3131a(C0433m c0433m) {
        super(c0433m);
    }

    /* renamed from: b */
    private C0427h<K, V> m15608b() {
        if (this.f13233a == null) {
            this.f13233a = new C31301(this);
        }
        return this.f13233a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m1582a(this.h + map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public boolean m15609a(Collection<?> collection) {
        return C0427h.m1554c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m15608b().m1566d();
    }

    public Set<K> keySet() {
        return m15608b().m1567e();
    }

    public Collection<V> values() {
        return m15608b().m1568f();
    }
}
