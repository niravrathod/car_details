package p000a;

import org.json.JSONObject;

/* renamed from: a.d */
public class C0003d {
    /* renamed from: a */
    public static JSONObject m3a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reg_no", str);
            jSONObject.put("token", str2);
            return jSONObject;
        } catch (String str3) {
            str3.printStackTrace();
            return null;
        }
    }
}
