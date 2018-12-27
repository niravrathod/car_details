package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2703d;
import org.json.JSONObject;

/* renamed from: io.branch.referral.q */
class C4282q extends ServerRequest {
    /* renamed from: g */
    C2703d f17986g;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    public C4282q(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        if (this.f17986g != null) {
            this.f17986g.m13082a(abVar.m13214c(), null);
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17986g != null) {
            C2703d c2703d = this.f17986g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble retrieving user credit history. ");
            stringBuilder.append(str);
            c2703d.m13082a(null, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        if (this.f17986g != null) {
            this.f17986g.m13082a(null, new C2734d("Trouble retrieving user credit history.", -102));
        }
        return true;
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17986g = null;
    }
}
