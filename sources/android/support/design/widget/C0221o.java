package android.support.design.widget;

import android.graphics.PorterDuff.Mode;

/* renamed from: android.support.design.widget.o */
class C0221o {
    /* renamed from: a */
    static Mode m814a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            default:
                return mode;
        }
    }
}
