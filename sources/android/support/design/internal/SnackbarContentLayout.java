package android.support.design.internal;

import android.content.Context;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0137f;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.C0200b.C0196c;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements C0196c {
    /* renamed from: a */
    private TextView f12820a;
    /* renamed from: b */
    private Button f12821b;
    /* renamed from: c */
    private int f12822c;
    /* renamed from: d */
    private int f12823d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, C0142k.SnackbarLayout);
        this.f12822c = context.getDimensionPixelSize(C0142k.SnackbarLayout_android_maxWidth, -1);
        this.f12823d = context.getDimensionPixelSize(C0142k.SnackbarLayout_maxActionInlineWidth, -1);
        context.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f12820a = (TextView) findViewById(C0137f.snackbar_text);
        this.f12821b = (Button) findViewById(C0137f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f12820a;
    }

    public Button getActionView() {
        return this.f12821b;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12822c > 0 && getMeasuredWidth() > this.f12822c) {
            i = MeasureSpec.makeMeasureSpec(this.f12822c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0135d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0135d.design_snackbar_padding_vertical);
        int i3 = 1;
        Object obj = this.f12820a.getLayout().getLineCount() > 1 ? 1 : null;
        if (obj == null || this.f12823d <= 0 || this.f12821b.getMeasuredWidth() <= this.f12823d) {
            if (obj == null) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m14871a(0, dimensionPixelSize, dimensionPixelSize)) {
                if (i3 == 0) {
                    super.onMeasure(i, i2);
                }
            }
        } else if (m14871a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            if (i3 == 0) {
                super.onMeasure(i, i2);
            }
        }
        i3 = 0;
        if (i3 == 0) {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: a */
    private boolean m14871a(int i, int i2, int i3) {
        if (i != getOrientation()) {
            setOrientation(i);
            i = 1;
        } else {
            i = 0;
        }
        if (this.f12820a.getPaddingTop() == i2 && this.f12820a.getPaddingBottom() == i3) {
            return i;
        }
        m14870a(this.f12820a, i2, i3);
        return true;
    }

    /* renamed from: a */
    private static void m14870a(View view, int i, int i2) {
        if (C0560r.m2207s(view)) {
            C0560r.m2186b(view, C0560r.m2195g(view), i, C0560r.m2196h(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo89a(int i, int i2) {
        this.f12820a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f12820a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f12821b.getVisibility() == 0) {
            this.f12821b.setAlpha(0.0f);
            this.f12821b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo90b(int i, int i2) {
        this.f12820a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f12820a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f12821b.getVisibility() == 0) {
            this.f12821b.setAlpha(1.0f);
            this.f12821b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
