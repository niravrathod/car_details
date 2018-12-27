package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.transition.k */
class C0282k {
    /* renamed from: a */
    private static final C0284n f1025a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1025a = new C3089m();
        } else {
            f1025a = new C3088l();
        }
    }

    /* renamed from: a */
    static void m1032a(ImageView imageView) {
        f1025a.mo242a(imageView);
    }

    /* renamed from: a */
    static void m1034a(ImageView imageView, Matrix matrix) {
        f1025a.mo244a(imageView, matrix);
    }

    /* renamed from: a */
    static void m1033a(ImageView imageView, Animator animator) {
        f1025a.mo243a(imageView, animator);
    }
}
