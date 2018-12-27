package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.p149a.C2821e;

/* renamed from: com.crashlytics.android.answers.n */
class C1333n {
    /* renamed from: a */
    long f4190a;
    /* renamed from: b */
    private C2821e f4191b;

    public C1333n(C2821e c2821e) {
        if (c2821e != null) {
            this.f4191b = c2821e;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    /* renamed from: a */
    public boolean m5384a(long j) {
        return j - this.f4190a >= this.f4191b.m13757a() * 1000000 ? 1 : 0;
    }

    /* renamed from: b */
    public void m5385b(long j) {
        this.f4190a = j;
        this.f4191b = this.f4191b.m13758b();
    }

    /* renamed from: a */
    public void m5383a() {
        this.f4190a = 0;
        this.f4191b = this.f4191b.m13759c();
    }
}
