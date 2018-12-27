package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class cq {
    /* renamed from: a */
    private static final cq f10069a = new cq();
    /* renamed from: b */
    private final cv f10070b;
    /* renamed from: c */
    private final ConcurrentMap<Class<?>, cu<?>> f10071c = new ConcurrentHashMap();

    /* renamed from: a */
    public static cq m11570a() {
        return f10069a;
    }

    /* renamed from: a */
    public final <T> cu<T> m11572a(Class<T> cls) {
        zzvo.m12071a((Object) cls, "messageType");
        cu<T> cuVar = (cu) this.f10071c.get(cls);
        if (cuVar != null) {
            return cuVar;
        }
        Object a = this.f10070b.mo3054a(cls);
        zzvo.m12071a((Object) cls, "messageType");
        zzvo.m12071a(a, "schema");
        cu<T> cuVar2 = (cu) this.f10071c.putIfAbsent(cls, a);
        return cuVar2 != null ? cuVar2 : a;
    }

    /* renamed from: a */
    public final <T> cu<T> m11573a(T t) {
        return m11572a(t.getClass());
    }

    private cq() {
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        cv cvVar = null;
        for (int i = 0; i <= 0; i++) {
            cvVar = m11571a(strArr[0]);
            if (cvVar != null) {
                break;
            }
        }
        if (cvVar == null) {
            cvVar = new ca();
        }
        this.f10070b = cvVar;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.measurement.cv m11571a(java.lang.String r2) {
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
        r2 = java.lang.Class.forName(r2);	 Catch:{ Throwable -> 0x0014 }
        r0 = 0;	 Catch:{ Throwable -> 0x0014 }
        r1 = new java.lang.Class[r0];	 Catch:{ Throwable -> 0x0014 }
        r2 = r2.getConstructor(r1);	 Catch:{ Throwable -> 0x0014 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0014 }
        r2 = r2.newInstance(r0);	 Catch:{ Throwable -> 0x0014 }
        r2 = (com.google.android.gms.internal.measurement.cv) r2;	 Catch:{ Throwable -> 0x0014 }
        return r2;
    L_0x0014:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cq.a(java.lang.String):com.google.android.gms.internal.measurement.cv");
    }
}
