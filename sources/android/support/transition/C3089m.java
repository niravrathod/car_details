package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.m */
class C3089m implements C0284n {
    /* renamed from: a */
    private static Method f13094a;
    /* renamed from: b */
    private static boolean f13095b;

    /* renamed from: a */
    public void mo242a(ImageView imageView) {
    }

    /* renamed from: a */
    public void mo243a(ImageView imageView, Animator animator) {
    }

    C3089m() {
    }

    /* renamed from: a */
    public void mo244a(android.widget.ImageView r4, android.graphics.Matrix r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r3.m15283a();
        r0 = f13094a;
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = f13094a;	 Catch:{ IllegalAccessException -> 0x001e, InvocationTargetException -> 0x0013 }
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.m.a(android.widget.ImageView, android.graphics.Matrix):void");
    }

    /* renamed from: a */
    private void m15283a() {
        if (!f13095b) {
            try {
                f13094a = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                f13094a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ImageViewUtilsApi21", "Failed to retrieve animateTransform method", e);
            }
            f13095b = true;
        }
    }
}
