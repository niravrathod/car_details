package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@zzaer
@TargetApi(14)
public final class zzfs implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    private static final long f9442a = ((Long) zzkd.m10713e().m10897a(zznw.aV)).longValue();
    /* renamed from: b */
    private final Context f9443b;
    /* renamed from: c */
    private Application f9444c;
    /* renamed from: d */
    private final WindowManager f9445d;
    /* renamed from: e */
    private final PowerManager f9446e;
    /* renamed from: f */
    private final KeyguardManager f9447f;
    @VisibleForTesting
    /* renamed from: g */
    private BroadcastReceiver f9448g;
    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f9449h;
    /* renamed from: i */
    private WeakReference<View> f9450i;
    /* renamed from: j */
    private pz f9451j;
    /* renamed from: k */
    private zzanp f9452k = new zzanp(f9442a);
    /* renamed from: l */
    private boolean f9453l = false;
    /* renamed from: m */
    private int f9454m = -1;
    /* renamed from: n */
    private final HashSet<zzfw> f9455n = new HashSet();
    /* renamed from: o */
    private final DisplayMetrics f9456o;
    /* renamed from: p */
    private final Rect f9457p;

    public zzfs(Context context, View view) {
        this.f9443b = context.getApplicationContext();
        this.f9445d = (WindowManager) context.getSystemService("window");
        this.f9446e = (PowerManager) this.f9443b.getSystemService("power");
        this.f9447f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f9443b instanceof Application) {
            this.f9444c = (Application) this.f9443b;
            this.f9451j = new pz((Application) this.f9443b, this);
        }
        this.f9456o = context.getResources().getDisplayMetrics();
        this.f9457p = new Rect();
        this.f9457p.right = this.f9445d.getDefaultDisplay().getWidth();
        this.f9457p.bottom = this.f9445d.getDefaultDisplay().getHeight();
        View view2 = this.f9450i != null ? (View) this.f9450i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m10602b(view2);
        }
        this.f9450i = new WeakReference(view);
        if (view != null) {
            if (zzbv.zzem().mo5033a(view) != null) {
                m10598a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void m10604a(zzfw zzfw) {
        this.f9455n.add(zzfw);
        m10596a(3);
    }

    /* renamed from: b */
    public final void m10605b(zzfw zzfw) {
        this.f9455n.remove(zzfw);
    }

    /* renamed from: b */
    private final void m10601b() {
        zzbv.zzek();
        zzalo.f8872a.post(new px(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f9454m = -1;
        m10598a(view);
        m10596a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f9454m = -1;
        m10596a(3);
        m10601b();
        m10602b(view);
    }

    /* renamed from: a */
    private final void m10597a(Activity activity, int i) {
        if (this.f9450i != null) {
            activity = activity.getWindow();
            if (activity != null) {
                activity = activity.peekDecorView();
                View view = (View) this.f9450i.get();
                if (!(view == null || activity == null || view.getRootView() != activity.getRootView())) {
                    this.f9454m = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m10597a(activity, (int) null);
        m10596a(3);
        m10601b();
    }

    public final void onActivityStarted(Activity activity) {
        m10597a(activity, 0);
        m10596a(3);
        m10601b();
    }

    public final void onActivityResumed(Activity activity) {
        m10597a(activity, 0);
        m10596a(3);
        m10601b();
    }

    public final void onActivityPaused(Activity activity) {
        m10597a(activity, 4);
        m10596a(3);
        m10601b();
    }

    public final void onActivityStopped(Activity activity) {
        m10596a(3);
        m10601b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m10596a(3);
        m10601b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m10596a(3);
        m10601b();
    }

    public final void onGlobalLayout() {
        m10596a(2);
        m10601b();
    }

    public final void onScrollChanged() {
        m10596a(1);
    }

    /* renamed from: a */
    public final void m10603a() {
        m10596a(4);
    }

    /* renamed from: a */
    private final void m10596a(int i) {
        int i2 = i;
        if (this.f9455n.size() != 0 && r1.f9450i != null) {
            boolean z;
            boolean z2;
            View view = (View) r1.f9450i.get();
            Object obj = i2 == 1 ? 1 : null;
            Object obj2 = view == null ? 1 : null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Throwable e) {
                    zzaok.m10002b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z = globalVisibleRect;
                z2 = localVisibleRect;
            } else {
                z = false;
                z2 = false;
            }
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (r1.f9454m != -1) {
                windowVisibility = r1.f9454m;
            }
            boolean z3 = obj2 == null && zzbv.zzek().m9839a(view, r1.f9446e, r1.f9447f) && z && z2 && windowVisibility == 0;
            if (obj != null && !r1.f9452k.m9930a() && z3 == r1.f9453l) {
                return;
            }
            if (z3 || r1.f9453l || i2 != 1) {
                zzfv zzfv = new zzfv(zzbv.zzer().elapsedRealtime(), r1.f9446e.isScreenOn(), view != null ? zzbv.zzem().mo5033a(view) : false, view != null ? view.getWindowVisibility() : 8, m10595a(r1.f9457p), m10595a(rect), m10595a(rect2), z, m10595a(rect3), z2, m10595a(rect4), r1.f9456o.density, z3);
                Iterator it = r1.f9455n.iterator();
                while (it.hasNext()) {
                    ((zzfw) it.next()).mo2329a(zzfv);
                }
                r1.f9453l = z3;
            }
        }
    }

    /* renamed from: a */
    private final Rect m10595a(Rect rect) {
        return new Rect(m10600b(rect.left), m10600b(rect.top), m10600b(rect.right), m10600b(rect.bottom));
    }

    /* renamed from: b */
    private final int m10600b(int i) {
        return (int) (((float) i) / this.f9456o.density);
    }

    /* renamed from: a */
    private final void m10598a(View view) {
        view = view.getViewTreeObserver();
        if (view.isAlive()) {
            this.f9449h = new WeakReference(view);
            view.addOnScrollChangedListener(this);
            view.addOnGlobalLayoutListener(this);
        }
        if (this.f9448g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f9448g = new py(this);
            zzbv.zzfg().m9941a(this.f9443b, this.f9448g, intentFilter);
        }
        if (this.f9444c != null) {
            try {
                this.f9444c.registerActivityLifecycleCallbacks(this.f9451j);
            } catch (View view2) {
                zzaok.m10002b("Error registering activity lifecycle callbacks.", view2);
            }
        }
    }

    /* renamed from: b */
    private final void m10602b(View view) {
        try {
            if (this.f9449h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9449h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9449h = null;
            }
        } catch (Throwable e) {
            zzaok.m10002b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            view = view.getViewTreeObserver();
            if (view.isAlive()) {
                view.removeOnScrollChangedListener(this);
                view.removeGlobalOnLayoutListener(this);
            }
        } catch (View view2) {
            zzaok.m10002b("Error while unregistering listeners from the ViewTreeObserver.", view2);
        }
        if (this.f9448g != null) {
            try {
                zzbv.zzfg().m9940a(this.f9443b, this.f9448g);
            } catch (View view22) {
                zzaok.m10002b("Failed trying to unregister the receiver", view22);
            } catch (Throwable e2) {
                zzbv.zzeo().m9714a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f9448g = null;
        }
        if (this.f9444c != null) {
            try {
                this.f9444c.unregisterActivityLifecycleCallbacks(this.f9451j);
            } catch (View view222) {
                zzaok.m10002b("Error registering activity lifecycle callbacks.", view222);
            }
        }
    }
}
