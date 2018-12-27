package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.models.Response;

/* renamed from: com.cuvora.carinfo.loaders.r */
public class C4574r extends C3124a<Response> {
    /* renamed from: o */
    private Context f18946o;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25173w();
    }

    public C4574r(Context context) {
        super(context);
        this.f18946o = context;
    }

    /* renamed from: w */
    public Response m25173w() {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5953a(this.f18946o), null, new int[0]);
            Response c = C1545h.m5881c(str);
            return c == null ? C1545h.m5886e(str) : c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
