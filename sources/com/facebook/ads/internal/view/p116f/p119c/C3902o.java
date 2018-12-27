package com.facebook.ads.internal.view.p116f.p119c;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3880o;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.f.c.o */
public class C3902o extends RelativeLayout implements C2039b {
    /* renamed from: a */
    private static final int f15475a = ((int) (C1936w.f5934b * 6.0f));
    /* renamed from: b */
    private ObjectAnimator f15476b;
    /* renamed from: c */
    private AtomicInteger f15477c;
    /* renamed from: d */
    private ProgressBar f15478d;
    /* renamed from: e */
    private C3859a f15479e;
    /* renamed from: f */
    private C1817f f15480f;
    /* renamed from: g */
    private C1817f f15481g;
    /* renamed from: h */
    private C1817f f15482h;
    /* renamed from: i */
    private C1817f f15483i;

    /* renamed from: com.facebook.ads.internal.view.f.c.o$1 */
    class C46471 extends C3880o {
        /* renamed from: a */
        final /* synthetic */ C3902o f19234a;

        C46471(C3902o c3902o) {
            this.f19234a = c3902o;
        }

        /* renamed from: a */
        public void m25610a(C3879n c3879n) {
            if (this.f19234a.f15479e != null) {
                this.f19234a.m19368a(this.f19234a.f15479e.getDuration(), this.f19234a.f15479e.getCurrentPositionInMillis());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.o$2 */
    class C46482 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C3902o f19235a;

        C46482(C3902o c3902o) {
            this.f19235a = c3902o;
        }

        /* renamed from: a */
        public void m25612a(C3873h c3873h) {
            this.f19235a.m19370b();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.o$3 */
    class C46493 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C3902o f19236a;

        C46493(C3902o c3902o) {
            this.f19236a = c3902o;
        }

        /* renamed from: a */
        public void m25614a(C3875j c3875j) {
            if (this.f19236a.f15479e != null) {
                this.f19236a.m19368a(this.f19236a.f15479e.getDuration(), this.f19236a.f15479e.getCurrentPositionInMillis());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.o$4 */
    class C46504 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3902o f19237a;

        C46504(C3902o c3902o) {
            this.f19237a = c3902o;
        }

        /* renamed from: a */
        public void m25616a(C3867b c3867b) {
            if (this.f19237a.f15479e != null) {
                this.f19237a.m19372c();
            }
        }
    }

    public C3902o(Context context) {
        this(context, f15475a, -12549889);
    }

    public C3902o(Context context, int i, int i2) {
        super(context);
        this.f15480f = new C46471(this);
        this.f15481g = new C46482(this);
        this.f15482h = new C46493(this);
        this.f15483i = new C46504(this);
        this.f15477c = new AtomicInteger(-1);
        this.f15478d = new ProgressBar(context, null, 16842872);
        this.f15478d.setLayoutParams(new LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.f15478d.setMax(10000);
        addView(this.f15478d);
    }

    /* renamed from: a */
    private void m19368a(int i, int i2) {
        m19370b();
        if (this.f15477c.get() >= i2) {
            return;
        }
        if (i > i2) {
            int i3 = (i2 * 10000) / i;
            int min = (Math.min(i2 + 250, i) * 10000) / i;
            this.f15476b = ObjectAnimator.ofInt(this.f15478d, "progress", new int[]{i3, min});
            this.f15476b.setDuration((long) Math.min(250, i - i2));
            this.f15476b.setInterpolator(new LinearInterpolator());
            this.f15476b.start();
            this.f15477c.set(i2);
        }
    }

    /* renamed from: b */
    private void m19370b() {
        if (this.f15476b != null) {
            this.f15476b.cancel();
            this.f15476b.setTarget(null);
            this.f15476b = null;
            this.f15478d.clearAnimation();
        }
    }

    /* renamed from: c */
    private void m19372c() {
        m19370b();
        this.f15476b = ObjectAnimator.ofInt(this.f15478d, "progress", new int[]{0, 0});
        this.f15476b.setDuration(0);
        this.f15476b.setInterpolator(new LinearInterpolator());
        this.f15476b.start();
        this.f15477c.set(0);
    }

    /* renamed from: a */
    public void m19374a() {
        m19370b();
        this.f15478d = null;
        this.f15479e = null;
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15479e = c3859a;
        c3859a.getEventBus().m6830a(this.f15481g, this.f15482h, this.f15480f, this.f15483i);
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        c3859a.getEventBus().m6832b(this.f15480f, this.f15482h, this.f15481g, this.f15483i);
        this.f15479e = null;
    }

    public void setProgressBarColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        ColorDrawable colorDrawable2 = new ColorDrawable(0);
        ScaleDrawable scaleDrawable = new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f);
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, scaleDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.f15478d.setProgressDrawable(layerDrawable);
    }
}
