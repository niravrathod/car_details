package com.cuvora.carinfo;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.Toolbar;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.ProgressLinearLayout;
import com.cuvora.carinfo.loaders.C4565d;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.Brands;
import com.cuvora.carinfo.models.cars.CarsBrandsResponse;
import com.cuvora.carinfo.p069a.C3633k;
import com.cuvora.carinfo.p069a.C3633k.C1454b;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class CarsBrandsActivity extends AppCompatActivity implements C1454b {
    /* renamed from: n */
    ProgressLinearLayout f21728n;
    /* renamed from: o */
    String f21729o;
    /* renamed from: p */
    private AdView f21730p;
    /* renamed from: q */
    private CarsBrandsResponse f21731q;
    /* renamed from: r */
    private List<Integer> f21732r;
    /* renamed from: s */
    private C0362a<Response> f21733s = new C35951(this);
    /* renamed from: t */
    private OnClickListener f21734t = new C14152(this);

    /* renamed from: com.cuvora.carinfo.CarsBrandsActivity$2 */
    class C14152 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CarsBrandsActivity f4386a;

        C14152(CarsBrandsActivity carsBrandsActivity) {
            this.f4386a = carsBrandsActivity;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4386a) != null) {
                this.f4386a.m29945l();
                C1533a.m5787a(this.f4386a.f21730p, this.f4386a);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.CarsBrandsActivity$1 */
    class C35951 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ CarsBrandsActivity f14761a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C35951(CarsBrandsActivity carsBrandsActivity) {
            this.f14761a = carsBrandsActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return new C4565d(this.f14761a);
        }

        /* renamed from: a */
        public void m18189a(C0392c<Response> c0392c, Response response) {
            if ((response instanceof CarsBrandsResponse) != null) {
                this.f14761a.f21728n.m5769a();
                this.f14761a.setTitle("Cars");
                this.f14761a.f21731q = (CarsBrandsResponse) response;
                this.f14761a.m29940a(this.f14761a.f21731q.getBrandsArrayList());
            } else if (this.f14761a.f21731q == null) {
                this.f14761a.f21728n.m5770a(this.f14761a.getResources().getDrawable(2131165375), "Something Went Wrong", this.f14761a.getResources().getString(R.string.homepage_data_error_msg), "Try Again", this.f14761a.f21734t, this.f14761a.f21732r);
                this.f14761a.setTitle("Error");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_cars_brands);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        this.f21730p = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21730p, (Context) this);
        this.f21728n = (ProgressLinearLayout) findViewById(R.id.progressActivity);
        boolean z = true;
        mo4973h().mo538b(true);
        mo4973h().mo532a(true);
        this.f21732r = new ArrayList();
        this.f21732r.add(Integer.valueOf(R.id.appBarLayout));
        this.f21729o = getIntent().getStringExtra("STATE");
        if (this.f21729o == null) {
            this.f21729o = "LOADING";
        }
        bundle = this.f21729o;
        int hashCode = bundle.hashCode();
        if (hashCode != 66247144) {
            if (hashCode == 1054633244) {
                if (bundle.equals("LOADING") != null) {
                    switch (z) {
                        case false:
                            this.f21728n.m5770a(getResources().getDrawable(2131165375), "No Connection", getResources().getString(R.string.no_internet_message), "Try Again", this.f21734t, this.f21732r);
                            setTitle("Error");
                            return;
                        case true:
                            m29945l();
                            return;
                        default:
                            return;
                    }
                }
            }
        } else if (bundle.equals("ERROR") != null) {
            z = false;
            switch (z) {
                case false:
                    this.f21728n.m5770a(getResources().getDrawable(2131165375), "No Connection", getResources().getString(R.string.no_internet_message), "Try Again", this.f21734t, this.f21732r);
                    setTitle("Error");
                    return;
                case true:
                    m29945l();
                    return;
                default:
                    return;
            }
        }
        z = true;
        switch (z) {
            case false:
                this.f21728n.m5770a(getResources().getDrawable(2131165375), "No Connection", getResources().getString(R.string.no_internet_message), "Try Again", this.f21734t, this.f21732r);
                setTitle("Error");
                return;
            case true:
                m29945l();
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    private void m29945l() {
        this.f21728n.m5771a(this.f21732r);
        setTitle("Loading");
        m28708g().mo264a(100, null, this.f21733s).m1455m();
    }

    /* renamed from: a */
    private void m29940a(List<Brands> list) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.carBrandsRecyclerView);
        recyclerView.m24635a(new C3664c(getResources().getDimensionPixelSize(R.dimen.brands_card_spacing)));
        recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 2, 1, false));
        C0771a c3633k = new C3633k(list, this);
        recyclerView.setAdapter(c3633k);
        c3633k.m18358a(this);
    }

    /* renamed from: a */
    public void mo4627a(String str) {
        Intent intent = new Intent(this, CarListParticularBrandActivity.class);
        intent.putExtra("KEY_BRAND_ID", str);
        intent.setClass(this, CarListParticularBrandActivity.class);
        if (C1547j.m5914d(this) == null) {
            intent.putExtra("STATE", "ERROR");
            startActivity(intent);
            return;
        }
        intent.putExtra("STATE", "LOADING");
        if (VERSION.SDK_INT >= 21) {
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this, new Pair[null]).toBundle());
        } else {
            startActivity(intent);
        }
    }

    /* renamed from: i */
    public boolean mo5016i() {
        onBackPressed();
        return true;
    }

    protected void onDestroy() {
        this.f21730p.destroy();
        super.onDestroy();
    }
}
