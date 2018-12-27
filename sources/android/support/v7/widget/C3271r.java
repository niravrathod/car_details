package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.an.C0841a;

/* renamed from: android.support.v7.widget.r */
class C3271r implements C0869t {
    /* renamed from: a */
    private final RectF f13985a = new RectF();

    /* renamed from: android.support.v7.widget.r$1 */
    class C32701 implements C0841a {
        /* renamed from: a */
        final /* synthetic */ C3271r f13984a;

        C32701(C3271r c3271r) {
            this.f13984a = c3271r;
        }

        /* renamed from: a */
        public void mo832a(Canvas canvas, RectF rectF, float f, Paint paint) {
            C32701 c32701 = this;
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                c32701.f13984a.f13985a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                canvas.drawArc(c32701.f13984a.f13985a, 180.0f, 90.0f, true, paint);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                Paint paint2 = paint;
                canvas.drawArc(c32701.f13984a.f13985a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c32701.f13984a.f13985a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c32701.f13984a.f13985a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint);
                canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    /* renamed from: g */
    public void mo845g(C0868s c0868s) {
    }

    C3271r() {
    }

    /* renamed from: a */
    public void mo834a() {
        an.f2800a = new C32701(this);
    }

    /* renamed from: a */
    public void mo836a(C0868s c0868s, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        context = m16870a(context, colorStateList, f, f2, f3);
        context.m3513a(c0868s.mo660b());
        c0868s.mo658a(context);
        mo844f(c0868s);
    }

    /* renamed from: a */
    private an m16870a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new an(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: f */
    public void mo844f(C0868s c0868s) {
        Rect rect = new Rect();
        m16871j(c0868s).m3512a(rect);
        c0868s.mo656a((int) Math.ceil((double) mo838b(c0868s)), (int) Math.ceil((double) mo840c(c0868s)));
        c0868s.mo657a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public void mo846h(C0868s c0868s) {
        m16871j(c0868s).m3513a(c0868s.mo660b());
        mo844f(c0868s);
    }

    /* renamed from: a */
    public void mo837a(C0868s c0868s, ColorStateList colorStateList) {
        m16871j(c0868s).m3511a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo847i(C0868s c0868s) {
        return m16871j(c0868s).m3520f();
    }

    /* renamed from: a */
    public void mo835a(C0868s c0868s, float f) {
        m16871j(c0868s).m3510a(f);
        mo844f(c0868s);
    }

    /* renamed from: d */
    public float mo842d(C0868s c0868s) {
        return m16871j(c0868s).m3509a();
    }

    /* renamed from: c */
    public void mo841c(C0868s c0868s, float f) {
        m16871j(c0868s).m3515b(f);
    }

    /* renamed from: e */
    public float mo843e(C0868s c0868s) {
        return m16871j(c0868s).m3514b();
    }

    /* renamed from: b */
    public void mo839b(C0868s c0868s, float f) {
        m16871j(c0868s).m3517c(f);
        mo844f(c0868s);
    }

    /* renamed from: a */
    public float mo833a(C0868s c0868s) {
        return m16871j(c0868s).m3516c();
    }

    /* renamed from: b */
    public float mo838b(C0868s c0868s) {
        return m16871j(c0868s).m3518d();
    }

    /* renamed from: c */
    public float mo840c(C0868s c0868s) {
        return m16871j(c0868s).m3519e();
    }

    /* renamed from: j */
    private an m16871j(C0868s c0868s) {
        return (an) c0868s.mo661c();
    }
}
