package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1551m;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.loaders.C4574r;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.TrendingSearchResult;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.views.AsyncImageView;
import com.google.android.gms.ads.AdView;
import com.google.gson.C2629e;
import java.util.ArrayList;
import java.util.List;

public class TrendingSearchActivity extends AppCompatActivity {
    /* renamed from: n */
    private ListView f21832n;
    /* renamed from: o */
    private ArrayAdapter<VehicleSearchResult> f21833o;
    /* renamed from: p */
    private List<VehicleSearchResult> f21834p;
    /* renamed from: q */
    private AdView f21835q;
    /* renamed from: r */
    private C0362a<Response> f21836r = new C36102(this);

    /* renamed from: com.cuvora.carinfo.TrendingSearchActivity$1 */
    class C14391 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ TrendingSearchActivity f4418a;

        C14391(TrendingSearchActivity trendingSearchActivity) {
            this.f4418a = trendingSearchActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1540d.m5842n();
            VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f4418a.f21832n.getItemAtPosition(i);
            if (vehicleSearchResult != null) {
                this.f4418a.m30080a(vehicleSearchResult);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.TrendingSearchActivity$a */
    public class C1440a extends ArrayAdapter<VehicleSearchResult> {
        /* renamed from: a */
        final /* synthetic */ TrendingSearchActivity f4419a;
        /* renamed from: b */
        private Context f4420b;
        /* renamed from: c */
        private List<VehicleSearchResult> f4421c;

        public C1440a(TrendingSearchActivity trendingSearchActivity, Context context, List<VehicleSearchResult> list) {
            this.f4419a = trendingSearchActivity;
            super(context, -1, list);
            this.f4420b = context;
            this.f4421c = list;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            this.f4419a.getLayoutInflater();
            view = LayoutInflater.from(this.f4420b).inflate(R.layout.row_recent_searches, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.tv_vehicle_number);
            ((TextView) view.findViewById(R.id.tv_vehicle_description)).setVisibility(8);
            AsyncImageView asyncImageView = (AsyncImageView) view.findViewById(R.id.iv_car);
            ((ImageView) view.findViewById(R.id.iv_delete)).setVisibility(8);
            VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f4421c.get(i);
            if (vehicleSearchResult != null) {
                textView.setText(vehicleSearchResult.getDisplayName());
                if (!(vehicleSearchResult.getImageUrl() == null || C1562q.m5946a(vehicleSearchResult.getImageUrl()) == null)) {
                    asyncImageView.setImageUrl(vehicleSearchResult.getImageUrl());
                }
            }
            return view;
        }
    }

    /* renamed from: com.cuvora.carinfo.TrendingSearchActivity$2 */
    class C36102 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ TrendingSearchActivity f14780a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C36102(TrendingSearchActivity trendingSearchActivity) {
            this.f14780a = trendingSearchActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return new C4574r(this.f14780a);
        }

        /* renamed from: a */
        public void m18256a(C0392c<Response> c0392c, Response response) {
            C1551m.m5926b(this.f14780a);
            if (response != null && (response instanceof TrendingSearchResult) != null) {
                this.f14780a.m30079a((TrendingSearchResult) response);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_trending_search);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        mo4973h().mo531a((CharSequence) "Trending");
        m30081l();
        this.f21834p = new ArrayList();
        bundle = PreferenceManager.getDefaultSharedPreferences(this);
        C2629e c2629e = new C2629e();
        String string = bundle.getString("KEY_TRENDING_SEARCH_RESULT_JSON", null);
        if (string != null) {
            m30079a((TrendingSearchResult) c2629e.m12880a(string, TrendingSearchResult.class));
        } else {
            C1551m.m5924a(this);
            m28708g().mo264a(100, null, this.f21836r).m1455m();
        }
        this.f21832n.setOnItemClickListener(new C14391(this));
    }

    /* renamed from: a */
    private void m30080a(VehicleSearchResult vehicleSearchResult) {
        Intent intent = new Intent(this, VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        startActivity(intent);
    }

    /* renamed from: l */
    private void m30081l() {
        this.f21832n = (ListView) findViewById(R.id.lv_trending_searches);
        this.f21835q = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21835q, (Context) this);
    }

    /* renamed from: a */
    private void m30079a(TrendingSearchResult trendingSearchResult) {
        this.f21834p.addAll(trendingSearchResult.getVehicleSearchResultList());
        this.f21833o = new C1440a(this, this, this.f21834p);
        this.f21832n.setAdapter(this.f21833o);
    }

    protected void onDestroy() {
        this.f21835q.destroy();
        super.onDestroy();
    }
}
