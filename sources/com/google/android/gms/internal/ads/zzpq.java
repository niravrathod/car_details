package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public class zzpq implements zzpm {
    @VisibleForTesting
    /* renamed from: a */
    boolean f17298a;
    @VisibleForTesting
    /* renamed from: b */
    boolean f17299b;
    /* renamed from: c */
    private final Object f17300c = new Object();
    /* renamed from: d */
    private final zzpn f17301d;
    /* renamed from: e */
    private final Context f17302e;
    /* renamed from: f */
    private final zzow f17303f;
    /* renamed from: g */
    private final JSONObject f17304g;
    /* renamed from: h */
    private final zzadw f17305h;
    /* renamed from: i */
    private final zzpo f17306i;
    /* renamed from: j */
    private final zzck f17307j;
    /* renamed from: k */
    private final zzaop f17308k;
    /* renamed from: l */
    private String f17309l;
    /* renamed from: m */
    private zzakc f17310m;
    /* renamed from: n */
    private zzqf f17311n;
    /* renamed from: o */
    private boolean f17312o = false;
    /* renamed from: p */
    private long f17313p = 0;
    /* renamed from: q */
    private long f17314q = 0;
    /* renamed from: r */
    private WeakReference<View> f17315r = null;

    public zzpq(Context context, zzpn zzpn, zzadw zzadw, zzck zzck, JSONObject jSONObject, zzpo zzpo, zzaop zzaop, String str) {
        this.f17302e = context;
        this.f17301d = zzpn;
        this.f17305h = zzadw;
        this.f17307j = zzck;
        this.f17304g = jSONObject;
        this.f17306i = zzpo;
        this.f17308k = zzaop;
        this.f17309l = str;
        this.f17303f = new zzow(this.f17305h);
    }

    /* renamed from: b */
    public void mo2595b(View view, Map<String, WeakReference<View>> map) {
    }

    /* renamed from: a */
    public View mo2583a(OnClickListener onClickListener, boolean z) {
        zzov c = this.f17306i.mo4266c();
        if (c == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            z = c.m26674h();
            if (z) {
                switch (z) {
                    case true:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    case true:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
            }
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        z = new zzoy(this.f17302e, c, layoutParams);
        z.setOnClickListener(onClickListener);
        z.setContentDescription((CharSequence) zzkd.m10713e().m10897a(zznw.bA));
        return z;
    }

    /* renamed from: a */
    public boolean mo2591a() {
        zzov c = this.f17306i.mo4266c();
        return c != null && c.m26675i();
    }

    /* renamed from: c */
    public boolean mo2600c() {
        return this.f17304g != null && this.f17304g.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public boolean mo2596b() {
        return this.f17304g != null && this.f17304g.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: a */
    private final boolean m21805a(String str) {
        JSONObject optJSONObject = this.f17304g == null ? null : this.f17304g.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public final void mo2587a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z) {
        String str2;
        JSONObject jSONObject;
        Throwable e;
        zzpq zzpq = this;
        View view3 = view2;
        JSONObject a = m21803a((Map) map, view3);
        JSONObject g = m21809g(view3);
        JSONObject h = m21810h(view2);
        JSONObject i = m21811i(view3);
        JSONObject jSONObject2 = null;
        try {
            Bundle bundle2 = bundle;
            JSONObject a2 = zzbv.zzek().m9832a(bundle, null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                str2 = str;
                try {
                    jSONObject3.put("asset_id", str);
                    jSONObject = jSONObject3;
                } catch (Exception e2) {
                    e = e2;
                    jSONObject2 = jSONObject3;
                    zzaok.m10002b("Error occurred while grabbing click signals.", e);
                    jSONObject = jSONObject2;
                    m21804a(view, g, a, h, i, str, jSONObject, null, z);
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str;
                jSONObject2 = jSONObject3;
                zzaok.m10002b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m21804a(view, g, a, h, i, str, jSONObject, null, z);
            }
        } catch (Exception e4) {
            e = e4;
            str2 = str;
            zzaok.m10002b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m21804a(view, g, a, h, i, str, jSONObject, null, z);
        }
        m21804a(view, g, a, h, i, str, jSONObject, null, z);
    }

    /* renamed from: a */
    public void mo2589a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        Preconditions.checkMainThread("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        mo2587a(view, (String) entry.getKey(), bundle, map, view2, false);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f17306i.mo4262a())) {
            mo2587a(view, "3099", bundle, map, view2, false);
        } else if ("2".equals(this.f17306i.mo4262a())) {
            mo2587a(view, "2099", bundle, map, view2, false);
        } else {
            if ("1".equals(this.f17306i.mo4262a())) {
                mo2587a(view, "1099", bundle, map, view2, false);
            }
        }
    }

    /* renamed from: b */
    public final void mo2593b(Bundle bundle) {
        if (bundle == null) {
            zzaok.m10001b("Click data is null. No click is reported.");
        } else if (m21805a("click_reporting")) {
            m21804a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbv.zzek().m9832a(bundle, null), false);
        } else {
            zzaok.m10003c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        }
    }

    /* renamed from: a */
    private final void m21804a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z) {
        Preconditions.checkMainThread("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f17304g);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            jSONObject = new JSONObject();
            jSONObject2 = zzbv.zzer().currentTimeMillis();
            jSONObject.put("time_from_last_touch_down", jSONObject2 - this.f17314q);
            jSONObject.put("time_from_last_touch", jSONObject2 - this.f17313p);
            jSONObject7.put("touch_signal", jSONObject);
            jSONObject = new JSONObject();
            jSONObject.put("asset_id", str);
            jSONObject.put("template", this.f17306i.mo4262a());
            zzbv.zzem();
            jSONObject.put("is_privileged_process", zzalw.m9852e());
            str = null;
            if (!(((Boolean) zzkd.m10713e().m10897a(zznw.bF)).booleanValue() == null || this.f17303f.m10945a() == null || this.f17304g.optBoolean("custom_one_point_five_click_enabled", false) == null)) {
                jSONObject.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject.put("timestamp", jSONObject2);
            jSONObject.put("has_custom_click_handler", this.f17301d.zzt(this.f17306i.mo4265b()) != null ? true : null);
            if (!(this.f17312o == null || mo2596b() == null)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (z) {
                jSONObject.put("is_custom_click_gesture", true);
            }
            jSONObject2 = "has_custom_click_handler";
            if (this.f17301d.zzt(this.f17306i.mo4265b()) != null) {
                str = true;
            }
            jSONObject7.put(jSONObject2, str);
            try {
                jSONObject2 = this.f17304g.optJSONObject("tracking_urls_and_actions");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("click_signals", this.f17307j.m10479a().zza(this.f17302e, jSONObject2.optString("click_string"), view));
            } catch (View view2) {
                zzaok.m10002b("Exception obtaining click signals", view2);
            }
            jSONObject7.put("click", jSONObject);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f17309l);
            zzaov.m10017a(this.f17305h.mo2225b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (View view22) {
            zzaok.m10002b("Unable to create click JSON.", view22);
        }
    }

    /* renamed from: a */
    public void mo2584a(MotionEvent motionEvent) {
        this.f17313p = zzbv.zzer().currentTimeMillis();
        if (motionEvent.getAction() == 0) {
            this.f17314q = zzbv.zzer().currentTimeMillis();
        }
        this.f17307j.m10480a(motionEvent);
    }

    /* renamed from: c */
    public final void mo2597c(Bundle bundle) {
        if (bundle == null) {
            zzaok.m10001b("Touch event data is null. No touch event is reported.");
        } else if (m21805a("touch_reporting")) {
            this.f17307j.m10479a().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        } else {
            zzaok.m10003c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public final void mo2599c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
        r3 = this;
        r0 = r3.f17300c;
        monitor-enter(r0);
        r1 = r3.f17298a;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0009:
        r1 = m21807e(r4);	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0014;
    L_0x000f:
        r3.mo2588a(r4, r5);	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0014:
        r1 = com.google.android.gms.internal.ads.zznw.bE;	 Catch:{ all -> 0x005e }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x005e }
        r1 = r2.m10897a(r1);	 Catch:{ all -> 0x005e }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x005c;
    L_0x0026:
        if (r5 == 0) goto L_0x005c;
    L_0x0028:
        monitor-enter(r5);	 Catch:{ all -> 0x005e }
        r1 = r5.entrySet();	 Catch:{ all -> 0x0059 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0059 }
    L_0x0031:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0057;
    L_0x0037:
        r2 = r1.next();	 Catch:{ all -> 0x0059 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0059 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0059 }
        r2 = r2.get();	 Catch:{ all -> 0x0059 }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;
    L_0x004b:
        r2 = m21807e(r2);	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0031;
    L_0x0051:
        r3.mo2588a(r4, r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0057:
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        goto L_0x005c;
    L_0x0059:
        r4 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0059 }
        throw r4;	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x005e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.c(android.view.View, java.util.Map):void");
    }

    /* renamed from: e */
    private static boolean m21807e(View view) {
        return (!view.isShown() || view.getGlobalVisibleRect(new Rect(), null) == null) ? null : true;
    }

    /* renamed from: m */
    public void mo2607m() {
        this.f17301d.zzcq();
    }

    /* renamed from: a */
    public void mo2588a(View view, Map<String, WeakReference<View>> map) {
        m21806a(m21809g(view), m21803a((Map) map, view), m21810h(view), m21811i(view), null);
    }

    /* renamed from: a */
    public final boolean mo2592a(Bundle bundle) {
        if (m21805a("impression_reporting")) {
            return m21806a(null, null, null, null, zzbv.zzek().m9832a(bundle, null));
        }
        zzaok.m10003c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return null;
    }

    /* renamed from: a */
    private final boolean m21806a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Preconditions.checkMainThread("Invalid call from a non-UI thread.");
        if (this.f17298a) {
            return true;
        }
        this.f17298a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f17304g);
            jSONObject6.put("ads_id", this.f17309l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            zzaov.m10017a(this.f17305h.mo2227c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f17301d.zza((zzpm) this);
            this.f17301d.zzbv();
            mo2607m();
            return true;
        } catch (JSONObject jSONObject7) {
            zzaok.m10002b("Unable to create impression JSON.", jSONObject7);
            return null;
        }
    }

    /* renamed from: e */
    public void mo2602e() {
        Preconditions.checkMainThread("Invalid call from a non-UI thread.");
        if (!this.f17299b) {
            this.f17299b = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f17304g);
                jSONObject.put("ads_id", this.f17309l);
                zzaov.m10017a(this.f17305h.mo2228d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (Throwable e) {
                zzaok.m10002b("", e);
            }
        }
    }

    /* renamed from: o */
    public final View mo2609o() {
        return this.f17315r != null ? (View) this.f17315r.get() : null;
    }

    /* renamed from: c */
    public final void mo2598c(View view) {
        this.f17315r = new WeakReference(view);
    }

    /* renamed from: b */
    public final void mo2594b(View view) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bg)).booleanValue() && this.f17307j != null) {
            zzcg a = this.f17307j.m10479a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    /* renamed from: a */
    public void mo4270a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        if (map != null) {
            synchronized (map) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (map2 != null) {
            synchronized (map2) {
                for (Entry value2 : map2.entrySet()) {
                    View view3 = (View) ((WeakReference) value2.getValue()).get();
                    if (view3 != null) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public zzasg mo4271j() {
        if (this.f17304g != null) {
            if (this.f17304g.optJSONObject("overlay") != null) {
                zzbv.zzel();
                Context context = this.f17302e;
                zzjo a = zzjo.m26616a(this.f17302e);
                zzasg a2 = zzasm.m10092a(context, zzatt.m10130a(a), a.f20227a, false, false, this.f17307j, this.f17308k, null, null, null, zzhv.m10677a());
                if (a2 != null) {
                    a2.getView().setVisibility(8);
                    new sx(a2).m9378a(this.f17305h);
                }
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m21822a(Map<String, WeakReference<View>> map) {
        if (this.f17306i.mo4267d() != null) {
            boolean z = true;
            zzali k;
            String adUnitId;
            String a;
            if ("2".equals(this.f17306i.mo4262a())) {
                k = zzbv.zzeo().m9726k();
                adUnitId = this.f17301d.getAdUnitId();
                a = this.f17306i.mo4262a();
                if (map != null) {
                    if (!map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO)) {
                        if (map.containsKey(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO) != null) {
                        }
                    }
                    k.mo2337a(adUnitId, a, z);
                }
                z = false;
                k.mo2337a(adUnitId, a, z);
            } else if ("1".equals(this.f17306i.mo4262a())) {
                k = zzbv.zzeo().m9726k();
                adUnitId = this.f17301d.getAdUnitId();
                a = this.f17306i.mo4262a();
                if (map != null) {
                    if (!map.containsKey(NativeContentAd.ASSET_MEDIA_VIDEO)) {
                        if (map.containsKey(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO) != null) {
                        }
                    }
                    k.mo2337a(adUnitId, a, z);
                }
                z = false;
                k.mo2337a(adUnitId, a, z);
            }
        }
    }

    /* renamed from: b */
    public final boolean m21829b(View view, zzpk zzpk) {
        ViewGroup.LayoutParams layoutParams;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bD)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        View d = this.f17306i.mo4267d();
        if (d == null) {
            return null;
        }
        ViewParent parent = d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(d);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(d, layoutParams);
        this.f17301d.zza(zzpk);
        return true;
    }

    /* renamed from: d */
    public final void m21835d(View view) {
        this.f17301d.zzi(view);
    }

    /* renamed from: a */
    public final void mo2586a(android.view.View r4, com.google.android.gms.internal.ads.zzpk r5) {
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
        r5 = r3.m21829b(r4, r5);
        if (r5 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r5 = new android.widget.FrameLayout$LayoutParams;
        r0 = -1;
        r5.<init>(r0, r0);
        r0 = r4;
        r0 = (android.widget.FrameLayout) r0;
        r0.removeAllViews();
        r0 = r3.f17306i;
        r0 = r0 instanceof com.google.android.gms.internal.ads.zzpp;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        return;
    L_0x001a:
        r0 = r3.f17306i;
        r0 = (com.google.android.gms.internal.ads.zzpp) r0;
        r1 = r0.mo2633f();
        if (r1 == 0) goto L_0x006b;
    L_0x0024:
        r1 = r0.mo2633f();
        r1 = r1.size();
        if (r1 <= 0) goto L_0x006b;
    L_0x002e:
        r0 = r0.mo2633f();
        r1 = 0;
        r0 = r0.get(r1);
        r1 = r0 instanceof android.os.IBinder;
        if (r1 == 0) goto L_0x0042;
    L_0x003b:
        r0 = (android.os.IBinder) r0;
        r0 = com.google.android.gms.internal.ads.zzql.m21851a(r0);
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        if (r0 == 0) goto L_0x006b;
    L_0x0045:
        r0 = r0.mo2615a();	 Catch:{ RemoteException -> 0x0066 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ RemoteException -> 0x0066 }
    L_0x004b:
        r0 = com.google.android.gms.dynamic.ObjectWrapper.m26020a(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = (android.graphics.drawable.Drawable) r0;	 Catch:{ RemoteException -> 0x0066 }
        r1 = new android.widget.ImageView;	 Catch:{ RemoteException -> 0x0066 }
        r2 = r3.f17302e;	 Catch:{ RemoteException -> 0x0066 }
        r1.<init>(r2);	 Catch:{ RemoteException -> 0x0066 }
        r1.setImageDrawable(r0);	 Catch:{ RemoteException -> 0x0066 }
        r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ RemoteException -> 0x0066 }
        r1.setScaleType(r0);	 Catch:{ RemoteException -> 0x0066 }
        r4 = (android.widget.FrameLayout) r4;	 Catch:{ RemoteException -> 0x0066 }
        r4.addView(r1, r5);	 Catch:{ RemoteException -> 0x0066 }
    L_0x0065:
        return;
    L_0x0066:
        r4 = "Could not get drawable from image";
        com.google.android.gms.internal.ads.zzaok.m10007e(r4);
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.a(android.view.View, com.google.android.gms.internal.ads.zzpk):void");
    }

    /* renamed from: a */
    public void mo2590a(zzsc zzsc) {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.bF)).booleanValue()) {
            return;
        }
        if (this.f17304g.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f17303f.m10946a(zzsc);
        } else {
            zzaok.m10007e("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        }
    }

    /* renamed from: d */
    public void mo2601d() {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bF)).booleanValue() && this.f17304g.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f17303f.m10947b();
        }
    }

    /* renamed from: a */
    public void mo2585a(View view) {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.bF)).booleanValue()) {
            return;
        }
        if (this.f17304g.optBoolean("custom_one_point_five_click_enabled", false)) {
            Object obj = this.f17303f;
            if (view != null) {
                view.setOnClickListener(obj);
                view.setClickable(true);
                obj.f9758c = new WeakReference(view);
            }
            return;
        }
        zzaok.m10007e("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
    }

    /* renamed from: f */
    public void mo2603f() {
        this.f17312o = true;
    }

    /* renamed from: g */
    public void mo2604g() {
        if (this.f17311n == null) {
            zzaok.m10001b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else if (!this.f17312o) {
            zzaok.m10001b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (mo2596b()) {
            mo2587a(this.f17311n.mo4273c(), "3099", null, this.f17311n.mo4272b(), this.f17311n.mo4273c(), true);
        } else {
            zzaok.m10001b("Custom click reporting failed. Ad unit id not whitelisted.");
        }
    }

    /* renamed from: a */
    public final void m21820a(zzqf zzqf) {
        this.f17311n = zzqf;
    }

    /* renamed from: q */
    public final zzqf m21846q() {
        return this.f17311n;
    }

    /* renamed from: l */
    public void mo2606l() {
        this.f17301d.zzcs();
    }

    /* renamed from: n */
    public void mo2608n() {
        this.f17301d.zzcr();
    }

    /* renamed from: k */
    public void mo2605k() {
        this.f17305h.mo2222a();
    }

    /* renamed from: p */
    public final Context mo2610p() {
        return this.f17302e;
    }

    @VisibleForTesting
    /* renamed from: f */
    private static int[] m21808f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m21801a(int i) {
        zzkd.m10709a();
        return zzaoa.m9962b(this.f17302e, i);
    }

    /* renamed from: a */
    private final JSONObject m21802a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m21801a(rect.right - rect.left));
        jSONObject.put("height", m21801a(rect.bottom - rect.top));
        jSONObject.put("x", m21801a(rect.left));
        jSONObject.put("y", m21801a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: g */
    private final org.json.JSONObject m21809g(android.view.View r8) {
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
        r7 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r8 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = m21808f(r8);	 Catch:{ Exception -> 0x0091 }
        r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r3 = "width";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredWidth();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.m21801a(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "height";	 Catch:{ Exception -> 0x0091 }
        r4 = r8.getMeasuredHeight();	 Catch:{ Exception -> 0x0091 }
        r4 = r7.m21801a(r4);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r4);	 Catch:{ Exception -> 0x0091 }
        r3 = "x";	 Catch:{ Exception -> 0x0091 }
        r4 = 0;	 Catch:{ Exception -> 0x0091 }
        r5 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r5 = r7.m21801a(r5);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r5);	 Catch:{ Exception -> 0x0091 }
        r3 = "y";	 Catch:{ Exception -> 0x0091 }
        r5 = 1;	 Catch:{ Exception -> 0x0091 }
        r6 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r6 = r7.m21801a(r6);	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r6 = "window";	 Catch:{ Exception -> 0x0091 }
        r2.put(r3, r6);	 Catch:{ Exception -> 0x0091 }
        r3 = "frame";	 Catch:{ Exception -> 0x0091 }
        r0.put(r3, r2);	 Catch:{ Exception -> 0x0091 }
        r2 = new android.graphics.Rect;	 Catch:{ Exception -> 0x0091 }
        r2.<init>();	 Catch:{ Exception -> 0x0091 }
        r8 = r8.getGlobalVisibleRect(r2);	 Catch:{ Exception -> 0x0091 }
        if (r8 == 0) goto L_0x005f;	 Catch:{ Exception -> 0x0091 }
    L_0x005a:
        r8 = r7.m21802a(r2);	 Catch:{ Exception -> 0x0091 }
        goto L_0x008b;	 Catch:{ Exception -> 0x0091 }
    L_0x005f:
        r8 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0091 }
        r8.<init>();	 Catch:{ Exception -> 0x0091 }
        r2 = "width";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "height";	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r4);	 Catch:{ Exception -> 0x0091 }
        r2 = "x";	 Catch:{ Exception -> 0x0091 }
        r3 = r1[r4];	 Catch:{ Exception -> 0x0091 }
        r3 = r7.m21801a(r3);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r3);	 Catch:{ Exception -> 0x0091 }
        r2 = "y";	 Catch:{ Exception -> 0x0091 }
        r1 = r1[r5];	 Catch:{ Exception -> 0x0091 }
        r1 = r7.m21801a(r1);	 Catch:{ Exception -> 0x0091 }
        r8.put(r2, r1);	 Catch:{ Exception -> 0x0091 }
        r1 = "relative_to";	 Catch:{ Exception -> 0x0091 }
        r2 = "window";	 Catch:{ Exception -> 0x0091 }
        r8.put(r1, r2);	 Catch:{ Exception -> 0x0091 }
    L_0x008b:
        r1 = "visible_bounds";	 Catch:{ Exception -> 0x0091 }
        r0.put(r1, r8);	 Catch:{ Exception -> 0x0091 }
        goto L_0x0096;
    L_0x0091:
        r8 = "Unable to get native ad view bounding box";
        com.google.android.gms.internal.ads.zzaok.m10007e(r8);
    L_0x0096:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.g(android.view.View):org.json.JSONObject");
    }

    /* renamed from: h */
    private static org.json.JSONObject m21810h(android.view.View r3) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ Exception -> 0x001a }
        r3 = com.google.android.gms.internal.ads.zzalo.m9813d(r3);	 Catch:{ Exception -> 0x001a }
        r1 = "contained_in_scroll_view";	 Catch:{ Exception -> 0x001a }
        r2 = -1;	 Catch:{ Exception -> 0x001a }
        if (r3 == r2) goto L_0x0016;	 Catch:{ Exception -> 0x001a }
    L_0x0014:
        r3 = 1;	 Catch:{ Exception -> 0x001a }
        goto L_0x0017;	 Catch:{ Exception -> 0x001a }
    L_0x0016:
        r3 = 0;	 Catch:{ Exception -> 0x001a }
    L_0x0017:
        r0.put(r1, r3);	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.h(android.view.View):org.json.JSONObject");
    }

    /* renamed from: i */
    private final org.json.JSONObject m21811i(android.view.View r3) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = "can_show_on_lock_screen";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ JSONException -> 0x0023 }
        r3 = com.google.android.gms.internal.ads.zzalo.m9811c(r3);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r1, r3);	 Catch:{ JSONException -> 0x0023 }
        r3 = "is_keyguard_locked";	 Catch:{ JSONException -> 0x0023 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ JSONException -> 0x0023 }
        r1 = r2.f17302e;	 Catch:{ JSONException -> 0x0023 }
        r1 = com.google.android.gms.internal.ads.zzalo.m9826k(r1);	 Catch:{ JSONException -> 0x0023 }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x0023 }
        goto L_0x0028;
    L_0x0023:
        r3 = "Unable to get lock screen information";
        com.google.android.gms.internal.ads.zzaok.m10007e(r3);
    L_0x0028:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.i(android.view.View):org.json.JSONObject");
    }

    /* renamed from: a */
    private final org.json.JSONObject m21803a(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r13, android.view.View r14) {
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
        r12 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        if (r13 == 0) goto L_0x0105;
    L_0x0007:
        if (r14 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x0105;
    L_0x000b:
        r14 = m21808f(r14);
        monitor-enter(r13);
        r1 = r13.entrySet();	 Catch:{ all -> 0x0102 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0102 }
    L_0x0018:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0102 }
        if (r2 == 0) goto L_0x0100;	 Catch:{ all -> 0x0102 }
    L_0x001e:
        r2 = r1.next();	 Catch:{ all -> 0x0102 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0102 }
        r3 = r2.getValue();	 Catch:{ all -> 0x0102 }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x0102 }
        r3 = r3.get();	 Catch:{ all -> 0x0102 }
        r3 = (android.view.View) r3;	 Catch:{ all -> 0x0102 }
        if (r3 == 0) goto L_0x0018;	 Catch:{ all -> 0x0102 }
    L_0x0032:
        r4 = m21808f(r3);	 Catch:{ all -> 0x0102 }
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x0102 }
        r5.<init>();	 Catch:{ all -> 0x0102 }
        r6 = new org.json.JSONObject;	 Catch:{ all -> 0x0102 }
        r6.<init>();	 Catch:{ all -> 0x0102 }
        r7 = "width";	 Catch:{ JSONException -> 0x00f9 }
        r8 = r3.getMeasuredWidth();	 Catch:{ JSONException -> 0x00f9 }
        r8 = r12.m21801a(r8);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "height";	 Catch:{ JSONException -> 0x00f9 }
        r8 = r3.getMeasuredHeight();	 Catch:{ JSONException -> 0x00f9 }
        r8 = r12.m21801a(r8);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "x";	 Catch:{ JSONException -> 0x00f9 }
        r8 = 0;	 Catch:{ JSONException -> 0x00f9 }
        r9 = r4[r8];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r14[r8];	 Catch:{ JSONException -> 0x00f9 }
        r9 = r9 - r10;	 Catch:{ JSONException -> 0x00f9 }
        r9 = r12.m21801a(r9);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r9);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "y";	 Catch:{ JSONException -> 0x00f9 }
        r9 = 1;	 Catch:{ JSONException -> 0x00f9 }
        r10 = r4[r9];	 Catch:{ JSONException -> 0x00f9 }
        r11 = r14[r9];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r10 - r11;	 Catch:{ JSONException -> 0x00f9 }
        r10 = r12.m21801a(r10);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "relative_to";	 Catch:{ JSONException -> 0x00f9 }
        r10 = "ad_view";	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r10);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "frame";	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r7, r6);	 Catch:{ JSONException -> 0x00f9 }
        r6 = new android.graphics.Rect;	 Catch:{ JSONException -> 0x00f9 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f9 }
        r7 = r3.getLocalVisibleRect(r6);	 Catch:{ JSONException -> 0x00f9 }
        if (r7 == 0) goto L_0x0094;	 Catch:{ JSONException -> 0x00f9 }
    L_0x008f:
        r4 = r12.m21802a(r6);	 Catch:{ JSONException -> 0x00f9 }
        goto L_0x00c7;	 Catch:{ JSONException -> 0x00f9 }
    L_0x0094:
        r6 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00f9 }
        r6.<init>();	 Catch:{ JSONException -> 0x00f9 }
        r7 = "width";	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "height";	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "x";	 Catch:{ JSONException -> 0x00f9 }
        r10 = r4[r8];	 Catch:{ JSONException -> 0x00f9 }
        r8 = r14[r8];	 Catch:{ JSONException -> 0x00f9 }
        r10 = r10 - r8;	 Catch:{ JSONException -> 0x00f9 }
        r8 = r12.m21801a(r10);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r8);	 Catch:{ JSONException -> 0x00f9 }
        r7 = "y";	 Catch:{ JSONException -> 0x00f9 }
        r4 = r4[r9];	 Catch:{ JSONException -> 0x00f9 }
        r8 = r14[r9];	 Catch:{ JSONException -> 0x00f9 }
        r4 = r4 - r8;	 Catch:{ JSONException -> 0x00f9 }
        r4 = r12.m21801a(r4);	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r7, r4);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "relative_to";	 Catch:{ JSONException -> 0x00f9 }
        r7 = "ad_view";	 Catch:{ JSONException -> 0x00f9 }
        r6.put(r4, r7);	 Catch:{ JSONException -> 0x00f9 }
        r4 = r6;	 Catch:{ JSONException -> 0x00f9 }
    L_0x00c7:
        r6 = "visible_bounds";	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r6, r4);	 Catch:{ JSONException -> 0x00f9 }
        r4 = r3 instanceof android.widget.TextView;	 Catch:{ JSONException -> 0x00f9 }
        if (r4 == 0) goto L_0x00ee;	 Catch:{ JSONException -> 0x00f9 }
    L_0x00d0:
        r3 = (android.widget.TextView) r3;	 Catch:{ JSONException -> 0x00f9 }
        r4 = "text_color";	 Catch:{ JSONException -> 0x00f9 }
        r6 = r3.getCurrentTextColor();	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "font_size";	 Catch:{ JSONException -> 0x00f9 }
        r6 = r3.getTextSize();	 Catch:{ JSONException -> 0x00f9 }
        r6 = (double) r6;	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r6);	 Catch:{ JSONException -> 0x00f9 }
        r4 = "text";	 Catch:{ JSONException -> 0x00f9 }
        r3 = r3.getText();	 Catch:{ JSONException -> 0x00f9 }
        r5.put(r4, r3);	 Catch:{ JSONException -> 0x00f9 }
    L_0x00ee:
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x00f9 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x00f9 }
        r0.put(r2, r5);	 Catch:{ JSONException -> 0x00f9 }
        goto L_0x0018;
    L_0x00f9:
        r2 = "Unable to get asset views information";	 Catch:{ all -> 0x0102 }
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);	 Catch:{ all -> 0x0102 }
        goto L_0x0018;	 Catch:{ all -> 0x0102 }
    L_0x0100:
        monitor-exit(r13);	 Catch:{ all -> 0x0102 }
        return r0;	 Catch:{ all -> 0x0102 }
    L_0x0102:
        r14 = move-exception;	 Catch:{ all -> 0x0102 }
        monitor-exit(r13);	 Catch:{ all -> 0x0102 }
        throw r14;
    L_0x0105:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.a(java.util.Map, android.view.View):org.json.JSONObject");
    }

    /* renamed from: r */
    public final zzakc m21847r() {
        if (!zzbv.zzfj().m9668a(this.f17302e)) {
            return null;
        }
        if (this.f17310m == null) {
            this.f17310m = new zzakc(this.f17302e, this.f17301d.getAdUnitId());
        }
        return this.f17310m;
    }
}
