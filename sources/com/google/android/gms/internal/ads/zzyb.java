package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
public final class zzyb implements zzyf {
    /* renamed from: a */
    private final String f17337a;
    /* renamed from: b */
    private final zzyn f17338b;
    /* renamed from: c */
    private final long f17339c;
    /* renamed from: d */
    private final zzxy f17340d;
    /* renamed from: e */
    private final zzxx f17341e;
    /* renamed from: f */
    private zzjk f17342f;
    /* renamed from: g */
    private final zzjo f17343g;
    /* renamed from: h */
    private final Context f17344h;
    /* renamed from: i */
    private final Object f17345i = new Object();
    /* renamed from: j */
    private final zzaop f17346j;
    /* renamed from: k */
    private final boolean f17347k;
    /* renamed from: l */
    private final zzpy f17348l;
    /* renamed from: m */
    private final List<String> f17349m;
    /* renamed from: n */
    private final List<String> f17350n;
    /* renamed from: o */
    private final List<String> f17351o;
    /* renamed from: p */
    private final boolean f17352p;
    /* renamed from: q */
    private final boolean f17353q;
    @GuardedBy("mLock")
    /* renamed from: r */
    private zzyq f17354r;
    @GuardedBy("mLock")
    /* renamed from: s */
    private int f17355s = -2;
    /* renamed from: t */
    private zzyw f17356t;

