package com.google.android.gms.common.api;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private final Activity mActivity;
    private final int zzan;

    protected ResolvingResultCallbacks(Activity activity, int i) {
        this.mActivity = (Activity) Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zzan = i;
    }

    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(Status status);

    @KeepForSdk
    public final void onFailure(Status status) {
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(this.mActivity, this.zzan);
                return;
            } catch (Status status2) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", status2);
                onUnresolvableFailure(new Status(8));
                return;
            }
        }
        onUnresolvableFailure(status2);
    }
}
