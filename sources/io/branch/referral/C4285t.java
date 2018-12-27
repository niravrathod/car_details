package io.branch.referral;

import android.content.Context;
import io.branch.indexing.C2699b;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONObject;

/* renamed from: io.branch.referral.t */
abstract class C4285t extends ServerRequest {
    /* renamed from: g */
    final ac f17990g;
    /* renamed from: h */
    private final Context f17991h;
    /* renamed from: i */
    private final C2699b f17992i = C2699b.m13067a(this.f17991h);

    /* renamed from: e */
    protected boolean mo3549e() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3541i() {
        return true;
    }

    /* renamed from: u */
    public abstract boolean mo3543u();

    /* renamed from: v */
    public abstract String mo3544v();

    C4285t(Context context, String str, ac acVar) {
        super(context, str);
        this.f17991h = context;
        this.f17990g = acVar;
    }

    C4285t(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f17991h = context;
        this.f17990g = new ac(context);
    }

    /* renamed from: a */
    protected void mo3548a(JSONObject jSONObject) {
        super.mo3548a(jSONObject);
        if (!this.f17990g.m13228c().equals("bnc_no_value")) {
            jSONObject.put(Jsonkey.AppVersion.m13131a(), this.f17990g.m13228c());
        }
        jSONObject.put(Jsonkey.FaceBookAppLinkChecked.m13131a(), this.b.m13393l());
        jSONObject.put(Jsonkey.IsReferrable.m13131a(), this.b.m13416x());
        jSONObject.put(Jsonkey.Debug.m13131a(), this.b.m13354G());
        m23533b(jSONObject);
        m13151a(this.f17991h, jSONObject);
    }

    /* renamed from: a */
    static boolean m23532a(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase("install") != null;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    boolean m23536a(io.branch.referral.ab r5) {
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
        r4 = this;
        if (r5 == 0) goto L_0x0078;
    L_0x0002:
        r0 = r5.m13213b();
        if (r0 == 0) goto L_0x0078;
    L_0x0008:
        r0 = r5.m13213b();
        r1 = io.branch.referral.Defines.Jsonkey.BranchViewData;
        r1 = r1.m13131a();
        r0 = r0.has(r1);
        if (r0 == 0) goto L_0x0078;
    L_0x0018:
        r5 = r5.m13213b();	 Catch:{ JSONException -> 0x0078 }
        r0 = io.branch.referral.Defines.Jsonkey.BranchViewData;	 Catch:{ JSONException -> 0x0078 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0078 }
        r5 = r5.getJSONObject(r0);	 Catch:{ JSONException -> 0x0078 }
        r0 = r4.mo3544v();	 Catch:{ JSONException -> 0x0078 }
        r1 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f17935f;	 Catch:{ JSONException -> 0x0078 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ JSONException -> 0x0078 }
    L_0x0032:
        r1 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f17935f;	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.get();	 Catch:{ JSONException -> 0x0078 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ JSONException -> 0x0078 }
    L_0x003e:
        r1 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.f17935f;	 Catch:{ JSONException -> 0x0078 }
        r1 = r1.get();	 Catch:{ JSONException -> 0x0078 }
        r1 = (android.app.Activity) r1;	 Catch:{ JSONException -> 0x0078 }
        r2 = r1 instanceof io.branch.referral.Branch.C2706i;	 Catch:{ JSONException -> 0x0078 }
        r3 = 1;	 Catch:{ JSONException -> 0x0078 }
        if (r2 == 0) goto L_0x0057;	 Catch:{ JSONException -> 0x0078 }
    L_0x004f:
        r2 = r1;	 Catch:{ JSONException -> 0x0078 }
        r2 = (io.branch.referral.Branch.C2706i) r2;	 Catch:{ JSONException -> 0x0078 }
        r2 = r2.m13085a();	 Catch:{ JSONException -> 0x0078 }
        r3 = r3 ^ r2;	 Catch:{ JSONException -> 0x0078 }
    L_0x0057:
        if (r3 == 0) goto L_0x0066;	 Catch:{ JSONException -> 0x0078 }
    L_0x0059:
        r2 = io.branch.referral.C2748j.m13306a();	 Catch:{ JSONException -> 0x0078 }
        r3 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0078 }
        r5 = r2.m13322a(r5, r0, r1, r3);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;	 Catch:{ JSONException -> 0x0078 }
    L_0x0066:
        r1 = io.branch.referral.C2748j.m13306a();	 Catch:{ JSONException -> 0x0078 }
        r5 = r1.m13321a(r5, r0);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;	 Catch:{ JSONException -> 0x0078 }
    L_0x006f:
        r1 = io.branch.referral.C2748j.m13306a();	 Catch:{ JSONException -> 0x0078 }
        r5 = r1.m13321a(r5, r0);	 Catch:{ JSONException -> 0x0078 }
        goto L_0x0079;
    L_0x0078:
        r5 = 0;
    L_0x0079:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.a(io.branch.referral.ab):boolean");
    }

