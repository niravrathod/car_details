package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class ar implements Runnable {
    /* renamed from: a */
    private final aq f11016a;
    /* renamed from: b */
    private final Bundle f11017b;
    /* renamed from: c */
    private final TaskCompletionSource f11018c;

    ar(aq aqVar, Bundle bundle, TaskCompletionSource taskCompletionSource) {
        this.f11016a = aqVar;
        this.f11017b = bundle;
        this.f11018c = taskCompletionSource;
    }

    public final void run() {
        this.f11016a.m23061a(this.f11017b, this.f11018c);
    }
}
