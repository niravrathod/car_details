package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
public final class zzanj {
    /* renamed from: a */
    private static final zzanl<Map<String, ?>> f8920a = new ec();

    /* renamed from: a */
    public static List<String> m9923a(JSONArray jSONArray, List<String> list) {
        list = new ArrayList();
        if (jSONArray == null) {
            return list;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    public static JSONObject m9924a(JSONObject jSONObject, String... strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                jSONObject = null;
                break;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(strArr[strArr.length - 1]);
    }
}
