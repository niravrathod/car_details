package com.cuvora.carinfo.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.p078b.C1538a;
import com.cuvora.carinfo.helpers.p078b.C1538a.C1537a;
import com.cuvora.carinfo.models.KeyValueModel;
import com.cuvora.carinfo.models.LicenseDetailsModel;
import com.cuvora.carinfo.views.C1688b;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

public final class LicenseInfoActivity extends AppCompatActivity {
    /* renamed from: n */
    public static final C1466a f21855n = new C1466a();
    /* renamed from: o */
    private LicenseDetailsModel f21856o;
    /* renamed from: p */
    private UnifiedNativeAdView f21857p;
    /* renamed from: q */
    private AdView f21858q;
    /* renamed from: r */
    private HashMap f21859r;

    /* renamed from: com.cuvora.carinfo.activity.LicenseInfoActivity$a */
    public static final class C1466a {
        private C1466a() {
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.LicenseInfoActivity$b */
    static final class C1467b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ LicenseInfoActivity f4452a;

        /* renamed from: com.cuvora.carinfo.activity.LicenseInfoActivity$b$1 */
        public static final class C36551 implements C1537a {
            /* renamed from: a */
            public void mo1183a() {
            }

            /* renamed from: b */
            public void mo1184b() {
            }

            /* renamed from: c */
            public void mo1185c() {
            }

            /* renamed from: d */
            public void mo1186d() {
            }

            C36551() {
            }
        }

        C1467b(LicenseInfoActivity licenseInfoActivity) {
            this.f4452a = licenseInfoActivity;
        }

        public final void run() {
            if (!this.f4452a.isFinishing()) {
                C1538a.m5802a(this.f4452a, new C36551());
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.LicenseInfoActivity$c */
    static final class C1468c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ LicenseInfoActivity f4453a;

        C1468c(LicenseInfoActivity licenseInfoActivity) {
            this.f4453a = licenseInfoActivity;
        }

        public final void onClick(View view) {
            String shareText;
            C1540d.m5841m();
            Context context = (Context) this.f4453a;
            LicenseDetailsModel a = this.f4453a.f21856o;
            if (a != null) {
                shareText = a.getShareText();
                if (shareText != null) {
                    C1561p.m5941a(context, shareText, true);
                }
            }
            shareText = "";
            C1561p.m5941a(context, shareText, true);
        }
    }

    /* renamed from: c */
    public View m30108c(int i) {
        if (this.f21859r == null) {
            this.f21859r = new HashMap();
        }
        View view = (View) this.f21859r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21859r.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_license_info);
        m30104l();
        m30106n();
        m30105m();
        new Handler().postDelayed(new C1467b(this), (long) C1541e.m5855b("ratingDialogDelayTime").intValue());
        m30107o();
    }

    /* renamed from: l */
    private final void m30104l() {
        this.f21856o = (LicenseDetailsModel) getIntent().getSerializableExtra("license_data");
    }

    /* renamed from: m */
    private final void m30105m() {
        Context context = this;
        C1533a.m5787a((AdView) m30108c(C1487a.adView), context);
        Object obj = (ImageView) m30108c(C1487a.ivShareWhatsapp);
        C2885g.m13907a(obj, "ivShareWhatsapp");
        obj.setVisibility(C1561p.m5942a(context, C1561p.f4704a) ? 0 : 8);
        obj = (TextView) m30108c(C1487a.tv_share);
        C2885g.m13907a(obj, "tv_share");
        obj.setText(C1561p.m5942a(context, C1561p.f4704a) ? "WHATSAPP" : "SHARE");
        obj = (CardView) m30108c(C1487a.cv_share);
        C2885g.m13907a(obj, "cv_share");
        LicenseDetailsModel licenseDetailsModel = this.f21856o;
        if (licenseDetailsModel != null) {
            String shareText = licenseDetailsModel.getShareText();
            if (shareText != null) {
                if (shareText.length() > 0) {
                }
            }
        }
        obj.setVisibility(0);
    }

    /* renamed from: n */
    private final void m30106n() {
        m29816a((Toolbar) m30108c(C1487a.toolbar));
        if (mo4973h() != null) {
            ActionBar h = mo4973h();
            if (h == null) {
                C2885g.m13906a();
            }
            h.mo538b(true);
        }
        Object obj = (CollapsingToolbarLayout) m30108c(C1487a.collapsing_toolbar);
        C2885g.m13907a(obj, "collapsing_toolbar");
        obj.setTitle("Licence Details");
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    private final View m30102a(String str, String str2) {
        Object inflate = getLayoutInflater().inflate(R.layout.layout_vehicle_info_row_card, null, false);
        View findViewById = inflate.findViewById(R.id.tv_key);
        if (findViewById != null) {
            ((TextView) findViewById).setText(str);
            str = inflate.findViewById(R.id.tv_value);
            if (str != null) {
                ((TextView) str).setText(str2);
                C2885g.m13907a(inflate, "view");
                return inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C2885g.m13910b(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onDestroy() {
        ((AdView) m30108c(C1487a.adView)).destroy();
        if (this.f21858q != null) {
            AdView adView = this.f21858q;
            if (adView != null) {
                adView.destroy();
            }
        }
        if (this.f21857p != null) {
            UnifiedNativeAdView unifiedNativeAdView = this.f21857p;
            if (unifiedNativeAdView != null) {
                unifiedNativeAdView.destroy();
            }
        }
        new Handler().removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    /* renamed from: o */
    private final void m30107o() {
        LicenseDetailsModel licenseDetailsModel = this.f21856o;
        if (licenseDetailsModel != null) {
            List<KeyValueModel> keys = licenseDetailsModel.getKeys();
            if (keys != null) {
                int i = 0;
                for (KeyValueModel keyValueModel : keys) {
                    if (i == 4) {
                        View e = C1533a.m5797e(this);
                        this.f21857p = (UnifiedNativeAdView) e.findViewById(R.id.unified_native_adview);
                        View findViewById = e.findViewById(R.id.ivDistractView);
                        Activity activity = this;
                        this.f21858q = C1688b.m6369a(activity, getResources().getString(R.string.licence_medium_banner_ad));
                        ((LinearLayout) m30108c(C1487a.ll_vehicle_info_container)).addView(C1688b.m6367a(activity, this.f21858q, getResources().getString(R.string.unified_native_ad_unit_id_licence), findViewById, e, this.f21857p));
                    }
                    ((LinearLayout) m30108c(C1487a.ll_vehicle_info_container)).addView(m30102a(keyValueModel.getKey(), keyValueModel.getValue()));
                    i++;
                }
            }
        }
        ((CardView) m30108c(C1487a.cv_share)).setOnClickListener(new C1468c(this));
    }
}
