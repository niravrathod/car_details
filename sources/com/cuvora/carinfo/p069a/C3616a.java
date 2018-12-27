package com.cuvora.carinfo.p069a;

import android.content.Context;
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

/* renamed from: com.cuvora.carinfo.a.a */
public class C3616a extends C0771a<C3615a> {
    /* renamed from: a */
    private Context f14787a;
    /* renamed from: b */
    private Section f14788b;

    /* renamed from: com.cuvora.carinfo.a.a$a */
    static class C3615a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14786n;

        public C3615a(View view) {
            super(view);
            this.f14786n = (AsyncImageView) view.findViewById(R.id.iv_banner);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18275a(viewGroup, i);
    }

    public C3616a(Context context, Section section) {
        this.f14787a = context;
        this.f14788b = section;
    }

    /* renamed from: a */
    public C3615a m18275a(ViewGroup viewGroup, int i) {
        i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_banner, viewGroup, false);
        LayoutParams layoutParams = (LayoutParams) i.getLayoutParams();
        if (this.f14788b.getElements().size() > 1) {
            layoutParams.width = (int) (((float) C1570t.m6029n(viewGroup.getContext())[0]) * 0.75f);
        } else {
            layoutParams.width = C1570t.m6029n(viewGroup.getContext())[0] - C1570t.m5993b(this.f14787a, 16);
        }
        if (this.f14788b.getAspectRatio() == null) {
            layoutParams.height = (int) (((float) layoutParams.width) * 0.7f);
        } else {
            double d = (double) layoutParams.width;
            double doubleValue = this.f14788b.getAspectRatio().doubleValue();
            Double.isNaN(d);
            layoutParams.height = Double.valueOf(d / doubleValue).intValue();
        }
        i.setLayoutParams(layoutParams);
        return new C3615a(i);
    }

    /* renamed from: a */
    public void m18277a(C3615a c3615a, int i) {
        c3615a.f14786n.setImageUrl(((Element) this.f14788b.getElements().get(i)).getContent().getImageUrl());
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14788b.getElements() == null) {
            return 0;
        }
        return this.f14788b.getElements().size();
    }
}
