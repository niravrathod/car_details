package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzpl extends zzpq {
    /* renamed from: c */
    private zzyz f20332c;
    /* renamed from: d */
    private zzzc f20333d;
    /* renamed from: e */
    private zzzf f20334e;
    /* renamed from: f */
    private final zzpn f20335f;
    /* renamed from: g */
    private zzpm f20336g;
    /* renamed from: h */
    private boolean f20337h;
    /* renamed from: i */
    private boolean f20338i;
    /* renamed from: j */
    private final Object f20339j;

    public zzpl(Context context, zzpn zzpn, zzck zzck, zzyz zzyz, zzpo zzpo) {
        this(context, zzpn, zzck, zzpo);
        this.f20332c = zzyz;
    }

    /* renamed from: j */
    public final zzasg mo4271j() {
        return null;
    }

    /* renamed from: k */
    public final void mo2605k() {
    }

    /* renamed from: l */
    public final void mo2606l() {
    }

    public zzpl(Context context, zzpn zzpn, zzck zzck, zzzc zzzc, zzpo zzpo) {
        this(context, zzpn, zzck, zzpo);
        this.f20333d = zzzc;
    }

    public zzpl(Context context, zzpn zzpn, zzck zzck, zzzf zzzf, zzpo zzpo) {
        this(context, zzpn, zzck, zzpo);
        this.f20334e = zzzf;
    }

    private zzpl(Context context, zzpn zzpn, zzck zzck, zzpo zzpo) {
        super(context, zzpn, null, zzck, null, zzpo, null, null);
        this.f20337h = false;
        this.f20338i = false;
        this.f20339j = new Object();
        this.f20335f = zzpn;
    }

    /* renamed from: a */
    public final View mo2583a(OnClickListener onClickListener, boolean z) {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                onClickListener = this.f20336g.mo2583a(onClickListener, z);
                return onClickListener;
            }
            IObjectWrapper l;
            try {
                if (this.f20334e) {
                    l = this.f20334e.mo2856l();
                } else if (this.f20332c) {
                    l = this.f20332c.mo2819n();
                } else {
                    if (this.f20333d) {
                        l = this.f20333d.mo2837k();
                    }
                    l = false;
                }
            } catch (boolean z2) {
                zzaok.m10004c("Failed to call getAdChoicesContent", z2);
            }
            if (l == true) {
                View view = (View) ObjectWrapper.m26020a(l);
                return view;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo2591a() {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                boolean a = this.f20336g.mo2591a();
                return a;
            }
            a = this.f20335f.zzct();
            return a;
        }
    }

    /* renamed from: b */
    public final boolean mo2596b() {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                boolean b = this.f20336g.mo2596b();
                return b;
            }
            b = this.f20335f.zzcv();
            return b;
        }
    }

    /* renamed from: c */
    public final boolean mo2600c() {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                boolean c = this.f20336g.mo2600c();
                return c;
            }
            c = this.f20335f.zzcu();
            return c;
        }
    }

    /* renamed from: a */
    public final void mo2590a(zzsc zzsc) {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                this.f20336g.mo2590a(zzsc);
            }
        }
    }

    /* renamed from: d */
    public final void mo2601d() {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                this.f20336g.mo2601d();
            }
        }
    }

    /* renamed from: a */
    public final void mo2585a(View view) {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                this.f20336g.mo2585a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo2588a(View view, Map<String, WeakReference<View>> map) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        synchronized (this.f20339j) {
            this.f17298a = true;
            if (this.f20336g != null) {
                this.f20336g.mo2588a(view, (Map) map);
                this.f20335f.recordImpression();
            } else {
                try {
                    if (this.f20334e != null && this.f20334e.mo2860p() == null) {
                        this.f20334e.mo2862r();
                        this.f20335f.recordImpression();
                    } else if (this.f20332c != null && this.f20332c.mo2815j() == null) {
                        this.f20332c.mo2814i();
                        this.f20335f.recordImpression();
                    } else if (this.f20333d != null && this.f20333d.mo2834h() == null) {
                        this.f20333d.mo2833g();
                        this.f20335f.recordImpression();
                    }
                } catch (View view2) {
                    zzaok.m10004c("Failed to call recordImpression", view2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo2602e() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f20339j) {
            this.b = true;
            if (this.f20336g != null) {
                this.f20336g.mo2602e();
            }
        }
    }

    /* renamed from: a */
    public final void mo2584a(MotionEvent motionEvent) {
        synchronized (this.f20339j) {
            if (this.f20336g != null) {
                this.f20336g.mo2584a(motionEvent);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2589a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, android.os.Bundle r5, android.view.View r6) {
        /*
        r2 = this;
        r0 = "performClick must be called on the main UI thread.";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r0);
        r0 = r2.f20339j;
        monitor-enter(r0);
        r1 = r2.f20338i;	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0014;
    L_0x000c:
        r1 = r2.mo2596b();	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return;
    L_0x0014:
        r1 = r2.f20336g;	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0023;
    L_0x0018:
        r1 = r2.f20336g;	 Catch:{ all -> 0x0028 }
        r1.mo2589a(r3, r4, r5, r6);	 Catch:{ all -> 0x0028 }
        r3 = r2.f20335f;	 Catch:{ all -> 0x0028 }
        r3.onAdClicked();	 Catch:{ all -> 0x0028 }
        goto L_0x0026;
    L_0x0023:
        r2.m26790e(r3);	 Catch:{ all -> 0x0028 }
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return;
    L_0x0028:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpl.a(android.view.View, java.util.Map, android.os.Bundle, android.view.View):void");
    }

    /* renamed from: f */
    public final void mo2603f() {
        this.f20338i = true;
        if (this.f20336g != null) {
            this.f20336g.mo2603f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: g */
    public final void mo2604g() {
        /*
        r2 = this;
        r0 = "recordCustomClickGesture must be called on the main UI thread.";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r0);
        r0 = r2.f20339j;
        monitor-enter(r0);
        r1 = r2.f20336g;	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0020;
    L_0x000c:
        r1 = r2.f20338i;	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r1 = r2.f20336g;	 Catch:{ all -> 0x004b }
        r1.mo2603f();	 Catch:{ all -> 0x004b }
    L_0x0015:
        r1 = r2.f20336g;	 Catch:{ all -> 0x004b }
        r1.mo2604g();	 Catch:{ all -> 0x004b }
        r1 = r2.f20335f;	 Catch:{ all -> 0x004b }
        r1.onAdClicked();	 Catch:{ all -> 0x004b }
        goto L_0x0049;
    L_0x0020:
        r1 = r2.f20338i;	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x002b;
    L_0x0024:
        r1 = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);	 Catch:{ all -> 0x004b }
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        return;
    L_0x002b:
        r1 = r2.mo2596b();	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x0038;
    L_0x0031:
        r1 = "Custom click reporting for 3p ads failed. Ad unit id not whitelisted.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);	 Catch:{ all -> 0x004b }
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        return;
    L_0x0038:
        r1 = r2.m21846q();	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0049;
    L_0x003e:
        r1 = r2.m21846q();	 Catch:{ all -> 0x004b }
        r1 = r1.mo4273c();	 Catch:{ all -> 0x004b }
        r2.m26790e(r1);	 Catch:{ all -> 0x004b }
    L_0x0049:
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        return;
    L_0x004b:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpl.g():void");
    }

    /* renamed from: e */
    private final void m26790e(View view) {
        try {
            if (this.f20334e != null && !this.f20334e.mo2861q()) {
                this.f20334e.mo2843a(ObjectWrapper.m26019a((Object) view));
                this.f20335f.onAdClicked();
            } else if (this.f20332c == null || this.f20332c.mo2816k()) {
                if (!(this.f20333d == null || this.f20333d.mo2835i())) {
                    this.f20333d.mo2824a(ObjectWrapper.m26019a((Object) view));
                    this.f20335f.onAdClicked();
                }
            } else {
                this.f20332c.mo2803a(ObjectWrapper.m26019a((Object) view));
                this.f20335f.onAdClicked();
            }
        } catch (View view2) {
            zzaok.m10004c("Failed to call performClick", view2);
        }
    }

    /* renamed from: a */
    public final void mo4270a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f20339j) {
            this.f20337h = true;
            Object b = m26789b(map);
            Object b2 = m26789b(map2);
            try {
                if (this.f20334e != null) {
                    this.f20334e.mo2844a(ObjectWrapper.m26019a((Object) view), ObjectWrapper.m26019a(b), ObjectWrapper.m26019a(b2));
                } else if (this.f20332c != null) {
                    this.f20332c.mo2804a(ObjectWrapper.m26019a((Object) view), ObjectWrapper.m26019a(b), ObjectWrapper.m26019a(b2));
                    this.f20332c.mo2806b(ObjectWrapper.m26019a((Object) view));
                } else if (this.f20333d != null) {
                    this.f20333d.mo2825a(ObjectWrapper.m26019a((Object) view), ObjectWrapper.m26019a(b), ObjectWrapper.m26019a(b2));
                    this.f20333d.mo2827b(ObjectWrapper.m26019a((Object) view));
                }
            } catch (View view2) {
                zzaok.m10004c("Failed to call prepareAd", view2);
            }
            this.f20337h = null;
        }
    }

    /* renamed from: b */
    private static HashMap<String, View> m26789b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo2595b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f20339j) {
            try {
                if (this.f20334e != null) {
                    this.f20334e.mo2846b(ObjectWrapper.m26019a((Object) view));
                } else if (this.f20332c != null) {
                    this.f20332c.mo2808c(ObjectWrapper.m26019a((Object) view));
                } else if (this.f20333d != null) {
                    this.f20333d.mo2829c(ObjectWrapper.m26019a((Object) view));
                }
            } catch (View view2) {
                zzaok.m10004c("Failed to call untrackView", view2);
            }
        }
    }

    /* renamed from: h */
    public final boolean m26807h() {
        boolean z;
        synchronized (this.f20339j) {
            z = this.f20337h;
        }
        return z;
    }

    /* renamed from: a */
    public final void m26797a(zzpm zzpm) {
        synchronized (this.f20339j) {
            this.f20336g = zzpm;
        }
    }

    /* renamed from: i */
    public final zzpm m26808i() {
        zzpm zzpm;
        synchronized (this.f20339j) {
            zzpm = this.f20336g;
        }
        return zzpm;
    }

    /* renamed from: m */
    public final void mo2607m() {
        if (this.f20336g != null) {
            this.f20336g.mo2607m();
        }
    }

    /* renamed from: n */
    public final void mo2608n() {
        if (this.f20336g != null) {
            this.f20336g.mo2608n();
        }
    }
}
