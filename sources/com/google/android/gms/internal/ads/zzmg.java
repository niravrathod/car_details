package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzaer
public final class zzmg {
    /* renamed from: a */
    private final Date f9587a;
    /* renamed from: b */
    private final String f9588b;
    /* renamed from: c */
    private final int f9589c;
    /* renamed from: d */
    private final Set<String> f9590d;
    /* renamed from: e */
    private final Location f9591e;
    /* renamed from: f */
    private final boolean f9592f;
    /* renamed from: g */
    private final Bundle f9593g;
    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f9594h;
    /* renamed from: i */
    private final String f9595i;
    /* renamed from: j */
    private final String f9596j;
    /* renamed from: k */
    private final SearchAdRequest f9597k;
    /* renamed from: l */
    private final int f9598l;
    /* renamed from: m */
    private final Set<String> f9599m;
    /* renamed from: n */
    private final Bundle f9600n;
    /* renamed from: o */
    private final Set<String> f9601o;
    /* renamed from: p */
    private final boolean f9602p;
    /* renamed from: q */
    private final zzavc f9603q;
    /* renamed from: r */
    private final int f9604r;
    /* renamed from: s */
    private final String f9605s;

    public zzmg(zzmh zzmh) {
        this(zzmh, null);
    }

    public zzmg(zzmh zzmh, SearchAdRequest searchAdRequest) {
        this.f9587a = zzmh.f9612g;
        this.f9588b = zzmh.f9613h;
        this.f9589c = zzmh.f9614i;
        this.f9590d = Collections.unmodifiableSet(zzmh.f9606a);
        this.f9591e = zzmh.f9615j;
        this.f9592f = zzmh.f9616k;
        this.f9593g = zzmh.f9607b;
        this.f9594h = Collections.unmodifiableMap(zzmh.f9608c);
        this.f9595i = zzmh.f9617l;
        this.f9596j = zzmh.f9618m;
        this.f9597k = searchAdRequest;
        this.f9598l = zzmh.f9619n;
        this.f9599m = Collections.unmodifiableSet(zzmh.f9609d);
        this.f9600n = zzmh.f9610e;
        this.f9601o = Collections.unmodifiableSet(zzmh.f9611f);
        this.f9602p = zzmh.f9620o;
        this.f9603q = null;
        this.f9604r = zzmh.f9621p;
        this.f9605s = null;
    }

    @Deprecated
    /* renamed from: a */
    public final Date m10754a() {
        return this.f9587a;
    }

    /* renamed from: b */
    public final String m10757b() {
        return this.f9588b;
    }

    @Deprecated
    /* renamed from: c */
    public final int m10758c() {
        return this.f9589c;
    }

    /* renamed from: d */
    public final Set<String> m10760d() {
        return this.f9590d;
    }

    /* renamed from: e */
    public final Location m10761e() {
        return this.f9591e;
    }

    /* renamed from: f */
    public final boolean m10762f() {
        return this.f9592f;
    }

    @Deprecated
    /* renamed from: a */
    public final <T extends NetworkExtras> T m10753a(Class<T> cls) {
        return (NetworkExtras) this.f9594h.get(cls);
    }

    /* renamed from: b */
    public final Bundle m10756b(Class<? extends MediationAdapter> cls) {
        return this.f9593g.getBundle(cls.getName());
    }

    /* renamed from: c */
    public final Bundle m10759c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f9593g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle != null ? bundle.getBundle(cls.getName()) : null;
    }

    /* renamed from: g */
    public final String m10763g() {
        return this.f9595i;
    }

    /* renamed from: h */
    public final String m10764h() {
        return this.f9596j;
    }

    /* renamed from: i */
    public final SearchAdRequest m10765i() {
        return this.f9597k;
    }

    /* renamed from: a */
    public final boolean m10755a(Context context) {
        Set set = this.f9599m;
        zzkd.m10709a();
        return set.contains(zzaoa.m9954a(context));
    }

    /* renamed from: j */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> m10766j() {
        return this.f9594h;
    }

    /* renamed from: k */
    public final Bundle m10767k() {
        return this.f9593g;
    }

    /* renamed from: l */
    public final int m10768l() {
        return this.f9598l;
    }

    /* renamed from: m */
    public final Bundle m10769m() {
        return this.f9600n;
    }

    /* renamed from: n */
    public final Set<String> m10770n() {
        return this.f9601o;
    }

    @Deprecated
    /* renamed from: o */
    public final boolean m10771o() {
        return this.f9602p;
    }

    /* renamed from: p */
    public final int m10772p() {
        return this.f9604r;
    }
}
