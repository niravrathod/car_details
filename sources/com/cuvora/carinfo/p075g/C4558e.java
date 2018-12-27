package com.cuvora.carinfo.p075g;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1562q;
import com.cuvora.carinfo.models.homepage.Content;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.p071d.C3666b;
import com.cuvora.carinfo.p076h.C1530a;
import com.cuvora.carinfo.views.AsyncImageView;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.cuvora.carinfo.g.e */
public class C4558e extends C3666b {
    /* renamed from: o */
    private LinearLayout f18904o = ((LinearLayout) this.a.findViewById(R.id.ll_container));
    /* renamed from: p */
    private Section f18905p;

    public C4558e(ViewGroup viewGroup) {
        super(viewGroup, (int) R.layout.layout_home_page_grid);
    }

    /* renamed from: a */
    public void m25110a(Section section, C1530a<Section, Element> c1530a) {
        this.f18905p = section;
        this.f18904o.removeAllViews();
        section = section.getElements();
        for (int i = 0; i < section.size(); i += 2) {
            Element element = (Element) section.get(i);
            View linearLayout = new LinearLayout(this.a.getContext());
            linearLayout.setLayoutParams(new LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.addView(m25109a(linearLayout, element, c1530a));
            int i2 = i + 1;
            if (i2 < section.size()) {
                linearLayout.addView(m25109a(linearLayout, (Element) section.get(i2), c1530a));
            }
            this.f18904o.addView(linearLayout);
        }
    }

    /* renamed from: a */
    private View m25109a(LinearLayout linearLayout, final Element element, final C1530a<Section, Element> c1530a) {
        linearLayout = LayoutInflater.from(this.a.getContext()).inflate(R.layout.layout_home_page_grid_element, linearLayout, false);
        View findViewById = linearLayout.findViewById(R.id.card_view);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
        StringBuilder stringBuilder = new StringBuilder();
        Object aspectRatio = (this.f18905p == null || this.f18905p.getAspectRatio() == null || this.f18905p.getAspectRatio().doubleValue() <= 0.0d) ? "1.6" : this.f18905p.getAspectRatio();
        stringBuilder.append(String.valueOf(aspectRatio));
        stringBuilder.append(":1");
        layoutParams.f157B = stringBuilder.toString();
        findViewById.setLayoutParams(layoutParams);
        Content content = element.getContent();
        if (C1562q.m5946a(content.getImageUrl())) {
            ((AsyncImageView) linearLayout.findViewById(R.id.iv_item_image)).setImageUrl(content.getImageUrl());
        }
        ((AppCompatTextView) linearLayout.findViewById(R.id.tv_text)).setText(content.getTitle());
        linearLayout.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C4558e f4516c;

            public void onClick(View view) {
                if (c1530a != null) {
                    c1530a.mo1189a(element);
                }
            }
        });
        return linearLayout;
    }
}
