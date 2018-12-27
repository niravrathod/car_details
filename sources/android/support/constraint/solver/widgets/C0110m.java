package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.solver.widgets.m */
public class C0110m {
    /* renamed from: h */
    HashSet<C0110m> f487h = new HashSet(2);
    /* renamed from: i */
    int f488i = 0;

    /* renamed from: a */
    public void mo47a() {
    }

    /* renamed from: a */
    public void m426a(C0110m c0110m) {
        this.f487h.add(c0110m);
    }

    /* renamed from: b */
    public void mo48b() {
        this.f488i = 0;
        this.f487h.clear();
    }

    /* renamed from: e */
    public void m428e() {
        this.f488i = 0;
        Iterator it = this.f487h.iterator();
        while (it.hasNext()) {
            ((C0110m) it.next()).m428e();
        }
    }

    /* renamed from: f */
    public void m429f() {
        this.f488i = 1;
        Iterator it = this.f487h.iterator();
        while (it.hasNext()) {
            ((C0110m) it.next()).mo47a();
        }
    }

    /* renamed from: g */
    public boolean m430g() {
        return this.f488i == 1;
    }
}
