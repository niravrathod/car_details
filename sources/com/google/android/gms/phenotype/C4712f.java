package com.google.android.gms.phenotype;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.phenotype.zze;

/* renamed from: com.google.android.gms.phenotype.f */
final class C4712f extends AbstractClientBuilder<zze, NoOptions> {
    C4712f() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zze(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
