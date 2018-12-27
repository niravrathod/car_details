package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1545h;
import com.cuvora.carinfo.helpers.C1551m;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Action;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Type;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.p069a.C1458r;
import com.cuvora.carinfo.p069a.C1458r.C1457a;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class RecentSearchActivity extends AppCompatActivity implements C1457a {
    /* renamed from: n */
    private ListView f21765n;
    /* renamed from: o */
    private LinearLayout f21766o;
    /* renamed from: p */
    private TextView f21767p;
    /* renamed from: q */
    private AdView f21768q;
    /* renamed from: r */
    private GarageResult f21769r;
    /* renamed from: s */
    private List<VehicleSearchResult> f21770s = null;
    /* renamed from: t */
    private ArrayAdapter<VehicleSearchResult> f21771t;
    /* renamed from: u */
    private C0362a<Response> f21772u = new C35993(this);

    /* renamed from: com.cuvora.carinfo.RecentSearchActivity$1 */
    class C14261 implements OnItemClickListener {
        /* renamed from: a */
        final /* synthetic */ RecentSearchActivity f4403a;

        C14261(RecentSearchActivity recentSearchActivity) {
            this.f4403a = recentSearchActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1540d.m5833i();
            VehicleSearchResult vehicleSearchResult = (VehicleSearchResult) this.f4403a.f21765n.getItemAtPosition(i);
            if (vehicleSearchResult != null) {
                this.f4403a.m29998c(vehicleSearchResult);
            } else {
                C1570t.m5985a(this.f4403a, this.f4403a.getResources().getString(R.string.recent_search_click_error));
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.RecentSearchActivity$2 */
    class C14272 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ RecentSearchActivity f4404a;

        C14272(RecentSearchActivity recentSearchActivity) {
            this.f4404a = recentSearchActivity;
        }

        public void onClick(View view) {
            this.f4404a.startActivity(new Intent(this.f4404a, SearchActivity.class));
        }
    }

    /* renamed from: com.cuvora.carinfo.RecentSearchActivity$3 */
    class C35993 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ RecentSearchActivity f14767a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C35993(RecentSearchActivity recentSearchActivity) {
            this.f14767a = recentSearchActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            C1551m.m5924a(this.f14767a);
            return new UpdateVehicleInRecentOrGarageLoader(this.f14767a, bundle.getString("KEY_VEHICLE_NUMBER"), (Action) bundle.getSerializable("androidx.browser.browseractions.ACTION"), (Type) bundle.getSerializable("KEY_TYPE"));
        }

        /* renamed from: a */
        public void m18205a(C0392c<Response> c0392c, Response response) {
            C1551m.m5926b(this.f14767a);
            if ((response instanceof GarageResult) != null) {
                this.f14767a.m29996a(C1570t.m6026k(this.f14767a));
            } else {
                Toast.makeText(this.f14767a, "Deletion failed, Please try again! ", 0).show();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_recent_search);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        mo4973h().mo531a((CharSequence) "Recent Searches");
        m29999l();
        this.f21769r = C1570t.m6026k(this);
        m29996a(this.f21769r);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: l */
    private void m29999l() {
        this.f21765n = (ListView) findViewById(R.id.lv_recent_searches);
        this.f21766o = (LinearLayout) findViewById(R.id.ll_recent_search_container);
        this.f21767p = (TextView) findViewById(R.id.tv_recent_search_text);
        this.f21767p.setVisibility(8);
        this.f21768q = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21768q, (Context) this);
    }

    /* renamed from: a */
    private void m29996a(GarageResult garageResult) {
        this.f21770s = new ArrayList();
        try {
            List<VehicleSearchResult> query = C3688b.m18507a((Context) this).m18508a().queryBuilder().orderBy("search_date", false).query();
            if (query != null) {
                for (VehicleSearchResult vehicleSearchResult : query) {
                    VehicleSearchResult vehicleSearchResult2;
                    if (garageResult.getVehicleNumbers().contains(vehicleSearchResult2.getVehicleNum())) {
                        vehicleSearchResult2 = C1545h.m5871a(vehicleSearchResult2.getJsonString());
                        if (vehicleSearchResult2 != null) {
                            this.f21770s.add(vehicleSearchResult2);
                        }
                    }
                }
            }
        } catch (GarageResult garageResult2) {
            garageResult2.printStackTrace();
        }
        if (this.f21770s == null || this.f21770s.size() <= null) {
            this.f21766o.setVisibility(8);
            findViewById(R.id.rl_placeholder).setVisibility(0);
        } else {
            this.f21766o.setVisibility(0);
            if (this.f21771t == null) {
                this.f21771t = new C1458r(this, this.f21770s, this);
                this.f21765n.setAdapter(this.f21771t);
            } else {
                this.f21771t.clear();
                this.f21771t.addAll(this.f21770s);
                this.f21771t.notifyDataSetChanged();
            }
        }
        this.f21765n.setOnItemClickListener(new C14261(this));
        findViewById(R.id.tv_launch_search).setOnClickListener(new C14272(this));
    }

    /* renamed from: b */
    private void m29997b(VehicleSearchResult vehicleSearchResult) {
        if (this.f21769r.getVehicleNumbers().contains(vehicleSearchResult.getVehicleNum()) && this.f21769r.getMyGarageVehicles().contains(vehicleSearchResult.getVehicleNum())) {
            C3688b.m18507a((Context) this).m18510a(vehicleSearchResult.getVehicleNum());
        }
        this.f21770s.remove(vehicleSearchResult);
        this.f21771t.notifyDataSetChanged();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_VEHICLE_NUMBER", vehicleSearchResult.getVehicleNum());
        bundle.putSerializable("androidx.browser.browseractions.ACTION", Action.DELETE);
        bundle.putSerializable("KEY_TYPE", Type.RECENT);
        m28708g().mo264a(100, bundle, this.f21772u).m1455m();
    }

    /* renamed from: c */
    private void m29998c(VehicleSearchResult vehicleSearchResult) {
        Intent intent = new Intent(this, VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        startActivity(intent);
    }

    /* renamed from: a */
    public void mo5023a(VehicleSearchResult vehicleSearchResult) {
        m29997b(vehicleSearchResult);
    }

    protected void onDestroy() {
        this.f21768q.destroy();
        super.onDestroy();
    }
}
