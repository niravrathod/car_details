package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
@VisibleForTesting
final class hi extends zzaug implements OnGlobalLayoutListener, DownloadListener, zzasg, zzvl {
    /* renamed from: A */
    private WeakReference<OnClickListener> f21313A;
    @GuardedBy("this")
    /* renamed from: B */
    private zzd f21314B;
    /* renamed from: C */
    private zzanz f21315C;
    /* renamed from: D */
    private final AtomicReference<IObjectWrapper> f21316D = new AtomicReference();
    /* renamed from: E */
    private int f21317E = -1;
    /* renamed from: F */
    private int f21318F = -1;
    /* renamed from: G */
    private int f21319G = -1;
    /* renamed from: H */
    private int f21320H = -1;
    /* renamed from: I */
    private float f21321I;
    /* renamed from: J */
    private Map<String, zzarr> f21322J;
    /* renamed from: K */
    private final WindowManager f21323K;
    /* renamed from: a */
    private final zzats f21324a;
    /* renamed from: b */
    private final zzatu f21325b;
    /* renamed from: c */
    private final zzck f21326c;
    /* renamed from: d */
    private final zzaop f21327d;
    /* renamed from: e */
    private final zzbo f21328e;
    /* renamed from: f */
    private final zzv f21329f;
    @GuardedBy("this")
    /* renamed from: g */
    private zzd f21330g;
    @GuardedBy("this")
    /* renamed from: h */
    private zzatt f21331h;
    @GuardedBy("this")
    /* renamed from: i */
    private String f21332i;
    @GuardedBy("this")
    /* renamed from: j */
    private boolean f21333j;
    @GuardedBy("this")
    /* renamed from: k */
    private boolean f21334k;
    @GuardedBy("this")
    /* renamed from: l */
    private boolean f21335l;
    @GuardedBy("this")
    /* renamed from: m */
    private int f21336m;
    @GuardedBy("this")
    /* renamed from: n */
    private boolean f21337n = true;
    @GuardedBy("this")
    /* renamed from: o */
    private boolean f21338o = false;
    @GuardedBy("this")
    /* renamed from: p */
    private String f21339p = "";
    @GuardedBy("this")
    /* renamed from: q */
    private zzasw f21340q;
    @GuardedBy("this")
    /* renamed from: r */
    private boolean f21341r;
    @GuardedBy("this")
    /* renamed from: s */
    private boolean f21342s;
    @GuardedBy("this")
    /* renamed from: t */
    private zzpk f21343t;
    @GuardedBy("this")
    /* renamed from: u */
    private int f21344u;
    @GuardedBy("this")
    /* renamed from: v */
    private int f21345v;
    /* renamed from: w */
    private zzoh f21346w;
    /* renamed from: x */
    private zzoh f21347x;
    /* renamed from: y */
    private zzoh f21348y;
    /* renamed from: z */
    private zzoi f21349z;

    @VisibleForTesting
    protected hi(zzats zzats, zzatu zzatu, zzatt zzatt, String str, boolean z, boolean z2, zzck zzck, zzaop zzaop, zzoj zzoj, zzbo zzbo, zzv zzv) {
        super(zzats, zzatu);
        this.f21324a = zzats;
        this.f21325b = zzatu;
        this.f21331h = zzatt;
        this.f21332i = str;
        this.f21334k = z;
        this.f21336m = -1;
        this.f21326c = zzck;
        this.f21327d = zzaop;
        this.f21328e = zzbo;
        this.f21329f = zzv;
        this.f21323K = (WindowManager) getContext().getSystemService("window");
        this.f21315C = new zzanz(this.f21324a.m10126a(), this, this, null);
        zzbv.zzek().m9834a((Context) zzats, zzaop.f19893a, getSettings());
        setDownloadListener(this);
        this.f21321I = zzats.getResources().getDisplayMetrics().density;
        m28178N();
        if (PlatformVersion.isAtLeastJellyBeanMR1() != null) {
            addJavascriptInterface(zzasz.m10093a(this), "googleAdsJsInterface");
        }
        m28182R();
        this.f21349z = new zzoi(new zzoj(true, "make_wv", this.f21332i));
        this.f21349z.m10922a().m10927a(zzoj);
        this.f21347x = zzoc.m10916a(this.f21349z.m10922a());
        this.f21349z.m10923a("native:view_create", this.f21347x);
        this.f21348y = null;
        this.f21346w = null;
        zzbv.zzem().mo4993b((Context) zzats);
    }

