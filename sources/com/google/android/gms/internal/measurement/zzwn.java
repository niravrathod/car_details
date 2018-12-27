package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzwn<K, V> extends LinkedHashMap<K, V> {
    /* renamed from: a */
    private static final zzwn f10301a;
    private boolean zzbtu = true;

    private zzwn() {
    }

    private zzwn(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> zzwn<K, V> m12102a() {
        return f10301a;
    }

    /* renamed from: a */
    public final void m12104a(zzwn<K, V> zzwn) {
        m12103e();
        if (!zzwn.isEmpty()) {
            putAll(zzwn);
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m12103e();
        super.clear();
    }

    public final V put(K k, V v) {
        m12103e();
        zzvo.m12069a((Object) k);
        zzvo.m12069a((Object) v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m12103e();
        for (Object next : map.keySet()) {
            zzvo.m12069a(next);
            zzvo.m12069a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m12103e();
        return super.remove(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            obj = (Map) obj;
            if (this != obj) {
                if (size() == obj.size()) {
                    for (Entry entry : entrySet()) {
                        if (obj.containsKey(entry.getKey())) {
                            boolean equals;
                            Object value = entry.getValue();
                            Object obj2 = obj.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                }
            }
            obj = true;
            return obj != null;
        }
    }

    /* renamed from: a */
    private static int m12101a(Object obj) {
        if (obj instanceof byte[]) {
            return zzvo.m12075c((byte[]) obj);
        }
        if (!(obj instanceof zzvp)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m12101a(entry.getValue()) ^ m12101a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final zzwn<K, V> m12105b() {
        return isEmpty() ? new zzwn() : new zzwn(this);
    }

    /* renamed from: c */
    public final void m12106c() {
        this.zzbtu = false;
    }

    /* renamed from: d */
    public final boolean m12107d() {
        return this.zzbtu;
    }

    /* renamed from: e */
    private final void m12103e() {
        if (!this.zzbtu) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzwn zzwn = new zzwn();
        f10301a = zzwn;
        zzwn.zzbtu = false;
    }
}
