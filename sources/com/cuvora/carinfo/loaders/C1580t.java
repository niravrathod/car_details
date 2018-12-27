package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.os.AsyncTask;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1543g.C1542a;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.Response;
import okhttp3.C2991z;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.loaders.t */
public class C1580t extends AsyncTask<Void, Void, Response> {
    /* renamed from: a */
    private Context f4769a;
    /* renamed from: b */
    private String f4770b;
    /* renamed from: c */
    private Object f4771c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6086a((Void[]) objArr);
    }

    public C1580t(Context context, String str, Object obj) {
        this.f4769a = context;
        this.f4770b = str;
        this.f4771c = obj;
    }

    /* renamed from: a */
    protected Response m6086a(Void... voidArr) {
        try {
            String k = C1565s.m5971k(this.f4769a);
            voidArr = new JSONObject();
            voidArr.put("name", this.f4770b);
            voidArr.put("value", this.f4771c);
            String str = (String) C1543g.m5859a().m5865a(String.class, k, new StringBuilder(C1570t.m5974a(this.f4769a)).reverse().toString(), C2991z.m14632a(C1542a.f4673a, voidArr.toString()), new int[null]);
        } catch (Void[] voidArr2) {
            voidArr2.printStackTrace();
        }
        return null;
    }
}
