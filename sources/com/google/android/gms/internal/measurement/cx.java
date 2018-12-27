package com.google.android.gms.internal.measurement;

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

class cx<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* renamed from: a */
    private final int f10076a;
    /* renamed from: b */
    private List<de> f10077b;
    /* renamed from: c */
    private Map<K, V> f10078c;
    /* renamed from: d */
    private boolean f10079d;
    /* renamed from: e */
    private volatile dg f10080e;
    /* renamed from: f */
    private Map<K, V> f10081f;
    /* renamed from: g */
    private volatile da f10082g;

    /* renamed from: a */
    static <FieldDescriptorType extends zzvf<FieldDescriptorType>> cx<FieldDescriptorType, Object> m11683a(int i) {
        return new cy(i);
    }

    private cx(int i) {
        this.f10076a = i;
        this.f10077b = Collections.emptyList();
        this.f10078c = Collections.emptyMap();
        this.f10081f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo3076a() {
        if (!this.f10079d) {
            Map emptyMap;
            if (this.f10078c.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f10078c);
            }
            this.f10078c = emptyMap;
            if (this.f10081f.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f10081f);
            }
            this.f10081f = emptyMap;
            this.f10079d = true;
        }
    }

    /* renamed from: b */
    public final boolean m11695b() {
        return this.f10079d;
    }

    /* renamed from: c */
    public final int m11696c() {
        return this.f10077b.size();
    }

    /* renamed from: b */
    public final Entry<K, V> m11694b(int i) {
        return (Entry) this.f10077b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> m11697d() {
        if (this.f10078c.isEmpty()) {
            return db.m11700a();
        }
        return this.f10078c.entrySet();
    }

    public int size() {
        return this.f10077b.size() + this.f10078c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m11682a(comparable) < 0) {
            if (this.f10078c.containsKey(comparable) == null) {
                return null;
            }
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m11682a(comparable);
        if (a >= 0) {
            return ((de) this.f10077b.get(a)).getValue();
        }
        return this.f10078c.get(comparable);
    }

    /* renamed from: a */
    public final V m11692a(K k, V v) {
        m11690f();
        int a = m11682a((Comparable) k);
        if (a >= 0) {
            return ((de) this.f10077b.get(a)).setValue(v);
        }
        m11690f();
        if (this.f10077b.isEmpty() && !(this.f10077b instanceof ArrayList)) {
            this.f10077b = new ArrayList(this.f10076a);
        }
        a = -(a + 1);
        if (a >= this.f10076a) {
            return m11691g().put(k, v);
        }
        if (this.f10077b.size() == this.f10076a) {
            de deVar = (de) this.f10077b.remove(this.f10076a - 1);
            m11691g().put((Comparable) deVar.getKey(), deVar.getValue());
        }
        this.f10077b.add(a, new de(this, k, v));
        return null;
    }

    public void clear() {
        m11690f();
        if (!this.f10077b.isEmpty()) {
            this.f10077b.clear();
        }
        if (!this.f10078c.isEmpty()) {
            this.f10078c.clear();
        }
    }

    public V remove(Object obj) {
        m11690f();
        Comparable comparable = (Comparable) obj;
        int a = m11682a(comparable);
        if (a >= 0) {
            return m11687c(a);
        }
        if (this.f10078c.isEmpty()) {
            return null;
        }
        return this.f10078c.remove(comparable);
    }

    /* renamed from: c */
    private final V m11687c(int i) {
        m11690f();
        i = ((de) this.f10077b.remove(i)).getValue();
        if (!this.f10078c.isEmpty()) {
            Iterator it = m11691g().entrySet().iterator();
            this.f10077b.add(new de(this, (Entry) it.next()));
            it.remove();
        }
        return i;
    }

    /* renamed from: a */
    private final int m11682a(K k) {
        int compareTo;
        int size = this.f10077b.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((de) this.f10077b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((de) this.f10077b.get(i)).getKey());
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
        if (this.f10080e == null) {
            this.f10080e = new dg();
        }
        return this.f10080e;
    }

    /* renamed from: e */
    final Set<Entry<K, V>> m11698e() {
        if (this.f10082g == null) {
            this.f10082g = new da();
        }
        return this.f10082g;
    }

    /* renamed from: f */
    private final void m11690f() {
        if (this.f10079d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m11691g() {
        m11690f();
        if (this.f10078c.isEmpty() && !(this.f10078c instanceof TreeMap)) {
            this.f10078c = new TreeMap();
            this.f10081f = ((TreeMap) this.f10078c).descendingMap();
        }
        return (SortedMap) this.f10078c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return super.equals(obj);
        }
        cx cxVar = (cx) obj;
        int size = size();
        if (size != cxVar.size()) {
            return false;
        }
        int c = m11696c();
        if (c != cxVar.m11696c()) {
            return entrySet().equals(cxVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!m11694b(i).equals(cxVar.m11694b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f10078c.equals(cxVar.f10078c);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m11696c(); i2++) {
            i += ((de) this.f10077b.get(i2)).hashCode();
        }
        return this.f10078c.size() > 0 ? i + this.f10078c.hashCode() : i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m11692a((Comparable) obj, obj2);
    }
}
