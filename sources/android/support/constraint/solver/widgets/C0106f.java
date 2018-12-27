package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.constraint.solver.widgets.f */
public class C0106f {
    /* renamed from: a */
    public List<ConstraintWidget> f474a;
    /* renamed from: b */
    int f475b = -1;
    /* renamed from: c */
    int f476c = -1;
    /* renamed from: d */
    public boolean f477d = false;
    /* renamed from: e */
    public final int[] f478e = new int[]{this.f475b, this.f476c};
    /* renamed from: f */
    List<ConstraintWidget> f479f = new ArrayList();
    /* renamed from: g */
    List<ConstraintWidget> f480g = new ArrayList();
    /* renamed from: h */
    HashSet<ConstraintWidget> f481h = new HashSet();
    /* renamed from: i */
    HashSet<ConstraintWidget> f482i = new HashSet();
    /* renamed from: j */
    List<ConstraintWidget> f483j = new ArrayList();
    /* renamed from: k */
    List<ConstraintWidget> f484k = new ArrayList();

    C0106f(List<ConstraintWidget> list) {
        this.f474a = list;
    }

    C0106f(List<ConstraintWidget> list, boolean z) {
        this.f474a = list;
        this.f477d = z;
    }

    /* renamed from: a */
    public List<ConstraintWidget> m416a(int i) {
        if (i == 0) {
            return this.f479f;
        }
        return i == 1 ? this.f480g : 0;
    }

    /* renamed from: b */
    Set<ConstraintWidget> m418b(int i) {
        if (i == 0) {
            return this.f481h;
        }
        return i == 1 ? this.f482i : 0;
    }

