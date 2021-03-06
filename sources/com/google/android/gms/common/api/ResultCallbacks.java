package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r);

    @KeepForSdk
    public final void onResult(R r) {
        Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (Throwable e) {
                r = String.valueOf(r);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(r).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(r);
                Log.w("ResultCallbacks", stringBuilder.toString(), e);
            }
        }
    }
}
