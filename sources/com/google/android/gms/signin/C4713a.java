package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* renamed from: com.google.android.gms.signin.a */
final class C4713a extends AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    C4713a() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        SignInOptions signInOptions = (SignInOptions) obj;
        if (signInOptions == null) {
            signInOptions = SignInOptions.f21438a;
        }
        return new SignInClientImpl(context, looper, true, clientSettings, signInOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
