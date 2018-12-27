package com.google.android.gms.internal.config;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.config.i */
final class C4830i extends C4707f {
    /* renamed from: a */
    private final /* synthetic */ C4864h f21373a;

    C4830i(C4864h c4864h) {
        this.f21373a = c4864h;
    }

    /* renamed from: a */
    public final void mo4330a(Status status, zzad zzad) {
        if (zzad.m27027a() != 6502) {
            if (zzad.m27027a() != 6507) {
                this.f21373a.setResult(new zzu(zzo.m22150b(zzad.m27027a()), zzo.m22152c(zzad), zzo.m22149a(zzad)));
                return;
            }
        }
        this.f21373a.setResult(new zzu(zzo.m22150b(zzad.m27027a()), zzo.m22152c(zzad), zzad.m27029c(), zzo.m22149a(zzad)));
    }
}
