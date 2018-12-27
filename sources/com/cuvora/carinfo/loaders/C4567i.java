package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import java.io.IOException;

/* renamed from: com.cuvora.carinfo.loaders.i */
public class C4567i extends C3124a<Response> {
    /* renamed from: o */
    private Context f18934o;
    /* renamed from: p */
    private String f18935p;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25157w();
    }

    public C4567i(Context context, String str) {
        super(context);
        this.f18934o = context;
        this.f18935p = str;
    }

    /* renamed from: w */
    public Response m25157w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5954a(this.f18934o, this.f18935p), new StringBuilder(C1570t.m5974a(this.f18934o)).reverse().toString(), new int[0]);
            GarageResult d = C1545h.m5884d(str);
            if (d == null) {
                return C1545h.m5886e(str);
            }
            C1570t.m5984a(this.f18934o, d);
            return d;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
