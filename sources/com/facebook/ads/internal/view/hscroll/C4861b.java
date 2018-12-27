package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0771a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.facebook.ads.internal.view.hscroll.C4814d.C2079a;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: com.facebook.ads.internal.view.hscroll.b */
public class C4861b extends C4814d implements C2079a {
    /* renamed from: L */
    private final HScrollLinearLayoutManager f21552L;
    /* renamed from: M */
    private C2077a f21553M;
    /* renamed from: N */
    private int f21554N = -1;
    /* renamed from: O */
    private int f21555O = -1;
    /* renamed from: P */
    private int f21556P = 0;
    /* renamed from: Q */
    private int f21557Q = 0;

    /* renamed from: com.facebook.ads.internal.view.hscroll.b$a */
    public interface C2077a {
        /* renamed from: a */
        void m7633a(int i, int i2);
    }

    public C4861b(Context context) {
        super(context);
        this.f21552L = new HScrollLinearLayoutManager(context, new C2078c(), new C2076a());
        m28843z();
    }

    public C4861b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21552L = new HScrollLinearLayoutManager(context, new C2078c(), new C2076a());
        m28843z();
    }

    public C4861b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21552L = new HScrollLinearLayoutManager(context, new C2078c(), new C2076a());
        m28843z();
    }

    /* renamed from: k */
    private void m28841k(int i, int i2) {
        if (i != this.f21554N || i2 != this.f21555O) {
            this.f21554N = i;
            this.f21555O = i2;
            if (this.f21553M != null) {
                this.f21553M.m7633a(this.f21554N, this.f21555O);
            }
        }
    }

    /* renamed from: l */
    private int m28842l(int i) {
        int i2 = this.f21557Q * 2;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - i2;
        int a = getAdapter().mo91a();
        int i3 = 0;
        int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
        while (i4 > i) {
            i3++;
            if (i3 >= a) {
                return i;
            }
            i4 = (int) (((float) (measuredWidth - (i3 * i2))) / (((float) i3) + 0.333f));
        }
        return i4;
    }

    /* renamed from: z */
    private void m28843z() {
        this.f21552L.m16379b(0);
        setLayoutManager(this.f21552L);
        setSaveEnabled(false);
        setSnapDelegate(this);
    }

    /* renamed from: b */
    protected void mo4914b(int i, boolean z) {
        super.mo4914b(i, z);
        m28841k(i, 0);
    }

    public int getChildSpacing() {
        return this.f21557Q;
    }

    /* renamed from: k */
    public int mo4915k(int i) {
        i = Math.abs(i);
        if (i <= this.J) {
            return 0;
        }
        int i2 = 1;
        if (this.f21556P != 0) {
            i2 = 1 + (i / this.f21556P);
        }
        return i2;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = Math.round(((float) getMeasuredWidth()) / 1.91f);
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(MeasureSpec.getSize(i2), i);
        } else if (mode == 1073741824) {
            i = MeasureSpec.getSize(i2);
        }
        i2 = getPaddingTop() + getPaddingBottom();
        i = m28842l(i - i2);
        setMeasuredDimension(getMeasuredWidth(), i2 + i);
        setChildWidth(i + (this.f21557Q * 2));
    }

    public void setAdapter(C0771a c0771a) {
        this.f21552L.m25659a(c0771a == null ? -1 : c0771a.hashCode());
        super.setAdapter(c0771a);
    }

    public void setChildSpacing(int i) {
        this.f21557Q = i;
    }

    public void setChildWidth(int i) {
        this.f21556P = i;
        i = getMeasuredWidth();
        this.f21552L.m25663n((((i - getPaddingLeft()) - getPaddingRight()) - this.f21556P) / 2);
        HScrollLinearLayoutManager hScrollLinearLayoutManager = this.f21552L;
        double d = (double) this.f21556P;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        hScrollLinearLayoutManager.m25658a(d / d2);
    }

    public void setCurrentPosition(int i) {
        mo4914b(i, false);
    }

    public void setOnPageChangedListener(C2077a c2077a) {
        this.f21553M = c2077a;
    }
}
