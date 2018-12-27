package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzmh {
    /* renamed from: a */
    private final HashSet<String> f9606a = new HashSet();
    /* renamed from: b */
    private final Bundle f9607b = new Bundle();
    /* renamed from: c */
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f9608c = new HashMap();
    /* renamed from: d */
    private final HashSet<String> f9609d = new HashSet();
    /* renamed from: e */
    private final Bundle f9610e = new Bundle();
    /* renamed from: f */
    private final HashSet<String> f9611f = new HashSet();
    /* renamed from: g */
    private Date f9612g;
    /* renamed from: h */
    private String f9613h;
    /* renamed from: i */
    private int f9614i = -1;
    /* renamed from: j */
    private Location f9615j;
    /* renamed from: k */
    private boolean f9616k = false;
    /* renamed from: l */
    private String f9617l;
    /* renamed from: m */
    private String f9618m;
    /* renamed from: n */
    private int f9619n = -1;
    /* renamed from: o */
    private boolean f9620o;
    /* renamed from: p */
    private int f9621p = -1;

    /* renamed from: a */
    public final void m10793a(String str) {
        this.f9606a.add(str);
    }

    @Deprecated
    /* renamed from: a */
    public final void m10791a(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            m10792a(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f9608c.put(networkExtras.getClass(), networkExtras);
        }
    }

    /* renamed from: a */
    public final void m10792a(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.f9607b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void m10797b(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f9607b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f9607b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f9607b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void m10798b(String str) {
        this.f9609d.add(str);
    }

    /* renamed from: c */
    public final void m10800c(String str) {
        this.f9609d.remove(str);
    }

    @Deprecated
    /* renamed from: a */
    public final void m10795a(Date date) {
        this.f9612g = date;
    }

    /* renamed from: d */
    public final void m10802d(String str) {
        this.f9613h = str;
    }

    @Deprecated
    /* renamed from: a */
    public final void m10789a(int i) {
        this.f9614i = i;
    }

    /* renamed from: a */
    public final void m10790a(Location location) {
        this.f9615j = location;
    }

    /* renamed from: a */
    public final void m10796a(boolean z) {
        this.f9616k = z;
    }

    /* renamed from: e */
    public final void m10803e(String str) {
        this.f9617l = str;
    }

    /* renamed from: f */
    public final void m10804f(String str) {
        this.f9618m = str;
    }

    /* renamed from: b */
    public final void m10799b(boolean z) {
        this.f9619n = z;
    }

    /* renamed from: a */
    public final void m10794a(String str, String str2) {
        this.f9610e.putString(str, str2);
    }

    /* renamed from: g */
    public final void m10805g(String str) {
        this.f9611f.add(str);
    }

    @Deprecated
    /* renamed from: c */
    public final void m10801c(boolean z) {
        this.f9620o = z;
    }
}
