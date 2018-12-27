package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class db implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f7985a = new AtomicInteger(1);
    /* renamed from: b */
    private final /* synthetic */ String f7986b;

    db(String str) {
        this.f7986b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f7986b;
        int andIncrement = this.f7985a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
        stringBuilder.append("AdWorker(");
        stringBuilder.append(str);
        stringBuilder.append(") #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
