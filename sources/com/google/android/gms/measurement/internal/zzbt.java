package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzsl;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicReference;

public class zzbt implements ap {
    /* renamed from: a */
    private static volatile zzbt f17569a;
    /* renamed from: A */
    private long f17570A;
    /* renamed from: B */
    private volatile Boolean f17571B;
    /* renamed from: C */
    private int f17572C;
    /* renamed from: D */
    private int f17573D;
    /* renamed from: E */
    private final long f17574E;
    /* renamed from: b */
    private final Context f17575b;
    /* renamed from: c */
    private final String f17576c;
    /* renamed from: d */
    private final String f17577d;
    /* renamed from: e */
    private final String f17578e;
    /* renamed from: f */
    private final boolean f17579f;
    /* renamed from: g */
    private final zzk f17580g;
    /* renamed from: h */
    private final zzn f17581h;
    /* renamed from: i */
    private final C4832l f17582i;
    /* renamed from: j */
    private final zzap f17583j;
    /* renamed from: k */
    private final zzbo f17584k;
    /* renamed from: l */
    private final zzeq f17585l;
    /* renamed from: m */
    private final AppMeasurement f17586m;
    /* renamed from: n */
    private final zzfk f17587n;
    /* renamed from: o */
    private final zzan f17588o;
    /* renamed from: p */
    private final Clock f17589p;
    /* renamed from: q */
    private final zzdo f17590q;
    /* renamed from: r */
    private final zzcs f17591r;
    /* renamed from: s */
    private final zza f17592s;
    /* renamed from: t */
    private zzal f17593t;
    /* renamed from: u */
    private zzdr f17594u;
    /* renamed from: v */
    private zzx f17595v;
    /* renamed from: w */
    private zzaj f17596w;
    /* renamed from: x */
    private zzbg f17597x;
    /* renamed from: y */
    private boolean f17598y = false;
    /* renamed from: z */
    private Boolean f17599z;

    private zzbt(zzcr zzcr) {
        Preconditions.checkNotNull(zzcr);
        this.f17580g = new zzk(zzcr.f10773a);
        zzaf.m12335a(this.f17580g);
        this.f17575b = zzcr.f10773a;
        this.f17576c = zzcr.f10774b;
        this.f17577d = zzcr.f10775c;
        this.f17578e = zzcr.f10776d;
        this.f17579f = zzcr.f10777e;
        this.f17571B = zzcr.f10778f;
        zzsl.m11978a(this.f17575b);
        this.f17589p = DefaultClock.getInstance();
        this.f17574E = this.f17589p.currentTimeMillis();
        this.f17581h = new zzn(this);
        ao c4832l = new C4832l(this);
        c4832l.m27281B();
        this.f17582i = c4832l;
        c4832l = new zzap(this);
        c4832l.m27281B();
        this.f17583j = c4832l;
        c4832l = new zzfk(this);
        c4832l.m27281B();
        this.f17587n = c4832l;
        c4832l = new zzan(this);
        c4832l.m27281B();
        this.f17588o = c4832l;
        this.f17592s = new zza(this);
        ch zzdo = new zzdo(this);
        zzdo.m28442F();
        this.f17590q = zzdo;
        zzdo = new zzcs(this);
        zzdo.m28442F();
        this.f17591r = zzdo;
        this.f17586m = new AppMeasurement(this);
        zzdo = new zzeq(this);
        zzdo.m28442F();
        this.f17585l = zzdo;
        c4832l = new zzbo(this);
        c4832l.m27281B();
        this.f17584k = c4832l;
        zzk zzk = this.f17580g;
        if (this.f17575b.getApplicationContext() instanceof Application) {
            an h = m22727h();
            if (h.mo3170n().getApplicationContext() instanceof Application) {
                Application application = (Application) h.mo3170n().getApplicationContext();
                if (h.f21643a == null) {
                    h.f21643a = new bb(h);
                }
                application.unregisterActivityLifecycleCallbacks(h.f21643a);
                application.registerActivityLifecycleCallbacks(h.f21643a);
                h.mo3172r().m28555x().m12354a("Registered activity lifecycle callback");
            }
        } else {
            mo3172r().m28540i().m12354a("Application context is not an Application");
        }
        this.f17584k.m28568a(new C2494t(this, zzcr));
    }

