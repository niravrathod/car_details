package com.google.firebase.iid;

import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class am implements Runnable {
    /* renamed from: a */
    private final FirebaseInstanceId f11011a;
    /* renamed from: b */
    private final String f11012b;
    /* renamed from: c */
    private final String f11013c;
    /* renamed from: d */
    private final TaskCompletionSource f11014d;
    /* renamed from: e */
    private final String f11015e;

    am(FirebaseInstanceId firebaseInstanceId, String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        this.f11011a = firebaseInstanceId;
        this.f11012b = str;
        this.f11013c = str2;
        this.f11014d = taskCompletionSource;
        this.f11015e = str3;
    }

    public final void run() {
        this.f11011a.m12673a(this.f11012b, this.f11013c, this.f11014d, this.f11015e);
    }
}
