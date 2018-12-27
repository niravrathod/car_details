package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class ab extends bb {
    /* renamed from: a */
    private float f18396a = 3.0f;
    /* renamed from: b */
    private int f18397b = 80;

    /* renamed from: a */
    public void m24204a(int i) {
        this.f18397b = i;
    }

    /* renamed from: a */
    public long mo3736a(ViewGroup viewGroup, Transition transition, ah ahVar, ah ahVar2) {
        ab abVar = this;
        ah ahVar3 = ahVar;
        if (ahVar3 == null && ahVar2 == null) {
            return 0;
        }
        int i;
        int c;
        int d;
        int[] iArr;
        int round;
        int round2;
        int width;
        int height;
        int centerX;
        int centerY;
        float a;
        long b;
        Rect m = transition.m962m();
        if (ahVar2 != null) {
            if (m15258b(ahVar3) != 0) {
                ahVar3 = ahVar2;
                i = 1;
                c = m15259c(ahVar3);
                d = m15260d(ahVar3);
                iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                round = iArr[0] + Math.round(viewGroup.getTranslationX());
                round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
                width = round + viewGroup.getWidth();
                height = round2 + viewGroup.getHeight();
                if (m == null) {
                    centerX = m.centerX();
                    centerY = m.centerY();
                } else {
                    centerX = (round + width) / 2;
                    centerY = (round2 + height) / 2;
                }
                a = ((float) m24201a(viewGroup, c, d, centerX, centerY, round, round2, width, height)) / ((float) m24202a(viewGroup));
                b = transition.m940b();
                if (b < 0) {
                    b = 300;
                }
                return (long) Math.round((((float) (b * ((long) i))) / abVar.f18396a) * a);
            }
        }
        i = -1;
        c = m15259c(ahVar3);
        d = m15260d(ahVar3);
        iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        round = iArr[0] + Math.round(viewGroup.getTranslationX());
        round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        width = round + viewGroup.getWidth();
        height = round2 + viewGroup.getHeight();
        if (m == null) {
            centerX = (round + width) / 2;
            centerY = (round2 + height) / 2;
        } else {
            centerX = m.centerX();
            centerY = m.centerY();
        }
        a = ((float) m24201a(viewGroup, c, d, centerX, centerY, round, round2, width, height)) / ((float) m24202a(viewGroup));
        b = transition.m940b();
        if (b < 0) {
            b = 300;
        }
        return (long) Math.round((((float) (b * ((long) i))) / abVar.f18396a) * a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private int m24201a(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
        r6 = this;
        r0 = r6.f18397b;
        r1 = 5;
        r2 = 3;
        r3 = 0;
        r4 = 1;
        r5 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        if (r0 != r5) goto L_0x0019;
    L_0x000b:
        r7 = android.support.v4.view.C0560r.m2193e(r7);
        if (r7 != r4) goto L_0x0012;
    L_0x0011:
        goto L_0x0013;
    L_0x0012:
        r4 = 0;
    L_0x0013:
        if (r4 == 0) goto L_0x0017;
    L_0x0015:
        r7 = 5;
        goto L_0x002d;
    L_0x0017:
        r7 = 3;
        goto L_0x002d;
    L_0x0019:
        r0 = r6.f18397b;
        r5 = 8388613; // 0x800005 float:1.175495E-38 double:4.1445255E-317;
        if (r0 != r5) goto L_0x002b;
    L_0x0020:
        r7 = android.support.v4.view.C0560r.m2193e(r7);
        if (r7 != r4) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r4 = 0;
    L_0x0028:
        if (r4 == 0) goto L_0x0015;
    L_0x002a:
        goto L_0x0017;
    L_0x002b:
        r7 = r6.f18397b;
    L_0x002d:
        if (r7 == r2) goto L_0x0055;
    L_0x002f:
        if (r7 == r1) goto L_0x004c;
    L_0x0031:
        r11 = 48;
        if (r7 == r11) goto L_0x0043;
    L_0x0035:
        r11 = 80;
        if (r7 == r11) goto L_0x003a;
    L_0x0039:
        goto L_0x005d;
    L_0x003a:
        r9 = r9 - r13;
        r10 = r10 - r8;
        r7 = java.lang.Math.abs(r10);
        r3 = r9 + r7;
        goto L_0x005d;
    L_0x0043:
        r15 = r15 - r9;
        r10 = r10 - r8;
        r7 = java.lang.Math.abs(r10);
        r3 = r15 + r7;
        goto L_0x005d;
    L_0x004c:
        r8 = r8 - r12;
        r11 = r11 - r9;
        r7 = java.lang.Math.abs(r11);
        r3 = r8 + r7;
        goto L_0x005d;
    L_0x0055:
        r14 = r14 - r8;
        r11 = r11 - r9;
        r7 = java.lang.Math.abs(r11);
        r3 = r14 + r7;
    L_0x005d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ab.a(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: a */
    private int m24202a(ViewGroup viewGroup) {
        int i = this.f18397b;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
