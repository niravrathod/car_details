package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzhx.zza.zzb;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzhv {
    /* renamed from: a */
    private final zzia f9536a;
    @GuardedBy("this")
    /* renamed from: b */
    private final zziy f9537b;
    /* renamed from: c */
    private final boolean f9538c;

    /* renamed from: a */
    public static zzhv m10677a() {
        return new zzhv();
    }

    public zzhv(zzia zzia) {
        this.f9536a = zzia;
        this.f9538c = ((Boolean) zzkd.m10713e().m10897a(zznw.cq)).booleanValue();
        this.f9537b = new zziy();
        m10678b();
    }

    private zzhv() {
        this.f9538c = false;
        this.f9536a = new zzia();
        this.f9537b = new zziy();
        m10678b();
    }

    /* renamed from: a */
    public final synchronized void m10684a(zzb zzb) {
        if (this.f9538c) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cr)).booleanValue()) {
                m10680c(zzb);
            } else {
                m10679b(zzb);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m10679b(zzb zzb) {
        this.f9537b.f20168b = m10681c();
        this.f9536a.m10686a(zzbgz.m10450a(this.f9537b)).m10689b(zzb.mo2419a()).m10688a();
        String str = "Logging Event with event code : ";
        zzb = String.valueOf(Integer.toString(zzb.mo2419a(), 10));
        zzalg.m21225a(zzb.length() != 0 ? str.concat(zzb) : new String(str));
    }

    /* renamed from: c */
    private final synchronized void m10680c(com.google.android.gms.internal.ads.zzhx.zza.zzb r4) {
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
        r3 = this;
        monitor-enter(r3);
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ all -> 0x0056 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r3);
        return;
    L_0x0009:
        r1 = new java.io.File;	 Catch:{ all -> 0x0056 }
        r2 = "clearcut_events.txt";	 Catch:{ all -> 0x0056 }
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0056 }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x004f }
        r2 = 1;	 Catch:{ FileNotFoundException -> 0x004f }
        r0.<init>(r1, r2);	 Catch:{ FileNotFoundException -> 0x004f }
        r4 = r3.m10682d(r4);	 Catch:{ IOException -> 0x0034 }
        r4 = r4.getBytes();	 Catch:{ IOException -> 0x0034 }
        r0.write(r4);	 Catch:{ IOException -> 0x0034 }
        r4 = 10;	 Catch:{ IOException -> 0x0034 }
        r0.write(r4);	 Catch:{ IOException -> 0x0034 }
        r0.close();	 Catch:{ IOException -> 0x002b }
        monitor-exit(r3);
        return;
    L_0x002b:
        r4 = "Could not close Clearcut output stream.";	 Catch:{ FileNotFoundException -> 0x004f }
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);	 Catch:{ FileNotFoundException -> 0x004f }
        monitor-exit(r3);
        return;
    L_0x0032:
        r4 = move-exception;
        goto L_0x0045;
    L_0x0034:
        r4 = "Could not write Clearcut to file.";	 Catch:{ all -> 0x0032 }
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);	 Catch:{ all -> 0x0032 }
        r0.close();	 Catch:{ IOException -> 0x003e }
        monitor-exit(r3);
        return;
    L_0x003e:
        r4 = "Could not close Clearcut output stream.";	 Catch:{ FileNotFoundException -> 0x004f }
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);	 Catch:{ FileNotFoundException -> 0x004f }
        monitor-exit(r3);
        return;
    L_0x0045:
        r0.close();	 Catch:{ IOException -> 0x0049 }
        goto L_0x004e;
    L_0x0049:
        r0 = "Could not close Clearcut output stream.";	 Catch:{ FileNotFoundException -> 0x004f }
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);	 Catch:{ FileNotFoundException -> 0x004f }
    L_0x004e:
        throw r4;	 Catch:{ FileNotFoundException -> 0x004f }
    L_0x004f:
        r4 = "Could not find file for Clearcut";	 Catch:{ all -> 0x0056 }
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);	 Catch:{ all -> 0x0056 }
        monitor-exit(r3);
        return;
    L_0x0056:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhv.c(com.google.android.gms.internal.ads.zzhx$zza$zzb):void");
    }

    /* renamed from: d */
    private final synchronized String m10682d(zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.f9537b.f20167a, Long.valueOf(zzbv.zzer().elapsedRealtime()), Integer.valueOf(zzb.mo2419a())});
    }

    /* renamed from: a */
    public final synchronized void m10683a(zzhw zzhw) {
        if (this.f9538c) {
            try {
                zzhw.mo1723a(this.f9537b);
            } catch (Throwable e) {
                zzbv.zzeo().m9714a(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m10678b() {
        this.f9537b.f20170d = new zziu();
        this.f9537b.f20170d.f20140b = new zziv();
        this.f9537b.f20169c = new zziw();
    }

    /* renamed from: c */
    private static long[] m10681c() {
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
        r0 = com.google.android.gms.internal.ads.zznw.m10903b();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r0.iterator();
    L_0x000d:
        r2 = r0.hasNext();
        r3 = 0;
        if (r2 == 0) goto L_0x0035;
    L_0x0014:
        r2 = r0.next();
        r2 = (java.lang.String) r2;
        r4 = ",";
        r2 = r2.split(r4);
        r4 = r2.length;
    L_0x0021:
        if (r3 >= r4) goto L_0x000d;
    L_0x0023:
        r5 = r2[r3];
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ NumberFormatException -> 0x002d }
        r1.add(r5);	 Catch:{ NumberFormatException -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r5 = "Experiment ID is not a number";
        com.google.android.gms.internal.ads.zzalg.m21225a(r5);
    L_0x0032:
        r3 = r3 + 1;
        goto L_0x0021;
    L_0x0035:
        r0 = r1.size();
        r0 = new long[r0];
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
        r4 = 0;
    L_0x0042:
        if (r3 >= r2) goto L_0x0055;
    L_0x0044:
        r5 = r1.get(r3);
        r3 = r3 + 1;
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r0[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0042;
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhv.c():long[]");
    }
}
