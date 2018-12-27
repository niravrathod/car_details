package com.crashlytics.android.answers;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import io.fabric.sdk.android.services.p147b.C2777a;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.answers.v */
class C3563v implements C2777a<SessionEvent> {
    C3563v() {
    }

    /* renamed from: a */
    public byte[] m18067a(SessionEvent sessionEvent) {
        return m18069b(sessionEvent).toString().getBytes("UTF-8");
    }

    @TargetApi(9)
    /* renamed from: b */
    public JSONObject m18069b(SessionEvent sessionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1335u c1335u = sessionEvent.f4160a;
            jSONObject.put("appBundleId", c1335u.f4192a);
            jSONObject.put("executionId", c1335u.f4193b);
            jSONObject.put("installationId", c1335u.f4194c);
            jSONObject.put("limitAdTrackingEnabled", c1335u.f4195d);
            jSONObject.put("betaDeviceToken", c1335u.f4196e);
            jSONObject.put("buildId", c1335u.f4197f);
            jSONObject.put("osVersion", c1335u.f4198g);
            jSONObject.put("deviceModel", c1335u.f4199h);
            jSONObject.put("appVersionCode", c1335u.f4200i);
            jSONObject.put("appVersionName", c1335u.f4201j);
            jSONObject.put("timestamp", sessionEvent.f4161b);
            jSONObject.put("type", sessionEvent.f4162c.toString());
            if (sessionEvent.f4163d != null) {
                jSONObject.put("details", new JSONObject(sessionEvent.f4163d));
            }
            jSONObject.put("customType", sessionEvent.f4164e);
            if (sessionEvent.f4165f != null) {
                jSONObject.put("customAttributes", new JSONObject(sessionEvent.f4165f));
            }
            jSONObject.put("predefinedType", sessionEvent.f4166g);
            if (sessionEvent.f4167h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(sessionEvent.f4167h));
            }
            return jSONObject;
        } catch (SessionEvent sessionEvent2) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(sessionEvent2.getMessage(), sessionEvent2);
            }
            throw new IOException(sessionEvent2.getMessage());
        }
    }
}
