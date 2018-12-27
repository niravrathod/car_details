package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: android.support.customtabs.b */
public class C0120b {
    /* renamed from: a */
    private final C0128h f520a;
    /* renamed from: b */
    private final ComponentName f521b;

    C0120b(C0128h c0128h, ComponentName componentName) {
        this.f520a = c0128h;
        this.f521b = componentName;
    }

    /* renamed from: a */
    public static boolean m450a(Context context, String str, C0124d c0124d) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, c0124d, 33);
    }

    /* renamed from: a */
    public boolean m452a(long r2) {
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
        r1 = this;
        r0 = r1.f520a;	 Catch:{ RemoteException -> 0x0007 }
        r2 = r0.mo65a(r2);	 Catch:{ RemoteException -> 0x0007 }
        return r2;
    L_0x0007:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.b.a(long):boolean");
    }

    /* renamed from: a */
    public android.support.customtabs.C0125e m451a(final android.support.customtabs.C0114a r4) {
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
        r3 = this;
        r0 = new android.support.customtabs.b$1;
        r0.<init>(r3, r4);
        r4 = 0;
        r1 = r3.f520a;	 Catch:{ RemoteException -> 0x0019 }
        r1 = r1.mo66a(r0);	 Catch:{ RemoteException -> 0x0019 }
        if (r1 != 0) goto L_0x000f;
    L_0x000e:
        return r4;
    L_0x000f:
        r4 = new android.support.customtabs.e;
        r1 = r3.f520a;
        r2 = r3.f521b;
        r4.<init>(r1, r0, r2);
        return r4;
    L_0x0019:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.b.a(android.support.customtabs.a):android.support.customtabs.e");
    }
}
