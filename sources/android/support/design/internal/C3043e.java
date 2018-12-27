package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.transition.Transition;
import android.support.transition.ah;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: android.support.design.internal.e */
public class C3043e extends Transition {
    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m14919d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m14919d(ahVar);
    }

    /* renamed from: d */
    private void m14919d(ah ahVar) {
        if (ahVar.f995b instanceof TextView) {
            ahVar.f994a.put("android:textscale:scale", Float.valueOf(((TextView) ahVar.f995b).getScaleX()));
        }
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (!(ahVar == null || ahVar2 == null || !(ahVar.f995b instanceof TextView))) {
            if (ahVar2.f995b instanceof TextView) {
                final TextView textView = (TextView) ahVar2.f995b;
                ahVar = ahVar.f994a;
                ahVar2 = ahVar2.f994a;
                float f = 1.0f;
                ahVar = ahVar.get("android:textscale:scale") != null ? ((Float) ahVar.get("android:textscale:scale")).floatValue() : 1065353216;
                if (ahVar2.get("android:textscale:scale") != null) {
                    f = ((Float) ahVar2.get("android:textscale:scale")).floatValue();
                }
                if (ahVar == f) {
                    return null;
                }
                viewGroup = ValueAnimator.ofFloat(new float[]{ahVar, f});
                viewGroup.addUpdateListener(new AnimatorUpdateListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C3043e f543b;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        valueAnimator = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        textView.setScaleX(valueAnimator);
                        textView.setScaleY(valueAnimator);
                    }
                });
                return viewGroup;
            }
        }
        return null;
    }
}
