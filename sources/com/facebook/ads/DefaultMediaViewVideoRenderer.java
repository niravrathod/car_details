package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.internal.p095n.C1834c;
import com.facebook.ads.internal.p095n.C1834c.C1833a;
import com.facebook.ads.internal.p095n.C1837d;
import java.lang.ref.WeakReference;

public final class DefaultMediaViewVideoRenderer extends MediaViewVideoRenderer {
    /* renamed from: d */
    private C1834c f15043d;

    /* renamed from: com.facebook.ads.DefaultMediaViewVideoRenderer$1 */
    class C16941 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ DefaultMediaViewVideoRenderer f5095a;

        C16941(DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer) {
            this.f5095a = defaultMediaViewVideoRenderer;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.facebook.ads.DefaultMediaViewVideoRenderer$a */
    private static class C3747a implements C1833a {
        /* renamed from: a */
        private WeakReference<C1837d> f15042a;

        public C3747a(C1837d c1837d) {
            this.f15042a = new WeakReference(c1837d);
        }

        /* renamed from: a */
        public void mo1282a(boolean z) {
            if (this.f15042a.get() != null) {
                ((C1837d) this.f15042a.get()).m6998a(z, false);
            }
        }
    }

    public DefaultMediaViewVideoRenderer(Context context) {
        super(context);
        this.f15043d = new C1834c(context, this);
        m18684k();
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15043d = new C1834c(context, this);
        m18684k();
    }

    public DefaultMediaViewVideoRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15043d = new C1834c(context, this);
        m18684k();
    }

    /* renamed from: k */
    private void m18684k() {
        setVolume(0.0f);
    }

    /* renamed from: a */
    protected void mo1283a() {
        super.mo1283a();
        this.f15043d.m6949a();
    }

    /* renamed from: b */
    public void mo1284b() {
        super.mo1284b();
        setOnTouchListener(new C16941(this));
        this.f15043d.m6951b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15043d.m6952c();
    }

    protected void onDetachedFromWindow() {
        this.f15043d.m6953d();
        super.onDetachedFromWindow();
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f15043d.m6954e();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f15043d.m6955f();
    }

    protected void setNativeAd(C4589h c4589h) {
        super.setNativeAd(c4589h);
        this.f15043d.m6950a(c4589h.m18724g(), new C3747a(c4589h.m18724g()));
    }
}
