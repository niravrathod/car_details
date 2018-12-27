package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@zzaer
public final class zzagw {
    /* renamed from: a */
    public final zzahe f8604a = null;
    /* renamed from: b */
    public final zzhq f8605b;
    /* renamed from: c */
    public final zzakh f8606c;
    /* renamed from: d */
    public final zznk f8607d;
    /* renamed from: e */
    public final zzahn f8608e;
    /* renamed from: f */
    public final zzxr f8609f;
    /* renamed from: g */
    public final zzaho f8610g;
    /* renamed from: h */
    public final zzacc f8611h;
    /* renamed from: i */
    public final zzakl f8612i;
    /* renamed from: j */
    public final boolean f8613j;
    /* renamed from: k */
    public final zzahb f8614k;

    private zzagw(zzahe zzahe, zzhq zzhq, zzakh zzakh, zznk zznk, zzahn zzahn, zzxr zzxr, zzaho zzaho, zzacc zzacc, zzakl zzakl, boolean z, zzahb zzahb) {
        this.f8605b = zzhq;
        this.f8606c = zzakh;
        this.f8607d = zznk;
        this.f8608e = zzahn;
        this.f8609f = zzxr;
        this.f8610g = zzaho;
        this.f8611h = zzacc;
        this.f8612i = zzakl;
        this.f8613j = true;
        this.f8614k = zzahb;
    }

    /* renamed from: a */
    public static zzagw m9522a(Context context) {
        zzbv.zzew().m11153a(context);
        zzahb zzahq = new zzahq(context);
        return new zzagw(null, new zzht(), new zzaki(), new zznj(), new zzahl(context, zzahq.mo2241b()), new zzxs(), new zzahp(), new zzacb(), new zzakj(), true, zzahq);
    }
}
