package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.C0098f;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.b */
public class C4402b extends C3024h {
    private int ak = 0;
    private ArrayList<C3025k> al = new ArrayList(4);
    private boolean am = true;

    /* renamed from: a */
    public boolean mo44a() {
        return true;
    }

    /* renamed from: a */
    public void mo42a(int i) {
        this.ak = i;
    }

    /* renamed from: a */
    public void m24044a(boolean z) {
        this.am = z;
    }

    /* renamed from: b */
    public void mo3718b() {
        super.mo3718b();
        this.al.clear();
    }

    /* renamed from: b */
    public void mo45b(int i) {
        if (this.D != 0 && ((C4403e) this.D).m24070u(2) != 0) {
            int i2;
            ConstraintWidget constraintWidget;
            C3025k a;
            switch (this.ak) {
                case 0:
                    i = this.s.m296a();
                    break;
                case 1:
                    i = this.u.m296a();
                    break;
                case 2:
                    i = this.t.m296a();
                    break;
                case 3:
                    i = this.v.m296a();
                    break;
                default:
                    return;
            }
            i.m14809b(5);
            if (this.ak != 0) {
                if (this.ak != 1) {
                    this.s.m296a().m14805a(null, 0.0f);
                    this.u.m296a().m14805a(null, 0.0f);
                    this.al.clear();
                    for (i2 = 0; i2 < this.aj; i2++) {
                        constraintWidget = this.ai[i2];
                        if (!this.am || constraintWidget.mo44a()) {
                            switch (this.ak) {
                                case 0:
                                    a = constraintWidget.f449s.m296a();
                                    break;
                                case 1:
                                    a = constraintWidget.f451u.m296a();
                                    break;
                                case 2:
                                    a = constraintWidget.f450t.m296a();
                                    break;
                                case 3:
                                    a = constraintWidget.f452v.m296a();
                                    break;
                                default:
                                    a = null;
                                    break;
                            }
                            if (a != null) {
                                this.al.add(a);
                                a.m426a(i);
                            }
                        }
                    }
                }
            }
            this.t.m296a().m14805a(null, 0.0f);
            this.v.m296a().m14805a(null, 0.0f);
            this.al.clear();
            for (i2 = 0; i2 < this.aj; i2++) {
                constraintWidget = this.ai[i2];
                if (this.am) {
                }
                switch (this.ak) {
                    case 0:
                        a = constraintWidget.f449s.m296a();
                        break;
                    case 1:
                        a = constraintWidget.f451u.m296a();
                        break;
                    case 2:
                        a = constraintWidget.f450t.m296a();
                        break;
                    case 3:
                        a = constraintWidget.f452v.m296a();
                        break;
                    default:
                        a = null;
                        break;
                }
                if (a != null) {
                    this.al.add(a);
                    a.m426a(i);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3719c() {
        C3025k a;
        float f = Float.MAX_VALUE;
        switch (this.ak) {
            case 0:
                a = this.s.m296a();
                break;
            case 1:
                a = this.u.m296a();
                break;
            case 2:
                a = this.t.m296a();
                break;
            case 3:
                a = this.v.m296a();
                break;
            default:
                return;
        }
        f = 0.0f;
        int size = this.al.size();
        C3025k c3025k = null;
        int i = 0;
        while (i < size) {
            C3025k c3025k2 = (C3025k) this.al.get(i);
            if (c3025k2.i == 1) {
                if (this.ak != 0) {
                    if (this.ak != 2) {
                        if (c3025k2.f12766f > f) {
                            f = c3025k2.f12766f;
                            c3025k = c3025k2.f12765e;
                        }
                        i++;
                    }
                }
                if (c3025k2.f12766f < f) {
                    f = c3025k2.f12766f;
                    c3025k = c3025k2.f12765e;
                }
                i++;
            } else {
                return;
            }
        }
        if (C0097e.m264a() != null) {
            C0098f a2 = C0097e.m264a();
            a2.f369z++;
        }
        a.f12765e = c3025k;
        a.f12766f = f;
        a.m429f();
        switch (this.ak) {
            case 0:
                this.u.m296a().m14805a(c3025k, f);
                break;
            case 1:
                this.s.m296a().m14805a(c3025k, f);
                break;
            case 2:
                this.v.m296a().m14805a(c3025k, f);
                break;
            case 3:
                this.t.m296a().m14805a(c3025k, f);
                break;
            default:
                return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo43a(android.support.constraint.solver.C0097e r11) {
        /*
        r10 = this;
        r0 = r10.A;
        r1 = r10.s;
        r2 = 0;
        r0[r2] = r1;
        r0 = r10.A;
        r1 = r10.t;
        r3 = 2;
        r0[r3] = r1;
        r0 = r10.A;
        r1 = r10.u;
        r4 = 1;
        r0[r4] = r1;
        r0 = r10.A;
        r1 = r10.v;
        r5 = 3;
        r0[r5] = r1;
        r0 = 0;
    L_0x001d:
        r1 = r10.A;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0033;
    L_0x0022:
        r1 = r10.A;
        r1 = r1[r0];
        r6 = r10.A;
        r6 = r6[r0];
        r6 = r11.m273a(r6);
        r1.f393f = r6;
        r0 = r0 + 1;
        goto L_0x001d;
    L_0x0033:
        r0 = r10.ak;
        if (r0 < 0) goto L_0x015b;
    L_0x0037:
        r0 = r10.ak;
        r1 = 4;
        if (r0 >= r1) goto L_0x015b;
    L_0x003c:
        r0 = r10.A;
        r1 = r10.ak;
        r0 = r0[r1];
        r1 = 0;
    L_0x0043:
        r6 = r10.aj;
        if (r1 >= r6) goto L_0x007c;
    L_0x0047:
        r6 = r10.ai;
        r6 = r6[r1];
        r7 = r10.am;
        if (r7 != 0) goto L_0x0056;
    L_0x004f:
        r7 = r6.mo44a();
        if (r7 != 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0079;
    L_0x0056:
        r7 = r10.ak;
        if (r7 == 0) goto L_0x005e;
    L_0x005a:
        r7 = r10.ak;
        if (r7 != r4) goto L_0x0068;
    L_0x005e:
        r7 = r6.m318F();
        r8 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r7 != r8) goto L_0x0068;
    L_0x0066:
        r1 = 1;
        goto L_0x007d;
    L_0x0068:
        r7 = r10.ak;
        if (r7 == r3) goto L_0x0070;
    L_0x006c:
        r7 = r10.ak;
        if (r7 != r5) goto L_0x0079;
    L_0x0070:
        r6 = r6.m319G();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r6 != r7) goto L_0x0079;
    L_0x0078:
        goto L_0x0066;
    L_0x0079:
        r1 = r1 + 1;
        goto L_0x0043;
    L_0x007c:
        r1 = 0;
    L_0x007d:
        r6 = r10.ak;
        if (r6 == 0) goto L_0x0093;
    L_0x0081:
        r6 = r10.ak;
        if (r6 != r4) goto L_0x0086;
    L_0x0085:
        goto L_0x0093;
    L_0x0086:
        r6 = r10.m370k();
        r6 = r6.m319G();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x0092:
        goto L_0x009f;
    L_0x0093:
        r6 = r10.m370k();
        r6 = r6.m318F();
        r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r6 != r7) goto L_0x00a0;
    L_0x009f:
        r1 = 0;
    L_0x00a0:
        r6 = 0;
    L_0x00a1:
        r7 = r10.aj;
        if (r6 >= r7) goto L_0x00dd;
    L_0x00a5:
        r7 = r10.ai;
        r7 = r7[r6];
        r8 = r10.am;
        if (r8 != 0) goto L_0x00b4;
    L_0x00ad:
        r8 = r7.mo44a();
        if (r8 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00da;
    L_0x00b4:
        r8 = r7.f406A;
        r9 = r10.ak;
        r8 = r8[r9];
        r8 = r11.m273a(r8);
        r7 = r7.f406A;
        r9 = r10.ak;
        r7 = r7[r9];
        r7.f393f = r8;
        r7 = r10.ak;
        if (r7 == 0) goto L_0x00d5;
    L_0x00ca:
        r7 = r10.ak;
        if (r7 != r3) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00d5;
    L_0x00cf:
        r7 = r0.f393f;
        r11.m278a(r7, r8, r1);
        goto L_0x00da;
    L_0x00d5:
        r7 = r0.f393f;
        r11.m286b(r7, r8, r1);
    L_0x00da:
        r6 = r6 + 1;
        goto L_0x00a1;
    L_0x00dd:
        r0 = r10.ak;
        r6 = 5;
        r7 = 6;
        if (r0 != 0) goto L_0x00fe;
    L_0x00e3:
        r0 = r10.u;
        r0 = r0.f393f;
        r3 = r10.s;
        r3 = r3.f393f;
        r11.m288c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x00f0:
        r0 = r10.s;
        r0 = r0.f393f;
        r1 = r10.D;
        r1 = r1.f451u;
        r1 = r1.f393f;
        r11.m288c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x00fe:
        r0 = r10.ak;
        if (r0 != r4) goto L_0x011d;
    L_0x0102:
        r0 = r10.s;
        r0 = r0.f393f;
        r3 = r10.u;
        r3 = r3.f393f;
        r11.m288c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x010f:
        r0 = r10.s;
        r0 = r0.f393f;
        r1 = r10.D;
        r1 = r1.f449s;
        r1 = r1.f393f;
        r11.m288c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x011d:
        r0 = r10.ak;
        if (r0 != r3) goto L_0x013c;
    L_0x0121:
        r0 = r10.v;
        r0 = r0.f393f;
        r3 = r10.t;
        r3 = r3.f393f;
        r11.m288c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x012e:
        r0 = r10.t;
        r0 = r0.f393f;
        r1 = r10.D;
        r1 = r1.f452v;
        r1 = r1.f393f;
        r11.m288c(r0, r1, r2, r6);
        goto L_0x015a;
    L_0x013c:
        r0 = r10.ak;
        if (r0 != r5) goto L_0x015a;
    L_0x0140:
        r0 = r10.t;
        r0 = r0.f393f;
        r3 = r10.v;
        r3 = r3.f393f;
        r11.m288c(r0, r3, r2, r7);
        if (r1 != 0) goto L_0x015a;
    L_0x014d:
        r0 = r10.t;
        r0 = r0.f393f;
        r1 = r10.D;
        r1 = r1.f450t;
        r1 = r1.f393f;
        r11.m288c(r0, r1, r2, r6);
    L_0x015a:
        return;
    L_0x015b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.b.a(android.support.constraint.solver.e):void");
    }
}
