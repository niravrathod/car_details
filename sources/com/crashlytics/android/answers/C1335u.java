package com.crashlytics.android.answers;

/* renamed from: com.crashlytics.android.answers.u */
final class C1335u {
    /* renamed from: a */
    public final String f4192a;
    /* renamed from: b */
    public final String f4193b;
    /* renamed from: c */
    public final String f4194c;
    /* renamed from: d */
    public final Boolean f4195d;
    /* renamed from: e */
    public final String f4196e;
    /* renamed from: f */
    public final String f4197f;
    /* renamed from: g */
    public final String f4198g;
    /* renamed from: h */
    public final String f4199h;
    /* renamed from: i */
    public final String f4200i;
    /* renamed from: j */
    public final String f4201j;
    /* renamed from: k */
    private String f4202k;

    public C1335u(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f4192a = str;
        this.f4193b = str2;
        this.f4194c = str3;
        this.f4195d = bool;
        this.f4196e = str4;
        this.f4197f = str5;
        this.f4198g = str6;
        this.f4199h = str7;
        this.f4200i = str8;
        this.f4201j = str9;
    }

    public String toString() {
        if (this.f4202k == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("appBundleId=");
            stringBuilder.append(this.f4192a);
            stringBuilder.append(", executionId=");
            stringBuilder.append(this.f4193b);
            stringBuilder.append(", installationId=");
            stringBuilder.append(this.f4194c);
            stringBuilder.append(", limitAdTrackingEnabled=");
            stringBuilder.append(this.f4195d);
            stringBuilder.append(", betaDeviceToken=");
            stringBuilder.append(this.f4196e);
            stringBuilder.append(", buildId=");
            stringBuilder.append(this.f4197f);
            stringBuilder.append(", osVersion=");
            stringBuilder.append(this.f4198g);
            stringBuilder.append(", deviceModel=");
            stringBuilder.append(this.f4199h);
            stringBuilder.append(", appVersionCode=");
            stringBuilder.append(this.f4200i);
            stringBuilder.append(", appVersionName=");
            stringBuilder.append(this.f4201j);
            this.f4202k = stringBuilder.toString();
        }
        return this.f4202k;
    }
}
