package io.branch.referral;

import android.content.Context;
import io.branch.referral.Branch.C2705g;
import io.branch.referral.Defines.Jsonkey;
import org.json.JSONObject;

/* renamed from: io.branch.referral.x */
class C4288x extends ServerRequest {
    /* renamed from: g */
    C2705g f17994g;
    /* renamed from: h */
    int f17995h = null;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    public C4288x(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) == null) {
            if (this.f17994g != null) {
                this.f17994g.m13084a(false, new C2734d("Trouble redeeming rewards.", -102));
            }
            return true;
        } else if (this.f17995h > null) {
            return false;
        } else {
            if (this.f17994g != null) {
                this.f17994g.m13084a(false, new C2734d("Trouble redeeming rewards.", -107));
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        abVar = m13165h();
        branch = null;
        if (abVar != null && abVar.has(Jsonkey.Bucket.m13131a()) && abVar.has(Jsonkey.Amount.m13131a())) {
            try {
                int i = abVar.getInt(Jsonkey.Amount.m13131a());
                String string = abVar.getString(Jsonkey.Bucket.m13131a());
                if (i > 0) {
                    branch = true;
                }
                this.b.m13362a(string, this.b.m13406s(string) - i);
            } catch (ab abVar2) {
                abVar2.printStackTrace();
            }
        }
        if (this.f17994g != null) {
            if (branch != null) {
                abVar2 = null;
            } else {
                abVar2 = new C2734d("Trouble redeeming rewards.", -107);
            }
            this.f17994g.m13084a(branch, abVar2);
        }
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17994g != null) {
            C2705g c2705g = this.f17994g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble redeeming rewards. ");
            stringBuilder.append(str);
            c2705g.m13084a(false, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17994g = null;
    }
}
