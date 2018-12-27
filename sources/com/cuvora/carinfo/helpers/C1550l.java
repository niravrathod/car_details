package com.cuvora.carinfo.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.C4455c.C0661a;
import com.cuvora.carinfo.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.List;

/* renamed from: com.cuvora.carinfo.helpers.l */
public class C1550l {
    /* renamed from: a */
    public static void m5920a(final Activity activity) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        int i = defaultSharedPreferences.getInt("KEY_LOCATION_PERMISSION_DENIAL_COUNT", -1);
        defaultSharedPreferences.edit().putInt("KEY_LOCATION_PERMISSION_DENIAL_COUNT", i + 1).apply();
        if (i % C1541e.m5855b("locationPermissionRetry").intValue() == 0) {
            if (Dexter.isRequestOngoing()) {
                Dexter.continuePendingRequestIfPossible(new PermissionListener() {
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                    }

                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                        C1550l.m5923b(activity);
                    }

                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        if (activity.isFinishing() == null) {
                            permissionToken.continuePermissionRequest();
                        }
                    }
                });
            } else {
                Dexter.checkPermissions(new MultiplePermissionsListener() {
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if (multiplePermissionsReport.areAllPermissionsGranted() == null) {
                            C1550l.m5923b(activity);
                        } else {
                            C1540d.m5816b(activity);
                        }
                    }

                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                        if (activity.isFinishing() == null) {
                            permissionToken.continuePermissionRequest();
                        }
                    }
                }, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
            }
        }
    }

    /* renamed from: b */
    private static void m5923b(final Context context) {
        C0661a c0661a = new C0661a(context);
        c0661a.m2639a((CharSequence) "Location Permission Required");
        c0661a.m2643b(context.getString(R.string.location_permission_text));
        c0661a.m2640a((CharSequence) "Let's do this!", new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (((Activity) context).isFinishing() == 0) {
                    i = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null));
                    i.addFlags(268435456);
                    ((Activity) context).startActivityForResult(i, 100);
                    dialogInterface.dismiss();
                }
            }
        });
        c0661a.m2644b("Later", -$$Lambda$l$VawcdrRDpPp8wRZt0rnC0njhB5U.INSTANCE);
        c0661a.m2641a(true).m2646c();
    }
}