    /* renamed from: a */
    private final void m22705a(zzcr zzcr) {
        mo3171q().mo4395d();
        zzn.m27329e();
        zzcr = new zzx(this);
        zzcr.m27281B();
        this.f17595v = zzcr;
        zzcr = new zzaj(this);
        zzcr.m28442F();
        this.f17596w = zzcr;
        ch zzal = new zzal(this);
        zzal.m28442F();
        this.f17593t = zzal;
        zzal = new zzdr(this);
        zzal.m28442F();
        this.f17594u = zzal;
        this.f17587n.m27282C();
        this.f17582i.m27282C();
        this.f17597x = new zzbg(this);
        this.f17596w.m28443G();
        mo3172r().m28553v().m12355a("App measurement is starting up, version", Long.valueOf(this.f17581h.m27350f()));
        zzk zzk = this.f17580g;
        mo3172r().m28553v().m12354a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        zzk = this.f17580g;
        zzcr = zzcr.m29471x();
        if (TextUtils.isEmpty(this.f17576c)) {
            zzar v;
            if (m22729j().m28634f(zzcr)) {
                v = mo3172r().m28553v();
                zzcr = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                v = mo3172r().m28553v();
                String str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                zzcr = String.valueOf(zzcr);
                zzcr = zzcr.length() != 0 ? str.concat(zzcr) : new String(str);
            }
            v.m12354a(zzcr);
        }
        mo3172r().m28554w().m12354a("Debug-level message logging enabled");
        if (this.f17572C != this.f17573D) {
            mo3172r().v_().m12356a("Not all components initialized", Integer.valueOf(this.f17572C), Integer.valueOf(this.f17573D));
        }
        this.f17598y = true;
    }

