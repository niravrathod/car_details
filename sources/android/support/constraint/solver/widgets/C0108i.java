package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;

/* renamed from: android.support.constraint.solver.widgets.i */
public class C0108i {
    /* renamed from: a */
    static boolean[] f486a = new boolean[3];

    /* renamed from: a */
    static void m422a(C4403e c4403e, C0097e c0097e, ConstraintWidget constraintWidget) {
        if (c4403e.C[0] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f408C[0] == DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f449s.f391d;
            int p = c4403e.m380p() - constraintWidget.f451u.f391d;
            constraintWidget.f449s.f393f = c0097e.m273a(constraintWidget.f449s);
            constraintWidget.f451u.f393f = c0097e.m273a(constraintWidget.f451u);
            c0097e.m274a(constraintWidget.f449s.f393f, i);
            c0097e.m274a(constraintWidget.f451u.f393f, p);
            constraintWidget.f431a = 2;
            constraintWidget.m350c(i, p);
        }
        if (c4403e.C[1] != DimensionBehaviour.WRAP_CONTENT && constraintWidget.f408C[1] == DimensionBehaviour.MATCH_PARENT) {
            i = constraintWidget.f450t.f391d;
            int r = c4403e.m384r() - constraintWidget.f452v.f391d;
            constraintWidget.f450t.f393f = c0097e.m273a(constraintWidget.f450t);
            constraintWidget.f452v.f393f = c0097e.m273a(constraintWidget.f452v);
            c0097e.m274a(constraintWidget.f450t.f393f, i);
            c0097e.m274a(constraintWidget.f452v.f393f, r);
            if (constraintWidget.f420O > 0 || constraintWidget.m372l() == 8) {
                constraintWidget.f453w.f393f = c0097e.m273a(constraintWidget.f453w);
                c0097e.m274a(constraintWidget.f453w.f393f, constraintWidget.f420O + i);
            }
            constraintWidget.f432b = 2;
            constraintWidget.m355d(i, r);
        }
    }

