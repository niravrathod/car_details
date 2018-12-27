package com.cuvora.carinfo.videomodule.ui.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.view.a */
public final class C3733a extends C0780h {
    /* renamed from: a */
    public static final C1613a f14978a = new C1613a();
    /* renamed from: j */
    private static final float f14979j;
    /* renamed from: b */
    private final int f14980b = -570425344;
    /* renamed from: c */
    private final int f14981c = 855638016;
    /* renamed from: d */
    private final int f14982d = ((int) (f14979j * ((float) 16)));
    /* renamed from: e */
    private final float f14983e;
    /* renamed from: f */
    private final float f14984f;
    /* renamed from: g */
    private final float f14985g;
    /* renamed from: h */
    private final AccelerateDecelerateInterpolator f14986h;
    /* renamed from: i */
    private final Paint f14987i;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.a$a */
    public static final class C1613a {
        private C1613a() {
        }
    }

    public C3733a() {
        float f = (float) 4;
        this.f14983e = f14979j * f;
        this.f14984f = f14979j * f;
        this.f14985g = f14979j * ((float) 8);
        this.f14986h = new AccelerateDecelerateInterpolator();
        this.f14987i = new Paint();
        this.f14987i.setStrokeWidth(this.f14983e);
        this.f14987i.setStyle(Style.STROKE);
        this.f14987i.setAntiAlias(true);
    }

    /* renamed from: a */
    public void mo758a(Canvas canvas, RecyclerView recyclerView, C0795s c0795s) {
        C2885g.m13910b(canvas, "c");
        C2885g.m13910b(recyclerView, "parent");
        C2885g.m13910b(c0795s, "state");
        super.mo758a(canvas, recyclerView, c0795s);
        Object adapter = recyclerView.getAdapter();
        C2885g.m13907a(adapter, "parent.adapter");
        int a = adapter.mo91a();
        float width = (((float) recyclerView.getWidth()) - ((this.f14984f * ((float) a)) + (((float) Math.max(0, a - 1)) * this.f14985g))) / 2.0f;
        float height = ((float) recyclerView.getHeight()) - (((float) this.f14982d) / 2.0f);
        m18633a(canvas, width, height, a);
        recyclerView = recyclerView.getLayoutManager();
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView;
            int m = linearLayoutManager.m16407m();
            if (m != -1) {
                Object c = linearLayoutManager.mo680c(m);
                C2885g.m13907a(c, "activeChild");
                Canvas canvas2 = canvas;
                m18634a(canvas2, width, height, m, this.f14986h.getInterpolation(((float) (c.getLeft() * -1)) / ((float) c.getWidth())));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    private final void m18633a(Canvas canvas, float f, float f2, int i) {
        this.f14987i.setColor(this.f14981c);
        float f3 = this.f14984f + this.f14985g;
        for (int i2 = 0; i2 < i; i2++) {
            canvas.drawCircle(f, f2, this.f14984f / 2.0f, this.f14987i);
            f += f3;
        }
    }

    /* renamed from: a */
    private final void m18634a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f14987i.setColor(this.f14980b);
        float f4 = this.f14984f + this.f14985g;
        if (f3 == 0.0f) {
            canvas.drawCircle(f + (f4 * ((float) i)), f2, this.f14984f / 1073741824, this.f14987i);
        } else {
            canvas.drawCircle((f + (f4 * ((float) i))) + ((this.f14984f * f3) + (this.f14985g * f3)), f2, this.f14984f / 1073741824, this.f14987i);
        }
    }

    /* renamed from: a */
    public void mo930a(Rect rect, View view, RecyclerView recyclerView, C0795s c0795s) {
        C2885g.m13910b(rect, "outRect");
        C2885g.m13910b(view, "view");
        C2885g.m13910b(recyclerView, "parent");
        C2885g.m13910b(c0795s, "state");
        super.mo930a(rect, view, recyclerView, c0795s);
        rect.bottom = this.f14982d;
    }

    static {
        Object system = Resources.getSystem();
        C2885g.m13907a(system, "Resources.getSystem()");
        f14979j = system.getDisplayMetrics().density;
    }
}
