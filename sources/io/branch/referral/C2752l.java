package io.branch.referral;

/* renamed from: io.branch.referral.l */
class C2752l {
    /* renamed from: q */
    private static C2752l f11582q;
    /* renamed from: a */
    private final String f11583a;
    /* renamed from: b */
    private final boolean f11584b;
    /* renamed from: c */
    private final String f11585c;
    /* renamed from: d */
    private final String f11586d;
    /* renamed from: e */
    private final int f11587e;
    /* renamed from: f */
    private final int f11588f;
    /* renamed from: g */
    private final int f11589g;
    /* renamed from: h */
    private final boolean f11590h;
    /* renamed from: i */
    private final String f11591i;
    /* renamed from: j */
    private final String f11592j;
    /* renamed from: k */
    private final int f11593k;
    /* renamed from: l */
    private final String f11594l;
    /* renamed from: m */
    private final String f11595m;
    /* renamed from: n */
    private final String f11596n;
    /* renamed from: o */
    private final String f11597o;
    /* renamed from: p */
    private final String f11598p;

    /* renamed from: a */
    public static C2752l m13327a(boolean z, ac acVar, boolean z2) {
        if (f11582q == null) {
            f11582q = new C2752l(z, acVar, z2);
        }
        return f11582q;
    }

    /* renamed from: a */
    public static C2752l m13326a() {
        return f11582q;
    }

    private C2752l(boolean z, ac acVar, boolean z2) {
        if (z2) {
            this.f11583a = acVar.m13224a(true);
        } else {
            this.f11583a = acVar.m13224a(z);
        }
        this.f11584b = acVar.m13225a();
        this.f11585c = acVar.m13229d();
        this.f11586d = acVar.m13230e();
        z = acVar.m13235j();
        this.f11587e = z.densityDpi;
        this.f11588f = z.heightPixels;
        this.f11589g = z.widthPixels;
        this.f11590h = acVar.m13236k();
        this.f11591i = ac.m13222l();
        this.f11592j = acVar.m13233h();
        this.f11593k = acVar.m13234i();
        this.f11595m = acVar.m13227b();
        this.f11596n = acVar.m13228c();
        this.f11597o = acVar.m13231f();
        this.f11598p = acVar.m13232g();
        this.f11594l = acVar.m13237m();
    }

