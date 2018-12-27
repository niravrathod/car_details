package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.genericScraper.C1529b;
import com.cuvora.carinfo.genericScraper.C4562a;
import com.cuvora.carinfo.genericScraper.ScrapeResponse;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1564r;
import com.cuvora.carinfo.helpers.C1564r.C1563a;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.loaders.C4572p;
import com.cuvora.carinfo.loaders.C4575v;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Action;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Type;
import com.cuvora.carinfo.models.ErrorMode;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.MaydayAndResponse;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.modes.ScrapeMode;
import com.cuvora.carinfo.service.MaydayService;
import com.cuvora.carinfo.service.ScraperService;
import com.cuvora.carinfo.views.C1688b;
import com.cuvora.carinfo.views.ScrapeView;
import com.cuvora.carinfo.views.ScrapeView.C1679a;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;
import java.io.Serializable;

public class SearchResultLoaderActivity extends AppCompatActivity {
    /* renamed from: A */
    private AdView f21802A;
    /* renamed from: B */
    private Toolbar f21803B;
    /* renamed from: C */
    private LinearLayout f21804C;
    /* renamed from: D */
    private AdView f21805D;
    /* renamed from: E */
    private UnifiedNativeAdView f21806E;
    /* renamed from: F */
    private C0362a f21807F = new C36041(this);
    /* renamed from: G */
    private C0362a<Response> f21808G = new C36053(this);
    /* renamed from: H */
    private C0362a f21809H = new C36064(this);
    /* renamed from: I */
    private C0362a<MaydayAndResponse> f21810I = new C36075(this);
    /* renamed from: J */
    private C1563a f21811J = new -$$Lambda$SearchResultLoaderActivity$sQVQRyXSRSz5pMwOq8qgxKzXLlo();
    /* renamed from: K */
    private C1679a f21812K = new C36086(this);
    /* renamed from: n */
    Handler f21813n = new Handler(new C14332(this));
    /* renamed from: o */
    private String f21814o;
    /* renamed from: p */
    private boolean f21815p = false;
    /* renamed from: q */
    private boolean f21816q;
    /* renamed from: r */
    private boolean f21817r;
    /* renamed from: s */
    private MaydayAndResponse f21818s;
    /* renamed from: t */
    private CircularFillableLoaders f21819t;
    /* renamed from: u */
    private TextView f21820u;
    /* renamed from: v */
    private ScrapeView f21821v;
    /* renamed from: w */
    private int f21822w = 10;
    /* renamed from: x */
    private int f21823x;
    /* renamed from: y */
    private int f21824y;
    /* renamed from: z */
    private LinearLayout f21825z;

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$2 */
    class C14332 implements Callback {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f4413a;

