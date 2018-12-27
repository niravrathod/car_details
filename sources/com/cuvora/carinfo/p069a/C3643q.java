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
import com.cuvora.carinfo.models.homepage.ElementType;
import com.cuvora.carinfo.p070c.C1472b;
import com.cuvora.carinfo.videomodule.utils.C1621b;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4886o;

/* renamed from: com.cuvora.carinfo.a.q */
public final class C3643q extends C0771a<C3642c> {
    /* renamed from: a */
    private final List<Element> f14855a;

    /* renamed from: com.cuvora.carinfo.a.q$c */
    public static class C3642c extends C0798v {
        public C3642c(View view) {
            C2885g.m13910b(view, "view");
            super(view);
        }
    }

    /* renamed from: com.cuvora.carinfo.a.q$a */
    public static final class C4535a extends C3642c {
        public C4535a(View view) {
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
                Object obj = (AppCompatTextView) view.findViewById(R.id.tvTitle);
                C2885g.m13907a(obj, "tvTitle");
                obj.setTextSize(0, obj.getTextSize() * a);
                obj = (AppCompatTextView) view.findViewById(R.id.tvSubTitle);
                C2885g.m13907a(obj, "tvSubTitle");
                obj.setTextSize(0, obj.getTextSize() * a);
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }

    /* renamed from: com.cuvora.carinfo.a.q$b */
    public static final class C4536b extends C3642c {
        public C4536b(View view) {
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
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }

    public C3643q(List<? extends Element> list) {
        C2885g.m13910b(list, "elements");
        this.f14855a = list;
    }

    /* renamed from: b */
    public /* synthetic */ C0798v mo96b(ViewGroup viewGroup, int i) {
        return m18390a(viewGroup, i);
    }

    /* renamed from: b */
    public int mo95b(int i) {
        return ((Element) this.f14855a.get(i)).getElementType().ordinal();
    }

    /* renamed from: a */
    public C3642c m18390a(ViewGroup viewGroup, int i) {
        C2885g.m13910b(viewGroup, "parent");
        if (i == ElementType.DEFAULT.ordinal()) {
            Object inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_recent_search, viewGroup, false);
            C2885g.m13907a(inflate, "view");
            return (C3642c) new C4535a(inflate);
        }
        inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_show_all, viewGroup, false);
        C2885g.m13907a(inflate, "view");
        return (C3642c) new C4536b(inflate);
    }

    /* renamed from: a */
    public void m18392a(C3642c c3642c, int i) {
        C2885g.m13910b(c3642c, "holder");
        Element element = (Element) this.f14855a.get(i);
        if (c3642c instanceof C4535a) {
            Object obj = c3642c.a;
            C2885g.m13907a(obj, "holder.itemView");
            obj = (AppCompatTextView) obj.findViewById(C1487a.tvTitle);
            C2885g.m13907a(obj, "holder.itemView.tvTitle");
            Object content = element.getContent();
            C2885g.m13907a(content, "element.content");
            content = content.getTitle();
            C2885g.m13907a(content, "element.content.title");
            if (content != null) {
                obj.setText(C1472b.m5718a(C4886o.m30224a((CharSequence) content).toString()));
                Object obj2 = c3642c.a;
                C2885g.m13907a(obj2, "holder.itemView");
                obj2 = (AppCompatTextView) obj2.findViewById(C1487a.tvSubTitle);
                C2885g.m13907a(obj2, "holder.itemView.tvSubTitle");
                Object content2 = element.getContent();
                C2885g.m13907a(content2, "element.content");
                obj2.setText(content2.getSubTitle());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        c3642c = c3642c instanceof C4536b;
    }

    /* renamed from: a */
    public int mo91a() {
        return this.f14855a.size();
    }
}
