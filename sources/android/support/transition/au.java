package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0560r;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

class au {
    /* renamed from: a */
    static final Property<View, Float> f1017a = new Property<View, Float>(Float.class, "translationAlpha") {
        public /* synthetic */ Object get(Object obj) {
            return m997a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m998a((View) obj, (Float) obj2);
        }

        /* renamed from: a */
        public Float m997a(View view) {
            return Float.valueOf(au.m1009c(view));
        }

        /* renamed from: a */
        public void m998a(View view, Float f) {
            au.m1003a(view, f.floatValue());
        }
    };
    /* renamed from: b */
    static final Property<View, Rect> f1018b = new Property<View, Rect>(Rect.class, "clipBounds") {
        public /* synthetic */ Object get(Object obj) {
            return m999a((View) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m1000a((View) obj, (Rect) obj2);
        }

        /* renamed from: a */
        public Rect m999a(View view) {
            return C0560r.m2214z(view);
        }

        /* renamed from: a */
        public void m1000a(View view, Rect rect) {
            C0560r.m2173a(view, rect);
        }
    };
    /* renamed from: c */
    private static final ba f1019c;
    /* renamed from: d */
    private static Field f1020d;
    /* renamed from: e */
    private static boolean f1021e;

    static {
        if (VERSION.SDK_INT >= 22) {
            f1019c = new az();
        } else if (VERSION.SDK_INT >= 21) {
            f1019c = new ay();
        } else if (VERSION.SDK_INT >= 19) {
            f1019c = new ax();
        } else if (VERSION.SDK_INT >= 18) {
            f1019c = new aw();
        } else {
            f1019c = new av();
        }
    }

    /* renamed from: a */
    static at m1001a(View view) {
        return f1019c.mo223a(view);
    }

    /* renamed from: b */
    static be m1007b(View view) {
        return f1019c.mo227b(view);
    }

    /* renamed from: a */
    static void m1003a(View view, float f) {
        f1019c.mo224a(view, f);
    }

    /* renamed from: c */
    static float m1009c(View view) {
        return f1019c.mo229c(view);
    }

    /* renamed from: d */
    static void m1011d(View view) {
        f1019c.mo231d(view);
    }

    /* renamed from: e */
    static void m1012e(View view) {
        f1019c.mo232e(view);
    }

    /* renamed from: a */
    static void m1004a(android.view.View r2, int r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        m1002a();
        r0 = f1020d;
        if (r0 == 0) goto L_0x0015;
    L_0x0007:
        r0 = f1020d;	 Catch:{ IllegalAccessException -> 0x0015 }
        r0 = r0.getInt(r2);	 Catch:{ IllegalAccessException -> 0x0015 }
        r1 = f1020d;	 Catch:{ IllegalAccessException -> 0x0015 }
        r0 = r0 & -13;	 Catch:{ IllegalAccessException -> 0x0015 }
        r3 = r3 | r0;	 Catch:{ IllegalAccessException -> 0x0015 }
        r1.setInt(r2, r3);	 Catch:{ IllegalAccessException -> 0x0015 }
    L_0x0015:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.au.a(android.view.View, int):void");
    }

    /* renamed from: a */
    static void m1006a(View view, Matrix matrix) {
        f1019c.mo226a(view, matrix);
    }

    /* renamed from: b */
    static void m1008b(View view, Matrix matrix) {
        f1019c.mo228b(view, matrix);
    }

    /* renamed from: c */
    static void m1010c(View view, Matrix matrix) {
        f1019c.mo230c(view, matrix);
    }

    /* renamed from: a */
    static void m1005a(View view, int i, int i2, int i3, int i4) {
        f1019c.mo225a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    private static void m1002a() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = f1021e;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        r0 = 1;
        r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = "mViewFlags";	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0015 }
        f1020d = r1;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1 = f1020d;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0015 }
        goto L_0x001c;
    L_0x0015:
        r1 = "ViewUtils";
        r2 = "fetchViewFlagsField: ";
        android.util.Log.i(r1, r2);
    L_0x001c:
        f1021e = r0;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.au.a():void");
    }
}
