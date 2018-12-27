package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C2870i;
import kotlin.collections.C4740e;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2878b;
import kotlin.p151b.C4324c;
import kotlin.p151b.C4739g;
import kotlin.p153d.C2873a;
import kotlin.p153d.C4838f;

/* renamed from: kotlin.text.o */
class C4886o extends C4883n {
    /* renamed from: c */
    public static final int m30241c(CharSequence charSequence) {
        C2885g.m13910b(charSequence, "$receiver");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    public static final String m30225a(CharSequence charSequence, C4324c c4324c) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(c4324c, "range");
        return charSequence.subSequence(c4324c.m23703f().intValue(), c4324c.m23704g().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final boolean m30232a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(charSequence2, "other");
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3) {
            if (i2 <= charSequence2.length() - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!C4333c.m23719a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ int m30221a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return C4886o.m30220a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static final int m30220a(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
        /*
        r0 = 0;
        if (r11 != 0) goto L_0x0017;
    L_0x0003:
        r8 = kotlin.p151b.C4739g.m27464c(r8, r0);
        r11 = new kotlin.b.c;
        r0 = r6.length();
        r9 = kotlin.p151b.C4739g.m27465d(r9, r0);
        r11.<init>(r8, r9);
        r11 = (kotlin.p151b.C2861a) r11;
        goto L_0x0027;
    L_0x0017:
        r11 = kotlin.text.C4886o.m30241c(r6);
        r8 = kotlin.p151b.C4739g.m27465d(r8, r11);
        r9 = kotlin.p151b.C4739g.m27464c(r9, r0);
        r11 = kotlin.p151b.C4739g.m27462a(r8, r9);
    L_0x0027:
        r8 = r6 instanceof java.lang.String;
        if (r8 == 0) goto L_0x005a;
    L_0x002b:
        r8 = r7 instanceof java.lang.String;
        if (r8 == 0) goto L_0x005a;
    L_0x002f:
        r8 = r11.m13875a();
        r9 = r11.m13876b();
        r11 = r11.m13877c();
        if (r11 <= 0) goto L_0x0040;
    L_0x003d:
        if (r8 > r9) goto L_0x0081;
    L_0x003f:
        goto L_0x0042;
    L_0x0040:
        if (r8 < r9) goto L_0x0081;
    L_0x0042:
        r0 = r7;
        r0 = (java.lang.String) r0;
        r1 = 0;
        r2 = r6;
        r2 = (java.lang.String) r2;
        r4 = r7.length();
        r3 = r8;
        r5 = r10;
        r0 = kotlin.text.C4883n.m30194a(r0, r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0056;
    L_0x0055:
        return r8;
    L_0x0056:
        if (r8 == r9) goto L_0x0081;
    L_0x0058:
        r8 = r8 + r11;
        goto L_0x0042;
    L_0x005a:
        r8 = r11.m13875a();
        r9 = r11.m13876b();
        r11 = r11.m13877c();
        if (r11 <= 0) goto L_0x006b;
    L_0x0068:
        if (r8 > r9) goto L_0x0081;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        if (r8 < r9) goto L_0x0081;
    L_0x006d:
        r1 = 0;
        r4 = r7.length();
        r0 = r7;
        r2 = r6;
        r3 = r8;
        r5 = r10;
        r0 = kotlin.text.C4886o.m30232a(r0, r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x007d;
    L_0x007c:
        return r8;
    L_0x007d:
        if (r8 == r9) goto L_0x0081;
    L_0x007f:
        r8 = r8 + r11;
        goto L_0x006d;
    L_0x0081:
        r6 = -1;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.o.a(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static final kotlin.Pair<java.lang.Integer, java.lang.String> m30240b(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
        r0 = 0;
        if (r13 != 0) goto L_0x0035;
    L_0x0003:
        r1 = r11.size();
        r2 = 1;
        if (r1 != r2) goto L_0x0035;
    L_0x000a:
        r11 = (java.lang.Iterable) r11;
        r11 = kotlin.collections.C4888r.m30247c(r11);
        r11 = (java.lang.String) r11;
        if (r14 != 0) goto L_0x001f;
    L_0x0014:
        r4 = 0;
        r5 = 4;
        r6 = 0;
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r10 = kotlin.text.C4886o.m30223a(r1, r2, r3, r4, r5, r6);
        goto L_0x0029;
    L_0x001f:
        r4 = 0;
        r5 = 4;
        r6 = 0;
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r10 = kotlin.text.C4886o.m30236b(r1, r2, r3, r4, r5, r6);
    L_0x0029:
        if (r10 >= 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0034;
    L_0x002c:
        r10 = java.lang.Integer.valueOf(r10);
        r0 = kotlin.C2859a.m13873a(r10, r11);
    L_0x0034:
        return r0;
    L_0x0035:
        r1 = 0;
        if (r14 != 0) goto L_0x0048;
    L_0x0038:
        r12 = kotlin.p151b.C4739g.m27464c(r12, r1);
        r14 = new kotlin.b.c;
        r1 = r10.length();
        r14.<init>(r12, r1);
        r14 = (kotlin.p151b.C2861a) r14;
        goto L_0x0054;
    L_0x0048:
        r14 = kotlin.text.C4886o.m30241c(r10);
        r12 = kotlin.p151b.C4739g.m27465d(r12, r14);
        r14 = kotlin.p151b.C4739g.m27462a(r12, r1);
    L_0x0054:
        r12 = r10 instanceof java.lang.String;
        if (r12 == 0) goto L_0x00a2;
    L_0x0058:
        r12 = r14.m13875a();
        r1 = r14.m13876b();
        r14 = r14.m13877c();
        if (r14 <= 0) goto L_0x0069;
    L_0x0066:
        if (r12 > r1) goto L_0x00ef;
    L_0x0068:
        goto L_0x006b;
    L_0x0069:
        if (r12 < r1) goto L_0x00ef;
    L_0x006b:
        r2 = r11;
        r2 = (java.lang.Iterable) r2;
        r8 = r2.iterator();
    L_0x0072:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0090;
    L_0x0078:
        r9 = r8.next();
        r2 = r9;
        r2 = (java.lang.String) r2;
        r3 = 0;
        r4 = r10;
        r4 = (java.lang.String) r4;
        r6 = r2.length();
        r5 = r12;
        r7 = r13;
        r2 = kotlin.text.C4883n.m30194a(r2, r3, r4, r5, r6, r7);
        if (r2 == 0) goto L_0x0072;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        r9 = r0;
    L_0x0091:
        r9 = (java.lang.String) r9;
        if (r9 == 0) goto L_0x009e;
    L_0x0095:
        r10 = java.lang.Integer.valueOf(r12);
        r10 = kotlin.C2859a.m13873a(r10, r9);
        return r10;
    L_0x009e:
        if (r12 == r1) goto L_0x00ef;
    L_0x00a0:
        r12 = r12 + r14;
        goto L_0x006b;
    L_0x00a2:
        r12 = r14.m13875a();
        r1 = r14.m13876b();
        r14 = r14.m13877c();
        if (r14 <= 0) goto L_0x00b3;
    L_0x00b0:
        if (r12 > r1) goto L_0x00ef;
    L_0x00b2:
        goto L_0x00b5;
    L_0x00b3:
        if (r12 < r1) goto L_0x00ef;
    L_0x00b5:
        r2 = r11;
        r2 = (java.lang.Iterable) r2;
        r8 = r2.iterator();
    L_0x00bc:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00dd;
    L_0x00c2:
        r9 = r8.next();
        r2 = r9;
        r2 = (java.lang.String) r2;
        r3 = r2;
        r3 = (java.lang.CharSequence) r3;
        r4 = 0;
        r6 = r2.length();
        r2 = r3;
        r3 = r4;
        r4 = r10;
        r5 = r12;
        r7 = r13;
        r2 = kotlin.text.C4886o.m30232a(r2, r3, r4, r5, r6, r7);
        if (r2 == 0) goto L_0x00bc;
    L_0x00dc:
        goto L_0x00de;
    L_0x00dd:
        r9 = r0;
    L_0x00de:
        r9 = (java.lang.String) r9;
        if (r9 == 0) goto L_0x00eb;
    L_0x00e2:
        r10 = java.lang.Integer.valueOf(r12);
        r10 = kotlin.C2859a.m13873a(r10, r9);
        return r10;
    L_0x00eb:
        if (r12 == r1) goto L_0x00ef;
    L_0x00ed:
        r12 = r12 + r14;
        goto L_0x00b5;
    L_0x00ef:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.o.b(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):kotlin.Pair<java.lang.Integer, java.lang.String>");
    }

    /* renamed from: a */
    public static final int m30222a(CharSequence charSequence, String str, int i, boolean z) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(str, "string");
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(str, i);
            }
        }
        return C4886o.m30221a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: b */
    public static /* synthetic */ int m30236b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != null) {
            i = C4886o.m30241c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C4886o.m30235b(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final int m30235b(CharSequence charSequence, String str, int i, boolean z) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(str, "string");
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(str, i);
            }
        }
        return C4886o.m30220a(charSequence, (CharSequence) str, i, 0, z, true);
    }

