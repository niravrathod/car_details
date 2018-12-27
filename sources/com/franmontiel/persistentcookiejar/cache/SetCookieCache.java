package com.franmontiel.persistentcookiejar.cache;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.C2971l;

public class SetCookieCache implements CookieCache {
    /* renamed from: a */
    private Set<IdentifiableCookie> f15665a = new HashSet();

    private class SetCookieCacheIterator implements Iterator<C2971l> {
        /* renamed from: a */
        final /* synthetic */ SetCookieCache f6466a;
        /* renamed from: b */
        private Iterator<IdentifiableCookie> f6467b;

        public /* synthetic */ Object next() {
            return m7717a();
        }

        public SetCookieCacheIterator(SetCookieCache setCookieCache) {
            this.f6466a = setCookieCache;
            this.f6467b = setCookieCache.f15665a.iterator();
        }

        public boolean hasNext() {
            return this.f6467b.hasNext();
        }

        /* renamed from: a */
        public C2971l m7717a() {
            return ((IdentifiableCookie) this.f6467b.next()).m7716a();
        }

        public void remove() {
            this.f6467b.remove();
        }
    }

    /* renamed from: a */
    public void mo1493a(Collection<C2971l> collection) {
        collection = IdentifiableCookie.m7715a(collection).iterator();
        while (collection.hasNext()) {
            IdentifiableCookie identifiableCookie = (IdentifiableCookie) collection.next();
            this.f15665a.remove(identifiableCookie);
            this.f15665a.add(identifiableCookie);
        }
    }

    public Iterator<C2971l> iterator() {
        return new SetCookieCacheIterator(this);
    }
}
