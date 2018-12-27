package com.facebook.ads.internal.view.p115e;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p091j.C1814c;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import com.facebook.ads.internal.p101q.p104c.C1950e;
import com.facebook.ads.internal.p101q.p104c.C1950e.C1949a;
import com.facebook.ads.internal.p101q.p104c.C1951f;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.component.C2013a;
import com.facebook.ads.internal.view.component.C2017e;
import com.facebook.ads.internal.view.component.C2020h;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C3835a;
import com.facebook.ads.internal.view.p109b.C3835a.C1982b;
import com.facebook.ads.internal.view.p109b.C3835a.C3834c;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.internal.view.e.b */
public class C2027b {
    /* renamed from: a */
    private static final String f6272a = "b";
    /* renamed from: b */
    private static final int f6273b = ((int) (C1936w.f5934b * 4.0f));
    /* renamed from: c */
    private static final int f6274c = ((int) (C1936w.f5934b * 72.0f));
    /* renamed from: d */
    private static final int f6275d = ((int) (C1936w.f5934b * 8.0f));
    /* renamed from: e */
    private final Context f6276e;
    /* renamed from: f */
    private final C1827c f6277f;
    /* renamed from: g */
    private final C1736k f6278g;
    /* renamed from: h */
    private final String f6279h;
    /* renamed from: i */
    private final C1727d f6280i;
    /* renamed from: j */
    private final C1958a f6281j;
    /* renamed from: k */
    private final C1933t f6282k;
    /* renamed from: l */
    private Executor f6283l = AsyncTask.THREAD_POOL_EXECUTOR;
    /* renamed from: m */
    private C1965a f6284m;
    /* renamed from: n */
    private C3835a f6285n;
    /* renamed from: o */
    private C1982b f6286o;

    /* renamed from: com.facebook.ads.internal.view.e.b$a */
    public enum C2026a {
        SCREENSHOTS,
        MARKUP,
        INFO
    }

    /* renamed from: com.facebook.ads.internal.view.e.b$2 */
    class C38532 implements C1949a {
        /* renamed from: a */
        final /* synthetic */ C2027b f15378a;

        C38532(C2027b c2027b) {
            this.f15378a = c2027b;
        }

        /* renamed from: a */
        public void mo1437a() {
            if (this.f15378a.f6284m != null) {
                this.f15378a.f6284m.mo1280a(C2041z.REWARD_SERVER_FAILED.m7604a());
            }
        }

