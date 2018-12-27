package com.cuvora.carinfo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0389b;
import android.support.v4.content.C0392c;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cuvora.carinfo.activity.InterstitialActivity;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.C1561p;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.helpers.C3688b;
import com.cuvora.carinfo.helpers.p078b.C1538a;
import com.cuvora.carinfo.helpers.p078b.C1538a.C1537a;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Action;
import com.cuvora.carinfo.loaders.UpdateVehicleInRecentOrGarageLoader.Type;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.VehicleInfo;
import com.cuvora.carinfo.models.VehicleSearchResult;
import com.cuvora.carinfo.models.cars.CarVariantsData;
import com.cuvora.carinfo.models.cars.CarsImage;
import com.cuvora.carinfo.views.AsyncImageView;
import com.cuvora.carinfo.views.C1688b;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.List;
import java.util.Map.Entry;

public class VehicleInfoActivity extends InterstitialActivity {
    /* renamed from: o */
    private static final String f21882o = VehicleInfoActivity.class.getCanonicalName();
    /* renamed from: A */
    private CardView f21883A;
    /* renamed from: B */
    private UnifiedNativeAdView f21884B;
    /* renamed from: C */
    private String f21885C;
    /* renamed from: D */
    private AdView f21886D;
    /* renamed from: n */
    C0362a<Response> f21887n = new C36128(this);
    /* renamed from: p */
    private AsyncImageView f21888p;
    /* renamed from: q */
    private TextView f21889q;
    /* renamed from: r */
    private LinearLayout f21890r;
    /* renamed from: s */
    private CardView f21891s;
    /* renamed from: t */
    private CardView f21892t;
    /* renamed from: u */
    private GarageResult f21893u;
    /* renamed from: v */
    private VehicleSearchResult f21894v;
    /* renamed from: w */
    private AdView f21895w;
    /* renamed from: x */
    private Handler f21896x;
    /* renamed from: y */
    private CardView f21897y;
    /* renamed from: z */
    private CardView f21898z;

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$1 */
    class C14411 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4422a;

        /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$1$1 */
        class C36111 implements C1537a {
            /* renamed from: a */
            final /* synthetic */ C14411 f14781a;

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

            C36111(C14411 c14411) {
                this.f14781a = c14411;
            }
        }

        C14411(VehicleInfoActivity vehicleInfoActivity) {
            this.f4422a = vehicleInfoActivity;
        }

