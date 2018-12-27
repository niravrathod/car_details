package com.facebook.ads.internal.view.p108a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p101q.p103b.C1940b;
import com.facebook.ads.internal.p101q.p103b.C1941c;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.e */
public class C1976e extends LinearLayout {
    /* renamed from: a */
    private TextView f6101a;
    /* renamed from: b */
    private TextView f6102b;
    /* renamed from: c */
    private Drawable f6103c;

    public C1976e(Context context) {
        super(context);
        m7465a();
    }

    /* renamed from: a */
    private void m7465a() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.f6101a = new TextView(getContext());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f6101a.setTextColor(-16777216);
        this.f6101a.setTextSize(2, 20.0f);
        this.f6101a.setEllipsize(TruncateAt.END);
        this.f6101a.setSingleLine(true);
        this.f6101a.setVisibility(8);
        addView(this.f6101a, layoutParams);
        this.f6102b = new TextView(getContext());
        layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f6102b.setAlpha(0.5f);
        this.f6102b.setTextColor(-16777216);
        this.f6102b.setTextSize(2, 15.0f);
        this.f6102b.setCompoundDrawablePadding((int) (f * 5.0f));
        this.f6102b.setEllipsize(TruncateAt.END);
        this.f6102b.setSingleLine(true);
        this.f6102b.setVisibility(8);
        addView(this.f6102b, layoutParams);
    }

    private Drawable getPadlockDrawable() {
        if (this.f6103c == null) {
            this.f6103c = C1941c.m7343a(getContext(), C1940b.BROWSER_PADLOCK);
        }
        return this.f6103c;
    }

    public void setSubtitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6102b.setText(null);
            textView = this.f6102b;
            i = 8;
        } else {
            Uri parse = Uri.parse(str);
            this.f6102b.setText(parse.getHost());
            this.f6102b.setCompoundDrawablesRelativeWithIntrinsicBounds("https".equals(parse.getScheme()) ? getPadlockDrawable() : null, null, null, null);
            textView = this.f6102b;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTitle(String str) {
        TextView textView;
        int i;
        if (TextUtils.isEmpty(str)) {
            this.f6101a.setText(null);
            textView = this.f6101a;
            i = 8;
        } else {
            this.f6101a.setText(str);
            textView = this.f6101a;
            i = 0;
        }
        textView.setVisibility(i);
    }
}
