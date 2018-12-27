package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class os implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final Application f8314a;
    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f8315b;
    /* renamed from: c */
    private boolean f8316c = false;

    public os(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f8315b = new WeakReference(activityLifecycleCallbacks);
        this.f8314a = application;
    }

    /* renamed from: a */
    private final void m9354a(com.google.android.gms.internal.ads.zzcx r2) {
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
        r0 = r1.f8315b;	 Catch:{ Exception -> 0x001b }
        r0 = r0.get();	 Catch:{ Exception -> 0x001b }
        r0 = (android.app.Application.ActivityLifecycleCallbacks) r0;	 Catch:{ Exception -> 0x001b }
        if (r0 == 0) goto L_0x000e;	 Catch:{ Exception -> 0x001b }
    L_0x000a:
        r2.mo2160a(r0);	 Catch:{ Exception -> 0x001b }
        return;	 Catch:{ Exception -> 0x001b }
    L_0x000e:
        r2 = r1.f8316c;	 Catch:{ Exception -> 0x001b }
        if (r2 != 0) goto L_0x001a;	 Catch:{ Exception -> 0x001b }
    L_0x0012:
        r2 = r1.f8314a;	 Catch:{ Exception -> 0x001b }
        r2.unregisterActivityLifecycleCallbacks(r1);	 Catch:{ Exception -> 0x001b }
        r2 = 1;	 Catch:{ Exception -> 0x001b }
        r1.f8316c = r2;	 Catch:{ Exception -> 0x001b }
    L_0x001a:
        return;
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.os.a(com.google.android.gms.internal.ads.zzcx):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m9354a(new ot(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m9354a(new ou(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m9354a(new ov(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m9354a(new ow(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m9354a(new ox(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m9354a(new oy(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m9354a(new oz(this, activity));
    }
}
