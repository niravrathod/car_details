package com.google.android.gms.internal.measurement;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map.Entry;

final class de implements Comparable<de>, Entry<K, V> {
    /* renamed from: a */
    private final K f10088a;
    /* renamed from: b */
    private V f10089b;
    /* renamed from: c */
    private final /* synthetic */ cx f10090c;

    de(cx cxVar, Entry<K, V> entry) {
        this(cxVar, (Comparable) entry.getKey(), entry.getValue());
    }

    de(cx cxVar, K k, V v) {
        this.f10090c = cxVar;
        this.f10088a = k;
        this.f10089b = v;
    }

    public final V getValue() {
        return this.f10089b;
    }

    public final V setValue(V v) {
        this.f10090c.m11690f();
        V v2 = this.f10089b;
        this.f10089b = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m11702a(this.f10088a, entry.getKey()) && m11702a(this.f10089b, entry.getValue()) != null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f10088a == null ? 0 : this.f10088a.hashCode();
        if (this.f10089b != null) {
            i = this.f10089b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10088a);
        String valueOf2 = String.valueOf(this.f10089b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static boolean m11702a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    public final /* synthetic */ Object getKey() {
        return this.f10088a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((de) obj).getKey());
    }
}
