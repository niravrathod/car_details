package android.support.constraint;

import android.content.Context;
import android.support.constraint.C0093b.C0092b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {
    /* renamed from: a */
    C0090a f228a;

    public static class LayoutParams extends android.support.constraint.ConstraintLayout.LayoutParams {
        public float an;
        public boolean ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;
        public float ay;
        public float az;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.an = 1.0f;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.an = 1.0f;
            int i = 0;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
            this.au = 1.0f;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
            context = context.obtainStyledAttributes(attributeSet, C0092b.ConstraintSet);
            attributeSet = context.getIndexCount();
            while (i < attributeSet) {
                int index = context.getIndex(i);
                if (index == C0092b.ConstraintSet_android_alpha) {
                    this.an = context.getFloat(index, this.an);
                } else if (index == C0092b.ConstraintSet_android_elevation) {
                    this.ap = context.getFloat(index, this.ap);
                    this.ao = true;
                } else if (index == C0092b.ConstraintSet_android_rotationX) {
                    this.ar = context.getFloat(index, this.ar);
                } else if (index == C0092b.ConstraintSet_android_rotationY) {
                    this.as = context.getFloat(index, this.as);
                } else if (index == C0092b.ConstraintSet_android_rotation) {
                    this.aq = context.getFloat(index, this.aq);
                } else if (index == C0092b.ConstraintSet_android_scaleX) {
                    this.at = context.getFloat(index, this.at);
                } else if (index == C0092b.ConstraintSet_android_scaleY) {
                    this.au = context.getFloat(index, this.au);
                } else if (index == C0092b.ConstraintSet_android_transformPivotX) {
                    this.av = context.getFloat(index, this.av);
                } else if (index == C0092b.ConstraintSet_android_transformPivotY) {
                    this.aw = context.getFloat(index, this.aw);
                } else if (index == C0092b.ConstraintSet_android_translationX) {
                    this.ax = context.getFloat(index, this.ax);
                } else if (index == C0092b.ConstraintSet_android_translationY) {
                    this.ay = context.getFloat(index, this.ay);
                } else if (index == C0092b.ConstraintSet_android_translationZ) {
                    this.ax = context.getFloat(index, this.az);
                }
                i++;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m216a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m217a(attributeSet);
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m215b(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m215b(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public LayoutParams m217a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected LayoutParams m216a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    private void m215b(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.support.constraint.ConstraintLayout.LayoutParams(layoutParams);
    }

    public C0090a getConstraintSet() {
        if (this.f228a == null) {
            this.f228a = new C0090a();
        }
        this.f228a.m234a(this);
        return this.f228a;
    }
}
