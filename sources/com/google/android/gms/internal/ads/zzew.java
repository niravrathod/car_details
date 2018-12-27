package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzew implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: a */
    protected final zzeu f9418a;
    /* renamed from: b */
    private final Object f9419b = new Object();
    /* renamed from: c */
    private final WeakReference<zzakm> f9420c;
    /* renamed from: d */
    private WeakReference<ViewTreeObserver> f9421d;
    /* renamed from: e */
    private final zzgg f9422e;
    /* renamed from: f */
    private final Context f9423f;
    /* renamed from: g */
    private final WindowManager f9424g;
    /* renamed from: h */
    private final PowerManager f9425h;
    /* renamed from: i */
    private final KeyguardManager f9426i;
    /* renamed from: j */
    private final DisplayMetrics f9427j;
    /* renamed from: k */
    private zzfd f9428k;
    /* renamed from: l */
    private boolean f9429l;
    /* renamed from: m */
    private boolean f9430m = false;
    /* renamed from: n */
    private boolean f9431n = false;
    /* renamed from: o */
    private boolean f9432o;
    /* renamed from: p */
    private boolean f9433p;
    /* renamed from: q */
    private boolean f9434q;
    @VisibleForTesting
    /* renamed from: r */
    private BroadcastReceiver f9435r;
    /* renamed from: s */
    private final HashSet<zzet> f9436s = new HashSet();
    /* renamed from: t */
    private zzanp f9437t;
    /* renamed from: u */
    private final HashSet<zzfr> f9438u = new HashSet();
    /* renamed from: v */
    private final Rect f9439v = new Rect();
    /* renamed from: w */
    private final pk f9440w;
    /* renamed from: x */
    private float f9441x;

    public zzew(Context context, zzjo zzjo, zzakm zzakm, zzaop zzaop, zzgg zzgg) {
        this.f9420c = new WeakReference(zzakm);
        this.f9422e = zzgg;
        this.f9421d = new WeakReference(null);
        this.f9432o = true;
        this.f9434q = false;
        this.f9437t = new zzanp(200);
        this.f9418a = new zzeu(UUID.randomUUID().toString(), zzaop, zzjo.f20227a, zzakm.f8790k, zzakm.m9689a(), zzjo.f20234h);
        this.f9424g = (WindowManager) context.getSystemService("window");
        this.f9425h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f9426i = (KeyguardManager) context.getSystemService("keyguard");
        this.f9423f = context;
        this.f9440w = new pk(this, new Handler());
        this.f9423f.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f9440w);
        this.f9427j = context.getResources().getDisplayMetrics();
        context = this.f9424g.getDefaultDisplay();
        this.f9439v.right = context.getWidth();
        this.f9439v.bottom = context.getHeight();
        m10577a();
    }

    /* renamed from: a */
    public final void m10577a() {
        this.f9441x = zzamh.m9874a(this.f9423f);
    }

    /* renamed from: b */
    public final void m10583b() {
        synchronized (this.f9419b) {
            if (this.f9432o) {
                this.f9433p = true;
                try {
                    JSONObject i = m10575i();
                    i.put("doneReasonCode", "u");
                    m10572a(i, true);
                } catch (Throwable e) {
                    zzaok.m10002b("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    zzaok.m10002b("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.f9418a.m10566d());
                zzaok.m10001b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected final void m10578a(int r8) {
        /*
        r7 = this;
        r0 = r7.f9419b;
        monitor-enter(r0);
        r1 = r7.f9438u;	 Catch:{ all -> 0x00ce }
        r1 = r1.iterator();	 Catch:{ all -> 0x00ce }
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x00ce }
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r2 = r1.next();	 Catch:{ all -> 0x00ce }
        r2 = (com.google.android.gms.internal.ads.zzfr) r2;	 Catch:{ all -> 0x00ce }
        r2 = r2.mo2450a();	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0009;
    L_0x001d:
        r1 = 1;
        goto L_0x0020;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        if (r1 == 0) goto L_0x00cc;
    L_0x0022:
        r1 = r7.f9432o;	 Catch:{ all -> 0x00ce }
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        goto L_0x00cc;
    L_0x0028:
        r1 = r7.f9422e;	 Catch:{ all -> 0x00ce }
        r1 = r1.mo2446a();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x0040;
    L_0x0030:
        r2 = com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x00ce }
        r5 = r7.f9425h;	 Catch:{ all -> 0x00ce }
        r6 = r7.f9426i;	 Catch:{ all -> 0x00ce }
        r2 = r2.m9839a(r1, r5, r6);	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x0040;
    L_0x003e:
        r2 = 1;
        goto L_0x0041;
    L_0x0040:
        r2 = 0;
    L_0x0041:
        if (r1 == 0) goto L_0x0053;
    L_0x0043:
        if (r2 == 0) goto L_0x0053;
    L_0x0045:
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00ce }
        r5.<init>();	 Catch:{ all -> 0x00ce }
        r6 = 0;
        r5 = r1.getGlobalVisibleRect(r5, r6);	 Catch:{ all -> 0x00ce }
        if (r5 == 0) goto L_0x0053;
    L_0x0051:
        r5 = 1;
        goto L_0x0054;
    L_0x0053:
        r5 = 0;
    L_0x0054:
        r6 = r7.f9422e;	 Catch:{ all -> 0x00ce }
        r6 = r6.mo2447b();	 Catch:{ all -> 0x00ce }
        if (r6 == 0) goto L_0x0061;
    L_0x005c:
        r7.m10583b();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0061:
        if (r8 != r4) goto L_0x0071;
    L_0x0063:
        r6 = r7.f9437t;	 Catch:{ all -> 0x00ce }
        r6 = r6.m9930a();	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x0071;
    L_0x006b:
        r6 = r7.f9434q;	 Catch:{ all -> 0x00ce }
        if (r5 != r6) goto L_0x0071;
    L_0x006f:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x0071:
        if (r5 != 0) goto L_0x007b;
    L_0x0073:
        r6 = r7.f9434q;	 Catch:{ all -> 0x00ce }
        if (r6 != 0) goto L_0x007b;
    L_0x0077:
        if (r8 != r4) goto L_0x007b;
    L_0x0079:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x007b:
        r8 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r8 = r7.m10570a(r1, r8);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.m10572a(r8, r3);	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        r7.f9434q = r5;	 Catch:{ JSONException -> 0x0089, JSONException -> 0x0089 }
        goto L_0x008f;
    L_0x0089:
        r8 = move-exception;
        r1 = "Active view update failed.";
        com.google.android.gms.internal.ads.zzaok.m9999a(r1, r8);	 Catch:{ all -> 0x00ce }
    L_0x008f:
        r8 = r7.f9422e;	 Catch:{ all -> 0x00ce }
        r8 = r8.mo2448c();	 Catch:{ all -> 0x00ce }
        r8 = r8.mo2446a();	 Catch:{ all -> 0x00ce }
        if (r8 == 0) goto L_0x00c7;
    L_0x009b:
        r1 = r7.f9421d;	 Catch:{ all -> 0x00ce }
        r1 = r1.get();	 Catch:{ all -> 0x00ce }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ all -> 0x00ce }
        r8 = r8.getViewTreeObserver();	 Catch:{ all -> 0x00ce }
        if (r8 == r1) goto L_0x00c7;
    L_0x00a9:
        r7.m10574h();	 Catch:{ all -> 0x00ce }
        r2 = r7.f9429l;	 Catch:{ all -> 0x00ce }
        if (r2 == 0) goto L_0x00b8;
    L_0x00b0:
        if (r1 == 0) goto L_0x00c0;
    L_0x00b2:
        r1 = r1.isAlive();	 Catch:{ all -> 0x00ce }
        if (r1 == 0) goto L_0x00c0;
    L_0x00b8:
        r7.f9429l = r4;	 Catch:{ all -> 0x00ce }
        r8.addOnScrollChangedListener(r7);	 Catch:{ all -> 0x00ce }
        r8.addOnGlobalLayoutListener(r7);	 Catch:{ all -> 0x00ce }
    L_0x00c0:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x00ce }
        r1.<init>(r8);	 Catch:{ all -> 0x00ce }
        r7.f9421d = r1;	 Catch:{ all -> 0x00ce }
    L_0x00c7:
        r7.m10573g();	 Catch:{ all -> 0x00ce }
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00cc:
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        return;
    L_0x00ce:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ce }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzew.a(int):void");
    }

    /* renamed from: g */
    private final void m10573g() {
        if (this.f9428k != null) {
            this.f9428k.mo2445a(this);
        }
    }

    /* renamed from: c */
    public final boolean m10587c() {
        boolean z;
        synchronized (this.f9419b) {
            z = this.f9432o;
        }
        return z;
    }

    /* renamed from: a */
    private static int m10569a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    final boolean m10582a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || str.equals(this.f9418a.m10566d()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    final void m10585b(Map<String, String> map) {
        m10578a(3);
    }

    /* renamed from: a */
    final void m10581a(zzfr zzfr, Map<String, String> map) {
        map = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f9418a.m10566d());
        zzaok.m10001b(valueOf.length() != 0 ? map.concat(valueOf) : new String(map));
        m10584b(zzfr);
    }

    /* renamed from: c */
    final void m10586c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            Iterator it;
            if (!"1".equals(map.get("isVisible"))) {
                if ("true".equals(map.get("isVisible")) == null) {
                    map = null;
                    it = this.f9436s.iterator();
                    while (it.hasNext()) {
                        ((zzet) it.next()).m10562a(this, map);
                    }
                }
            }
            map = true;
            it = this.f9436s.iterator();
            while (it.hasNext()) {
                ((zzet) it.next()).m10562a(this, map);
            }
        }
    }

    /* renamed from: h */
    private final void m10574h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9421d.get();
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this);
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: i */
    private final JSONObject m10575i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f9418a.m10564b()).put("activeViewJSON", this.f9418a.m10565c()).put("timestamp", zzbv.zzer().elapsedRealtime()).put("adFormat", this.f9418a.m10563a()).put("hashCode", this.f9418a.m10566d()).put("isMraid", this.f9418a.m10567e()).put("isStopped", this.f9431n).put("isPaused", this.f9430m).put("isNative", this.f9418a.m10568f()).put("isScreenOn", m10576j()).put("appMuted", zzbv.zzep().m9879b()).put("appVolume", (double) zzbv.zzep().m9876a()).put("deviceVolume", (double) this.f9441x);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m10571a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m10572a(JSONObject jSONObject, boolean z) {
        try {
            jSONObject = m10571a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f9438u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzfr) obj).mo2449a(jSONObject, z);
            }
        } catch (JSONObject jSONObject2) {
            zzaok.m10002b("Skipping active view message.", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void m10580a(zzfr zzfr) {
        if (this.f9438u.isEmpty()) {
            synchronized (this.f9419b) {
                if (this.f9435r != null) {
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f9435r = new pj(this);
                    zzbv.zzfg().m9941a(this.f9423f, this.f9435r, intentFilter);
                }
            }
            m10578a(3);
        }
        this.f9438u.add(zzfr);
        try {
            zzfr.mo2449a(m10571a(m10570a(this.f9422e.mo2446a(), null)), false);
        } catch (zzfr zzfr2) {
            zzaok.m10002b("Skipping measurement update for new client.", zzfr2);
        }
    }

    /* renamed from: b */
    public final void m10584b(zzfr zzfr) {
        this.f9438u.remove(zzfr);
        zzfr.mo2451b();
        if (this.f9438u.isEmpty() != null) {
            synchronized (this.f9419b) {
                m10574h();
                synchronized (this.f9419b) {
                    if (this.f9435r != null) {
                        try {
                            zzbv.zzfg().m9940a(this.f9423f, this.f9435r);
                        } catch (Throwable e) {
                            zzaok.m10002b("Failed trying to unregister the receiver", e);
                        } catch (Throwable e2) {
                            zzbv.zzeo().m9714a(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f9435r = null;
                    }
                }
                this.f9423f.getContentResolver().unregisterContentObserver(this.f9440w);
                int i = 0;
                this.f9432o = false;
                m10573g();
                ArrayList arrayList = new ArrayList(this.f9438u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m10584b((zzfr) obj);
                }
            }
        }
    }

    /* renamed from: a */
    private final JSONObject m10570a(View view, Boolean bool) {
        if (view == null) {
            return m10575i().put("isAttachedToWindow", false).put("isScreenOn", m10576j()).put("isVisible", false);
        }
        boolean a = zzbv.zzem().mo5033a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            zzaok.m10002b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i = m10575i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m10569a(this.f9439v.top, this.f9427j)).put("bottom", m10569a(this.f9439v.bottom, this.f9427j)).put("left", m10569a(this.f9439v.left, this.f9427j)).put("right", m10569a(this.f9439v.right, this.f9427j))).put("adBox", new JSONObject().put("top", m10569a(rect.top, this.f9427j)).put("bottom", m10569a(rect.bottom, this.f9427j)).put("left", m10569a(rect.left, this.f9427j)).put("right", m10569a(rect.right, this.f9427j))).put("globalVisibleBox", new JSONObject().put("top", m10569a(rect2.top, this.f9427j)).put("bottom", m10569a(rect2.bottom, this.f9427j)).put("left", m10569a(rect2.left, this.f9427j)).put("right", m10569a(rect2.right, this.f9427j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m10569a(rect3.top, this.f9427j)).put("bottom", m10569a(rect3.bottom, this.f9427j)).put("left", m10569a(rect3.left, this.f9427j)).put("right", m10569a(rect3.right, this.f9427j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m10569a(rect4.top, this.f9427j)).put("bottom", m10569a(rect4.bottom, this.f9427j)).put("left", m10569a(rect4.left, this.f9427j)).put("right", m10569a(rect4.right, this.f9427j))).put("screenDensity", (double) this.f9427j.density);
        if (bool == null) {
            bool = Boolean.valueOf(zzbv.zzek().m9839a(view, this.f9425h, this.f9426i));
        }
        i.put("isVisible", bool.booleanValue());
        return i;
    }

    @VisibleForTesting
    /* renamed from: j */
    private final boolean m10576j() {
        if (VERSION.SDK_INT >= 20) {
            return this.f9425h.isInteractive();
        }
        return this.f9425h.isScreenOn();
    }

    public final void onScrollChanged() {
        m10578a(1);
    }

    public final void onGlobalLayout() {
        m10578a(2);
    }

    /* renamed from: a */
    public final void m10579a(zzfd zzfd) {
        synchronized (this.f9419b) {
            this.f9428k = zzfd;
        }
    }

    /* renamed from: d */
    public final void m10588d() {
        synchronized (this.f9419b) {
            this.f9431n = true;
            m10578a(3);
        }
    }

    /* renamed from: e */
    public final void m10589e() {
        synchronized (this.f9419b) {
            this.f9430m = true;
            m10578a(3);
        }
    }

    /* renamed from: f */
    public final void m10590f() {
        synchronized (this.f9419b) {
            this.f9430m = false;
            m10578a(3);
        }
    }
}
