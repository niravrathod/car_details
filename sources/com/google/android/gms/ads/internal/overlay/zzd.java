package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabr;
import com.google.android.gms.internal.ads.zzabx;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzatn;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.Collections;

@zzaer
public class zzd extends zzabx implements zzw {
    @VisibleForTesting
    /* renamed from: e */
    private static final int f19505e = Color.argb(0, 0, 0, 0);
    /* renamed from: a */
    protected final Activity f19506a;
    @VisibleForTesting
    /* renamed from: b */
    AdOverlayInfoParcel f19507b;
    @VisibleForTesting
    /* renamed from: c */
    zzasg f19508c;
    @VisibleForTesting
    /* renamed from: d */
    int f19509d = 0;
    @VisibleForTesting
    /* renamed from: f */
    private zzi f19510f;
    @VisibleForTesting
    /* renamed from: g */
    private zzo f19511g;
    @VisibleForTesting
    /* renamed from: h */
    private boolean f19512h = false;
    @VisibleForTesting
    /* renamed from: i */
    private FrameLayout f19513i;
    @VisibleForTesting
    /* renamed from: j */
    private CustomViewCallback f19514j;
    @VisibleForTesting
    /* renamed from: k */
    private boolean f19515k = false;
    @VisibleForTesting
    /* renamed from: l */
    private boolean f19516l = false;
    @VisibleForTesting
    /* renamed from: m */
    private C2409c f19517m;
    @VisibleForTesting
    /* renamed from: n */
    private boolean f19518n = false;
    /* renamed from: o */
    private final Object f19519o = new Object();
    /* renamed from: p */
    private Runnable f19520p;
    /* renamed from: q */
    private boolean f19521q;
    /* renamed from: r */
    private boolean f19522r;
    /* renamed from: s */
    private boolean f19523s = false;
    /* renamed from: t */
    private boolean f19524t = false;
    /* renamed from: u */
    private boolean f19525u = true;

    public zzd(Activity activity) {
        this.f19506a = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onRestart() {
    }

    public final void close() {
        this.f19509d = 2;
        this.f19506a.finish();
    }

    public final void zzos() {
        if (this.f19507b != null && this.f19512h) {
            setRequestedOrientation(this.f19507b.orientation);
        }
        if (this.f19513i != null) {
            this.f19506a.setContentView(this.f19517m);
            this.f19522r = true;
            this.f19513i.removeAllViews();
            this.f19513i = null;
        }
        if (this.f19514j != null) {
            this.f19514j.onCustomViewHidden();
            this.f19514j = null;
        }
        this.f19512h = false;
    }

    public final void zzot() {
        this.f19509d = 1;
        this.f19506a.finish();
    }

    public final void onBackPressed() {
        this.f19509d = 0;
    }

    public final boolean zzou() {
        this.f19509d = 0;
        if (this.f19508c == null) {
            return true;
        }
        boolean C = this.f19508c.mo4723C();
        if (!C) {
            this.f19508c.mo4743a("onbackblocked", Collections.emptyMap());
        }
        return C;
    }

    public void onCreate(Bundle bundle) {
        this.f19506a.requestWindowFeature(1);
        this.f19515k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f19507b = AdOverlayInfoParcel.zzc(this.f19506a.getIntent());
            if (this.f19507b != null) {
                if (this.f19507b.zzadg.f19895c > GmsVersion.VERSION_QUESO) {
                    this.f19509d = 3;
                }
                if (this.f19506a.getIntent() != null) {
                    this.f19525u = this.f19506a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f19507b.zzcch != null) {
                    this.f19516l = this.f19507b.zzcch.zzzr;
                } else {
                    this.f19516l = false;
                }
                if (this.f19516l && this.f19507b.zzcch.zzzw != -1) {
                    new C4699d().m21224h();
                }
                if (bundle == null) {
                    if (!(this.f19507b.zzcby == null || this.f19525u == null)) {
                        this.f19507b.zzcby.zzcb();
                    }
                    if (!(this.f19507b.zzccf == 1 || this.f19507b.zzcbx == null)) {
                        this.f19507b.zzcbx.onAdClicked();
                    }
                }
                this.f19517m = new C2409c(this.f19506a, this.f19507b.zzccg, this.f19507b.zzadg.f19893a);
                this.f19517m.setId(1000);
                switch (this.f19507b.zzccf) {
                    case 1:
                        m25932b(false);
                        return;
                    case 2:
                        this.f19510f = new zzi(this.f19507b.zzcbz);
                        m25932b(false);
                        return;
                    case 3:
                        m25932b(true);
                        return;
                    default:
                        throw new zzg("Could not determine ad overlay type.");
                }
            }
            throw new zzg("Could not get info for ad overlay.");
        } catch (Bundle bundle2) {
            zzaok.m10007e(bundle2.getMessage());
            this.f19509d = 3;
            this.f19506a.finish();
        }
    }