        public void run() {
            if (!this.f4422a.isFinishing()) {
                C1538a.m5802a(this.f4422a, new C36111(this));
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$2 */
    class C14422 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4423a;

        C14422(VehicleInfoActivity vehicleInfoActivity) {
            this.f4423a = vehicleInfoActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f4423a.isFinishing() == null) {
                dialogInterface = new Bundle();
                dialogInterface.putString("KEY_VEHICLE_NUMBER", this.f4423a.f21894v.getVehicleNum());
                dialogInterface.putSerializable("KEY_ACTION", Action.DELETE);
                dialogInterface.putSerializable("KEY_TYPE", Type.GARAGE);
                this.f4423a.m28708g().mo264a(1, dialogInterface, this.f4423a.f21887n).m1455m();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$3 */
    class C14433 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4424a;

        C14433(VehicleInfoActivity vehicleInfoActivity) {
            this.f4424a = vehicleInfoActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$4 */
    class C14444 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4425a;

        C14444(VehicleInfoActivity vehicleInfoActivity) {
            this.f4425a = vehicleInfoActivity;
        }

        public void onClick(View view) {
            view = new Intent(this.f4425a, MultipleVehicleInfoActivity.class);
            view.putExtra("KEY_VEHICLE_INFO", this.f4425a.f21894v);
            this.f4425a.startActivity(view);
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$5 */
    class C14455 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4426a;

        C14455(VehicleInfoActivity vehicleInfoActivity) {
            this.f4426a = vehicleInfoActivity;
        }

        public void onClick(View view) {
            C1540d.m5841m();
            C1561p.m5940a(this.f4426a, this.f4426a.f21894v, true);
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$6 */
    class C14466 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4427a;

        C14466(VehicleInfoActivity vehicleInfoActivity) {
            this.f4427a = vehicleInfoActivity;
        }

        public void onClick(View view) {
            if (C1547j.m5914d(this.f4427a) == null) {
                C1570t.m5978a(this.f4427a);
                return;
            }
            C1540d.m5845q();
            view = new Intent(this.f4427a, SearchResultLoaderActivity.class);
            view.putExtra("KEY_SKIP_DB", true);
            view.putExtra("KEY_VEHICLE_NUMBER", this.f4427a.f21894v.getVehicleNum());
            view.addFlags(268435456);
            this.f4427a.startActivity(view);
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$7 */
    class C14477 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4428a;

        C14477(VehicleInfoActivity vehicleInfoActivity) {
            this.f4428a = vehicleInfoActivity;
        }

        public void onClick(View view) {
            if (this.f4428a.f21894v.isDisableGarage() != null) {
                Toast.makeText(this.f4428a, "Action Not Allowed!!", 0).show();
            } else if (C1547j.m5914d(this.f4428a) == null) {
                C1570t.m5978a(this.f4428a);
            } else {
                if (this.f4428a.f21893u.vehicleInGarage(this.f4428a.f21894v.getVehicleNum()) != null) {
                    this.f4428a.m30153o();
                } else {
                    view = new Bundle();
                    view.putString("KEY_VEHICLE_NUMBER", this.f4428a.f21894v.getVehicleNum());
                    view.putSerializable("KEY_ACTION", Action.ADD);
                    view.putSerializable("KEY_TYPE", Type.GARAGE);
                    this.f4428a.m28708g().mo264a(1, view, this.f4428a.f21887n).m1455m();
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$9 */
    class C14489 implements View.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f4429a;

        C14489(VehicleInfoActivity vehicleInfoActivity) {
            this.f4429a = vehicleInfoActivity;
        }

        public void onClick(View view) {
            view = this.f4429a.f21894v.getCarVariantsData();
            Intent intent = new Intent(this.f4429a, CarDetailActivity.class);
            intent.putExtra("KEY_CAR_VARIANTS_DATA", view);
            if (C1547j.m5914d(this.f4429a) == null) {
                intent.putExtra("STATE", "ERROR");
            } else {
                intent.putExtra("STATE", "LOADING");
            }
            this.f4429a.startActivity(intent);
        }
    }

    /* renamed from: com.cuvora.carinfo.VehicleInfoActivity$8 */
    class C36128 implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ VehicleInfoActivity f14782a;
        /* renamed from: b */
        private Action f14783b;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
        }

        C36128(VehicleInfoActivity vehicleInfoActivity) {
            this.f14782a = vehicleInfoActivity;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            this.f14782a.m30158b(true);
            this.f14783b = (Action) bundle.get("KEY_ACTION");
            return new UpdateVehicleInRecentOrGarageLoader(this.f14782a, bundle.getString("KEY_VEHICLE_NUMBER"), this.f14783b, (Type) bundle.get("KEY_TYPE"));
        }

        /* renamed from: a */
        public void m18264a(C0392c<Response> c0392c, Response response) {
            if (this.f14782a.isFinishing() == null) {
                this.f14782a.m30158b(false);
                if ((response instanceof GarageResult) != null) {
                    this.f14782a.f21893u = C1570t.m6026k(this.f14782a);
                    if (this.f14783b == Action.ADD) {
                        Toast.makeText(this.f14782a, "Successfully added this vehicle to your garage ", 0).show();
                        C3688b.m18507a(this.f14782a).m18509a(this.f14782a.f21894v);
                    } else {
                        String vehicleNum = this.f14782a.f21894v.getVehicleNum();
                        Toast.makeText(this.f14782a, "Successfully removed this vehicle from your garage ", 0).show();
                        if (this.f14782a.f21893u.vehicleInGarage(vehicleNum) == null && this.f14782a.f21893u.vehicleInRecentSearches(vehicleNum) == null) {
                            C3688b.m18507a(this.f14782a).m18510a(vehicleNum);
                        }
                    }
                } else {
                    Toast.makeText(this.f14782a, "Updation failed, Please try again! ", 0).show();
                }
                this.f14782a.invalidateOptionsMenu();
                this.f14782a.setResult(-1);
            }
        }
    }

    /* renamed from: m */
    public boolean mo5037m() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_info);
        m29816a((Toolbar) findViewById(R.id.toolbar));
        if (mo4973h() != null) {
            mo4973h().mo538b(true);
        }
        this.f21893u = new GarageResult();
        m30156r();
        this.f21894v = (VehicleSearchResult) getIntent().getSerializableExtra("KEY_VEHICLE_INFO");
        m30155q();
        if (getIntent().hasExtra("KEY_VIA_VEHICLE_SEARCH") != null && getIntent().getBooleanExtra("KEY_VIA_VEHICLE_SEARCH", false) != null) {
            this.f21896x = new Handler();
            this.f21896x.postDelayed(new C14411(this), (long) C1541e.m5855b("ratingDialogDelayTime").intValue());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        m30154p();
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onPause() {
        super.onPause();
    }

    /* renamed from: l */
    public String mo5036l() {
        return getResources().getString(R.string.search_screen_interstitial_adunit_id);
    }

    /* renamed from: o */
    private void m30153o() {
        C0661a c0661a = new C0661a(this);
        c0661a.m2643b(getResources().getString(R.string.delete_confirmation, new Object[]{"Garage"}));
        c0661a.m2640a((CharSequence) "YES", new C14422(this));
        c0661a.m2644b("CANCEL", new C14433(this));
        c0661a.m2641a(true);
        c0661a.m2645b().show();
    }

    /* renamed from: p */
    private void m30154p() {
        Drawable a;
        boolean vehicleInGarage = this.f21893u.vehicleInGarage(this.f21894v.getVehicleNum());
        this.f21889q.setText(vehicleInGarage ? "IN GARAGE" : "ADD TO GARAGE");
        TextView textView = this.f21889q;
        if (vehicleInGarage) {
            a = C0389b.m1429a((Context) this, 2131165359);
        } else {
            a = C0389b.m1429a((Context) this, 2131165332);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(a, null, null, null);
        this.f21898z.setCardBackgroundColor(C0389b.m1438c(this, vehicleInGarage ? R.color.in_garage_color : R.color.add_to_garage_color));
        this.f21898z.setCardBackgroundColor(this.f21894v.isDisableGarage() ? C0389b.m1438c(this, R.color.gray_dark) : this.f21898z.getCardBackgroundColor().getDefaultColor());
    }

    /* renamed from: q */
    private void m30155q() {
        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar)).setTitle(this.f21894v.getVehicleNum());
        List vehicleInfoList = this.f21894v.getVehicleInfoList();
        int i = 0;
        VehicleInfo vehicleInfo = (VehicleInfo) vehicleInfoList.get(0);
        this.f21885C = this.f21894v.getShareText();
        if (this.f21894v.getImageUrl() != null && C1562q.m5946a(this.f21894v.getImageUrl())) {
            this.f21888p.setBackground(C0389b.m1429a((Context) this, 2131165337));
            this.f21888p.setImageUrl(this.f21894v.getImageUrl());
        }
        int i2 = 0;
        for (Entry entry : vehicleInfo.getVehicleInfoMap().entrySet()) {
            CarVariantsData carVariantsData = this.f21894v.getCarVariantsData();
            if (i2 == 2 && carVariantsData != null) {
                if (carVariantsData.getModelDetails() != null) {
                    this.f21890r.addView(m30157s());
                    CarsImage carsImage = (CarsImage) this.f21894v.getCarVariantsData().getModelDetails().getImages().get(0);
                    if (carsImage != null) {
                        this.f21888p.setBackground(C0389b.m1429a((Context) this, (int) R.drawable.ic_car_background));
                        this.f21888p.setImageUrlWithRoundedCorner(carsImage.getSanitizedCarLargeImage(), 80, R.drawable.ic_sedan_car_model);
                    }
                } else {
                    C1540d.m5836j(this.f21894v.getVehicleNum());
                }
            }
            if (i2 == 4) {
                this.f21886D = C1688b.m6369a(this, getResources().getString(R.string.vehicle_detail_medium_banner_ad));
                View e = C1533a.m5797e(this);
                this.f21884B = (UnifiedNativeAdView) e.findViewById(R.id.unified_native_adview);
                this.f21890r.addView(C1688b.m6367a(this, this.f21886D, getResources().getString(R.string.unified_native_ad_unit_id_rc), e.findViewById(R.id.ivDistractView), e, this.f21884B));
            }
            this.f21890r.addView(m30148a(entry.getKey().toString(), entry.getValue().toString()));
            i2++;
        }
        this.f21893u = C1570t.m6026k(this);
        if (vehicleInfoList.size() > 1) {
            C1540d.m5830g(this.f21894v.getVehicleNum());
            this.f21891s.setVisibility(0);
            this.f21891s.setOnClickListener(new C14444(this));
        } else {
            this.f21891s.setVisibility(8);
        }
        this.f21892t.setOnClickListener(new C14455(this));
        CardView cardView = this.f21897y;
        if (!this.f21894v.isRefreshAllowed()) {
            i = 8;
        }
        cardView.setVisibility(i);
        this.f21897y.setOnClickListener(new C14466(this));
        if (this.f21894v.isDisableGarage()) {
            this.f21898z.setCardBackgroundColor(C0389b.m1438c(this, R.color.green_dark));
        }
        this.f21898z.setOnClickListener(new C14477(this));
    }

    /* renamed from: b */
    public void m30158b(boolean z) {
        try {
            findViewById(R.id.pb).setVisibility(z ? false : true);
        } catch (boolean z2) {
            z2.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m30156r() {
        this.f21883A = (CardView) findViewById(R.id.cv_native_ad);
        this.f21897y = (CardView) findViewById(R.id.cv_refresh);
        this.f21888p = (AsyncImageView) findViewById(R.id.iv_cover_image);
        this.f21889q = (TextView) findViewById(R.id.tv_add_to_garage);
        this.f21890r = (LinearLayout) findViewById(R.id.ll_vehicle_info_container);
        this.f21891s = (CardView) findViewById(R.id.cv_view_more);
        this.f21892t = (CardView) findViewById(R.id.cv_share);
        this.f21895w = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21895w, (Context) this);
        this.f21898z = (CardView) findViewById(R.id.cv_add_to_garage);
        TextView textView = (TextView) findViewById(R.id.tv_share);
        ((ImageView) findViewById(R.id.ivShareWhatsapp)).setVisibility(C1561p.m5942a(this, C1561p.f4704a) ? 0 : 8);
        textView.setText(C1561p.m5942a(this, C1561p.f4704a) ? "WHATSAPP" : "SHARE");
    }

    /* renamed from: a */
    private View m30148a(String str, String str2) {
        View inflate = getLayoutInflater().inflate(R.layout.layout_vehicle_info_row_card, null, false);
        ((TextView) inflate.findViewById(R.id.tv_key)).setText(str);
        ((TextView) inflate.findViewById(R.id.tv_value)).setText(str2);
        return inflate;
    }

    /* renamed from: s */
    private View m30157s() {
        CarVariantsData carVariantsData = this.f21894v.getCarVariantsData();
        View inflate = getLayoutInflater().inflate(R.layout.row_car_detail_navigator, null, false);
        AsyncImageView asyncImageView = (AsyncImageView) inflate.findViewById(R.id.iv_car_image);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.tv_car_model_name);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.tv_car_make_name);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("by ");
        stringBuilder.append(carVariantsData.getModelDetails().getMakeName());
        appCompatTextView2.setText(stringBuilder.toString());
        appCompatTextView.setText(carVariantsData.getModelDetails().getModelName());
        CarsImage carsImage = (CarsImage) carVariantsData.getModelDetails().getImages().get(0);
        if (carsImage != null) {
            asyncImageView.setImageUrl(carsImage.getSanitizedCarThumnailImage(), R.drawable.ic_sedan_car_model);
        }
        inflate.setOnClickListener(new C14489(this));
        return inflate;
    }

    protected void onDestroy() {
        this.f21895w.destroy();
        if (this.f21886D != null) {
            this.f21886D.destroy();
        }
        if (this.f21884B != null) {
            this.f21884B.destroy();
        }
        if (this.f21896x != null) {
            this.f21896x.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }
}
