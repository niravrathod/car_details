package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarVariantsData;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.c */
public class C4564c extends C3124a<Response> {
    /* renamed from: o */
    private Context f18929o;
    /* renamed from: p */
    private String f18930p;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25149w();
    }

    public C4564c(Context context, Bundle bundle) {
        super(context);
        this.f18929o = context;
        this.f18930p = bundle.getString("KEY_MODEL_ID");
    }

    /* renamed from: w */
    public Response m25149w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5964e(this.f18929o, this.f18930p), new StringBuilder(C1570t.m5974a(this.f18929o)).reverse().toString(), new int[0]);
            Response e = C1545h.m5886e(str);
            if (e != null) {
                return e;
            }
            return m25147a(str);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private CarVariantsData m25147a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (C1546i.m5909h(jSONObject, "data") != null) {
                return C1545h.m5888f(C1546i.m5907f(jSONObject, "data"));
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }
}
