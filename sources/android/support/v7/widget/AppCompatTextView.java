package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0557q;
import android.support.v4.widget.C0597b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

public class AppCompatTextView extends TextView implements C0557q, C0597b {
    /* renamed from: b */
    private final C0859f f13739b;
    /* renamed from: c */
    private final C0866m f13740c;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f13739b = new C0859f(this);
        this.f13739b.m3652a(attributeSet, i);
        this.f13740c = C0866m.m3712a((TextView) this);
        this.f13740c.mo831a(attributeSet, i);
        this.f13740c.mo830a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13739b != null) {
            this.f13739b.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13739b != null) {
            this.f13739b.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13739b != null) {
            this.f13739b.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13739b != null ? this.f13739b.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13739b != null) {
            this.f13739b.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13739b != null ? this.f13739b.m3653b() : null;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f13740c != null) {
            this.f13740c.m3721a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13739b != null) {
            this.f13739b.m3655c();
        }
        if (this.f13740c != null) {
            this.f13740c.mo830a();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13740c != null) {
            this.f13740c.m3725a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.f13740c != null) {
            this.f13740c.m3719a(i, f);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f13740c != null && a == null && this.f13740c.m3728c() != null) {
            this.f13740c.m3727b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f13740c != null) {
            this.f13740c.m3718a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f13740c != null) {
            this.f13740c.m3720a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f13740c != null) {
            this.f13740c.m3726a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        } else if (this.f13740c != null) {
            return this.f13740c.m3729d();
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        return this.f13740c != null ? this.f13740c.m3730e() : -1;
    }

    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        return this.f13740c != null ? this.f13740c.m3731f() : -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.f13740c != null ? this.f13740c.m3732g() : -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f13740c != null) {
            return this.f13740c.m3733h();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0863i.m3695a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
