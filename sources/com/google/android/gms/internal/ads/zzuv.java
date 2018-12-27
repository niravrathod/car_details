package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzuv {
    /* renamed from: a */
    private final Map<ur, us> f9794a = new HashMap();
    /* renamed from: b */
    private final LinkedList<ur> f9795b = new LinkedList();
    /* renamed from: c */
    private zztr f9796c;

    /* renamed from: a */
    final void m11131a(zztr zztr) {
        if (this.f9796c == null) {
            this.f9796c = zztr.m11118b();
            if (this.f9796c != null) {
                int i = 0;
                zztr = this.f9796c.m11115a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f9795b.size() > 0) {
                    ur urVar = (ur) this.f9795b.remove();
                    us usVar = (us) this.f9794a.get(urVar);
                    m11121a("Flushing interstitial queue for %s.", urVar);
                    while (usVar.m9393d() > 0) {
                        usVar.m9387a(null).f8414a.zzdj();
                    }
                    this.f9794a.remove(urVar);
                }
                try {
                    Map hashMap = new HashMap();
                    for (Entry entry : zztr.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            uu a = uu.m9399a((String) entry.getValue());
                            ur urVar2 = new ur(a.f8421a, a.f8422b, a.f8423c);
                            if (!this.f9794a.containsKey(urVar2)) {
                                this.f9794a.put(urVar2, new us(a.f8421a, a.f8422b, a.f8423c));
                                hashMap.put(urVar2.toString(), urVar2);
                                m11121a("Restored interstitial queue for %s.", urVar2);
                            }
                        }
                    }
                    zztr = m11122a(zztr.getString("PoolKeys", ""));
                    int length = zztr.length;
                    while (i < length) {
                        ur urVar3 = (ur) hashMap.get(zztr[i]);
                        if (this.f9794a.containsKey(urVar3)) {
                            this.f9795b.add(urVar3);
                        }
                        i++;
                    }
                } catch (Throwable e) {
                    zzbv.zzeo().m9714a(e, "InterstitialAdPool.restore");
                    zzaok.m10004c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f9794a.clear();
                    this.f9795b.clear();
                }
            }
        }
    }

    /* renamed from: a */
    final ut m11129a(zzjk zzjk, String str) {
        if (m11125b(str)) {
            return null;
        }
        int i = new zzahh(this.f9796c.m11115a()).m9554a().f8685o;
        zzjk = m11126c(zzjk);
        str = m11127c(str);
        ur urVar = new ur(zzjk, str, i);
        us usVar = (us) this.f9794a.get(urVar);
        if (usVar == null) {
            m11121a("Interstitial pool created at %s.", urVar);
            usVar = new us(zzjk, str, i);
            this.f9794a.put(urVar, usVar);
        }
        this.f9795b.remove(urVar);
        this.f9795b.add(urVar);
        usVar.m9396g();
        while (true) {
            if (this.f9795b.size() <= ((Integer) zzkd.m10713e().m10897a(zznw.aF)).intValue()) {
                break;
            }
            ur urVar2 = (ur) this.f9795b.remove();
            us usVar2 = (us) this.f9794a.get(urVar2);
            m11121a("Evicting interstitial queue for %s.", urVar2);
            while (usVar2.m9393d() > 0) {
                ut a = usVar2.m9387a(null);
                if (a.f8418e) {
                    zzuz.m11133a().m11136c();
                }
                a.f8414a.zzdj();
            }
            this.f9794a.remove(urVar2);
        }
        while (usVar.m9393d() > null) {
            str = usVar.m9387a(zzjk);
            if (str.f8418e) {
                if (zzbv.zzer().currentTimeMillis() - str.f8417d > ((long) ((Integer) zzkd.m10713e().m10897a(zznw.aH)).intValue()) * 1000) {
                    m11121a("Expired interstitial at %s.", urVar);
                    zzuz.m11133a().m11135b();
                }
            }
            zzjk = str.f8415b != null ? " (inline) " : " ";
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(zzjk).length() + 34);
            stringBuilder.append("Pooled interstitial");
            stringBuilder.append(zzjk);
            stringBuilder.append("returned at %s.");
            m11121a(stringBuilder.toString(), urVar);
            return str;
        }
        return null;
    }

    /* renamed from: b */
    final void m11132b(zzjk zzjk, String str) {
        if (this.f9796c != null) {
            int i = new zzahh(this.f9796c.m11115a()).m9554a().f8685o;
            zzjk c = m11126c(zzjk);
            str = m11127c(str);
            ur urVar = new ur(c, str, i);
            us usVar = (us) this.f9794a.get(urVar);
            if (usVar == null) {
                m11121a("Interstitial pool created at %s.", urVar);
                usVar = new us(c, str, i);
                this.f9794a.put(urVar, usVar);
            }
            usVar.m9389a(this.f9796c, zzjk);
            usVar.m9396g();
            m11121a("Inline entry added to the queue at %s.", urVar);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m11130a() {
        /*
        r9 = this;
        r0 = r9.f9796c;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r9.f9794a;
        r0 = r0.entrySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x0016:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = r1.getKey();
        r3 = (com.google.android.gms.internal.ads.ur) r3;
        r1 = r1.getValue();
        r1 = (com.google.android.gms.internal.ads.us) r1;
        r4 = 2;
        r5 = com.google.android.gms.internal.ads.zzaok.m10000a(r4);
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = r1.m9393d();
        r6 = r1.m9394e();
        if (r6 >= r5) goto L_0x0056;
    L_0x0039:
        r7 = "Loading %s/%s pooled interstitials for %s.";
        r8 = 3;
        r8 = new java.lang.Object[r8];
        r6 = r5 - r6;
        r6 = java.lang.Integer.valueOf(r6);
        r8[r2] = r6;
        r5 = java.lang.Integer.valueOf(r5);
        r6 = 1;
        r8[r6] = r5;
        r8[r4] = r3;
        r4 = java.lang.String.format(r7, r8);
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);
    L_0x0056:
        r4 = r1.m9395f();
        r4 = r4 + r2;
    L_0x005b:
        r2 = r1.m9393d();
        r5 = com.google.android.gms.internal.ads.zznw.aG;
        r6 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r5 = r6.m10897a(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r2 >= r5) goto L_0x0081;
    L_0x0071:
        r2 = "Pooling and loading one new interstitial for %s.";
        m11121a(r2, r3);
        r2 = r9.f9796c;
        r2 = r1.m9390a(r2);
        if (r2 == 0) goto L_0x005b;
    L_0x007e:
        r4 = r4 + 1;
        goto L_0x005b;
    L_0x0081:
        r1 = com.google.android.gms.internal.ads.zzuz.m11133a();
        r1.m11134a(r4);
        goto L_0x000f;
    L_0x0089:
        r0 = r9.f9796c;
        if (r0 == 0) goto L_0x00ea;
    L_0x008d:
        r0 = r9.f9796c;
        r0 = r0.m11115a();
        r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
        r0 = r0.getSharedPreferences(r1, r2);
        r0 = r0.edit();
        r0.clear();
        r1 = r9.f9794a;
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x00aa:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00de;
    L_0x00b0:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (com.google.android.gms.internal.ads.ur) r3;
        r2 = r2.getValue();
        r2 = (com.google.android.gms.internal.ads.us) r2;
        r4 = r2.m9397h();
        if (r4 == 0) goto L_0x00aa;
    L_0x00c8:
        r4 = new com.google.android.gms.internal.ads.uu;
        r4.<init>(r2);
        r2 = r4.m9400a();
        r4 = r3.toString();
        r0.putString(r4, r2);
        r2 = "Saved interstitial queue for %s.";
        m11121a(r2, r3);
        goto L_0x00aa;
    L_0x00de:
        r1 = "PoolKeys";
        r2 = r9.m11124b();
        r0.putString(r1, r2);
        r0.apply();
    L_0x00ea:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.a():void");
    }

    /* renamed from: b */
    private final java.lang.String m11124b() {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r4.f9795b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r1 = r1.iterator();	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x000b:
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x0035;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0011:
        r2 = r1.next();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = (com.google.android.gms.internal.ads.ur) r2;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r3 = 0;	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = android.util.Base64.encodeToString(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r2 = r1.hasNext();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        if (r2 == 0) goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x002f:
        r2 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x003a }
        r0.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x003a }
        goto L_0x000b;	 Catch:{ UnsupportedEncodingException -> 0x003a }
    L_0x0035:
        r0 = r0.toString();	 Catch:{ UnsupportedEncodingException -> 0x003a }
        return r0;
    L_0x003a:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.b():java.lang.String");
    }

    /* renamed from: a */
    private static java.lang.String[] m11122a(java.lang.String r5) {
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
        r0 = 0;
        r1 = "\u0000";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5 = r5.split(r1);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = 0;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x0008:
        r2 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        if (r1 >= r2) goto L_0x001d;	 Catch:{ UnsupportedEncodingException -> 0x001e }
    L_0x000b:
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = r5[r1];	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r3 = android.util.Base64.decode(r3, r0);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r4 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r2.<init>(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r5[r1] = r2;	 Catch:{ UnsupportedEncodingException -> 0x001e }
        r1 = r1 + 1;
        goto L_0x0008;
    L_0x001d:
        return r5;
    L_0x001e:
        r5 = new java.lang.String[r0];
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.a(java.lang.String):java.lang.String[]");
    }

    /* renamed from: b */
    private static boolean m11125b(String str) {
        try {
            return Pattern.matches((String) zzkd.m10713e().m10897a(zznw.aI), str);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "InterstitialAdPool.isExcludedAdUnit");
            return null;
        }
    }

    /* renamed from: a */
    static Set<String> m11119a(zzjk zzjk) {
        Set<String> hashSet = new HashSet();
        hashSet.addAll(zzjk.f20208c.keySet());
        zzjk = zzjk.f20218m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (zzjk != null) {
            hashSet.addAll(zzjk.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    static zzjk m11123b(zzjk zzjk) {
        zzjk = m11128d(zzjk);
        String str = "_skipMediation";
        Bundle bundle = zzjk.f20218m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        zzjk.f20208c.putBoolean(str, true);
        return zzjk;
    }

    @VisibleForTesting
    /* renamed from: c */
    private static zzjk m11126c(zzjk zzjk) {
        zzjk = m11128d(zzjk);
        for (String str : ((String) zzkd.m10713e().m10897a(zznw.aE)).split(",")) {
            m11120a(zzjk.f20218m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m11120a(zzjk.f20208c, str.replaceFirst(str2, ""));
            }
        }
        return zzjk;
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: c */
    private static java.lang.String m11127c(java.lang.String r2) {
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
        r0 = "([^/]+/[0-9]+).*";	 Catch:{ RuntimeException -> 0x0016 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.matcher(r2);	 Catch:{ RuntimeException -> 0x0016 }
        r1 = r0.matches();	 Catch:{ RuntimeException -> 0x0016 }
        if (r1 == 0) goto L_0x0016;	 Catch:{ RuntimeException -> 0x0016 }
    L_0x0010:
        r1 = 1;	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r0.group(r1);	 Catch:{ RuntimeException -> 0x0016 }
        return r0;
    L_0x0016:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuv.c(java.lang.String):java.lang.String");
    }

    @VisibleForTesting
    /* renamed from: d */
    private static zzjk m11128d(zzjk zzjk) {
        Parcel obtain = Parcel.obtain();
        zzjk.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjk = (zzjk) zzjk.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return zzjk.m26613a();
    }

    /* renamed from: a */
    private static void m11120a(Bundle bundle, String str) {
        while (true) {
            str = str.split("/", 2);
            if (str.length != 0) {
                String str2 = str[0];
                if (str.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = str[1];
                } else {
                    return;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    private static void m11121a(String str, ur urVar) {
        if (zzaok.m10000a(2)) {
            zzalg.m21225a(String.format(str, new Object[]{urVar}));
        }
    }
}
