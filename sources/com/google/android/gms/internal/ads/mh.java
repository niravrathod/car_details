package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class mh {
    /* renamed from: a */
    private static final mh f8240a = new mh();
    /* renamed from: b */
    private final mm f8241b;
    /* renamed from: c */
    private final ConcurrentMap<Class<?>, ml<?>> f8242c = new ConcurrentHashMap();

    /* renamed from: a */
    public static mh m9048a() {
        return f8240a;
    }

    /* renamed from: a */
    public final <T> ml<T> m9050a(Class<T> cls) {
        zzbdf.m10330a((Object) cls, "messageType");
        ml<T> mlVar = (ml) this.f8242c.get(cls);
        if (mlVar != null) {
            return mlVar;
        }
        Object a = this.f8241b.mo2099a(cls);
        zzbdf.m10330a((Object) cls, "messageType");
        zzbdf.m10330a(a, "schema");
        ml<T> mlVar2 = (ml) this.f8242c.putIfAbsent(cls, a);
        return mlVar2 != null ? mlVar2 : a;
    }

    /* renamed from: a */
    public final <T> ml<T> m9051a(T t) {
        return m9050a(t.getClass());
    }

    private mh() {
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        mm mmVar = null;
        for (int i = 0; i <= 0; i++) {
            mmVar = m9049a(strArr[0]);
            if (mmVar != null) {
                break;
            }
        }
        if (mmVar == null) {
            mmVar = new lq();
        }
        this.f8241b = mmVar;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.ads.mm m9049a(java.lang.String r2) {
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
        r2 = (com.google.android.gms.internal.ads.mm) r2;	 Catch:{ Throwable -> 0x0014 }
        return r2;
    L_0x0014:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mh.a(java.lang.String):com.google.android.gms.internal.ads.mm");
    }
}
