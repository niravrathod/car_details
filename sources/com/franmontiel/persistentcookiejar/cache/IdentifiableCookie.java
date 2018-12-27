package com.franmontiel.persistentcookiejar.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.C2971l;

class IdentifiableCookie {
    /* renamed from: a */
    private C2971l f6465a;

    /* renamed from: a */
    static List<IdentifiableCookie> m7715a(Collection<C2971l> collection) {
        List<IdentifiableCookie> arrayList = new ArrayList(collection.size());
        for (C2971l identifiableCookie : collection) {
            arrayList.add(new IdentifiableCookie(identifiableCookie));
        }
        return arrayList;
    }

    IdentifiableCookie(C2971l c2971l) {
        this.f6465a = c2971l;
    }

    /* renamed from: a */
    C2971l m7716a() {
        return this.f6465a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof IdentifiableCookie)) {
            return false;
        }
        IdentifiableCookie identifiableCookie = (IdentifiableCookie) obj;
        if (identifiableCookie.f6465a.m14482a().equals(this.f6465a.m14482a()) && identifiableCookie.f6465a.m14489f().equals(this.f6465a.m14489f()) && identifiableCookie.f6465a.m14490g().equals(this.f6465a.m14490g()) && identifiableCookie.f6465a.m14492i() == this.f6465a.m14492i() && identifiableCookie.f6465a.m14488e() == this.f6465a.m14488e()) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.f6465a.m14482a().hashCode()) * 31) + this.f6465a.m14489f().hashCode()) * 31) + this.f6465a.m14490g().hashCode()) * 31) + (this.f6465a.m14492i() ^ 1)) * 31) + (this.f6465a.m14488e() ^ 1);
    }
}
