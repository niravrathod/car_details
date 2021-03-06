package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@Deprecated
public class Space extends View {
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Deprecated
    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == null) {
            setVisibility(4);
        }
    }

    @Deprecated
    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m2340a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, i2);
        }
        if (mode == 0) {
            return i;
        }
        if (mode != 1073741824) {
            return i;
        }
        return i2;
    }

    @Deprecated
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m2340a(getSuggestedMinimumWidth(), i), m2340a(getSuggestedMinimumHeight(), i2));
    }
}
