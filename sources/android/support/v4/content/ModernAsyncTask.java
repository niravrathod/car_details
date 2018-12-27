package android.support.v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    private static final ThreadFactory f1308a = new C03751();
    /* renamed from: b */
    private static final BlockingQueue<Runnable> f1309b = new LinkedBlockingQueue(10);
    /* renamed from: c */
    public static final Executor f1310c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f1309b, f1308a);
    /* renamed from: d */
    private static C0379b f1311d;
    /* renamed from: e */
    private static volatile Executor f1312e = f1310c;
    /* renamed from: f */
    private final C0380c<Params, Result> f1313f = new C31202(this);
    /* renamed from: g */
    private final FutureTask<Result> f1314g = new FutureTask<Result>(this, this.f1313f) {
        /* renamed from: a */
        final /* synthetic */ ModernAsyncTask f1299a;

        protected void done() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.get();	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1 = r3.f1299a;	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            r1.m1396c(r0);	 Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x001a, CancellationException -> 0x0013, Throwable -> 0x000a }
            goto L_0x002d;
        L_0x000a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r2 = "An error occurred while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0013:
            r0 = r3.f1299a;
            r1 = 0;
            r0.m1396c(r1);
            goto L_0x002d;
        L_0x001a:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r0 = r0.getCause();
            r2 = "An error occurred while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x0027:
            r0 = move-exception;
            r1 = "AsyncTask";
            android.util.Log.w(r1, r0);
        L_0x002d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.ModernAsyncTask.3.done():void");
        }
    };
    /* renamed from: h */
    private volatile Status f1315h = Status.PENDING;
    /* renamed from: i */
    private final AtomicBoolean f1316i = new AtomicBoolean();
    /* renamed from: j */
    private final AtomicBoolean f1317j = new AtomicBoolean();

    /* renamed from: android.support.v4.content.ModernAsyncTask$1 */
    static class C03751 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f1298a = new AtomicInteger(1);

        C03751() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ModernAsyncTask #");
            stringBuilder.append(this.f1298a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$a */
    private static class C0378a<Data> {
        /* renamed from: a */
        final ModernAsyncTask f1305a;
        /* renamed from: b */
        final Data[] f1306b;

        C0378a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f1305a = modernAsyncTask;
            this.f1306b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$b */
    private static class C0379b extends Handler {
        C0379b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0378a c0378a = (C0378a) message.obj;
            switch (message.what) {
                case 1:
                    c0378a.f1305a.m1399e(c0378a.f1306b[0]);
                    return;
                case 2:
                    c0378a.f1305a.m1395b(c0378a.f1306b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$c */
    private static abstract class C0380c<Params, Result> implements Callable<Result> {
        /* renamed from: b */
        Params[] f1307b;

        C0380c() {
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$2 */
    class C31202 extends C0380c<Params, Result> {
        /* renamed from: a */
        final /* synthetic */ ModernAsyncTask f13210a;

        C31202(ModernAsyncTask modernAsyncTask) {
            this.f13210a = modernAsyncTask;
        }

        public Result call() {
            Throwable th;
            Throwable th2;
            this.f13210a.f1317j.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = this.f13210a.mo320a(this.b);
                try {
                    Binder.flushPendingCommands();
                    this.f13210a.m1398d(a);
                    return a;
                } catch (Throwable th3) {
                    th2 = th3;
                    obj = a;
                    this.f13210a.m1398d(obj);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                this.f13210a.f1316i.set(true);
                throw th;
            }
        }
    }

    /* renamed from: a */
    protected abstract Result mo320a(Params... paramsArr);

    /* renamed from: a */
    protected void m1390a() {
    }

    /* renamed from: a */
    protected void mo321a(Result result) {
    }

    /* renamed from: b */
    protected void m1393b() {
    }

    /* renamed from: b */
    protected void m1395b(Progress... progressArr) {
    }

    /* renamed from: d */
    private static Handler m1387d() {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            if (f1311d == null) {
                f1311d = new C0379b();
            }
            handler = f1311d;
        }
        return handler;
    }

    ModernAsyncTask() {
    }

    /* renamed from: c */
    void m1396c(Result result) {
        if (!this.f1317j.get()) {
            m1398d(result);
        }
    }

    /* renamed from: d */
    Result m1398d(Result result) {
        m1387d().obtainMessage(1, new C0378a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: b */
    protected void mo322b(Result result) {
        m1393b();
    }

    /* renamed from: c */
    public final boolean m1397c() {
        return this.f1316i.get();
    }

    /* renamed from: a */
    public final boolean m1392a(boolean z) {
        this.f1316i.set(true);
        return this.f1314g.cancel(z);
    }

    /* renamed from: a */
    public final ModernAsyncTask<Params, Progress, Result> m1388a(Executor executor, Params... paramsArr) {
        if (this.f1315h != Status.PENDING) {
            switch (this.f1315h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        }
        this.f1315h = Status.RUNNING;
        m1390a();
        this.f1313f.f1307b = paramsArr;
        executor.execute(this.f1314g);
        return this;
    }

    /* renamed from: e */
    void m1399e(Result result) {
        if (m1397c()) {
            mo322b((Object) result);
        } else {
            mo321a((Object) result);
        }
        this.f1315h = Status.FINISHED;
    }
}
