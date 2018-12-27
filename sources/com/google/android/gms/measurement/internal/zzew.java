package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;

public final class zzew extends cg {
    /* renamed from: b */
    private final AlarmManager f21666b = ((AlarmManager) mo3170n().getSystemService("alarm"));
    /* renamed from: c */
    private final cw f21667c;
    /* renamed from: d */
    private Integer f21668d;

    protected zzew(zzfa zzfa) {
        super(zzfa);
        this.f21667c = new ce(this, zzfa.m22814o(), zzfa);
    }

    /* renamed from: e */
    protected final boolean mo4961e() {
        this.f21666b.cancel(m29743y());
        if (VERSION.SDK_INT >= 24) {
            m29741w();
        }
        return false;
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m29741w() {
        JobScheduler jobScheduler = (JobScheduler) mo3170n().getSystemService("jobscheduler");
        mo3172r().m28555x().m12355a("Cancelling job. JobID", Integer.valueOf(m29742x()));
        jobScheduler.cancel(m29742x());
    }

    /* renamed from: a */
    public final void m29745a(long j) {
        m28438k();
        mo3173u();
        if (!zzbj.m12372a(mo3170n())) {
            mo3172r().m28554w().m12354a("Receiver not registered/enabled");
        }
        mo3173u();
        if (!zzfk.m28592a(mo3170n(), false)) {
            mo3172r().m28554w().m12354a("Service not registered/enabled");
        }
        m29750f();
        long elapsedRealtime = mo3169m().elapsedRealtime() + j;
        if (j < Math.max(0, ((Long) zzaf.f10691F.m12332b()).longValue()) && !this.f21667c.m12309b()) {
            mo3172r().m28555x().m12354a("Scheduling upload with DelayedRunnable");
            this.f21667c.m12308a(j);
        }
        mo3173u();
        if (VERSION.SDK_INT >= 24) {
            mo3172r().m28555x().m12354a("Scheduling upload with JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) mo3170n().getSystemService("jobscheduler");
            Builder builder = new Builder(m29742x(), new ComponentName(mo3170n(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j);
            builder.setOverrideDeadline(j << 1);
            j = new PersistableBundle();
            j.putString("action", "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(j);
            j = builder.build();
            mo3172r().m28555x().m12355a("Scheduling job. JobID", Integer.valueOf(m29742x()));
            jobScheduler.schedule(j);
            return;
        }
        mo3172r().m28555x().m12354a("Scheduling upload with AlarmManager");
        this.f21666b.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzaf.f10686A.m12332b()).longValue(), j), m29743y());
    }

    /* renamed from: x */
    private final int m29742x() {
        if (this.f21668d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo3170n().getPackageName());
            this.f21668d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f21668d.intValue();
    }

    /* renamed from: f */
    public final void m29750f() {
        m28438k();
        this.f21666b.cancel(m29743y());
        this.f21667c.m12310c();
        if (VERSION.SDK_INT >= 24) {
            m29741w();
        }
    }

    /* renamed from: y */
    private final PendingIntent m29743y() {
        Intent className = new Intent().setClassName(mo3170n(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(mo3170n(), 0, className, 0);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfg mo4964g() {
        return super.mo4964g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ cq mo4965h() {
        return super.mo4965h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ ct mo4966i() {
        return super.mo4966i();
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
