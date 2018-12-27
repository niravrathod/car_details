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
import okhttp3.C4385q;
import okhttp3.C4385q.C2978a;

/* renamed from: com.cuvora.carinfo.loaders.g */
public final class C4808g extends BaseAsyncTaskLoader<LicenseDetailsModel> {
    /* renamed from: o */
    private final String f21055o;
    /* renamed from: p */
    private final String f21056p;
    /* renamed from: q */
    private final String f21057q;

    /* renamed from: com.cuvora.carinfo.loaders.g$a */
    public static final class C3709a extends C2624a<ServerApiResponse<LicenseDetailsModel>> {
        C3709a() {
        }
    }

    public C4808g(Context context, String str, String str2, String str3) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(str, "licenseNum");
        C2885g.m13910b(str2, "dob");
        C2885g.m13910b(str3, "body");
        super(context, false, 2, null);
        this.f21055o = str;
        this.f21056p = str2;
        this.f21057q = str3;
    }

    /* renamed from: B */
    public Method mo4637B() {
        return Method.f4754b;
    }

    /* renamed from: A */
    public Type mo4636A() {
        Object type = new C3709a().getType();
        C2885g.m13907a(type, "object : TypeToken<Serve…eDetailsModel>>() {}.type");
        return type;
    }

    /* renamed from: y */
    public String mo4638y() {
        Object c = C1565s.m5959c(m1450h());
        C2885g.m13907a(c, "UrlBuilder.getLicenseScraperApiUrl(context)");
        return c;
    }

    /* renamed from: z */
    public String mo4639z() {
        Object stringBuilder = new StringBuilder(C1570t.m5974a(m1450h())).reverse().toString();
        C2885g.m13907a(stringBuilder, "StringBuilder(Utils.getD…xt)).reverse().toString()");
        return stringBuilder;
    }

    /* renamed from: x */
    public C4385q mo4640x() {
        Object a = new C2978a().m14527a("licence_num", this.f21055o).m14527a("body", this.f21057q).m14527a("dob", this.f21056p).m14528a();
        C2885g.m13907a(a, "formBuilder.build()");
        return a;
    }
}
