package io.branch.referral;

import android.os.AsyncTask;

/* renamed from: io.branch.referral.c */
public abstract class C2733c<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    public android.os.AsyncTask<Params, Progress, Result> m13251a(Params... r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x0012;
    L_0x0006:
        r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;	 Catch:{ Throwable -> 0x000d }
        r0 = r2.executeOnExecutor(r0, r3);	 Catch:{ Throwable -> 0x000d }
        return r0;
    L_0x000d:
        r3 = r2.execute(r3);
        return r3;
    L_0x0012:
        r3 = r2.execute(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.c.a(java.lang.Object[]):android.os.AsyncTask<Params, Progress, Result>");
    }
}
