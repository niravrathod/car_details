package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbb;
import java.util.concurrent.Future;

@zzaer
public final class zzada extends zzalc {
    /* renamed from: a */
    private final zzact f19681a;
    /* renamed from: b */
    private final zzaft f19682b;
    /* renamed from: c */
    private final zzakn f19683c;
    /* renamed from: d */
    private final zzadd f19684d;
    /* renamed from: e */
    private final Object f19685e;
    /* renamed from: f */
    private Future<zzakm> f19686f;

    public zzada(Context context, zzbb zzbb, zzakn zzakn, zzck zzck, zzact zzact, zzoj zzoj) {
        this(zzakn, zzact, new zzadd(context, zzbb, new zzamz(context), zzck, zzakn, zzoj));
    }

    private zzada(zzakn zzakn, zzact zzact, zzadd zzadd) {
        this.f19685e = new Object();
        this.f19683c = zzakn;
        this.f19682b = zzakn.f8807b;
        this.f19681a = zzact;
        this.f19684d = zzadd;
    }

    /* renamed from: a */
    public final void mo4075a() {
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
        r49 = this;
        r1 = r49;
        r2 = 0;
        r3 = 0;
        r4 = r1.f19685e;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        monitor-enter(r4);	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r0 = r1.f19684d;	 Catch:{ all -> 0x0021 }
        r0 = com.google.android.gms.internal.ads.zzalm.m9773a(r0);	 Catch:{ all -> 0x0021 }
        r1.f19686f = r0;	 Catch:{ all -> 0x0021 }
        monitor-exit(r4);	 Catch:{ all -> 0x0021 }
        r0 = r1.f19686f;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r0 = r0.get(r4, r6);	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r0 = (com.google.android.gms.internal.ads.zzakm) r0;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
        r2 = -2;
        r3 = r0;
        r8 = -2;
        goto L_0x0033;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0021 }
        throw r0;	 Catch:{ TimeoutException -> 0x0026, ExecutionException -> 0x0024, ExecutionException -> 0x0024, ExecutionException -> 0x0024 }
    L_0x0024:
        r8 = 0;
        goto L_0x0033;
    L_0x0026:
        r0 = "Timed out waiting for native ad.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        r2 = 2;
        r0 = r1.f19686f;
        r4 = 1;
        r0.cancel(r4);
        r8 = 2;
    L_0x0033:
        if (r3 == 0) goto L_0x0038;
    L_0x0035:
        r0 = r3;
        goto L_0x00df;
    L_0x0038:
        r0 = new com.google.android.gms.internal.ads.zzakm;
        r4 = r0;
        r2 = r1.f19683c;
        r2 = r2.f8806a;
        r5 = r2.f19735c;
        r6 = 0;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r2 = r1.f19682b;
        r11 = r2.f19796k;
        r2 = r1.f19682b;
        r12 = r2.f19795j;
        r2 = r1.f19683c;
        r2 = r2.f8806a;
        r14 = r2.f19741i;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r2 = r1.f19682b;
        r2 = r2.f19793h;
        r21 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8809d;
        r23 = r2;
        r2 = r1.f19682b;
        r2 = r2.f19791f;
        r24 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8811f;
        r26 = r2;
        r2 = r1.f19682b;
        r2 = r2.f19798m;
        r28 = r2;
        r2 = r1.f19682b;
        r2 = r2.f19799n;
        r30 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8813h;
        r31 = r2;
        r32 = 0;
        r33 = 0;
        r34 = 0;
        r35 = 0;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19763D;
        r36 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19764E;
        r37 = r2;
        r38 = 0;
        r39 = 0;
        r2 = r1.f19682b;
        r2 = r2.f19771L;
        r40 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8814i;
        r41 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19774O;
        r42 = r2;
        r43 = 0;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19776Q;
        r44 = r2;
        r45 = 0;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19778S;
        r46 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19779T;
        r47 = r2;
        r2 = r1.f19683c;
        r2 = r2.f8807b;
        r2 = r2.f19781V;
        r48 = r2;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);
    L_0x00df:
        r2 = com.google.android.gms.internal.ads.zzalo.f8872a;
        r3 = new com.google.android.gms.internal.ads.w;
        r3.<init>(r1, r0);
        r2.post(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzada.a():void");
    }

    public final void m_() {
        synchronized (this.f19685e) {
            if (this.f19686f != null) {
                this.f19686f.cancel(true);
            }
        }
    }
}
