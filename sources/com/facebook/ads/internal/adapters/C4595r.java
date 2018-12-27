package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.C1700b;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p081a.C1716e;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p104c.C1945b;
import com.facebook.ads.internal.protocol.C1899e;
import com.facebook.ads.internal.view.p109b.C3835a;
import com.facebook.ads.internal.view.p109b.C3835a.C1982b;
import com.facebook.ads.internal.view.p109b.C3835a.C3834c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.r */
public class C4595r extends C3767b {
    /* renamed from: a */
    private static final String f19026a = "r";
    /* renamed from: b */
    private C1982b f19027b;
    /* renamed from: c */
    private C3835a f19028c;
    /* renamed from: d */
    private aa f19029d;
    /* renamed from: e */
    private C1742c f19030e;
    /* renamed from: f */
    private Map<String, Object> f19031f;
    /* renamed from: g */
    private C1827c f19032g;
    /* renamed from: h */
    private Context f19033h;
    /* renamed from: i */
    private long f19034i;
    /* renamed from: j */
    private C1810a f19035j;

    /* renamed from: com.facebook.ads.internal.adapters.r$2 */
    class C37812 extends C1750n {
        /* renamed from: a */
        final /* synthetic */ C4595r f15162a;

        C37812(C4595r c4595r) {
            this.f15162a = c4595r;
        }

        /* renamed from: a */
        public void mo1339a() {
            if (this.f15162a.f19030e != null) {
                this.f15162a.f19030e.mo1308a(this.f15162a);
            }
        }
    }

    /* renamed from: a */
    private void m25359a(C1804d c1804d) {
        this.f19034i = 0;
        this.f19035j = null;
        final C3791z a = C3791z.m18950a((JSONObject) this.f19031f.get("data"));
        if (C1716e.m6469a(this.f19033h, a, this.f19032g)) {
            this.f19030e.mo1310a((C3767b) this, C1700b.f5120b);
            return;
        }
        this.f19027b = new C3834c(this) {
            /* renamed from: b */
            final /* synthetic */ C4595r f19025b;

            /* renamed from: a */
            public void mo1415a() {
                this.f19025b.f19029d.m18846b();
            }

            /* renamed from: a */
            public void mo1416a(int i) {
                if (i == 0 && this.f19025b.f19034i > 0 && this.f19025b.f19035j != null) {
                    C1813b.m6823a(C1812a.m6818a(this.f19025b.f19034i, this.f19025b.f19035j, a.m18959g()));
                    this.f19025b.f19034i = 0;
                    this.f19025b.f19035j = null;
                }
            }

            /* renamed from: a */
            public void mo1418a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && C1713c.m6463a(parse.getAuthority()) && this.f19025b.f19030e != null) {
                    this.f19025b.f19030e.mo1311b(this.f19025b);
                }
                C1712b a = C1713c.m6462a(this.f19025b.f19033h, this.f19025b.f19032g, a.mo1346c(), parse, map);
                if (a != null) {
                    try {
                        this.f19025b.f19035j = a.mo1329a();
                        this.f19025b.f19034i = System.currentTimeMillis();
                        a.mo1328b();
                    } catch (Throwable e) {
                        Log.e(C4595r.f19026a, "Error executing action", e);
                    }
                }
            }

            /* renamed from: b */
            public void mo1419b() {
                if (this.f19025b.f19029d != null) {
                    this.f19025b.f19029d.m6633a();
                }
            }
        };
        this.f19028c = new C3835a(this.f19033h, new WeakReference(this.f19027b), c1804d.m6799f());
        this.f19028c.m19125a(c1804d.m6801h(), c1804d.m6802i());
        this.f19029d = new aa(this.f19033h, this.f19032g, this.f19028c, this.f19028c.getViewabilityChecker(), new C37812(this));
        this.f19029d.m18844a(a);
        this.f19028c.loadDataWithBaseURL(C1945b.m7351a(), a.m18956d(), "text/html", "utf-8", null);
        if (this.f19030e != null) {
            this.f19030e.mo1309a((C3767b) this, this.f19028c);
        }
    }

    /* renamed from: a */
    public void mo3970a(Context context, C1827c c1827c, C1899e c1899e, C1742c c1742c, Map<String, Object> map) {
        this.f19033h = context;
        this.f19032g = c1827c;
        this.f19030e = c1742c;
        this.f19031f = map;
        m25359a((C1804d) this.f19031f.get("definition"));
    }

    /* renamed from: e */
    public void mo3946e() {
        if (this.f19028c != null) {
            this.f19028c.destroy();
            this.f19028c = null;
            this.f19027b = null;
        }
    }
}
