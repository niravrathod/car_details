package com.crashlytics.android.answers;

import java.util.Set;

/* renamed from: com.crashlytics.android.answers.o */
class C3556o implements C1331j {
    /* renamed from: b */
    static final Set<Type> f14653b = new SamplingEventFilter$1();
    /* renamed from: a */
    final int f14654a;

    public C3556o(int i) {
        this.f14654a = i;
    }

    /* renamed from: a */
    public boolean mo1110a(SessionEvent sessionEvent) {
        Object obj = (f14653b.contains(sessionEvent.f4162c) && sessionEvent.f4160a.f4196e == null) ? 1 : null;
        sessionEvent = Math.abs(sessionEvent.f4160a.f4194c.hashCode() % this.f14654a) != null ? true : null;
        if (obj == null || sessionEvent == null) {
            return false;
        }
        return true;
    }
}
