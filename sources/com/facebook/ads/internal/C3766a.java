package com.facebook.ads.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSettings.TestAdType;
import com.facebook.ads.C1700b;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1742c;
import com.facebook.ads.internal.adapters.C1743e;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.adapters.C1748l;
import com.facebook.ads.internal.adapters.C1753p;
import com.facebook.ads.internal.adapters.C3767b;
import com.facebook.ads.internal.adapters.C3768d;
import com.facebook.ads.internal.adapters.C3770j;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.adapters.af;
import com.facebook.ads.internal.adapters.ag;
import com.facebook.ads.internal.adapters.ai;
import com.facebook.ads.internal.adapters.aj;
import com.facebook.ads.internal.p089h.C1801a;
import com.facebook.ads.internal.p089h.C1803c;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p089h.C1805e;
import com.facebook.ads.internal.p090i.C1806a;
import com.facebook.ads.internal.p090i.C1809c;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p094m.C3799d;
import com.facebook.ads.internal.p096o.C1847b;
import com.facebook.ads.internal.p096o.C1851c;
import com.facebook.ads.internal.p096o.C1851c.C1850a;
import com.facebook.ads.internal.p096o.C3812g;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.p101q.p102a.C1922l;
import com.facebook.ads.internal.p101q.p102a.C1925o;
import com.facebook.ads.internal.p101q.p102a.C1937x;
import com.facebook.ads.internal.p101q.p104c.C1950e;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import com.facebook.ads.internal.p101q.p106e.C1955a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1895b;
import com.facebook.ads.internal.protocol.C1897c;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1899e;
import com.facebook.ads.internal.protocol.C1900f;
import com.facebook.ads.internal.protocol.C1904h;
import com.facebook.ads.p080a.C1698a;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a */
public class C3766a implements C1850a {
    /* renamed from: b */
    private static final String f15098b = C3766a.class.getSimpleName();
    /* renamed from: h */
    private static final Handler f15099h = new Handler(Looper.getMainLooper());
    /* renamed from: i */
    private static boolean f15100i = false;
    /* renamed from: A */
    private boolean f15101A;
    /* renamed from: B */
    private final C1827c f15102B;
    /* renamed from: C */
    private final EnumSet<CacheFlag> f15103C;
    /* renamed from: a */
    protected C1746h f15104a;
    /* renamed from: c */
    private final Context f15105c;
    /* renamed from: d */
    private final String f15106d;
    /* renamed from: e */
    private final AdPlacementType f15107e;
    /* renamed from: f */
    private final C1851c f15108f;
    /* renamed from: g */
    private final Handler f15109g;
    /* renamed from: j */
    private final Runnable f15110j;
    /* renamed from: k */
    private final Runnable f15111k;
    /* renamed from: l */
    private volatile boolean f15112l;
    /* renamed from: m */
    private boolean f15113m;
    /* renamed from: n */
    private volatile boolean f15114n;
    /* renamed from: o */
    private C1737a f15115o;
    /* renamed from: p */
    private C1737a f15116p;
    /* renamed from: q */
    private View f15117q;
    /* renamed from: r */
    private C1803c f15118r;
    /* renamed from: s */
    private C1847b f15119s;
    /* renamed from: t */
    private C1900f f15120t;
    /* renamed from: u */
    private C1898d f15121u;
    /* renamed from: v */
    private C1899e f15122v;
    /* renamed from: w */
    private int f15123w;
    /* renamed from: x */
    private boolean f15124x;
    /* renamed from: y */
    private int f15125y;
    /* renamed from: z */
    private final C1710c f15126z;

    /* renamed from: com.facebook.ads.internal.a$8 */
    class C17098 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3766a f5145a;

        C17098(C3766a c3766a) {
            this.f5145a = c3766a;
        }

