package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzgs {
    /* renamed from: a */
    private final float f9508a;
    /* renamed from: b */
    private final float f9509b;
    /* renamed from: c */
    private final float f9510c;
    /* renamed from: d */
    private final float f9511d;
    /* renamed from: e */
    private final int f9512e;

    @VisibleForTesting
    public zzgs(float f, float f2, float f3, float f4, int i) {
        this.f9508a = f;
        this.f9509b = f2;
        this.f9510c = f + f3;
        this.f9511d = f2 + f4;
        this.f9512e = i;
    }

    /* renamed from: a */
    final float m10644a() {
        return this.f9508a;
    }

    /* renamed from: b */
    final float m10645b() {
        return this.f9509b;
    }

    /* renamed from: c */
    final float m10646c() {
        return this.f9510c;
    }

    /* renamed from: d */
    final float m10647d() {
        return this.f9511d;
    }

    /* renamed from: e */
    final int m10648e() {
        return this.f9512e;
    }
}
