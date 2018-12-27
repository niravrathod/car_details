package com.cuvora.carinfo.videomodule.ui.fragment;

import android.content.Context;
import android.databinding.C0060f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p172b.C4790e;
import com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity;
import com.cuvora.carinfo.videomodule.ui.model.C1608e;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView.C1609a;
import com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel;
import com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel.C1616a;
import com.feedbox.C2109c;
import com.feedbox.data.network.model.Content;
import com.feedbox.p121a.C2099a;
import com.feedbox.p121a.C2099a.C2095a;
import com.feedbox.p123b.C2104b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

public final class SeeAllFragment extends C4577a implements C1609a, C1616a {
    /* renamed from: a */
    public static final C1601a f21064a = new C1601a();
    /* renamed from: b */
    private final ArrayList<Content> f21065b = new ArrayList();
    /* renamed from: c */
    private C4790e f21066c;
    /* renamed from: d */
    private String f21067d;
    /* renamed from: e */
    private SeeAllFragmentViewModel f21068e;
    /* renamed from: f */
    private HashMap f21069f;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.SeeAllFragment$a */
    public static final class C1601a {
        private C1601a() {
        }

        /* renamed from: a */
        public final Bundle m6129a(String str) {
            C2885g.m13910b(str, "packageId");
            Bundle bundle = new Bundle();
            bundle.putString("packageID", str);
            return bundle;
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.SeeAllFragment$b */
    public static final class C3721b implements C2095a<List<Content>> {
        /* renamed from: a */
        final /* synthetic */ SeeAllFragment f14944a;

        C3721b(SeeAllFragment seeAllFragment) {
            this.f14944a = seeAllFragment;
        }

        /* renamed from: a */
        public void m18564a(List<Content> list) {
            C2885g.m13910b(list, "t");
            this.f14944a.m27860b().addAll(list);
            ProgressBar progressBar = (ProgressBar) this.f14944a.mo4642a(C1487a.pb);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (this.f14944a.getContext() != null) {
                this.f14944a.m27856a((List) list);
            }
        }

        /* renamed from: a */
        public void mo1230a(String str) {
            C2885g.m13910b(str, "message");
            ProgressBar progressBar = (ProgressBar) this.f14944a.mo4642a(C1487a.pb);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public View mo4642a(int i) {
        if (this.f21069f == null) {
            this.f21069f = new HashMap();
        }
        View view = (View) this.f21069f.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21069f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (this.f21069f != null) {
            this.f21069f.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4643a();
    }

    /* renamed from: d */
    public String mo4646d() {
        return C2109c.f6446a.m7674a().m7657d().m7652c();
    }

    /* renamed from: b */
    public final ArrayList<Content> m27860b() {
        return this.f21065b;
    }

    /* renamed from: a */
    public void mo4647a(C3730d c3730d) {
        C2885g.m13910b(c3730d, "railItemModel");
        if (C2104b.f6439a.m7667a()) {
            Context context = getContext();
            if (context != null) {
                ((VideoHomeActivity) context).m30203b(c3730d, this.f21065b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity");
        }
        Toast.makeText(getContext(), "Please connect to internet!!", 0).show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle == null) {
            C2885g.m13906a();
        }
        Object string = bundle.getString("packageID");
        C2885g.m13907a(string, "arguments!!.getString(KEY_PACKAGE_ID)");
        this.f21067d = string;
        this.f21068e = new SeeAllFragmentViewModel();
        bundle = this.f21068e;
        if (bundle == null) {
            C2885g.m13911b("seeAllFragmentViewModel");
        }
        bundle.m18641a((C1616a) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        this.f21066c = (C4790e) C0060f.m134a(layoutInflater, (int) R.layout.fragment_seeall, viewGroup, false);
        layoutInflater = this.f21066c;
        if (layoutInflater == null) {
            C2885g.m13906a();
        }
        SeeAllFragmentViewModel seeAllFragmentViewModel = this.f21068e;
        if (seeAllFragmentViewModel == null) {
            C2885g.m13911b("seeAllFragmentViewModel");
        }
        layoutInflater.mo4910a(seeAllFragmentViewModel);
        layoutInflater = this.f21066c;
        if (layoutInflater == null) {
            C2885g.m13906a();
        }
        return layoutInflater.m24026d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ProgressBar progressBar = (ProgressBar) mo4642a(C1487a.pb);
        if (progressBar != null) {
            progressBar.setVisibility(null);
        }
        ((BannerAdView) mo4642a(C1487a.bannerAdView)).m25222a((C1609a) this);
        view = C2099a.f6431a;
        bundle = this.f21067d;
        if (bundle == null) {
            C2885g.m13911b("packageId");
        }
        view.m7661a(bundle, new C3721b(this));
    }

    /* renamed from: a */
    private final void m27856a(List<Content> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Content content : list) {
            String str = "DETAIL";
            String str2 = this.f21067d;
            if (str2 == null) {
                C2885g.m13911b("packageId");
            }
            C3730d a = C1608e.m6143a(content, str, i, str2);
            if (a != null) {
                arrayList.add(a);
            }
            i++;
        }
        if ((arrayList.isEmpty() ^ 1) != null) {
            list = this.f21066c;
            if (list == null) {
                C2885g.m13906a();
            }
            list.mo4911a((List) arrayList);
        }
    }
}
