package android.support.v4.p009a.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.a.a.d */
class C3095d extends Drawable implements Callback, C0296b, C0297c {
    /* renamed from: a */
    static final Mode f13096a = Mode.SRC_IN;
    /* renamed from: b */
    C0298a f13097b;
    /* renamed from: c */
    Drawable f13098c;
    /* renamed from: d */
    private int f13099d;
    /* renamed from: e */
    private Mode f13100e;
    /* renamed from: f */
    private boolean f13101f;
    /* renamed from: g */
    private boolean f13102g;

    /* renamed from: android.support.v4.a.a.d$a */
    protected static abstract class C0298a extends ConstantState {
        /* renamed from: a */
        int f1042a;
        /* renamed from: b */
        ConstantState f1043b;
        /* renamed from: c */
        ColorStateList f1044c = null;
        /* renamed from: d */
        Mode f1045d = C3095d.f13096a;

        public abstract Drawable newDrawable(Resources resources);

        C0298a(C0298a c0298a, Resources resources) {
            if (c0298a != null) {
                this.f1042a = c0298a.f1042a;
                this.f1043b = c0298a.f1043b;
                this.f1044c = c0298a.f1044c;
                this.f1045d = c0298a.f1045d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            return this.f1042a | (this.f1043b != null ? this.f1043b.getChangingConfigurations() : 0);
        }

        /* renamed from: a */
        boolean m1066a() {
            return this.f1043b != null;
        }
    }

    /* renamed from: android.support.v4.a.a.d$b */
    private static class C3094b extends C0298a {
        C3094b(C0298a c0298a, Resources resources) {
            super(c0298a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3095d(this, resources);
        }
    }

    /* renamed from: c */
    protected boolean mo4597c() {
        return true;
    }

    C3095d(C0298a c0298a, Resources resources) {
        this.f13097b = c0298a;
        m15291a(resources);
    }

    C3095d(Drawable drawable) {
        this.f13097b = mo3739b();
        mo249a(drawable);
    }

    /* renamed from: a */
    private void m15291a(Resources resources) {
        if (this.f13097b != null && this.f13097b.f1043b != null) {
            mo249a(this.f13097b.f1043b.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.f13098c.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f13098c.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f13098c != null) {
            this.f13098c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f13098c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | (this.f13097b != null ? this.f13097b.getChangingConfigurations() : 0)) | this.f13098c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f13098c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f13098c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f13098c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f13098c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo4597c() || this.f13097b == null) ? null : this.f13097b.f1044c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f13098c.isStateful();
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f13098c.setState(iArr);
        if (m15292a(iArr) == null) {
            if (!state) {
                return null;
            }
        }
        return 1;
    }

    public int[] getState() {
        return this.f13098c.getState();
    }

    public Drawable getCurrent() {
        return this.f13098c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f13098c.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public int getOpacity() {
        return this.f13098c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f13098c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f13098c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f13098c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f13098c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f13098c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f13098c.getPadding(rect);
    }

    public ConstantState getConstantState() {
        if (this.f13097b == null || !this.f13097b.m1066a()) {
            return null;
        }
        this.f13097b.f1042a = getChangingConfigurations();
        return this.f13097b;
    }

    public Drawable mutate() {
        if (!this.f13102g && super.mutate() == this) {
            this.f13097b = mo3739b();
            if (this.f13098c != null) {
                this.f13098c.mutate();
            }
            if (this.f13097b != null) {
                this.f13097b.f1043b = this.f13098c != null ? this.f13098c.getConstantState() : null;
            }
            this.f13102g = true;
        }
        return this;
    }

    /* renamed from: b */
    C0298a mo3739b() {
        return new C3094b(this.f13097b, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean onLevelChange(int i) {
        return this.f13098c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f13097b.f1044c = colorStateList;
        m15292a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f13097b.f1045d = mode;
        m15292a(getState());
    }

    /* renamed from: a */
    private boolean m15292a(int[] iArr) {
        if (!mo4597c()) {
            return false;
        }
        ColorStateList colorStateList = this.f13097b.f1044c;
        Mode mode = this.f13097b.f1045d;
        if (colorStateList == null || mode == null) {
            this.f13101f = false;
            clearColorFilter();
        } else {
            iArr = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f13101f && iArr == this.f13099d && mode == this.f13100e)) {
                setColorFilter(iArr, mode);
                this.f13099d = iArr;
                this.f13100e = mode;
                this.f13101f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo248a() {
        return this.f13098c;
    }

    /* renamed from: a */
    public final void mo249a(Drawable drawable) {
        if (this.f13098c != null) {
            this.f13098c.setCallback(null);
        }
        this.f13098c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f13097b != null) {
                this.f13097b.f1043b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