        public void run() {
            try {
                this.f5145a.m18824i();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.a$c */
    private class C1710c extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C3766a f5146a;

        private C1710c(C3766a c3766a) {
            this.f5146a = c3766a;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                this.f5146a.m18827k();
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                this.f5146a.m18825j();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.a$9 */
    class C37609 implements C1698a {
        /* renamed from: a */
        final /* synthetic */ C3766a f15091a;

        C37609(C3766a c3766a) {
            this.f15091a = c3766a;
        }

        /* renamed from: a */
        public void mo1322a(ac acVar) {
            this.f15091a.f15116p = acVar;
            this.f15091a.f15114n = false;
            this.f15091a.f15104a.mo1276a((C1737a) acVar);
        }

        /* renamed from: a */
        public void mo1323a(ac acVar, View view) {
            this.f15091a.f15104a.mo1275a(view);
        }

        /* renamed from: a */
        public void mo1324a(ac acVar, C1700b c1700b) {
            this.f15091a.f15104a.mo1277a(new C1894a(c1700b.m6435a(), c1700b.m6436b()));
        }

        /* renamed from: b */
        public void mo1325b(ac acVar) {
            this.f15091a.f15104a.mo1274a();
        }

        /* renamed from: c */
        public void mo1326c(ac acVar) {
            this.f15091a.f15104a.mo1278b();
        }

        /* renamed from: d */
        public void mo1327d(ac acVar) {
            this.f15091a.f15104a.mo1286c();
        }
    }

    /* renamed from: com.facebook.ads.internal.a$a */
    private static final class C3761a extends C1937x<C3766a> {
        public C3761a(C3766a c3766a) {
            super(c3766a);
        }

        public void run() {
            C3766a c3766a = (C3766a) m7333a();
            if (c3766a != null) {
                c3766a.f15112l = false;
                c3766a.m18811b(null);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.a$b */
    private static final class C3762b extends C1937x<C3766a> {
        public C3762b(C3766a c3766a) {
            super(c3766a);
        }

        public void run() {
            C3766a c3766a = (C3766a) m7333a();
            if (c3766a != null) {
                c3766a.m18825j();
            }
        }
    }

    static {
        C1909d.m7257a();
    }

    public C3766a(Context context, String str, C1900f c1900f, AdPlacementType adPlacementType, C1899e c1899e, C1898d c1898d, int i, boolean z) {
        this(context, str, c1900f, adPlacementType, c1899e, c1898d, i, z, EnumSet.of(CacheFlag.NONE));
    }

    public C3766a(Context context, String str, C1900f c1900f, AdPlacementType adPlacementType, C1899e c1899e, C1898d c1898d, int i, boolean z, EnumSet<CacheFlag> enumSet) {
        this.f15109g = new Handler();
        this.f15124x = false;
        this.f15125y = -1;
        this.f15105c = context.getApplicationContext();
        this.f15106d = str;
        this.f15120t = c1900f;
        this.f15107e = adPlacementType;
        this.f15122v = c1899e;
        this.f15121u = c1898d;
        this.f15123w = i;
        this.f15126z = new C1710c();
        this.f15103C = enumSet;
        this.f15108f = new C1851c(this.f15105c);
        this.f15108f.m7066a((C1850a) this);
        this.f15110j = new C3761a(this);
        this.f15111k = new C3762b(this);
        this.f15113m = z;
        m18816e();
        try {
            CookieManager.getInstance();
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.f15105c);
            }
        } catch (Throwable e) {
            Log.w(f15098b, "Failed to initialize CookieManager.", e);
        }
        C1806a.m6805a(this.f15105c).m6806a();
        this.f15102B = C3799d.m18991a(this.f15105c);
    }

    /* renamed from: a */
    private Map<String, String> m18796a(long j) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("delay", String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* renamed from: a */
    private void m18801a(C1737a c1737a) {
        if (c1737a != null) {
            c1737a.mo3946e();
        }
    }

    /* renamed from: a */
    private void m18802a(ac acVar, C1803c c1803c, Map<String, Object> map) {
        acVar.mo3971a(this.f15105c, new C37609(this), map, this.f15102B, this.f15103C);
    }

    /* renamed from: a */
    private void m18803a(ai aiVar, C1803c c1803c, C1801a c1801a, Map<String, Object> map) {
        final ai aiVar2 = aiVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final C1801a c1801a2 = c1801a;
        Runnable c17064 = new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C3766a f5141d;

            public void run() {
                this.f5141d.m18801a(aiVar2);
                if (aiVar2 instanceof af) {
                    Context h = this.f5141d.f15105c;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(ag.m6591a(((af) aiVar2).mo3967x()));
                    stringBuilder.append(" Failed. Ad request timed out");
                    C1909d.m7258a(h, stringBuilder.toString());
                }
                Map a = this.f5141d.m18796a(currentTimeMillis);
                a.put("error", "-1");
                a.put("msg", "timeout");
                this.f5141d.m18807a(c1801a2.m6784a(C1805e.REQUEST), a);
                this.f5141d.m18822h();
            }
        };
        this.f15109g.postDelayed(c17064, (long) c1803c.m6789a().m6803j());
        final Runnable runnable = c17064;
        aiVar.mo3940a(this.f15105c, new aj(this) {
            /* renamed from: a */
            boolean f15084a = false;
            /* renamed from: b */
            boolean f15085b = false;
            /* renamed from: c */
            boolean f15086c = false;
            /* renamed from: g */
            final /* synthetic */ C3766a f15090g;

            /* renamed from: a */
            public void mo1318a(ai aiVar) {
                if (aiVar == this.f15090g.f15115o) {
                    this.f15090g.f15109g.removeCallbacks(runnable);
                    this.f15090g.f15116p = aiVar;
                    this.f15090g.f15104a.mo1276a((C1737a) aiVar);
                    if (!this.f15084a) {
                        this.f15084a = true;
                        this.f15090g.m18807a(c1801a2.m6784a(C1805e.REQUEST), this.f15090g.m18796a(currentTimeMillis));
                    }
                }
            }

            /* renamed from: a */
            public void mo1319a(ai aiVar, C1894a c1894a) {
                if (aiVar == this.f15090g.f15115o) {
                    this.f15090g.f15109g.removeCallbacks(runnable);
                    this.f15090g.m18801a((C1737a) aiVar);
                    if (!this.f15084a) {
                        this.f15084a = true;
                        Map a = this.f15090g.m18796a(currentTimeMillis);
                        a.put("error", String.valueOf(c1894a.m7230a().m7224a()));
                        a.put("msg", String.valueOf(c1894a.m7231b()));
                        this.f15090g.m18807a(c1801a2.m6784a(C1805e.REQUEST), a);
                    }
                    this.f15090g.m18822h();
                }
            }

            /* renamed from: b */
            public void mo1320b(ai aiVar) {
                if (!this.f15085b) {
                    this.f15085b = true;
                    this.f15090g.m18807a(c1801a2.m6784a(C1805e.IMPRESSION), null);
                }
            }

            /* renamed from: c */
            public void mo1321c(ai aiVar) {
                if (!this.f15086c) {
                    this.f15086c = true;
                    this.f15090g.m18807a(c1801a2.m6784a(C1805e.CLICK), null);
                }
                if (this.f15090g.f15104a != null) {
                    this.f15090g.f15104a.mo1274a();
                }
            }
        }, this.f15102B, map, NativeAdBase.m18719f());
    }

    /* renamed from: a */
    private void m18804a(final C3767b c3767b, C1803c c1803c, Map<String, Object> map) {
        final Runnable anonymousClass11 = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f5133b;

            public void run() {
                this.f5133b.m18801a(c3767b);
                this.f5133b.m18822h();
            }
        };
        this.f15109g.postDelayed(anonymousClass11, (long) c1803c.m6789a().m6803j());
        c3767b.mo3970a(this.f15105c, this.f15102B, this.f15122v, new C1742c(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f15081b;

            /* renamed from: a */
            public void mo1308a(C3767b c3767b) {
                this.f15081b.f15104a.mo1278b();
            }

            /* renamed from: a */
            public void mo1309a(C3767b c3767b, View view) {
                if (c3767b == this.f15081b.f15115o) {
                    this.f15081b.f15109g.removeCallbacks(anonymousClass11);
                    C1737a f = this.f15081b.f15116p;
                    this.f15081b.f15116p = c3767b;
                    this.f15081b.f15117q = view;
                    if (this.f15081b.f15114n) {
                        this.f15081b.f15104a.mo1275a(view);
                        this.f15081b.m18801a(f);
                    } else {
                        this.f15081b.f15104a.mo1276a((C1737a) c3767b);
                    }
                }
            }

            /* renamed from: a */
            public void mo1310a(C3767b c3767b, C1700b c1700b) {
                if (c3767b == this.f15081b.f15115o) {
                    this.f15081b.f15109g.removeCallbacks(anonymousClass11);
                    this.f15081b.m18801a((C1737a) c3767b);
                    this.f15081b.m18822h();
                }
            }

            /* renamed from: b */
            public void mo1311b(C3767b c3767b) {
                this.f15081b.f15104a.mo1274a();
            }
        }, map);
    }

    /* renamed from: a */
    private void m18805a(final C3768d c3768d, C1803c c1803c, Map<String, Object> map) {
        final Runnable c17052 = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f5137b;

            public void run() {
                this.f5137b.m18801a(c3768d);
                this.f5137b.m18822h();
            }
        };
        this.f15109g.postDelayed(c17052, (long) c1803c.m6789a().m6803j());
        c3768d.mo3968a(this.f15105c, new C1743e(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f15083b;

            /* renamed from: a */
            public void mo1312a(C3768d c3768d) {
                if (c3768d == this.f15083b.f15115o) {
                    if (c3768d == null) {
                        C1953a.m7382a(this.f15083b.f15105c, "api", C1954b.f5988b, new C1895b(AdErrorType.NO_ADAPTER_ON_LOAD, "Adapter is null on loadInterstitialAd"));
                        mo1313a(c3768d, C1700b.f5123e);
                        return;
                    }
                    this.f15083b.f15109g.removeCallbacks(c17052);
                    this.f15083b.f15116p = c3768d;
                    this.f15083b.f15104a.mo1276a((C1737a) c3768d);
                    this.f15083b.m18825j();
                }
            }

            /* renamed from: a */
            public void mo1313a(C3768d c3768d, C1700b c1700b) {
                if (c3768d == this.f15083b.f15115o) {
                    this.f15083b.f15109g.removeCallbacks(c17052);
                    this.f15083b.m18801a((C1737a) c3768d);
                    this.f15083b.m18822h();
                    this.f15083b.f15104a.mo1277a(new C1894a(c1700b.m6435a(), c1700b.m6436b()));
                }
            }

            /* renamed from: a */
            public void mo1314a(C3768d c3768d, String str, boolean z) {
                this.f15083b.f15104a.mo1274a();
                int isEmpty = TextUtils.isEmpty(str) ^ 1;
                if (z && isEmpty != 0) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!(this.f15083b.f15119s.f5644b instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.setData(Uri.parse(str));
                    this.f15083b.f15119s.f5644b.startActivity(intent);
                }
            }

            /* renamed from: b */
            public void mo1315b(C3768d c3768d) {
                this.f15083b.f15104a.mo1278b();
            }

            /* renamed from: c */
            public void mo1316c(C3768d c3768d) {
                this.f15083b.f15104a.mo1298d();
            }

            /* renamed from: d */
            public void mo1317d(C3768d c3768d) {
                this.f15083b.f15104a.mo1299e();
            }
        }, map, this.f15102B, this.f15103C);
    }

    /* renamed from: a */
    private void m18806a(C3770j c3770j, C1803c c1803c, Map<String, Object> map) {
        c3770j.mo3973a(this.f15105c, new C1748l(this) {
            /* renamed from: a */
            final /* synthetic */ C3766a f15079a;

            {
                this.f15079a = r1;
            }

            /* renamed from: a */
            public void mo1300a() {
                this.f15079a.f15104a.mo1487g();
            }

            /* renamed from: a */
            public void mo1301a(C3770j c3770j) {
                this.f15079a.f15116p = c3770j;
                this.f15079a.f15104a.mo1276a((C1737a) c3770j);
            }

            /* renamed from: a */
            public void mo1302a(C3770j c3770j, C1700b c1700b) {
                this.f15079a.f15104a.mo1277a(new C1894a(AdErrorType.INTERNAL_ERROR, null));
                this.f15079a.m18801a((C1737a) c3770j);
                this.f15079a.m18822h();
            }

            /* renamed from: b */
            public void mo1303b(C3770j c3770j) {
                this.f15079a.f15104a.mo1274a();
            }

            /* renamed from: c */
            public void mo1304c(C3770j c3770j) {
                this.f15079a.f15104a.mo1278b();
            }

            /* renamed from: d */
            public void mo1305d(C3770j c3770j) {
                this.f15079a.f15104a.mo1486f();
            }

            /* renamed from: e */
            public void mo1306e(C3770j c3770j) {
                this.f15079a.f15104a.mo1488h();
            }

            /* renamed from: f */
            public void mo1307f(C3770j c3770j) {
                this.f15079a.f15104a.mo1489i();
            }
        }, map, this.f15124x);
    }

    /* renamed from: a */
    private void m18807a(List<String> list, Map<String, String> map) {
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            for (String str : list) {
                new C1950e(this.f15105c, map).execute(new String[]{str});
            }
        }
    }

    /* renamed from: b */
    private void m18811b(String str) {
        try {
            r1.f15119s = new C1847b(r1.f15105c, new C1809c(r1.f15105c, false), r1.f15106d, r1.f15122v != null ? new C1922l(r1.f15122v.m7239b(), r1.f15122v.m7238a()) : null, r1.f15120t, r1.f15121u, AdSettings.m6379c() != TestAdType.DEFAULT ? AdSettings.m6379c().m6373a() : null, C1753p.m6639a(C1897c.m7234a(r1.f15120t).m7235a()), r1.f15123w, AdSettings.m6377a(r1.f15105c), AdSettings.m6378b(), new C1904h(this.f15105c, str, r1.f15106d, r1.f15120t), C1925o.m7303a(C1820a.m6863r(r1.f15105c)));
            r1.f15108f.m7065a(r1.f15119s);
        } catch (C1895b e) {
            mo1331a(C1894a.m7229a(e));
        }
    }

    /* renamed from: e */
    private void m18816e() {
        if (!this.f15113m) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f15105c.registerReceiver(this.f15126z, intentFilter);
            this.f15101A = true;
        }
    }

