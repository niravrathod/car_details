package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.percent.C0234a.C0231a;
import android.support.percent.C0234a.C0232b;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    /* renamed from: a */
    private final C0234a f856a = new C0234a(this);

    @Deprecated
    public static class LayoutParams extends android.widget.RelativeLayout.LayoutParams implements C0232b {
        /* renamed from: a */
        private C0231a f13007a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13007a = C0234a.m866a(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public C0231a mo171a() {
            if (this.f13007a == null) {
                this.f13007a = new C0231a();
            }
            return this.f13007a;
        }

        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C0234a.m867a(this, typedArray, i, i2);
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m855a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m856a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ android.widget.RelativeLayout.LayoutParams m30387generateLayoutParams(AttributeSet attributeSet) {
        return m856a(attributeSet);
    }

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    protected LayoutParams m855a() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public LayoutParams m856a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        this.f856a.m871a(i, i2);
        super.onMeasure(i, i2);
        if (this.f856a.m872b()) {
            super.onMeasure(i, i2);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f856a.m870a();
    }
}
