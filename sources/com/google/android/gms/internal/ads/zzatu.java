package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.v4.view.C0560r;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
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
import java.io.File;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
@VisibleForTesting
public final class zzatu extends zzaue implements zzatn {
    /* renamed from: A */
    private OnAttachStateChangeListener f16970A;
    /* renamed from: a */
    private zzasg f16971a;
    /* renamed from: b */
    private final zzvp<zzasg> f16972b = new zzvp();
    /* renamed from: c */
    private final Object f16973c = new Object();
    /* renamed from: d */
    private zzjc f16974d;
    /* renamed from: e */
    private zzn f16975e;
    /* renamed from: f */
    private zzato f16976f;
    /* renamed from: g */
    private zzatp f16977g;
    /* renamed from: h */
    private zzb f16978h;
    /* renamed from: i */
    private zzd f16979i;
    /* renamed from: j */
    private zzatq f16980j;
    /* renamed from: k */
    private boolean f16981k = false;
    /* renamed from: l */
    private volatile boolean f16982l;
    @GuardedBy("mLock")
    /* renamed from: m */
    private boolean f16983m;
    @GuardedBy("mLock")
    /* renamed from: n */
    private OnGlobalLayoutListener f16984n;
    @GuardedBy("mLock")
    /* renamed from: o */
    private OnScrollChangedListener f16985o;
    @GuardedBy("mLock")
    /* renamed from: p */
    private boolean f16986p;
    /* renamed from: q */
    private zzt f16987q;
    /* renamed from: r */
    private zzabq f16988r;
    /* renamed from: s */
    private zzw f16989s;
    /* renamed from: t */
    private zzabh f16990t;
    /* renamed from: u */
    private zzatr f16991u;
    /* renamed from: v */
    private zzajy f16992v;
    /* renamed from: w */
    private boolean f16993w;
    /* renamed from: x */
    private boolean f16994x;
    /* renamed from: y */
    private int f16995y;
    /* renamed from: z */
    private boolean f16996z;

    /* renamed from: a */
    final void m21425a(zzasg zzasg, boolean z) {
        zzabq zzabq = new zzabq(zzasg, zzasg.mo4774p(), new zznh(zzasg.getContext()));
        this.f16971a = zzasg;
        this.f16982l = z;
        this.f16988r = zzabq;
        this.f16990t = false;
        this.f16972b.m11156a((Object) zzasg);
    }

