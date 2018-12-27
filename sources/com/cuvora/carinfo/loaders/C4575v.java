package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.models.MaydayAndResponse;

/* renamed from: com.cuvora.carinfo.loaders.v */
public class C4575v extends C3124a<MaydayAndResponse> {
    /* renamed from: o */
    private static final String f18947o = "v";
    /* renamed from: p */
    private String f18948p;
    /* renamed from: q */
    private boolean f18949q;
    /* renamed from: r */
    private Context f18950r;

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25175w();
    }

    public C4575v(Context context, String str, boolean z) {
        super(context);
        this.f18950r = context;
        this.f18948p = str;
        this.f18949q = z;
    }

    /* renamed from: w */
    public MaydayAndResponse m25175w() {
        try {
            return C1545h.m5878b((String) C1543g.m5859a().m5867a(String.class, C1565s.m5955a(this.f18950r, this.f18948p, this.f18949q), this.f18948p, new int[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
