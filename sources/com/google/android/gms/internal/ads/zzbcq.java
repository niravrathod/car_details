package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzbcq {
    /* renamed from: a */
    static final zzbcq f9104a = new zzbcq(true);
    /* renamed from: b */
    private static volatile boolean f9105b = false;
    /* renamed from: c */
    private static final Class<?> f9106c = m10314d();
    /* renamed from: d */
    private static volatile zzbcq f9107d;
    /* renamed from: e */
    private final Map<C2454a, zzd<?, ?>> f9108e;

    /* renamed from: com.google.android.gms.internal.ads.zzbcq$a */
    static final class C2454a {
        /* renamed from: a */
        private final Object f9102a;
        /* renamed from: b */
        private final int f9103b;

        C2454a(Object obj, int i) {
            this.f9102a = obj;
            this.f9103b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f9102a) * 65535) + this.f9103b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2454a)) {
                return false;
            }
            C2454a c2454a = (C2454a) obj;
            if (this.f9102a == c2454a.f9102a && this.f9103b == c2454a.f9103b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private static java.lang.Class<?> m10314d() {
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
        r0 = "com.google.protobuf.Extension";	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcq.d():java.lang.Class<?>");
    }

    /* renamed from: a */
    public static zzbcq m10311a() {
        return kx.m8977a();
    }

    /* renamed from: b */
    public static zzbcq m10312b() {
        zzbcq zzbcq = f9107d;
        if (zzbcq == null) {
            synchronized (zzbcq.class) {
                zzbcq = f9107d;
                if (zzbcq == null) {
                    zzbcq = kx.m8979b();
                    f9107d = zzbcq;
                }
            }
        }
        return zzbcq;
    }

    /* renamed from: c */
    static zzbcq m10313c() {
        return lf.m9016a(zzbcq.class);
    }

    /* renamed from: a */
    public final <ContainingType extends zzbel> zzd<ContainingType, ?> m10315a(ContainingType containingType, int i) {
        return (zzd) this.f9108e.get(new C2454a(containingType, i));
    }

    zzbcq() {
        this.f9108e = new HashMap();
    }

    private zzbcq(boolean z) {
        this.f9108e = Collections.emptyMap();
    }
}
