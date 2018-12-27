package com.cuvora.carinfo.videomodule.ui.view;

import android.content.Context;
import android.support.v4.view.C0549g;
import android.support.v4.view.C0560r;
import android.support.v4.widget.C0625r;
import android.support.v4.widget.C0625r.C0624a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import com.cuvora.carinfo.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

public final class PIPRelativeLayout extends RelativeLayout {
    /* renamed from: A */
    private C3732b f4832A = new C3732b(this);
    /* renamed from: a */
    private Boolean f4833a = Boolean.valueOf(null);
    /* renamed from: b */
    private C1611a f4834b;
    /* renamed from: c */
    private AspectRatio f4835c = AspectRatio.f4827a;
    /* renamed from: d */
    private C0625r f4836d;
    /* renamed from: e */
    private int f4837e;
    /* renamed from: f */
    private int f4838f;
    /* renamed from: g */
    private float f4839g;
    /* renamed from: h */
    private float f4840h;
    /* renamed from: i */
    private int f4841i;
    /* renamed from: j */
    private int f4842j;
    /* renamed from: k */
    private boolean f4843k;
    /* renamed from: l */
    private int f4844l;
    /* renamed from: m */
    private int f4845m;
    /* renamed from: n */
    private View f4846n;
    /* renamed from: o */
    private int f4847o = -1;
    /* renamed from: p */
    private float f4848p;
    /* renamed from: q */
    private final int f4849q = 10;
    /* renamed from: r */
    private boolean f4850r = true;
    /* renamed from: s */
    private boolean f4851s;
    /* renamed from: t */
    private float f4852t;
    /* renamed from: u */
    private float f4853u;
    /* renamed from: v */
    private float f4854v;
    /* renamed from: w */
    private float f4855w;
    /* renamed from: x */
    private float f4856x;
    /* renamed from: y */
    private float f4857y;
    /* renamed from: z */
    private float f4858z;

    public enum AspectRatio {
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout$a */
    public interface C1611a {
        /* renamed from: r */
        void mo1250r();

        /* renamed from: s */
        void mo1251s();

        /* renamed from: t */
        void mo1252t();

        /* renamed from: u */
        void mo1253u();
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout$c */
    public static final class C1612c implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ PIPRelativeLayout f4831a;

        C1612c(PIPRelativeLayout pIPRelativeLayout) {
            this.f4831a = pIPRelativeLayout;
        }

