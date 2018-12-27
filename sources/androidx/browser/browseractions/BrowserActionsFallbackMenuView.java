package androidx.browser.browseractions;

import android.content.Context;
import android.support.customtabs.C0131j.C0130a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView extends LinearLayout {
    /* renamed from: a */
    private final int f3032a = getResources().getDimensionPixelOffset(C0130a.browser_actions_context_menu_min_padding);
    /* renamed from: b */
    private final int f3033b = getResources().getDimensionPixelOffset(C0130a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3032a * 2), this.f3033b), 1073741824), i2);
    }
}
