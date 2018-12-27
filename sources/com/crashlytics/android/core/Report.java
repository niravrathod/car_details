package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

interface Report {

    public enum Type {
        JAVA,
        NATIVE
    }

    /* renamed from: a */
    String mo1129a();

    /* renamed from: b */
    String mo1130b();

    /* renamed from: c */
    File mo1131c();

    /* renamed from: d */
    File[] mo1132d();

    /* renamed from: e */
    Map<String, String> mo1133e();

    /* renamed from: f */
    void mo1134f();

    /* renamed from: g */
    Type mo1135g();
}
