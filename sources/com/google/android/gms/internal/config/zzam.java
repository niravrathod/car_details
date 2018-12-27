package com.google.android.gms.internal.config;

import com.google.firebase.p136a.C2559a;
import java.util.List;

public final class zzam implements Runnable {
    /* renamed from: a */
    private final C2559a f9920a;
    /* renamed from: b */
    private final List<byte[]> f9921b;

    public zzam(C2559a c2559a, List<byte[]> list) {
        this.f9920a = c2559a;
        this.f9921b = list;
    }

    public final void run() {
        if (this.f9920a != null) {
            this.f9920a.m12577a(this.f9921b);
        }
    }
}
