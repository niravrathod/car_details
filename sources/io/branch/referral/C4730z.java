package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.z */
class C4730z extends C4285t {
    /* renamed from: h */
    C2704f f20784h;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: v */
    public String mo3544v() {
        return "install";
    }

    C4730z(Context context, C2704f c2704f, ac acVar, String str) {
        super(context, RequestPath.RegisterInstall.m13133a(), acVar);
        this.f20784h = c2704f;
        context = new JSONObject();
        try {
            if (str.equals("bnc_no_value") == null) {
                context.put(Jsonkey.LinkClickID.m13131a(), str);
            }
            mo3548a((JSONObject) context);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    public C4730z(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
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
        r8 = this;
        super.mo3550q();
        r0 = r8.b;
        r1 = "bnc_referrer_click_ts";
        r0 = r0.m13410u(r1);
        r2 = r8.b;
        r3 = "bnc_install_begin_ts";
        r2 = r2.m13410u(r3);
        r4 = 0;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0026;
    L_0x0019:
        r6 = r8.m13165h();	 Catch:{ JSONException -> 0x0037 }
        r7 = io.branch.referral.Defines.Jsonkey.ClickedReferrerTimeStamp;	 Catch:{ JSONException -> 0x0037 }
        r7 = r7.m13131a();	 Catch:{ JSONException -> 0x0037 }
        r6.put(r7, r0);	 Catch:{ JSONException -> 0x0037 }
    L_0x0026:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ JSONException -> 0x0037 }
        if (r0 <= 0) goto L_0x0037;	 Catch:{ JSONException -> 0x0037 }
    L_0x002a:
        r0 = r8.m13165h();	 Catch:{ JSONException -> 0x0037 }
        r1 = io.branch.referral.Defines.Jsonkey.InstallBeginTimeStamp;	 Catch:{ JSONException -> 0x0037 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0037 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0037 }
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.z.q():void");
    }

    /* renamed from: u */
    public boolean mo3543u() {
        return this.f20784h != null;
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        super.mo3536a(abVar, branch);
        try {
            this.b.m13405r(abVar.m13213b().getString(Jsonkey.Link.m13131a()));
            if (abVar.m13213b().has(Jsonkey.Data.m13131a())) {
                JSONObject jSONObject = new JSONObject(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
                if (jSONObject.has(Jsonkey.Clicked_Branch_Link.m13131a()) && jSONObject.getBoolean(Jsonkey.Clicked_Branch_Link.m13131a()) && this.b.m13412v().equals("bnc_no_value") && this.b.m13416x() == 1) {
                    this.b.m13401p(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
                }
            }
            if (abVar.m13213b().has(Jsonkey.LinkClickID.m13131a())) {
                this.b.m13383g(abVar.m13213b().getString(Jsonkey.LinkClickID.m13131a()));
            } else {
                this.b.m13383g("bnc_no_value");
            }
            if (abVar.m13213b().has(Jsonkey.Data.m13131a())) {
                this.b.m13399o(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
            } else {
                this.b.m13399o("bnc_no_value");
            }
            if (!(this.f20784h == null || branch.f17936g)) {
                this.f20784h.mo1161a(branch.m23468i(), null);
            }
            this.b.m13361a(this.g.m13228c());
        } catch (Exception e) {
            e.printStackTrace();
        }
        m23537b(abVar, branch);
    }

    /* renamed from: a */
    public void m27438a(C2704f c2704f) {
        if (c2704f != null) {
            this.f20784h = c2704f;
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f20784h != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C2704f c2704f = this.f20784h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble initializing Branch. ");
            stringBuilder.append(str);
            c2704f.mo1161a(jSONObject, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        if (this.f20784h != null) {
            this.f20784h.mo1161a(null, new C2734d("Trouble initializing Branch.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f20784h = null;
    }
}
