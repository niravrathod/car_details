package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class mo<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* renamed from: a */
    private final int f8247a;
    /* renamed from: b */
    private List<mv> f8248b;
    /* renamed from: c */
    private Map<K, V> f8249c;
    /* renamed from: d */
    private boolean f8250d;
    /* renamed from: e */
    private volatile mx f8251e;
    /* renamed from: f */
    private Map<K, V> f8252f;
    /* renamed from: g */
    private volatile mr f8253g;

    /* renamed from: a */
    static <FieldDescriptorType extends zzbcw<FieldDescriptorType>> mo<FieldDescriptorType, Object> m9162a(int i) {
        return new mp(i);
    }

    private mo(int i) {
        this.f8247a = i;
        this.f8248b = Collections.emptyList();
        this.f8249c = Collections.emptyMap();
        this.f8252f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo2122a() {
        if (!this.f8250d) {
            Map emptyMap;
            if (this.f8249c.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8249c);
            }
            this.f8249c = emptyMap;
            if (this.f8252f.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8252f);
            }
            this.f8252f = emptyMap;
            this.f8250d = true;
        }
    }

    /* renamed from: b */
    public final boolean m9174b() {
        return this.f8250d;
    }

    /* renamed from: c */
    public final int m9175c() {
        return this.f8248b.size();
    }

    /* renamed from: b */
    public final Entry<K, V> m9173b(int i) {
        return (Entry) this.f8248b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> m9176d() {
        if (this.f8249c.isEmpty()) {
            return ms.m9179a();
        }
        return this.f8249c.entrySet();
    }

    public int size() {
        return this.f8248b.size() + this.f8249c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m9161a(comparable) < 0) {
            if (this.f8249c.containsKey(comparable) == null) {
                return null;
            }
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m9161a(comparable);
        if (a >= 0) {
            return ((mv) this.f8248b.get(a)).getValue();
        }
        return this.f8249c.get(comparable);
    }

    /* renamed from: a */
    public final V m9171a(K k, V v) {
        m9169f();
        int a = m9161a((Comparable) k);
        if (a >= 0) {
            return ((mv) this.f8248b.get(a)).setValue(v);
        }
        m9169f();
        if (this.f8248b.isEmpty() && !(this.f8248b instanceof ArrayList)) {
            this.f8248b = new ArrayList(this.f8247a);
        }
        a = -(a + 1);
        if (a >= this.f8247a) {
            return m9170g().put(k, v);
        }
        if (this.f8248b.size() == this.f8247a) {
            mv mvVar = (mv) this.f8248b.remove(this.f8247a - 1);
            m9170g().put((Comparable) mvVar.getKey(), mvVar.getValue());
        }
        this.f8248b.add(a, new mv(this, k, v));
        return null;
    }

    public void clear() {
        m9169f();
        if (!this.f8248b.isEmpty()) {
            this.f8248b.clear();
        }
        if (!this.f8249c.isEmpty()) {
            this.f8249c.clear();
        }
    }

    public V remove(Object obj) {
        m9169f();
        Comparable comparable = (Comparable) obj;
        int a = m9161a(comparable);
        if (a >= 0) {
            return m9166c(a);
        }
        if (this.f8249c.isEmpty()) {
            return null;
        }
        return this.f8249c.remove(comparable);
    }

    /* renamed from: c */
    private final V m9166c(int i) {
        m9169f();
        i = ((mv) this.f8248b.remove(i)).getValue();
        if (!this.f8249c.isEmpty()) {
            Iterator it = m9170g().entrySet().iterator();
            this.f8248b.add(new mv(this, (Entry) it.next()));
            it.remove();
        }
        return i;
    }

    /* renamed from: a */
    private final int m9161a(K k) {
        int compareTo;
        int size = this.f8248b.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((mv) this.f8248b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        compareTo = 0;
        while (compareTo <= size) {
            int i = (compareTo + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((mv) this.f8248b.get(i)).getKey());
            if (compareTo2 < 0) {
                size = i - 1;
            } else if (compareTo2 <= 0) {
                return i;
            } else {
                compareTo = i + 1;
            }
        }
        return -(compareTo + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f8251e == null) {
            this.f8251e = new mx();
        }
        return this.f8251e;
    }

    /* renamed from: e */
    final Set<Entry<K, V>> m9177e() {
        if (this.f8253g == null) {
            this.f8253g = new mr();
        }
        return this.f8253g;
    }

    /* renamed from: f */
    private final void m9169f() {
        if (this.f8250d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m9170g() {
        m9169f();
        if (this.f8249c.isEmpty() && !(this.f8249c instanceof TreeMap)) {
            this.f8249c = new TreeMap();
            this.f8252f = ((TreeMap) this.f8249c).descendingMap();
        }
        return (SortedMap) this.f8249c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return super.equals(obj);
        }
        mo moVar = (mo) obj;
        int size = size();
        if (size != moVar.size()) {
            return false;
        }
        int c = m9175c();
        if (c != moVar.m9175c()) {
            return entrySet().equals(moVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!m9173b(i).equals(moVar.m9173b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f8249c.equals(moVar.f8249c);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m9175c(); i2++) {
            i += ((mv) this.f8248b.get(i2)).hashCode();
        }
        return this.f8249c.size() > 0 ? i + this.f8249c.hashCode() : i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m9171a((Comparable) obj, obj2);
    }
}
