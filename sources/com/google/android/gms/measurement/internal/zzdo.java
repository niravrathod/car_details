package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p017f.C3131a;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

public final class zzdo extends ch {
    @VisibleForTesting
    /* renamed from: a */
    protected zzdn f21649a;
    /* renamed from: b */
    private volatile zzdn f21650b;
    /* renamed from: c */
    private zzdn f21651c;
    /* renamed from: d */
    private final Map<Activity, zzdn> f21652d = new C3131a();
    /* renamed from: e */
    private zzdn f21653e;
    /* renamed from: f */
    private String f21654f;

    public zzdo(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: v */
    protected final boolean mo4962v() {
        return false;
    }

    /* renamed from: x */
    public final zzdn m29654x() {
        m28441E();
        mo4395d();
        return this.f21649a;
    }

    /* renamed from: a */
    public final void m29628a(Activity activity, String str, String str2) {
        if (this.f21650b == null) {
            mo3172r().m28540i().m12354a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f21652d.get(activity) == null) {
            mo3172r().m28540i().m12354a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m29619a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f21650b.f10780b.equals(str2);
            boolean c = zzfk.m28604c(this.f21650b.f10779a, str);
            if (equals && c) {
                mo3172r().m28542k().m12354a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo3172r().m28540i().m12355a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo3172r().m28555x().m12356a("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzdn zzdn = new zzdn(str, str2, mo4398p().m28635g());
                this.f21652d.put(activity, zzdn);
                m29620a(activity, zzdn, true);
            } else {
                mo3172r().m28540i().m12355a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: y */
    public final zzdn m29655y() {
        mo4393b();
        return this.f21650b;
    }

    /* renamed from: a */
    private final void m29620a(Activity activity, zzdn zzdn, boolean z) {
        zzdn zzdn2 = this.f21650b == null ? this.f21651c : this.f21650b;
        if (zzdn.f10780b == null) {
            zzdn = new zzdn(zzdn.f10779a, m29619a(activity.getClass().getCanonicalName()), zzdn.f10781c);
        }
        this.f21651c = this.f21650b;
        this.f21650b = zzdn;
        mo3171q().m28568a(new bc(this, z, zzdn2, zzdn));
    }

    /* renamed from: a */
    private final void m29621a(zzdn zzdn) {
        mo4841e().m28474a(mo3169m().elapsedRealtime());
        if (mo4847k().m29718a(zzdn.f10782d)) {
            zzdn.f10782d = false;
        }
    }

    /* renamed from: a */
    public static void m29622a(zzdn zzdn, Bundle bundle, boolean z) {
        if (bundle == null || zzdn == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && zzdn == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
            return;
        }
        if (zzdn.f10779a) {
            bundle.putString("_sn", zzdn.f10779a);
        } else {
            bundle.remove("_sn");
        }
        bundle.putString("_sc", zzdn.f10780b);
        bundle.putLong("_si", zzdn.f10781c);
    }

    /* renamed from: a */
    public final void m29629a(String str, zzdn zzdn) {
        mo4395d();
        synchronized (this) {
            if (this.f21654f == null || this.f21654f.equals(str) || zzdn != null) {
                this.f21654f = str;
                this.f21653e = zzdn;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static String m29619a(String str) {
        str = str.split("\\.");
        str = str.length > 0 ? str[str.length - 1] : "";
        return str.length() > 100 ? str.substring(0, 100) : str;
    }

    /* renamed from: d */
    private final zzdn m29624d(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzdn zzdn = (zzdn) this.f21652d.get(activity);
        if (zzdn != null) {
            return zzdn;
        }
        zzdn zzdn2 = new zzdn(null, m29619a(activity.getClass().getCanonicalName()), mo4398p().m28635g());
        this.f21652d.put(activity, zzdn2);
        return zzdn2;
    }

    /* renamed from: a */
    public final void m29627a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            bundle = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle != null) {
                this.f21652d.put(activity, new zzdn(bundle.getString("name"), bundle.getString("referrer_name"), bundle.getLong(FacebookAdapter.KEY_ID)));
            }
        }
    }

    /* renamed from: a */
    public final void m29626a(Activity activity) {
        m29620a(activity, m29624d(activity), false);
        activity = mo4841e();
        activity.mo3171q().m28568a(new av(activity, activity.mo3169m().elapsedRealtime()));
    }

    /* renamed from: b */
    public final void m29631b(Activity activity) {
        activity = m29624d(activity);
        this.f21651c = this.f21650b;
        this.f21650b = null;
        mo3171q().m28568a(new bd(this, activity));
    }

    /* renamed from: b */
    public final void m29632b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            zzdn zzdn = (zzdn) this.f21652d.get(activity);
            if (zzdn != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong(FacebookAdapter.KEY_ID, zzdn.f10781c);
                bundle2.putString("name", zzdn.f10779a);
                bundle2.putString("referrer_name", zzdn.f10780b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: c */
    public final void m29634c(Activity activity) {
        this.f21652d.remove(activity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zza mo4841e() {
        return super.mo4841e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ zzcs mo4842f() {
        return super.mo4842f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzaj mo4843g() {
        return super.mo4843g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzdr mo4844h() {
        return super.mo4844h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ zzdo mo4845i() {
        return super.mo4845i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ zzal mo4846j() {
        return super.mo4846j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzeq mo4847k() {
        return super.mo4847k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
