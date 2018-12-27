package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.referral.C2748j.C2746b;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import org.json.JSONObject;

/* renamed from: io.branch.referral.o */
class C4280o extends ServerRequest {
    /* renamed from: g */
    private final C2746b f17980g;

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

    /* renamed from: c */
    public boolean mo3540c() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3541i() {
        return true;
    }

    public C4280o(Context context, String str, JSONObject jSONObject, C2746b c2746b) {
        super(context, RequestPath.CompletedAction.m13133a());
        this.f17980g = c2746b;
        c2746b = new JSONObject();
        try {
            c2746b.put(Jsonkey.IdentityID.m13131a(), this.b.m13386i());
            c2746b.put(Jsonkey.DeviceFingerprintID.m13131a(), this.b.m13382g());
            c2746b.put(Jsonkey.SessionID.m13131a(), this.b.m13384h());
            if (!this.b.m13390k().equals("bnc_no_value")) {
                c2746b.put(Jsonkey.LinkClickID.m13131a(), this.b.m13390k());
            }
            c2746b.put(Jsonkey.Event.m13131a(), str);
            if (jSONObject != null) {
                c2746b.put(Jsonkey.Metadata.m13131a(), jSONObject);
            }
            m13151a(context, (JSONObject) c2746b);
            mo3548a((JSONObject) c2746b);
        } catch (Context context2) {
            context2.printStackTrace();
            this.e = true;
        }
        if (str != null && str.equalsIgnoreCase("purchase") != null) {
            Log.e("BranchSDK", "Warning: You are sending a purchase event with our non-dedicated purchase function. Please see function sendCommerceEvent");
        }
    }

    public C4280o(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f17980g = null;
    }

    /* renamed from: a */
    public void mo3536a(io.branch.referral.ab r4, io.branch.referral.Branch r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r5 = r4.m13213b();
        if (r5 == 0) goto L_0x0083;
    L_0x0006:
        r5 = r4.m13213b();
        r0 = io.branch.referral.Defines.Jsonkey.BranchViewData;
        r0 = r0.m13131a();
        r5 = r5.has(r0);
        if (r5 == 0) goto L_0x0083;
    L_0x0016:
        r5 = io.branch.referral.Branch.m23406b();
        r5 = r5.f17935f;
        if (r5 == 0) goto L_0x0083;
    L_0x001e:
        r5 = io.branch.referral.Branch.m23406b();
        r5 = r5.f17935f;
        r5 = r5.get();
        if (r5 == 0) goto L_0x0083;
    L_0x002a:
        r5 = "";
        r0 = r3.m13165h();	 Catch:{ JSONException -> 0x0075 }
        if (r0 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0075 }
    L_0x0032:
        r1 = io.branch.referral.Defines.Jsonkey.Event;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0075 }
        r1 = r0.has(r1);	 Catch:{ JSONException -> 0x0075 }
        if (r1 == 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0075 }
    L_0x003e:
        r1 = io.branch.referral.Defines.Jsonkey.Event;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x0075 }
        r5 = r0;	 Catch:{ JSONException -> 0x0075 }
    L_0x0049:
        r0 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.f17935f;	 Catch:{ JSONException -> 0x0075 }
        if (r0 == 0) goto L_0x0083;	 Catch:{ JSONException -> 0x0075 }
    L_0x0051:
        r0 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.f17935f;	 Catch:{ JSONException -> 0x0075 }
        r0 = r0.get();	 Catch:{ JSONException -> 0x0075 }
        r0 = (android.app.Activity) r0;	 Catch:{ JSONException -> 0x0075 }
        r4 = r4.m13213b();	 Catch:{ JSONException -> 0x0075 }
        r1 = io.branch.referral.Defines.Jsonkey.BranchViewData;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0075 }
        r4 = r4.getJSONObject(r1);	 Catch:{ JSONException -> 0x0075 }
        r1 = io.branch.referral.C2748j.m13306a();	 Catch:{ JSONException -> 0x0075 }
        r2 = r3.f17980g;	 Catch:{ JSONException -> 0x0075 }
        r1.m13322a(r4, r5, r0, r2);	 Catch:{ JSONException -> 0x0075 }
        goto L_0x0083;
        r4 = r3.f17980g;
        if (r4 == 0) goto L_0x0083;
    L_0x007a:
        r4 = r3.f17980g;
        r0 = -201; // 0xffffffffffffff37 float:NaN double:NaN;
        r1 = "Unable to show branch view. Branch view received is invalid ";
        r4.mo3526a(r0, r1, r5);
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.o.a(io.branch.referral.ab, io.branch.referral.Branch):void");
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        Log.i("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        return true;
    }
}
