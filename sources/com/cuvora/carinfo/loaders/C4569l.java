package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.l */
public class C4569l extends C3124a<Response> {
    /* renamed from: o */
    private Context f18937o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25163w();
    }

    public C4569l(Context context) {
        super(context);
        this.f18937o = context;
    }

    /* renamed from: w */
    public Response m25163w() {
        Map hashMap = new HashMap();
        hashMap.put("adFree", Boolean.valueOf(C1570t.m6032q(this.f18937o)));
        hashMap.put("region", PreferenceManager.getDefaultSharedPreferences(this.f18937o).getString("KEY_REGION", "NEW"));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f18937o);
        int i = defaultSharedPreferences.getInt("KEY_USER_SEGMENT", -1);
        if (i == -1) {
            i = C1541e.m5855b("userBucketSize").intValue();
            double random = Math.random();
            double d = (double) i;
            Double.isNaN(d);
            i = (int) ((random * d) + 1.0d);
            defaultSharedPreferences.edit().putInt("KEY_USER_SEGMENT", i).apply();
            hashMap.put("segment", Integer.valueOf(i));
        } else {
            hashMap.put("segment", Integer.valueOf(i));
        }
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5956a(this.f18937o, hashMap), new StringBuilder(C1570t.m5974a(this.f18937o)).reverse().toString(), new int[0]);
            Response e = C1545h.m5886e(str);
            if (e != null) {
                return e;
            }
            return m25161a(str);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private HomeTabData m25161a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1570t.m6019f(this.f18937o, jSONObject.toString());
            return C1545h.m5874a(this.f18937o, jSONObject);
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }
}
