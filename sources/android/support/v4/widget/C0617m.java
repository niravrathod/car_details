package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.m */
public final class C0617m {
    /* renamed from: a */
    static final C0616d f1965a;

    /* renamed from: android.support.v4.widget.m$d */
    static class C0616d {
        /* renamed from: a */
        private static Method f1963a;
        /* renamed from: b */
        private static boolean f1964b;

        /* renamed from: a */
        public void mo3791a(PopupWindow popupWindow, boolean z) {
        }

        C0616d() {
        }

        /* renamed from: a */
        public void mo484a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0543c.m2037a(i3, C0560r.m2193e(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo4607a(android.widget.PopupWindow r7, int r8) {
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
            r0 = f1964b;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x001d;
        L_0x0006:
            r0 = android.widget.PopupWindow.class;	 Catch:{ Exception -> 0x001b }
            r3 = "setWindowLayoutType";	 Catch:{ Exception -> 0x001b }
            r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001b }
            r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x001b }
            r4[r1] = r5;	 Catch:{ Exception -> 0x001b }
            r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x001b }
            f1963a = r0;	 Catch:{ Exception -> 0x001b }
            r0 = f1963a;	 Catch:{ Exception -> 0x001b }
            r0.setAccessible(r2);	 Catch:{ Exception -> 0x001b }
        L_0x001b:
            f1964b = r2;
        L_0x001d:
            r0 = f1963a;
            if (r0 == 0) goto L_0x002e;
        L_0x0021:
            r0 = f1963a;	 Catch:{ Exception -> 0x002e }
            r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x002e }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x002e }
            r2[r1] = r8;	 Catch:{ Exception -> 0x002e }
            r0.invoke(r7, r2);	 Catch:{ Exception -> 0x002e }
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.m.d.a(android.widget.PopupWindow, int):void");
        }
    }

    /* renamed from: android.support.v4.widget.m$a */
    static class C3186a extends C0616d {
        C3186a() {
        }

        /* renamed from: a */
        public void mo484a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.m$b */
    static class C4449b extends C3186a {
        /* renamed from: a */
        private static Field f18452a;

        C4449b() {
        }

        static {
            try {
                f18452a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f18452a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        /* renamed from: a */
        public void mo3791a(PopupWindow popupWindow, boolean z) {
            if (f18452a != null) {
                try {
                    f18452a.set(popupWindow, Boolean.valueOf(z));
                } catch (PopupWindow popupWindow2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", popupWindow2);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.m$c */
    static class C4764c extends C4449b {
        C4764c() {
        }

        /* renamed from: a */
        public void mo3791a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: a */
        public void mo4607a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f1965a = new C4764c();
        } else if (VERSION.SDK_INT >= 21) {
            f1965a = new C4449b();
        } else if (VERSION.SDK_INT >= 19) {
            f1965a = new C3186a();
        } else {
            f1965a = new C0616d();
        }
    }

    /* renamed from: a */
    public static void m2465a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f1965a.mo484a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m2466a(PopupWindow popupWindow, boolean z) {
        f1965a.mo3791a(popupWindow, z);
    }

    /* renamed from: a */
    public static void m2464a(PopupWindow popupWindow, int i) {
        f1965a.mo4607a(popupWindow, i);
    }
}
