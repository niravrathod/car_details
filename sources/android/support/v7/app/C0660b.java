package android.support.v7.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.b */
class C0660b {
    /* renamed from: a */
    private static final int[] f2147a = new int[]{16843531};

    /* renamed from: android.support.v7.app.b$a */
    static class C0659a {
        /* renamed from: a */
        public Method f2144a;
        /* renamed from: b */
        public Method f2145b;
        /* renamed from: c */
        public ImageView f2146c;

        C0659a(android.app.Activity r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = 0;
            r1 = 1;
            r2 = android.app.ActionBar.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r3 = "setHomeAsUpIndicator";	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0026 }
            r5 = android.graphics.drawable.Drawable.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0026 }
            r6.f2144a = r2;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = android.app.ActionBar.class;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r3 = "setHomeActionContentDescription";	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0026 }
            r5 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x0026 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0026 }
            r6.f2145b = r2;	 Catch:{ NoSuchMethodException -> 0x0026 }
            return;
            r2 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
            r7 = r7.findViewById(r2);
            if (r7 != 0) goto L_0x0031;
        L_0x0030:
            return;
        L_0x0031:
            r7 = r7.getParent();
            r7 = (android.view.ViewGroup) r7;
            r3 = r7.getChildCount();
            r4 = 2;
            if (r3 == r4) goto L_0x003f;
        L_0x003e:
            return;
        L_0x003f:
            r0 = r7.getChildAt(r0);
            r7 = r7.getChildAt(r1);
            r1 = r0.getId();
            if (r1 != r2) goto L_0x004e;
        L_0x004d:
            goto L_0x004f;
        L_0x004e:
            r7 = r0;
        L_0x004f:
            r0 = r7 instanceof android.widget.ImageView;
            if (r0 == 0) goto L_0x0057;
        L_0x0053:
            r7 = (android.widget.ImageView) r7;
            r6.f2146c = r7;
        L_0x0057:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.b.a.<init>(android.app.Activity):void");
        }
    }

    /* renamed from: a */
    public static C0659a m2632a(C0659a c0659a, Activity activity, Drawable drawable, int i) {
        c0659a = new C0659a(activity);
        if (c0659a.f2144a != null) {
            try {
                activity = activity.getActionBar();
                c0659a.f2144a.invoke(activity, new Object[]{drawable});
                c0659a.f2145b.invoke(activity, new Object[]{Integer.valueOf(i)});
            } catch (Activity activity2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", activity2);
            }
        } else if (c0659a.f2146c != null) {
            c0659a.f2146c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
        }
        return c0659a;
    }

    /* renamed from: a */
    public static C0659a m2631a(C0659a c0659a, Activity activity, int i) {
        if (c0659a == null) {
            c0659a = new C0659a(activity);
        }
        if (c0659a.f2144a != null) {
            try {
                activity = activity.getActionBar();
                c0659a.f2145b.invoke(activity, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    activity.setSubtitle(activity.getSubtitle());
                }
            } catch (Activity activity2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", activity2);
            }
        }
        return c0659a;
    }

    /* renamed from: a */
    public static Drawable m2630a(Activity activity) {
        activity = activity.obtainStyledAttributes(f2147a);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }
}
