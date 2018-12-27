package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class VisibilityAwareImageButton extends ImageButton {
    /* renamed from: a */
    private int f698a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f698a = getVisibility();
    }

    public void setVisibility(int i) {
        m668a(i, true);
    }

    /* renamed from: a */
    final void m668a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f698a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.f698a;
    }
}
