package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.constraint.solver.widgets.e */
public class C4403e extends C3027o {
    private boolean aA = false;
    private C0112n aB;
    private int aC = 7;
    private boolean aD = false;
    private boolean aE = false;
    protected C0097e ai = new C0097e();
    int aj;
    int ak;
    int al;
    int am;
    int an = 0;
    int ao = 0;
    C0105d[] ap = new C0105d[4];
    C0105d[] aq = new C0105d[4];
    public List<C0106f> ar = new ArrayList();
    public boolean as = false;
    public boolean at = false;
    public boolean au = false;
    public int av = 0;
    public int aw = 0;
    public boolean ax = false;
    int ay = 0;

    /* renamed from: S */
    public boolean m24061S() {
        return false;
    }

    /* renamed from: a */
    public void mo42a(int i) {
        this.aC = i;
    }

    /* renamed from: J */
    public int mo40J() {
        return this.aC;
    }

    /* renamed from: u */
    public boolean m24070u(int i) {
        return (this.aC & i) == i;
    }

    /* renamed from: f */
    public void mo52f() {
        this.ai.m284b();
        this.aj = 0;
        this.al = 0;
        this.ak = 0;
        this.am = 0;
        this.ar.clear();
        this.ax = false;
        super.mo52f();
    }

    /* renamed from: K */
    public boolean m24053K() {
        return this.aD;
    }

    /* renamed from: L */
    public boolean m24054L() {
        return this.aE;
    }