    /* renamed from: B */
    public final void mo4722B() {
    }

    /* renamed from: a */
    public final zzaqx mo4731a() {
        return null;
    }

    /* renamed from: a */
    public final void mo4786a(String str, String str2) {
        zzvm.m11149a((zzvl) this, str, str2);
    }

    /* renamed from: a */
    public final void mo4743a(String str, Map map) {
        zzvm.m11150a((zzvl) this, str, map);
    }

    /* renamed from: a */
    public final void mo2748a(String str, JSONObject jSONObject) {
        zzvm.m11152b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo4750b(String str, JSONObject jSONObject) {
        zzvm.m11151a((zzvl) this, str, jSONObject);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: e */
    public final zzv mo4200e() {
        return this.f21329f;
    }

    /* renamed from: L */
    private final boolean m28176L() {
        boolean z = false;
        if (!this.f21325b.mo2398b() && !this.f21325b.m21442c()) {
            return false;
        }
        int b;
        int b2;
        zzbv.zzek();
        DisplayMetrics a = zzalo.m9777a(this.f21323K);
        zzkd.m10709a();
        int b3 = zzaoa.m9963b(a, a.widthPixels);
        zzkd.m10709a();
        int b4 = zzaoa.m9963b(a, a.heightPixels);
        Activity a2 = this.f21324a.m10126a();
        if (a2 != null) {
            if (a2.getWindow() != null) {
                zzbv.zzek();
                int[] a3 = zzalo.m9802a(a2);
                zzkd.m10709a();
                b = zzaoa.m9963b(a, a3[0]);
                zzkd.m10709a();
                b2 = zzaoa.m9963b(a, a3[1]);
                if (this.f21318F != b3 && this.f21317E == b4 && this.f21319G == b && this.f21320H == b2) {
                    return false;
                }
                if (!(this.f21318F == b3 && this.f21317E == b4)) {
                    z = true;
                }
                this.f21318F = b3;
                this.f21317E = b4;
                this.f21319G = b;
                this.f21320H = b2;
                new zzabr(this).m9444a(b3, b4, b, b2, a.density, this.f21323K.getDefaultDisplay().getRotation());
                return z;
            }
        }
        b = b3;
        b2 = b4;
        if (this.f21318F != b3) {
        }
        z = true;
        this.f21318F = b3;
        this.f21317E = b4;
        this.f21319G = b;
        this.f21320H = b2;
        new zzabr(this).m9444a(b3, b4, b, b2, a.density, this.f21323K.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo4742a(String str, String str2, String str3) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.an)).booleanValue()) {
            str2 = zzati.m10101a(str2, zzati.m10100a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: b */
    public final synchronized void mo2749b(String str) {
        if (m21458A()) {
            zzaok.m10007e("The webview is destroyed. Ignoring action.");
        } else {
            super.mo2409b(str);
        }
    }

    /* renamed from: m */
    public final void mo4769m() {
        m28177M();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f21327d.f19893a);
        zzvm.m11150a((zzvl) this, "onhide", hashMap);
    }

    /* renamed from: a */
    public final void mo4732a(int i) {
        if (i == 0) {
            zzoc.m10917a(this.f21349z.m10922a(), this.f21347x, "aebb2");
        }
        m28177M();
        if (this.f21349z.m10922a() != null) {
            this.f21349z.m10922a().m10929a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f21327d.f19893a);
        zzvm.m11150a((zzvl) this, "onhide", hashMap);
    }

    /* renamed from: M */
    private final void m28177M() {
        zzoc.m10917a(this.f21349z.m10922a(), this.f21347x, "aeh2");
    }

    /* renamed from: n */
    public final void mo4770n() {
        if (this.f21346w == null) {
            zzoc.m10917a(this.f21349z.m10922a(), this.f21347x, "aes2");
            this.f21346w = zzoc.m10916a(this.f21349z.m10922a());
            this.f21349z.m10923a("native:view_show", this.f21346w);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f21327d.f19893a);
        zzvm.m11150a((zzvl) this, "onshow", hashMap);
    }

    /* renamed from: o */
    public final void mo4771o() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzep().m9879b()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzep().m9876a()));
        hashMap.put("device_volume", String.valueOf(zzamh.m9874a(getContext())));
        zzvm.m11150a((zzvl) this, "volume", hashMap);
    }

    /* renamed from: q */
    public final synchronized zzd mo4775q() {
        return this.f21330g;
    }

    /* renamed from: y */
    public final IObjectWrapper mo4785y() {
        return (IObjectWrapper) this.f21316D.get();
    }

    /* renamed from: r */
    public final synchronized zzd mo4776r() {
        return this.f21314B;
    }

    /* renamed from: s */
    public final synchronized zzatt mo4205s() {
        return this.f21331h;
    }

    /* renamed from: t */
    public final synchronized String mo4781t() {
        return this.f21332i;
    }

    /* renamed from: v */
    public final WebViewClient mo4783v() {
        return this.f21325b;
    }

    /* renamed from: w */
    public final synchronized boolean mo4784w() {
        return this.f21333j;
    }

    /* renamed from: x */
    public final zzck mo4207x() {
        return this.f21326c;
    }

    /* renamed from: i */
    public final zzaop mo4204i() {
        return this.f21327d;
    }

    /* renamed from: z */
    public final synchronized boolean mo4208z() {
        return this.f21334k;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hi.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21325b.m21442c()) {
            synchronized (this) {
                if (this.f21343t != null) {
                    this.f21343t.mo2174a(motionEvent);
                }
            }
        } else if (this.f21326c != null) {
            this.f21326c.m10480a(motionEvent);
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

    @SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int i, int i2) {
        if (m21458A()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!(isInEditMode() || this.f21334k)) {
            if (!this.f21331h.m10135f()) {
                if (this.f21331h.m10137h()) {
                    super.onMeasure(i, i2);
                    return;
                } else if (this.f21331h.m10136g()) {
                    if (((Boolean) zzkd.m10713e().m10897a(zznw.bD)).booleanValue()) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    zzasw b = mo4198b();
                    float e = b != null ? b.mo2558e() : 0.0f;
                    if (e == 0.0f) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    i = MeasureSpec.getSize(i);
                    i2 = MeasureSpec.getSize(i2);
                    int i3 = (int) (((float) i2) * e);
                    r2 = (int) (((float) i) / e);
                    if (i2 == 0 && r2 != 0) {
                        i3 = (int) (((float) r2) * e);
                        i2 = r2;
                    } else if (i == 0 && i3 != 0) {
                        r2 = (int) (((float) i3) / e);
                        i = i3;
                    }
                    setMeasuredDimension(Math.min(i3, i), Math.min(r2, i2));
                    return;
                } else if (this.f21331h.m10133d()) {
                    if (!((Boolean) zzkd.m10713e().m10897a(zznw.bI)).booleanValue()) {
                        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
                            mo4740a("/contentHeight", new hj(this));
                            mo2409b("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                            i = MeasureSpec.getSize(i);
                            if (this.f21345v != -1) {
                                i2 = (int) (((float) this.f21345v) * this.f21321I);
                            } else {
                                i2 = MeasureSpec.getSize(i2);
                            }
                            setMeasuredDimension(i, i2);
                            return;
                        }
                    }
                    super.onMeasure(i, i2);
                    return;
                } else if (this.f21331h.m10134e()) {
                    i = new DisplayMetrics();
                    this.f21323K.getDefaultDisplay().getMetrics(i);
                    setMeasuredDimension(i.widthPixels, i.heightPixels);
                    return;
                } else {
                    Object obj;
                    Object obj2;
                    int i4;
                    StringBuilder stringBuilder;
                    int mode = MeasureSpec.getMode(i);
                    i = MeasureSpec.getSize(i);
                    r2 = MeasureSpec.getMode(i2);
                    i2 = MeasureSpec.getSize(i2);
                    int i5 = BaseClientBuilder.API_PRIORITY_OTHER;
                    if (mode != Integer.MIN_VALUE) {
                        if (mode != 1073741824) {
                            mode = BaseClientBuilder.API_PRIORITY_OTHER;
                            if (r2 == Integer.MIN_VALUE || r2 == 1073741824) {
                                i5 = i2;
                            }
                            obj = 1;
                            if (this.f21331h.f9019b <= mode) {
                                if (this.f21331h.f9018a > i5) {
                                    obj2 = null;
                                    if (((Boolean) zzkd.m10713e().m10897a(zznw.cA)).booleanValue()) {
                                        if (((float) this.f21331h.f9019b) / this.f21321I <= ((float) mode) / this.f21321I || ((float) this.f21331h.f9018a) / this.f21321I > ((float) i5) / this.f21321I) {
                                            obj = null;
                                        }
                                        if (obj2 != null) {
                                            obj2 = obj;
                                        }
                                    }
                                    if (obj2 == null) {
                                        r2 = (int) (((float) this.f21331h.f9019b) / this.f21321I);
                                        i4 = (int) (((float) this.f21331h.f9018a) / this.f21321I);
                                        i = (int) (((float) i) / this.f21321I);
                                        i2 = (int) (((float) i2) / this.f21321I);
                                        stringBuilder = new StringBuilder(103);
                                        stringBuilder.append("Not enough space to show ad. Needs ");
                                        stringBuilder.append(r2);
                                        stringBuilder.append("x");
                                        stringBuilder.append(i4);
                                        stringBuilder.append(" dp, but only has ");
                                        stringBuilder.append(i);
                                        stringBuilder.append("x");
                                        stringBuilder.append(i2);
                                        stringBuilder.append(" dp.");
                                        zzaok.m10007e(stringBuilder.toString());
                                        if (getVisibility() != 8) {
                                            setVisibility(4);
                                        }
                                        setMeasuredDimension(0, 0);
                                        return;
                                    }
                                    if (getVisibility() != 8) {
                                        setVisibility(0);
                                    }
                                    setMeasuredDimension(this.f21331h.f9019b, this.f21331h.f9018a);
                                    return;
                                }
                            }
                            obj2 = 1;
                            if (((Boolean) zzkd.m10713e().m10897a(zznw.cA)).booleanValue()) {
                                if (((float) this.f21331h.f9019b) / this.f21321I <= ((float) mode) / this.f21321I) {
                                }
                                obj = null;
                                if (obj2 != null) {
                                    obj2 = obj;
                                }
                            }
                            if (obj2 == null) {
                                if (getVisibility() != 8) {
                                    setVisibility(0);
                                }
                                setMeasuredDimension(this.f21331h.f9019b, this.f21331h.f9018a);
                                return;
                            }
                            r2 = (int) (((float) this.f21331h.f9019b) / this.f21321I);
                            i4 = (int) (((float) this.f21331h.f9018a) / this.f21321I);
                            i = (int) (((float) i) / this.f21321I);
                            i2 = (int) (((float) i2) / this.f21321I);
                            stringBuilder = new StringBuilder(103);
                            stringBuilder.append("Not enough space to show ad. Needs ");
                            stringBuilder.append(r2);
                            stringBuilder.append("x");
                            stringBuilder.append(i4);
                            stringBuilder.append(" dp, but only has ");
                            stringBuilder.append(i);
                            stringBuilder.append("x");
                            stringBuilder.append(i2);
                            stringBuilder.append(" dp.");
                            zzaok.m10007e(stringBuilder.toString());
                            if (getVisibility() != 8) {
                                setVisibility(4);
                            }
                            setMeasuredDimension(0, 0);
                            return;
                        }
                    }
                    mode = i;
                    i5 = i2;
                    obj = 1;
                    if (this.f21331h.f9019b <= mode) {
                        if (this.f21331h.f9018a > i5) {
                            obj2 = null;
                            if (((Boolean) zzkd.m10713e().m10897a(zznw.cA)).booleanValue()) {
                                if (((float) this.f21331h.f9019b) / this.f21321I <= ((float) mode) / this.f21321I) {
                                }
                                obj = null;
                                if (obj2 != null) {
                                    obj2 = obj;
                                }
                            }
                            if (obj2 == null) {
                                r2 = (int) (((float) this.f21331h.f9019b) / this.f21321I);
                                i4 = (int) (((float) this.f21331h.f9018a) / this.f21321I);
                                i = (int) (((float) i) / this.f21321I);
                                i2 = (int) (((float) i2) / this.f21321I);
                                stringBuilder = new StringBuilder(103);
                                stringBuilder.append("Not enough space to show ad. Needs ");
                                stringBuilder.append(r2);
                                stringBuilder.append("x");
                                stringBuilder.append(i4);
                                stringBuilder.append(" dp, but only has ");
                                stringBuilder.append(i);
                                stringBuilder.append("x");
                                stringBuilder.append(i2);
                                stringBuilder.append(" dp.");
                                zzaok.m10007e(stringBuilder.toString());
                                if (getVisibility() != 8) {
                                    setVisibility(4);
                                }
                                setMeasuredDimension(0, 0);
                                return;
                            }
                            if (getVisibility() != 8) {
                                setVisibility(0);
                            }
                            setMeasuredDimension(this.f21331h.f9019b, this.f21331h.f9018a);
                            return;
                        }
                    }
                    obj2 = 1;
                    if (((Boolean) zzkd.m10713e().m10897a(zznw.cA)).booleanValue()) {
                        if (((float) this.f21331h.f9019b) / this.f21321I <= ((float) mode) / this.f21321I) {
                        }
                        obj = null;
                        if (obj2 != null) {
                            obj2 = obj;
                        }
                    }
                    if (obj2 == null) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        setMeasuredDimension(this.f21331h.f9019b, this.f21331h.f9018a);
                        return;
                    }
                    r2 = (int) (((float) this.f21331h.f9019b) / this.f21321I);
                    i4 = (int) (((float) this.f21331h.f9018a) / this.f21321I);
                    i = (int) (((float) i) / this.f21321I);
                    i2 = (int) (((float) i2) / this.f21321I);
                    stringBuilder = new StringBuilder(103);
                    stringBuilder.append("Not enough space to show ad. Needs ");
                    stringBuilder.append(r2);
                    stringBuilder.append("x");
                    stringBuilder.append(i4);
                    stringBuilder.append(" dp, but only has ");
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(i2);
                    stringBuilder.append(" dp.");
                    zzaok.m10007e(stringBuilder.toString());
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    return;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void onGlobalLayout() {
        boolean L = m28176L();
        zzd q = mo4775q();
        if (q != null && L) {
            q.zzoy();
        }
    }

    /* renamed from: a */
    public final synchronized void mo4735a(zzd zzd) {
        this.f21330g = zzd;
    }

    /* renamed from: a */
    public final void mo4736a(IObjectWrapper iObjectWrapper) {
        this.f21316D.set(iObjectWrapper);
    }

    /* renamed from: b */
    public final synchronized void mo4748b(zzd zzd) {
        this.f21314B = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo4737a(zzatt zzatt) {
        this.f21331h = zzatt;
        requestLayout();
    }

    /* renamed from: b */
    public final synchronized void mo4751b(boolean z) {
        Object obj = z != this.f21334k ? 1 : null;
        this.f21334k = z;
        m28178N();
        if (obj != null) {
            new zzabr(this).m9448c(z ? "expanded" : "default");
        }
    }

    /* renamed from: F */
    public final void mo4726F() {
        this.f21315C.m9947a();
    }

    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!m21458A()) {
            this.f21315C.m9950c();
        }
        boolean z = this.f21341r;
        if (this.f21325b != null && this.f21325b.m21442c()) {
            if (!this.f21342s) {
                OnGlobalLayoutListener d = this.f21325b.m21444d();
                if (d != null) {
                    zzbv.zzfi();
                    zzaqa.m10047a((View) this, d);
                }
                OnScrollChangedListener e = this.f21325b.m21446e();
                if (e != null) {
                    zzbv.zzfi();
                    zzaqa.m10048a((View) this, e);
                }
                this.f21342s = true;
            }
            m28176L();
            z = true;
        }
        m28185h(z);
    }

    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!m21458A()) {
                this.f21315C.m9951d();
            }
            super.onDetachedFromWindow();
            if (this.f21342s && this.f21325b != null && this.f21325b.m21442c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f21325b.m21444d();
                if (d != null) {
                    zzbv.zzem().mo4958a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f21325b.m21446e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f21342s = false;
            }
        }
        m28185h(false);
    }

    /* renamed from: a */
    public final void mo4733a(Context context) {
        this.f21324a.setBaseContext(context);
        this.f21315C.m9948a(this.f21324a.m10126a());
    }

    /* renamed from: c */
    public final synchronized void mo4753c(boolean z) {
        if (this.f21330g != null) {
            this.f21330g.zza(this.f21325b.mo2398b(), z);
        } else {
            this.f21333j = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.f21336m;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f21336m = i;
        if (this.f21330g != 0) {
            this.f21330g.setRequestedOrientation(this.f21336m);
        }
    }

    /* renamed from: d */
    public final Activity mo4199d() {
        return this.f21324a.m10126a();
    }

    /* renamed from: p */
    public final Context mo4774p() {
        return this.f21324a.m10127b();
    }

    /* renamed from: N */
    private final synchronized void m28178N() {
        if (!this.f21334k) {
            if (!this.f21331h.m10134e()) {
                if (VERSION.SDK_INT < 18) {
                    zzaok.m10001b("Disabling hardware acceleration on an AdView.");
                    m28179O();
                    return;
                }
                zzaok.m10001b("Enabling hardware acceleration on an AdView.");
                m28180P();
                return;
            }
        }
        zzaok.m10001b("Enabling hardware acceleration on an overlay.");
        m28180P();
    }

    /* renamed from: O */
    private final synchronized void m28179O() {
        if (!this.f21335l) {
            zzbv.zzem().mo4181c((View) this);
        }
        this.f21335l = true;
    }

    /* renamed from: P */
    private final synchronized void m28180P() {
        if (this.f21335l) {
            zzbv.zzem().mo4180b((View) this);
        }
        this.f21335l = false;
    }

    /* renamed from: g */
    protected final synchronized void mo4787g(boolean z) {
        if (!z) {
            m28182R();
            this.f21315C.m9949b();
            if (this.f21330g) {
                this.f21330g.close();
                this.f21330g.onDestroy();
                this.f21330g = null;
            }
        }
        this.f21316D.set(null);
        this.f21325b.m21452k();
        zzbv.zzfh();
        zzarq.m10083a((zzarg) this);
        m28181Q();
    }

    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (!(((zzatu) this.f21325b) == null || ((zzatu) this.f21325b).m21453l() == null)) {
                ((zzatu) this.f21325b).m21453l().mo1713a();
            }
        }
    }

    /* renamed from: G */
    public final void mo4727G() {
        if (this.f21348y == null) {
            this.f21348y = zzoc.m10916a(this.f21349z.m10922a());
            this.f21349z.m10923a("native:view_load", this.f21348y);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Throwable e) {
            zzaok.m10002b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Throwable e) {
            zzaok.m10002b("Could not resume webview.", e);
        }
    }

    /* renamed from: J */
    public final void mo4730J() {
        zzalg.m21225a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: f */
    public final void mo4758f(boolean z) {
        this.f21325b.m21440b(z);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Throwable e) {
            zzaok.m10002b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: d */
    public final synchronized void mo4754d(boolean z) {
        this.f21337n = z;
    }

    /* renamed from: C */
    public final synchronized boolean mo4723C() {
        return this.f21337n;
    }

    /* renamed from: D */
    public final synchronized boolean mo4724D() {
        return this.f21338o;
    }

    public final synchronized void zzck() {
        this.f21338o = true;
        if (this.f21328e != null) {
            this.f21328e.zzck();
        }
    }

    public final synchronized void zzcl() {
        this.f21338o = false;
        if (this.f21328e != null) {
            this.f21328e.zzcl();
        }
    }

    /* renamed from: Q */
    private final synchronized void m28181Q() {
        this.f21322J = null;
    }

    /* renamed from: a */
    public final synchronized void mo4739a(String str) {
        if (str == null) {
            str = "";
        }
        this.f21339p = str;
    }

    /* renamed from: g */
    public final synchronized String mo4759g() {
        return this.f21339p;
    }

    /* renamed from: c */
    public final zzoh mo4752c() {
        return this.f21347x;
    }

    /* renamed from: h */
    public final zzoi mo4203h() {
        return this.f21349z;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f21313A = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f21313A.get();
    }

    /* renamed from: a */
    public final synchronized void mo4738a(zzpk zzpk) {
        this.f21343t = zzpk;
    }

    /* renamed from: H */
    public final synchronized zzpk mo4728H() {
        return this.f21343t;
    }

    /* renamed from: l */
    public final synchronized void mo4765l() {
    }

    /* renamed from: b */
    public final synchronized zzasw mo4198b() {
        return this.f21340q;
    }

    /* renamed from: a */
    public final synchronized void mo4197a(zzasw zzasw) {
        if (this.f21340q != null) {
            zzaok.m10003c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f21340q = zzasw;
        }
    }

    /* renamed from: E */
    public final synchronized boolean mo4725E() {
        return this.f21344u > 0;
    }

    /* renamed from: e */
    public final synchronized void mo4756e(boolean z) {
        this.f21344u += z ? true : true;
        if (this.f21344u > false && this.f21330g) {
            this.f21330g.zzpb();
        }
    }

    /* renamed from: R */
    private final void m28182R() {
        if (this.f21349z != null) {
            zzoj a = this.f21349z.m10922a();
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
        this.f21325b.m21434a(z);
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
        this.f21325b.m21424a(zzc);
    }

    /* renamed from: a */
    public final void mo4745a(boolean z, int i) {
        this.f21325b.m21435a(z, i);
    }

    /* renamed from: a */
    public final void mo4746a(boolean z, int i, String str) {
        this.f21325b.m21436a(z, i, str);
    }

    /* renamed from: a */
    public final void mo4747a(boolean z, int i, String str, String str2) {
        this.f21325b.m21437a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo2329a(zzfv zzfv) {
        synchronized (this) {
            this.f21341r = zzfv.f9458a;
        }
        m28185h(zzfv.f9458a);
    }

    /* renamed from: h */
    private final void m28185h(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zzvm.m11150a((zzvl) this, "onAdVisibilityChanged", hashMap);
    }

    /* renamed from: a */
    public final void mo4740a(String str, zzu<? super zzasg> zzu) {
        if (this.f21325b != null) {
            this.f21325b.m21432a(str, (zzu) zzu);
        }
    }

    /* renamed from: b */
    public final void mo4749b(String str, zzu<? super zzasg> zzu) {
        if (this.f21325b != null) {
            this.f21325b.m21439b(str, zzu);
        }
    }

    /* renamed from: a */
    public final void mo4741a(String str, Predicate<zzu<? super zzasg>> predicate) {
        if (this.f21325b != null) {
            this.f21325b.m21433a(str, (Predicate) predicate);
        }
    }

    /* renamed from: u */
    public final /* synthetic */ zzatn mo4782u() {
        return this.f21325b;
    }
}
