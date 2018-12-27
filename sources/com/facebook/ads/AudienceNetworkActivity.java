package com.facebook.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.C0396d;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.C4592k;
import com.facebook.ads.internal.adapters.C4812u;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p091j.C1815d;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p094m.C3799d;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.settings.C1963a.C1962a;
import com.facebook.ads.internal.view.C1980a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.C3836b;
import com.facebook.ads.internal.view.C3857e;
import com.facebook.ads.internal.view.C3914m;
import com.facebook.ads.internal.view.C3920n;
import com.facebook.ads.internal.view.C3924o;
import com.facebook.ads.internal.view.C4651g;
import com.facebook.ads.internal.view.C4657h;
import com.facebook.ads.internal.view.p109b.C1990c;
import com.facebook.ads.internal.view.p110c.p111a.C4603f;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p118b.C2041z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AudienceNetworkActivity extends Activity {
    /* renamed from: a */
    private final List<C1691a> f5079a = new ArrayList();
    /* renamed from: b */
    private RelativeLayout f5080b;
    /* renamed from: c */
    private int f5081c = -1;
    /* renamed from: d */
    private String f5082d;
    /* renamed from: e */
    private C1962a f5083e;
    /* renamed from: f */
    private long f5084f;
    /* renamed from: g */
    private long f5085g;
    /* renamed from: h */
    private int f5086h;
    /* renamed from: i */
    private C1980a f5087i;
    /* renamed from: j */
    private C1990c f5088j;

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$a */
    public interface C1691a {
        /* renamed from: a */
        boolean mo1343a();
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$c */
    private static class C1692c {
        /* renamed from: a */
        private final AudienceNetworkActivity f5075a;
        /* renamed from: b */
        private final Intent f5076b;
        /* renamed from: c */
        private final C1827c f5077c;

        private C1692c(AudienceNetworkActivity audienceNetworkActivity, Intent intent, C1827c c1827c) {
            this.f5075a = audienceNetworkActivity;
            this.f5076b = intent;
            this.f5077c = c1827c;
        }

        /* renamed from: a */
        private C1980a m6384a() {
            C1980a c4657h = new C4657h(this.f5075a, this.f5077c, m6402i(), m6401h() ? new C1779b(this.f5075a) : null);
            m6388a(c4657h);
            return c4657h;
        }

        /* renamed from: a */
        private C1980a m6385a(RelativeLayout relativeLayout) {
            C1980a c3914m = new C3914m(this.f5075a, this.f5077c, new C3746b());
            c3914m.m19473a((View) relativeLayout);
            c3914m.m19470a(this.f5076b.getIntExtra("video_time_polling_interval", 200));
            return c3914m;
        }

        /* renamed from: a */
        private void m6388a(C1980a c1980a) {
            c1980a.setListener(new C3746b());
        }

        /* renamed from: b */
        private C1980a m6389b() {
            C1980a a = C4592k.m25302a(this.f5076b.getStringExtra("uniqueId"));
            if (a == null) {
                return null;
            }
            m6388a(a);
            return a;
        }

        /* renamed from: c */
        private C1980a m6391c() {
            return new C3836b(this.f5075a, this.f5077c, new C3746b());
        }

        /* renamed from: d */
        private C1980a m6393d() {
            C3920n c3920n;
            C1736k c1736k = (C1736k) this.f5076b.getSerializableExtra("rewardedVideoAdDataBundle");
            if (c1736k.m6581e().m6512j() != null) {
                c3920n = new C3920n(this.f5075a, this.f5077c, new C4581e(), c1736k);
            } else {
                RelativeLayout c3924o = new C3924o(this.f5075a, this.f5077c, new C3859a(this.f5075a), new C4581e(), c1736k);
            }
            return c3920n;
        }

        /* renamed from: e */
        private C1980a m6395e() {
            return new C3857e(this.f5075a, this.f5077c, new C3746b());
        }

        /* renamed from: f */
        private C1980a m6397f() {
            C1980a c4603f = new C4603f(this.f5075a, this.f5077c, m6401h() ? new C1779b(this.f5075a) : null);
            m6388a(c4603f);
            return c4603f;
        }

        /* renamed from: g */
        private C1980a m6399g() {
            C1980a c4651g = new C4651g(this.f5075a, m6402i(), this.f5077c);
            m6388a(c4651g);
            return c4651g;
        }

        /* renamed from: h */
        private boolean m6401h() {
            return this.f5076b.getBooleanExtra("useCache", false);
        }

        /* renamed from: i */
        private C1730g m6402i() {
            return (C1730g) this.f5076b.getSerializableExtra("ad_data_bundle");
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$d */
    private class C1693d implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f5078a;

        private C1693d(AudienceNetworkActivity audienceNetworkActivity) {
            this.f5078a = audienceNetworkActivity;
        }

        public boolean onLongClick(View view) {
            if (!(this.f5078a.f5088j == null || this.f5078a.f5080b == null)) {
                this.f5078a.f5088j.setBounds(0, 0, this.f5078a.f5080b.getWidth(), this.f5078a.f5080b.getHeight());
                this.f5078a.f5088j.m7495a(this.f5078a.f5088j.m7496a() ^ true);
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$b */
    private static class C3746b implements C1965a {
        /* renamed from: a */
        final WeakReference<AudienceNetworkActivity> f15041a;

        private C3746b(AudienceNetworkActivity audienceNetworkActivity) {
            this.f15041a = new WeakReference(audienceNetworkActivity);
        }

        /* renamed from: a */
        public void mo1279a(View view) {
            if (this.f15041a.get() != null) {
                ((AudienceNetworkActivity) this.f15041a.get()).f5080b.addView(view);
            }
        }

        /* renamed from: a */
        public void mo1280a(String str) {
            if (this.f15041a.get() != null) {
                ((AudienceNetworkActivity) this.f15041a.get()).m6409a(str);
            }
        }

        /* renamed from: a */
        public void mo1281a(String str, C1815d c1815d) {
            if (this.f15041a.get() != null) {
                ((AudienceNetworkActivity) this.f15041a.get()).m6410a(str, c1815d);
            }
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$e */
    private static class C4581e extends C3746b {
        private C4581e(AudienceNetworkActivity audienceNetworkActivity) {
            super();
        }

        /* renamed from: a */
        public void mo1280a(String str) {
            if (this.a.get() != null) {
                ((AudienceNetworkActivity) this.a.get()).m6409a(str);
                String a = C2041z.REWARDED_VIDEO_END_ACTIVITY.m7604a();
                String a2 = C2041z.REWARDED_VIDEO_ERROR.m7604a();
                if (str.equals(a) || str.equals(a2)) {
                    ((AudienceNetworkActivity) this.a.get()).finish();
                }
            }
        }
    }

    /* renamed from: a */
    private C1980a m6403a() {
        C1692c c1692c = new C1692c(getIntent(), C3799d.m18991a((Context) this));
        if (this.f5083e == null) {
            return null;
        }
        switch (this.f5083e) {
            case FULL_SCREEN_VIDEO:
                return c1692c.m6385a(this.f5080b);
            case REWARDED_VIDEO:
                return c1692c.m6393d();
            case INTERSTITIAL_WEB_VIEW:
                return c1692c.m6395e();
            case BROWSER:
                return c1692c.m6391c();
            case INTERSTITIAL_OLD_NATIVE_VIDEO:
                return c1692c.m6389b();
            case INTERSTITIAL_NATIVE_VIDEO:
                return c1692c.m6384a();
            case INTERSTITIAL_NATIVE_IMAGE:
                return c1692c.m6399g();
            case INTERSTITIAL_NATIVE_CAROUSEL:
                return c1692c.m6397f();
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m6405a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.f5081c = bundle.getInt("predefinedOrientationKey", -1);
            this.f5082d = bundle.getString("uniqueId");
            this.f5083e = (C1962a) bundle.getSerializable("viewType");
            return;
        }
        this.f5081c = intent.getIntExtra("predefinedOrientationKey", -1);
        this.f5082d = intent.getStringExtra("uniqueId");
        this.f5083e = (C1962a) intent.getSerializableExtra("viewType");
        this.f5086h = intent.getIntExtra("skipAfterSeconds", 0) * 1000;
    }

    /* renamed from: a */
    private void m6406a(Intent intent, boolean z) {
        if (C1820a.m6846b(this) && this.f5083e != C1962a.BROWSER) {
            this.f5088j = new C1990c();
            this.f5088j.m7494a(intent.getStringExtra("placementId"));
            this.f5088j.m7498b(getPackageName());
            long longExtra = intent.getLongExtra("requestTime", 0);
            if (longExtra != 0) {
                this.f5088j.m7492a(longExtra);
            }
            View textView = new TextView(this);
            textView.setText("Debug");
            textView.setTextColor(-1);
            C1936w.m7328a(textView, Color.argb(160, 0, 0, 0));
            textView.setPadding(5, 5, 5, 5);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12, -1);
            layoutParams.addRule(11, -1);
            textView.setLayoutParams(layoutParams);
            OnLongClickListener c1693d = new C1693d();
            textView.setOnLongClickListener(c1693d);
            if (z) {
                this.f5080b.addView(textView);
            } else {
                this.f5080b.setOnLongClickListener(c1693d);
            }
            this.f5080b.getOverlay().add(this.f5088j);
        }
    }

    /* renamed from: a */
    private void m6409a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(this.f5082d);
        C0396d.m1465a((Context) this).m1470a(new Intent(stringBuilder.toString()));
    }

    /* renamed from: a */
    private void m6410a(String str, C1815d c1815d) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(this.f5082d);
        Intent intent = new Intent(stringBuilder.toString());
        intent.putExtra("event", c1815d);
        C0396d.m1465a((Context) this).m1470a(intent);
    }

    /* renamed from: a */
    public void m6412a(C1691a c1691a) {
        this.f5079a.add(c1691a);
    }

    /* renamed from: b */
    public void m6413b(C1691a c1691a) {
        this.f5079a.remove(c1691a);
    }

    public void finish() {
        if (!isFinishing()) {
            m6409a(this.f5083e == C1962a.REWARDED_VIDEO ? C2041z.REWARDED_VIDEO_CLOSED.m7604a() : "com.facebook.ads.interstitial.dismissed");
            super.finish();
        }
    }

    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f5085g += currentTimeMillis - this.f5084f;
        this.f5084f = currentTimeMillis;
        if (this.f5085g > ((long) this.f5086h)) {
            Object obj = null;
            for (C1691a a : this.f5079a) {
                if (a.mo1343a()) {
                    obj = 1;
                }
            }
            if (obj == null) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f5087i instanceof C4812u) {
            ((C4812u) this.f5087i).m27904a(configuration);
        } else if (this.f5087i instanceof C3924o) {
            ((C3924o) this.f5087i).onConfigurationChanged(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1909d.m7257a();
        boolean z = true;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        this.f5080b = new RelativeLayout(this);
        C1936w.m7328a(this.f5080b, -16777216);
        setContentView(this.f5080b, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        m6405a(intent, bundle);
        this.f5087i = m6403a();
        if (this.f5087i == null) {
            C1813b.m6823a(C1812a.m6820a(null, "Unable to infer viewType from intent or savedInstanceState"));
            m6409a("com.facebook.ads.interstitial.error");
            finish();
            return;
        }
        this.f5087i.mo1420a(intent, bundle, this);
        m6409a("com.facebook.ads.interstitial.displayed");
        this.f5084f = System.currentTimeMillis();
        if (this.f5083e != C1962a.INTERSTITIAL_WEB_VIEW) {
            z = false;
        }
        m6406a(intent, z);
    }

    protected void onDestroy() {
        if (this.f5080b != null) {
            this.f5080b.removeAllViews();
        }
        if (this.f5087i != null) {
            C4592k.m25303a(this.f5087i);
            this.f5087i.mo1422e();
            this.f5087i = null;
        }
        if (this.f5088j != null && C1820a.m6846b(this)) {
            this.f5088j.m7497b();
        }
        super.onDestroy();
    }

    public void onPause() {
        this.f5085g += System.currentTimeMillis() - this.f5084f;
        if (this.f5087i != null) {
            this.f5087i.mo1423k();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f5084f = System.currentTimeMillis();
        if (this.f5087i != null) {
            this.f5087i.mo1424l();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f5087i != null) {
            this.f5087i.mo1421a(bundle);
        }
        bundle.putInt("predefinedOrientationKey", this.f5081c);
        bundle.putString("uniqueId", this.f5082d);
        bundle.putSerializable("viewType", this.f5083e);
    }

    public void onStart() {
        super.onStart();
        if (this.f5081c != -1) {
            setRequestedOrientation(this.f5081c);
        }
    }
}