    /* renamed from: f */
    private void m18818f() {
        if (this.f15101A) {
            try {
                this.f15105c.unregisterReceiver(this.f15126z);
                this.f15101A = false;
            } catch (Throwable e) {
                C1813b.m6823a(C1812a.m6820a(e, "Error unregistering screen state receiever"));
            }
        }
    }

    /* renamed from: g */
    private AdPlacementType m18819g() {
        return this.f15107e != null ? this.f15107e : this.f15122v == null ? AdPlacementType.NATIVE : this.f15122v == C1899e.INTERSTITIAL ? AdPlacementType.INTERSTITIAL : AdPlacementType.BANNER;
    }

    /* renamed from: h */
    private synchronized void m18822h() {
        f15099h.post(new C17098(this));
    }

    /* renamed from: i */
    private void m18824i() {
        this.f15115o = null;
        C1803c c1803c = this.f15118r;
        C1801a c = c1803c.m6792c();
        if (c == null) {
            this.f15104a.mo1277a(C1894a.m7228a(AdErrorType.NO_FILL, ""));
            m18825j();
            return;
        }
        String a = c.m6783a();
        C1737a a2 = C1753p.m6638a(a, c1803c.m6789a().m6795b());
        if (a2 == null) {
            String str = f15098b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adapter does not exist: ");
            stringBuilder.append(a);
            Log.e(str, stringBuilder.toString());
            m18822h();
        } else if (m18819g() != a2.mo1333d()) {
            this.f15104a.mo1277a(C1894a.m7228a(AdErrorType.INTERNAL_ERROR, ""));
        } else {
            this.f15115o = a2;
            Map hashMap = new HashMap();
            C1804d a3 = c1803c.m6789a();
            hashMap.put("data", c.m6785b());
            hashMap.put("definition", a3);
            hashMap.put("placementId", this.f15106d);
            hashMap.put("requestTime", Long.valueOf(a3.m6794a()));
            if (this.f15119s == null) {
                this.f15104a.mo1277a(C1894a.m7228a(AdErrorType.UNKNOWN_ERROR, "environment is empty"));
                return;
            }
            switch (a2.mo1333d()) {
                case INTERSTITIAL:
                    m18805a((C3768d) a2, c1803c, hashMap);
                    break;
                case BANNER:
                    m18804a((C3767b) a2, c1803c, hashMap);
                    break;
                case NATIVE:
                case NATIVE_BANNER:
                    m18803a((ai) a2, c1803c, c, hashMap);
                    break;
                case INSTREAM:
                    m18802a((ac) a2, c1803c, hashMap);
                    break;
                case REWARDED_VIDEO:
                    m18806a((C3770j) a2, c1803c, hashMap);
                    break;
                default:
                    Log.e(f15098b, "attempt unexpected adapter type");
                    break;
            }
        }
    }

