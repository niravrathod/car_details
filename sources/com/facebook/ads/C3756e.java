package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.C3766a;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1895b;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1899e;
import com.facebook.ads.internal.protocol.C1901g;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.e */
public class C3756e implements C1699a {
    /* renamed from: a */
    private static final C1898d f15072a = C1898d.ADS;
    /* renamed from: b */
    private final Context f15073b;
    /* renamed from: c */
    private final String f15074c;
    /* renamed from: d */
    private C3766a f15075d;
    /* renamed from: e */
    private boolean f15076e;
    /* renamed from: f */
    private boolean f15077f;
    /* renamed from: g */
    private C3757f f15078g;

    /* renamed from: com.facebook.ads.e$1 */
    class C37551 extends C1746h {
        /* renamed from: a */
        final /* synthetic */ C3756e f15071a;

        C37551(C3756e c3756e) {
            this.f15071a = c3756e;
        }

        /* renamed from: a */
        public void mo1274a() {
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo1512b(this.f15071a);
            }
        }

        /* renamed from: a */
        public void mo1275a(View view) {
        }

        /* renamed from: a */
        public void mo1276a(C1737a c1737a) {
            this.f15071a.f15076e = true;
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo1510a(this.f15071a);
            }
        }

        /* renamed from: a */
        public void mo1277a(C1894a c1894a) {
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo1511a(this.f15071a, C1700b.m6434a(c1894a));
            }
        }

        /* renamed from: b */
        public void mo1278b() {
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo1490c(this.f15071a);
            }
        }

        /* renamed from: d */
        public void mo1298d() {
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo4012d(this.f15071a);
            }
        }

        /* renamed from: e */
        public void mo1299e() {
            this.f15071a.f15077f = false;
            if (this.f15071a.f15075d != null) {
                this.f15071a.f15075d.m18839c();
                this.f15071a.f15075d = null;
            }
            if (this.f15071a.f15078g != null) {
                this.f15071a.f15078g.mo4013e(this.f15071a);
            }
        }
    }

    public C3756e(Context context, String str) {
        this.f15073b = context;
        this.f15074c = str;
    }

    /* renamed from: a */
    private void m18746a(EnumSet<CacheFlag> enumSet, String str) {
        this.f15076e = false;
        if (this.f15077f) {
            C1953a.m7382a(this.f15073b, "api", C1954b.f5992f, new C1895b(AdErrorType.NO_ADAPTER_ON_LOAD, "Interstitial load called while showing interstitial."));
            if (this.f15078g != null) {
                this.f15078g.mo1511a(this, new C1700b(AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD.m7224a(), AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD.m7225b()));
            }
            return;
        }
        if (this.f15075d != null) {
            this.f15075d.m18839c();
            this.f15075d = null;
        }
        this.f15075d = new C3766a(this.f15073b, this.f15074c, C1901g.m7241a(this.f15073b.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, C1899e.INTERSTITIAL, f15072a, 1, true, enumSet);
        this.f15075d.m18832a(new C37551(this));
        this.f15075d.m18835a(str);
    }

    /* renamed from: a */
    public void m18750a() {
        m18752a(EnumSet.of(CacheFlag.NONE));
    }

    /* renamed from: a */
    public void m18751a(C3757f c3757f) {
        this.f15078g = c3757f;
    }

    /* renamed from: a */
    public void m18752a(EnumSet<CacheFlag> enumSet) {
        m18746a((EnumSet) enumSet, null);
    }

    /* renamed from: b */
    public void m18753b() {
        if (this.f15075d != null) {
            this.f15075d.m18838b(true);
            this.f15075d = null;
        }
    }

    /* renamed from: c */
    public boolean m18754c() {
        return this.f15076e;
    }

    /* renamed from: d */
    public boolean m18755d() {
        if (!this.f15076e) {
            if (this.f15078g != null) {
                this.f15078g.mo1511a(this, C1700b.f5123e);
            }
            return false;
        } else if (this.f15075d == null) {
            C1953a.m7382a(this.f15073b, "api", C1954b.f5993g, new C1895b(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL, AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.m7225b()));
            if (this.f15078g != null) {
                this.f15078g.mo1511a(this, C1700b.f5123e);
            }
            return false;
        } else {
            this.f15075d.m18837b();
            this.f15077f = true;
            this.f15076e = false;
            return true;
        }
    }
}