    /* renamed from: a */
    private static boolean m423a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.f408C[i] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = 1;
        if (constraintWidget.f412G != 0.0f) {
            constraintWidget = constraintWidget.f408C;
            if (i != 0) {
                i2 = 0;
            }
            return constraintWidget[i2] == DimensionBehaviour.MATCH_CONSTRAINT ? false : false;
        } else {
            if (i != 0) {
                if (constraintWidget.f436f == 0 && constraintWidget.f441k == 0) {
                    if (constraintWidget.f442l != null) {
                    }
                }
                return false;
            } else if (constraintWidget.f435e == 0 && constraintWidget.f438h == 0 && constraintWidget.f439i == null) {
                return true;
            } else {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static void m420a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.m363g();
        C3025k a = constraintWidget2.f449s.m296a();
        C3025k a2 = constraintWidget2.f450t.m296a();
        C3025k a3 = constraintWidget2.f451u.m296a();
        C3025k a4 = constraintWidget2.f452v.m296a();
        Object obj = (i & 8) == 8 ? 1 : null;
        Object obj2 = (constraintWidget2.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT && C0108i.m423a(constraintWidget2, 0)) ? 1 : null;
        if (!(a.f12767g == 4 || a3.f12767g == 4)) {
            if (constraintWidget2.f408C[0] != DimensionBehaviour.FIXED) {
                if (obj2 == null || constraintWidget.m372l() != 8) {
                    if (obj2 != null) {
                        int p = constraintWidget.m380p();
                        a.m14809b(1);
                        a3.m14809b(1);
                        if (constraintWidget2.f449s.f390c == null && constraintWidget2.f451u.f390c == null) {
                            if (obj != null) {
                                a3.m14807a(a, 1, constraintWidget.m366i());
                            } else {
                                a3.m14806a(a, p);
                            }
                        } else if (constraintWidget2.f449s.f390c == null || constraintWidget2.f451u.f390c != null) {
                            if (constraintWidget2.f449s.f390c != null || constraintWidget2.f451u.f390c == null) {
                                if (!(constraintWidget2.f449s.f390c == null || constraintWidget2.f451u.f390c == null)) {
                                    if (obj != null) {
                                        constraintWidget.m366i().m426a(a);
                                        constraintWidget.m366i().m426a(a3);
                                    }
                                    if (constraintWidget2.f412G == 0.0f) {
                                        a.m14809b(3);
                                        a3.m14809b(3);
                                        a.m14810b(a3, 0.0f);
                                        a3.m14810b(a, 0.0f);
                                    } else {
                                        a.m14809b(2);
                                        a3.m14809b(2);
                                        a.m14810b(a3, (float) (-p));
                                        a3.m14810b(a, (float) p);
                                        constraintWidget2.m369j(p);
                                    }
                                }
                            } else if (obj != null) {
                                a.m14807a(a3, -1, constraintWidget.m366i());
                            } else {
                                a.m14806a(a3, -p);
                            }
                        } else if (obj != null) {
                            a3.m14807a(a, 1, constraintWidget.m366i());
                        } else {
                            a3.m14806a(a, p);
                        }
                    }
                }
            }
            if (constraintWidget2.f449s.f390c == null && constraintWidget2.f451u.f390c == null) {
                a.m14809b(1);
                a3.m14809b(1);
                if (obj != null) {
                    a3.m14807a(a, 1, constraintWidget.m366i());
                } else {
                    a3.m14806a(a, constraintWidget.m380p());
                }
            } else if (constraintWidget2.f449s.f390c != null && constraintWidget2.f451u.f390c == null) {
                a.m14809b(1);
                a3.m14809b(1);
                if (obj != null) {
                    a3.m14807a(a, 1, constraintWidget.m366i());
                } else {
                    a3.m14806a(a, constraintWidget.m380p());
                }
            } else if (constraintWidget2.f449s.f390c == null && constraintWidget2.f451u.f390c != null) {
                a.m14809b(1);
                a3.m14809b(1);
                a.m14806a(a3, -constraintWidget.m380p());
                if (obj != null) {
                    a.m14807a(a3, -1, constraintWidget.m366i());
                } else {
                    a.m14806a(a3, -constraintWidget.m380p());
                }
            } else if (!(constraintWidget2.f449s.f390c == null || constraintWidget2.f451u.f390c == null)) {
                a.m14809b(2);
                a3.m14809b(2);
                if (obj != null) {
                    constraintWidget.m366i().m426a(a);
                    constraintWidget.m366i().m426a(a3);
                    a.m14811b(a3, -1, constraintWidget.m366i());
                    a3.m14811b(a, 1, constraintWidget.m366i());
                } else {
                    a.m14810b(a3, (float) (-constraintWidget.m380p()));
                    a3.m14810b(a, (float) constraintWidget.m380p());
                }
            }
        }
        Object obj3 = (constraintWidget2.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT && C0108i.m423a(constraintWidget2, 1)) ? 1 : null;
        if (a2.f12767g != 4 && a4.f12767g != 4) {
            if (constraintWidget2.f408C[1] != DimensionBehaviour.FIXED) {
                if (obj3 == null || constraintWidget.m372l() != 8) {
                    if (obj3 != null) {
                        int r = constraintWidget.m384r();
                        a2.m14809b(1);
                        a4.m14809b(1);
                        if (constraintWidget2.f450t.f390c == null && constraintWidget2.f452v.f390c == null) {
                            if (obj != null) {
                                a4.m14807a(a2, 1, constraintWidget.m368j());
                                return;
                            } else {
                                a4.m14806a(a2, r);
                                return;
                            }
                        } else if (constraintWidget2.f450t.f390c == null || constraintWidget2.f452v.f390c != null) {
                            if (constraintWidget2.f450t.f390c != null || constraintWidget2.f452v.f390c == null) {
                                if (constraintWidget2.f450t.f390c != null && constraintWidget2.f452v.f390c != null) {
                                    if (obj != null) {
                                        constraintWidget.m368j().m426a(a2);
                                        constraintWidget.m366i().m426a(a4);
                                    }
                                    if (constraintWidget2.f412G == 0.0f) {
                                        a2.m14809b(3);
                                        a4.m14809b(3);
                                        a2.m14810b(a4, 0.0f);
                                        a4.m14810b(a2, 0.0f);
                                        return;
                                    }
                                    a2.m14809b(2);
                                    a4.m14809b(2);
                                    a2.m14810b(a4, (float) (-r));
                                    a4.m14810b(a2, (float) r);
                                    constraintWidget2.m371k(r);
                                    if (constraintWidget2.f420O > 0) {
                                        constraintWidget2.f453w.m296a().m14803a(1, a2, constraintWidget2.f420O);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (obj != null) {
                                a2.m14807a(a4, -1, constraintWidget.m368j());
                                return;
                            } else {
                                a2.m14806a(a4, -r);
                                return;
                            }
                        } else if (obj != null) {
                            a4.m14807a(a2, 1, constraintWidget.m368j());
                            return;
                        } else {
                            a4.m14806a(a2, r);
                            return;
                        }
                    }
                    return;
                }
            }
            if (constraintWidget2.f450t.f390c == null && constraintWidget2.f452v.f390c == null) {
                a2.m14809b(1);
                a4.m14809b(1);
                if (obj != null) {
                    a4.m14807a(a2, 1, constraintWidget.m368j());
                } else {
                    a4.m14806a(a2, constraintWidget.m384r());
                }
                if (constraintWidget2.f453w.f390c != null) {
                    constraintWidget2.f453w.m296a().m14809b(1);
                    a2.m14803a(1, constraintWidget2.f453w.m296a(), -constraintWidget2.f420O);
                }
            } else if (constraintWidget2.f450t.f390c != null && constraintWidget2.f452v.f390c == null) {
                a2.m14809b(1);
                a4.m14809b(1);
                if (obj != null) {
                    a4.m14807a(a2, 1, constraintWidget.m368j());
                } else {
                    a4.m14806a(a2, constraintWidget.m384r());
                }
                if (constraintWidget2.f420O > 0) {
                    constraintWidget2.f453w.m296a().m14803a(1, a2, constraintWidget2.f420O);
                }
            } else if (constraintWidget2.f450t.f390c == null && constraintWidget2.f452v.f390c != null) {
                a2.m14809b(1);
                a4.m14809b(1);
                if (obj != null) {
                    a2.m14807a(a4, -1, constraintWidget.m368j());
                } else {
                    a2.m14806a(a4, -constraintWidget.m384r());
                }
                if (constraintWidget2.f420O > 0) {
                    constraintWidget2.f453w.m296a().m14803a(1, a2, constraintWidget2.f420O);
                }
            } else if (constraintWidget2.f450t.f390c != null && constraintWidget2.f452v.f390c != null) {
                a2.m14809b(2);
                a4.m14809b(2);
                if (obj != null) {
                    a2.m14811b(a4, -1, constraintWidget.m368j());
                    a4.m14811b(a2, 1, constraintWidget.m368j());
                    constraintWidget.m368j().m426a(a2);
                    constraintWidget.m366i().m426a(a4);
                } else {
                    a2.m14810b(a4, (float) (-constraintWidget.m384r()));
                    a4.m14810b(a2, (float) constraintWidget.m384r());
                }
                if (constraintWidget2.f420O > 0) {
                    constraintWidget2.f453w.m296a().m14803a(1, a2, constraintWidget2.f420O);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static boolean m424a(android.support.constraint.solver.widgets.C4403e r22, android.support.constraint.solver.C0097e r23, int r24, int r25, android.support.constraint.solver.widgets.C0105d r26) {
        /*
        r0 = r23;
        r1 = r24;
        r2 = r26;
        r3 = r2.f457a;
        r4 = r2.f459c;
        r5 = r2.f458b;
        r6 = r2.f460d;
        r7 = r2.f461e;
        r8 = r2.f467k;
        r9 = r2.f462f;
        r2 = r2.f463g;
        r9 = r22;
        r2 = r9.C;
        r2 = r2[r1];
        r9 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        r2 = 2;
        r10 = 1;
        if (r1 != 0) goto L_0x0038;
    L_0x0022:
        r11 = r7.f430Z;
        if (r11 != 0) goto L_0x0028;
    L_0x0026:
        r11 = 1;
        goto L_0x0029;
    L_0x0028:
        r11 = 0;
    L_0x0029:
        r12 = r7.f430Z;
        if (r12 != r10) goto L_0x002f;
    L_0x002d:
        r12 = 1;
        goto L_0x0030;
    L_0x002f:
        r12 = 0;
    L_0x0030:
        r7 = r7.f430Z;
        if (r7 != r2) goto L_0x0036;
    L_0x0034:
        r2 = 1;
        goto L_0x004b;
    L_0x0036:
        r2 = 0;
        goto L_0x004b;
    L_0x0038:
        r11 = r7.aa;
        if (r11 != 0) goto L_0x003e;
    L_0x003c:
        r11 = 1;
        goto L_0x003f;
    L_0x003e:
        r11 = 0;
    L_0x003f:
        r12 = r7.aa;
        if (r12 != r10) goto L_0x0045;
    L_0x0043:
        r12 = 1;
        goto L_0x0046;
    L_0x0045:
        r12 = 0;
    L_0x0046:
        r7 = r7.aa;
        if (r7 != r2) goto L_0x0036;
    L_0x004a:
        goto L_0x0034;
    L_0x004b:
        r14 = r3;
        r7 = 0;
        r10 = 0;
        r13 = 0;
        r15 = 0;
        r17 = 0;
    L_0x0052:
        r9 = 8;
        if (r13 != 0) goto L_0x010f;
    L_0x0056:
        r18 = r13;
        r13 = r14.m372l();
        if (r13 == r9) goto L_0x00a1;
    L_0x005e:
        r10 = r10 + 1;
        if (r1 != 0) goto L_0x0069;
    L_0x0062:
        r13 = r14.m380p();
        r13 = (float) r13;
        r15 = r15 + r13;
        goto L_0x006f;
    L_0x0069:
        r13 = r14.m384r();
        r13 = (float) r13;
        r15 = r15 + r13;
    L_0x006f:
        if (r14 == r5) goto L_0x007b;
    L_0x0071:
        r13 = r14.f406A;
        r13 = r13[r25];
        r13 = r13.m304e();
        r13 = (float) r13;
        r15 = r15 + r13;
    L_0x007b:
        if (r14 == r6) goto L_0x0089;
    L_0x007d:
        r13 = r14.f406A;
        r19 = r25 + 1;
        r13 = r13[r19];
        r13 = r13.m304e();
        r13 = (float) r13;
        r15 = r15 + r13;
    L_0x0089:
        r13 = r14.f406A;
        r13 = r13[r25];
        r13 = r13.m304e();
        r13 = (float) r13;
        r17 = r17 + r13;
        r13 = r14.f406A;
        r19 = r25 + 1;
        r13 = r13[r19];
        r13 = r13.m304e();
        r13 = (float) r13;
        r17 = r17 + r13;
    L_0x00a1:
        r13 = r14.f406A;
        r13 = r13[r25];
        r13 = r14.m372l();
        if (r13 == r9) goto L_0x00e0;
    L_0x00ab:
        r9 = r14.f408C;
        r9 = r9[r1];
        r13 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (r9 != r13) goto L_0x00e0;
    L_0x00b3:
        r7 = r7 + 1;
        if (r1 != 0) goto L_0x00c7;
    L_0x00b7:
        r9 = r14.f435e;
        if (r9 == 0) goto L_0x00bd;
    L_0x00bb:
        r9 = 0;
        return r9;
    L_0x00bd:
        r9 = 0;
        r13 = r14.f438h;
        if (r13 != 0) goto L_0x00c6;
    L_0x00c2:
        r13 = r14.f439i;
        if (r13 == 0) goto L_0x00d6;
    L_0x00c6:
        return r9;
    L_0x00c7:
        r9 = 0;
        r13 = r14.f436f;
        if (r13 == 0) goto L_0x00cd;
    L_0x00cc:
        return r9;
    L_0x00cd:
        r13 = r14.f441k;
        if (r13 != 0) goto L_0x00df;
    L_0x00d1:
        r13 = r14.f442l;
        if (r13 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00df;
    L_0x00d6:
        r13 = r14.f412G;
        r16 = 0;
        r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1));
        if (r13 == 0) goto L_0x00e0;
    L_0x00de:
        return r9;
    L_0x00df:
        return r9;
    L_0x00e0:
        r9 = r14.f406A;
        r13 = r25 + 1;
        r9 = r9[r13];
        r9 = r9.f390c;
        if (r9 == 0) goto L_0x0102;
    L_0x00ea:
        r9 = r9.f388a;
        r13 = r9.f406A;
        r13 = r13[r25];
        r13 = r13.f390c;
        if (r13 == 0) goto L_0x0102;
    L_0x00f4:
        r13 = r9.f406A;
        r13 = r13[r25];
        r13 = r13.f390c;
        r13 = r13.f388a;
        if (r13 == r14) goto L_0x00ff;
    L_0x00fe:
        goto L_0x0102;
    L_0x00ff:
        r20 = r9;
        goto L_0x0104;
    L_0x0102:
        r20 = 0;
    L_0x0104:
        if (r20 == 0) goto L_0x010c;
    L_0x0106:
        r13 = r18;
        r14 = r20;
        goto L_0x0052;
    L_0x010c:
        r13 = 1;
        goto L_0x0052;
    L_0x010f:
        r13 = r3.f406A;
        r13 = r13[r25];
        r13 = r13.m296a();
        r9 = r4.f406A;
        r18 = r25 + 1;
        r9 = r9[r18];
        r9 = r9.m296a();
        r21 = r3;
        r3 = r13.f12763c;
        if (r3 == 0) goto L_0x039d;
    L_0x0127:
        r3 = r9.f12763c;
        if (r3 != 0) goto L_0x012d;
    L_0x012b:
        goto L_0x039d;
    L_0x012d:
        r3 = r13.f12763c;
        r3 = r3.i;
        r0 = 1;
        if (r3 != r0) goto L_0x039b;
    L_0x0134:
        r3 = r9.f12763c;
        r3 = r3.i;
        if (r3 == r0) goto L_0x013c;
    L_0x013a:
        goto L_0x039b;
    L_0x013c:
        if (r7 <= 0) goto L_0x0142;
    L_0x013e:
        if (r7 == r10) goto L_0x0142;
    L_0x0140:
        r0 = 0;
        return r0;
    L_0x0142:
        if (r2 != 0) goto L_0x014b;
    L_0x0144:
        if (r11 != 0) goto L_0x014b;
    L_0x0146:
        if (r12 == 0) goto L_0x0149;
    L_0x0148:
        goto L_0x014b;
    L_0x0149:
        r0 = 0;
        goto L_0x0164;
    L_0x014b:
        if (r5 == 0) goto L_0x0157;
    L_0x014d:
        r0 = r5.f406A;
        r0 = r0[r25];
        r0 = r0.m304e();
        r0 = (float) r0;
        goto L_0x0158;
    L_0x0157:
        r0 = 0;
    L_0x0158:
        if (r6 == 0) goto L_0x0164;
    L_0x015a:
        r3 = r6.f406A;
        r3 = r3[r18];
        r3 = r3.m304e();
        r3 = (float) r3;
        r0 = r0 + r3;
    L_0x0164:
        r3 = r13.f12763c;
        r3 = r3.f12766f;
        r6 = r9.f12763c;
        r6 = r6.f12766f;
        r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r9 >= 0) goto L_0x0173;
    L_0x0170:
        r6 = r6 - r3;
        r6 = r6 - r15;
        goto L_0x0176;
    L_0x0173:
        r6 = r3 - r6;
        r6 = r6 - r15;
    L_0x0176:
        r19 = 1;
        if (r7 <= 0) goto L_0x022f;
    L_0x017a:
        if (r7 != r10) goto L_0x022f;
    L_0x017c:
        r0 = r14.m370k();
        if (r0 == 0) goto L_0x0190;
    L_0x0182:
        r0 = r14.m370k();
        r0 = r0.f408C;
        r0 = r0[r1];
        r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (r0 != r2) goto L_0x0190;
    L_0x018e:
        r0 = 0;
        return r0;
    L_0x0190:
        r6 = r6 + r15;
        r6 = r6 - r17;
        r0 = r21;
    L_0x0195:
        if (r0 == 0) goto L_0x022d;
    L_0x0197:
        r2 = android.support.constraint.solver.C0097e.f322g;
        if (r2 == 0) goto L_0x01b3;
    L_0x019b:
        r2 = android.support.constraint.solver.C0097e.f322g;
        r9 = r2.f341B;
        r9 = r9 - r19;
        r2.f341B = r9;
        r2 = android.support.constraint.solver.C0097e.f322g;
        r9 = r2.f362s;
        r9 = r9 + r19;
        r2.f362s = r9;
        r2 = android.support.constraint.solver.C0097e.f322g;
        r9 = r2.f368y;
        r9 = r9 + r19;
        r2.f368y = r9;
    L_0x01b3:
        r2 = r0.af;
        r2 = r2[r1];
        if (r2 != 0) goto L_0x01bf;
    L_0x01b9:
        if (r0 != r4) goto L_0x01bc;
    L_0x01bb:
        goto L_0x01bf;
    L_0x01bc:
        r9 = r23;
        goto L_0x022a;
    L_0x01bf:
        r5 = (float) r7;
        r5 = r6 / r5;
        r9 = 0;
        r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r10 <= 0) goto L_0x01da;
    L_0x01c7:
        r5 = r0.ad;
        r5 = r5[r1];
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x01d3;
    L_0x01d1:
        r5 = 0;
        goto L_0x01da;
    L_0x01d3:
        r5 = r0.ad;
        r5 = r5[r1];
        r5 = r5 * r6;
        r5 = r5 / r8;
    L_0x01da:
        r9 = r0.m372l();
        r10 = 8;
        if (r9 != r10) goto L_0x01e3;
    L_0x01e2:
        r5 = 0;
    L_0x01e3:
        r9 = r0.f406A;
        r9 = r9[r25];
        r9 = r9.m304e();
        r9 = (float) r9;
        r3 = r3 + r9;
        r9 = r0.f406A;
        r9 = r9[r25];
        r9 = r9.m296a();
        r10 = r13.f12765e;
        r9.m14805a(r10, r3);
        r9 = r0.f406A;
        r9 = r9[r18];
        r9 = r9.m296a();
        r10 = r13.f12765e;
        r3 = r3 + r5;
        r9.m14805a(r10, r3);
        r5 = r0.f406A;
        r5 = r5[r25];
        r5 = r5.m296a();
        r9 = r23;
        r5.m14804a(r9);
        r5 = r0.f406A;
        r5 = r5[r18];
        r5 = r5.m296a();
        r5.m14804a(r9);
        r0 = r0.f406A;
        r0 = r0[r18];
        r0 = r0.m304e();
        r0 = (float) r0;
        r3 = r3 + r0;
    L_0x022a:
        r0 = r2;
        goto L_0x0195;
    L_0x022d:
        r0 = 1;
        return r0;
    L_0x022f:
        r9 = r23;
        r7 = 0;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x0239;
    L_0x0236:
        r2 = 1;
        r11 = 0;
        r12 = 0;
    L_0x0239:
        if (r2 == 0) goto L_0x02c2;
    L_0x023b:
        r6 = r6 - r0;
        r2 = r21;
        r0 = r2.m362g(r1);
        r6 = r6 * r0;
        r3 = r3 + r6;
    L_0x0245:
        if (r2 == 0) goto L_0x02bf;
    L_0x0247:
        r0 = android.support.constraint.solver.C0097e.f322g;
        if (r0 == 0) goto L_0x0263;
    L_0x024b:
        r0 = android.support.constraint.solver.C0097e.f322g;
        r5 = r0.f341B;
        r5 = r5 - r19;
        r0.f341B = r5;
        r0 = android.support.constraint.solver.C0097e.f322g;
        r5 = r0.f362s;
        r5 = r5 + r19;
        r0.f362s = r5;
        r0 = android.support.constraint.solver.C0097e.f322g;
        r5 = r0.f368y;
        r5 = r5 + r19;
        r0.f368y = r5;
    L_0x0263:
        r0 = r2.af;
        r0 = r0[r1];
        if (r0 != 0) goto L_0x026b;
    L_0x0269:
        if (r2 != r4) goto L_0x02bd;
    L_0x026b:
        if (r1 != 0) goto L_0x0273;
    L_0x026d:
        r5 = r2.m380p();
        r5 = (float) r5;
        goto L_0x0278;
    L_0x0273:
        r5 = r2.m384r();
        r5 = (float) r5;
    L_0x0278:
        r6 = r2.f406A;
        r6 = r6[r25];
        r6 = r6.m304e();
        r6 = (float) r6;
        r3 = r3 + r6;
        r6 = r2.f406A;
        r6 = r6[r25];
        r6 = r6.m296a();
        r7 = r13.f12765e;
        r6.m14805a(r7, r3);
        r6 = r2.f406A;
        r6 = r6[r18];
        r6 = r6.m296a();
        r7 = r13.f12765e;
        r3 = r3 + r5;
        r6.m14805a(r7, r3);
        r5 = r2.f406A;
        r5 = r5[r25];
        r5 = r5.m296a();
        r5.m14804a(r9);
        r5 = r2.f406A;
        r5 = r5[r18];
        r5 = r5.m296a();
        r5.m14804a(r9);
        r2 = r2.f406A;
        r2 = r2[r18];
        r2 = r2.m304e();
        r2 = (float) r2;
        r3 = r3 + r2;
    L_0x02bd:
        r2 = r0;
        goto L_0x0245;
    L_0x02bf:
        r0 = 1;
        goto L_0x039a;
    L_0x02c2:
        r2 = r21;
        if (r11 != 0) goto L_0x02c8;
    L_0x02c6:
        if (r12 == 0) goto L_0x02bf;
    L_0x02c8:
        if (r11 == 0) goto L_0x02cc;
    L_0x02ca:
        r6 = r6 - r0;
        goto L_0x02cf;
    L_0x02cc:
        if (r12 == 0) goto L_0x02cf;
    L_0x02ce:
        r6 = r6 - r0;
    L_0x02cf:
        r0 = r10 + 1;
        r0 = (float) r0;
        r0 = r6 / r0;
        if (r12 == 0) goto L_0x02e3;
    L_0x02d6:
        r7 = 1;
        if (r10 <= r7) goto L_0x02df;
    L_0x02d9:
        r0 = r10 + -1;
        r0 = (float) r0;
        r0 = r6 / r0;
        goto L_0x02e3;
    L_0x02df:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r6 / r0;
    L_0x02e3:
        r6 = r2.m372l();
        r7 = 8;
        if (r6 == r7) goto L_0x02ee;
    L_0x02eb:
        r6 = r3 + r0;
        goto L_0x02ef;
    L_0x02ee:
        r6 = r3;
    L_0x02ef:
        if (r12 == 0) goto L_0x02fe;
    L_0x02f1:
        r7 = 1;
        if (r10 <= r7) goto L_0x02fe;
    L_0x02f4:
        r6 = r5.f406A;
        r6 = r6[r25];
        r6 = r6.m304e();
        r6 = (float) r6;
        r6 = r6 + r3;
    L_0x02fe:
        if (r11 == 0) goto L_0x030c;
    L_0x0300:
        if (r5 == 0) goto L_0x030c;
    L_0x0302:
        r3 = r5.f406A;
        r3 = r3[r25];
        r3 = r3.m304e();
        r3 = (float) r3;
        r6 = r6 + r3;
    L_0x030c:
        if (r2 == 0) goto L_0x02bf;
    L_0x030e:
        r3 = android.support.constraint.solver.C0097e.f322g;
        if (r3 == 0) goto L_0x032a;
    L_0x0312:
        r3 = android.support.constraint.solver.C0097e.f322g;
        r7 = r3.f341B;
        r7 = r7 - r19;
        r3.f341B = r7;
        r3 = android.support.constraint.solver.C0097e.f322g;
        r7 = r3.f362s;
        r7 = r7 + r19;
        r3.f362s = r7;
        r3 = android.support.constraint.solver.C0097e.f322g;
        r7 = r3.f368y;
        r7 = r7 + r19;
        r3.f368y = r7;
    L_0x032a:
        r3 = r2.af;
        r3 = r3[r1];
        if (r3 != 0) goto L_0x0336;
    L_0x0330:
        if (r2 != r4) goto L_0x0333;
    L_0x0332:
        goto L_0x0336;
    L_0x0333:
        r7 = 8;
        goto L_0x0397;
    L_0x0336:
        if (r1 != 0) goto L_0x033e;
    L_0x0338:
        r7 = r2.m380p();
        r7 = (float) r7;
        goto L_0x0343;
    L_0x033e:
        r7 = r2.m384r();
        r7 = (float) r7;
    L_0x0343:
        if (r2 == r5) goto L_0x034f;
    L_0x0345:
        r8 = r2.f406A;
        r8 = r8[r25];
        r8 = r8.m304e();
        r8 = (float) r8;
        r6 = r6 + r8;
    L_0x034f:
        r8 = r2.f406A;
        r8 = r8[r25];
        r8 = r8.m296a();
        r10 = r13.f12765e;
        r8.m14805a(r10, r6);
        r8 = r2.f406A;
        r8 = r8[r18];
        r8 = r8.m296a();
        r10 = r13.f12765e;
        r11 = r6 + r7;
        r8.m14805a(r10, r11);
        r8 = r2.f406A;
        r8 = r8[r25];
        r8 = r8.m296a();
        r8.m14804a(r9);
        r8 = r2.f406A;
        r8 = r8[r18];
        r8 = r8.m296a();
        r8.m14804a(r9);
        r2 = r2.f406A;
        r2 = r2[r18];
        r2 = r2.m304e();
        r2 = (float) r2;
        r7 = r7 + r2;
        r6 = r6 + r7;
        if (r3 == 0) goto L_0x0333;
    L_0x038e:
        r2 = r3.m372l();
        r7 = 8;
        if (r2 == r7) goto L_0x0397;
    L_0x0396:
        r6 = r6 + r0;
    L_0x0397:
        r2 = r3;
        goto L_0x030c;
    L_0x039a:
        return r0;
    L_0x039b:
        r0 = 0;
        return r0;
    L_0x039d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.i.a(android.support.constraint.solver.widgets.e, android.support.constraint.solver.e, int, int, android.support.constraint.solver.widgets.d):boolean");
    }

    /* renamed from: a */
    static void m421a(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.f406A[i3].m296a().f12765e = constraintWidget.m370k().f449s.m296a();
        constraintWidget.f406A[i3].m296a().f12766f = (float) i2;
        constraintWidget.f406A[i3].m296a().i = 1;
        constraintWidget.f406A[i4].m296a().f12765e = constraintWidget.f406A[i3].m296a();
        constraintWidget.f406A[i4].m296a().f12766f = (float) constraintWidget.m360f(i);
        constraintWidget.f406A[i4].m296a().i = 1;
    }
}