    /* renamed from: a */
    protected final void m22716a() {
        mo3171q().mo4395d();
        if (m22722c().f21383c.m12360a() == 0) {
            m22722c().f21383c.m12361a(this.f17589p.currentTimeMillis());
        }
        if (Long.valueOf(m22722c().f21388h.m12360a()).longValue() == 0) {
            mo3172r().m28555x().m12355a("Persisting first open", Long.valueOf(this.f17574E));
            m22722c().f21388h.m12361a(this.f17574E);
        }
        zzk zzk;
        if (m22715H()) {
            zzk = this.f17580g;
            if (!(TextUtils.isEmpty(m22745z().m29472y()) && TextUtils.isEmpty(m22745z().m29473z()))) {
                m22729j();
                if (zzfk.m28597a(m22745z().m29472y(), m22722c().m28458g(), m22745z().m29473z(), m22722c().m28459h())) {
                    mo3172r().m28553v().m12354a("Rechecking which service to use due to a GMP App Id change");
                    m22722c().m28461j();
                    if (this.f17581h.m27339a(zzaf.ah)) {
                        m22731l().m29502x();
                    }
                    this.f17594u.m29672C();
                    this.f17594u.m29670A();
                    m22722c().f21388h.m12361a(this.f17574E);
                    m22722c().f21390j.m12367a(null);
                }
                m22722c().m28452c(m22745z().m29472y());
                m22722c().m28454d(m22745z().m29473z());
                if (this.f17581h.m27369p(m22745z().m29471x())) {
                    this.f17585l.m29717a(this.f17574E);
                }
            }
            m22727h().m29581a(m22722c().f21390j.m12366a());
            zzk = this.f17580g;
            if (!(TextUtils.isEmpty(m22745z().m29472y()) && TextUtils.isEmpty(m22745z().m29473z()))) {
                boolean C = m22710C();
                if (!(m22722c().m28464w() || this.f17581h.m27354h())) {
                    m22722c().m28455d(C ^ 1);
                }
                if (this.f17581h.m27348d(m22745z().m29471x(), zzaf.am)) {
                    m22719a(false);
                }
                if (!this.f17581h.m27358j(m22745z().m29471x()) || C) {
                    m22727h().m29617y();
                }
                m22743x().m29680a(new AtomicReference());
            }
        } else if (m22710C()) {
            if (!m22729j().m28631d("android.permission.INTERNET")) {
                mo3172r().v_().m12354a("App is missing INTERNET permission");
            }
            if (!m22729j().m28631d("android.permission.ACCESS_NETWORK_STATE")) {
                mo3172r().v_().m12354a("App is missing ACCESS_NETWORK_STATE permission");
            }
            zzk = this.f17580g;
            if (!(Wrappers.packageManager(this.f17575b).isCallerInstantApp() || this.f17581h.m27376y())) {
                if (!zzbj.m12372a(this.f17575b)) {
                    mo3172r().v_().m12354a("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzfk.m28592a(this.f17575b, false)) {
                    mo3172r().v_().m12354a("AppMeasurementService not registered/enabled");
                }
            }
            mo3172r().v_().m12354a("Uploading is not possible. App measurement disabled");
        }
    }

    /* renamed from: a */
    final void m22719a(boolean z) {
        mo3171q().mo4395d();
        Object a = m22722c().f21394n.m12366a();
        if (!(z || a == null)) {
            if ("unset".equals(a)) {
                m22727h().m29586a("app", "_ap", null, this.f17589p.currentTimeMillis());
            } else {
                m22727h().m29586a("app", "_ap", a, this.f17589p.currentTimeMillis());
                z = false;
                if (z) {
                    z = this.f17581h.m27341b("google_analytics_default_allow_ad_personalization_signals");
                    if (z) {
                        m22727h().m29586a("auto", "_ap", null, this.f17589p.currentTimeMillis());
                    } else {
                        m22727h().m29586a("auto", "_ap", Long.valueOf(z.booleanValue() ? 1 : 0), this.f17589p.currentTimeMillis());
                    }
                }
            }
        }
        z = true;
        if (z) {
            z = this.f17581h.m27341b("google_analytics_default_allow_ad_personalization_signals");
            if (z) {
                m22727h().m29586a("auto", "_ap", null, this.f17589p.currentTimeMillis());
            } else {
                if (z.booleanValue()) {
                }
                m22727h().m29586a("auto", "_ap", Long.valueOf(z.booleanValue() ? 1 : 0), this.f17589p.currentTimeMillis());
            }
        }
    }

    /* renamed from: u */
    public final zzk mo3173u() {
        return this.f17580g;
    }

    /* renamed from: b */
    public final zzn m22720b() {
        return this.f17581h;
    }

    /* renamed from: c */
    public final C4832l m22722c() {
        m22703a(this.f17582i);
        return this.f17582i;
    }

    /* renamed from: r */
    public final zzap mo3172r() {
        m22706b(this.f17583j);
        return this.f17583j;
    }

    /* renamed from: d */
    public final zzap m22723d() {
        return (this.f17583j == null || !this.f17583j.m27285z()) ? null : this.f17583j;
    }

    /* renamed from: q */
    public final zzbo mo3171q() {
        m22706b(this.f17584k);
        return this.f17584k;
    }

    /* renamed from: e */
    public final zzeq m22724e() {
        m22707b(this.f17585l);
        return this.f17585l;
    }

    /* renamed from: f */
    public final zzbg m22725f() {
        return this.f17597x;
    }

    /* renamed from: g */
    final zzbo m22726g() {
        return this.f17584k;
    }

    /* renamed from: h */
    public final zzcs m22727h() {
        m22707b(this.f17591r);
        return this.f17591r;
    }

    /* renamed from: i */
    public final AppMeasurement m22728i() {
        return this.f17586m;
    }

    /* renamed from: j */
    public final zzfk m22729j() {
        m22703a(this.f17587n);
        return this.f17587n;
    }

    /* renamed from: k */
    public final zzan m22730k() {
        m22703a(this.f17588o);
        return this.f17588o;
    }

    /* renamed from: l */
    public final zzal m22731l() {
        m22707b(this.f17593t);
        return this.f17593t;
    }

    /* renamed from: n */
    public final Context mo3170n() {
        return this.f17575b;
    }

    /* renamed from: o */
    public final boolean m22734o() {
        return TextUtils.isEmpty(this.f17576c);
    }

    /* renamed from: p */
    public final String m22735p() {
        return this.f17576c;
    }

    /* renamed from: s */
    public final String m22738s() {
        return this.f17577d;
    }

    /* renamed from: t */
    public final String m22739t() {
        return this.f17578e;
    }

    /* renamed from: v */
    public final boolean m22741v() {
        return this.f17579f;
    }

    /* renamed from: m */
    public final Clock mo3169m() {
        return this.f17589p;
    }

    /* renamed from: w */
    public final zzdo m22742w() {
        m22707b(this.f17590q);
        return this.f17590q;
    }

    /* renamed from: x */
    public final zzdr m22743x() {
        m22707b(this.f17594u);
        return this.f17594u;
    }

    /* renamed from: y */
    public final zzx m22744y() {
        m22706b(this.f17595v);
        return this.f17595v;
    }

    /* renamed from: z */
    public final zzaj m22745z() {
        m22707b(this.f17596w);
        return this.f17596w;
    }

    /* renamed from: A */
    public final zza m22708A() {
        if (this.f17592s != null) {
            return this.f17592s;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static zzbt m22702a(Context context, zzak zzak) {
        if (zzak != null && (zzak.f10742e == null || zzak.f10743f == null)) {
            zzak = new zzak(zzak.f10738a, zzak.f10739b, zzak.f10740c, zzak.f10741d, null, null, zzak.f10744g);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f17569a == null) {
            synchronized (zzbt.class) {
                if (f17569a == null) {
                    f17569a = new zzbt(new zzcr(context, zzak));
                }
            }
        } else if (!(zzak == null || zzak.f10744g == null || zzak.f10744g.containsKey("dataCollectionDefaultEnabled") == null)) {
            f17569a.m22721b(zzak.f10744g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f17569a;
    }

    /* renamed from: I */
    private final void m22701I() {
        if (!this.f17598y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: b */
    private static void m22706b(ao aoVar) {
        if (aoVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!aoVar.m27285z()) {
            aoVar = String.valueOf(aoVar.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(aoVar).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(aoVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private static void m22707b(ch chVar) {
        if (chVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!chVar.m28440D()) {
            chVar = String.valueOf(chVar.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(chVar).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(chVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static void m22703a(an anVar) {
        if (anVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: b */
    final void m22721b(boolean z) {
        this.f17571B = Boolean.valueOf(z);
    }

    /* renamed from: B */
    public final boolean m22709B() {
        return this.f17571B != null && this.f17571B.booleanValue();
    }

    /* renamed from: C */
    public final boolean m22710C() {
        mo3171q().mo4395d();
        m22701I();
        if (this.f17581h.m27354h()) {
            return false;
        }
        boolean booleanValue;
        Boolean i = this.f17581h.m27356i();
        if (i != null) {
            booleanValue = i.booleanValue();
        } else {
            booleanValue = GoogleServices.isMeasurementExplicitlyDisabled() ^ 1;
            if (booleanValue && this.f17571B != null && ((Boolean) zzaf.al.m12332b()).booleanValue()) {
                booleanValue = this.f17571B.booleanValue();
            }
        }
        return m22722c().m28453c(booleanValue);
    }

    /* renamed from: D */
    final long m22711D() {
        Long valueOf = Long.valueOf(m22722c().f21388h.m12360a());
        if (valueOf.longValue() == 0) {
            return this.f17574E;
        }
        return Math.min(this.f17574E, valueOf.longValue());
    }

    /* renamed from: E */
    final void m22712E() {
        zzk zzk = this.f17580g;
    }

    /* renamed from: F */
    final void m22713F() {
        zzk zzk = this.f17580g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: a */
    final void m22717a(ao aoVar) {
        this.f17572C++;
    }

    /* renamed from: a */
    final void m22718a(ch chVar) {
        this.f17572C++;
    }

    /* renamed from: G */
    final void m22714G() {
        this.f17573D++;
    }

    /* renamed from: H */
    protected final boolean m22715H() {
        m22701I();
        mo3171q().mo4395d();
        if (this.f17599z == null || this.f17570A == 0 || !(this.f17599z == null || this.f17599z.booleanValue() || Math.abs(this.f17589p.elapsedRealtime() - this.f17570A) <= 1000)) {
            this.f17570A = this.f17589p.elapsedRealtime();
            zzk zzk = this.f17580g;
            boolean z = true;
            boolean z2 = m22729j().m28631d("android.permission.INTERNET") && m22729j().m28631d("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f17575b).isCallerInstantApp() || this.f17581h.m27376y() || (zzbj.m12372a(this.f17575b) && zzfk.m28592a(this.f17575b, false)));
            this.f17599z = Boolean.valueOf(z2);
            if (this.f17599z.booleanValue()) {
                if (!m22729j().m28626b(m22745z().m29472y(), m22745z().m29473z())) {
                    if (TextUtils.isEmpty(m22745z().m29473z())) {
                        z = false;
                    }
                }
                this.f17599z = Boolean.valueOf(z);
            }
        }
        return this.f17599z.booleanValue();
    }
}
