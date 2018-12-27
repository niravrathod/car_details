package com.bumptech.glide.load.resource.p064b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;

/* renamed from: com.bumptech.glide.load.resource.b.d */
public class C3506d implements C1280f<Uri, Drawable> {
    /* renamed from: a */
    private final Context f14544a;

    public C3506d(Context context) {
        this.f14544a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean m17782a(Uri uri, C3452e c3452e) {
        return uri.getScheme().equals("android.resource");
    }

    /* renamed from: a */
    public C1277s<Drawable> m17780a(Uri uri, int i, int i2, C3452e c3452e) {
        i = m17778a(uri);
        String authority = uri.getAuthority();
        return C4516c.m24958a(C1281a.m5159a(this.f14544a, authority.equals(this.f14544a.getPackageName()) != null ? this.f14544a : m17779a(uri, authority), i));
    }

    /* renamed from: a */
    private Context m17779a(Uri uri, String str) {
        try {
            return this.f14544a.createPackageContext(str, 0);
        } catch (String str2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to obtain context or unrecognized Uri format for: ");
            stringBuilder.append(uri);
            throw new IllegalArgumentException(stringBuilder.toString(), str2);
        }
    }

    /* renamed from: a */
    private int m17778a(android.net.Uri r6) {
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
        r5 = this;
        r0 = r6.getPathSegments();
        r1 = r0.size();
        r2 = 1;
        r3 = 0;
        r4 = 2;
        if (r1 != r4) goto L_0x002c;
    L_0x000d:
        r1 = r6.getAuthority();
        r3 = r0.get(r3);
        r3 = (java.lang.String) r3;
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r2 = r5.f14544a;
        r2 = r2.getResources();
        r0 = r2.getIdentifier(r0, r3, r1);
        r0 = java.lang.Integer.valueOf(r0);
        goto L_0x003e;
    L_0x002c:
        r1 = r0.size();
        if (r1 != r2) goto L_0x003d;
    L_0x0032:
        r0 = r0.get(r3);	 Catch:{ NumberFormatException -> 0x003d }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x003d }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x003d }
        goto L_0x003e;
    L_0x003d:
        r0 = 0;
    L_0x003e:
        if (r0 == 0) goto L_0x0062;
    L_0x0040:
        r1 = r0.intValue();
        if (r1 == 0) goto L_0x004b;
    L_0x0046:
        r6 = r0.intValue();
        return r6;
    L_0x004b:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Failed to obtain resource id for: ";
        r1.append(r2);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
    L_0x0062:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unrecognized Uri format: ";
        r1.append(r2);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.b.d.a(android.net.Uri):int");
    }
}
