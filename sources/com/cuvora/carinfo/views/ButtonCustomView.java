package com.cuvora.carinfo.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cuvora.carinfo.R;

public class ButtonCustomView extends LinearLayout {
    /* renamed from: a */
    private Context f4903a;
    /* renamed from: b */
    private AsyncImageView f4904b;
    /* renamed from: c */
    private TextView f4905c;

    public ButtonCustomView(Context context) {
        super(context);
        this.f4903a = context;
        m6220a(inflate(context, R.layout.custom_view_button, this));
    }

    /* renamed from: a */
    private void m6220a(View view) {
        this.f4904b = (AsyncImageView) view.findViewById(R.id.iv_icon);
        this.f4905c = (TextView) view.findViewById(R.id.tv_text);
    }

    public void setIcon(String str) {
        this.f4904b.setImageUrl(str);
    }

    public void setText(String str) {
        this.f4905c.setText(str);
    }
}
