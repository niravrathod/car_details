package com.cuvora.carinfo.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.preference.PreferenceManager;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import java.io.IOException;
import okhttp3.C2991z;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.u */
public class C1581u extends AsyncTaskLoader<Response> {
    /* renamed from: a */
    private Context f4772a;

    public /* synthetic */ Object loadInBackground() {
        return m6087a();
    }

    public C1581u(Context context) {
        super(context);
        this.f4772a = context;
    }

    /* renamed from: a */
    public Response m6087a() {
        try {
            JSONObject jSONObject = (JSONObject) C1543g.m5859a().m5867a(JSONObject.class, C1565s.m5968h(this.f4772a), new StringBuilder(C1570t.m5974a(this.f4772a)).reverse().toString(), new int[0]);
            if (jSONObject != null) {
                if (C1546i.m5909h(jSONObject, "region")) {
                    PreferenceManager.getDefaultSharedPreferences(this.f4772a).edit().putString("KEY_REGION", C1546i.m5899a(jSONObject, "region")).apply();
                }
                C2991z a = C2991z.m14632a(C1542a.f4673a, jSONObject.toString());
                jSONObject = (JSONObject) C1543g.m5859a().m5865a(JSONObject.class, C1565s.m5969i(this.f4772a), new StringBuilder(C1570t.m5974a(this.f4772a)).reverse().toString(), a, 1);
                if (C1546i.m5909h(jSONObject, "data")) {
                    return C1545h.m5882c(C1546i.m5907f(jSONObject, "data"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
