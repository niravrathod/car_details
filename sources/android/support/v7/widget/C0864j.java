package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0614j;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.j */
public class C0864j {
    /* renamed from: a */
    private final ImageView f2943a;
    /* renamed from: b */
    private aw f2944b;
    /* renamed from: c */
    private aw f2945c;
    /* renamed from: d */
    private aw f2946d;

    public C0864j(ImageView imageView) {
        this.f2943a = imageView;
    }

    /* renamed from: a */
    public void m3701a(AttributeSet attributeSet, int i) {
        attributeSet = ay.m3543a(this.f2943a.getContext(), attributeSet, C0636j.AppCompatImageView, i, 0);
        try {
            i = this.f2943a.getDrawable();
            if (i == 0) {
                int g = attributeSet.m3560g(C0636j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    i = C0680b.m2703b(this.f2943a.getContext(), g);
                    if (i != 0) {
                        this.f2943a.setImageDrawable(i);
                    }
                }
            }
            if (i != 0) {
                C0885y.m3863b(i);
            }
            if (attributeSet.m3561g(C0636j.AppCompatImageView_tint) != 0) {
                C0614j.m2456a(this.f2943a, attributeSet.m3557e(C0636j.AppCompatImageView_tint));
            }
            if (attributeSet.m3561g(C0636j.AppCompatImageView_tintMode) != 0) {
                C0614j.m2457a(this.f2943a, C0885y.m3861a(attributeSet.m3545a(C0636j.AppCompatImageView_tintMode, -1), null));
            }
            attributeSet.m3548a();
        } catch (Throwable th) {
            attributeSet.m3548a();
        }
    }

    /* renamed from: a */
    public void m3698a(int i) {
        if (i != 0) {
            i = C0680b.m2703b(this.f2943a.getContext(), i);
            if (i != 0) {
                C0885y.m3863b(i);
            }
            this.f2943a.setImageDrawable(i);
        } else {
            this.f2943a.setImageDrawable(null);
        }
        m3705d();
    }

    /* renamed from: a */
    boolean m3702a() {
        return VERSION.SDK_INT < 21 || !(this.f2943a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: a */
    void m3699a(ColorStateList colorStateList) {
        if (this.f2945c == null) {
            this.f2945c = new aw();
        }
        this.f2945c.f2845a = colorStateList;
        this.f2945c.f2848d = true;
        m3705d();
    }

    /* renamed from: b */
    ColorStateList m3703b() {
        return this.f2945c != null ? this.f2945c.f2845a : null;
    }

    /* renamed from: a */
    void m3700a(Mode mode) {
        if (this.f2945c == null) {
            this.f2945c = new aw();
        }
        this.f2945c.f2846b = mode;
        this.f2945c.f2847c = true;
        m3705d();
    }

    /* renamed from: c */
    Mode m3704c() {
        return this.f2945c != null ? this.f2945c.f2846b : null;
    }

    /* renamed from: d */
    void m3705d() {
        Drawable drawable = this.f2943a.getDrawable();
        if (drawable != null) {
            C0885y.m3863b(drawable);
        }
        if (drawable != null && (!m3697e() || !m3696a(drawable))) {
            if (this.f2945c != null) {
                C0862h.m3674a(drawable, this.f2945c, this.f2943a.getDrawableState());
            } else if (this.f2944b != null) {
                C0862h.m3674a(drawable, this.f2944b, this.f2943a.getDrawableState());
            }
        }
    }

    /* renamed from: e */
    private boolean m3697e() {
        int i = VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        } else {
            if (this.f2944b != null) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    private boolean m3696a(Drawable drawable) {
        if (this.f2946d == null) {
            this.f2946d = new aw();
        }
        aw awVar = this.f2946d;
        awVar.m3540a();
        ColorStateList a = C0614j.m2455a(this.f2943a);
        if (a != null) {
            awVar.f2848d = true;
            awVar.f2845a = a;
        }
        Mode b = C0614j.m2458b(this.f2943a);
        if (b != null) {
            awVar.f2847c = true;
            awVar.f2846b = b;
        }
        if (!awVar.f2848d) {
            if (!awVar.f2847c) {
                return null;
            }
        }
        C0862h.m3674a(drawable, awVar, this.f2943a.getDrawableState());
        return true;
    }
}
