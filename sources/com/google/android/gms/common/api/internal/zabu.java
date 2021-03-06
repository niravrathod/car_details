package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zabu extends zal {
    private TaskCompletionSource<Void> zajo = new TaskCompletionSource();

    public static zabu zac(Activity activity) {
        activity = LifecycleCallback.getFragment(activity);
        zabu zabu = (zabu) activity.getCallbackOrNull("GmsAvailabilityHelper", zabu.class);
        if (zabu == null) {
            return new zabu(activity);
        }
        if (zabu.zajo.m12417a().mo3214a() != null) {
            zabu.zajo = new TaskCompletionSource();
        }
        return zabu;
    }

    private zabu(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    protected final void zaa(ConnectionResult connectionResult, int i) {
        this.zajo.m12418a(ApiExceptionUtil.fromStatus(new Status(connectionResult.getErrorCode(), connectionResult.getErrorMessage(), connectionResult.getResolution())));
    }

    protected final void zao() {
        int isGooglePlayServicesAvailable = this.zacc.isGooglePlayServicesAvailable(this.mLifecycleFragment.getLifecycleActivity());
        if (isGooglePlayServicesAvailable == 0) {
            this.zajo.m12419a(null);
            return;
        }
        if (!this.zajo.m12417a().mo3214a()) {
            zab(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.zajo.m12420b(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final Task<Void> getTask() {
        return this.zajo.m12417a();
    }
}
