package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zacl implements Continuation<Boolean, Void> {
    zacl() {
    }

    public final /* synthetic */ Object then(Task task) {
        if (((Boolean) task.mo3218d()).booleanValue() != null) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
