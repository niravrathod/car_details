package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.GarageResult;
import com.google.android.gms.common.Scopes;
import okhttp3.C2991z;
import okhttp3.aa;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.s */
public class C1579s extends AsyncTask<Void, Void, GarageResult> {
    /* renamed from: a */
    private Context f4766a;
    /* renamed from: b */
    private GarageResult f4767b;
    /* renamed from: c */
    private boolean f4768c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6085a((Void[]) objArr);
    }

    public C1579s(Context context, boolean z, GarageResult garageResult) {
        this.f4766a = context;
        this.f4767b = garageResult;
        this.f4768c = z;
    }

    /* renamed from: a */
    protected GarageResult m6085a(Void... voidArr) {
        try {
            String a = C1565s.m5954a(this.f4766a, null);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String put : this.f4767b.getVehicleNumbers()) {
                jSONArray.put(put);
            }
            jSONObject.put("myVehicles", jSONArray);
            jSONObject.put("contactInfo", mo1198a(this.f4767b));
            jSONObject.put("lastModTime", this.f4767b.getLastModifiedTime());
            C2991z a2 = C2991z.m14632a(C1542a.f4673a, jSONObject.toString());
            aa aaVar = (aa) C1543g.m5859a().m5865a(aa.class, a, new StringBuilder(C1570t.m5974a(this.f4766a)).reverse().toString(), a2, 1);
            if (aaVar.m14013d()) {
                C1570t.m5984a(this.f4766a, this.f4767b);
                return this.f4767b;
            }
            C1570t.m5988a(aaVar);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private JSONObject mo1198a(GarageResult garageResult) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(garageResult.getName())) {
            jSONObject.put("name", garageResult.getName());
        }
        if (!TextUtils.isEmpty(garageResult.getEmail())) {
            jSONObject.put(Scopes.EMAIL, garageResult.getEmail());
        }
        if (!TextUtils.isEmpty(garageResult.getMobileNumber())) {
            jSONObject.put("mobile", garageResult.getMobileNumber());
        }
        return jSONObject;
    }
}
