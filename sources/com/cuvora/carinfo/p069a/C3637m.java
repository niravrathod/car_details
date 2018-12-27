package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0771a;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.videomodule.utils.C1621b;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.a.m */
public final class C3637m extends C0771a<C3636a> {
    /* renamed from: a */
    private LinkedList<Integer> f14845a = new LinkedList();
    /* renamed from: b */
    private final List<Element> f14846b;

    /* renamed from: com.cuvora.carinfo.a.m$a */
    public static final class C3636a extends C0798v {
        public C3636a(View view) {
            C2885g.m13910b(view, "view");
            super(view);
            C1621b c1621b = C1621b.f4881a;
            Context context = view.getContext();
            C2885g.m13907a((Object) context, "view.context");
            float a = c1621b.m6197a(context);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                layoutParams2.width = (int) (((float) layoutParams2.width) * a);
                layoutParams2.setMarginStart((int) (((float) layoutParams2.getMarginStart()) * a));
                Object obj = (AppCompatTextView) view.findViewById(R.id.tv_heading);
                C2885g.m13907a(obj, "tvTitle");
                obj.setTextSize(0, obj.getTextSize() * a);
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }

    public C3637m(List<? extends Element> list) {
        this.f14846b = list;
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18370a(viewGroup, i);
    }

    /* renamed from: a */
    public C3636a m18370a(ViewGroup viewGroup, int i) {
        C2885g.m13910b(viewGroup, "parent");
        Object inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view_featured, viewGroup, false);
        C2885g.m13907a(inflate, "view");
        return new C3636a(inflate);
    }

    /* renamed from: a */
    public void m18372a(C3636a c3636a, int i) {
        C2885g.m13910b(c3636a, "holder");
        List list = this.f14846b;
        if (list == null) {
            C2885g.m13906a();
        }
        Element element = (Element) list.get(i);
        if (this.f14845a.size() == 0) {
            m18368b();
        }
        Object obj = c3636a.a;
        C2885g.m13907a(obj, "holder.itemView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) obj.findViewById(C1487a.tv_heading);
        Object remove = this.f14845a.remove();
        C2885g.m13907a(remove, "listBack.remove()");
        appCompatTextView.setBackgroundResource(((Number) remove).intValue());
        Object obj2 = c3636a.a;
        C2885g.m13907a(obj2, "holder.itemView");
        obj2 = (AppCompatTextView) obj2.findViewById(C1487a.tv_heading);
        C2885g.m13907a(obj2, "holder.itemView.tv_heading");
        Object content = element.getContent();
        C2885g.m13907a(content, "element.content");
        obj2.setText(content.getTitle());
    }

    /* renamed from: b */
    private final void m18368b() {
        this.f14845a.add(Integer.valueOf(R.drawable.gradient_featured_1));
        this.f14845a.add(Integer.valueOf(R.drawable.gradient_featured_2));
        this.f14845a.add(Integer.valueOf(R.drawable.gradient_featured_3));
        this.f14845a.add(Integer.valueOf(R.drawable.gradient_featured_4));
    }

    /* renamed from: a */
    public int mo91a() {
        List list = this.f14846b;
        return list != null ? list.size() : 0;
    }
}
