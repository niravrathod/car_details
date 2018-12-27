package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.constraint.solver.widgets.a */
public class C0103a {
    /* renamed from: a */
    public static void m402a(C4403e c4403e) {
        if ((c4403e.mo40J() & 32) != 32) {
            C0103a.m407b(c4403e);
            return;
        }
        boolean z;
        int i;
        int i2;
        c4403e.ax = true;
        c4403e.as = false;
        c4403e.at = false;
        c4403e.au = false;
        List<ConstraintWidget> list = c4403e.az;
        List<C0106f> list2 = c4403e.ar;
        Object obj = c4403e.m318F() == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
        Object obj2 = c4403e.m319G() == DimensionBehaviour.WRAP_CONTENT ? 1 : null;
        if (obj == null) {
            if (obj2 == null) {
                z = false;
                list2.clear();
                for (ConstraintWidget constraintWidget : list) {
                    constraintWidget.f448r = null;
                    constraintWidget.f429Y = false;
                    constraintWidget.mo3718b();
                }
                for (ConstraintWidget constraintWidget2 : list) {
                    if (constraintWidget2.f448r != null && !C0103a.m406a(constraintWidget2, (List) list2, r6)) {
                        C0103a.m407b(c4403e);
                        c4403e.ax = false;
                        return;
                    }
                }
                i = 0;
                i2 = 0;
                for (C0106f c0106f : list2) {
                    i = Math.max(i, C0103a.m399a(c0106f, 0));
                    i2 = Math.max(i2, C0103a.m399a(c0106f, 1));
                }
                if (obj != null) {
                    c4403e.m331a(DimensionBehaviour.FIXED);
                    c4403e.m369j(i);
                    c4403e.as = true;
                    c4403e.at = true;
                    c4403e.av = i;
                }
                if (obj2 != null) {
                    c4403e.m344b(DimensionBehaviour.FIXED);
                    c4403e.m371k(i2);
                    c4403e.as = true;
                    c4403e.au = true;
                    c4403e.aw = i2;
                }
                C0103a.m404a((List) list2, 0, c4403e.m380p());
                C0103a.m404a((List) list2, 1, c4403e.m384r());
            }
        }
        z = true;
        list2.clear();
        for (ConstraintWidget constraintWidget3 : list) {
            constraintWidget3.f448r = null;
            constraintWidget3.f429Y = false;
            constraintWidget3.mo3718b();
        }
        for (ConstraintWidget constraintWidget22 : list) {
            if (constraintWidget22.f448r != null) {
            }
        }
        i = 0;
        i2 = 0;
        for (C0106f c0106f2 : list2) {
            i = Math.max(i, C0103a.m399a(c0106f2, 0));
            i2 = Math.max(i2, C0103a.m399a(c0106f2, 1));
        }
        if (obj != null) {
            c4403e.m331a(DimensionBehaviour.FIXED);
            c4403e.m369j(i);
            c4403e.as = true;
            c4403e.at = true;
            c4403e.av = i;
        }
        if (obj2 != null) {
            c4403e.m344b(DimensionBehaviour.FIXED);
            c4403e.m371k(i2);
            c4403e.as = true;
            c4403e.au = true;
            c4403e.aw = i2;
        }
        C0103a.m404a((List) list2, 0, c4403e.m380p());
        C0103a.m404a((List) list2, 1, c4403e.m384r());
    }

    /* renamed from: a */
    private static boolean m406a(ConstraintWidget constraintWidget, List<C0106f> list, boolean z) {
        C0106f c0106f = new C0106f(new ArrayList(), true);
        list.add(c0106f);
        return C0103a.m405a(constraintWidget, c0106f, (List) list, z);
    }

