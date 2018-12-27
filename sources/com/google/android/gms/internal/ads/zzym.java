package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzaer
public final class zzym extends zzyo {
    /* renamed from: b */
    private static final zzaas f20421b = new zzaas();
    /* renamed from: a */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f20422a;

    /* renamed from: a */
    public final zzyq mo2756a(String str) {
        return m26907d(str);
    }

    /* renamed from: b */
    public final boolean mo2757b(java.lang.String r4) {
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
        r1 = com.google.android.gms.internal.ads.zzym.class;	 Catch:{ Throwable -> 0x0012 }
        r1 = r1.getClassLoader();	 Catch:{ Throwable -> 0x0012 }
        r1 = java.lang.Class.forName(r4, r0, r1);	 Catch:{ Throwable -> 0x0012 }
        r2 = com.google.android.gms.ads.mediation.customevent.CustomEvent.class;	 Catch:{ Throwable -> 0x0012 }
        r1 = r2.isAssignableFrom(r1);	 Catch:{ Throwable -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = java.lang.String.valueOf(r4);
        r1 = r1.length();
        r1 = r1 + 80;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Could not load custom event implementation class: ";
        r2.append(r1);
        r2.append(r4);
        r4 = ", assuming old implementation.";
        r2.append(r4);
        r4 = r2.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzym.b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void m26910a(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f20422a = map;
    }

    /* renamed from: d */
    private final <NetworkExtrasT extends com.google.ads.mediation.NetworkExtras, ServerParametersT extends com.google.ads.mediation.MediationServerParameters> com.google.android.gms.internal.ads.zzyq m26907d(java.lang.String r4) {
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
        r0 = com.google.android.gms.internal.ads.zzym.class;	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.getClassLoader();	 Catch:{ Throwable -> 0x0078 }
        r1 = 0;	 Catch:{ Throwable -> 0x0078 }
        r0 = java.lang.Class.forName(r4, r1, r0);	 Catch:{ Throwable -> 0x0078 }
        r2 = com.google.ads.mediation.MediationAdapter.class;	 Catch:{ Throwable -> 0x0078 }
        r2 = r2.isAssignableFrom(r0);	 Catch:{ Throwable -> 0x0078 }
        if (r2 == 0) goto L_0x0033;	 Catch:{ Throwable -> 0x0078 }
    L_0x0013:
        r2 = new java.lang.Class[r1];	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Throwable -> 0x0078 }
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.newInstance(r1);	 Catch:{ Throwable -> 0x0078 }
        r0 = (com.google.ads.mediation.MediationAdapter) r0;	 Catch:{ Throwable -> 0x0078 }
        r1 = r3.f20422a;	 Catch:{ Throwable -> 0x0078 }
        r2 = r0.getAdditionalParametersType();	 Catch:{ Throwable -> 0x0078 }
        r1 = r1.get(r2);	 Catch:{ Throwable -> 0x0078 }
        r1 = (com.google.ads.mediation.NetworkExtras) r1;	 Catch:{ Throwable -> 0x0078 }
        r2 = new com.google.android.gms.internal.ads.zzzp;	 Catch:{ Throwable -> 0x0078 }
        r2.<init>(r0, r1);	 Catch:{ Throwable -> 0x0078 }
        return r2;	 Catch:{ Throwable -> 0x0078 }
    L_0x0033:
        r2 = com.google.android.gms.ads.mediation.MediationAdapter.class;	 Catch:{ Throwable -> 0x0078 }
        r2 = r2.isAssignableFrom(r0);	 Catch:{ Throwable -> 0x0078 }
        if (r2 == 0) goto L_0x004f;	 Catch:{ Throwable -> 0x0078 }
    L_0x003b:
        r2 = new java.lang.Class[r1];	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Throwable -> 0x0078 }
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.newInstance(r1);	 Catch:{ Throwable -> 0x0078 }
        r0 = (com.google.android.gms.ads.mediation.MediationAdapter) r0;	 Catch:{ Throwable -> 0x0078 }
        r1 = new com.google.android.gms.internal.ads.zzzk;	 Catch:{ Throwable -> 0x0078 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0078 }
        return r1;	 Catch:{ Throwable -> 0x0078 }
    L_0x004f:
        r0 = java.lang.String.valueOf(r4);	 Catch:{ Throwable -> 0x0078 }
        r0 = r0.length();	 Catch:{ Throwable -> 0x0078 }
        r0 = r0 + 64;	 Catch:{ Throwable -> 0x0078 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0078 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0078 }
        r0 = "Could not instantiate mediation adapter: ";	 Catch:{ Throwable -> 0x0078 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0078 }
        r1.append(r4);	 Catch:{ Throwable -> 0x0078 }
        r0 = " (not a valid adapter).";	 Catch:{ Throwable -> 0x0078 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0078 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0078 }
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ Throwable -> 0x0078 }
        r0 = new android.os.RemoteException;	 Catch:{ Throwable -> 0x0078 }
        r0.<init>();	 Catch:{ Throwable -> 0x0078 }
        throw r0;	 Catch:{ Throwable -> 0x0078 }
    L_0x0078:
        r4 = r3.m26908e(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzym.d(java.lang.String):com.google.android.gms.internal.ads.zzyq");
    }

    /* renamed from: e */
    private final zzyq m26908e(String str) {
        try {
            zzaok.m10001b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzzk(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new zzzk(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzzk(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                MediationAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new zzzp(customEventAdapter, (CustomEventExtras) this.f20422a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
            stringBuilder.append("Could not instantiate mediation adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            zzaok.m10004c(stringBuilder.toString(), th);
        }
    }

    /* renamed from: c */
    public final zzaan mo2758c(String str) {
        return zzaas.m9427a(str);
    }
}
