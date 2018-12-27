package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzaky {
    @GuardedBy("this")
    /* renamed from: a */
    private BigInteger f8861a = BigInteger.ONE;
    @GuardedBy("this")
    /* renamed from: b */
    private String f8862b = "0";

    /* renamed from: a */
    public final synchronized String m9736a() {
        String bigInteger;
        bigInteger = this.f8861a.toString();
        this.f8861a = this.f8861a.add(BigInteger.ONE);
        this.f8862b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String m9737b() {
        return this.f8862b;
    }
}
