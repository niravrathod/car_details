package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.solver.e */
public class C0097e {
    /* renamed from: g */
    public static C0098f f322g = null;
    /* renamed from: h */
    private static int f323h = 1000;
    /* renamed from: a */
    int f324a;
    /* renamed from: b */
    C3021b[] f325b;
    /* renamed from: c */
    public boolean f326c;
    /* renamed from: d */
    int f327d;
    /* renamed from: e */
    int f328e;
    /* renamed from: f */
    final C0095c f329f;
    /* renamed from: i */
    private HashMap<String, SolverVariable> f330i;
    /* renamed from: j */
    private C0096a f331j;
    /* renamed from: k */
    private int f332k;
    /* renamed from: l */
    private int f333l;
    /* renamed from: m */
    private boolean[] f334m;
    /* renamed from: n */
    private int f335n;
    /* renamed from: o */
    private SolverVariable[] f336o;
    /* renamed from: p */
    private int f337p;
    /* renamed from: q */
    private C3021b[] f338q;
    /* renamed from: r */
    private final C0096a f339r;

    /* renamed from: android.support.constraint.solver.e$a */
    interface C0096a {
        /* renamed from: a */
        SolverVariable mo31a(C0097e c0097e, boolean[] zArr);

        /* renamed from: a */
        void mo32a(C0096a c0096a);

        /* renamed from: d */
        void mo33d(SolverVariable solverVariable);

        /* renamed from: f */
        void mo34f();

        /* renamed from: g */
        SolverVariable mo35g();
    }

    public C0097e() {
        this.f324a = 0;
        this.f330i = null;
        this.f332k = 32;
        this.f333l = this.f332k;
        this.f325b = null;
        this.f326c = false;
        this.f334m = new boolean[this.f332k];
        this.f327d = 1;
        this.f328e = 0;
        this.f335n = this.f332k;
        this.f336o = new SolverVariable[f323h];
        this.f337p = 0;
        this.f338q = new C3021b[this.f332k];
        this.f325b = new C3021b[this.f332k];
        m270i();
        this.f329f = new C0095c();
        this.f331j = new C4401d(this.f329f);
        this.f339r = new C3021b(this.f329f);
    }

    /* renamed from: a */
    public static C0098f m264a() {
        return f322g;
    }

