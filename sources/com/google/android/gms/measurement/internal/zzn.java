package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzaf.zza;
import java.lang.reflect.InvocationTargetException;

public final class zzn extends an {
    /* renamed from: a */
    private Boolean f20718a;
    /* renamed from: b */
    private cs f20719b = cr.f17568a;
    /* renamed from: c */
    private Boolean f20720c;

    zzn(zzbt zzbt) {
        super(zzbt);
        zzaf.m12334a(zzbt);
    }

    /* renamed from: a */
    final void m27338a(cs csVar) {
        this.f20719b = csVar;
    }

    /* renamed from: e */
    static String m27329e() {
        return (String) zzaf.f10720i.m12332b();
    }

    /* renamed from: a */
    public final int m27335a(String str) {
        return m27340b(str, zzaf.f10734w);
    }

    /* renamed from: f */
    public final long m27350f() {
        mo3173u();
        return 13001;
    }

    /* renamed from: g */
    public final boolean m27352g() {
        if (this.f20720c == null) {
            synchronized (this) {
                if (this.f20720c == null) {
                    ApplicationInfo applicationInfo = mo3170n().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(myProcessName);
                        this.f20720c = Boolean.valueOf(z);
                    }
                    if (this.f20720c == null) {
                        this.f20720c = Boolean.TRUE;
                        mo3172r().v_().m12354a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f20720c.booleanValue();
    }

    /* renamed from: a */
    public final long m27336a(java.lang.String r3, com.google.android.gms.measurement.internal.zzaf.zza<java.lang.Long> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        if (r3 != 0) goto L_0x000d;
    L_0x0002:
        r3 = r4.m12332b();
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        return r3;
    L_0x000d:
        r0 = r2.f20719b;
        r1 = r4.m12331a();
        r3 = r0.mo3176a(r3, r1);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r3 = r4.m12332b();
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        return r3;
    L_0x0028:
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = r4.m12330a(r3);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = (java.lang.Long) r3;	 Catch:{ NumberFormatException -> 0x003b }
        r0 = r3.longValue();	 Catch:{ NumberFormatException -> 0x003b }
        return r0;
    L_0x003b:
        r3 = r4.m12332b();
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzn.a(java.lang.String, com.google.android.gms.measurement.internal.zzaf$zza):long");
    }

    /* renamed from: b */
    public final int m27340b(java.lang.String r3, com.google.android.gms.measurement.internal.zzaf.zza<java.lang.Integer> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        if (r3 != 0) goto L_0x000d;
    L_0x0002:
        r3 = r4.m12332b();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        return r3;
    L_0x000d:
        r0 = r2.f20719b;
        r1 = r4.m12331a();
        r3 = r0.mo3176a(r3, r1);
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r3 = r4.m12332b();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        return r3;
    L_0x0028:
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = r4.m12330a(r3);	 Catch:{ NumberFormatException -> 0x003b }
        r3 = (java.lang.Integer) r3;	 Catch:{ NumberFormatException -> 0x003b }
        r3 = r3.intValue();	 Catch:{ NumberFormatException -> 0x003b }
        return r3;
    L_0x003b:
        r3 = r4.m12332b();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzn.b(java.lang.String, com.google.android.gms.measurement.internal.zzaf$zza):int");
    }

    /* renamed from: c */
    public final boolean m27345c(String str, zza<Boolean> zza) {
        if (str == null) {
            return ((Boolean) zza.m12332b()).booleanValue();
        }
        str = this.f20719b.mo3176a(str, zza.m12331a());
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zza.m12332b()).booleanValue();
        }
        return ((Boolean) zza.m12330a(Boolean.valueOf(Boolean.parseBoolean(str)))).booleanValue();
    }

    /* renamed from: d */
    public final boolean m27348d(String str, zza<Boolean> zza) {
        return m27345c(str, zza);
    }

    /* renamed from: a */
    public final boolean m27339a(zza<Boolean> zza) {
        return m27345c(null, zza);
    }

    @VisibleForTesting
    /* renamed from: b */
    final Boolean m27341b(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            if (mo3170n().getPackageManager() == null) {
                mo3172r().v_().m12354a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(mo3170n()).getApplicationInfo(mo3170n().getPackageName(), 128);
            if (applicationInfo == null) {
                mo3172r().v_().m12354a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (applicationInfo.metaData == null) {
                mo3172r().v_().m12354a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (applicationInfo.metaData.containsKey(str)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            } else {
                return null;
            }
        } catch (String str2) {
            mo3172r().v_().m12355a("Failed to load metadata: Package name not found", str2);
            return null;
        }
    }

    /* renamed from: h */
    public final boolean m27354h() {
        mo3173u();
        Boolean b = m27341b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: i */
    public final Boolean m27356i() {
        mo3173u();
        return m27341b("firebase_analytics_collection_enabled");
    }

    /* renamed from: j */
    public static long m27330j() {
        return ((Long) zzaf.f10697L.m12332b()).longValue();
    }

    /* renamed from: k */
    public static long m27331k() {
        return ((Long) zzaf.f10723l.m12332b()).longValue();
    }

    /* renamed from: v */
    public final String m27375v() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo3172r().v_().m12355a("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            mo3172r().v_().m12355a("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            mo3172r().v_().m12355a("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo3172r().v_().m12355a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: w */
    public static boolean m27332w() {
        return ((Boolean) zzaf.f10719h.m12332b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean m27344c(String str) {
        return "1".equals(this.f20719b.mo3176a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final boolean m27347d(String str) {
        return "1".equals(this.f20719b.mo3176a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: e */
    final boolean m27349e(String str) {
        return m27345c(str, zzaf.f10706U);
    }

    /* renamed from: f */
    final boolean m27351f(String str) {
        return m27345c(str, zzaf.f10708W);
    }

    /* renamed from: g */
    final boolean m27353g(String str) {
        return m27345c(str, zzaf.f10709X);
    }

    /* renamed from: h */
    final boolean m27355h(String str) {
        return m27345c(str, zzaf.f10701P);
    }

    /* renamed from: i */
    final boolean m27357i(String str) {
        return m27345c(str, zzaf.f10710Y);
    }

    /* renamed from: j */
    final boolean m27358j(String str) {
        return m27345c(str, zzaf.f10711Z);
    }

    /* renamed from: k */
    final boolean m27359k(String str) {
        return m27345c(str, zzaf.ac);
    }

    /* renamed from: l */
    final boolean m27361l(String str) {
        return m27345c(str, zzaf.ad);
    }

    /* renamed from: m */
    final boolean m27363m(String str) {
        return m27345c(str, zzaf.af);
    }

    /* renamed from: x */
    static boolean m27333x() {
        return ((Boolean) zzaf.ag.m12332b()).booleanValue();
    }

    /* renamed from: y */
    final boolean m27376y() {
        if (this.f20718a == null) {
            this.f20718a = m27341b("app_measurement_lite");
            if (this.f20718a == null) {
                this.f20718a = Boolean.valueOf(false);
            }
        }
        if (!this.f20718a.booleanValue()) {
            if (this.r.m22741v()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    final boolean m27365n(String str) {
        return m27345c(str, zzaf.ae);
    }

    /* renamed from: z */
    static boolean m27334z() {
        return ((Boolean) zzaf.ai.m12332b()).booleanValue();
    }

    /* renamed from: o */
    final boolean m27367o(String str) {
        return m27345c(str, zzaf.aj);
    }

    /* renamed from: p */
    final boolean m27369p(String str) {
        return m27345c(str, zzaf.ak);
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
