package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.internal.p081a.C1714d;
import com.facebook.ads.internal.p081a.C1716e;
import com.facebook.ads.internal.p081a.C1716e.C1715a;
import com.facebook.ads.internal.p091j.C1814c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.z */
public class C3791z implements C1715a {
    /* renamed from: a */
    private final String f15183a;
    /* renamed from: b */
    private final String f15184b;
    /* renamed from: c */
    private final C1714d f15185c;
    /* renamed from: d */
    private final Collection<String> f15186d;
    /* renamed from: e */
    private final Map<String, String> f15187e;
    /* renamed from: f */
    private final String f15188f;
    /* renamed from: g */
    private final int f15189g;
    /* renamed from: h */
    private final int f15190h;
    /* renamed from: i */
    private final int f15191i;
    /* renamed from: j */
    private final String f15192j;

    private C3791z(String str, String str2, C1714d c1714d, Collection<String> collection, Map<String, String> map, String str3, int i, int i2, int i3, String str4) {
        this.f15183a = str;
        this.f15184b = str2;
        this.f15185c = c1714d;
        this.f15186d = collection;
        this.f15187e = map;
        this.f15188f = str3;
        this.f15189g = i;
        this.f15190h = i2;
        this.f15191i = i3;
        this.f15192j = str4;
    }

    /* renamed from: a */
    public static C3791z m18949a(Bundle bundle) {
        return new C3791z(C1814c.m6825a(bundle.getByteArray("markup")), null, C1714d.NONE, null, null, bundle.getString("request_id"), bundle.getInt("viewability_check_initial_delay"), bundle.getInt("viewability_check_interval"), bundle.getInt("skip_after_seconds", 0), bundle.getString("ct"));
    }

    /* renamed from: a */
    public static C3791z m18950a(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("markup");
        String optString2 = jSONObject.optString("activation_command");
        String optString3 = jSONObject.optString("request_id");
        String a = C1921k.m7294a(jSONObject, "ct");
        C1714d a2 = C1714d.m6464a(jSONObject.optString("invalidation_behavior"));
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Collection a3 = C1716e.m6468a(jSONArray);
        jSONObject = jSONObject.optJSONObject("metadata");
        Map hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.optString(str));
            }
        }
        return new C3791z(optString, optString2, a2, a3, hashMap, optString3, hashMap.containsKey("viewability_check_initial_delay") ? Integer.parseInt((String) hashMap.get("viewability_check_initial_delay")) : 0, hashMap.containsKey("viewability_check_interval") ? Integer.parseInt((String) hashMap.get("viewability_check_interval")) : 1000, hashMap.containsKey("skip_after_seconds") ? Integer.parseInt((String) hashMap.get("skip_after_seconds")) : 0, a);
    }

    /* renamed from: b */
    public static C3791z m18951b(Intent intent) {
        return new C3791z(C1814c.m6825a(intent.getByteArrayExtra("markup")), intent.getStringExtra("activation_command"), C1714d.NONE, null, null, intent.getStringExtra("request_id"), intent.getIntExtra("viewability_check_initial_delay", 0), intent.getIntExtra("viewability_check_interval", 1000), intent.getIntExtra("skipAfterSeconds", 0), intent.getStringExtra("ct"));
    }

    /* renamed from: a */
    public C1714d mo1344a() {
        return this.f15185c;
    }

    /* renamed from: a */
    public void m18953a(Intent intent) {
        intent.putExtra("markup", C1814c.m6826a(this.f15183a));
        intent.putExtra("activation_command", this.f15184b);
        intent.putExtra("request_id", this.f15188f);
        intent.putExtra("viewability_check_initial_delay", this.f15189g);
        intent.putExtra("viewability_check_interval", this.f15190h);
        intent.putExtra("skipAfterSeconds", this.f15191i);
        intent.putExtra("ct", this.f15192j);
    }

    /* renamed from: b */
    public Collection<String> mo1345b() {
        return this.f15186d;
    }

    /* renamed from: c */
    public String mo1346c() {
        return this.f15192j;
    }

    /* renamed from: d */
    public String m18956d() {
        return this.f15183a;
    }

    /* renamed from: e */
    public String m18957e() {
        return this.f15184b;
    }

    /* renamed from: f */
    public Map<String, String> m18958f() {
        return this.f15187e;
    }

    /* renamed from: g */
    public String m18959g() {
        return this.f15188f;
    }

    /* renamed from: h */
    public int m18960h() {
        return this.f15189g;
    }

    /* renamed from: i */
    public int m18961i() {
        return this.f15190h;
    }

    /* renamed from: j */
    public Bundle m18962j() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("markup", C1814c.m6826a(this.f15183a));
        bundle.putString("request_id", this.f15188f);
        bundle.putInt("viewability_check_initial_delay", this.f15189g);
        bundle.putInt("viewability_check_interval", this.f15190h);
        bundle.putInt("skip_after_seconds", this.f15191i);
        bundle.putString("ct", this.f15192j);
        return bundle;
    }
}
