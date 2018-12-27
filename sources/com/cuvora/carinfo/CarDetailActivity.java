package com.cuvora.carinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.ProgressLinearLayout;
import com.cuvora.carinfo.loaders.C4564c;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarVariantsData;
import com.cuvora.carinfo.models.cars.CarsImage;
import com.cuvora.carinfo.models.cars.MileageData;
import com.cuvora.carinfo.models.cars.ModelDetails;
import com.cuvora.carinfo.models.cars.VariantColors;
import com.cuvora.carinfo.models.cars.Variants;
import com.cuvora.carinfo.p069a.C3617b;
import com.cuvora.carinfo.p069a.C3627h;
import com.cuvora.carinfo.p069a.C3629i;
import com.cuvora.carinfo.p069a.C3629i.C1453a;
import com.cuvora.carinfo.p069a.C3631j;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class CarDetailActivity extends AppCompatActivity implements C1453a {
    /* renamed from: n */
    private String f21702n;
    /* renamed from: o */
    private AdView f21703o;
    /* renamed from: p */
    private List<Integer> f21704p;
    /* renamed from: q */
    private String f21705q;
    /* renamed from: r */
    private CarVariantsData f21706r;
    /* renamed from: s */
    private ProgressLinearLayout f21707s;
    /* renamed from: t */
    private C0362a<Response> f21708t = new C35882(this);
    /* renamed from: u */
    private OnClickListener f21709u = new C14123(this);

    /* renamed from: com.cuvora.carinfo.CarDetailActivity$1 */
    class C14111 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CarDetailActivity f4381a;

        C14111(CarDetailActivity carDetailActivity) {
            this.f4381a = carDetailActivity;
        }

        public void onClick(View view) {
            C1561p.m5944b(this.f4381a, this.f4381a.f21705q);
        }
    }

    /* renamed from: com.cuvora.carinfo.CarDetailActivity$3 */
    class C14123 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CarDetailActivity f4382a;

        C14123(CarDetailActivity carDetailActivity) {
            this.f4382a = carDetailActivity;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4382a) != null) {
                this.f4382a.m29906m();
                C1533a.m5787a(this.f4382a.f21703o, this.f4382a);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.CarDetailActivity$2 */
    class C35882 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ CarDetailActivity f14753a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C35882(CarDetailActivity carDetailActivity) {
            this.f14753a = carDetailActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            i = new Bundle();
            i.putString("KEY_MODEL_ID", this.f14753a.f21702n);
            return new C4564c(this.f14753a, i);
        }

        /* renamed from: a */
        public void m18169a(C0392c<Response> c0392c, Response response) {
            if ((response instanceof CarVariantsData) != null) {
                this.f14753a.f21707s.m5769a();
                this.f14753a.f21706r = (CarVariantsData) response;
                this.f14753a.m29905l();
            } else if (this.f14753a.f21706r == null) {
                this.f14753a.f21707s.m5770a(this.f14753a.getResources().getDrawable(2131165375), "Something Went Wrong", this.f14753a.getResources().getString(R.string.homepage_data_error_msg), "Try Again", this.f14753a.f21709u, this.f14753a.f21704p);
                this.f14753a.setTitle("Error");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_car_detail);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        setTitle("");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.viewpagerWrapper);
        int b = C1570t.m5992b((Activity) this);
        int i = (b * 100) / 178;
        frameLayout.setLayoutParams(new LayoutParams(b, i));
        this.f21707s = (ProgressLinearLayout) findViewById(R.id.progressActivity);
        View view = (FloatingActionButton) findViewById(R.id.shareButtonVariantsActivity);
        m29891a(view, 0, i - getResources().getDimensionPixelSize(R.dimen.share_button_margin_offset), 0, 0);
        view.setOnClickListener(new C14111(this));
        boolean z = true;
        mo4973h().mo538b(true);
        mo4973h().mo532a(true);
        this.f21704p = new ArrayList();
        this.f21704p.add(Integer.valueOf(R.id.appBarLayout));
        this.f21703o = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21703o, (Context) this);
        this.f21702n = getIntent().getStringExtra("KEY_MODEL_ID");
        bundle = getIntent().getStringExtra("STATE");
        if (bundle == null) {
            bundle = "LOADING";
        }
        int hashCode = bundle.hashCode();
        if (hashCode != 66247144) {
            if (hashCode == 1054633244) {
                if (bundle.equals("LOADING") != null) {
                    switch (z) {
                        case false:
                            this.f21707s.m5770a(getResources().getDrawable(2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21709u, this.f21704p);
                            setTitle("Error");
                            return;
                        case true:
                            this.f21706r = (CarVariantsData) getIntent().getSerializableExtra("KEY_CAR_VARIANTS_DATA");
                            if (this.f21706r != null) {
                                m29905l();
                                return;
                            } else {
                                m29906m();
                                return;
                            }
                        default:
                            return;
                    }
                }
            }
        } else if (bundle.equals("ERROR") != null) {
            z = false;
            switch (z) {
                case false:
                    this.f21707s.m5770a(getResources().getDrawable(2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21709u, this.f21704p);
                    setTitle("Error");
                    return;
                case true:
                    this.f21706r = (CarVariantsData) getIntent().getSerializableExtra("KEY_CAR_VARIANTS_DATA");
                    if (this.f21706r != null) {
                        m29906m();
                        return;
                    } else {
                        m29905l();
                        return;
                    }
                default:
                    return;
            }
        }
        z = true;
        switch (z) {
            case false:
                this.f21707s.m5770a(getResources().getDrawable(2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21709u, this.f21704p);
                setTitle("Error");
                return;
            case true:
                this.f21706r = (CarVariantsData) getIntent().getSerializableExtra("KEY_CAR_VARIANTS_DATA");
                if (this.f21706r != null) {
                    m29905l();
                    return;
                } else {
                    m29906m();
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: l */
    private void m29905l() {
        this.f21705q = this.f21706r.getModelDetails().getShareUrl();
        m29893a(this.f21706r.getModelDetails().getImages());
        m29899d(this.f21706r.getVariantColors());
        m29897c(this.f21706r.getMileageData());
        m29895b(this.f21706r.getVariants());
        m29892a(this.f21706r.getModelDetails());
    }

    /* renamed from: a */
    private void m29893a(List<CarsImage> list) {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tb_banner_indicators);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_image_slider);
        viewPager.setAdapter(new C3617b(list, this));
        viewPager.m1940c(1);
        tabLayout.setupWithViewPager(viewPager);
    }

    /* renamed from: a */
    private void m29892a(ModelDetails modelDetails) {
        TextView textView = (TextView) findViewById(R.id.makerNameVariantActivity);
        TextView textView2 = (TextView) findViewById(R.id.priceVariantActivity);
        TextView textView3 = (TextView) findViewById(R.id.priceSuffixVariantActivity);
        setTitle(modelDetails.getModelName());
        textView.setText(modelDetails.getMakeName());
        textView2.setText(modelDetails.getPriceOverview().getPrice());
        textView3.setText(modelDetails.getPriceOverview().getPriceSuffix());
    }

    /* renamed from: b */
    private void m29895b(List<Variants> list) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_variant_version);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C0771a c3629i = new C3629i(list, this);
        c3629i.m18337a((C1453a) this);
        recyclerView.setAdapter(c3629i);
    }

    /* renamed from: c */
    private void m29897c(List<MileageData> list) {
        if (list != null && list.size() > 0) {
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.variantMileageRecyclerView);
            TextView textView = (TextView) findViewById(R.id.mileageLabelVariantActivity);
            recyclerView.setVisibility(0);
            textView.setVisibility(0);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
            recyclerView.m24635a(new C3668e(getResources().getDimensionPixelSize(R.dimen.variant_act_margin)));
            recyclerView.setAdapter(new C3627h(list, this));
        }
    }

    /* renamed from: d */
    private void m29899d(List<VariantColors> list) {
        if (list != null && list.size() > 0) {
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_variant_colors);
            TextView textView = (TextView) findViewById(R.id.colorsLabelVariantActivity);
            View findViewById = findViewById(R.id.colorDividerVariantActivity);
            textView.setVisibility(0);
            recyclerView.setVisibility(0);
            findViewById.setVisibility(0);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
            recyclerView.m24635a(new C3667d(getResources().getDimensionPixelSize(R.dimen.variant_act_margin)));
            recyclerView.setAdapter(new C3631j(list, this));
        }
    }

    /* renamed from: a */
    public void mo5015a(String str, String str2) {
        Intent intent = new Intent(this, CarVariantPropertiesActivity.class);
        intent.putExtra("KEY_VERSION_ID", str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21706r.getModelDetails().getModelName());
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        intent.putExtra("KEY_VERSION_TITLE", stringBuilder.toString());
        if (C1547j.m5914d(this) == null) {
            intent.putExtra("STATE", "ERROR");
        } else {
            intent.putExtra("STATE", "LOADING");
        }
        startActivity(intent);
    }

    /* renamed from: i */
    public boolean mo5016i() {
        onBackPressed();
        return true;
    }

    protected void onDestroy() {
        this.f21703o.destroy();
        super.onDestroy();
    }

    /* renamed from: m */
    private void m29906m() {
        this.f21707s.m5771a(this.f21704p);
        setTitle("Loading");
        m28708g().mo264a(100, null, this.f21708t).m1455m();
    }

    /* renamed from: a */
    private void m29891a(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            ((MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }
}
