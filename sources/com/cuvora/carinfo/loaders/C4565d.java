package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarsBrandsResponse;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.d */
public class C4565d extends C3124a<Response> {
    /* renamed from: o */
    private Context f18931o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25152w();
    }

    public C4565d(Context context) {
        super(context);
        this.f18931o = context;
    }

    /* renamed from: w */
    public Response m25152w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5970j(this.f18931o), new StringBuilder(C1570t.m5974a(this.f18931o)).reverse().toString(), new int[0]);
            Response a = m25150a(str);
            return a == null ? C1545h.m5886e(str) : a;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private CarsBrandsResponse m25150a(String str) {
        try {
            return C1545h.m5885d(new JSONObject(str));
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }
}
