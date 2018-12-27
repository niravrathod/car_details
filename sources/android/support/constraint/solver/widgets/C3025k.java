package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;

/* renamed from: android.support.constraint.solver.widgets.k */
public class C3025k extends C0110m {
    /* renamed from: a */
    ConstraintAnchor f12761a;
    /* renamed from: b */
    float f12762b;
    /* renamed from: c */
    C3025k f12763c;
    /* renamed from: d */
    float f12764d;
    /* renamed from: e */
    C3025k f12765e;
    /* renamed from: f */
    float f12766f;
    /* renamed from: g */
    int f12767g = 0;
    /* renamed from: j */
    private C3025k f12768j;
    /* renamed from: k */
    private float f12769k;
    /* renamed from: l */
    private C3026l f12770l = null;
    /* renamed from: m */
    private int f12771m = 1;
    /* renamed from: n */
    private C3026l f12772n = null;
    /* renamed from: o */
    private int f12773o = 1;

    /* renamed from: a */
    String m14801a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public C3025k(ConstraintAnchor constraintAnchor) {
        this.f12761a = constraintAnchor;
    }

    public String toString() {
        StringBuilder stringBuilder;
        if (this.i != 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("{ ");
            stringBuilder.append(this.f12761a);
            stringBuilder.append(" UNRESOLVED} type: ");
            stringBuilder.append(m14801a(this.f12767g));
            return stringBuilder.toString();
        } else if (this.f12765e == this) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f12761a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f12766f);
            stringBuilder.append("]  type: ");
            stringBuilder.append(m14801a(this.f12767g));
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f12761a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f12765e);
            stringBuilder.append(":");
            stringBuilder.append(this.f12766f);
            stringBuilder.append("] type: ");
            stringBuilder.append(m14801a(this.f12767g));
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public void m14805a(C3025k c3025k, float f) {
        if (this.i == 0 || !(this.f12765e == c3025k || this.f12766f == f)) {
            this.f12765e = c3025k;
            this.f12766f = f;
            if (this.i == Float.MIN_VALUE) {
                m428e();
            }
            m429f();
        }
    }

    /* renamed from: a */
    public void mo47a() {
        Object obj = 1;
        if (this.i != 1 && this.f12767g != 4) {
            if (this.f12770l != null) {
                if (this.f12770l.i == 1) {
                    this.f12764d = ((float) this.f12771m) * this.f12770l.f12774a;
                } else {
                    return;
                }
            }
            if (this.f12772n != null) {
                if (this.f12772n.i == 1) {
                    this.f12769k = ((float) this.f12773o) * this.f12772n.f12774a;
                } else {
                    return;
                }
            }
            if (this.f12767g == 1 && (this.f12763c == null || this.f12763c.i == 1)) {
                if (this.f12763c == null) {
                    this.f12765e = this;
                    this.f12766f = this.f12764d;
                } else {
                    this.f12765e = this.f12763c.f12765e;
                    this.f12766f = this.f12763c.f12766f + this.f12764d;
                }
                m429f();
            } else if (this.f12767g == 2 && this.f12763c != null && this.f12763c.i == 1 && this.f12768j != null && this.f12768j.f12763c != null && this.f12768j.f12763c.i == 1) {
                float f;
                float f2;
                int e;
                int e2;
                float f3;
                float f4;
                if (C0097e.m264a() != null) {
                    r0 = C0097e.m264a();
                    r0.f366w++;
                }
                this.f12765e = this.f12763c.f12765e;
                this.f12768j.f12765e = this.f12768j.f12763c.f12765e;
                int i = 0;
                if (this.f12761a.f389b != Type.RIGHT) {
                    if (this.f12761a.f389b != Type.BOTTOM) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    f = this.f12763c.f12766f - this.f12768j.f12763c.f12766f;
                } else {
                    f = this.f12768j.f12763c.f12766f - this.f12763c.f12766f;
                }
                if (this.f12761a.f389b != Type.LEFT) {
                    if (this.f12761a.f389b != Type.RIGHT) {
                        f -= (float) this.f12761a.f388a.m384r();
                        f2 = this.f12761a.f388a.f424T;
                        e = this.f12761a.m304e();
                        e2 = this.f12768j.f12761a.m304e();
                        if (this.f12761a.m306g() != this.f12768j.f12761a.m306g()) {
                            f2 = 0.5f;
                            e2 = 0;
                        } else {
                            i = e;
                        }
                        f3 = (float) i;
                        f4 = (float) e2;
                        f = (f - f3) - f4;
                        if (obj == null) {
                            this.f12768j.f12766f = (this.f12768j.f12763c.f12766f + f4) + (f * f2);
                            this.f12766f = (this.f12763c.f12766f - f3) - (f * (1.0f - f2));
                        } else {
                            this.f12766f = (this.f12763c.f12766f + f3) + (f * f2);
                            this.f12768j.f12766f = (this.f12768j.f12763c.f12766f - f4) - (f * (1.0f - f2));
                        }
                        m429f();
                        this.f12768j.m429f();
                    }
                }
                f -= (float) this.f12761a.f388a.m380p();
                f2 = this.f12761a.f388a.f423S;
                e = this.f12761a.m304e();
                e2 = this.f12768j.f12761a.m304e();
                if (this.f12761a.m306g() != this.f12768j.f12761a.m306g()) {
                    i = e;
                } else {
                    f2 = 0.5f;
                    e2 = 0;
                }
                f3 = (float) i;
                f4 = (float) e2;
                f = (f - f3) - f4;
                if (obj == null) {
                    this.f12766f = (this.f12763c.f12766f + f3) + (f * f2);
                    this.f12768j.f12766f = (this.f12768j.f12763c.f12766f - f4) - (f * (1.0f - f2));
                } else {
                    this.f12768j.f12766f = (this.f12768j.f12763c.f12766f + f4) + (f * f2);
                    this.f12766f = (this.f12763c.f12766f - f3) - (f * (1.0f - f2));
                }
                m429f();
                this.f12768j.m429f();
            } else if (this.f12767g == 3 && this.f12763c != null && this.f12763c.i == 1 && this.f12768j != null && this.f12768j.f12763c != null && this.f12768j.f12763c.i == 1) {
                if (C0097e.m264a() != null) {
                    r0 = C0097e.m264a();
                    r0.f367x++;
                }
                this.f12765e = this.f12763c.f12765e;
                this.f12768j.f12765e = this.f12768j.f12763c.f12765e;
                this.f12766f = this.f12763c.f12766f + this.f12764d;
                this.f12768j.f12766f = this.f12768j.f12763c.f12766f + this.f12768j.f12764d;
                m429f();
                this.f12768j.m429f();
            } else if (this.f12767g == 5) {
                this.f12761a.f388a.mo3719c();
            }
        }
    }

    /* renamed from: b */
    public void m14809b(int i) {
        this.f12767g = i;
    }

    /* renamed from: b */
    public void mo48b() {
        super.mo48b();
        this.f12763c = null;
        this.f12764d = 0.0f;
        this.f12770l = null;
        this.f12771m = 1;
        this.f12772n = null;
        this.f12773o = 1;
        this.f12765e = null;
        this.f12766f = 0.0f;
        this.f12762b = 0.0f;
        this.f12768j = null;
        this.f12769k = 0.0f;
        this.f12767g = 0;
    }

    /* renamed from: c */
    public void m14812c() {
        ConstraintAnchor g = this.f12761a.m306g();
        if (g != null) {
            if (g.m306g() == this.f12761a) {
                this.f12767g = 4;
                g.m296a().f12767g = 4;
            }
            int e = this.f12761a.m304e();
            if (this.f12761a.f389b == Type.RIGHT || this.f12761a.f389b == Type.BOTTOM) {
                e = -e;
            }
            m14806a(g.m296a(), e);
        }
    }

    /* renamed from: a */
    public void m14803a(int i, C3025k c3025k, int i2) {
        this.f12767g = i;
        this.f12763c = c3025k;
        this.f12764d = (float) i2;
        this.f12763c.m426a(this);
    }

    /* renamed from: a */
    public void m14806a(C3025k c3025k, int i) {
        this.f12763c = c3025k;
        this.f12764d = (float) i;
        this.f12763c.m426a(this);
    }

    /* renamed from: a */
    public void m14807a(C3025k c3025k, int i, C3026l c3026l) {
        this.f12763c = c3025k;
        this.f12763c.m426a(this);
        this.f12770l = c3026l;
        this.f12771m = i;
        this.f12770l.m426a(this);
    }

    /* renamed from: b */
    public void m14810b(C3025k c3025k, float f) {
        this.f12768j = c3025k;
        this.f12769k = f;
    }

    /* renamed from: b */
    public void m14811b(C3025k c3025k, int i, C3026l c3026l) {
        this.f12768j = c3025k;
        this.f12772n = c3026l;
        this.f12773o = i;
    }

    /* renamed from: a */
    void m14804a(C0097e c0097e) {
        SolverVariable b = this.f12761a.m301b();
        if (this.f12765e == null) {
            c0097e.m274a(b, (int) (this.f12766f + 0.5f));
        } else {
            c0097e.m288c(b, c0097e.m273a(this.f12765e.f12761a), (int) (this.f12766f + 0.5f), 6);
        }
    }

    /* renamed from: d */
    public float m14813d() {
        return this.f12766f;
    }
}
