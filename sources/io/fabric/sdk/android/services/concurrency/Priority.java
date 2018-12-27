package io.fabric.sdk.android.services.concurrency;

public enum Priority {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: a */
    static <Y> int m13755a(C2825f c2825f, Y y) {
        if (y instanceof C2825f) {
            y = ((C2825f) y).mo3582b();
        } else {
            y = NORMAL;
        }
        return y.ordinal() - c2825f.mo3582b().ordinal();
    }
}
