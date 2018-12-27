package io.branch.referral;

import android.content.Context;

/* renamed from: io.branch.referral.v */
public class C4287v extends ServerRequest {
    /* renamed from: a */
    public void mo3535a(int i, String str) {
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
    }

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: b */
    public void mo3539b() {
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        C2754n.m13344b("BranchSDK", "Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        return true;
    }
}
