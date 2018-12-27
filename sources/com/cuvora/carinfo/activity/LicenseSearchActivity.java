package com.cuvora.carinfo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.C3663b;
import com.cuvora.carinfo.R;
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
import com.cuvora.carinfo.views.DlScraperView;
import com.cuvora.carinfo.views.DlScraperView.C1656a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import java.util.HashMap;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2877a;

public final class LicenseSearchActivity extends AppCompatActivity implements C1492a, C1631a, C1656a {
    /* renamed from: n */
    private boolean f21860n;
    /* renamed from: o */
    private boolean f21861o;
    /* renamed from: p */
    private boolean f21862p;
    /* renamed from: q */
    private boolean f21863q;
    /* renamed from: r */
    private ErrorResponse f21864r;
    /* renamed from: s */
    private String f21865s;
    /* renamed from: t */
    private String f21866t;
    /* renamed from: u */
    private LicenseDetailsModel f21867u;
    /* renamed from: v */
    private final C4538a f21868v = new C4538a(this);
    /* renamed from: w */
    private HashMap f21869w;

    /* renamed from: com.cuvora.carinfo.activity.LicenseSearchActivity$b */
    static final class C3656b<T> implements C1473c<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C2877a f14874a;

        C3656b(C2877a c2877a) {
            this.f14874a = c2877a;
        }

