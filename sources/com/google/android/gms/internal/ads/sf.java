package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class sf extends zznl<Boolean> {
    sf(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2171a(Editor editor, Object obj) {
        editor.putBoolean(m10885a(), ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2170a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m10885a(), ((Boolean) m10887b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2169a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m10885a(), ((Boolean) m10887b()).booleanValue()));
    }
}
