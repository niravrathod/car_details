package com.crashlytics.android.beta;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.beta.f */
class C1341f {
    C1341f() {
    }

    /* renamed from: a */
    public C1340e m5389a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C1340e(jSONObject.optString(ImagesContract.URL, null), jSONObject.optString("version_string", null), jSONObject.optString("display_version", null), jSONObject.optString("build_version", null), jSONObject.optString("identifier", null), jSONObject.optString("instance_identifier", null));
    }
}
