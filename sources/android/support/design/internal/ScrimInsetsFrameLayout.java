package android.support.design.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {
    /* renamed from: a */
    Drawable f538a;
    /* renamed from: b */
    Rect f539b;
    /* renamed from: c */
    private Rect f540c;

    /* renamed from: android.support.design.internal.ScrimInsetsFrameLayout$1 */
    class C30361 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ ScrimInsetsFrameLayout f12819a;

        C30361(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
            this.f12819a = scrimInsetsFrameLayout;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            boolean z;
            if (this.f12819a.f539b == null) {
                this.f12819a.f539b = new Rect();
            }
            this.f12819a.f539b.set(c0571z.m2251a(), c0571z.m2253b(), c0571z.m2254c(), c0571z.m2255d());
            this.f12819a.mo131a(c0571z);
            view = this.f12819a;
            if (c0571z.m2256e()) {
                if (this.f12819a.f538a != null) {
                    z = false;
                    view.setWillNotDraw(z);
                    C0560r.m2189c(this.f12819a);
                    return c0571z.m2258g();
                }
            }
            z = true;
            view.setWillNotDraw(z);
            C0560r.m2189c(this.f12819a);
            return c0571z.m2258g();
        }
    }

    /* renamed from: a */
    protected void mo131a(C0571z c0571z) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f540c = new Rect();
        context = context.obtainStyledAttributes(attributeSet, C0142k.ScrimInsetsFrameLayout, i, C0141j.Widget_Design_ScrimInsetsFrameLayout);
        this.f538a = context.getDrawable(C0142k.ScrimInsetsFrameLayout_insetForeground);
        context.recycle();
        setWillNotDraw(true);
        C0560r.m2176a((View) this, new C30361(this));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f539b != null && this.f538a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f540c.set(0, 0, width, this.f539b.top);
            this.f538a.setBounds(this.f540c);
            this.f538a.draw(canvas);
            this.f540c.set(0, height - this.f539b.bottom, width, height);
            this.f538a.setBounds(this.f540c);
            this.f538a.draw(canvas);
            this.f540c.set(0, this.f539b.top, this.f539b.left, height - this.f539b.bottom);
            this.f538a.setBounds(this.f540c);
            this.f538a.draw(canvas);
            this.f540c.set(width - this.f539b.right, this.f539b.top, width, height - this.f539b.bottom);
            this.f538a.setBounds(this.f540c);
            this.f538a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f538a != null) {
            this.f538a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f538a != null) {
            this.f538a.setCallback(null);
        }
    }
}
