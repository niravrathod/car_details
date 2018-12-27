package android.support.transition;

import android.animation.TypeEvaluator;

/* renamed from: android.support.transition.f */
class C0276f implements TypeEvaluator<float[]> {
    /* renamed from: a */
    private float[] f1022a;

    public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m1026a(f, (float[]) obj, (float[]) obj2);
    }

    C0276f(float[] fArr) {
        this.f1022a = fArr;
    }

    /* renamed from: a */
    public float[] m1026a(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f1022a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
