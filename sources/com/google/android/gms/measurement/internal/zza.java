package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p017f.C3131a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

public final class zza extends bl {
    /* renamed from: a */
    private final Map<String, Long> f21402a = new C3131a();
    /* renamed from: b */
    private final Map<String, Integer> f21403b = new C3131a();
    /* renamed from: c */
    private long f21404c;

    public zza(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: a */
    public final void m28475a(String str, long j) {
        if (str != null) {
            if (str.length() != 0) {
                mo3171q().m28568a(new C2486k(this, str, j));
                return;
            }
        }
        mo3172r().v_().m12354a("Ad unit id must be a non-empty string");
    }

    /* renamed from: c */
    private final void m28471c(String str, long j) {
        mo4393b();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        if (this.f21403b.isEmpty()) {
            this.f21404c = j;
        }
        Integer num = (Integer) this.f21403b.get(str);
        if (num != null) {
            this.f21403b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f21403b.size() >= 100) {
            mo3172r().m28540i().m12354a("Too many ads visible");
        } else {
            this.f21403b.put(str, Integer.valueOf(1));
            this.f21402a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void m28477b(String str, long j) {
        if (str != null) {
            if (str.length() != 0) {
                mo3171q().m28568a(new C2499y(this, str, j));
                return;
            }
        }
        mo3172r().v_().m12354a("Ad unit id must be a non-empty string");
    }

    /* renamed from: d */
    private final void m28472d(String str, long j) {
        mo4393b();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) this.f21403b.get(str);
        if (num != null) {
            zzdn x = mo4845i().m29654x();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f21403b.remove(str);
                Long l = (Long) this.f21402a.get(str);
                if (l == null) {
                    mo3172r().v_().m12354a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f21402a.remove(str);
                    m28468a(str, longValue, x);
                }
                if (this.f21403b.isEmpty() != null) {
                    if (this.f21404c == 0) {
                        mo3172r().v_().m12354a("First ad exposure time was never set");
                        return;
                    } else {
                        m28465a(j - this.f21404c, x);
                        this.f21404c = 0;
                    }
                }
                return;
            }
            this.f21403b.put(str, Integer.valueOf(intValue));
            return;
        }
        mo3172r().v_().m12355a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    private final void m28465a(long j, zzdn zzdn) {
        if (zzdn == null) {
            mo3172r().m28555x().m12354a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo3172r().m28555x().m12355a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzdo.m29622a(zzdn, bundle, (boolean) 1);
            mo4842f().m29583a("am", "_xa", bundle);
        }
    }

    /* renamed from: a */
    private final void m28468a(String str, long j, zzdn zzdn) {
        if (zzdn == null) {
            mo3172r().m28555x().m12354a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo3172r().m28555x().m12355a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzdo.m29622a(zzdn, bundle, true);
            mo4842f().m29583a("am", "_xu", bundle);
        }
    }

    /* renamed from: a */
    public final void m28474a(long j) {
        zzdn x = mo4845i().m29654x();
        for (String str : this.f21402a.keySet()) {
            m28468a(str, j - ((Long) this.f21402a.get(str)).longValue(), x);
        }
        if (!this.f21402a.isEmpty()) {
            m28465a(j - this.f21404c, x);
        }
        m28469b(j);
    }

    /* renamed from: b */
    private final void m28469b(long j) {
        for (String put : this.f21402a.keySet()) {
            this.f21402a.put(put, Long.valueOf(j));
        }
        if (!this.f21402a.isEmpty()) {
            this.f21404c = j;
        }
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
