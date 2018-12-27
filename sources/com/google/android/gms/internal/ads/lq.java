package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;

final class lq implements mm {
    /* renamed from: b */
    private static final ly f16538b = new lr();
    /* renamed from: a */
    private final ly f16539a;

    public lq() {
        this(new ls(lg.m20736a(), m20748a()));
    }

    private lq(ly lyVar) {
        this.f16539a = (ly) zzbdf.m10330a((Object) lyVar, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> ml<T> mo2099a(Class<T> cls) {
        mn.m9120a((Class) cls);
        lx b = this.f16539a.mo2095b(cls);
        if (b.mo2120b()) {
            if (zzbdd.class.isAssignableFrom(cls) != null) {
                return mc.m20817a(mn.m9132c(), la.m8992a(), b.mo2121c());
            }
            return mc.m20817a(mn.m9110a(), la.m8993b(), b.mo2121c());
        } else if (zzbdd.class.isAssignableFrom(cls)) {
            if (m20749a(b)) {
                return ma.m20774a((Class) cls, b, mf.m9046b(), ll.m9020b(), mn.m9132c(), la.m8992a(), lw.m9033b());
            }
            return ma.m20774a((Class) cls, b, mf.m9046b(), ll.m9020b(), mn.m9132c(), null, lw.m9033b());
        } else if (m20749a(b)) {
            return ma.m20774a((Class) cls, b, mf.m9045a(), ll.m9019a(), mn.m9110a(), la.m8993b(), lw.m9032a());
        } else {
            return ma.m20774a((Class) cls, b, mf.m9045a(), ll.m9019a(), mn.m9126b(), null, lw.m9032a());
        }
    }

    /* renamed from: a */
    private static boolean m20749a(lx lxVar) {
        return lxVar.mo2119a() == zze.f9173h ? true : null;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.ads.ly m20748a() {
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
        r0 = "com.google.protobuf.DescriptorMessageInfoFactory";	 Catch:{ Exception -> 0x0019 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0019 }
        r1 = "getInstance";	 Catch:{ Exception -> 0x0019 }
        r2 = 0;	 Catch:{ Exception -> 0x0019 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ Exception -> 0x0019 }
        r1 = 0;	 Catch:{ Exception -> 0x0019 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0019 }
        r0 = (com.google.android.gms.internal.ads.ly) r0;	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r0 = f16538b;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lq.a():com.google.android.gms.internal.ads.ly");
    }
}
