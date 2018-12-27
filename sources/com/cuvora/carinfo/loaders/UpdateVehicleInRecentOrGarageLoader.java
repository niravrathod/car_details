package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import okhttp3.C2991z;
import org.json.JSONObject;

public class UpdateVehicleInRecentOrGarageLoader extends C3124a<Response> {
    /* renamed from: o */
    private String f18924o;
    /* renamed from: p */
    private Action f18925p;
    /* renamed from: q */
    private Type f18926q;

    public enum Action {
        ADD,
        DELETE
    }

    public enum Type {
        GARAGE,
        RECENT
    }

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25143w();
    }

    public UpdateVehicleInRecentOrGarageLoader(Context context, String str, Action action, Type type) {
        super(context);
        this.f18924o = str;
        this.f18925p = action;
        this.f18926q = type;
    }

    /* renamed from: w */
    public Response m25143w() {
        String l = C1565s.m5972l(m1450h());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vehicleNo", this.f18924o);
            jSONObject.put("type", this.f18926q);
            jSONObject.put("action", this.f18925p);
            C2991z a = C2991z.m14632a(C1542a.f4673a, jSONObject.toString());
            String str = (String) C1543g.m5859a().m5865a(String.class, l, new StringBuilder(C1570t.m5974a(m1450h())).reverse().toString(), a, 1);
            GarageResult d = C1545h.m5884d(str);
            if (d == null) {
                return C1545h.m5886e(str);
            }
            C1570t.m5984a(m1450h(), d);
            return d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
