package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: android.support.transition.e */
public class C4425e extends bb {
    /* renamed from: a */
    private float f18403a = 3.0f;

    /* renamed from: a */
    public long mo3736a(ViewGroup viewGroup, Transition transition, ah ahVar, ah ahVar2) {
        if (ahVar == null && ahVar2 == null) {
            return 0;
        }
        int c;
        Rect m;
        int centerX;
        int centerY;
        if (ahVar2 != null) {
            if (m15258b(ahVar) != 0) {
                ahVar = ahVar2;
                ahVar2 = true;
                c = m15259c(ahVar);
                ahVar = m15260d(ahVar);
                m = transition.m962m();
                if (m == null) {
                    centerX = m.centerX();
                    centerY = m.centerY();
                } else {
                    int[] iArr = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
                    centerY = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
                    centerX = round;
                }
                ahVar = C4425e.m24218a((float) c, (float) ahVar, (float) centerX, (float) centerY) / C4425e.m24218a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
                viewGroup = transition.m940b();
                if (viewGroup < null) {
                    viewGroup = 300;
                }
                return (long) Math.round((((float) (viewGroup * ((long) ahVar2))) / this.f18403a) * ahVar);
            }
        }
        ahVar2 = -1;
        c = m15259c(ahVar);
        ahVar = m15260d(ahVar);
        m = transition.m962m();
        if (m == null) {
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            int round2 = Math.round(((float) (iArr2[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            centerY = Math.round(((float) (iArr2[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            centerX = round2;
        } else {
            centerX = m.centerX();
            centerY = m.centerY();
        }
        ahVar = C4425e.m24218a((float) c, (float) ahVar, (float) centerX, (float) centerY) / C4425e.m24218a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        viewGroup = transition.m940b();
        if (viewGroup < null) {
            viewGroup = 300;
        }
        return (long) Math.round((((float) (viewGroup * ((long) ahVar2))) / this.f18403a) * ahVar);
    }

    /* renamed from: a */
    private static float m24218a(float f, float f2, float f3, float f4) {
        f3 -= f;
        f4 -= f2;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }
}
