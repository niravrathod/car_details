package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzpi extends zzsg implements zzpp {
    /* renamed from: a */
    private String f20313a;
    /* renamed from: b */
    private List<zzpa> f20314b;
    /* renamed from: c */
    private List<Object> f20315c;
    /* renamed from: d */
    private boolean f20316d;
    /* renamed from: e */
    private String f20317e;
    /* renamed from: f */
    private zzqk f20318f;
    /* renamed from: g */
    private String f20319g;
    /* renamed from: h */
    private String f20320h;
    /* renamed from: i */
    private double f20321i;
    /* renamed from: j */
    private String f20322j;
    /* renamed from: k */
    private String f20323k;
    /* renamed from: l */
    private zzov f20324l;
    /* renamed from: m */
    private zzly f20325m;
    /* renamed from: n */
    private View f20326n;
    /* renamed from: o */
    private IObjectWrapper f20327o;
    /* renamed from: p */
    private String f20328p;
    /* renamed from: q */
    private Bundle f20329q;
    /* renamed from: r */
    private final Object f20330r = new Object();
    /* renamed from: s */
    private zzpm f20331s;

    public zzpi(String str, List<zzpa> list, String str2, zzqk zzqk, String str3, String str4, double d, String str5, String str6, zzov zzov, zzly zzly, View view, IObjectWrapper iObjectWrapper, String str7, Bundle bundle) {
        this.f20313a = str;
        this.f20314b = list;
        this.f20315c = null;
        this.f20316d = false;
        this.f20317e = str2;
        this.f20318f = zzqk;
        this.f20319g = str3;
        this.f20320h = str4;
        this.f20321i = d;
        this.f20322j = str5;
        this.f20323k = str6;
        this.f20324l = zzov;
        this.f20325m = zzly;
        this.f20326n = view;
        this.f20327o = iObjectWrapper;
        this.f20328p = str7;
        this.f20329q = bundle;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return "6";
    }

    /* renamed from: a */
    public final void mo2692a(zzlq zzlq) {
    }

    /* renamed from: a */
    public final void mo2693a(zzlu zzlu) {
    }

    /* renamed from: b */
    public final String mo4265b() {
        return "";
    }

    /* renamed from: g */
    public final List mo2699g() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo2700h() {
        return false;
    }

    /* renamed from: e */
    public final String mo2697e() {
        return this.f20313a;
    }

    /* renamed from: f */
    public final List mo2633f() {
        return this.f20314b;
    }

    /* renamed from: i */
    public final String mo2701i() {
        return this.f20317e;
    }

    /* renamed from: j */
    public final zzqk mo2702j() {
        return this.f20318f;
    }

    /* renamed from: k */
    public final String mo2703k() {
        return this.f20319g;
    }

    /* renamed from: l */
    public final String mo2704l() {
        return this.f20320h;
    }

    /* renamed from: m */
    public final double mo2705m() {
        return this.f20321i;
    }

    /* renamed from: n */
    public final String mo2706n() {
        return this.f20322j;
    }

    /* renamed from: o */
    public final String mo2707o() {
        return this.f20323k;
    }

    /* renamed from: p */
    public final zzly mo2708p() {
        return this.f20325m;
    }

    /* renamed from: q */
    public final IObjectWrapper mo2709q() {
        return ObjectWrapper.m26019a(this.f20331s);
    }

    /* renamed from: a */
    public final void mo4264a(zzpm zzpm) {
        synchronized (this.f20330r) {
            this.f20331s = zzpm;
        }
    }

    /* renamed from: c */
    public final zzov mo4266c() {
        return this.f20324l;
    }

    /* renamed from: d */
    public final View mo4267d() {
        return this.f20326n;
    }

    /* renamed from: r */
    public final IObjectWrapper mo2710r() {
        return this.f20327o;
    }

    /* renamed from: s */
    public final String mo2711s() {
        return this.f20328p;
    }

    /* renamed from: t */
    public final Bundle mo2712t() {
        return this.f20329q;
    }

    /* renamed from: u */
    public final zzqg mo2713u() {
        return this.f20324l;
    }

    /* renamed from: v */
    public final void mo2714v() {
        zzalo.f8872a.post(new sw(this));
    }

    /* renamed from: a */
    public final void mo2691a(Bundle bundle) {
        synchronized (this.f20330r) {
            if (this.f20331s == null) {
                zzaok.m10003c("#001 Attempt to perform click before app native ad initialized.");
                return;
            }
            this.f20331s.mo2593b(bundle);
        }
    }

    /* renamed from: b */
    public final boolean mo2695b(Bundle bundle) {
        synchronized (this.f20330r) {
            if (this.f20331s == null) {
                zzaok.m10003c("#002 Attempt to record impression before native ad initialized.");
                return null;
            }
            bundle = this.f20331s.mo2592a(bundle);
            return bundle;
        }
    }

    /* renamed from: c */
    public final void mo2696c(Bundle bundle) {
        synchronized (this.f20330r) {
            if (this.f20331s == null) {
                zzaok.m10003c("#003 Attempt to report touch event before native ad initialized.");
                return;
            }
            this.f20331s.mo2597c(bundle);
        }
    }

    /* renamed from: a */
    public final void mo2694a(zzsc zzsc) {
        this.f20331s.mo2590a(zzsc);
    }

    /* renamed from: w */
    public final void mo2715w() {
        synchronized (this.f20330r) {
            if (this.f20331s == null) {
                return;
            }
            this.f20331s.mo2603f();
        }
    }

    /* renamed from: x */
    public final void mo2716x() {
        synchronized (this.f20330r) {
            if (this.f20331s == null) {
                return;
            }
            this.f20331s.mo2604g();
        }
    }

    /* renamed from: y */
    public final void mo2717y() {
        this.f20331s.mo2601d();
    }
}
