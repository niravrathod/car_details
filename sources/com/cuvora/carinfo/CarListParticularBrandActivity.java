package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0389b;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.ProgressLinearLayout;
import com.cuvora.carinfo.loaders.C4566e;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.CarListParticularBrandResponse;
import com.cuvora.carinfo.models.cars.CarOfaBrand;
import com.cuvora.carinfo.p069a.C3621d;
import com.cuvora.carinfo.p069a.C3621d.C1451b;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class CarListParticularBrandActivity extends AppCompatActivity implements C1451b {
    /* renamed from: n */
    String f21710n;
    /* renamed from: o */
    RecyclerView f21711o;
    /* renamed from: p */
    ProgressLinearLayout f21712p;
    /* renamed from: q */
    String f21713q;
    /* renamed from: r */
    private CarListParticularBrandResponse f21714r;
    /* renamed from: s */
    private AdView f21715s;
    /* renamed from: t */
    private List<Integer> f21716t;
    /* renamed from: u */
    private C0362a<Response> f21717u = new C35921(this);
    /* renamed from: v */
    private OnClickListener f21718v = new C14132(this);

    /* renamed from: com.cuvora.carinfo.CarListParticularBrandActivity$2 */
    class C14132 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ CarListParticularBrandActivity f4384a;

        C14132(CarListParticularBrandActivity carListParticularBrandActivity) {
            this.f4384a = carListParticularBrandActivity;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4384a) != null) {
                this.f4384a.m29917l();
                C1533a.m5787a(this.f4384a.f21715s, this.f4384a);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.CarListParticularBrandActivity$1 */
    class C35921 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ CarListParticularBrandActivity f14758a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C35921(CarListParticularBrandActivity carListParticularBrandActivity) {
            this.f14758a = carListParticularBrandActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return new C4566e(this.f14758a, bundle.getString("KEY_BRAND_ID"));
        }

        /* renamed from: a */
        public void m18178a(C0392c<Response> c0392c, Response response) {
            if ((response instanceof CarListParticularBrandResponse) != null) {
                this.f14758a.f21712p.m5769a();
                this.f14758a.f21714r = (CarListParticularBrandResponse) response;
                this.f14758a.m29912a(this.f14758a.f21714r.getData());
            } else if (this.f14758a.f21714r == null) {
                this.f14758a.f21712p.m5770a(this.f14758a.getResources().getDrawable(2131165375), "Something Went Wrong", this.f14758a.getResources().getString(R.string.homepage_data_error_msg), "Try Again", this.f14758a.f21718v, this.f14758a.f21716t);
                this.f14758a.setTitle("Error");
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_car_list_particular_brand);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        this.f21715s = (AdView) findViewById(R.id.adView);
        this.f21711o = (RecyclerView) findViewById(R.id.rv_brands);
        this.f21712p = (ProgressLinearLayout) findViewById(R.id.progressActivity);
        C1533a.m5787a(this.f21715s, (Context) this);
        boolean z = true;
        mo4973h().mo538b(true);
        mo4973h().mo532a(true);
        this.f21716t = new ArrayList();
        this.f21716t.add(Integer.valueOf(R.id.appBarLayout));
        List arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.appBarLayout));
        bundle = getIntent();
        this.f21710n = bundle.getStringExtra("KEY_BRAND_ID");
        this.f21713q = bundle.getStringExtra("STATE");
        if (this.f21713q == null) {
            this.f21713q = "LOADING";
        }
        bundle = this.f21713q;
        int hashCode = bundle.hashCode();
        if (hashCode != 66247144) {
            if (hashCode == 1054633244) {
                if (bundle.equals("LOADING") != null) {
                    switch (z) {
                        case false:
                            this.f21712p.m5770a(C0389b.m1429a((Context) this, 2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21718v, arrayList);
                            setTitle("Error");
                            return;
                        case true:
                            m29917l();
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
                    this.f21712p.m5770a(C0389b.m1429a((Context) this, 2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21718v, arrayList);
                    setTitle("Error");
                    return;
                case true:
                    m29917l();
                    return;
                default:
                    return;
            }
        }
        z = true;
        switch (z) {
            case false:
                this.f21712p.m5770a(C0389b.m1429a((Context) this, 2131165375), "No Connection", getString(R.string.no_internet_message), "Try Again", this.f21718v, arrayList);
                setTitle("Error");
                return;
            case true:
                m29917l();
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    private void m29917l() {
        this.f21712p.m5771a(this.f21716t);
        setTitle("Loading");
        Bundle bundle = new Bundle();
        bundle.putString("KEY_BRAND_ID", this.f21710n);
        m28708g().mo264a(100, bundle, this.f21717u).m1455m();
    }

    /* renamed from: a */
    private void m29912a(List<CarOfaBrand> list) {
        setTitle(((CarOfaBrand) list.get(0)).getMakeName());
        this.f21711o.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C0771a c3621d = new C3621d(list, this);
        this.f21711o.setAdapter(c3621d);
        c3621d.m18300a((C1451b) this);
    }

    /* renamed from: a */
    public void mo5017a(String str) {
        Intent intent = new Intent(this, CarDetailActivity.class);
        intent.putExtra("KEY_MODEL_ID", str);
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
        this.f21715s.destroy();
        super.onDestroy();
    }
}
