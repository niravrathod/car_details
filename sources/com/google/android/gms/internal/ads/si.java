package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class si extends zznl<Float> {
    si(int i, String str, Float f) {
        super(i, str, f);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2171a(Editor editor, Object obj) {
        editor.putFloat(m10885a(), ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2170a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m10885a(), (double) ((Float) m10887b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2169a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m10885a(), ((Float) m10887b()).floatValue()));
    }
}