    /* renamed from: a */
    private static boolean m405a(ConstraintWidget constraintWidget, C0106f c0106f, List<C0106f> list, boolean z) {
        if (constraintWidget == null) {
            return true;
        }
        constraintWidget.f428X = false;
        C4403e c4403e = (C4403e) constraintWidget.m370k();
        if (constraintWidget.f448r == null) {
            DimensionBehaviour G;
            DimensionBehaviour dimensionBehaviour;
            int i;
            constraintWidget.f427W = true;
            c0106f.f474a.add(constraintWidget);
            constraintWidget.f448r = c0106f;
            if (constraintWidget.f449s.f390c == null && constraintWidget.f451u.f390c == null && constraintWidget.f450t.f390c == null && constraintWidget.f452v.f390c == null && constraintWidget.f453w.f390c == null && constraintWidget.f456z.f390c == null) {
                C0103a.m403a(c4403e, constraintWidget, c0106f);
                if (z) {
                    return false;
                }
            }
            if (!(constraintWidget.f450t.f390c == null || constraintWidget.f452v.f390c == null)) {
                G = c4403e.m319G();
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (z) {
                    C0103a.m403a(c4403e, constraintWidget, c0106f);
                    return false;
                } else if (!(constraintWidget.f450t.f390c.f388a == constraintWidget.m370k() && constraintWidget.f452v.f390c.f388a == constraintWidget.m370k())) {
                    C0103a.m403a(c4403e, constraintWidget, c0106f);
                }
            }
            if (!(constraintWidget.f449s.f390c == null || constraintWidget.f451u.f390c == null)) {
                G = c4403e.m318F();
                dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (z) {
                    C0103a.m403a(c4403e, constraintWidget, c0106f);
                    return false;
                } else if (!(constraintWidget.f449s.f390c.f388a == constraintWidget.m370k() && constraintWidget.f451u.f390c.f388a == constraintWidget.m370k())) {
                    C0103a.m403a(c4403e, constraintWidget, c0106f);
                }
            }
            if (((constraintWidget.m318F() == DimensionBehaviour.MATCH_CONSTRAINT ? 1 : 0) ^ (constraintWidget.m319G() == DimensionBehaviour.MATCH_CONSTRAINT ? 1 : 0)) != 0 && constraintWidget.f412G != 0.0f) {
                C0103a.m396a(constraintWidget);
            } else if (constraintWidget.m318F() == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.m319G() == DimensionBehaviour.MATCH_CONSTRAINT) {
                C0103a.m403a(c4403e, constraintWidget, c0106f);
                if (z) {
                    return false;
                }
            }
            if (((constraintWidget.f449s.f390c == null && constraintWidget.f451u.f390c == null) || ((constraintWidget.f449s.f390c != null && constraintWidget.f449s.f390c.f388a == constraintWidget.f409D && constraintWidget.f451u.f390c == null) || ((constraintWidget.f451u.f390c != null && constraintWidget.f451u.f390c.f388a == constraintWidget.f409D && constraintWidget.f449s.f390c == null) || (constraintWidget.f449s.f390c != null && constraintWidget.f449s.f390c.f388a == constraintWidget.f409D && constraintWidget.f451u.f390c != null && constraintWidget.f451u.f390c.f388a == constraintWidget.f409D)))) && constraintWidget.f456z.f390c == null && !(constraintWidget instanceof C3023g) && !(constraintWidget instanceof C3024h)) {
                c0106f.f479f.add(constraintWidget);
            }
            if (((constraintWidget.f450t.f390c == null && constraintWidget.f452v.f390c == null) || ((constraintWidget.f450t.f390c != null && constraintWidget.f450t.f390c.f388a == constraintWidget.f409D && constraintWidget.f452v.f390c == null) || ((constraintWidget.f452v.f390c != null && constraintWidget.f452v.f390c.f388a == constraintWidget.f409D && constraintWidget.f450t.f390c == null) || (constraintWidget.f450t.f390c != null && constraintWidget.f450t.f390c.f388a == constraintWidget.f409D && constraintWidget.f452v.f390c != null && constraintWidget.f452v.f390c.f388a == constraintWidget.f409D)))) && constraintWidget.f456z.f390c == null && constraintWidget.f453w.f390c == null && !(constraintWidget instanceof C3023g) && !(constraintWidget instanceof C3024h)) {
                c0106f.f480g.add(constraintWidget);
            }
            if (constraintWidget instanceof C3024h) {
                C0103a.m403a(c4403e, constraintWidget, c0106f);
                if (z) {
                    return false;
                }
                C3024h c3024h = (C3024h) constraintWidget;
                for (i = 0; i < c3024h.aj; i++) {
                    if (!C0103a.m405a(c3024h.ai[i], c0106f, (List) list, z)) {
                        return false;
                    }
                }
            }
            for (ConstraintAnchor constraintAnchor : constraintWidget.f406A) {
                if (!(constraintAnchor.f390c == null || constraintAnchor.f390c.f388a == constraintWidget.m370k())) {
                    if (constraintAnchor.f389b == Type.CENTER) {
                        C0103a.m403a(c4403e, constraintWidget, c0106f);
                        if (z) {
                            return false;
                        }
                    }
                    C0103a.m400a(constraintAnchor);
                    if (!C0103a.m405a(constraintAnchor.f390c.f388a, c0106f, (List) list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (constraintWidget.f448r != c0106f) {
            c0106f.f474a.addAll(constraintWidget.f448r.f474a);
            c0106f.f479f.addAll(constraintWidget.f448r.f479f);
            c0106f.f480g.addAll(constraintWidget.f448r.f480g);
            if (!constraintWidget.f448r.f477d) {
                c0106f.f477d = false;
            }
            list.remove(constraintWidget.f448r);
            for (ConstraintWidget constraintWidget2 : constraintWidget.f448r.f474a) {
                constraintWidget2.f448r = c0106f;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m403a(C4403e c4403e, ConstraintWidget constraintWidget, C0106f c0106f) {
        c0106f.f477d = false;
        c4403e.ax = false;
        constraintWidget.f427W = false;
    }

    /* renamed from: a */
    private static int m399a(C0106f c0106f, int i) {
        int i2 = i * 2;
        List a = c0106f.m416a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            boolean z;
            ConstraintWidget constraintWidget = (ConstraintWidget) a.get(i4);
            int i5 = i2 + 1;
            if (constraintWidget.f406A[i5].f390c != null) {
                if (constraintWidget.f406A[i2].f390c == null || constraintWidget.f406A[i5].f390c == null) {
                    z = false;
                    i3 = Math.max(i3, C0103a.m398a(constraintWidget, i, z, 0));
                }
            }
            z = true;
            i3 = Math.max(i3, C0103a.m398a(constraintWidget, i, z, 0));
        }
        c0106f.f478e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static int m398a(ConstraintWidget constraintWidget, int i, boolean z, int i2) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        int i3 = i;
        boolean z2 = z;
        int i4 = 0;
        if (!constraintWidget2.f427W) {
            return 0;
        }
        int A;
        int r;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj = (constraintWidget2.f453w.f390c == null || i3 != 1) ? null : 1;
        if (z2) {
            A = constraintWidget.m313A();
            r = constraintWidget.m384r() - constraintWidget.m313A();
            i5 = i3 * 2;
            i6 = i5 + 1;
        } else {
            A = constraintWidget.m384r() - constraintWidget.m313A();
            r = constraintWidget.m313A();
            i6 = i3 * 2;
            i5 = i6 + 1;
        }
        if (constraintWidget2.f406A[i6].f390c == null || constraintWidget2.f406A[i5].f390c != null) {
            i7 = i6;
            i6 = 1;
        } else {
            i7 = i5;
            i5 = i6;
            i6 = -1;
        }
        int e = (constraintWidget2.f406A[i5].m304e() * i6) + C0103a.m397a(constraintWidget, i);
        int i9 = (obj != null ? i2 - A : i2) + e;
        int p = (i3 == 0 ? constraintWidget.m380p() : constraintWidget.m384r()) * i6;
        Iterator it = constraintWidget2.f406A[i5].m296a().h.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, C0103a.m398a(((C3025k) ((C0110m) it.next())).f12761a.f388a, i3, z2, i9));
        }
        Iterator it2 = constraintWidget2.f406A[i7].m296a().h.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i10 = Math.max(i10, C0103a.m398a(((C3025k) ((C0110m) it2.next())).f12761a.f388a, i3, z2, p + i9));
            it2 = it3;
        }
        if (obj != null) {
            i4 -= A;
            i10 += r;
        } else {
            i10 += (i3 == 0 ? constraintWidget.m380p() : constraintWidget.m384r()) * i6;
        }
        int i11 = 1;
        int i12;
        if (i3 == 1) {
            it2 = constraintWidget2.f453w.m296a().h.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                Iterator it4 = it2;
                C3025k c3025k = (C3025k) ((C0110m) it2.next());
                if (i6 == i11) {
                    i13 = Math.max(i13, C0103a.m398a(c3025k.f12761a.f388a, i3, z2, A + i9));
                    i12 = i7;
                } else {
                    i12 = i7;
                    i13 = Math.max(i13, C0103a.m398a(c3025k.f12761a.f388a, i3, z2, (r * i6) + i9));
                }
                it2 = it4;
                i7 = i12;
                i11 = 1;
            }
            i12 = i7;
            i11 = i13;
            i8 = (constraintWidget2.f453w.m296a().h.size() <= 0 || obj != null) ? i11 : i6 == 1 ? i11 + A : i11 - r;
        } else {
            i12 = i7;
            i8 = 0;
        }
        e += Math.max(i4, Math.max(i10, i8));
        i8 = i9 + p;
        if (i6 == -1) {
            int i14 = i9;
            i9 = i8;
            i8 = i14;
        }
        if (z2) {
            C0108i.m421a(constraintWidget2, i3, i9);
            constraintWidget2.m325a(i9, i8, i3);
        } else {
            constraintWidget2.f448r.m417a(constraintWidget2, i3);
            constraintWidget2.m358e(i9, i3);
        }
        if (constraintWidget.m389t(i) == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.f412G != 0.0f) {
            constraintWidget2.f448r.m417a(constraintWidget2, i3);
        }
        if (!(constraintWidget2.f406A[i5].f390c == null || constraintWidget2.f406A[r21].f390c == null)) {
            ConstraintWidget k = constraintWidget.m370k();
            if (constraintWidget2.f406A[i5].f390c.f388a == k && constraintWidget2.f406A[r21].f390c.f388a == k) {
                constraintWidget2.f448r.m417a(constraintWidget2, i3);
            }
        }
        return e;
    }

    /* renamed from: a */
    private static void m400a(ConstraintAnchor constraintAnchor) {
        C0110m a = constraintAnchor.m296a();
        if (constraintAnchor.f390c != null && constraintAnchor.f390c.f390c != constraintAnchor) {
            constraintAnchor.f390c.m296a().m426a(a);
        }
    }

    /* renamed from: b */
    private static void m407b(C4403e c4403e) {
        c4403e.ar.clear();
        c4403e.ar.add(null, new C0106f(c4403e.az));
    }

    /* renamed from: a */
    public static void m404a(List<C0106f> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (ConstraintWidget constraintWidget : ((C0106f) list.get(i3)).m418b(i)) {
                if (constraintWidget.f427W) {
                    C0103a.m401a(constraintWidget, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m401a(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        ConstraintAnchor constraintAnchor = constraintWidget.f406A[i3];
        ConstraintAnchor constraintAnchor2 = constraintWidget.f406A[i3 + 1];
        Object obj = (constraintAnchor.f390c == null || constraintAnchor2.f390c == null) ? null : 1;
        if (obj != null) {
            C0108i.m421a(constraintWidget, i, C0103a.m397a(constraintWidget, i) + constraintAnchor.m304e());
        } else if (constraintWidget.f412G == 0.0f || constraintWidget.m389t(i) != DimensionBehaviour.MATCH_CONSTRAINT) {
            i2 -= constraintWidget.m381p(i);
            i3 = i2 - constraintWidget.m360f(i);
            constraintWidget.m325a(i3, i2, i);
            C0108i.m421a(constraintWidget, i, i3);
        } else {
            i2 = C0103a.m396a(constraintWidget);
            i3 = (int) constraintWidget.f406A[i3].m296a().f12766f;
            int i4 = i3 + i2;
            constraintAnchor2.m296a().f12765e = constraintAnchor.m296a();
            constraintAnchor2.m296a().f12766f = (float) i2;
            constraintAnchor2.m296a().i = 1;
            constraintWidget.m325a(i3, i4, i);
        }
    }

    /* renamed from: a */
    private static int m397a(ConstraintWidget constraintWidget, int i) {
        int i2 = i * 2;
        ConstraintAnchor constraintAnchor = constraintWidget.f406A[i2];
        ConstraintAnchor constraintAnchor2 = constraintWidget.f406A[i2 + 1];
        if (constraintAnchor.f390c == null || constraintAnchor.f390c.f388a != constraintWidget.f409D || constraintAnchor2.f390c == null || constraintAnchor2.f390c.f388a != constraintWidget.f409D) {
            return null;
        }
        return (int) (((float) (((constraintWidget.f409D.m360f(i) - constraintAnchor.m304e()) - constraintAnchor2.m304e()) - constraintWidget.m360f(i))) * (i == 0 ? constraintWidget.f423S : constraintWidget.f424T));
    }

    /* renamed from: a */
    private static int m396a(ConstraintWidget constraintWidget) {
        int r;
        if (constraintWidget.m318F() == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.f413H == 0) {
                r = (int) (((float) constraintWidget.m384r()) * constraintWidget.f412G);
            } else {
                r = (int) (((float) constraintWidget.m384r()) / constraintWidget.f412G);
            }
            constraintWidget.m369j(r);
            return r;
        } else if (constraintWidget.m319G() != DimensionBehaviour.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (constraintWidget.f413H == 1) {
                r = (int) (((float) constraintWidget.m380p()) * constraintWidget.f412G);
            } else {
                r = (int) (((float) constraintWidget.m380p()) / constraintWidget.f412G);
            }
            constraintWidget.m371k(r);
            return r;
        }
    }
}
