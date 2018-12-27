package com.cuvora.carinfo.helpers;

import android.app.Activity;
import android.app.ProgressDialog;

/* renamed from: com.cuvora.carinfo.helpers.m */
public class C1551m {
    /* renamed from: a */
    private static ProgressDialog f4688a;

    /* renamed from: a */
    public static ProgressDialog m5924a(Activity activity) {
        return C1551m.m5925a(activity, null, "Please wait...");
    }

    /* renamed from: a */
    public static ProgressDialog m5925a(Activity activity, String str, String str2) {
        if (f4688a == null || !f4688a.isShowing()) {
            f4688a = ProgressDialog.show(activity, str, str2, true);
            f4688a.setCancelable(true);
        }
        return f4688a;
    }

    /* renamed from: b */
    public static void m5926b(Activity activity) {
        if (f4688a != null && f4688a.isShowing() && activity != null && !activity.isFinishing() && activity.isChangingConfigurations() == null) {
            try {
                f4688a.dismiss();
            } catch (Activity activity2) {
                activity2.printStackTrace();
            }
            f4688a = null;
        }
    }
}
