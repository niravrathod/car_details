package com.cuvora.carinfo.fragment;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0363u;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.CarListParticularBrandActivity;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1547j;
import com.cuvora.carinfo.helpers.ProgressLinearLayout;
import com.cuvora.carinfo.loaders.C4565d;
import com.cuvora.carinfo.models.Response;
import com.cuvora.carinfo.models.cars.Brands;
import com.cuvora.carinfo.models.cars.CarsBrandsResponse;
import com.cuvora.carinfo.p069a.C3633k;
import com.cuvora.carinfo.p069a.C3633k.C1454b;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.fragment.d */
public final class C4801d extends C4549b implements C1454b {
    /* renamed from: b */
    private final int f21014b = 100;
    /* renamed from: c */
    private CarsBrandsResponse f21015c;
    /* renamed from: d */
    private List<Integer> f21016d = new ArrayList();
    /* renamed from: e */
    private String f21017e;
    /* renamed from: f */
    private final OnClickListener f21018f = new C1498b(this);
    /* renamed from: g */
    private final C3670a f21019g = new C3670a(this);
    /* renamed from: h */
    private HashMap f21020h;

    /* renamed from: com.cuvora.carinfo.fragment.d$b */
    static final class C1498b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4801d f4486a;

        C1498b(C4801d c4801d) {
            this.f4486a = c4801d;
        }

        public final void onClick(View view) {
            if (C1547j.m5914d(this.f4486a.getContext()) != null) {
                this.f4486a.m27780f();
                C1533a.m5787a((AdView) this.f4486a.mo4626a(C1487a.adView), this.f4486a.getContext());
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.fragment.d$a */
    public static final class C3670a implements C0362a<Response> {
        /* renamed from: a */
        final /* synthetic */ C4801d f14887a;

        /* renamed from: a */
        public void mo1159a(C0392c<Response> c0392c) {
            C2885g.m13910b(c0392c, "loader");
        }

        C3670a(C4801d c4801d) {
            this.f14887a = c4801d;
        }

        /* renamed from: a */
        public C0392c<Response> mo1158a(int i, Bundle bundle) {
            return (C0392c) new C4565d(this.f14887a.getContext());
        }

        /* renamed from: a */
        public void m18464a(C0392c<Response> c0392c, Response response) {
            C2885g.m13910b(c0392c, "loader");
            if (response != null && (response instanceof CarsBrandsResponse) != null) {
                ((ProgressLinearLayout) this.f14887a.mo4626a(C1487a.progressLinearLayout)).m5769a();
                this.f14887a.f21015c = (CarsBrandsResponse) response;
                c0392c = this.f14887a.f21015c;
                List brandsArrayList = c0392c != null ? c0392c.getBrandsArrayList() : null;
                if (brandsArrayList != null) {
                    this.f14887a.m27776a(brandsArrayList);
                }
            } else if (this.f14887a.f21015c != null) {
            } else {
                if (C1547j.m5914d(this.f14887a.getContext()) == null) {
                    ((ProgressLinearLayout) this.f14887a.mo4626a(C1487a.progressLinearLayout)).m5770a(this.f14887a.getResources().getDrawable(2131165375), "No Connection", this.f14887a.getResources().getString(R.string.no_internet_message), "Try Again", this.f14887a.f21018f, this.f14887a.f21016d);
                } else {
                    ((ProgressLinearLayout) this.f14887a.mo4626a(C1487a.progressLinearLayout)).m5770a(this.f14887a.getResources().getDrawable(2131165375), "Something Went Wrong", this.f14887a.getResources().getString(R.string.homepage_data_error_msg), "Try Again", this.f14887a.f21018f, this.f14887a.f21016d);
                }
            }
        }
    }

    /* renamed from: a */
    public View mo4626a(int i) {
        if (this.f21020h == null) {
            this.f21020h = new HashMap();
        }
        View view = (View) this.f21020h.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21020h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo4629e() {
        if (this.f21020h != null) {
            this.f21020h.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4629e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.view_car_brands, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        this.f21016d.add(Integer.valueOf(R.id.appBarLayout));
        if (this.f21017e == null) {
            this.f21017e = "LOADING";
        }
        m27780f();
    }

    /* renamed from: f */
    private final void m27780f() {
        ((ProgressLinearLayout) mo4626a(C1487a.progressLinearLayout)).m5771a(this.f21016d);
        C0363u loaderManager = getLoaderManager();
        if (loaderManager != null) {
            C0392c a = loaderManager.mo264a(this.f21014b, null, this.f21019g);
            if (a != null) {
                a.m1455m();
            }
        }
    }

    /* renamed from: a */
    private final void m27776a(List<? extends Brands> list) {
        getResources().getDimensionPixelSize(R.dimen.brands_card_spacing);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3, 1, false);
        Object obj = (RecyclerView) mo4626a(C1487a.carBrandsRecyclerView);
        C2885g.m13907a(obj, "carBrandsRecyclerView");
        obj.setLayoutManager(gridLayoutManager);
        C3633k c3633k = new C3633k(list, getContext());
        Object obj2 = (RecyclerView) mo4626a(C1487a.carBrandsRecyclerView);
        C2885g.m13907a(obj2, "carBrandsRecyclerView");
        obj2.setAdapter(c3633k);
        c3633k.m18358a(this);
    }

    /* renamed from: a */
    public void mo4627a(String str) {
        C2885g.m13910b(str, "brandId");
        Intent intent = new Intent(getContext(), CarListParticularBrandActivity.class);
        intent.putExtra("KEY_BRAND_ID", str);
        intent.setClass(getContext(), CarListParticularBrandActivity.class);
        if (C1547j.m5914d(getContext()) == null) {
            intent.putExtra("STATE", "ERROR");
            str = getContext();
            if (str != null) {
                str.startActivity(intent);
                return;
            }
            return;
        }
        intent.putExtra("STATE", "LOADING");
        if (VERSION.SDK_INT >= 21) {
            str = ActivityOptions.makeSceneTransitionAnimation(getActivity(), new Pair[0]).toBundle();
            Context context = getContext();
            if (context != null) {
                context.startActivity(intent, str);
                return;
            }
            return;
        }
        str = getContext();
        if (str != null) {
            str.startActivity(intent);
        }
    }

    /* renamed from: c */
    public void mo4628c() {
        C1533a.m5787a((AdView) mo4626a(C1487a.adView), getContext());
    }
}