    public final void onStart() {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cn)).booleanValue()) {
            if (this.f19508c == null || this.f19508c.mo4721A()) {
                zzaok.m10007e("The webview does not exist. Ignoring action.");
            } else {
                zzbv.zzem();
                zzalw.m9851b(this.f19508c);
            }
        }
    }

    public final void onResume() {
        if (this.f19507b.zzcby != null) {
            this.f19507b.zzcby.onResume();
        }
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.cn)).booleanValue()) {
            if (this.f19508c == null || this.f19508c.mo4721A()) {
                zzaok.m10007e("The webview does not exist. Ignoring action.");
            } else {
                zzbv.zzem();
                zzalw.m9851b(this.f19508c);
            }
        }
    }

    public final void onPause() {
        zzos();
        if (this.f19507b.zzcby != null) {
            this.f19507b.zzcby.onPause();
        }
        if (!(((Boolean) zzkd.m10713e().m10897a(zznw.cn)).booleanValue() || this.f19508c == null || (this.f19506a.isFinishing() && this.f19510f != null))) {
            zzbv.zzem();
            zzalw.m9850a(this.f19508c);
        }
        m25931b();
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cm)).booleanValue() && PlatformVersion.isAtLeastN()) {
            Configuration configuration = (Configuration) ObjectWrapper.m26020a(iObjectWrapper);
            zzbv.zzek();
            if (zzalo.m9798a(this.f19506a, configuration) != null) {
                this.f19506a.getWindow().addFlags(1024);
                this.f19506a.getWindow().clearFlags(2048);
                return;
            }
            this.f19506a.getWindow().addFlags(2048);
            this.f19506a.getWindow().clearFlags(1024);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f19515k);
    }

    public final void onStop() {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cn)).booleanValue() && this.f19508c != null && (!this.f19506a.isFinishing() || this.f19510f == null)) {
            zzbv.zzem();
            zzalw.m9850a(this.f19508c);
        }
        m25931b();
    }

    public final void onDestroy() {
        if (this.f19508c != null) {
            this.f19517m.removeView(this.f19508c.getView());
        }
        m25931b();
    }

    /* renamed from: a */
    private final void m25930a(boolean z) {
        int intValue = ((Integer) zzkd.m10713e().m10897a(zznw.cp)).intValue();
        C2411f c2411f = new C2411f();
        c2411f.f7710e = 50;
        c2411f.f7706a = z ? intValue : 0;
        c2411f.f7707b = z ? 0 : intValue;
        c2411f.f7708c = 0;
        c2411f.f7709d = intValue;
        this.f19511g = new zzo(this.f19506a, c2411f, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.f19507b.zzccc);
        this.f19517m.addView(this.f19511g, layoutParams);
    }

    public final void zzax() {
        this.f19522r = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = true;
        Object obj = (!((Boolean) zzkd.m10713e().m10897a(zznw.az)).booleanValue() || this.f19507b == null || this.f19507b.zzcch == null || !this.f19507b.zzcch.zzzy) ? null : 1;
        Object obj2 = (!((Boolean) zzkd.m10713e().m10897a(zznw.aA)).booleanValue() || this.f19507b == null || this.f19507b.zzcch == null || !this.f19507b.zzcch.zzzz) ? null : 1;
        if (z && z2 && obj != null && obj2 == null) {
            new zzabr(this.f19508c, "useCustomClose").m9445a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f19511g) {
            z = this.f19511g;
            if (obj2 == null) {
                if (!z2 || obj != null) {
                    z3 = false;
                }
            }
            z.zzu(z3);
        }
    }

    public final void zzov() {
        this.f19517m.removeView(this.f19511g);
        m25930a(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.f19506a.getApplicationInfo().targetSdkVersion >= ((Integer) zzkd.m10713e().m10897a(zznw.cG)).intValue()) {
            if (this.f19506a.getApplicationInfo().targetSdkVersion <= ((Integer) zzkd.m10713e().m10897a(zznw.cH)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) zzkd.m10713e().m10897a(zznw.cI)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) zzkd.m10713e().m10897a(zznw.cJ)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f19506a.setRequestedOrientation(i);
    }

    public final void zza(View view, CustomViewCallback customViewCallback) {
        this.f19513i = new FrameLayout(this.f19506a);
        this.f19513i.setBackgroundColor(-16777216);
        this.f19513i.addView(view, -1, -1);
        this.f19506a.setContentView(this.f19513i);
        this.f19522r = true;
        this.f19514j = customViewCallback;
        this.f19512h = true;
    }

    /* renamed from: b */
    private final void m25932b(boolean z) {
        if (!this.f19522r) {
            r1.f19506a.requestWindowFeature(1);
        }
        Window window = r1.f19506a.getWindow();
        if (window != null) {
            boolean a;
            boolean z2;
            Object obj;
            zzw zzw;
            zzatn u;
            StringBuilder stringBuilder;
            zzatn u2;
            zzb zzb;
            com.google.android.gms.ads.internal.gmsg.zzd zzd;
            zzt zzt;
            ViewParent parent;
            if (PlatformVersion.isAtLeastN()) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.cm)).booleanValue()) {
                    zzbv.zzek();
                    a = zzalo.m9798a(r1.f19506a, r1.f19506a.getResources().getConfiguration());
                    z2 = false;
                    obj = (r1.f19507b.zzcch == null && r1.f19507b.zzcch.zzzs) ? 1 : null;
                    if (!(r1.f19516l && obj == null) && r4) {
                        window.setFlags(1024, 1024);
                        if (PlatformVersion.isAtLeastKitKat() && r1.f19507b.zzcch != null && r1.f19507b.zzcch.zzzx) {
                            window.getDecorView().setSystemUiVisibility(4098);
                        }
                    }
                    zzw = null;
                    u = r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4782u() : null;
                    a = u == null ? u.mo2398b() : false;
                    r1.f19518n = false;
                    if (a) {
                        if (r1.f19507b.orientation == zzbv.zzem().mo2363a()) {
                            if (r1.f19506a.getResources().getConfiguration().orientation == 1) {
                                z2 = true;
                            }
                            r1.f19518n = z2;
                        } else if (r1.f19507b.orientation == zzbv.zzem().mo2365b()) {
                            if (r1.f19506a.getResources().getConfiguration().orientation == 2) {
                                z2 = true;
                            }
                            r1.f19518n = z2;
                        }
                    }
                    z2 = r1.f19518n;
                    stringBuilder = new StringBuilder(46);
                    stringBuilder.append("Delay onShow to next orientation change: ");
                    stringBuilder.append(z2);
                    zzaok.m10001b(stringBuilder.toString());
                    setRequestedOrientation(r1.f19507b.orientation);
                    if (zzbv.zzem().mo4179a(window)) {
                        zzaok.m10001b("Hardware acceleration on the AdActivity window enabled.");
                    }
                    if (r1.f19516l) {
                        r1.f19517m.setBackgroundColor(-16777216);
                    } else {
                        r1.f19517m.setBackgroundColor(f19505e);
                    }
                    r1.f19506a.setContentView(r1.f19517m);
                    r1.f19522r = true;
                    if (z) {
                        r1.f19508c = r1.f19507b.zzcbz;
                        r1.f19508c.mo4733a(r1.f19506a);
                    } else {
                        try {
                            zzbv.zzel();
                            r1.f19508c = zzasm.m10092a(r1.f19506a, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4205s() : null, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4781t() : null, true, a, null, r1.f19507b.zzadg, null, null, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4200e() : null, zzhv.m10677a());
                            u2 = r1.f19508c.mo4782u();
                            zzb = r1.f19507b.zzcci;
                            zzd = r1.f19507b.zzcca;
                            zzt = r1.f19507b.zzcce;
                            if (r1.f19507b.zzcbz != null) {
                                zzw = r1.f19507b.zzcbz.mo4782u().mo2389a();
                            }
                            u2.mo2397a(null, zzb, null, zzd, zzt, true, null, zzw, null, null);
                            r1.f19508c.mo4782u().mo2393a(new C4081a(r1));
                            if (r1.f19507b.url != null) {
                                r1.f19508c.loadUrl(r1.f19507b.url);
                            } else if (r1.f19507b.zzccd == null) {
                                r1.f19508c.loadDataWithBaseURL(r1.f19507b.zzccb, r1.f19507b.zzccd, "text/html", "UTF-8", null);
                            } else {
                                throw new zzg("No URL or HTML to display in ad overlay.");
                            }
                            if (r1.f19507b.zzcbz != null) {
                                r1.f19507b.zzcbz.mo4748b(r1);
                            }
                        } catch (Throwable e) {
                            zzaok.m10002b("Error obtaining webview.", e);
                            throw new zzg("Could not obtain webview for the overlay.");
                        }
                    }
                    r1.f19508c.mo4735a(r1);
                    if (r1.f19507b.zzcbz != null) {
                        m25929a(r1.f19507b.zzcbz.mo4785y(), r1.f19517m);
                    }
                    parent = r1.f19508c.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(r1.f19508c.getView());
                    }
                    if (r1.f19516l) {
                        r1.f19508c.mo4729I();
                    }
                    r1.f19517m.addView(r1.f19508c.getView(), -1, -1);
                    if (!(z || r1.f19518n)) {
                        m25933c();
                    }
                    m25930a(a);
                    if (r1.f19508c.mo4784w()) {
                        zza(a, true);
                        return;
                    }
                    return;
                }
            }
            a = true;
            z2 = false;
            if (r1.f19507b.zzcch == null) {
            }
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4098);
            zzw = null;
            if (r1.f19507b.zzcbz == null) {
            }
            if (u == null) {
            }
            r1.f19518n = false;
            if (a) {
                if (r1.f19507b.orientation == zzbv.zzem().mo2363a()) {
                    if (r1.f19506a.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    r1.f19518n = z2;
                } else if (r1.f19507b.orientation == zzbv.zzem().mo2365b()) {
                    if (r1.f19506a.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    r1.f19518n = z2;
                }
            }
            z2 = r1.f19518n;
            stringBuilder = new StringBuilder(46);
            stringBuilder.append("Delay onShow to next orientation change: ");
            stringBuilder.append(z2);
            zzaok.m10001b(stringBuilder.toString());
            setRequestedOrientation(r1.f19507b.orientation);
            if (zzbv.zzem().mo4179a(window)) {
                zzaok.m10001b("Hardware acceleration on the AdActivity window enabled.");
            }
            if (r1.f19516l) {
                r1.f19517m.setBackgroundColor(f19505e);
            } else {
                r1.f19517m.setBackgroundColor(-16777216);
            }
            r1.f19506a.setContentView(r1.f19517m);
            r1.f19522r = true;
            if (z) {
                r1.f19508c = r1.f19507b.zzcbz;
                r1.f19508c.mo4733a(r1.f19506a);
            } else {
                zzbv.zzel();
                if (r1.f19507b.zzcbz == null) {
                }
                if (r1.f19507b.zzcbz == null) {
                }
                if (r1.f19507b.zzcbz == null) {
                }
                r1.f19508c = zzasm.m10092a(r1.f19506a, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4205s() : null, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4781t() : null, true, a, null, r1.f19507b.zzadg, null, null, r1.f19507b.zzcbz == null ? r1.f19507b.zzcbz.mo4200e() : null, zzhv.m10677a());
                u2 = r1.f19508c.mo4782u();
                zzb = r1.f19507b.zzcci;
                zzd = r1.f19507b.zzcca;
                zzt = r1.f19507b.zzcce;
                if (r1.f19507b.zzcbz != null) {
                    zzw = r1.f19507b.zzcbz.mo4782u().mo2389a();
                }
                u2.mo2397a(null, zzb, null, zzd, zzt, true, null, zzw, null, null);
                r1.f19508c.mo4782u().mo2393a(new C4081a(r1));
                if (r1.f19507b.url != null) {
                    r1.f19508c.loadUrl(r1.f19507b.url);
                } else if (r1.f19507b.zzccd == null) {
                    throw new zzg("No URL or HTML to display in ad overlay.");
                } else {
                    r1.f19508c.loadDataWithBaseURL(r1.f19507b.zzccb, r1.f19507b.zzccd, "text/html", "UTF-8", null);
                }
                if (r1.f19507b.zzcbz != null) {
                    r1.f19507b.zzcbz.mo4748b(r1);
                }
            }
            r1.f19508c.mo4735a(r1);
            if (r1.f19507b.zzcbz != null) {
                m25929a(r1.f19507b.zzcbz.mo4785y(), r1.f19517m);
            }
            parent = r1.f19508c.getParent();
            ((ViewGroup) parent).removeView(r1.f19508c.getView());
            if (r1.f19516l) {
                r1.f19508c.mo4729I();
            }
            r1.f19517m.addView(r1.f19508c.getView(), -1, -1);
            m25933c();
            m25930a(a);
            if (r1.f19508c.mo4784w()) {
                zza(a, true);
                return;
            }
            return;
        }
        throw new zzg("Invalid activity, no window available.");
    }

    /* renamed from: b */
    private final void m25931b() {
        if (this.f19506a.isFinishing()) {
            if (!this.f19523s) {
                this.f19523s = true;
                if (this.f19508c != null) {
                    this.f19508c.mo4732a(this.f19509d);
                    synchronized (this.f19519o) {
                        if (this.f19521q || !this.f19508c.mo4725E()) {
                        } else {
                            this.f19520p = new C2408b(this);
                            zzalo.f8872a.postDelayed(this.f19520p, ((Long) zzkd.m10713e().m10897a(zznw.ay)).longValue());
                            return;
                        }
                    }
                }
                m25934a();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m25934a() {
        if (!this.f19524t) {
            this.f19524t = true;
            if (this.f19508c != null) {
                this.f19517m.removeView(this.f19508c.getView());
                if (this.f19510f != null) {
                    this.f19508c.mo4733a(this.f19510f.zzrx);
                    this.f19508c.mo4751b(false);
                    this.f19510f.parent.addView(this.f19508c.getView(), this.f19510f.index, this.f19510f.zzcbt);
                    this.f19510f = null;
                } else if (this.f19506a.getApplicationContext() != null) {
                    this.f19508c.mo4733a(this.f19506a.getApplicationContext());
                }
                this.f19508c = null;
            }
            if (!(this.f19507b == null || this.f19507b.zzcby == null)) {
                this.f19507b.zzcby.zzca();
            }
            if (!(this.f19507b == null || this.f19507b.zzcbz == null)) {
                m25929a(this.f19507b.zzcbz.mo4785y(), this.f19507b.zzcbz.getView());
            }
        }
    }

    /* renamed from: a */
    private static void m25929a(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper != null && view != null) {
            zzbv.zzfb().m9453a(iObjectWrapper, view);
        }
    }

    public final void zzoy() {
        if (this.f19518n) {
            this.f19518n = false;
            m25933c();
        }
    }

    /* renamed from: c */
    private final void m25933c() {
        this.f19508c.mo4770n();
    }

    public final void zzpa() {
        this.f19517m.f7702a = true;
    }

    public final void zzpb() {
        synchronized (this.f19519o) {
            this.f19521q = true;
            if (this.f19520p != null) {
                zzalo.f8872a.removeCallbacks(this.f19520p);
                zzalo.f8872a.post(this.f19520p);
            }
        }
    }
}
