package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.preference.PreferenceManager;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.StateCityData;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.q */
public class C4573q extends C3124a<StateCityData> {
    /* renamed from: o */
    private Context f18945o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25171w();
    }

    public C4573q(Context context) {
        super(context);
        this.f18945o = context;
    }

    /* renamed from: w */
    public StateCityData m25171w() {
        try {
            JSONObject jSONObject = (JSONObject) C1543g.m5859a().m5867a(JSONObject.class, C1565s.m5967g(this.f18945o), new StringBuilder(C1570t.m5974a(this.f18945o)).reverse().toString(), new int[0]);
            if (C1546i.m5909h(jSONObject, "data")) {
                jSONObject = C1546i.m5907f(jSONObject, "data");
                PreferenceManager.getDefaultSharedPreferences(this.f18945o).edit().putString("KEY_STATES_DATA", jSONObject.toString()).apply();
                return C1545h.m5889f(jSONObject.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
