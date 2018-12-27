package com.facebook.ads.internal.view.p110c.p111a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.aj;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.p107r.C1958a.C1957a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.C3912i;
import com.facebook.ads.internal.view.component.C2016d;
import com.facebook.ads.internal.view.p110c.p111a.C3841d.C1995a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.c.a.f */
public class C4603f extends C3912i {
    /* renamed from: e */
    private static final int f19130e = ((int) (C1936w.f5934b * 48.0f));
    /* renamed from: f */
    private static final int f19131f = ((int) (C1936w.f5934b * 8.0f));
    /* renamed from: g */
    private static final int f19132g = ((int) (C1936w.f5934b * 8.0f));
    /* renamed from: h */
    private static final int f19133h = ((int) (C1936w.f5934b * 56.0f));
    /* renamed from: i */
    private static final int f19134i = ((int) (C1936w.f5934b * 12.0f));
    /* renamed from: j */
    private final C1933t f19135j = new C1933t();
    /* renamed from: k */
    private C1779b f19136k;
    /* renamed from: l */
    private LinearLayout f19137l;
    /* renamed from: m */
    private String f19138m;
    /* renamed from: n */
    private long f19139n;
    /* renamed from: o */
    private String f19140o;
    /* renamed from: p */
    private List<C1994b> f19141p;
    /* renamed from: q */
    private C2016d f19142q;
    /* renamed from: r */
    private C4813c f19143r;
    /* renamed from: s */
    private C1958a f19144s;
    /* renamed from: t */
    private C1957a f19145t;
    /* renamed from: u */
    private int f19146u;
    /* renamed from: v */
    private int f19147v;

    /* renamed from: com.facebook.ads.internal.view.c.a.f$1 */
    class C38421 extends C1957a {
        /* renamed from: a */
        final /* synthetic */ C4603f f15335a;

        C38421(C4603f c4603f) {
            this.f15335a = c4603f;
        }

