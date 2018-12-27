package android.support.v4.p009a.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C3095d.C0298a;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.a.a.f */
class C4757f extends C4426e {
    /* renamed from: d */
    private static Method f20826d;

    /* renamed from: android.support.v4.a.a.f$a */
    private static class C3097a extends C0298a {
        C3097a(C0298a c0298a, Resources resources) {
            super(c0298a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4757f(this, resources);
        }
    }

    C4757f(Drawable drawable) {
        super(drawable);
        m27615d();
    }

    C4757f(C0298a c0298a, Resources resources) {
        super(c0298a, resources);
        m27615d();
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo4597c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (mo4597c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo4597c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (super.setState(iArr) == null) {
            return null;
        }
        invalidateSelf();
        return 1;
    }

    /* renamed from: c */
    protected boolean mo4597c() {
        boolean z = false;
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    C0298a mo3739b() {
        return new C3097a(this.b, null);
    }

    /* renamed from: d */
    private void m27615d() {
        if (f20826d == null) {
            try {
                f20826d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
