package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.s */
final class C2518s implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C4150q f10838a;
    /* renamed from: b */
    private final /* synthetic */ Callable f10839b;

    public final void run() {
        try {
            this.f10838a.m22855a(this.f10839b.call());
        } catch (Exception e) {
            this.f10838a.m22854a(e);
        }
    }
}
