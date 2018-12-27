package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.C0143a.C0134c;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0560r;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.g */
class C0209g {
    /* renamed from: a */
    static final Interpolator f800a = C0189a.f701c;
    /* renamed from: j */
    static final int[] f801j = new int[]{16842919, 16842910};
    /* renamed from: k */
    static final int[] f802k = new int[]{16842908, 16842910};
    /* renamed from: l */
    static final int[] f803l = new int[]{16842910};
    /* renamed from: m */
    static final int[] f804m = new int[0];
    /* renamed from: b */
    int f805b = 0;
    /* renamed from: c */
    C3070i f806c;
    /* renamed from: d */
    Drawable f807d;
    /* renamed from: e */
    Drawable f808e;
    /* renamed from: f */
    C0201c f809f;
    /* renamed from: g */
    Drawable f810g;
    /* renamed from: h */
    float f811h;
    /* renamed from: i */
    float f812i;
    /* renamed from: n */
    final VisibilityAwareImageButton f813n;
    /* renamed from: o */
    final C0211j f814o;
    /* renamed from: p */
    private final C0218l f815p;
    /* renamed from: q */
    private float f816q;
    /* renamed from: r */
    private final Rect f817r = new Rect();
    /* renamed from: s */
    private OnPreDrawListener f818s;

    /* renamed from: android.support.design.widget.g$3 */
    class C02063 implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ C0209g f795a;

        C02063(C0209g c0209g) {
            this.f795a = c0209g;
        }

