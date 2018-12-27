package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

class ax extends aw {
    /* renamed from: a */
    private static Method f20822a;
    /* renamed from: b */
    private static boolean f20823b;
    /* renamed from: c */
    private static Method f20824c;
    /* renamed from: d */
    private static boolean f20825d;

    /* renamed from: d */
    public void mo231d(View view) {
    }

    /* renamed from: e */
    public void mo232e(View view) {
    }

    ax() {
    }

    /* renamed from: a */
    public void mo224a(android.view.View r4, float r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m27609a();
        r0 = f20822a;
        if (r0 == 0) goto L_0x0022;
    L_0x0007:
        r0 = f20822a;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1 = 1;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r2 = 0;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r1[r2] = r5;	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        r0.invoke(r4, r1);	 Catch:{ IllegalAccessException -> 0x0025, InvocationTargetException -> 0x0017 }
        goto L_0x0025;
    L_0x0017:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r4 = r4.getCause();
        r5.<init>(r4);
        throw r5;
    L_0x0022:
        r4.setAlpha(r5);
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ax.a(android.view.View, float):void");
    }

    /* renamed from: c */
    public float mo229c(android.view.View r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.m27610b();
        r0 = f20824c;
        if (r0 == 0) goto L_0x0022;
    L_0x0007:
        r0 = f20824c;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r1 = 0;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = r0.invoke(r3, r1);	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = (java.lang.Float) r0;	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        r0 = r0.floatValue();	 Catch:{ IllegalAccessException -> 0x0022, InvocationTargetException -> 0x0017 }
        return r0;
    L_0x0017:
        r3 = move-exception;
        r0 = new java.lang.RuntimeException;
        r3 = r3.getCause();
        r0.<init>(r3);
        throw r0;
    L_0x0022:
        r3 = super.mo229c(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.ax.c(android.view.View):float");
    }

    /* renamed from: a */
    private void m27609a() {
        if (!f20823b) {
            try {
                f20822a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f20822a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f20823b = true;
        }
    }

    /* renamed from: b */
    private void m27610b() {
        if (!f20825d) {
            try {
                f20824c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f20824c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f20825d = true;
        }
    }
}
