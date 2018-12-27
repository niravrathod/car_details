package com.cuvora.carinfo.p075g;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Intent;
import android.content.Loader;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.SelectStateCityActivity;
import com.cuvora.carinfo.SelectStateCityActivity.C1434a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C1577h;
import com.cuvora.carinfo.loaders.C1581u;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.homepage.City;
import com.cuvora.carinfo.models.homepage.CityFuelPrice;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.p071d.C3666b;
import com.google.gson.C2629e;

/* renamed from: com.cuvora.carinfo.g.d */
public class C4557d extends C3666b implements C1434a {
    /* renamed from: A */
    private LoaderCallbacks<Response> f18891A = new C15224(this);
    /* renamed from: o */
    private TextView f18892o;
    /* renamed from: p */
    private TextView f18893p;
    /* renamed from: q */
    private TextView f18894q;
    /* renamed from: r */
    private TextView f18895r;
    /* renamed from: s */
    private Button f18896s;
    /* renamed from: t */
    private SharedPreferences f18897t;
    /* renamed from: u */
    private ProgressBar f18898u;
    /* renamed from: v */
    private LinearLayout f18899v;
    /* renamed from: w */
    private LinearLayout f18900w;
    /* renamed from: x */
    private Button f18901x;
    /* renamed from: y */
    private AppCompatImageView f18902y;
    /* renamed from: z */
    private LoaderCallbacks<Response> f18903z = new C15213(this);

    /* renamed from: com.cuvora.carinfo.g.d$1 */
    class C15191 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4557d f4510a;

