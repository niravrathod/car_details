package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.gson.m */
public final class C4257m extends C2657k {
    /* renamed from: a */
    private final LinkedTreeMap<String, C2657k> f17893a = new LinkedTreeMap();

    /* renamed from: a */
    public void m23353a(String str, C2657k c2657k) {
        if (c2657k == null) {
            c2657k = C4256l.f17892a;
        }
        this.f17893a.put(str, c2657k);
    }

    /* renamed from: a */
    public void m23354a(String str, String str2) {
        m23353a(str, m23352a(str2));
    }

    /* renamed from: a */
    private C2657k m23352a(Object obj) {
        return obj == null ? C4256l.f17892a : new C4258n(obj);
    }

    /* renamed from: o */
    public Set<Entry<String, C2657k>> m23355o() {
        return this.f17893a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C4257m) || ((C4257m) obj).f17893a.equals(this.f17893a) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f17893a.hashCode();
    }
}