        /* renamed from: a */
        public final void m18434a(Boolean bool) {
            this.f14874a.mo3923a();
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.LicenseSearchActivity$c */
    public static final class C3657c extends AdListener {
        C3657c() {
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.LicenseSearchActivity$a */
    public static final class C4538a extends C3663b<LicenseDetailsModel> {
        /* renamed from: a */
        final /* synthetic */ LicenseSearchActivity f18863a;

        C4538a(LicenseSearchActivity licenseSearchActivity) {
            this.f18863a = licenseSearchActivity;
        }

        /* renamed from: a */
        public void mo3921a(ErrorResponse errorResponse) {
            C2885g.m13910b(errorResponse, "errorResponse");
            C1540d.m5819b("DBSearch", "init error");
            this.f18863a.m30120b(false);
            this.f18863a.m30116a(errorResponse);
            this.f18863a.m30126p();
        }

        /* renamed from: a */
        public void mo3920a() {
            this.f18863a.m30120b(false);
            this.f18863a.m30116a(new ErrorResponse(ErrorMode.NO_INTERNET.getValue(), " No Internet"));
            this.f18863a.m30126p();
            C1540d.m5819b("DBSearch", "no internet");
            m18447a((Context) this.f18863a);
        }

        /* renamed from: a */
        public void m25023a(LicenseDetailsModel licenseDetailsModel) {
            C2885g.m13910b(licenseDetailsModel, "t");
            C1540d.m5819b("DBSearch", "Success");
            this.f18863a.m30120b(true);
            this.f18863a.f21867u = licenseDetailsModel;
            this.f18863a.m30126p();
        }

        /* renamed from: a */
        public C0392c<ServerApiResponse<LicenseDetailsModel>> mo1158a(int i, Bundle bundle) {
            String string;
            Context context = this.f18863a;
            if (bundle != null) {
                string = bundle.getString("key_license_number");
                if (string != null) {
                    if (bundle != null) {
                        bundle = bundle.getString("key_dob");
                        if (bundle != null) {
                            return (C0392c) new C4807f(context, string, bundle);
                        }
                    }
                    bundle = "";
                    return (C0392c) new C4807f(context, string, bundle);
                }
            }
            string = "";
            if (bundle != null) {
                bundle = bundle.getString("key_dob");
                if (bundle != null) {
                    return (C0392c) new C4807f(context, string, bundle);
                }
            }
            bundle = "";
            return (C0392c) new C4807f(context, string, bundle);
        }
    }

    /* renamed from: c */
    public View m30121c(int i) {
        if (this.f21869w == null) {
            this.f21869w = new HashMap();
        }
        View view = (View) this.f21869w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21869w.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: b */
    public final void m30120b(boolean z) {
        this.f21860n = z;
    }

    /* renamed from: a */
    public final void m30116a(ErrorResponse errorResponse) {
        this.f21864r = errorResponse;
    }

    /* renamed from: l */
    public final ErrorResponse m30122l() {
        return this.f21864r;
    }

    /* renamed from: m */
    public final String m30123m() {
        return this.f21865s;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_license);
        m29816a((Toolbar) m30121c(C1487a.toolbar));
        if (mo4973h() != null) {
            Object h = mo4973h();
            if (h == null) {
                C2885g.m13906a();
            }
            C2885g.m13907a(h, "supportActionBar!!");
            h.mo531a((CharSequence) "");
        }
        ((CustomLoaderScreen) m30121c(C1487a.customLoader)).setCallbacks(this);
        C1533a.m5788a((AdView) m30121c(C1487a.adView), (Context) this, (AdListener) new C3657c());
    }

    /* renamed from: a */
    public void mo5027a(String str, String str2) {
        C2885g.m13910b(str, "licenceNumber");
        C2885g.m13910b(str2, "dob");
        C1540d.m5819b("Search Attempt", "initialize");
        m30114q();
        this.f21865s = str;
        this.f21866t = str2;
        m30113c(str, str2);
        m30112b(str, str2);
        m30115r();
    }

    protected void onDestroy() {
        super.onDestroy();
        ((DlScraperView) m30121c(C1487a.dlScraper)).m6311a();
    }

    /* renamed from: q */
    private final void m30114q() {
        this.f21860n = false;
        this.f21861o = false;
        this.f21862p = false;
        this.f21863q = false;
        this.f21864r = (ErrorResponse) null;
        String str = (String) null;
        this.f21865s = str;
        this.f21866t = str;
    }

    /* renamed from: r */
    private final void m30115r() {
        Object obj = (CustomLoaderScreen) m30121c(C1487a.customLoader);
        C2885g.m13907a(obj, "customLoader");
        obj.setVisibility(0);
    }

    /* renamed from: a */
    private final void m30111a(C2877a<C2864b> c2877a) {
        ((CustomLoaderScreen) m30121c(C1487a.customLoader)).m6238a((C1473c) new C3656b(c2877a));
    }

    /* renamed from: b */
    private final void m30112b(String str, String str2) {
        ((DlScraperView) m30121c(C1487a.dlScraper)).m6312a(str, str2);
    }

    /* renamed from: c */
    private final void m30113c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_license_number", str);
        bundle.putString("key_dob", str2);
        m28708g().mo264a(2, bundle, (C0362a) this.f21868v).m1455m();
    }

    /* renamed from: n */
    public void mo5029n() {
        this.f21861o = true;
        m30126p();
    }

    /* renamed from: o */
    public void mo5030o() {
        this.f21863q = true;
        m30126p();
    }

    /* renamed from: a */
    public void mo5026a(LicenseDetailsModel licenseDetailsModel) {
        C2885g.m13910b(licenseDetailsModel, "licenseDetailsModel");
        this.f21862p = true;
        this.f21867u = licenseDetailsModel;
        m30126p();
    }

    /* renamed from: b */
    public void mo5028b(ErrorResponse errorResponse) {
        C2885g.m13910b(errorResponse, "errorResponse");
        this.f21862p = false;
        this.f21864r = errorResponse;
        m30126p();
    }

    /* renamed from: p */
    public final void m30126p() {
        if (this.f21860n && this.f21861o) {
            m30111a((C2877a) new LicenseSearchActivity$checkStatus$1(this));
        } else if (this.f21862p && this.f21861o) {
            m30111a((C2877a) new LicenseSearchActivity$checkStatus$2(this));
        } else if (this.f21863q) {
            this.f21863q = false;
            ((DlScraperView) m30121c(C1487a.dlScraper)).getData();
        } else {
            ErrorResponse errorResponse = this.f21864r;
            if (errorResponse == null || errorResponse.getCode() != ErrorMode.NO_INTERNET.getValue()) {
                errorResponse = this.f21864r;
                if (errorResponse != null && errorResponse.getCode() == ErrorMode.ERROR_SCREEN.getValue() && this.f21861o) {
                    m30111a((C2877a) new LicenseSearchActivity$checkStatus$4(this));
                    return;
                }
                errorResponse = this.f21864r;
                if (errorResponse != null && errorResponse.getCode() == ErrorMode.BACKGROUND_WEBVIEW_MAX_POLLIN_REACHED.getValue()) {
                    Object obj = (DlScraperView) m30121c(C1487a.dlScraper);
                    C2885g.m13907a(obj, "dlScraper");
                    if (obj.getVisibility() == 8) {
                        m30111a((C2877a) new LicenseSearchActivity$checkStatus$5(this));
                        return;
                    }
                    return;
                }
                return;
            }
            m30111a((C2877a) new LicenseSearchActivity$checkStatus$3(this));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C2885g.m13910b(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
