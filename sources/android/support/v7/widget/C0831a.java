package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0568v;
import android.support.v4.view.C0569w;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C0831a extends ViewGroup {
    /* renamed from: a */
    protected final C3253a f2741a;
    /* renamed from: b */
    protected final Context f2742b;
    /* renamed from: c */
    protected ActionMenuView f2743c;
    /* renamed from: d */
    protected ActionMenuPresenter f2744d;
    /* renamed from: e */
    protected int f2745e;
    /* renamed from: f */
    protected C0568v f2746f;
    /* renamed from: g */
    private boolean f2747g;
    /* renamed from: h */
    private boolean f2748h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C3253a implements C0569w {
        /* renamed from: a */
        int f13893a;
        /* renamed from: b */
        final /* synthetic */ C0831a f13894b;
        /* renamed from: c */
        private boolean f13895c = null;

        protected C3253a(C0831a c0831a) {
            this.f13894b = c0831a;
        }

        /* renamed from: a */
        public C3253a m16639a(C0568v c0568v, int i) {
            this.f13894b.f2746f = c0568v;
            this.f13893a = i;
            return this;
        }

        /* renamed from: a */
        public void mo452a(View view) {
            super.setVisibility(0);
            this.f13895c = false;
        }

        /* renamed from: b */
        public void mo453b(View view) {
            if (this.f13895c == null) {
                this.f13894b.f2746f = null;
                super.setVisibility(this.f13893a);
            }
        }

        /* renamed from: c */
        public void mo454c(View view) {
            this.f13895c = true;
        }
    }

    /* renamed from: a */
    protected static int m3430a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    C0831a(Context context) {
        this(context, null);
    }

    C0831a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0831a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2741a = new C3253a(this);
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(C0627a.actionBarPopupTheme, attributeSet, true) == 0 || attributeSet.resourceId == 0) {
            this.f2742b = context;
        } else {
            this.f2742b = new ContextThemeWrapper(context, attributeSet.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0636j.ActionBar, C0627a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0636j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f2744d != null) {
            this.f2744d.m24507a(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2747g = false;
        }
        if (!this.f2747g) {
            motionEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && motionEvent == null) {
                this.f2747g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2747g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2748h = false;
        }
        if (!this.f2748h) {
            motionEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && motionEvent == null) {
                this.f2748h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2748h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2745e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.f2745e;
    }

    public int getAnimatedVisibility() {
        if (this.f2746f != null) {
            return this.f2741a.f13893a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public C0568v mo616a(int i, long j) {
        if (this.f2746f != null) {
            this.f2746f.m2243b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0568v a = C0560r.m2199k(this).m2236a(1.0f);
            a.m2237a(j);
            a.m2238a(this.f2741a.m16639a(a, i));
            return a;
        }
        a = C0560r.m2199k(this).m2236a(0.0f);
        a.m2237a(j);
        a.m2238a(this.f2741a.m16639a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f2746f != null) {
                this.f2746f.m2243b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo617a() {
        return this.f2744d != null ? this.f2744d.m24523f() : false;
    }

    /* renamed from: a */
    protected int m3433a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(null, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: a */
    protected int m3434a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        i2 += (i3 - measuredHeight) / 2;
        if (z) {
            view.layout(i - measuredWidth, i2, i, measuredHeight + i2);
        } else {
            view.layout(i, i2, i + measuredWidth, measuredHeight + i2);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
