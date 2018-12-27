package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.transition.c */
class C3083c implements C0275d {
    C3083c() {
    }

    /* renamed from: a */
    public void mo234a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: a */
    public void mo233a(Animator animator) {
        animator.pause();
    }

    /* renamed from: b */
    public void mo235b(Animator animator) {
        animator.resume();
    }
}
