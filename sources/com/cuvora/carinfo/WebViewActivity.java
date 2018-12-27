package com.cuvora.carinfo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C1575u;
import com.cuvora.carinfo.helpers.C1575u.C1572a;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.google.android.gms.ads.AdView;

public class WebViewActivity extends AppCompatActivity {
    /* renamed from: n */
    private AdView f21840n;
    /* renamed from: o */
    private ProgressDialog f21841o;
    /* renamed from: p */
    private C1572a f21842p = new C36141(this);

    /* renamed from: com.cuvora.carinfo.WebViewActivity$1 */
    class C36141 implements C1572a {
        /* renamed from: a */
        final /* synthetic */ WebViewActivity f14785a;

        /* renamed from: a */
        public void mo1167a() {
        }

        /* renamed from: b */
        public void mo1169b() {
        }

        /* renamed from: e */
        public void mo1172e() {
        }

        C36141(WebViewActivity webViewActivity) {
            this.f14785a = webViewActivity;
        }

        /* renamed from: c */
        public void mo1170c() {
            this.f14785a.m30088l();
        }

        /* renamed from: d */
        public void mo1171d() {
            this.f14785a.m30089m();
        }

        /* renamed from: a */
        public void mo1168a(VehicleSearchResult vehicleSearchResult) {
            Intent intent = new Intent(this.f14785a, VehicleInfoActivity.class);
            intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
            C1540d.m5822c(vehicleSearchResult.getVehicleNum());
            C1540d.m5828f(vehicleSearchResult.getVehicleNum());
            C1570t.m6021g(this.f14785a);
            this.f14785a.startActivity(intent);
            this.f14785a.finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_web_view);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        mo4973h().mo528a((int) R.string.vehicle_info);
        this.f21840n = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21840n, (Context) this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_web_view_container);
        View b = C1575u.m6049a().m6079b();
        if (b != null) {
            if (b.getParent() != null) {
                ((FrameLayout) b.getParent()).removeAllViews();
            }
            frameLayout.addView(b);
            bundle = null;
            if (getIntent() != null && getIntent().hasExtra("KEY_VEHICLE_NUM")) {
                bundle = getIntent().getStringExtra("KEY_VEHICLE_NUM");
            }
            C1575u.m6049a().m6077a(bundle, C1570t.m6025j(this), this.f21842p, this, false);
        }
    }

    /* renamed from: l */
    private void m30088l() {
        if (!isFinishing()) {
            if (this.f21841o == null || !this.f21841o.isShowing()) {
                this.f21841o = new ProgressDialog(this);
                this.f21841o.setIndeterminate(true);
                this.f21841o.setCancelable(true);
                this.f21841o.setMessage(getResources().getString(R.string.please_wait));
                this.f21841o.show();
            }
        }
    }

    /* renamed from: m */
    private void m30089m() {
        if (this.f21841o != null && this.f21841o.isShowing() && !isFinishing()) {
            this.f21841o.dismiss();
            this.f21841o = null;
        }
    }

    protected void onDestroy() {
        this.f21840n.destroy();
        C1575u.m6049a().m6081d();
        super.onDestroy();
    }
}
