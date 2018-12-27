package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class sj extends zznl<String> {
    sj(int i, String str, String str2) {
        super(i, str, str2);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2171a(Editor editor, Object obj) {
        editor.putString(m10885a(), (String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2170a(JSONObject jSONObject) {
        return jSONObject.optString(m10885a(), (String) m10887b());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2169a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m10885a(), (String) m10887b());
    }
}