    /* renamed from: a */
    void m417a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            this.f481h.add(constraintWidget);
        } else if (i == 1) {
            this.f482i.add(constraintWidget);
        }
    }

    /* renamed from: a */
    List<ConstraintWidget> m415a() {
        if (!this.f483j.isEmpty()) {
            return this.f483j;
        }
        int size = this.f474a.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f474a.get(i);
            if (!constraintWidget.f427W) {
                m414a((ArrayList) this.f483j, constraintWidget);
            }
        }
        this.f484k.clear();
        this.f484k.addAll(this.f474a);
        this.f484k.removeAll(this.f483j);
        return this.f483j;
    }

    /* renamed from: a */
    private void m414a(ArrayList<ConstraintWidget> arrayList, ConstraintWidget constraintWidget) {
        if (!constraintWidget.f429Y) {
            arrayList.add(constraintWidget);
            constraintWidget.f429Y = true;
            if (!constraintWidget.m365h()) {
                if (constraintWidget instanceof C3024h) {
                    C3024h c3024h = (C3024h) constraintWidget;
                    int i = c3024h.aj;
                    for (int i2 = 0; i2 < i; i2++) {
                        m414a((ArrayList) arrayList, c3024h.ai[i2]);
                    }
                }
                for (ConstraintAnchor constraintAnchor : constraintWidget.f406A) {
                    ConstraintAnchor constraintAnchor2 = constraintAnchor2.f390c;
                    if (constraintAnchor2 != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor2.f388a;
                        if (!(constraintAnchor2 == null || constraintWidget2 == constraintWidget.m370k())) {
                            m414a((ArrayList) arrayList, constraintWidget2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    void m419b() {
        int size = this.f484k.size();
        for (int i = 0; i < size; i++) {
            m413a((ConstraintWidget) this.f484k.get(i));
        }
    }

    /* renamed from: a */
    private void m413a(ConstraintWidget constraintWidget) {
        if (constraintWidget.f427W && !constraintWidget.m365h()) {
            ConstraintAnchor constraintAnchor;
            int p;
            ConstraintAnchor constraintAnchor2;
            int i;
            Object obj = null;
            Object obj2 = constraintWidget.f451u.f390c != null ? 1 : null;
            if (obj2 != null) {
                constraintAnchor = constraintWidget.f451u.f390c;
            } else {
                constraintAnchor = constraintWidget.f449s.f390c;
            }
            if (constraintAnchor != null) {
                if (!constraintAnchor.f388a.f428X) {
                    m413a(constraintAnchor.f388a);
                }
                if (constraintAnchor.f389b == Type.RIGHT) {
                    p = constraintAnchor.f388a.m380p() + constraintAnchor.f388a.f414I;
                } else if (constraintAnchor.f389b == Type.LEFT) {
                    p = constraintAnchor.f388a.f414I;
                }
                if (obj2 == null) {
                    p -= constraintWidget.f451u.m304e();
                } else {
                    p += constraintWidget.f449s.m304e() + constraintWidget.m380p();
                }
                constraintWidget.m350c(p - constraintWidget.m380p(), p);
                if (constraintWidget.f453w.f390c == null) {
                    constraintAnchor2 = constraintWidget.f453w.f390c;
                    if (!constraintAnchor2.f388a.f428X) {
                        m413a(constraintAnchor2.f388a);
                    }
                    i = (constraintAnchor2.f388a.f415J + constraintAnchor2.f388a.f420O) - constraintWidget.f420O;
                    constraintWidget.m355d(i, constraintWidget.f411F + i);
                    constraintWidget.f428X = true;
                }
                if (constraintWidget.f452v.f390c != null) {
                    obj = 1;
                }
                if (obj == null) {
                    constraintAnchor2 = constraintWidget.f452v.f390c;
                } else {
                    constraintAnchor2 = constraintWidget.f450t.f390c;
                }
                if (constraintAnchor2 != null) {
                    if (!constraintAnchor2.f388a.f428X) {
                        m413a(constraintAnchor2.f388a);
                    }
                    if (constraintAnchor2.f389b == Type.BOTTOM) {
                        p = constraintAnchor2.f388a.f415J + constraintAnchor2.f388a.m384r();
                    } else if (constraintAnchor2.f389b == Type.TOP) {
                        p = constraintAnchor2.f388a.f415J;
                    }
                }
                if (obj == null) {
                    p -= constraintWidget.f452v.m304e();
                } else {
                    p += constraintWidget.f450t.m304e() + constraintWidget.m384r();
                }
                constraintWidget.m355d(p - constraintWidget.m384r(), p);
                constraintWidget.f428X = true;
                return;
            }
            p = 0;
            if (obj2 == null) {
                p += constraintWidget.f449s.m304e() + constraintWidget.m380p();
            } else {
                p -= constraintWidget.f451u.m304e();
            }
            constraintWidget.m350c(p - constraintWidget.m380p(), p);
            if (constraintWidget.f453w.f390c == null) {
                if (constraintWidget.f452v.f390c != null) {
                    obj = 1;
                }
                if (obj == null) {
                    constraintAnchor2 = constraintWidget.f450t.f390c;
                } else {
                    constraintAnchor2 = constraintWidget.f452v.f390c;
                }
                if (constraintAnchor2 != null) {
                    if (constraintAnchor2.f388a.f428X) {
                        m413a(constraintAnchor2.f388a);
                    }
                    if (constraintAnchor2.f389b == Type.BOTTOM) {
                        p = constraintAnchor2.f388a.f415J + constraintAnchor2.f388a.m384r();
                    } else if (constraintAnchor2.f389b == Type.TOP) {
                        p = constraintAnchor2.f388a.f415J;
                    }
                }
                if (obj == null) {
                    p += constraintWidget.f450t.m304e() + constraintWidget.m384r();
                } else {
                    p -= constraintWidget.f452v.m304e();
                }
                constraintWidget.m355d(p - constraintWidget.m384r(), p);
                constraintWidget.f428X = true;
                return;
            }
            constraintAnchor2 = constraintWidget.f453w.f390c;
            if (constraintAnchor2.f388a.f428X) {
                m413a(constraintAnchor2.f388a);
            }
            i = (constraintAnchor2.f388a.f415J + constraintAnchor2.f388a.f420O) - constraintWidget.f420O;
            constraintWidget.m355d(i, constraintWidget.f411F + i);
            constraintWidget.f428X = true;
        }
    }
}
