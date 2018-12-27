package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1546i;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.VehicleSearchResult;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.o */
public class C4571o extends C3124a<List<VehicleSearchResult>> {
    /* renamed from: o */
    private Context f18939o;
    /* renamed from: p */
    private String f18940p;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25167w();
    }

    public C4571o(Context context, String str) {
        super(context);
        this.f18939o = context;
        this.f18940p = str;
    }

    /* renamed from: w */
    public List<VehicleSearchResult> m25167w() {
        try {
            JSONObject jSONObject = (JSONObject) C1543g.m5859a().m5867a(JSONObject.class, C1565s.m5958b(this.f18939o, this.f18940p), new StringBuilder(C1570t.m5974a(this.f18939o)).reverse().toString(), new int[0]);
            if (C1546i.m5909h(jSONObject, "data")) {
                return C1545h.m5876a(C1546i.m5908g(jSONObject, "data"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
