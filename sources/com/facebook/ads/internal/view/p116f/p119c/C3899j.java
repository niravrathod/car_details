package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3880o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.f.c.j */
public class C3899j extends View implements C2039b {
    /* renamed from: a */
    private final Paint f15455a;
    /* renamed from: b */
    private final Paint f15456b;
    /* renamed from: c */
    private final Paint f15457c;
    /* renamed from: d */
    private C2059a f15458d = C2059a.CLOSE_BUTTON_MODE;
    /* renamed from: e */
    private final Paint f15459e;
    /* renamed from: f */
    private final RectF f15460f;
    /* renamed from: g */
    private C3859a f15461g;
    /* renamed from: h */
    private int f15462h;
    /* renamed from: i */
    private final AtomicInteger f15463i = new AtomicInteger(0);
    /* renamed from: j */
    private final AtomicBoolean f15464j = new AtomicBoolean(false);
    /* renamed from: k */
    private final C3878m f15465k = new C46371(this);
    /* renamed from: l */
    private final C3880o f15466l = new C46382(this);
    /* renamed from: m */
    private final C3868c f15467m = new C46393(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.j$a */
    public enum C2059a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.j$1 */
    class C46371 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C3899j f19220a;

        C46371(C3899j c3899j) {
            this.f19220a = c3899j;
        }

        /* renamed from: a */
        public void m25585a(C3877l c3877l) {
            this.f19220a.f15464j.set(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.j$2 */
    class C46382 extends C3880o {
        /* renamed from: a */
        final /* synthetic */ C3899j f19221a;

        C46382(C3899j c3899j) {
            this.f19221a = c3899j;
        }

        /* renamed from: a */
        public void m25587a(C3879n c3879n) {
            if (this.f19221a.f15461g != null) {
                int c = this.f19221a.f15462h;
                int duration = this.f19221a.f15461g.getDuration();
                if (c <= 0) {
                    this.f19221a.f15463i.set(0);
                } else {
                    c = Math.min(duration, c * 1000);
                    if (c != 0) {
                        this.f19221a.f15463i.set(((c - this.f19221a.f15461g.getCurrentPositionInMillis()) * 100) / c);
                    } else {
                        return;
                    }
                }
                this.f19221a.postInvalidate();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.j$3 */
    class C46393 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3899j f19222a;

        C46393(C3899j c3899j) {
            this.f19222a = c3899j;
        }

        /* renamed from: a */
        public void m25589a(C3867b c3867b) {
            this.f19222a.f15462h = 0;
            this.f19222a.f15463i.set(0);
            this.f19222a.postInvalidate();
        }
    }

    public C3899j(Context context, int i, int i2) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.f15462h = i;
        this.f15456b = new Paint();
        this.f15456b.setStyle(Style.FILL);
        this.f15456b.setColor(i2);
        this.f15457c = new Paint();
        this.f15457c.setColor(-1);
        this.f15457c.setAlpha(230);
        this.f15457c.setStyle(Style.FILL);
        this.f15457c.setStrokeWidth(1.0f * f);
        this.f15457c.setAntiAlias(true);
        this.f15455a = new Paint();
        this.f15455a.setColor(-16777216);
        this.f15455a.setStyle(Style.STROKE);
        this.f15455a.setAlpha(102);
        this.f15455a.setStrokeWidth(1.5f * f);
        this.f15455a.setAntiAlias(true);
        setLayerType(1, null);
        this.f15455a.setMaskFilter(new BlurMaskFilter(6.0f, Blur.NORMAL));
        this.f15459e = new Paint();
        this.f15459e.setColor(-10066330);
        this.f15459e.setStyle(Style.STROKE);
        this.f15459e.setStrokeWidth(f * 2.0f);
        this.f15459e.setAntiAlias(true);
        this.f15460f = new RectF();
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15461g = c3859a;
        this.f15461g.getEventBus().m6830a(this.f15465k, this.f15466l, this.f15467m);
    }

    /* renamed from: a */
    public boolean m19358a() {
        return this.f15461g != null && (this.f15462h <= 0 || this.f15463i.get() < 0);
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        this.f15461g.getEventBus().m6832b(this.f15467m, this.f15466l, this.f15465k);
        this.f15461g = null;
    }

    public int getSkipSeconds() {
        return this.f15462h;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f15464j.get()) {
            int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            int i = min / 2;
            float f = (float) i;
            canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f15455a);
            canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f15457c);
            if (this.f15463i.get() > 0) {
                this.f15460f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
                canvas.drawArc(this.f15460f, -90.0f, ((float) (-(this.f15463i.get() * 360))) / 100.0f, true, this.f15456b);
            } else if (this.f15458d == C2059a.SKIP_BUTTON_MODE) {
                int i2 = min / 4;
                min /= 3;
                Path path = new Path();
                path.moveTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + min));
                path.lineTo((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i));
                int i3 = min * 2;
                path.lineTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i3));
                canvas.drawPath(path, this.f15459e);
                path = new Path();
                path.moveTo((float) (getPaddingLeft() + i), (float) (min + getPaddingTop()));
                path.lineTo((float) ((i2 * 3) + getPaddingLeft()), (float) (getPaddingTop() + i));
                path.lineTo((float) (i + getPaddingLeft()), (float) (i3 + getPaddingTop()));
                canvas.drawPath(path, this.f15459e);
            } else {
                min /= 3;
                i = min * 2;
                Canvas canvas2 = canvas;
                canvas2.drawLine((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), this.f15459e);
                canvas.drawLine((float) (getPaddingLeft() + i), (float) (getPaddingTop() + min), (float) (min + getPaddingLeft()), (float) (i + getPaddingTop()), this.f15459e);
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(C2059a c2059a) {
        this.f15458d = c2059a;
    }
}
