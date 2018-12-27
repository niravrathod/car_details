package com.cuvora.carinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.ErrorResponse;
import com.cuvora.carinfo.views.C1688b;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

public class SearchErrorActivity extends AppCompatActivity {
    /* renamed from: n */
    private AppCompatTextView f21795n;
    /* renamed from: o */
    private AppCompatTextView f21796o;
    /* renamed from: p */
    private CardView f21797p;
    /* renamed from: q */
    private CardView f21798q;
    /* renamed from: r */
    private LinearLayout f21799r;
    /* renamed from: s */
    private AdView f21800s;
    /* renamed from: t */
    private UnifiedNativeAdView f21801t;

    /* renamed from: com.cuvora.carinfo.SearchErrorActivity$2 */
    class C14322 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SearchErrorActivity f4412a;

        C14322(SearchErrorActivity searchErrorActivity) {
            this.f4412a = searchErrorActivity;
        }

        public void onClick(View view) {
            this.f4412a.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_error);
        m30034l();
        bundle = getIntent().getStringExtra("KEY_LICENCE_NUMBER");
        final String stringExtra = getIntent().getStringExtra("KEY_VEHICLE_NUMBER");
        this.f21797p.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ SearchErrorActivity f4411c;

            public void onClick(View view) {
                C1570t.m5986a(this.f4411c, stringExtra, bundle);
            }
        });
        this.f21798q.setOnClickListener(new C14322(this));
        ErrorResponse errorResponse = (ErrorResponse) getIntent().getSerializableExtra("KEY_ERROR_RESPONSE");
        this.f21795n.setText(Html.fromHtml(errorResponse.getMessage()));
        this.f21796o.setText(errorResponse.getTitle());
    }

    /* renamed from: l */
    private void m30034l() {
        this.f21795n = (AppCompatTextView) findViewById(R.id.tv_error_message);
        this.f21796o = (AppCompatTextView) findViewById(R.id.tv_error_title);
        this.f21797p = (CardView) findViewById(R.id.cv_contact_us);
        this.f21798q = (CardView) findViewById(R.id.cv_search_again);
        this.f21799r = (LinearLayout) findViewById(R.id.ll_smart_ad);
        this.f21800s = C1688b.m6369a(this, getResources().getString(R.string.error_screen_banner_ad_unit));
        View e = C1533a.m5797e(this);
        this.f21801t = (UnifiedNativeAdView) e.findViewById(R.id.unified_native_adview);
        this.f21799r.addView(C1688b.m6371b(this, this.f21800s, getResources().getString(R.string.error_screen_native_ad), e.findViewById(R.id.ivDistractView), e, this.f21801t));
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f21800s.destroy();
        this.f21801t.destroy();
    }
}
