package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;

/* renamed from: com.facebook.ads.internal.view.f.c.k */
public class C4640k extends C3858c {
    /* renamed from: a */
    private final C1817f<C3877l> f19223a;

    /* renamed from: com.facebook.ads.internal.view.f.c.k$1 */
    class C39001 extends C1817f<C3877l> {
        /* renamed from: a */
        final /* synthetic */ C4640k f15468a;

        C39001(C4640k c4640k) {
            this.f15468a = c4640k;
        }

        /* renamed from: a */
        public Class<C3877l> mo1340a() {
            return C3877l.class;
        }

        /* renamed from: a */
        public void m19362a(C3877l c3877l) {
            this.f15468a.setVisibility(8);
        }
    }

    public C4640k(Context context) {
        this(context, null);
    }

    public C4640k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4640k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19223a = new C39001(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        View progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6831a(this.f19223a);
        }
    }

    /* renamed from: b */
    protected void mo3985b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6833b(this.f19223a);
        }
        setVisibility(8);
        super.mo3985b();
    }
}
