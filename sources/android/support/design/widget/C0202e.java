package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.p013c.C0373a;
import android.support.v4.p016e.C0414c;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.widget.ay;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: android.support.design.widget.e */
final class C0202e {
    /* renamed from: a */
    private static final boolean f740a = (VERSION.SDK_INT < 18);
    /* renamed from: b */
    private static final Paint f741b = null;
    /* renamed from: A */
    private boolean f742A;
    /* renamed from: B */
    private Bitmap f743B;
    /* renamed from: C */
    private Paint f744C;
    /* renamed from: D */
    private float f745D;
    /* renamed from: E */
    private float f746E;
    /* renamed from: F */
    private float f747F;
    /* renamed from: G */
    private float f748G;
    /* renamed from: H */
    private int[] f749H;
    /* renamed from: I */
    private boolean f750I;
    /* renamed from: J */
    private final TextPaint f751J;
    /* renamed from: K */
    private Interpolator f752K;
    /* renamed from: L */
    private Interpolator f753L;
    /* renamed from: M */
    private float f754M;
    /* renamed from: N */
    private float f755N;
    /* renamed from: O */
    private float f756O;
    /* renamed from: P */
    private int f757P;
    /* renamed from: Q */
    private float f758Q;
    /* renamed from: R */
    private float f759R;
    /* renamed from: S */
    private float f760S;
    /* renamed from: T */
    private int f761T;
    /* renamed from: c */
    private final View f762c;
    /* renamed from: d */
    private boolean f763d;
    /* renamed from: e */
    private float f764e;
    /* renamed from: f */
    private final Rect f765f;
    /* renamed from: g */
    private final Rect f766g;
    /* renamed from: h */
    private final RectF f767h;
    /* renamed from: i */
    private int f768i = 16;
    /* renamed from: j */
    private int f769j = 16;
    /* renamed from: k */
    private float f770k = 15.0f;
    /* renamed from: l */
    private float f771l = 15.0f;
    /* renamed from: m */
    private ColorStateList f772m;
    /* renamed from: n */
    private ColorStateList f773n;
    /* renamed from: o */
    private float f774o;
    /* renamed from: p */
    private float f775p;
    /* renamed from: q */
    private float f776q;
    /* renamed from: r */
    private float f777r;
    /* renamed from: s */
    private float f778s;
    /* renamed from: t */
    private float f779t;
    /* renamed from: u */
    private Typeface f780u;
    /* renamed from: v */
    private Typeface f781v;
    /* renamed from: w */
    private Typeface f782w;
    /* renamed from: x */
    private CharSequence f783x;
    /* renamed from: y */
    private CharSequence f784y;
    /* renamed from: z */
    private boolean f785z;

    static {
        if (f741b != null) {
            f741b.setAntiAlias(true);
            f741b.setColor(-65281);
        }
    }

    public C0202e(View view) {
        this.f762c = view;
        this.f751J = new TextPaint(129);
        this.f766g = new Rect();
        this.f765f = new Rect();
        this.f767h = new RectF();
    }

    /* renamed from: a */
    void m722a(Interpolator interpolator) {
        this.f753L = interpolator;
        m741i();
    }

    /* renamed from: b */
    void m731b(Interpolator interpolator) {
        this.f752K = interpolator;
        m741i();
    }

    /* renamed from: a */
    void m716a(float f) {
        if (this.f770k != f) {
            this.f770k = f;
            m741i();
        }
    }

    /* renamed from: a */
    void m719a(ColorStateList colorStateList) {
        if (this.f773n != colorStateList) {
            this.f773n = colorStateList;
            m741i();
        }
    }

    /* renamed from: b */
    void m729b(ColorStateList colorStateList) {
        if (this.f772m != colorStateList) {
            this.f772m = colorStateList;
            m741i();
        }
    }

    /* renamed from: a */
    void m718a(int i, int i2, int i3, int i4) {
        if (!C0202e.m701a(this.f765f, i, i2, i3, i4)) {
            this.f765f.set(i, i2, i3, i4);
            this.f750I = true;
            m715a();
        }
    }

    /* renamed from: b */
    void m728b(int i, int i2, int i3, int i4) {
        if (!C0202e.m701a(this.f766g, i, i2, i3, i4)) {
            this.f766g.set(i, i2, i3, i4);
            this.f750I = true;
            m715a();
        }
    }

    /* renamed from: a */
    void m715a() {
        boolean z = this.f766g.width() > 0 && this.f766g.height() > 0 && this.f765f.width() > 0 && this.f765f.height() > 0;
        this.f763d = z;
    }

