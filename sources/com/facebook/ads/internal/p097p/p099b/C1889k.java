package com.facebook.ads.internal.p097p.p099b;

import android.util.Log;
import java.lang.Thread.State;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.p.b.k */
class C1889k {
    /* renamed from: a */
    private final C1892n f5743a;
    /* renamed from: b */
    private final C1874a f5744b;
    /* renamed from: c */
    private final Object f5745c = new Object();
    /* renamed from: d */
    private final Object f5746d = new Object();
    /* renamed from: e */
    private final AtomicInteger f5747e;
    /* renamed from: f */
    private volatile Thread f5748f;
    /* renamed from: g */
    private volatile boolean f5749g;
    /* renamed from: h */
    private volatile int f5750h = -1;

    /* renamed from: com.facebook.ads.internal.p.b.k$a */
    private class C1888a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1889k f5742a;

        private C1888a(C1889k c1889k) {
            this.f5742a = c1889k;
        }

        public void run() {
            this.f5742a.m7199e();
        }
    }

    public C1889k(C1892n c1892n, C1874a c1874a) {
        this.f5743a = (C1892n) C1886j.m7191a(c1892n);
        this.f5744b = (C1874a) C1886j.m7191a(c1874a);
        this.f5747e = new AtomicInteger();
    }

    /* renamed from: b */
    private void m7195b() {
        int i = this.f5747e.get();
        if (i >= 1) {
            this.f5747e.set(0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading source ");
            stringBuilder.append(i);
            stringBuilder.append(" times");
            throw new C1890l(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m7196b(long j, long j2) {
        m7206a(j, j2);
        synchronized (this.f5745c) {
            this.f5745c.notifyAll();
        }
    }

    /* renamed from: c */
    private synchronized void m7197c() {
        Object obj = (this.f5748f == null || this.f5748f.getState() == State.TERMINATED) ? null : 1;
        if (!(this.f5749g || this.f5744b.mo1397d() || obj != null)) {
            Runnable c1888a = new C1888a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Source reader for ");
            stringBuilder.append(this.f5743a);
            this.f5748f = new Thread(c1888a, stringBuilder.toString());
            this.f5748f.start();
        }
    }

    /* renamed from: d */
    private void m7198d() {
        synchronized (this.f5745c) {
            try {
                this.f5745c.wait(1000);
            } catch (Throwable e) {
                throw new C1890l("Waiting source data is interrupted!", e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private void m7199e() {
        /*
        r9 = this;
        r0 = -1;
        r1 = 0;
        r2 = r9.f5744b;	 Catch:{ Throwable -> 0x0062, all -> 0x005d }
        r2 = r2.mo1392a();	 Catch:{ Throwable -> 0x0062, all -> 0x005d }
        r1 = r9.f5743a;	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1.mo1404a(r2);	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1 = r9.f5743a;	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1 = r1.mo1402a();	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r3 = new byte[r3];	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
    L_0x0017:
        r4 = r9.f5743a;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r4 = r4.mo1403a(r3);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        if (r4 == r0) goto L_0x0042;
    L_0x001f:
        r5 = r9.f5746d;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        monitor-enter(r5);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r6 = r9.m7201g();	 Catch:{ all -> 0x003f }
        if (r6 == 0) goto L_0x0032;
    L_0x0028:
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        r9.m7202h();
        r2 = (long) r2;
        r0 = (long) r1;
        r9.m7196b(r2, r0);
        return;
    L_0x0032:
        r6 = r9.f5744b;	 Catch:{ all -> 0x003f }
        r6.mo1394a(r3, r4);	 Catch:{ all -> 0x003f }
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        r2 = r2 + r4;
        r4 = (long) r2;
        r6 = (long) r1;
        r9.m7196b(r4, r6);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        goto L_0x0017;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
    L_0x0042:
        r9.m7200f();	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r9.m7202h();
        r2 = (long) r2;
        r0 = (long) r1;
        r9.m7196b(r2, r0);
        goto L_0x0075;
    L_0x004e:
        r0 = move-exception;
        goto L_0x007a;
    L_0x0050:
        r0 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
        goto L_0x0065;
    L_0x0055:
        r1 = move-exception;
        r0 = r1;
        r1 = -1;
        goto L_0x007a;
    L_0x0059:
        r1 = move-exception;
        r0 = r1;
        r1 = r2;
        goto L_0x0064;
    L_0x005d:
        r2 = move-exception;
        r0 = r2;
        r1 = -1;
        r2 = 0;
        goto L_0x007a;
    L_0x0062:
        r2 = move-exception;
        r0 = r2;
    L_0x0064:
        r2 = -1;
    L_0x0065:
        r3 = r9.f5747e;	 Catch:{ all -> 0x0076 }
        r3.incrementAndGet();	 Catch:{ all -> 0x0076 }
        r9.m7207a(r0);	 Catch:{ all -> 0x0076 }
        r9.m7202h();
        r0 = (long) r1;
        r2 = (long) r2;
        r9.m7196b(r0, r2);
    L_0x0075:
        return;
    L_0x0076:
        r0 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x007a:
        r9.m7202h();
        r2 = (long) r2;
        r4 = (long) r1;
        r9.m7196b(r2, r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.b.k.e():void");
    }

    /* renamed from: f */
    private void m7200f() {
        synchronized (this.f5746d) {
            if (!m7201g() && this.f5744b.mo1392a() == this.f5743a.mo1402a()) {
                this.f5744b.mo1396c();
            }
        }
    }

    /* renamed from: g */
    private boolean m7201g() {
        if (!Thread.currentThread().isInterrupted()) {
            if (!this.f5749g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private void m7202h() {
        try {
            this.f5743a.mo1405b();
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error closing source ");
            stringBuilder.append(this.f5743a);
            m7207a(new C1890l(stringBuilder.toString(), e));
        }
    }

    /* renamed from: a */
    public int m7203a(byte[] bArr, long j, int i) {
        C1891m.m7211a(bArr, j, i);
        while (!this.f5744b.mo1397d() && ((long) this.f5744b.mo1392a()) < ((long) i) + j && !this.f5749g) {
            m7197c();
            m7198d();
            m7195b();
        }
        int a = this.f5744b.mo1393a(bArr, j, i);
        if (this.f5744b.mo1397d() && this.f5750h != 100) {
            this.f5750h = 100;
            mo1400a(100);
        }
        return a;
    }

    /* renamed from: a */
    public void m7204a() {
        synchronized (this.f5746d) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Shutdown proxy for ");
            stringBuilder.append(this.f5743a);
            Log.d("ProxyCache", stringBuilder.toString());
            try {
                this.f5749g = true;
                if (this.f5748f != null) {
                    this.f5748f.interrupt();
                }
                this.f5744b.mo1395b();
            } catch (Throwable e) {
                m7207a(e);
            }
        }
    }

    /* renamed from: a */
    protected void mo1400a(int i) {
    }

    /* renamed from: a */
    protected void m7206a(long j, long j2) {
        Object obj = null;
        int i = ((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) == 0 ? 1 : null) != null ? 100 : (int) ((j * 100) / j2);
        Object obj2 = i != this.f5750h ? 1 : null;
        if (j2 >= 0) {
            obj = 1;
        }
        if (!(obj == null || obj2 == null)) {
            mo1400a(i);
        }
        this.f5750h = i;
    }

    /* renamed from: a */
    protected final void m7207a(Throwable th) {
        if (th instanceof C3826i) {
            Log.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            Log.e("ProxyCache", "ProxyCache error", th);
        }
    }
}