        public void onGlobalLayout() {
            this.f4831a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f4831a.f4853u = (float) this.f4831a.getWidth();
            this.f4831a.f4852t = (float) this.f4831a.getHeight();
            this.f4831a.f4858z = this.f4831a.f4852t / 2.0f;
            this.f4831a.m6181b();
            this.f4831a.m6174l();
            this.f4831a.m6170j();
            this.f4831a.m6175m();
            this.f4831a.m6172k();
            this.f4831a.m6176n();
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout$b */
    public static final class C3732b extends C0624a {
        /* renamed from: a */
        final /* synthetic */ PIPRelativeLayout f14974a;

        C3732b(PIPRelativeLayout pIPRelativeLayout) {
            this.f14974a = pIPRelativeLayout;
        }

        /* renamed from: a */
        public boolean mo108a(View view, int i) {
            C2885g.m13910b(view, "child");
            this.f14974a.f4846n = view;
            boolean z = true;
            if (this.f14974a.f4835c == com.cuvora.carinfo.videomodule.ui.view.PIPView.AspectRatio.f4861c) {
                return true;
            }
            if (view.getId() != R.id.dragView) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        public int mo104a(View view, int i, int i2) {
            C2885g.m13910b(view, "child");
            Log.e("DRAGG ", "clampViewPositionVertical");
            if (this.f14974a.m6180a(view) != 0) {
                view = (float) i;
                if (view > this.f14974a.f4856x) {
                    return (int) this.f14974a.f4856x;
                }
                return view < this.f14974a.f4857y ? (int) this.f14974a.f4857y : i;
            } else if (this.f14974a.getMinimized() != 0) {
                if (this.f14974a.getInterceptor() == 2) {
                    return view.getTop();
                }
                if (this.f14974a.getInterceptor() == 1) {
                    if (i < 0) {
                        return 0;
                    }
                    return i > this.f14974a.f4845m ? this.f14974a.f4845m : i;
                } else if (Math.abs(i - view.getTop()) <= 10) {
                    return view.getTop();
                } else {
                    this.f14974a.setInterceptor(1);
                    if (i < 0) {
                        return 0;
                    }
                    return i > this.f14974a.f4845m ? this.f14974a.f4845m : i;
                }
            } else if (i < 0) {
                return 0;
            } else {
                return i > this.f14974a.f4845m ? this.f14974a.f4845m : i;
            }
        }

        /* renamed from: b */
        public int mo109b(View view, int i, int i2) {
            C2885g.m13910b(view, "child");
            Log.e("DRAGG ", "clampViewPositionHorizontal");
            if (this.f14974a.m6180a(view) != 0) {
                return view.getLeft();
            }
            if (this.f14974a.getMinimized() == 0) {
                return view.getLeft();
            }
            if (this.f14974a.getInterceptor() == 1) {
                return view.getLeft();
            }
            if (this.f14974a.getInterceptor() == 2) {
                return i;
            }
            if (Math.abs(i - view.getLeft()) <= 10) {
                return view.getLeft();
            }
            this.f14974a.setInterceptor(2);
            return i;
        }

        /* renamed from: a */
        public int mo103a(View view) {
            C2885g.m13910b(view, "child");
            return this.f14974a.f4845m;
        }

        /* renamed from: a */
        public void mo106a(View view, float f, float f2) {
            C2885g.m13910b(view, "releasedChild");
            super.mo106a(view, f, f2);
            if (this.f14974a.m6180a(view)) {
                if (Math.abs(f2) > ((float) 1000)) {
                    if (f2 > ((float) null)) {
                        PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), (int) this.f14974a.f4856x);
                    } else {
                        PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), (int) this.f14974a.f4857y);
                    }
                } else if ((((float) view.getTop()) * 1.0f) / this.f14974a.f4856x > 0.5f) {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), (int) this.f14974a.f4856x);
                } else {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), (int) this.f14974a.f4857y);
                }
                this.f14974a.invalidate();
                return;
            }
            if (this.f14974a.getInterceptor() == 2) {
                if (Math.abs(f) > ((float) 1000)) {
                    if (f > ((float) null)) {
                        PIPRelativeLayout.m6171k(this.f14974a).m2515a(2000, view.getTop());
                        view = this.f14974a.getCallbacks();
                        if (view != null) {
                            view.mo1253u();
                        }
                    } else {
                        PIPRelativeLayout.m6171k(this.f14974a).m2515a(-2000, view.getTop());
                        view = this.f14974a.getCallbacks();
                        if (view != null) {
                            view.mo1252t();
                        }
                    }
                } else if (((float) view.getLeft()) < ((float) this.f14974a.getLeft()) - (((float) this.f14974a.f4841i) / 1.5f)) {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(-2000, view.getTop());
                    view = this.f14974a.getCallbacks();
                    if (view != null) {
                        view.mo1252t();
                    }
                } else if (((float) view.getLeft()) > ((float) this.f14974a.getLeft()) + (((float) this.f14974a.f4841i) / 1.5f)) {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(2000, view.getTop());
                    view = this.f14974a.getCallbacks();
                    if (view != null) {
                        view.mo1253u();
                    }
                } else {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(0, view.getTop());
                }
            } else if (Math.abs(f2) > ((float) 1000)) {
                if (f2 > ((float) null)) {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), this.f14974a.f4845m);
                    this.f14974a.setMinimized(true);
                    view = this.f14974a.getCallbacks();
                    if (view != null) {
                        view.mo1251s();
                    }
                } else {
                    PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), 0);
                    this.f14974a.setMinimized(false);
                    view = this.f14974a.getCallbacks();
                    if (view != null) {
                        view.mo1250r();
                    }
                }
            } else if ((((float) view.getTop()) * 1.0f) / ((float) this.f14974a.f4845m) > 0.5f) {
                PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), this.f14974a.f4845m);
                this.f14974a.setMinimized(true);
                view = this.f14974a.getCallbacks();
                if (view != null) {
                    view.mo1251s();
                }
            } else {
                PIPRelativeLayout.m6171k(this.f14974a).m2515a(view.getLeft(), 0);
                this.f14974a.setMinimized(false);
                view = this.f14974a.getCallbacks();
                if (view != null) {
                    view.mo1250r();
                }
            }
            this.f14974a.invalidate();
        }

        /* renamed from: a */
        public void mo107a(View view, int i, int i2, int i3, int i4) {
            C2885g.m13910b(view, "changedView");
            super.mo107a(view, i, i2, i3, i4);
            if (this.f14974a.m6180a(view) == 0) {
                i = (((float) i2) * 1065353216) / ((float) this.f14974a.f4845m);
                view.setScaleX(this.f14974a.m6149a((float) i));
                view.setScaleY(this.f14974a.m6156b((float) i));
                Object findViewById = this.f14974a.findViewById(R.id.detailView);
                C2885g.m13907a(findViewById, "findViewById<View>(R.id.detailView)");
                findViewById.setAlpha(1065353216 - i);
                findViewById = this.f14974a.findViewById(R.id.detailView);
                C2885g.m13907a(findViewById, "findViewById<View>(R.id.detailView)");
                Object findViewById2 = this.f14974a.findViewById(R.id.detailView);
                C2885g.m13907a(findViewById2, "findViewById<View>(R.id.detailView)");
                findViewById.setTop(findViewById2.getTop() + i4);
            }
        }

        /* renamed from: a */
        public void mo105a(int i) {
            super.mo105a(i);
            if (i == 0) {
                this.f14974a.setInterceptor(0);
            }
        }
    }

    public PIPRelativeLayout(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: k */
    public static final /* synthetic */ C0625r m6171k(PIPRelativeLayout pIPRelativeLayout) {
        pIPRelativeLayout = pIPRelativeLayout.f4836d;
        if (pIPRelativeLayout == null) {
            C2885g.m13911b("mDragHelper");
        }
        return pIPRelativeLayout;
    }

    public final Boolean getEnableDrag() {
        return this.f4833a;
    }

    public final void setEnableDrag(Boolean bool) {
        this.f4833a = bool;
    }

    public final C1611a getCallbacks() {
        return this.f4834b;
    }

    public final void setCallbacks(C1611a c1611a) {
        this.f4834b = c1611a;
    }

    public final boolean getMinimized() {
        return this.f4843k;
    }

    public final void setMinimized(boolean z) {
        this.f4843k = z;
    }

    public final int getInterceptor() {
        return this.f4844l;
    }

    public final void setInterceptor(int i) {
        this.f4844l = i;
    }

    /* renamed from: a */
    public final void m6177a() {
        this.f4844l = 0;
        this.f4843k = false;
    }

    /* renamed from: a */
    public final boolean m6180a(View view) {
        C2885g.m13910b(view, "view");
        return view.getId() == R.id.detailView ? true : null;
    }

    /* renamed from: a */
    public final void m6178a(int i, AspectRatio aspectRatio) {
        C2885g.m13910b(aspectRatio, "aspectRatio");
        this.f4835c = aspectRatio;
        this.f4841i = i;
        if (this.f4852t != null) {
            m6181b();
            m6174l();
            m6170j();
            m6175m();
            m6172k();
            m6176n();
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener((OnGlobalLayoutListener) new C1612c(this));
    }

    /* renamed from: j */
    private final void m6170j() {
        Object findViewById = findViewById(R.id.detailView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.detailView)");
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            float f;
            this.f4857y = (float) ((MarginLayoutParams) layoutParams).topMargin;
            if (C1614b.f4863a[this.f4835c.ordinal()] != 1) {
                findViewById = findViewById(R.id.dragView);
                C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
                f = (float) findViewById.getLayoutParams().height;
            } else {
                f = this.f4852t * 0.7f;
            }
            this.f4854v = f;
            f = this.f4852t;
            Object findViewById2 = findViewById(R.id.dragView);
            C2885g.m13907a(findViewById2, "findViewById<View>(R.id.dragView)");
            this.f4855w = f - ((float) findViewById2.getLayoutParams().height);
            this.f4856x = this.f4854v;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: k */
    private final void m6172k() {
        float f = this.f4852t;
        Object findViewById = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
        this.f4845m = (int) (f - ((float) findViewById.getLayoutParams().height));
    }

    /* renamed from: l */
    private final void m6174l() {
        Object findViewById = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = (int) this.f4853u;
            switch (this.f4835c) {
                case f4827a:
                    layoutParams2.height = (int) ((this.f4853u * 9.0f) / 16.0f);
                    break;
                case f4828b:
                    layoutParams2.height = (int) ((this.f4853u * 3.0f) / 4.0f);
                    break;
                case f4829c:
                    layoutParams2.height = (int) ((this.f4853u * 16.0f) / 9.0f);
                    break;
                default:
                    break;
            }
            Object findViewById2 = findViewById(R.id.dragView);
            C2885g.m13907a(findViewById2, "findViewById<View>(R.id.dragView)");
            findViewById2.setLayoutParams(layoutParams2);
            Object findViewById3 = findViewById(R.id.detailView);
            C2885g.m13907a(findViewById3, "findViewById<View>(R.id.detailView)");
            LayoutParams layoutParams3 = findViewById3.getLayoutParams();
            if (layoutParams3 != null) {
                ((MarginLayoutParams) layoutParams3).topMargin = layoutParams2.height;
                findViewById(R.id.detailView).requestLayout();
                C0625r c0625r;
                View findViewById4;
                if (this.f4835c == AspectRatio.f4829c) {
                    c0625r = this.f4836d;
                    if (c0625r == null) {
                        C2885g.m13911b("mDragHelper");
                    }
                    findViewById4 = findViewById(R.id.detailView);
                    findViewById2 = findViewById(R.id.detailView);
                    C2885g.m13907a(findViewById2, "findViewById<View>(R.id.detailView)");
                    c0625r.m2517a(findViewById4, findViewById2.getLeft(), (int) (this.f4852t * 0.7f));
                } else {
                    c0625r = this.f4836d;
                    if (c0625r == null) {
                        C2885g.m13911b("mDragHelper");
                    }
                    findViewById4 = findViewById(R.id.detailView);
                    findViewById2 = findViewById(R.id.detailView);
                    C2885g.m13907a(findViewById2, "findViewById<View>(R.id.detailView)");
                    c0625r.m2517a(findViewById4, findViewById2.getLeft(), (int) ((this.f4853u * 9.0f) / 16.0f));
                }
                invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: m */
    private final void m6175m() {
        Object context = getContext();
        C2885g.m13907a(context, "context");
        this.f4837e = context.getResources().getDimensionPixelSize(R.dimen.dp16);
        context = getContext();
        C2885g.m13907a(context, "context");
        this.f4838f = context.getResources().getDimensionPixelSize(R.dimen.dp16);
    }

    /* renamed from: n */
    private final void m6176n() {
        float f = ((float) this.f4841i) * 1.0f;
        Object findViewById = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
        this.f4839g = f / ((float) findViewById.getLayoutParams().width);
        this.f4840h = this.f4839g;
        Object findViewById2 = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById2, "findViewById<View>(R.id.dragView)");
        findViewById = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
        findViewById2.setPivotX(((float) findViewById.getLayoutParams().width) - (((float) this.f4837e) / (1.0f - this.f4839g)));
        findViewById2 = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById2, "findViewById<View>(R.id.dragView)");
        Object findViewById3 = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById3, "findViewById<View>(R.id.dragView)");
        findViewById2.setPivotY(((float) findViewById3.getLayoutParams().height) - (((float) this.f4838f) / (1.0f - this.f4840h)));
    }

    /* renamed from: b */
    public final void m6181b() {
        switch (this.f4835c) {
            case f4827a:
                this.f4842j = (int) ((((float) this.f4841i) * 9.0f) / 16.0f);
                return;
            case f4828b:
                this.f4842j = (int) ((((float) this.f4841i) * 3.0f) / 4.0f);
                return;
            case f4829c:
                this.f4842j = (int) ((((float) this.f4841i) * 16.0f) / 9.0f);
                return;
            default:
                return;
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Object a = C0625r.m2493a((ViewGroup) this, 0.6f, (C0624a) this.f4832A);
        C2885g.m13907a(a, "ViewDragHelper.create(this, 0.6f, dragCallbacks)");
        this.f4836d = a;
    }

    public void computeScroll() {
        super.computeScroll();
        C0625r c0625r = this.f4836d;
        if (c0625r == null) {
            C2885g.m13911b("mDragHelper");
        }
        if (c0625r.m2518a(true)) {
            C0560r.m2189c(this);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = "ev";
        kotlin.jvm.internal.C2885g.m13910b(r6, r0);
        r0 = r5.f4833a;
        r1 = 0;
        r2 = java.lang.Boolean.valueOf(r1);
        r0 = kotlin.jvm.internal.C2885g.m13909a(r0, r2);
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = android.support.v4.view.C0549g.m2060a(r6);
        r0 = r0 & 255;
        r2 = 3;
        if (r0 == r2) goto L_0x0061;
    L_0x001c:
        switch(r0) {
            case 0: goto L_0x0020;
            case 1: goto L_0x0061;
            default: goto L_0x001f;
        };
    L_0x001f:
        goto L_0x0030;
    L_0x0020:
        r0 = android.support.v4.view.C0549g.m2062b(r6);
        r0 = android.support.v4.view.C0549g.m2061a(r6, r0);
        r5.f4847o = r0;
        r0 = r5.f4847o;
        r2 = -1;
        if (r0 != r2) goto L_0x0030;
    L_0x002f:
        return r1;
    L_0x0030:
        r0 = r5.f4836d;
        if (r0 != 0) goto L_0x0039;
    L_0x0034:
        r2 = "mDragHelper";
        kotlin.jvm.internal.C2885g.m13911b(r2);
    L_0x0039:
        r2 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r2 = r5.findViewById(r2);
        r3 = r6.getX();
        r3 = (int) r3;
        r4 = r6.getY();
        r4 = (int) r4;
        r0 = r0.m2524b(r2, r3, r4);
        r2 = r5.f4836d;
        if (r2 != 0) goto L_0x0057;
    L_0x0052:
        r3 = "mDragHelper";
        kotlin.jvm.internal.C2885g.m13911b(r3);
    L_0x0057:
        r6 = r2.m2516a(r6);
        if (r6 != 0) goto L_0x005f;
    L_0x005d:
        if (r0 == 0) goto L_0x0060;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        return r1;
    L_0x0061:
        r6 = r5.f4836d;
        if (r6 != 0) goto L_0x006a;
    L_0x0065:
        r0 = "mDragHelper";
        kotlin.jvm.internal.C2885g.m13911b(r0);
    L_0x006a:
        r6.m2531e();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private final boolean m6155a(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i3 = iArr2[0] + i;
        int i4 = iArr2[1] + i2;
        if (i3 >= iArr[0] && i3 < iArr[0] + view.getWidth() && i4 >= iArr[1]) {
            i2 = iArr[1];
            if (m6182c()) {
                view = view.getHeight();
                Object findViewById = findViewById(R.id.dragView);
                C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
                view -= findViewById.getHeight() / 2;
            } else {
                view = view.getHeight();
            }
            if (i4 < i2 + view) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C2885g.m13910b(motionEvent, "ev");
        int a = C0549g.m2060a(motionEvent);
        if ((a & 255) == 0) {
            this.f4847o = C0549g.m2061a(motionEvent, a);
        }
        boolean z = false;
        if (this.f4847o == -1) {
            return false;
        }
        C0625r c0625r = this.f4836d;
        if (c0625r == null) {
            C2885g.m13911b("mDragHelper");
        }
        c0625r.m2520b(motionEvent);
        View findViewById = findViewById(R.id.dragView);
        C2885g.m13907a((Object) findViewById, "findViewById<View>(R.id.dragView)");
        boolean a2 = m6155a(findViewById, (int) motionEvent.getX(), (int) motionEvent.getY());
        View findViewById2 = findViewById(R.id.detailView);
        C2885g.m13907a((Object) findViewById2, "findViewById<View>(R.id.detailView)");
        boolean a3 = m6155a(findViewById2, (int) motionEvent.getX(), (int) motionEvent.getY());
        m6152a(motionEvent, a2);
        if (m6183d()) {
            findViewById(R.id.dragView).dispatchTouchEvent(motionEvent);
        } else {
            findViewById(R.id.dragView).dispatchTouchEvent(m6151a(motionEvent, 3));
        }
        if (a2 || a3) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private final MotionEvent m6151a(MotionEvent motionEvent, int i) {
        Object obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
        C2885g.m13907a(obtain, "MotionEvent.obtain(event…event.y, event.metaState)");
        return obtain;
    }

    /* renamed from: a */
    private final void m6152a(MotionEvent motionEvent, boolean z) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f4848p = motionEvent.getX();
                return;
            case 1:
                if (m6179a(motionEvent, motionEvent.getX() - this.f4848p, z) == null) {
                    return;
                }
                if (m6182c() != null && m6184e() != null) {
                    m6186g();
                    return;
                } else if (m6183d() != null && m6185f() != null) {
                    m6187h();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (isInEditMode()) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        Object findViewById = findViewById(R.id.dragView);
        C2885g.m13907a(findViewById, "findViewById<View>(R.id.dragView)");
        if (findViewById.getTop() == 0) {
            View findViewById2 = findViewById(R.id.dragView);
            Object findViewById3 = findViewById(R.id.dragView);
            C2885g.m13907a(findViewById3, "findViewById<View>(R.id.dragView)");
            findViewById2.layout(i, i2, i3, findViewById3.getLayoutParams().height);
            View findViewById4 = findViewById(R.id.detailView);
            Object findViewById5 = findViewById(R.id.dragView);
            C2885g.m13907a(findViewById5, "findViewById<View>(R.id.dragView)");
            findViewById4.layout(i, findViewById5.getLayoutParams().height, i3, i4);
            findViewById(R.id.dragView).setY((float) i2);
            i = findViewById(R.id.detailView);
            Object findViewById6 = findViewById(R.id.dragView);
            C2885g.m13907a(findViewById6, "findViewById<View>(R.id.dragView)");
            i.setY((float) findViewById6.getLayoutParams().height);
        }
    }

    /* renamed from: c */
    public final boolean m6182c() {
        return this.f4843k;
    }

    /* renamed from: d */
    public final boolean m6183d() {
        return this.f4843k ^ 1;
    }

    /* renamed from: a */
    private final float m6149a(float f) {
        return 1.0f - (f * (1.0f - this.f4839g));
    }

    /* renamed from: b */
    private final float m6156b(float f) {
        return 1.0f - (f * (1.0f - this.f4840h));
    }

    /* renamed from: a */
    public final boolean m6179a(MotionEvent motionEvent, float f, boolean z) {
        C2885g.m13910b(motionEvent, "ev");
        return (Math.abs(f) >= ((float) this.f4849q) || motionEvent.getAction() == 2.8E-45f || !z) ? null : true;
    }

    /* renamed from: e */
    public final boolean m6184e() {
        return this.f4850r;
    }

    public final void setClickToMaximizeEnabled(boolean z) {
        this.f4850r = z;
    }

    /* renamed from: f */
    public final boolean m6185f() {
        return this.f4851s;
    }

    public final void setClickToMinimizeEnabled(boolean z) {
        this.f4851s = z;
    }

    /* renamed from: g */
    public final void m6186g() {
        C0625r c0625r = this.f4836d;
        if (c0625r == null) {
            C2885g.m13911b("mDragHelper");
        }
        if (c0625r.m2517a(findViewById(R.id.dragView), 0, 0)) {
            C0560r.m2189c(this);
            this.f4843k = false;
        }
    }

    /* renamed from: h */
    public final void m6187h() {
        C0625r c0625r = this.f4836d;
        if (c0625r == null) {
            C2885g.m13911b("mDragHelper");
        }
        if (c0625r.m2517a(findViewById(R.id.dragView), 0, this.f4845m)) {
            C0560r.m2189c(this);
            this.f4843k = true;
        }
    }

    /* renamed from: i */
    public final void m6188i() {
        this.f4833a = Boolean.valueOf(true);
    }
}
