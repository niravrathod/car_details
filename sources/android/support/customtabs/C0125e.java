package android.support.customtabs;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: android.support.customtabs.e */
public final class C0125e {
    /* renamed from: a */
    private final Object f529a = new Object();
    /* renamed from: b */
    private final C0128h f530b;
    /* renamed from: c */
    private final C0127g f531c;
    /* renamed from: d */
    private final ComponentName f532d;

    C0125e(C0128h c0128h, C0127g c0127g, ComponentName componentName) {
        this.f530b = c0128h;
        this.f531c = c0127g;
        this.f532d = componentName;
    }

    /* renamed from: a */
    public boolean m461a(android.net.Uri r3, android.os.Bundle r4, java.util.List<android.os.Bundle> r5) {
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
        r2 = this;
        r0 = r2.f530b;	 Catch:{ RemoteException -> 0x0009 }
        r1 = r2.f531c;	 Catch:{ RemoteException -> 0x0009 }
        r3 = r0.mo69a(r1, r3, r4, r5);	 Catch:{ RemoteException -> 0x0009 }
        return r3;
    L_0x0009:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.e.a(android.net.Uri, android.os.Bundle, java.util.List):boolean");
    }

    /* renamed from: a */
    IBinder m460a() {
        return this.f531c.asBinder();
    }

    /* renamed from: b */
    ComponentName m462b() {
        return this.f532d;
    }
}
