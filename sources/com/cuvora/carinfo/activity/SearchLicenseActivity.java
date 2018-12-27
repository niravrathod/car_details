package com.cuvora.carinfo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.cuvora.carinfo.C1459a;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.C3663b;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.SearchErrorActivity;
import com.cuvora.carinfo.fragment.SearchLicenceFragment.C1492a;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.loaders.C4807f;
import com.cuvora.carinfo.models.ErrorMode;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.models.ServerApiResponse;
import com.cuvora.carinfo.p071d.C1473c;
import com.cuvora.carinfo.views.CustomLoaderScreen;
import com.cuvora.carinfo.views.CustomLoaderScreen.C1631a;
import com.cuvora.carinfo.views.DLScrapeView;
import com.cuvora.carinfo.views.DLScrapeView.C1639a;
import com.google.android.gms.ads.AdView;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class SearchLicenseActivity extends AppCompatActivity implements C1492a, C1631a, C1639a {
    /* renamed from: n */
    public static final C1469a f21870n = new C1469a();
    /* renamed from: v */
    private static final String f21871v = f21870n.getClass().getSimpleName();
    /* renamed from: o */
    private String f21872o = "";
    /* renamed from: p */
    private String f21873p = "";
    /* renamed from: q */
    private LicenseDetailsModel f21874q;
    /* renamed from: r */
    private ErrorResponse f21875r;
    /* renamed from: s */
    private final String f21876s = "dlSearch";
    /* renamed from: t */
    private DLScrapeView f21877t;
    /* renamed from: u */
    private final C4539b f21878u = new C4539b(this);
    /* renamed from: w */
    private HashMap f21879w;

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$a */
    public static final class C1469a {
        private C1469a() {
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$c */
    static final class C1470c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SearchLicenseActivity f4454a;
        /* renamed from: b */
        final /* synthetic */ ErrorResponse f4455b;

        C1470c(SearchLicenseActivity searchLicenseActivity, ErrorResponse errorResponse) {
            this.f4454a = searchLicenseActivity;
            this.f4455b = errorResponse;
        }

        public final void run() {
            ((CustomLoaderScreen) this.f4454a.m30137c(C1487a.customLoader)).m6238a((C1473c) new C1473c<Boolean>() {
                /* renamed from: a */
                public final void m18438a(Boolean bool) {
                    this.f4454a.m30130a(this.f4455b);
                }
            });
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$d */
    static final class C3660d<T> implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ SearchLicenseActivity f14877a;

        C3660d(SearchLicenseActivity searchLicenseActivity) {
            this.f14877a = searchLicenseActivity;
        }

        /* renamed from: a */
        public final void m18440a(Boolean bool) {
            this.f14877a.m30141o();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$e */
    static final class C3661e<T> implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ SearchLicenseActivity f14878a;

        C3661e(SearchLicenseActivity searchLicenseActivity) {
            this.f14878a = searchLicenseActivity;
        }

        /* renamed from: a */
        public final void m18442a(Boolean bool) {
            SearchLicenseActivity searchLicenseActivity = this.f14878a;
            ErrorResponse a = this.f14878a.f21875r;
            if (a == null) {
                C2885g.m13906a();
            }
            searchLicenseActivity.m30130a(a);
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$f */
    static final class C3662f<T> implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ SearchLicenseActivity f14879a;

        C3662f(SearchLicenseActivity searchLicenseActivity) {
            this.f14879a = searchLicenseActivity;
        }

        /* renamed from: a */
        public final void m18444a(Boolean bool) {
            this.f14879a.m30141o();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$b */
    public static final class C4539b extends C3663b<LicenseDetailsModel> {
        /* renamed from: a */
        final /* synthetic */ SearchLicenseActivity f18864a;

        /* renamed from: com.cuvora.carinfo.activity.SearchLicenseActivity$b$a */
        static final class C3658a<T> implements C1473c<Boolean> {
            /* renamed from: a */
            final /* synthetic */ C4539b f14875a;

            C3658a(C4539b c4539b) {
                this.f14875a = c4539b;
            }

            /* renamed from: a */
            public final void m18436a(Boolean bool) {
                this.f14875a.f18864a.m30141o();
            }
        }

        C4539b(SearchLicenseActivity searchLicenseActivity) {
            this.f18864a = searchLicenseActivity;
        }

        /* renamed from: a */
        public void mo3921a(ErrorResponse errorResponse) {
            C2885g.m13910b(errorResponse, "errorResponse");
            C1540d.m5819b("DBSearch", "init error");
            errorResponse = this.f18864a.f21877t;
            if (errorResponse != null) {
                errorResponse.m6283a(this.f18864a.m30138l(), this.f18864a.m30139m());
            }
        }

        /* renamed from: a */
        public void mo3920a() {
            C1540d.m5819b("DBSearch", "no internet");
            m18447a((Context) this.f18864a);
        }

        /* renamed from: a */
        public void m25038a(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "t");
            Log.d(SearchLicenseActivity.f21871v, "onSuccess");
            C1540d.m5819b("DBSearch", "Success");
            this.f18864a.f21874q = licenseDetailsModel;
            if (((CustomLoaderScreen) this.f18864a.m30137c(C1487a.customLoader)).m6239a() != null) {
                ((CustomLoaderScreen) this.f18864a.m30137c(C1487a.customLoader)).m6238a((C1473c) new C3658a(this));
            }
        }

        /* renamed from: a */
        public C0392c<ServerApiResponse<LicenseDetailsModel>> mo1158a(int i, Bundle bundle) {
            Context context = this.f18864a;
            if (bundle != null) {
                bundle = bundle.getString("key_license_number");
                if (bundle != null) {
                    return (C0392c) new C4807f(context, bundle, "");
                }
            }
            bundle = "";
            return (C0392c) new C4807f(context, bundle, "");
        }
    }

    /* renamed from: c */
    public View m30137c(int i) {
        if (this.f21879w == null) {
            this.f21879w = new HashMap();
        }
        View view = (View) this.f21879w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21879w.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: l */
    public final String m30138l() {
        return this.f21872o;
    }

    /* renamed from: m */
    public final String m30139m() {
        return this.f21873p;
    }

    /* renamed from: a */
    public void mo5027a(String str, String str2) {
        C2885g.m13910b(str, "licenceNumber");
        C2885g.m13910b(str2, "dob");
        DLScrapeView dLScrapeView = this.f21877t;
        if (dLScrapeView != null) {
            dLScrapeView.m6284b();
        }
        this.f21877t = new DLScrapeView(this, null);
        ((FrameLayout) m30137c(C1487a.scrapeViewCon)).removeAllViews();
        ((FrameLayout) m30137c(C1487a.scrapeViewCon)).addView(this.f21877t);
        Object obj = (FrameLayout) m30137c(C1487a.scrapeViewCon);
        C2885g.m13907a(obj, "scrapeViewCon");
        obj.setVisibility(8);
        dLScrapeView = this.f21877t;
        if (dLScrapeView != null) {
            dLScrapeView.setCallbacks(this);
        }
        this.f21874q = (LicenseDetailsModel) null;
        this.f21875r = (ErrorResponse) null;
        this.f21872o = str;
        this.f21873p = str2;
        C1540d.m5819b("DBSearch", "init");
        C1540d.m5819b("Search Attempt", "Init");
        m30133q();
        str2 = new Bundle();
        str2.putString("key_license_number", str);
        m28708g().mo264a(2, str2, this.f21878u).m1455m();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_dl);
        C1540d.m5819b("Screen Name", this.f21876s);
        C1533a.m5787a((AdView) m30137c(C1487a.adView), (Context) this);
        m29816a((Toolbar) m30137c(C1487a.toolbar));
        if (mo4973h() != null) {
            Object h = mo4973h();
            if (h == null) {
                C2885g.m13906a();
            }
            C2885g.m13907a(h, "supportActionBar!!");
            h.mo531a((CharSequence) "");
        }
        ((CustomLoaderScreen) m30137c(C1487a.customLoader)).setCallbacks(this);
    }

    /* renamed from: a */
    public void mo5032a(boolean z, ErrorResponse errorResponse) {
        C2885g.m13910b(errorResponse, "errorResponse");
        this.f21875r = errorResponse;
        if (((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6239a()) {
            runOnUiThread((Runnable) new C1470c(this, errorResponse));
        }
    }

    /* renamed from: a */
    private final void m30130a(ErrorResponse errorResponse) {
        int code = errorResponse.getCode();
        if (code == ErrorMode.BACKGROUND_WEBVIEW_MAX_POLLIN_REACHED.getValue()) {
            FrameLayout frameLayout = (FrameLayout) m30137c(C1487a.scrapeViewCon);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            errorResponse = this.f21877t;
            if (errorResponse != null) {
                errorResponse.m6282a();
            }
        } else {
            if (code != ErrorMode.NO_INTERNET.getValue()) {
                if (code != ErrorMode.BACKGROUND_WEBVIEW_LOADING_ERROR.getValue()) {
                    if (code != ErrorMode.BACKGROUND_WEBVIEW_NOT_FOUND.getValue()) {
                        if (code == ErrorMode.ERROR_SCREEN.getValue()) {
                            C1540d.m5819b("Search Attempt", "Error Screen");
                            Intent intent = new Intent(this, SearchErrorActivity.class);
                            intent.putExtra("KEY_LICENCE_NUMBER", this.f21872o);
                            intent.putExtra("KEY_ERROR_RESPONSE", errorResponse);
                            startActivity(intent);
                        } else {
                            Toast.makeText(this, errorResponse.getMessage(), 0).show();
                        }
                    }
                }
            }
            Toast.makeText(this, errorResponse.getMessage(), 0).show();
        }
        this.f21875r = null;
    }

    /* renamed from: a */
    public void mo5031a(LicenseDetailsModel licenseDetailsModel) {
        C2885g.m13910b(licenseDetailsModel, "licenseDetailsModel");
        Log.d(f21871v, "onSuccess");
        this.f21874q = licenseDetailsModel;
        Object obj = (CustomLoaderScreen) m30137c(C1487a.customLoader);
        C2885g.m13907a(obj, "customLoader");
        if (obj.getVisibility() != null || ((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6239a() == null) {
            m30141o();
        } else {
            ((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6238a((C1473c) new C3662f(this));
        }
    }

    /* renamed from: q */
    private final void m30133q() {
        Object obj = (CustomLoaderScreen) m30137c(C1487a.customLoader);
        C2885g.m13907a(obj, "customLoader");
        obj.setVisibility(0);
    }

    /* renamed from: n */
    public void mo5029n() {
        if (this.f21874q != null) {
            ((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6238a((C1473c) new C3660d(this));
        } else if (this.f21875r != null) {
            ((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6238a((C1473c) new C3661e(this));
        }
    }

    /* renamed from: o */
    public final void m30141o() {
        String str = (String) null;
        C1459a.f4442a.m5708a(str);
        C1459a.f4442a.m5710b(str);
        C1540d.m5819b("Search Attempt", "Success");
        DLScrapeView dLScrapeView = this.f21877t;
        if (dLScrapeView != null) {
            dLScrapeView.m6284b();
        }
        this.f21877t = (DLScrapeView) null;
        ((FrameLayout) m30137c(C1487a.scrapeViewCon)).removeAllViews();
        FrameLayout frameLayout = (FrameLayout) m30137c(C1487a.scrapeViewCon);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Intent intent = new Intent(this, LicenseInfoActivity.class);
        intent.putExtra("license_data", this.f21874q);
        startActivity(intent);
        this.f21874q = (LicenseDetailsModel) null;
    }

    public void onBackPressed() {
        Object obj = (CustomLoaderScreen) m30137c(C1487a.customLoader);
        C2885g.m13907a(obj, "customLoader");
        if (obj.getVisibility() == 0) {
            obj = (CustomLoaderScreen) m30137c(C1487a.customLoader);
            C2885g.m13907a(obj, "customLoader");
            obj.setVisibility(8);
            return;
        }
        obj = (FrameLayout) m30137c(C1487a.scrapeViewCon);
        C2885g.m13907a(obj, "scrapeViewCon");
        if (obj.getVisibility() == 0) {
            DLScrapeView dLScrapeView = this.f21877t;
            if (dLScrapeView != null) {
                dLScrapeView.m6284b();
            }
            this.f21877t = (DLScrapeView) null;
            obj = (FrameLayout) m30137c(C1487a.scrapeViewCon);
            C2885g.m13907a(obj, "scrapeViewCon");
            obj.setVisibility(8);
            return;
        }
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C2885g.m13910b(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onDestroy() {
        ((CustomLoaderScreen) m30137c(C1487a.customLoader)).m6240b();
        DLScrapeView dLScrapeView = this.f21877t;
        if (dLScrapeView != null) {
            dLScrapeView.destroy();
        }
        ((FrameLayout) m30137c(C1487a.scrapeViewCon)).removeAllViews();
        super.onDestroy();
    }
}
