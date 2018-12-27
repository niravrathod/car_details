package io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.fabric.sdk.android.services.concurrency.h */
public class C2827h extends ThreadPoolExecutor {
    /* renamed from: a */
    private static final int f11958a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    private static final int f11959b = (f11958a + 1);
    /* renamed from: c */
    private static final int f11960c = ((f11958a * 2) + 1);

    /* renamed from: io.fabric.sdk.android.services.concurrency.h$a */
    protected static final class C2826a implements ThreadFactory {
        /* renamed from: a */
        private final int f11957a;

        public C2826a(int i) {
            this.f11957a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f11957a);
            thread.setName("Queue");
            return thread;
        }
    }

    public /* synthetic */ BlockingQueue getQueue() {
        return m13768b();
    }

    <T extends Runnable & C2822a & C2828i & C2825f> C2827h(int i, int i2, long j, TimeUnit timeUnit, DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & C2822a & C2828i & C2825f> C2827h m13767a(int i, int i2) {
        return new C2827h(i, i2, 1, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new C2826a(10));
    }

    /* renamed from: a */
    public static C2827h m13766a() {
        return C2827h.m13767a(f11959b, f11960c);
    }

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C4313e(runnable, t);
    }

    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C4313e(callable);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C4314g.m23650a((Object) runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    protected void afterExecute(Runnable runnable, Throwable th) {
        C2828i c2828i = (C2828i) runnable;
        c2828i.mo3583b(true);
        c2828i.mo3581a(th);
        m13768b().m13754d();
        super.afterExecute(runnable, th);
    }

    /* renamed from: b */
    public DependencyPriorityBlockingQueue m13768b() {
        return (DependencyPriorityBlockingQueue) super.getQueue();
    }
}
