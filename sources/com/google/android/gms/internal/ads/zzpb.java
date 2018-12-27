package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzpb extends zzqz implements zzpp {
    /* renamed from: a */
    private String f20275a;
    /* renamed from: b */
    private List<zzpa> f20276b;
    /* renamed from: c */
    private String f20277c;
    /* renamed from: d */
    private zzqk f20278d;
    /* renamed from: e */
    private String f20279e;
    /* renamed from: f */
    private double f20280f;
    /* renamed from: g */
    private String f20281g;
    /* renamed from: h */
    private String f20282h;
    /* renamed from: i */
    private zzov f20283i;
    /* renamed from: j */
    private Bundle f20284j;
    /* renamed from: k */
    private zzly f20285k;
    /* renamed from: l */
    private View f20286l;
    /* renamed from: m */
    private IObjectWrapper f20287m;
    /* renamed from: n */
    private String f20288n;
    /* renamed from: o */
    private Object f20289o = new Object();
    /* renamed from: p */
    private zzpm f20290p;

    public zzpb(String str, List<zzpa> list, String str2, zzqk zzqk, String str3, double d, String str4, String str5, zzov zzov, Bundle bundle, zzly zzly, View view, IObjectWrapper iObjectWrapper, String str6) {
        this.f20275a = str;
        this.f20276b = list;
        this.f20277c = str2;
        this.f20278d = zzqk;
        this.f20279e = str3;
        this.f20280f = d;
        this.f20281g = str4;
        this.f20282h = str5;
        this.f20283i = zzov;
        this.f20284j = bundle;
        this.f20285k = zzly;
        this.f20286l = view;
        this.f20287m = iObjectWrapper;
        this.f20288n = str6;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return "2";
    }

    /* renamed from: b */
    public final String mo4265b() {
        return "";
    }

    /* renamed from: e */
    public final String mo2632e() {
        return this.f20275a;
    }

    /* renamed from: f */
    public final List mo2633f() {
        return this.f20276b;
    }

    /* renamed from: g */
    public final String mo2634g() {
        return this.f20277c;
    }

    /* renamed from: h */
    public final zzqk mo2635h() {
        return this.f20278d;
    }

    /* renamed from: i */
    public final String mo2636i() {
        return this.f20279e;
    }

    /* renamed from: j */
    public final double mo2637j() {
        return this.f20280f;
    }

    /* renamed from: k */
    public final String mo2638k() {
        return this.f20281g;
    }

    /* renamed from: l */
    public final String mo2639l() {
        return this.f20282h;
    }

    /* renamed from: m */
    public final zzly mo2640m() {
        return this.f20285k;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2641n() {
        return ObjectWrapper.m26019a(this.f20290p);
    }

    /* renamed from: a */
    public final void mo4264a(zzpm zzpm) {
        synchronized (this.f20289o) {
            this.f20290p = zzpm;
        }
    }

    /* renamed from: c */
    public final zzov mo4266c() {
        return this.f20283i;
    }

    /* renamed from: o */
    public final Bundle mo2642o() {
        return this.f20284j;
    }

    /* renamed from: d */
    public final View mo4267d() {
        return this.f20286l;
    }

    /* renamed from: p */
    public final IObjectWrapper mo2643p() {
        return this.f20287m;
    }

    /* renamed from: q */
    public final String mo2644q() {
        return this.f20288n;
    }

    /* renamed from: r */
    public final zzqg mo2645r() {
        return this.f20283i;
    }

    /* renamed from: s */
    public final void mo2646s() {
        zzalo.f8872a.post(new ss(this));
        this.f20275a = null;
        this.f20276b = null;
        this.f20277c = null;
        this.f20278d = null;
        this.f20279e = null;
        this.f20280f = 0.0d;
        this.f20281g = null;
        this.f20282h = null;
        this.f20283i = null;
        this.f20284j = null;
        this.f20289o = null;
        this.f20285k = null;
        this.f20286l = null;
    }

    /* renamed from: a */
    public final void mo2629a(Bundle bundle) {
        synchronized (this.f20289o) {
            if (this.f20290p == null) {
                zzaok.m10003c("#001 Attempt to perform click before app native ad initialized.");
                return;
            }
            this.f20290p.mo2593b(bundle);
        }
    }

    /* renamed from: b */
    public final boolean mo2630b(Bundle bundle) {
        synchronized (this.f20289o) {
            if (this.f20290p == null) {
                zzaok.m10003c("#002 Attempt to record impression before native ad initialized.");
                return null;
            }
            bundle = this.f20290p.mo2592a(bundle);
            return bundle;
        }
    }

    /* renamed from: c */
    public final void mo2631c(Bundle bundle) {
        synchronized (this.f20289o) {
            if (this.f20290p == null) {
                zzaok.m10003c("#003 Attempt to report touch event before native ad initialized.");
                return;
            }
            this.f20290p.mo2597c(bundle);
        }
    }
}
