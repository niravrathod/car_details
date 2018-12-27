package com.google.android.gms.common.api;

public class Response<T extends Result> {
    private T zzao;

    protected Response(T t) {
        this.zzao = t;
    }

    protected T getResult() {
        return this.zzao;
    }

    public void setResult(T t) {
        this.zzao = t;
    }
}
