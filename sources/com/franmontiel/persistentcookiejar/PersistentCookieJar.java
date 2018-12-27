package com.franmontiel.persistentcookiejar;

import com.franmontiel.persistentcookiejar.cache.CookieCache;
import com.franmontiel.persistentcookiejar.persistence.CookiePersistor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.C2971l;
import okhttp3.HttpUrl;

public class PersistentCookieJar implements ClearableCookieJar {
    /* renamed from: b */
    private CookieCache f19305b;
    /* renamed from: c */
    private CookiePersistor f19306c;

    public PersistentCookieJar(CookieCache cookieCache, CookiePersistor cookiePersistor) {
        this.f19305b = cookieCache;
        this.f19306c = cookiePersistor;
        this.f19305b.mo1493a(cookiePersistor.mo1494a());
    }

    /* renamed from: a */
    public synchronized void mo3676a(HttpUrl httpUrl, List<C2971l> list) {
        this.f19305b.mo1493a(list);
        this.f19306c.mo1495a(m25696a((List) list));
    }

    /* renamed from: a */
    private static List<C2971l> m25696a(List<C2971l> list) {
        List<C2971l> arrayList = new ArrayList();
        for (C2971l c2971l : list) {
            if (c2971l.m14486c()) {
                arrayList.add(c2971l);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized List<C2971l> mo3675a(HttpUrl httpUrl) {
        List<C2971l> arrayList;
        Collection arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        Iterator it = this.f19305b.iterator();
        while (it.hasNext()) {
            C2971l c2971l = (C2971l) it.next();
            if (m25697a(c2971l)) {
                arrayList2.add(c2971l);
                it.remove();
            } else if (c2971l.m14484a(httpUrl)) {
                arrayList.add(c2971l);
            }
        }
        this.f19306c.mo1496b(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m25697a(C2971l c2971l) {
        return c2971l.m14487d() < System.currentTimeMillis() ? true : null;
    }
}
