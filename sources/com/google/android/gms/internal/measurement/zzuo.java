package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public abstract class zzuo {
    /* renamed from: a */
    int f10198a;
    /* renamed from: b */
    int f10199b;
    /* renamed from: c */
    bc f10200c;
    /* renamed from: d */
    private int f10201d;
    /* renamed from: e */
    private boolean f10202e;

    /* renamed from: a */
    public static zzuo m12022a(byte[] bArr, int i, int i2) {
        return m12023a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public abstract int mo2927a();

    /* renamed from: a */
    public abstract <T extends zzwt> T mo2928a(zzxd<T> zzxd, zzuz zzuz);

    /* renamed from: a */
    public abstract void mo2929a(int i);

    /* renamed from: b */
    public abstract double mo2930b();

    /* renamed from: b */
    public abstract boolean mo2931b(int i);

    /* renamed from: c */
    public abstract float mo2932c();

    /* renamed from: d */
    public abstract int mo2933d(int i);

    /* renamed from: d */
    public abstract long mo2934d();

    /* renamed from: e */
    public abstract long mo2935e();

    /* renamed from: e */
    public abstract void mo2936e(int i);

    /* renamed from: f */
    public abstract int mo2937f();

    /* renamed from: f */
    public abstract void mo2938f(int i);

    /* renamed from: g */
    public abstract long mo2939g();

    /* renamed from: h */
    public abstract int mo2940h();

    /* renamed from: i */
    public abstract boolean mo2941i();

    /* renamed from: j */
    public abstract String mo2942j();

    /* renamed from: k */
    public abstract String mo2943k();

    /* renamed from: l */
    public abstract zzud mo2944l();

    /* renamed from: m */
    public abstract int mo2945m();

    /* renamed from: n */
    public abstract int mo2946n();

    /* renamed from: o */
    public abstract int mo2947o();

    /* renamed from: p */
    public abstract long mo2948p();

    /* renamed from: q */
    public abstract int mo2949q();

    /* renamed from: r */
    public abstract long mo2950r();

    /* renamed from: s */
    abstract long mo2951s();

    /* renamed from: t */
    public abstract boolean mo2952t();

    /* renamed from: u */
    public abstract int mo2953u();

    /* renamed from: a */
    static zzuo m12023a(byte[] bArr, int i, int i2, boolean z) {
        bb bbVar = new bb(bArr, i, i2, false);
        try {
            bbVar.mo2933d(i2);
            return bbVar;
        } catch (byte[] bArr2) {
            throw new IllegalArgumentException(bArr2);
        }
    }

    private zzuo() {
        this.f10199b = 100;
        this.f10201d = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f10202e = false;
    }

    /* renamed from: c */
    public final int m12030c(int i) {
        if (i >= 0) {
            int i2 = this.f10199b;
            this.f10199b = i;
            return i2;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Recursion limit cannot be negative: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
