package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.views.AsyncImageView;

/* renamed from: com.cuvora.carinfo.a.l */
public class C3635l extends C0771a<C3634a> {
    /* renamed from: a */
    private Context f14843a;
    /* renamed from: b */
    private Section f14844b;

    /* renamed from: com.cuvora.carinfo.a.l$a */
    static class C3634a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14840n;
        /* renamed from: o */
        private TextView f14841o;
        /* renamed from: p */
        private TextView f14842p;

        public C3634a(View view) {
            super(view);
            this.f14840n = (AsyncImageView) view.findViewById(R.id.iv_banner);
            this.f14841o = (TextView) view.findViewById(R.id.tv_title);
            this.f14842p = (TextView) view.findViewById(R.id.tv_subtitle);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18364a(viewGroup, i);
    }

    public C3635l(Context context, Section section) {
        this.f14843a = context;
        this.f14844b = section;
    }

    /* renamed from: a */
    public C3634a m18364a(ViewGroup viewGroup, int i) {
        i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_cross_sell, viewGroup, false);
        LayoutParams layoutParams = (LayoutParams) i.getLayoutParams();
        if (this.f14844b.getElements().size() > 1) {
            layoutParams.width = (int) (((float) C1570t.m6029n(viewGroup.getContext())[0]) * 0.4f);
        } else {
            layoutParams.width = C1570t.m6029n(viewGroup.getContext())[0] - C1570t.m5993b(this.f14843a, 16);
        }
        i.setLayoutParams(layoutParams);
        return new C3634a(i);
    }

    /* renamed from: a */
    public void m18366a(C3634a c3634a, int i) {
        ViewGroup.LayoutParams layoutParams = c3634a.f14840n.getLayoutParams();
        if (this.f14844b.getAspectRatio() == null) {
            layoutParams.height = (int) (((float) C1570t.m6029n(this.f14843a)[0]) * 0.4f);
        } else {
            double d = (double) layoutParams.width;
            double doubleValue = this.f14844b.getAspectRatio().doubleValue();
            Double.isNaN(d);
            layoutParams.height = Double.valueOf(d / doubleValue).intValue();
        }
        c3634a.f14840n.setLayoutParams(layoutParams);
        Element element = (Element) this.f14844b.getElements().get(i);
        c3634a.f14840n.setImageUrl(element.getContent().getImageUrl());
        if (element.getContent().getTitle() != null) {
            c3634a.f14841o.setText(element.getContent().getTitle());
        }
        if (element.getContent().getSubTitle() != null) {
            c3634a.f14842p.setText(element.getContent().getSubTitle());
        }
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14844b.getElements() == null) {
            return 0;
        }
        return this.f14844b.getElements().size();
    }
}
