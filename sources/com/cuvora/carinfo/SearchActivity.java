package com.cuvora.carinfo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.transition.Slide;
import android.support.transition.ae;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.fragment.SectionsFragment;
import com.cuvora.carinfo.fragment.SectionsFragment.C1494a;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C1575u.C1572a;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.p071d.C1474d;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements C1474d<VehicleSearchResult>, C1494a {
    /* renamed from: n */
    private View f21784n;
    /* renamed from: o */
    private AppCompatEditText f21785o;
    /* renamed from: p */
    private TextView f21786p;
    /* renamed from: q */
    private ProgressDialog f21787q;
    /* renamed from: r */
    private SharedPreferences f21788r;
    /* renamed from: s */
    private String f21789s;
    /* renamed from: t */
    private AdView f21790t;
    /* renamed from: u */
    private ConstraintLayout f21791u;
    /* renamed from: v */
    private AppCompatTextView f21792v;
    /* renamed from: w */
    private List<VehicleSearchResult> f21793w;
    /* renamed from: x */
    private C1572a f21794x = new C36032(this);

    /* renamed from: com.cuvora.carinfo.SearchActivity$2 */
    class C36032 implements C1572a {
        /* renamed from: a */
        final /* synthetic */ SearchActivity f14772a;

        /* renamed from: c */
        public void mo1170c() {
        }

        /* renamed from: d */
        public void mo1171d() {
        }

        C36032(SearchActivity searchActivity) {
            this.f14772a = searchActivity;
        }

        /* renamed from: a */
        public void mo1167a() {
            C1570t.m5985a(this.f14772a, this.f14772a.getString(R.string.invalid_vehicle_num));
            C1540d.m5831h();
            this.f14772a.m30027p();
        }

        /* renamed from: b */
        public void mo1169b() {
            C1570t.m5985a(this.f14772a, this.f14772a.getString(R.string.error_background_webview_search));
            this.f14772a.m30027p();
            C1540d.m5825e();
            this.f14772a.m30028q();
        }

        /* renamed from: a */
        public void mo1168a(VehicleSearchResult vehicleSearchResult) {
            this.f14772a.m30027p();
            this.f14772a.m30020a(vehicleSearchResult);
        }

        /* renamed from: e */
        public void mo1172e() {
            C1570t.m5985a(this.f14772a, this.f14772a.getString(R.string.reg_num_not_exist_msg));
            this.f14772a.m30027p();
        }
    }

    /* renamed from: r */
    private void m30029r() {
    }

    /* renamed from: e */
    public /* synthetic */ Object mo4633e(int i) {
        return m30030c(i);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_new);
        ((SectionsFragment) m28707f().mo289a((int) R.id.fragmentBottom)).f21009a = this;
        m29816a((Toolbar) findViewById(R.id.toolbar));
        mo4973h().mo538b(true);
        mo4973h().mo531a((CharSequence) "");
        this.f21788r = PreferenceManager.getDefaultSharedPreferences(this);
        m30026o();
        m30025n();
        this.f21792v.setMovementMethod(LinkMovementMethod.getInstance());
        this.f21792v.setText(Html.fromHtml("This service is only available for vehicles in India and you abide by our <font color= #34adc0>terms and conditions</font> to use this app."));
        this.f21792v.setOnClickListener(new -$$Lambda$SearchActivity$1UBWbodQ-wbSSO6mYfWu2v59IOk());
        if (!(getIntent() == null || C1562q.m5946a(getIntent().getStringExtra("KEY_VEHICLE_NUMBER")) == null)) {
            this.f21785o.setText(getIntent().getStringExtra("KEY_VEHICLE_NUMBER"));
            m30024m();
        }
        if (TextUtils.isEmpty(C1459a.f4442a.m5711c()) == null) {
            this.f21785o.setText("");
            this.f21785o.append(C1459a.f4442a.m5711c());
        }
    }

    /* renamed from: b */
    private /* synthetic */ void m30022b(View view) {
        view = new Intent(this, GenericWebViewActivity.class);
        view.putExtra("KEY_WEB_VIEW_TITLE", getResources().getString(R.string.tnc));
        view.putExtra("KEY_WEB_VIEW_URL", "https://cuvora.com/terms-and-conditions.html");
        startActivity(view);
    }

    /* renamed from: m */
    private void m30024m() {
        this.f21789s = this.f21785o.getText().toString();
        C1459a.f4442a.m5712c(this.f21789s);
        this.f21789s = this.f21789s.replaceAll("[^A-Za-z0-9]", "");
        if (C1570t.m5991a(this.f21789s)) {
            Intent intent = new Intent(this, SearchResultLoaderActivity.class);
            intent.putExtra("KEY_SKIP_DB", false);
            intent.putExtra("KEY_VEHICLE_NUMBER", this.f21789s);
            startActivityForResult(intent, 10);
            C1570t.m5996b((Context) this, this.f21785o);
        } else if (C1562q.m5947b(this.f21789s)) {
            C1570t.m5985a((Context) this, getResources().getString(R.string.empty_vehicle_num));
        } else {
            C1570t.m5985a((Context) this, getResources().getString(R.string.invalid_vehicle_num));
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f21786p != null) {
            this.f21786p.setText(C1570t.m6031p(this));
        }
    }

    /* renamed from: n */
    private void m30025n() {
        this.f21785o.setFilters(new InputFilter[]{new AllCaps(), new LengthFilter(15)});
    }

    /* renamed from: o */
    private void m30026o() {
        this.f21792v = (AppCompatTextView) findViewById(R.id.tv_terms_of_use);
        this.f21785o = (AppCompatEditText) findViewById(R.id.et_vehicle_number);
        this.f21784n = findViewById(R.id.fab_search);
        this.f21786p = (TextView) findViewById(R.id.tv_my_garage);
        this.f21791u = (ConstraintLayout) findViewById(R.id.rootRc);
        this.f21784n.setOnClickListener(new -$$Lambda$SearchActivity$O9v8z3y0pTWr9eGpYBr9o4KF0iA());
        this.f21785o.setOnEditorActionListener(new -$$Lambda$SearchActivity$8qsBnPIQ5C9oy1_Zy7vOwMKTOHY());
        this.f21790t = (AdView) findViewById(R.id.adView);
        final Slide slide = new Slide(80);
        slide.mo197a(300);
        C1533a.m5788a(this.f21790t, (Context) this, new AdListener(this) {
            /* renamed from: b */
            final /* synthetic */ SearchActivity f14771b;

            public void onAdLoaded() {
                super.onAdLoaded();
                ae.m973a((ViewGroup) this.f14771b.findViewById(R.id.root), slide);
            }

            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                ae.m973a((ViewGroup) this.f14771b.findViewById(R.id.root), slide);
            }
        });
    }

    /* renamed from: a */
    private /* synthetic */ void m30017a(View view) {
        if (C1547j.m5914d(this) == null) {
            C1570t.m5978a((Activity) this);
        } else {
            m30024m();
        }
    }

    /* renamed from: a */
    private /* synthetic */ boolean m30021a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return null;
        }
        if (C1547j.m5914d(this) == null) {
            C1570t.m5978a((Activity) this);
        } else {
            m30024m();
        }
        return true;
    }

    protected void onDestroy() {
        this.f21790t.destroy();
        super.onDestroy();
    }

    /* renamed from: p */
    private void m30027p() {
        try {
            if (this.f21787q != null && this.f21787q.isShowing() && !isFinishing()) {
                this.f21787q.dismiss();
                this.f21787q = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m30020a(VehicleSearchResult vehicleSearchResult) {
        C1459a.f4442a.m5712c(null);
        Intent intent = new Intent(this, VehicleInfoActivity.class);
        intent.putExtra("KEY_VEHICLE_INFO", vehicleSearchResult);
        startActivity(intent);
    }

    /* renamed from: q */
    private void m30028q() {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra("KEY_VEHICLE_NUM", this.f21789s);
        startActivity(intent);
        C1540d.m5832h(this.f21789s);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10) {
            return;
        }
        if (i2 == 20) {
            m30029r();
        } else if (i2 == 13 && intent != null) {
            new C0661a(this).m2639a(C1541e.m5852a("rtoServerDownTitle")).m2643b(((ErrorResponse) intent.getSerializableExtra("KEY_ERROR_RESPONSE")).getMessage()).m2640a((CharSequence) "OK", -$$Lambda$SearchActivity$gQyYa4JhaNAVVHzXCLbcubxmeQ4.INSTANCE).m2641a((boolean) 0).m2646c();
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f21785o != null && TextUtils.isEmpty(C1459a.f4442a.m5711c()) == null) {
            this.f21785o.setText("");
            this.f21785o.append(C1459a.f4442a.m5711c());
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: c */
    public VehicleSearchResult m30030c(int i) {
        return (VehicleSearchResult) this.f21793w.get(i);
    }

    /* renamed from: l */
    public int mo4635l() {
        if (this.f21793w != null) {
            if (!this.f21793w.isEmpty()) {
                return this.f21793w.size() == 1 ? 2 : 3;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public int mo4631d(int i) {
        return i == mo4635l() - 1 ? 1 : 0;
    }
}
