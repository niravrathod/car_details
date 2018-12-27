package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.View;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3880o;

/* renamed from: com.facebook.ads.internal.view.f.c.n */
public class C3901n extends View implements C2039b {
    /* renamed from: a */
    private final Paint f15469a = new Paint();
    /* renamed from: b */
    private final Rect f15470b;
    /* renamed from: c */
    private float f15471c;
    /* renamed from: d */
    private final C3880o f15472d = new C46451(this);
    /* renamed from: e */
    private final C3868c f15473e = new C46462(this);
    /* renamed from: f */
    private C3859a f15474f;

    /* renamed from: com.facebook.ads.internal.view.f.c.n$1 */
    class C46451 extends C3880o {
        /* renamed from: a */
        final /* synthetic */ C3901n f19232a;

        C46451(C3901n c3901n) {
            this.f19232a = c3901n;
        }

        /* renamed from: a */
        public void m25606a(C3879n c3879n) {
            if (this.f19232a.f15474f != null) {
                int duration = this.f19232a.f15474f.getDuration();
                if (duration > 0) {
                    this.f19232a.f15471c = ((float) this.f19232a.f15474f.getCurrentPositionInMillis()) / ((float) duration);
                } else {
                    this.f19232a.f15471c = 0.0f;
                }
                this.f19232a.postInvalidate();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.n$2 */
    class C46462 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3901n f19233a;

        C46462(C3901n c3901n) {
            this.f19233a = c3901n;
        }

        /* renamed from: a */
        public void m25608a(C3867b c3867b) {
            if (this.f19233a.f15474f != null) {
                this.f19233a.f15471c = 0.0f;
                this.f19233a.postInvalidate();
            }
        }
    }

    public C3901n(Context context) {
        super(context);
        this.f15469a.setStyle(Style.FILL);
        this.f15469a.setColor(-9528840);
        this.f15470b = new Rect();
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15474f = c3859a;
        c3859a.getEventBus().m6830a(this.f15472d, this.f15473e);
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        c3859a.getEventBus().m6832b(this.f15473e, this.f15472d);
        this.f15474f = null;
    }

    public void draw(Canvas canvas) {
        this.f15470b.set(0, 0, (int) (((float) getWidth()) * this.f15471c), getHeight());
        canvas.drawRect(this.f15470b, this.f15469a);
        super.draw(canvas);
    }
}