    /* renamed from: a */
    public final void mo2391a(int i, int i2, boolean z) {
        this.f16988r.m21074a(i, i2);
        if (this.f16990t != null) {
            this.f16990t.m21068a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void m21432a(String str, zzu<? super zzasg> zzu) {
        this.f16972b.m11157a(str, (zzu) zzu);
    }

    /* renamed from: b */
    public final void m21439b(String str, zzu<? super zzasg> zzu) {
        this.f16972b.m11160b(str, zzu);
    }

    /* renamed from: a */
    public final void m21433a(String str, Predicate<zzu<? super zzasg>> predicate) {
        this.f16972b.m11158a(str, (Predicate) predicate);
    }

    /* renamed from: a */
    public final void mo2397a(zzjc zzjc, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, zzy zzy, zzw zzw, zzabs zzabs, zzajy zzajy) {
        if (zzw == null) {
            zzw = new zzw(this.f16971a.getContext(), zzajy, null);
        }
        this.f16990t = new zzabh(this.f16971a, zzabs);
        this.f16992v = zzajy;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ar)).booleanValue() != null) {
            m21432a("/adMetadata", new zza(zzb));
        }
        m21432a("/appEvent", new zzc(zzd));
        m21432a("/backButton", zzf.zzbpg);
        m21432a("/refresh", zzf.zzbph);
        m21432a("/canOpenURLs", zzf.zzbox);
        m21432a("/canOpenIntents", zzf.zzboy);
        m21432a("/click", zzf.zzboz);
        m21432a("/close", zzf.zzbpa);
        m21432a("/customClose", zzf.zzbpb);
        m21432a("/instrument", zzf.zzbpk);
        m21432a("/delayPageLoaded", zzf.zzbpm);
        m21432a("/delayPageClosed", zzf.zzbpn);
        m21432a("/getLocationInfo", zzf.zzbpo);
        m21432a("/httpTrack", zzf.zzbpc);
        m21432a("/log", zzf.zzbpd);
        m21432a("/mraid", new zzab(zzw, this.f16990t, zzabs));
        m21432a("/mraidLoaded", this.f16988r);
        m21432a("/open", new zzac(zzw, this.f16990t));
        m21432a("/precache", new zzarv());
        m21432a("/touch", zzf.zzbpf);
        m21432a("/video", zzf.zzbpi);
        m21432a("/videoMeta", zzf.zzbpj);
        if (zzbv.zzfj().m9668a(this.f16971a.getContext()) != null) {
            m21432a("/logScionEvent", new zzaa(this.f16971a.getContext()));
        }
        if (zzy != null) {
            m21432a("/setInterstitialProperties", new zzx(zzy));
        }
        this.f16974d = zzjc;
        this.f16975e = zzn;
        this.f16978h = zzb;
        this.f16979i = zzd;
        this.f16987q = zzt;
        this.f16989s = zzw;
        this.f16981k = z;
    }

    /* renamed from: a */
    public final zzw mo2389a() {
        return this.f16989s;
    }

    /* renamed from: b */
    public final boolean mo2398b() {
        return this.f16982l;
    }

    /* renamed from: c */
    public final boolean m21442c() {
        boolean z;
        synchronized (this.f16973c) {
            z = this.f16983m;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener m21444d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f16973c) {
            onGlobalLayoutListener = this.f16984n;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener m21446e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f16973c) {
            onScrollChangedListener = this.f16985o;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo2399f() {
        boolean z;
        synchronized (this.f16973c) {
            z = this.f16986p;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo2176a(zzauf zzauf) {
        this.f16993w = true;
        if (this.f16977g != null) {
            this.f16977g.mo1935a();
            this.f16977g = null;
        }
        m21419q();
    }

    /* renamed from: a */
    private final void m21414a(View view, zzajy zzajy, int i) {
        if (zzajy.mo2324b() && i > 0) {
            zzajy.mo2320a(view);
            if (zzajy.mo2324b()) {
                zzalo.f8872a.postDelayed(new he(this, view, zzajy, i), 100);
            }
        }
    }

    /* renamed from: p */
    private final void m21418p() {
        if (this.f16970A != null) {
            this.f16971a.getView().removeOnAttachStateChangeListener(this.f16970A);
        }
    }

    /* renamed from: g */
    public final void mo2400g() {
        zzajy zzajy = this.f16992v;
        if (zzajy != null) {
            View webView = this.f16971a.getWebView();
            if (C0560r.m2162A(webView)) {
                m21414a(webView, zzajy, 10);
                return;
            }
            m21418p();
            this.f16970A = new hf(this, zzajy);
            this.f16971a.getView().addOnAttachStateChangeListener(this.f16970A);
        }
    }

    /* renamed from: h */
    public final void mo2401h() {
        synchronized (this.f16973c) {
            this.f16986p = true;
        }
        this.f16995y++;
        m21419q();
    }

    /* renamed from: i */
    public final void mo2402i() {
        this.f16995y--;
        m21419q();
    }

    /* renamed from: j */
    public final void mo2403j() {
        this.f16994x = true;
        m21419q();
    }

    /* renamed from: q */
    private final void m21419q() {
        if (this.f16976f != null && ((this.f16993w && this.f16995y <= 0) || this.f16994x)) {
            this.f16976f.mo1722a(this.f16994x ^ 1);
            this.f16976f = null;
        }
        this.f16971a.mo4727G();
    }

    /* renamed from: a */
    public final void m21424a(com.google.android.gms.ads.internal.overlay.zzc zzc) {
        zzn zzn;
        boolean z = this.f16971a.mo4208z();
        zzjc zzjc = (!z || this.f16971a.mo4205s().m10134e()) ? this.f16974d : null;
        if (z) {
            zzn = null;
        } else {
            zzn = this.f16975e;
        }
        m21415a(new AdOverlayInfoParcel(zzc, zzjc, zzn, this.f16987q, this.f16971a.mo4204i()));
    }

    /* renamed from: a */
    public final void m21435a(boolean z, int i) {
        zzjc zzjc = (!this.f16971a.mo4208z() || this.f16971a.mo4205s().m10134e()) ? this.f16974d : null;
        m21415a(new AdOverlayInfoParcel(zzjc, this.f16975e, this.f16987q, this.f16971a, z, i, this.f16971a.mo4204i()));
    }

    /* renamed from: a */
    public final void m21436a(boolean z, int i, String str) {
        zzn zzn;
        boolean z2 = this.f16971a.mo4208z();
        zzjc zzjc = (!z2 || r0.f16971a.mo4205s().m10134e()) ? r0.f16974d : null;
        if (z2) {
            zzn = null;
        } else {
            zzn = new hg(r0.f16971a, r0.f16975e);
        }
        m21415a(new AdOverlayInfoParcel(zzjc, zzn, r0.f16978h, r0.f16979i, r0.f16987q, r0.f16971a, z, i, str, r0.f16971a.mo4204i()));
    }

    /* renamed from: a */
    public final void m21437a(boolean z, int i, String str, String str2) {
        zzn zzn;
        boolean z2 = this.f16971a.mo4208z();
        zzjc zzjc = (!z2 || r0.f16971a.mo4205s().m10134e()) ? r0.f16974d : null;
        if (z2) {
            zzn = null;
        } else {
            zzn = new hg(r0.f16971a, r0.f16975e);
        }
        m21415a(new AdOverlayInfoParcel(zzjc, zzn, r0.f16978h, r0.f16979i, r0.f16987q, r0.f16971a, z, i, str, str2, r0.f16971a.mo4204i()));
    }

    /* renamed from: a */
    private final void m21415a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f16990t != null ? this.f16990t.m21071a() : false;
        zzbv.zzei();
        Context context = this.f16971a.getContext();
        if (!a) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.f16992v != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzcbw != null) {
                str = adOverlayInfoParcel.zzcbw.url;
            }
            this.f16992v.mo2321a(str);
        }
    }

    /* renamed from: k */
    public final void m21452k() {
        if (this.f16992v != null) {
            this.f16992v.mo2326d();
            this.f16992v = null;
        }
        m21418p();
        this.f16972b.m11161c();
        this.f16972b.m11156a(null);
        synchronized (this.f16973c) {
            this.f16974d = null;
            this.f16975e = null;
            this.f16976f = null;
            this.f16977g = null;
            this.f16978h = null;
            this.f16979i = null;
            this.f16987q = null;
            this.f16980j = null;
            if (this.f16990t != null) {
                this.f16990t.m21070a(true);
                this.f16990t = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo2393a(zzato zzato) {
        this.f16976f = zzato;
    }

    /* renamed from: a */
    public final void mo2394a(zzatp zzatp) {
        this.f16977g = zzatp;
    }

    /* renamed from: a */
    public final void mo2395a(zzatq zzatq) {
        this.f16980j = zzatq;
    }

    /* renamed from: a */
    public final void mo2396a(zzatr zzatr) {
        this.f16991u = zzatr;
    }

    /* renamed from: l */
    public final zzatr m21453l() {
        return this.f16991u;
    }

    /* renamed from: b */
    public final void mo2177b(zzauf zzauf) {
        this.f16972b.m11159a(zzauf.f9025b);
    }

    /* renamed from: c */
    public final boolean mo2178c(com.google.android.gms.internal.ads.zzauf r12) {
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
        r1 = r12.f9024a;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 == 0) goto L_0x0013;
    L_0x000e:
        r0 = r0.concat(r1);
        goto L_0x0019;
    L_0x0013:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0019:
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
        r0 = r12.f9025b;
        r1 = r11.f16972b;
        r1 = r1.m11159a(r0);
        r2 = 1;
        if (r1 == 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        r1 = r11.f16981k;
        if (r1 == 0) goto L_0x005f;
    L_0x002c:
        r1 = r0.getScheme();
        r3 = "http";
        r3 = r3.equalsIgnoreCase(r1);
        r4 = 0;
        if (r3 != 0) goto L_0x0044;
    L_0x0039:
        r3 = "https";
        r1 = r3.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0044;
    L_0x0042:
        r1 = 0;
        goto L_0x0045;
    L_0x0044:
        r1 = 1;
    L_0x0045:
        if (r1 == 0) goto L_0x005f;
    L_0x0047:
        r0 = r11.f16974d;
        if (r0 == 0) goto L_0x005e;
    L_0x004b:
        r0 = r11.f16974d;
        r0.onAdClicked();
        r0 = r11.f16992v;
        if (r0 == 0) goto L_0x005b;
    L_0x0054:
        r0 = r11.f16992v;
        r12 = r12.f9024a;
        r0.mo2321a(r12);
    L_0x005b:
        r12 = 0;
        r11.f16974d = r12;
    L_0x005e:
        return r4;
    L_0x005f:
        r1 = r11.f16971a;
        r1 = r1.getWebView();
        r1 = r1.willNotDraw();
        if (r1 != 0) goto L_0x00d8;
    L_0x006b:
        r1 = r11.f16971a;	 Catch:{ zzcl -> 0x0091 }
        r1 = r1.mo4207x();	 Catch:{ zzcl -> 0x0091 }
        if (r1 == 0) goto L_0x00ae;	 Catch:{ zzcl -> 0x0091 }
    L_0x0073:
        r3 = r1.m10481a(r0);	 Catch:{ zzcl -> 0x0091 }
        if (r3 == 0) goto L_0x00ae;	 Catch:{ zzcl -> 0x0091 }
    L_0x0079:
        r3 = r11.f16971a;	 Catch:{ zzcl -> 0x0091 }
        r3 = r3.getContext();	 Catch:{ zzcl -> 0x0091 }
        r4 = r11.f16971a;	 Catch:{ zzcl -> 0x0091 }
        r4 = r4.getView();	 Catch:{ zzcl -> 0x0091 }
        r5 = r11.f16971a;	 Catch:{ zzcl -> 0x0091 }
        r5 = r5.mo4199d();	 Catch:{ zzcl -> 0x0091 }
        r1 = r1.m10478a(r0, r3, r4, r5);	 Catch:{ zzcl -> 0x0091 }
        r0 = r1;
        goto L_0x00ae;
        r1 = "Unable to append parameter to URL: ";
        r3 = r12.f9024a;
        r3 = java.lang.String.valueOf(r3);
        r4 = r3.length();
        if (r4 == 0) goto L_0x00a5;
    L_0x00a0:
        r1 = r1.concat(r3);
        goto L_0x00ab;
    L_0x00a5:
        r3 = new java.lang.String;
        r3.<init>(r1);
        r1 = r3;
    L_0x00ab:
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
    L_0x00ae:
        r1 = r11.f16989s;
        if (r1 == 0) goto L_0x00c3;
    L_0x00b2:
        r1 = r11.f16989s;
        r1 = r1.zzcz();
        if (r1 == 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00c3;
    L_0x00bb:
        r0 = r11.f16989s;
        r12 = r12.f9024a;
        r0.zzu(r12);
        goto L_0x00f3;
    L_0x00c3:
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
        r11.m21424a(r12);
        goto L_0x00f3;
    L_0x00d8:
        r0 = "AdWebView unable to handle URL: ";
        r12 = r12.f9024a;
        r12 = java.lang.String.valueOf(r12);
        r1 = r12.length();
        if (r1 == 0) goto L_0x00eb;
    L_0x00e6:
        r12 = r0.concat(r12);
        goto L_0x00f0;
    L_0x00eb:
        r12 = new java.lang.String;
        r12.<init>(r0);
    L_0x00f0:
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);
    L_0x00f3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatu.c(com.google.android.gms.internal.ads.zzauf):boolean");
    }

    /* renamed from: d */
    public final WebResourceResponse mo2406d(zzauf zzauf) {
        WebResourceResponse c;
        if (this.f16992v != null) {
            this.f16992v.mo2322a(zzauf.f9024a, zzauf.f9026c, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzauf.f9024a).getName())) {
            String str;
            mo2405n();
            if (this.f16971a.mo4205s().m10134e()) {
                str = (String) zzkd.m10713e().m10897a(zznw.f9682G);
            } else if (this.f16971a.mo4208z()) {
                str = (String) zzkd.m10713e().m10897a(zznw.f9681F);
            } else {
                str = (String) zzkd.m10713e().m10897a(zznw.f9680E);
            }
            zzbv.zzek();
            c = zzalo.m9809c(this.f16971a.getContext(), this.f16971a.mo4204i().f19893a, str);
        } else {
            c = null;
        }
        if (c != null) {
            return c;
        }
        try {
            if (!zzakg.m9683a(zzauf.f9024a, this.f16971a.getContext(), this.f16996z).equals(zzauf.f9024a)) {
                return m21417e(zzauf);
            }
            zzho a = zzho.m26576a(zzauf.f9024a);
            if (a != null) {
                zzhl a2 = zzbv.zzeq().m10672a(a);
                if (a2 != null && a2.m26572a()) {
                    return new WebResourceResponse("", "", a2.m26573b());
                }
            }
            if (zzaoe.m9991c()) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.aQ)).booleanValue()) {
                    return m21417e(zzauf);
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
    /* renamed from: e */
    private final android.webkit.WebResourceResponse m21417e(com.google.android.gms.internal.ads.zzauf r9) {
        /*
        r8 = this;
        r0 = new java.net.URL;
        r1 = r9.f9024a;
        r0.<init>(r1);
        r1 = 0;
        r2 = r0;
        r0 = 0;
    L_0x000a:
        r0 = r0 + 1;
        r3 = 20;
        if (r0 > r3) goto L_0x00f1;
    L_0x0010:
        r3 = r2.openConnection();
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r3.setConnectTimeout(r4);
        r3.setReadTimeout(r4);
        r4 = r9.f9026c;
        r4 = r4.entrySet();
        r4 = r4.iterator();
    L_0x0026:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0042;
    L_0x002c:
        r5 = r4.next();
        r5 = (java.util.Map.Entry) r5;
        r6 = r5.getKey();
        r6 = (java.lang.String) r6;
        r5 = r5.getValue();
        r5 = (java.lang.String) r5;
        r3.addRequestProperty(r6, r5);
        goto L_0x0026;
    L_0x0042:
        r4 = r3 instanceof java.net.HttpURLConnection;
        if (r4 == 0) goto L_0x00e9;
    L_0x0046:
        r3 = (java.net.HttpURLConnection) r3;
        r4 = com.google.android.gms.ads.internal.zzbv.zzek();
        r5 = r8.f16971a;
        r5 = r5.getContext();
        r6 = r8.f16971a;
        r6 = r6.mo4204i();
        r6 = r6.f19893a;
        r4.m9836a(r5, r6, r1, r3);
        r4 = new com.google.android.gms.internal.ads.zzaoe;
        r4.<init>();
        r5 = 0;
        r4.m9995a(r3, r5);
        r6 = r3.getResponseCode();
        r4.m9994a(r3, r6);
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r6 < r4) goto L_0x00e1;
    L_0x0071:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r6 >= r4) goto L_0x00e1;
    L_0x0075:
        r4 = "Location";
        r4 = r3.getHeaderField(r4);
        if (r4 == 0) goto L_0x00d9;
    L_0x007d:
        r6 = new java.net.URL;
        r6.<init>(r2, r4);
        r2 = r6.getProtocol();
        if (r2 != 0) goto L_0x008e;
    L_0x0088:
        r9 = "Protocol is null";
        com.google.android.gms.internal.ads.zzaok.m10007e(r9);
        return r5;
    L_0x008e:
        r7 = "http";
        r7 = r2.equals(r7);
        if (r7 != 0) goto L_0x00b9;
    L_0x0096:
        r7 = "https";
        r7 = r2.equals(r7);
        if (r7 != 0) goto L_0x00b9;
    L_0x009e:
        r9 = "Unsupported scheme: ";
        r0 = java.lang.String.valueOf(r2);
        r1 = r0.length();
        if (r1 == 0) goto L_0x00af;
    L_0x00aa:
        r9 = r9.concat(r0);
        goto L_0x00b5;
    L_0x00af:
        r0 = new java.lang.String;
        r0.<init>(r9);
        r9 = r0;
    L_0x00b5:
        com.google.android.gms.internal.ads.zzaok.m10007e(r9);
        return r5;
    L_0x00b9:
        r2 = "Redirecting to ";
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 == 0) goto L_0x00ca;
    L_0x00c5:
        r2 = r2.concat(r4);
        goto L_0x00d0;
    L_0x00ca:
        r4 = new java.lang.String;
        r4.<init>(r2);
        r2 = r4;
    L_0x00d0:
        com.google.android.gms.internal.ads.zzaok.m10001b(r2);
        r3.disconnect();
        r2 = r6;
        goto L_0x000a;
    L_0x00d9:
        r9 = new java.io.IOException;
        r0 = "Missing Location header in redirect";
        r9.<init>(r0);
        throw r9;
    L_0x00e1:
        com.google.android.gms.ads.internal.zzbv.zzek();
        r9 = com.google.android.gms.internal.ads.zzalo.m9778a(r3);
        return r9;
    L_0x00e9:
        r9 = new java.io.IOException;
        r0 = "Invalid protocol.";
        r9.<init>(r0);
        throw r9;
    L_0x00f1:
        r9 = new java.io.IOException;
        r0 = 32;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Too many redirects (20)";
        r1.append(r0);
        r0 = r1.toString();
        r9.<init>(r0);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatu.e(com.google.android.gms.internal.ads.zzauf):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public final void m21434a(boolean z) {
        this.f16981k = z;
    }

    /* renamed from: m */
    public final zzajy mo2404m() {
        return this.f16992v;
    }

    /* renamed from: a */
    public final void mo2392a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f16973c) {
            this.f16983m = true;
            this.f16971a.mo4726F();
            this.f16984n = onGlobalLayoutListener;
            this.f16985o = onScrollChangedListener;
        }
    }

    /* renamed from: n */
    public final void mo2405n() {
        synchronized (this.f16973c) {
            this.f16981k = false;
            this.f16982l = true;
            zzapn.f8961a.execute(new hd(this));
        }
    }

    /* renamed from: b */
    public final void m21440b(boolean z) {
        this.f16996z = z;
    }

    /* renamed from: a */
    public final void mo2390a(int i, int i2) {
        if (this.f16990t != null) {
            this.f16990t.m21067a(i, i2);
        }
    }

    /* renamed from: o */
    final /* synthetic */ void m21456o() {
        this.f16971a.mo4726F();
        com.google.android.gms.ads.internal.overlay.zzd q = this.f16971a.mo4775q();
        if (q != null) {
            q.zzov();
        }
        if (this.f16980j != null) {
            this.f16980j.mo1711a();
            this.f16980j = null;
        }
    }
}
