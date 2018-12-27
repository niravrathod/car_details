package android.support.v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.g */
public final class C0549g {
    @Deprecated
    /* renamed from: a */
    public static int m2060a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: b */
    public static int m2062b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: a */
    public static int m2061a(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: b */
    public static boolean m2063b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i ? true : null;
    }
}
