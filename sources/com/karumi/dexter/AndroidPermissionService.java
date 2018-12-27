package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.C3104a;
import android.support.v4.content.C0389b;

class AndroidPermissionService {
    AndroidPermissionService() {
    }

    int checkSelfPermission(Context context, String str) {
        return C0389b.m1435b(context, str);
    }

    void requestPermissions(Activity activity, String[] strArr, int i) {
        C3104a.m15337a(activity, strArr, i);
    }

    boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return C3104a.m15338a(activity, str);
    }
}
