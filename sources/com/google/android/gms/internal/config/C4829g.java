package com.google.android.gms.internal.config;

import android.content.Context;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

/* renamed from: com.google.android.gms.internal.config.g */
abstract class C4829g<R extends Result> extends ApiMethodImpl<R, zzw> {
    public C4829g(GoogleApiClient googleApiClient) {
        super(zze.f9973a, googleApiClient);
    }

    /* renamed from: a */
    protected abstract void mo4994a(Context context, zzah zzah);

    protected /* synthetic */ void doExecute(AnyClient anyClient) {
        zzw zzw = (zzw) anyClient;
        mo4994a(zzw.getContext(), (zzah) zzw.getService());
    }
}