        /* renamed from: a */
        public void mo1338a() {
            Map hashMap = new HashMap();
            if (!this.f15335a.f19135j.m7318b()) {
                this.f15335a.f19135j.m7316a();
                if (this.f15335a.getAudienceNetworkListener() != null) {
                    this.f15335a.getAudienceNetworkListener().mo1280a("com.facebook.ads.interstitial.impression.logged");
                }
                if (!TextUtils.isEmpty(this.f15335a.f19138m)) {
                    this.f15335a.f19144s.m7419a(hashMap);
                    hashMap.put("touch", C1921k.m7293a(this.f15335a.f19135j.m7321e()));
                    this.f15335a.b.mo1355a(this.f15335a.f19138m, hashMap);
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a.f$2 */
    class C38432 implements C1995a {
        /* renamed from: a */
        final /* synthetic */ C4603f f15336a;

        C38432(C4603f c4603f) {
            this.f15336a = c4603f;
        }

        /* renamed from: a */
        public void mo1431a(int i) {
            if (this.f15336a.f19142q != null) {
                this.f15336a.f19142q.m7579a(i);
            }
        }
    }

    public C4603f(Context context, C1827c c1827c, C1779b c1779b) {
        super(context, c1827c);
        this.f19136k = c1779b;
    }

    /* renamed from: a */
    private void m25465a(C1730g c1730g) {
        this.f19138m = c1730g.m6544c();
        this.f19140o = c1730g.m6546e();
        this.f19146u = c1730g.m6547f();
        this.f19147v = c1730g.m6548g();
        List d = c1730g.m6545d();
        this.f19141p = new ArrayList(d.size());
        for (int i = 0; i < d.size(); i++) {
            this.f19141p.add(new C1994b(i, d.size(), (C1731h) d.get(i)));
        }
    }

    /* renamed from: a */
    private void m25466a(C3840a c3840a) {
        new aj().m16762a(this.f19143r);
        c3840a.m19170a(new C38432(this));
        this.f19142q = new C2016d(getContext(), this.d.m6481a(), this.f19141p.size());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f19132g);
        layoutParams.setMargins(0, f19134i, 0, 0);
        this.f19142q.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo3978a() {
        if (this.f19137l != null) {
            this.f19137l.removeAllViews();
            this.f19137l = null;
        }
        if (this.f19143r != null) {
            this.f19143r.removeAllViews();
            this.f19143r = null;
        }
        if (this.f19142q != null) {
            this.f19142q.removeAllViews();
            this.f19142q = null;
        }
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        C1730g c1730g = (C1730g) intent.getSerializableExtra("ad_data_bundle");
        super.m19466a(audienceNetworkActivity, c1730g);
        m25465a(c1730g);
        setUpLayout(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f19139n = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo1422e() {
        super.mo1422e();
        C1813b.m6823a(C1812a.m6818a(this.f19139n, C1810a.XOUT, this.f19140o));
        if (!TextUtils.isEmpty(this.f19138m)) {
            Map hashMap = new HashMap();
            this.f19144s.m7419a(hashMap);
            hashMap.put("touch", C1921k.m7293a(this.f19135j.m7321e()));
            this.b.mo1364i(this.f19138m, hashMap);
        }
        mo3978a();
        this.f19144s.m7422c();
        this.f19144s = null;
        this.f19145t = null;
        this.f19141p = null;
    }

    /* renamed from: k */
    public void mo1423k() {
    }

    /* renamed from: l */
    public void mo1424l() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        mo3978a();
        setUpLayout(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19135j.m7317a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setUpLayout(int i) {
        LinearLayout linearLayout;
        int i2;
        int i3;
        C4603f c4603f;
        int i4 = i;
        this.f19137l = new LinearLayout(getContext());
        if (i4 == 1) {
            linearLayout = r0.f19137l;
            i2 = 17;
        } else {
            linearLayout = r0.f19137l;
            i2 = 48;
        }
        linearLayout.setGravity(i2);
        r0.f19137l.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        r0.f19137l.setOrientation(1);
        int i5 = C1936w.f5933a.widthPixels;
        i2 = C1936w.f5933a.heightPixels;
        if (i4 == 1) {
            i2 = Math.min(i5 - (f19131f * 4), i2 / 2);
            i5 = (i5 - i2) / 8;
            i3 = i5 * 4;
        } else {
            i2 -= (f19133h + f19130e) + (f19131f * 2);
            i5 = f19131f;
            i3 = i5 * 2;
        }
        int i6 = i5;
        int i7 = i2;
        int i8 = i3;
        r0.f19145t = new C38421(r0);
        r0.f19144s = new C1958a(r0, 1, r0.f19145t);
        r0.f19144s.m7418a(r0.f19146u);
        r0.f19144s.m7420b(r0.f19147v);
        r0.f19143r = new C4813c(getContext());
        r0.f19143r.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        C3840a c3840a = new C3840a(r0.f19143r, i4, r0.f19141p, r0.f19144s);
        C4813c c4813c = r0.f19143r;
        List list = r0.f19141p;
        C1827c c1827c = r0.b;
        C1779b c1779b = r0.f19136k;
        C1958a c1958a = r0.f19144s;
        C1933t c1933t = r0.f19135j;
        C1965a audienceNetworkListener = getAudienceNetworkListener();
        C1727d a = i4 == 1 ? r0.d.m6481a() : r0.d.m6482b();
        C0771a c0771a = r1;
        C4813c c4813c2 = c4813c;
        C3840a c3840a2 = c3840a;
        C0771a c3841d = new C3841d(list, c1827c, c1779b, c1958a, c1933t, audienceNetworkListener, a, r0.f19138m, i7, i6, i8, i, c3840a2);
        c4813c2.setAdapter(c0771a);
        int i9 = i;
        if (i9 == 1) {
            m25466a(c3840a2);
        } else {
            c4603f = this;
        }
        c4603f.f19137l.addView(c4603f.f19143r);
        if (c4603f.f19142q != null) {
            c4603f.f19137l.addView(c4603f.f19142q);
        }
        c4603f.m19465a(c4603f.f19137l, false, i9);
    }
}
