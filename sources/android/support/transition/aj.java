package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.support.transition.C0293y.C0292a;
import android.view.View;

class aj {

    /* renamed from: android.support.transition.aj$a */
    private static class C0269a extends AnimatorListenerAdapter {
        /* renamed from: a */
        private final View f1001a;
        /* renamed from: b */
        private final View f1002b;
        /* renamed from: c */
        private final int f1003c;
        /* renamed from: d */
        private final int f1004d;
        /* renamed from: e */
        private int[] f1005e;
        /* renamed from: f */
        private float f1006f;
        /* renamed from: g */
        private float f1007g;
        /* renamed from: h */
        private final float f1008h;
        /* renamed from: i */
        private final float f1009i;

        private C0269a(View view, View view2, int i, int i2, float f, float f2) {
            this.f1002b = view;
            this.f1001a = view2;
            this.f1003c = i - Math.round(this.f1002b.getTranslationX());
            this.f1004d = i2 - Math.round(this.f1002b.getTranslationY());
            this.f1008h = f;
            this.f1009i = f2;
            this.f1005e = (int[]) this.f1001a.getTag(C0292a.transition_position);
            if (this.f1005e != null) {
                this.f1001a.setTag(C0292a.transition_position, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1005e == null) {
                this.f1005e = new int[2];
            }
            this.f1005e[0] = Math.round(((float) this.f1003c) + this.f1002b.getTranslationX());
            this.f1005e[1] = Math.round(((float) this.f1004d) + this.f1002b.getTranslationY());
            this.f1001a.setTag(C0292a.transition_position, this.f1005e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1002b.setTranslationX(this.f1008h);
            this.f1002b.setTranslationY(this.f1009i);
        }

        public void onAnimationPause(Animator animator) {
            this.f1006f = this.f1002b.getTranslationX();
            this.f1007g = this.f1002b.getTranslationY();
            this.f1002b.setTranslationX(this.f1008h);
            this.f1002b.setTranslationY(this.f1009i);
        }

        public void onAnimationResume(Animator animator) {
            this.f1002b.setTranslationX(this.f1006f);
            this.f1002b.setTranslationY(this.f1007g);
        }
    }

    /* renamed from: a */
    static Animator m984a(View view, ah ahVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        ah ahVar2 = ahVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ahVar2.f995b.getTag(C0292a.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view2.setTranslationX(f5);
        view2.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        C0269a c0269a = new C0269a(view, ahVar2.f995b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(c0269a);
        C0265a.m966a(ofPropertyValuesHolder, c0269a);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