    /* renamed from: j */
    private void m18825j() {
        if (!this.f15113m) {
            if (!this.f15112l) {
                if (C17087.f5144a[m18819g().ordinal()] == 1) {
                    if (!C1955a.m7385a(this.f15105c)) {
                        this.f15109g.postDelayed(this.f15111k, 1000);
                    }
                    long c = this.f15118r == null ? 30000 : this.f15118r.m6789a().m6796c();
                    if (c > 0) {
                        this.f15109g.postDelayed(this.f15110j, c);
                        this.f15112l = true;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m18827k() {
        if (this.f15112l) {
            this.f15109g.removeCallbacks(this.f15110j);
            this.f15112l = false;
        }
    }

    /* renamed from: l */
    private Handler m18828l() {
        return !C3766a.m18829m() ? this.f15109g : f15099h;
    }

    /* renamed from: m */
    private static synchronized boolean m18829m() {
        boolean z;
        synchronized (C3766a.class) {
            z = f15100i;
        }
        return z;
    }

    /* renamed from: a */
    public C1804d m18830a() {
        return this.f15118r == null ? null : this.f15118r.m6789a();
    }

    /* renamed from: a */
    public void m18831a(int i) {
        this.f15125y = i;
    }

    /* renamed from: a */
    public void m18832a(C1746h c1746h) {
        this.f15104a = c1746h;
    }

    /* renamed from: a */
    public synchronized void mo1330a(final C3812g c3812g) {
        m18828l().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f5135b;

            public void run() {
                C1803c a = c3812g.mo1378a();
                if (a == null || a.m6789a() == null) {
                    throw new IllegalStateException("invalid placement in response");
                }
                this.f5135b.f15118r = a;
                this.f5135b.m18822h();
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo1331a(final C1894a c1894a) {
        m18828l().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C3766a f5143b;

            public void run() {
                this.f5143b.f15104a.mo1277a(c1894a);
            }
        });
    }

    /* renamed from: a */
    public void m18835a(String str) {
        m18811b(str);
    }

    /* renamed from: a */
    public void m18836a(boolean z) {
        this.f15124x = z;
    }

    /* renamed from: b */
    public void m18837b() {
        C1746h c1746h;
        AdErrorType adErrorType;
        AdErrorType adErrorType2;
        if (this.f15116p == null) {
            C1953a.m7382a(this.f15105c, "api", C1954b.f5991e, new C1895b(AdErrorType.NO_ADAPTER_ON_START, "Adapter is null on startAd"));
            c1746h = this.f15104a;
            adErrorType = AdErrorType.INTERNAL_ERROR;
            adErrorType2 = AdErrorType.INTERNAL_ERROR;
        } else if (this.f15114n) {
            C1953a.m7382a(this.f15105c, "api", C1954b.f5989c, new C1895b(AdErrorType.AD_ALREADY_STARTED, "ad already started"));
            c1746h = this.f15104a;
            adErrorType = AdErrorType.AD_ALREADY_STARTED;
            adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
        } else {
            this.f15114n = true;
            switch (this.f15116p.mo1333d()) {
                case INTERSTITIAL:
                    ((C3768d) this.f15116p).mo3969a();
                    break;
                case BANNER:
                    if (this.f15117q != null) {
                        this.f15104a.mo1275a(this.f15117q);
                        break;
                    }
                    break;
                case NATIVE:
                case NATIVE_BANNER:
                    ai aiVar = (ai) this.f15116p;
                    if (aiVar.k_()) {
                        this.f15104a.mo1373a(aiVar);
                        break;
                    }
                    throw new IllegalStateException("ad is not ready or already displayed");
                case INSTREAM:
                    ((ac) this.f15116p).mo3972g();
                    break;
                case REWARDED_VIDEO:
                    C3770j c3770j = (C3770j) this.f15116p;
                    c3770j.m18884a(this.f15125y);
                    c3770j.mo3974a();
                    break;
                default:
                    Log.e(f15098b, "start unexpected adapter type");
                    break;
            }
            return;
        }
        c1746h.mo1277a(C1894a.m7228a(adErrorType, adErrorType2.m7225b()));
    }

    /* renamed from: b */
    public void m18838b(boolean z) {
        m18818f();
        if (z || this.f15114n) {
            m18827k();
            m18801a(this.f15116p);
            this.f15108f.m7064a();
            this.f15117q = null;
            this.f15114n = false;
        }
    }

    /* renamed from: c */
    public void m18839c() {
        m18838b(false);
    }

    /* renamed from: d */
    public C1737a m18840d() {
        return this.f15116p;
    }
}
