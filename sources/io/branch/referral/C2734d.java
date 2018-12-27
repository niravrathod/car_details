package io.branch.referral;

/* renamed from: io.branch.referral.d */
public class C2734d {
    /* renamed from: a */
    String f11515a = "";
    /* renamed from: b */
    int f11516b = -113;

    /* renamed from: a */
    public String m13253a() {
        return this.f11515a;
    }

    /* renamed from: b */
    public int m13254b() {
        return this.f11516b;
    }

    public String toString() {
        return m13253a();
    }

    public C2734d(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m13252a(i));
        this.f11515a = stringBuilder.toString();
    }

    /* renamed from: a */
    private String m13252a(int i) {
        if (i == -113) {
            this.f11516b = -113;
            return " Branch API Error: poor network connectivity. Please try again later.";
        } else if (i == -114) {
            this.f11516b = -114;
            return " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        } else if (i == -104) {
            this.f11516b = -104;
            return " Did you forget to call init? Make sure you init the session before making Branch calls.";
        } else if (i == -101) {
            this.f11516b = -101;
            return " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        } else if (i == -102) {
            this.f11516b = -102;
            return " Please add 'android.permission.INTERNET' in your applications manifest file.";
        } else if (i == -105) {
            this.f11516b = -105;
            return " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        } else if (i == -106) {
            this.f11516b = -106;
            return " That Branch referral code is already in use.";
        } else if (i == -107) {
            this.f11516b = -107;
            return " Unable to redeem rewards. Please make sure you have credits available to redeem.";
        } else if (i == -108) {
            this.f11516b = -108;
            return "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        } else if (i == -109) {
            this.f11516b = -109;
            return "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        } else if (i == -110) {
            this.f11516b = -110;
            return " Unable create share options. Couldn't find applications on device to share the link.";
        } else if (i == -111) {
            this.f11516b = -111;
            return " Request to Branch server timed out. Please check your internet connectivity";
        } else if (i == -117) {
            this.f11516b = -117;
            return " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        } else {
            if (i < 500) {
                if (i != -112) {
                    if (i != 409) {
                        if (i != -115) {
                            if (i < 400) {
                                if (i != -116) {
                                    this.f11516b = -113;
                                    return " Check network connectivity and that you properly initialized.";
                                }
                            }
                            this.f11516b = -116;
                            return " The request was invalid.";
                        }
                    }
                    this.f11516b = -115;
                    return " A resource with this identifier already exists.";
                }
            }
            this.f11516b = -112;
            return " Unable to reach the Branch servers, please try again shortly.";
        }
    }
}
