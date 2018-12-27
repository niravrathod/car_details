package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.C0617m;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatPopupWindow extends PopupWindow {
    /* renamed from: a */
    private static final boolean f2385a = (VERSION.SDK_INT < 21);
    /* renamed from: b */
    private boolean f2386b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2886a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2886a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2886a(Context context, AttributeSet attributeSet, int i, int i2) {
        context = ay.m3543a(context, attributeSet, C0636j.PopupWindow, i, i2);
        if (context.m3561g(C0636j.PopupWindow_overlapAnchor) != null) {
            m2887a(context.m3549a(C0636j.PopupWindow_overlapAnchor, (boolean) 0));
        }
        setBackgroundDrawable(context.m3547a(C0636j.PopupWindow_android_popupBackground));
        context.m3548a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2385a && this.f2386b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2385a && this.f2386b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2385a && this.f2386b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m2887a(boolean z) {
        if (f2385a) {
            this.f2386b = z;
        } else {
            C0617m.m2466a((PopupWindow) this, z);
        }
    }
}
