package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.s */
class C4284s extends ServerRequest {
    /* renamed from: g */
    C2704f f17988g;
    /* renamed from: h */
    String f17989h = null;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: c */
    public boolean mo3540c() {
        return true;
    }

    public C4284s(Context context, C2704f c2704f, String str) {
        super(context, RequestPath.IdentifyUser.m13133a());
        this.f17988g = c2704f;
        this.f17989h = str;
        context = new JSONObject();
        try {
            context.put(Jsonkey.IdentityID.m13131a(), this.b.m13386i());
            context.put(Jsonkey.DeviceFingerprintID.m13131a(), this.b.m13382g());
            context.put(Jsonkey.SessionID.m13131a(), this.b.m13384h());
            if (this.b.m13390k().equals("bnc_no_value") == null) {
                context.put(Jsonkey.LinkClickID.m13131a(), this.b.m13390k());
            }
            context.put(Jsonkey.Identity.m13131a(), str);
            mo3548a((JSONObject) context);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    public C4284s(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        try {
            if (m13165h() != null && m13165h().has(Jsonkey.Identity.m13131a())) {
                this.b.m13381f(m13165h().getString(Jsonkey.Identity.m13131a()));
            }
            this.b.m13378e(abVar.m13213b().getString(Jsonkey.IdentityID.m13131a()));
            this.b.m13405r(abVar.m13213b().getString(Jsonkey.Link.m13131a()));
            if (abVar.m13213b().has(Jsonkey.ReferringData.m13131a())) {
                this.b.m13401p(abVar.m13213b().getString(Jsonkey.ReferringData.m13131a()));
            }
            if (this.f17988g != null) {
                this.f17988g.mo1161a(branch.m23467h(), null);
            }
        } catch (ab abVar2) {
            abVar2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17988g != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C2704f c2704f = this.f17988g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble setting the user alias. ");
            stringBuilder.append(str);
            c2704f.mo1161a(jSONObject, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo3538a(android.content.Context r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r6 = super.m13159b(r6);
        r0 = 1;
        if (r6 != 0) goto L_0x001b;
    L_0x0007:
        r6 = r5.f17988g;
        if (r6 == 0) goto L_0x001a;
    L_0x000b:
        r6 = r5.f17988g;
        r1 = 0;
        r2 = new io.branch.referral.d;
        r3 = "Trouble setting the user alias.";
        r4 = -102; // 0xffffffffffffff9a float:NaN double:NaN;
        r2.<init>(r3, r4);
        r6.mo1161a(r1, r2);
    L_0x001a:
        return r0;
    L_0x001b:
        r6 = r5.m13165h();	 Catch:{ JSONException -> 0x0041 }
        r1 = io.branch.referral.Defines.Jsonkey.Identity;	 Catch:{ JSONException -> 0x0041 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0041 }
        r6 = r6.getString(r1);	 Catch:{ JSONException -> 0x0041 }
        if (r6 == 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0041 }
    L_0x002b:
        r1 = r6.length();	 Catch:{ JSONException -> 0x0041 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ JSONException -> 0x0041 }
    L_0x0031:
        r1 = r5.b;	 Catch:{ JSONException -> 0x0041 }
        r1 = r1.m13388j();	 Catch:{ JSONException -> 0x0041 }
        r6 = r6.equals(r1);	 Catch:{ JSONException -> 0x0041 }
        if (r6 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r6 = 0;
        return r6;
    L_0x0040:
        return r0;
    L_0x0041:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.s.a(android.content.Context):boolean");
    }

    /* renamed from: u */
    public boolean mo3543u() {
        boolean z = false;
        try {
            String string = m13165h().getString(Jsonkey.Identity.m13131a());
            if (string != null && string.equals(this.b.m13388j())) {
                z = true;
            }
            return z;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void m23525a(Branch branch) {
        if (this.f17988g != null) {
            this.f17988g.mo1161a(branch.m23467h(), null);
        }
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17988g = null;
    }
}
