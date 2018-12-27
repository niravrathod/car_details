package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

@zzaer
public final class zzahr {
    /* renamed from: a */
    private static final zzym f8727a = new zzym();
    /* renamed from: b */
    private final zzyn f8728b;
    /* renamed from: c */
    private final zzbw f8729c;
    /* renamed from: d */
    private final Map<String, zzajf> f8730d = new HashMap();
    /* renamed from: e */
    private final zzaiy f8731e;
    /* renamed from: f */
    private final zzb f8732f;
    /* renamed from: g */
    private final zzact f8733g;

    public zzahr(zzbw zzbw, zzyn zzyn, zzaiy zzaiy, zzb zzb, zzact zzact) {
        this.f8729c = zzbw;
        this.f8728b = zzyn;
        this.f8731e = zzaiy;
        this.f8732f = zzb;
        this.f8733g = zzact;
    }

    /* renamed from: a */
    public static boolean m9560a(zzakm zzakm, zzakm zzakm2) {
        return true;
    }

    /* renamed from: a */
    public final zzb m9561a() {
        return this.f8732f;
    }

    /* renamed from: b */
    public final zzact m9566b() {
        return this.f8733g;
    }

    /* renamed from: a */
    public final zzajf m9562a(String str) {
        Throwable e;
        String str2;
        zzajf zzajf = (zzajf) this.f8730d.get(str);
        if (zzajf != null) {
            return zzajf;
        }
        try {
            zzyn zzyn = this.f8728b;
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzyn = f8727a;
            }
            zzajf zzajf2 = new zzajf(zzyn.mo2756a(str), this.f8731e);
            try {
                this.f8730d.put(str, zzajf2);
                return zzajf2;
            } catch (Exception e2) {
                e = e2;
                zzajf = zzajf2;
                str2 = "Fail to instantiate adapter ";
                str = String.valueOf(str);
                zzaok.m10004c(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                return zzajf;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "Fail to instantiate adapter ";
            str = String.valueOf(str);
            if (str.length() == 0) {
            }
            zzaok.m10004c(str.length() == 0 ? new String(str2) : str2.concat(str), e);
            return zzajf;
        }
    }

    /* renamed from: c */
    public final void m9567c() {
        this.f8729c.zzaen = 0;
        zzbw zzbw = this.f8729c;
        zzbv.zzej();
        zzami zzajb = new zzajb(this.f8729c.zzrx, this.f8729c.zzadm, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zzajb.getClass().getName());
        zzaok.m10001b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzajb.mo2219c();
        zzbw.zzadj = zzajb;
    }

    /* renamed from: a */
    public final void m9565a(boolean z) {
        zzajf a = m9562a(this.f8729c.zzadl.f8796q);
        if (!(a == null || a.m9626a() == null)) {
            try {
                a.m9626a().mo2770a(z);
                a.m9626a().mo2775f();
            } catch (boolean z2) {
                zzaok.m10006d("#007 Could not call remote method.", z2);
            }
        }
    }

    /* renamed from: d */
    public final void m9568d() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        for (String str : this.f8730d.keySet()) {
            try {
                zzajf zzajf = (zzajf) this.f8730d.get(str);
                if (!(zzajf == null || zzajf.m9626a() == null)) {
                    zzajf.m9626a().mo2773d();
                }
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: e */
    public final void m9569e() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        for (String str : this.f8730d.keySet()) {
            try {
                zzajf zzajf = (zzajf) this.f8730d.get(str);
                if (!(zzajf == null || zzajf.m9626a() == null)) {
                    zzajf.m9626a().mo2774e();
                }
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final void m9570f() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        for (String str : this.f8730d.keySet()) {
            try {
                zzajf zzajf = (zzajf) this.f8730d.get(str);
                if (!(zzajf == null || zzajf.m9626a() == null)) {
                    zzajf.m9626a().mo2772c();
                }
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void m9564a(Context context) {
        for (zzajf a : this.f8730d.values()) {
            try {
                a.m9626a().mo2760a(ObjectWrapper.m26019a((Object) context));
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: g */
    public final void m9571g() {
        if (this.f8729c.zzadl != null && this.f8729c.zzadl.f8794o != null) {
            zzbv.zzfe();
            zzyg.m11195a(this.f8729c.zzrx, this.f8729c.zzadg.f19893a, this.f8729c.zzadl, this.f8729c.zzade, false, this.f8729c.zzadl.f8794o.f9847l);
        }
    }

    /* renamed from: h */
    public final void m9572h() {
        if (this.f8729c.zzadl != null && this.f8729c.zzadl.f8794o != null) {
            zzbv.zzfe();
            zzyg.m11195a(this.f8729c.zzrx, this.f8729c.zzadg.f19893a, this.f8729c.zzadl, this.f8729c.zzade, false, this.f8729c.zzadl.f8794o.f9849n);
        }
    }

    /* renamed from: a */
    public final zzajk m9563a(zzajk zzajk) {
        if (!(this.f8729c.zzadl == null || this.f8729c.zzadl.f8797r == null || TextUtils.isEmpty(this.f8729c.zzadl.f8797r.f9867k))) {
            zzajk = new zzajk(this.f8729c.zzadl.f8797r.f9867k, this.f8729c.zzadl.f8797r.f9868l);
        }
        if (!(this.f8729c.zzadl == null || this.f8729c.zzadl.f8794o == null)) {
            zzbv.zzfe();
            zzyg.m11196a(this.f8729c.zzrx, this.f8729c.zzadg.f19893a, this.f8729c.zzadl.f8794o.f9848m, this.f8729c.zzaei, this.f8729c.zzaej, zzajk);
        }
        return zzajk;
    }
}
