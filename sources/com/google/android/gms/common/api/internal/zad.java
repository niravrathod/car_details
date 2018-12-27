package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad<T> extends zac {
    protected final TaskCompletionSource<T> zacm;

    public zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zacm = taskCompletionSource;
    }

    public void zaa(zaab zaab, boolean z) {
    }

    protected abstract void zad(zaa<?> zaa);

    public void zaa(Status status) {
        this.zacm.m12420b(new ApiException(status));
    }

    public void zaa(RuntimeException runtimeException) {
        this.zacm.m12420b((Exception) runtimeException);
    }

    public final void zaa(zaa<?> zaa) {
        try {
            zad(zaa);
        } catch (zaa<?> zaa2) {
            zaa(zab.zaa((RemoteException) zaa2));
            throw zaa2;
        } catch (zaa<?> zaa22) {
            zaa(zab.zaa((RemoteException) zaa22));
        } catch (RuntimeException e) {
            zaa(e);
        }
    }
}
