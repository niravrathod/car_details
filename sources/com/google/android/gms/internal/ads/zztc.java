package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

@zzaer
public final class zztc implements zzm {
    /* renamed from: a */
    private volatile zzst f17335a;
    /* renamed from: b */
    private final Context f17336b;

    public zztc(Context context) {
        this.f17336b = context;
    }

    /* renamed from: a */
    public final com.google.android.gms.internal.ads.zzp mo2294a(com.google.android.gms.internal.ads.zzr<?> r11) {
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
        r10 = this;
        r11 = com.google.android.gms.internal.ads.zzsu.m26849a(r11);
        r0 = com.google.android.gms.ads.internal.zzbv.zzer();
        r0 = r0.elapsedRealtime();
        r2 = 0;
        r3 = 52;
        r4 = new com.google.android.gms.internal.ads.zzaps;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4.<init>();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5 = new com.google.android.gms.internal.ads.tm;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5.<init>(r10, r4);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r6 = new com.google.android.gms.internal.ads.tn;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r6.<init>(r10, r4);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r7 = new com.google.android.gms.internal.ads.zzst;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r8 = r10.f17336b;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r9 = com.google.android.gms.ads.internal.zzbv.zzfa();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r9 = r9.m9925a();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r7.<init>(r8, r9, r5, r6);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r10.f17335a = r7;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5 = r10.f17335a;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5.checkAvailabilityAndConnect();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5 = new com.google.android.gms.internal.ads.tj;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5.<init>(r10, r11);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11 = com.google.android.gms.internal.ads.zzalm.f8869a;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11 = com.google.android.gms.internal.ads.zzaox.m10021a(r4, r5, r11);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = com.google.android.gms.internal.ads.zznw.cb;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = r5.m10897a(r4);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = (java.lang.Integer) r4;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = r4.intValue();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = (long) r4;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r7 = com.google.android.gms.internal.ads.zzalm.f8871c;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11 = com.google.android.gms.internal.ads.zzaox.m10020a(r11, r4, r6, r7);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = new com.google.android.gms.internal.ads.tl;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4.<init>(r10);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r5 = com.google.android.gms.internal.ads.zzalm.f8869a;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11.mo1947a(r4, r5);	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11 = r11.get();	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r11 = (android.os.ParcelFileDescriptor) r11;	 Catch:{ InterruptedException -> 0x00fb, InterruptedException -> 0x00fb, all -> 0x00d7 }
        r4 = com.google.android.gms.ads.internal.zzbv.zzer();
        r4 = r4.elapsedRealtime();
        r4 = r4 - r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        r1 = "Http assets remote cache took ";
        r0.append(r1);
        r0.append(r4);
        r1 = "ms";
        r0.append(r1);
        r0 = r0.toString();
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
        r0 = new com.google.android.gms.internal.ads.zzagf;
        r0.<init>(r11);
        r11 = com.google.android.gms.internal.ads.zzsw.CREATOR;
        r11 = r0.m26180a(r11);
        r11 = (com.google.android.gms.internal.ads.zzsw) r11;
        if (r11 != 0) goto L_0x009a;
    L_0x0099:
        return r2;
    L_0x009a:
        r0 = r11.f20390a;
        if (r0 != 0) goto L_0x00cf;
    L_0x009e:
        r0 = r11.f20394e;
        r0 = r0.length;
        r1 = r11.f20395f;
        r1 = r1.length;
        if (r0 == r1) goto L_0x00a7;
    L_0x00a6:
        return r2;
    L_0x00a7:
        r6 = new java.util.HashMap;
        r6.<init>();
        r0 = 0;
    L_0x00ad:
        r1 = r11.f20394e;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x00c0;
    L_0x00b2:
        r1 = r11.f20394e;
        r1 = r1[r0];
        r2 = r11.f20395f;
        r2 = r2[r0];
        r6.put(r1, r2);
        r0 = r0 + 1;
        goto L_0x00ad;
    L_0x00c0:
        r0 = new com.google.android.gms.internal.ads.zzp;
        r4 = r11.f20392c;
        r5 = r11.f20393d;
        r7 = r11.f20396g;
        r8 = r11.f20397h;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8);
        return r0;
    L_0x00cf:
        r0 = new com.google.android.gms.internal.ads.zzae;
        r11 = r11.f20391b;
        r0.<init>(r11);
        throw r0;
    L_0x00d7:
        r11 = move-exception;
        r2 = com.google.android.gms.ads.internal.zzbv.zzer();
        r4 = r2.elapsedRealtime();
        r4 = r4 - r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r3);
        r1 = "Http assets remote cache took ";
        r0.append(r1);
        r0.append(r4);
        r1 = "ms";
        r0.append(r1);
        r0 = r0.toString();
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
        throw r11;
    L_0x00fb:
        r11 = com.google.android.gms.ads.internal.zzbv.zzer();
        r4 = r11.elapsedRealtime();
        r4 = r4 - r0;
        r11 = new java.lang.StringBuilder;
        r11.<init>(r3);
        r0 = "Http assets remote cache took ";
        r11.append(r0);
        r11.append(r4);
        r0 = "ms";
        r11.append(r0);
        r11 = r11.toString();
        com.google.android.gms.internal.ads.zzalg.m21225a(r11);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    /* renamed from: a */
    private final void m21962a() {
        if (this.f17335a != null) {
            this.f17335a.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
