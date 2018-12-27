package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.C0293y.C0292a;
import android.view.View;
import android.view.ViewParent;

class av implements ba {
    /* renamed from: a */
    private float[] f13074a;

    av() {
    }

    /* renamed from: a */
    public at mo223a(View view) {
        return ar.m15237d(view);
    }

    /* renamed from: b */
    public be mo227b(View view) {
        return new bc(view.getWindowToken());
    }

    /* renamed from: a */
    public void mo224a(View view, float f) {
        Float f2 = (Float) view.getTag(C0292a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: c */
    public float mo229c(View view) {
        Float f = (Float) view.getTag(C0292a.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo231d(View view) {
        if (view.getTag(C0292a.save_non_transition_alpha) == null) {
            view.setTag(C0292a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo232e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0292a.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public void mo226a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo226a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        view = view.getMatrix();
        if (!view.isIdentity()) {
            matrix.preConcat(view);
        }
    }

    /* renamed from: b */
    public void mo228b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo228b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        view = view.getMatrix();
        if (!view.isIdentity()) {
            Matrix matrix2 = new Matrix();
            if (view.invert(matrix2) != null) {
                matrix.postConcat(matrix2);
            }
        }
    }

    /* renamed from: c */
    public void mo230c(View view, Matrix matrix) {
        if (matrix != null) {
            if (!matrix.isIdentity()) {
                float[] fArr = this.f13074a;
                if (fArr == null) {
                    fArr = new float[9];
                    this.f13074a = fArr;
                }
                matrix.getValues(fArr);
                matrix = fArr[3];
                float sqrt = ((float) Math.sqrt((double) (1.0f - (matrix * matrix)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
                matrix = (float) Math.toDegrees(Math.atan2((double) matrix, (double) sqrt));
                float f = fArr[0] / sqrt;
                float f2 = fArr[4] / sqrt;
                sqrt = fArr[2];
                float f3 = fArr[5];
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                view.setTranslationX(sqrt);
                view.setTranslationY(f3);
                view.setRotation(matrix);
                view.setScaleX(f);
                view.setScaleY(f2);
                return;
            }
        }
        view.setPivotX((float) (view.getWidth() / 2));
        view.setPivotY((float) (view.getHeight() / 2));
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    /* renamed from: a */
    public void mo225a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
