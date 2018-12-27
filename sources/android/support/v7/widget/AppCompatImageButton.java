package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.C0557q;
import android.support.v4.widget.C0621q;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton implements C0557q, C0621q {
    /* renamed from: a */
    private final C0859f f13719a;
    /* renamed from: b */
    private final C0864j f13720b;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(av.m3538a(context), attributeSet, i);
        this.f13719a = new C0859f(this);
        this.f13719a.m3652a(attributeSet, i);
        this.f13720b = new C0864j(this);
        this.f13720b.m3701a(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.f13720b.m3698a(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f13720b != null) {
            this.f13720b.m3705d();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f13720b != null) {
            this.f13720b.m3705d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f13720b != null) {
            this.f13720b.m3705d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f13719a != null) {
            this.f13719a.m3648a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f13719a != null) {
            this.f13719a.m3651a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13719a != null) {
            this.f13719a.m3649a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f13719a != null ? this.f13719a.m3647a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f13719a != null) {
            this.f13719a.m3650a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f13719a != null ? this.f13719a.m3653b() : null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f13720b != null) {
            this.f13720b.m3699a(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f13720b != null ? this.f13720b.m3703b() : null;
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f13720b != null) {
            this.f13720b.m3700a(mode);
        }
    }

    public Mode getSupportImageTintMode() {
        return this.f13720b != null ? this.f13720b.m3704c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f13719a != null) {
            this.f13719a.m3655c();
        }
        if (this.f13720b != null) {
            this.f13720b.m3705d();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f13720b.m3702a() && super.hasOverlappingRendering();
    }
}
