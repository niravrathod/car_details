package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C3325j;
import com.airbnb.lottie.p031a.p032a.C4475c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.e */
public class C4775e extends C4500a {
    /* renamed from: e */
    private final C4475c f20876e;

    C4775e(C0966f c0966f, Layer layer) {
        super(c0966f, layer);
        this.f20876e = new C4475c(c0966f, this, new C3325j("__container", layer.m4296n()));
        this.f20876e.mo867a(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: b */
    void mo4619b(Canvas canvas, Matrix matrix, int i) {
        this.f20876e.mo3883a(canvas, matrix, i);
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        super.mo3884a(rectF, matrix);
        this.f20876e.mo3884a(rectF, this.a);
    }

    /* renamed from: b */
    protected void mo4620b(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        this.f20876e.mo3885a(c0989e, i, list, c0989e2);
    }
}
