package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class sh extends zznl<Long> {
    sh(int i, String str, Long l) {
        super(i, str, l);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2171a(Editor editor, Object obj) {
        editor.putLong(m10885a(), ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2170a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m10885a(), ((Long) m10887b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2169a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m10885a(), ((Long) m10887b()).longValue()));
    }
}
