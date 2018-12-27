package com.cuvora.carinfo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.Section;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;

public abstract class HomePageBaseCustomView extends FrameLayout {
    /* renamed from: a */
    private static String f4994a;

    public abstract Section getSection();

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(HomePageBaseCustomView.class.getSimpleName());
        stringBuilder.append(" ");
        f4994a = stringBuilder.toString();
    }

    public HomePageBaseCustomView(Context context) {
        super(context);
    }

    public HomePageBaseCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomePageBaseCustomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void m6314a() {
        Section section = getSection();
        SectionTypeEnum type = section != null ? section.getType() : null;
        Log.e(f4994a, type != null ? type.name() : " visible");
        if (!(section == null || section.getElements() == null || section.getElements().size() <= 0)) {
            for (int i = 0; i < section.getElements().size(); i++) {
                if (C1570t.m5990a((Element) section.getElements().get(i))) {
                    Log.e(f4994a, "ad section  is visible");
                    return;
                }
            }
        }
    }
}
