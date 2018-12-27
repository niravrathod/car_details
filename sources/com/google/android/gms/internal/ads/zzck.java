package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public final class zzck {
    /* renamed from: e */
    private static final String[] f9339e = new String[]{"/aclk", "/pcs/click"};
    /* renamed from: a */
    private String f9340a = "googleads.g.doubleclick.net";
    /* renamed from: b */
    private String f9341b = "/pagead/ads";
    /* renamed from: c */
    private String f9342c = "ad.doubleclick.net";
    /* renamed from: d */
    private String[] f9343d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    /* renamed from: f */
    private zzcg f9344f;

    public zzck(zzcg zzcg) {
        this.f9344f = zzcg;
    }

    /* renamed from: c */
    private final boolean m10476c(android.net.Uri r2) {
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
        r1 = this;
        if (r2 == 0) goto L_0x000f;
    L_0x0002:
        r2 = r2.getHost();	 Catch:{ NullPointerException -> 0x000d }
        r0 = r1.f9342c;	 Catch:{ NullPointerException -> 0x000d }
        r2 = r2.equals(r0);	 Catch:{ NullPointerException -> 0x000d }
        return r2;
    L_0x000d:
        r2 = 0;
        return r2;
    L_0x000f:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzck.c(android.net.Uri):boolean");
    }

    /* renamed from: a */
    public final boolean m10481a(android.net.Uri r6) {
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
        r5 = this;
        if (r6 == 0) goto L_0x001c;
    L_0x0002:
        r0 = 0;
        r6 = r6.getHost();	 Catch:{ NullPointerException -> 0x001b }
        r1 = r5.f9343d;	 Catch:{ NullPointerException -> 0x001b }
        r2 = r1.length;	 Catch:{ NullPointerException -> 0x001b }
        r3 = 0;	 Catch:{ NullPointerException -> 0x001b }
    L_0x000b:
        if (r3 >= r2) goto L_0x001a;	 Catch:{ NullPointerException -> 0x001b }
    L_0x000d:
        r4 = r1[r3];	 Catch:{ NullPointerException -> 0x001b }
        r4 = r6.endsWith(r4);	 Catch:{ NullPointerException -> 0x001b }
        if (r4 == 0) goto L_0x0017;
    L_0x0015:
        r6 = 1;
        return r6;
    L_0x0017:
        r3 = r3 + 1;
        goto L_0x000b;
    L_0x001a:
        return r0;
    L_0x001b:
        return r0;
    L_0x001c:
        r6 = new java.lang.NullPointerException;
        r6.<init>();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzck.a(android.net.Uri):boolean");
    }

    /* renamed from: a */
    public final zzcg m10479a() {
        return this.f9344f;
    }

    /* renamed from: a */
    public final Uri m10477a(Uri uri, Context context) {
        return m10475a(uri, context, null, false, null, null);
    }

    /* renamed from: a */
    public final void m10480a(MotionEvent motionEvent) {
        this.f9344f.zza(motionEvent);
    }

    /* renamed from: a */
    public final android.net.Uri m10478a(android.net.Uri r9, android.content.Context r10, android.view.View r11, android.app.Activity r12) {
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
        r8 = this;
        r0 = "ai";	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r4 = r9.getQueryParameter(r0);	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r5 = 1;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r1 = r8;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r2 = r9;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r3 = r10;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r6 = r11;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r7 = r12;	 Catch:{ UnsupportedOperationException -> 0x0011 }
        r9 = r1.m10475a(r2, r3, r4, r5, r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0011 }
        return r9;
    L_0x0011:
        r9 = new com.google.android.gms.internal.ads.zzcl;
        r10 = "Provided Uri is not in a valid state";
        r9.<init>(r10);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzck.a(android.net.Uri, android.content.Context, android.view.View, android.app.Activity):android.net.Uri");
    }

    /* renamed from: b */
    public final boolean m10482b(Uri uri) {
        if (m10481a(uri)) {
            for (String endsWith : f9339e) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final android.net.Uri m10475a(android.net.Uri r4, android.content.Context r5, java.lang.String r6, boolean r7, android.view.View r8, android.app.Activity r9) {
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
        r3 = this;
        r0 = r3.m10476c(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r0 == 0) goto L_0x001b;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0006:
        r1 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r2 = "dc_ms=";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r1 = r1.contains(r2);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r1 != 0) goto L_0x0013;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0012:
        goto L_0x0023;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0013:
        r4 = new com.google.android.gms.internal.ads.zzcl;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = "Parameter already exists: dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x001b:
        r1 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r1 = r4.getQueryParameter(r1);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r1 != 0) goto L_0x00fd;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0023:
        if (r7 == 0) goto L_0x002c;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0025:
        r7 = r3.f9344f;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = r7.zza(r5, r6, r8, r9);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        goto L_0x0032;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x002c:
        r6 = r3.f9344f;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = r6.zza(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0032:
        r6 = 0;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r7 = -1;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r0 == 0) goto L_0x00af;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0036:
        r8 = "dc_ms";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r9 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = ";adurl";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r0 == r7) goto L_0x006f;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0044:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = r0 + 1;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = r9.substring(r6, r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = r9.substring(r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x006f:
        r4 = r4.getEncodedPath();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r7 = r9.indexOf(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r1 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r1 = r1 + r7;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = r9.substring(r6, r1);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = ";";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = ";";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r4.length();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r7 = r7 + r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r9.substring(r7);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00af:
        r8 = "ms";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r9 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = "&adurl";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        if (r0 != r7) goto L_0x00c3;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00bd:
        r0 = "?adurl";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = r9.indexOf(r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00c3:
        if (r0 == r7) goto L_0x00f0;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00c5:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r0 = r0 + 1;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = r9.substring(r6, r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.<init>(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r6 = "=";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = "&";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = r9.substring(r0);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r4.toString();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00f0:
        r4 = r4.buildUpon();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r4.appendQueryParameter(r8, r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4 = r4.build();	 Catch:{ UnsupportedOperationException -> 0x0105 }
        return r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x00fd:
        r4 = new com.google.android.gms.internal.ads.zzcl;	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r5 = "Query parameter already exists: ms";	 Catch:{ UnsupportedOperationException -> 0x0105 }
        r4.<init>(r5);	 Catch:{ UnsupportedOperationException -> 0x0105 }
        throw r4;	 Catch:{ UnsupportedOperationException -> 0x0105 }
    L_0x0105:
        r4 = new com.google.android.gms.internal.ads.zzcl;
        r5 = "Provided Uri is not in a valid state";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzck.a(android.net.Uri, android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity):android.net.Uri");
    }
}
