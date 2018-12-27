package com.cuvora.carinfo.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.h */
public class C1577h extends AsyncTaskLoader<Response> {
    /* renamed from: a */
    private Context f4763a;
    /* renamed from: b */
    private String f4764b;

    public /* synthetic */ Object loadInBackground() {
        return m6082a();
    }

    public C1577h(Context context, String str) {
        super(context);
        this.f4763a = context;
        this.f4764b = str;
    }

    /* renamed from: a */
    public Response m6082a() {
        try {
            JSONObject jSONObject = (JSONObject) C1543g.m5859a().m5867a(JSONObject.class, C1565s.m5960c(this.f4763a, this.f4764b), new StringBuilder(C1570t.m5974a(this.f4763a)).reverse().toString(), new int[0]);
            if (C1546i.m5909h(jSONObject, "data")) {
                return C1545h.m5882c(C1546i.m5907f(jSONObject, "data"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
