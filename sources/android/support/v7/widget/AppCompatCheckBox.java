package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0620p;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements C0620p {
    /* renamed from: a */
    private final C0860g f13716a;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f13716a = new C0860g(this);
        this.f13716a.m3660a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f13716a != null) {
            this.f13716a.m3662c();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0680b.m2703b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f13716a != null ? this.f13716a.m3656a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f13716a != null) {
            this.f13716a.m3658a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        return this.f13716a != null ? this.f13716a.m3657a() : null;
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f13716a != null) {
            this.f13716a.m3659a(mode);
        }
    }

    public Mode getSupportButtonTintMode() {
        return this.f13716a != null ? this.f13716a.m3661b() : null;
    }
}
