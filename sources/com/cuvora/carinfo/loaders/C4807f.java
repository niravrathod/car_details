package com.cuvora.carinfo.loaders;

import android.content.Context;
import com.cuvora.carinfo.helpers.C1565s;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.BaseAsyncTaskLoader.Method;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.ServerApiResponse;
import com.google.gson.p141b.C2624a;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.loaders.f */
public final class C4807f extends BaseAsyncTaskLoader<LicenseDetailsModel> {
    /* renamed from: o */
    private final String f21053o;
    /* renamed from: p */
    private final String f21054p;

    /* renamed from: com.cuvora.carinfo.loaders.f$a */
    public static final class C3708a extends C2624a<ServerApiResponse<LicenseDetailsModel>> {
        C3708a() {
        }
    }

    public C4807f(Context context, String str, String str2) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(str, "licenseNum");
        C2885g.m13910b(str2, "dob");
        super(context, false, 2, null);
        this.f21053o = str;
        this.f21054p = str2;
    }

    /* renamed from: B */
    public Method mo4637B() {
        return Method.f4753a;
    }

    /* renamed from: A */
    public Type mo4636A() {
        Object type = new C3708a().getType();
        C2885g.m13907a(type, "object : TypeToken<Serve…eDetailsModel>>() {}.type");
        return type;
    }

    /* renamed from: y */
    public String mo4638y() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1565s.m5961d(m1450h()));
        stringBuilder.append("?licence_num=");
        stringBuilder.append(this.f21053o);
        stringBuilder.append("&dob=");
        stringBuilder.append(this.f21054p);
        return stringBuilder.toString();
    }

    /* renamed from: z */
    public String mo4639z() {
        Object stringBuilder = new StringBuilder(C1570t.m5974a(m1450h())).reverse().toString();
        C2885g.m13907a(stringBuilder, "StringBuilder(Utils.getD…xt)).reverse().toString()");
        return stringBuilder;
    }
}
