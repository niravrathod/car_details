package com.crashlytics.android.core;

import java.util.concurrent.ExecutorService;

/* renamed from: com.crashlytics.android.core.i */
class C1370i {
    /* renamed from: a */
    private final ExecutorService f4288a;

    public C1370i(ExecutorService executorService) {
        this.f4288a = executorService;
    }

    /* renamed from: a */
    <T> T m5554a(java.util.concurrent.Callable<T> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = android.os.Looper.getMainLooper();	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r2 = android.os.Looper.myLooper();	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        if (r1 != r2) goto L_0x001a;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
    L_0x000b:
        r1 = r4.f4288a;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r5 = r1.submit(r5);	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r1 = 4;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r5 = r5.get(r1, r3);	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        return r5;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
    L_0x001a:
        r1 = r4.f4288a;	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r5 = r1.submit(r5);	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        r5 = r5.get();	 Catch:{ RejectedExecutionException -> 0x0032, Exception -> 0x0025 }
        return r5;
    L_0x0025:
        r5 = move-exception;
        r1 = io.fabric.sdk.android.C2766c.m13524h();
        r2 = "CrashlyticsCore";
        r3 = "Failed to execute task.";
        r1.mo3562e(r2, r3, r5);
        return r0;
    L_0x0032:
        r5 = io.fabric.sdk.android.C2766c.m13524h();
        r1 = "CrashlyticsCore";
        r2 = "Executor is shut down because we're handling a fatal crash.";
        r5.mo3554a(r1, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.i.a(java.util.concurrent.Callable):T");
    }

    /* renamed from: a */
    java.util.concurrent.Future<?> m5555a(final java.lang.Runnable r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f4288a;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1 = new com.crashlytics.android.core.i$1;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1.<init>(r2, r3);	 Catch:{ RejectedExecutionException -> 0x000c }
        r3 = r0.submit(r1);	 Catch:{ RejectedExecutionException -> 0x000c }
        return r3;
    L_0x000c:
        r3 = io.fabric.sdk.android.C2766c.m13524h();
        r0 = "CrashlyticsCore";
        r1 = "Executor is shut down because we're handling a fatal crash.";
        r3.mo3554a(r0, r1);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.i.a(java.lang.Runnable):java.util.concurrent.Future<?>");
    }

    /* renamed from: b */
    <T> java.util.concurrent.Future<T> m5556b(final java.util.concurrent.Callable<T> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f4288a;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1 = new com.crashlytics.android.core.i$2;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1.<init>(r2, r3);	 Catch:{ RejectedExecutionException -> 0x000c }
        r3 = r0.submit(r1);	 Catch:{ RejectedExecutionException -> 0x000c }
        return r3;
    L_0x000c:
        r3 = io.fabric.sdk.android.C2766c.m13524h();
        r0 = "CrashlyticsCore";
        r1 = "Executor is shut down because we're handling a fatal crash.";
        r3.mo3554a(r0, r1);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.i.b(java.util.concurrent.Callable):java.util.concurrent.Future<T>");
    }
}
