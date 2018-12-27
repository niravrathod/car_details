package android.support.design.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0143a.C0142k;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat {
    /* renamed from: a */
    protected boolean f12812a;
    /* renamed from: b */
    boolean f12813b;
    /* renamed from: c */
    private Drawable f12814c;
    /* renamed from: d */
    private final Rect f12815d;
    /* renamed from: e */
    private final Rect f12816e;
    /* renamed from: f */
    private int f12817f;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12815d = new Rect();
        this.f12816e = new Rect();
        this.f12817f = 119;
        this.f12812a = true;
        this.f12813b = false;
        context = context.obtainStyledAttributes(attributeSet, C0142k.ForegroundLinearLayout, i, 0);
        this.f12817f = context.getInt(C0142k.ForegroundLinearLayout_android_foregroundGravity, this.f12817f);
        attributeSet = context.getDrawable(C0142k.ForegroundLinearLayout_android_foreground);
        if (attributeSet != null) {
            setForeground(attributeSet);
        }
        this.f12812a = context.getBoolean(C0142k.ForegroundLinearLayout_foregroundInsidePadding, true);
        context.recycle();
    }

    public int getForegroundGravity() {
        return this.f12817f;
    }

    public void setForegroundGravity(int i) {
        if (this.f12817f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f12817f = i;
            if (this.f12817f == 119 && this.f12814c != 0) {
                this.f12814c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f12814c) {
                return null;
            }
        }
        return true;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f12814c != null) {
            this.f12814c.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f12814c != null && this.f12814c.isStateful()) {
            this.f12814c.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f12814c != drawable) {
            if (this.f12814c != null) {
                this.f12814c.setCallback(null);
                unscheduleDrawable(this.f12814c);
            }
            this.f12814c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12817f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f12814c;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12813b = z | this.f12813b;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12813b = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12814c != null) {
            Drawable drawable = this.f12814c;
            if (this.f12813b) {
                this.f12813b = false;
                Rect rect = this.f12815d;
                Rect rect2 = this.f12816e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f12812a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f12817f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f12814c != null) {
            this.f12814c.setHotspot(f, f2);
        }
    }
}
