package android.support.v7.p022c.p023a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.C0389b;
import android.support.v7.widget.C0862h;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.c.a.b */
public final class C0680b {
    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2184a = new ThreadLocal();
    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0679a>> f2185b = new WeakHashMap(0);
    /* renamed from: c */
    private static final Object f2186c = new Object();

    /* renamed from: android.support.v7.c.a.b$a */
    private static class C0679a {
        /* renamed from: a */
        final ColorStateList f2182a;
        /* renamed from: b */
        final Configuration f2183b;

        C0679a(ColorStateList colorStateList, Configuration configuration) {
            this.f2182a = colorStateList;
            this.f2183b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m2700a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0680b.m2705d(context, i);
        if (d != null) {
            return d;
        }
        d = C0680b.m2704c(context, i);
        if (d == null) {
            return C0389b.m1436b(context, i);
        }
        C0680b.m2702a(context, i, d);
        return d;
    }

    /* renamed from: b */
    public static Drawable m2703b(Context context, int i) {
        return C0862h.m3671a().m3690a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m2704c(Context context, int i) {
        if (C0680b.m2706e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0678a.m2696a(resources, resources.getXml(i), context.getTheme());
        } catch (Context context2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", context2);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private static android.content.res.ColorStateList m2705d(android.content.Context r4, int r5) {
        /*
        r0 = f2186c;
        monitor-enter(r0);
        r1 = f2185b;	 Catch:{ all -> 0x0035 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0035 }
        r1 = (android.util.SparseArray) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x000d:
        r2 = r1.size();	 Catch:{ all -> 0x0035 }
        if (r2 <= 0) goto L_0x0032;
    L_0x0013:
        r2 = r1.get(r5);	 Catch:{ all -> 0x0035 }
        r2 = (android.support.v7.p022c.p023a.C0680b.C0679a) r2;	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r2.f2183b;	 Catch:{ all -> 0x0035 }
        r4 = r4.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r4 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x002f;
    L_0x002b:
        r4 = r2.f2182a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        return r4;
    L_0x002f:
        r1.remove(r5);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        r4 = 0;
        return r4;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.c.a.b.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static void m2702a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2186c) {
            SparseArray sparseArray = (SparseArray) f2185b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2185b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0679a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: e */
    private static boolean m2706e(Context context, int i) {
        context = context.getResources();
        TypedValue a = C0680b.m2701a();
        context.getValue(i, a, true);
        if (a.type < 28 || a.type > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static TypedValue m2701a() {
        TypedValue typedValue = (TypedValue) f2184a.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f2184a.set(typedValue);
        return typedValue;
    }
}
