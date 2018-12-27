package com.cuvora.carinfo.videomodule.ui.fragment;

import android.content.Context;
import android.databinding.C0060f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.navigation.fragment.C0897a;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p172b.C4788a;
import com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity;
import com.cuvora.carinfo.videomodule.ui.model.C1607c;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView.C1609a;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel;
import com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel.C1615a;
import com.feedbox.C2109c;
import com.feedbox.data.network.model.C2112b;
import com.feedbox.p121a.C2099a;
import com.feedbox.p121a.C2099a.C2095a;
import com.feedbox.p123b.C2104b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

public final class HomeFragment extends C4577a implements C1609a, C1615a {
    /* renamed from: a */
    private ArrayList<C3729b> f21059a = new ArrayList();
    /* renamed from: b */
    private C4788a f21060b;
    /* renamed from: c */
    private HomeFragmentViewModel f21061c;
    /* renamed from: d */
    private View f21062d;
    /* renamed from: e */
    private HashMap f21063e;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.HomeFragment$b */
    static final class C1599b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ HomeFragment f4816a;

        C1599b(HomeFragment homeFragment) {
            this.f4816a = homeFragment;
        }

        public final void onClick(View view) {
            view = this.f4816a.mo4642a(C1487a.connectivity_view);
            if (view != null) {
                view.setVisibility(8);
            }
            this.f4816a.m27849b();
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.HomeFragment$a */
    public static final class C3719a implements C2095a<C2112b> {
        /* renamed from: a */
        final /* synthetic */ HomeFragment f14942a;

        C3719a(HomeFragment homeFragment) {
            this.f14942a = homeFragment;
        }

        /* renamed from: a */
        public void m18558a(C2112b c2112b) {
            C2885g.m13910b(c2112b, "t");
            if (this.f14942a.getContext() != null) {
                this.f14942a.m27848a(c2112b);
            }
            ProgressBar progressBar = (ProgressBar) this.f14942a.mo4642a(C1487a.pb);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }

        /* renamed from: a */
        public void mo1230a(String str) {
            C2885g.m13910b(str, "message");
            ProgressBar progressBar = (ProgressBar) this.f14942a.mo4642a(C1487a.pb);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            str = this.f14942a.mo4642a(C1487a.connectivity_view);
            if (str != null) {
                str.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public View mo4642a(int i) {
        if (this.f21063e == null) {
            this.f21063e = new HashMap();
        }
        View view = (View) this.f21063e.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21063e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (this.f21063e != null) {
            this.f21063e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4643a();
    }

    /* renamed from: d */
    public String mo4646d() {
        return C2109c.f6446a.m7674a().m7657d().m7651b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21061c = new HomeFragmentViewModel();
        bundle = this.f21061c;
        if (bundle == null) {
            C2885g.m13911b("homeFragmentViewModel");
        }
        bundle.m18639a((C1615a) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        if (this.f21060b != null) {
            return this.f21062d;
        }
        this.f21060b = (C4788a) C0060f.m134a(layoutInflater, (int) R.layout.fragment_home, viewGroup, false);
        layoutInflater = this.f21060b;
        if (layoutInflater == null) {
            C2885g.m13906a();
        }
        this.f21062d = layoutInflater.m24026d();
        layoutInflater = this.f21060b;
        if (layoutInflater == null) {
            C2885g.m13906a();
        }
        HomeFragmentViewModel homeFragmentViewModel = this.f21061c;
        if (homeFragmentViewModel == null) {
            C2885g.m13911b("homeFragmentViewModel");
        }
        layoutInflater.mo4907a(homeFragmentViewModel);
        return this.f21062d;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ((BannerAdView) mo4642a(C1487a.bannerAdView)).m25222a((C1609a) this);
        m27849b();
        ((Button) mo4642a(C1487a.try_again)).setOnClickListener((OnClickListener) new C1599b(this));
    }

    /* renamed from: b */
    private final void m27849b() {
        ProgressBar progressBar = (ProgressBar) mo4642a(C1487a.pb);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        C2099a.f6431a.m7662b(new C3719a(this));
    }

    /* renamed from: a */
    private final void m27848a(C2112b c2112b) {
        Context context = getContext();
        if (context != null) {
            ((VideoHomeActivity) context).m30201a(c2112b);
            ArrayList arrayList = new ArrayList();
            c2112b = C1607c.m6142a(c2112b).iterator();
            while (c2112b.hasNext()) {
                C3729b c3729b = (C3729b) c2112b.next();
                arrayList.add(c3729b);
                this.f21059a.add(c3729b);
            }
            if ((arrayList.isEmpty() ^ 1) != null) {
                c2112b = this.f21060b;
                if (c2112b == null) {
                    C2885g.m13906a();
                }
                c2112b.mo4908a((List) arrayList);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity");
    }

    /* renamed from: a */
    public void mo4644a(C3729b c3729b) {
        C2885g.m13910b(c3729b, "homeRailModel");
        if (C2104b.f6439a.m7667a()) {
            C0897a.m3910a(this).m3888a((int) R.id.action_homeFragment_to_listingFragment, SeeAllFragment.f21064a.m6129a(c3729b.m18588f()));
        } else {
            Toast.makeText(getContext(), "Please connect to internet!!", 0).show();
        }
    }

    /* renamed from: a */
    public void mo4645a(C3730d c3730d) {
        C2885g.m13910b(c3730d, "railItemModel");
        if (C2104b.f6439a.m7667a()) {
            if (getContext() instanceof VideoHomeActivity) {
                Context context = getContext();
                if (context != null) {
                    ((VideoHomeActivity) context).m30199a(c3730d, this.f21059a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity");
                }
            }
            return;
        }
        Toast.makeText(getContext(), "Please connect to internet!!", 0).show();
    }
}
