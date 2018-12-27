package com.facebook.ads.internal.view.p109b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p088g.C1799a;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p104c.C1944a;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.b.a */
public class C3835a extends C1944a {
    /* renamed from: a */
    private static final String f15281a = "a";
    /* renamed from: b */
    private final WeakReference<C1982b> f15282b;
    /* renamed from: c */
    private final AtomicBoolean f15283c = new AtomicBoolean();
    /* renamed from: d */
    private final AtomicBoolean f15284d = new AtomicBoolean(true);
    /* renamed from: e */
    private WeakReference<C1983d> f15285e;
    /* renamed from: f */
    private C1958a f15286f;
    /* renamed from: g */
    private C1933t f15287g = new C1933t();
    /* renamed from: h */
    private C1957a f15288h;
    /* renamed from: i */
    private boolean f15289i = true;
    /* renamed from: j */
    private boolean f15290j;

    /* renamed from: com.facebook.ads.internal.view.b.a$a */
    static class C1981a {
        /* renamed from: a */
        private final String f6108a = C1981a.class.getSimpleName();
        /* renamed from: b */
        private final WeakReference<C3835a> f6109b;
        /* renamed from: c */
        private final WeakReference<C1982b> f6110c;
        /* renamed from: d */
        private final WeakReference<C1958a> f6111d;
        /* renamed from: e */
        private final WeakReference<AtomicBoolean> f6112e;
        /* renamed from: f */
        private final WeakReference<AtomicBoolean> f6113f;
        /* renamed from: g */
        private final boolean f6114g;

        C1981a(C3835a c3835a, C1982b c1982b, C1958a c1958a, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
            this.f6109b = new WeakReference(c3835a);
            this.f6110c = new WeakReference(c1982b);
            this.f6111d = new WeakReference(c1958a);
            this.f6112e = new WeakReference(atomicBoolean);
            this.f6113f = new WeakReference(atomicBoolean2);
            this.f6114g = z;
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.f6108a, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return C1921k.m7293a(C1799a.m6761a());
        }

        @JavascriptInterface
        public void onMainAssetLoaded() {
            if (this.f6109b.get() != null && this.f6112e.get() != null) {
                if (this.f6113f.get() != null) {
                    if (this.f6114g && ((AtomicBoolean) this.f6113f.get()).get()) {
                        ((AtomicBoolean) this.f6112e.get()).set(true);
                        if (((C3835a) this.f6109b.get()).isShown()) {
                            new Handler(Looper.getMainLooper()).post(new C1984e(this.f6111d));
                        }
                    }
                }
            }
        }

