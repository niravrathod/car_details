package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.CarFeatures;
import java.util.ArrayList;

/* renamed from: com.cuvora.carinfo.a.c */
public class C3619c extends C0771a<C3618a> {
    /* renamed from: a */
    private ArrayList<CarFeatures> f14793a;
    /* renamed from: b */
    private Context f14794b;

    /* renamed from: com.cuvora.carinfo.a.c$a */
    public static class C3618a extends C0798v {
        /* renamed from: n */
        private TextView f14791n;
        /* renamed from: o */
        private RecyclerView f14792o;

        public C3618a(View view) {
            super(view);
            this.f14791n = (TextView) view.findViewById(R.id.techSpecsTextView);
            this.f14792o = (RecyclerView) view.findViewById(R.id.carSpecificationGridView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18286a(viewGroup, i);
    }

    public C3619c(Context context, ArrayList<CarFeatures> arrayList) {
        this.f14794b = context;
        this.f14793a = arrayList;
    }

    /* renamed from: a */
    public C3618a m18286a(ViewGroup viewGroup, int i) {
        return new C3618a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_properties_linear_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18288a(C3618a c3618a, int i) {
        c3618a.f14791n.setText(((CarFeatures) this.f14793a.get(i)).getFeaturePropertyName());
        c3618a.f14792o.setAdapter(new C3639n(((CarFeatures) this.f14793a.get(i)).getFeatureItems()));
        c3618a.f14792o.setLayoutManager(new LinearLayoutManager(this.f14794b, 1, false));
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14793a == null) {
            return 0;
        }
        return this.f14793a.size();
    }
}
