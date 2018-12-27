package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0557q;
import android.support.v4.widget.C0597b;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

public class AppCompatButton extends Button implements C0557q, C0597b {
    /* renamed from: b */
    private final C0859f f13714b;
    /* renamed from: c */
    private final C0866m f13715c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f13714b = new C0859f(this);
        this.f13714b.m3652a(attributeSet, i);
        this.f13715c = C0866m.m3712a((TextView) this);
        this.f13715c.mo831a(attributeSet, i);
        this.f13715c.mo830a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13714b != null) {
            this.f13714b.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13714b != null) {
            this.f13714b.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13714b != null) {
            this.f13714b.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13714b != null ? this.f13714b.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13714b != null) {
            this.f13714b.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13714b != null ? this.f13714b.m3653b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13714b != null) {
            this.f13714b.m3655c();
        }
        if (this.f13715c != null) {
            this.f13715c.mo830a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f13715c != null) {
            this.f13715c.m3721a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13715c != null) {
            this.f13715c.m3725a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.f13715c != null) {
            this.f13715c.m3719a(i, f);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f13715c != null && a == null && this.f13715c.m3728c() != null) {
            this.f13715c.m3727b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f13715c != null) {
            this.f13715c.m3718a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f13715c != null) {
            this.f13715c.m3720a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f13715c != null) {
            this.f13715c.m3726a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        } else if (this.f13715c != null) {
            return this.f13715c.m3729d();
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        return this.f13715c != null ? this.f13715c.m3730e() : -1;
    }

    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        return this.f13715c != null ? this.f13715c.m3731f() : -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.f13715c != null ? this.f13715c.m3732g() : -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f13715c != null) {
            return this.f13715c.m3733h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f13715c != null) {
            this.f13715c.m3724a(z);
        }
    }
}
