package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzbef<K, V> extends LinkedHashMap<K, V> {
    /* renamed from: a */
    private static final zzbef f9200a;
    private boolean zzdsw = true;

    private zzbef() {
    }

    private zzbef(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> zzbef<K, V> m10362a() {
        return f9200a;
    }

    /* renamed from: a */
    public final void m10364a(zzbef<K, V> zzbef) {
        m10363e();
        if (!zzbef.isEmpty()) {
            putAll(zzbef);
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m10363e();
        super.clear();
    }

    public final V put(K k, V v) {
        m10363e();
        zzbdf.m10328a((Object) k);
        zzbdf.m10328a((Object) v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m10363e();
        for (Object next : map.keySet()) {
            zzbdf.m10328a(next);
            zzbdf.m10328a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m10363e();
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
    private static int m10361a(Object obj) {
        if (obj instanceof byte[]) {
            return zzbdf.m10334c((byte[]) obj);
        }
        if (!(obj instanceof zzbdg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m10361a(entry.getValue()) ^ m10361a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final zzbef<K, V> m10365b() {
        return isEmpty() ? new zzbef() : new zzbef(this);
    }

    /* renamed from: c */
    public final void m10366c() {
        this.zzdsw = false;
    }

    /* renamed from: d */
    public final boolean m10367d() {
        return this.zzdsw;
    }

    /* renamed from: e */
    private final void m10363e() {
        if (!this.zzdsw) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzbef zzbef = new zzbef();
        f9200a = zzbef;
        zzbef.zzdsw = false;
    }
}
