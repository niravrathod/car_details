package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.p149a.C2821e;
import io.fabric.sdk.android.services.concurrency.p149a.C4310b;
import io.fabric.sdk.android.services.concurrency.p149a.C4311c;
import io.fabric.sdk.android.services.p147b.C2784f;
import java.io.File;
import java.util.List;

/* renamed from: com.crashlytics.android.answers.g */
class C3553g implements C2784f {
    /* renamed from: a */
    private final C3558q f14648a;
    /* renamed from: b */
    private final C1333n f14649b;

    /* renamed from: a */
    public static C3553g m18038a(C3558q c3558q) {
        return new C3553g(c3558q, new C1333n(new C2821e(new C3555m(new C4311c(1000, 8), 0.1d), new C4310b(5))));
    }

    C3553g(C3558q c3558q, C1333n c1333n) {
        this.f14648a = c3558q;
        this.f14649b = c1333n;
    }

    /* renamed from: a */
    public boolean mo1109a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (!this.f14649b.m5384a(nanoTime)) {
            return false;
        }
        if (this.f14648a.mo1109a(list) != null) {
            this.f14649b.m5383a();
            return true;
        }
        this.f14649b.m5385b(nanoTime);
        return false;
    }
}
