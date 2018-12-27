package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@zzaer
public final class zzafs extends zzagb {
    /* renamed from: a */
    private final WeakReference<zzafh> f19759a;

    public zzafs(zzafh zzafh) {
        this.f19759a = new WeakReference(zzafh);
    }

    /* renamed from: a */
    public final void mo2236a(zzaft zzaft) {
        zzafh zzafh = (zzafh) this.f19759a.get();
        if (zzafh != null) {
            zzafh.mo2231a(zzaft);
        }
    }
}
