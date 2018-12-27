package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzaer
public final class zzyh implements zzxw {
    /* renamed from: a */
    private final zzafp f17357a;
    /* renamed from: b */
    private final zzyn f17358b;
    /* renamed from: c */
    private final Context f17359c;
    /* renamed from: d */
    private final zzxy f17360d;
    /* renamed from: e */
    private final boolean f17361e;
    /* renamed from: f */
    private final long f17362f;
    /* renamed from: g */
    private final long f17363g;
    /* renamed from: h */
    private final int f17364h;
    /* renamed from: i */
    private final Object f17365i = new Object();
    /* renamed from: j */
    private boolean f17366j = false;
    /* renamed from: k */
    private final Map<zzapi<zzye>, zzyb> f17367k = new HashMap();
    /* renamed from: l */
    private final boolean f17368l;
    /* renamed from: m */
    private final String f17369m;
    /* renamed from: n */
    private List<zzye> f17370n = new ArrayList();
    /* renamed from: o */
    private final boolean f17371o;

    public zzyh(Context context, zzafp zzafp, zzyn zzyn, zzxy zzxy, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f17359c = context;
        this.f17357a = zzafp;
        this.f17358b = zzyn;
        this.f17360d = zzxy;
        this.f17361e = z;
        this.f17368l = z2;
        this.f17369m = str;
        this.f17362f = j;
        this.f17363g = j2;
        this.f17364h = 2;
        this.f17371o = z3;
    }

