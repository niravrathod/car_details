package com.airbnb.lottie.p031a.p032a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.C0990f;
import com.airbnb.lottie.model.content.C0985b;
import com.airbnb.lottie.model.content.C3325j;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.model.p038a.C3317l;
import com.airbnb.lottie.p031a.p033b.C0922a.C0921a;
import com.airbnb.lottie.p031a.p033b.C0924o;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.c */
public class C4475c implements C3288d, C3290l, C0921a, C0990f {
    /* renamed from: a */
    private final Matrix f18693a;
    /* renamed from: b */
    private final Path f18694b;
    /* renamed from: c */
    private final RectF f18695c;
    /* renamed from: d */
    private final String f18696d;
    /* renamed from: e */
    private final List<C0917b> f18697e;
    /* renamed from: f */
    private final C0966f f18698f;
    /* renamed from: g */
    private List<C3290l> f18699g;
    /* renamed from: h */
    private C0924o f18700h;

    /* renamed from: a */
    private static List<C0917b> m24777a(C0966f c0966f, C4500a c4500a, List<C0985b> list) {
        List<C0917b> arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C0917b a = ((C0985b) list.get(i)).mo878a(c0966f, c4500a);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static C3317l m24776a(List<C0985b> list) {
        for (int i = 0; i < list.size(); i++) {
            C0985b c0985b = (C0985b) list.get(i);
            if (c0985b instanceof C3317l) {
                return (C3317l) c0985b;
            }
        }
        return null;
    }

    public C4475c(C0966f c0966f, C4500a c4500a, C3325j c3325j) {
        this(c0966f, c4500a, c3325j.m17107a(), C4475c.m24777a(c0966f, c4500a, c3325j.m17108b()), C4475c.m24776a(c3325j.m17108b()));
    }

    C4475c(C0966f c0966f, C4500a c4500a, String str, List<C0917b> list, C3317l c3317l) {
        this.f18693a = new Matrix();
        this.f18694b = new Path();
        this.f18695c = new RectF();
        this.f18696d = str;
        this.f18698f = c0966f;
        this.f18697e = list;
        if (c3317l != null) {
            this.f18700h = c3317l.m17035h();
            this.f18700h.m4002a(c4500a);
            this.f18700h.m4001a((C0921a) this);
        }
        c0966f = new ArrayList();
        for (c4500a = list.size() - 1; c4500a >= null; c4500a--) {
            C0917b c0917b = (C0917b) list.get(c4500a);
            if ((c0917b instanceof C0918i) != null) {
                c0966f.add((C0918i) c0917b);
            }
        }
        for (c4500a = c0966f.size() - 1; c4500a >= null; c4500a--) {
            ((C0918i) c0966f.get(c4500a)).mo3888a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    public void mo866a() {
        this.f18698f.invalidateSelf();
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18696d;
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        list2 = new ArrayList(list.size() + this.f18697e.size());
        list2.addAll(list);
        for (list = this.f18697e.size() - 1; list >= null; list--) {
            C0917b c0917b = (C0917b) this.f18697e.get(list);
            c0917b.mo867a(list2, this.f18697e.subList(0, list));
            list2.add(c0917b);
        }
    }

    /* renamed from: c */
    List<C3290l> m24785c() {
        if (this.f18699g == null) {
            this.f18699g = new ArrayList();
            for (int i = 0; i < this.f18697e.size(); i++) {
                C0917b c0917b = (C0917b) this.f18697e.get(i);
                if (c0917b instanceof C3290l) {
                    this.f18699g.add((C3290l) c0917b);
                }
            }
        }
        return this.f18699g;
    }

    /* renamed from: d */
    Matrix m24786d() {
        if (this.f18700h != null) {
            return this.f18700h.m4007d();
        }
        this.f18693a.reset();
        return this.f18693a;
    }

    /* renamed from: e */
    public Path mo3887e() {
        this.f18693a.reset();
        if (this.f18700h != null) {
            this.f18693a.set(this.f18700h.m4007d());
        }
        this.f18694b.reset();
        for (int size = this.f18697e.size() - 1; size >= 0; size--) {
            C0917b c0917b = (C0917b) this.f18697e.get(size);
            if (c0917b instanceof C3290l) {
                this.f18694b.addPath(((C3290l) c0917b).mo3887e(), this.f18693a);
            }
        }
        return this.f18694b;
    }

    /* renamed from: a */
    public void mo3883a(Canvas canvas, Matrix matrix, int i) {
        this.f18693a.set(matrix);
        if (this.f18700h != null) {
            this.f18693a.preConcat(this.f18700h.m4007d());
            i = (int) ((((((float) ((Integer) this.f18700h.m3999a().mo871e()).intValue()) / 100.0f) * ((float) i)) / 1132396544) * 1132396544);
        }
        for (matrix = this.f18697e.size() - 1; matrix >= null; matrix--) {
            Object obj = this.f18697e.get(matrix);
            if (obj instanceof C3288d) {
                ((C3288d) obj).mo3883a(canvas, this.f18693a, i);
            }
        }
    }

    /* renamed from: a */
    public void mo3884a(RectF rectF, Matrix matrix) {
        this.f18693a.set(matrix);
        if (this.f18700h != null) {
            this.f18693a.preConcat(this.f18700h.m4007d());
        }
        this.f18695c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (matrix = this.f18697e.size() - 1; matrix >= null; matrix--) {
            C0917b c0917b = (C0917b) this.f18697e.get(matrix);
            if (c0917b instanceof C3288d) {
                ((C3288d) c0917b).mo3884a(this.f18695c, this.f18693a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f18695c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f18695c.left), Math.min(rectF.top, this.f18695c.top), Math.max(rectF.right, this.f18695c.right), Math.max(rectF.bottom, this.f18695c.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3885a(C0989e c0989e, int i, List<C0989e> list, C0989e c0989e2) {
        if (c0989e.m4269a(mo868b(), i)) {
            if (!"__container".equals(mo868b())) {
                c0989e2 = c0989e2.m4267a(mo868b());
                if (c0989e.m4271c(mo868b(), i)) {
                    list.add(c0989e2.m4266a((C0990f) this));
                }
            }
            if (c0989e.m4272d(mo868b(), i)) {
                i += c0989e.m4270b(mo868b(), i);
                for (int i2 = 0; i2 < this.f18697e.size(); i2++) {
                    C0917b c0917b = (C0917b) this.f18697e.get(i2);
                    if (c0917b instanceof C0990f) {
                        ((C0990f) c0917b).mo3885a(c0989e, i, list, c0989e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T> void mo3886a(T t, C0961c<T> c0961c) {
        if (this.f18700h != null) {
            this.f18700h.m4003a(t, c0961c);
        }
    }
}