    /* renamed from: a */
    public void m13330a(org.json.JSONObject r3) {
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
        r0 = r2.f11583a;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0020;	 Catch:{ JSONException -> 0x00da }
    L_0x000a:
        r0 = io.branch.referral.Defines.Jsonkey.HardwareID;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11583a;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.IsHardwareIDReal;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11584b;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0020:
        r0 = r2.f11585c;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0035;	 Catch:{ JSONException -> 0x00da }
    L_0x002a:
        r0 = io.branch.referral.Defines.Jsonkey.Brand;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11585c;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0035:
        r0 = r2.f11586d;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x004a;	 Catch:{ JSONException -> 0x00da }
    L_0x003f:
        r0 = io.branch.referral.Defines.Jsonkey.Model;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11586d;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x004a:
        r0 = io.branch.referral.Defines.Jsonkey.ScreenDpi;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11587e;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenHeight;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11588f;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenWidth;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11589g;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.WiFi;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11590h;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = io.branch.referral.Defines.Jsonkey.UIMode;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11594l;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = r2.f11592j;	 Catch:{ JSONException -> 0x00da }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x00da }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x0096;	 Catch:{ JSONException -> 0x00da }
    L_0x008b:
        r0 = io.branch.referral.Defines.Jsonkey.OS;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11592j;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x0096:
        r0 = io.branch.referral.Defines.Jsonkey.OSVersion;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11593k;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
        r0 = r2.f11597o;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00b4;	 Catch:{ JSONException -> 0x00da }
    L_0x00a9:
        r0 = io.branch.referral.Defines.Jsonkey.Country;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11597o;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00b4:
        r0 = r2.f11598p;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00c7;	 Catch:{ JSONException -> 0x00da }
    L_0x00bc:
        r0 = io.branch.referral.Defines.Jsonkey.Language;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11598p;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00c7:
        r0 = r2.f11591i;	 Catch:{ JSONException -> 0x00da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00da }
        if (r0 != 0) goto L_0x00da;	 Catch:{ JSONException -> 0x00da }
    L_0x00cf:
        r0 = io.branch.referral.Defines.Jsonkey.LocalIP;	 Catch:{ JSONException -> 0x00da }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x00da }
        r1 = r2.f11591i;	 Catch:{ JSONException -> 0x00da }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x00da }
    L_0x00da:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public void m13329a(android.content.Context r3, io.branch.referral.C2754n r4, org.json.JSONObject r5) {
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
        r0 = r2.f11583a;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x001a;	 Catch:{ JSONException -> 0x0132 }
    L_0x000a:
        r0 = r2.f11584b;	 Catch:{ JSONException -> 0x0132 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ JSONException -> 0x0132 }
    L_0x000e:
        r0 = io.branch.referral.Defines.Jsonkey.AndroidID;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11583a;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        goto L_0x0024;	 Catch:{ JSONException -> 0x0132 }
    L_0x001a:
        r0 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = 1;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0024:
        r0 = r2.f11585c;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ JSONException -> 0x0132 }
    L_0x002e:
        r0 = io.branch.referral.Defines.Jsonkey.Brand;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11585c;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0039:
        r0 = r2.f11586d;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x004e;	 Catch:{ JSONException -> 0x0132 }
    L_0x0043:
        r0 = io.branch.referral.Defines.Jsonkey.Model;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11586d;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x004e:
        r0 = io.branch.referral.Defines.Jsonkey.ScreenDpi;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11587e;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenHeight;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11588f;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.Defines.Jsonkey.ScreenWidth;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11589g;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = r2.f11592j;	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x0084;	 Catch:{ JSONException -> 0x0132 }
    L_0x0079:
        r0 = io.branch.referral.Defines.Jsonkey.OS;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11592j;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x0084:
        r0 = io.branch.referral.Defines.Jsonkey.OSVersion;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11593k;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
        r0 = r2.f11597o;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00a2;	 Catch:{ JSONException -> 0x0132 }
    L_0x0097:
        r0 = io.branch.referral.Defines.Jsonkey.Country;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11597o;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00a2:
        r0 = r2.f11598p;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00b5;	 Catch:{ JSONException -> 0x0132 }
    L_0x00aa:
        r0 = io.branch.referral.Defines.Jsonkey.Language;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11598p;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00b5:
        r0 = r2.f11591i;	 Catch:{ JSONException -> 0x0132 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00c8;	 Catch:{ JSONException -> 0x0132 }
    L_0x00bd:
        r0 = io.branch.referral.Defines.Jsonkey.LocalIP;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r2.f11591i;	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00c8:
        if (r4 == 0) goto L_0x00e3;	 Catch:{ JSONException -> 0x0132 }
    L_0x00ca:
        r0 = r4.m13382g();	 Catch:{ JSONException -> 0x0132 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00e3;	 Catch:{ JSONException -> 0x0132 }
    L_0x00d6:
        r0 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r1 = r4.m13382g();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0132 }
    L_0x00e3:
        r0 = r4.m13388j();	 Catch:{ JSONException -> 0x0132 }
        if (r0 == 0) goto L_0x00fe;	 Catch:{ JSONException -> 0x0132 }
    L_0x00e9:
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.equals(r1);	 Catch:{ JSONException -> 0x0132 }
        if (r0 != 0) goto L_0x00fe;	 Catch:{ JSONException -> 0x0132 }
    L_0x00f1:
        r0 = io.branch.referral.Defines.Jsonkey.DeveloperIdentity;	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m13388j();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r0, r4);	 Catch:{ JSONException -> 0x0132 }
    L_0x00fe:
        r4 = io.branch.referral.Defines.Jsonkey.AppVersion;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r0 = io.branch.referral.C2752l.m13326a();	 Catch:{ JSONException -> 0x0132 }
        r0 = r0.m13331b();	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.SDK;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r0 = "android";	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.SdkVersion;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r0 = "2.19.5";	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r0);	 Catch:{ JSONException -> 0x0132 }
        r4 = io.branch.referral.Defines.Jsonkey.UserAgent;	 Catch:{ JSONException -> 0x0132 }
        r4 = r4.m13131a();	 Catch:{ JSONException -> 0x0132 }
        r3 = r2.m13328a(r3);	 Catch:{ JSONException -> 0x0132 }
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x0132 }
    L_0x0132:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.a(android.content.Context, io.branch.referral.n, org.json.JSONObject):void");
    }

    /* renamed from: b */
    public String m13331b() {
        return this.f11596n;
    }

    /* renamed from: c */
    public boolean m13332c() {
        return this.f11584b;
    }

    /* renamed from: d */
    public String m13333d() {
        return this.f11583a.equals("bnc_no_value") ? null : this.f11583a;
    }

    /* renamed from: e */
    public String m13334e() {
        return this.f11592j;
    }

    /* renamed from: a */
    private java.lang.String m13328a(android.content.Context r4) {
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
        r3 = this;
        r0 = "";
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 17;
        if (r1 < r2) goto L_0x000d;
    L_0x0008:
        r4 = android.webkit.WebSettings.getDefaultUserAgent(r4);	 Catch:{ Exception -> 0x000d }
        goto L_0x000e;
    L_0x000d:
        r4 = r0;
    L_0x000e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.a(android.content.Context):java.lang.String");
    }
}
