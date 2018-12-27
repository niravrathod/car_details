package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map.Entry;

final class mv implements Comparable<mv>, Entry<K, V> {
    /* renamed from: a */
    private final K f8259a;
    /* renamed from: b */
    private V f8260b;
    /* renamed from: c */
    private final /* synthetic */ mo f8261c;

    mv(mo moVar, Entry<K, V> entry) {
        this(moVar, (Comparable) entry.getKey(), entry.getValue());
    }

    mv(mo moVar, K k, V v) {
        this.f8261c = moVar;
        this.f8259a = k;
        this.f8260b = v;
    }

    public final V getValue() {
        return this.f8260b;
    }

    public final V setValue(V v) {
        this.f8261c.m9169f();
        V v2 = this.f8260b;
        this.f8260b = v;
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
        return m9181a(this.f8259a, entry.getKey()) && m9181a(this.f8260b, entry.getValue()) != null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f8259a == null ? 0 : this.f8259a.hashCode();
        if (this.f8260b != null) {
            i = this.f8260b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8259a);
        String valueOf2 = String.valueOf(this.f8260b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static boolean m9181a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    public final /* synthetic */ Object getKey() {
        return this.f8259a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((mv) obj).getKey());
    }
}
