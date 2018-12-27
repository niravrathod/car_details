package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0795s;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.af;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;

public class HScrollLinearLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    private final C2078c f19271a;
    /* renamed from: b */
    private final C2076a f19272b;
    /* renamed from: c */
    private final Context f19273c;
    /* renamed from: d */
    private int[] f19274d;
    /* renamed from: e */
    private int f19275e = 0;
    /* renamed from: f */
    private float f19276f = 50.0f;
    /* renamed from: g */
    private C4658a f19277g;
    /* renamed from: h */
    private int f19278h;

    /* renamed from: com.facebook.ads.internal.view.hscroll.HScrollLinearLayoutManager$a */
    private class C4658a extends af {
        /* renamed from: f */
        final /* synthetic */ HScrollLinearLayoutManager f19270f;

        public C4658a(HScrollLinearLayoutManager hScrollLinearLayoutManager, Context context) {
            this.f19270f = hScrollLinearLayoutManager;
            super(context);
        }

        /* renamed from: a */
        protected float mo3861a(DisplayMetrics displayMetrics) {
            return this.f19270f.f19276f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: b */
        public int mo3986b(View view, int i) {
            C0783i e = m3235e();
            if (!e.mo688e()) {
                return 0;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return m16682a(e.m3132h(view) - layoutParams.leftMargin, e.m3136j(view) + layoutParams.rightMargin, e.m3026B(), e.m3157z() - e.m3028D(), i) + this.f19270f.f19275e;
        }

        /* renamed from: c */
        protected int mo3987c() {
            return -1;
        }

        /* renamed from: c */
        public PointF mo3937c(int i) {
            return this.f19270f.mo684d(i);
        }
    }

    public HScrollLinearLayoutManager(Context context, C2078c c2078c, C2076a c2076a) {
        super(context);
        this.f19273c = context;
        this.f19271a = c2078c;
        this.f19272b = c2076a;
        this.f19278h = -1;
        this.f19277g = new C4658a(this, this.f19273c);
    }

    /* renamed from: a */
    public void m25658a(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.f19276f = (float) (50.0d / d);
        this.f19277g = new C4658a(this, this.f19273c);
    }

    /* renamed from: a */
    void m25659a(int i) {
        this.f19278h = i;
    }

    /* renamed from: a */
    public void mo3988a(C0790o c0790o, C0795s c0795s, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if ((mode == 1073741824 && m16398g() == 1) || (mode2 == 1073741824 && m16398g() == 0)) {
            super.mo3988a(c0790o, c0795s, i, i2);
            return;
        }
        int[] a;
        int size = MeasureSpec.getSize(i);
        i = MeasureSpec.getSize(i2);
        if (this.f19272b.m7632b(this.f19278h)) {
            a = this.f19272b.m7631a(this.f19278h);
        } else {
            int[] iArr = new int[]{0, 0};
            if (c0795s.m3249e() >= 1) {
                int w = m3154w() > 0 ? 1 : m3154w();
                for (int i3 = 0; i3 < w; i3++) {
                    this.f19274d = this.f19271a.m7634a(mo680c(i3), MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                    if (m16398g() == 0) {
                        iArr[0] = iArr[0] + this.f19274d[0];
                        if (i3 == 0) {
                            iArr[1] = (this.f19274d[1] + m3027C()) + m3029E();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.f19274d[1];
                        if (i3 == 0) {
                            iArr[0] = (this.f19274d[0] + m3026B()) + m3028D();
                        }
                    }
                }
                if (this.f19278h != -1) {
                    this.f19272b.m7630a(this.f19278h, iArr);
                }
            }
            a = iArr;
        }
        if (mode == 1073741824) {
            a[0] = size;
        }
        if (mode2 == 1073741824) {
            a[1] = i;
        }
        m3130g(a[0], a[1]);
    }

    /* renamed from: a */
    public void mo674a(RecyclerView recyclerView, C0795s c0795s, int i) {
        this.f19277g.m3234d(i);
        m3055a(this.f19277g);
    }

    /* renamed from: e */
    public void mo687e(int i) {
        super.m16380b(i, this.f19275e);
    }

    /* renamed from: n */
    public void m25663n(int i) {
        this.f19275e = i;
    }
}
