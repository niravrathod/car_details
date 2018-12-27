package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.cars.Variants;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.i */
public class C3629i extends C0771a<C3628b> {
    /* renamed from: a */
    private Context f14824a;
    /* renamed from: b */
    private List<Variants> f14825b;
    /* renamed from: c */
    private C1453a f14826c;

    /* renamed from: com.cuvora.carinfo.a.i$a */
    public interface C1453a {
        /* renamed from: a */
        void mo5015a(String str, String str2);
    }

    /* renamed from: com.cuvora.carinfo.a.i$b */
    public static class C3628b extends C0798v {
        /* renamed from: n */
        private TextView f14818n;
        /* renamed from: o */
        private TextView f14819o;
        /* renamed from: p */
        private TextView f14820p;
        /* renamed from: q */
        private CardView f14821q;
        /* renamed from: r */
        private TextView f14822r;
        /* renamed from: s */
        private TextView f14823s;

        public C3628b(View view) {
            super(view);
            this.f14818n = (TextView) view.findViewById(R.id.versionNameVariantsData);
            this.f14819o = (TextView) view.findViewById(R.id.priceVariantsData);
            this.f14820p = (TextView) view.findViewById(R.id.transmissionVariantsData);
            this.f14822r = (TextView) view.findViewById(R.id.fuelVariantsData);
            this.f14821q = (CardView) view.findViewById(R.id.versionsCardViewVariantActivity);
            this.f14823s = (TextView) view.findViewById(R.id.engineDisplacementVariantsData);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18335a(viewGroup, i);
    }

    /* renamed from: a */
    public void m18337a(C1453a c1453a) {
        this.f14826c = c1453a;
    }

    public C3629i(List<Variants> list, Context context) {
        this.f14824a = context;
        this.f14825b = list;
    }

    /* renamed from: a */
    public C3628b m18335a(ViewGroup viewGroup, int i) {
        return new C3628b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.variant_versions_recycler_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18338a(C3628b c3628b, final int i) {
        c3628b.f14818n.setText(((Variants) this.f14825b.get(i)).getName());
        c3628b.f14819o.setText(((Variants) this.f14825b.get(i)).getPriceOverview().getPrice());
        c3628b.f14820p.setText(((Variants) this.f14825b.get(i)).getTransmissionType());
        c3628b.f14822r.setText(((Variants) this.f14825b.get(i)).getFuelType());
        String[] split = ((Variants) this.f14825b.get(i)).getFeatures().split(" ");
        if (split[0] != null) {
            c3628b.f14823s.setText(split[0]);
        }
        c3628b.f14821q.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ C3629i f4434b;

            public void onClick(View view) {
                this.f4434b.f14826c.mo5015a(((Variants) this.f4434b.f14825b.get(i)).getVersionId(), ((Variants) this.f4434b.f14825b.get(i)).getName());
            }
        });
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14825b == null) {
            return 0;
        }
        return this.f14825b.size();
    }
}
