package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarPropertiesResponse;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.b */
public class C4563b extends C3124a<Response> {
    /* renamed from: o */
    private Context f18927o;
    /* renamed from: p */
    private String f18928p;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25146w();
    }

    public C4563b(Context context, Bundle bundle) {
        super(context);
        this.f18927o = context;
        this.f18928p = bundle.getString("KEY_VERSION_ID");
    }

    /* renamed from: w */
    public Response m25146w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5966f(this.f18927o, this.f18928p), new StringBuilder(C1570t.m5974a(this.f18927o)).reverse().toString(), new int[0]);
            Response e = C1545h.m5886e(str);
            if (e != null) {
                return e;
            }
            return m25144a(str);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private CarPropertiesResponse m25144a(String str) {
        try {
            return C1545h.m5890g(new JSONObject(str));
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }
}
