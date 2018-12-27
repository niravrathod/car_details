package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

public abstract class Task<TResult> {
    /* renamed from: a */
    public abstract Task<TResult> mo3211a(Executor executor, OnFailureListener onFailureListener);

    /* renamed from: a */
    public abstract Task<TResult> mo3212a(Executor executor, OnSuccessListener<? super TResult> onSuccessListener);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo3213a(Class<X> cls);

    /* renamed from: a */
    public abstract boolean mo3214a();

    /* renamed from: b */
    public abstract boolean mo3216b();

    /* renamed from: c */
    public abstract boolean mo3217c();

    /* renamed from: d */
    public abstract TResult mo3218d();

    /* renamed from: e */
    public abstract Exception mo3219e();

    /* renamed from: a */
    public Task<TResult> mo3207a(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public Task<TResult> mo3210a(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public Task<TResult> mo3209a(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> Task<TContinuationResult> mo3206a(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> Task<TContinuationResult> mo3208a(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> Task<TContinuationResult> mo3215b(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
