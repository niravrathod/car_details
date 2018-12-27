package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.view.C0560r;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzc;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
@VisibleForTesting
public class zzash extends WebViewClient implements zzatn {
    /* renamed from: b */
    private static final String[] f16940b = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    /* renamed from: c */
    private static final String[] f16941c = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    /* renamed from: A */
    private boolean f16942A;
    /* renamed from: B */
    private int f16943B;
    /* renamed from: C */
    private boolean f16944C;
    /* renamed from: D */
    private OnAttachStateChangeListener f16945D;
    /* renamed from: a */
    protected zzajy f16946a;
    /* renamed from: d */
    private zzasg f16947d;
    /* renamed from: e */
    private final zzhv f16948e;
    /* renamed from: f */
    private final HashMap<String, List<zzu<? super zzasg>>> f16949f;
    /* renamed from: g */
    private final Object f16950g;
    /* renamed from: h */
    private zzjc f16951h;
    /* renamed from: i */
    private zzn f16952i;
    /* renamed from: j */
    private zzato f16953j;
    /* renamed from: k */
    private zzatp f16954k;
    /* renamed from: l */
    private zzb f16955l;
    /* renamed from: m */
    private zzd f16956m;
    /* renamed from: n */
    private zzatq f16957n;
    /* renamed from: o */
    private boolean f16958o;
    @GuardedBy("mLock")
    /* renamed from: p */
    private boolean f16959p;
    @GuardedBy("mLock")
    /* renamed from: q */
    private boolean f16960q;
    @GuardedBy("mLock")
    /* renamed from: r */
    private OnGlobalLayoutListener f16961r;
    @GuardedBy("mLock")
    /* renamed from: s */
    private OnScrollChangedListener f16962s;
    @GuardedBy("mLock")
    /* renamed from: t */
    private boolean f16963t;
    /* renamed from: u */
    private zzt f16964u;
    /* renamed from: v */
    private final zzabq f16965v;
    /* renamed from: w */
    private zzw f16966w;
    /* renamed from: x */
    private zzabh f16967x;
    /* renamed from: y */
    private zzatr f16968y;
    /* renamed from: z */
    private boolean f16969z;

    public zzash(zzasg zzasg, zzhv zzhv, boolean z) {
        this(zzasg, zzhv, z, new zzabq(zzasg, zzasg.mo4774p(), new zznh(zzasg.getContext())), null);
    }

    @VisibleForTesting
    private zzash(zzasg zzasg, zzhv zzhv, boolean z, zzabq zzabq, zzabh zzabh) {
        this.f16949f = new HashMap();
        this.f16950g = new Object();
        this.f16958o = null;
        this.f16948e = zzhv;
        this.f16947d = zzasg;
        this.f16959p = z;
        this.f16965v = zzabq;
        this.f16967x = null;
    }

