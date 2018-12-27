package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.CarSpecifications;
import com.cuvora.carinfo.p069a.C3625g;
import java.util.ArrayList;

/* renamed from: com.cuvora.carinfo.fragment.n */
public class C4553n extends Fragment {
    /* renamed from: a */
    RecyclerView f18885a;
    /* renamed from: b */
    C3625g f18886b;
    /* renamed from: c */
    ArrayList<CarSpecifications> f18887c;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bundle = getArguments();
        if (bundle != null) {
            this.f18887c = (ArrayList) bundle.getSerializable("KEY_SPECIFICATIONS");
        }
        layoutInflater = layoutInflater.inflate(R.layout.fragment_specifications, viewGroup, false);
        this.f18885a = (RecyclerView) layoutInflater.findViewById(R.id.specificationFragmentRecyclerView);
        this.f18885a.setNestedScrollingEnabled(false);
        this.f18885a.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f18886b = new C3625g(getActivity(), this.f18887c);
        this.f18885a.setAdapter(this.f18886b);
        return layoutInflater;
    }

    /* renamed from: a */
    public static C4553n m25080a() {
        return new C4553n();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
