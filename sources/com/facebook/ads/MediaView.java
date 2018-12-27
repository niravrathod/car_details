package com.facebook.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.C0771a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.C3780q;
import com.facebook.ads.internal.adapters.C3780q.C1754a;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p094m.C3799d;
import com.facebook.ads.internal.p095n.C1840g;
import com.facebook.ads.internal.p101q.p102a.C1920j;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C2081k;
import com.facebook.ads.internal.view.hscroll.C4861b;
import com.facebook.ads.internal.view.p109b.C1988b;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;

public class MediaView extends C1840g {
    /* renamed from: a */
    private static final String f15060a = "MediaView";
    /* renamed from: b */
    private static final int f15061b = Color.argb(51, 145, 150, 165);
    /* renamed from: c */
    private C1988b f15062c;
    /* renamed from: d */
    private C4861b f15063d;
    /* renamed from: e */
    private MediaViewVideoRenderer f15064e;
    /* renamed from: f */
    private View f15065f;
    /* renamed from: g */
    private C1702g f15066g;
    /* renamed from: h */
    private boolean f15067h;
    /* renamed from: i */
    private boolean f15068i;
    /* renamed from: j */
    private boolean f15069j;

    public MediaView(Context context) {
        super(context);
        setImageRenderer(new C1988b(context));
        setCarouselRenderer(new C4861b(context));
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context));
        m18714b();
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageRenderer(new C1988b(context, attributeSet));
        setCarouselRenderer(new C4861b(context, attributeSet));
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context, attributeSet));
        m18714b();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageRenderer(new C1988b(context, attributeSet, i));
        setCarouselRenderer(new C4861b(context, attributeSet, i));
        setVideoRenderer(new DefaultMediaViewVideoRenderer(context, attributeSet, i));
        m18714b();
    }

    /* renamed from: a */
    private boolean m18713a(C4589h c4589h) {
        return VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(c4589h.m25257a());
    }

    /* renamed from: b */
    private void m18714b() {
        C1936w.m7328a((View) this, f15061b);
        C1920j.m7291a(this, C1920j.INTERNAL_AD_MEDIA);
        C1920j.m7291a(this.f15062c, C1920j.INTERNAL_AD_MEDIA);
        C1920j.m7291a(this.f15064e, C1920j.INTERNAL_AD_MEDIA);
        C1920j.m7291a(this.f15063d, C1920j.INTERNAL_AD_MEDIA);
        this.f15068i = true;
    }

    /* renamed from: b */
    private boolean m18715b(C4589h c4589h) {
        if (c4589h.m25261e() == null) {
            return false;
        }
        for (C4589h k : c4589h.m25261e()) {
            if (k.m18728k() == null) {
                return false;
            }
        }
        return true;
    }

    private void setCarouselRenderer(C4861b c4861b) {
        if (this.f15067h) {
            throw new IllegalStateException("Carousel renderer must be set before nativeAd.");
        }
        if (this.f15063d != null) {
            removeView(this.f15063d);
        }
        float f = C1936w.f5934b;
        int round = Math.round(4.0f * f);
        int round2 = Math.round(f * 12.0f);
        c4861b.setChildSpacing(round);
        c4861b.setPadding(0, round2, 0, round2);
        c4861b.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) c4861b, layoutParams);
        this.f15063d = c4861b;
    }

    private void setImageRenderer(C1988b c1988b) {
        if (this.f15067h) {
            throw new IllegalStateException("Image renderer must be set before nativeAd.");
        }
        if (this.f15062c != null) {
            removeView(this.f15062c);
        }
        c1988b.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) c1988b, layoutParams);
        this.f15062c = c1988b;
    }

    /* renamed from: a */
    public void m18716a() {
        this.f15064e.m6416a(false);
        this.f15064e.m6418c();
    }

    /* renamed from: a */
    void m18717a(View view, LayoutParams layoutParams) {
        this.f15068i = false;
        addView(view, layoutParams);
        this.f15068i = true;
    }

    public void addView(View view) {
        if (!this.f15068i) {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        if (!this.f15068i) {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        if (!this.f15068i) {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!this.f15068i) {
            super.addView(view, i, layoutParams);
        }
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (!this.f15068i) {
            super.addView(view, layoutParams);
        }
    }

    public void bringChildToFront(View view) {
        if (view == this.f15063d || view == this.f15064e || view == this.f15062c) {
            super.bringChildToFront(view);
        }
    }

    protected View getAdContentsView() {
        return this.f15065f;
    }

    protected C1827c getAdEventManager() {
        return C3799d.m18991a(getContext());
    }

    public void setListener(final C1702g c1702g) {
        this.f15066g = c1702g;
        if (c1702g == null) {
            this.f15064e.setListener(null);
        } else {
            this.f15064e.setListener(new C2081k(this) {
                /* renamed from: b */
                final /* synthetic */ MediaView f15059b;

                /* renamed from: a */
                public void mo1288a() {
                    c1702g.mo1503a(this.f15059b, this.f15059b.f15064e.getVolume());
                }

                /* renamed from: b */
                public void mo1289b() {
                    c1702g.mo1504b(this.f15059b);
                }

                /* renamed from: c */
                public void mo1290c() {
                    c1702g.mo1502a(this.f15059b);
                }

                /* renamed from: d */
                public void mo1291d() {
                    c1702g.mo1508f(this.f15059b);
                }

                /* renamed from: e */
                public void mo1292e() {
                    c1702g.mo1509g(this.f15059b);
                }

                /* renamed from: f */
                public void mo1293f() {
                    c1702g.mo1507e(this.f15059b);
                }

                /* renamed from: g */
                public void mo1294g() {
                    c1702g.mo1506d(this.f15059b);
                }

                /* renamed from: h */
                public void mo1295h() {
                    c1702g.mo1505c(this.f15059b);
                }
            });
        }
    }

    void setNativeAd(final C4589h c4589h) {
        this.f15067h = true;
        c4589h.m18721a(this);
        if (m18715b(c4589h)) {
            this.f15065f = this.f15063d;
            this.f15062c.setVisibility(8);
            this.f15062c.m7485a(null, null);
            this.f15064e.setVisibility(8);
            this.f15064e.mo1283a();
            bringChildToFront(this.f15063d);
            this.f15063d.setCurrentPosition(0);
            C0771a c3780q = new C3780q(this.f15063d, c4589h.m18724g().m7013n());
            c3780q.m18913a(new C1754a(this) {
                /* renamed from: b */
                final /* synthetic */ MediaView f15055b;

                /* renamed from: a */
                public void mo1287a() {
                    c4589h.m18724g().m6998a(true, true);
                }
            });
            this.f15063d.setAdapter(c3780q);
            this.f15063d.setVisibility(0);
        } else if (m18713a(c4589h)) {
            c4589h.m18724g().m6997a(this.f15069j);
            this.f15065f = this.f15064e.getVideoView();
            this.f15062c.setVisibility(8);
            this.f15062c.m7485a(null, null);
            this.f15063d.setVisibility(8);
            this.f15063d.setAdapter(null);
            bringChildToFront(this.f15064e);
            this.f15064e.setNativeAd(c4589h);
            this.f15064e.setVisibility(0);
        } else if (c4589h.m18728k() != null) {
            this.f15065f = this.f15062c.getBodyImageView();
            this.f15064e.setVisibility(8);
            this.f15064e.mo1283a();
            this.f15063d.setVisibility(8);
            this.f15063d.setAdapter(null);
            bringChildToFront(this.f15062c);
            this.f15062c.setVisibility(0);
            new C1991d(this.f15062c).m7500a(getHeight(), getWidth()).m7502a(C1820a.m6850e(getContext())).m7501a(new C1992e(this) {
                /* renamed from: b */
                final /* synthetic */ MediaView f15057b;

                /* renamed from: a */
                public void mo1272a(boolean z) {
                    c4589h.m18724g().m6998a(z, true);
                }
            }).m7503a(c4589h.m18724g().m7004e().m7018a());
        }
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (this.f15067h) {
            throw new IllegalStateException("Video renderer must be set before nativeAd.");
        }
        if (this.f15064e != null) {
            removeView(this.f15064e);
            this.f15064e.m6418c();
        }
        mediaViewVideoRenderer.setAdEventManager(getAdEventManager());
        mediaViewVideoRenderer.setVisibility(8);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        m18717a(mediaViewVideoRenderer, layoutParams);
        this.f15064e = mediaViewVideoRenderer;
        this.f15069j = !(this.f15064e instanceof DefaultMediaViewVideoRenderer);
    }
}
