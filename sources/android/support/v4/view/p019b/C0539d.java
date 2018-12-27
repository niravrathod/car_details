package android.support.v4.view.p019b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
abstract class C0539d implements Interpolator {
    /* renamed from: a */
    private final float[] f1742a;
    /* renamed from: b */
    private final float f1743b = (1.0f / ((float) (this.f1742a.length - 1)));

    protected C0539d(float[] fArr) {
        this.f1742a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1742a.length - 1)) * f), this.f1742a.length - 2);
        return this.f1742a[min] + (((f - (((float) min) * this.f1743b)) / this.f1743b) * (this.f1742a[min + 1] - this.f1742a[min]));
    }
}
