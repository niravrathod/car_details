package com.google.android.gms.internal.ads;

import java.util.Random;

@zzaer
public final class zzke extends zzlj {
    /* renamed from: a */
    private final Random f20238a = new Random();
    /* renamed from: b */
    private long f20239b;
    /* renamed from: c */
    private Object f20240c = new Object();

    public zzke() {
        m26622a();
    }

    /* renamed from: a */
    public final void m26622a() {
        synchronized (this.f20240c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.f20238a.nextInt()) + 2147483648L;
                if (j != this.f20239b && j != 0) {
                    break;
                }
            }
            this.f20239b = j;
        }
    }

    /* renamed from: b */
    public final long mo2536b() {
        return this.f20239b;
    }
}
