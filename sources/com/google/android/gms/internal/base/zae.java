package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zae extends Drawable implements Callback {
    /* renamed from: a */
    private int f9894a;
    /* renamed from: b */
    private long f9895b;
    /* renamed from: c */
    private int f9896c;
    /* renamed from: d */
    private int f9897d;
    /* renamed from: e */
    private int f9898e;
    /* renamed from: f */
    private int f9899f;
    /* renamed from: g */
    private int f9900g;
    /* renamed from: h */
    private boolean f9901h;
    /* renamed from: i */
    private boolean f9902i;
    /* renamed from: j */
    private C2460d f9903j;
    /* renamed from: k */
    private Drawable f9904k;
    /* renamed from: l */
    private Drawable f9905l;
    /* renamed from: m */
    private boolean f9906m;
    /* renamed from: n */
    private boolean f9907n;
    /* renamed from: o */
    private boolean f9908o;
    /* renamed from: p */
    private int f9909p;

    public zae(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = C2458b.f9889a;
        }
        this.f9904k = drawable;
        drawable.setCallback(this);
        C2460d c2460d = this.f9903j;
        c2460d.f9892b = drawable.getChangingConfigurations() | c2460d.f9892b;
        if (drawable2 == null) {
            drawable2 = C2458b.f9889a;
        }
        this.f9905l = drawable2;
        drawable2.setCallback(this);
        drawable = this.f9903j;
        drawable.f9892b = drawable2.getChangingConfigurations() | drawable.f9892b;
    }

    zae(C2460d c2460d) {
        this.f9894a = 0;
        this.f9898e = 255;
        this.f9900g = 0;
        this.f9901h = true;
        this.f9903j = new C2460d(c2460d);
    }

    public final void invalidateDrawable(Drawable drawable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.unscheduleDrawable(this, runnable);
        }
    }

    public final int getChangingConfigurations() {
        return (super.getChangingConfigurations() | this.f9903j.f9891a) | this.f9903j.f9892b;
    }

    public final void setAlpha(int i) {
        if (this.f9900g == this.f9898e) {
            this.f9900g = i;
        }
        this.f9898e = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9904k.setColorFilter(colorFilter);
        this.f9905l.setColorFilter(colorFilter);
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f9904k.getIntrinsicWidth(), this.f9905l.getIntrinsicWidth());
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f9904k.getIntrinsicHeight(), this.f9905l.getIntrinsicHeight());
    }

    protected final void onBoundsChange(Rect rect) {
        this.f9904k.setBounds(rect);
        this.f9905l.setBounds(rect);
    }

    public final ConstantState getConstantState() {
        if (!m11317b()) {
            return null;
        }
        this.f9903j.f9891a = getChangingConfigurations();
        return this.f9903j;
    }

    public final int getOpacity() {
        if (!this.f9908o) {
            this.f9909p = Drawable.resolveOpacity(this.f9904k.getOpacity(), this.f9905l.getOpacity());
            this.f9908o = true;
        }
        return this.f9909p;
    }

    /* renamed from: b */
    private final boolean m11317b() {
        if (!this.f9906m) {
            boolean z = (this.f9904k.getConstantState() == null || this.f9905l.getConstantState() == null) ? false : true;
            this.f9907n = z;
            this.f9906m = true;
        }
        return this.f9907n;
    }

    public final Drawable mutate() {
        if (!this.f9902i && super.mutate() == this) {
            if (m11317b()) {
                this.f9904k.mutate();
                this.f9905l.mutate();
                this.f9902i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* renamed from: a */
    public final Drawable m11318a() {
        return this.f9905l;
    }

    /* renamed from: a */
    public final void m11319a(int i) {
        this.f9896c = 0;
        this.f9897d = this.f9898e;
        this.f9900g = 0;
        this.f9899f = 250;
        this.f9894a = 1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Object obj = 1;
        switch (this.f9894a) {
            case 1:
                this.f9895b = SystemClock.uptimeMillis();
                this.f9894a = 2;
                obj = null;
                break;
            case 2:
                if (this.f9895b >= 0) {
                    float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f9895b)) / ((float) this.f9899f);
                    if (uptimeMillis < 1.0f) {
                        obj = null;
                    }
                    if (obj != null) {
                        this.f9894a = 0;
                    }
                    this.f9900g = (int) ((((float) this.f9897d) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
                    break;
                }
                break;
            default:
                break;
        }
        int i = this.f9900g;
        boolean z = this.f9901h;
        Drawable drawable = this.f9904k;
        Drawable drawable2 = this.f9905l;
        if (obj != null) {
            if (!z || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f9898e) {
                drawable2.setAlpha(this.f9898e);
                drawable2.draw(canvas);
            }
            return;
        }
        if (z) {
            drawable.setAlpha(this.f9898e - i);
        }
        drawable.draw(canvas);
        if (z) {
            drawable.setAlpha(this.f9898e);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f9898e);
        }
        invalidateSelf();
    }
}