    /* renamed from: a */
    public void mo3536a(io.branch.referral.ab r4, io.branch.referral.Branch r5) {
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
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13389j(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13391k(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13392l(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13385h(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13387i(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13395m(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13397n(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r0 = 0;	 Catch:{ JSONException -> 0x0093 }
        r1 = java.lang.Boolean.valueOf(r0);	 Catch:{ JSONException -> 0x0093 }
        r5.m13360a(r1);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r1 = "bnc_no_value";	 Catch:{ JSONException -> 0x0093 }
        r5.m13403q(r1);	 Catch:{ JSONException -> 0x0093 }
        r5 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r5.m13369b(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = r4.m13213b();	 Catch:{ JSONException -> 0x0093 }
        if (r5 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x004d:
        r5 = r4.m13213b();	 Catch:{ JSONException -> 0x0093 }
        r0 = io.branch.referral.Defines.Jsonkey.Data;	 Catch:{ JSONException -> 0x0093 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0093 }
        r5 = r5.has(r0);	 Catch:{ JSONException -> 0x0093 }
        if (r5 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x005d:
        r5 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.m13213b();	 Catch:{ JSONException -> 0x0093 }
        r0 = io.branch.referral.Defines.Jsonkey.Data;	 Catch:{ JSONException -> 0x0093 }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.getString(r0);	 Catch:{ JSONException -> 0x0093 }
        r5.<init>(r4);	 Catch:{ JSONException -> 0x0093 }
        r4 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x0093 }
        r4 = r4.m13131a();	 Catch:{ JSONException -> 0x0093 }
        r4 = r5.optBoolean(r4);	 Catch:{ JSONException -> 0x0093 }
        if (r4 == 0) goto L_0x0093;	 Catch:{ JSONException -> 0x0093 }
    L_0x007c:
        r4 = r3 instanceof io.branch.referral.C4730z;	 Catch:{ JSONException -> 0x0093 }
        if (r4 == 0) goto L_0x0083;	 Catch:{ JSONException -> 0x0093 }
    L_0x0080:
        r4 = "Branch Install";	 Catch:{ JSONException -> 0x0093 }
        goto L_0x0085;	 Catch:{ JSONException -> 0x0093 }
    L_0x0083:
        r4 = "Branch Open";	 Catch:{ JSONException -> 0x0093 }
    L_0x0085:
        r0 = new io.branch.referral.m;	 Catch:{ JSONException -> 0x0093 }
        r0.<init>();	 Catch:{ JSONException -> 0x0093 }
        r1 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r1 = r1.m13386i();	 Catch:{ JSONException -> 0x0093 }
        r0.m13338a(r4, r5, r1);	 Catch:{ JSONException -> 0x0093 }
    L_0x0093:
        r4 = r3.b;
        r5 = "bnc_previous_update_time";
        r4 = r4.m13410u(r5);
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x00b0;
    L_0x00a1:
        r4 = r3.b;
        r5 = "bnc_previous_update_time";
        r0 = r3.b;
        r1 = "bnc_last_known_update_time";
        r0 = r0.m13410u(r1);
        r4.m13363a(r5, r0);
    L_0x00b0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.a(io.branch.referral.ab, io.branch.referral.Branch):void");
    }

    /* renamed from: b */
    void m23537b(io.branch.referral.ab r3, io.branch.referral.Branch r4) {
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
        r0 = r2.f17992i;
        if (r0 == 0) goto L_0x0022;
    L_0x0004:
        r0 = r2.f17992i;
        r3 = r3.m13213b();
        r0.m13071a(r3);
        r3 = r4.f17935f;
        if (r3 == 0) goto L_0x0022;
    L_0x0011:
        r3 = io.branch.indexing.C2697a.m13035a();	 Catch:{ Exception -> 0x0022 }
        r0 = r4.f17935f;	 Catch:{ Exception -> 0x0022 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0022 }
        r0 = (android.app.Activity) r0;	 Catch:{ Exception -> 0x0022 }
        r1 = r4.f17937h;	 Catch:{ Exception -> 0x0022 }
        r3.m13061b(r0, r1);	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        r3 = r4.f17935f;
        io.branch.referral.p145a.C2726a.m13201a(r3);
        r4.m23466g();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.b(io.branch.referral.ab, io.branch.referral.Branch):void");
    }

    /* renamed from: w */
    void mo3545w() {
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
        r0 = r3.b;
        r0 = r0.m13398o();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0030;
    L_0x000e:
        r1 = r3.m13165h();	 Catch:{ JSONException -> 0x002f }
        r2 = io.branch.referral.Defines.Jsonkey.LinkIdentifier;	 Catch:{ JSONException -> 0x002f }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x002f }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x002f }
        r0 = r3.m13165h();	 Catch:{ JSONException -> 0x002f }
        r1 = io.branch.referral.Defines.Jsonkey.FaceBookAppLinkChecked;	 Catch:{ JSONException -> 0x002f }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x002f }
        r2 = r3.b;	 Catch:{ JSONException -> 0x002f }
        r2 = r2.m13393l();	 Catch:{ JSONException -> 0x002f }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x002f }
        goto L_0x0030;
    L_0x0030:
        r0 = r3.b;
        r0 = r0.m13400p();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x004d;
    L_0x003e:
        r1 = r3.m13165h();	 Catch:{ JSONException -> 0x004c }
        r2 = io.branch.referral.Defines.Jsonkey.GoogleSearchInstallReferrer;	 Catch:{ JSONException -> 0x004c }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x004c }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x004c }
        goto L_0x004d;
    L_0x004d:
        r0 = r3.b;
        r0 = r0.m13402q();
        r1 = "bnc_no_value";
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x006a;
    L_0x005b:
        r1 = r3.m13165h();	 Catch:{ JSONException -> 0x0069 }
        r2 = io.branch.referral.Defines.Jsonkey.GooglePlayInstallReferrer;	 Catch:{ JSONException -> 0x0069 }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x0069 }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x0069 }
        goto L_0x006a;
    L_0x006a:
        r0 = r3.b;
        r0 = r0.m13407s();
        if (r0 == 0) goto L_0x0093;
    L_0x0072:
        r0 = r3.m13165h();	 Catch:{ JSONException -> 0x0093 }
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;	 Catch:{ JSONException -> 0x0093 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0093 }
        r2 = r3.b;	 Catch:{ JSONException -> 0x0093 }
        r2 = r2.m13404r();	 Catch:{ JSONException -> 0x0093 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0093 }
        r0 = r3.m13165h();	 Catch:{ JSONException -> 0x0093 }
        r1 = io.branch.referral.Defines.Jsonkey.IsFullAppConv;	 Catch:{ JSONException -> 0x0093 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0093 }
        r2 = 1;	 Catch:{ JSONException -> 0x0093 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0093 }
    L_0x0093:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.w():void");
    }

    /* renamed from: q */
    public void mo3550q() {
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
        r4 = this;
        r0 = r4.m13165h();
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13404r();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x0021;	 Catch:{ JSONException -> 0x009c }
    L_0x0012:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m13404r();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x0021:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13409t();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x003e;	 Catch:{ JSONException -> 0x009c }
    L_0x002f:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidPushIdentifier;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m13409t();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x003e:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13394m();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x005b;	 Catch:{ JSONException -> 0x009c }
    L_0x004c:
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_URI;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m13394m();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x005b:
        r1 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13396n();	 Catch:{ JSONException -> 0x009c }
        r2 = "bnc_no_value";	 Catch:{ JSONException -> 0x009c }
        r1 = r1.equals(r2);	 Catch:{ JSONException -> 0x009c }
        if (r1 != 0) goto L_0x0078;	 Catch:{ JSONException -> 0x009c }
    L_0x0069:
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_Extra;	 Catch:{ JSONException -> 0x009c }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x009c }
        r2 = r4.b;	 Catch:{ JSONException -> 0x009c }
        r2 = r2.m13396n();	 Catch:{ JSONException -> 0x009c }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x009c }
    L_0x0078:
        r1 = r4.f17992i;	 Catch:{ JSONException -> 0x009c }
        if (r1 == 0) goto L_0x009c;	 Catch:{ JSONException -> 0x009c }
    L_0x007c:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x009c }
        r1.<init>();	 Catch:{ JSONException -> 0x009c }
        r2 = "mv";	 Catch:{ JSONException -> 0x009c }
        r3 = r4.f17992i;	 Catch:{ JSONException -> 0x009c }
        r3 = r3.m13076e();	 Catch:{ JSONException -> 0x009c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x009c }
        r2 = "pn";	 Catch:{ JSONException -> 0x009c }
        r3 = r4.f17991h;	 Catch:{ JSONException -> 0x009c }
        r3 = r3.getPackageName();	 Catch:{ JSONException -> 0x009c }
        r1.put(r2, r3);	 Catch:{ JSONException -> 0x009c }
        r2 = "cd";	 Catch:{ JSONException -> 0x009c }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x009c }
    L_0x009c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.q():void");
    }

    /* renamed from: b */
    private void m23533b(org.json.JSONObject r10) {
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
        r9 = this;
        r0 = r9.f17990g;
        r0 = r0.m13228c();
        r1 = 0;
        r2 = r9.f17991h;	 Catch:{ NameNotFoundException -> 0x0018 }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0018 }
        r3 = r9.f17991h;	 Catch:{ NameNotFoundException -> 0x0018 }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0018 }
        r2 = r2.getPackageInfo(r3, r1);	 Catch:{ NameNotFoundException -> 0x0018 }
        goto L_0x0019;
    L_0x0018:
        r2 = 0;
    L_0x0019:
        r3 = "bnc_no_value";
        r4 = r9.b;
        r4 = r4.m13377e();
        r3 = r3.equals(r4);
        r4 = 2;
        if (r3 == 0) goto L_0x0037;
    L_0x0028:
        if (r2 == 0) goto L_0x0046;
    L_0x002a:
        r5 = r2.lastUpdateTime;
        r7 = r2.firstInstallTime;
        r5 = r5 - r7;
        r7 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 < 0) goto L_0x0046;
    L_0x0036:
        goto L_0x0043;
    L_0x0037:
        r1 = r9.b;
        r1 = r1.m13377e();
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0045;
    L_0x0043:
        r1 = 2;
        goto L_0x0046;
    L_0x0045:
        r1 = 1;
    L_0x0046:
        r0 = io.branch.referral.Defines.Jsonkey.Update;
        r0 = r0.m13131a();
        r10.put(r0, r1);
        if (r2 == 0) goto L_0x00b8;
    L_0x0051:
        r0 = io.branch.referral.Defines.Jsonkey.FirstInstallTime;
        r0 = r0.m13131a();
        r3 = r2.firstInstallTime;
        r10.put(r0, r3);
        r0 = io.branch.referral.Defines.Jsonkey.LastUpdateTime;
        r0 = r0.m13131a();
        r3 = r2.lastUpdateTime;
        r10.put(r0, r3);
        r0 = r9.b;
        r1 = "bnc_original_install_time";
        r0 = r0.m13410u(r1);
        r3 = 0;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x0080;
    L_0x0075:
        r0 = r2.firstInstallTime;
        r3 = r9.b;
        r4 = "bnc_original_install_time";
        r5 = r2.firstInstallTime;
        r3.m13363a(r4, r5);
    L_0x0080:
        r3 = io.branch.referral.Defines.Jsonkey.OriginalInstallTime;
        r3 = r3.m13131a();
        r10.put(r3, r0);
        r0 = r9.b;
        r1 = "bnc_last_known_update_time";
        r0 = r0.m13410u(r1);
        r3 = r2.lastUpdateTime;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x00a7;
    L_0x0097:
        r3 = r9.b;
        r4 = "bnc_previous_update_time";
        r3.m13363a(r4, r0);
        r0 = r9.b;
        r1 = "bnc_last_known_update_time";
        r2 = r2.lastUpdateTime;
        r0.m13363a(r1, r2);
    L_0x00a7:
        r0 = io.branch.referral.Defines.Jsonkey.PreviousUpdateTime;
        r0 = r0.m13131a();
        r1 = r9.b;
        r2 = "bnc_previous_update_time";
        r1 = r1.m13410u(r2);
        r10.put(r0, r1);
    L_0x00b8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.b(org.json.JSONObject):void");
    }

    /* renamed from: t */
    protected boolean mo3551t() {
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
        r0 = r3.m13165h();
        r1 = io.branch.referral.Defines.Jsonkey.AndroidAppLinkURL;
        r1 = r1.m13131a();
        r1 = r0.has(r1);
        if (r1 != 0) goto L_0x002e;
    L_0x0010:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidPushIdentifier;
        r1 = r1.m13131a();
        r1 = r0.has(r1);
        if (r1 != 0) goto L_0x002e;
    L_0x001c:
        r1 = io.branch.referral.Defines.Jsonkey.LinkIdentifier;
        r1 = r1.m13131a();
        r1 = r0.has(r1);
        if (r1 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002e;
    L_0x0029:
        r0 = super.mo3551t();
        return r0;
    L_0x002e:
        r1 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.IdentityID;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.FaceBookAppLinkChecked;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_Extra;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.External_Intent_URI;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.FirstInstallTime;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.LastUpdateTime;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.OriginalInstallTime;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.PreviousUpdateTime;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.InstallBeginTimeStamp;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.ClickedReferrerTimeStamp;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.HardwareID;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.IsHardwareIDReal;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = io.branch.referral.Defines.Jsonkey.LocalIP;
        r1 = r1.m13131a();
        r0.remove(r1);
        r1 = 1;
        r2 = io.branch.referral.Defines.Jsonkey.TrackingDisabled;	 Catch:{ JSONException -> 0x00b6 }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x00b6 }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00b6 }
    L_0x00b6:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.t.t():boolean");
    }
}
