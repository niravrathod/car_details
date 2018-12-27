package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.os.C0507a;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.o */
public final class C0619o {
    /* renamed from: a */
    static final C0618g f1970a;

    /* renamed from: android.support.v4.widget.o$g */
    static class C0618g {
        /* renamed from: a */
        private static Field f1966a;
        /* renamed from: b */
        private static boolean f1967b;
        /* renamed from: c */
        private static Field f1968c;
        /* renamed from: d */
        private static boolean f1969d;

        C0618g() {
        }

        /* renamed from: a */
        public void mo3794a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: a */
        private static java.lang.reflect.Field m2468a(java.lang.String r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = android.widget.TextView.class;	 Catch:{ NoSuchFieldException -> 0x000c }
            r1 = r1.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x000c }
            r0 = 1;
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x000d }
            goto L_0x0028;
        L_0x000c:
            r1 = r0;
        L_0x000d:
            r0 = "TextViewCompatBase";
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Could not retrieve ";
            r2.append(r3);
            r2.append(r4);
            r4 = " field.";
            r2.append(r4);
            r4 = r2.toString();
            android.util.Log.e(r0, r4);
        L_0x0028:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.o.g.a(java.lang.String):java.lang.reflect.Field");
        }

        /* renamed from: a */
        private static int m2467a(java.lang.reflect.Field r2, android.widget.TextView r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = r2.getInt(r3);	 Catch:{ IllegalAccessException -> 0x0005 }
            return r3;
        L_0x0005:
            r3 = "TextViewCompatBase";
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Could not retrieve value of ";
            r0.append(r1);
            r2 = r2.getName();
            r0.append(r2);
            r2 = " field.";
            r0.append(r2);
            r2 = r0.toString();
            android.util.Log.d(r3, r2);
            r2 = -1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.o.g.a(java.lang.reflect.Field, android.widget.TextView):int");
        }

        /* renamed from: a */
        public int mo485a(TextView textView) {
            if (!f1969d) {
                f1968c = C0618g.m2468a("mMaxMode");
                f1969d = true;
            }
            if (f1968c != null && C0618g.m2467a(f1968c, textView) == 1) {
                if (!f1967b) {
                    f1966a = C0618g.m2468a("mMaximum");
                    f1967b = true;
                }
                if (f1966a != null) {
                    return C0618g.m2467a(f1966a, textView);
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo4898a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* renamed from: b */
        public Drawable[] mo3795b(TextView textView) {
            return textView.getCompoundDrawables();
        }
    }

    /* renamed from: android.support.v4.widget.o$a */
    static class C3187a extends C0618g {
        C3187a() {
        }

        /* renamed from: a */
        public int mo485a(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: android.support.v4.widget.o$b */
    static class C4451b extends C3187a {
        C4451b() {
        }

        /* renamed from: a */
        public void mo3794a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            Drawable drawable5 = obj != null ? drawable3 : drawable;
            if (obj == null) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo3795b(TextView textView) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            textView = textView.getCompoundDrawables();
            if (obj != null) {
                obj = textView[2];
                Object obj2 = textView[0];
                textView[0] = obj;
                textView[2] = obj2;
            }
            return textView;
        }
    }

    /* renamed from: android.support.v4.widget.o$c */
    static class C4765c extends C4451b {
        C4765c() {
        }

        /* renamed from: a */
        public void mo3794a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo3795b(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    /* renamed from: android.support.v4.widget.o$d */
    static class C4843d extends C4765c {
        C4843d() {
        }

        /* renamed from: a */
        public void mo4898a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: android.support.v4.widget.o$e */
    static class C4870e extends C4843d {
        C4870e() {
        }
    }

    /* renamed from: android.support.v4.widget.o$f */
    static class C4878f extends C4870e {
        C4878f() {
        }
    }

    static {
        if (C0507a.m1878a()) {
            f1970a = new C4878f();
        } else if (VERSION.SDK_INT >= 26) {
            f1970a = new C4870e();
        } else if (VERSION.SDK_INT >= 23) {
            f1970a = new C4843d();
        } else if (VERSION.SDK_INT >= 18) {
            f1970a = new C4765c();
        } else if (VERSION.SDK_INT >= 17) {
            f1970a = new C4451b();
        } else if (VERSION.SDK_INT >= 16) {
            f1970a = new C3187a();
        } else {
            f1970a = new C0618g();
        }
    }

    /* renamed from: a */
    public static void m2475a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f1970a.mo3794a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static int m2473a(TextView textView) {
        return f1970a.mo485a(textView);
    }

    /* renamed from: a */
    public static void m2474a(TextView textView, int i) {
        f1970a.mo4898a(textView, i);
    }

    /* renamed from: b */
    public static Drawable[] m2476b(TextView textView) {
        return f1970a.mo3795b(textView);
    }
}
