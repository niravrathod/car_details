package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    /* renamed from: a */
    private int f2736a;
    /* renamed from: b */
    private int f2737b;
    /* renamed from: c */
    private WeakReference<View> f2738c;
    /* renamed from: d */
    private LayoutInflater f2739d;
    /* renamed from: e */
    private C0830a f2740e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0830a {
        /* renamed from: a */
        void m3428a(ViewStubCompat viewStubCompat, View view);
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2736a = 0;
        context = context.obtainStyledAttributes(attributeSet, C0636j.ViewStubCompat, i, 0);
        this.f2737b = context.getResourceId(C0636j.ViewStubCompat_android_inflatedId, -1);
        this.f2736a = context.getResourceId(C0636j.ViewStubCompat_android_layout, 0);
        setId(context.getResourceId(C0636j.ViewStubCompat_android_id, -1));
        context.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f2737b;
    }

    public void setInflatedId(int i) {
        this.f2737b = i;
    }

    public int getLayoutResource() {
        return this.f2736a;
    }

    public void setLayoutResource(int i) {
        this.f2736a = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2739d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2739d;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setVisibility(int i) {
        if (this.f2738c != null) {
            View view = (View) this.f2738c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m3429a();
        }
    }

    /* renamed from: a */
    public View m3429a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2736a != 0) {
            LayoutInflater layoutInflater;
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f2739d != null) {
                layoutInflater = this.f2739d;
            } else {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2736a, viewGroup, false);
            if (this.f2737b != -1) {
                inflate.setId(this.f2737b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2738c = new WeakReference(inflate);
            if (this.f2740e != null) {
                this.f2740e.m3428a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(C0830a c0830a) {
        this.f2740e = c0830a;
    }
}