    /* renamed from: a */
    public final void mo2391a(int i, int i2, boolean z) {
        this.f16965v.m21074a(i, i2);
        if (this.f16967x != null) {
            this.f16967x.m21068a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo2397a(zzjc zzjc, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, zzy zzy, zzw zzw, zzabs zzabs, zzajy zzajy) {
        if (zzw == null) {
            zzw = new zzw(this.f16947d.getContext(), zzajy, null);
        }
        this.f16967x = new zzabh(this.f16947d, zzabs);
        this.f16946a = zzajy;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ar)).booleanValue() != null) {
            m21392a("/adMetadata", new zza(zzb));
        }
        m21392a("/appEvent", new zzc(zzd));
        m21392a("/backButton", zzf.zzbpg);
        m21392a("/refresh", zzf.zzbph);
        m21392a("/canOpenURLs", zzf.zzbox);
        m21392a("/canOpenIntents", zzf.zzboy);
        m21392a("/click", zzf.zzboz);
        m21392a("/close", zzf.zzbpa);
        m21392a("/customClose", zzf.zzbpb);
        m21392a("/instrument", zzf.zzbpk);
        m21392a("/delayPageLoaded", zzf.zzbpm);
        m21392a("/delayPageClosed", zzf.zzbpn);
        m21392a("/getLocationInfo", zzf.zzbpo);
        m21392a("/httpTrack", zzf.zzbpc);
        m21392a("/log", zzf.zzbpd);
        m21392a("/mraid", new zzab(zzw, this.f16967x, zzabs));
        m21392a("/mraidLoaded", this.f16965v);
        m21392a("/open", new zzac(zzw, this.f16967x));
        m21392a("/precache", new zzarv());
        m21392a("/touch", zzf.zzbpf);
        m21392a("/video", zzf.zzbpi);
        m21392a("/videoMeta", zzf.zzbpj);
        if (zzbv.zzfj().m9668a(this.f16947d.getContext()) != null) {
            m21392a("/logScionEvent", new zzaa(this.f16947d.getContext()));
        }
        if (zzy != null) {
            m21392a("/setInterstitialProperties", new zzx(zzy));
        }
        this.f16951h = zzjc;
        this.f16952i = zzn;
        this.f16955l = zzb;
        this.f16956m = zzd;
        this.f16964u = zzt;
        this.f16966w = zzw;
        this.f16958o = z;
    }

    /* renamed from: a */
    public final zzw mo2389a() {
        return this.f16966w;
    }

    /* renamed from: b */
    public final boolean mo2398b() {
        boolean z;
        synchronized (this.f16950g) {
            z = this.f16959p;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m21401c() {
        boolean z;
        synchronized (this.f16950g) {
            z = this.f16960q;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener m21402d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f16950g) {
            onGlobalLayoutListener = this.f16961r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener m21403e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f16950g) {
            onScrollChangedListener = this.f16962s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo2399f() {
        boolean z;
        synchronized (this.f16950g) {
            z = this.f16963t;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
        r0 = this;
        r1 = r0.f16950g;
        monitor-enter(r1);
        r2 = r0.f16947d;	 Catch:{ all -> 0x002b }
        r2 = r2.mo4721A();	 Catch:{ all -> 0x002b }
        if (r2 == 0) goto L_0x0017;
    L_0x000b:
        r2 = "Blank page loaded, 1...";
        com.google.android.gms.internal.ads.zzalg.m21225a(r2);	 Catch:{ all -> 0x002b }
        r2 = r0.f16947d;	 Catch:{ all -> 0x002b }
        r2.mo4722B();	 Catch:{ all -> 0x002b }
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        return;
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        r1 = 1;
        r0.f16969z = r1;
        r1 = r0.f16954k;
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r1 = r0.f16954k;
        r1.mo1935a();
        r1 = 0;
        r0.f16954k = r1;
    L_0x0027:
        r0.m21380q();
        return;
    L_0x002b:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzash.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* renamed from: a */
    private final void m21375a(View view, zzajy zzajy, int i) {
        if (zzajy.mo2324b() && i > 0) {
            zzajy.mo2320a(view);
            if (zzajy.mo2324b()) {
                zzalo.f8872a.postDelayed(new gp(this, view, zzajy, i), 100);
            }
        }
    }

    /* renamed from: p */
    private final void m21379p() {
        if (this.f16945D != null) {
            this.f16947d.getView().removeOnAttachStateChangeListener(this.f16945D);
        }
    }

    /* renamed from: g */
    public final void mo2400g() {
        zzajy zzajy = this.f16946a;
        if (zzajy != null) {
            View webView = this.f16947d.getWebView();
            if (C0560r.m2162A(webView)) {
                m21375a(webView, zzajy, 10);
                return;
            }
            m21379p();
            this.f16945D = new gq(this, zzajy);
            this.f16947d.getView().addOnAttachStateChangeListener(this.f16945D);
        }
    }

    /* renamed from: h */
    public final void mo2401h() {
        synchronized (this.f16950g) {
            this.f16963t = true;
        }
        this.f16943B++;
        m21380q();
    }

    /* renamed from: i */
    public final void mo2402i() {
        this.f16943B--;
        m21380q();
    }

    /* renamed from: j */
    public final void mo2403j() {
        this.f16942A = true;
        m21380q();
    }

    /* renamed from: q */
    private final void m21380q() {
        if (this.f16953j != null && ((this.f16969z && this.f16943B <= 0) || this.f16942A)) {
            this.f16953j.mo1722a(this.f16942A ^ 1);
            this.f16953j = null;
        }
        this.f16947d.mo4727G();
    }

    /* renamed from: a */
    public final void m21386a(com.google.android.gms.ads.internal.overlay.zzc zzc) {
        zzn zzn;
        boolean z = this.f16947d.mo4208z();
        zzjc zzjc = (!z || this.f16947d.mo4205s().m10134e()) ? this.f16951h : null;
        if (z) {
            zzn = null;
        } else {
            zzn = this.f16952i;
        }
        m21376a(new AdOverlayInfoParcel(zzc, zzjc, zzn, this.f16964u, this.f16947d.mo4204i()));
    }

    /* renamed from: a */
    public final void m21395a(boolean z, int i) {
        zzjc zzjc = (!this.f16947d.mo4208z() || this.f16947d.mo4205s().m10134e()) ? this.f16951h : null;
        m21376a(new AdOverlayInfoParcel(zzjc, this.f16952i, this.f16964u, this.f16947d, z, i, this.f16947d.mo4204i()));
    }

    /* renamed from: a */
    public final void m21396a(boolean z, int i, String str) {
        zzn zzn;
        boolean z2 = this.f16947d.mo4208z();
        zzjc zzjc = (!z2 || r0.f16947d.mo4205s().m10134e()) ? r0.f16951h : null;
        if (z2) {
            zzn = null;
        } else {
            zzn = new gr(r0.f16947d, r0.f16952i);
        }
        m21376a(new AdOverlayInfoParcel(zzjc, zzn, r0.f16955l, r0.f16956m, r0.f16964u, r0.f16947d, z, i, str, r0.f16947d.mo4204i()));
    }

    /* renamed from: a */
    public final void m21397a(boolean z, int i, String str, String str2) {
        zzn zzn;
        boolean z2 = this.f16947d.mo4208z();
        zzjc zzjc = (!z2 || r0.f16947d.mo4205s().m10134e()) ? r0.f16951h : null;
        if (z2) {
            zzn = null;
        } else {
            zzn = new gr(r0.f16947d, r0.f16952i);
        }
        m21376a(new AdOverlayInfoParcel(zzjc, zzn, r0.f16955l, r0.f16956m, r0.f16964u, r0.f16947d, z, i, str, str2, r0.f16947d.mo4204i()));
    }

    /* renamed from: a */
    private final void m21376a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f16967x != null ? this.f16967x.m21071a() : false;
        zzbv.zzei();
        Context context = this.f16947d.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f16946a != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzcbw != null) {
                str = adOverlayInfoParcel.zzcbw.url;
            }
            this.f16946a.mo2321a(str);
        }
    }

    /* renamed from: a */
    public final void m21392a(String str, zzu<? super zzasg> zzu) {
        synchronized (this.f16950g) {
            List list = (List) this.f16949f.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f16949f.put(str, list);
            }
            list.add(zzu);
        }
    }

    /* renamed from: b */
    public final void m21398b(String str, zzu<? super zzasg> zzu) {
        synchronized (this.f16950g) {
            List list = (List) this.f16949f.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzu);
        }
    }

    /* renamed from: a */
    public final void m21393a(String str, Predicate<zzu<? super zzasg>> predicate) {
        synchronized (this.f16950g) {
            List<zzu> list = (List) this.f16949f.get(str);
            if (list == null) {
                return;
            }
            Collection arrayList = new ArrayList();
            for (zzu zzu : list) {
                if (predicate.apply(zzu)) {
                    arrayList.add(zzu);
                }
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: k */
    public final void m21409k() {
        if (this.f16946a != null) {
            this.f16946a.mo2326d();
            this.f16946a = null;
        }
        m21379p();
        synchronized (this.f16950g) {
            this.f16949f.clear();
            this.f16951h = null;
            this.f16952i = null;
            this.f16953j = null;
            this.f16954k = null;
            this.f16955l = null;
            this.f16956m = null;
            this.f16958o = false;
            this.f16959p = false;
            this.f16960q = false;
            this.f16963t = false;
            this.f16964u = null;
            this.f16957n = null;
            if (this.f16967x != null) {
                this.f16967x.m21070a(true);
                this.f16967x = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo2393a(zzato zzato) {
        this.f16953j = zzato;
    }

    /* renamed from: a */
    public final void mo2394a(zzatp zzatp) {
        this.f16954k = zzatp;
    }

    /* renamed from: a */
    public final void mo2395a(zzatq zzatq) {
        this.f16957n = zzatq;
    }

    /* renamed from: a */
    public final void mo2396a(zzatr zzatr) {
        this.f16968y = zzatr;
    }

    /* renamed from: l */
    public final zzatr m21410l() {
        return this.f16968y;
    }

    public final void onLoadResource(WebView webView, String str) {
        webView = "Loading resource: ";
        String valueOf = String.valueOf(str);
        zzalg.m21225a(valueOf.length() != 0 ? webView.concat(valueOf) : new String(webView));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) != null && "mobileads.google.com".equalsIgnoreCase(parse.getHost()) != null) {
            m21374a(parse);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f16940b.length) {
                str3 = f16940b[i2];
                m21373a(this.f16947d.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m21373a(this.f16947d.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            String valueOf;
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f16941c.length) {
                valueOf = String.valueOf(primaryError);
            } else {
                valueOf = f16941c[primaryError];
            }
            m21373a(this.f16947d.getContext(), "ssl_err", valueOf, zzbv.zzem().mo4794a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* renamed from: a */
    private final void m21373a(Context context, String str, String str2, String str3) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aY)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            str = "host";
            if (TextUtils.isEmpty(str3) == null) {
                str2 = Uri.parse(str3);
                if (str2.getHost() != null) {
                    str2 = str2.getHost();
                    bundle.putString(str, str2);
                    zzbv.zzek().m9835a(context, this.f16947d.mo4204i().f19893a, "gmob-apps", bundle, true);
                }
            }
            str2 = "";
            bundle.putString(str, str2);
            zzbv.zzek().m9835a(context, this.f16947d.mo4204i().f19893a, "gmob-apps", bundle, true);
        }
    }

    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r12, java.lang.String r13) {
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
        r11 = this;
        r0 = "AdWebView shouldOverrideUrlLoading: ";
        r1 = java.lang.String.valueOf(r13);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r0.concat(r1);
        goto L_0x0017;
    L_0x0011:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0017:
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
        r0 = android.net.Uri.parse(r13);
        r1 = "gmsg";
        r2 = r0.getScheme();
        r1 = r1.equalsIgnoreCase(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x003c;
    L_0x002b:
        r1 = "mobileads.google.com";
        r3 = r0.getHost();
        r1 = r1.equalsIgnoreCase(r3);
        if (r1 == 0) goto L_0x003c;
    L_0x0037:
        r11.m21374a(r0);
        goto L_0x010b;
    L_0x003c:
        r1 = r11.f16958o;
        if (r1 == 0) goto L_0x007c;
    L_0x0040:
        r1 = r11.f16947d;
        r1 = r1.getWebView();
        if (r12 != r1) goto L_0x007c;
    L_0x0048:
        r1 = r0.getScheme();
        r3 = "http";
        r3 = r3.equalsIgnoreCase(r1);
        if (r3 != 0) goto L_0x005f;
    L_0x0054:
        r3 = "https";
        r1 = r3.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r1 = 0;
        goto L_0x0060;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        if (r1 == 0) goto L_0x007c;
    L_0x0062:
        r0 = r11.f16951h;
        if (r0 == 0) goto L_0x0077;
    L_0x0066:
        r0 = r11.f16951h;
        r0.onAdClicked();
        r0 = r11.f16946a;
        if (r0 == 0) goto L_0x0074;
    L_0x006f:
        r0 = r11.f16946a;
        r0.mo2321a(r13);
    L_0x0074:
        r0 = 0;
        r11.f16951h = r0;
    L_0x0077:
        r12 = super.shouldOverrideUrlLoading(r12, r13);
        return r12;
    L_0x007c:
        r12 = r11.f16947d;
        r12 = r12.getWebView();
        r12 = r12.willNotDraw();
        if (r12 != 0) goto L_0x00f1;
    L_0x0088:
        r12 = r11.f16947d;	 Catch:{ zzcl -> 0x00ae }
        r12 = r12.mo4207x();	 Catch:{ zzcl -> 0x00ae }
        if (r12 == 0) goto L_0x00c9;	 Catch:{ zzcl -> 0x00ae }
    L_0x0090:
        r1 = r12.m10481a(r0);	 Catch:{ zzcl -> 0x00ae }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ zzcl -> 0x00ae }
    L_0x0096:
        r1 = r11.f16947d;	 Catch:{ zzcl -> 0x00ae }
        r1 = r1.getContext();	 Catch:{ zzcl -> 0x00ae }
        r3 = r11.f16947d;	 Catch:{ zzcl -> 0x00ae }
        r3 = r3.getView();	 Catch:{ zzcl -> 0x00ae }
        r4 = r11.f16947d;	 Catch:{ zzcl -> 0x00ae }
        r4 = r4.mo4199d();	 Catch:{ zzcl -> 0x00ae }
        r12 = r12.m10478a(r0, r1, r3, r4);	 Catch:{ zzcl -> 0x00ae }
        r0 = r12;
        goto L_0x00c9;
        r12 = "Unable to append parameter to URL: ";
        r1 = java.lang.String.valueOf(r13);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00c0;
    L_0x00bb:
        r12 = r12.concat(r1);
        goto L_0x00c6;
    L_0x00c0:
        r1 = new java.lang.String;
        r1.<init>(r12);
        r12 = r1;
    L_0x00c6:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
    L_0x00c9:
        r12 = r11.f16966w;
        if (r12 == 0) goto L_0x00dc;
    L_0x00cd:
        r12 = r11.f16966w;
        r12 = r12.zzcz();
        if (r12 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00dc;
    L_0x00d6:
        r12 = r11.f16966w;
        r12.zzu(r13);
        goto L_0x010b;
    L_0x00dc:
        r12 = new com.google.android.gms.ads.internal.overlay.zzc;
        r4 = "android.intent.action.VIEW";
        r5 = r0.toString();
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r3 = r12;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        r11.m21386a(r12);
        goto L_0x010b;
    L_0x00f1:
        r12 = "AdWebView unable to handle URL: ";
        r13 = java.lang.String.valueOf(r13);
        r0 = r13.length();
        if (r0 == 0) goto L_0x0102;
    L_0x00fd:
        r12 = r12.concat(r13);
        goto L_0x0108;
    L_0x0102:
        r13 = new java.lang.String;
        r13.<init>(r12);
        r12 = r13;
    L_0x0108:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
    L_0x010b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzash.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m21381a(str, Collections.emptyMap());
    }

    /* renamed from: a */
    protected final WebResourceResponse m21381a(String str, Map<String, String> map) {
        try {
            String a = zzakg.m9683a(str, this.f16947d.getContext(), this.f16944C);
            if (!a.equals(str)) {
                return m21378b(a, (Map) map);
            }
            zzho a2 = zzho.m26576a(str);
            if (a2 != null) {
                zzhl a3 = zzbv.zzeq().m10672a(a2);
                if (a3 != null && a3.m26572a()) {
                    return new WebResourceResponse("", "", a3.m26573b());
                }
            }
            if (zzaoe.m9991c()) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.aQ)).booleanValue()) {
                    return m21378b(str, (Map) map);
                }
            }
            return null;
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final android.webkit.WebResourceResponse m21378b(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
        r7 = this;
        r0 = new java.net.URL;
        r0.<init>(r8);
        r8 = 0;
        r1 = r0;
        r0 = 0;
    L_0x0008:
        r0 = r0 + 1;
        r2 = 20;
        if (r0 > r2) goto L_0x00ed;
    L_0x000e:
        r2 = r1.openConnection();
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r2.setConnectTimeout(r3);
        r2.setReadTimeout(r3);
        r3 = r9.entrySet();
        r3 = r3.iterator();
    L_0x0022:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x003e;
    L_0x0028:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getKey();
        r5 = (java.lang.String) r5;
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r2.addRequestProperty(r5, r4);
        goto L_0x0022;
    L_0x003e:
        r3 = r2 instanceof java.net.HttpURLConnection;
        if (r3 == 0) goto L_0x00e5;
    L_0x0042:
        r2 = (java.net.HttpURLConnection) r2;
        r3 = com.google.android.gms.ads.internal.zzbv.zzek();
        r4 = r7.f16947d;
        r4 = r4.getContext();
        r5 = r7.f16947d;
        r5 = r5.mo4204i();
        r5 = r5.f19893a;
        r3.m9836a(r4, r5, r8, r2);
        r3 = new com.google.android.gms.internal.ads.zzaoe;
        r3.<init>();
        r4 = 0;
        r3.m9995a(r2, r4);
        r5 = r2.getResponseCode();
        r3.m9994a(r2, r5);
        r3 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r5 < r3) goto L_0x00dd;
    L_0x006d:
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r5 >= r3) goto L_0x00dd;
    L_0x0071:
        r3 = "Location";
        r3 = r2.getHeaderField(r3);
        if (r3 == 0) goto L_0x00d5;
    L_0x0079:
        r5 = new java.net.URL;
        r5.<init>(r1, r3);
        r1 = r5.getProtocol();
        if (r1 != 0) goto L_0x008a;
    L_0x0084:
        r8 = "Protocol is null";
        com.google.android.gms.internal.ads.zzaok.m10007e(r8);
        return r4;
    L_0x008a:
        r6 = "http";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00b5;
    L_0x0092:
        r6 = "https";
        r6 = r1.equals(r6);
        if (r6 != 0) goto L_0x00b5;
    L_0x009a:
        r8 = "Unsupported scheme: ";
        r9 = java.lang.String.valueOf(r1);
        r0 = r9.length();
        if (r0 == 0) goto L_0x00ab;
    L_0x00a6:
        r8 = r8.concat(r9);
        goto L_0x00b1;
    L_0x00ab:
        r9 = new java.lang.String;
        r9.<init>(r8);
        r8 = r9;
    L_0x00b1:
        com.google.android.gms.internal.ads.zzaok.m10007e(r8);
        return r4;
    L_0x00b5:
        r1 = "Redirecting to ";
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x00c6;
    L_0x00c1:
        r1 = r1.concat(r3);
        goto L_0x00cc;
    L_0x00c6:
        r3 = new java.lang.String;
        r3.<init>(r1);
        r1 = r3;
    L_0x00cc:
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
        r2.disconnect();
        r1 = r5;
        goto L_0x0008;
    L_0x00d5:
        r8 = new java.io.IOException;
        r9 = "Missing Location header in redirect";
        r8.<init>(r9);
        throw r8;
    L_0x00dd:
        com.google.android.gms.ads.internal.zzbv.zzek();
        r8 = com.google.android.gms.internal.ads.zzalo.m9778a(r2);
        return r8;
    L_0x00e5:
        r8 = new java.io.IOException;
        r9 = "Invalid protocol.";
        r8.<init>(r9);
        throw r8;
    L_0x00ed:
        r8 = new java.io.IOException;
        r9 = 32;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r9);
        r9 = "Too many redirects (20)";
        r0.append(r9);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzash.b(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public final void m21394a(boolean z) {
        this.f16958o = z;
    }

    /* renamed from: m */
    public final zzajy mo2404m() {
        return this.f16946a;
    }

    /* renamed from: a */
    public final void mo2392a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f16950g) {
            this.f16960q = true;
            this.f16947d.mo4726F();
            this.f16961r = onGlobalLayoutListener;
            this.f16962s = onScrollChangedListener;
        }
    }

    /* renamed from: n */
    public final void mo2405n() {
        synchronized (this.f16950g) {
            this.f16958o = false;
            this.f16959p = true;
            zzapn.f8961a.execute(new go(this));
        }
    }

    /* renamed from: b */
    public final void m21399b(boolean z) {
        this.f16944C = z;
    }

    /* renamed from: a */
    public final void mo2390a(int i, int i2) {
        if (this.f16967x != null) {
            this.f16967x.m21067a(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        webView = keyEvent.getKeyCode();
        if (!(webView == 79 || webView == 222)) {
            switch (webView) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (webView) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return null;
                    }
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m21374a(Uri uri) {
        String path = uri.getPath();
        List<zzu> list = (List) this.f16949f.get(path);
        if (list != null) {
            zzbv.zzek();
            uri = zzalo.m9786a(uri);
            if (zzaok.m10000a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                zzalg.m21225a(path.length() != 0 ? str.concat(path) : new String(str));
                for (String str2 : uri.keySet()) {
                    String str3 = (String) uri.get(str2);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 4) + String.valueOf(str3).length());
                    stringBuilder.append("  ");
                    stringBuilder.append(str2);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    zzalg.m21225a(stringBuilder.toString());
                }
            }
            for (zzu zza : list) {
                zza.zza(this.f16947d, uri);
            }
            return;
        }
        uri = String.valueOf(uri);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(uri).length() + 32);
        stringBuilder2.append("No GMSG handler found for GMSG: ");
        stringBuilder2.append(uri);
        zzalg.m21225a(stringBuilder2.toString());
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f16948e != null) {
            this.f16948e.m10684a(zzhx.zza.zzb.ANDROID_WEBVIEW_CRASH);
        }
        if ((webView.getParent() instanceof ViewGroup) != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return true;
    }

    /* renamed from: o */
    final /* synthetic */ void m21413o() {
        this.f16947d.mo4726F();
        com.google.android.gms.ads.internal.overlay.zzd q = this.f16947d.mo4775q();
        if (q != null) {
            q.zzov();
        }
        if (this.f16957n != null) {
            this.f16957n.mo1711a();
            this.f16957n = null;
        }
    }
}
