package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzalo;

@zzaer
/* renamed from: com.google.android.gms.ads.internal.overlay.d */
final class C4699d extends zzalc {
    /* renamed from: a */
    final /* synthetic */ zzd f19502a;

    private C4699d(zzd zzd) {
        this.f19502a = zzd;
    }

    public final void m_() {
    }

    /* renamed from: a */
    public final void mo4075a() {
        Bitmap a = zzbv.zzff().m9928a(Integer.valueOf(this.f19502a.f19507b.zzcch.zzzw));
        if (a != null) {
            zzalo.f8872a.post(new C2410e(this, zzbv.zzem().mo4991a(this.f19502a.f19506a, a, this.f19502a.f19507b.zzcch.zzzu, this.f19502a.f19507b.zzcch.zzzv)));
        }
    }
}
