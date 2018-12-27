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
import com.cuvora.carinfo.models.cars.CarOfaBrand;
import com.cuvora.carinfo.models.cars.CarsImage;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.d */
public class C3621d extends C0771a<C3620a> {
    /* renamed from: a */
    Context f14799a;
    /* renamed from: b */
    private List<CarOfaBrand> f14800b;
    /* renamed from: c */
    private C1451b f14801c;

    /* renamed from: com.cuvora.carinfo.a.d$b */
    public interface C1451b {
        /* renamed from: a */
        void mo5017a(String str);
    }

    /* renamed from: com.cuvora.carinfo.a.d$a */
    public static class C3620a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14795n;
        /* renamed from: o */
        private TextView f14796o;
        /* renamed from: p */
        private TextView f14797p;
        /* renamed from: q */
        private CardView f14798q;

        public C3620a(View view) {
            super(view);
            this.f14795n = (AsyncImageView) view.findViewById(R.id.carListImages);
            this.f14798q = (CardView) view.findViewById(R.id.carDetailCardView);
            this.f14796o = (TextView) view.findViewById(R.id.modelNameValueTextView);
            this.f14797p = (TextView) view.findViewById(R.id.avgPriceValueTextView);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18297a(viewGroup, i);
    }

    /* renamed from: a */
    public void m18300a(C1451b c1451b) {
        this.f14801c = c1451b;
    }

    public C3621d(List<CarOfaBrand> list, Context context) {
        this.f14800b = list;
        this.f14799a = context;
    }

    /* renamed from: a */
    public C3620a m18297a(ViewGroup viewGroup, int i) {
        return new C3620a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cars_list_particular_brand_recy_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m18299a(final C3620a c3620a, int i) {
        if (this.f14800b != null && this.f14800b.size() > 0) {
            List images = ((CarOfaBrand) this.f14800b.get(i)).getImages();
            if (images == null || images.isEmpty()) {
                c3620a.f14795n.setImageUrl("", R.drawable.ic_sedan_car_model);
            } else {
                c3620a.f14795n.setImageUrl(((CarsImage) images.get(0)).getSanitizedCarThumnailImage(), R.drawable.ic_sedan_car_model);
            }
            c3620a.f14796o.setText(((CarOfaBrand) this.f14800b.get(i)).getModelName());
            c3620a.f14797p.setText(((CarOfaBrand) this.f14800b.get(i)).getPriceOverview().getPrice());
            c3620a.f14798q.setOnClickListener(new OnClickListener(this) {
                /* renamed from: b */
                final /* synthetic */ C3621d f4432b;

                public void onClick(View view) {
                    this.f4432b.f14801c.mo5017a(((CarOfaBrand) this.f4432b.f14800b.get(c3620a.m3286e())).getModelId());
                }
            });
        }
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14800b == null) {
            return 0;
        }
        return this.f14800b.size();
    }
}
