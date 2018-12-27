package android.arch.p001a.p003b;

import android.arch.p001a.p003b.C0012b.C0010c;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: android.arch.a.b.a */
public class C2999a<K, V> extends C0012b<K, V> {
    /* renamed from: a */
    private HashMap<K, C0010c<K, V>> f12705a = new HashMap();

    /* renamed from: a */
    protected C0010c<K, V> mo4a(K k) {
        return (C0010c) this.f12705a.get(k);
    }

    /* renamed from: a */
    public V mo5a(K k, V v) {
        C0010c a = mo4a(k);
        if (a != null) {
            return a.f12b;
        }
        this.f12705a.put(k, m16b(k, v));
        return null;
    }

    /* renamed from: b */
    public V mo6b(K k) {
        V b = super.mo6b(k);
        this.f12705a.remove(k);
        return b;
    }

    /* renamed from: c */
    public boolean m14688c(K k) {
        return this.f12705a.containsKey(k);
    }

    /* renamed from: d */
    public Entry<K, V> m14689d(K k) {
        return m14688c(k) ? ((C0010c) this.f12705a.get(k)).f14d : null;
    }
}
