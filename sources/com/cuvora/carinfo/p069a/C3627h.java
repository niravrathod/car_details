package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.MileageData;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.h */
public class C3627h extends C0771a<C3626a> {
    /* renamed from: a */
    private Context f14816a;
    /* renamed from: b */
    private List<MileageData> f14817b;

    /* renamed from: com.cuvora.carinfo.a.h$a */
    public static class C3626a extends C0798v {
        /* renamed from: n */
        private TextView f14812n;
        /* renamed from: o */
        private TextView f14813o;
        /* renamed from: p */
        private TextView f14814p;
        /* renamed from: q */
        private TextView f14815q;

        public C3626a(View view) {
            super(view);
            this.f14812n = (TextView) view.findViewById(R.id.fuelTypeMileageData);
            this.f14813o = (TextView) view.findViewById(R.id.transmissionTypeMileageData);
            this.f14814p = (TextView) view.findViewById(R.id.averageMileageData);
            this.f14815q = (TextView) view.findViewById(R.id.fuelUnitMileageData);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18322a(viewGroup, i);
    }

    public C3627h(List<MileageData> list, Context context) {
        this.f14816a = context;
        this.f14817b = list;
    }

    /* renamed from: a */
    public C3626a m18322a(ViewGroup viewGroup, int i) {
        return new C3626a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mileage_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18324a(C3626a c3626a, int i) {
        c3626a.f14812n.setText(((MileageData) this.f14817b.get(i)).getFuelType());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((MileageData) this.f14817b.get(i)).getTransmission());
        stringBuilder.append(",");
        c3626a.f14813o.setText(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(((MileageData) this.f14817b.get(i)).getDisplacement());
        stringBuilder.append(" cc");
        c3626a.f14813o.append(stringBuilder.toString());
        c3626a.f14814p.setText(((MileageData) this.f14817b.get(i)).getAverage());
        stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(((MileageData) this.f14817b.get(i)).getFuelUnit());
        c3626a.f14815q.setText(stringBuilder.toString());
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14817b == null) {
            return 0;
        }
        return this.f14817b.size();
    }
}