    /* renamed from: a */
    public final zzye mo2753a(List<zzxx> list) {
        zzaok.m10001b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzjo zzjo = this.f17357a.f19736d;
        int[] iArr = new int[2];
        if (zzjo.f20233g != null) {
            zzbv.zzfe();
            if (zzyg.m11197a(r0.f17369m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjo[] zzjoArr = zzjo.f20233g;
                int length = zzjoArr.length;
                while (i < length) {
                    zzjo zzjo2 = zzjoArr[i];
                    if (i2 == zzjo2.f20231e && i3 == zzjo2.f20228b) {
                        zzjo = zzjo2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzxx zzxx = (zzxx) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(zzxx.f9837b);
            zzaok.m10005d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = zzxx.f9838c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = r0.f17359c;
                zzyn zzyn = r0.f17358b;
                zzxy zzxy = r0.f17360d;
                zzjk zzjk = r0.f17357a.f19735c;
                zzaop zzaop = r0.f17357a.f19743k;
                boolean z = r0.f17361e;
                boolean z2 = r0.f17368l;
                zzpy zzpy = r0.f17357a.f19757y;
                Iterator it3 = it;
                List list2 = r0.f17357a.f19746n;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z3 = z;
                zzxx zzxx2 = zzxx;
                zzjo zzjo3 = zzjo;
                zzaop zzaop2 = zzaop;
                zzyb zzyb = new zzyb(context, str2, zzyn, zzxy, zzxx2, zzjk, zzjo3, zzaop2, z3, z2, zzpy, list2, r0.f17357a.f19758z, r0.f17357a.f19730X, r0.f17371o);
                zzapi a = zzalm.m9773a(new wn(r0, zzyb));
                r0.f17367k.put(a, zzyb);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        List list3 = arrayList;
        if (r0.f17364h != 2) {
            return m22004b(list3);
        }
        return m22007c(list3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzye m22004b(java.util.List<com.google.android.gms.internal.ads.zzapi<com.google.android.gms.internal.ads.zzye>> r4) {
        /*
        r3 = this;
        r0 = r3.f17365i;
        monitor-enter(r0);
        r1 = r3.f17366j;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x000f;
    L_0x0007:
        r4 = new com.google.android.gms.internal.ads.zzye;	 Catch:{ all -> 0x0047 }
        r1 = -1;
        r4.<init>(r1);	 Catch:{ all -> 0x0047 }
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r4;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        r4 = r4.iterator();
    L_0x0014:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x001a:
        r0 = r4.next();
        r0 = (com.google.android.gms.internal.ads.zzapi) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = (com.google.android.gms.internal.ads.zzye) r1;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2 = r3.f17370n;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r2.add(r1);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r2 = r1.f9878a;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        if (r2 != 0) goto L_0x0014;
    L_0x0031:
        r3.m22003a(r0);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        return r1;
    L_0x0035:
        r0 = move-exception;
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.ads.zzaok.m10004c(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r4 = 0;
        r3.m22003a(r4);
        r4 = new com.google.android.gms.internal.ads.zzye;
        r0 = 1;
        r4.<init>(r0);
        return r4;
    L_0x0047:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyh.b(java.util.List):com.google.android.gms.internal.ads.zzye");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private final com.google.android.gms.internal.ads.zzye m22007c(java.util.List<com.google.android.gms.internal.ads.zzapi<com.google.android.gms.internal.ads.zzye>> r14) {
        /*
        r13 = this;
        r0 = r13.f17365i;
        monitor-enter(r0);
        r1 = r13.f17366j;	 Catch:{ all -> 0x00b6 }
        r2 = -1;
        if (r1 == 0) goto L_0x000f;
    L_0x0008:
        r14 = new com.google.android.gms.internal.ads.zzye;	 Catch:{ all -> 0x00b6 }
        r14.<init>(r2);	 Catch:{ all -> 0x00b6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        return r14;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        r0 = r13.f17360d;
        r0 = r0.f9870n;
        r3 = -1;
        r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r13.f17360d;
        r0 = r0.f9870n;
        goto L_0x0021;
    L_0x001f:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0021:
        r14 = r14.iterator();
        r3 = 0;
        r1 = r0;
        r0 = r3;
        r4 = -1;
    L_0x0029:
        r5 = r14.hasNext();
        if (r5 == 0) goto L_0x00a9;
    L_0x002f:
        r5 = r14.next();
        r5 = (com.google.android.gms.internal.ads.zzapi) r5;
        r6 = com.google.android.gms.ads.internal.zzbv.zzer();
        r6 = r6.currentTimeMillis();
        r8 = 0;
        r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r10 != 0) goto L_0x0054;
    L_0x0043:
        r10 = r5.isDone();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x0054;
    L_0x0049:
        r10 = r5.get();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r10 = (com.google.android.gms.internal.ads.zzye) r10;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        goto L_0x005c;
    L_0x0050:
        r14 = move-exception;
        goto L_0x009b;
    L_0x0052:
        r5 = move-exception;
        goto L_0x0087;
    L_0x0054:
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r10 = r5.get(r1, r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r10 = (com.google.android.gms.internal.ads.zzye) r10;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
    L_0x005c:
        r11 = r13.f17370n;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r11.add(r10);	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r10 == 0) goto L_0x0078;
    L_0x0063:
        r11 = r10.f9878a;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 != 0) goto L_0x0078;
    L_0x0067:
        r11 = r10.f9883f;	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r11 == 0) goto L_0x0078;
    L_0x006b:
        r12 = r11.mo2801a();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        if (r12 <= r4) goto L_0x0078;
    L_0x0071:
        r11 = r11.mo2801a();	 Catch:{ InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052, InterruptedException -> 0x0052 }
        r3 = r5;
        r0 = r10;
        r4 = r11;
    L_0x0078:
        r5 = com.google.android.gms.ads.internal.zzbv.zzer();
        r10 = r5.currentTimeMillis();
        r10 = r10 - r6;
        r1 = r1 - r10;
        r1 = java.lang.Math.max(r1, r8);
        goto L_0x0029;
    L_0x0087:
        r10 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.ads.zzaok.m10004c(r10, r5);	 Catch:{ all -> 0x0050 }
        r5 = com.google.android.gms.ads.internal.zzbv.zzer();
        r10 = r5.currentTimeMillis();
        r10 = r10 - r6;
        r1 = r1 - r10;
        r1 = java.lang.Math.max(r1, r8);
        goto L_0x0029;
    L_0x009b:
        r0 = com.google.android.gms.ads.internal.zzbv.zzer();
        r3 = r0.currentTimeMillis();
        r3 = r3 - r6;
        r1 = r1 - r3;
        java.lang.Math.max(r1, r8);
        throw r14;
    L_0x00a9:
        r13.m22003a(r3);
        if (r0 != 0) goto L_0x00b5;
    L_0x00ae:
        r14 = new com.google.android.gms.internal.ads.zzye;
        r0 = 1;
        r14.<init>(r0);
        return r14;
    L_0x00b5:
        return r0;
    L_0x00b6:
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyh.c(java.util.List):com.google.android.gms.internal.ads.zzye");
    }

    /* renamed from: a */
    private final void m22003a(zzapi<zzye> zzapi) {
        zzalo.f8872a.post(new wo(this, zzapi));
    }

    /* renamed from: a */
    public final void mo2754a() {
        synchronized (this.f17365i) {
            this.f17366j = true;
            for (zzyb a : this.f17367k.values()) {
                a.m21999a();
            }
        }
    }

    /* renamed from: b */
    public final List<zzye> mo2755b() {
        return this.f17370n;
    }
}
