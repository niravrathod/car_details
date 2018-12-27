package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.z */
class C3587z implements al {
    /* renamed from: a */
    private final int f14752a;

    public C3587z(int i) {
        this.f14752a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo1136a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f14752a) {
            return stackTraceElementArr;
        }
        int i = this.f14752a / 2;
        int i2 = this.f14752a - i;
        Object obj = new StackTraceElement[this.f14752a];
        System.arraycopy(stackTraceElementArr, 0, obj, 0, i2);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i, obj, i2, i);
        return obj;
    }
}
