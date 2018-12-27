package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: android.support.transition.b */
class C3082b implements C0275d {

    /* renamed from: android.support.transition.b$a */
    interface C0274a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    public void mo234a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    C3082b() {
    }

    /* renamed from: a */
    public void mo233a(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0274a) {
                    ((C0274a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo235b(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0274a) {
                    ((C0274a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
