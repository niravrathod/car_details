package com.facebook.ads.internal.view.p116f;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p120d.C2071c;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.f.d */
public class C2074d extends RelativeLayout {
    /* renamed from: a */
    private final C2071c f6387a;
    /* renamed from: b */
    private C4630g f6388b;
    /* renamed from: c */
    private WeakReference<C2064a> f6389c;

    /* renamed from: com.facebook.ads.internal.view.f.d$a */
    public interface C2064a {
        /* renamed from: a */
        void mo1371a();
    }

    public C2074d(Context context, C2071c c2071c) {
        super(context);
        this.f6387a = c2071c;
        C1936w.m7332b((View) this.f6387a);
        addView(this.f6387a.getView(), new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void m7628a(C3858c c3858c) {
        addView(c3858c, new LayoutParams(-1, -1));
        this.f6388b = (C4630g) c3858c;
    }

    /* renamed from: b */
    public void m7629b(C3858c c3858c) {
        C1936w.m7332b(c3858c);
        this.f6388b = null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.f6387a).layout(0, 0, getWidth(), getHeight());
        if (this.f6388b != null) {
            this.f6388b.layout(0, 0, getWidth(), getHeight());
        }
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int videoWidth = this.f6387a.getVideoWidth();
        int videoHeight = this.f6387a.getVideoHeight();
        int defaultSize = C2074d.getDefaultSize(videoWidth, i);
        int defaultSize2 = C2074d.getDefaultSize(videoHeight, i2);
        if (videoWidth <= 0 || videoHeight <= 0) {
            i = defaultSize;
            i2 = defaultSize2;
            obj = null;
        } else {
            obj = 1;
            defaultSize2 = MeasureSpec.getMode(i);
            i = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (defaultSize2 == 1073741824 && mode == 1073741824) {
                defaultSize2 = videoWidth * i2;
                mode = i * videoHeight;
                if (defaultSize2 < mode) {
                    i = defaultSize2 / videoHeight;
                } else if (defaultSize2 > mode) {
                    defaultSize2 = mode / videoWidth;
                }
            } else if (defaultSize2 == 1073741824) {
                defaultSize2 = (videoHeight * i) / videoWidth;
                if (mode == Integer.MIN_VALUE && defaultSize2 > i2) {
                }
            } else if (mode == 1073741824) {
                videoWidth = (videoWidth * i2) / videoHeight;
                if (defaultSize2 != Integer.MIN_VALUE || videoWidth <= i) {
                    i = videoWidth;
                }
            } else {
                if (mode != Integer.MIN_VALUE || videoHeight <= i2) {
                    mode = videoWidth;
                    i2 = videoHeight;
                } else {
                    mode = (i2 * videoWidth) / videoHeight;
                }
                if (defaultSize2 != Integer.MIN_VALUE || mode <= i) {
                    i = mode;
                } else {
                    defaultSize2 = (videoHeight * i) / videoWidth;
                }
            }
            i2 = defaultSize2;
        }
        setMeasuredDimension(i, i2);
        if (obj != null && this.f6389c != null && this.f6389c.get() != null) {
            ((C2064a) this.f6389c.get()).mo1371a();
        }
    }

    public void setViewImplInflationListener(C2064a c2064a) {
        this.f6389c = new WeakReference(c2064a);
    }
}
