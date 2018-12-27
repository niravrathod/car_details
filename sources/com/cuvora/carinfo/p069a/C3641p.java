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
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.p */
public class C3641p extends C0771a<C3640a> {
    /* renamed from: a */
    private Context f14853a;
    /* renamed from: b */
    private List<Element> f14854b;

    /* renamed from: com.cuvora.carinfo.a.p$a */
    static class C3640a extends C0798v {
        /* renamed from: n */
        private AsyncImageView f14850n;
        /* renamed from: o */
        private TextView f14851o;
        /* renamed from: p */
        private TextView f14852p;

        public C3640a(View view) {
            super(view);
            this.f14850n = (AsyncImageView) view.findViewById(R.id.iv_icon);
            this.f14851o = (TextView) view.findViewById(R.id.tv_heading);
            this.f14852p = (TextView) view.findViewById(R.id.tv_date);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18385a(viewGroup, i);
    }

    public C3641p(Context context, List<Element> list) {
        this.f14853a = context;
        this.f14854b = list;
    }

    /* renamed from: a */
    public C3640a m18385a(ViewGroup viewGroup, int i) {
        i = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_news, viewGroup, false);
        LayoutParams layoutParams = (LayoutParams) i.getLayoutParams();
        layoutParams.width = (int) (((float) C1570t.m6029n(viewGroup.getContext())[0]) * 0.75f);
        i.setLayoutParams(layoutParams);
        return new C3640a(i);
    }

    /* renamed from: a */
    public void m18387a(C3640a c3640a, int i) {
        Element element = (Element) this.f14854b.get(i);
        c3640a.f14850n.setImageUrl(element.getContent().getImageUrl(), 2131165383);
        c3640a.f14851o.setText(element.getContent().getTitle());
        c3640a.f14852p.setText(element.getContent().getSubTitle());
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14854b == null) {
            return 0;
        }
        return this.f14854b.size();
    }
}
