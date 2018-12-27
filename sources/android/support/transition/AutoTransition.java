package android.support.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m24165q();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24165q();
    }

    /* renamed from: q */
    private void m24165q() {
        mo200a(1);
        m15193b(new Fade(2)).m15193b(new ChangeBounds()).m15193b(new Fade(1));
    }
}
