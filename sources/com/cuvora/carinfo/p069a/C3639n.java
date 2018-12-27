package com.cuvora.carinfo.p069a;

import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.FeatureItems;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.n */
public class C3639n extends C0771a<C3638a> {
    /* renamed from: a */
    private List<FeatureItems> f14849a;

    /* renamed from: com.cuvora.carinfo.a.n$a */
    public static class C3638a extends C0798v {
        /* renamed from: n */
        private TextView f14847n;
        /* renamed from: o */
        private TextView f14848o;

        public C3638a(View view) {
            super(view);
            this.f14847n = (TextView) view.findViewById(R.id.carPropertyLabelTextView);
            this.f14848o = (TextView) view.findViewById(R.id.carPropertyValueTextView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18377a(viewGroup, i);
    }

    public C3639n(List<FeatureItems> list) {
        this.f14849a = list;
    }

    /* renamed from: a */
    public C3638a m18377a(ViewGroup viewGroup, int i) {
        return new C3638a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_properties_grid_recycler_items, viewGroup, false));
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14849a == null) {
            return 0;
        }
        return this.f14849a.size();
    }

    /* renamed from: a */
    public void m18379a(C3638a c3638a, int i) {
        c3638a.f14847n.setText(((FeatureItems) this.f14849a.get(i)).getName());
        c3638a.f14848o.setText((CharSequence) ((FeatureItems) this.f14849a.get(i)).getValues().get(0));
    }
}
