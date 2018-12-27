package com.airbnb.lottie.p031a.p032a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.a.a.k */
public class C4479k implements C0918i, C3290l {
    /* renamed from: a */
    private final Path f18735a = new Path();
    /* renamed from: b */
    private final Path f18736b = new Path();
    /* renamed from: c */
    private final Path f18737c = new Path();
    /* renamed from: d */
    private final String f18738d;
    /* renamed from: e */
    private final List<C3290l> f18739e = new ArrayList();
    /* renamed from: f */
    private final MergePaths f18740f;

    public C4479k(MergePaths mergePaths) {
        if (VERSION.SDK_INT >= 19) {
            this.f18738d = mergePaths.m17037a();
            this.f18740f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: a */
    public void mo3888a(ListIterator<C0917b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            C0917b c0917b = (C0917b) listIterator.previous();
            if (c0917b instanceof C3290l) {
                this.f18739e.add((C3290l) c0917b);
                listIterator.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo867a(List<C0917b> list, List<C0917b> list2) {
        for (int i = 0; i < this.f18739e.size(); i++) {
            ((C3290l) this.f18739e.get(i)).mo867a(list, list2);
        }
    }

    /* renamed from: e */
    public Path mo3887e() {
        this.f18737c.reset();
        switch (this.f18740f.m17038b()) {
            case Merge:
                m24812a();
                break;
            case Add:
                m24813a(Op.UNION);
                break;
            case Subtract:
                m24813a(Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                m24813a(Op.INTERSECT);
                break;
            case ExcludeIntersections:
                m24813a(Op.XOR);
                break;
            default:
                break;
        }
        return this.f18737c;
    }

    /* renamed from: b */
    public String mo868b() {
        return this.f18738d;
    }

    /* renamed from: a */
    private void m24812a() {
        for (int i = 0; i < this.f18739e.size(); i++) {
            this.f18737c.addPath(((C3290l) this.f18739e.get(i)).mo3887e());
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m24813a(Op op) {
        this.f18736b.reset();
        this.f18735a.reset();
        for (int size = this.f18739e.size() - 1; size >= 1; size--) {
            C3290l c3290l = (C3290l) this.f18739e.get(size);
            if (c3290l instanceof C4475c) {
                C4475c c4475c = (C4475c) c3290l;
                List c = c4475c.m24785c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = ((C3290l) c.get(size2)).mo3887e();
                    e.transform(c4475c.m24786d());
                    this.f18736b.addPath(e);
                }
            } else {
                this.f18736b.addPath(c3290l.mo3887e());
            }
        }
        int i = 0;
        C3290l c3290l2 = (C3290l) this.f18739e.get(0);
        if (c3290l2 instanceof C4475c) {
            C4475c c4475c2 = (C4475c) c3290l2;
            List c2 = c4475c2.m24785c();
            while (i < c2.size()) {
                Path e2 = ((C3290l) c2.get(i)).mo3887e();
                e2.transform(c4475c2.m24786d());
                this.f18735a.addPath(e2);
                i++;
            }
        } else {
            this.f18735a.set(c3290l2.mo3887e());
        }
        this.f18737c.op(this.f18735a, this.f18736b, op);
    }
}
