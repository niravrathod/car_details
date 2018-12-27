package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@TargetApi(14)
@ParametersAreNonnullByDefault
public final class zzgn extends Thread {
    /* renamed from: a */
    private boolean f9493a;
    /* renamed from: b */
    private boolean f9494b;
    /* renamed from: c */
    private boolean f9495c;
    /* renamed from: d */
    private final Object f9496d;
    /* renamed from: e */
    private final zzgi f9497e;
    /* renamed from: f */
    private final int f9498f;
    /* renamed from: g */
    private final int f9499g;
    /* renamed from: h */
    private final int f9500h;
    /* renamed from: i */
    private final int f9501i;
    /* renamed from: j */
    private final int f9502j;
    /* renamed from: k */
    private final int f9503k;
    /* renamed from: l */
    private final int f9504l;
    /* renamed from: m */
    private final int f9505m;
    /* renamed from: n */
    private final String f9506n;
    /* renamed from: o */
    private final boolean f9507o;

    public zzgn() {
        this(new zzgi());
    }

    @VisibleForTesting
    private zzgn(zzgi zzgi) {
        this.f9493a = false;
        this.f9494b = false;
        this.f9495c = false;
        this.f9497e = zzgi;
        this.f9496d = new Object();
        this.f9499g = ((Integer) zzkd.m10713e().m10897a(zznw.f9689N)).intValue();
        this.f9500h = ((Integer) zzkd.m10713e().m10897a(zznw.f9690O)).intValue();
        this.f9501i = ((Integer) zzkd.m10713e().m10897a(zznw.f9691P)).intValue();
        this.f9502j = ((Integer) zzkd.m10713e().m10897a(zznw.f9692Q)).intValue();
        this.f9503k = ((Integer) zzkd.m10713e().m10897a(zznw.f9694S)).intValue();
        this.f9504l = ((Integer) zzkd.m10713e().m10897a(zznw.f9695T)).intValue();
        this.f9505m = ((Integer) zzkd.m10713e().m10897a(zznw.f9696U)).intValue();
        this.f9498f = ((Integer) zzkd.m10713e().m10897a(zznw.f9693R)).intValue();
        this.f9506n = (String) zzkd.m10713e().m10897a(zznw.f9698W);
        this.f9507o = ((Boolean) zzkd.m10713e().m10897a(zznw.f9699X)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final void m10638a() {
        synchronized (this.f9496d) {
            if (this.f9493a) {
                zzaok.m10001b("Content hash thread already started, quiting...");
                return;
            }
            this.f9493a = true;
            start();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
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
        r4 = this;
    L_0x0000:
        r0 = m10636e();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        if (r0 == 0) goto L_0x0059;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x0006:
        r0 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r0 = r0.m10630a();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        if (r0 != 0) goto L_0x0019;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x0010:
        r0 = "ContentFetchThread: no activity. Sleeping.";	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        com.google.android.gms.internal.ads.zzaok.m10001b(r0);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r4.m10637f();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        goto L_0x0061;
    L_0x0019:
        if (r0 == 0) goto L_0x0061;
    L_0x001b:
        r1 = 0;
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
    L_0x0022:
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        r2 = r2.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
    L_0x002c:
        r0 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        r0 = r0.findViewById(r2);	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
        r1 = r0;
        goto L_0x004c;
    L_0x003d:
        r0 = move-exception;
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r3 = "ContentFetchTask.extractContent";	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r2.m9714a(r0, r3);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r0 = "Failed getting root view of activity. Content not extracted.";	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        com.google.android.gms.internal.ads.zzaok.m10001b(r0);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x004c:
        if (r1 == 0) goto L_0x0061;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x004e:
        if (r1 == 0) goto L_0x0061;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x0050:
        r0 = new com.google.android.gms.internal.ads.qj;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r0.<init>(r4, r1);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r1.post(r0);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        goto L_0x0061;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x0059:
        r0 = "ContentFetchTask: sleeping";	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        com.google.android.gms.internal.ads.zzaok.m10001b(r0);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r4.m10637f();	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
    L_0x0061:
        r0 = r4.f9498f;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r0 = r0 * 1000;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        goto L_0x0080;
    L_0x006a:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r0);
        r1 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = "ContentFetchTask.run";
        r1.m9714a(r0, r2);
        goto L_0x0080;
    L_0x007a:
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r0);
    L_0x0080:
        r0 = r4.f9496d;
        monitor-enter(r0);
    L_0x0083:
        r1 = r4.f9494b;	 Catch:{ all -> 0x0095 }
        if (r1 == 0) goto L_0x0092;
    L_0x0087:
        r1 = "ContentFetchTask: waiting";	 Catch:{ InterruptedException -> 0x0083 }
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);	 Catch:{ InterruptedException -> 0x0083 }
        r1 = r4.f9496d;	 Catch:{ InterruptedException -> 0x0083 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0083 }
        goto L_0x0083;
    L_0x0092:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        goto L_0x0000;	 Catch:{ all -> 0x0095 }
    L_0x0095:
        r1 = move-exception;	 Catch:{ all -> 0x0095 }
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgn.run():void");
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m10639a(View view) {
        try {
            zzgh zzgh = new zzgh(this.f9499g, this.f9500h, this.f9501i, this.f9502j, this.f9503k, this.f9504l, this.f9505m);
            Context b = zzbv.zzen().m10633b();
            if (!(b == null || TextUtils.isEmpty(this.f9506n))) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) zzkd.m10713e().m10897a(zznw.f9697V), FacebookAdapter.KEY_ID, b.getPackageName()));
                if (str != null && str.equals(this.f9506n)) {
                    return;
                }
            }
            view = m10635a(view, zzgh);
            zzgh.m10623h();
            if (view.f8355a != 0 || view.f8356b != 0) {
                if (view.f8356b != 0 || zzgh.m10625j() != 0) {
                    if (view.f8356b != null || this.f9497e.m10627a(zzgh) == null) {
                        this.f9497e.m10629c(zzgh);
                    }
                }
            }
        } catch (Throwable e) {
            zzaok.m10002b("Exception in fetchContentOnUIThread", e);
            zzbv.zzeo().m9714a(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    private static boolean m10636e() {
        try {
            Context b = zzbv.zzen().m10633b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                boolean z;
                                PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                if (powerManager == null) {
                                    z = false;
                                } else {
                                    z = powerManager.isScreenOn();
                                }
                                if (z) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzbv.zzeo().m9714a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final qm m10635a(View view, zzgh zzgh) {
        int i = 0;
        if (view == null) {
            return new qm(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new qm(this, 0, 0);
            }
            zzgh.m10617b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new qm(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzasg)) {
            zzgh.m10622g();
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzgh.m10622g();
                webView.post(new qk(this, zzgh, webView, globalVisibleRect));
                view = true;
            } else {
                view = null;
            }
            if (view != null) {
                return new qm(this, 0, 1);
            }
            return new qm(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new qm(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                qm a = m10635a(viewGroup.getChildAt(i), zzgh);
                i2 += a.f8355a;
                i3 += a.f8356b;
                i++;
            }
            return new qm(this, i2, i3);
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    final void m10640a(com.google.android.gms.internal.ads.zzgh r11, android.webkit.WebView r12, java.lang.String r13, boolean r14) {
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
        r10 = this;
        r11.m10621f();
        r0 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        if (r0 != 0) goto L_0x007c;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0009:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r0.<init>(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = "text";	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r2 = r0.optString(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = r10.f9507o;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0018:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = android.text.TextUtils.isEmpty(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        if (r13 != 0) goto L_0x0065;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0022:
        r13 = r12.getTitle();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r0 = java.lang.String.valueOf(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r0 = r0.length();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r0 = r0 + 1;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1 = r1.length();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r0 = r0 + r1;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = "\n";	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1.append(r13);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r4 = r1.toString();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r6 = r12.getX();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r7 = r12.getY();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r8 = (float) r13;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r9 = (float) r12;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r3 = r11;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r5 = r14;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r3.m10614a(r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        goto L_0x007c;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0065:
        r4 = r12.getX();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r5 = r12.getY();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r13 = r12.getWidth();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r6 = (float) r13;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r12 = r12.getHeight();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r7 = (float) r12;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1 = r11;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r3 = r14;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r1.m10614a(r2, r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x007c:
        r12 = r11.m10615a();	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        if (r12 == 0) goto L_0x0087;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0082:
        r12 = r10.f9497e;	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
        r12.m10628b(r11);	 Catch:{ JSONException -> 0x0098, Throwable -> 0x0088 }
    L_0x0087:
        return;
    L_0x0088:
        r11 = move-exception;
        r12 = "Failed to get webview content.";
        com.google.android.gms.internal.ads.zzaok.m9999a(r12, r11);
        r12 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r13 = "ContentFetchTask.processWebViewContent";
        r12.m9714a(r11, r13);
        return;
    L_0x0098:
        r11 = "Json string may be malformed.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgn.a(com.google.android.gms.internal.ads.zzgh, android.webkit.WebView, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public final zzgh m10641b() {
        return this.f9497e.m10626a();
    }

    /* renamed from: c */
    public final void m10642c() {
        synchronized (this.f9496d) {
            this.f9494b = false;
            this.f9496d.notifyAll();
            zzaok.m10001b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: f */
    private final void m10637f() {
        synchronized (this.f9496d) {
            this.f9494b = true;
            boolean z = this.f9494b;
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("ContentFetchThread: paused, mPause = ");
            stringBuilder.append(z);
            zzaok.m10001b(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final boolean m10643d() {
        return this.f9494b;
    }
}
