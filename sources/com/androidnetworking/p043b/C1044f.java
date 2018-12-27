package com.androidnetworking.p043b;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.androidnetworking.b.f */
public class C1044f implements ThreadFactory {
    /* renamed from: a */
    private final int f3446a;

    public C1044f(int i) {
        this.f3446a = i;
    }

    public Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C1044f f3445b;

            public void run() {
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
                r1 = this;
                r0 = r1.f3445b;	 Catch:{ Throwable -> 0x0009 }
                r0 = r0.f3446a;	 Catch:{ Throwable -> 0x0009 }
                android.os.Process.setThreadPriority(r0);	 Catch:{ Throwable -> 0x0009 }
            L_0x0009:
                r0 = r2;
                r0.run();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.androidnetworking.b.f.1.run():void");
            }
        });
    }
}
