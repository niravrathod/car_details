package android.support.v7.p024d.p025a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.p009a.p010a.C0295a;

/* renamed from: android.support.v7.d.a.a */
public class C0682a extends Drawable implements Callback {
    /* renamed from: a */
    private Drawable f2188a;

    public C0682a(Drawable drawable) {
        m2710a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f2188a.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        this.f2188a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f2188a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f2188a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f2188a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2188a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f2188a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2188a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f2188a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f2188a.setState(iArr);
    }

    public int[] getState() {
        return this.f2188a.getState();
    }

    public void jumpToCurrentState() {
        C0295a.m1046a(this.f2188a);
    }

    public Drawable getCurrent() {
        return this.f2188a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f2188a.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public int getOpacity() {
        return this.f2188a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f2188a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f2188a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f2188a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f2188a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f2188a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f2188a.getPadding(rect);
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
        return this.f2188a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        C0295a.m1054a(this.f2188a, z);
    }

    public boolean isAutoMirrored() {
        return C0295a.m1055b(this.f2188a);
    }

    public void setTint(int i) {
        C0295a.m1048a(this.f2188a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0295a.m1050a(this.f2188a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0295a.m1053a(this.f2188a, mode);
    }

    public void setHotspot(float f, float f2) {
        C0295a.m1047a(this.f2188a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0295a.m1049a(this.f2188a, i, i2, i3, i4);
    }

    /* renamed from: b */
    public Drawable m2711b() {
        return this.f2188a;
    }

    /* renamed from: a */
    public void m2710a(Drawable drawable) {
        if (this.f2188a != null) {
            this.f2188a.setCallback(null);
        }
        this.f2188a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
