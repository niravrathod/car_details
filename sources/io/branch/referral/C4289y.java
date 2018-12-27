package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.indexing.C2697a;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONObject;

/* renamed from: io.branch.referral.y */
class C4289y extends ServerRequest {
    /* renamed from: a */
    public void mo3535a(int i, String str) {
    }

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: b */
    public void mo3539b() {
    }

    /* renamed from: d */
    boolean mo3542d() {
        return false;
    }

    public C4289y(Context context) {
        super(context, RequestPath.RegisterClose.m13133a());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Jsonkey.DeviceFingerprintID.m13131a(), this.b.m13382g());
            jSONObject.put(Jsonkey.IdentityID.m13131a(), this.b.m13386i());
            jSONObject.put(Jsonkey.SessionID.m13131a(), this.b.m13384h());
            if (!this.b.m13390k().equals("bnc_no_value")) {
                jSONObject.put(Jsonkey.LinkClickID.m13131a(), this.b.m13390k());
            }
            context = C2697a.m13035a().m13058a(context);
            if (context != null) {
                jSONObject.put(Jsonkey.ContentDiscovery.m13131a(), context);
            }
            if (C2752l.m13326a() != null) {
                jSONObject.put(Jsonkey.AppVersion.m13131a(), C2752l.m13326a().m13331b());
            }
            mo3548a(jSONObject);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
    }

    public C4289y(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        return true;
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        this.b.m13399o("bnc_no_value");
    }
}
