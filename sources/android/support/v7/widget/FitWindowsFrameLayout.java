package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.ab.C0835a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements ab {
    /* renamed from: a */
    private C0835a f13743a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0835a c0835a) {
        this.f13743a = c0835a;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (this.f13743a != null) {
            this.f13743a.mo487a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
