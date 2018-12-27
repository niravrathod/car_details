package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;

/* renamed from: android.support.transition.o */
class C0286o {
    /* renamed from: a */
    static final Matrix f1028a = new C02851();

    /* renamed from: android.support.transition.o$1 */
    static class C02851 extends Matrix {
        C02851() {
        }

        /* renamed from: a */
        void m1038a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public void set(Matrix matrix) {
            m1038a();
        }

        public void reset() {
            m1038a();
        }

        public void setTranslate(float f, float f2) {
            m1038a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            m1038a();
        }

        public void setScale(float f, float f2) {
            m1038a();
        }

        public void setRotate(float f, float f2, float f3) {
            m1038a();
        }

        public void setRotate(float f) {
            m1038a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            m1038a();
        }

        public void setSinCos(float f, float f2) {
            m1038a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            m1038a();
        }

        public void setSkew(float f, float f2) {
            m1038a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m1038a();
            return null;
        }

        public boolean preTranslate(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            m1038a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            m1038a();
            return false;
        }

        public boolean preRotate(float f) {
            m1038a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            m1038a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            m1038a();
            return null;
        }

        public boolean postTranslate(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            m1038a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            m1038a();
            return false;
        }

        public boolean postRotate(float f) {
            m1038a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            m1038a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            m1038a();
            return false;
        }

        public boolean postConcat(Matrix matrix) {
            m1038a();
            return null;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, ScaleToFit scaleToFit) {
            m1038a();
            return null;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m1038a();
            return null;
        }

        public void setValues(float[] fArr) {
            m1038a();
        }
    }
}
