package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class zaba implements ResultCallback<Status> {
    private final /* synthetic */ zaaw zahg;
    private final /* synthetic */ StatusPendingResult zahi;
    private final /* synthetic */ boolean zahj;
    private final /* synthetic */ GoogleApiClient zahk;

    zaba(zaaw zaaw, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.zahg = zaaw;
        this.zahi = statusPendingResult;
        this.zahj = z;
        this.zahk = googleApiClient;
    }

    public final /* synthetic */ void onResult(Result result) {
        Status status = (Status) result;
        Storage.m8832a(this.zahg.mContext).m8837b();
        if (status.isSuccess() && this.zahg.isConnected()) {
            this.zahg.reconnect();
        }
        this.zahi.setResult(status);
        if (this.zahj != null) {
            this.zahk.disconnect();
        }
    }
}
