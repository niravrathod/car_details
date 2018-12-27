package com.facebook.ads.internal.p095n;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.facebook.ads.internal.C3766a;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.adapters.C1750n;
import com.facebook.ads.internal.adapters.C3790x;
import com.facebook.ads.internal.adapters.C3790x.C1760a;
import com.facebook.ads.internal.adapters.C4597v;
import com.facebook.ads.internal.adapters.ai;
import com.facebook.ads.internal.adapters.aj;
import com.facebook.ads.internal.p085d.C1774a;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1811b;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1900f;
import com.facebook.ads.internal.settings.C1964b;
import com.facebook.ads.internal.view.C2092u;
import com.facebook.ads.internal.view.C2093w;
import com.facebook.ads.internal.view.p109b.C1990c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.internal.n.d */
public class C1837d {
    /* renamed from: b */
    private static final C1898d f5576b = C1898d.ADS;
    /* renamed from: c */
    private static final String f5577c = C1837d.class.getSimpleName();
    /* renamed from: d */
    private static WeakHashMap<View, WeakReference<C1837d>> f5578d = new WeakHashMap();
    /* renamed from: A */
    private boolean f5579A;
    /* renamed from: B */
    private boolean f5580B;
    /* renamed from: C */
    private boolean f5581C;
    /* renamed from: D */
    private long f5582D;
    /* renamed from: E */
    private C1990c f5583E;
    /* renamed from: F */
    private C1838e f5584F;
    /* renamed from: G */
    private C1760a f5585G;
    /* renamed from: H */
    private View f5586H;
    /* renamed from: a */
    protected ai f5587a;
    /* renamed from: e */
    private final Context f5588e;
    /* renamed from: f */
    private final String f5589f;
    /* renamed from: g */
    private final String f5590g;
    /* renamed from: h */
    private final C1779b f5591h;
    /* renamed from: i */
    private C3810h f5592i;
    /* renamed from: j */
    private final C1836c f5593j;
    /* renamed from: k */
    private C3766a f5594k;
    /* renamed from: l */
    private volatile boolean f5595l;
    /* renamed from: m */
    private C1804d f5596m;
    /* renamed from: n */
    private C1900f f5597n;
    /* renamed from: o */
    private View f5598o;
    /* renamed from: p */
    private final List<View> f5599p;
    /* renamed from: q */
    private OnTouchListener f5600q;
    /* renamed from: r */
    private C1958a f5601r;
    /* renamed from: s */
    private C1957a f5602s;
    /* renamed from: t */
    private WeakReference<C1957a> f5603t;
    /* renamed from: u */
    private final C1933t f5604u;
    /* renamed from: v */
    private C3790x f5605v;
    /* renamed from: w */
    private C1835a f5606w;
    /* renamed from: x */
    private C2093w f5607x;
    /* renamed from: y */
    private C1843l f5608y;
    /* renamed from: z */
    private boolean f5609z;

    /* renamed from: com.facebook.ads.internal.n.d$a */
    private class C1835a implements OnClickListener, OnLongClickListener, OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C1837d f5575a;

        private C1835a(C1837d c1837d) {
            this.f5575a = c1837d;
        }

