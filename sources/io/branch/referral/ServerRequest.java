package io.branch.referral;

import android.content.Context;
import android.content.pm.PackageManager;
import io.branch.referral.Defines.RequestPath;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public abstract class ServerRequest {
    /* renamed from: a */
    protected String f11436a;
    /* renamed from: b */
    protected final C2754n f11437b;
    /* renamed from: c */
    long f11438c = 0;
    /* renamed from: d */
    final Set<PROCESS_WAIT_LOCK> f11439d;
    /* renamed from: e */
    public boolean f11440e = false;
    /* renamed from: f */
    boolean f11441f = false;
    /* renamed from: g */
    private JSONObject f11442g;
    /* renamed from: h */
    private final ac f11443h;
    /* renamed from: i */
    private boolean f11444i;
    /* renamed from: j */
    private int f11445j = 0;
    /* renamed from: k */
    private final Context f11446k;

    public enum BRANCH_API_VERSION {
        V1,
        V2
    }

    enum PROCESS_WAIT_LOCK {
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    /* renamed from: a */
    public abstract void mo3535a(int i, String str);

    /* renamed from: a */
    public abstract void mo3536a(ab abVar, Branch branch);

    /* renamed from: a */
    public abstract boolean mo3537a();

    /* renamed from: a */
    public abstract boolean mo3538a(Context context);

    /* renamed from: b */
    public abstract void mo3539b();

    /* renamed from: c */
    public boolean mo3540c() {
        return false;
    }

    /* renamed from: d */
    boolean mo3542d() {
        return true;
    }

    /* renamed from: e */
    protected boolean mo3549e() {
        return false;
    }

    /* renamed from: i */
    public boolean mo3541i() {
        return false;
    }

    /* renamed from: q */
    public void mo3550q() {
    }

    /* renamed from: t */
    protected boolean mo3551t() {
        return false;
    }

    public ServerRequest(Context context, String str) {
        this.f11446k = context;
        this.f11436a = str;
        this.f11437b = C2754n.m13342a(context);
        this.f11443h = new ac(context);
        this.f11442g = new JSONObject();
        this.f11444i = Branch.m23422c();
        this.f11439d = new HashSet();
    }

    protected ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.f11446k = context;
        this.f11436a = str;
        this.f11442g = jSONObject;
        this.f11437b = C2754n.m13342a(context);
        this.f11443h = new ac(context);
        this.f11444i = Branch.m23422c();
        this.f11439d = new HashSet();
    }

    /* renamed from: f */
    public final String m13163f() {
        return this.f11436a;
    }

    /* renamed from: g */
    public String mo3547g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f11437b.m13357a());
        stringBuilder.append(this.f11436a);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected void mo3548a(org.json.JSONObject r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r3.f11442g = r4;
        r4 = r3.m13175r();
        r0 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r4 != r0) goto L_0x0030;
    L_0x000a:
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0043 }
        r4.<init>();	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.f11442g;	 Catch:{ JSONException -> 0x0043 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0043 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0043 }
        r0.put(r1, r4);	 Catch:{ JSONException -> 0x0043 }
        r0 = r3.f11437b;	 Catch:{ JSONException -> 0x0043 }
        r0 = r0.m13354G();	 Catch:{ JSONException -> 0x0043 }
        r1 = r3.f11443h;	 Catch:{ JSONException -> 0x0043 }
        r2 = r3.f11444i;	 Catch:{ JSONException -> 0x0043 }
        r0 = io.branch.referral.C2752l.m13327a(r0, r1, r2);	 Catch:{ JSONException -> 0x0043 }
        r1 = r3.f11446k;	 Catch:{ JSONException -> 0x0043 }
        r2 = r3.f11437b;	 Catch:{ JSONException -> 0x0043 }
        r0.m13329a(r1, r2, r4);	 Catch:{ JSONException -> 0x0043 }
        goto L_0x0043;
    L_0x0030:
        r4 = r3.f11437b;
        r4 = r4.m13354G();
        r0 = r3.f11443h;
        r1 = r3.f11444i;
        r4 = io.branch.referral.C2752l.m13327a(r4, r0, r1);
        r0 = r3.f11442g;
        r4.m13330a(r0);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(org.json.JSONObject):void");
    }

    /* renamed from: h */
    public JSONObject m13165h() {
        return this.f11442g;
    }

    /* renamed from: a */
    public org.json.JSONObject m13149a(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r5.f11442g;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r1 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0009:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r5.f11442g;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r1.keys();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0018:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r3 == 0) goto L_0x002c;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x001e:
        r3 = r2.next();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x0018;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x002c:
        r1 = r6.size();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r1 <= 0) goto L_0x0062;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0032:
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.<init>();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r6.keySet();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x003f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0045:
        r3 = r2.next();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r4 = r6.get(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r1.put(r3, r4);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r6.remove(r3);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x003f;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
    L_0x0056:
        r6 = io.branch.referral.Defines.Jsonkey.Branch_Instrumentation;	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r6 = r6.m13131a();	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        r0.put(r6, r1);	 Catch:{ JSONException -> 0x0062, ConcurrentModificationException -> 0x0060 }
        goto L_0x0062;
    L_0x0060:
        r0 = r5.f11442g;
    L_0x0062:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(java.util.concurrent.ConcurrentHashMap):org.json.JSONObject");
    }

    /* renamed from: j */
    public JSONObject m13167j() {
        return this.f11442g;
    }

    /* renamed from: k */
    public org.json.JSONObject m13168k() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "REQ_POST";	 Catch:{ JSONException -> 0x0014 }
        r2 = r3.f11442g;	 Catch:{ JSONException -> 0x0014 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0014 }
        r1 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0014 }
        r2 = r3.f11436a;	 Catch:{ JSONException -> 0x0014 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0014 }
        return r0;
    L_0x0014:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.k():org.json.JSONObject");
    }

    /* renamed from: a */
    public static io.branch.referral.ServerRequest m13143a(org.json.JSONObject r4, android.content.Context r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = "";
        r1 = 0;
        r2 = "REQ_POST";	 Catch:{ JSONException -> 0x0012 }
        r2 = r4.has(r2);	 Catch:{ JSONException -> 0x0012 }
        if (r2 == 0) goto L_0x0012;	 Catch:{ JSONException -> 0x0012 }
    L_0x000b:
        r2 = "REQ_POST";	 Catch:{ JSONException -> 0x0012 }
        r2 = r4.getJSONObject(r2);	 Catch:{ JSONException -> 0x0012 }
        goto L_0x0013;
    L_0x0012:
        r2 = r1;
    L_0x0013:
        r3 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0022 }
        r3 = r4.has(r3);	 Catch:{ JSONException -> 0x0022 }
        if (r3 == 0) goto L_0x0022;	 Catch:{ JSONException -> 0x0022 }
    L_0x001b:
        r3 = "REQ_POST_PATH";	 Catch:{ JSONException -> 0x0022 }
        r4 = r4.getString(r3);	 Catch:{ JSONException -> 0x0022 }
        r0 = r4;
    L_0x0022:
        if (r0 == 0) goto L_0x002f;
    L_0x0024:
        r4 = r0.length();
        if (r4 <= 0) goto L_0x002f;
    L_0x002a:
        r4 = m13142a(r0, r2, r5);
        return r4;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(org.json.JSONObject, android.content.Context):io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    private static ServerRequest m13142a(String str, JSONObject jSONObject, Context context) {
        if (str.equalsIgnoreCase(RequestPath.CompletedAction.m13133a())) {
            return new C4280o(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetURL.m13133a())) {
            return new C4281p(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetCreditHistory.m13133a())) {
            return new C4282q(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.GetCredits.m13133a())) {
            return new C4283r(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.IdentifyUser.m13133a())) {
            return new C4284s(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.Logout.m13133a())) {
            return new C4286u(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RedeemRewards.m13133a())) {
            return new C4288x(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RegisterClose.m13133a())) {
            return new C4289y(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(RequestPath.RegisterInstall.m13133a())) {
            return new C4730z(str, jSONObject, context);
        }
        return str.equalsIgnoreCase(RequestPath.RegisterOpen.m13133a()) ? new aa(str, jSONObject, context) : null;
    }

    /* renamed from: u */
    private void mo3543u() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.m13175r();
        r1 = r3.f11443h;
        r1 = io.branch.referral.ac.f11504a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0068;
    L_0x000e:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ JSONException -> 0x0063 }
        if (r0 != r1) goto L_0x0044;	 Catch:{ JSONException -> 0x0063 }
    L_0x0012:
        r0 = r3.f11442g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r0 = r0.optJSONObject(r1);	 Catch:{ JSONException -> 0x0063 }
        if (r0 == 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0063 }
    L_0x0020:
        r1 = io.branch.referral.Defines.Jsonkey.AAID;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f11443h;	 Catch:{ JSONException -> 0x0063 }
        r2 = io.branch.referral.ac.f11504a;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.LimitedAdTracking;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f11443h;	 Catch:{ JSONException -> 0x0063 }
        r2 = r2.f11505b;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r0.remove(r1);	 Catch:{ JSONException -> 0x0063 }
        goto L_0x0094;	 Catch:{ JSONException -> 0x0063 }
    L_0x0044:
        r0 = r3.f11442g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.GoogleAdvertisingID;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f11443h;	 Catch:{ JSONException -> 0x0063 }
        r2 = io.branch.referral.ac.f11504a;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        r0 = r3.f11442g;	 Catch:{ JSONException -> 0x0063 }
        r1 = io.branch.referral.Defines.Jsonkey.LATVal;	 Catch:{ JSONException -> 0x0063 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0063 }
        r2 = r3.f11443h;	 Catch:{ JSONException -> 0x0063 }
        r2 = r2.f11505b;	 Catch:{ JSONException -> 0x0063 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0063 }
        goto L_0x0094;
    L_0x0063:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0094;
    L_0x0068:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r0 != r1) goto L_0x0094;
    L_0x006c:
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ JSONException -> 0x0094 }
        if (r0 != r1) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x0070:
        r0 = r3.f11442g;	 Catch:{ JSONException -> 0x0094 }
        r1 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0094 }
        r0 = r0.optJSONObject(r1);	 Catch:{ JSONException -> 0x0094 }
        if (r0 == 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x007e:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidID;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0094 }
        r1 = r0.has(r1);	 Catch:{ JSONException -> 0x0094 }
        if (r1 != 0) goto L_0x0094;	 Catch:{ JSONException -> 0x0094 }
    L_0x008a:
        r1 = io.branch.referral.Defines.Jsonkey.UnidentifiedDevice;	 Catch:{ JSONException -> 0x0094 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0094 }
        r2 = 1;	 Catch:{ JSONException -> 0x0094 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0094 }
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.u():void");
    }

    /* renamed from: v */
    private void mo3544v() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.m13175r();
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;
        if (r0 != r1) goto L_0x0034;
    L_0x0008:
        r0 = r3.f11442g;
        r1 = io.branch.referral.Defines.Jsonkey.UserData;
        r1 = r1.m13131a();
        r0 = r0.optJSONObject(r1);
        if (r0 == 0) goto L_0x0034;
    L_0x0016:
        r1 = io.branch.referral.Defines.Jsonkey.DeveloperIdentity;	 Catch:{ JSONException -> 0x0034 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0034 }
        r2 = r3.f11437b;	 Catch:{ JSONException -> 0x0034 }
        r2 = r2.m13388j();	 Catch:{ JSONException -> 0x0034 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0034 }
        r1 = io.branch.referral.Defines.Jsonkey.DeviceFingerprintID;	 Catch:{ JSONException -> 0x0034 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0034 }
        r2 = r3.f11437b;	 Catch:{ JSONException -> 0x0034 }
        r2 = r2.m13382g();	 Catch:{ JSONException -> 0x0034 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0034 }
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.v():void");
    }

    /* renamed from: w */
    private void mo3545w() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x007c }
        r0.<init>();	 Catch:{ JSONException -> 0x007c }
        r1 = r5.f11437b;	 Catch:{ JSONException -> 0x007c }
        r1 = r1.m13355H();	 Catch:{ JSONException -> 0x007c }
        r1 = r1.keys();	 Catch:{ JSONException -> 0x007c }
    L_0x000f:
        r2 = r1.hasNext();	 Catch:{ JSONException -> 0x007c }
        if (r2 == 0) goto L_0x0029;	 Catch:{ JSONException -> 0x007c }
    L_0x0015:
        r2 = r1.next();	 Catch:{ JSONException -> 0x007c }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x007c }
        r3 = r5.f11437b;	 Catch:{ JSONException -> 0x007c }
        r3 = r3.m13355H();	 Catch:{ JSONException -> 0x007c }
        r3 = r3.get(r2);	 Catch:{ JSONException -> 0x007c }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x007c }
        goto L_0x000f;	 Catch:{ JSONException -> 0x007c }
    L_0x0029:
        r1 = r5.f11442g;	 Catch:{ JSONException -> 0x007c }
        r2 = io.branch.referral.Defines.Jsonkey.Metadata;	 Catch:{ JSONException -> 0x007c }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x007c }
        r1 = r1.optJSONObject(r2);	 Catch:{ JSONException -> 0x007c }
        if (r1 == 0) goto L_0x004f;	 Catch:{ JSONException -> 0x007c }
    L_0x0037:
        r2 = r1.keys();	 Catch:{ JSONException -> 0x007c }
    L_0x003b:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x007c }
        if (r3 == 0) goto L_0x004f;	 Catch:{ JSONException -> 0x007c }
    L_0x0041:
        r3 = r2.next();	 Catch:{ JSONException -> 0x007c }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x007c }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x007c }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x007c }
        goto L_0x003b;	 Catch:{ JSONException -> 0x007c }
    L_0x004f:
        r1 = r5 instanceof io.branch.referral.C4730z;	 Catch:{ JSONException -> 0x007c }
        if (r1 == 0) goto L_0x0070;	 Catch:{ JSONException -> 0x007c }
    L_0x0053:
        r1 = r5.f11437b;	 Catch:{ JSONException -> 0x007c }
        r1 = r1.m13356I();	 Catch:{ JSONException -> 0x007c }
        r1 = r1.length();	 Catch:{ JSONException -> 0x007c }
        if (r1 <= 0) goto L_0x0070;	 Catch:{ JSONException -> 0x007c }
    L_0x005f:
        r1 = r5.f11442g;	 Catch:{ JSONException -> 0x007c }
        r2 = io.branch.referral.Defines.Jsonkey.InstallMetadata;	 Catch:{ JSONException -> 0x007c }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x007c }
        r3 = r5.f11437b;	 Catch:{ JSONException -> 0x007c }
        r3 = r3.m13356I();	 Catch:{ JSONException -> 0x007c }
        r1.putOpt(r2, r3);	 Catch:{ JSONException -> 0x007c }
    L_0x0070:
        r1 = r5.f11442g;	 Catch:{ JSONException -> 0x007c }
        r2 = io.branch.referral.Defines.Jsonkey.Metadata;	 Catch:{ JSONException -> 0x007c }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x007c }
        r1.put(r2, r0);	 Catch:{ JSONException -> 0x007c }
        goto L_0x0083;
    L_0x007c:
        r0 = "BranchSDK";
        r1 = "Could not merge metadata, ignoring user metadata.";
        android.util.Log.e(r0, r1);
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.w():void");
    }

    /* renamed from: x */
    private void mo3546x() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.m13175r();
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V1;
        if (r0 != r1) goto L_0x000b;
    L_0x0008:
        r0 = r3.f11442g;
        goto L_0x0017;
    L_0x000b:
        r0 = r3.f11442g;
        r1 = io.branch.referral.Defines.Jsonkey.UserData;
        r1 = r1.m13131a();
        r0 = r0.optJSONObject(r1);
    L_0x0017:
        if (r0 == 0) goto L_0x002e;
    L_0x0019:
        r1 = r3.f11437b;
        r1 = r1.m13348A();
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r2 = io.branch.referral.Defines.Jsonkey.limitFacebookTracking;	 Catch:{ JSONException -> 0x002e }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x002e }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ JSONException -> 0x002e }
        r0.putOpt(r2, r1);	 Catch:{ JSONException -> 0x002e }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.x():void");
    }

    /* renamed from: l */
    void m13169l() {
        mo3545w();
        if (mo3549e()) {
            mo3546x();
        }
    }

    /* renamed from: m */
    void m13170m() {
        if (this instanceof C4285t) {
            ((C4285t) this).mo3545w();
        }
        mo3544v();
        if (mo3541i() && !C2742i.m13287a(this.f11446k)) {
            mo3543u();
        }
    }

    /* renamed from: b */
    protected boolean m13159b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.INTERNET") == null ? true : null;
    }

    /* renamed from: n */
    public void m13171n() {
        this.f11438c = System.currentTimeMillis();
    }

    /* renamed from: o */
    public long m13172o() {
        if (this.f11438c > 0) {
            return System.currentTimeMillis() - this.f11438c;
        }
        return 0;
    }

    /* renamed from: a */
    public void m13152a(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.f11439d.add(process_wait_lock);
        }
    }

    /* renamed from: b */
    public void m13158b(PROCESS_WAIT_LOCK process_wait_lock) {
        this.f11439d.remove(process_wait_lock);
    }

    /* renamed from: p */
    public boolean m13173p() {
        return this.f11439d.size() > 0;
    }

    /* renamed from: a */
    protected void m13151a(android.content.Context r3, org.json.JSONObject r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r3 = m13144c(r3);	 Catch:{ Exception -> 0x0037 }
        if (r3 == 0) goto L_0x000d;	 Catch:{ Exception -> 0x0037 }
    L_0x0006:
        r3 = io.branch.referral.Defines.Jsonkey.NativeApp;	 Catch:{ Exception -> 0x0037 }
    L_0x0008:
        r3 = r3.m13131a();	 Catch:{ Exception -> 0x0037 }
        goto L_0x0010;	 Catch:{ Exception -> 0x0037 }
    L_0x000d:
        r3 = io.branch.referral.Defines.Jsonkey.InstantApp;	 Catch:{ Exception -> 0x0037 }
        goto L_0x0008;	 Catch:{ Exception -> 0x0037 }
    L_0x0010:
        r0 = r2.m13175r();	 Catch:{ Exception -> 0x0037 }
        r1 = io.branch.referral.ServerRequest.BRANCH_API_VERSION.V2;	 Catch:{ Exception -> 0x0037 }
        if (r0 != r1) goto L_0x002e;	 Catch:{ Exception -> 0x0037 }
    L_0x0018:
        r0 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.m13131a();	 Catch:{ Exception -> 0x0037 }
        r4 = r4.optJSONObject(r0);	 Catch:{ Exception -> 0x0037 }
        if (r4 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x0024:
        r0 = io.branch.referral.Defines.Jsonkey.Environment;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.m13131a();	 Catch:{ Exception -> 0x0037 }
        r4.put(r0, r3);	 Catch:{ Exception -> 0x0037 }
        goto L_0x0037;	 Catch:{ Exception -> 0x0037 }
    L_0x002e:
        r0 = io.branch.referral.Defines.Jsonkey.Environment;	 Catch:{ Exception -> 0x0037 }
        r0 = r0.m13131a();	 Catch:{ Exception -> 0x0037 }
        r4.put(r0, r3);	 Catch:{ Exception -> 0x0037 }
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.a(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: c */
    private static boolean m13144c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        context = packageManager.getLaunchIntentForPackage(context.getPackageName());
        boolean z = false;
        if (context == null) {
            return false;
        }
        context = packageManager.queryIntentActivities(context, 65536);
        if (context != null && context.size() > null) {
            z = true;
        }
        return z;
    }

    /* renamed from: r */
    public BRANCH_API_VERSION m13175r() {
        return BRANCH_API_VERSION.V1;
    }

    /* renamed from: s */
    public void m13176s() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Requested operation cannot be completed since tracking is disabled [");
        stringBuilder.append(this.f11436a);
        stringBuilder.append("]");
        C2754n.m13344b("BranchSDK", stringBuilder.toString());
        mo3535a(-117, "");
    }
}
