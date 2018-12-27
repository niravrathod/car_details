package com.cuvora.carinfo.videomodule.ui.model;

import com.cuvora.carinfo.videomodule.utils.C1621b;
import com.feedbox.data.network.model.Action;
import com.feedbox.data.network.model.Content;
import com.feedbox.data.network.model.Images;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.model.e */
public final class C1608e {
    /* renamed from: a */
    public static final C3730d m6143a(Content content, String str, int i, String str2) {
        C2885g.m13910b(content, "$receiver");
        C2885g.m13910b(str, "railType");
        C2885g.m13910b(str2, "railId");
        String a = content.m7689a();
        if (a != null) {
            Object obj = null;
            if ((((CharSequence) a).length() > 0 ? 1 : null) == 1) {
                String a2;
                String l;
                String h;
                StringBuilder stringBuilder;
                C1621b c1621b;
                String stringBuilder2;
                String m;
                String str3;
                Action c;
                CtAction a3;
                CtAction ctAction;
                String b;
                String a4 = content.m7689a();
                if (a4 == null) {
                    a4 = "";
                }
                String d = content.m7692d();
                if (d == null) {
                    d = "";
                }
                String f = content.m7694f();
                if (f == null) {
                    f = "";
                }
                Images e = content.m7693e();
                if (e != null) {
                    a2 = e.m7703a();
                    if (a2 != null) {
                        l = content.m7700l();
                        if (l != null) {
                            l = "";
                        }
                        h = content.m7696h();
                        if (h != null) {
                            if (h.length() > 0) {
                                obj = 1;
                            }
                            if (obj == 1) {
                                stringBuilder = new StringBuilder();
                                c1621b = C1621b.f4881a;
                                h = content.m7696h();
                                if (h == null) {
                                    C2885g.m13906a();
                                }
                                stringBuilder.append(c1621b.m6198a(Long.parseLong(h)));
                                stringBuilder.append(" Views");
                                stringBuilder2 = stringBuilder.toString();
                                h = stringBuilder2;
                                m = content.m7701m();
                                stringBuilder2 = content.m7697i();
                                if (stringBuilder2 == null) {
                                    stringBuilder2 = "";
                                }
                                str3 = stringBuilder2;
                                c = content.m7691c();
                                if (c != null) {
                                    a3 = C1606a.m6141a(c);
                                    if (a3 != null) {
                                        ctAction = a3;
                                        b = content.m7690b();
                                        if (b == null) {
                                            b = "";
                                        }
                                        return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                                    }
                                }
                                ctAction = new CtAction(CtActionType.f4817a, null, null, null, null, null, null, null, 254, null);
                                b = content.m7690b();
                                if (b == null) {
                                    b = "";
                                }
                                return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                            }
                        }
                        stringBuilder2 = "";
                        h = stringBuilder2;
                        m = content.m7701m();
                        stringBuilder2 = content.m7697i();
                        if (stringBuilder2 == null) {
                            stringBuilder2 = "";
                        }
                        str3 = stringBuilder2;
                        c = content.m7691c();
                        if (c != null) {
                            a3 = C1606a.m6141a(c);
                            if (a3 != null) {
                                ctAction = a3;
                                b = content.m7690b();
                                if (b == null) {
                                    b = "";
                                }
                                return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                            }
                        }
                        ctAction = new CtAction(CtActionType.f4817a, null, null, null, null, null, null, null, 254, null);
                        b = content.m7690b();
                        if (b == null) {
                            b = "";
                        }
                        return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                    }
                }
                a2 = "";
                l = content.m7700l();
                if (l != null) {
                    l = "";
                }
                h = content.m7696h();
                if (h != null) {
                    if (h.length() > 0) {
                        obj = 1;
                    }
                    if (obj == 1) {
                        stringBuilder = new StringBuilder();
                        c1621b = C1621b.f4881a;
                        h = content.m7696h();
                        if (h == null) {
                            C2885g.m13906a();
                        }
                        stringBuilder.append(c1621b.m6198a(Long.parseLong(h)));
                        stringBuilder.append(" Views");
                        stringBuilder2 = stringBuilder.toString();
                        h = stringBuilder2;
                        m = content.m7701m();
                        stringBuilder2 = content.m7697i();
                        if (stringBuilder2 == null) {
                            stringBuilder2 = "";
                        }
                        str3 = stringBuilder2;
                        c = content.m7691c();
                        if (c != null) {
                            a3 = C1606a.m6141a(c);
                            if (a3 != null) {
                                ctAction = a3;
                                b = content.m7690b();
                                if (b == null) {
                                    b = "";
                                }
                                return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                            }
                        }
                        ctAction = new CtAction(CtActionType.f4817a, null, null, null, null, null, null, null, 254, null);
                        b = content.m7690b();
                        if (b == null) {
                            b = "";
                        }
                        return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                    }
                }
                stringBuilder2 = "";
                h = stringBuilder2;
                m = content.m7701m();
                stringBuilder2 = content.m7697i();
                if (stringBuilder2 == null) {
                    stringBuilder2 = "";
                }
                str3 = stringBuilder2;
                c = content.m7691c();
                if (c != null) {
                    a3 = C1606a.m6141a(c);
                    if (a3 != null) {
                        ctAction = a3;
                        b = content.m7690b();
                        if (b == null) {
                            b = "";
                        }
                        return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
                    }
                }
                ctAction = new CtAction(CtActionType.f4817a, null, null, null, null, null, null, null, 254, null);
                b = content.m7690b();
                if (b == null) {
                    b = "";
                }
                return new C3730d(str2, a4, d, f, a2, l, h, m, str3, str, i, ctAction, b);
            }
        }
        return null;
    }
}
