package android.support.v4.p009a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.v4.content.p014a.C0383a.C3122b;
import android.support.v4.p015d.C0404b.C0402b;
import android.support.v4.p017f.C0421g;

/* renamed from: android.support.v4.a.c */
public class C0304c {
    /* renamed from: a */
    private static final C0303a f1051a;
    /* renamed from: b */
    private static final C0421g<String, Typeface> f1052b = new C0421g(16);

    /* renamed from: android.support.v4.a.c$a */
    interface C0303a {
        /* renamed from: a */
        Typeface mo255a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo256a(Context context, CancellationSignal cancellationSignal, C0402b[] c0402bArr, int i);

        /* renamed from: a */
        Typeface mo257a(Context context, C3122b c3122b, Resources resources, int i);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1051a = new C4758f();
        } else if (VERSION.SDK_INT >= 24 && C4428e.m24224a()) {
            f1051a = new C4428e();
        } else if (VERSION.SDK_INT >= 21) {
            f1051a = new C4427d();
        } else {
            f1051a = new C3100g();
        }
    }

    /* renamed from: a */
    public static Typeface m1093a(Resources resources, int i, int i2) {
        return (Typeface) f1052b.get(C0304c.m1094b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1094b(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.graphics.Typeface m1092a(android.content.Context r7, android.support.v4.content.p014a.C0383a.C0381a r8, android.content.res.Resources r9, int r10, int r11, android.support.v4.content.p014a.C0387b.C0386a r12, android.os.Handler r13, boolean r14) {
        /*
        r4 = r8 instanceof android.support.v4.content.p014a.C0383a.C3123d;
        if (r4 == 0) goto L_0x002d;
    L_0x0004:
        r0 = r8;
        r0 = (android.support.v4.content.p014a.C0383a.C3123d) r0;
        r4 = 0;
        r5 = 1;
        if (r14 == 0) goto L_0x0013;
    L_0x000b:
        r6 = r0.m15578b();
        if (r6 != 0) goto L_0x0016;
    L_0x0011:
        r4 = 1;
        goto L_0x0016;
    L_0x0013:
        if (r12 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0011;
    L_0x0016:
        if (r14 == 0) goto L_0x001e;
    L_0x0018:
        r1 = r0.m15579c();
        r5 = r1;
        goto L_0x0020;
    L_0x001e:
        r1 = -1;
        r5 = -1;
    L_0x0020:
        r1 = r0.m15577a();
        r0 = r7;
        r2 = r12;
        r3 = r13;
        r6 = r11;
        r0 = android.support.v4.p015d.C0404b.m1489a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x0042;
    L_0x002d:
        r1 = f1051a;
        r0 = r8;
        r0 = (android.support.v4.content.p014a.C0383a.C3122b) r0;
        r0 = r1.mo257a(r7, r0, r9, r11);
        if (r12 == 0) goto L_0x0042;
    L_0x0038:
        if (r0 == 0) goto L_0x003e;
    L_0x003a:
        r12.m1415a(r0, r13);
        goto L_0x0042;
    L_0x003e:
        r1 = -3;
        r12.m1413a(r1, r13);
    L_0x0042:
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r1 = f1052b;
        r2 = android.support.v4.p009a.C0304c.m1094b(r9, r10, r11);
        r1.put(r2, r0);
    L_0x004d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.c.a(android.content.Context, android.support.v4.content.a.a$a, android.content.res.Resources, int, int, android.support.v4.content.a.b$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Typeface m1090a(Context context, Resources resources, int i, String str, int i2) {
        context = f1051a.mo255a(context, resources, i, str, i2);
        if (context != null) {
            f1052b.put(C0304c.m1094b(resources, i, i2), context);
        }
        return context;
    }

    /* renamed from: a */
    public static Typeface m1091a(Context context, CancellationSignal cancellationSignal, C0402b[] c0402bArr, int i) {
        return f1051a.mo256a(context, cancellationSignal, c0402bArr, i);
    }
}
