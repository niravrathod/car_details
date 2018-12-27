package com.cuvora.carinfo.loaders;

import android.content.Context;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.BaseAsyncTaskLoader.Method;
import com.cuvora.carinfo.models.ServerApiResponse;
import com.cuvora.carinfo.models.homepage.HomePageData;
import com.google.gson.p141b.C2624a;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.loaders.j */
public final class C4809j extends BaseAsyncTaskLoader<HomePageData> {
    /* renamed from: o */
    private final String f21058o;

    /* renamed from: com.cuvora.carinfo.loaders.j$a */
    public static final class C3710a extends C2624a<ServerApiResponse<HomePageData>> {
        C3710a() {
        }
    }

    public C4809j(Context context, String str, boolean z) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(str, "screenName");
        super(context, z);
        this.f21058o = str;
    }

    /* renamed from: B */
    public Method mo4637B() {
        return Method.f4753a;
    }

    /* renamed from: A */
    public Type mo4636A() {
        Object type = new C3710a().getType();
        C2885g.m13907a(type, "object : TypeToken<Serve…<HomePageData>>() {}.type");
        return type;
    }

    /* renamed from: y */
    public String mo4638y() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1565s.m5963e(m1450h()));
        stringBuilder.append(this.f21058o);
        return stringBuilder.toString();
    }

    /* renamed from: z */
    public String mo4639z() {
        Object stringBuilder = new StringBuilder(C1570t.m5974a(m1450h())).reverse().toString();
        C2885g.m13907a(stringBuilder, "StringBuilder(Utils.getD…xt)).reverse().toString()");
        return stringBuilder;
    }

    /* renamed from: a */
    public com.cuvora.carinfo.models.ServerApiResponse<com.cuvora.carinfo.models.homepage.HomePageData> mo4641a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = "response";
        kotlin.jvm.internal.C2885g.m13910b(r4, r0);
        r0 = 0;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0032 }
        r1.<init>(r4);	 Catch:{ JSONException -> 0x0032 }
        r4 = "data";	 Catch:{ JSONException -> 0x0032 }
        r4 = com.cuvora.carinfo.helpers.C1546i.m5909h(r1, r4);	 Catch:{ JSONException -> 0x0032 }
        if (r4 == 0) goto L_0x0032;	 Catch:{ JSONException -> 0x0032 }
    L_0x0013:
        r4 = "data";	 Catch:{ JSONException -> 0x0032 }
        r4 = com.cuvora.carinfo.helpers.C1546i.m5907f(r1, r4);	 Catch:{ JSONException -> 0x0032 }
        r1 = r3.m1450h();	 Catch:{ JSONException -> 0x0032 }
        r2 = r4.toString();	 Catch:{ JSONException -> 0x0032 }
        com.cuvora.carinfo.helpers.C1570t.m6022g(r1, r2);	 Catch:{ JSONException -> 0x0032 }
        r1 = new com.cuvora.carinfo.models.ServerApiResponse;	 Catch:{ JSONException -> 0x0032 }
        r2 = r3.m1450h();	 Catch:{ JSONException -> 0x0032 }
        r4 = com.cuvora.carinfo.helpers.C1545h.m5879b(r2, r4);	 Catch:{ JSONException -> 0x0032 }
        r1.<init>(r0, r4);	 Catch:{ JSONException -> 0x0032 }
        return r1;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.loaders.j.a(java.lang.String):com.cuvora.carinfo.models.ServerApiResponse<com.cuvora.carinfo.models.homepage.HomePageData>");
    }
}
