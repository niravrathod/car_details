package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzsi {
    /* renamed from: a */
    private static final Object f10166a = new Object();
    /* renamed from: b */
    private static final Map<Uri, zzsi> f10167b = new HashMap();
    /* renamed from: i */
    private static final String[] f10168i = new String[]{"key", "value"};
    /* renamed from: c */
    private final ContentResolver f10169c;
    /* renamed from: d */
    private final Uri f10170d;
    /* renamed from: e */
    private final Object f10171e = new Object();
    /* renamed from: f */
    private volatile Map<String, String> f10172f;
    /* renamed from: g */
    private final Object f10173g = new Object();
    /* renamed from: h */
    private final List<zzsk> f10174h = new ArrayList();

    private zzsi(ContentResolver contentResolver, Uri uri) {
        this.f10169c = contentResolver;
        this.f10170d = uri;
        this.f10169c.registerContentObserver(uri, false, new ad(this, null));
    }

    /* renamed from: a */
    public static zzsi m11965a(ContentResolver contentResolver, Uri uri) {
        zzsi zzsi;
        synchronized (f10166a) {
            zzsi = (zzsi) f10167b.get(uri);
            if (zzsi == null) {
                zzsi = new zzsi(contentResolver, uri);
                f10167b.put(uri, zzsi);
            }
        }
        return zzsi;
    }

    /* renamed from: a */
    public final Map<String, String> m11969a() {
        Map<String, String> c = zzsl.m11979a("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m11967c() : this.f10172f;
        if (c == null) {
            synchronized (this.f10171e) {
                c = this.f10172f;
                if (c == null) {
                    c = m11967c();
                    this.f10172f = c;
                }
            }
        }
        if (c != null) {
            return c;
        }
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void m11970b() {
        synchronized (this.f10171e) {
            this.f10172f = null;
        }
    }

    /* renamed from: c */
    private final java.util.Map<java.lang.String, java.lang.String> m11967c() {
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
        r7 = this;
        r0 = new java.util.HashMap;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r0.<init>();	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r1 = r7.f10169c;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r2 = r7.f10170d;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r3 = f10168i;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r4 = 0;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r5 = 0;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r6 = 0;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r1 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        if (r1 == 0) goto L_0x0031;
    L_0x0014:
        r2 = r1.moveToNext();	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x0028;	 Catch:{ all -> 0x002c }
    L_0x001a:
        r2 = 0;	 Catch:{ all -> 0x002c }
        r2 = r1.getString(r2);	 Catch:{ all -> 0x002c }
        r3 = 1;	 Catch:{ all -> 0x002c }
        r3 = r1.getString(r3);	 Catch:{ all -> 0x002c }
        r0.put(r2, r3);	 Catch:{ all -> 0x002c }
        goto L_0x0014;
    L_0x0028:
        r1.close();	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        goto L_0x0031;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
    L_0x002c:
        r0 = move-exception;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        r1.close();	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
        throw r0;	 Catch:{ SecurityException -> 0x0032, SecurityException -> 0x0032 }
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = "ConfigurationContentLoader";
        r1 = "PhenotypeFlag unable to load ContentProvider, using default values";
        android.util.Log.e(r0, r1);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzsi.c():java.util.Map<java.lang.String, java.lang.String>");
    }

    /* renamed from: d */
    private final void m11968d() {
        synchronized (this.f10173g) {
            for (zzsk a : this.f10174h) {
                a.m11971a();
            }
        }
    }
}
