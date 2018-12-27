package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.C3766a;
import com.facebook.ads.internal.adapters.C1737a;
import com.facebook.ads.internal.adapters.C1746h;
import com.facebook.ads.internal.adapters.C4596s;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1900f;
import com.facebook.ads.internal.view.p109b.C1990c;

public class InstreamVideoAdView extends RelativeLayout implements C1699a {
    /* renamed from: a */
    private final Context f15045a;
    /* renamed from: b */
    private final String f15046b;
    /* renamed from: c */
    private final AdSize f15047c;
    /* renamed from: d */
    private C3766a f15048d;
    /* renamed from: e */
    private C4596s f15049e;
    /* renamed from: f */
    private boolean f15050f;
    /* renamed from: g */
    private C3754d f15051g;
    /* renamed from: h */
    private View f15052h;
    /* renamed from: i */
    private C1990c f15053i;

    /* renamed from: com.facebook.ads.InstreamVideoAdView$1 */
    class C37481 extends C1746h {
        /* renamed from: a */
        final /* synthetic */ InstreamVideoAdView f15044a;

        /* renamed from: com.facebook.ads.InstreamVideoAdView$1$1 */
        class C16951 implements OnLongClickListener {
            /* renamed from: a */
            final /* synthetic */ C37481 f5096a;

            C16951(C37481 c37481) {
                this.f5096a = c37481;
            }

            public boolean onLongClick(View view) {
                if (this.f5096a.f15044a.f15052h != null) {
                    if (this.f5096a.f15044a.f15053i != null) {
                        this.f5096a.f15044a.f15053i.setBounds(0, 0, this.f5096a.f15044a.f15052h.getWidth(), this.f5096a.f15044a.f15052h.getHeight());
                        this.f5096a.f15044a.f15053i.m7495a(this.f5096a.f15044a.f15053i.m7496a() ^ true);
                        return true;
                    }
                }
                return false;
            }
        }

        C37481(InstreamVideoAdView instreamVideoAdView) {
            this.f15044a = instreamVideoAdView;
        }

        /* renamed from: a */
        public void mo1274a() {
            if (this.f15044a.f15051g != null) {
                this.f15044a.f15051g.mo1512b(this.f15044a);
            }
        }

        /* renamed from: a */
        public void mo1275a(View view) {
            if (view != null) {
                this.f15044a.f15052h = view;
                this.f15044a.removeAllViews();
                this.f15044a.f15052h.setLayoutParams(new LayoutParams(-1, -1));
                this.f15044a.addView(this.f15044a.f15052h);
                if (C1820a.m6846b(this.f15044a.f15045a)) {
                    this.f15044a.f15053i = new C1990c();
                    this.f15044a.f15053i.m7494a(this.f15044a.f15046b);
                    this.f15044a.f15053i.m7498b(this.f15044a.f15045a.getPackageName());
                    if (this.f15044a.f15048d.m18830a() != null) {
                        this.f15044a.f15053i.m7492a(this.f15044a.f15048d.m18830a().m6794a());
                    }
                    this.f15044a.f15052h.getOverlay().add(this.f15044a.f15053i);
                    this.f15044a.f15052h.setOnLongClickListener(new C16951(this));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot present null view");
        }

        /* renamed from: a */
        public void mo1276a(C1737a c1737a) {
            if (this.f15044a.f15048d != null) {
                this.f15044a.f15050f = true;
                if (this.f15044a.f15051g != null) {
                    this.f15044a.f15051g.mo1510a(this.f15044a);
                }
            }
        }

        /* renamed from: a */
        public void mo1277a(C1894a c1894a) {
            if (this.f15044a.f15051g != null) {
                this.f15044a.f15051g.mo1511a(this.f15044a, C1700b.m6434a(c1894a));
            }
        }

        /* renamed from: b */
        public void mo1278b() {
            if (this.f15044a.f15051g != null) {
                this.f15044a.f15051g.mo1490c(this.f15044a);
            }
        }

        /* renamed from: c */
        public void mo1286c() {
            if (this.f15044a.f15051g != null) {
                this.f15044a.f15051g.m18736d(this.f15044a);
            }
        }
    }

    private C3766a getController() {
        this.f15048d = new C3766a(getContext(), this.f15046b, C1900f.INSTREAM_VIDEO, AdPlacementType.INSTREAM, this.f15047c.m6382c(), C1898d.ADS, 1, true);
        this.f15048d.m18832a(new C37481(this));
        return this.f15048d;
    }

    public String getPlacementId() {
        return this.f15046b;
    }

    public Bundle getSaveInstanceState() {
        ac acVar = this.f15049e != null ? this.f15049e : (ac) this.f15048d.m18840d();
        if (acVar == null) {
            return null;
        }
        Bundle i = acVar.mo1347i();
        if (i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("adapter", i);
        bundle.putString("placementID", this.f15046b);
        bundle.putSerializable("adSize", this.f15047c);
        return bundle;
    }

    public void setAdListener(C3754d c3754d) {
        this.f15051g = c3754d;
    }
}
