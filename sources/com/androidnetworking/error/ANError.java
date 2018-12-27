package com.androidnetworking.error;

import okhttp3.aa;

public class ANError extends Exception {
    private String errorBody;
    private int errorCode = 0;
    private String errorDetail;
    private aa response;

    public ANError(aa aaVar) {
        this.response = aaVar;
    }

    public ANError(Throwable th) {
        super(th);
    }

    /* renamed from: a */
    public aa m4579a() {
        return this.response;
    }

    /* renamed from: a */
    public void m4581a(String str) {
        this.errorDetail = str;
    }

    /* renamed from: a */
    public void m4580a(int i) {
        this.errorCode = i;
    }

    /* renamed from: b */
    public void m4582b() {
        this.errorDetail = "requestCancelledError";
    }

    /* renamed from: b */
    public void m4583b(String str) {
        this.errorBody = str;
    }
}
