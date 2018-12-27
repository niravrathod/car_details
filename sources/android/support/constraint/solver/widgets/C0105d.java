package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.d */
public class C0105d {
    /* renamed from: a */
    protected ConstraintWidget f457a;
    /* renamed from: b */
    protected ConstraintWidget f458b;
    /* renamed from: c */
    protected ConstraintWidget f459c;
    /* renamed from: d */
    protected ConstraintWidget f460d;
    /* renamed from: e */
    protected ConstraintWidget f461e;
    /* renamed from: f */
    protected ConstraintWidget f462f;
    /* renamed from: g */
    protected ConstraintWidget f463g;
    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f464h;
    /* renamed from: i */
    protected int f465i;
    /* renamed from: j */
    protected int f466j;
    /* renamed from: k */
    protected float f467k = 0.0f;
    /* renamed from: l */
    protected boolean f468l;
    /* renamed from: m */
    protected boolean f469m;
    /* renamed from: n */
    protected boolean f470n;
    /* renamed from: o */
    private int f471o;
    /* renamed from: p */
    private boolean f472p = false;
    /* renamed from: q */
    private boolean f473q;

    public C0105d(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f457a = constraintWidget;
        this.f471o = i;
        this.f472p = z;
    }

    /* renamed from: a */
    private static boolean m410a(ConstraintWidget constraintWidget, int i) {
        return (constraintWidget.m372l() != 8 && constraintWidget.f408C[i] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.f437g[i] == 0 || constraintWidget.f437g[i] == 3)) ? true : null;
    }

    /* renamed from: b */
    private void m411b() {
        int i = this.f471o * 2;
        ConstraintWidget constraintWidget = this.f457a;
        ConstraintWidget constraintWidget2 = this.f457a;
        ConstraintWidget constraintWidget3 = this.f457a;
        boolean z = false;
        ConstraintWidget constraintWidget4 = constraintWidget;
        Object obj = null;
        while (obj == null) {
            this.f465i++;
            ConstraintWidget constraintWidget5 = null;
            constraintWidget2.af[this.f471o] = null;
            constraintWidget2.ae[this.f471o] = null;
            if (constraintWidget2.m372l() != 8) {
                if (this.f458b == null) {
                    this.f458b = constraintWidget2;
                }
                this.f460d = constraintWidget2;
                if (constraintWidget2.f408C[this.f471o] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget2.f437g[this.f471o] == 0 || constraintWidget2.f437g[this.f471o] == 3 || constraintWidget2.f437g[this.f471o] == 2)) {
                    this.f466j++;
                    float f = constraintWidget2.ad[this.f471o];
                    if (f > 0.0f) {
                        this.f467k += constraintWidget2.ad[this.f471o];
                    }
                    if (C0105d.m410a(constraintWidget2, this.f471o)) {
                        if (f < 0.0f) {
                            this.f468l = true;
                        } else {
                            this.f469m = true;
                        }
                        if (this.f464h == null) {
                            this.f464h = new ArrayList();
                        }
                        this.f464h.add(constraintWidget2);
                    }
                    if (this.f462f == null) {
                        this.f462f = constraintWidget2;
                    }
                    if (this.f463g != null) {
                        this.f463g.ae[this.f471o] = constraintWidget2;
                    }
                    this.f463g = constraintWidget2;
                }
            }
            if (constraintWidget4 != constraintWidget2) {
                constraintWidget4.af[this.f471o] = constraintWidget2;
            }
            ConstraintAnchor constraintAnchor = constraintWidget2.f406A[i + 1].f390c;
            if (constraintAnchor != null) {
                constraintWidget4 = constraintAnchor.f388a;
                if (constraintWidget4.f406A[i].f390c != null) {
                    if (constraintWidget4.f406A[i].f390c.f388a == constraintWidget2) {
                        constraintWidget5 = constraintWidget4;
                    }
                }
            }
            if (constraintWidget5 == null) {
                constraintWidget5 = constraintWidget2;
                obj = 1;
            }
            constraintWidget4 = constraintWidget2;
            constraintWidget2 = constraintWidget5;
        }
        this.f459c = constraintWidget2;
        if (this.f471o == 0 && this.f472p) {
            this.f461e = this.f459c;
        } else {
            this.f461e = this.f457a;
        }
        if (this.f469m && this.f468l) {
            z = true;
        }
        this.f470n = z;
    }

    /* renamed from: a */
    public void m412a() {
        if (!this.f473q) {
            m411b();
        }
        this.f473q = true;
    }
}
