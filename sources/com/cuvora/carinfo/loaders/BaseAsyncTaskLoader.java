package com.cuvora.carinfo.loaders;

import android.content.Context;
import android.support.v4.content.C3124a;
import com.cuvora.carinfo.helpers.C1543g;
import com.cuvora.carinfo.models.ServerApiResponse;
import com.google.gson.C2629e;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;
import okhttp3.C4385q;
import okhttp3.C4385q.C2978a;

public abstract class BaseAsyncTaskLoader<T> extends C3124a<ServerApiResponse<T>> {
    /* renamed from: o */
    private String f18922o;
    /* renamed from: p */
    private final boolean f18923p;

    public enum Method {
    }

    /* renamed from: A */
    public abstract Type mo4636A();

    /* renamed from: B */
    public abstract Method mo4637B();

    /* renamed from: y */
    public abstract String mo4638y();

    /* renamed from: z */
    public abstract String mo4639z();

    public BaseAsyncTaskLoader(Context context, boolean z) {
        C2885g.m13910b(context, "context");
        super(context);
        this.f18923p = z;
        this.f18922o = "";
    }

    public /* synthetic */ BaseAsyncTaskLoader(Context context, boolean z, int i, C2884f c2884f) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(context, z);
    }

    /* renamed from: d */
    public /* synthetic */ Object mo3929d() {
        return m25138w();
    }

    /* renamed from: w */
    public ServerApiResponse<T> m25138w() {
        try {
            String str;
            Object a;
            switch (mo4637B()) {
                case f4754b:
                    a = C1543g.m5859a().m5864a(String.class, mo4638y(), mo4639z(), mo4640x(), this.f18923p, 1);
                    C2885g.m13907a(a, "HttpClient.getInstance()…ody(), shouldUseCache, 1)");
                    str = (String) a;
                    break;
                case f4753a:
                    a = C1543g.m5859a().m5866a(String.class, mo4638y(), mo4639z(), this.f18923p, 1);
                    C2885g.m13907a(a, "HttpClient.getInstance()…aram(), shouldUseCache,1)");
                    str = (String) a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.f18922o = str;
            return mo4641a(this.f18922o);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public ServerApiResponse<T> mo4641a(String str) {
        C2885g.m13910b(str, "response");
        return (ServerApiResponse) new C2629e().m12881a(str, mo4636A());
    }

    /* renamed from: x */
    public C4385q mo4640x() {
        Object a = new C2978a().m14528a();
        C2885g.m13907a(a, "formBuilder.build()");
        return a;
    }
}
