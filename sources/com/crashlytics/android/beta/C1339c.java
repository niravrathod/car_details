package com.crashlytics.android.beta;

import java.io.InputStream;
import java.util.Properties;

/* renamed from: com.crashlytics.android.beta.c */
class C1339c {
    /* renamed from: a */
    public final String f4208a;
    /* renamed from: b */
    public final String f4209b;
    /* renamed from: c */
    public final String f4210c;
    /* renamed from: d */
    public final String f4211d;

    C1339c(String str, String str2, String str3, String str4) {
        this.f4208a = str;
        this.f4209b = str2;
        this.f4210c = str3;
        this.f4211d = str4;
    }

    /* renamed from: a */
    public static C1339c m5388a(Properties properties) {
        return new C1339c(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
    }

    /* renamed from: a */
    public static C1339c m5387a(InputStream inputStream) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return C1339c.m5388a(properties);
    }
}
