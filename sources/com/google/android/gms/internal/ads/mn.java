package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.RandomAccess;

final class mn {
    /* renamed from: a */
    private static final Class<?> f8243a = m9136d();
    /* renamed from: b */
    private static final nc<?, ?> f8244b = m9111a(false);
    /* renamed from: c */
    private static final nc<?, ?> f8245c = m9111a(true);
    /* renamed from: d */
    private static final nc<?, ?> f8246d = new nd();

    /* renamed from: a */
    public static void m9120a(Class<?> cls) {
        if (!zzbdd.class.isAssignableFrom(cls) && f8243a != null) {
            if (f8243a.isAssignableFrom(cls) == null) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    public static void m9116a(int i, List<Double> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2075g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m9129b(int i, List<Float> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2074f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m9133c(int i, List<Long> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2066c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m9137d(int i, List<Long> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2069d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m9141e(int i, List<Long> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2082n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m9144f(int i, List<Long> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2072e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m9147g(int i, List<Long> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2080l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m9150h(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2055a(i, (List) list, z);
        }
    }

    /* renamed from: i */
    public static void m9153i(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2078j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m9156j(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2081m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m9157k(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2063b(i, (List) list, z);
        }
    }

    /* renamed from: l */
    public static void m9158l(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2079k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m9159m(int i, List<Integer> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2076h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m9160n(int i, List<Boolean> list, no noVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2077i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m9114a(int i, List<String> list, no noVar) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2053a(i, (List) list);
        }
    }

    /* renamed from: b */
    public static void m9127b(int i, List<zzbbu> list, no noVar) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2061b(i, (List) list);
        }
    }

    /* renamed from: a */
    public static void m9115a(int i, List<?> list, no noVar, ml mlVar) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2054a(i, (List) list, mlVar);
        }
    }

    /* renamed from: b */
    public static void m9128b(int i, List<?> list, no noVar, ml mlVar) {
        if (list != null && !list.isEmpty()) {
            noVar.mo2062b(i, (List) list, mlVar);
        }
    }

    /* renamed from: a */
    static int m9109a(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21535d(lpVar.m26086b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21535d(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m9108a(int i, List<Long> list, boolean z) {
        if (list.size()) {
            return m9109a((List) list) + (list.size() * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: b */
    static int m9125b(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21539e(lpVar.m26086b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21539e(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    static int m9124b(int i, List<Long> list, boolean z) {
        z = list.size();
        if (z) {
            return m9125b(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: c */
    static int m9131c(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21543f(lpVar.m26086b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21543f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    static int m9130c(int i, List<Long> list, boolean z) {
        z = list.size();
        if (z) {
            return m9131c(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: d */
    static int m9135d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21557k(lhVar.m26079b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21557k(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: d */
    static int m9134d(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m9135d(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: e */
    static int m9139e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21540f(lhVar.m26079b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21540f(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    static int m9138e(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m9139e(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: f */
    static int m9143f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21544g(lhVar.m26079b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21544g(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: f */
    static int m9142f(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m9143f(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: g */
    static int m9146g(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21548h(lhVar.m26079b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzbck.m21548h(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    static int m9145g(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m9146g(list) + (z * zzbck.m21537e(i));
        }
        return 0;
    }

    /* renamed from: h */
    static int m9149h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m9148h(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzbck.m21553i(i, 0);
    }

    /* renamed from: i */
    static int m9152i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m9151i(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzbck.m21546g(i, 0);
    }

    /* renamed from: j */
    static int m9155j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m9154j(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzbck.m21521b(i, true);
    }

    /* renamed from: a */
    static int m9106a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzbck.m21537e(i) * size;
        Object b;
        if (list instanceof zzbdu) {
            zzbdu zzbdu = (zzbdu) list;
            while (i2 < size) {
                b = zzbdu.mo2425b(i2);
                if (b instanceof zzbbu) {
                    i += zzbck.m21522b((zzbbu) b);
                } else {
                    i += zzbck.m21525b((String) b);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                b = list.get(i2);
                if (b instanceof zzbbu) {
                    i += zzbck.m21522b((zzbbu) b);
                } else {
                    i += zzbck.m21525b((String) b);
                }
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m9105a(int i, Object obj, ml mlVar) {
        if (obj instanceof zzbds) {
            return zzbck.m21510a(i, (zzbds) obj);
        }
        return zzbck.m21519b(i, (zzbel) obj, mlVar);
    }

    /* renamed from: a */
    static int m9107a(int i, List<?> list, ml mlVar) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzbck.m21537e(i) * size;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof zzbds) {
                i += zzbck.m21511a((zzbds) obj);
            } else {
                i += zzbck.m21524b((zzbel) obj, mlVar);
            }
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    static int m9122b(int i, List<zzbbu> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        size *= zzbck.m21537e(i);
        while (i2 < list.size()) {
            size += zzbck.m21522b((zzbbu) list.get(i2));
            i2++;
        }
        return size;
    }

    /* renamed from: b */
    static int m9123b(int i, List<zzbel> list, ml mlVar) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += zzbck.m21530c(i, (zzbel) list.get(i2), mlVar);
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static nc<?, ?> m9110a() {
        return f8244b;
    }

    /* renamed from: b */
    public static nc<?, ?> m9126b() {
        return f8245c;
    }

    /* renamed from: c */
    public static nc<?, ?> m9132c() {
        return f8246d;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.ads.nc<?, ?> m9111a(boolean r6) {
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
        r0 = 0;
        r1 = m9140e();	 Catch:{ Throwable -> 0x0023 }
        if (r1 != 0) goto L_0x0008;	 Catch:{ Throwable -> 0x0023 }
    L_0x0007:
        return r0;	 Catch:{ Throwable -> 0x0023 }
    L_0x0008:
        r2 = 1;	 Catch:{ Throwable -> 0x0023 }
        r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x0023 }
        r4 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x0023 }
        r5 = 0;	 Catch:{ Throwable -> 0x0023 }
        r3[r5] = r4;	 Catch:{ Throwable -> 0x0023 }
        r1 = r1.getConstructor(r3);	 Catch:{ Throwable -> 0x0023 }
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0023 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ Throwable -> 0x0023 }
        r2[r5] = r6;	 Catch:{ Throwable -> 0x0023 }
        r6 = r1.newInstance(r2);	 Catch:{ Throwable -> 0x0023 }
        r6 = (com.google.android.gms.internal.ads.nc) r6;	 Catch:{ Throwable -> 0x0023 }
        return r6;
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn.a(boolean):com.google.android.gms.internal.ads.nc<?, ?>");
    }

    /* renamed from: d */
    private static java.lang.Class<?> m9136d() {
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
        r0 = "com.google.protobuf.GeneratedMessage";	 Catch:{ Throwable -> 0x0007 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn.d():java.lang.Class<?>");
    }

    /* renamed from: e */
    private static java.lang.Class<?> m9140e() {
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
        r0 = "com.google.protobuf.UnknownFieldSetSchema";	 Catch:{ Throwable -> 0x0007 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn.e():java.lang.Class<?>");
    }

    /* renamed from: a */
    static boolean m9121a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m9118a(lu luVar, T t, T t2, long j) {
        ng.m9230a((Object) t, j, luVar.mo2101a(ng.m9252f(t, j), ng.m9252f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends zzbcw<FT>> void m9117a(ky<FT> kyVar, T t, T t2) {
        lb a = kyVar.mo2084a((Object) t2);
        if (!a.m9008b()) {
            kyVar.mo2092b(t).m9007a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m9119a(nc<UT, UB> ncVar, T t, T t2) {
        ncVar.mo2133a((Object) t, ncVar.mo2140c(ncVar.mo2135b(t), ncVar.mo2135b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m9113a(int i, List<Integer> list, zzbdi zzbdi, UB ub, nc<UT, UB> ncVar) {
        if (zzbdi == null) {
            return ub;
        }
        UB ub2;
        if (!(list instanceof RandomAccess)) {
            list = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (list.hasNext() != null) {
                    int intValue = ((Integer) list.next()).intValue();
                    if (!zzbdi.mo2158a(intValue)) {
                        ub = m9112a(i, intValue, (Object) ub2, (nc) ncVar);
                        list.remove();
                    }
                }
                break loop1;
            }
        }
        UB size = list.size();
        ub2 = ub;
        ub = null;
        for (UB ub3 = null; ub3 < size; ub3++) {
            int intValue2 = ((Integer) list.get(ub3)).intValue();
            if (zzbdi.mo2158a(intValue2)) {
                if (ub3 != ub) {
                    list.set(ub, Integer.valueOf(intValue2));
                }
                ub++;
            } else {
                ub2 = m9112a(i, intValue2, (Object) ub2, (nc) ncVar);
            }
        }
        if (ub != size) {
            list.subList(ub, size).clear();
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m9112a(int i, int i2, UB ub, nc<UT, UB> ncVar) {
        Object a;
        if (ub == null) {
            a = ncVar.mo2126a();
        }
        ncVar.mo2129a(a, i, (long) i2);
        return a;
    }
}
