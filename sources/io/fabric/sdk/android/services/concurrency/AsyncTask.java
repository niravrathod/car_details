package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.LinkedList;
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

public abstract class AsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    private static final int f11933a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    public static final Executor f11934b = new ThreadPoolExecutor(f11936d, f11937e, 1, TimeUnit.SECONDS, f11939g, f11938f);
    /* renamed from: c */
    public static final Executor f11935c = new C2817c();
    /* renamed from: d */
    private static final int f11936d = (f11933a + 1);
    /* renamed from: e */
    private static final int f11937e = ((f11933a * 2) + 1);
    /* renamed from: f */
    private static final ThreadFactory f11938f = new C28111();
    /* renamed from: g */
    private static final BlockingQueue<Runnable> f11939g = new LinkedBlockingQueue(128);
    /* renamed from: h */
    private static final C2815b f11940h = new C2815b();
    /* renamed from: i */
    private static volatile Executor f11941i = f11935c;
    /* renamed from: j */
    private final C2818d<Params, Result> f11942j = new C43092(this);
    /* renamed from: k */
    private final FutureTask<Result> f11943k = new FutureTask<Result>(this, this.f11942j) {
        /* renamed from: a */
        final /* synthetic */ AsyncTask f11920a;

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
            r0 = r3.f11920a;	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            r1 = r3.get();	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            r0.m13734d(r1);	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
            goto L_0x0024;
        L_0x000a:
            r0 = r3.f11920a;
            r1 = 0;
            r0.m13734d(r1);
            goto L_0x0024;
        L_0x0011:
            r0 = move-exception;
            r1 = new java.lang.RuntimeException;
            r0 = r0.getCause();
            r2 = "An error occured while executing doInBackground()";
            r1.<init>(r2, r0);
            throw r1;
        L_0x001e:
            r0 = move-exception;
            r1 = "AsyncTask";
            android.util.Log.w(r1, r0);
        L_0x0024:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.AsyncTask.3.done():void");
        }
    };
    /* renamed from: l */
    private volatile Status f11944l = Status.PENDING;
    /* renamed from: m */
    private final AtomicBoolean f11945m = new AtomicBoolean();
    /* renamed from: n */
    private final AtomicBoolean f11946n = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$1 */
    static class C28111 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f11919a = new AtomicInteger(1);

        C28111() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AsyncTask #");
            stringBuilder.append(this.f11919a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$a */
    private static class C2814a<Data> {
        /* renamed from: a */
        final AsyncTask f11926a;
        /* renamed from: b */
        final Data[] f11927b;

        C2814a(AsyncTask asyncTask, Data... dataArr) {
            this.f11926a = asyncTask;
            this.f11927b = dataArr;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$b */
    private static class C2815b extends Handler {
        public C2815b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C2814a c2814a = (C2814a) message.obj;
            switch (message.what) {
                case 1:
                    c2814a.f11926a.m13736f(c2814a.f11927b[0]);
                    return;
                case 2:
                    c2814a.f11926a.m13743b(c2814a.f11927b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$c */
    private static class C2817c implements Executor {
        /* renamed from: a */
        final LinkedList<Runnable> f11930a;
        /* renamed from: b */
        Runnable f11931b;

        private C2817c() {
            this.f11930a = new LinkedList();
        }

        public synchronized void execute(final Runnable runnable) {
            this.f11930a.offer(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C2817c f11929b;

                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.f11929b.m13729a();
                    }
                }
            });
            if (this.f11931b == null) {
                m13729a();
            }
        }

        /* renamed from: a */
        protected synchronized void m13729a() {
            Runnable runnable = (Runnable) this.f11930a.poll();
            this.f11931b = runnable;
            if (runnable != null) {
                AsyncTask.f11934b.execute(this.f11931b);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$d */
    private static abstract class C2818d<Params, Result> implements Callable<Result> {
        /* renamed from: b */
        Params[] f11932b;

        private C2818d() {
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$2 */
    class C43092 extends C2818d<Params, Result> {
        /* renamed from: a */
        final /* synthetic */ AsyncTask f18039a;

        C43092(AsyncTask asyncTask) {
            this.f18039a = asyncTask;
            super();
        }

        public Result call() {
            this.f18039a.f11946n.set(true);
            Process.setThreadPriority(10);
            return this.f18039a.m13735e(this.f18039a.mo4529a(this.b));
        }
    }

    /* renamed from: a */
    protected abstract Result mo4529a(Params... paramsArr);

    /* renamed from: a */
    protected void mo4530a() {
    }

    /* renamed from: a */
    protected void mo4531a(Result result) {
    }

    /* renamed from: b */
    protected void m13743b(Progress... progressArr) {
    }

    protected void x_() {
    }

    /* renamed from: d */
    private void m13734d(Result result) {
        if (!this.f11946n.get()) {
            m13735e(result);
        }
    }

    /* renamed from: e */
    private Result m13735e(Result result) {
        f11940h.obtainMessage(1, new C2814a(this, result)).sendToTarget();
        return result;
    }

    public final Status w_() {
        return this.f11944l;
    }

    /* renamed from: b */
    protected void mo4532b(Result result) {
        x_();
    }

    /* renamed from: e */
    public final boolean m13744e() {
        return this.f11945m.get();
    }

    /* renamed from: a */
    public final boolean m13741a(boolean z) {
        this.f11945m.set(true);
        return this.f11943k.cancel(z);
    }

    /* renamed from: a */
    public final AsyncTask<Params, Progress, Result> m13737a(Executor executor, Params... paramsArr) {
        if (this.f11944l != Status.PENDING) {
            switch (this.f11944l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    break;
            }
        }
        this.f11944l = Status.RUNNING;
        mo4530a();
        this.f11942j.f11932b = paramsArr;
        executor.execute(this.f11943k);
        return this;
    }

    /* renamed from: f */
    private void m13736f(Result result) {
        if (m13744e()) {
            mo4532b((Object) result);
        } else {
            mo4531a((Object) result);
        }
        this.f11944l = Status.FINISHED;
    }
}