    /* renamed from: d */
    public boolean m24067d(C0097e c0097e) {
        mo43a(c0097e);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.az.get(i);
            if (constraintWidget instanceof C4403e) {
                DimensionBehaviour dimensionBehaviour = constraintWidget.f408C[0];
                DimensionBehaviour dimensionBehaviour2 = constraintWidget.f408C[1];
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m331a(DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m344b(DimensionBehaviour.FIXED);
                }
                constraintWidget.mo43a(c0097e);
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m331a(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m344b(dimensionBehaviour2);
                }
            } else {
                C0108i.m422a(this, c0097e, constraintWidget);
                constraintWidget.mo43a(c0097e);
            }
        }
        if (this.an > 0) {
            C0104c.m408a(this, c0097e, 0);
        }
        if (this.ao > 0) {
            C0104c.m408a(this, c0097e, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void m24063a(C0097e c0097e, boolean[] zArr) {
        zArr[2] = false;
        mo46c(c0097e);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.az.get(i);
            constraintWidget.mo46c(c0097e);
            if (constraintWidget.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m380p() < constraintWidget.m382q()) {
                zArr[2] = true;
            }
            if (constraintWidget.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m384r() < constraintWidget.m386s()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void m24065a(boolean z) {
        this.aA = z;
    }

    /* renamed from: M */
    public boolean m24055M() {
        return this.aA;
    }

    /* renamed from: b */
    public void mo45b(int i) {
        super.mo45b(i);
        int size = this.az.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.az.get(i2)).mo45b(i);
        }
    }

    /* renamed from: N */
    public void mo3720N() {
        Object obj;
        Object obj2;
        int i;
        int i2;
        ConstraintWidget constraintWidget;
        Object obj3;
        int i3;
        boolean z;
        int i4;
        Object obj4;
        Exception e;
        boolean d;
        PrintStream printStream;
        boolean z2;
        StringBuilder stringBuilder;
        int i5;
        ConstraintWidget constraintWidget2;
        int i6;
        int i7;
        boolean z3;
        int i8 = this.I;
        int i9 = this.J;
        int max = Math.max(0, m380p());
        int max2 = Math.max(0, m384r());
        this.aD = false;
        this.aE = false;
        if (this.D != null) {
            if (r1.aB == null) {
                r1.aB = new C0112n(r1);
            }
            r1.aB.m433a(r1);
            m364h(r1.aj);
            m367i(r1.ak);
            m317E();
            mo50a(r1.ai.m292g());
        } else {
            r1.I = 0;
            r1.J = 0;
        }
        int i10 = 32;
        if (r1.aC != 0) {
            if (!m24070u(8)) {
                m24059Q();
            }
            if (!m24070u(32)) {
                m24060R();
            }
            r1.ai.f326c = true;
        } else {
            r1.ai.f326c = false;
        }
        DimensionBehaviour dimensionBehaviour = r1.C[1];
        DimensionBehaviour dimensionBehaviour2 = r1.C[0];
        m24049V();
        if (r1.ar.size() == 0) {
            r1.ar.clear();
            r1.ar.add(0, new C0106f(r1.az));
        }
        int size = r1.ar.size();
        ArrayList arrayList = r1.az;
        if (m318F() != DimensionBehaviour.WRAP_CONTENT) {
            if (m319G() != DimensionBehaviour.WRAP_CONTENT) {
                obj = null;
                obj2 = null;
                i = 0;
                while (i < size && !r1.ax) {
                    if (((C0106f) r1.ar.get(i)).f477d) {
                        if (m24070u(i10)) {
                            if (m318F() == DimensionBehaviour.FIXED || m319G() != DimensionBehaviour.FIXED) {
                                r1.az = (ArrayList) ((C0106f) r1.ar.get(i)).f474a;
                            } else {
                                r1.az = (ArrayList) ((C0106f) r1.ar.get(i)).m415a();
                            }
                        }
                        m24049V();
                        i10 = r1.az.size();
                        for (i2 = 0; i2 < i10; i2++) {
                            constraintWidget = (ConstraintWidget) r1.az.get(i2);
                            if (constraintWidget instanceof C3027o) {
                                ((C3027o) constraintWidget).mo3720N();
                            }
                        }
                        obj3 = obj2;
                        i3 = 0;
                        z = true;
                        while (z) {
                            boolean z4 = z;
                            i4 = i3 + 1;
                            try {
                                r1.ai.m284b();
                                m24049V();
                                m343b(r1.ai);
                                i3 = 0;
                                while (i3 < i10) {
                                    obj4 = obj3;
                                    try {
                                        ((ConstraintWidget) r1.az.get(i3)).m343b(r1.ai);
                                        i3++;
                                        obj3 = obj4;
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                }
                                obj4 = obj3;
                                d = m24067d(r1.ai);
                                if (d) {
                                    try {
                                        r1.ai.m291f();
                                    } catch (Exception e3) {
                                        e = e3;
                                        e.printStackTrace();
                                        printStream = System.out;
                                        z2 = d;
                                        stringBuilder = new StringBuilder();
                                        i5 = size;
                                        stringBuilder.append("EXCEPTION : ");
                                        stringBuilder.append(e);
                                        printStream.println(stringBuilder.toString());
                                        if (!z2) {
                                            mo46c(r1.ai);
                                            for (i2 = 0; i2 < i10; i2++) {
                                                constraintWidget2 = (ConstraintWidget) r1.az.get(i2);
                                                if (constraintWidget2.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                                                }
                                                if (constraintWidget2.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                                                }
                                            }
                                        } else {
                                            m24063a(r1.ai, C0108i.f486a);
                                        }
                                        i6 = 2;
                                        if (obj == null) {
                                        }
                                        i7 = i4;
                                        obj3 = obj4;
                                        z3 = false;
                                        i4 = Math.max(r1.P, m380p());
                                        if (i4 > m380p()) {
                                            m369j(i4);
                                            r1.C[0] = DimensionBehaviour.FIXED;
                                            z3 = true;
                                            obj3 = 1;
                                        }
                                        i4 = Math.max(r1.Q, m384r());
                                        if (i4 <= m384r()) {
                                            m371k(i4);
                                            d = true;
                                            r1.C[1] = DimensionBehaviour.FIXED;
                                            z3 = true;
                                            obj3 = 1;
                                        } else {
                                            d = true;
                                        }
                                        if (obj3 == null) {
                                            r1.aD = d;
                                            r1.C[0] = DimensionBehaviour.FIXED;
                                            m369j(max);
                                            z3 = true;
                                            obj3 = 1;
                                            r1.aE = d;
                                            r1.C[d] = DimensionBehaviour.FIXED;
                                            m371k(max2);
                                            z = true;
                                            obj3 = 1;
                                            size = i5;
                                            i3 = i7;
                                        }
                                        z = z3;
                                        size = i5;
                                        i3 = i7;
                                    }
                                }
                                z2 = d;
                                i5 = size;
                            } catch (Exception e4) {
                                e = e4;
                                obj4 = obj3;
                                d = z4;
                                e.printStackTrace();
                                printStream = System.out;
                                z2 = d;
                                stringBuilder = new StringBuilder();
                                i5 = size;
                                stringBuilder.append("EXCEPTION : ");
                                stringBuilder.append(e);
                                printStream.println(stringBuilder.toString());
                                if (!z2) {
                                    mo46c(r1.ai);
                                    for (i2 = 0; i2 < i10; i2++) {
                                        constraintWidget2 = (ConstraintWidget) r1.az.get(i2);
                                        if (constraintWidget2.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                                        }
                                        if (constraintWidget2.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                                        }
                                    }
                                } else {
                                    m24063a(r1.ai, C0108i.f486a);
                                }
                                i6 = 2;
                                if (obj == null) {
                                }
                                i7 = i4;
                                obj3 = obj4;
                                z3 = false;
                                i4 = Math.max(r1.P, m380p());
                                if (i4 > m380p()) {
                                    m369j(i4);
                                    r1.C[0] = DimensionBehaviour.FIXED;
                                    z3 = true;
                                    obj3 = 1;
                                }
                                i4 = Math.max(r1.Q, m384r());
                                if (i4 <= m384r()) {
                                    d = true;
                                } else {
                                    m371k(i4);
                                    d = true;
                                    r1.C[1] = DimensionBehaviour.FIXED;
                                    z3 = true;
                                    obj3 = 1;
                                }
                                if (obj3 == null) {
                                    r1.aD = d;
                                    r1.C[0] = DimensionBehaviour.FIXED;
                                    m369j(max);
                                    z3 = true;
                                    obj3 = 1;
                                    r1.aE = d;
                                    r1.C[d] = DimensionBehaviour.FIXED;
                                    m371k(max2);
                                    z = true;
                                    obj3 = 1;
                                    size = i5;
                                    i3 = i7;
                                }
                                z = z3;
                                size = i5;
                                i3 = i7;
                            }
                            if (!z2) {
                                mo46c(r1.ai);
                                while (i2 < i10) {
                                    constraintWidget2 = (ConstraintWidget) r1.az.get(i2);
                                    if (constraintWidget2.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget2.m380p() >= constraintWidget2.m382q()) {
                                        if (constraintWidget2.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.m384r() < constraintWidget2.m386s()) {
                                            i6 = 2;
                                            C0108i.f486a[2] = true;
                                            break;
                                        }
                                    } else {
                                        C0108i.f486a[2] = true;
                                        break;
                                    }
                                }
                            }
                            m24063a(r1.ai, C0108i.f486a);
                            i6 = 2;
                            if (obj == null && i4 < 8 && C0108i.f486a[r9]) {
                                i3 = 0;
                                i6 = 0;
                                size = 0;
                                while (i3 < i10) {
                                    ConstraintWidget constraintWidget3 = (ConstraintWidget) r1.az.get(i3);
                                    i7 = i4;
                                    i6 = Math.max(i6, constraintWidget3.f414I + constraintWidget3.m380p());
                                    size = Math.max(size, constraintWidget3.f415J + constraintWidget3.m384r());
                                    i3++;
                                    i4 = i7;
                                }
                                i7 = i4;
                                i3 = Math.max(r1.P, i6);
                                i4 = Math.max(r1.Q, size);
                                if (dimensionBehaviour2 != DimensionBehaviour.WRAP_CONTENT || m380p() >= i3) {
                                    z3 = false;
                                } else {
                                    m369j(i3);
                                    r1.C[0] = DimensionBehaviour.WRAP_CONTENT;
                                    z3 = true;
                                    obj4 = 1;
                                }
                                if (dimensionBehaviour != DimensionBehaviour.WRAP_CONTENT || m384r() >= i4) {
                                    obj3 = obj4;
                                } else {
                                    m371k(i4);
                                    r1.C[1] = DimensionBehaviour.WRAP_CONTENT;
                                    z3 = true;
                                    obj3 = 1;
                                }
                            } else {
                                i7 = i4;
                                obj3 = obj4;
                                z3 = false;
                            }
                            i4 = Math.max(r1.P, m380p());
                            if (i4 > m380p()) {
                                m369j(i4);
                                r1.C[0] = DimensionBehaviour.FIXED;
                                z3 = true;
                                obj3 = 1;
                            }
                            i4 = Math.max(r1.Q, m384r());
                            if (i4 <= m384r()) {
                                m371k(i4);
                                d = true;
                                r1.C[1] = DimensionBehaviour.FIXED;
                                z3 = true;
                                obj3 = 1;
                            } else {
                                d = true;
                            }
                            if (obj3 == null) {
                                if (r1.C[0] == DimensionBehaviour.WRAP_CONTENT && max > 0 && m380p() > max) {
                                    r1.aD = d;
                                    r1.C[0] = DimensionBehaviour.FIXED;
                                    m369j(max);
                                    z3 = true;
                                    obj3 = 1;
                                }
                                if (r1.C[d] == DimensionBehaviour.WRAP_CONTENT && max2 > 0 && m384r() > max2) {
                                    r1.aE = d;
                                    r1.C[d] = DimensionBehaviour.FIXED;
                                    m371k(max2);
                                    z = true;
                                    obj3 = 1;
                                    size = i5;
                                    i3 = i7;
                                }
                            }
                            z = z3;
                            size = i5;
                            i3 = i7;
                        }
                        obj4 = obj3;
                        i5 = size;
                        ((C0106f) r1.ar.get(i)).m419b();
                        obj2 = obj4;
                    } else {
                        i5 = size;
                    }
                    i++;
                    size = i5;
                    i10 = 32;
                }
                r1.az = arrayList;
                if (r1.D == null) {
                    i8 = Math.max(r1.P, m380p());
                    i9 = Math.max(r1.Q, m384r());
                    r1.aB.m434b(r1);
                    m369j((i8 + r1.aj) + r1.al);
                    m371k((i9 + r1.ak) + r1.am);
                } else {
                    r1.I = i8;
                    r1.J = i9;
                }
                if (obj2 != null) {
                    r1.C[0] = dimensionBehaviour2;
                    r1.C[1] = dimensionBehaviour;
                }
                mo50a(r1.ai.m292g());
                if (r1 == m14819T()) {
                    mo49D();
                }
            }
        }
        obj = 1;
        obj2 = null;
        i = 0;
        while (i < size) {
            if (((C0106f) r1.ar.get(i)).f477d) {
                if (m24070u(i10)) {
                    if (m318F() == DimensionBehaviour.FIXED) {
                    }
                    r1.az = (ArrayList) ((C0106f) r1.ar.get(i)).f474a;
                }
                m24049V();
                i10 = r1.az.size();
                for (i2 = 0; i2 < i10; i2++) {
                    constraintWidget = (ConstraintWidget) r1.az.get(i2);
                    if (constraintWidget instanceof C3027o) {
                        ((C3027o) constraintWidget).mo3720N();
                    }
                }
                obj3 = obj2;
                i3 = 0;
                z = true;
                while (z) {
                    boolean z42 = z;
                    i4 = i3 + 1;
                    r1.ai.m284b();
                    m24049V();
                    m343b(r1.ai);
                    i3 = 0;
                    while (i3 < i10) {
                        obj4 = obj3;
                        ((ConstraintWidget) r1.az.get(i3)).m343b(r1.ai);
                        i3++;
                        obj3 = obj4;
                    }
                    obj4 = obj3;
                    d = m24067d(r1.ai);
                    if (d) {
                        r1.ai.m291f();
                    }
                    z2 = d;
                    i5 = size;
                    if (!z2) {
                        mo46c(r1.ai);
                        for (i2 = 0; i2 < i10; i2++) {
                            constraintWidget2 = (ConstraintWidget) r1.az.get(i2);
                            if (constraintWidget2.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                            }
                            if (constraintWidget2.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                            }
                        }
                    } else {
                        m24063a(r1.ai, C0108i.f486a);
                    }
                    i6 = 2;
                    if (obj == null) {
                    }
                    i7 = i4;
                    obj3 = obj4;
                    z3 = false;
                    i4 = Math.max(r1.P, m380p());
                    if (i4 > m380p()) {
                        m369j(i4);
                        r1.C[0] = DimensionBehaviour.FIXED;
                        z3 = true;
                        obj3 = 1;
                    }
                    i4 = Math.max(r1.Q, m384r());
                    if (i4 <= m384r()) {
                        d = true;
                    } else {
                        m371k(i4);
                        d = true;
                        r1.C[1] = DimensionBehaviour.FIXED;
                        z3 = true;
                        obj3 = 1;
                    }
                    if (obj3 == null) {
                        r1.aD = d;
                        r1.C[0] = DimensionBehaviour.FIXED;
                        m369j(max);
                        z3 = true;
                        obj3 = 1;
                        r1.aE = d;
                        r1.C[d] = DimensionBehaviour.FIXED;
                        m371k(max2);
                        z = true;
                        obj3 = 1;
                        size = i5;
                        i3 = i7;
                    }
                    z = z3;
                    size = i5;
                    i3 = i7;
                }
                obj4 = obj3;
                i5 = size;
                ((C0106f) r1.ar.get(i)).m419b();
                obj2 = obj4;
            } else {
                i5 = size;
            }
            i++;
            size = i5;
            i10 = 32;
        }
        r1.az = arrayList;
        if (r1.D == null) {
            r1.I = i8;
            r1.J = i9;
        } else {
            i8 = Math.max(r1.P, m380p());
            i9 = Math.max(r1.Q, m384r());
            r1.aB.m434b(r1);
            m369j((i8 + r1.aj) + r1.al);
            m371k((i9 + r1.ak) + r1.am);
        }
        if (obj2 != null) {
            r1.C[0] = dimensionBehaviour2;
            r1.C[1] = dimensionBehaviour;
        }
        mo50a(r1.ai.m292g());
        if (r1 == m14819T()) {
            mo49D();
        }
    }

    /* renamed from: O */
    public void m24057O() {
        m24059Q();
        mo45b(this.aC);
    }

    /* renamed from: P */
    public void m24058P() {
        C3025k a = mo41a(Type.LEFT).m296a();
        C3025k a2 = mo41a(Type.TOP).m296a();
        a.m14805a(null, 0.0f);
        a2.m14805a(null, 0.0f);
    }

    /* renamed from: f */
    public void m24069f(int i, int i2) {
        if (!(this.C[0] == DimensionBehaviour.WRAP_CONTENT || this.c == null)) {
            this.c.m14814a(i);
        }
        if (this.C[1] != DimensionBehaviour.WRAP_CONTENT && this.d != 0) {
            this.d.m14814a(i2);
        }
    }

    /* renamed from: Q */
    public void m24059Q() {
        int size = this.az.size();
        mo3718b();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.az.get(i)).mo3718b();
        }
    }

    /* renamed from: R */
    public void m24060R() {
        if (!m24070u(8)) {
            mo45b(this.aC);
        }
        m24058P();
    }

    /* renamed from: V */
    private void m24049V() {
        this.an = 0;
        this.ao = 0;
    }

    /* renamed from: a */
    void m24064a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m24050d(constraintWidget);
        } else if (i == 1) {
            m24051e(constraintWidget);
        }
    }

    /* renamed from: d */
    private void m24050d(ConstraintWidget constraintWidget) {
        if (this.an + 1 >= this.aq.length) {
            this.aq = (C0105d[]) Arrays.copyOf(this.aq, this.aq.length * 2);
        }
        this.aq[this.an] = new C0105d(constraintWidget, 0, m24055M());
        this.an++;
    }

    /* renamed from: e */
    private void m24051e(ConstraintWidget constraintWidget) {
        if (this.ao + 1 >= this.ap.length) {
            this.ap = (C0105d[]) Arrays.copyOf(this.ap, this.ap.length * 2);
        }
        this.ap[this.ao] = new C0105d(constraintWidget, 1, m24055M());
        this.ao += 1;
    }
}
