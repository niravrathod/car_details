package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.models.cars.Brands;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.k */
public class C3633k extends C0771a<C3632a> {
    /* renamed from: a */
    private List<Brands> f14837a;
    /* renamed from: b */
    private Context f14838b;
    /* renamed from: c */
    private C1454b f14839c;

    /* renamed from: com.cuvora.carinfo.a.k$b */
    public interface C1454b {
        /* renamed from: a */
        void mo4627a(String str);
    }

    /* renamed from: com.cuvora.carinfo.a.k$a */
    public static class C3632a extends C0798v {
        /* renamed from: n */
        private TextView f14834n;
        /* renamed from: o */
        private AsyncImageView f14835o;
        /* renamed from: p */
        private CardView f14836p;

        public C3632a(View view) {
            super(view);
            this.f14834n = (TextView) view.findViewById(R.id.carBrandName);
            this.f14835o = (AsyncImageView) view.findViewById(R.id.carBrandImage);
            this.f14836p = (CardView) view.findViewById(R.id.carBrandCardView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18355a(viewGroup, i);
    }

    /* renamed from: a */
    public void m18358a(C1454b c1454b) {
        this.f14839c = c1454b;
    }

    public C3633k(List<Brands> list, Context context) {
        this.f14837a = list;
        this.f14838b = context;
    }

    /* renamed from: a */
    public C3632a m18355a(ViewGroup viewGroup, int i) {
        return new C3632a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_brands_recycler_item_view, viewGroup, false));
    }

    /* renamed from: a */
    public void m18357a(C3632a c3632a, int i) {
        if (this.f14837a != null && this.f14837a.size() > 0) {
            c3632a.f14834n.setText(((Brands) this.f14837a.get(i)).getLabel());
            c3632a.f14835o.setImageUrl(((Brands) this.f14837a.get(i)).getIcon());
            c3632a.f14836p.setOnClickListener(new -$$Lambda$k$AsQ0XmfnyIjC2qCcsWQ-wUMfzjg(this, i));
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m18353a(int i, View view) {
        C1540d.m5817b(((Brands) this.f14837a.get(i)).getLabel());
        this.f14839c.mo4627a(((Brands) this.f14837a.get(i)).getValue());
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14837a == null) {
            return 0;
        }
        return this.f14837a.size();
    }
}
