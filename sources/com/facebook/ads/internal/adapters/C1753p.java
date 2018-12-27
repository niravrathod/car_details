package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p101q.p102a.C1934u;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.adapters.p */
public class C1753p {
    /* renamed from: a */
    private static final Set<C1745g> f5293a = new HashSet();
    /* renamed from: b */
    private static final Map<AdPlacementType, String> f5294b = new ConcurrentHashMap();

    static {
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
        r0 = new java.util.HashSet;
        r0.<init>();
        f5293a = r0;
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        f5294b = r0;
        r0 = com.facebook.ads.internal.adapters.C1745g.m6610a();
        r0 = r0.iterator();
    L_0x0016:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x005a;
    L_0x001c:
        r1 = r0.next();
        r1 = (com.facebook.ads.internal.adapters.C1745g) r1;
        r2 = 0;
        r3 = com.facebook.ads.internal.adapters.C1753p.C17521.f5292a;
        r4 = r1.f5282m;
        r4 = r4.ordinal();
        r3 = r3[r4];
        switch(r3) {
            case 1: goto L_0x003d;
            case 2: goto L_0x003a;
            case 3: goto L_0x0037;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x003f;
    L_0x0031:
        r2 = com.facebook.ads.internal.adapters.C3770j.class;
        goto L_0x003f;
    L_0x0034:
        r2 = com.facebook.ads.internal.adapters.ac.class;
        goto L_0x003f;
    L_0x0037:
        r2 = com.facebook.ads.internal.adapters.ai.class;
        goto L_0x003f;
    L_0x003a:
        r2 = com.facebook.ads.internal.adapters.C3768d.class;
        goto L_0x003f;
    L_0x003d:
        r2 = com.facebook.ads.internal.adapters.C3767b.class;
    L_0x003f:
        if (r2 == 0) goto L_0x0016;
    L_0x0041:
        r3 = r1.f5279j;
        if (r3 != 0) goto L_0x004c;
    L_0x0045:
        r4 = r1.f5280k;	 Catch:{ ClassNotFoundException -> 0x004c }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x004c }
        r3 = r4;
    L_0x004c:
        if (r3 == 0) goto L_0x0016;
    L_0x004e:
        r2 = r2.isAssignableFrom(r3);
        if (r2 == 0) goto L_0x0016;
    L_0x0054:
        r2 = f5293a;
        r2.add(r1);
        goto L_0x0016;
    L_0x005a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.p.<clinit>():void");
    }

    /* renamed from: a */
    public static C1737a m6637a(C1744f c1744f, AdPlacementType adPlacementType) {
        Exception exception;
        C1737a c1737a = null;
        try {
            C1745g b = C1753p.m6640b(c1744f, adPlacementType);
            if (b != null && f5293a.contains(b)) {
                Class cls = b.f5279j;
                if (cls == null) {
                    cls = Class.forName(b.f5280k);
                }
                C1737a c1737a2 = (C1737a) cls.newInstance();
                try {
                    if (!(c1737a2 instanceof C4597v)) {
                        return c1737a2;
                    }
                    ((C4597v) c1737a2).m18854a(adPlacementType);
                    return c1737a2;
                } catch (Exception e) {
                    c1737a = c1737a2;
                    exception = e;
                    exception.printStackTrace();
                    return c1737a;
                }
            }
        } catch (Exception e2) {
            exception = e2;
            exception.printStackTrace();
            return c1737a;
        }
        return c1737a;
    }

    /* renamed from: a */
    public static C1737a m6638a(String str, AdPlacementType adPlacementType) {
        return C1753p.m6637a(C1744f.m6609a(str), adPlacementType);
    }

    /* renamed from: a */
    public static String m6639a(AdPlacementType adPlacementType) {
        if (f5294b.containsKey(adPlacementType)) {
            return (String) f5294b.get(adPlacementType);
        }
        Set hashSet = new HashSet();
        for (C1745g c1745g : f5293a) {
            if (c1745g.f5282m == adPlacementType) {
                hashSet.add(c1745g.f5281l.toString());
            }
        }
        String a = C1934u.m7322a(hashSet, ",");
        f5294b.put(adPlacementType, a);
        return a;
    }

    /* renamed from: b */
    private static C1745g m6640b(C1744f c1744f, AdPlacementType adPlacementType) {
        for (C1745g c1745g : f5293a) {
            if (c1745g.f5281l == c1744f && c1745g.f5282m == adPlacementType) {
                return c1745g;
            }
        }
        return null;
    }
}
