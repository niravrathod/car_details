package com.facebook.ads.internal.p101q.p102a;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.internal.q.a.m */
public class C1923m implements ThreadFactory {
    /* renamed from: a */
    protected final AtomicLong f5898a = new AtomicLong();
    /* renamed from: b */
    private int f5899b = Thread.currentThread().getPriority();

    /* renamed from: a */
    protected String m7298a() {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", new Object[]{Long.valueOf(this.f5898a.incrementAndGet()), Long.valueOf(System.currentTimeMillis())});
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, m7298a(), 0);
        thread.setPriority(this.f5899b);
        return thread;
    }
}
