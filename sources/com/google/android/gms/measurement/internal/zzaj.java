package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

public final class zzaj extends ch {
    /* renamed from: a */
    private String f21622a;
    /* renamed from: b */
    private String f21623b;
    /* renamed from: c */
    private int f21624c;
    /* renamed from: d */
    private String f21625d;
    /* renamed from: e */
    private String f21626e;
    /* renamed from: f */
    private long f21627f;
    /* renamed from: g */
    private long f21628g;
    /* renamed from: h */
    private int f21629h;
    /* renamed from: i */
    private String f21630i;
    /* renamed from: j */
    private String f21631j;

    zzaj(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: v */
    protected final boolean mo4962v() {
        return true;
    }

    /* renamed from: w */
    protected final void mo4963w() {
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
        r10 = this;
        r0 = "unknown";
        r1 = "Unknown";
        r2 = "Unknown";
        r3 = r10.mo3170n();
        r3 = r3.getPackageName();
        r4 = r10.mo3170n();
        r4 = r4.getPackageManager();
        r5 = 0;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 != 0) goto L_0x002d;
    L_0x001b:
        r4 = r10.mo3172r();
        r4 = r4.v_();
        r7 = "PackageManager is null, app identity information might be inaccurate. appId";
        r8 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);
        r4.m12355a(r7, r8);
        goto L_0x008b;
    L_0x002d:
        r7 = r4.getInstallerPackageName(r3);	 Catch:{ IllegalArgumentException -> 0x0033 }
        r0 = r7;
        goto L_0x0044;
    L_0x0033:
        r7 = r10.mo3172r();
        r7 = r7.v_();
        r8 = "Error retrieving app installer package name. appId";
        r9 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);
        r7.m12355a(r8, r9);
    L_0x0044:
        if (r0 != 0) goto L_0x0049;
    L_0x0046:
        r0 = "manual_install";
        goto L_0x0053;
    L_0x0049:
        r7 = "com.android.vending";
        r7 = r7.equals(r0);
        if (r7 == 0) goto L_0x0053;
    L_0x0051:
        r0 = "";
    L_0x0053:
        r7 = r10.mo3170n();	 Catch:{ NameNotFoundException -> 0x007a }
        r7 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x007a }
        r7 = r4.getPackageInfo(r7, r5);	 Catch:{ NameNotFoundException -> 0x007a }
        if (r7 == 0) goto L_0x008b;	 Catch:{ NameNotFoundException -> 0x007a }
    L_0x0061:
        r8 = r7.applicationInfo;	 Catch:{ NameNotFoundException -> 0x007a }
        r4 = r4.getApplicationLabel(r8);	 Catch:{ NameNotFoundException -> 0x007a }
        r8 = android.text.TextUtils.isEmpty(r4);	 Catch:{ NameNotFoundException -> 0x007a }
        if (r8 != 0) goto L_0x0072;	 Catch:{ NameNotFoundException -> 0x007a }
    L_0x006d:
        r4 = r4.toString();	 Catch:{ NameNotFoundException -> 0x007a }
        r2 = r4;	 Catch:{ NameNotFoundException -> 0x007a }
    L_0x0072:
        r4 = r7.versionName;	 Catch:{ NameNotFoundException -> 0x007a }
        r1 = r7.versionCode;	 Catch:{ NameNotFoundException -> 0x0079 }
        r6 = r1;
        r1 = r4;
        goto L_0x008b;
    L_0x0079:
        r1 = r4;
    L_0x007a:
        r4 = r10.mo3172r();
        r4 = r4.v_();
        r7 = "Error retrieving package info. appId, appName";
        r8 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);
        r4.m12356a(r7, r8, r2);
    L_0x008b:
        r10.f21622a = r3;
        r10.f21625d = r0;
        r10.f21623b = r1;
        r10.f21624c = r6;
        r10.f21626e = r2;
        r0 = 0;
        r10.f21627f = r0;
        r10.mo3173u();
        r2 = r10.mo3170n();
        r2 = com.google.android.gms.common.api.internal.GoogleServices.initialize(r2);
        r4 = 1;
        if (r2 == 0) goto L_0x00af;
    L_0x00a7:
        r6 = r2.isSuccess();
        if (r6 == 0) goto L_0x00af;
    L_0x00ad:
        r6 = 1;
        goto L_0x00b0;
    L_0x00af:
        r6 = 0;
    L_0x00b0:
        r7 = r10.r;
        r7 = r7.m22735p();
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x00cc;
    L_0x00bc:
        r7 = "am";
        r8 = r10.r;
        r8 = r8.m22738s();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x00cc;
    L_0x00ca:
        r7 = 1;
        goto L_0x00cd;
    L_0x00cc:
        r7 = 0;
    L_0x00cd:
        r6 = r6 | r7;
        if (r6 != 0) goto L_0x00f9;
    L_0x00d0:
        if (r2 != 0) goto L_0x00e0;
    L_0x00d2:
        r2 = r10.mo3172r();
        r2 = r2.v_();
        r7 = "GoogleService failed to initialize (no status)";
        r2.m12354a(r7);
        goto L_0x00f9;
    L_0x00e0:
        r7 = r10.mo3172r();
        r7 = r7.v_();
        r8 = "GoogleService failed to initialize, status";
        r9 = r2.getStatusCode();
        r9 = java.lang.Integer.valueOf(r9);
        r2 = r2.getStatusMessage();
        r7.m12356a(r8, r9, r2);
    L_0x00f9:
        if (r6 == 0) goto L_0x0165;
    L_0x00fb:
        r2 = r10.mo4400t();
        r2 = r2.m27356i();
        r6 = r10.mo4400t();
        r6 = r6.m27354h();
        if (r6 == 0) goto L_0x0123;
    L_0x010d:
        r2 = r10.r;
        r2 = r2.m22734o();
        if (r2 == 0) goto L_0x0165;
    L_0x0115:
        r2 = r10.mo3172r();
        r2 = r2.m28553v();
        r4 = "Collection disabled with firebase_analytics_collection_deactivated=1";
        r2.m12354a(r4);
        goto L_0x0165;
    L_0x0123:
        if (r2 == 0) goto L_0x0141;
    L_0x0125:
        r6 = r2.booleanValue();
        if (r6 != 0) goto L_0x0141;
    L_0x012b:
        r2 = r10.r;
        r2 = r2.m22734o();
        if (r2 == 0) goto L_0x0165;
    L_0x0133:
        r2 = r10.mo3172r();
        r2 = r2.m28553v();
        r4 = "Collection disabled with firebase_analytics_collection_enabled=0";
        r2.m12354a(r4);
        goto L_0x0165;
    L_0x0141:
        if (r2 != 0) goto L_0x0157;
    L_0x0143:
        r2 = com.google.android.gms.common.api.internal.GoogleServices.isMeasurementExplicitlyDisabled();
        if (r2 == 0) goto L_0x0157;
    L_0x0149:
        r2 = r10.mo3172r();
        r2 = r2.m28553v();
        r4 = "Collection disabled with google_app_measurement_enable=0";
        r2.m12354a(r4);
        goto L_0x0165;
    L_0x0157:
        r2 = r10.mo3172r();
        r2 = r2.m28555x();
        r6 = "Collection enabled";
        r2.m12354a(r6);
        goto L_0x0166;
    L_0x0165:
        r4 = 0;
    L_0x0166:
        r2 = "";
        r10.f21630i = r2;
        r2 = "";
        r10.f21631j = r2;
        r10.f21628g = r0;
        r10.mo3173u();
        r0 = r10.r;
        r0 = r0.m22735p();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0195;
    L_0x017f:
        r0 = "am";
        r1 = r10.r;
        r1 = r1.m22738s();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0195;
    L_0x018d:
        r0 = r10.r;
        r0 = r0.m22735p();
        r10.f21631j = r0;
    L_0x0195:
        r0 = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();	 Catch:{ IllegalStateException -> 0x01d0 }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x01d0 }
        if (r1 == 0) goto L_0x01a2;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x019f:
        r1 = "";	 Catch:{ IllegalStateException -> 0x01d0 }
        goto L_0x01a3;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01a2:
        r1 = r0;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01a3:
        r10.f21630i = r1;	 Catch:{ IllegalStateException -> 0x01d0 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x01d0 }
        if (r0 != 0) goto L_0x01bc;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01ab:
        r0 = new com.google.android.gms.common.internal.StringResourceValueReader;	 Catch:{ IllegalStateException -> 0x01d0 }
        r1 = r10.mo3170n();	 Catch:{ IllegalStateException -> 0x01d0 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x01d0 }
        r1 = "gma_app_id";	 Catch:{ IllegalStateException -> 0x01d0 }
        r0 = r0.getString(r1);	 Catch:{ IllegalStateException -> 0x01d0 }
        r10.f21631j = r0;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01bc:
        if (r4 == 0) goto L_0x01e2;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01be:
        r0 = r10.mo3172r();	 Catch:{ IllegalStateException -> 0x01d0 }
        r0 = r0.m28555x();	 Catch:{ IllegalStateException -> 0x01d0 }
        r1 = "App package, google app id";	 Catch:{ IllegalStateException -> 0x01d0 }
        r2 = r10.f21622a;	 Catch:{ IllegalStateException -> 0x01d0 }
        r4 = r10.f21630i;	 Catch:{ IllegalStateException -> 0x01d0 }
        r0.m12356a(r1, r2, r4);	 Catch:{ IllegalStateException -> 0x01d0 }
        goto L_0x01e2;
    L_0x01d0:
        r0 = move-exception;
        r1 = r10.mo3172r();
        r1 = r1.v_();
        r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId";
        r3 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);
        r1.m12356a(r2, r3, r0);
    L_0x01e2:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x01f3;
    L_0x01e8:
        r0 = r10.mo3170n();
        r0 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r0);
        r10.f21629h = r0;
        return;
    L_0x01f3:
        r10.f21629h = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.w():void");
    }

    /* renamed from: a */
    final zzh m29447a(String str) {
        String C;
        boolean z;
        boolean booleanValue;
        boolean z2;
        long j;
        mo4395d();
        mo4393b();
        String x = m29471x();
        String y = m29472y();
        m28441E();
        String str2 = this.f21623b;
        long A = (long) m29445A();
        m28441E();
        String str3 = this.f21625d;
        long f = mo4400t().m27350f();
        m28441E();
        mo4395d();
        if (this.f21627f == 0) {
            r0.f21627f = r0.r.m22729j().m28610a(mo3170n(), mo3170n().getPackageName());
        }
        long j2 = r0.f21627f;
        boolean C2 = r0.r.m22710C();
        boolean z3 = mo4399s().f21397q ^ 1;
        mo4395d();
        mo4393b();
        if (!mo4400t().m27357i(r0.f21622a) || r0.r.m22710C()) {
            C = m29444C();
        } else {
            C = null;
        }
        String str4 = C;
        m28441E();
        boolean z4 = z3;
        String str5 = str4;
        long j3 = r0.f21628g;
        long D = r0.r.m22711D();
        int B = m29446B();
        an t = mo4400t();
        t.mo4393b();
        Boolean b = t.m27341b("google_analytics_adid_collection_enabled");
        if (b != null) {
            if (!b.booleanValue()) {
                z = false;
                booleanValue = Boolean.valueOf(z).booleanValue();
                t = mo4400t();
                t.mo4393b();
                b = t.m27341b("google_analytics_ssaid_collection_enabled");
                if (b != null) {
                    if (b.booleanValue()) {
                        z2 = false;
                        j = j3;
                        return new zzh(x, y, str2, A, str3, f, j2, str, C2, z4, str5, j, D, B, booleanValue, Boolean.valueOf(z2).booleanValue(), mo4399s().m28463v(), m29473z());
                    }
                }
                z2 = true;
                j = j3;
                return new zzh(x, y, str2, A, str3, f, j2, str, C2, z4, str5, j, D, B, booleanValue, Boolean.valueOf(z2).booleanValue(), mo4399s().m28463v(), m29473z());
            }
        }
        z = true;
        booleanValue = Boolean.valueOf(z).booleanValue();
        t = mo4400t();
        t.mo4393b();
        b = t.m27341b("google_analytics_ssaid_collection_enabled");
        if (b != null) {
            if (b.booleanValue()) {
                z2 = false;
                j = j3;
                return new zzh(x, y, str2, A, str3, f, j2, str, C2, z4, str5, j, D, B, booleanValue, Boolean.valueOf(z2).booleanValue(), mo4399s().m28463v(), m29473z());
            }
        }
        z2 = true;
        j = j3;
        return new zzh(x, y, str2, A, str3, f, j2, str, C2, z4, str5, j, D, B, booleanValue, Boolean.valueOf(z2).booleanValue(), mo4399s().m28463v(), m29473z());
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: C */
    private final java.lang.String m29444C() {
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
        r7 = this;
        r0 = 0;
        r1 = r7.mo3170n();	 Catch:{ ClassNotFoundException -> 0x005c }
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x005c }
        r2 = "com.google.firebase.analytics.FirebaseAnalytics";	 Catch:{ ClassNotFoundException -> 0x005c }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x005c }
        if (r1 != 0) goto L_0x0012;
    L_0x0011:
        return r0;
    L_0x0012:
        r2 = "getInstance";	 Catch:{ Exception -> 0x004e }
        r3 = 1;	 Catch:{ Exception -> 0x004e }
        r4 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x004e }
        r5 = android.content.Context.class;	 Catch:{ Exception -> 0x004e }
        r6 = 0;	 Catch:{ Exception -> 0x004e }
        r4[r6] = r5;	 Catch:{ Exception -> 0x004e }
        r2 = r1.getDeclaredMethod(r2, r4);	 Catch:{ Exception -> 0x004e }
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x004e }
        r4 = r7.mo3170n();	 Catch:{ Exception -> 0x004e }
        r3[r6] = r4;	 Catch:{ Exception -> 0x004e }
        r2 = r2.invoke(r0, r3);	 Catch:{ Exception -> 0x004e }
        if (r2 != 0) goto L_0x002f;
    L_0x002e:
        return r0;
    L_0x002f:
        r3 = "getFirebaseInstanceId";	 Catch:{ Exception -> 0x0040 }
        r4 = new java.lang.Class[r6];	 Catch:{ Exception -> 0x0040 }
        r1 = r1.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x0040 }
        r3 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0040 }
        r1 = r1.invoke(r2, r3);	 Catch:{ Exception -> 0x0040 }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x0040 }
        return r1;
    L_0x0040:
        r1 = r7.mo3172r();
        r1 = r1.m28542k();
        r2 = "Failed to retrieve Firebase Instance Id";
        r1.m12354a(r2);
        return r0;
    L_0x004e:
        r1 = r7.mo3172r();
        r1 = r1.m28541j();
        r2 = "Failed to obtain Firebase Analytics instance";
        r1.m12354a(r2);
        return r0;
    L_0x005c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaj.C():java.lang.String");
    }

    /* renamed from: x */
    final String m29471x() {
        m28441E();
        return this.f21622a;
    }

    /* renamed from: y */
    final String m29472y() {
        m28441E();
        return this.f21630i;
    }

    /* renamed from: z */
    final String m29473z() {
        m28441E();
        return this.f21631j;
    }

    /* renamed from: A */
    final int m29445A() {
        m28441E();
        return this.f21624c;
    }

    /* renamed from: B */
    final int m29446B() {
        m28441E();
        return this.f21629h;
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
