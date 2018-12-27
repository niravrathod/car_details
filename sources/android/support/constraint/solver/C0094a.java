package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import java.util.Arrays;

/* renamed from: android.support.constraint.solver.a */
public class C0094a {
    /* renamed from: a */
    int f308a = 0;
    /* renamed from: b */
    private final C3021b f309b;
    /* renamed from: c */
    private final C0095c f310c;
    /* renamed from: d */
    private int f311d = 8;
    /* renamed from: e */
    private SolverVariable f312e = null;
    /* renamed from: f */
    private int[] f313f = new int[this.f311d];
    /* renamed from: g */
    private int[] f314g = new int[this.f311d];
    /* renamed from: h */
    private float[] f315h = new float[this.f311d];
    /* renamed from: i */
    private int f316i = -1;
    /* renamed from: j */
    private int f317j = -1;
    /* renamed from: k */
    private boolean f318k = false;

    C0094a(C3021b c3021b, C0095c c0095c) {
        this.f309b = c3021b;
        this.f310c = c0095c;
    }

    /* renamed from: a */
    public final void m248a(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            m242a(solverVariable, true);
        } else if (this.f316i == -1) {
            this.f316i = 0;
            this.f315h[this.f316i] = f;
            this.f313f[this.f316i] = solverVariable.f298a;
            this.f314g[this.f316i] = -1;
            solverVariable.f306i += Float.MIN_VALUE;
            solverVariable.m237a(this.f309b);
            this.f308a += 1;
            if (this.f318k == null) {
                this.f317j += 1;
                if (this.f317j >= this.f313f.length) {
                    this.f318k = true;
                    this.f317j = this.f313f.length - 1;
                }
            }
        } else {
            int i = this.f316i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f308a) {
                if (this.f313f[i] == solverVariable.f298a) {
                    this.f315h[i] = f;
                    return;
                }
                if (this.f313f[i] < solverVariable.f298a) {
                    i3 = i;
                }
                i = this.f314g[i];
                i2++;
            }
            i = this.f317j + 1;
            if (this.f318k) {
                if (this.f313f[this.f317j] == -1) {
                    i = this.f317j;
                } else {
                    i = this.f313f.length;
                }
            }
            if (i >= this.f313f.length && this.f308a < this.f313f.length) {
                for (i2 = 0; i2 < this.f313f.length; i2++) {
                    if (this.f313f[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f313f.length) {
                i = this.f313f.length;
                this.f311d *= 2;
                this.f318k = false;
                this.f317j = i - 1;
                this.f315h = Arrays.copyOf(this.f315h, this.f311d);
                this.f313f = Arrays.copyOf(this.f313f, this.f311d);
                this.f314g = Arrays.copyOf(this.f314g, this.f311d);
            }
            this.f313f[i] = solverVariable.f298a;
            this.f315h[i] = f;
            if (i3 != -1) {
                this.f314g[i] = this.f314g[i3];
                this.f314g[i3] = i;
            } else {
                this.f314g[i] = this.f316i;
                this.f316i = i;
            }
            solverVariable.f306i += Float.MIN_VALUE;
            solverVariable.m237a(this.f309b);
            this.f308a += 1;
            if (this.f318k == null) {
                this.f317j += 1;
            }
            if (this.f308a >= this.f313f.length) {
                this.f318k = true;
            }
            if (this.f317j >= this.f313f.length) {
                this.f318k = true;
                this.f317j = this.f313f.length - 1;
            }
        }
    }

    /* renamed from: a */
    final void m249a(SolverVariable solverVariable, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f316i == -1) {
                this.f316i = 0;
                this.f315h[this.f316i] = f;
                this.f313f[this.f316i] = solverVariable.f298a;
                this.f314g[this.f316i] = -1;
                solverVariable.f306i += Float.MIN_VALUE;
                solverVariable.m237a(this.f309b);
                this.f308a += 1;
                if (this.f318k == null) {
                    this.f317j += 1;
                    if (this.f317j >= this.f313f.length) {
                        this.f318k = true;
                        this.f317j = this.f313f.length - 1;
                    }
                }
                return;
            }
            int i = this.f316i;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f308a) {
                if (this.f313f[i] == solverVariable.f298a) {
                    float[] fArr = this.f315h;
                    fArr[i] = fArr[i] + f;
                    if (this.f315h[i] == 0.0f) {
                        if (i == this.f316i) {
                            this.f316i = this.f314g[i];
                        } else {
                            this.f314g[i3] = this.f314g[i];
                        }
                        if (z) {
                            solverVariable.m239b(this.f309b);
                        }
                        if (this.f318k != null) {
                            this.f317j = i;
                        }
                        solverVariable.f306i -= Float.MIN_VALUE;
                        this.f308a -= 1;
                    }
                    return;
                }
                if (this.f313f[i] < solverVariable.f298a) {
                    i3 = i;
                }
                i = this.f314g[i];
                i2++;
            }
            z = this.f317j + true;
            if (this.f318k) {
                if (this.f313f[this.f317j]) {
                    z = this.f317j;
                } else {
                    z = this.f313f.length;
                }
            }
            if (z >= this.f313f.length && this.f308a < this.f313f.length) {
                for (boolean z2 = false; z2 < this.f313f.length; z2++) {
                    if (this.f313f[z2] == -1) {
                        z = z2;
                        break;
                    }
                }
            }
            if (z >= this.f313f.length) {
                z = this.f313f.length;
                this.f311d *= 2;
                this.f318k = false;
                this.f317j = z - 1;
                this.f315h = Arrays.copyOf(this.f315h, this.f311d);
                this.f313f = Arrays.copyOf(this.f313f, this.f311d);
                this.f314g = Arrays.copyOf(this.f314g, this.f311d);
            }
            this.f313f[z] = solverVariable.f298a;
            this.f315h[z] = f;
            if (i3 != -1) {
                this.f314g[z] = this.f314g[i3];
                this.f314g[i3] = z;
            } else {
                this.f314g[z] = this.f316i;
                this.f316i = z;
            }
            solverVariable.f306i += Float.MIN_VALUE;
            solverVariable.m237a(this.f309b);
            this.f308a += 1;
            if (this.f318k == null) {
                this.f317j += 1;
            }
            if (this.f317j >= this.f313f.length) {
                this.f318k = true;
                this.f317j = this.f313f.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float m242a(SolverVariable solverVariable, boolean z) {
        if (this.f312e == solverVariable) {
            this.f312e = null;
        }
        if (this.f316i == -1) {
            return 0.0f;
        }
        int i = this.f316i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f308a) {
            if (this.f313f[i] == solverVariable.f298a) {
                if (i == this.f316i) {
                    this.f316i = this.f314g[i];
                } else {
                    this.f314g[i3] = this.f314g[i];
                }
                if (z) {
                    solverVariable.m239b(this.f309b);
                }
                solverVariable.f306i--;
                this.f308a--;
                this.f313f[i] = -1;
                if (this.f318k != null) {
                    this.f317j = i;
                }
                return this.f315h[i];
            }
            i2++;
            i3 = i;
            i = this.f314g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void m246a() {
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            SolverVariable solverVariable = this.f310c.f321c[this.f313f[i]];
            if (solverVariable != null) {
                solverVariable.m239b(this.f309b);
            }
            i = this.f314g[i];
            i2++;
        }
        this.f316i = -1;
        this.f317j = -1;
        this.f318k = false;
        this.f308a = 0;
    }

    /* renamed from: a */
    final boolean m252a(SolverVariable solverVariable) {
        if (this.f316i == -1) {
            return false;
        }
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            if (this.f313f[i] == solverVariable.f298a) {
                return true;
            }
            i = this.f314g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    void m255b() {
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            float[] fArr = this.f315h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f314g[i];
            i2++;
        }
    }

    /* renamed from: a */
    void m247a(float f) {
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            float[] fArr = this.f315h;
            fArr[i] = fArr[i] / f;
            i = this.f314g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m241a(SolverVariable solverVariable, C0097e c0097e) {
        return solverVariable.f306i <= 1 ? true : null;
    }

    /* renamed from: a */
    SolverVariable m244a(C0097e c0097e) {
        int i = this.f316i;
        SolverVariable solverVariable = null;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        while (i != -1 && i2 < this.f308a) {
            boolean a;
            boolean a2;
            float f3 = this.f315h[i];
            SolverVariable solverVariable3 = this.f310c.f321c[this.f313f[i]];
            if (f3 < 0.0f) {
                if (f3 > -0.001f) {
                    this.f315h[i] = 0.0f;
                    solverVariable3.m239b(this.f309b);
                }
                if (f3 != 0.0f) {
                    if (solverVariable3.f303f == Type.UNRESTRICTED) {
                        if (solverVariable != null) {
                            a = m241a(solverVariable3, c0097e);
                        } else if (f > f3) {
                            a = m241a(solverVariable3, c0097e);
                        } else if (!z && m241a(solverVariable3, c0097e)) {
                            f = f3;
                            solverVariable = solverVariable3;
                            z = true;
                        }
                        z = a;
                        f = f3;
                        solverVariable = solverVariable3;
                    } else if (solverVariable == null && f3 < 0.0f) {
                        if (solverVariable2 != null) {
                            a2 = m241a(solverVariable3, c0097e);
                        } else if (f2 > f3) {
                            a2 = m241a(solverVariable3, c0097e);
                        } else if (!z2 && m241a(solverVariable3, c0097e)) {
                            f2 = f3;
                            solverVariable2 = solverVariable3;
                            z2 = true;
                        }
                        z2 = a2;
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                    }
                }
                i = this.f314g[i];
                i2++;
            } else {
                if (f3 < 0.001f) {
                    this.f315h[i] = 0.0f;
                    solverVariable3.m239b(this.f309b);
                }
                if (f3 != 0.0f) {
                    if (solverVariable3.f303f == Type.UNRESTRICTED) {
                        if (solverVariable2 != null) {
                            a2 = m241a(solverVariable3, c0097e);
                        } else if (f2 > f3) {
                            f2 = f3;
                            solverVariable2 = solverVariable3;
                            z2 = true;
                        } else {
                            a2 = m241a(solverVariable3, c0097e);
                        }
                        z2 = a2;
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                    } else {
                        if (solverVariable != null) {
                            a = m241a(solverVariable3, c0097e);
                        } else if (f > f3) {
                            f = f3;
                            solverVariable = solverVariable3;
                            z = true;
                        } else {
                            a = m241a(solverVariable3, c0097e);
                        }
                        z = a;
                        f = f3;
                        solverVariable = solverVariable3;
                    }
                }
                i = this.f314g[i];
                i2++;
            }
            f3 = 0.0f;
            if (f3 != 0.0f) {
                if (solverVariable3.f303f == Type.UNRESTRICTED) {
                    if (solverVariable != null) {
                        a = m241a(solverVariable3, c0097e);
                    } else if (f > f3) {
                        a = m241a(solverVariable3, c0097e);
                    } else {
                        f = f3;
                        solverVariable = solverVariable3;
                        z = true;
                    }
                    z = a;
                    f = f3;
                    solverVariable = solverVariable3;
                } else {
                    if (solverVariable2 != null) {
                        a2 = m241a(solverVariable3, c0097e);
                    } else if (f2 > f3) {
                        a2 = m241a(solverVariable3, c0097e);
                    } else {
                        f2 = f3;
                        solverVariable2 = solverVariable3;
                        z2 = true;
                    }
                    z2 = a2;
                    f2 = f3;
                    solverVariable2 = solverVariable3;
                }
            }
            i = this.f314g[i];
            i2++;
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    /* renamed from: a */
    final void m250a(C3021b c3021b, C3021b c3021b2, boolean z) {
        int i = this.f316i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f308a) {
                if (this.f313f[i] == c3021b2.f12754a.f298a) {
                    float f = this.f315h[i];
                    m242a(c3021b2.f12754a, z);
                    C0094a c0094a = c3021b2.f12757d;
                    int i3 = c0094a.f316i;
                    int i4 = 0;
                    while (i3 != -1 && i4 < c0094a.f308a) {
                        m249a(this.f310c.f321c[c0094a.f313f[i3]], c0094a.f315h[i3] * f, z);
                        i3 = c0094a.f314g[i3];
                        i4++;
                    }
                    c3021b.f12755b += c3021b2.f12755b * f;
                    if (z) {
                        c3021b2.f12754a.m239b(c3021b);
                    }
                    i = this.f316i;
                } else {
                    i = this.f314g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    void m251a(C3021b c3021b, C3021b[] c3021bArr) {
        int i = this.f316i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f308a) {
                SolverVariable solverVariable = this.f310c.f321c[this.f313f[i]];
                if (solverVariable.f299b != -1) {
                    float f = this.f315h[i];
                    m242a(solverVariable, true);
                    C3021b c3021b2 = c3021bArr[solverVariable.f299b];
                    if (!c3021b2.f12758e) {
                        C0094a c0094a = c3021b2.f12757d;
                        int i3 = c0094a.f316i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < c0094a.f308a) {
                            m249a(this.f310c.f321c[c0094a.f313f[i3]], c0094a.f315h[i3] * f, true);
                            i3 = c0094a.f314g[i3];
                            i4++;
                        }
                    }
                    c3021b.f12755b += c3021b2.f12755b * f;
                    c3021b2.f12754a.m239b(c3021b);
                    i = this.f316i;
                } else {
                    i = this.f314g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    SolverVariable m245a(boolean[] zArr, SolverVariable solverVariable) {
        int i = this.f316i;
        int i2 = 0;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f308a) {
            if (this.f315h[i] < 0.0f) {
                SolverVariable solverVariable3 = this.f310c.f321c[this.f313f[i]];
                if ((zArr == null || !zArr[solverVariable3.f298a]) && solverVariable3 != solverVariable && (solverVariable3.f303f == Type.SLACK || solverVariable3.f303f == Type.ERROR)) {
                    float f2 = this.f315h[i];
                    if (f2 < f) {
                        solverVariable2 = solverVariable3;
                        f = f2;
                    }
                }
            }
            i = this.f314g[i];
            i2++;
        }
        return solverVariable2;
    }

    /* renamed from: a */
    final SolverVariable m243a(int i) {
        int i2 = this.f316i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            if (i3 == i) {
                return this.f310c.f321c[this.f313f[i2]];
            }
            i2 = this.f314g[i2];
            i3++;
        }
        return 0;
    }

    /* renamed from: b */
    final float m253b(int i) {
        int i2 = this.f316i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            if (i3 == i) {
                return this.f315h[i2];
            }
            i2 = this.f314g[i2];
            i3++;
        }
        return 0;
    }

    /* renamed from: b */
    public final float m254b(SolverVariable solverVariable) {
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            if (this.f313f[i] == solverVariable.f298a) {
                return this.f315h[i];
            }
            i = this.f314g[i];
            i2++;
        }
        return null;
    }

    public String toString() {
        String str = "";
        int i = this.f316i;
        int i2 = 0;
        while (i != -1 && i2 < this.f308a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f315h[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f310c.f321c[this.f313f[i]]);
            str = stringBuilder.toString();
            i = this.f314g[i];
            i2++;
        }
        return str;
    }
}
