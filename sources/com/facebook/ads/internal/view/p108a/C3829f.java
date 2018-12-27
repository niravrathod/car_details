package com.facebook.ads.internal.view.p108a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p101q.p104c.C1944a;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.f */
public class C3829f extends C1944a {
    /* renamed from: a */
    private static final String f15268a = "f";
    /* renamed from: b */
    private static final Set<String> f15269b = new HashSet(2);
    /* renamed from: c */
    private C1977a f15270c;
    /* renamed from: d */
    private C1975d f15271d;
    /* renamed from: e */
    private long f15272e = -1;
    /* renamed from: f */
    private long f15273f = -1;
    /* renamed from: g */
    private long f15274g = -1;
    /* renamed from: h */
    private long f15275h = -1;

    /* renamed from: com.facebook.ads.internal.view.a.f$a */
    public interface C1977a {
        /* renamed from: a */
        void mo1411a(int i);

        /* renamed from: a */
        void mo1412a(String str);

        /* renamed from: b */
        void mo1413b(String str);

        /* renamed from: c */
        void mo1414c(String str);
    }

    /* renamed from: com.facebook.ads.internal.view.a.f$b */
    static class C1978b extends WebChromeClient {
        /* renamed from: a */
        private final WeakReference<C1977a> f6104a;
        /* renamed from: b */
        private final WeakReference<C1975d> f6105b;

        C1978b(WeakReference<C1977a> weakReference, WeakReference<C1975d> weakReference2) {
            this.f6104a = weakReference;
            this.f6105b = weakReference2;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (!(TextUtils.isEmpty(message) || consoleMessage.messageLevel() != MessageLevel.LOG || this.f6105b.get() == null)) {
                ((C1975d) this.f6105b.get()).m7463a(message);
            }
            return true;
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (this.f6105b.get() != null) {
                ((C1975d) this.f6105b.get()).m7462a();
            }
            if (this.f6104a.get() != null) {
                ((C1977a) this.f6104a.get()).mo1411a(i);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (this.f6104a.get() != null) {
                ((C1977a) this.f6104a.get()).mo1413b(str);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.f$c */
    static class C1979c extends WebViewClient {
        /* renamed from: a */
        private final WeakReference<C1977a> f6106a;
        /* renamed from: b */
        private final WeakReference<Context> f6107b;

        C1979c(WeakReference<C1977a> weakReference, WeakReference<Context> weakReference2) {
            this.f6106a = weakReference;
            this.f6107b = weakReference2;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f6106a.get() != null) {
                ((C1977a) this.f6106a.get()).mo1414c(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f6106a.get() != null) {
                ((C1977a) this.f6106a.get()).mo1412a(str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            if (!(C3829f.f15269b.contains(parse.getScheme()) || this.f6107b.get() == null)) {
                try {
                    ((Context) this.f6107b.get()).startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (Throwable e) {
                    Log.w(C3829f.f15268a, "Activity not found to handle URI.", e);
                } catch (Throwable e2) {
                    Log.e(C3829f.f15268a, "Unknown exception occurred when trying to handle URI.", e2);
                }
            }
            return false;
        }
    }

    static {
        f15269b.add("http");
        f15269b.add("https");
    }

    public C3829f(Context context) {
        super(context);
        m19098f();
    }

    /* renamed from: f */
    private void m19098f() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.f15271d = new C1975d(this);
    }

    /* renamed from: g */
    private void m19099g() {
        if (this.f15273f > -1 && this.f15274g > -1 && this.f15275h > -1) {
            this.f15271d.m7464a(false);
        }
    }

    /* renamed from: a */
    protected WebChromeClient mo1407a() {
        return new C1978b(new WeakReference(this.f15270c), new WeakReference(this.f15271d));
    }

    /* renamed from: a */
    public void m19101a(long j) {
        if (this.f15272e < 0) {
            this.f15272e = j;
        }
    }

    /* renamed from: a */
    public void m19102a(java.lang.String r3) {
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
        r0 = 0;
        r2.evaluateJavascript(r3, r0);	 Catch:{ IllegalStateException -> 0x0005 }
        goto L_0x0019;
    L_0x0005:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "javascript:";
        r0.append(r1);
        r0.append(r3);
        r3 = r0.toString();
        r2.loadUrl(r3);
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.a.f.a(java.lang.String):void");
    }

    /* renamed from: b */
    protected WebViewClient mo1408b() {
        return new C1979c(new WeakReference(this.f15270c), new WeakReference(getContext()));
    }

    /* renamed from: b */
    public void m19104b(long j) {
        if (this.f15273f < 0) {
            this.f15273f = j;
        }
        m19099g();
    }

    /* renamed from: c */
    public void m19105c(long j) {
        if (this.f15275h < 0) {
            this.f15275h = j;
        }
        m19099g();
    }

    public void destroy() {
        this.f15270c = null;
        C1945b.m7352a(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.f15273f;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        return copyBackForwardList.getSize() > 0 ? copyBackForwardList.getItemAtIndex(0).getUrl() : getUrl();
    }

    public long getLoadFinishMs() {
        return this.f15275h;
    }

    public long getResponseEndMs() {
        return this.f15272e;
    }

    public long getScrollReadyMs() {
        return this.f15274g;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15274g < 0 && computeVerticalScrollRange() > getHeight()) {
            this.f15274g = System.currentTimeMillis();
            m19099g();
        }
    }

    public void setListener(C1977a c1977a) {
        this.f15270c = c1977a;
    }
}
