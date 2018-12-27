package android.support.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

class az extends ay {
    /* renamed from: a */
    private static Method f21669a;
    /* renamed from: b */
    private static boolean f21670b;

    az() {
    }

    /* renamed from: a */
    public void mo225a(android.view.View r4, int r5, int r6, int r7, int r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m29805a();
        r0 = f21669a;
        if (r0 == 0) goto L_0x0037;
    L_0x0007:
        r0 = f21669a;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1 = 4;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r5 = 1;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1[r5] = r6;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r5 = 2;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r6 = java.lang.Integer.valueOf(r7);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1[r5] = r6;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r5 = 3;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r6 = java.lang.Integer.valueOf(r8);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r1[r5] = r6;	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x0037, InvocationTargetException -> 0x002c }
        goto L_0x0037;
    L_0x002c:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.az.a(android.view.View, int, int, int, int):void");
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m29805a() {
        if (!f21670b) {
            try {
                f21669a = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f21669a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f21670b = true;
        }
    }
}
