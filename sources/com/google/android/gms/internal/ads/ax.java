package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

final class ax implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f7913a;
    /* renamed from: b */
    private final /* synthetic */ zzael f7914b;

    ax(zzael zzael, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7914b = zzael;
        this.f7913a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0020 in list [B:4:0x0009]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
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
        r0 = r2.f7914b;	 Catch:{ Throwable -> 0x0011 }
        r0.m21108a(r3, r4);	 Catch:{ Throwable -> 0x0011 }
        r0 = r2.f7913a;
        if (r0 == 0) goto L_0x0020;
    L_0x0009:
        r0 = r2.f7913a;
        r0.uncaughtException(r3, r4);
        return;
    L_0x000f:
        r0 = move-exception;
        goto L_0x0021;
    L_0x0011:
        r0 = "AdMob exception reporter failed reporting the exception.";	 Catch:{ all -> 0x000f }
        com.google.android.gms.internal.ads.zzaok.m10003c(r0);	 Catch:{ all -> 0x000f }
        r0 = r2.f7913a;
        if (r0 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r2.f7913a;
        r0.uncaughtException(r3, r4);
        return;
    L_0x0020:
        return;
    L_0x0021:
        r1 = r2.f7913a;
        if (r1 == 0) goto L_0x002a;
    L_0x0025:
        r1 = r2.f7913a;
        r1.uncaughtException(r3, r4);
    L_0x002a:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ax.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
