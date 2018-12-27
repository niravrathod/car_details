package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.C0969i;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.content.C3323g;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p033b.C0922a;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C0924o;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.a.a.o */
public class C4482o implements C3288d, C0918i, C3289j, C3290l, C0921a {
    /* renamed from: a */
    private final Matrix f18763a = new Matrix();
    /* renamed from: b */
    private final Path f18764b = new Path();
    /* renamed from: c */
    private final C0966f f18765c;
    /* renamed from: d */
    private final C4500a f18766d;
    /* renamed from: e */
    private final String f18767e;
    /* renamed from: f */
    private final C0922a<Float, Float> f18768f;
    /* renamed from: g */
    private final C0922a<Float, Float> f18769g;
    /* renamed from: h */
    private final C0924o f18770h;
    /* renamed from: i */
    private C4475c f18771i;

    public C4482o(C0966f c0966f, C4500a c4500a, C3323g c3323g) {
        this.f18765c = c0966f;
        this.f18766d = c4500a;
        this.f18767e = c3323g.m17097a();
        this.f18768f = c3323g.m17098b().mo877a();
        c4500a.m24890a(this.f18768f);
        this.f18768f.m3989a((C0921a) this);
        this.f18769g = c3323g.m17099c().mo877a();
        c4500a.m24890a(this.f18769g);
        this.f18769g.m3989a((C0921a) this);
        this.f18770h = c3323g.m17100d().m17035h();
        this.f18770h.m4002a(c4500a);
        this.f18770h.m4001a((C0921a) this);
    }

    /* renamed from: a */
    public void mo3888a(ListIterator<C0917b> listIterator) {
        if (this.f18771i == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            List arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f18771i = new C4475c(this.f18765c, this.f18766d, "Repeater", arrayList, null);
        }
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18767e;
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        this.f18771i.mo867a((List) list, (List) list2);
    }

    /* renamed from: e */
    public Path mo3887e() {
        Path e = this.f18771i.mo3887e();
        this.f18764b.reset();
        float floatValue = ((Float) this.f18768f.mo871e()).floatValue();
        float floatValue2 = ((Float) this.f18769g.mo871e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f18763a.set(this.f18770h.m4004b(((float) i) + floatValue2));
            this.f18764b.addPath(e, this.f18763a);
        }
        return this.f18764b;
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f18768f.mo871e()).floatValue();
        float floatValue2 = ((Float) this.f18769g.mo871e()).floatValue();
        float floatValue3 = ((Float) this.f18770h.m4005b().mo871e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f18770h.m4006c().mo871e()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f18763a.set(matrix);
            float f = (float) i2;
            this.f18763a.preConcat(this.f18770h.m4004b(f + floatValue2));
            this.f18771i.mo3883a(canvas, this.f18763a, (int) (((float) i) * C0953e.m4090a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        this.f18771i.mo3884a(rectF, matrix);
    }

    /* renamed from: a */
    public void mo866a() {
        this.f18765c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        C0953e.m4097a(c0989e, i, list, c0989e2, this);
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (!this.f18770h.m4003a(t, c0961c)) {
            if (t == C0969i.f3223m) {
                this.f18768f.m3990a((C0961c) c0961c);
            } else if (t == C0969i.f3224n) {
                this.f18769g.m3990a((C0961c) c0961c);
            }
        }
    }
}
