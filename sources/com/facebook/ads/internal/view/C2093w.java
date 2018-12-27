package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.facebook.ads.internal.view.w */
public class C2093w extends View {
    /* renamed from: a */
    private C2092u f6410a;

    public C2093w(Context context, C2092u c2092u) {
        super(context);
        this.f6410a = c2092u;
        setLayoutParams(new LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int i) {
        if (this.f6410a != null) {
            this.f6410a.mo1374a(i);
        }
    }
}
