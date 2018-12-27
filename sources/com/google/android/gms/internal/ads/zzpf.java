package com.google.android.gms.internal.ads;

import android.support.v4.p017f.C0433m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

@zzaer
public final class zzpf extends zzrh implements zzpo {
    /* renamed from: a */
    private final zzov f20305a;
    /* renamed from: b */
    private final String f20306b;
    /* renamed from: c */
    private final C0433m<String, zzpa> f20307c;
    /* renamed from: d */
    private final C0433m<String, String> f20308d;
    /* renamed from: e */
    private zzly f20309e;
    /* renamed from: f */
    private View f20310f;
    /* renamed from: g */
    private final Object f20311g = new Object();
    /* renamed from: h */
    private zzpm f20312h;

    public zzpf(String str, C0433m<String, zzpa> c0433m, C0433m<String, String> c0433m2, zzov zzov, zzly zzly, View view) {
        this.f20306b = str;
        this.f20307c = c0433m;
        this.f20308d = c0433m2;
        this.f20305a = zzov;
        this.f20309e = zzly;
        this.f20310f = view;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return "3";
    }

    /* renamed from: a */
    public final String mo2663a(String str) {
        return (String) this.f20308d.get(str);
    }

    /* renamed from: b */
    public final zzqk mo2665b(String str) {
        return (zzqk) this.f20307c.get(str);
    }

    /* renamed from: e */
    public final List<String> mo2668e() {
        String[] strArr = new String[(this.f20307c.size() + this.f20308d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f20307c.size()) {
            strArr[i3] = (String) this.f20307c.m1585b(i2);
            i2++;
            i3++;
        }
        while (i < this.f20308d.size()) {
            strArr[i3] = (String) this.f20308d.m1585b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: b */
    public final String mo4265b() {
        return this.f20306b;
    }

    /* renamed from: a */
    public final void mo4264a(zzpm zzpm) {
        synchronized (this.f20311g) {
            this.f20312h = zzpm;
        }
    }

    /* renamed from: f */
    public final IObjectWrapper mo2669f() {
        return ObjectWrapper.m26019a(this.f20312h);
    }

    /* renamed from: c */
    public final zzov mo4266c() {
        return this.f20305a;
    }

    /* renamed from: g */
    public final zzly mo2670g() {
        return this.f20309e;
    }

    /* renamed from: a */
    public final boolean mo2664a(IObjectWrapper iObjectWrapper) {
        if (this.f20312h == null) {
            zzaok.m10003c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f20310f == null) {
            return false;
        } else {
            View view = (FrameLayout) ObjectWrapper.m26020a(iObjectWrapper);
            this.f20312h.mo2586a(view, new su(this));
            return true;
        }
    }

    /* renamed from: d */
    public final View mo4267d() {
        return this.f20310f;
    }

    /* renamed from: c */
    public final void mo2667c(String str) {
        synchronized (this.f20311g) {
            if (this.f20312h == null) {
                zzaok.m10003c("#001 Attempt to perform click before app native ad initialized.");
                return;
            }
            this.f20312h.mo2587a(null, str, null, null, null, false);
        }
    }

    /* renamed from: h */
    public final void mo2671h() {
        synchronized (this.f20311g) {
            if (this.f20312h == null) {
                zzaok.m10003c("#002 Attempt to record impression before native ad initialized.");
                return;
            }
            this.f20312h.mo2588a(null, null);
        }
    }

    /* renamed from: i */
    public final IObjectWrapper mo2672i() {
        return ObjectWrapper.m26019a(this.f20312h.mo2610p().getApplicationContext());
    }

    /* renamed from: j */
    public final void mo2673j() {
        zzalo.f8872a.post(new sv(this));
        this.f20309e = null;
        this.f20310f = null;
    }
}