    public zzyb(Context context, String str, zzyn zzyn, zzxy zzxy, zzxx zzxx, zzjk zzjk, zzjo zzjo, zzaop zzaop, boolean z, boolean z2, zzpy zzpy, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        zzxy zzxy2 = zzxy;
        zzxx zzxx2 = zzxx;
        this.f17344h = context;
        this.f17338b = zzyn;
        this.f17341e = zzxx2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            r0.f17337a = m21988b();
        } else {
            r0.f17337a = str2;
        }
        r0.f17340d = zzxy2;
        if (zzxx2.f9855t != -1) {
            r0.f17339c = zzxx2.f9855t;
        } else if (zzxy2.f9858b != -1) {
            r0.f17339c = zzxy2.f9858b;
        } else {
            r0.f17339c = 10000;
        }
        r0.f17342f = zzjk;
        r0.f17343g = zzjo;
        r0.f17346j = zzaop;
        r0.f17347k = z;
        r0.f17352p = z2;
        r0.f17348l = zzpy;
        r0.f17349m = list;
        r0.f17350n = list2;
        r0.f17351o = list3;
        r0.f17353q = z3;
    }

    /* renamed from: a */
    public final void m21999a() {
        synchronized (this.f17345i) {
            try {
                if (this.f17354r != null) {
                    this.f17354r.mo2772c();
                }
            } catch (Throwable e) {
                zzaok.m10004c("Could not destroy mediation adapter.", e);
            }
            this.f17355s = -1;
            this.f17345i.notify();
        }
    }

    /* renamed from: b */
    private final java.lang.String m21988b() {
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
        r0 = r2.f17341e;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.f9840e;	 Catch:{ RemoteException -> 0x001c }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ RemoteException -> 0x001c }
        if (r0 != 0) goto L_0x0021;	 Catch:{ RemoteException -> 0x001c }
    L_0x000a:
        r0 = r2.f17338b;	 Catch:{ RemoteException -> 0x001c }
        r1 = r2.f17341e;	 Catch:{ RemoteException -> 0x001c }
        r1 = r1.f9840e;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.mo2757b(r1);	 Catch:{ RemoteException -> 0x001c }
        if (r0 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x001c }
    L_0x0016:
        r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;	 Catch:{ RemoteException -> 0x001c }
    L_0x0019:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = "Fail to determine the custom event's version, assuming the old one.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0021:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.b():java.lang.String");
    }

    /* renamed from: a */
    public final void mo2751a(int i) {
        synchronized (this.f17345i) {
            this.f17355s = i;
            this.f17345i.notify();
        }
    }

    /* renamed from: a */
    public final void mo2752a(int i, zzyw zzyw) {
        synchronized (this.f17345i) {
            this.f17355s = 0;
            this.f17356t = zzyw;
            this.f17345i.notify();
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzyq m21979a(MediationAdapter mediationAdapter) {
        return new zzzk(mediationAdapter);
    }

    /* renamed from: a */
    public final com.google.android.gms.internal.ads.zzye m21998a(long r17, long r19) {
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
        r16 = this;
        r1 = r16;
        r2 = r1.f17345i;
        monitor-enter(r2);
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x006d }
        r9 = new com.google.android.gms.internal.ads.zzya;	 Catch:{ all -> 0x006d }
        r9.<init>();	 Catch:{ all -> 0x006d }
        r0 = com.google.android.gms.internal.ads.zzalo.f8872a;	 Catch:{ all -> 0x006d }
        r5 = new com.google.android.gms.internal.ads.wl;	 Catch:{ all -> 0x006d }
        r5.<init>(r1, r9);	 Catch:{ all -> 0x006d }
        r0.post(r5);	 Catch:{ all -> 0x006d }
        r5 = r1.f17339c;	 Catch:{ all -> 0x006d }
    L_0x001a:
        r0 = r1.f17355s;	 Catch:{ all -> 0x006d }
        r7 = -2;	 Catch:{ all -> 0x006d }
        if (r0 == r7) goto L_0x003e;	 Catch:{ all -> 0x006d }
    L_0x001f:
        r0 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x006d }
        r5 = r0.elapsedRealtime();	 Catch:{ all -> 0x006d }
        r0 = 0;	 Catch:{ all -> 0x006d }
        r12 = r5 - r3;	 Catch:{ all -> 0x006d }
        r0 = new com.google.android.gms.internal.ads.zzye;	 Catch:{ all -> 0x006d }
        r6 = r1.f17341e;	 Catch:{ all -> 0x006d }
        r7 = r1.f17354r;	 Catch:{ all -> 0x006d }
        r8 = r1.f17337a;	 Catch:{ all -> 0x006d }
        r10 = r1.f17355s;	 Catch:{ all -> 0x006d }
        r11 = r16.m21991c();	 Catch:{ all -> 0x006d }
        r5 = r0;	 Catch:{ all -> 0x006d }
        r5.<init>(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x006d }
        monitor-exit(r2);	 Catch:{ all -> 0x006d }
        return r0;	 Catch:{ all -> 0x006d }
    L_0x003e:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x006d }
        r0 = 0;
        r10 = r7 - r3;
        r10 = r5 - r10;
        r7 = r7 - r17;
        r7 = r19 - r7;
        r14 = 0;
        r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r0 <= 0) goto L_0x0064;
    L_0x0051:
        r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1));
        if (r0 > 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0064;
    L_0x0056:
        r0 = r1.f17345i;	 Catch:{ InterruptedException -> 0x0060 }
        r7 = java.lang.Math.min(r10, r7);	 Catch:{ InterruptedException -> 0x0060 }
        r0.wait(r7);	 Catch:{ InterruptedException -> 0x0060 }
        goto L_0x001a;
    L_0x0060:
        r0 = 5;
        r1.f17355s = r0;	 Catch:{ all -> 0x006d }
        goto L_0x001a;	 Catch:{ all -> 0x006d }
    L_0x0064:
        r0 = "Timed out waiting for adapter.";	 Catch:{ all -> 0x006d }
        com.google.android.gms.internal.ads.zzaok.m10005d(r0);	 Catch:{ all -> 0x006d }
        r0 = 3;	 Catch:{ all -> 0x006d }
        r1.f17355s = r0;	 Catch:{ all -> 0x006d }
        goto L_0x001a;	 Catch:{ all -> 0x006d }
    L_0x006d:
        r0 = move-exception;	 Catch:{ all -> 0x006d }
        monitor-exit(r2);	 Catch:{ all -> 0x006d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.a(long, long):com.google.android.gms.internal.ads.zzye");
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: c */
    private final com.google.android.gms.internal.ads.zzyw m21991c() {
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
        r0 = r2.f17355s;
        if (r0 != 0) goto L_0x0030;
    L_0x0004:
        r0 = r2.m21994e();
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0030;
    L_0x000b:
        r0 = 4;
        r0 = r2.m21989b(r0);	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0012:
        r0 = r2.f17356t;	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0016:
        r0 = r2.f17356t;	 Catch:{ RemoteException -> 0x0021 }
        r0 = r0.mo2801a();	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x001e:
        r0 = r2.f17356t;	 Catch:{ RemoteException -> 0x0021 }
        return r0;
    L_0x0021:
        r0 = "Could not get cpm value from MediationResponseMetadata";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0026:
        r0 = r2.m21996f();
        r1 = new com.google.android.gms.internal.ads.wm;
        r1.<init>(r0);
        return r1;
    L_0x0030:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.c():com.google.android.gms.internal.ads.zzyw");
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    private final zzyq m21992d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f17337a);
        zzaok.m10005d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!(this.f17347k || this.f17341e.m11188b())) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f17337a)) {
                return m21979a(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(this.f17337a)) {
                return m21979a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f17337a)) {
                return new zzzk(new zzabb());
            }
        }
        try {
            return this.f17338b.mo2756a(this.f17337a);
        } catch (Throwable e) {
            valueOf = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f17337a);
            zzaok.m9999a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), e);
            return null;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m21983a(zzya zzya) {
        String a = m21982a(this.f17341e.f9846k);
        try {
            if (this.f17346j.f19895c >= GmsVersion.VERSION_HALLOUMI) {
                if (!this.f17347k) {
                    if (!this.f17341e.m11188b()) {
                        if (this.f17343g.f20230d) {
                            this.f17354r.mo2764a(ObjectWrapper.m26019a(this.f17344h), this.f17342f, a, this.f17341e.f9836a, (zzyt) zzya);
                            return;
                        } else if (!this.f17352p) {
                            this.f17354r.mo2767a(ObjectWrapper.m26019a(this.f17344h), this.f17343g, this.f17342f, a, this.f17341e.f9836a, zzya);
                            return;
                        } else if (this.f17341e.f9850o != null) {
                            this.f17354r.mo2765a(ObjectWrapper.m26019a(this.f17344h), this.f17342f, a, this.f17341e.f9836a, zzya, new zzpy(m21987b(this.f17341e.f9854s)), this.f17341e.f9853r);
                            return;
                        } else {
                            this.f17354r.mo2767a(ObjectWrapper.m26019a(this.f17344h), this.f17343g, this.f17342f, a, this.f17341e.f9836a, zzya);
                            return;
                        }
                    }
                }
                List arrayList = new ArrayList(this.f17349m);
                if (this.f17350n != null) {
                    for (String str : this.f17350n) {
                        String str2 = ":false";
                        if (this.f17351o != null && this.f17351o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
                        stringBuilder.append("custom:");
                        stringBuilder.append(str);
                        stringBuilder.append(str2);
                        arrayList.add(stringBuilder.toString());
                    }
                }
                this.f17354r.mo2765a(ObjectWrapper.m26019a(this.f17344h), this.f17342f, a, this.f17341e.f9836a, zzya, this.f17348l, arrayList);
            } else if (this.f17343g.f20230d) {
                this.f17354r.mo2763a(ObjectWrapper.m26019a(this.f17344h), this.f17342f, a, zzya);
            } else {
                this.f17354r.mo2766a(ObjectWrapper.m26019a(this.f17344h), this.f17343g, this.f17342f, a, (zzyt) zzya);
            }
        } catch (zzya zzya2) {
            zzaok.m10004c("Could not request ad from mediation adapter.", zzya2);
            mo2751a(5);
        }
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: b */
    private final boolean m21989b(int r4) {
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
        r0 = 0;
        r1 = r3.f17347k;	 Catch:{ RemoteException -> 0x002e }
        if (r1 == 0) goto L_0x000c;	 Catch:{ RemoteException -> 0x002e }
    L_0x0005:
        r1 = r3.f17354r;	 Catch:{ RemoteException -> 0x002e }
        r1 = r1.mo2781l();	 Catch:{ RemoteException -> 0x002e }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002e }
    L_0x000c:
        r1 = r3.f17343g;	 Catch:{ RemoteException -> 0x002e }
        r1 = r1.f20230d;	 Catch:{ RemoteException -> 0x002e }
        if (r1 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x002e }
    L_0x0012:
        r1 = r3.f17354r;	 Catch:{ RemoteException -> 0x002e }
        r1 = r1.mo2780k();	 Catch:{ RemoteException -> 0x002e }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002e }
    L_0x0019:
        r1 = r3.f17354r;	 Catch:{ RemoteException -> 0x002e }
        r1 = r1.mo2779j();	 Catch:{ RemoteException -> 0x002e }
    L_0x001f:
        if (r1 == 0) goto L_0x002d;
    L_0x0021:
        r2 = "capabilities";
        r1 = r1.getInt(r2, r0);
        r1 = r1 & r4;
        if (r1 != r4) goto L_0x002c;
    L_0x002a:
        r4 = 1;
        return r4;
    L_0x002c:
        return r0;
    L_0x002d:
        return r0;
    L_0x002e:
        r4 = "Could not get adapter info. Returning false";
        com.google.android.gms.internal.ads.zzaok.m10007e(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.b(int):boolean");
    }

    /* renamed from: e */
    private final boolean m21994e() {
        return this.f17340d.f9869m != -1;
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: a */
    private final java.lang.String m21982a(java.lang.String r3) {
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
        if (r3 == 0) goto L_0x0025;
    L_0x0002:
        r0 = r2.m21994e();
        if (r0 == 0) goto L_0x0025;
    L_0x0008:
        r0 = 2;
        r0 = r2.m21989b(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0025;
    L_0x0010:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001f }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x001f }
        r1 = "cpm_floor_cents";	 Catch:{ JSONException -> 0x001f }
        r0.remove(r1);	 Catch:{ JSONException -> 0x001f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x001f }
        return r0;
    L_0x001f:
        r0 = "Could not remove field. Returning the original value";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        return r3;
    L_0x0025:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.a(java.lang.String):java.lang.String");
    }

    @javax.annotation.concurrent.GuardedBy("mLock")
    /* renamed from: f */
    private final int m21996f() {
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
        r4 = this;
        r0 = r4.f17341e;
        r0 = r0.f9846k;
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003a }
        r2 = r4.f17341e;	 Catch:{ JSONException -> 0x003a }
        r2 = r2.f9846k;	 Catch:{ JSONException -> 0x003a }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x003a }
        r2 = "com.google.ads.mediation.admob.AdMobAdapter";
        r3 = r4.f17337a;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = "cpm_cents";
        r0 = r0.optInt(r2, r1);
        return r0;
    L_0x0022:
        r2 = 2;
        r2 = r4.m21989b(r2);
        if (r2 == 0) goto L_0x0030;
    L_0x0029:
        r2 = "cpm_floor_cents";
        r2 = r0.optInt(r2, r1);
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        if (r2 != 0) goto L_0x0039;
    L_0x0033:
        r2 = "penalized_average_cpm_cents";
        r2 = r0.optInt(r2, r1);
    L_0x0039:
        return r2;
    L_0x003a:
        r0 = "Could not convert to json. Returning 0";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.f():int");
    }

    /* renamed from: b */
    private static NativeAdOptions m21987b(String str) {
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            str = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(str)) {
                i = 2;
            } else if ("portrait".equals(str)) {
                i = 1;
            } else if ("any".equals(str) == null) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (String str2) {
            zzaok.m10004c("Exception occurred when creating native ad options", str2);
        }
        return builder.build();
    }
}
