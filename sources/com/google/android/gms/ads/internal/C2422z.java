package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzjk;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.z */
final class C2422z implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ WeakReference f7739a;
    /* renamed from: b */
    private final /* synthetic */ zzbl f7740b;

    C2422z(zzbl zzbl, WeakReference weakReference) {
        this.f7740b = zzbl;
        this.f7739a = weakReference;
    }

    public final void run() {
        this.f7740b.f7748d = false;
        zza zza = (zza) this.f7739a.get();
        if (zza != null) {
            zzjk a = this.f7740b.f7747c;
            if (zza.mo4692b(a)) {
                zza.zzb(a);
            } else {
                zzaok.m10005d("Ad is not visible. Not refreshing ad.");
                zza.f19533d.zzg(a);
            }
        }
    }
}
