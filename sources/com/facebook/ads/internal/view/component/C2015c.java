package com.facebook.ads.internal.view.component;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdIconView;

/* renamed from: com.facebook.ads.internal.view.component.c */
public class C2015c extends LinearLayout {
    /* renamed from: a */
    private AdIconView f6228a;
    /* renamed from: b */
    private C2014b f6229b;
    /* renamed from: c */
    private TextView f6230c;
    /* renamed from: d */
    private LinearLayout f6231d;

    public TextView getCallToActionView() {
        return this.f6230c;
    }

    public AdIconView getIconView() {
        return this.f6228a;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView titleTextView = this.f6229b.getTitleTextView();
        if (titleTextView.getLayout().getLineEnd(titleTextView.getLineCount() - 1) < this.f6229b.getMinVisibleTitleCharacters()) {
            this.f6231d.removeView(this.f6228a);
            super.onMeasure(i, i2);
        }
    }
}