        public void onClick(View view) {
            if (!this.f5575a.f5604u.m7320d()) {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            int q = C1820a.m6862q(this.f5575a.f5588e);
            if (q < 0 || this.f5575a.f5604u.m7319c() >= ((long) q)) {
                Map hashMap = new HashMap();
                hashMap.put("touch", C1921k.m7293a(this.f5575a.f5604u.m7321e()));
                if (this.f5575a.f5608y != null) {
                    hashMap.put("nti", String.valueOf(this.f5575a.f5608y.m7032a()));
                }
                if (this.f5575a.f5609z) {
                    hashMap.put("nhs", String.valueOf(this.f5575a.f5609z));
                }
                this.f5575a.f5601r.m7419a(hashMap);
                if (this.f5575a.f5587a != null) {
                    this.f5575a.f5587a.mo3944b(hashMap);
                }
                return;
            }
            String str;
            String str2;
            if (this.f5575a.f5604u.m7318b()) {
                str = "FBAudienceNetworkLog";
                str2 = "Clicks happened too fast.";
            } else {
                str = "FBAudienceNetworkLog";
                str2 = "Ad cannot be clicked before it is viewed.";
            }
            Log.e(str, str2);
        }

        public boolean onLongClick(View view) {
            if (this.f5575a.f5598o != null) {
                if (this.f5575a.f5583E != null) {
                    this.f5575a.f5583E.setBounds(0, 0, this.f5575a.f5598o.getWidth(), this.f5575a.f5598o.getHeight());
                    this.f5575a.f5583E.m7495a(this.f5575a.f5583E.m7496a() ^ true);
                    return true;
                }
            }
            return false;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f5575a.f5604u.m7317a(motionEvent, this.f5575a.f5598o, view);
            return this.f5575a.f5600q != null && this.f5575a.f5600q.onTouch(view, motionEvent);
        }
    }

    /* renamed from: com.facebook.ads.internal.n.d$c */
    public interface C1836c {
        /* renamed from: a */
        boolean mo1296a(View view);
    }

    /* renamed from: com.facebook.ads.internal.n.d$1 */
    class C38051 extends C1746h {
        /* renamed from: a */
        final /* synthetic */ C1837d f15237a;

        /* renamed from: com.facebook.ads.internal.n.d$1$1 */
        class C38041 implements aj {
            /* renamed from: a */
            final /* synthetic */ C38051 f15236a;

            C38041(C38051 c38051) {
                this.f15236a = c38051;
            }

            /* renamed from: a */
            public void mo1318a(ai aiVar) {
            }

            /* renamed from: a */
            public void mo1319a(ai aiVar, C1894a c1894a) {
            }

            /* renamed from: b */
            public void mo1320b(ai aiVar) {
            }

            /* renamed from: c */
            public void mo1321c(ai aiVar) {
                if (this.f15236a.f15237a.f5592i != null) {
                    this.f15236a.f15237a.f5592i.m6926b();
                }
            }
        }

        C38051(C1837d c1837d) {
            this.f15237a = c1837d;
        }

        /* renamed from: a */
        public void mo1274a() {
            if (this.f15237a.f5592i != null) {
                this.f15237a.f5592i.m6926b();
            }
        }

        /* renamed from: a */
        public void mo1276a(C1737a c1737a) {
            if (this.f15237a.f5594k != null) {
                this.f15237a.f5594k.m18837b();
            }
        }

        /* renamed from: a */
        public void mo1373a(ai aiVar) {
            C1813b.m6823a(C1812a.m6819a(C1811b.LOADING_AD, this.f15237a.m6978r().toString(), System.currentTimeMillis() - this.f15237a.f5582D, null));
            this.f15237a.m6959a(aiVar, true);
            if (this.f15237a.f5592i != null && aiVar.mo3964u() != null) {
                aj c38041 = new C38041(this);
                for (C1837d a : aiVar.mo3964u()) {
                    a.m6993a(c38041);
                }
            }
        }

        /* renamed from: a */
        public void mo1277a(C1894a c1894a) {
            if (this.f15237a.f5592i != null) {
                this.f15237a.f5592i.m6925a(c1894a);
            }
        }

        /* renamed from: b */
        public void mo1278b() {
            throw new IllegalStateException("Native ads manager their own impressions.");
        }
    }

    /* renamed from: com.facebook.ads.internal.n.d$3 */
    class C38073 implements C2092u {
        /* renamed from: a */
        final /* synthetic */ C1837d f15241a;

        C38073(C1837d c1837d) {
            this.f15241a = c1837d;
        }

