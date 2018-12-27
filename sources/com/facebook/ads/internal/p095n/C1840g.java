package com.facebook.ads.internal.p095n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.internal.n.g */
public abstract class C1840g extends RelativeLayout {
    public C1840g(Context context) {
        super(context);
    }

    public C1840g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1840g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected abstract View getAdContentsView();
}
