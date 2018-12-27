package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.os.AsyncTask;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import java.io.IOException;

/* renamed from: com.cuvora.carinfo.loaders.n */
public class C1578n extends AsyncTask<Void, Void, Response> {
    /* renamed from: a */
    private Context f4765a;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6083a((Void[]) objArr);
    }

    public C1578n(Context context) {
        this.f4765a = context;
    }

    /* renamed from: a */
    protected Response m6083a(Void... voidArr) {
        try {
            String str = (String) C1543g.m5859a().m5867a(String.class, C1565s.m5954a(this.f4765a, null), new StringBuilder(C1570t.m5974a(this.f4765a)).reverse().toString(), new int[0]);
            GarageResult d = C1545h.m5884d(str);
            if (d == null) {
                return C1545h.m5886e(str);
            }
            C1570t.m5984a(this.f4765a, d);
            if (d.containsRewardedVideoExpiryTimeField()) {
                C1570t.m5982a(this.f4765a, d.getRewardedVideoExpiryTime());
            }
            return d;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
