package android.support.v4.p009a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.content.p014a.C0383a.C0382c;
import android.support.v4.content.p014a.C0383a.C3122b;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.a.f */
public class C4758f extends C4427d {
    /* renamed from: a */
    private static final Class f20827a;
    /* renamed from: b */
    private static final Constructor f20828b;
    /* renamed from: c */
    private static final Method f20829c;
    /* renamed from: d */
    private static final Method f20830d;
    /* renamed from: e */
    private static final Method f20831e;
    /* renamed from: f */
    private static final Method f20832f;
    /* renamed from: g */
    private static final Method f20833g;

    static {
        Class cls;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method declaredMethod;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            constructor = constructor2;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            cls = null;
            declaredMethod = cls;
            method = declaredMethod;
            method2 = method;
            method3 = method2;
            method4 = method3;
        }
        f20828b = constructor;
        f20827a = cls;
        f20829c = method;
        f20830d = method2;
        f20831e = method3;
        f20832f = method4;
        f20833g = declaredMethod;
    }

    /* renamed from: a */
    private static boolean m27619a() {
        if (f20829c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f20829c != null;
    }

    /* renamed from: b */
    private static Object m27622b() {
        try {
            return f20828b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m27620a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f20829c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null})).booleanValue();
        } catch (Context context2) {
            throw new RuntimeException(context2);
        }
    }

    /* renamed from: a */
    private static boolean m27621a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f20830d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), 0, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    private static Typeface m27618a(Object obj) {
        try {
            Array.set(Array.newInstance(f20827a, 1), 0, obj);
            return (Typeface) f20833g.invoke(null, new Object[]{r0, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: b */
    private static boolean m27623b(Object obj) {
        try {
            return ((Boolean) f20831e.invoke(obj, new Object[0])).booleanValue();
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: c */
    private static void m27624c(Object obj) {
        try {
            f20832f.invoke(obj, new Object[0]);
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    public Typeface mo257a(Context context, C3122b c3122b, Resources resources, int i) {
        if (!C4758f.m27619a()) {
            return super.mo257a(context, c3122b, resources, i);
        }
        resources = C4758f.m27622b();
        c3122b = c3122b.m15576a();
        i = c3122b.length;
        int i2 = 0;
        while (i2 < i) {
            C0382c c0382c = c3122b[i2];
            if (C4758f.m27620a(context, resources, c0382c.m1401a(), 0, c0382c.m1402b(), c0382c.m1403c())) {
                i2++;
            } else {
                C4758f.m27624c(resources);
                return null;
            }
        }
        if (C4758f.m27623b(resources) == null) {
            return null;
        }
        return C4758f.m27618a(resources);
    }

    /* renamed from: a */
    public android.graphics.Typeface mo256a(android.content.Context r10, android.os.CancellationSignal r11, android.support.v4.p015d.C0404b.C0402b[] r12, int r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r12.length;
        r1 = 1;
        r2 = 0;
        if (r0 >= r1) goto L_0x0006;
    L_0x0005:
        return r2;
    L_0x0006:
        r0 = android.support.v4.p009a.C4758f.m27619a();
        if (r0 != 0) goto L_0x0064;
    L_0x000c:
        r12 = r9.m15311a(r12, r13);
        r10 = r10.getContentResolver();
        r13 = r12.m1483a();	 Catch:{ IOException -> 0x0063 }
        r0 = "r";	 Catch:{ IOException -> 0x0063 }
        r10 = r10.openFileDescriptor(r13, r0, r11);	 Catch:{ IOException -> 0x0063 }
        if (r10 != 0) goto L_0x0026;	 Catch:{ IOException -> 0x0063 }
    L_0x0020:
        if (r10 == 0) goto L_0x0025;	 Catch:{ IOException -> 0x0063 }
    L_0x0022:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0025:
        return r2;
    L_0x0026:
        r11 = new android.graphics.Typeface$Builder;	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r13 = r10.getFileDescriptor();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11.<init>(r13);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r13 = r12.m1485c();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.setWeight(r13);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r12 = r12.m1486d();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.setItalic(r12);	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        r11 = r11.build();	 Catch:{ Throwable -> 0x004c, all -> 0x0049 }
        if (r10 == 0) goto L_0x0048;
    L_0x0045:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0048:
        return r11;
    L_0x0049:
        r11 = move-exception;
        r12 = r2;
        goto L_0x0052;
    L_0x004c:
        r11 = move-exception;
        throw r11;	 Catch:{ all -> 0x004e }
    L_0x004e:
        r12 = move-exception;
        r8 = r12;
        r12 = r11;
        r11 = r8;
    L_0x0052:
        if (r10 == 0) goto L_0x0062;
    L_0x0054:
        if (r12 == 0) goto L_0x005f;
    L_0x0056:
        r10.close();	 Catch:{ Throwable -> 0x005a }
        goto L_0x0062;
    L_0x005a:
        r10 = move-exception;
        r12.addSuppressed(r10);	 Catch:{ IOException -> 0x0063 }
        goto L_0x0062;	 Catch:{ IOException -> 0x0063 }
    L_0x005f:
        r10.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0062:
        throw r11;	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        return r2;
    L_0x0064:
        r10 = android.support.v4.p015d.C0404b.m1495a(r10, r12, r11);
        r11 = android.support.v4.p009a.C4758f.m27622b();
        r0 = r12.length;
        r3 = 0;
        r4 = 0;
    L_0x006f:
        if (r3 >= r0) goto L_0x009a;
    L_0x0071:
        r5 = r12[r3];
        r6 = r5.m1483a();
        r6 = r10.get(r6);
        r6 = (java.nio.ByteBuffer) r6;
        if (r6 != 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0097;
    L_0x0080:
        r4 = r5.m1484b();
        r7 = r5.m1485c();
        r5 = r5.m1486d();
        r4 = android.support.v4.p009a.C4758f.m27621a(r11, r6, r4, r7, r5);
        if (r4 != 0) goto L_0x0096;
    L_0x0092:
        android.support.v4.p009a.C4758f.m27624c(r11);
        return r2;
    L_0x0096:
        r4 = 1;
    L_0x0097:
        r3 = r3 + 1;
        goto L_0x006f;
    L_0x009a:
        if (r4 != 0) goto L_0x00a0;
    L_0x009c:
        android.support.v4.p009a.C4758f.m27624c(r11);
        return r2;
    L_0x00a0:
        r10 = android.support.v4.p009a.C4758f.m27623b(r11);
        if (r10 != 0) goto L_0x00a7;
    L_0x00a6:
        return r2;
    L_0x00a7:
        r10 = android.support.v4.p009a.C4758f.m27618a(r11);
        r10 = android.graphics.Typeface.create(r10, r13);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.f.a(android.content.Context, android.os.CancellationSignal, android.support.v4.d.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo255a(Context context, Resources resources, int i, String str, int i2) {
        if (!C4758f.m27619a()) {
            return super.mo255a(context, resources, i, str, i2);
        }
        resources = C4758f.m27622b();
        if (C4758f.m27620a(context, resources, str, 0, -1, -1) == null) {
            C4758f.m27624c(resources);
            return null;
        } else if (C4758f.m27623b(resources) == null) {
            return null;
        } else {
            return C4758f.m27618a(resources);
        }
    }
}