        /* renamed from: a */
        public void mo1438a(C1951f c1951f) {
            if (this.f15378a.f6284m != null) {
                C1965a b;
                C2041z c2041z;
                if (c1951f == null || !c1951f.m7372a()) {
                    b = this.f15378a.f6284m;
                    c2041z = C2041z.REWARD_SERVER_FAILED;
                } else {
                    b = this.f15378a.f6284m;
                    c2041z = C2041z.REWARD_SERVER_SUCCESS;
                }
                b.mo1280a(c2041z.m7604a());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.e.b$1 */
    class C46121 extends C3834c {
        /* renamed from: a */
        final /* synthetic */ C2027b f19160a;

        /* renamed from: com.facebook.ads.internal.view.e.b$1$1 */
        class C20241 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C46121 f6266a;

            C20241(C46121 c46121) {
                this.f6266a = c46121;
            }

            public void run() {
                if (this.f6266a.f19160a.f6285n != null) {
                    if (!this.f6266a.f19160a.f6285n.m7350c()) {
                        C3835a f = this.f6266a.f19160a.f6285n;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("javascript:");
                        stringBuilder.append(this.f6266a.f19160a.f6278g.m6582f().m6537c());
                        f.loadUrl(stringBuilder.toString());
                        return;
                    }
                }
                Log.w(C2027b.f6272a, "Webview already destroyed, cannot activate");
            }
        }

        C46121(C2027b c2027b) {
            this.f19160a = c2027b;
        }

        /* renamed from: a */
        public void mo1415a() {
            if (this.f19160a.f6285n != null && !TextUtils.isEmpty(this.f19160a.f6278g.m6582f().m6537c())) {
                this.f19160a.f6285n.post(new C20241(this));
            }
        }

        /* renamed from: a */
        public void mo1418a(String str, Map<String, String> map) {
            Uri parse = Uri.parse(str);
            if ("fbad".equals(parse.getScheme()) && parse.getAuthority().equals("close")) {
                this.f19160a.m7592g();
                return;
            }
            if ("fbad".equals(parse.getScheme()) && C1713c.m6463a(parse.getAuthority()) && this.f19160a.f6284m != null) {
                this.f19160a.f6284m.mo1280a(C2041z.REWARDED_VIDEO_AD_CLICK.m7604a());
            }
            C1712b a = C1713c.m6462a(this.f19160a.f6276e, this.f19160a.f6277f, this.f19160a.f6278g.m6583g(), parse, map);
            if (a != null) {
                try {
                    a.mo1328b();
                } catch (Throwable e) {
                    Log.e(C2027b.f6272a, "Error executing action", e);
                }
            }
        }
    }

    public C2027b(Context context, C1827c c1827c, C1736k c1736k, C1965a c1965a, C1958a c1958a, C1933t c1933t) {
        this.f6276e = context;
        this.f6277f = c1827c;
        this.f6278g = c1736k;
        this.f6284m = c1965a;
        this.f6279h = C1814c.m6825a(this.f6278g.m6582f().m6536b());
        this.f6280i = this.f6278g.m6580d().m6481a();
        this.f6281j = c1958a;
        this.f6282k = c1933t;
    }

    /* renamed from: g */
    private void m7592g() {
        if (this.f6284m != null) {
            this.f6284m.mo1280a(C2041z.REWARDED_VIDEO_END_ACTIVITY.m7604a());
        }
    }

    /* renamed from: h */
    private View m7593h() {
        View c2020h = new C2020h(this.f6276e, this.f6280i, true, false, false);
        c2020h.m7580a(this.f6278g.m6577b().m6520a(), this.f6278g.m6577b().m6522c(), false, true);
        c2020h.setAlignment(17);
        View c2013a = new C2013a(this.f6276e, true, false, C2041z.REWARDED_VIDEO_AD_CLICK.m7604a(), this.f6280i, this.f6277f, this.f6284m, this.f6281j, this.f6282k);
        c2013a.m7577a(this.f6278g.m6579c(), this.f6278g.m6583g(), new HashMap());
        ImageView c2017e = new C2017e(this.f6276e);
        C1936w.m7328a((View) c2017e, 0);
        c2017e.setRadius(50);
        new C1991d(c2017e).m7499a().m7503a(this.f6278g.m6574a().m6564b());
        View linearLayout = new LinearLayout(this.f6276e);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2017e, new LayoutParams(f6274c, f6274c));
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(0, f6275d, 0, f6275d);
        linearLayout.addView(c2020h, layoutParams);
        linearLayout.addView(c2013a, layoutParams);
        return linearLayout;
    }

    /* renamed from: i */
    private View m7594i() {
        View recyclerView = new RecyclerView(this.f6276e);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f6276e, 0, false));
        recyclerView.setAdapter(new C3854c(this.f6278g.m6582f().m6538d(), f6273b));
        return recyclerView;
    }

    /* renamed from: j */
    private View m7595j() {
        this.f6286o = new C46121(this);
        this.f6285n = new C3835a(this.f6276e, new WeakReference(this.f6286o), 1);
        this.f6285n.loadDataWithBaseURL(C1945b.m7351a(), this.f6279h, "text/html", "utf-8", null);
        return this.f6285n;
    }

    /* renamed from: a */
    public boolean m7596a() {
        return m7597b() == C2026a.MARKUP;
    }

    /* renamed from: b */
    public C2026a m7597b() {
        return !this.f6278g.m6582f().m6538d().isEmpty() ? C2026a.SCREENSHOTS : !TextUtils.isEmpty(this.f6279h) ? C2026a.MARKUP : C2026a.INFO;
    }

    /* renamed from: c */
    public Pair<C2026a, View> m7598c() {
        C2026a b = m7597b();
        switch (b) {
            case MARKUP:
                return new Pair(b, m7595j());
            case SCREENSHOTS:
                return new Pair(b, m7594i());
            default:
                return new Pair(b, m7593h());
        }
    }

    /* renamed from: d */
    public void m7599d() {
        if (!TextUtils.isEmpty(this.f6278g.m6582f().m6534a())) {
            C1950e c1950e = new C1950e(this.f6276e, new HashMap());
            c1950e.m7370a(new C38532(this));
            c1950e.executeOnExecutor(this.f6283l, new String[]{r0});
        }
    }

    /* renamed from: e */
    public void m7600e() {
        if (this.f6285n != null) {
            this.f6285n.destroy();
            this.f6285n = null;
            this.f6286o = null;
        }
    }
}