    /* renamed from: a */
    void m717a(int i) {
        if (this.f768i != i) {
            this.f768i = i;
            m741i();
        }
    }

    /* renamed from: b */
    int m725b() {
        return this.f768i;
    }

    /* renamed from: b */
    void m727b(int i) {
        if (this.f769j != i) {
            this.f769j = i;
            m741i();
        }
    }

    /* renamed from: c */
    int m732c() {
        return this.f769j;
    }

    /* renamed from: c */
    void m733c(int i) {
        ay a = ay.m3541a(this.f762c.getContext(), i, C0636j.TextAppearance);
        if (a.m3561g(C0636j.TextAppearance_android_textColor)) {
            this.f773n = a.m3557e(C0636j.TextAppearance_android_textColor);
        }
        if (a.m3561g(C0636j.TextAppearance_android_textSize)) {
            this.f771l = (float) a.m3556e(C0636j.TextAppearance_android_textSize, (int) this.f771l);
        }
        this.f757P = a.m3545a(C0636j.TextAppearance_android_shadowColor, 0);
        this.f755N = a.m3544a(C0636j.TextAppearance_android_shadowDx, 0.0f);
        this.f756O = a.m3544a(C0636j.TextAppearance_android_shadowDy, 0.0f);
        this.f754M = a.m3544a(C0636j.TextAppearance_android_shadowRadius, 0.0f);
        a.m3548a();
        if (VERSION.SDK_INT >= 16) {
            this.f780u = m706e(i);
        }
        m741i();
    }

    /* renamed from: d */
    void m736d(int i) {
        ay a = ay.m3541a(this.f762c.getContext(), i, C0636j.TextAppearance);
        if (a.m3561g(C0636j.TextAppearance_android_textColor)) {
            this.f772m = a.m3557e(C0636j.TextAppearance_android_textColor);
        }
        if (a.m3561g(C0636j.TextAppearance_android_textSize)) {
            this.f770k = (float) a.m3556e(C0636j.TextAppearance_android_textSize, (int) this.f770k);
        }
        this.f761T = a.m3545a(C0636j.TextAppearance_android_shadowColor, 0);
        this.f759R = a.m3544a(C0636j.TextAppearance_android_shadowDx, 0.0f);
        this.f760S = a.m3544a(C0636j.TextAppearance_android_shadowDy, 0.0f);
        this.f758Q = a.m3544a(C0636j.TextAppearance_android_shadowRadius, 0.0f);
        a.m3548a();
        if (VERSION.SDK_INT >= 16) {
            this.f781v = m706e(i);
        }
        m741i();
    }

