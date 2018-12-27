package com.androidnetworking.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p045e.C1080a;
import com.androidnetworking.p045e.C1080a.C1078c;
import com.androidnetworking.p045e.C1080a.C1079d;

public class ANImageView extends AppCompatImageView {
    /* renamed from: a */
    private String f18811a;
    /* renamed from: b */
    private int f18812b;
    /* renamed from: c */
    private int f18813c;
    /* renamed from: d */
    private C1078c f18814d;

    public ANImageView(Context context) {
        this(context, null);
    }

    public ANImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ANImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageUrl(String str) {
        this.f18811a = str;
        m24906a((boolean) null);
    }

    public void setDefaultImageResId(int i) {
        this.f18812b = i;
    }

    public void setErrorImageResId(int i) {
        this.f18813c = i;
    }

    /* renamed from: a */
    void m24906a(final boolean z) {
        Object obj;
        int width = getWidth();
        int height = getHeight();
        ScaleType scaleType = getScaleType();
        Object obj2 = 1;
        Object obj3;
        if (getLayoutParams() != null) {
            obj3 = getLayoutParams().width == -2 ? 1 : null;
            if (getLayoutParams().height == -2) {
                obj = 1;
                if (obj3 != null || obj == null) {
                    obj2 = null;
                }
                if (width == 0 || height != 0 || r3 != null) {
                    if (!TextUtils.isEmpty(this.f18811a)) {
                        if (!(this.f18814d == null || this.f18814d.m4547c() == null)) {
                            if (this.f18814d.m4547c().equals(this.f18811a)) {
                                this.f18814d.m4545a();
                                m24904a();
                            }
                        }
                        if (obj3 != null) {
                            width = 0;
                        }
                        this.f18814d = C1080a.m4555b().m4559a(this.f18811a, new C1079d(this) {
                            /* renamed from: b */
                            final /* synthetic */ ANImageView f14183b;

                            /* renamed from: a */
                            public void mo917a(final C1078c c1078c, boolean z) {
                                if (z && z) {
                                    this.f14183b.post(new Runnable(this) {
                                        /* renamed from: b */
                                        final /* synthetic */ C33421 f3600b;

                                        public void run() {
                                            this.f3600b.mo917a(c1078c, false);
                                        }
                                    });
                                    return;
                                }
                                if (c1078c.m4546b()) {
                                    this.f14183b.setImageBitmap(c1078c.m4546b());
                                } else if (this.f14183b.f18812b != null) {
                                    this.f14183b.setImageResource(this.f14183b.f18812b);
                                }
                            }

                            /* renamed from: a */
                            public void mo918a(ANError aNError) {
                                if (this.f14183b.f18813c != null) {
                                    this.f14183b.setImageResource(this.f14183b.f18813c);
                                }
                            }
                        }, width, obj == null ? 0 : height, scaleType);
                    }
                    if (this.f18814d) {
                        this.f18814d.m4545a();
                        this.f18814d = false;
                    }
                    m24904a();
                }
                return;
            }
        }
        obj3 = null;
        obj = null;
        if (obj3 != null) {
        }
        obj2 = null;
        if (width == 0) {
        }
        if (!TextUtils.isEmpty(this.f18811a)) {
            if (this.f18814d) {
                this.f18814d.m4545a();
                this.f18814d = false;
            }
            m24904a();
        } else if (this.f18814d.m4547c().equals(this.f18811a)) {
            this.f18814d.m4545a();
            m24904a();
            if (obj3 != null) {
                width = 0;
            }
            if (obj == null) {
            }
            this.f18814d = C1080a.m4555b().m4559a(this.f18811a, /* anonymous class already generated */, width, obj == null ? 0 : height, scaleType);
        }
    }

    /* renamed from: a */
    private void m24904a() {
        if (this.f18812b != 0) {
            setImageResource(this.f18812b);
        } else {
            setImageBitmap(null);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m24906a(true);
    }

    protected void onDetachedFromWindow() {
        if (this.f18814d != null) {
            this.f18814d.m4545a();
            setImageBitmap(null);
            this.f18814d = null;
        }
        super.onDetachedFromWindow();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
