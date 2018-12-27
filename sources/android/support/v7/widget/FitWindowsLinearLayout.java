package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.ab.C0835a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements ab {
    /* renamed from: a */
    private C0835a f13744a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0835a c0835a) {
        this.f13744a = c0835a;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.f13744a != null) {
            this.f13744a.mo487a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
