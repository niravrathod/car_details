package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.lang.ref.WeakReference;

public final class zzdk implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    private static final Handler f9377a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private final Context f9378b;
    /* renamed from: c */
    private Application f9379c;
    /* renamed from: d */
    private final PowerManager f9380d;
    /* renamed from: e */
    private final KeyguardManager f9381e;
    /* renamed from: f */
    private final zzdb f9382f;
    /* renamed from: g */
    private BroadcastReceiver f9383g;
    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f9384h;
    /* renamed from: i */
    private WeakReference<View> f9385i;
    /* renamed from: j */
    private os f9386j;
    /* renamed from: k */
    private boolean f9387k = false;
    /* renamed from: l */
    private int f9388l = -1;
    /* renamed from: m */
    private long f9389m = -3;

    public zzdk(zzdb zzdb, View view) {
        this.f9382f = zzdb;
        this.f9378b = zzdb.f9358a;
        this.f9380d = (PowerManager) this.f9378b.getSystemService("power");
        this.f9381e = (KeyguardManager) this.f9378b.getSystemService("keyguard");
        if ((this.f9378b instanceof Application) != null) {
            this.f9379c = (Application) this.f9378b;
            this.f9386j = new os((Application) this.f9378b, this);
        }
        m10536a(view);
    }

    /* renamed from: a */
    final void m10536a(View view) {
        View view2 = this.f9385i != null ? (View) this.f9385i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m10534c(view2);
        }
        this.f9385i = new WeakReference(view);
        if (view != null) {
            Object obj;
            if (view.getWindowToken() == null) {
                if (view.getWindowVisibility() == 8) {
                    obj = null;
                    if (obj != null) {
                        m10532b(view);
                    }
                    view.addOnAttachStateChangeListener(this);
                    this.f9389m = -2;
                    return;
                }
            }
            obj = 1;
            if (obj != null) {
                m10532b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f9389m = -2;
            return;
        }
        this.f9389m = -3;
    }

    /* renamed from: b */
    private final void m10531b() {
        f9377a.post(new pf(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f9388l = -1;
        m10532b(view);
        m10533c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f9388l = -1;
        m10533c();
        m10531b();
        m10534c(view);
    }

    /* renamed from: a */
    private final void m10529a(Activity activity, int i) {
        if (this.f9385i != null) {
            activity = activity.getWindow();
            if (activity != null) {
                activity = activity.peekDecorView();
                View view = (View) this.f9385i.get();
                if (!(view == null || activity == null || view.getRootView() != activity.getRootView())) {
                    this.f9388l = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m10529a(activity, null);
        m10533c();
    }

    public final void onActivityStarted(Activity activity) {
        m10529a(activity, 0);
        m10533c();
    }

    public final void onActivityResumed(Activity activity) {
        m10529a(activity, 0);
        m10533c();
        m10531b();
    }

    public final void onActivityPaused(Activity activity) {
        m10529a(activity, 4);
        m10533c();
    }

    public final void onActivityStopped(Activity activity) {
        m10533c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m10533c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m10533c();
    }

    public final void onGlobalLayout() {
        m10533c();
    }

    public final void onScrollChanged() {
        m10533c();
    }

    /* renamed from: a */
    public final long m10535a() {
        if (this.f9389m == -2 && this.f9385i.get() == null) {
            this.f9389m = -3;
        }
        return this.f9389m;
    }

    /* renamed from: c */
    private final void m10533c() {
        if (this.f9385i != null) {
            View view = (View) this.f9385i.get();
            boolean z = false;
            if (view == null) {
                this.f9389m = -3;
                this.f9387k = false;
                return;
            }
            Object obj;
            int windowVisibility;
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
            if (!this.f9382f.m10517j()) {
                if (this.f9381e.inKeyguardRestrictedInputMode()) {
                    Activity a = zzdi.m10523a(view);
                    if (a != null) {
                        LayoutParams layoutParams;
                        Window window = a.getWindow();
                        if (window == null) {
                            layoutParams = null;
                        } else {
                            layoutParams = window.getAttributes();
                        }
                        if (!(layoutParams == null || (layoutParams.flags & 524288) == 0)) {
                            obj = 1;
                            if (obj != null) {
                            }
                        }
                    }
                    obj = null;
                    if (obj != null) {
                    }
                }
                obj = null;
                windowVisibility = view.getWindowVisibility();
                if (this.f9388l != -1) {
                    windowVisibility = this.f9388l;
                }
                if (view.getVisibility() == 0 && view.isShown() && this.f9380d.isScreenOn() && r4 != null && localVisibleRect && globalVisibleRect && r6 == 0) {
                    z = true;
                }
                if (this.f9387k != z) {
                    this.f9389m = z ? SystemClock.elapsedRealtime() : -2;
                    this.f9387k = z;
                }
            }
            obj = 1;
            windowVisibility = view.getWindowVisibility();
            if (this.f9388l != -1) {
                windowVisibility = this.f9388l;
            }
            z = true;
            if (this.f9387k != z) {
                if (z) {
                }
                this.f9389m = z ? SystemClock.elapsedRealtime() : -2;
                this.f9387k = z;
            }
        }
    }

    /* renamed from: b */
    private final void m10532b(android.view.View r3) {
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
        r3 = r3.getViewTreeObserver();
        r0 = r3.isAlive();
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = new java.lang.ref.WeakReference;
        r0.<init>(r3);
        r2.f9384h = r0;
        r3.addOnScrollChangedListener(r2);
        r3.addOnGlobalLayoutListener(r2);
    L_0x0017:
        r3 = r2.f9383g;
        if (r3 != 0) goto L_0x003d;
    L_0x001b:
        r3 = new android.content.IntentFilter;
        r3.<init>();
        r0 = "android.intent.action.SCREEN_ON";
        r3.addAction(r0);
        r0 = "android.intent.action.SCREEN_OFF";
        r3.addAction(r0);
        r0 = "android.intent.action.USER_PRESENT";
        r3.addAction(r0);
        r0 = new com.google.android.gms.internal.ads.pg;
        r0.<init>(r2);
        r2.f9383g = r0;
        r0 = r2.f9378b;
        r1 = r2.f9383g;
        r0.registerReceiver(r1, r3);
    L_0x003d:
        r3 = r2.f9379c;
        if (r3 == 0) goto L_0x0049;
    L_0x0041:
        r3 = r2.f9379c;	 Catch:{ Exception -> 0x0049 }
        r0 = r2.f9386j;	 Catch:{ Exception -> 0x0049 }
        r3.registerActivityLifecycleCallbacks(r0);	 Catch:{ Exception -> 0x0049 }
        return;
    L_0x0049:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdk.b(android.view.View):void");
    }

    /* renamed from: c */
    private final void m10534c(android.view.View r4) {
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
        r0 = 0;
        r1 = r3.f9384h;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x001d }
    L_0x0005:
        r1 = r3.f9384h;	 Catch:{ Exception -> 0x001d }
        r1 = r1.get();	 Catch:{ Exception -> 0x001d }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x001d }
    L_0x000f:
        r2 = r1.isAlive();	 Catch:{ Exception -> 0x001d }
        if (r2 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x001d }
    L_0x0015:
        r1.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x001d }
        r1.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x001d }
    L_0x001b:
        r3.f9384h = r0;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r4 = r4.getViewTreeObserver();	 Catch:{ Exception -> 0x002d }
        r1 = r4.isAlive();	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0027:
        r4.removeOnScrollChangedListener(r3);	 Catch:{ Exception -> 0x002d }
        r4.removeGlobalOnLayoutListener(r3);	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r4 = r3.f9383g;
        if (r4 == 0) goto L_0x003a;
    L_0x0031:
        r4 = r3.f9378b;	 Catch:{ Exception -> 0x0038 }
        r1 = r3.f9383g;	 Catch:{ Exception -> 0x0038 }
        r4.unregisterReceiver(r1);	 Catch:{ Exception -> 0x0038 }
    L_0x0038:
        r3.f9383g = r0;
    L_0x003a:
        r4 = r3.f9379c;
        if (r4 == 0) goto L_0x0046;
    L_0x003e:
        r4 = r3.f9379c;	 Catch:{ Exception -> 0x0046 }
        r0 = r3.f9386j;	 Catch:{ Exception -> 0x0046 }
        r4.unregisterActivityLifecycleCallbacks(r0);	 Catch:{ Exception -> 0x0046 }
        return;
    L_0x0046:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdk.c(android.view.View):void");
    }
}
