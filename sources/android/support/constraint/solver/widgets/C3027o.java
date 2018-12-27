package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0095c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.o */
public class C3027o extends ConstraintWidget {
    protected ArrayList<ConstraintWidget> az = new ArrayList();

    /* renamed from: f */
    public void mo52f() {
        this.az.clear();
        super.mo52f();
    }

    /* renamed from: b */
    public void m14823b(ConstraintWidget constraintWidget) {
        this.az.add(constraintWidget);
        if (constraintWidget.m370k() != null) {
            ((C3027o) constraintWidget.m370k()).m14824c(constraintWidget);
        }
        constraintWidget.m332a((ConstraintWidget) this);
    }

    /* renamed from: c */
    public void m14824c(ConstraintWidget constraintWidget) {
        this.az.remove(constraintWidget);
        constraintWidget.m332a(null);
    }

    /* renamed from: T */
    public C4403e m14819T() {
        ConstraintWidget k = m370k();
        C4403e c4403e = this instanceof C4403e ? (C4403e) this : null;
        while (k != null) {
            ConstraintWidget k2 = k.m370k();
            if (k instanceof C4403e) {
                c4403e = (C4403e) k;
            }
            k = k2;
        }
        return c4403e;
    }

    /* renamed from: b */
    public void mo51b(int i, int i2) {
        super.mo51b(i, i2);
        i = this.az.size();
        for (i2 = 0; i2 < i; i2++) {
            ((ConstraintWidget) this.az.get(i2)).mo51b(m391v(), m392w());
        }
    }

    /* renamed from: D */
    public void mo49D() {
        super.mo49D();
        if (this.az != null) {
            int size = this.az.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.az.get(i);
                constraintWidget.mo51b(m388t(), m390u());
                if (!(constraintWidget instanceof C4403e)) {
                    constraintWidget.mo49D();
                }
            }
        }
    }

    /* renamed from: N */
    public void mo3720N() {
        mo49D();
        if (this.az != null) {
            int size = this.az.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.az.get(i);
                if (constraintWidget instanceof C3027o) {
                    ((C3027o) constraintWidget).mo3720N();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo50a(C0095c c0095c) {
        super.mo50a(c0095c);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.az.get(i)).mo50a(c0095c);
        }
    }

    /* renamed from: U */
    public void m14820U() {
        this.az.clear();
    }
}
