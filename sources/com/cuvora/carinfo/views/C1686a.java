package com.cuvora.carinfo.views;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1570t;

/* renamed from: com.cuvora.carinfo.views.a */
public class C1686a {
    /* renamed from: a */
    public static View m6364a(final Context context, Integer num) {
        View inflate = View.inflate(context, R.layout.rate_us_view, null);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.dp140));
        if (num != null) {
            layoutParams.setMargins(num.intValue(), num.intValue(), num.intValue(), num.intValue());
        }
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1540d.m5847s();
                C1570t.m6035t(context);
            }
        });
        return inflate;
    }
}
