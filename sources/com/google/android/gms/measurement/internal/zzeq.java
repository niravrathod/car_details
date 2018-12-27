package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzdx;

public final class zzeq extends ch {
    /* renamed from: a */
    private Handler f21662a;
    @VisibleForTesting
    /* renamed from: b */
    private long f21663b = mo3169m().elapsedRealtime();
    /* renamed from: c */
    private final cw f21664c = new bz(this, this.r);
    /* renamed from: d */
    private final cw f21665d = new ca(this, this.r);

    zzeq(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: v */
    protected final boolean mo4962v() {
        return false;
    }

    /* renamed from: y */
    private final void m29714y() {
        synchronized (this) {
            if (this.f21662a == null) {
                this.f21662a = new zzdx(Looper.getMainLooper());
            }
        }
    }

    /* renamed from: b */
    private final void m29710b(long j) {
        mo4395d();
        m29714y();
        mo3172r().m28555x().m12355a("Activity resumed, time", Long.valueOf(j));
        this.f21663b = j;
        if (mo4400t().m27369p(mo4843g().m29471x()) != null) {
            m29717a(mo3169m().currentTimeMillis());
            return;
        }
        this.f21664c.m12310c();
        this.f21665d.m12310c();
        if (mo3169m().currentTimeMillis() - mo4399s().f21392l.m12360a() > mo4399s().f21395o.m12360a()) {
            mo4399s().f21393m.m12358a(true);
            mo4399s().f21396p.m12361a(0);
        }
        if (mo4399s().f21393m.m12359a() != null) {
            this.f21664c.m12308a(Math.max(0, mo4399s().f21391k.m12360a() - mo4399s().f21396p.m12360a()));
        } else {
            this.f21665d.m12308a(Math.max(0, 3600000 - mo4399s().f21396p.m12360a()));
        }
    }

    /* renamed from: a */
    final void m29717a(long j) {
        mo4395d();
        m29714y();
        this.f21664c.m12310c();
        this.f21665d.m12310c();
        if (j - mo4399s().f21392l.m12360a() > mo4399s().f21395o.m12360a()) {
            mo4399s().f21393m.m12358a(true);
            mo4399s().f21396p.m12361a(0);
        }
        if (mo4399s().f21393m.m12359a()) {
            m29713d(j);
        } else {
            this.f21665d.m12308a(Math.max(0, 3600000 - mo4399s().f21396p.m12360a()));
        }
    }

    /* renamed from: c */
    private final void m29712c(long j) {
        mo4395d();
        m29714y();
        this.f21664c.m12310c();
        this.f21665d.m12310c();
        mo3172r().m28555x().m12355a("Activity paused, time", Long.valueOf(j));
        if (this.f21663b != 0) {
            mo4399s().f21396p.m12361a(mo4399s().f21396p.m12360a() + (j - this.f21663b));
        }
    }

    /* renamed from: d */
    private final void m29713d(long j) {
        mo4395d();
        mo3172r().m28555x().m12355a("Session started, time", Long.valueOf(mo3169m().elapsedRealtime()));
        if (mo4400t().m27367o(mo4843g().m29471x())) {
            long j2 = j / 1000;
            mo4842f().m29586a("auto", "_sid", (Object) Long.valueOf(j2), j);
        } else {
            mo4842f().m29586a("auto", "_sid", null, j);
        }
        mo4399s().f21393m.m12358a(false);
        Bundle bundle = new Bundle();
        if (mo4400t().m27367o(mo4843g().m29471x())) {
            bundle.putLong("_sid", j / 1000);
        }
        mo4842f().m29582a("auto", "_s", j, bundle);
        mo4399s().f21395o.m12361a(j);
    }

    @VisibleForTesting
    /* renamed from: x */
    protected final void m29740x() {
        mo4395d();
        m29713d(mo3169m().currentTimeMillis());
    }

    /* renamed from: a */
    public final boolean m29718a(boolean z) {
        mo4395d();
        m28441E();
        long elapsedRealtime = mo3169m().elapsedRealtime();
        mo4399s().f21395o.m12361a(mo3169m().currentTimeMillis());
        long j = elapsedRealtime - this.f21663b;
        if (z || j >= 1000) {
            mo4399s().f21396p.m12361a(j);
            mo3172r().m28555x().m12355a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            zzdo.m29622a(mo4845i().m29654x(), bundle, true);
            mo4842f().m29583a("auto", "_e", bundle);
            this.f21663b = elapsedRealtime;
            this.f21665d.m12310c();
            this.f21665d.m12308a(Math.max(0, 3600000 - mo4399s().f21396p.m12360a()));
            return true;
        }
        mo3172r().m28555x().m12355a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* renamed from: z */
    private final void m29715z() {
        mo4395d();
        m29718a(false);
        mo4841e().m28474a(mo3169m().elapsedRealtime());
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
