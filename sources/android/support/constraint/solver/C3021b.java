package android.support.constraint.solver;

import android.support.constraint.solver.C0097e.C0096a;
import android.support.constraint.solver.SolverVariable.Type;

/* renamed from: android.support.constraint.solver.b */
public class C3021b implements C0096a {
    /* renamed from: a */
    SolverVariable f12754a = null;
    /* renamed from: b */
    float f12755b = 0.0f;
    /* renamed from: c */
    boolean f12756c = false;
    /* renamed from: d */
    public final C0094a f12757d;
    /* renamed from: e */
    boolean f12758e = false;

    public C3021b(C0095c c0095c) {
        this.f12757d = new C0094a(this, c0095c);
    }

    /* renamed from: a */
    boolean m14769a() {
        return this.f12754a != null && (this.f12754a.f303f == Type.UNRESTRICTED || this.f12755b >= 0.0f);
    }

    public String toString() {
        return m14776b();
    }

    /* renamed from: b */
    String m14776b() {
        StringBuilder stringBuilder;
        Object obj;
        String str = "";
        if (this.f12754a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
            str = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f12754a);
            str = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" = ");
        str = stringBuilder.toString();
        if (this.f12755b != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f12755b);
            str = stringBuilder.toString();
            obj = 1;
        } else {
            obj = null;
        }
        int i = this.f12757d.f308a;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a = this.f12757d.m243a(i2);
            if (a != null) {
                float b = this.f12757d.m253b(i2);
                if (b != 0.0f) {
                    String solverVariable = a.toString();
                    if (obj == null) {
                        if (b < 0.0f) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append("- ");
                            str = stringBuilder.toString();
                            b *= -1.0f;
                        }
                    } else if (b > 0.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" + ");
                        str = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" - ");
                        str = stringBuilder.toString();
                        b *= -1.0f;
                    }
                    if (b == 1.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(solverVariable);
                        str = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(b);
                        stringBuilder.append(" ");
                        stringBuilder.append(solverVariable);
                        str = stringBuilder.toString();
                    }
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("0.0");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public void m14778c() {
        this.f12754a = null;
        this.f12757d.m246a();
        this.f12755b = 0.0f;
        this.f12758e = false;
    }

    /* renamed from: a */
    boolean m14770a(SolverVariable solverVariable) {
        return this.f12757d.m252a(solverVariable);
    }

    /* renamed from: a */
    C3021b m14761a(SolverVariable solverVariable, int i) {
        this.f12754a = solverVariable;
        i = (float) i;
        solverVariable.f301d = i;
        this.f12755b = i;
        this.f12758e = true;
        return this;
    }

    /* renamed from: b */
    public C3021b m14773b(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f12755b = (float) (i * -1);
            this.f12757d.m248a(solverVariable, 1.0f);
        } else {
            this.f12755b = (float) i;
            this.f12757d.m248a(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C3021b m14762a(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f12755b = (float) i;
        }
        if (obj == null) {
            this.f12757d.m248a(solverVariable, -1.0f);
            this.f12757d.m248a(solverVariable2, 1.0f);
        } else {
            this.f12757d.m248a(solverVariable, 1.0f);
            this.f12757d.m248a(solverVariable2, -1.0f);
        }
        return this;
    }

    /* renamed from: c */
    C3021b m14777c(SolverVariable solverVariable, int i) {
        this.f12757d.m248a(solverVariable, (float) i);
        return this;
    }

    /* renamed from: a */
    public C3021b m14765a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f12755b = (float) i;
        }
        if (obj == null) {
            this.f12757d.m248a(solverVariable, -1.0f);
            this.f12757d.m248a(solverVariable2, 1.0f);
            this.f12757d.m248a(solverVariable3, 1.0f);
        } else {
            this.f12757d.m248a(solverVariable, 1.0f);
            this.f12757d.m248a(solverVariable2, -1.0f);
            this.f12757d.m248a(solverVariable3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C3021b m14774b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f12755b = (float) i;
        }
        if (obj == null) {
            this.f12757d.m248a(solverVariable, -1.0f);
            this.f12757d.m248a(solverVariable2, 1.0f);
            this.f12757d.m248a(solverVariable3, -1.0f);
        } else {
            this.f12757d.m248a(solverVariable, 1.0f);
            this.f12757d.m248a(solverVariable2, -1.0f);
            this.f12757d.m248a(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C3021b m14760a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f12755b = 0.0f;
        if (f2 != 0.0f) {
            if (f != f3) {
                if (f == 0.0f) {
                    this.f12757d.m248a(solverVariable, 1.0f);
                    this.f12757d.m248a(solverVariable2, -1.0f);
                } else if (f3 == 0.0f) {
                    this.f12757d.m248a(solverVariable3, 1.0f);
                    this.f12757d.m248a(solverVariable4, -1.0f);
                } else {
                    f = (f / f2) / (f3 / f2);
                    this.f12757d.m248a(solverVariable, 1.0f);
                    this.f12757d.m248a(solverVariable2, -1.0f);
                    this.f12757d.m248a(solverVariable4, f);
                    this.f12757d.m248a(solverVariable3, -f);
                }
                return this;
            }
        }
        this.f12757d.m248a(solverVariable, 1.0f);
        this.f12757d.m248a(solverVariable2, -1.0f);
        this.f12757d.m248a(solverVariable4, 1.0f);
        this.f12757d.m248a(solverVariable3, -1.0f);
        return this;
    }

    /* renamed from: a */
    C3021b m14763a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f12757d.m248a(solverVariable, 1.0f);
            this.f12757d.m248a(solverVariable4, 1.0f);
            this.f12757d.m248a(solverVariable2, (float) -1073741824);
            return this;
        }
        if (f == 0.5f) {
            this.f12757d.m248a(solverVariable, 1.0f);
            this.f12757d.m248a(solverVariable2, -1.0f);
            this.f12757d.m248a(solverVariable3, -1.0f);
            this.f12757d.m248a(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f12755b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f12757d.m248a(solverVariable, -1.0f);
            this.f12757d.m248a(solverVariable2, 1.0f);
            this.f12755b = (float) i;
        } else if (f >= 1.0f) {
            this.f12757d.m248a(solverVariable3, -1.0f);
            this.f12757d.m248a(solverVariable4, 1.0f);
            this.f12755b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f12757d.m248a(solverVariable, f2 * 1.0f);
            this.f12757d.m248a(solverVariable2, f2 * -1.0f);
            this.f12757d.m248a(solverVariable3, -1.0f * f);
            this.f12757d.m248a(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f12755b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C3021b m14767a(C0097e c0097e, int i) {
        this.f12757d.m248a(c0097e.m272a(i, "ep"), 1.0f);
        this.f12757d.m248a(c0097e.m272a(i, "em"), (float) -1082130432);
        return this;
    }

    /* renamed from: a */
    C3021b m14764a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.f12757d.m248a(solverVariable, -1.0f);
        this.f12757d.m248a(solverVariable2, 1.0f - f);
        this.f12757d.m248a(solverVariable3, f);
        return this;
    }

    /* renamed from: a */
    public C3021b m14766a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f12757d.m248a(solverVariable, -1.0f);
        this.f12757d.m248a(solverVariable2, 1.0f);
        this.f12757d.m248a(solverVariable3, f);
        this.f12757d.m248a(solverVariable4, -f);
        return this;
    }

    /* renamed from: b */
    public C3021b m14775b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f12757d.m248a(solverVariable3, 0.5f);
        this.f12757d.m248a(solverVariable4, 0.5f);
        this.f12757d.m248a(solverVariable, -0.5f);
        this.f12757d.m248a(solverVariable2, -0.5f);
        this.f12755b = -f;
        return this;
    }

    /* renamed from: d */
    void m14780d() {
        if (this.f12755b < 0.0f) {
            this.f12755b *= -1.0f;
            this.f12757d.m255b();
        }
    }

    /* renamed from: a */
    boolean m14771a(C0097e c0097e) {
        c0097e = this.f12757d.m244a(c0097e);
        if (c0097e == null) {
            c0097e = true;
        } else {
            m14779c(c0097e);
            c0097e = null;
        }
        if (this.f12757d.f308a == 0) {
            this.f12758e = true;
        }
        return c0097e;
    }

    /* renamed from: b */
    SolverVariable m14772b(SolverVariable solverVariable) {
        return this.f12757d.m245a(null, solverVariable);
    }

    /* renamed from: c */
    void m14779c(SolverVariable solverVariable) {
        if (this.f12754a != null) {
            this.f12757d.m248a(this.f12754a, -1.0f);
            this.f12754a = null;
        }
        float a = this.f12757d.m242a(solverVariable, true) * -1.0f;
        this.f12754a = solverVariable;
        if (a != 1.0f) {
            this.f12755b /= a;
            this.f12757d.m247a(a);
        }
    }

    /* renamed from: e */
    public boolean m14782e() {
        return this.f12754a == null && this.f12755b == 0.0f && this.f12757d.f308a == 0;
    }

    /* renamed from: a */
    public SolverVariable mo31a(C0097e c0097e, boolean[] zArr) {
        return this.f12757d.m245a(zArr, null);
    }

    /* renamed from: f */
    public void mo34f() {
        this.f12757d.m246a();
        this.f12754a = null;
        this.f12755b = 0.0f;
    }

    /* renamed from: a */
    public void mo32a(C0096a c0096a) {
        if (c0096a instanceof C3021b) {
            C3021b c3021b = (C3021b) c0096a;
            this.f12754a = null;
            this.f12757d.m246a();
            for (int i = 0; i < c3021b.f12757d.f308a; i++) {
                this.f12757d.m249a(c3021b.f12757d.m243a(i), c3021b.f12757d.m253b(i), true);
            }
        }
    }

    /* renamed from: d */
    public void mo33d(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.f300c != 1) {
            if (solverVariable.f300c == 2) {
                f = 1000.0f;
            } else if (solverVariable.f300c == 3) {
                f = 1000000.0f;
            } else if (solverVariable.f300c == 4) {
                f = 1.0E9f;
            } else if (solverVariable.f300c == 5) {
                f = 1.0E12f;
            }
        }
        this.f12757d.m248a(solverVariable, f);
    }

    /* renamed from: g */
    public SolverVariable mo35g() {
        return this.f12754a;
    }
}
