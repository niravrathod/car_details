package com.google.android.gms.internal.ads;

import java.util.HashMap;

public abstract class zzbj<K, V> {
    /* renamed from: a */
    private static final String f9273a = "zzbj";

    /* renamed from: a */
    protected abstract HashMap<K, V> mo2433a();

    /* renamed from: a */
    protected abstract void mo2434a(String str);

    public java.lang.String toString() {
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
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x001e }
        r0.<init>();	 Catch:{ IOException -> 0x001e }
        r1 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x001e }
        r1.<init>(r0);	 Catch:{ IOException -> 0x001e }
        r2 = r3.mo2433a();	 Catch:{ IOException -> 0x001e }
        r1.writeObject(r2);	 Catch:{ IOException -> 0x001e }
        r1.close();	 Catch:{ IOException -> 0x001e }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x001e }
        r1 = 0;	 Catch:{ IOException -> 0x001e }
        r0 = android.util.Base64.encodeToString(r0, r1);	 Catch:{ IOException -> 0x001e }
        return r0;
    L_0x001e:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbj.toString():java.lang.String");
    }

    /* renamed from: b */
    protected static <K, V> java.util.HashMap<K, V> m10464b(java.lang.String r2) {
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
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        if (r0 != 0) goto L_0x0027;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x0006:
        r0 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2 = r2.getBytes();	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r1 = 0;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2 = android.util.Base64.decode(r2, r1);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2 = r2.readObject();	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r2 = (java.util.HashMap) r2;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        return r2;
    L_0x0020:
        r2 = f9273a;
        r0 = "decode object failure";
        android.util.Log.d(r2, r0);
    L_0x0027:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbj.b(java.lang.String):java.util.HashMap<K, V>");
    }
}
