package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzpd extends zzrd implements zzpp {
    /* renamed from: a */
    private String f20291a;
    /* renamed from: b */
    private List<zzpa> f20292b;
    /* renamed from: c */
    private String f20293c;
    /* renamed from: d */
    private zzqk f20294d;
    /* renamed from: e */
    private String f20295e;
    /* renamed from: f */
    private String f20296f;
    /* renamed from: g */
    private zzov f20297g;
    /* renamed from: h */
    private Bundle f20298h;
    /* renamed from: i */
    private zzly f20299i;
    /* renamed from: j */
    private View f20300j;
    /* renamed from: k */
    private IObjectWrapper f20301k;
    /* renamed from: l */
    private String f20302l;
    /* renamed from: m */
    private Object f20303m = new Object();
    /* renamed from: n */
    private zzpm f20304n;

    public zzpd(String str, List<zzpa> list, String str2, zzqk zzqk, String str3, String str4, zzov zzov, Bundle bundle, zzly zzly, View view, IObjectWrapper iObjectWrapper, String str5) {
        this.f20291a = str;
        this.f20292b = list;
        this.f20293c = str2;
        this.f20294d = zzqk;
        this.f20295e = str3;
        this.f20296f = str4;
        this.f20297g = zzov;
        this.f20298h = bundle;
        this.f20299i = zzly;
        this.f20300j = view;
        this.f20301k = iObjectWrapper;
        this.f20302l = str5;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return "1";
    }

    /* renamed from: b */
    public final String mo4265b() {
        return "";
    }

    /* renamed from: e */
    public final String mo2650e() {
        return this.f20291a;
    }

    /* renamed from: g */
    public final IObjectWrapper mo2652g() {
        return this.f20301k;
    }

    /* renamed from: h */
    public final String mo2653h() {
        return this.f20302l;
    }

    /* renamed from: f */
    public final List mo2633f() {
        return this.f20292b;
    }

    /* renamed from: i */
    public final String mo2654i() {
        return this.f20293c;
    }

    /* renamed from: j */
    public final zzqk mo2655j() {
        return this.f20294d;
    }

    /* renamed from: k */
    public final String mo2656k() {
        return this.f20295e;
    }

    /* renamed from: l */
    public final String mo2657l() {
        return this.f20296f;
    }

    /* renamed from: m */
    public final zzly mo2658m() {
        return this.f20299i;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2659n() {
        return ObjectWrapper.m26019a(this.f20304n);
    }

    /* renamed from: a */
    public final void mo4264a(zzpm zzpm) {
        synchronized (this.f20303m) {
            this.f20304n = zzpm;
        }
    }

    /* renamed from: c */
    public final zzov mo4266c() {
        return this.f20297g;
    }

    /* renamed from: o */
    public final Bundle mo2660o() {
        return this.f20298h;
    }

    /* renamed from: d */
    public final View mo4267d() {
        return this.f20300j;
    }

    /* renamed from: p */
    public final zzqg mo2661p() {
        return this.f20297g;
    }

    /* renamed from: q */
    public final void mo2662q() {
        zzalo.f8872a.post(new st(this));
        this.f20291a = null;
        this.f20292b = null;
        this.f20293c = null;
        this.f20294d = null;
        this.f20295e = null;
        this.f20296f = null;
        this.f20297g = null;
        this.f20298h = null;
        this.f20303m = null;
        this.f20299i = null;
        this.f20300j = null;
    }

    /* renamed from: a */
    public final void mo2647a(Bundle bundle) {
        synchronized (this.f20303m) {
            if (this.f20304n == null) {
                zzaok.m10003c("#001 Attempt to perform click before app native ad initialized.");
                return;
            }
            this.f20304n.mo2593b(bundle);
        }
    }

    /* renamed from: b */
    public final boolean mo2648b(Bundle bundle) {
        synchronized (this.f20303m) {
            if (this.f20304n == null) {
                zzaok.m10003c("#002 Attempt to record impression before native ad initialized.");
                return null;
            }
            bundle = this.f20304n.mo2592a(bundle);
            return bundle;
        }
    }

    /* renamed from: c */
    public final void mo2649c(Bundle bundle) {
        synchronized (this.f20303m) {
            if (this.f20304n == null) {
                zzaok.m10003c("#003 Attempt to report touch event before native ad initialized.");
                return;
            }
            this.f20304n.mo2597c(bundle);
        }
    }
}
