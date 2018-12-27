package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zzd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzuz {
    /* renamed from: a */
    static final zzuz f10205a = new zzuz(true);
    /* renamed from: b */
    private static volatile boolean f10206b = false;
    /* renamed from: c */
    private static final Class<?> f10207c = m12055d();
    /* renamed from: d */
    private static volatile zzuz f10208d;
    /* renamed from: e */
    private final Map<C2474a, zzd<?, ?>> f10209e;

    /* renamed from: com.google.android.gms.internal.measurement.zzuz$a */
    static final class C2474a {
        /* renamed from: a */
        private final Object f10203a;
        /* renamed from: b */
        private final int f10204b;

        C2474a(Object obj, int i) {
            this.f10203a = obj;
            this.f10204b = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10203a) * 65535) + this.f10204b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2474a)) {
                return false;
            }
            C2474a c2474a = (C2474a) obj;
            if (this.f10203a == c2474a.f10203a && this.f10204b == c2474a.f10204b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    private static java.lang.Class<?> m12055d() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzuz.d():java.lang.Class<?>");
    }

    /* renamed from: a */
    public static zzuz m12052a() {
        return bh.m11499a();
    }

    /* renamed from: b */
    public static zzuz m12053b() {
        zzuz zzuz = f10208d;
        if (zzuz == null) {
            synchronized (zzuz.class) {
                zzuz = f10208d;
                if (zzuz == null) {
                    zzuz = bh.m11501b();
                    f10208d = zzuz;
                }
            }
        }
        return zzuz;
    }

    /* renamed from: c */
    static zzuz m12054c() {
        return bp.m11538a(zzuz.class);
    }

    /* renamed from: a */
    public final <ContainingType extends zzwt> zzd<ContainingType, ?> m12056a(ContainingType containingType, int i) {
        return (zzd) this.f10209e.get(new C2474a(containingType, i));
    }

    zzuz() {
        this.f10209e = new HashMap();
    }

    private zzuz(boolean z) {
        this.f10209e = Collections.emptyMap();
    }
}
