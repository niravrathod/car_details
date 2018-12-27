package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
    /* renamed from: g */
    private static final String[] f13030g = new String[]{"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15122d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15122d(ahVar);
    }

    /* renamed from: a */
    public String[] mo173a() {
        return f13030g;
    }

    /* renamed from: d */
    private void m15122d(ah ahVar) {
        ahVar.f994a.put("android:changeScroll:x", Integer.valueOf(ahVar.f995b.getScrollX()));
        ahVar.f994a.put("android:changeScroll:y", Integer.valueOf(ahVar.f995b.getScrollY()));
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        viewGroup = null;
        if (ahVar != null) {
            if (ahVar2 != null) {
                Animator ofInt;
                View view = ahVar2.f995b;
                int intValue = ((Integer) ahVar.f994a.get("android:changeScroll:x")).intValue();
                int intValue2 = ((Integer) ahVar2.f994a.get("android:changeScroll:x")).intValue();
                ahVar = ((Integer) ahVar.f994a.get("android:changeScroll:y")).intValue();
                ahVar2 = ((Integer) ahVar2.f994a.get("android:changeScroll:y")).intValue();
                if (intValue != intValue2) {
                    view.setScrollX(intValue);
                    ofInt = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
                } else {
                    ofInt = null;
                }
                if (ahVar != ahVar2) {
                    view.setScrollY(ahVar);
                    viewGroup = ObjectAnimator.ofInt(view, "scrollY", new int[]{ahVar, ahVar2});
                }
                return ag.m981a(ofInt, viewGroup);
            }
        }
        return null;
    }
}