        /* renamed from: a */
        public void mo1374a(int i) {
            if (this.f15241a.f5587a != null) {
                this.f15241a.f5587a.mo3939a(i);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.n.d$4 */
    class C38084 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C1837d f15242a;

        C38084(C1837d c1837d) {
            this.f15242a = c1837d;
        }

        /* renamed from: a */
        public void mo1338a() {
            if (!this.f15242a.f5604u.m7318b()) {
                this.f15242a.f5604u.m7316a();
                this.f15242a.f5601r.m7422c();
                if (!(this.f15242a.f5603t == null || this.f15242a.f5603t.get() == null)) {
                    ((C1957a) this.f15242a.f5603t.get()).mo1338a();
                }
                if (this.f15242a.f5605v == null) {
                    return;
                }
                if (this.f15242a.f5598o != null) {
                    this.f15242a.f5605v.m18939a(this.f15242a.f5598o);
                    this.f15242a.f5605v.m18941a(this.f15242a.f5608y);
                    this.f15242a.f5605v.m18944a(this.f15242a.f5609z);
                    this.f15242a.f5605v.m18945b(this.f15242a.f5579A);
                    this.f15242a.f5605v.m18947d(this.f15242a.f5580B);
                    this.f15242a.f5605v.m18946c(this.f15242a.m6988x());
                    this.f15242a.f5605v.m18940a(this.f15242a.f5585G);
                    this.f15242a.f5605v.m18948e(this.f15242a.f5581C);
                    this.f15242a.f5605v.m6633a();
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.n.d$b */
    private class C3809b extends C1750n {
        /* renamed from: a */
        final /* synthetic */ C1837d f15243a;

        private C3809b(C1837d c1837d) {
            this.f15243a = c1837d;
        }

        /* renamed from: a */
        public void mo1339a() {
            if (this.f15243a.f5592i != null) {
                this.f15243a.f5592i.m6927c();
            }
        }

        /* renamed from: b */
        public void mo1375b() {
        }
    }

    public C1837d(Context context, ai aiVar, C1804d c1804d, C1836c c1836c) {
        this(context, null, c1836c);
        this.f5587a = aiVar;
        this.f5596m = c1804d;
        this.f5595l = true;
        this.f5586H = new View(context);
    }

    public C1837d(Context context, String str, C1836c c1836c) {
        this.f5590g = UUID.randomUUID().toString();
        this.f5597n = C1900f.NATIVE_UNKNOWN;
        this.f5599p = new ArrayList();
        this.f5604u = new C1933t();
        this.f5579A = false;
        this.f5580B = false;
        this.f5584F = C1838e.ALL;
        this.f5585G = C1760a.ALL;
        this.f5588e = context;
        this.f5589f = str;
        this.f5593j = c1836c;
        this.f5591h = new C1779b(context);
        this.f5586H = new View(context);
    }

    /* renamed from: a */
    private void m6958a(View view) {
        this.f5599p.add(view);
        view.setOnClickListener(this.f5606w);
        view.setOnTouchListener(this.f5606w);
        if (C1820a.m6846b(view.getContext())) {
            view.setOnLongClickListener(this.f5606w);
        }
    }

    /* renamed from: a */
    private void m6959a(final ai aiVar, final boolean z) {
        if (aiVar != null) {
            if (this.f5584F.equals(C1838e.ALL)) {
                if (aiVar.mo3953k() != null) {
                    this.f5591h.m6689a(aiVar.mo3953k().m7018a(), aiVar.mo3953k().m7020c(), aiVar.mo3953k().m7019b());
                }
                if (aiVar.mo3955l() != null) {
                    this.f5591h.m6689a(aiVar.mo3955l().m7018a(), aiVar.mo3955l().m7020c(), aiVar.mo3955l().m7019b());
                }
                if (aiVar.mo3964u() != null) {
                    for (C1837d c1837d : aiVar.mo3964u()) {
                        if (c1837d.m7004e() != null) {
                            this.f5591h.m6689a(c1837d.m7004e().m7018a(), c1837d.m7004e().m7020c(), c1837d.m7004e().m7019b());
                        }
                    }
                }
                if (!TextUtils.isEmpty(aiVar.mo3959p())) {
                    this.f5591h.m6688a(aiVar.mo3959p());
                }
            }
            this.f5591h.m6687a(new C1774a(this) {
                /* renamed from: c */
                final /* synthetic */ C1837d f15240c;

                /* renamed from: a */
                public void mo1334a() {
                    this.f15240c.f5587a = aiVar;
                    if (this.f15240c.f5592i != null) {
                        if (this.f15240c.f5584F.equals(C1838e.ALL) && !this.f15240c.m6981s()) {
                            this.f15240c.f5592i.m19038d();
                        }
                        if (z) {
                            this.f15240c.f5592i.m6924a();
                        }
                    }
                }

                /* renamed from: b */
                public void mo1335b() {
                    if (this.f15240c.f5587a != null) {
                        this.f15240c.f5587a.j_();
                        this.f15240c.f5587a = null;
                    }
                    if (this.f15240c.f5592i != null) {
                        this.f15240c.f5592i.m6925a(C1894a.m7228a(AdErrorType.CACHE_FAILURE_ERROR, "Failed to download a media."));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m6961a(List<View> list, View view) {
        if (this.f5593j == null || !this.f5593j.mo1296a(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m6961a((List) list, viewGroup.getChildAt(i));
                }
            } else {
                list.add(view);
            }
        }
    }

    /* renamed from: r */
    private AdPlacementType m6978r() {
        return this.f5597n == C1900f.NATIVE_UNKNOWN ? AdPlacementType.NATIVE : AdPlacementType.NATIVE_BANNER;
    }

    /* renamed from: s */
    private boolean m6981s() {
        return this.f5587a != null && ((C4597v) this.f5587a).m25417x();
    }

    /* renamed from: t */
    private int m6982t() {
        C1804d c1804d;
        if (this.f5596m != null) {
            c1804d = this.f5596m;
        } else if (this.f5594k == null || this.f5594k.m18830a() == null) {
            return 1;
        } else {
            c1804d = this.f5594k.m18830a();
        }
        return c1804d.m6799f();
    }

    /* renamed from: u */
    private int m6984u() {
        C1804d c1804d;
        if (this.f5596m != null) {
            c1804d = this.f5596m;
        } else if (this.f5594k == null || this.f5594k.m18830a() == null) {
            return 0;
        } else {
            c1804d = this.f5594k.m18830a();
        }
        return c1804d.m6800g();
    }

    /* renamed from: v */
    private int m6986v() {
        return this.f5596m != null ? this.f5596m.m6801h() : this.f5587a != null ? this.f5587a.mo3950i() : (this.f5594k == null || this.f5594k.m18830a() == null) ? 0 : this.f5594k.m18830a().m6801h();
    }

    /* renamed from: w */
    private int m6987w() {
        return this.f5596m != null ? this.f5596m.m6802i() : this.f5587a != null ? this.f5587a.mo3951j() : (this.f5594k == null || this.f5594k.m18830a() == null) ? 1000 : this.f5594k.m18830a().m6802i();
    }

    /* renamed from: x */
    private boolean m6988x() {
        return m7012m() == C1844m.ON;
    }

    /* renamed from: y */
    private void m6989y() {
        for (View view : this.f5599p) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.f5599p.clear();
    }

    /* renamed from: a */
    public ai m6990a() {
        return this.f5587a;
    }

    /* renamed from: a */
    public void m6991a(View view, C1840g c1840g) {
        List arrayList = new ArrayList();
        m6961a(arrayList, view);
        m6992a(view, c1840g, arrayList);
    }

    /* renamed from: a */
    public void m6992a(View view, C1840g c1840g, List<View> list) {
        if (view == null) {
            throw new IllegalArgumentException("Must provide a View");
        } else if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("Invalid set of clickable views");
        } else if (!m7002c()) {
            Log.e(f5577c, "Ad not loaded");
        } else if (c1840g == null) {
            String str;
            String str2;
            if (this.f5597n == C1900f.NATIVE_UNKNOWN) {
                if (this.f5592i != null) {
                    this.f5592i.m6925a(new C1894a(AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD, "MediaView is missing."));
                }
                if (C1964b.m7441f()) {
                    str = f5577c;
                    str2 = "MediaView is missing.";
                }
            }
            if (this.f5592i != null) {
                this.f5592i.m6925a(new C1894a(AdErrorType.NO_ICONVIEW_IN_NATIVEBANNERAD, "AdIconView is missing."));
            }
            if (C1964b.m7441f()) {
                str = f5577c;
                str2 = "AdIconView is missing.";
            }
            Log.e(str, str2);
        } else if (c1840g.getAdContentsView() == null) {
            if (this.f5592i != null) {
                this.f5592i.m6925a(new C1894a(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, "ad media type is not supported."));
            }
        } else {
            if (this.f5598o != null) {
                Log.w(f5577c, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
                m7016q();
            }
            if (f5578d.containsKey(view) && ((WeakReference) f5578d.get(view)).get() != null) {
                Log.w(f5577c, "View already registered with a NativeAd. Auto unregistering and proceeding.");
                ((C1837d) ((WeakReference) f5578d.get(view)).get()).m7016q();
            }
            this.f5606w = new C1835a();
            this.f5598o = view;
            if (view instanceof ViewGroup) {
                this.f5607x = new C2093w(view.getContext(), new C38073(this));
                ((ViewGroup) view).addView(this.f5607x);
            }
            List<View> arrayList = new ArrayList(list);
            if (this.f5586H != null) {
                arrayList.add(this.f5586H);
            }
            for (View a : arrayList) {
                m6958a(a);
            }
            this.f5587a.mo3941a(view, arrayList);
            int t = m6982t();
            this.f5602s = new C38084(this);
            this.f5601r = new C1958a(c1840g != null ? c1840g.getAdContentsView() : this.f5598o, t, m6984u(), true, this.f5602s);
            this.f5601r.m7418a(m6986v());
            this.f5601r.m7420b(m6987w());
            this.f5605v = new C3790x(this.f5588e, new C3809b(), this.f5601r, this.f5587a);
            this.f5605v.m18942a((List) arrayList);
            f5578d.put(view, new WeakReference(this));
            if (C1820a.m6846b(this.f5588e)) {
                C1990c c1990c;
                C1804d c1804d;
                this.f5583E = new C1990c();
                this.f5583E.m7494a(this.f5589f);
                this.f5583E.m7498b(this.f5588e.getPackageName());
                this.f5583E.m7493a(this.f5601r);
                if (this.f5587a.mo3966w() > 0) {
                    this.f5583E.m7491a(this.f5587a.mo3966w(), this.f5587a.mo3965v());
                }
                if (this.f5596m != null) {
                    c1990c = this.f5583E;
                    c1804d = this.f5596m;
                } else {
                    if (!(this.f5594k == null || this.f5594k.m18830a() == null)) {
                        c1990c = this.f5583E;
                        c1804d = this.f5594k.m18830a();
                    }
                    this.f5598o.getOverlay().add(this.f5583E);
                }
                c1990c.m7492a(c1804d.m6794a());
                this.f5598o.getOverlay().add(this.f5583E);
            }
        }
    }

    /* renamed from: a */
    public void m6993a(aj ajVar) {
        if (this.f5587a != null) {
            this.f5587a.mo3942a(ajVar);
        }
    }

    /* renamed from: a */
    public void m6994a(C1838e c1838e, String str) {
        if (this.f5595l) {
            throw new IllegalStateException("loadAd cannot be called more than once");
        }
        this.f5582D = System.currentTimeMillis();
        this.f5595l = true;
        this.f5584F = c1838e;
        if (c1838e.equals(C1838e.NONE)) {
            this.f5585G = C1760a.NONE;
        }
        this.f5594k = new C3766a(this.f5588e, this.f5589f, this.f5597n, m6978r(), null, f5576b, 1, true);
        this.f5594k.m18832a(new C38051(this));
        this.f5594k.m18835a(str);
    }

    /* renamed from: a */
    public void m6995a(C1900f c1900f) {
        this.f5597n = c1900f;
    }

    /* renamed from: a */
    public void m6996a(C1957a c1957a) {
        this.f5603t = new WeakReference(c1957a);
    }

    /* renamed from: a */
    public void m6997a(boolean z) {
        this.f5581C = z;
    }

    /* renamed from: a */
    public void m6998a(boolean z, boolean z2) {
        if (z) {
            if (!(!this.f5584F.equals(C1838e.NONE) || m6981s() || this.f5592i == null)) {
                this.f5592i.m19038d();
            }
            if (this.f5601r != null) {
                this.f5601r.m7417a();
                return;
            }
            return;
        }
        if (this.f5601r != null) {
            this.f5601r.m7422c();
        }
        if (this.f5592i != null && z2) {
            this.f5592i.m6925a(C1894a.m7228a(AdErrorType.BROKEN_MEDIA_ERROR, "Failed to load Media."));
        }
    }

    /* renamed from: b */
    public void m6999b() {
        if (this.f5594k != null) {
            this.f5594k.m18838b(true);
            this.f5594k = null;
        }
    }

    /* renamed from: b */
    public void m7000b(boolean z) {
        this.f5579A = z;
    }

    /* renamed from: c */
    public void m7001c(boolean z) {
        this.f5580B = z;
    }

    /* renamed from: c */
    public boolean m7002c() {
        return this.f5587a != null && this.f5587a.k_();
    }

    /* renamed from: d */
    public C1839f m7003d() {
        return !m7002c() ? null : this.f5587a.mo3953k();
    }

    /* renamed from: e */
    public C1839f m7004e() {
        return !m7002c() ? null : this.f5587a.mo3955l();
    }

    /* renamed from: f */
    public C1842j m7005f() {
        return !m7002c() ? null : this.f5587a.mo3956m();
    }

    /* renamed from: g */
    public String m7006g() {
        return !m7002c() ? null : this.f5587a.mo3957n();
    }

    /* renamed from: h */
    public String m7007h() {
        return !m7002c() ? null : this.f5587a.mo3958o();
    }

    /* renamed from: i */
    public String m7008i() {
        return !m7002c() ? null : this.f5590g;
    }

    /* renamed from: j */
    public String m7009j() {
        if (m7002c()) {
            if (!TextUtils.isEmpty(this.f5587a.mo3959p())) {
                return this.f5591h.m6690b(this.f5587a.mo3959p());
            }
        }
        return null;
    }

    /* renamed from: k */
    public String m7010k() {
        return !m7002c() ? null : this.f5587a.mo3960q();
    }

    /* renamed from: l */
    public String m7011l() {
        return !m7002c() ? null : this.f5587a.mo3963t();
    }

    /* renamed from: m */
    public C1844m m7012m() {
        return !m7002c() ? C1844m.DEFAULT : this.f5587a.mo3961r();
    }

    /* renamed from: n */
    public List<C1837d> m7013n() {
        return !m7002c() ? null : this.f5587a.mo3964u();
    }

    /* renamed from: o */
    public String m7014o() {
        return !m7002c() ? null : this.f5587a.mo3945c();
    }

    /* renamed from: p */
    public void m7015p() {
        this.f5586H.performClick();
    }

    /* renamed from: q */
    public void m7016q() {
        if (this.f5598o != null) {
            if (f5578d.containsKey(this.f5598o) && ((WeakReference) f5578d.get(this.f5598o)).get() == this) {
                if ((this.f5598o instanceof ViewGroup) && this.f5607x != null) {
                    ((ViewGroup) this.f5598o).removeView(this.f5607x);
                    this.f5607x = null;
                }
                if (this.f5587a != null) {
                    this.f5587a.j_();
                }
                if (this.f5583E != null && C1820a.m6846b(this.f5588e)) {
                    this.f5583E.m7497b();
                    this.f5598o.getOverlay().remove(this.f5583E);
                }
                f5578d.remove(this.f5598o);
                m6989y();
                this.f5598o = null;
                if (this.f5601r != null) {
                    this.f5601r.m7422c();
                    this.f5601r = null;
                }
                this.f5605v = null;
                return;
            }
            throw new IllegalStateException("View not registered with this NativeAd");
        }
    }
}
