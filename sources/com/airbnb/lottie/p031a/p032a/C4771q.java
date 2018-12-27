package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p037e.C0961c;

/* renamed from: com.airbnb.lottie.a.a.q */
public class C4771q extends C4474a {
    /* renamed from: b */
    private final C4500a f20864b;
    /* renamed from: c */
    private final String f20865c;
    /* renamed from: d */
    private final C0922a<Integer, Integer> f20866d;
    /* renamed from: e */
    private C0922a<ColorFilter, ColorFilter> f20867e;

    public C4771q(C0966f c0966f, C4500a c4500a, ShapeStroke shapeStroke) {
        super(c0966f, c4500a, shapeStroke.m17056g().m4248a(), shapeStroke.m17057h().m4249a(), shapeStroke.m17058i(), shapeStroke.m17052c(), shapeStroke.m17053d(), shapeStroke.m17054e(), shapeStroke.m17055f());
        this.f20864b = c4500a;
        this.f20865c = shapeStroke.m17050a();
        this.f20866d = shapeStroke.m17051b().mo877a();
        this.f20866d.m3989a((C0921a) this);
        c4500a.m24890a(this.f20866d);
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        this.a.setColor(((Integer) this.f20866d.mo871e()).intValue());
        if (this.f20867e != null) {
            this.a.setColorFilter((ColorFilter) this.f20867e.mo871e());
        }
        super.mo3883a(canvas, matrix, i);
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f20865c;
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        super.mo3886a((Object) t, (C0961c) c0961c);
        if (t == C0969i.f3212b) {
            this.f20866d.m3990a((C0961c) c0961c);
        } else if (t != C0969i.f3234x) {
        } else {
            if (c0961c == null) {
                this.f20867e = null;
                return;
            }
            this.f20867e = new C3296p(c0961c);
            this.f20867e.m3989a((C0921a) this);
            this.f20864b.m24890a(this.f20866d);
        }
    }
}
