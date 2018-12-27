package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public class zzaug extends hk implements zzauj {
    /* renamed from: a */
    private final zzaue f16997a;
    @GuardedBy("this")
    /* renamed from: b */
    private boolean f16998b;
    @GuardedBy("this")
    /* renamed from: c */
    private boolean f16999c;

    public zzaug(Context context, zzaue zzaue) {
        super(context);
        zzbv.zzeo().m9723h();
        this.f16997a = zzaue;
        super.setWebViewClient(zzaue);
    }

    @GuardedBy("this")
    /* renamed from: g */
    protected void mo4787g(boolean z) {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    /* renamed from: A */
    public final synchronized boolean m21458A() {
        return this.f16998b;
    }

    public synchronized void destroy() {
        if (!this.f16998b) {
            this.f16998b = true;
            this.f16997a.m10141a((zzauj) this);
            mo4787g(false);
            zzalg.m21225a("Initiating WebView self destruct sequence in 3...");
            zzalg.m21225a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (Throwable e) {
                zzbv.zzeo().m9714a(e, "AdWebViewImpl.loadUrlUnsafe");
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo2407a(zzauf zzauf) {
        zzalg.m21225a("Blank page loaded, 1...");
        mo4722B();
    }

    @VisibleForTesting
    /* renamed from: B */
    protected synchronized void mo4722B() {
        zzalg.m21225a("Destroying WebView!");
        mo4731a();
        zzapn.f8961a.execute(new hl(this));
    }

    protected void finalize() {
        try {
            synchronized (this) {
                if (!m21458A()) {
                    mo4787g(true);
                }
                mo4731a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: a */
    private final synchronized void mo4731a() {
        if (!this.f16999c) {
            this.f16999c = true;
            zzbv.zzeo().m9724i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.m21458A();	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        r2 = "#004 The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);	 Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaug.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public synchronized void loadUrl(String str) {
        if (m21458A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (m21458A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (m21458A()) {
            zzaok.m10007e("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (m21458A() || super.onTouchEvent(motionEvent) == null) ? null : true;
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (!m21458A()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!m21458A()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!m21458A()) {
            super.onResume();
        }
    }

    public void stopLoading() {
        if (!m21458A()) {
            super.stopLoading();
        }
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo2409b(String str) {
        super.mo2409b(str);
    }

    /* renamed from: K */
    final /* synthetic */ void m21460K() {
        super.destroy();
    }
}
