package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONException;
import org.json.JSONObject;

class aa extends C4285t {
    /* renamed from: h */
    C2704f f20783h;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: v */
    public String mo3544v() {
        return "open";
    }

    aa(Context context, C2704f c2704f, ac acVar) {
        super(context, RequestPath.RegisterOpen.m13133a(), acVar);
        this.f20783h = c2704f;
        context = new JSONObject();
        try {
            context.put(Jsonkey.DeviceFingerprintID.m13131a(), this.b.m13382g());
            context.put(Jsonkey.IdentityID.m13131a(), this.b.m13386i());
            mo3548a((JSONObject) context);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    aa(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: q */
    public void mo3550q() {
        super.mo3550q();
        if (Branch.m23406b().f17938i) {
            this.f20783h.mo1161a(Branch.m23406b().m23468i(), null);
            Branch.m23406b().m23453a(Jsonkey.InstantDeepLinkSession.m13131a(), "true");
            Branch.m23406b().f17938i = false;
            Branch.m23406b().f17936g = true;
        }
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        super.mo3536a(abVar, branch);
        try {
            if (abVar.m13213b().has(Jsonkey.LinkClickID.m13131a())) {
                this.b.m13383g(abVar.m13213b().getString(Jsonkey.LinkClickID.m13131a()));
            } else {
                this.b.m13383g("bnc_no_value");
            }
            if (abVar.m13213b().has(Jsonkey.Data.m13131a())) {
                JSONObject jSONObject = new JSONObject(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
                if (jSONObject.has(Jsonkey.Clicked_Branch_Link.m13131a()) && jSONObject.getBoolean(Jsonkey.Clicked_Branch_Link.m13131a()) && this.b.m13412v().equals("bnc_no_value") && this.b.m13416x() == 1) {
                    this.b.m13401p(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
                }
            }
            if (abVar.m13213b().has(Jsonkey.Data.m13131a())) {
                this.b.m13399o(abVar.m13213b().getString(Jsonkey.Data.m13131a()));
            } else {
                this.b.m13399o("bnc_no_value");
            }
            if (!(this.f20783h == null || branch.f17936g)) {
                this.f20783h.mo1161a(branch.m23468i(), null);
            }
            this.b.m13361a(this.g.m13228c());
        } catch (Exception e) {
            e.printStackTrace();
        }
        m23537b(abVar, branch);
    }

    /* renamed from: a */
    void m27429a(C2704f c2704f) {
        if (c2704f != null) {
            this.f20783h = c2704f;
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f20783h != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C2704f c2704f = this.f20783h;
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
        if (this.f20783h != null) {
            this.f20783h.mo1161a(null, new C2734d("Trouble initializing Branch.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f20783h = null;
    }

    /* renamed from: u */
    public boolean mo3543u() {
        return this.f20783h != null;
    }
}
