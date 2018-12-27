package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@zzaer
public final class zzabn {
    /* renamed from: a */
    private final boolean f8491a;
    /* renamed from: b */
    private final boolean f8492b;
    /* renamed from: c */
    private final boolean f8493c;
    /* renamed from: d */
    private final boolean f8494d;
    /* renamed from: e */
    private final boolean f8495e;

    private zzabn(zzabp zzabp) {
        this.f8491a = zzabp.f8496a;
        this.f8492b = zzabp.f8497b;
        this.f8493c = zzabp.f8498c;
        this.f8494d = zzabp.f8499d;
        this.f8495e = zzabp.f8500e;
    }

    /* renamed from: a */
    public final JSONObject m9432a() {
        try {
            return new JSONObject().put("sms", this.f8491a).put("tel", this.f8492b).put("calendar", this.f8493c).put("storePicture", this.f8494d).put("inlineVideo", this.f8495e);
        } catch (Throwable e) {
            zzaok.m10002b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
