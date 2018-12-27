package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.models.MaydayAndResponse;
import java.io.IOException;
import okhttp3.C2991z;
import okhttp3.C4385q.C2978a;

/* renamed from: com.cuvora.carinfo.loaders.p */
public class C4572p extends C3124a<MaydayAndResponse> {
    /* renamed from: o */
    private Context f18941o;
    /* renamed from: p */
    private String f18942p;
    /* renamed from: q */
    private String f18943q;
    /* renamed from: r */
    private String f18944r;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25169w();
    }

    public C4572p(Context context, String str, String str2, String str3) {
        super(context);
        this.f18941o = context;
        this.f18942p = str;
        this.f18943q = str2;
        this.f18944r = str3;
    }

    /* renamed from: w */
    public MaydayAndResponse m25169w() {
        String b = C1565s.m5957b(this.f18941o);
        C2978a a = new C2978a().m14527a("vehicle_num", this.f18942p).m14527a("result", this.f18943q);
        a.m14527a("clientId", this.f18944r);
        C2991z a2 = a.m14528a();
        try {
            return C1545h.m5878b((String) C1543g.m5859a().m5865a(String.class, b, this.f18942p, a2, 1));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
