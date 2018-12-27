package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

/* renamed from: android.support.transition.a */
class C0265a {
    /* renamed from: a */
    private static final C0275d f972a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f972a = new C3083c();
        } else {
            f972a = new C3082b();
        }
    }

    /* renamed from: a */
    static void m966a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f972a.mo234a(animator, animatorListenerAdapter);
    }

    /* renamed from: a */
    static void m965a(Animator animator) {
        f972a.mo233a(animator);
    }

    /* renamed from: b */
    static void m967b(Animator animator) {
        f972a.mo235b(animator);
    }
}
