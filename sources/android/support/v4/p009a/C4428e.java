package android.support.v4.p009a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.content.p014a.C0383a.C0382c;
import android.support.v4.content.p014a.C0383a.C3122b;
import android.support.v4.p015d.C0404b.C0402b;
import android.support.v4.p017f.C0433m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.a.e */
class C4428e extends C3100g {
    /* renamed from: a */
    private static final Class f18404a;
    /* renamed from: b */
    private static final Constructor f18405b;
    /* renamed from: c */
    private static final Method f18406c;
    /* renamed from: d */
    private static final Method f18407d;

    C4428e() {
    }

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (Throwable e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = cls;
            method = method2;
        }
        f18405b = constructor;
        f18404a = cls;
        f18406c = method;
        f18407d = method2;
    }

    /* renamed from: a */
    public static boolean m24224a() {
        if (f18406c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f18406c != null;
    }

    /* renamed from: b */
    private static Object m24226b() {
        try {
            return f18405b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m24225a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f18406c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), 0, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    private static Typeface m24223a(Object obj) {
        try {
            Array.set(Array.newInstance(f18404a, 1), 0, obj);
            return (Typeface) f18407d.invoke(null, new Object[]{r0});
        } catch (Object obj2) {
            throw new RuntimeException(obj2);
        }
    }

    /* renamed from: a */
    public Typeface mo256a(Context context, CancellationSignal cancellationSignal, C0402b[] c0402bArr, int i) {
        Object b = C4428e.m24226b();
        C0433m c0433m = new C0433m();
        for (C0402b c0402b : c0402bArr) {
            Uri a = c0402b.m1483a();
            ByteBuffer byteBuffer = (ByteBuffer) c0433m.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0306h.m1099a(context, cancellationSignal, a);
                c0433m.put(a, byteBuffer);
            }
            if (!C4428e.m24225a(b, byteBuffer, c0402b.m1484b(), c0402b.m1485c(), c0402b.m1486d())) {
                return null;
            }
        }
        return Typeface.create(C4428e.m24223a(b), i);
    }

    /* renamed from: a */
    public Typeface mo257a(Context context, C3122b c3122b, Resources resources, int i) {
        i = C4428e.m24226b();
        for (C0382c c0382c : c3122b.m15576a()) {
            ByteBuffer a = C0306h.m1098a(context, resources, c0382c.m1404d());
            if (a == null || !C4428e.m24225a(i, a, 0, c0382c.m1402b(), c0382c.m1403c())) {
                return null;
            }
        }
        return C4428e.m24223a(i);
    }
}
