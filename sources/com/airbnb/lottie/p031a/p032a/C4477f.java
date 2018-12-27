package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C3324i;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C3296p;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.f */
public class C4477f implements C3288d, C3289j, C0921a {
    /* renamed from: a */
    private final Path f18709a = new Path();
    /* renamed from: b */
    private final Paint f18710b = new Paint(1);
    /* renamed from: c */
    private final C4500a f18711c;
    /* renamed from: d */
    private final String f18712d;
    /* renamed from: e */
    private final List<C3290l> f18713e = new ArrayList();
    /* renamed from: f */
    private final C0922a<Integer, Integer> f18714f;
    /* renamed from: g */
    private final C0922a<Integer, Integer> f18715g;
    /* renamed from: h */
    private C0922a<ColorFilter, ColorFilter> f18716h;
    /* renamed from: i */
    private final C0966f f18717i;

    public C4477f(C0966f c0966f, C4500a c4500a, C3324i c3324i) {
        this.f18711c = c4500a;
        this.f18712d = c3324i.m17102a();
        this.f18717i = c0966f;
        if (c3324i.m17103b() != null) {
            if (c3324i.m17104c() != null) {
                this.f18709a.setFillType(c3324i.m17105d());
                this.f18714f = c3324i.m17103b().mo877a();
                this.f18714f.m3989a((C0921a) this);
                c4500a.m24890a(this.f18714f);
                this.f18715g = c3324i.m17104c().mo877a();
                this.f18715g.m3989a((C0921a) this);
                c4500a.m24890a(this.f18715g);
                return;
            }
        }
        this.f18714f = null;
        this.f18715g = null;
    }

    /* renamed from: a */
    public void mo866a() {
        this.f18717i.invalidateSelf();
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (list = null; list < list2.size(); list++) {
            C0917b c0917b = (C0917b) list2.get(list);
            if (c0917b instanceof C3290l) {
                this.f18713e.add((C3290l) c0917b);
            }
        }
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18712d;
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        C0949c.m4078c("FillContent#draw");
        this.f18710b.setColor(((Integer) this.f18714f.mo871e()).intValue());
        int i2 = 0;
        this.f18710b.setAlpha(C0953e.m4094a((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f18715g.mo871e()).intValue())) / 1120403456) * 1132396544), 0, 255));
        if (this.f18716h != 0) {
            this.f18710b.setColorFilter((ColorFilter) this.f18716h.mo871e());
        }
        this.f18709a.reset();
        while (i2 < this.f18713e.size()) {
            this.f18709a.addPath(((C3290l) this.f18713e.get(i2)).mo3887e(), matrix);
            i2++;
        }
        canvas.drawPath(this.f18709a, this.f18710b);
        C0949c.m4079d("FillContent#draw");
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        this.f18709a.reset();
        for (int i = 0; i < this.f18713e.size(); i++) {
            this.f18709a.addPath(((C3290l) this.f18713e.get(i)).mo3887e(), matrix);
        }
        this.f18709a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (t == C0969i.f3211a) {
            this.f18714f.m3990a((C0961c) c0961c);
        } else if (t == C0969i.f3214d) {
            this.f18715g.m3990a((C0961c) c0961c);
        } else if (t != C0969i.f3234x) {
        } else {
            if (c0961c == null) {
                this.f18716h = null;
                return;
            }
            this.f18716h = new C3296p(c0961c);
            this.f18716h.m3989a((C0921a) this);
            this.f18711c.m24890a(this.f18716h);
        }
    }
}
