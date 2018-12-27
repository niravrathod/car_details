package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag<ResultT> extends zac {
    private final TaskCompletionSource<ResultT> zacm;
    private final TaskApiCall<AnyClient, ResultT> zacq;
    private final StatusExceptionMapper zacr;

    public zag(int i, TaskApiCall<AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zacm = taskCompletionSource;
        this.zacq = taskApiCall;
        this.zacr = statusExceptionMapper;
    }

    public final void zaa(zaa<?> zaa) {
        try {
            this.zacq.doExecute(zaa.zaab(), this.zacm);
        } catch (zaa<?> zaa2) {
            throw zaa2;
        } catch (zaa<?> zaa22) {
            zaa(zab.zaa((RemoteException) zaa22));
        } catch (RuntimeException e) {
            zaa(e);
        }
    }

    public final void zaa(Status status) {
        this.zacm.m12420b(this.zacr.getException(status));
    }

    public final void zaa(RuntimeException runtimeException) {
        this.zacm.m12420b((Exception) runtimeException);
    }

    public final void zaa(zaab zaab, boolean z) {
        zaab.zaa(this.zacm, z);
    }

    public final Feature[] zab(zaa<?> zaa) {
        return this.zacq.zabt();
    }

    public final boolean zac(zaa<?> zaa) {
        return this.zacq.shouldAutoResolveMissingFeatures();
    }
}
