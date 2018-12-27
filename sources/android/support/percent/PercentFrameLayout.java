package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0234a.C0231a;
import android.support.percent.C0234a.C0232b;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@Deprecated
public class PercentFrameLayout extends FrameLayout {
    /* renamed from: a */
    private final C0234a f855a = new C0234a(this);

    @Deprecated
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams implements C0232b {
        /* renamed from: a */
        private C0231a f13006a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13006a = C0234a.m866a(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public C0231a mo171a() {
            if (this.f13006a == null) {
                this.f13006a = new C0231a();
            }
            return this.f13006a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0234a.m867a(this, typedArray, i, i2);
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m853a();
    }

    /* renamed from: generateDefaultLayoutParams */
    protected /* synthetic */ android.widget.FrameLayout.LayoutParams m30385generateDefaultLayoutParams() {
        return m853a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m854a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ android.widget.FrameLayout.LayoutParams m30386generateLayoutParams(AttributeSet attributeSet) {
        return m854a(attributeSet);
    }

    public PercentFrameLayout(Context context) {
        super(context);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    protected LayoutParams m853a() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public LayoutParams m854a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        this.f855a.m871a(i, i2);
        super.onMeasure(i, i2);
        if (this.f855a.m872b()) {
            super.onMeasure(i, i2);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f855a.m870a();
    }
}
