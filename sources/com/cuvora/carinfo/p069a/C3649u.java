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
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.u */
public class C3649u extends C0771a<C3648a> {
    /* renamed from: a */
    private Context f14867a;
    /* renamed from: b */
    private List<Element> f14868b;

    /* renamed from: com.cuvora.carinfo.a.u$a */
    static class C3648a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14864n;
        /* renamed from: o */
        private TextView f14865o;
        /* renamed from: p */
        private TextView f14866p;

        public C3648a(View view) {
            super(view);
            this.f14864n = (AsyncImageView) view.findViewById(R.id.iv_icon);
            this.f14865o = (TextView) view.findViewById(R.id.tv_heading);
            this.f14866p = (TextView) view.findViewById(R.id.tv_subtitle);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18413a(viewGroup, i);
    }

    public C3649u(Context context, List<Element> list) {
        this.f14867a = context;
        this.f14868b = list;
    }

    /* renamed from: a */
    public C3648a m18413a(ViewGroup viewGroup, int i) {
        i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_video, viewGroup, false);
        LayoutParams layoutParams = (LayoutParams) i.getLayoutParams();
        layoutParams.width = (int) (((float) C1570t.m6029n(viewGroup.getContext())[0]) * 0.75f);
        i.setLayoutParams(layoutParams);
        return new C3648a(i);
    }

    /* renamed from: a */
    public void m18415a(C3648a c3648a, int i) {
        Element element = (Element) this.f14868b.get(i);
        c3648a.f14864n.setImageUrl(element.getContent().getImageUrl(), 2131165383);
        c3648a.f14865o.setText(element.getContent().getTitle());
        if (C1562q.m5946a(element.getContent().getSubTitle())) {
            c3648a.f14866p.setVisibility(0);
            c3648a.f14866p.setText(element.getContent().getSubTitle());
            return;
        }
        c3648a.f14866p.setVisibility(8);
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14868b == null) {
            return 0;
        }
        return this.f14868b.size();
    }
}
