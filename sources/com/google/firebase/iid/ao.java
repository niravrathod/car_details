package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class ao implements OnCompleteListener {
    /* renamed from: a */
    private final FirebaseInstanceId f17729a;
    /* renamed from: b */
    private final String f17730b;
    /* renamed from: c */
    private final String f17731c;
    /* renamed from: d */
    private final TaskCompletionSource f17732d;
    /* renamed from: e */
    private final String f17733e;

    ao(FirebaseInstanceId firebaseInstanceId, String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        this.f17729a = firebaseInstanceId;
        this.f17730b = str;
        this.f17731c = str2;
        this.f17732d = taskCompletionSource;
        this.f17733e = str3;
    }

    public final void onComplete(Task task) {
        this.f17729a.m12674a(this.f17730b, this.f17731c, this.f17732d, this.f17733e, task);
    }
}
