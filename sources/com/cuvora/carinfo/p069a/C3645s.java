package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.SpecificationItems;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.s */
public class C3645s extends C0771a<C3644a> {
    /* renamed from: a */
    private Context f14858a;
    /* renamed from: b */
    private List<SpecificationItems> f14859b;

    /* renamed from: com.cuvora.carinfo.a.s$a */
    public static class C3644a extends C0798v {
        /* renamed from: n */
        private TextView f14856n;
        /* renamed from: o */
        private TextView f14857o;

        public C3644a(View view) {
            super(view);
            this.f14856n = (TextView) view.findViewById(R.id.carPropertyLabelTextView);
            this.f14857o = (TextView) view.findViewById(R.id.carPropertyValueTextView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18398a(viewGroup, i);
    }

    public C3645s(Context context, List<SpecificationItems> list) {
        this.f14858a = context;
        this.f14859b = list;
    }

    /* renamed from: a */
    public C3644a m18398a(ViewGroup viewGroup, int i) {
        return new C3644a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_properties_grid_recycler_items, viewGroup, false));
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14859b == null) {
            return 0;
        }
        return this.f14859b.size();
    }

    /* renamed from: a */
    public void m18400a(C3644a c3644a, int i) {
        c3644a.f14856n.setText(((SpecificationItems) this.f14859b.get(i)).getName());
        c3644a.f14857o.setText((CharSequence) ((SpecificationItems) this.f14859b.get(i)).getValues().get(0));
    }
}