        public boolean onPreDraw() {
            this.f795a.m776j();
            return true;
        }
    }

    /* renamed from: android.support.design.widget.g$c */
    interface C0207c {
        /* renamed from: a */
        void mo121a();

        /* renamed from: b */
        void mo122b();
    }

    /* renamed from: android.support.design.widget.g$e */
    private abstract class C0208e extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        /* renamed from: a */
        private boolean f796a;
        /* renamed from: b */
        final /* synthetic */ C0209g f797b;
        /* renamed from: c */
        private float f798c;
        /* renamed from: d */
        private float f799d;

        /* renamed from: a */
        protected abstract float mo152a();

        private C0208e(C0209g c0209g) {
            this.f797b = c0209g;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f796a) {
                this.f798c = this.f797b.f806c.m15085a();
                this.f799d = mo152a();
                this.f796a = true;
            }
            this.f797b.f806c.m15089b(this.f798c + ((this.f799d - this.f798c) * valueAnimator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            this.f797b.f806c.m15089b(this.f799d);
            this.f796a = null;
        }
    }

    /* renamed from: android.support.design.widget.g$a */
    private class C3066a extends C0208e {
        /* renamed from: a */
        final /* synthetic */ C0209g f12982a;

        /* renamed from: a */
        protected float mo152a() {
            return 0.0f;
        }

        C3066a(C0209g c0209g) {
            this.f12982a = c0209g;
            super();
        }
    }

    /* renamed from: android.support.design.widget.g$b */
    private class C3067b extends C0208e {
        /* renamed from: a */
        final /* synthetic */ C0209g f12983a;

        C3067b(C0209g c0209g) {
            this.f12983a = c0209g;
            super();
        }

        /* renamed from: a */
        protected float mo152a() {
            return this.f12983a.f811h + this.f12983a.f812i;
        }
    }

    /* renamed from: android.support.design.widget.g$d */
    private class C3068d extends C0208e {
        /* renamed from: a */
        final /* synthetic */ C0209g f12984a;

        C3068d(C0209g c0209g) {
            this.f12984a = c0209g;
            super();
        }

        /* renamed from: a */
        protected float mo152a() {
            return this.f12984a.f811h;
        }
    }

    /* renamed from: b */
    void mo160b(Rect rect) {
    }

    /* renamed from: d */
    void mo161d() {
    }

    /* renamed from: h */
    boolean mo162h() {
        return true;
    }

    C0209g(VisibilityAwareImageButton visibilityAwareImageButton, C0211j c0211j) {
        this.f813n = visibilityAwareImageButton;
        this.f814o = c0211j;
        this.f815p = new C0218l();
        this.f815p.m806a(f801j, m749a(new C3067b(this)));
        this.f815p.m806a(f802k, m749a(new C3067b(this)));
        this.f815p.m806a(f803l, m749a(new C3068d(this)));
        this.f815p.m806a(f804m, m749a(new C3066a(this)));
        this.f816q = this.f813n.getRotation();
    }

    /* renamed from: a */
    void mo156a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        this.f807d = C0295a.m1061g(m777k());
        C0295a.m1050a(this.f807d, colorStateList);
        if (mode != null) {
            C0295a.m1053a(this.f807d, mode);
        }
        this.f808e = C0295a.m1061g(m777k());
        C0295a.m1050a(this.f808e, C0209g.m750b(i));
        if (i2 > 0) {
            this.f809f = m755a(i2, colorStateList);
            colorStateList = new Drawable[]{this.f809f, this.f807d, this.f808e};
        } else {
            this.f809f = null;
            colorStateList = new Drawable[]{this.f807d, this.f808e};
        }
        this.f810g = new LayerDrawable(colorStateList);
        this.f806c = new C3070i(this.f813n.getContext(), this.f810g, this.f814o.mo126a(), this.f811h, this.f811h + this.f812i);
        this.f806c.m15088a(false);
        this.f814o.mo128a(this.f806c);
    }

    /* renamed from: a */
    void m759a(ColorStateList colorStateList) {
        if (this.f807d != null) {
            C0295a.m1050a(this.f807d, colorStateList);
        }
        if (this.f809f != null) {
            this.f809f.m696a(colorStateList);
        }
    }

    /* renamed from: a */
    void m761a(Mode mode) {
        if (this.f807d != null) {
            C0295a.m1053a(this.f807d, mode);
        }
    }

    /* renamed from: a */
    void mo155a(int i) {
        if (this.f808e != null) {
            C0295a.m1050a(this.f808e, C0209g.m750b(i));
        }
    }

    /* renamed from: a */
    final void m756a(float f) {
        if (this.f811h != f) {
            this.f811h = f;
            mo154a(f, this.f812i);
        }
    }

    /* renamed from: a */
    float mo153a() {
        return this.f811h;
    }

    /* renamed from: b */
    final void m766b(float f) {
        if (this.f812i != f) {
            this.f812i = f;
            mo154a(this.f811h, f);
        }
    }

    /* renamed from: a */
    void mo154a(float f, float f2) {
        if (this.f806c != null) {
            this.f806c.m15087a(f, this.f812i + f);
            m771e();
        }
    }

    /* renamed from: a */
    void mo158a(int[] iArr) {
        this.f815p.m805a(iArr);
    }

    /* renamed from: b */
    void mo159b() {
        this.f815p.m804a();
    }

    /* renamed from: a */
    void m763a(final C0207c c0207c, final boolean z) {
        if (!m780n()) {
            this.f813n.animate().cancel();
            if (m752p()) {
                this.f805b = 1;
                this.f813n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0189a.f701c).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0209g f790c;
                    /* renamed from: d */
                    private boolean f791d;

                    public void onAnimationStart(Animator animator) {
                        this.f790c.f813n.m668a(0, z);
                        this.f791d = false;
                    }

                    public void onAnimationCancel(Animator animator) {
                        this.f791d = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f790c.f805b = 0;
                        if (this.f791d == null) {
                            this.f790c.f813n.m668a(z ? 8 : 4, z);
                            if (c0207c != null) {
                                c0207c.mo122b();
                            }
                        }
                    }
                });
            } else {
                this.f813n.m668a(z ? 8 : 4, z);
                if (c0207c != null) {
                    c0207c.mo122b();
                }
            }
        }
    }

    /* renamed from: b */
    void m768b(final C0207c c0207c, final boolean z) {
        if (!m779m()) {
            this.f813n.animate().cancel();
            if (m752p()) {
                this.f805b = 2;
                if (this.f813n.getVisibility() != 0) {
                    this.f813n.setAlpha(0.0f);
                    this.f813n.setScaleY(0.0f);
                    this.f813n.setScaleX(0.0f);
                }
                this.f813n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0189a.f702d).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0209g f794c;

                    public void onAnimationStart(Animator animator) {
                        this.f794c.f813n.m668a(0, z);
                    }

                    public void onAnimationEnd(Animator animator) {
                        this.f794c.f805b = 0;
                        if (c0207c != null) {
                            c0207c.mo121a();
                        }
                    }
                });
            } else {
                this.f813n.m668a(0, z);
                this.f813n.setAlpha(1.0f);
                this.f813n.setScaleY(1.0f);
                this.f813n.setScaleX(1.0f);
                if (c0207c != null) {
                    c0207c.mo121a();
                }
            }
        }
    }

    /* renamed from: c */
    final Drawable m769c() {
        return this.f810g;
    }

    /* renamed from: e */
    final void m771e() {
        Rect rect = this.f817r;
        mo157a(rect);
        mo160b(rect);
        this.f814o.mo127a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: a */
    void mo157a(Rect rect) {
        this.f806c.getPadding(rect);
    }

    /* renamed from: f */
    void m772f() {
        if (mo162h()) {
            m751o();
            this.f813n.getViewTreeObserver().addOnPreDrawListener(this.f818s);
        }
    }

    /* renamed from: g */
    void m773g() {
        if (this.f818s != null) {
            this.f813n.getViewTreeObserver().removeOnPreDrawListener(this.f818s);
            this.f818s = null;
        }
    }

    /* renamed from: a */
    C0201c m755a(int i, ColorStateList colorStateList) {
        Context context = this.f813n.getContext();
        C0201c i2 = mo163i();
        i2.m695a(C0389b.m1438c(context, C0134c.design_fab_stroke_top_outer_color), C0389b.m1438c(context, C0134c.design_fab_stroke_top_inner_color), C0389b.m1438c(context, C0134c.design_fab_stroke_end_inner_color), C0389b.m1438c(context, C0134c.design_fab_stroke_end_outer_color));
        i2.m694a((float) i);
        i2.m696a(colorStateList);
        return i2;
    }

    /* renamed from: i */
    C0201c mo163i() {
        return new C0201c();
    }

    /* renamed from: j */
    void m776j() {
        float rotation = this.f813n.getRotation();
        if (this.f816q != rotation) {
            this.f816q = rotation;
            m753q();
        }
    }

    /* renamed from: o */
    private void m751o() {
        if (this.f818s == null) {
            this.f818s = new C02063(this);
        }
    }

    /* renamed from: k */
    GradientDrawable m777k() {
        GradientDrawable l = mo164l();
        l.setShape(1);
        l.setColor(-1);
        return l;
    }

    /* renamed from: l */
    GradientDrawable mo164l() {
        return new GradientDrawable();
    }

    /* renamed from: m */
    boolean m779m() {
        boolean z = false;
        if (this.f813n.getVisibility() != 0) {
            if (this.f805b == 2) {
                z = true;
            }
            return z;
        }
        if (this.f805b != 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    boolean m780n() {
        boolean z = false;
        if (this.f813n.getVisibility() == 0) {
            if (this.f805b == 1) {
                z = true;
            }
            return z;
        }
        if (this.f805b != 2) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.animation.ValueAnimator m749a(android.support.design.widget.C0209g.C0208e r4) {
        /*
        r3 = this;
        r0 = new android.animation.ValueAnimator;
        r0.<init>();
        r1 = f800a;
        r0.setInterpolator(r1);
        r1 = 100;
        r0.setDuration(r1);
        r0.addListener(r4);
        r0.addUpdateListener(r4);
        r4 = 2;
        r4 = new float[r4];
        r4 = {0, 1065353216};
        r0.setFloatValues(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.g.a(android.support.design.widget.g$e):android.animation.ValueAnimator");
    }

    /* renamed from: b */
    private static ColorStateList m750b(int i) {
        r1 = new int[3][];
        int[] iArr = new int[]{f802k, i, f801j};
        iArr[1] = i;
        r1[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r1, iArr);
    }

    /* renamed from: p */
    private boolean m752p() {
        return C0560r.m2212x(this.f813n) && !this.f813n.isInEditMode();
    }

    /* renamed from: q */
    private void m753q() {
        if (VERSION.SDK_INT == 19) {
            if (this.f816q % 90.0f != 0.0f) {
                if (this.f813n.getLayerType() != 1) {
                    this.f813n.setLayerType(1, null);
                }
            } else if (this.f813n.getLayerType() != 0) {
                this.f813n.setLayerType(0, null);
            }
        }
        if (this.f806c != null) {
            this.f806c.m15086a(-this.f816q);
        }
        if (this.f809f != null) {
            this.f809f.m697b(-this.f816q);
        }
    }
}
