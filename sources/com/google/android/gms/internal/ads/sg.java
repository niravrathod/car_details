package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class sg extends zznl<Integer> {
    sg(int i, String str, Integer num) {
        super(i, str, num);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2171a(Editor editor, Object obj) {
        editor.putInt(m10885a(), ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2170a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m10885a(), ((Integer) m10887b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2169a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m10885a(), ((Integer) m10887b()).intValue()));
    }
}
