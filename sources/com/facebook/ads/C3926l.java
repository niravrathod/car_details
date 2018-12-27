package com.facebook.ads;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.C3766a;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.adapters.C3770j;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1899e;
import com.facebook.ads.internal.protocol.C1900f;

/* renamed from: com.facebook.ads.l */
public class C3926l implements C1699a {
    /* renamed from: a */
    private static final String f15652a = "l";
    /* renamed from: b */
    private final Context f15653b;
    /* renamed from: c */
    private final String f15654c;
    /* renamed from: d */
    private C3766a f15655d;
    /* renamed from: e */
    private boolean f15656e = false;
    /* renamed from: f */
    private C3927m f15657f;
    /* renamed from: g */
    private C2094k f15658g;
    /* renamed from: h */
    private int f15659h = -1;

    /* renamed from: com.facebook.ads.l$1 */
    class C39251 extends C1746h {
        /* renamed from: a */
        final /* synthetic */ C3926l f15651a;

        C39251(C3926l c3926l) {
            this.f15651a = c3926l;
        }

        /* renamed from: a */
        public void mo1274a() {
            if (this.f15651a.f15657f != null) {
                this.f15651a.f15657f.mo1512b(this.f15651a);
            }
        }

        /* renamed from: a */
        public void mo1276a(C1737a c1737a) {
            C3770j c3770j = (C3770j) c1737a;
            if (this.f15651a.f15658g != null) {
                c3770j.m18886a(this.f15651a.f15658g);
            }
            this.f15651a.f15659h = c3770j.mo3975b();
            this.f15651a.f15656e = true;
            if (this.f15651a.f15657f != null) {
                this.f15651a.f15657f.mo1510a(this.f15651a);
            }
        }

        /* renamed from: a */
        public void mo1277a(C1894a c1894a) {
            if (this.f15651a.f15657f != null) {
                this.f15651a.f15657f.mo1511a(this.f15651a, C1700b.m6434a(c1894a));
            }
        }

        /* renamed from: b */
        public void mo1278b() {
            if (this.f15651a.f15657f != null) {
                this.f15651a.f15657f.mo1490c(this.f15651a);
            }
        }

        /* renamed from: f */
        public void mo1486f() {
            this.f15651a.f15657f.mo4014a();
        }

        /* renamed from: g */
        public void mo1487g() {
            if (this.f15651a.f15657f != null) {
                this.f15651a.f15657f.mo4015b();
            }
        }

        /* renamed from: h */
        public void mo1488h() {
            if (this.f15651a.f15657f instanceof C4674n) {
                ((C4674n) this.f15651a.f15657f).m25694c();
            }
        }

        /* renamed from: i */
        public void mo1489i() {
            if (this.f15651a.f15657f instanceof C4674n) {
                ((C4674n) this.f15651a.f15657f).m25695d();
            }
        }
    }

    public C3926l(Context context, String str) {
        this.f15653b = context;
        this.f15654c = str;
    }

    /* renamed from: a */
    private void m19547a(String str, boolean z) {
        try {
            m19550b(str, z);
        } catch (Throwable e) {
            Log.e(f15652a, "Error loading rewarded video ad", e);
            if (this.f15657f != null) {
                this.f15657f.mo1511a(this, C1700b.f5123e);
            }
        }
    }

    /* renamed from: b */
    private void m19550b(String str, boolean z) {
        m19551b(false);
        this.f15656e = false;
        this.f15655d = new C3766a(this.f15653b, this.f15654c, C1900f.REWARDED_VIDEO, AdPlacementType.REWARDED_VIDEO, C1899e.INTERSTITIAL, C1898d.ADS, 1, true);
        this.f15655d.m18836a(z);
        this.f15655d.m18832a(new C39251(this));
        this.f15655d.m18835a(str);
    }

    /* renamed from: b */
    private final void m19551b(boolean z) {
        if (this.f15655d != null) {
            this.f15655d.m18838b(z);
            this.f15655d = null;
        }
    }

    /* renamed from: a */
    public void m19552a(C3927m c3927m) {
        this.f15657f = c3927m;
    }

    /* renamed from: a */
    public void m19553a(boolean z) {
        m19547a(null, z);
    }

    /* renamed from: a */
    public boolean m19554a() {
        return m19555a(-1);
    }

    /* renamed from: a */
    public boolean m19555a(int i) {
        if (this.f15656e) {
            this.f15655d.m18831a(i);
            this.f15655d.m18837b();
            this.f15656e = false;
            return true;
        }
        if (this.f15657f != null) {
            this.f15657f.mo1511a(this, C1700b.f5123e);
        }
        return false;
    }

    /* renamed from: b */
    public void m19556b() {
        m19551b(true);
    }

    /* renamed from: c */
    public boolean m19557c() {
        return this.f15656e;
    }
}
