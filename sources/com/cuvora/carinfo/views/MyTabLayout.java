package com.cuvora.carinfo.views;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0181e;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import com.cuvora.carinfo.models.homepage.TabContent;
import kotlin.jvm.internal.C2885g;

public final class MyTabLayout extends TabLayout {
    public MyTabLayout(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: b */
    public C0181e mo1263b() {
        Object b = super.mo1263b();
        b.m611a((int) R.layout.row_tab);
        C2885g.m13907a(b, "tab");
        return b;
    }

    public final void setupTabIcons(HomeTabData homeTabData) {
        C2885g.m13910b(homeTabData, "homeTabData");
        int size = homeTabData.getTabContents().size();
        for (int i = 0; i < size; i++) {
            View a;
            C0181e a2 = m649a(i);
            if (a2 != null) {
                a = a2.m615a();
                if (a != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.findViewById(R.id.tvTAb);
                    if (appCompatTextView != null) {
                        Object obj = homeTabData.getTabContents().get(i);
                        C2885g.m13907a(obj, "homeTabData.tabContents[i]");
                        appCompatTextView.setText(((TabContent) obj).getTabName());
                    }
                }
            }
            Object obj2 = homeTabData.getTabContents().get(i);
            C2885g.m13907a(obj2, "homeTabData.tabContents[i]");
            AsyncImageView asyncImageView;
            if (((TabContent) obj2).isSelected()) {
                a2 = m649a(i);
                if (a2 != null) {
                    a = a2.m615a();
                    if (a != null) {
                        asyncImageView = (AsyncImageView) a.findViewById(R.id.ivTab);
                        if (asyncImageView != null) {
                            obj = homeTabData.getTabContents().get(i);
                            C2885g.m13907a(obj, "homeTabData.tabContents[i]");
                            asyncImageView.setImageUrl(((TabContent) obj).getSelectedIcon());
                        }
                    }
                }
            } else {
                a2 = m649a(i);
                if (a2 != null) {
                    a = a2.m615a();
                    if (a != null) {
                        asyncImageView = (AsyncImageView) a.findViewById(R.id.ivTab);
                        if (asyncImageView != null) {
                            obj = homeTabData.getTabContents().get(i);
                            C2885g.m13907a(obj, "homeTabData.tabContents[i]");
                            asyncImageView.setImageUrl(((TabContent) obj).getIcon());
                        }
                    }
                }
            }
        }
    }
}
