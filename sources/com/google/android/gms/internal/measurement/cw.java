package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

final class cw {
    /* renamed from: a */
    private static final Class<?> f10072a = m11657d();
    /* renamed from: b */
    private static final dl<?, ?> f10073b = m11632a(false);
    /* renamed from: c */
    private static final dl<?, ?> f10074c = m11632a(true);
    /* renamed from: d */
    private static final dl<?, ?> f10075d = new dm();

    /* renamed from: a */
    public static void m11641a(Class<?> cls) {
        if (!zzvm.class.isAssignableFrom(cls) && f10072a != null) {
            if (f10072a.isAssignableFrom(cls) == null) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    public static void m11637a(int i, List<Double> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3029g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m11650b(int i, List<Float> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3028f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m11654c(int i, List<Long> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3020c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m11658d(int i, List<Long> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3023d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m11662e(int i, List<Long> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3036n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m11665f(int i, List<Long> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3026e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m11668g(int i, List<Long> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3034l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m11671h(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3009a(i, (List) list, z);
        }
    }

    /* renamed from: i */
    public static void m11674i(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3032j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m11677j(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3035m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m11678k(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3017b(i, (List) list, z);
        }
    }

    /* renamed from: l */
    public static void m11679l(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3033k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m11680m(int i, List<Integer> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3030h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m11681n(int i, List<Boolean> list, dx dxVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3031i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m11635a(int i, List<String> list, dx dxVar) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3007a(i, (List) list);
        }
    }

    /* renamed from: b */
    public static void m11648b(int i, List<zzud> list, dx dxVar) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3015b(i, (List) list);
        }
    }

    /* renamed from: a */
    public static void m11636a(int i, List<?> list, dx dxVar, cu cuVar) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3008a(i, (List) list, cuVar);
        }
    }

    /* renamed from: b */
    public static void m11649b(int i, List<?> list, dx dxVar, cu cuVar) {
        if (list != null && !list.isEmpty()) {
            dxVar.mo3016b(i, (List) list, cuVar);
        }
    }

    /* renamed from: a */
    static int m11630a(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22568d(bzVar.m27089b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22568d(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m11629a(int i, List<Long> list, boolean z) {
        if (list.size()) {
            return m11630a((List) list) + (list.size() * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: b */
    static int m11646b(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22571e(bzVar.m27089b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22571e(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    static int m11645b(int i, List<Long> list, boolean z) {
        z = list.size();
        if (z) {
            return m11646b(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: c */
    static int m11652c(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22575f(bzVar.m27089b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22575f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    static int m11651c(int i, List<Long> list, boolean z) {
        z = list.size();
        if (z) {
            return m11652c(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: d */
    static int m11656d(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof br) {
            br brVar = (br) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22589k(brVar.m27082b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22589k(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: d */
    static int m11655d(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m11656d(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: e */
    static int m11660e(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof br) {
            br brVar = (br) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22572f(brVar.m27082b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22572f(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    static int m11659e(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m11660e(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: f */
    static int m11664f(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof br) {
            br brVar = (br) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22576g(brVar.m27082b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22576g(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: f */
    static int m11663f(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m11664f(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: g */
    static int m11667g(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int i2;
        if (list instanceof br) {
            br brVar = (br) list;
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22580h(brVar.m27082b(i));
                i++;
            }
        } else {
            i2 = 0;
            while (i < size) {
                i2 += zzut.m22580h(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    static int m11666g(int i, List<Integer> list, boolean z) {
        z = list.size();
        if (z) {
            return m11667g(list) + (z * zzut.m22569e(i));
        }
        return 0;
    }

    /* renamed from: h */
    static int m11670h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m11669h(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzut.m22585i(i, 0);
    }

    /* renamed from: i */
    static int m11673i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m11672i(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzut.m22578g(i, 0);
    }

    /* renamed from: j */
    static int m11676j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m11675j(int i, List<?> list, boolean z) {
        list = list.size();
        if (list == null) {
            return 0;
        }
        return list * zzut.m22553b(i, true);
    }

    /* renamed from: a */
    static int m11627a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzut.m22569e(i) * size;
        Object b;
        if (list instanceof zzwc) {
            zzwc zzwc = (zzwc) list;
            while (i2 < size) {
                b = zzwc.mo3157b(i2);
                if (b instanceof zzud) {
                    i += zzut.m22554b((zzud) b);
                } else {
                    i += zzut.m22557b((String) b);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                b = list.get(i2);
                if (b instanceof zzud) {
                    i += zzut.m22554b((zzud) b);
                } else {
                    i += zzut.m22557b((String) b);
                }
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m11626a(int i, Object obj, cu cuVar) {
        if (obj instanceof zzwa) {
            return zzut.m22542a(i, (zzwa) obj);
        }
        return zzut.m22551b(i, (zzwt) obj, cuVar);
    }

    /* renamed from: a */
    static int m11628a(int i, List<?> list, cu cuVar) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        i = zzut.m22569e(i) * size;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof zzwa) {
                i += zzut.m22543a((zzwa) obj);
            } else {
                i += zzut.m22556b((zzwt) obj, cuVar);
            }
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    static int m11643b(int i, List<zzud> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        size *= zzut.m22569e(i);
        while (i2 < list.size()) {
            size += zzut.m22554b((zzud) list.get(i2));
            i2++;
        }
        return size;
    }

    /* renamed from: b */
    static int m11644b(int i, List<zzwt> list, cu cuVar) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 < size) {
            i3 += zzut.m22562c(i, (zzwt) list.get(i2), cuVar);
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static dl<?, ?> m11631a() {
        return f10073b;
    }

    /* renamed from: b */
    public static dl<?, ?> m11647b() {
        return f10074c;
    }

    /* renamed from: c */
    public static dl<?, ?> m11653c() {
        return f10075d;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.measurement.dl<?, ?> m11632a(boolean r6) {
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
        r1 = m11661e();	 Catch:{ Throwable -> 0x0023 }
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
        r6 = (com.google.android.gms.internal.measurement.dl) r6;	 Catch:{ Throwable -> 0x0023 }
        return r6;
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cw.a(boolean):com.google.android.gms.internal.measurement.dl<?, ?>");
    }

    /* renamed from: d */
    private static java.lang.Class<?> m11657d() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cw.d():java.lang.Class<?>");
    }

    /* renamed from: e */
    private static java.lang.Class<?> m11661e() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cw.e():java.lang.Class<?>");
    }

    /* renamed from: a */
    static boolean m11642a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static <T> void m11639a(ce ceVar, T t, T t2, long j) {
        dp.m11751a((Object) t, j, ceVar.mo3056a(dp.m11773f(t, j), dp.m11773f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends zzvf<FT>> void m11638a(bi<FT> biVar, T t, T t2) {
        bl a = biVar.mo3038a((Object) t2);
        if (!a.m11530b()) {
            biVar.mo3046b(t).m11529a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m11640a(dl<UT, UB> dlVar, T t, T t2) {
        dlVar.mo3087a((Object) t, dlVar.mo3094c(dlVar.mo3089b(t), dlVar.mo3089b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m11634a(int i, List<Integer> list, zzvr zzvr, UB ub, dl<UT, UB> dlVar) {
        if (zzvr == null) {
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
                    if (!zzvr.mo2920a(intValue)) {
                        ub = m11633a(i, intValue, (Object) ub2, (dl) dlVar);
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
            if (zzvr.mo2920a(intValue2)) {
                if (ub3 != ub) {
                    list.set(ub, Integer.valueOf(intValue2));
                }
                ub++;
            } else {
                ub2 = m11633a(i, intValue2, (Object) ub2, (dl) dlVar);
            }
        }
        if (ub != size) {
            list.subList(ub, size).clear();
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m11633a(int i, int i2, UB ub, dl<UT, UB> dlVar) {
        Object a;
        if (ub == null) {
            a = dlVar.mo3080a();
        }
        dlVar.mo3083a(a, i, (long) i2);
        return a;
    }
}