    /* renamed from: e */
    private Typeface m706e(int i) {
        i = this.f762c.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = i.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            i.recycle();
            return 0;
        } finally {
            i.recycle();
        }
    }

    /* renamed from: a */
    void m721a(Typeface typeface) {
        if (m702a(this.f780u, typeface)) {
            this.f780u = typeface;
            m741i();
        }
    }

    /* renamed from: b */
    void m730b(Typeface typeface) {
        if (m702a(this.f781v, typeface)) {
            this.f781v = typeface;
            m741i();
        }
    }

    /* renamed from: c */
    void m734c(Typeface typeface) {
        this.f781v = typeface;
        this.f780u = typeface;
        m741i();
    }

    /* renamed from: d */
    Typeface m735d() {
        return this.f780u != null ? this.f780u : Typeface.DEFAULT;
    }

    /* renamed from: e */
    Typeface m737e() {
        return this.f781v != null ? this.f781v : Typeface.DEFAULT;
    }

    /* renamed from: b */
    void m726b(float f) {
        f = C0373a.m1374a(f, 0.0f, 1.0f);
        if (f != this.f764e) {
            this.f764e = f;
            m709l();
        }
    }

    /* renamed from: a */
    final boolean m724a(int[] iArr) {
        this.f749H = iArr;
        if (m738f() == null) {
            return null;
        }
        m741i();
        return 1;
    }

    /* renamed from: f */
    final boolean m738f() {
        return (this.f773n != null && this.f773n.isStateful()) || (this.f772m != null && this.f772m.isStateful());
    }

    /* renamed from: g */
    float m739g() {
        return this.f764e;
    }

    /* renamed from: h */
    float m740h() {
        return this.f771l;
    }

    /* renamed from: l */
    private void m709l() {
        m704c(this.f764e);
    }

    /* renamed from: c */
    private void m704c(float f) {
        m705d(f);
        this.f778s = C0202e.m698a(this.f776q, this.f777r, f, this.f752K);
        this.f779t = C0202e.m698a(this.f774o, this.f775p, f, this.f752K);
        m707e(C0202e.m698a(this.f770k, this.f771l, f, this.f753L));
        if (this.f773n != this.f772m) {
            this.f751J.setColor(C0202e.m699a(m710m(), m711n(), f));
        } else {
            this.f751J.setColor(m711n());
        }
        this.f751J.setShadowLayer(C0202e.m698a(this.f758Q, this.f754M, f, null), C0202e.m698a(this.f759R, this.f755N, f, null), C0202e.m698a(this.f760S, this.f756O, f, null), C0202e.m699a(this.f761T, this.f757P, f));
        C0560r.m2189c(this.f762c);
    }

    /* renamed from: m */
    private int m710m() {
        if (this.f749H != null) {
            return this.f772m.getColorForState(this.f749H, 0);
        }
        return this.f772m.getDefaultColor();
    }

    /* renamed from: n */
    private int m711n() {
        if (this.f749H != null) {
            return this.f773n.getColorForState(this.f749H, 0);
        }
        return this.f773n.getDefaultColor();
    }

    /* renamed from: o */
    private void m712o() {
        float f = this.f748G;
        m708f(this.f771l);
        float f2 = 0.0f;
        float measureText = this.f784y != null ? this.f751J.measureText(this.f784y, 0, this.f784y.length()) : 0.0f;
        int a = C0543c.m2037a(this.f769j, this.f785z);
        int i = a & 112;
        if (i == 48) {
            this.f775p = ((float) this.f766g.top) - this.f751J.ascent();
        } else if (i != 80) {
            this.f775p = ((float) this.f766g.centerY()) + (((this.f751J.descent() - this.f751J.ascent()) / 2.0f) - this.f751J.descent());
        } else {
            this.f775p = (float) this.f766g.bottom;
        }
        a &= 8388615;
        if (a == 1) {
            this.f777r = ((float) this.f766g.centerX()) - (measureText / 2.0f);
        } else if (a != 5) {
            this.f777r = (float) this.f766g.left;
        } else {
            this.f777r = ((float) this.f766g.right) - measureText;
        }
        m708f(this.f770k);
        if (this.f784y != null) {
            f2 = this.f751J.measureText(this.f784y, 0, this.f784y.length());
        }
        int a2 = C0543c.m2037a(this.f768i, this.f785z);
        int i2 = a2 & 112;
        if (i2 == 48) {
            this.f774o = ((float) this.f765f.top) - this.f751J.ascent();
        } else if (i2 != 80) {
            this.f774o = ((float) this.f765f.centerY()) + (((this.f751J.descent() - this.f751J.ascent()) / 2.0f) - this.f751J.descent());
        } else {
            this.f774o = (float) this.f765f.bottom;
        }
        a2 &= 8388615;
        if (a2 == 1) {
            this.f776q = ((float) this.f765f.centerX()) - (f2 / 2.0f);
        } else if (a2 != 5) {
            this.f776q = (float) this.f765f.left;
        } else {
            this.f776q = ((float) this.f765f.right) - f2;
        }
        m714q();
        m707e(f);
    }

    /* renamed from: d */
    private void m705d(float f) {
        this.f767h.left = C0202e.m698a((float) this.f765f.left, (float) this.f766g.left, f, this.f752K);
        this.f767h.top = C0202e.m698a(this.f774o, this.f775p, f, this.f752K);
        this.f767h.right = C0202e.m698a((float) this.f765f.right, (float) this.f766g.right, f, this.f752K);
        this.f767h.bottom = C0202e.m698a((float) this.f765f.bottom, (float) this.f766g.bottom, f, this.f752K);
    }

    /* renamed from: a */
    public void m720a(Canvas canvas) {
        int save = canvas.save();
        if (this.f784y != null && this.f763d) {
            float f;
            float f2 = this.f778s;
            float f3 = this.f779t;
            Object obj = (!this.f742A || this.f743B == null) ? null : 1;
            float f4;
            if (obj != null) {
                f = this.f745D * this.f747F;
                f4 = this.f746E;
                f4 = this.f747F;
            } else {
                f = this.f751J.ascent() * this.f747F;
                this.f751J.descent();
                f4 = this.f747F;
            }
            if (obj != null) {
                f3 += f;
            }
            float f5 = f3;
            if (this.f747F != 1.0f) {
                canvas.scale(this.f747F, this.f747F, f2, f5);
            }
            if (obj != null) {
                canvas.drawBitmap(this.f743B, f2, f5, this.f744C);
            } else {
                canvas.drawText(this.f784y, 0, this.f784y.length(), f2, f5, this.f751J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: b */
    private boolean m703b(CharSequence charSequence) {
        Object obj = 1;
        if (C0560r.m2193e(this.f762c) != 1) {
            obj = null;
        }
        return (obj != null ? C0414c.f1403d : C0414c.f1402c).mo328a(charSequence, 0, charSequence.length());
    }

    /* renamed from: e */
    private void m707e(float f) {
        m708f(f);
        f = (f740a == null || this.f747F == 1.0f) ? 0.0f : Float.MIN_VALUE;
        this.f742A = f;
        if (this.f742A != null) {
            m713p();
        }
        C0560r.m2189c(this.f762c);
    }

    /* renamed from: a */
    private boolean m702a(Typeface typeface, Typeface typeface2) {
        return ((typeface == null || typeface.equals(typeface2)) && (typeface != null || typeface2 == null)) ? null : true;
    }

    /* renamed from: f */
    private void m708f(float f) {
        if (this.f783x != null) {
            float f2;
            Object obj;
            float width = (float) this.f766g.width();
            float width2 = (float) this.f765f.width();
            boolean z = true;
            if (C0202e.m700a(f, this.f771l)) {
                Object obj2;
                f = this.f771l;
                this.f747F = 1.0f;
                if (m702a(this.f782w, this.f780u)) {
                    this.f782w = this.f780u;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                f2 = f;
                obj = obj2;
            } else {
                f2 = this.f770k;
                if (m702a(this.f782w, this.f781v)) {
                    this.f782w = this.f781v;
                    obj = 1;
                } else {
                    obj = null;
                }
                if (C0202e.m700a(f, this.f770k)) {
                    this.f747F = 1.0f;
                } else {
                    this.f747F = f / this.f770k;
                }
                f = this.f771l / this.f770k;
                width = width2 * f > width ? Math.min(width / f, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.f748G == f2 && this.f750I == null) {
                    if (obj == null) {
                        obj = null;
                        this.f748G = f2;
                        this.f750I = false;
                    }
                }
                obj = 1;
                this.f748G = f2;
                this.f750I = false;
            }
            if (this.f784y == null || r6 != null) {
                this.f751J.setTextSize(this.f748G);
                this.f751J.setTypeface(this.f782w);
                f = this.f751J;
                if (this.f747F == 1.0f) {
                    z = false;
                }
                f.setLinearText(z);
                f = TextUtils.ellipsize(this.f783x, this.f751J, width, TruncateAt.END);
                if (!TextUtils.equals(f, this.f784y)) {
                    this.f784y = f;
                    this.f785z = m703b(this.f784y);
                }
            }
        }
    }

    /* renamed from: p */
    private void m713p() {
        if (this.f743B == null && !this.f765f.isEmpty()) {
            if (!TextUtils.isEmpty(this.f784y)) {
                m704c(0.0f);
                this.f745D = this.f751J.ascent();
                this.f746E = this.f751J.descent();
                int round = Math.round(this.f751J.measureText(this.f784y, 0, this.f784y.length()));
                int round2 = Math.round(this.f746E - this.f745D);
                if (round > 0) {
                    if (round2 > 0) {
                        this.f743B = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                        new Canvas(this.f743B).drawText(this.f784y, 0, this.f784y.length(), 0.0f, ((float) round2) - this.f751J.descent(), this.f751J);
                        if (this.f744C == null) {
                            this.f744C = new Paint(3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public void m741i() {
        if (this.f762c.getHeight() > 0 && this.f762c.getWidth() > 0) {
            m712o();
            m709l();
        }
    }

    /* renamed from: a */
    void m723a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f783x)) {
            this.f783x = charSequence;
            this.f784y = null;
            m714q();
            m741i();
        }
    }

    /* renamed from: j */
    CharSequence m742j() {
        return this.f783x;
    }

    /* renamed from: q */
    private void m714q() {
        if (this.f743B != null) {
            this.f743B.recycle();
            this.f743B = null;
        }
    }

    /* renamed from: a */
    private static boolean m700a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: k */
    ColorStateList m743k() {
        return this.f773n;
    }

    /* renamed from: a */
    private static int m699a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m698a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return C0189a.m669a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m701a(Rect rect, int i, int i2, int i3, int i4) {
        return (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) ? true : null;
    }
}
