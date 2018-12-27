package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0568v;
import android.support.v4.widget.C3185k;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p024d.p025a.C0682a;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.z */
class C0888z extends ListView {
    /* renamed from: a */
    private final Rect f3018a = new Rect();
    /* renamed from: b */
    private int f3019b = 0;
    /* renamed from: c */
    private int f3020c = 0;
    /* renamed from: d */
    private int f3021d = 0;
    /* renamed from: e */
    private int f3022e = 0;
    /* renamed from: f */
    private int f3023f;
    /* renamed from: g */
    private Field f3024g;
    /* renamed from: h */
    private C3272a f3025h;
    /* renamed from: i */
    private boolean f3026i;
    /* renamed from: j */
    private boolean f3027j;
    /* renamed from: k */
    private boolean f3028k;
    /* renamed from: l */
    private C0568v f3029l;
    /* renamed from: m */
    private C3185k f3030m;
    /* renamed from: n */
    private C0887b f3031n;

    /* renamed from: android.support.v7.widget.z$b */
    private class C0887b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0888z f3017a;

        private C0887b(C0888z c0888z) {
            this.f3017a = c0888z;
        }

        public void run() {
            this.f3017a.f3031n = null;
            this.f3017a.drawableStateChanged();
        }

        /* renamed from: a */
        public void m3866a() {
            this.f3017a.f3031n = null;
            this.f3017a.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m3867b() {
            this.f3017a.post(this);
        }
    }

    /* renamed from: android.support.v7.widget.z$a */
    private static class C3272a extends C0682a {
        /* renamed from: a */
        private boolean f13986a = true;

        C3272a(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: a */
        void m16887a(boolean z) {
            this.f13986a = z;
        }

        public boolean setState(int[] iArr) {
            return this.f13986a ? super.setState(iArr) : null;
        }

        public void draw(Canvas canvas) {
            if (this.f13986a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f13986a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f13986a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setVisible(boolean z, boolean z2) {
            return this.f13986a ? super.setVisible(z, z2) : false;
        }
    }

    C0888z(Context context, boolean z) {
        super(context, null, C0627a.dropDownListViewStyle);
        this.f3027j = z;
        setCacheColorHint(0);
        try {
            this.f3024g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3024g.setAccessible(true);
        } catch (Context context2) {
            context2.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f3027j && this.f3026i) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        if (!this.f3027j) {
            if (!super.hasWindowFocus()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFocused() {
        if (!this.f3027j) {
            if (!super.isFocused()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasFocus() {
        if (!this.f3027j) {
            if (!super.hasFocus()) {
                return false;
            }
        }
        return true;
    }

    public void setSelector(Drawable drawable) {
        this.f3025h = drawable != null ? new C3272a(drawable) : null;
        super.setSelector(this.f3025h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3019b = rect.left;
        this.f3020c = rect.top;
        this.f3021d = rect.right;
        this.f3022e = rect.bottom;
    }

    protected void drawableStateChanged() {
        if (this.f3031n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m3869a();
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        m3872a(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3023f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f3031n != null) {
            this.f3031n.m3866a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public int mo698a(int i, int i2, int i3, int i4, int i5) {
        i2 = getListPaddingTop();
        i3 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return i2 + i3;
        }
        i2 += i3;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = i2;
        View view = null;
        i2 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i2 < count) {
            int itemViewType = adapter.getItemViewType(i2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i2, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                itemViewType = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                itemViewType = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, itemViewType);
            view.forceLayout();
            if (i2 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i2 > i5 && i8 > 0 && i6 != i4) {
                    i4 = i8;
                }
                return i4;
            }
            if (i5 >= 0 && i2 >= i5) {
                i8 = i6;
            }
            i2++;
        }
        return i6;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f3025h != null) {
            this.f3025h.m16887a(z);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3031n == null) {
            this.f3031n = new C0887b();
            this.f3031n.m3867b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9) {
            if (actionMasked != 7) {
                setSelection(-1);
                return onHoverEvent;
            }
        }
        motionEvent = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (!(motionEvent == -1 || motionEvent == getSelectedItemPosition())) {
            View childAt = getChildAt(motionEvent - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(motionEvent, childAt.getTop() - getTop());
            }
            m3869a();
        }
        return onHoverEvent;
    }

    protected void onDetachedFromWindow() {
        this.f3031n = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public boolean mo699a(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                i = 0;
                z = false;
                break;
            default:
                i = 0;
                z = true;
                break;
        }
        i = motionEvent.findPointerIndex(i);
        if (i < 0) {
            i = 0;
            z = false;
            if (!(z && r9 == 0)) {
                m3875b();
            }
            if (!z) {
                if (this.f3030m == 0) {
                    this.f3030m = new C3185k(this);
                }
                this.f3030m.m2365a(true);
                this.f3030m.onTouch(this, motionEvent);
            } else if (this.f3030m != null) {
                this.f3030m.m2365a(false);
            }
            return z;
        }
        int x = (int) motionEvent.getX(i);
        i = (int) motionEvent.getY(i);
        int pointToPosition = pointToPosition(x, i);
        if (pointToPosition == -1) {
            i = 1;
            m3875b();
            if (!z) {
                if (this.f3030m == 0) {
                    this.f3030m = new C3185k(this);
                }
                this.f3030m.m2365a(true);
                this.f3030m.onTouch(this, motionEvent);
            } else if (this.f3030m != null) {
                this.f3030m.m2365a(false);
            }
            return z;
        }
        View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
        m3874a(childAt, pointToPosition, (float) x, (float) i);
        if (actionMasked == 1) {
            m3873a(childAt, pointToPosition);
        }
        i = 0;
        z = true;
        m3875b();
        if (!z) {
            if (this.f3030m == 0) {
                this.f3030m = new C3185k(this);
            }
            this.f3030m.m2365a(true);
            this.f3030m.onTouch(this, motionEvent);
        } else if (this.f3030m != null) {
            this.f3030m.m2365a(false);
        }
        return z;
    }

    /* renamed from: a */
    private void m3873a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    void setListSelectionHidden(boolean z) {
        this.f3026i = z;
    }

    /* renamed from: a */
    private void m3869a() {
        Drawable selector = getSelector();
        if (selector != null && m3877c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m3872a(Canvas canvas) {
        if (!this.f3018a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f3018a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m3871a(int i, View view, float f, float f2) {
        m3870a(i, view);
        view = getSelector();
        if (view != null && i != -1) {
            C0295a.m1047a(view, f, f2);
        }
    }

    /* renamed from: a */
    private void m3870a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        Object obj = (selector == null || i == -1) ? null : 1;
        if (obj != null) {
            selector.setVisible(false, false);
        }
        m3876b(i, view);
        if (obj != null) {
            i = this.f3018a;
            view = i.exactCenterX();
            i = i.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0295a.m1047a(selector, view, i);
        }
    }

    /* renamed from: b */
    private void m3876b(int i, View view) {
        Rect rect = this.f3018a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3019b;
        rect.top -= this.f3020c;
        rect.right += this.f3021d;
        rect.bottom += this.f3022e;
        try {
            boolean z = this.f3024g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3024g.set(this, Boolean.valueOf(z ^ 1));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (int i2) {
            i2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m3875b() {
        this.f3028k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3023f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f3029l != null) {
            this.f3029l.m2243b();
            this.f3029l = null;
        }
    }

    /* renamed from: a */
    private void m3874a(View view, int i, float f, float f2) {
        this.f3028k = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f3023f != -1) {
            View childAt = getChildAt(this.f3023f - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f3023f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m3871a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: c */
    private boolean m3877c() {
        return this.f3028k;
    }
}
