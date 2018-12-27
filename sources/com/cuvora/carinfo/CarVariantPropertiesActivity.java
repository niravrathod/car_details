package com.cuvora.carinfo;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0176b;
import android.support.design.widget.TabLayout.C0181e;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.cuvora.carinfo.fragment.C4550e;
import com.cuvora.carinfo.fragment.C4551i;
import com.cuvora.carinfo.fragment.C4553n;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.ProgressLinearLayout;
import com.cuvora.carinfo.loaders.C4563b;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarFeatures;
import com.cuvora.carinfo.models.cars.CarOverview;
import com.cuvora.carinfo.models.cars.CarPropertiesResponse;
import com.cuvora.carinfo.models.cars.CarSpecifications;
import com.cuvora.carinfo.p069a.C4533e;
import com.google.android.gms.ads.AdView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarVariantPropertiesActivity extends AppCompatActivity {
    /* renamed from: n */
    private String f21719n;
    /* renamed from: o */
    private String f21720o;
    /* renamed from: p */
    private CarPropertiesResponse f21721p;
    /* renamed from: q */
    private AdView f21722q;
    /* renamed from: r */
    private List<Integer> f21723r;
    /* renamed from: s */
    private C4533e f21724s;
    /* renamed from: t */
    private ProgressLinearLayout f21725t;
    /* renamed from: u */
    private C0362a<Response> f21726u = new C35942(this);
    /* renamed from: v */
    private OnClickListener f21727v = new C14143(this);

    /* renamed from: com.cuvora.carinfo.CarVariantPropertiesActivity$3 */
    class C14143 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CarVariantPropertiesActivity f4385a;

        C14143(CarVariantPropertiesActivity carVariantPropertiesActivity) {
            this.f4385a = carVariantPropertiesActivity;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4385a) != null) {
                this.f4385a.m29935l();
                C1533a.m5787a(this.f4385a.f21722q, this.f4385a);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.CarVariantPropertiesActivity$1 */
    class C35931 implements C0176b {
        /* renamed from: a */
        final /* synthetic */ CarVariantPropertiesActivity f14759a;

        /* renamed from: a */
        public void mo140a(C0181e c0181e) {
        }

        /* renamed from: b */
        public void mo141b(C0181e c0181e) {
        }

        /* renamed from: c */
        public void mo142c(C0181e c0181e) {
        }

        C35931(CarVariantPropertiesActivity carVariantPropertiesActivity) {
            this.f14759a = carVariantPropertiesActivity;
        }
    }

    /* renamed from: com.cuvora.carinfo.CarVariantPropertiesActivity$2 */
    class C35942 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ CarVariantPropertiesActivity f14760a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C35942(CarVariantPropertiesActivity carVariantPropertiesActivity) {
            this.f14760a = carVariantPropertiesActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            i = new Bundle();
            i.putString("KEY_VERSION_ID", this.f14760a.f21719n);
            return new C4563b(this.f14760a, i);
        }

        /* renamed from: a */
        public void m18185a(C0392c<Response> c0392c, Response response) {
            if ((response instanceof CarPropertiesResponse) != null) {
                this.f14760a.f21725t.m5769a();
                this.f14760a.f21721p = (CarPropertiesResponse) response;
                this.f14760a.setTitle(this.f14760a.f21720o);
                this.f14760a.m29929c(this.f14760a.f21721p.getCarPropertiesData().getCarOverviews());
                this.f14760a.m29926b((List) this.f14760a.f21721p.getCarPropertiesData().getCarSpecifications());
                this.f14760a.m29923a((List) this.f14760a.f21721p.getCarPropertiesData().getCarFeatures());
            } else if (this.f14760a.f21721p == null) {
                this.f14760a.f21725t.m5770a(this.f14760a.getResources().getDrawable(2131165375), "Something Went Wrong", this.f14760a.getResources().getString(R.string.homepage_data_error_msg), "Try Again", this.f14760a.f21727v, this.f14760a.f21723r);
                this.f14760a.setTitle("Error");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_car_variant_properties);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        this.f21725t = (ProgressLinearLayout) findViewById(R.id.progressActivity);
        this.f21724s = new C4533e(m28707f(), this);
        this.f21722q = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21722q, (Context) this);
        mo4973h().mo538b(true);
        mo4973h().mo532a(true);
        this.f21723r = new ArrayList();
        this.f21723r.add(Integer.valueOf(R.id.appBarLayout));
        this.f21719n = getIntent().getStringExtra("KEY_VERSION_ID");
        this.f21720o = getIntent().getStringExtra("KEY_VERSION_TITLE");
        bundle = getIntent().getStringExtra("STATE");
        if (bundle == null) {
            bundle = "LOADING";
        }
        Object obj = -1;
        int hashCode = bundle.hashCode();
        if (hashCode != 66247144) {
            if (hashCode == 1054633244) {
                if (bundle.equals("LOADING") != null) {
                    obj = 1;
                }
            }
        } else if (bundle.equals("ERROR") != null) {
            obj = null;
        }
        switch (obj) {
            case null:
                this.f21725t.m5770a(getResources().getDrawable(2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21727v, this.f21723r);
                setTitle("Error");
                break;
            case 1:
                m29935l();
                break;
            default:
                break;
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(this.f21724s);
        tabLayout.setupWithViewPager(viewPager, true);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.m649a(i).m613a(this.f21724s.m25016f(i));
        }
        viewPager.setOffscreenPageLimit(3);
        tabLayout.m652a(new C35931(this));
    }

    /* renamed from: l */
    private void m29935l() {
        this.f21725t.m5771a(this.f21723r);
        setTitle("Loading");
        m28708g().mo264a(100, null, this.f21726u).m1455m();
    }

    /* renamed from: a */
    private void m29923a(List<CarFeatures> list) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_FEATURES", (Serializable) list);
        ((C4550e) this.f21724s.m25015e(2)).setArguments(bundle);
    }

    /* renamed from: b */
    private void m29926b(List<CarSpecifications> list) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_SPECIFICATIONS", (Serializable) list);
        ((C4553n) this.f21724s.m25015e(1)).setArguments(bundle);
    }

    /* renamed from: c */
    private void m29929c(List<CarOverview> list) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_OVERVIEW", (Serializable) list);
        ((C4551i) this.f21724s.m25015e(0)).setArguments(bundle);
    }

    /* renamed from: i */
    public boolean mo5016i() {
        onBackPressed();
        return true;
    }

    protected void onDestroy() {
        this.f21722q.destroy();
        super.onDestroy();
    }
}
