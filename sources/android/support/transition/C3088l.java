package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.support.transition.C0293y.C0292a;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: android.support.transition.l */
class C3088l implements C0284n {
    C3088l() {
    }

    /* renamed from: a */
    public void mo242a(ImageView imageView) {
        ScaleType scaleType = imageView.getScaleType();
        imageView.setTag(C0292a.save_scale_type, scaleType);
        if (scaleType == ScaleType.MATRIX) {
            imageView.setTag(C0292a.save_image_matrix, imageView.getImageMatrix());
        } else {
            imageView.setScaleType(ScaleType.MATRIX);
        }
        imageView.setImageMatrix(C0286o.f1028a);
    }

    /* renamed from: a */
    public void mo244a(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* renamed from: a */
    public void mo243a(final ImageView imageView, Animator animator) {
        animator.addListener(new AnimatorListenerAdapter(this) {
            /* renamed from: b */
            final /* synthetic */ C3088l f1027b;

            public void onAnimationEnd(Animator animator) {
                ScaleType scaleType = (ScaleType) imageView.getTag(C0292a.save_scale_type);
                imageView.setScaleType(scaleType);
                imageView.setTag(C0292a.save_scale_type, null);
                if (scaleType == ScaleType.MATRIX) {
                    imageView.setImageMatrix((Matrix) imageView.getTag(C0292a.save_image_matrix));
                    imageView.setTag(C0292a.save_image_matrix, null);
                }
                animator.removeListener(this);
            }
        });
    }
}
