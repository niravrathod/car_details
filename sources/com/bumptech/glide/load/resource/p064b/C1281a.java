package com.bumptech.glide.load.resource.p064b;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.content.p014a.C0387b;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.C0708d;

/* renamed from: com.bumptech.glide.load.resource.b.a */
public final class C1281a {
    /* renamed from: a */
    private static volatile boolean f4032a = true;

    /* renamed from: a */
    public static Drawable m5159a(Context context, Context context2, int i) {
        return C1281a.m5160a(context, context2, i, null);
    }

    /* renamed from: a */
    public static Drawable m5158a(Context context, int i, Theme theme) {
        return C1281a.m5160a(context, context, i, theme);
    }

    /* renamed from: a */
    private static android.graphics.drawable.Drawable m5160a(android.content.Context r1, android.content.Context r2, int r3, android.content.res.Resources.Theme r4) {
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
        r0 = f4032a;	 Catch:{ NoClassDefFoundError -> 0x0020, IllegalStateException -> 0x000b, NotFoundException -> 0x0009 }
        if (r0 == 0) goto L_0x0023;	 Catch:{ NoClassDefFoundError -> 0x0020, IllegalStateException -> 0x000b, NotFoundException -> 0x0009 }
    L_0x0004:
        r0 = com.bumptech.glide.load.resource.p064b.C1281a.m5161b(r2, r3, r4);	 Catch:{ NoClassDefFoundError -> 0x0020, IllegalStateException -> 0x000b, NotFoundException -> 0x0009 }
        return r0;
        goto L_0x0023;
    L_0x000b:
        r4 = move-exception;
        r1 = r1.getPackageName();
        r0 = r2.getPackageName();
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x001f;
    L_0x001a:
        r1 = android.support.v4.content.C0389b.m1429a(r2, r3);
        return r1;
    L_0x001f:
        throw r4;
    L_0x0020:
        r1 = 0;
        f4032a = r1;
    L_0x0023:
        if (r4 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002a;
    L_0x0026:
        r4 = r2.getTheme();
    L_0x002a:
        r1 = com.bumptech.glide.load.resource.p064b.C1281a.m5162c(r2, r3, r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.b.a.a(android.content.Context, android.content.Context, int, android.content.res.Resources$Theme):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private static Drawable m5161b(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new C0708d(context, theme);
        }
        return C0680b.m2703b(context, i);
    }

    /* renamed from: c */
    private static Drawable m5162c(Context context, int i, Theme theme) {
        return C0387b.m1419a(context.getResources(), i, theme);
    }
}
