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
import com.cuvora.carinfo.models.cars.CarSpecifications;
import java.util.ArrayList;

/* renamed from: com.cuvora.carinfo.a.g */
public class C3625g extends C0771a<C3624a> {
    /* renamed from: a */
    private ArrayList<CarSpecifications> f14809a;
    /* renamed from: b */
    private C3645s f14810b;
    /* renamed from: c */
    private Context f14811c;

    /* renamed from: com.cuvora.carinfo.a.g$a */
    public static class C3624a extends C0798v {
        /* renamed from: n */
        private TextView f14807n;
        /* renamed from: o */
        private RecyclerView f14808o;

        public C3624a(View view) {
            super(view);
            this.f14807n = (TextView) view.findViewById(R.id.techSpecsTextView);
            this.f14808o = (RecyclerView) view.findViewById(R.id.carSpecificationGridView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18313a(viewGroup, i);
    }

    public C3625g(Context context, ArrayList<CarSpecifications> arrayList) {
        this.f14811c = context;
        this.f14809a = arrayList;
    }

    /* renamed from: a */
    public C3624a m18313a(ViewGroup viewGroup, int i) {
        return new C3624a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_properties_linear_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18315a(C3624a c3624a, int i) {
        c3624a.f14807n.setText(((CarSpecifications) this.f14809a.get(i)).getSpecificationPropertyName());
        this.f14810b = new C3645s(this.f14811c, ((CarSpecifications) this.f14809a.get(i)).getSpecificationItems());
        c3624a.f14808o.setAdapter(this.f14810b);
        c3624a.f14808o.setLayoutManager(new LinearLayoutManager(this.f14811c, 1, false));
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14809a == null) {
            return 0;
        }
        return this.f14809a.size();
    }
}
