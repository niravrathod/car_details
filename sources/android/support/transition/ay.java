package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

class ay extends ax {
    /* renamed from: a */
    private static Method f21454a;
    /* renamed from: b */
    private static boolean f21455b;
    /* renamed from: c */
    private static Method f21456c;
    /* renamed from: d */
    private static boolean f21457d;
    /* renamed from: e */
    private static Method f21458e;
    /* renamed from: f */
    private static boolean f21459f;

    ay() {
    }

    /* renamed from: a */
    public void mo226a(android.view.View r4, android.graphics.Matrix r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m28689a();
        r0 = f21454a;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f21454a;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        goto L_0x001e;
    L_0x0013:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ay.a(android.view.View, android.graphics.Matrix):void");
    }

    /* renamed from: b */
    public void mo228b(android.view.View r4, android.graphics.Matrix r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m28690b();
        r0 = f21456c;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f21456c;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
        goto L_0x001e;
    L_0x0013:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ay.b(android.view.View, android.graphics.Matrix):void");
    }

    /* renamed from: c */
    public void mo230c(android.view.View r4, android.graphics.Matrix r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m28691c();
        r0 = f21458e;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f21458e;	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        r1 = 1;	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        r1[r2] = r5;	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        r0.invoke(r4, r1);	 Catch:{ InvocationTargetException -> 0x001e, IllegalAccessException -> 0x0013 }
        goto L_0x001e;
    L_0x0013:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ay.c(android.view.View, android.graphics.Matrix):void");
    }

    /* renamed from: a */
    private void m28689a() {
        if (!f21455b) {
            try {
                f21454a = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f21454a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f21455b = true;
        }
    }

    /* renamed from: b */
    private void m28690b() {
        if (!f21457d) {
            try {
                f21456c = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f21456c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f21457d = true;
        }
    }

    /* renamed from: c */
    private void m28691c() {
        if (!f21459f) {
            try {
                f21458e = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                f21458e.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve setAnimationMatrix method", e);
            }
            f21459f = true;
        }
    }
}
