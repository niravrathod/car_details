package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2705g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.r */
class C4283r extends ServerRequest {
    /* renamed from: g */
    C2705g f17987g;

    /* renamed from: a */
    public boolean mo3537a() {
        return true;
    }

    public C4283r(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: g */
    public String mo3547g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.mo3547g());
        stringBuilder.append(this.b.m13386i());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        branch = abVar.m13213b().keys();
        boolean z = false;
        while (branch.hasNext()) {
            String str = (String) branch.next();
            try {
                int i = abVar.m13213b().getInt(str);
                if (i != this.b.m13406s(str)) {
                    z = true;
                }
                this.b.m13362a(str, i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f17987g != null) {
            this.f17987g.m13084a(z, null);
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17987g != null) {
            C2705g c2705g = this.f17987g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble retrieving user credits. ");
            stringBuilder.append(str);
            c2705g.m13084a(false, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return false;
        }
        if (this.f17987g != null) {
            this.f17987g.m13084a(false, new C2734d("Trouble retrieving user credits.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17987g = null;
    }
}
