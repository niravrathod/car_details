package com.cuvora.carinfo;

import android.content.Context;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.widget.Toast;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.ServerApiResponse;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.b */
public abstract class C3663b<T> implements C0362a<ServerApiResponse<T>> {
    /* renamed from: a */
    public abstract void mo3920a();

    /* renamed from: a */
    public void mo1159a(C0392c<ServerApiResponse<T>> c0392c) {
        C2885g.m13910b(c0392c, "loader");
    }

    /* renamed from: a */
    public abstract void mo3921a(ErrorResponse errorResponse);

    /* renamed from: a */
    public abstract void mo3922a(T t);

    /* renamed from: a */
    public void m18449a(C0392c<ServerApiResponse<T>> c0392c, ServerApiResponse<T> serverApiResponse) {
        C2885g.m13910b(c0392c, "loader");
        if (C1547j.m5913d() == null) {
            mo3920a();
            return;
        }
        if (serverApiResponse == null) {
            mo3921a(new ErrorResponse(520, "Some internal error occured, Please try again!!"));
            c0392c = C2864b.f12079a;
        }
        if ((serverApiResponse != null ? serverApiResponse.getErrors() : null) != null) {
            mo3921a(serverApiResponse.getErrors());
        } else {
            if (serverApiResponse == null || serverApiResponse.getData() == null) {
                mo3921a(new ErrorResponse(521, "No Data Received"));
                c0392c = C2864b.f12079a;
            }
            if (serverApiResponse != null) {
                Object data = serverApiResponse.getData();
                if (data != null) {
                    mo3922a(data);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m18447a(Context context) {
        C2885g.m13910b(context, "context");
        Toast.makeText(context, "No internet connection", 0).show();
    }
}
