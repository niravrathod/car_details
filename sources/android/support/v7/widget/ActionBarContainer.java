package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0637a.C0632f;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionBarContainer extends FrameLayout {
    /* renamed from: a */
    Drawable f2335a;
    /* renamed from: b */
    Drawable f2336b;
    /* renamed from: c */
    Drawable f2337c;
    /* renamed from: d */
    boolean f2338d;
    /* renamed from: e */
    boolean f2339e;
    /* renamed from: f */
    private boolean f2340f;
    /* renamed from: g */
    private View f2341g;
    /* renamed from: h */
    private View f2342h;
    /* renamed from: i */
    private View f2343i;
    /* renamed from: j */
    private int f2344j;

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContainer(android.content.Context r3, android.util.AttributeSet r4) {
        /*
        r2 = this;
        r2.<init>(r3, r4);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x000f;
    L_0x0009:
        r0 = new android.support.v7.widget.c;
        r0.<init>(r2);
        goto L_0x0014;
    L_0x000f:
        r0 = new android.support.v7.widget.b;
        r0.<init>(r2);
    L_0x0014:
        android.support.v4.view.C0560r.m2174a(r2, r0);
        r0 = android.support.v7.p020a.C0637a.C0636j.ActionBar;
        r3 = r3.obtainStyledAttributes(r4, r0);
        r4 = android.support.v7.p020a.C0637a.C0636j.ActionBar_background;
        r4 = r3.getDrawable(r4);
        r2.f2335a = r4;
        r4 = android.support.v7.p020a.C0637a.C0636j.ActionBar_backgroundStacked;
        r4 = r3.getDrawable(r4);
        r2.f2336b = r4;
        r4 = android.support.v7.p020a.C0637a.C0636j.ActionBar_height;
        r0 = -1;
        r4 = r3.getDimensionPixelSize(r4, r0);
        r2.f2344j = r4;
        r4 = r2.getId();
        r0 = android.support.v7.p020a.C0637a.C0632f.split_action_bar;
        r1 = 1;
        if (r4 != r0) goto L_0x0049;
    L_0x003f:
        r2.f2338d = r1;
        r4 = android.support.v7.p020a.C0637a.C0636j.ActionBar_backgroundSplit;
        r4 = r3.getDrawable(r4);
        r2.f2337c = r4;
    L_0x0049:
        r3.recycle();
        r3 = r2.f2338d;
        r4 = 0;
        if (r3 == 0) goto L_0x0057;
    L_0x0051:
        r3 = r2.f2337c;
        if (r3 != 0) goto L_0x0060;
    L_0x0055:
        r4 = 1;
        goto L_0x0060;
    L_0x0057:
        r3 = r2.f2335a;
        if (r3 != 0) goto L_0x0060;
    L_0x005b:
        r3 = r2.f2336b;
        if (r3 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0055;
    L_0x0060:
        r2.setWillNotDraw(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2342h = findViewById(C0632f.action_bar);
        this.f2343i = findViewById(C0632f.action_context_bar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.f2335a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.f2335a;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.f2335a;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.f2335a = r5;
        if (r5 == 0) goto L_0x0037;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.f2342h;
        if (r5 == 0) goto L_0x0037;
    L_0x001a:
        r5 = r4.f2335a;
        r0 = r4.f2342h;
        r0 = r0.getLeft();
        r1 = r4.f2342h;
        r1 = r1.getTop();
        r2 = r4.f2342h;
        r2 = r2.getRight();
        r3 = r4.f2342h;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x0037:
        r5 = r4.f2338d;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0043;
    L_0x003d:
        r5 = r4.f2337c;
        if (r5 != 0) goto L_0x004c;
    L_0x0041:
        r0 = 1;
        goto L_0x004c;
    L_0x0043:
        r5 = r4.f2335a;
        if (r5 != 0) goto L_0x004c;
    L_0x0047:
        r5 = r4.f2336b;
        if (r5 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0041;
    L_0x004c:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r0 = r4.f2336b;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r4.f2336b;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r4.f2336b;
        r4.unscheduleDrawable(r0);
    L_0x000f:
        r4.f2336b = r5;
        if (r5 == 0) goto L_0x003b;
    L_0x0013:
        r5.setCallback(r4);
        r5 = r4.f2339e;
        if (r5 == 0) goto L_0x003b;
    L_0x001a:
        r5 = r4.f2336b;
        if (r5 == 0) goto L_0x003b;
    L_0x001e:
        r5 = r4.f2336b;
        r0 = r4.f2341g;
        r0 = r0.getLeft();
        r1 = r4.f2341g;
        r1 = r1.getTop();
        r2 = r4.f2341g;
        r2 = r2.getRight();
        r3 = r4.f2341g;
        r3 = r3.getBottom();
        r5.setBounds(r0, r1, r2, r3);
    L_0x003b:
        r5 = r4.f2338d;
        r0 = 0;
        r1 = 1;
        if (r5 == 0) goto L_0x0047;
    L_0x0041:
        r5 = r4.f2337c;
        if (r5 != 0) goto L_0x0050;
    L_0x0045:
        r0 = 1;
        goto L_0x0050;
    L_0x0047:
        r5 = r4.f2335a;
        if (r5 != 0) goto L_0x0050;
    L_0x004b:
        r5 = r4.f2336b;
        if (r5 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0045;
    L_0x0050:
        r4.setWillNotDraw(r0);
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
        /*
        r3 = this;
        r0 = r3.f2337c;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r3.f2337c;
        r1 = 0;
        r0.setCallback(r1);
        r0 = r3.f2337c;
        r3.unscheduleDrawable(r0);
    L_0x000f:
        r3.f2337c = r4;
        r0 = 0;
        if (r4 == 0) goto L_0x002c;
    L_0x0014:
        r4.setCallback(r3);
        r4 = r3.f2338d;
        if (r4 == 0) goto L_0x002c;
    L_0x001b:
        r4 = r3.f2337c;
        if (r4 == 0) goto L_0x002c;
    L_0x001f:
        r4 = r3.f2337c;
        r1 = r3.getMeasuredWidth();
        r2 = r3.getMeasuredHeight();
        r4.setBounds(r0, r0, r1, r2);
    L_0x002c:
        r4 = r3.f2338d;
        r1 = 1;
        if (r4 == 0) goto L_0x0037;
    L_0x0031:
        r4 = r3.f2337c;
        if (r4 != 0) goto L_0x0040;
    L_0x0035:
        r0 = 1;
        goto L_0x0040;
    L_0x0037:
        r4 = r3.f2335a;
        if (r4 != 0) goto L_0x0040;
    L_0x003b:
        r4 = r3.f2336b;
        if (r4 != 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0035;
    L_0x0040:
        r3.setWillNotDraw(r0);
        r3.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        i = i == 0 ? 1 : 0;
        if (this.f2335a != null) {
            this.f2335a.setVisible(i, false);
        }
        if (this.f2336b != null) {
            this.f2336b.setVisible(i, false);
        }
        if (this.f2337c != null) {
            this.f2337c.setVisible(i, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return ((drawable != this.f2335a || this.f2338d) && (!(drawable == this.f2336b && this.f2339e) && (!(drawable == this.f2337c && this.f2338d) && super.verifyDrawable(drawable) == null))) ? null : true;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2335a != null && this.f2335a.isStateful()) {
            this.f2335a.setState(getDrawableState());
        }
        if (this.f2336b != null && this.f2336b.isStateful()) {
            this.f2336b.setState(getDrawableState());
        }
        if (this.f2337c != null && this.f2337c.isStateful()) {
            this.f2337c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2335a != null) {
            this.f2335a.jumpToCurrentState();
        }
        if (this.f2336b != null) {
            this.f2336b.jumpToCurrentState();
        }
        if (this.f2337c != null) {
            this.f2337c.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f2340f = z;
        setDescendantFocusability(z ? true : true);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f2340f) {
            if (super.onInterceptTouchEvent(motionEvent) == null) {
                return null;
            }
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.f2341g != null) {
            removeView(this.f2341g);
        }
        this.f2341g = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f2341g;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    /* renamed from: a */
    private boolean m2857a(View view) {
        if (!(view == null || view.getVisibility() == 8)) {
            if (view.getMeasuredHeight() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private int m2858b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return (view.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
    }

    public void onMeasure(int i, int i2) {
        if (this.f2342h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f2344j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f2344j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2342h != 0) {
            i = MeasureSpec.getMode(i2);
            if (!(this.f2341g == null || this.f2341g.getVisibility() == 8 || i == 1073741824)) {
                int b = !m2857a(this.f2342h) ? m2858b(this.f2342h) : !m2857a(this.f2343i) ? m2858b(this.f2343i) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + m2858b(this.f2341g), i == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : BaseClientBuilder.API_PRIORITY_OTHER));
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z = this.f2341g;
        i4 = 1;
        int i5 = 0;
        boolean z2 = z && z.getVisibility() != 8;
        if (z && z.getVisibility() != 8) {
            i2 = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z.getLayoutParams();
            z.layout(i, (i2 - z.getMeasuredHeight()) - layoutParams.bottomMargin, i3, i2 - layoutParams.bottomMargin);
        }
        if (this.f2338d == 0) {
            if (this.f2335a != 0) {
                if (this.f2342h.getVisibility() == 0) {
                    this.f2335a.setBounds(this.f2342h.getLeft(), this.f2342h.getTop(), this.f2342h.getRight(), this.f2342h.getBottom());
                } else if (this.f2343i == 0 || this.f2343i.getVisibility() != 0) {
                    this.f2335a.setBounds(0, 0, 0, 0);
                } else {
                    this.f2335a.setBounds(this.f2343i.getLeft(), this.f2343i.getTop(), this.f2343i.getRight(), this.f2343i.getBottom());
                }
                i5 = 1;
            }
            this.f2339e = z2;
            if (!z2 || this.f2336b == 0) {
                i4 = i5;
            } else {
                this.f2336b.setBounds(z.getLeft(), z.getTop(), z.getRight(), z.getBottom());
            }
        } else if (this.f2337c) {
            this.f2337c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            invalidate();
        }
    }
}
