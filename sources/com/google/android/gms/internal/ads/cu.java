package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

final class cu {
    /* renamed from: a */
    private final Object f7973a;
    /* renamed from: b */
    private volatile int f7974b;
    /* renamed from: c */
    private volatile long f7975c;

    private cu() {
        this.f7973a = new Object();
        this.f7974b = cv.f7976a;
        this.f7975c = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m8912a(int r5, int r6) {
        /*
        r4 = this;
        r4.m8913d();
        r0 = com.google.android.gms.ads.internal.zzbv.zzer();
        r0 = r0.currentTimeMillis();
        r2 = r4.f7973a;
        monitor-enter(r2);
        r3 = r4.f7974b;	 Catch:{ all -> 0x0020 }
        if (r3 == r5) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0014:
        r4.f7974b = r6;	 Catch:{ all -> 0x0020 }
        r5 = r4.f7974b;	 Catch:{ all -> 0x0020 }
        r6 = com.google.android.gms.internal.ads.cv.f7978c;	 Catch:{ all -> 0x0020 }
        if (r5 != r6) goto L_0x001e;
    L_0x001c:
        r4.f7975c = r0;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0020:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cu.a(int, int):void");
    }

    /* renamed from: d */
    private final void m8913d() {
        long currentTimeMillis = zzbv.zzer().currentTimeMillis();
        synchronized (this.f7973a) {
            if (this.f7974b == cv.f7978c) {
                if (this.f7975c + ((Long) zzkd.m10713e().m10897a(zznw.cE)).longValue() <= currentTimeMillis) {
                    this.f7974b = cv.f7976a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m8914a(boolean z) {
        if (z) {
            m8912a(cv.f7976a, cv.f7977b);
        } else {
            m8912a(cv.f7977b, cv.f7976a);
        }
    }

    /* renamed from: a */
    public final boolean m8915a() {
        m8913d();
        return this.f7974b == cv.f7977b;
    }

    /* renamed from: b */
    public final boolean m8916b() {
        m8913d();
        return this.f7974b == cv.f7978c;
    }

    /* renamed from: c */
    public final void m8917c() {
        m8912a(cv.f7977b, cv.f7978c);
    }
}
