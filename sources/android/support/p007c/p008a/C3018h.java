package android.support.p007c.p008a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p009a.p010a.C0296b;

/* renamed from: android.support.c.a.h */
abstract class C3018h extends Drawable implements C0296b {
    /* renamed from: b */
    Drawable f12737b;

    C3018h() {
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f12737b != null) {
            this.f12737b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        return this.f12737b != null ? C0295a.m1059e(this.f12737b) : null;
    }

    protected boolean onLevelChange(int i) {
        if (this.f12737b != null) {
            return this.f12737b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f12737b != null) {
            this.f12737b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f12737b != null) {
            C0295a.m1047a(this.f12737b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f12737b != null) {
            C0295a.m1049a(this.f12737b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f12737b != null) {
            this.f12737b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f12737b != null) {
            C0295a.m1046a(this.f12737b);
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f12737b != null) {
            C0295a.m1051a(this.f12737b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f12737b != null) {
            this.f12737b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f12737b != null) {
            return this.f12737b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f12737b != null) {
            return this.f12737b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f12737b != null) {
            return this.f12737b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f12737b != null) {
            return this.f12737b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f12737b != null) {
            return this.f12737b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f12737b != null) {
            return this.f12737b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f12737b != null) {
            this.f12737b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f12737b != null) {
            return this.f12737b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
