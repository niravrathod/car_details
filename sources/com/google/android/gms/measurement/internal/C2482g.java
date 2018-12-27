package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.g */
final class C2482g implements Runnable {
    /* renamed from: a */
    private final C2481f f10623a;
    /* renamed from: b */
    private final int f10624b;
    /* renamed from: c */
    private final Throwable f10625c;
    /* renamed from: d */
    private final byte[] f10626d;
    /* renamed from: e */
    private final String f10627e;
    /* renamed from: f */
    private final Map<String, List<String>> f10628f;

    private C2482g(String str, C2481f c2481f, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.checkNotNull(c2481f);
        this.f10623a = c2481f;
        this.f10624b = i;
        this.f10625c = th;
        this.f10626d = bArr;
        this.f10627e = str;
        this.f10628f = map;
    }

    public final void run() {
        this.f10623a.mo3175a(this.f10627e, this.f10624b, this.f10625c, this.f10626d, this.f10628f);
    }
}
