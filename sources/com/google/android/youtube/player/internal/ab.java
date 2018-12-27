package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.google.ads.mediation.facebook.FacebookAdapter;

public final class ab {
    /* renamed from: a */
    private static final Uri f10879a = Uri.parse("http://play.google.com/store/apps/details");
    /* renamed from: b */
    private static final String[] f10880b = new String[]{"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    /* renamed from: a */
    public static Intent m12465a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: a */
    public static String m12466a() {
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append(1);
        stringBuilder.append(".2.2");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m12467a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : f10880b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str), 0);
            if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.packageName != null) {
                return resolveService.serviceInfo.packageName;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: a */
    public static boolean m12468a(android.content.Context r3, java.lang.String r4) {
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
        r0 = 1;
        r3 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x002b }
        r3 = r3.getResourcesForApplication(r4);	 Catch:{ NameNotFoundException -> 0x002b }
        r1 = "com.google.android.youtube.googletvdev";
        r1 = r4.equals(r1);
        if (r1 == 0) goto L_0x0013;
    L_0x0011:
        r4 = "com.google.android.youtube.googletv";
    L_0x0013:
        r1 = "youtube_api_version_code";
        r2 = "integer";
        r4 = r3.getIdentifier(r1, r2, r4);
        if (r4 != 0) goto L_0x001e;
    L_0x001d:
        return r0;
    L_0x001e:
        r3 = r3.getInteger(r4);
        r4 = 12;
        r3 = r3 / 100;
        if (r4 <= r3) goto L_0x0029;
    L_0x0028:
        return r0;
    L_0x0029:
        r3 = 0;
        return r3;
    L_0x002b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.ab.a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static android.content.Context m12469b(android.content.Context r2) {
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
        r0 = m12467a(r2);	 Catch:{ NameNotFoundException -> 0x000a }
        r1 = 3;	 Catch:{ NameNotFoundException -> 0x000a }
        r2 = r2.createPackageContext(r0, r1);	 Catch:{ NameNotFoundException -> 0x000a }
        return r2;
    L_0x000a:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.ab.b(android.content.Context):android.content.Context");
    }

    /* renamed from: b */
    public static Intent m12470b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(f10879a.buildUpon().appendQueryParameter(FacebookAdapter.KEY_ID, str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static int m12471c(Context context) {
        Context b = m12469b(context);
        int identifier = b != null ? b.getResources().getIdentifier("clientTheme", FacebookAdapter.KEY_STYLE, m12467a(context)) : 0;
        return identifier == 0 ? VERSION.SDK_INT >= 14 ? 16974120 : VERSION.SDK_INT >= 11 ? 16973931 : 16973829 : identifier;
    }

    /* renamed from: d */
    public static String m12472d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
