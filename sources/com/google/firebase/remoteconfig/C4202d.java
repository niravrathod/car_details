package com.google.firebase.remoteconfig;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.internal.config.zzk;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.remoteconfig.d */
final class C4202d implements ResultCallback<zzk> {
    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f17749a;
    /* renamed from: b */
    private final /* synthetic */ C2614a f17750b;

    C4202d(C2614a c2614a, TaskCompletionSource taskCompletionSource) {
        this.f17750b = c2614a;
        this.f17749a = taskCompletionSource;
    }

    public final /* synthetic */ void onResult(Result result) {
        this.f17750b.m12841a(this.f17749a, (zzk) result);
    }
}
