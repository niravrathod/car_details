package com.bumptech.glide.load.engine.p062c;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.engine.c.a */
public final class C1256a implements ExecutorService {
    /* renamed from: a */
    private static final long f3977a = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: b */
    private static volatile int f3978b;
    /* renamed from: c */
    private final ExecutorService f3979c;

    /* renamed from: com.bumptech.glide.load.engine.c.a$a */
    private static final class C1254a implements ThreadFactory {
        /* renamed from: a */
        final C1255b f3969a;
        /* renamed from: b */
        final boolean f3970b;
        /* renamed from: c */
        private final String f3971c;
        /* renamed from: d */
        private int f3972d;

        C1254a(String str, C1255b c1255b, boolean z) {
            this.f3971c = str;
            this.f3969a = c1255b;
            this.f3970b = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread c12531;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("glide-");
            stringBuilder.append(this.f3971c);
            stringBuilder.append("-thread-");
            stringBuilder.append(this.f3972d);
            c12531 = new Thread(this, runnable, stringBuilder.toString()) {
                /* renamed from: a */
                final /* synthetic */ C1254a f3968a;

                public void run() {
                    Process.setThreadPriority(9);
                    if (this.f3968a.f3970b) {
                        StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        this.f3968a.f3969a.mo1031a(th);
                    }
                }
            };
            this.f3972d++;
            return c12531;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.c.a$b */
    public interface C1255b {
        /* renamed from: a */
        public static final C1255b f3973a = new C34771();
        /* renamed from: b */
        public static final C1255b f3974b = new C34782();
        /* renamed from: c */
        public static final C1255b f3975c = new C34793();
        /* renamed from: d */
        public static final C1255b f3976d = f3974b;

        /* renamed from: com.bumptech.glide.load.engine.c.a$b$1 */
        class C34771 implements C1255b {
            /* renamed from: a */
            public void mo1031a(Throwable th) {
            }

            C34771() {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.c.a$b$2 */
        class C34782 implements C1255b {
            C34782() {
            }

            /* renamed from: a */
            public void mo1031a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.c.a$b$3 */
        class C34793 implements C1255b {
            C34793() {
            }

            /* renamed from: a */
            public void mo1031a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: a */
        void mo1031a(Throwable th);
    }

    /* renamed from: a */
    public static C1256a m5090a() {
        return C1256a.m5092a(1, "disk-cache", C1255b.f3976d);
    }

    /* renamed from: a */
    public static C1256a m5092a(int i, String str, C1255b c1255b) {
        return new C1256a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1254a(str, c1255b, true)));
    }

    /* renamed from: b */
    public static C1256a m5093b() {
        return C1256a.m5094b(C1256a.m5097e(), "source", C1255b.f3976d);
    }

    /* renamed from: b */
    public static C1256a m5094b(int i, String str, C1255b c1255b) {
        return new C1256a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1254a(str, c1255b, false)));
    }

    /* renamed from: c */
    public static C1256a m5095c() {
        return new C1256a(new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, f3977a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1254a("source-unlimited", C1255b.f3976d, false)));
    }

    /* renamed from: d */
    public static C1256a m5096d() {
        return C1256a.m5091a(C1256a.m5097e() >= 4 ? 2 : 1, C1255b.f3976d);
    }

    /* renamed from: a */
    public static C1256a m5091a(int i, C1255b c1255b) {
        return new C1256a(new ThreadPoolExecutor(0, i, f3977a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1254a("animation", c1255b, true)));
    }

    C1256a(ExecutorService executorService) {
        this.f3979c = executorService;
    }

    public void execute(Runnable runnable) {
        this.f3979c.execute(runnable);
    }

    public Future<?> submit(Runnable runnable) {
        return this.f3979c.submit(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3979c.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3979c.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f3979c.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3979c.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3979c.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3979c.submit(callable);
    }

    public void shutdown() {
        this.f3979c.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f3979c.shutdownNow();
    }

    public boolean isShutdown() {
        return this.f3979c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f3979c.isTerminated();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3979c.awaitTermination(j, timeUnit);
    }

    public String toString() {
        return this.f3979c.toString();
    }

    /* renamed from: e */
    public static int m5097e() {
        if (f3978b == 0) {
            f3978b = Math.min(4, C1258b.m5098a());
        }
        return f3978b;
    }
}
