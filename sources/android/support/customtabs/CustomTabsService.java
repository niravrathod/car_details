package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.customtabs.C0128h.C3033a;
import android.support.v4.p017f.C3131a;
import java.util.List;
import java.util.Map;

public abstract class CustomTabsService extends Service {
    /* renamed from: a */
    private final Map<IBinder, DeathRecipient> f501a = new C3131a();
    /* renamed from: b */
    private C3033a f502b = new C44041(this);

    /* renamed from: android.support.customtabs.CustomTabsService$1 */
    class C44041 extends C3033a {
        /* renamed from: a */
        final /* synthetic */ CustomTabsService f18319a;

        C44041(CustomTabsService customTabsService) {
            this.f18319a = customTabsService;
        }

        /* renamed from: a */
        public boolean mo65a(long j) {
            return this.f18319a.m438a(j);
        }

        /* renamed from: a */
        public boolean mo66a(android.support.customtabs.C0127g r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = new android.support.customtabs.f;
            r0.<init>(r6);
            r1 = 0;
            r2 = new android.support.customtabs.CustomTabsService$1$1;	 Catch:{ RemoteException -> 0x0031 }
            r2.<init>(r5, r0);	 Catch:{ RemoteException -> 0x0031 }
            r3 = r5.f18319a;	 Catch:{ RemoteException -> 0x0031 }
            r3 = r3.f501a;	 Catch:{ RemoteException -> 0x0031 }
            monitor-enter(r3);	 Catch:{ RemoteException -> 0x0031 }
            r4 = r6.asBinder();	 Catch:{ all -> 0x002e }
            r4.linkToDeath(r2, r1);	 Catch:{ all -> 0x002e }
            r4 = r5.f18319a;	 Catch:{ all -> 0x002e }
            r4 = r4.f501a;	 Catch:{ all -> 0x002e }
            r6 = r6.asBinder();	 Catch:{ all -> 0x002e }
            r4.put(r6, r2);	 Catch:{ all -> 0x002e }
            monitor-exit(r3);	 Catch:{ all -> 0x002e }
            r6 = r5.f18319a;	 Catch:{ RemoteException -> 0x0031 }
            r6 = r6.m444b(r0);	 Catch:{ RemoteException -> 0x0031 }
            return r6;
        L_0x002e:
            r6 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x002e }
            throw r6;	 Catch:{ RemoteException -> 0x0031 }
        L_0x0031:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.CustomTabsService.1.a(android.support.customtabs.g):boolean");
        }

        /* renamed from: a */
        public boolean mo69a(C0127g c0127g, Uri uri, Bundle bundle, List<Bundle> list) {
            return this.f18319a.m442a(new C0126f(c0127g), uri, bundle, (List) list);
        }

        /* renamed from: a */
        public Bundle mo64a(String str, Bundle bundle) {
            return this.f18319a.m437a(str, bundle);
        }

        /* renamed from: a */
        public boolean mo70a(C0127g c0127g, Bundle bundle) {
            return this.f18319a.m443a(new C0126f(c0127g), bundle);
        }

        /* renamed from: a */
        public boolean mo68a(C0127g c0127g, Uri uri) {
            return this.f18319a.m441a(new C0126f(c0127g), uri);
        }

        /* renamed from: a */
        public int mo63a(C0127g c0127g, String str, Bundle bundle) {
            return this.f18319a.m436a(new C0126f(c0127g), str, bundle);
        }

        /* renamed from: a */
        public boolean mo67a(C0127g c0127g, int i, Uri uri, Bundle bundle) {
            return this.f18319a.m440a(new C0126f(c0127g), i, uri, bundle);
        }
    }

    /* renamed from: a */
    protected abstract int m436a(C0126f c0126f, String str, Bundle bundle);

    /* renamed from: a */
    protected abstract Bundle m437a(String str, Bundle bundle);

    /* renamed from: a */
    protected abstract boolean m438a(long j);

    /* renamed from: a */
    protected abstract boolean m440a(C0126f c0126f, int i, Uri uri, Bundle bundle);

    /* renamed from: a */
    protected abstract boolean m441a(C0126f c0126f, Uri uri);

    /* renamed from: a */
    protected abstract boolean m442a(C0126f c0126f, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: a */
    protected abstract boolean m443a(C0126f c0126f, Bundle bundle);

    /* renamed from: b */
    protected abstract boolean m444b(C0126f c0126f);

    /* renamed from: a */
    protected boolean m439a(android.support.customtabs.C0126f r4) {
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
        r0 = 0;
        r1 = r3.f501a;	 Catch:{ NoSuchElementException -> 0x001e }
        monitor-enter(r1);	 Catch:{ NoSuchElementException -> 0x001e }
        r4 = r4.m464a();	 Catch:{ all -> 0x001b }
        r2 = r3.f501a;	 Catch:{ all -> 0x001b }
        r2 = r2.get(r4);	 Catch:{ all -> 0x001b }
        r2 = (android.os.IBinder.DeathRecipient) r2;	 Catch:{ all -> 0x001b }
        r4.unlinkToDeath(r2, r0);	 Catch:{ all -> 0x001b }
        r2 = r3.f501a;	 Catch:{ all -> 0x001b }
        r2.remove(r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        r4 = 1;	 Catch:{ all -> 0x001b }
        return r4;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r4 = move-exception;	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r4;	 Catch:{ NoSuchElementException -> 0x001e }
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.CustomTabsService.a(android.support.customtabs.f):boolean");
    }
}
