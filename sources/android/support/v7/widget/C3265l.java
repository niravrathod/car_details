package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.l */
class C3265l extends C0865k {
    /* renamed from: a */
    private final SeekBar f13973a;
    /* renamed from: b */
    private Drawable f13974b;
    /* renamed from: c */
    private ColorStateList f13975c = null;
    /* renamed from: d */
    private Mode f13976d = null;
    /* renamed from: e */
    private boolean f13977e = false;
    /* renamed from: f */
    private boolean f13978f = false;

    C3265l(SeekBar seekBar) {
        super(seekBar);
        this.f13973a = seekBar;
    }

    /* renamed from: a */
    void mo826a(AttributeSet attributeSet, int i) {
        super.mo826a(attributeSet, i);
        attributeSet = ay.m3543a(this.f13973a.getContext(), attributeSet, C0636j.AppCompatSeekBar, i, 0);
        i = attributeSet.m3551b(C0636j.AppCompatSeekBar_android_thumb);
        if (i != 0) {
            this.f13973a.setThumb(i);
        }
        mo825a(attributeSet.m3547a(C0636j.AppCompatSeekBar_tickMark));
        if (attributeSet.m3561g(C0636j.AppCompatSeekBar_tickMarkTintMode) != 0) {
            this.f13976d = C0885y.m3861a(attributeSet.m3545a(C0636j.AppCompatSeekBar_tickMarkTintMode, -1), this.f13976d);
            this.f13978f = true;
        }
        if (attributeSet.m3561g(C0636j.AppCompatSeekBar_tickMarkTint) != 0) {
            this.f13975c = attributeSet.m3557e(C0636j.AppCompatSeekBar_tickMarkTint);
            this.f13977e = true;
        }
        attributeSet.m3548a();
        m16841d();
    }

    /* renamed from: a */
    void mo825a(Drawable drawable) {
        if (this.f13974b != null) {
            this.f13974b.setCallback(null);
        }
        this.f13974b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f13973a);
            C0295a.m1056b(drawable, C0560r.m2193e(this.f13973a));
            if (drawable.isStateful()) {
                drawable.setState(this.f13973a.getDrawableState());
            }
            m16841d();
        }
        this.f13973a.invalidate();
    }

    /* renamed from: d */
    private void m16841d() {
        if (this.f13974b == null) {
            return;
        }
        if (this.f13977e || this.f13978f) {
            this.f13974b = C0295a.m1061g(this.f13974b.mutate());
            if (this.f13977e) {
                C0295a.m1050a(this.f13974b, this.f13975c);
            }
            if (this.f13978f) {
                C0295a.m1053a(this.f13974b, this.f13976d);
            }
            if (this.f13974b.isStateful()) {
                this.f13974b.setState(this.f13973a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    void mo827b() {
        if (this.f13974b != null) {
            this.f13974b.jumpToCurrentState();
        }
    }

    /* renamed from: c */
    void m16846c() {
        Drawable drawable = this.f13974b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f13973a.getDrawableState())) {
            this.f13973a.invalidateDrawable(drawable);
        }
    }

    /* renamed from: a */
    void m16842a(Canvas canvas) {
        if (this.f13974b != null) {
            int max = this.f13973a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13974b.getIntrinsicWidth();
                int intrinsicHeight = this.f13974b.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f13974b.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((this.f13973a.getWidth() - this.f13973a.getPaddingLeft()) - this.f13973a.getPaddingRight())) / ((float) max);
                intrinsicWidth = canvas.save();
                canvas.translate((float) this.f13973a.getPaddingLeft(), (float) (this.f13973a.getHeight() / 2));
                for (intrinsicHeight = 0; intrinsicHeight <= max; intrinsicHeight++) {
                    this.f13974b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicWidth);
            }
        }
    }
}
