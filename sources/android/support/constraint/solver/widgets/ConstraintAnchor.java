package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0095c;
import android.support.constraint.solver.SolverVariable;

public class ConstraintAnchor {
    /* renamed from: a */
    final ConstraintWidget f388a;
    /* renamed from: b */
    final Type f389b;
    /* renamed from: c */
    ConstraintAnchor f390c;
    /* renamed from: d */
    public int f391d = 0;
    /* renamed from: e */
    int f392e = -1;
    /* renamed from: f */
    SolverVariable f393f;
    /* renamed from: g */
    private C3025k f394g = new C3025k(this);
    /* renamed from: h */
    private Strength f395h = Strength.NONE;
    /* renamed from: i */
    private ConnectionType f396i = ConnectionType.RELAXED;
    /* renamed from: j */
    private int f397j = 0;

    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: a */
    public C3025k m296a() {
        return this.f394g;
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f388a = constraintWidget;
        this.f389b = type;
    }

    /* renamed from: b */
    public SolverVariable m301b() {
        return this.f393f;
    }

    /* renamed from: a */
    public void m297a(C0095c c0095c) {
        if (this.f393f == null) {
            this.f393f = new SolverVariable(android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED, null);
        } else {
            this.f393f.m238b();
        }
    }

    /* renamed from: c */
    public ConstraintWidget m302c() {
        return this.f388a;
    }

    /* renamed from: d */
    public Type m303d() {
        return this.f389b;
    }

    /* renamed from: e */
    public int m304e() {
        if (this.f388a.m372l() == 8) {
            return 0;
        }
        if (this.f392e <= -1 || this.f390c == null || this.f390c.f388a.m372l() != 8) {
            return this.f391d;
        }
        return this.f392e;
    }

    /* renamed from: f */
    public Strength m305f() {
        return this.f395h;
    }

    /* renamed from: g */
    public ConstraintAnchor m306g() {
        return this.f390c;
    }

    /* renamed from: h */
    public int m307h() {
        return this.f397j;
    }

    /* renamed from: i */
    public void m308i() {
        this.f390c = null;
        this.f391d = 0;
        this.f392e = -1;
        this.f395h = Strength.STRONG;
        this.f397j = 0;
        this.f396i = ConnectionType.RELAXED;
        this.f394g.mo48b();
    }

    /* renamed from: a */
    public boolean m300a(ConstraintAnchor constraintAnchor, int i, Strength strength, int i2) {
        return m299a(constraintAnchor, i, -1, strength, i2, false);
    }

    /* renamed from: a */
    public boolean m299a(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.f390c = null;
            this.f391d = 0;
            this.f392e = -1;
            this.f395h = Strength.NONE;
            this.f397j = 2;
            return true;
        } else if (!z && !m298a(constraintAnchor)) {
            return false;
        } else {
            this.f390c = constraintAnchor;
            if (i > 0) {
                this.f391d = i;
            } else {
                this.f391d = 0;
            }
            this.f392e = i2;
            this.f395h = strength;
            this.f397j = i3;
            return true;
        }
    }

    /* renamed from: j */
    public boolean m309j() {
        return this.f390c != null;
    }

    /* renamed from: a */
    public boolean m298a(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type d = constraintAnchor.m303d();
        if (d != this.f389b) {
            boolean z2;
            switch (this.f389b) {
                case CENTER:
                    if (!(d == Type.BASELINE || d == Type.CENTER_X || d == Type.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case LEFT:
                case RIGHT:
                    if (d != Type.LEFT) {
                        if (d != Type.RIGHT) {
                            z2 = false;
                            if ((constraintAnchor.m302c() instanceof C3023g) != null) {
                                if (!z2) {
                                    if (d == Type.CENTER_X) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if ((constraintAnchor.m302c() instanceof C3023g) != null) {
                        if (z2) {
                            if (d == Type.CENTER_X) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case TOP:
                case BOTTOM:
                    if (d != Type.TOP) {
                        if (d != Type.BOTTOM) {
                            z2 = false;
                            if ((constraintAnchor.m302c() instanceof C3023g) != null) {
                                if (!z2) {
                                    if (d == Type.CENTER_Y) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if ((constraintAnchor.m302c() instanceof C3023g) != null) {
                        if (z2) {
                            if (d == Type.CENTER_Y) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.f389b.name());
            }
        } else if (this.f389b == Type.BASELINE && (constraintAnchor.m302c().m395z() == null || m302c().m395z() == null)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f388a.m374m());
        stringBuilder.append(":");
        stringBuilder.append(this.f389b.toString());
        return stringBuilder.toString();
    }
}
