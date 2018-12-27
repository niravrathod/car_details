package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.d */
public final class C2166d {
    /* renamed from: a */
    private boolean f6703a;

    /* renamed from: a */
    public synchronized boolean m7930a() {
        if (this.f6703a) {
            return false;
        }
        this.f6703a = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public synchronized boolean m7931b() {
        boolean z;
        z = this.f6703a;
        this.f6703a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized void m7932c() {
        while (!this.f6703a) {
            wait();
        }
    }
}