    /* renamed from: a */
    public static final boolean m30233a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (C4886o.m30223a(charSequence, (String) charSequence2, 0, z, 2, null) < null) {
                return false;
            }
        }
        if (C4886o.m30221a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C2873a m30229a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != null) {
            i = 0;
        }
        if ((i3 & 4) != null) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return C4886o.m30228a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C2873a<C4324c> m30228a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if ((i2 >= 0 ? 1 : null) != null) {
            return new C4334d(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$4(C4740e.m27466a(strArr), z));
        }
        charSequence = new StringBuilder();
        charSequence.append("Limit must be non-negative, but was ");
        charSequence.append(i2);
        charSequence.append(46);
        throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
    }

    /* renamed from: a */
    public static final C2873a<String> m30230a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C2885g.m13910b(charSequence, "$receiver");
        C2885g.m13910b(strArr, "delimiters");
        return C4838f.m28686a(C4886o.m30229a(charSequence, strArr, 0, z, i, 2, null), (C2878b) new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    /* renamed from: b */
    public static final java.util.List<java.lang.String> m30238b(java.lang.CharSequence r7, java.lang.String[] r8, boolean r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = "$receiver";
        kotlin.jvm.internal.C2885g.m13910b(r7, r0);
        r0 = "delimiters";
        kotlin.jvm.internal.C2885g.m13910b(r8, r0);
        r0 = r8.length;
        r1 = 1;
        if (r0 != r1) goto L_0x0022;
    L_0x000e:
        r0 = 0;
        r2 = r8[r0];
        r3 = r2;
        r3 = (java.lang.CharSequence) r3;
        r3 = r3.length();
        if (r3 != 0) goto L_0x001b;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r7 = kotlin.text.C4886o.m30226a(r7, r2, r9, r10);
        return r7;
    L_0x0022:
        r2 = 0;
        r5 = 2;
        r6 = 0;
        r0 = r7;
        r1 = r8;
        r3 = r9;
        r4 = r10;
        r8 = kotlin.text.C4886o.m30229a(r0, r1, r2, r3, r4, r5, r6);
        r8 = kotlin.p153d.C4838f.m28683a(r8);
        r9 = new java.util.ArrayList;
        r10 = 10;
        r10 = kotlin.collections.C4741k.m27467a(r8, r10);
        r9.<init>(r10);
        r9 = (java.util.Collection) r9;
        r8 = r8.iterator();
    L_0x0042:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x0056;
    L_0x0048:
        r10 = r8.next();
        r10 = (kotlin.p151b.C4324c) r10;
        r10 = kotlin.text.C4886o.m30225a(r7, r10);
        r9.add(r10);
        goto L_0x0042;
    L_0x0056:
        r9 = (java.util.List) r9;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.o.b(java.lang.CharSequence, java.lang.String[], boolean, int):java.util.List<java.lang.String>");
    }

    /* renamed from: a */
    private static final List<String> m30226a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if ((i >= 0 ? 1 : null) != null) {
            int a = C4886o.m30222a(charSequence, str, 0, z);
            if (a != -1) {
                if (i != 1) {
                    Object obj = i > 0 ? 1 : null;
                    int i3 = 10;
                    if (obj != null) {
                        i3 = C4739g.m27465d(i, 10);
                    }
                    ArrayList arrayList = new ArrayList(i3);
                    do {
                        arrayList.add(charSequence.subSequence(i2, a).toString());
                        i2 = str.length() + a;
                        if (obj != null && arrayList.size() == i - 1) {
                            break;
                        }
                        a = C4886o.m30222a(charSequence, str, i2, z);
                    } while (a != -1);
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                    return arrayList;
                }
            }
            return C2870i.m13888a(charSequence.toString());
        }
        charSequence = new StringBuilder();
        charSequence.append("Limit must be non-negative, but was ");
        charSequence.append(i);
        charSequence.append('.');
        throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
    }

    /* renamed from: a */
    public static final CharSequence m30224a(CharSequence charSequence) {
        C2885g.m13910b(charSequence, "$receiver");
        int length = charSequence.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            boolean a = C2891b.m13922a(charSequence.charAt(obj == null ? i : length));
            if (obj == null) {
                if (a) {
                    i++;
                } else {
                    obj = 1;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: b */
    public static final CharSequence m30237b(CharSequence charSequence) {
        C2885g.m13910b(charSequence, "$receiver");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C2891b.m13922a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }
}
