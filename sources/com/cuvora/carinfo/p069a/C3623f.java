package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.views.AsyncImageView;

/* renamed from: com.cuvora.carinfo.a.f */
public class C3623f extends C0771a<C3622a> {
    /* renamed from: a */
    private Context f14805a;
    /* renamed from: b */
    private Section f14806b;

    /* renamed from: com.cuvora.carinfo.a.f$a */
    static class C3622a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14802n;
        /* renamed from: o */
        private AppCompatTextView f14803o;
        /* renamed from: p */
        private AppCompatTextView f14804p;

        public C3622a(View view) {
            super(view);
            this.f14802n = (AsyncImageView) view.findViewById(R.id.iv_car_image);
            this.f14803o = (AppCompatTextView) view.findViewById(R.id.tv_title);
            this.f14804p = (AppCompatTextView) view.findViewById(R.id.tv_subtitle);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18306a(viewGroup, i);
    }

    public C3623f(Context context, Section section) {
        this.f14805a = context;
        this.f14806b = section;
    }

    /* renamed from: a */
    public C3622a m18306a(ViewGroup viewGroup, int i) {
        i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_car_rail, viewGroup, false);
        LayoutParams layoutParams = (LayoutParams) i.getLayoutParams();
        layoutParams.width = (int) (((float) C1570t.m6029n(viewGroup.getContext())[0]) * 0.6f);
        i.setLayoutParams(layoutParams);
        return new C3622a(i);
    }

    /* renamed from: a */
    public void m18308a(C3622a c3622a, int i) {
        ViewGroup.LayoutParams layoutParams = c3622a.f14802n.getLayoutParams();
        layoutParams.width = (int) (((float) C1570t.m6029n(c3622a.a.getContext())[0]) * 0.6f);
        layoutParams.height = (int) (((float) layoutParams.width) * 0.56f);
        c3622a.f14802n.setLayoutParams(layoutParams);
        Element element = (Element) this.f14806b.getElements().get(i);
        c3622a.f14802n.setImageUrl(element.getContent().getImageUrl(), R.drawable.ic_sedan_car_model);
        if (element.getContent().getTitle() != null) {
            c3622a.f14803o.setText(element.getContent().getTitle());
        }
        if (element.getContent().getSubTitle() != null) {
            c3622a.f14804p.setVisibility(0);
            c3622a.f14804p.setText(element.getContent().getSubTitle());
            return;
        }
        c3622a.f14804p.setVisibility(8);
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14806b.getElements() == null) {
            return 0;
        }
        return this.f14806b.getElements().size();
    }
}