    /* renamed from: h */
    private void m269h() {
        this.f332k *= 2;
        this.f325b = (C3021b[]) Arrays.copyOf(this.f325b, this.f332k);
        this.f329f.f321c = (SolverVariable[]) Arrays.copyOf(this.f329f.f321c, this.f332k);
        this.f334m = new boolean[this.f332k];
        this.f333l = this.f332k;
        this.f335n = this.f332k;
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f347d++;
            f322g.f359p = Math.max(f322g.f359p, (long) this.f332k);
            f322g.f343D = f322g.f359p;
        }
    }

    /* renamed from: i */
    private void m270i() {
        for (int i = 0; i < this.f325b.length; i++) {
            Object obj = this.f325b[i];
            if (obj != null) {
                this.f329f.f319a.mo38a(obj);
            }
            this.f325b[i] = null;
        }
    }

    /* renamed from: b */
    public void m284b() {
        int i;
        for (SolverVariable solverVariable : this.f329f.f321c) {
            if (solverVariable != null) {
                solverVariable.m238b();
            }
        }
        this.f329f.f320b.mo37a(this.f336o, this.f337p);
        this.f337p = 0;
        Arrays.fill(this.f329f.f321c, null);
        if (this.f330i != null) {
            this.f330i.clear();
        }
        this.f324a = 0;
        this.f331j.mo34f();
        this.f327d = 1;
        for (i = 0; i < this.f328e; i++) {
            this.f325b[i].f12756c = false;
        }
        m270i();
        this.f328e = 0;
    }

    /* renamed from: a */
    public SolverVariable m273a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f327d + 1 >= this.f333l) {
            m269h();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.m301b();
            if (solverVariable == null) {
                constraintAnchor.m297a(this.f329f);
                solverVariable = constraintAnchor.m301b();
            }
            if (solverVariable.f298a == -1 || solverVariable.f298a > this.f324a || this.f329f.f321c[solverVariable.f298a] == null) {
                if (solverVariable.f298a != -1) {
                    solverVariable.m238b();
                }
                this.f324a++;
                this.f327d++;
                solverVariable.f298a = this.f324a;
                solverVariable.f303f = Type.UNRESTRICTED;
                this.f329f.f321c[this.f324a] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: c */
    public C3021b m287c() {
        C3021b c3021b = (C3021b) this.f329f.f319a.mo36a();
        if (c3021b == null) {
            c3021b = new C3021b(this.f329f);
        } else {
            c3021b.m14778c();
        }
        SolverVariable.m235a();
        return c3021b;
    }

    /* renamed from: d */
    public SolverVariable m289d() {
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f357n++;
        }
        if (this.f327d + 1 >= this.f333l) {
            m269h();
        }
        SolverVariable a = m262a(Type.SLACK, null);
        this.f324a++;
        this.f327d++;
        a.f298a = this.f324a;
        this.f329f.f321c[this.f324a] = a;
        return a;
    }

    /* renamed from: e */
    public SolverVariable m290e() {
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f358o++;
        }
        if (this.f327d + 1 >= this.f333l) {
            m269h();
        }
        SolverVariable a = m262a(Type.SLACK, null);
        this.f324a++;
        this.f327d++;
        a.f298a = this.f324a;
        this.f329f.f321c[this.f324a] = a;
        return a;
    }

    /* renamed from: b */
    private void m266b(C3021b c3021b) {
        c3021b.m14767a(this, 0);
    }

    /* renamed from: a */
    void m280a(C3021b c3021b, int i, int i2) {
        c3021b.m14777c(m272a(i2, null), i);
    }

    /* renamed from: a */
    public SolverVariable m272a(int i, String str) {
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f356m++;
        }
        if (this.f327d + 1 >= this.f333l) {
            m269h();
        }
        str = m262a(Type.ERROR, str);
        this.f324a++;
        this.f327d++;
        str.f298a = this.f324a;
        str.f300c = i;
        this.f329f.f321c[this.f324a] = str;
        this.f331j.mo33d(str);
        return str;
    }

    /* renamed from: a */
    private SolverVariable m262a(Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f329f.f320b.mo36a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.m236a(type, str);
        } else {
            solverVariable.m238b();
            solverVariable.m236a(type, str);
        }
        if (this.f337p >= f323h) {
            f323h *= 2;
            this.f336o = (SolverVariable[]) Arrays.copyOf(this.f336o, f323h);
        }
        type = this.f336o;
        str = this.f337p;
        this.f337p = str + 1;
        type[str] = solverVariable;
        return solverVariable;
    }

    /* renamed from: b */
    public int m283b(Object obj) {
        obj = ((ConstraintAnchor) obj).m301b();
        return obj != null ? (int) (obj.f301d + 0.5f) : null;
    }

    /* renamed from: f */
    public void m291f() {
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f348e++;
        }
        if (this.f326c) {
            if (f322g != null) {
                c0098f = f322g;
                c0098f.f361r++;
            }
            Object obj = null;
            for (int i = 0; i < this.f328e; i++) {
                if (!this.f325b[i].f12758e) {
                    break;
                }
            }
            obj = 1;
            if (obj == null) {
                m281a(this.f331j);
                return;
            }
            if (f322g != null) {
                c0098f = f322g;
                c0098f.f360q++;
            }
            m271j();
            return;
        }
        m281a(this.f331j);
    }

    /* renamed from: a */
    void m281a(C0096a c0096a) {
        if (f322g != null) {
            C0098f c0098f = f322g;
            c0098f.f363t++;
            f322g.f364u = Math.max(f322g.f364u, (long) this.f327d);
            f322g.f365v = Math.max(f322g.f365v, (long) this.f328e);
        }
        m267c((C3021b) c0096a);
        m265b(c0096a);
        m261a(c0096a, false);
        m271j();
    }

    /* renamed from: c */
    private final void m267c(C3021b c3021b) {
        if (this.f328e > 0) {
            c3021b.f12757d.m251a(c3021b, this.f325b);
            if (c3021b.f12757d.f308a == 0) {
                c3021b.f12758e = true;
            }
        }
    }

    /* renamed from: a */
    public void m279a(C3021b c3021b) {
        if (c3021b != null) {
            if (f322g != null) {
                C0098f c0098f = f322g;
                c0098f.f349f++;
                if (c3021b.f12758e) {
                    c0098f = f322g;
                    c0098f.f350g++;
                }
            }
            if (this.f328e + 1 >= this.f335n || this.f327d + 1 >= this.f333l) {
                m269h();
            }
            Object obj = null;
            if (!c3021b.f12758e) {
                m267c(c3021b);
                if (!c3021b.m14782e()) {
                    c3021b.m14780d();
                    if (c3021b.m14771a(this)) {
                        SolverVariable e = m290e();
                        c3021b.f12754a = e;
                        m268d(c3021b);
                        this.f339r.mo32a(c3021b);
                        m261a(this.f339r, true);
                        if (e.f299b == -1) {
                            if (c3021b.f12754a == e) {
                                e = c3021b.m14772b(e);
                                if (e != null) {
                                    if (f322g != null) {
                                        C0098f c0098f2 = f322g;
                                        c0098f2.f353j++;
                                    }
                                    c3021b.m14779c(e);
                                }
                            }
                            if (!c3021b.f12758e) {
                                c3021b.f12754a.m240c(c3021b);
                            }
                            this.f328e--;
                        }
                        obj = 1;
                    }
                    if (!c3021b.m14769a()) {
                        return;
                    }
                }
                return;
            }
            if (obj == null) {
                m268d(c3021b);
            }
        }
    }

    /* renamed from: d */
    private final void m268d(C3021b c3021b) {
        if (this.f325b[this.f328e] != null) {
            this.f329f.f319a.mo38a(this.f325b[this.f328e]);
        }
        this.f325b[this.f328e] = c3021b;
        c3021b.f12754a.f299b = this.f328e;
        this.f328e++;
        c3021b.f12754a.m240c(c3021b);
    }

    /* renamed from: a */
    private final int m261a(C0096a c0096a, boolean z) {
        if (f322g) {
            z = f322g;
            z.f351h++;
        }
        for (int i = 0; i < this.f327d; i++) {
            this.f334m[i] = false;
        }
        Object obj = null;
        int i2 = 0;
        while (obj == null) {
            if (f322g != null) {
                C0098f c0098f = f322g;
                c0098f.f352i++;
            }
            i2++;
            if (i2 >= this.f327d * 2) {
                return i2;
            }
            if (c0096a.mo35g() != null) {
                this.f334m[c0096a.mo35g().f298a] = true;
            }
            SolverVariable a = c0096a.mo31a(this, this.f334m);
            if (a != null) {
                if (this.f334m[a.f298a]) {
                    return i2;
                }
                this.f334m[a.f298a] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f328e; i4++) {
                    C3021b c3021b = this.f325b[i4];
                    if (c3021b.f12754a.f303f != Type.UNRESTRICTED) {
                        if (!c3021b.f12758e) {
                            if (c3021b.m14770a(a)) {
                                float b = c3021b.f12757d.m254b(a);
                                if (b < 0.0f) {
                                    float f2 = (-c3021b.f12755b) / b;
                                    if (f2 < f) {
                                        i3 = i4;
                                        f = f2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    C3021b c3021b2 = this.f325b[i3];
                    c3021b2.f12754a.f299b = -1;
                    if (f322g != null) {
                        C0098f c0098f2 = f322g;
                        c0098f2.f353j++;
                    }
                    c3021b2.m14779c(a);
                    c3021b2.f12754a.f299b = i3;
                    c3021b2.f12754a.m240c(c3021b2);
                }
            }
            obj = 1;
        }
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private int m265b(android.support.constraint.solver.C0097e.C0096a r19) {
        /*
        r18 = this;
        r0 = r18;
        r2 = 0;
    L_0x0003:
        r3 = r0.f328e;
        r4 = 0;
        if (r2 >= r3) goto L_0x0024;
    L_0x0008:
        r3 = r0.f325b;
        r3 = r3[r2];
        r3 = r3.f12754a;
        r3 = r3.f303f;
        r6 = android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED;
        if (r3 != r6) goto L_0x0015;
    L_0x0014:
        goto L_0x0021;
    L_0x0015:
        r3 = r0.f325b;
        r3 = r3[r2];
        r3 = r3.f12755b;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0021;
    L_0x001f:
        r2 = 1;
        goto L_0x0025;
    L_0x0021:
        r2 = r2 + 1;
        goto L_0x0003;
    L_0x0024:
        r2 = 0;
    L_0x0025:
        if (r2 == 0) goto L_0x00db;
    L_0x0027:
        r2 = 0;
        r3 = 0;
    L_0x0029:
        if (r2 != 0) goto L_0x00d8;
    L_0x002b:
        r6 = f322g;
        r7 = 1;
        if (r6 == 0) goto L_0x0038;
    L_0x0031:
        r6 = f322g;
        r9 = r6.f354k;
        r9 = r9 + r7;
        r6.f354k = r9;
    L_0x0038:
        r3 = r3 + 1;
        r6 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r9 = -1;
        r6 = 0;
        r10 = -1;
        r11 = -1;
        r12 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r13 = 0;
    L_0x0045:
        r14 = r0.f328e;
        if (r6 >= r14) goto L_0x00a3;
    L_0x0049:
        r14 = r0.f325b;
        r14 = r14[r6];
        r15 = r14.f12754a;
        r15 = r15.f303f;
        r1 = android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED;
        if (r15 != r1) goto L_0x0056;
    L_0x0055:
        goto L_0x009d;
    L_0x0056:
        r1 = r14.f12758e;
        if (r1 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x009d;
    L_0x005b:
        r1 = r14.f12755b;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x009d;
    L_0x0061:
        r1 = 1;
    L_0x0062:
        r15 = r0.f327d;
        if (r1 >= r15) goto L_0x009d;
    L_0x0066:
        r15 = r0.f329f;
        r15 = r15.f321c;
        r15 = r15[r1];
        r5 = r14.f12757d;
        r5 = r5.m254b(r15);
        r17 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r17 > 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0097;
    L_0x0077:
        r4 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = 0;
    L_0x007c:
        r7 = 7;
        if (r10 >= r7) goto L_0x0093;
    L_0x007f:
        r7 = r15.f302e;
        r7 = r7[r10];
        r7 = r7 / r5;
        r8 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r8 >= 0) goto L_0x008a;
    L_0x0088:
        if (r10 == r4) goto L_0x008c;
    L_0x008a:
        if (r10 <= r4) goto L_0x0090;
    L_0x008c:
        r12 = r1;
        r11 = r6;
        r13 = r7;
        r4 = r10;
    L_0x0090:
        r10 = r10 + 1;
        goto L_0x007c;
    L_0x0093:
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r4;
    L_0x0097:
        r1 = r1 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0062;
    L_0x009d:
        r6 = r6 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0045;
    L_0x00a3:
        if (r10 == r9) goto L_0x00cd;
    L_0x00a5:
        r1 = r0.f325b;
        r1 = r1[r10];
        r4 = r1.f12754a;
        r4.f299b = r9;
        r4 = f322g;
        if (r4 == 0) goto L_0x00ba;
    L_0x00b1:
        r4 = f322g;
        r5 = r4.f353j;
        r7 = 1;
        r5 = r5 + r7;
        r4.f353j = r5;
    L_0x00ba:
        r4 = r0.f329f;
        r4 = r4.f321c;
        r4 = r4[r11];
        r1.m14779c(r4);
        r4 = r1.f12754a;
        r4.f299b = r10;
        r4 = r1.f12754a;
        r4.m240c(r1);
        goto L_0x00ce;
    L_0x00cd:
        r2 = 1;
    L_0x00ce:
        r1 = r0.f327d;
        r1 = r1 / 2;
        if (r3 <= r1) goto L_0x00d5;
    L_0x00d4:
        r2 = 1;
    L_0x00d5:
        r4 = 0;
        goto L_0x0029;
    L_0x00d8:
        r16 = r3;
        goto L_0x00dd;
    L_0x00db:
        r16 = 0;
    L_0x00dd:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.e.b(android.support.constraint.solver.e$a):int");
    }

    /* renamed from: j */
    private void m271j() {
        for (int i = 0; i < this.f328e; i++) {
            C3021b c3021b = this.f325b[i];
            c3021b.f12754a.f301d = c3021b.f12755b;
        }
    }

    /* renamed from: g */
    public C0095c m292g() {
        return this.f329f;
    }

    /* renamed from: a */
    public void m276a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C3021b c = m287c();
        SolverVariable d = m289d();
        d.f300c = 0;
        c.m14765a(solverVariable, solverVariable2, d, i);
        if (i2 != 6) {
            m280a(c, (int) (c.f12757d.m254b(d) * -1082130432), i2);
        }
        m279a(c);
    }

    /* renamed from: a */
    public void m278a(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C3021b c = m287c();
        SolverVariable d = m289d();
        d.f300c = 0;
        c.m14765a(solverVariable, solverVariable2, d, 0);
        if (z) {
            m280a(c, (int) (c.f12757d.m254b(d) * -1082130432), 1);
        }
        m279a(c);
    }

    /* renamed from: b */
    public void m285b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C3021b c = m287c();
        SolverVariable d = m289d();
        d.f300c = 0;
        c.m14774b(solverVariable, solverVariable2, d, i);
        if (i2 != 6) {
            m280a(c, (int) (c.f12757d.m254b(d) * -1082130432), i2);
        }
        m279a(c);
    }

    /* renamed from: b */
    public void m286b(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C3021b c = m287c();
        SolverVariable d = m289d();
        d.f300c = 0;
        c.m14774b(solverVariable, solverVariable2, d, 0);
        if (z) {
            m280a(c, (int) (c.f12757d.m254b(d) * -1082130432), 1);
        }
        m279a(c);
    }

    /* renamed from: a */
    public void m275a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        C0097e c0097e = this;
        int i4 = i3;
        C3021b c = m287c();
        c.m14763a(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i4 != 6) {
            c.m14767a(this, i4);
        }
        m279a(c);
    }

    /* renamed from: a */
    public void m277a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C3021b c = m287c();
        c.m14766a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 6) {
            c.m14767a(this, i);
        }
        m279a(c);
    }

    /* renamed from: c */
    public C3021b m288c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C3021b c = m287c();
        c.m14762a(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            c.m14767a(this, i2);
        }
        m279a(c);
        return c;
    }

    /* renamed from: a */
    public void m274a(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f299b;
        C3021b c3021b;
        if (solverVariable.f299b != -1) {
            c3021b = this.f325b[i2];
            if (c3021b.f12758e) {
                c3021b.f12755b = (float) i;
                return;
            } else if (c3021b.f12757d.f308a == 0) {
                c3021b.f12758e = true;
                c3021b.f12755b = (float) i;
                return;
            } else {
                c3021b = m287c();
                c3021b.m14773b(solverVariable, i);
                m279a(c3021b);
                return;
            }
        }
        c3021b = m287c();
        c3021b.m14761a(solverVariable, i);
        m279a(c3021b);
    }

    /* renamed from: a */
    public static C3021b m263a(C0097e c0097e, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        C3021b c = c0097e.m287c();
        if (z) {
            c0097e.m266b(c);
        }
        return c.m14764a(solverVariable, solverVariable2, solverVariable3, f);
    }

    /* renamed from: a */
    public void m282a(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        SolverVariable a = m273a(constraintWidget3.mo41a(ConstraintAnchor.Type.LEFT));
        SolverVariable a2 = m273a(constraintWidget3.mo41a(ConstraintAnchor.Type.TOP));
        SolverVariable a3 = m273a(constraintWidget3.mo41a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a4 = m273a(constraintWidget3.mo41a(ConstraintAnchor.Type.BOTTOM));
        SolverVariable a5 = m273a(constraintWidget4.mo41a(ConstraintAnchor.Type.LEFT));
        SolverVariable a6 = m273a(constraintWidget4.mo41a(ConstraintAnchor.Type.TOP));
        SolverVariable a7 = m273a(constraintWidget4.mo41a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a8 = m273a(constraintWidget4.mo41a(ConstraintAnchor.Type.BOTTOM));
        C3021b c = m287c();
        double d = (double) f;
        double sin = Math.sin(d);
        SolverVariable solverVariable = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        SolverVariable solverVariable2 = a7;
        c.m14775b(a2, a4, a6, a8, (float) (sin * d2));
        m279a(c);
        c = m287c();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        c.m14775b(a, solverVariable, a5, solverVariable2, (float) (cos * d2));
        m279a(c);
    }
}
