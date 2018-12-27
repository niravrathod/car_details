package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.y */
class C3586y implements al {
    /* renamed from: a */
    private final int f14749a;
    /* renamed from: b */
    private final al[] f14750b;
    /* renamed from: c */
    private final C3587z f14751c;

    public C3586y(int i, al... alVarArr) {
        this.f14749a = i;
        this.f14750b = alVarArr;
        this.f14751c = new C3587z(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo1136a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f14749a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (al alVar : this.f14750b) {
            if (stackTraceElementArr2.length <= this.f14749a) {
                break;
            }
            stackTraceElementArr2 = alVar.mo1136a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f14749a) {
            stackTraceElementArr2 = this.f14751c.mo1136a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
