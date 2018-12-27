package com.google.android.gms.phenotype;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.phenotype.zzd;
import com.google.android.gms.internal.phenotype.zze;

@KeepForSdk
public final class Phenotype {
    /* renamed from: a */
    private static final ClientKey<zze> f10797a = new ClientKey();
    /* renamed from: b */
    private static final AbstractClientBuilder<zze, NoOptions> f10798b = new C4712f();
    @Deprecated
    /* renamed from: c */
    private static final Api<NoOptions> f10799c = new Api("Phenotype.API", f10798b, f10797a);
    @Deprecated
    /* renamed from: d */
    private static final zzm f10800d = new zzd();

    private Phenotype() {
    }
}
