package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.referral.Branch.C2708k;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONObject;

/* renamed from: io.branch.referral.u */
class C4286u extends ServerRequest {
    /* renamed from: g */
    private C2708k f17993g;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: d */
    boolean mo3542d() {
        return false;
    }

    public C4286u(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        try {
            this.b.m13376d(abVar.m13213b().getString(Jsonkey.SessionID.m13131a()));
            this.b.m13378e(abVar.m13213b().getString(Jsonkey.IdentityID.m13131a()));
            this.b.m13405r(abVar.m13213b().getString(Jsonkey.Link.m13131a()));
            this.b.m13401p("bnc_no_value");
            this.b.m13399o("bnc_no_value");
            this.b.m13381f("bnc_no_value");
            this.b.m13349B();
            if (this.f17993g == null) {
            }
        } catch (ab abVar2) {
            abVar2.printStackTrace();
        } finally {
            if (this.f17993g != null) {
                this.f17993g.m13088a(true, null);
            }
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17993g != null) {
            C2708k c2708k = this.f17993g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Logout error. ");
            stringBuilder.append(str);
            c2708k.m13088a(false, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return false;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        if (this.f17993g != null) {
            this.f17993g.m13088a(false, new C2734d("Logout failed", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17993g = null;
    }
}
