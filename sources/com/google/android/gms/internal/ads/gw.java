package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
@VisibleForTesting
final class gw extends WebView implements OnGlobalLayoutListener, DownloadListener, zzasg {
    @GuardedBy("this")
    /* renamed from: A */
    private zzpk f21269A;
    @GuardedBy("this")
    /* renamed from: B */
    private int f21270B;
    @GuardedBy("this")
    /* renamed from: C */
    private int f21271C;
    /* renamed from: D */
    private zzoh f21272D;
    /* renamed from: E */
    private zzoh f21273E;
    /* renamed from: F */
    private zzoh f21274F;
    /* renamed from: G */
    private zzoi f21275G;
    /* renamed from: H */
    private WeakReference<OnClickListener> f21276H;
    @GuardedBy("this")
    /* renamed from: I */
    private zzd f21277I;
    @GuardedBy("this")
    /* renamed from: J */
    private boolean f21278J;
    /* renamed from: K */
    private zzanz f21279K;
    /* renamed from: L */
    private int f21280L = -1;
    /* renamed from: M */
    private int f21281M = -1;
    /* renamed from: N */
    private int f21282N = -1;
    /* renamed from: O */
    private int f21283O = -1;
    /* renamed from: P */
    private Map<String, zzarr> f21284P;
    /* renamed from: Q */
    private final WindowManager f21285Q;
    /* renamed from: R */
    private final zzhv f21286R;
    /* renamed from: a */
    private final zzats f21287a;
    /* renamed from: b */
    private final zzck f21288b;
    /* renamed from: c */
    private final zzaop f21289c;
    /* renamed from: d */
    private final zzbo f21290d;
    /* renamed from: e */
    private final zzv f21291e;
    /* renamed from: f */
    private final DisplayMetrics f21292f;
    /* renamed from: g */
    private final float f21293g;
    /* renamed from: h */
    private boolean f21294h = false;
    /* renamed from: i */
    private boolean f21295i = false;
    /* renamed from: j */
    private zzash f21296j;
    @GuardedBy("this")
    /* renamed from: k */
    private zzd f21297k;
    @GuardedBy("this")
    /* renamed from: l */
    private IObjectWrapper f21298l;
    @GuardedBy("this")
    /* renamed from: m */
    private zzatt f21299m;
    @GuardedBy("this")
    /* renamed from: n */
    private String f21300n;
    @GuardedBy("this")
    /* renamed from: o */
    private boolean f21301o;
    @GuardedBy("this")
    /* renamed from: p */
    private boolean f21302p;
    @GuardedBy("this")
    /* renamed from: q */
    private boolean f21303q;
    @GuardedBy("this")
    /* renamed from: r */
    private boolean f21304r;
    @GuardedBy("this")
    /* renamed from: s */
    private Boolean f21305s;
    @GuardedBy("this")
    /* renamed from: t */
    private int f21306t;
    @GuardedBy("this")
    /* renamed from: u */
    private boolean f21307u = true;
    @GuardedBy("this")
    /* renamed from: v */
    private boolean f21308v = false;
    @GuardedBy("this")
    /* renamed from: w */
    private String f21309w = "";
    @GuardedBy("this")
    /* renamed from: x */
    private zzasw f21310x;
    @GuardedBy("this")
    /* renamed from: y */
    private boolean f21311y;
    @GuardedBy("this")
    /* renamed from: z */
    private boolean f21312z;

    /* renamed from: a */
    static gw m28104a(Context context, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv, zzhv zzhv) {
        Context context2 = context;
        return new gw(new zzats(context), zzatt, str, z, z2, zzck, zzaop, zzoj, zzbo, zzv, zzhv);
    }

