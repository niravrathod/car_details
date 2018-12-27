package android.support.constraint.solver.widgets;

import java.util.Arrays;

/* renamed from: android.support.constraint.solver.widgets.h */
public class C3024h extends ConstraintWidget {
    protected ConstraintWidget[] ai = new ConstraintWidget[4];
    protected int aj = 0;

    /* renamed from: b */
    public void m14800b(ConstraintWidget constraintWidget) {
        if (this.aj + 1 > this.ai.length) {
            this.ai = (ConstraintWidget[]) Arrays.copyOf(this.ai, this.ai.length * 2);
        }
        this.ai[this.aj] = constraintWidget;
        this.aj++;
    }

    /* renamed from: J */
    public void mo40J() {
        this.aj = 0;
    }
}