        @JavascriptInterface
        public void onPageInitialized() {
            C3835a c3835a = (C3835a) this.f6109b.get();
            if (c3835a == null) {
                return;
            }
            if (!c3835a.m7350c()) {
                C1982b c1982b = (C1982b) this.f6110c.get();
                if (c1982b != null) {
                    c1982b.mo1415a();
                }
                if (!this.f6114g && ((C3835a) this.f6109b.get()).isShown()) {
                    new Handler(Looper.getMainLooper()).post(new C1984e(this.f6111d));
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$b */
    public interface C1982b {
        /* renamed from: a */
        void mo1415a();

        /* renamed from: a */
        void mo1416a(int i);

        /* renamed from: a */
        void mo1417a(WebResourceError webResourceError);

        /* renamed from: a */
        void mo1418a(String str, Map<String, String> map);

        /* renamed from: b */
        void mo1419b();
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$d */
    public interface C1983d {
        /* renamed from: b */
        void mo1485b();
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$e */
    static class C1984e implements Runnable {
        /* renamed from: a */
        private final WeakReference<C1958a> f6115a;

        C1984e(C1958a c1958a) {
            this.f6115a = new WeakReference(c1958a);
        }

        C1984e(WeakReference<C1958a> weakReference) {
            this.f6115a = weakReference;
        }

        public void run() {
            C1958a c1958a = (C1958a) this.f6115a.get();
            if (c1958a != null) {
                c1958a.m7417a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$f */
    static class C1985f extends WebChromeClient {
        C1985f() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$g */
    static class C1987g extends WebViewClient {
        /* renamed from: a */
        private final WeakReference<C1982b> f6117a;
        /* renamed from: b */
        private final WeakReference<C1958a> f6118b;
        /* renamed from: c */
        private final WeakReference<C1933t> f6119c;
        /* renamed from: d */
        private final WeakReference<AtomicBoolean> f6120d;
        /* renamed from: e */
        private final WeakReference<C3835a> f6121e;
        /* renamed from: f */
        private boolean f6122f = false;

        /* renamed from: com.facebook.ads.internal.view.b.a$g$1 */
        class C19861 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C1987g f6116a;

            C19861(C1987g c1987g) {
                this.f6116a = c1987g;
            }

            public void run() {
                if (!this.f6116a.f6122f) {
                    this.f6116a.m7481a(null);
                }
            }
        }

        C1987g(WeakReference<C1982b> weakReference, WeakReference<C1958a> weakReference2, WeakReference<C1933t> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<C3835a> weakReference5) {
            this.f6117a = weakReference;
            this.f6118b = weakReference2;
            this.f6119c = weakReference3;
            this.f6120d = weakReference4;
            this.f6121e = weakReference5;
        }

        /* renamed from: a */
        private void m7481a(WebResourceError webResourceError) {
            if (this.f6117a.get() != null) {
                ((C1982b) this.f6117a.get()).mo1417a(webResourceError);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (!(this.f6121e.get() == null || this.f6120d.get() == null || ((AtomicBoolean) this.f6120d.get()).get())) {
                ((C3835a) this.f6121e.get()).m19123e();
            }
            this.f6122f = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            new Handler().postDelayed(new C19861(this), 2000);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f6122f = true;
            m7481a(webResourceError);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Map hashMap = new HashMap();
            if (this.f6118b.get() != null) {
                ((C1958a) this.f6118b.get()).m7419a(hashMap);
            }
            if (this.f6119c.get() != null) {
                hashMap.put("touch", C1921k.m7293a(((C1933t) this.f6119c.get()).m7321e()));
            }
            if (this.f6117a.get() != null) {
                ((C1982b) this.f6117a.get()).mo1418a(str, hashMap);
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$1 */
    class C38331 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C3835a f15280a;

        C38331(C3835a c3835a) {
            this.f15280a = c3835a;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (this.f15280a.f15289i || !this.f15280a.f15287g.m7318b()) {
                this.f15280a.f15287g.m7316a();
            }
            if (this.f15280a.f15282b.get() != null) {
                ((C1982b) this.f15280a.f15282b.get()).mo1419b();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.a$c */
    public static class C3834c implements C1982b {
        /* renamed from: a */
        public void mo1415a() {
        }

        /* renamed from: a */
        public void mo1416a(int i) {
        }

        /* renamed from: a */
        public void mo1417a(WebResourceError webResourceError) {
        }

        /* renamed from: a */
        public void mo1418a(String str, Map<String, String> map) {
        }

        /* renamed from: b */
        public void mo1419b() {
        }
    }

    public C3835a(Context context, WeakReference<C1982b> weakReference, int i) {
        super(context);
        this.f15290j = C1820a.m6868w(context);
        this.f15282b = weakReference;
        this.f15288h = new C38331(this);
        this.f15286f = new C1958a(this, i, this.f15288h);
        setWebChromeClient(mo1407a());
        setWebViewClient(mo1408b());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C1981a(this, (C1982b) weakReference.get(), this.f15286f, this.f15283c, this.f15284d, this.f15290j), "AdControl");
    }

    /* renamed from: d */
    private boolean m19122d() {
        if (this.f15290j) {
            if (!this.f15283c.get()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m19123e() {
        this.f15283c.set(true);
        new Handler(Looper.getMainLooper()).post(new C1984e(this.f15286f));
        if (this.f15285e != null && this.f15285e.get() != null) {
            ((C1983d) this.f15285e.get()).mo1485b();
        }
    }

    /* renamed from: a */
    protected WebChromeClient mo1407a() {
        return new C1985f();
    }

    /* renamed from: a */
    public void m19125a(int i, int i2) {
        if (this.f15286f != null) {
            this.f15286f.m7418a(i);
            this.f15286f.m7420b(i2);
        }
    }

    /* renamed from: b */
    protected WebViewClient mo1408b() {
        return new C1987g(this.f15282b, new WeakReference(this.f15286f), new WeakReference(this.f15287g), new WeakReference(this.f15284d), new WeakReference(this));
    }

    public void destroy() {
        if (this.f15286f != null) {
            this.f15286f.m7422c();
            this.f15286f = null;
        }
        C1936w.m7332b(this);
        this.f15288h = null;
        this.f15287g = null;
        C1945b.m7352a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.f15287g.m7321e();
    }

    public C1933t getTouchDataRecorder() {
        return this.f15287g;
    }

    public C1958a getViewabilityChecker() {
        return this.f15286f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f15287g.m7317a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f15282b.get() != null) {
            ((C1982b) this.f15282b.get()).mo1416a(i);
        }
        if (this.f15286f != null) {
            if (i == 0 && m19122d()) {
                this.f15286f.m7417a();
            } else if (i == 8) {
                this.f15286f.m7422c();
            }
        }
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.f15284d.set(z);
    }

    public void setLogMultipleImpressions(boolean z) {
        this.f15289i = z;
    }

    public void setOnAssetsLoadedListener(C1983d c1983d) {
        this.f15285e = new WeakReference(c1983d);
    }

    public void setWaitForAssetsToLoad(boolean z) {
        this.f15290j = z;
    }
}
