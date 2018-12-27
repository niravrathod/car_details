package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.CarFeatures;
import com.cuvora.carinfo.p069a.C3619c;
import java.util.ArrayList;

/* renamed from: com.cuvora.carinfo.fragment.e */
public class C4550e extends Fragment {
    /* renamed from: a */
    RecyclerView f18873a;
    /* renamed from: b */
    C3619c f18874b;
    /* renamed from: c */
    ArrayList<CarFeatures> f18875c;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bundle = getArguments();
        if (bundle != null) {
            this.f18875c = (ArrayList) bundle.getSerializable("KEY_FEATURES");
        }
        layoutInflater = layoutInflater.inflate(R.layout.fragment_features, viewGroup, false);
        this.f18873a = (RecyclerView) layoutInflater.findViewById(R.id.features_rv);
        this.f18873a.setNestedScrollingEnabled(false);
        this.f18873a.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f18874b = new C3619c(getActivity(), this.f18875c);
        this.f18873a.setAdapter(this.f18874b);
        return layoutInflater;
    }

    /* renamed from: a */
    public static C4550e m25067a() {
        return new C4550e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
