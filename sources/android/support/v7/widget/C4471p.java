package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.an.C0841a;

/* renamed from: android.support.v7.widget.p */
class C4471p extends C3271r {

    /* renamed from: android.support.v7.widget.p$1 */
    class C32681 implements C0841a {
        /* renamed from: a */
        final /* synthetic */ C4471p f13983a;

        C32681(C4471p c4471p) {
            this.f13983a = c4471p;
        }

        /* renamed from: a */
        public void mo832a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C4471p() {
    }

    /* renamed from: a */
    public void mo834a() {
        an.f2800a = new C32681(this);
    }
}
