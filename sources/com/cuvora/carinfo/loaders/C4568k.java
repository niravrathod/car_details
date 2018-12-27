package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.homepage.HomePageData;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.k */
public class C4568k extends C3124a<Response> {
    /* renamed from: o */
    private Context f18936o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25160w();
    }

    public C4568k(Context context) {
        super(context);
        this.f18936o = context;
    }

    /* renamed from: w */
    public Response m25160w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5956a(this.f18936o, new HashMap()), new StringBuilder(C1570t.m5974a(this.f18936o)).reverse().toString(), new int[0]);
            Response e = C1545h.m5886e(str);
            if (e != null) {
                return e;
            }
            return m25158a(str);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private HomePageData m25158a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C1546i.m5909h(jSONObject, "data") != null) {
                str = C1546i.m5907f(jSONObject, "data");
                C1570t.m6019f(this.f18936o, str.toString());
                return C1545h.m5879b(this.f18936o, str);
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }
}
