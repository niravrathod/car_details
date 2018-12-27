package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.p110c.C1999b;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3869d;
import com.facebook.ads.internal.view.p116f.p118b.C3870e;
import com.facebook.ads.internal.view.p116f.p118b.C3871f;
import com.facebook.ads.internal.view.p116f.p118b.C3872g;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3881p;
import com.facebook.ads.internal.view.p116f.p119c.C4622b;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.facebook.ads.internal.view.m */
public class C3914m implements C1980a {
    /* renamed from: a */
    private final C3876k f15577a = new C46631(this);
    /* renamed from: b */
    private final C3874i f15578b = new C46642(this);
    /* renamed from: c */
    private final C3868c f15579c = new C46653(this);
    /* renamed from: d */
    private final C3870e f15580d = new C46664(this);
    /* renamed from: e */
    private final AudienceNetworkActivity f15581e;
    /* renamed from: f */
    private final C1827c f15582f;
    /* renamed from: g */
    private final C3859a f15583g;
    /* renamed from: h */
    private final C1965a f15584h;
    /* renamed from: i */
    private C4617b f15585i;
    /* renamed from: j */
    private int f15586j;

    /* renamed from: com.facebook.ads.internal.view.m$6 */
    class C20836 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3914m f6396a;

        C20836(C3914m c3914m) {
            this.f6396a = c3914m;
        }

        public void onClick(View view) {
            this.f6396a.f15584h.mo1280a("performCtaClick");
        }
    }

    /* renamed from: com.facebook.ads.internal.view.m$1 */
    class C46631 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C3914m f19296a;

        C46631(C3914m c3914m) {
            this.f19296a = c3914m;
        }

        /* renamed from: a */
        public void m25677a(C3875j c3875j) {
            this.f19296a.f15584h.mo1281a("videoInterstitalEvent", c3875j);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.m$2 */
    class C46642 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C3914m f19297a;

        C46642(C3914m c3914m) {
            this.f19297a = c3914m;
        }

        /* renamed from: a */
        public void m25679a(C3873h c3873h) {
            this.f19297a.f15584h.mo1281a("videoInterstitalEvent", c3873h);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.m$3 */
    class C46653 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3914m f19298a;

        C46653(C3914m c3914m) {
            this.f19298a = c3914m;
        }

        /* renamed from: a */
        public void m25681a(C3867b c3867b) {
            this.f19298a.f15584h.mo1281a("videoInterstitalEvent", c3867b);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.m$4 */
    class C46664 extends C3870e {
        /* renamed from: a */
        final /* synthetic */ C3914m f19299a;

        C46664(C3914m c3914m) {
            this.f19299a = c3914m;
        }

        /* renamed from: a */
        public void m25683a(C3869d c3869d) {
            this.f19299a.f15581e.finish();
        }
    }

    public C3914m(final AudienceNetworkActivity audienceNetworkActivity, C1827c c1827c, C1965a c1965a) {
        this.f15581e = audienceNetworkActivity;
        this.f15582f = c1827c;
        this.f15583g = new C3859a(audienceNetworkActivity);
        this.f15583g.m19256a(new C4622b(audienceNetworkActivity));
        this.f15583g.getEventBus().m6830a(this.f15577a, this.f15578b, this.f15579c, this.f15580d);
        this.f15584h = c1965a;
        this.f15583g.setIsFullScreen(true);
        this.f15583g.setVolume(1.0f);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.f15583g.setLayoutParams(layoutParams);
        c1965a.mo1279a(this.f15583g);
        View c2022d = new C2022d(audienceNetworkActivity);
        c2022d.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ C3914m f6395b;

            public void onClick(View view) {
                audienceNetworkActivity.finish();
            }
        });
        c1965a.mo1279a(c2022d);
    }

    /* renamed from: a */
    public void m19470a(int i) {
        this.f15583g.setVideoProgressReportIntervalMs(i);
    }

    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra("useNativeCtaButton");
        if (!(stringExtra == null || stringExtra.isEmpty())) {
            View c1999b = new C1999b(audienceNetworkActivity, stringExtra);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (C1936w.f5934b * 16.0f);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c1999b.setLayoutParams(layoutParams);
            c1999b.setOnClickListener(new C20836(this));
            this.f15584h.mo1279a(c1999b);
        }
        this.f15586j = intent.getIntExtra("videoSeekTime", 0);
        this.f15585i = new C4617b((Context) audienceNetworkActivity, this.f15582f, this.f15583g, intent.getStringExtra("clientToken"), intent.getBundleExtra("videoLogger"));
        this.f15583g.setVideoMPD(intent.getStringExtra("videoMPD"));
        this.f15583g.setVideoURI(intent.getStringExtra("videoURL"));
        if (this.f15586j > 0) {
            this.f15583g.m19253a(this.f15586j);
        }
        if (intent.getBooleanExtra(FacebookAdapter.KEY_AUTOPLAY, false)) {
            this.f15583g.m19255a(C2038a.USER_STARTED);
        }
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: a */
    public void m19473a(View view) {
        this.f15583g.setControlsAnchorView(view);
    }

    /* renamed from: e */
    public void mo1422e() {
        this.f15584h.mo1281a("videoInterstitalEvent", new C3881p(this.f15586j, this.f15583g.getCurrentPositionInMillis()));
        this.f15585i.m19394b(this.f15583g.getCurrentPositionInMillis());
        this.f15583g.m19261d();
        this.f15583g.m19266i();
    }

    /* renamed from: k */
    public void mo1423k() {
        this.f15584h.mo1281a("videoInterstitalEvent", new C3871f());
        this.f15583g.m19258a(false);
    }

    /* renamed from: l */
    public void mo1424l() {
        this.f15584h.mo1281a("videoInterstitalEvent", new C3872g());
        this.f15583g.m19255a(C2038a.USER_STARTED);
    }

    public void setListener(C1965a c1965a) {
    }
}
