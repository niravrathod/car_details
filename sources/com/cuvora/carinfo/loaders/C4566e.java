package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarListParticularBrandResponse;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.e */
public class C4566e extends C3124a<Response> {
    /* renamed from: o */
    private Context f18932o;
    /* renamed from: p */
    private String f18933p;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25155w();
    }

    public C4566e(Context context, String str) {
        super(context);
        this.f18932o = context;
        this.f18933p = str;
    }

    /* renamed from: w */
    public Response m25155w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5962d(this.f18932o, this.f18933p), new StringBuilder(C1570t.m5974a(this.f18932o)).reverse().toString(), new int[0]);
            Response a = m25153a(str);
            if (a != null) {
                return a;
            }
            return C1545h.m5886e(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private CarListParticularBrandResponse m25153a(String str) {
        try {
            return C1545h.m5887e(new JSONObject(str));
        } catch (String str2) {
            str2.printStackTrace();
            return null;
        }
    }
}
