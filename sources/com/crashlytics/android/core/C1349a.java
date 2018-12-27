package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;

/* renamed from: com.crashlytics.android.core.a */
class C1349a {
    /* renamed from: a */
    public final String f4231a;
    /* renamed from: b */
    public final String f4232b;
    /* renamed from: c */
    public final String f4233c;
    /* renamed from: d */
    public final String f4234d;
    /* renamed from: e */
    public final String f4235e;
    /* renamed from: f */
    public final String f4236f;

    /* renamed from: a */
    public static C1349a m5458a(Context context, IdManager idManager, String str, String str2) {
        String packageName = context.getPackageName();
        String i = idManager.m13656i();
        context = context.getPackageManager().getPackageInfo(packageName, null);
        return new C1349a(str, str2, i, packageName, Integer.toString(context.versionCode), context.versionName == null ? "0.0" : context.versionName);
    }

    C1349a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4231a = str;
        this.f4232b = str2;
        this.f4233c = str3;
        this.f4234d = str4;
        this.f4235e = str5;
        this.f4236f = str6;
    }
}
