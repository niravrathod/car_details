package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p095n.C1840g;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;

public class AdIconView extends C1840g {
    /* renamed from: a */
    private ImageView f15029a;
    /* renamed from: b */
    private boolean f15030b;

    public AdIconView(Context context) {
        super(context);
        m18662a();
    }

    public AdIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18662a();
    }

    public AdIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18662a();
    }

    /* renamed from: a */
    private void m18662a() {
        C1936w.m7332b(this.f15029a);
        this.f15029a = new ImageView(getContext());
        this.f15029a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f15029a);
        this.f15030b = true;
    }

    /* renamed from: a */
    private void m18663a(final NativeAdBase nativeAdBase, boolean z) {
        bringChildToFront(this.f15029a);
        nativeAdBase.m18720a(this);
        C1991d a = new C1991d(this.f15029a).m7499a();
        if (z) {
            a.m7501a(new C1992e(this) {
                /* renamed from: b */
                final /* synthetic */ AdIconView f15028b;

                /* renamed from: a */
                public void mo1272a(boolean z) {
                    nativeAdBase.m18724g().m6998a(z, true);
                }
            });
        }
        a.m7503a(nativeAdBase.m18724g().m7003d().m7018a());
    }

    public void addView(View view) {
        if (!this.f15030b) {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        if (!this.f15030b) {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (!this.f15030b) {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (!this.f15030b) {
            super.addView(view, layoutParams);
        }
    }

    public void bringChildToFront(View view) {
        if (view == this.f15029a) {
            super.bringChildToFront(view);
        }
    }

    protected View getAdContentsView() {
        return this.f15029a;
    }

    void setNativeAd(C4589h c4589h) {
        m18663a(c4589h, false);
    }

    void setNativeBannerAd(C4673j c4673j) {
        m18663a(c4673j, true);
    }
}
