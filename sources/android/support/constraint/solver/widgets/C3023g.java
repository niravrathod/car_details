package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.g */
public class C3023g extends ConstraintWidget {
    protected float ai = -1.0f;
    protected int aj = -1;
    protected int ak = -1;
    private ConstraintAnchor al = this.t;
    private int am;
    private boolean an;
    private int ao;
    private C0109j ap;
    private int aq;

    /* renamed from: a */
    public boolean mo44a() {
        return true;
    }

    public C3023g() {
        int i = 0;
        this.am = 0;
        this.an = false;
        this.ao = 0;
        this.ap = new C0109j();
        this.aq = 8;
        this.B.clear();
        this.B.add(this.al);
        int length = this.A.length;
        while (i < length) {
            this.A[i] = this.al;
            i++;
        }
    }

    /* renamed from: a */
    public void mo42a(int i) {
        if (this.am != i) {
            this.am = i;
            this.B.clear();
            if (this.am == 1) {
                this.al = this.s;
            } else {
                this.al = this.t;
            }
            this.B.add(this.al);
            i = this.A.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.A[i2] = this.al;
            }
        }
    }

    /* renamed from: J */
    public int mo40J() {
        return this.am;
    }

    /* renamed from: a */
    public ConstraintAnchor mo41a(Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.am == 1) {
                    return this.al;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.am == 0) {
                    return this.al;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            default:
                break;
        }
        throw new AssertionError(type.name());
    }

    /* renamed from: C */
    public ArrayList<ConstraintAnchor> mo39C() {
        return this.B;
    }

    /* renamed from: e */
    public void m14796e(float f) {
        if (f > -1.0f) {
            this.ai = f;
            this.aj = -1;
            this.ak = -1;
        }
    }

    /* renamed from: u */
    public void m14797u(int i) {
        if (i > -1) {
            this.ai = -1.0f;
            this.aj = i;
            this.ak = -1;
        }
    }

    /* renamed from: v */
    public void m14798v(int i) {
        if (i > -1) {
            this.ai = -1.0f;
            this.aj = -1;
            this.ak = i;
        }
    }

    /* renamed from: b */
    public void mo45b(int i) {
        i = m370k();
        if (i != 0) {
            int i2;
            if (mo40J() == 1) {
                this.t.m296a().m14803a(1, i.f450t.m296a(), 0);
                this.v.m296a().m14803a(1, i.f450t.m296a(), 0);
                if (this.aj != -1) {
                    this.s.m296a().m14803a(1, i.f449s.m296a(), this.aj);
                    this.u.m296a().m14803a(1, i.f449s.m296a(), this.aj);
                } else if (this.ak != -1) {
                    this.s.m296a().m14803a(1, i.f451u.m296a(), -this.ak);
                    this.u.m296a().m14803a(1, i.f451u.m296a(), -this.ak);
                } else if (this.ai != -1.0f && i.m318F() == DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) i.f410E) * this.ai);
                    this.s.m296a().m14803a(1, i.f449s.m296a(), i2);
                    this.u.m296a().m14803a(1, i.f449s.m296a(), i2);
                }
            } else {
                this.s.m296a().m14803a(1, i.f449s.m296a(), 0);
                this.u.m296a().m14803a(1, i.f449s.m296a(), 0);
                if (this.aj != -1) {
                    this.t.m296a().m14803a(1, i.f450t.m296a(), this.aj);
                    this.v.m296a().m14803a(1, i.f450t.m296a(), this.aj);
                } else if (this.ak != -1) {
                    this.t.m296a().m14803a(1, i.f452v.m296a(), -this.ak);
                    this.v.m296a().m14803a(1, i.f452v.m296a(), -this.ak);
                } else if (this.ai != -1.0f && i.m319G() == DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) i.f411F) * this.ai);
                    this.t.m296a().m14803a(1, i.f450t.m296a(), i2);
                    this.v.m296a().m14803a(1, i.f450t.m296a(), i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo43a(C0097e c0097e) {
        C4403e c4403e = (C4403e) m370k();
        if (c4403e != null) {
            Object a = c4403e.mo41a(Type.LEFT);
            Object a2 = c4403e.mo41a(Type.RIGHT);
            Object obj = (this.D == null || this.D.f408C[0] != DimensionBehaviour.WRAP_CONTENT) ? null : 1;
            if (this.am == 0) {
                a = c4403e.mo41a(Type.TOP);
                a2 = c4403e.mo41a(Type.BOTTOM);
                obj = (this.D == null || this.D.f408C[1] != DimensionBehaviour.WRAP_CONTENT) ? null : 1;
            }
            SolverVariable a3;
            if (this.aj != -1) {
                a3 = c0097e.m273a(this.al);
                c0097e.m288c(a3, c0097e.m273a(a), this.aj, 6);
                if (obj != null) {
                    c0097e.m276a(c0097e.m273a(a2), a3, 0, 5);
                }
            } else if (this.ak != -1) {
                a3 = c0097e.m273a(this.al);
                SolverVariable a4 = c0097e.m273a(a2);
                c0097e.m288c(a3, a4, -this.ak, 6);
                if (obj != null) {
                    c0097e.m276a(a3, c0097e.m273a(a), 0, 5);
                    c0097e.m276a(a4, a3, 0, 5);
                }
            } else if (this.ai != -1.0f) {
                c0097e.m279a(C0097e.m263a(c0097e, c0097e.m273a(this.al), c0097e.m273a(a), c0097e.m273a(a2), this.ai, this.an));
            }
        }
    }

    /* renamed from: c */
    public void mo46c(C0097e c0097e) {
        if (m370k() != null) {
            c0097e = c0097e.m283b(this.al);
            if (this.am == 1) {
                m364h(c0097e);
                m367i(0);
                m371k(m370k().m384r());
                m369j(0);
            } else {
                m364h(0);
                m367i(c0097e);
                m369j(m370k().m380p());
                m371k(0);
            }
        }
    }
}
