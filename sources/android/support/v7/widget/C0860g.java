package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.widget.C0605e;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.g */
class C0860g {
    /* renamed from: a */
    private final CompoundButton f2921a;
    /* renamed from: b */
    private ColorStateList f2922b = null;
    /* renamed from: c */
    private Mode f2923c = null;
    /* renamed from: d */
    private boolean f2924d = false;
    /* renamed from: e */
    private boolean f2925e = false;
    /* renamed from: f */
    private boolean f2926f;

    C0860g(CompoundButton compoundButton) {
        this.f2921a = compoundButton;
    }

    /* renamed from: a */
    void m3660a(AttributeSet attributeSet, int i) {
        attributeSet = this.f2921a.getContext().obtainStyledAttributes(attributeSet, C0636j.CompoundButton, i, 0);
        try {
            if (attributeSet.hasValue(C0636j.CompoundButton_android_button) != 0) {
                i = attributeSet.getResourceId(C0636j.CompoundButton_android_button, 0);
                if (i != 0) {
                    this.f2921a.setButtonDrawable(C0680b.m2703b(this.f2921a.getContext(), i));
                }
            }
            if (attributeSet.hasValue(C0636j.CompoundButton_buttonTint) != 0) {
                C0605e.m2432a(this.f2921a, attributeSet.getColorStateList(C0636j.CompoundButton_buttonTint));
            }
            if (attributeSet.hasValue(C0636j.CompoundButton_buttonTintMode) != 0) {
                C0605e.m2433a(this.f2921a, C0885y.m3861a(attributeSet.getInt(C0636j.CompoundButton_buttonTintMode, -1), null));
            }
            attributeSet.recycle();
        } catch (Throwable th) {
            attributeSet.recycle();
        }
    }

    /* renamed from: a */
    void m3658a(ColorStateList colorStateList) {
        this.f2922b = colorStateList;
        this.f2924d = true;
        m3663d();
    }

    /* renamed from: a */
    ColorStateList m3657a() {
        return this.f2922b;
    }

    /* renamed from: a */
    void m3659a(Mode mode) {
        this.f2923c = mode;
        this.f2925e = true;
        m3663d();
    }

    /* renamed from: b */
    Mode m3661b() {
        return this.f2923c;
    }

    /* renamed from: c */
    void m3662c() {
        if (this.f2926f) {
            this.f2926f = false;
            return;
        }
        this.f2926f = true;
        m3663d();
    }

    /* renamed from: d */
    void m3663d() {
        Drawable a = C0605e.m2431a(this.f2921a);
        if (a == null) {
            return;
        }
        if (this.f2924d || this.f2925e) {
            a = C0295a.m1061g(a).mutate();
            if (this.f2924d) {
                C0295a.m1050a(a, this.f2922b);
            }
            if (this.f2925e) {
                C0295a.m1053a(a, this.f2923c);
            }
            if (a.isStateful()) {
                a.setState(this.f2921a.getDrawableState());
            }
            this.f2921a.setButtonDrawable(a);
        }
    }

    /* renamed from: a */
    int m3656a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0605e.m2431a(this.f2921a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
