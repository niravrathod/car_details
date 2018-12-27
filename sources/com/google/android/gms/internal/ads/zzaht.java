package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

@zzaer
public final class zzaht extends ContextWrapper {
    /* renamed from: a */
    public final synchronized void m9575a(String str) {
        throw new NoSuchMethodError();
    }

    public final Context getApplicationContext() {
        throw new NoSuchMethodError();
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageName() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageResourcePath() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final synchronized void m9574a(Activity activity) {
        throw new NoSuchMethodError();
    }

    public final synchronized void startActivity(Intent intent) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m9573a(Context context) {
        if (context instanceof zzaht) {
            return ((zzaht) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
