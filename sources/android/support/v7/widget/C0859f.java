package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.f */
class C0859f {
    /* renamed from: a */
    private final View f2915a;
    /* renamed from: b */
    private final C0862h f2916b;
    /* renamed from: c */
    private int f2917c = -1;
    /* renamed from: d */
    private aw f2918d;
    /* renamed from: e */
    private aw f2919e;
    /* renamed from: f */
    private aw f2920f;

    C0859f(View view) {
        this.f2915a = view;
        this.f2916b = C0862h.m3671a();
    }

    /* renamed from: a */
    void m3652a(AttributeSet attributeSet, int i) {
        attributeSet = ay.m3543a(this.f2915a.getContext(), attributeSet, C0636j.ViewBackgroundHelper, i, 0);
        try {
            if (attributeSet.m3561g(C0636j.ViewBackgroundHelper_android_background) != 0) {
                this.f2917c = attributeSet.m3560g(C0636j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f2916b.m3694b(this.f2915a.getContext(), this.f2917c);
                if (b != 0) {
                    m3654b(b);
                }
            }
            if (attributeSet.m3561g(C0636j.ViewBackgroundHelper_backgroundTint) != 0) {
                C0560r.m2170a(this.f2915a, attributeSet.m3557e(C0636j.ViewBackgroundHelper_backgroundTint));
            }
            if (attributeSet.m3561g(C0636j.ViewBackgroundHelper_backgroundTintMode) != 0) {
                C0560r.m2172a(this.f2915a, C0885y.m3861a(attributeSet.m3545a(C0636j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            attributeSet.m3548a();
        } catch (Throwable th) {
            attributeSet.m3548a();
        }
    }

    /* renamed from: a */
    void m3648a(int i) {
        this.f2917c = i;
        m3654b(this.f2916b != null ? this.f2916b.m3694b(this.f2915a.getContext(), i) : 0);
        m3655c();
    }

    /* renamed from: a */
    void m3651a(Drawable drawable) {
        this.f2917c = -1;
        m3654b((ColorStateList) null);
        m3655c();
    }

    /* renamed from: a */
    void m3649a(ColorStateList colorStateList) {
        if (this.f2919e == null) {
            this.f2919e = new aw();
        }
        this.f2919e.f2845a = colorStateList;
        this.f2919e.f2848d = true;
        m3655c();
    }

    /* renamed from: a */
    ColorStateList m3647a() {
        return this.f2919e != null ? this.f2919e.f2845a : null;
    }

    /* renamed from: a */
    void m3650a(Mode mode) {
        if (this.f2919e == null) {
            this.f2919e = new aw();
        }
        this.f2919e.f2846b = mode;
        this.f2919e.f2847c = true;
        m3655c();
    }

    /* renamed from: b */
    Mode m3653b() {
        return this.f2919e != null ? this.f2919e.f2846b : null;
    }

    /* renamed from: c */
    void m3655c() {
        Drawable background = this.f2915a.getBackground();
        if (background != null && (!m3646d() || !m3645b(background))) {
            if (this.f2919e != null) {
                C0862h.m3674a(background, this.f2919e, this.f2915a.getDrawableState());
            } else if (this.f2918d != null) {
                C0862h.m3674a(background, this.f2918d, this.f2915a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    void m3654b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2918d == null) {
                this.f2918d = new aw();
            }
            this.f2918d.f2845a = colorStateList;
            this.f2918d.f2848d = true;
        } else {
            this.f2918d = null;
        }
        m3655c();
    }

    /* renamed from: d */
    private boolean m3646d() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        } else {
            if (this.f2918d != null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: b */
    private boolean m3645b(Drawable drawable) {
        if (this.f2920f == null) {
            this.f2920f = new aw();
        }
        aw awVar = this.f2920f;
        awVar.m3540a();
        ColorStateList t = C0560r.m2208t(this.f2915a);
        if (t != null) {
            awVar.f2848d = true;
            awVar.f2845a = t;
        }
        Mode u = C0560r.m2209u(this.f2915a);
        if (u != null) {
            awVar.f2847c = true;
            awVar.f2846b = u;
        }
        if (!awVar.f2848d) {
            if (!awVar.f2847c) {
                return null;
            }
        }
        C0862h.m3674a(drawable, awVar, this.f2915a.getDrawableState());
        return true;
    }
}
