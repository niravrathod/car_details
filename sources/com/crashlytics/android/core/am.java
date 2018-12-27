package com.crashlytics.android.core;

class am {
    /* renamed from: a */
    public final String f4254a;
    /* renamed from: b */
    public final String f4255b;
    /* renamed from: c */
    public final StackTraceElement[] f4256c;
    /* renamed from: d */
    public final am f4257d;

    public am(Throwable th, al alVar) {
        this.f4254a = th.getLocalizedMessage();
        this.f4255b = th.getClass().getName();
        this.f4256c = alVar.mo1136a(th.getStackTrace());
        th = th.getCause();
        this.f4257d = th != null ? new am(th, alVar) : null;
    }
}
