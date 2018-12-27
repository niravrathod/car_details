package com.google.android.gms.internal.ads;

public final class zzie {
    /* renamed from: a */
    private final byte[] f9541a;
    /* renamed from: b */
    private int f9542b;
    /* renamed from: c */
    private int f9543c;
    /* renamed from: d */
    private final /* synthetic */ zzia f9544d;

    private zzie(zzia zzia, byte[] bArr) {
        this.f9544d = zzia;
        this.f9541a = bArr;
    }

    /* renamed from: a */
    public final synchronized void m10688a() {
        try {
            if (this.f9544d.f9540b) {
                this.f9544d.f9539a.mo2442a(this.f9541a);
                this.f9544d.f9539a.mo2439a(this.f9542b);
                this.f9544d.f9539a.mo2444b(this.f9543c);
                this.f9544d.f9539a.mo2443a(null);
                this.f9544d.f9539a.mo2438a();
            }
        } catch (Throwable e) {
            zzaok.m9999a("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final zzie m10687a(int i) {
        this.f9542b = i;
        return this;
    }

    /* renamed from: b */
    public final zzie m10689b(int i) {
        this.f9543c = i;
        return this;
    }
}
