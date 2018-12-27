package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzaju;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzarl;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzia;

@zzaer
public final class zzv {
    public final zzarw zzxj;
    public final zzaqq zzxk;
    public final zzajz zzxl;
    public final zzia zzxm;

    private zzv(zzarw zzarw, zzaqq zzaqq, zzajz zzajz, zzia zzia) {
        this.zzxj = zzarw;
        this.zzxk = zzaqq;
        this.zzxl = zzajz;
        this.zzxm = zzia;
    }

    public static zzv zzc(Context context) {
        return new zzv(new zzarl(), new zzaqy(), new zzajt(new zzaju()), new zzia(context));
    }
}
