package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.n */
public class C0112n {
    /* renamed from: a */
    private int f494a;
    /* renamed from: b */
    private int f495b;
    /* renamed from: c */
    private int f496c;
    /* renamed from: d */
    private int f497d;
    /* renamed from: e */
    private ArrayList<C0111a> f498e = new ArrayList();

    /* renamed from: android.support.constraint.solver.widgets.n$a */
    static class C0111a {
        /* renamed from: a */
        private ConstraintAnchor f489a;
        /* renamed from: b */
        private ConstraintAnchor f490b;
        /* renamed from: c */
        private int f491c;
        /* renamed from: d */
        private Strength f492d;
        /* renamed from: e */
        private int f493e;

        public C0111a(ConstraintAnchor constraintAnchor) {
            this.f489a = constraintAnchor;
            this.f490b = constraintAnchor.m306g();
            this.f491c = constraintAnchor.m304e();
            this.f492d = constraintAnchor.m305f();
            this.f493e = constraintAnchor.m307h();
        }

        /* renamed from: a */
        public void m431a(ConstraintWidget constraintWidget) {
            this.f489a = constraintWidget.mo41a(this.f489a.m303d());
            if (this.f489a != null) {
                this.f490b = this.f489a.m306g();
                this.f491c = this.f489a.m304e();
                this.f492d = this.f489a.m305f();
                this.f493e = this.f489a.m307h();
                return;
            }
            this.f490b = null;
            this.f491c = 0;
            this.f492d = Strength.STRONG;
            this.f493e = 0;
        }

        /* renamed from: b */
        public void m432b(ConstraintWidget constraintWidget) {
            constraintWidget.mo41a(this.f489a.m303d()).m300a(this.f490b, this.f491c, this.f492d, this.f493e);
        }
    }

    public C0112n(ConstraintWidget constraintWidget) {
        this.f494a = constraintWidget.m376n();
        this.f495b = constraintWidget.m378o();
        this.f496c = constraintWidget.m380p();
        this.f497d = constraintWidget.m384r();
        constraintWidget = constraintWidget.mo39C();
        int size = constraintWidget.size();
        for (int i = 0; i < size; i++) {
            this.f498e.add(new C0111a((ConstraintAnchor) constraintWidget.get(i)));
        }
    }

    /* renamed from: a */
    public void m433a(ConstraintWidget constraintWidget) {
        this.f494a = constraintWidget.m376n();
        this.f495b = constraintWidget.m378o();
        this.f496c = constraintWidget.m380p();
        this.f497d = constraintWidget.m384r();
        int size = this.f498e.size();
        for (int i = 0; i < size; i++) {
            ((C0111a) this.f498e.get(i)).m431a(constraintWidget);
        }
    }

    /* renamed from: b */
    public void m434b(ConstraintWidget constraintWidget) {
        constraintWidget.m364h(this.f494a);
        constraintWidget.m367i(this.f495b);
        constraintWidget.m369j(this.f496c);
        constraintWidget.m371k(this.f497d);
        int size = this.f498e.size();
        for (int i = 0; i < size; i++) {
            ((C0111a) this.f498e.get(i)).m432b(constraintWidget);
        }
    }
}
