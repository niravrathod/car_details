package io.branch.referral;

/* renamed from: io.branch.referral.k */
class C2751k {

    /* renamed from: io.branch.referral.k$a */
    public interface C2750a {
        /* renamed from: a */
        void mo3524a(String str);
    }

    /* renamed from: a */
    public static java.lang.Boolean m13325a(android.content.Context r10, final io.branch.referral.C2751k.C2750a r11) {
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
        r0 = 0;
        r1 = "com.facebook.FacebookSdk";	 Catch:{ Throwable -> 0x0074 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0074 }
        r2 = "sdkInitialize";	 Catch:{ Throwable -> 0x0074 }
        r3 = 1;	 Catch:{ Throwable -> 0x0074 }
        r4 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x0074 }
        r5 = android.content.Context.class;	 Catch:{ Throwable -> 0x0074 }
        r4[r0] = r5;	 Catch:{ Throwable -> 0x0074 }
        r1 = r1.getMethod(r2, r4);	 Catch:{ Throwable -> 0x0074 }
        r2 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0074 }
        r2[r0] = r10;	 Catch:{ Throwable -> 0x0074 }
        r4 = 0;	 Catch:{ Throwable -> 0x0074 }
        r1.invoke(r4, r2);	 Catch:{ Throwable -> 0x0074 }
        r1 = "com.facebook.applinks.AppLinkData";	 Catch:{ Throwable -> 0x0074 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0074 }
        r2 = "com.facebook.applinks.AppLinkData$CompletionHandler";	 Catch:{ Throwable -> 0x0074 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ Throwable -> 0x0074 }
        r5 = "fetchDeferredAppLinkData";	 Catch:{ Throwable -> 0x0074 }
        r6 = 3;	 Catch:{ Throwable -> 0x0074 }
        r7 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x0074 }
        r8 = android.content.Context.class;	 Catch:{ Throwable -> 0x0074 }
        r7[r0] = r8;	 Catch:{ Throwable -> 0x0074 }
        r8 = java.lang.String.class;	 Catch:{ Throwable -> 0x0074 }
        r7[r3] = r8;	 Catch:{ Throwable -> 0x0074 }
        r8 = 2;	 Catch:{ Throwable -> 0x0074 }
        r7[r8] = r2;	 Catch:{ Throwable -> 0x0074 }
        r5 = r1.getMethod(r5, r7);	 Catch:{ Throwable -> 0x0074 }
        r7 = new io.branch.referral.k$1;	 Catch:{ Throwable -> 0x0074 }
        r7.<init>(r1, r11);	 Catch:{ Throwable -> 0x0074 }
        r11 = r2.getClassLoader();	 Catch:{ Throwable -> 0x0074 }
        r1 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x0074 }
        r1[r0] = r2;	 Catch:{ Throwable -> 0x0074 }
        r11 = java.lang.reflect.Proxy.newProxyInstance(r11, r1, r7);	 Catch:{ Throwable -> 0x0074 }
        r1 = r10.getResources();	 Catch:{ Throwable -> 0x0074 }
        r2 = "facebook_app_id";	 Catch:{ Throwable -> 0x0074 }
        r7 = "string";	 Catch:{ Throwable -> 0x0074 }
        r9 = r10.getPackageName();	 Catch:{ Throwable -> 0x0074 }
        r1 = r1.getIdentifier(r2, r7, r9);	 Catch:{ Throwable -> 0x0074 }
        r1 = r10.getString(r1);	 Catch:{ Throwable -> 0x0074 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Throwable -> 0x0074 }
        if (r2 == 0) goto L_0x0068;	 Catch:{ Throwable -> 0x0074 }
    L_0x0067:
        goto L_0x0074;	 Catch:{ Throwable -> 0x0074 }
    L_0x0068:
        r2 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0074 }
        r2[r0] = r10;	 Catch:{ Throwable -> 0x0074 }
        r2[r3] = r1;	 Catch:{ Throwable -> 0x0074 }
        r2[r8] = r11;	 Catch:{ Throwable -> 0x0074 }
        r5.invoke(r4, r2);	 Catch:{ Throwable -> 0x0074 }
        r0 = 1;
    L_0x0074:
        r10 = java.lang.Boolean.valueOf(r0);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.k.a(android.content.Context, io.branch.referral.k$a):java.lang.Boolean");
    }
}
