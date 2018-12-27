package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.views.AsyncImageView;
import java.util.List;

/* renamed from: com.cuvora.carinfo.a.t */
public class C3647t extends C0771a<C3646a> {
    /* renamed from: a */
    private Context f14862a;
    /* renamed from: b */
    private List<Element> f14863b;

    /* renamed from: com.cuvora.carinfo.a.t$a */
    static class C3646a extends C0798v {
        /* renamed from: n */
        private TextView f14860n;
        /* renamed from: o */
        private AsyncImageView f14861o;

        public C3646a(View view) {
            super(view);
            this.f14860n = (TextView) view.findViewById(R.id.tv_heading);
            this.f14861o = (AsyncImageView) view.findViewById(R.id.iv_icon);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18405a(viewGroup, i);
    }

    public C3647t(Context context, List<Element> list) {
        this.f14862a = context;
        this.f14863b = list;
    }

    /* renamed from: a */
    public C3646a m18405a(ViewGroup viewGroup, int i) {
        return new C3646a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_trending, viewGroup, false));
    }

    /* renamed from: a */
    public void m18407a(C3646a c3646a, int i) {
        Element element = (Element) this.f14863b.get(i);
        c3646a.f14861o.setImageUrlWithCircleTransform(element.getContent().getImageUrl(), R.drawable.ic_pic_circle);
        c3646a.f14860n.setText(element.getContent().getTitle());
    }

    /* renamed from: a */
    public int mo91a() {
        if (this.f14863b == null) {
            return 0;
        }
        return this.f14863b.size();
    }
}
