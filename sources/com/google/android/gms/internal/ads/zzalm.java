package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzaer
public final class zzalm {
    /* renamed from: a */
    public static final zzapm f8869a = zzapn.m10038a(new ThreadPoolExecutor(2, BaseClientBuilder.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), m9774a("Default")));
    /* renamed from: b */
    public static final zzapm f8870b;
    /* renamed from: c */
    public static final ScheduledExecutorService f8871c = new ScheduledThreadPoolExecutor(3, m9774a("Schedule"));

    /* renamed from: a */
    public static <T> zzapi<T> m9773a(Callable<T> callable) {
        return f8869a.mo2372a((Callable) callable);
    }

    /* renamed from: a */
    private static ThreadFactory m9774a(String str) {
        return new db(str);
    }

    /* renamed from: a */
    public static zzapi<?> m9772a(Runnable runnable) {
        return f8869a.mo2371a(runnable);
    }

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m9774a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8870b = zzapn.m10038a(threadPoolExecutor);
    }
}