    /* renamed from: a */
    public final zzaqx mo4731a() {
        return null;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    @VisibleForTesting
    private gw(zzats zzats, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv, zzhv zzhv) {
        super(zzats);
        this.f21287a = zzats;
        this.f21299m = zzatt;
        this.f21300n = str;
        this.f21303q = z;
        this.f21306t = -1;
        this.f21288b = zzck;
        this.f21289c = zzaop;
        this.f21290d = zzbo;
        this.f21291e = zzv;
        this.f21285Q = (WindowManager) getContext().getSystemService("window");
        zzbv.zzek();
        this.f21292f = zzalo.m9777a(this.f21285Q);
        this.f21293g = this.f21292f.density;
        this.f21286R = zzhv;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (String str2) {
            zzaok.m10002b("Unable to enable Javascript.", str2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= true) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzek().m9834a((Context) zzats, zzaop.f19893a, settings);
        zzbv.zzem().mo4178a(getContext(), settings);
        setDownloadListener(this);
        m28096O();
        if (PlatformVersion.isAtLeastJellyBeanMR1() != null) {
            addJavascriptInterface(zzasz.m10093a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f21279K = new zzanz(this.f21287a.m10126a(), this, this, null);
        m28101T();
        this.f21275G = new zzoi(new zzoj(true, "make_wv", this.f21300n));
        this.f21275G.m10922a().m10927a(zzoj);
        this.f21273E = zzoc.m10916a(this.f21275G.m10922a());
        this.f21275G.m10923a("native:view_create", this.f21273E);
        this.f21274F = null;
        this.f21272D = null;
        zzbv.zzem().mo4993b((Context) zzats);
        zzbv.zzeo().m9723h();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzash) {
            this.f21296j = (zzash) webViewClient;
        }
    }

    /* renamed from: e */
    public final zzv mo4200e() {
        return this.f21291e;
    }

    /* renamed from: K */
    private final boolean m28092K() {
        boolean z = false;
        if (!this.f21296j.mo2398b() && !this.f21296j.m21401c()) {
            return false;
        }
        int b;
        int i;
        zzkd.m10709a();
        int b2 = zzaoa.m9963b(this.f21292f, this.f21292f.widthPixels);
        zzkd.m10709a();
        int b3 = zzaoa.m9963b(this.f21292f, this.f21292f.heightPixels);
        Activity a = this.f21287a.m10126a();
        if (a != null) {
            if (a.getWindow() != null) {
                zzbv.zzek();
                int[] a2 = zzalo.m9802a(a);
                zzkd.m10709a();
                int b4 = zzaoa.m9963b(this.f21292f, a2[0]);
                zzkd.m10709a();
                b = zzaoa.m9963b(this.f21292f, a2[1]);
                i = b4;
                if (this.f21281M != b2 && this.f21280L == b3 && this.f21282N == i && this.f21283O == b) {
                    return false;
                }
                if (!(this.f21281M == b2 && this.f21280L == b3)) {
                    z = true;
                }
                this.f21281M = b2;
                this.f21280L = b3;
                this.f21282N = i;
                this.f21283O = b;
                new zzabr(this).m9444a(b2, b3, i, b, this.f21292f.density, this.f21285Q.getDefaultDisplay().getRotation());
                return z;
            }
        }
        i = b2;
        b = b3;
        if (this.f21281M != b2) {
        }
        z = true;
        this.f21281M = b2;
        this.f21280L = b3;
        this.f21282N = i;
        this.f21283O = b;
        new zzabr(this).m9444a(b2, b3, i, b, this.f21292f.density, this.f21285Q.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final void mo4743a(java.lang.String r2, java.util.Map<java.lang.String, ?> r3) {
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
        r1 = this;
        r0 = com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ JSONException -> 0x000c }
        r3 = r0.m9833a(r3);	 Catch:{ JSONException -> 0x000c }
        r1.mo2748a(r2, r3);
        return;
    L_0x000c:
        r2 = "Could not convert parameters to JSON.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw.a(java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.mo4721A();	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r2 = "#004 The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.ads.zzaok.m10008f(r2);	 Catch:{ all -> 0x0019 }
        if (r3 == 0) goto L_0x0012;
    L_0x000e:
        r2 = 0;
        r3.onReceiveValue(r2);	 Catch:{ all -> 0x0019 }
    L_0x0012:
        monitor-exit(r1);
        return;
    L_0x0014:
        super.evaluateJavascript(r2, r3);	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);
        return;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: c */
    private final synchronized void m28108c(String str) {
        if (mo4721A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    public final synchronized void loadUrl(String str) {
        if (mo4721A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "AdWebViewImpl.loadUrl");
            zzaok.m10004c("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: d */
    private final synchronized void m28109d(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "AdWebViewImpl.loadUrlUnsafe");
            zzaok.m10004c("Could not call loadUrl. ", e);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (mo4721A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (mo4721A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    /* renamed from: a */
    public final synchronized void mo4742a(String str, String str2, String str3) {
        if (mo4721A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.an)).booleanValue()) {
            str2 = zzati.m10101a(str2, zzati.m10100a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m28106a(String str, ValueCallback<String> valueCallback) {
        if (mo4721A() == null) {
            evaluateJavascript(str, null);
        } else {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: e */
    private final void m28110e(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (m28094M() == null) {
                m28093L();
            }
            if (m28094M().booleanValue()) {
                m28106a(str, null);
                return;
            }
            String str2 = "javascript:";
            str = String.valueOf(str);
            m28108c(str.length() != 0 ? str2.concat(str) : new String(str2));
            return;
        }
        str2 = "javascript:";
        str = String.valueOf(str);
        m28108c(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    /* renamed from: b */
    public final void mo2749b(String str) {
        m28110e(str);
    }

    /* renamed from: L */
    private final synchronized void m28093L() {
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
        monitor-enter(r2);
        r0 = com.google.android.gms.ads.internal.zzbv.zzeo();	 Catch:{ all -> 0x0029 }
        r0 = r0.m9716b();	 Catch:{ all -> 0x0029 }
        r2.f21305s = r0;	 Catch:{ all -> 0x0029 }
        r0 = r2.f21305s;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0027;
    L_0x000f:
        r0 = "(function(){})()";	 Catch:{ IllegalStateException -> 0x001f }
        r1 = 0;	 Catch:{ IllegalStateException -> 0x001f }
        r2.evaluateJavascript(r0, r1);	 Catch:{ IllegalStateException -> 0x001f }
        r0 = 1;	 Catch:{ IllegalStateException -> 0x001f }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IllegalStateException -> 0x001f }
        r2.m28105a(r0);	 Catch:{ IllegalStateException -> 0x001f }
        monitor-exit(r2);
        return;
    L_0x001f:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0029 }
        r2.m28105a(r0);	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r2);
        return;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw.L():void");
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m28105a(Boolean bool) {
        synchronized (this) {
            this.f21305s = bool;
        }
        zzbv.zzeo().m9713a(bool);
    }

    @VisibleForTesting
    /* renamed from: M */
    private final synchronized Boolean m28094M() {
        return this.f21305s;
    }

    /* renamed from: b */
    public final void mo4750b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(jSONObject).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(jSONObject);
        stringBuilder.append(");");
        m28110e(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo2748a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject);
        stringBuilder.append(");");
        str = "Dispatching AFMA event: ";
        jSONObject = String.valueOf(stringBuilder.toString());
        zzaok.m10001b(jSONObject.length() != 0 ? str.concat(jSONObject) : new String(str));
        m28110e(stringBuilder.toString());
    }

    /* renamed from: m */
    public final void mo4769m() {
        m28095N();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f21289c.f19893a);
        mo4743a("onhide", hashMap);
    }

    /* renamed from: a */
    public final void mo4732a(int i) {
        if (i == 0) {
            zzoc.m10917a(this.f21275G.m10922a(), this.f21273E, "aebb2");
        }
        m28095N();
        if (this.f21275G.m10922a() != null) {
            this.f21275G.m10922a().m10929a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f21289c.f19893a);
        mo4743a("onhide", hashMap);
    }

    /* renamed from: N */
    private final void m28095N() {
        zzoc.m10917a(this.f21275G.m10922a(), this.f21273E, "aeh2");
    }

    /* renamed from: n */
    public final void mo4770n() {
        if (this.f21272D == null) {
            zzoc.m10917a(this.f21275G.m10922a(), this.f21273E, "aes2");
            this.f21272D = zzoc.m10916a(this.f21275G.m10922a());
            this.f21275G.m10923a("native:view_show", this.f21272D);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f21289c.f19893a);
        mo4743a("onshow", hashMap);
    }

    /* renamed from: o */
    public final void mo4771o() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzep().m9879b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzep().m9876a()));
        hashMap.put("device_volume", String.valueOf(zzamh.m9874a(getContext())));
        mo4743a("volume", hashMap);
    }

    /* renamed from: q */
    public final synchronized zzd mo4775q() {
        return this.f21297k;
    }

    /* renamed from: y */
    public final synchronized IObjectWrapper mo4785y() {
        return this.f21298l;
    }

    /* renamed from: r */
    public final synchronized zzd mo4776r() {
        return this.f21277I;
    }

    /* renamed from: s */
    public final synchronized zzatt mo4205s() {
        return this.f21299m;
    }

    /* renamed from: t */
    public final synchronized String mo4781t() {
        return this.f21300n;
    }

    /* renamed from: v */
    public final WebViewClient mo4783v() {
        return this.f21296j;
    }

    /* renamed from: w */
    public final synchronized boolean mo4784w() {
        return this.f21301o;
    }

    /* renamed from: x */
    public final zzck mo4207x() {
        return this.f21288b;
    }

    /* renamed from: i */
    public final zzaop mo4204i() {
        return this.f21289c;
    }

    /* renamed from: z */
    public final synchronized boolean mo4208z() {
        return this.f21303q;
    }

    public final void onDownloadStart(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
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
        r0 = this;
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = android.net.Uri.parse(r1);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r2.setDataAndType(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r3 = r0.getContext();	 Catch:{ ActivityNotFoundException -> 0x0019 }
        com.google.android.gms.internal.ads.zzalo.m9789a(r3, r2);	 Catch:{ ActivityNotFoundException -> 0x0019 }
        return;
    L_0x0019:
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 51;
        r3 = java.lang.String.valueOf(r4);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Couldn't find an Activity to view url/mimetype: ";
        r3.append(r2);
        r3.append(r1);
        r1 = " / ";
        r3.append(r1);
        r3.append(r4);
        r1 = r3.toString();
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21296j.m21401c()) {
            synchronized (this) {
                if (this.f21269A != null) {
                    this.f21269A.mo2174a(motionEvent);
                }
            }
        } else if (this.f21288b != null) {
            this.f21288b.m10480a(motionEvent);
        }
        if (mo4721A()) {
            return null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() != 8 || ((axisValue <= 0.0f || canScrollVertically(-1)) && ((axisValue >= 0.0f || canScrollVertically(1)) && ((axisValue2 <= 0.0f || canScrollHorizontally(-1)) && (axisValue2 >= 0.0f || canScrollHorizontally(1)))))) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.mo4721A();	 Catch:{ all -> 0x01ff }
        r1 = 0;
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r7.setMeasuredDimension(r1, r1);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x000d:
        r0 = r7.isInEditMode();	 Catch:{ all -> 0x01ff }
        if (r0 != 0) goto L_0x01fa;
    L_0x0013:
        r0 = r7.f21303q;	 Catch:{ all -> 0x01ff }
        if (r0 != 0) goto L_0x01fa;
    L_0x0017:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.m10135f();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        goto L_0x01fa;
    L_0x0021:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.m10137h();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x002e;
    L_0x0029:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x002e:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.m10136g();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x0091;
    L_0x0036:
        r0 = com.google.android.gms.internal.ads.zznw.bD;	 Catch:{ all -> 0x01ff }
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x01ff }
        r0 = r1.m10897a(r0);	 Catch:{ all -> 0x01ff }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x01ff }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x004d;
    L_0x0048:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x004d:
        r0 = r7.mo4198b();	 Catch:{ all -> 0x01ff }
        r1 = 0;
        if (r0 == 0) goto L_0x0059;
    L_0x0054:
        r0 = r0.mo2558e();	 Catch:{ all -> 0x01ff }
        goto L_0x005a;
    L_0x0059:
        r0 = 0;
    L_0x005a:
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 != 0) goto L_0x0063;
    L_0x005e:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x0063:
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01ff }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01ff }
        r1 = (float) r9;	 Catch:{ all -> 0x01ff }
        r1 = r1 * r0;
        r1 = (int) r1;	 Catch:{ all -> 0x01ff }
        r2 = (float) r8;	 Catch:{ all -> 0x01ff }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x01ff }
        if (r9 != 0) goto L_0x007c;
    L_0x0074:
        if (r2 == 0) goto L_0x007c;
    L_0x0076:
        r9 = (float) r2;	 Catch:{ all -> 0x01ff }
        r9 = r9 * r0;
        r1 = (int) r9;	 Catch:{ all -> 0x01ff }
        r9 = r2;
        goto L_0x0084;
    L_0x007c:
        if (r8 != 0) goto L_0x0084;
    L_0x007e:
        if (r1 == 0) goto L_0x0084;
    L_0x0080:
        r8 = (float) r1;	 Catch:{ all -> 0x01ff }
        r8 = r8 / r0;
        r2 = (int) r8;	 Catch:{ all -> 0x01ff }
        r8 = r1;
    L_0x0084:
        r8 = java.lang.Math.min(r1, r8);	 Catch:{ all -> 0x01ff }
        r9 = java.lang.Math.min(r2, r9);	 Catch:{ all -> 0x01ff }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x0091:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.m10133d();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x00e3;
    L_0x0099:
        r0 = com.google.android.gms.internal.ads.zznw.bI;	 Catch:{ all -> 0x01ff }
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x01ff }
        r0 = r1.m10897a(r0);	 Catch:{ all -> 0x01ff }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x01ff }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x01ff }
        if (r0 != 0) goto L_0x00de;
    L_0x00ab:
        r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1();	 Catch:{ all -> 0x01ff }
        if (r0 != 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00de;
    L_0x00b2:
        r0 = "/contentHeight";
        r1 = new com.google.android.gms.internal.ads.gx;	 Catch:{ all -> 0x01ff }
        r1.<init>(r7);	 Catch:{ all -> 0x01ff }
        r7.mo4740a(r0, r1);	 Catch:{ all -> 0x01ff }
        r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();";
        r7.m28110e(r0);	 Catch:{ all -> 0x01ff }
        r0 = r7.f21292f;	 Catch:{ all -> 0x01ff }
        r0 = r0.density;	 Catch:{ all -> 0x01ff }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01ff }
        r1 = r7.f21271C;	 Catch:{ all -> 0x01ff }
        r2 = -1;
        if (r1 == r2) goto L_0x00d5;
    L_0x00ce:
        r9 = r7.f21271C;	 Catch:{ all -> 0x01ff }
        r9 = (float) r9;	 Catch:{ all -> 0x01ff }
        r9 = r9 * r0;
        r9 = (int) r9;	 Catch:{ all -> 0x01ff }
        goto L_0x00d9;
    L_0x00d5:
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01ff }
    L_0x00d9:
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x00de:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x00e3:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.m10134e();	 Catch:{ all -> 0x01ff }
        if (r0 == 0) goto L_0x00f8;
    L_0x00eb:
        r8 = r7.f21292f;	 Catch:{ all -> 0x01ff }
        r8 = r8.widthPixels;	 Catch:{ all -> 0x01ff }
        r9 = r7.f21292f;	 Catch:{ all -> 0x01ff }
        r9 = r9.heightPixels;	 Catch:{ all -> 0x01ff }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x00f8:
        r0 = android.view.View.MeasureSpec.getMode(r8);	 Catch:{ all -> 0x01ff }
        r8 = android.view.View.MeasureSpec.getSize(r8);	 Catch:{ all -> 0x01ff }
        r2 = android.view.View.MeasureSpec.getMode(r9);	 Catch:{ all -> 0x01ff }
        r9 = android.view.View.MeasureSpec.getSize(r9);	 Catch:{ all -> 0x01ff }
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r0 == r4) goto L_0x0118;
    L_0x0111:
        if (r0 != r3) goto L_0x0114;
    L_0x0113:
        goto L_0x0118;
    L_0x0114:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0119;
    L_0x0118:
        r0 = r8;
    L_0x0119:
        if (r2 == r4) goto L_0x011d;
    L_0x011b:
        if (r2 != r3) goto L_0x011e;
    L_0x011d:
        r5 = r9;
    L_0x011e:
        r2 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r2 = r2.f9019b;	 Catch:{ all -> 0x01ff }
        r3 = 1;
        if (r2 > r0) goto L_0x012e;
    L_0x0125:
        r2 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r2 = r2.f9018a;	 Catch:{ all -> 0x01ff }
        if (r2 <= r5) goto L_0x012c;
    L_0x012b:
        goto L_0x012e;
    L_0x012c:
        r2 = 0;
        goto L_0x012f;
    L_0x012e:
        r2 = 1;
    L_0x012f:
        r4 = com.google.android.gms.internal.ads.zznw.cA;	 Catch:{ all -> 0x01ff }
        r6 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x01ff }
        r4 = r6.m10897a(r4);	 Catch:{ all -> 0x01ff }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x01ff }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x01ff }
        if (r4 == 0) goto L_0x0167;
    L_0x0141:
        r4 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r4 = r4.f9019b;	 Catch:{ all -> 0x01ff }
        r4 = (float) r4;	 Catch:{ all -> 0x01ff }
        r6 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r4 = r4 / r6;
        r0 = (float) r0;	 Catch:{ all -> 0x01ff }
        r6 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r0 = r0 / r6;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0163;
    L_0x0151:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.f9018a;	 Catch:{ all -> 0x01ff }
        r0 = (float) r0;	 Catch:{ all -> 0x01ff }
        r4 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r0 = r0 / r4;
        r4 = (float) r5;	 Catch:{ all -> 0x01ff }
        r5 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r4 = r4 / r5;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0163;
    L_0x0161:
        r0 = 1;
        goto L_0x0164;
    L_0x0163:
        r0 = 0;
    L_0x0164:
        if (r2 == 0) goto L_0x0167;
    L_0x0166:
        goto L_0x0168;
    L_0x0167:
        r0 = r2;
    L_0x0168:
        r2 = 8;
        if (r0 == 0) goto L_0x01d7;
    L_0x016c:
        r0 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r0 = r0.f9019b;	 Catch:{ all -> 0x01ff }
        r0 = (float) r0;	 Catch:{ all -> 0x01ff }
        r4 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r0 = r0 / r4;
        r0 = (int) r0;	 Catch:{ all -> 0x01ff }
        r4 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r4 = r4.f9018a;	 Catch:{ all -> 0x01ff }
        r4 = (float) r4;	 Catch:{ all -> 0x01ff }
        r5 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r4 = r4 / r5;
        r4 = (int) r4;	 Catch:{ all -> 0x01ff }
        r8 = (float) r8;	 Catch:{ all -> 0x01ff }
        r5 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r8 = r8 / r5;
        r8 = (int) r8;	 Catch:{ all -> 0x01ff }
        r9 = (float) r9;	 Catch:{ all -> 0x01ff }
        r5 = r7.f21293g;	 Catch:{ all -> 0x01ff }
        r9 = r9 / r5;
        r9 = (int) r9;	 Catch:{ all -> 0x01ff }
        r5 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ff }
        r6.<init>(r5);	 Catch:{ all -> 0x01ff }
        r5 = "Not enough space to show ad. Needs ";
        r6.append(r5);	 Catch:{ all -> 0x01ff }
        r6.append(r0);	 Catch:{ all -> 0x01ff }
        r0 = "x";
        r6.append(r0);	 Catch:{ all -> 0x01ff }
        r6.append(r4);	 Catch:{ all -> 0x01ff }
        r0 = " dp, but only has ";
        r6.append(r0);	 Catch:{ all -> 0x01ff }
        r6.append(r8);	 Catch:{ all -> 0x01ff }
        r8 = "x";
        r6.append(r8);	 Catch:{ all -> 0x01ff }
        r6.append(r9);	 Catch:{ all -> 0x01ff }
        r8 = " dp.";
        r6.append(r8);	 Catch:{ all -> 0x01ff }
        r8 = r6.toString();	 Catch:{ all -> 0x01ff }
        com.google.android.gms.internal.ads.zzaok.m10007e(r8);	 Catch:{ all -> 0x01ff }
        r8 = r7.getVisibility();	 Catch:{ all -> 0x01ff }
        if (r8 == r2) goto L_0x01c5;
    L_0x01c1:
        r8 = 4;
        r7.setVisibility(r8);	 Catch:{ all -> 0x01ff }
    L_0x01c5:
        r7.setMeasuredDimension(r1, r1);	 Catch:{ all -> 0x01ff }
        r8 = r7.f21294h;	 Catch:{ all -> 0x01ff }
        if (r8 != 0) goto L_0x01f8;
    L_0x01cc:
        r8 = r7.f21286R;	 Catch:{ all -> 0x01ff }
        r9 = com.google.android.gms.internal.ads.zzhx.zza.zzb.BANNER_SIZE_INVALID;	 Catch:{ all -> 0x01ff }
        r8.m10684a(r9);	 Catch:{ all -> 0x01ff }
        r7.f21294h = r3;	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x01d7:
        r8 = r7.getVisibility();	 Catch:{ all -> 0x01ff }
        if (r8 == r2) goto L_0x01e0;
    L_0x01dd:
        r7.setVisibility(r1);	 Catch:{ all -> 0x01ff }
    L_0x01e0:
        r8 = r7.f21295i;	 Catch:{ all -> 0x01ff }
        if (r8 != 0) goto L_0x01ed;
    L_0x01e4:
        r8 = r7.f21286R;	 Catch:{ all -> 0x01ff }
        r9 = com.google.android.gms.internal.ads.zzhx.zza.zzb.BANNER_SIZE_VALID;	 Catch:{ all -> 0x01ff }
        r8.m10684a(r9);	 Catch:{ all -> 0x01ff }
        r7.f21295i = r3;	 Catch:{ all -> 0x01ff }
    L_0x01ed:
        r8 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r8 = r8.f9019b;	 Catch:{ all -> 0x01ff }
        r9 = r7.f21299m;	 Catch:{ all -> 0x01ff }
        r9 = r9.f9018a;	 Catch:{ all -> 0x01ff }
        r7.setMeasuredDimension(r8, r9);	 Catch:{ all -> 0x01ff }
    L_0x01f8:
        monitor-exit(r7);
        return;
    L_0x01fa:
        super.onMeasure(r8, r9);	 Catch:{ all -> 0x01ff }
        monitor-exit(r7);
        return;
    L_0x01ff:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gw.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean K = m28092K();
        zzd q = mo4775q();
        if (q != null && K) {
            q.zzoy();
        }
    }

    /* renamed from: a */
    public final synchronized void mo4735a(zzd zzd) {
        this.f21297k = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo4736a(IObjectWrapper iObjectWrapper) {
        this.f21298l = iObjectWrapper;
    }

    /* renamed from: b */
    public final synchronized void mo4748b(zzd zzd) {
        this.f21277I = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo4737a(zzatt zzatt) {
        this.f21299m = zzatt;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo4751b(boolean z) {
        Object obj = z != this.f21303q ? 1 : null;
        this.f21303q = z;
        m28096O();
        if (obj != null) {
            new zzabr(this).m9448c(z ? "expanded" : "default");
        }
    }

    /* renamed from: F */
    public final void mo4726F() {
        this.f21279K.m9947a();
    }

    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo4721A()) {
            this.f21279K.m9950c();
        }
        boolean z = this.f21311y;
        if (this.f21296j != null && this.f21296j.m21401c()) {
            if (!this.f21312z) {
                OnGlobalLayoutListener d = this.f21296j.m21402d();
                if (d != null) {
                    zzbv.zzfi();
                    zzaqa.m10047a((View) this, d);
                }
                OnScrollChangedListener e = this.f21296j.m21403e();
                if (e != null) {
                    zzbv.zzfi();
                    zzaqa.m10048a((View) this, e);
                }
                this.f21312z = true;
            }
            m28092K();
            z = true;
        }
        m28111g(z);
    }

    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo4721A()) {
                this.f21279K.m9951d();
            }
            super.onDetachedFromWindow();
            if (this.f21312z && this.f21296j != null && this.f21296j.m21401c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f21296j.m21402d();
                if (d != null) {
                    zzbv.zzem().mo4958a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f21296j.m21403e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f21312z = false;
            }
        }
        m28111g(false);
    }

    /* renamed from: a */
    public final void mo4733a(Context context) {
        this.f21287a.setBaseContext(context);
        this.f21279K.m9948a(this.f21287a.m10126a());
    }

    /* renamed from: c */
    public final synchronized void mo4753c(boolean z) {
        if (this.f21297k != null) {
            this.f21297k.zza(this.f21296j.mo2398b(), z);
        } else {
            this.f21301o = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f21306t;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f21306t = i;
        if (this.f21297k != 0) {
            this.f21297k.setRequestedOrientation(this.f21306t);
        }
    }

    /* renamed from: d */
    public final Activity mo4199d() {
        return this.f21287a.m10126a();
    }

    /* renamed from: p */
    public final Context mo4774p() {
        return this.f21287a.m10127b();
    }

    /* renamed from: O */
    private final synchronized void m28096O() {
        if (!this.f21303q) {
            if (!this.f21299m.m10134e()) {
                if (VERSION.SDK_INT < 18) {
                    zzaok.m10001b("Disabling hardware acceleration on an AdView.");
                    m28097P();
                    return;
                }
                zzaok.m10001b("Enabling hardware acceleration on an AdView.");
                m28098Q();
                return;
            }
        }
        zzaok.m10001b("Enabling hardware acceleration on an overlay.");
        m28098Q();
    }

    /* renamed from: P */
    private final synchronized void m28097P() {
        if (!this.f21304r) {
            zzbv.zzem().mo4181c((View) this);
        }
        this.f21304r = true;
    }

    /* renamed from: Q */
    private final synchronized void m28098Q() {
        if (this.f21304r) {
            zzbv.zzem().mo4180b((View) this);
        }
        this.f21304r = false;
    }

    public final synchronized void destroy() {
        m28101T();
        this.f21279K.m9949b();
        if (this.f21297k != null) {
            this.f21297k.close();
            this.f21297k.onDestroy();
            this.f21297k = null;
        }
        this.f21298l = null;
        this.f21296j.m21409k();
        if (!this.f21302p) {
            zzbv.zzfh();
            zzarq.m10083a((zzarg) this);
            m28100S();
            this.f21302p = true;
            zzalg.m21225a("Initiating WebView self destruct sequence in 3...");
            zzalg.m21225a("Loading blank page in WebView, 2...");
            m28109d("about:blank");
        }
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                if (!this.f21302p) {
                    this.f21296j.m21409k();
                    zzbv.zzfh();
                    zzarq.m10083a((zzarg) this);
                    m28100S();
                    m28099R();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: B */
    public final synchronized void mo4722B() {
        zzalg.m21225a("Destroying WebView!");
        m28099R();
        zzalo.f8872a.post(new gy(this));
    }

    /* renamed from: R */
    private final synchronized void m28099R() {
        if (!this.f21278J) {
            this.f21278J = true;
            zzbv.zzeo().m9724i();
        }
    }

    /* renamed from: A */
    public final synchronized boolean mo4721A() {
        return this.f21302p;
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (!mo4721A()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(((zzash) this.f21296j) == null || ((zzash) this.f21296j).m21410l() == null)) {
                    ((zzash) this.f21296j).m21410l().mo1713a();
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo4727G() {
        if (this.f21274F == null) {
            this.f21274F = zzoc.m10916a(this.f21275G.m10922a());
            this.f21275G.m10923a("native:view_load", this.f21274F);
        }
    }

    public final void onPause() {
        if (!mo4721A()) {
            try {
                super.onPause();
            } catch (Throwable e) {
                zzaok.m10002b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo4721A()) {
            try {
                super.onResume();
            } catch (Throwable e) {
                zzaok.m10002b("Could not resume webview.", e);
            }
        }
    }

    /* renamed from: J */
    public final void mo4730J() {
        zzalg.m21225a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo4758f(boolean z) {
        this.f21296j.m21399b(z);
    }

    public final void stopLoading() {
        if (!mo4721A()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zzaok.m10002b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo4754d(boolean z) {
        this.f21307u = z;
    }

    /* renamed from: C */
    public final synchronized boolean mo4723C() {
        return this.f21307u;
    }

    /* renamed from: D */
    public final synchronized boolean mo4724D() {
        return this.f21308v;
    }

    public final synchronized void zzck() {
        this.f21308v = true;
        if (this.f21290d != null) {
            this.f21290d.zzck();
        }
    }

    public final synchronized void zzcl() {
        this.f21308v = false;
        if (this.f21290d != null) {
            this.f21290d.zzcl();
        }
    }

    /* renamed from: S */
    private final synchronized void m28100S() {
        this.f21284P = null;
    }

    /* renamed from: a */
    public final synchronized void mo4739a(String str) {
        if (str == null) {
            str = "";
        }
        this.f21309w = str;
    }

    /* renamed from: g */
    public final synchronized String mo4759g() {
        return this.f21309w;
    }

    /* renamed from: l */
    public final synchronized void mo4765l() {
    }

    /* renamed from: c */
    public final zzoh mo4752c() {
        return this.f21273E;
    }

    /* renamed from: h */
    public final zzoi mo4203h() {
        return this.f21275G;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f21276H = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f21276H.get();
    }

    /* renamed from: a */
    public final synchronized void mo4738a(zzpk zzpk) {
        this.f21269A = zzpk;
    }

    /* renamed from: H */
    public final synchronized zzpk mo4728H() {
        return this.f21269A;
    }

    /* renamed from: b */
    public final synchronized zzasw mo4198b() {
        return this.f21310x;
    }

    /* renamed from: a */
    public final synchronized void mo4197a(zzasw zzasw) {
        if (this.f21310x != null) {
            zzaok.m10003c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f21310x = zzasw;
        }
    }

    /* renamed from: E */
    public final synchronized boolean mo4725E() {
        return this.f21270B > 0;
    }

    /* renamed from: e */
    public final synchronized void mo4756e(boolean z) {
        this.f21270B += z ? true : true;
        if (this.f21270B > false && this.f21297k) {
            this.f21297k.zzpb();
        }
    }

    /* renamed from: T */
    private final void m28101T() {
        if (this.f21275G != null) {
            zzoj a = this.f21275G.m10922a();
            if (!(a == null || zzbv.zzeo().m9711a() == null)) {
                zzbv.zzeo().m9711a().m10914a(a);
            }
        }
    }

    /* renamed from: I */
    public final void mo4729I() {
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo4744a(boolean z) {
        this.f21296j.m21394a(z);
    }

    /* renamed from: f */
    public final void mo4757f() {
        zzd q = mo4775q();
        if (q != null) {
            q.zzpa();
        }
    }

    /* renamed from: j */
    public final int mo4763j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo4764k() {
        return getMeasuredWidth();
    }

    /* renamed from: a */
    public final void mo4734a(zzc zzc) {
        this.f21296j.m21386a(zzc);
    }

    /* renamed from: a */
    public final void mo4745a(boolean z, int i) {
        this.f21296j.m21395a(z, i);
    }

    /* renamed from: a */
    public final void mo4746a(boolean z, int i, String str) {
        this.f21296j.m21396a(z, i, str);
    }

    /* renamed from: a */
    public final void mo4747a(boolean z, int i, String str, String str2) {
        this.f21296j.m21397a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo2329a(zzfv zzfv) {
        synchronized (this) {
            this.f21311y = zzfv.f9458a;
        }
        m28111g(zzfv.f9458a);
    }

    /* renamed from: g */
    private final void m28111g(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo4743a("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: a */
    public final void mo4740a(String str, zzu<? super zzasg> zzu) {
        if (this.f21296j != null) {
            this.f21296j.m21392a(str, (zzu) zzu);
        }
    }

    /* renamed from: b */
    public final void mo4749b(String str, zzu<? super zzasg> zzu) {
        if (this.f21296j != null) {
            this.f21296j.m21398b(str, (zzu) zzu);
        }
    }

    /* renamed from: a */
    public final void mo4741a(String str, Predicate<zzu<? super zzasg>> predicate) {
        if (this.f21296j != null) {
            this.f21296j.m21393a(str, (Predicate) predicate);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ zzatn mo4782u() {
        return this.f21296j;
    }
}