        C14332(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f4413a = searchResultLoaderActivity;
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                if (this.f4413a.f21816q != null) {
                    this.f4413a.m30040a(this.f4413a.f21818s);
                }
                this.f4413a.f21817r = true;
            } else if (message.what == 2 && this.f4413a.f21817r == null) {
                this.f4413a.f21822w = this.f4413a.f21822w + 10;
                if (this.f4413a.f21822w == 50) {
                    this.f4413a.f21820u.setText(this.f4413a.getString(R.string.loader_text2));
                }
                this.f4413a.f21819t.setProgress(this.f4413a.f21822w);
                this.f4413a.f21813n.sendEmptyMessageDelayed(2, (long) this.f4413a.f21823x);
            }
            return true;
        }
    }

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$1 */
    class C36041 implements C0362a<MaydayAndResponse> {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f14773a;

        /* renamed from: a */
        public void mo1159a(C0392c c0392c) {
        }

        C36041(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f14773a = searchResultLoaderActivity;
        }

        /* renamed from: a */
        public C0392c mo1158a(int i, Bundle bundle) {
            return new C4575v(this.f14773a, bundle.getString("KEY_VEHICLE_NUMBER"), bundle.getBoolean("KEY_SKIP_DB"));
        }

        /* renamed from: a */
        public void m18223a(C0392c<MaydayAndResponse> c0392c, MaydayAndResponse maydayAndResponse) {
            this.f14773a.f21816q = true;
            this.f14773a.f21818s = maydayAndResponse;
            if (this.f14773a.isFinishing() == null && this.f14773a.f21817r != null) {
                this.f14773a.m30040a(maydayAndResponse);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$3 */
    class C36053 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f14774a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        /* renamed from: a */
        public void m18227a(C0392c<Response> c0392c, Response response) {
        }

        C36053(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f14774a = searchResultLoaderActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return new UpdateVehicleInRecentOrGarageLoader(this.f14774a, bundle.getString("KEY_VEHICLE_NUMBER"), (Action) bundle.getSerializable("androidx.browser.browseractions.ACTION"), (Type) bundle.getSerializable("KEY_TYPE"));
        }
    }

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$4 */
    class C36064 implements C0362a<C1529b> {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f14775a;

        /* renamed from: a */
        public void mo1159a(C0392c<C1529b> c0392c) {
        }

        C36064(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f14775a = searchResultLoaderActivity;
        }

        /* renamed from: a */
        public C0392c<C1529b> mo1158a(int i, Bundle bundle) {
            return new C4562a(this.f14775a, (ScrapeResponse) bundle.getSerializable("KEY_SCRAPE_RESPONSE"), this.f14775a.f21814o);
        }

        /* renamed from: a */
        public void m18231a(C0392c<C1529b> c0392c, C1529b c1529b) {
            if (c1529b == null || C1562q.m5946a(c1529b.m5745a()) == null) {
                C1570t.m5985a(this.f14775a, this.f14775a.getResources().getString(R.string.info_unavailable));
                this.f14775a.finish();
                return;
            }
            c0392c = new Bundle();
            c0392c.putString("KEY_VEHICLE_NUM", this.f14775a.f21814o);
            c0392c.putString("KEY_SCRAPE_REQUEST", c1529b.m5745a());
            c0392c.putString("KEY_MODE", c1529b.m5747b());
            this.f14775a.m28708g().mo264a(1, c0392c, this.f14775a.f21810I).m1455m();
        }
    }

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$5 */
    class C36075 implements C0362a<MaydayAndResponse> {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f14776a;
        /* renamed from: b */
        private String f14777b;

        /* renamed from: a */
        public void mo1159a(C0392c<MaydayAndResponse> c0392c) {
        }

        C36075(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f14776a = searchResultLoaderActivity;
        }

        /* renamed from: a */
        public C0392c<MaydayAndResponse> mo1158a(int i, Bundle bundle) {
            this.f14777b = bundle.getString("KEY_SCRAPE_REQUEST");
            return new C4572p(this.f14776a, bundle.getString("KEY_VEHICLE_NUM"), this.f14777b, bundle.getString("KEY_MODE"));
        }

        /* renamed from: a */
        public void m18235a(C0392c<MaydayAndResponse> c0392c, MaydayAndResponse maydayAndResponse) {
            if (this.f14776a.isFinishing() == null) {
                this.f14776a.m30040a(maydayAndResponse);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.SearchResultLoaderActivity$6 */
    class C36086 implements C1679a {
        /* renamed from: a */
        final /* synthetic */ SearchResultLoaderActivity f14778a;

        /* renamed from: c */
        public void mo1177c() {
        }

        /* renamed from: d */
        public void mo1178d() {
        }

        /* renamed from: e */
        public void mo1179e() {
        }

        C36086(SearchResultLoaderActivity searchResultLoaderActivity) {
            this.f14778a = searchResultLoaderActivity;
        }

        /* renamed from: a */
        public void mo1173a() {
            this.f14778a.runOnUiThread(new C1406x545795d1());
        }

        /* renamed from: l */
        private /* synthetic */ void m18242l() {
            C1570t.m5985a(this.f14778a, this.f14778a.getString(R.string.invalid_vehicle_num));
            C1540d.m5831h();
            this.f14778a.finish();
        }

        /* renamed from: b */
        public void mo1176b() {
            this.f14778a.runOnUiThread(new C1405x188906cb());
        }

        /* renamed from: k */
        private /* synthetic */ void m18241k() {
            C1540d.m5825e();
            this.f14778a.m30065r();
        }

        /* renamed from: b */
        private /* synthetic */ void m18238b(VehicleSearchResult vehicleSearchResult) {
            this.f14778a.m30047b(vehicleSearchResult);
        }

        /* renamed from: a */
        public void mo1175a(VehicleSearchResult vehicleSearchResult) {
            this.f14778a.runOnUiThread(new C1403xee7e767b(this, vehicleSearchResult));
        }

        /* renamed from: f */
        public void mo1180f() {
            this.f14778a.runOnUiThread(new C1402x58b724d9());
        }

        /* renamed from: j */
        private /* synthetic */ void m18240j() {
            C1540d.m5827f();
            this.f14778a.m30065r();
        }

        /* renamed from: g */
        public void mo1181g() {
            this.f14778a.runOnUiThread(-$$Lambda$eStdulTp5dk8feIlIJz8JZ0ZaGc.INSTANCE);
        }

        /* renamed from: b */
        private /* synthetic */ void m18237b(ErrorResponse errorResponse) {
            this.f14778a.m30039a(errorResponse);
        }

        /* renamed from: a */
        public void mo1174a(ErrorResponse errorResponse) {
            this.f14778a.runOnUiThread(new C1404x2c44f99e(this, errorResponse));
        }

        /* renamed from: h */
        public void mo1182h() {
            this.f14778a.runOnUiThread(new C1401xaf52bcc());
        }

        /* renamed from: i */
        private /* synthetic */ void m18239i() {
            C1540d.m5846r();
            Serializable errorResponse = new ErrorResponse();
            errorResponse.setCode(ErrorMode.BACKGROUND_WEBVIEW_LOADING_ERROR.getValue());
            errorResponse.setMessage(this.f14778a.getString(R.string.web_view_load_error));
            Intent intent = new Intent();
            intent.putExtra("KEY_ERROR_RESPONSE", errorResponse);
            this.f14778a.setResult(13, intent);
            this.f14778a.finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m30059l();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m30059l();
    }

    /* renamed from: l */
    private void m30059l() {
        setContentView((int) R.layout.activity_search_loader);
        m30060m();
        this.f21814o = getIntent().getStringExtra("KEY_VEHICLE_NUMBER");
        this.f21824y = C1570t.m6032q(this) ? 2000 : C1541e.m5855b("searchScreenLoaderWaitTime").intValue();
        this.f21813n.sendEmptyMessageDelayed(1, (long) (this.f21824y - 1000));
        C1540d.m5809a(this.f21814o);
        Bundle bundle = new Bundle();
        bundle.putString("KEY_VEHICLE_NUMBER", this.f21814o);
        bundle.putBoolean("KEY_SKIP_DB", getIntent().getBooleanExtra("KEY_SKIP_DB", false));
        m28708g().mo264a(100, bundle, this.f21807F).m1455m();
        this.f21819t.setProgress(this.f21822w);
        this.f21823x = this.f21824y / 10;
        this.f21813n.sendEmptyMessageDelayed(2, (long) this.f21823x);
    }

    /* renamed from: m */
    private void m30060m() {
        this.f21804C = (LinearLayout) findViewById(R.id.ll_smart_ad);
        this.f21819t = (CircularFillableLoaders) findViewById(R.id.cfl_progress);
        this.f21802A = (AdView) findViewById(R.id.adViewInner);
        this.f21820u = (TextView) findViewById(R.id.tv_loader_text);
        this.f21821v = (ScrapeView) findViewById(R.id.scrapeView);
        this.f21825z = (LinearLayout) findViewById(R.id.webViewCon);
        this.f21803B = (Toolbar) findViewById(R.id.toolbar);
        m29816a(this.f21803B);
        if (mo4973h() != null) {
            mo4973h().mo531a((CharSequence) "Vehicle Info");
        }
        this.f21805D = C1688b.m6369a(this, getResources().getString(R.string.search_loader_banner_new));
        View e = C1533a.m5797e(this);
        this.f21806E = (UnifiedNativeAdView) e.findViewById(R.id.unified_native_adview);
        this.f21804C.addView(C1688b.m6371b(this, this.f21805D, getResources().getString(R.string.search_loader_native_ad), e.findViewById(R.id.ivDistractView), e, this.f21806E));
    }

    /* renamed from: n */
    private void m30061n() {
        C1533a.m5787a(this.f21802A, (Context) this);
    }

    public void onStop() {
        super.onStop();
        m30062o();
    }

    /* renamed from: o */
    private void m30062o() {
        if (this.f21813n != null) {
            this.f21813n.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    private void m30040a(MaydayAndResponse maydayAndResponse) {
        Response response;
        VehicleSearchResult vehicleSearchResult = null;
        if (maydayAndResponse != null) {
            response = maydayAndResponse.getResponse();
            if (response instanceof VehicleSearchResult) {
                vehicleSearchResult = (VehicleSearchResult) response;
            }
            maydayAndResponse = maydayAndResponse.getMayday();
            if (!(maydayAndResponse == null || maydayAndResponse.getScrapeResponse() == null)) {
                Intent intent = new Intent(this, MaydayService.class);
                intent.putExtra("KEY_MAYDAY", maydayAndResponse);
                startService(intent);
            }
        } else {
            response = null;
        }
        if (vehicleSearchResult != null && vehicleSearchResult.getVehicleInfoList() != null && vehicleSearchResult.getVehicleInfoList().size() > null) {
            C3688b.m18507a((Context) this).m18509a(vehicleSearchResult);
            m30041a(vehicleSearchResult);
            C1540d.m5822c(this.f21814o);
            C1570t.m6021g(this);
            C1570t.m5980a((Context) this, C1570t.m5973a());
            if (vehicleSearchResult.isDbReferred() != null) {
                C1540d.m5834i(this.f21814o);
            }
            m30047b(vehicleSearchResult);
            if (C1570t.m6011d(this.f21814o) != null && C1541e.m5856c("eChallanScraperEnabled") != null && vehicleSearchResult.isHelpMe() != null) {
                m30063p();
            }
        } else if ((response instanceof ScrapeResponse) != null) {
            maydayAndResponse = new Bundle();
            maydayAndResponse.putSerializable("KEY_SCRAPE_RESPONSE", (ScrapeResponse) response);
            m28708g().mo264a(101, maydayAndResponse, this.f21809H).m1455m();
        } else {
            C1540d.m5824d(this.f21814o);
            if ((response instanceof ErrorResponse) != null) {
                m30039a((ErrorResponse) response);
                return;
            }
            C1570t.m5985a((Context) this, getResources().getString(R.string.info_unavailable));
            finish();
        }
    }

    /* renamed from: a */
    private void m30041a(VehicleSearchResult vehicleSearchResult) {
        Bundle bundle = new Bundle();
        bundle.putString("KEY_VEHICLE_NUMBER", vehicleSearchResult.getVehicleNum());
        bundle.putSerializable("androidx.browser.browseractions.ACTION", Action.ADD);
        bundle.putSerializable("KEY_TYPE", Type.RECENT);
        m28708g().mo264a(103, bundle, this.f21808G).m1455m();
    }

    /* renamed from: p */
    private void m30063p() {
        Intent intent = new Intent(this, ScraperService.class);
        intent.putExtra("KEY_VEHICLE_NUMBER", this.f21814o);
        startService(intent);
    }

    /* renamed from: b */
    private void m30047b(VehicleSearchResult vehicleSearchResult) {
        this.f21820u.setText(getString(R.string.loader_text3));
        this.f21819t.setProgress(100);
        new Handler().postDelayed(new -$$Lambda$SearchResultLoaderActivity$T6Ce9f4MuJOwjdH4JLJaY9Qa2G8(this, vehicleSearchResult), 1000);
    }

    /* renamed from: c */
    private /* synthetic */ void m30051c(VehicleSearchResult vehicleSearchResult) {
        C1459a.f4442a.m5712c(null);
        Intent intent = new Intent(this, VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        intent.putExtra("KEY_VIA_VEHICLE_SEARCH", true);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* renamed from: a */
    private void m30042a(ScrapeMode scrapeMode) {
        C1564r.m5949a((AppCompatActivity) this).m5952a(this.f21811J, this.f21814o, scrapeMode);
    }

    /* renamed from: b */
    private /* synthetic */ void m30046b(MaydayAndResponse maydayAndResponse) {
        m30040a(maydayAndResponse);
    }

    /* renamed from: a */
    private void m30039a(ErrorResponse errorResponse) {
        ErrorMode errorModeWithValue = ErrorMode.getErrorModeWithValue(errorResponse.getCode());
        String string = getResources().getString(R.string.info_unavailable);
        this.f21815p = false;
        if (ErrorMode.BACKGROUND_WEBVIEW == errorModeWithValue && C1562q.m5946a(C1541e.m5852a("webview_url"))) {
            if (C1541e.m5856c("backgroundWebviewEnable") != null) {
                m30064q();
            } else {
                m30065r();
            }
        } else if (errorModeWithValue == ErrorMode.E_CHALLAN) {
            m30042a(ScrapeMode.ECHALLAN);
        } else if (errorModeWithValue == ErrorMode.ERROR_DIALOG) {
            r0 = new Intent();
            r0.putExtra("KEY_ERROR_RESPONSE", errorResponse);
            setResult(13, r0);
            finish();
        } else if (errorModeWithValue == ErrorMode.ERROR_SCREEN) {
            r0 = new Intent(this, SearchErrorActivity.class);
            r0.putExtra("KEY_VEHICLE_NUMBER", this.f21814o);
            r0.putExtra("KEY_ERROR_RESPONSE", errorResponse);
            startActivity(r0);
            finish();
        } else {
            if (C1562q.m5946a(errorResponse.getMessage())) {
                string = errorResponse.getMessage();
            }
            C1570t.m5985a((Context) this, string);
            finish();
        }
    }

    /* renamed from: q */
    private void m30064q() {
        this.f21821v.setListener(this.f21812K);
        this.f21821v.m6361a(this.f21814o);
    }

    /* renamed from: r */
    private void m30065r() {
        C1540d.m5832h(this.f21814o);
        this.f21821v.m6360a();
        this.f21825z.setVisibility(0);
        m30061n();
    }

    protected void onDestroy() {
        this.f21805D.destroy();
        this.f21806E.destroy();
        this.f21802A.destroy();
        if (this.f21821v != null) {
            this.f21821v.m6363c();
        }
        super.onDestroy();
    }
}
