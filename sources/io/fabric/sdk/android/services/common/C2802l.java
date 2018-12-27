package io.fabric.sdk.android.services.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.fabric.sdk.android.services.common.l */
public final class C2802l {
    /* renamed from: a */
    public static ExecutorService m13688a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C2802l.m13692c(str));
        C2802l.m13689a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m13691b(String str) {
        Object newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(C2802l.m13692c(str));
        C2802l.m13689a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m13692c(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public Thread newThread(final Runnable runnable) {
                runnable = Executors.defaultThreadFactory().newThread(new C2797h(this) {
                    /* renamed from: b */
                    final /* synthetic */ C28011 f18030b;

                    /* renamed from: a */
                    public void mo1138a() {
                        runnable.run();
                    }
                });
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(atomicLong.getAndIncrement());
                runnable.setName(stringBuilder.toString());
                return runnable;
            }
        };
    }

    /* renamed from: a */
    private static final void m13689a(String str, ExecutorService executorService) {
        C2802l.m13690a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m13690a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        final String str2 = str;
        final ExecutorService executorService2 = executorService;
        final long j2 = j;
        final TimeUnit timeUnit2 = timeUnit;
        Runnable c43052 = new C2797h() {
            /* renamed from: a */
            public void mo1138a() {
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
                r7 = this;
                r0 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ InterruptedException -> 0x004f }
                r1 = "Fabric";	 Catch:{ InterruptedException -> 0x004f }
                r2 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x004f }
                r2.<init>();	 Catch:{ InterruptedException -> 0x004f }
                r3 = "Executing shutdown hook for ";	 Catch:{ InterruptedException -> 0x004f }
                r2.append(r3);	 Catch:{ InterruptedException -> 0x004f }
                r3 = r3;	 Catch:{ InterruptedException -> 0x004f }
                r2.append(r3);	 Catch:{ InterruptedException -> 0x004f }
                r2 = r2.toString();	 Catch:{ InterruptedException -> 0x004f }
                r0.mo3554a(r1, r2);	 Catch:{ InterruptedException -> 0x004f }
                r0 = r4;	 Catch:{ InterruptedException -> 0x004f }
                r0.shutdown();	 Catch:{ InterruptedException -> 0x004f }
                r0 = r4;	 Catch:{ InterruptedException -> 0x004f }
                r1 = r5;	 Catch:{ InterruptedException -> 0x004f }
                r3 = r7;	 Catch:{ InterruptedException -> 0x004f }
                r0 = r0.awaitTermination(r1, r3);	 Catch:{ InterruptedException -> 0x004f }
                if (r0 != 0) goto L_0x006d;	 Catch:{ InterruptedException -> 0x004f }
            L_0x002d:
                r0 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ InterruptedException -> 0x004f }
                r1 = "Fabric";	 Catch:{ InterruptedException -> 0x004f }
                r2 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x004f }
                r2.<init>();	 Catch:{ InterruptedException -> 0x004f }
                r3 = r3;	 Catch:{ InterruptedException -> 0x004f }
                r2.append(r3);	 Catch:{ InterruptedException -> 0x004f }
                r3 = " did not shut down in the allocated time. Requesting immediate shutdown.";	 Catch:{ InterruptedException -> 0x004f }
                r2.append(r3);	 Catch:{ InterruptedException -> 0x004f }
                r2 = r2.toString();	 Catch:{ InterruptedException -> 0x004f }
                r0.mo3554a(r1, r2);	 Catch:{ InterruptedException -> 0x004f }
                r0 = r4;	 Catch:{ InterruptedException -> 0x004f }
                r0.shutdownNow();	 Catch:{ InterruptedException -> 0x004f }
                goto L_0x006d;
            L_0x004f:
                r0 = io.fabric.sdk.android.C2766c.m13524h();
                r1 = "Fabric";
                r2 = java.util.Locale.US;
                r3 = "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.";
                r4 = 1;
                r4 = new java.lang.Object[r4];
                r5 = 0;
                r6 = r3;
                r4[r5] = r6;
                r2 = java.lang.String.format(r2, r3, r4);
                r0.mo3554a(r1, r2);
                r0 = r4;
                r0.shutdownNow();
            L_0x006d:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.l.2.a():void");
            }
        };
        executorService = new StringBuilder();
        executorService.append("Crashlytics Shutdown Hook for ");
        executorService.append(str);
        runtime.addShutdownHook(new Thread(c43052, executorService.toString()));
    }
}
