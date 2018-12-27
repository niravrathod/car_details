package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.Method;

public final class RouteException extends RuntimeException {
    /* renamed from: a */
    private static final Method f12370a;
    private IOException lastException;

    static {
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
        r0 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r1 = "addSuppressed";	 Catch:{ Exception -> 0x0011 }
        r2 = 1;	 Catch:{ Exception -> 0x0011 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0011 }
        r3 = 0;	 Catch:{ Exception -> 0x0011 }
        r4 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0011 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        f12370a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RouteException.<clinit>():void");
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.lastException = iOException;
    }

    /* renamed from: a */
    public IOException m14211a() {
        return this.lastException;
    }

    /* renamed from: a */
    public void m14212a(IOException iOException) {
        m14210a(iOException, this.lastException);
        this.lastException = iOException;
    }

    /* renamed from: a */
    private void m14210a(java.io.IOException r4, java.io.IOException r5) {
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
        r3 = this;
        r0 = f12370a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = f12370a;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = 1;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r1[r2] = r5;	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
        r0.invoke(r4, r1);	 Catch:{ InvocationTargetException -> 0x000f, InvocationTargetException -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RouteException.a(java.io.IOException, java.io.IOException):void");
    }
}
