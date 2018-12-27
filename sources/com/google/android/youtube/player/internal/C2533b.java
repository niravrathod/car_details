package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.internal.C2554v.C2552a;
import com.google.android.youtube.player.internal.C2554v.C2553b;

/* renamed from: com.google.android.youtube.player.internal.b */
public abstract class C2533b {
    /* renamed from: a */
    private static final C2533b f10881a = C2533b.m12474b();

    /* renamed from: a */
    public static C2533b m12473a() {
        return f10881a;
    }

    /* renamed from: b */
    private static com.google.android.youtube.player.internal.C2533b m12474b() {
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
        r0 = "com.google.android.youtube.api.locallylinked.LocallyLinkedFactory";	 Catch:{ ClassNotFoundException -> 0x0021 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0021 }
        r1 = com.google.android.youtube.player.internal.C2533b.class;	 Catch:{ ClassNotFoundException -> 0x0021 }
        r0 = r0.asSubclass(r1);	 Catch:{ ClassNotFoundException -> 0x0021 }
        r0 = r0.newInstance();	 Catch:{ InstantiationException -> 0x001a, IllegalAccessException -> 0x0013 }
        r0 = (com.google.android.youtube.player.internal.C2533b) r0;	 Catch:{ InstantiationException -> 0x001a, IllegalAccessException -> 0x0013 }
        return r0;
    L_0x0013:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;	 Catch:{ ClassNotFoundException -> 0x0021 }
        r1.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0021 }
        throw r1;	 Catch:{ ClassNotFoundException -> 0x0021 }
    L_0x001a:
        r0 = move-exception;	 Catch:{ ClassNotFoundException -> 0x0021 }
        r1 = new java.lang.IllegalStateException;	 Catch:{ ClassNotFoundException -> 0x0021 }
        r1.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0021 }
        throw r1;	 Catch:{ ClassNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = new com.google.android.youtube.player.internal.d;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.b.b():com.google.android.youtube.player.internal.b");
    }

    /* renamed from: a */
    public abstract C4157e mo3224a(Context context, String str, C2552a c2552a, C2553b c2553b);

    /* renamed from: a */
    public abstract C2536g mo3225a(Activity activity, C4157e c4157e, boolean z);
}
