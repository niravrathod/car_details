package io.fabric.sdk.android.services.settings;

import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.common.C2796g;
import io.fabric.sdk.android.services.common.C2799j;
import io.fabric.sdk.android.services.common.C4308q;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.C2834c;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.settings.q */
public class C2851q {
    /* renamed from: a */
    private final AtomicReference<C2853s> f12051a;
    /* renamed from: b */
    private final CountDownLatch f12052b;
    /* renamed from: c */
    private C2852r f12053c;
    /* renamed from: d */
    private boolean f12054d;

    /* renamed from: io.fabric.sdk.android.services.settings.q$a */
    static class C2850a {
        /* renamed from: a */
        private static final C2851q f12050a = new C2851q();
    }

    /* renamed from: a */
    public static C2851q m13855a() {
        return C2850a.f12050a;
    }

    private C2851q() {
        this.f12051a = new AtomicReference();
        this.f12052b = new CountDownLatch(1);
        this.f12054d = false;
    }

    /* renamed from: a */
    public synchronized C2851q m13857a(C2771h c2771h, IdManager idManager, C2834c c2834c, String str, String str2, String str3) {
        C2851q c2851q = this;
        C2771h c2771h2 = c2771h;
        synchronized (this) {
            if (c2851q.f12054d) {
                return c2851q;
            }
            if (c2851q.f12053c == null) {
                Context context = c2771h.getContext();
                String c = idManager.m13650c();
                String a = new C2796g().m13679a(context);
                String i = idManager.m13656i();
                C2799j c4308q = new C4308q();
                C2855u c4321k = new C4321k();
                C2844g c4319i = new C4319i(c2771h2);
                String k = CommonUtils.m13635k(context);
                String str4 = str3;
                C2857w c4322l = new C4322l(c2771h2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), c2834c);
                str4 = idManager.m13654g();
                c = idManager.m13653f();
                String str5 = c;
                String str6 = str2;
                String str7 = str;
                C2771h c2771h3 = c2771h;
                c2851q.f12053c = new C4320j(c2771h3, new C2856v(a, str4, str5, idManager.m13652e(), idManager.m13649b(), CommonUtils.m13608a(CommonUtils.m13637m(context)), str6, str7, DeliveryMechanism.m13639a(i).m13640a(), k), c4308q, c4321k, c4319i, c4322l);
            }
            c2851q.f12054d = true;
            return c2851q;
        }
    }

    /* renamed from: b */
    public io.fabric.sdk.android.services.settings.C2853s m13858b() {
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
        r3 = this;
        r0 = r3.f12052b;	 Catch:{ InterruptedException -> 0x000e }
        r0.await();	 Catch:{ InterruptedException -> 0x000e }
        r0 = r3.f12051a;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x000e }
        r0 = (io.fabric.sdk.android.services.settings.C2853s) r0;	 Catch:{ InterruptedException -> 0x000e }
        return r0;
    L_0x000e:
        r0 = io.fabric.sdk.android.C2766c.m13524h();
        r1 = "Fabric";
        r2 = "Interrupted while waiting for settings data.";
        r0.mo3561e(r1, r2);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.settings.q.b():io.fabric.sdk.android.services.settings.s");
    }

    /* renamed from: c */
    public synchronized boolean m13859c() {
        C2853s a;
        a = this.f12053c.mo3596a();
        m13856a(a);
        return a != null;
    }

    /* renamed from: d */
    public synchronized boolean m13860d() {
        C2853s a;
        a = this.f12053c.mo3597a(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        m13856a(a);
        if (a == null) {
            C2766c.m13524h().mo3562e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }

    /* renamed from: a */
    private void m13856a(C2853s c2853s) {
        this.f12051a.set(c2853s);
        this.f12052b.countDown();
    }
}