        C15191(C4557d c4557d) {
            this.f4510a = c4557d;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4510a.n) == null) {
                C1570t.m5978a((Activity) this.f4510a.n);
                return;
            }
            this.f4510a.n.startActivity(new Intent(this.f4510a.n, SelectStateCityActivity.class));
            SelectStateCityActivity.m30066a(this.f4510a);
        }
    }

    /* renamed from: com.cuvora.carinfo.g.d$2 */
    class C15202 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4557d f4511a;

        C15202(C4557d c4557d) {
            this.f4511a = c4557d;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4511a.n) == null) {
                C1570t.m5978a((Activity) this.f4511a.n);
                return;
            }
            this.f4511a.f18900w.setVisibility(8);
            if (this.f4511a.f18897t.getString("KEY_CITY", null) != null) {
                this.f4511a.m25084C();
            } else {
                this.f4511a.m25105y();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.g.d$3 */
    class C15213 implements LoaderCallbacks<Response> {
        /* renamed from: a */
        final /* synthetic */ C4557d f4512a;

        public void onLoaderReset(Loader<Response> loader) {
        }

        C15213(C4557d c4557d) {
            this.f4512a = c4557d;
        }

        public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            m5740a(loader, (Response) obj);
        }

        public Loader<Response> onCreateLoader(int i, Bundle bundle) {
            this.f4512a.m25106z();
            return new C1581u(this.f4512a.n);
        }

        /* renamed from: a */
        public void m5740a(Loader<Response> loader, Response response) {
            if ((response instanceof CityFuelPrice) != null) {
                this.f4512a.m25082A();
                CityFuelPrice cityFuelPrice = (CityFuelPrice) response;
                this.f4512a.m25091b(cityFuelPrice.getHomeCity());
                this.f4512a.m25089a(cityFuelPrice);
                return;
            }
            this.f4512a.m25084C();
        }
    }

    /* renamed from: com.cuvora.carinfo.g.d$4 */
    class C15224 implements LoaderCallbacks<Response> {
        /* renamed from: a */
        final /* synthetic */ C4557d f4513a;

        public void onLoaderReset(Loader<Response> loader) {
        }

        C15224(C4557d c4557d) {
            this.f4513a = c4557d;
        }

        public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            m5741a(loader, (Response) obj);
        }

        public Loader<Response> onCreateLoader(int i, Bundle bundle) {
            this.f4513a.m25106z();
            return new C1577h(this.f4513a.n, bundle.getString("KEY_CITY_ID"));
        }

        /* renamed from: a */
        public void m5741a(Loader<Response> loader, Response response) {
            this.f4513a.m25082A();
            if ((response instanceof CityFuelPrice) != null) {
                this.f4513a.m25089a((CityFuelPrice) response);
            } else {
                this.f4513a.m25083B();
            }
        }
    }

    public C4557d(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.fragment_fuel_price);
        m25086a(this.a);
        this.f18897t = PreferenceManager.getDefaultSharedPreferences(this.n);
        if (this.f18897t.getString("KEY_CITY", null) != null) {
            m25084C();
        } else {
            m25105y();
        }
    }

    /* renamed from: a */
    public void m25108a(Section section) {
        if (section != null && section.isHeader()) {
            this.f18895r.setVisibility(0);
            this.f18895r.setText(section.getTitle());
            if (!C1562q.m5947b(section.getHeaderIconUrl())) {
                this.f18902y.setVisibility(0);
                this.f18902y.setImageURI(Uri.parse(section.getHeaderIconUrl()));
            }
        }
        this.f18896s.setOnClickListener(new C15191(this));
        this.f18901x.setOnClickListener(new C15202(this));
    }

    /* renamed from: a */
    private void m25086a(View view) {
        this.f18895r = (TextView) view.findViewById(R.id.tv_heading);
        this.f18900w = (LinearLayout) view.findViewById(R.id.ll_no_internet);
        this.f18901x = (Button) view.findViewById(R.id.btn_retry);
        this.f18899v = (LinearLayout) view.findViewById(R.id.ll_fuel_price_container);
        this.f18898u = (ProgressBar) view.findViewById(R.id.pb_loader);
        this.f18892o = (TextView) view.findViewById(R.id.tv_city_name);
        this.f18896s = (Button) view.findViewById(R.id.btn_change_city);
        this.f18893p = (TextView) view.findViewById(R.id.tv_petrol_price);
        this.f18894q = (TextView) view.findViewById(R.id.tv_diesel_price);
        this.f18902y = (AppCompatImageView) view.findViewById(R.id.iv_header_icon);
    }

    /* renamed from: a */
    public void mo3928a(City city) {
        m25091b(city);
        m25084C();
    }

    /* renamed from: y */
    private void m25105y() {
        if (C1547j.m5914d(this.n)) {
            ((Activity) this.n).getLoaderManager().restartLoader(100, null, this.f18903z).forceLoad();
        } else {
            m25083B();
        }
    }

    /* renamed from: b */
    private void m25091b(City city) {
        this.f18897t.edit().putString("KEY_CITY", new C2629e().m12883a((Object) city)).apply();
    }

    /* renamed from: a */
    private void m25089a(CityFuelPrice cityFuelPrice) {
        if (cityFuelPrice.getHomeCity() != null) {
            TextView textView = this.f18892o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cityFuelPrice.getHomeCity().getName());
            stringBuilder.append(", ");
            stringBuilder.append(cityFuelPrice.getHomeCity().getStateName());
            textView.setText(stringBuilder.toString());
        }
        if (cityFuelPrice.getFuelPrice() != null) {
            textView = this.f18893p;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.n.getString(R.string.rupee_symbol));
            stringBuilder.append(" ");
            stringBuilder.append(cityFuelPrice.getFuelPrice().getPetrol());
            textView.setText(stringBuilder.toString());
            textView = this.f18894q;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.n.getString(R.string.rupee_symbol));
            stringBuilder.append(" ");
            stringBuilder.append(cityFuelPrice.getFuelPrice().getDiesel());
            textView.setText(stringBuilder.toString());
        }
    }

    /* renamed from: z */
    private void m25106z() {
        this.f18900w.setVisibility(8);
        this.f18899v.setVisibility(4);
        this.f18898u.setVisibility(0);
    }

    /* renamed from: A */
    private void m25082A() {
        this.f18900w.setVisibility(8);
        this.f18899v.setVisibility(0);
        this.f18898u.setVisibility(8);
    }

    /* renamed from: B */
    private void m25083B() {
        this.f18900w.setVisibility(0);
        this.f18899v.setVisibility(8);
        this.f18898u.setVisibility(8);
    }

    /* renamed from: C */
    private void m25084C() {
        if (C1547j.m5914d(this.n)) {
            Bundle bundle = new Bundle();
            String string = this.f18897t.getString("KEY_CITY", null);
            if (!(string == null || string.isEmpty())) {
                bundle.putString("KEY_CITY_ID", ((City) new C2629e().m12880a(string, City.class)).getId());
            }
            ((Activity) this.n).getLoaderManager().restartLoader(101, bundle, this.f18891A).forceLoad();
            return;
        }
        m25083B();
    }
}
