package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class zzdb {
    /* renamed from: b */
    private static final String f9357b = "zzdb";
    /* renamed from: a */
    protected Context f9358a;
    /* renamed from: c */
    private ExecutorService f9359c;
    /* renamed from: d */
    private DexClassLoader f9360d;
    /* renamed from: e */
    private zzcm f9361e;
    /* renamed from: f */
    private byte[] f9362f;
    /* renamed from: g */
    private volatile AdvertisingIdClient f9363g = null;
    /* renamed from: h */
    private volatile boolean f9364h = false;
    /* renamed from: i */
    private Future f9365i = null;
    /* renamed from: j */
    private boolean f9366j;
    /* renamed from: k */
    private volatile zzbb f9367k = null;
    /* renamed from: l */
    private Future f9368l = null;
    /* renamed from: m */
    private zzce f9369m;
    /* renamed from: n */
    private boolean f9370n = false;
    /* renamed from: o */
    private boolean f9371o = false;
    /* renamed from: p */
    private Map<Pair<String, String>, zzei> f9372p;
    /* renamed from: q */
    private boolean f9373q = false;
    /* renamed from: r */
    private boolean f9374r;
    /* renamed from: s */
    private boolean f9375s;

    /* renamed from: com.google.android.gms.internal.ads.zzdb$a */
    final class C2455a extends BroadcastReceiver {
        /* renamed from: a */
        private final /* synthetic */ zzdb f9356a;

        private C2455a(zzdb zzdb) {
            this.f9356a = zzdb;
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) != null) {
                this.f9356a.f9374r = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) != null) {
                this.f9356a.f9374r = null;
            }
        }
    }

    /* renamed from: a */
    public static com.google.android.gms.internal.ads.zzdb m10493a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
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
        r0 = new com.google.android.gms.internal.ads.zzdb;
        r0.<init>(r8);
        r8 = new com.google.android.gms.internal.ads.pa;	 Catch:{ zzcy -> 0x0159 }
        r8.<init>();	 Catch:{ zzcy -> 0x0159 }
        r8 = java.util.concurrent.Executors.newCachedThreadPool(r8);	 Catch:{ zzcy -> 0x0159 }
        r0.f9359c = r8;	 Catch:{ zzcy -> 0x0159 }
        r0.f9364h = r11;	 Catch:{ zzcy -> 0x0159 }
        if (r11 == 0) goto L_0x0021;	 Catch:{ zzcy -> 0x0159 }
    L_0x0014:
        r8 = r0.f9359c;	 Catch:{ zzcy -> 0x0159 }
        r11 = new com.google.android.gms.internal.ads.pb;	 Catch:{ zzcy -> 0x0159 }
        r11.<init>(r0);	 Catch:{ zzcy -> 0x0159 }
        r8 = r8.submit(r11);	 Catch:{ zzcy -> 0x0159 }
        r0.f9365i = r8;	 Catch:{ zzcy -> 0x0159 }
    L_0x0021:
        r8 = r0.f9359c;	 Catch:{ zzcy -> 0x0159 }
        r11 = new com.google.android.gms.internal.ads.pd;	 Catch:{ zzcy -> 0x0159 }
        r11.<init>(r0);	 Catch:{ zzcy -> 0x0159 }
        r8.execute(r11);	 Catch:{ zzcy -> 0x0159 }
        r8 = 1;
        r11 = 0;
        r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();	 Catch:{ Throwable -> 0x004b }
        r2 = r0.f9358a;	 Catch:{ Throwable -> 0x004b }
        r2 = r1.getApkVersion(r2);	 Catch:{ Throwable -> 0x004b }
        if (r2 <= 0) goto L_0x003b;	 Catch:{ Throwable -> 0x004b }
    L_0x0039:
        r2 = 1;	 Catch:{ Throwable -> 0x004b }
        goto L_0x003c;	 Catch:{ Throwable -> 0x004b }
    L_0x003b:
        r2 = 0;	 Catch:{ Throwable -> 0x004b }
    L_0x003c:
        r0.f9370n = r2;	 Catch:{ Throwable -> 0x004b }
        r2 = r0.f9358a;	 Catch:{ Throwable -> 0x004b }
        r1 = r1.isGooglePlayServicesAvailable(r2);	 Catch:{ Throwable -> 0x004b }
        if (r1 != 0) goto L_0x0048;	 Catch:{ Throwable -> 0x004b }
    L_0x0046:
        r1 = 1;	 Catch:{ Throwable -> 0x004b }
        goto L_0x0049;	 Catch:{ Throwable -> 0x004b }
    L_0x0048:
        r1 = 0;	 Catch:{ Throwable -> 0x004b }
    L_0x0049:
        r0.f9371o = r1;	 Catch:{ Throwable -> 0x004b }
    L_0x004b:
        r0.m10506a(r11, r8);	 Catch:{ zzcy -> 0x0159 }
        r1 = com.google.android.gms.internal.ads.zzdi.m10526a();	 Catch:{ zzcy -> 0x0159 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ zzcy -> 0x0159 }
    L_0x0054:
        r1 = com.google.android.gms.internal.ads.zznw.bn;	 Catch:{ zzcy -> 0x0159 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ zzcy -> 0x0159 }
        r1 = r2.m10897a(r1);	 Catch:{ zzcy -> 0x0159 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ zzcy -> 0x0159 }
        r1 = r1.booleanValue();	 Catch:{ zzcy -> 0x0159 }
        if (r1 != 0) goto L_0x0067;	 Catch:{ zzcy -> 0x0159 }
    L_0x0066:
        goto L_0x006f;	 Catch:{ zzcy -> 0x0159 }
    L_0x0067:
        r8 = new java.lang.IllegalStateException;	 Catch:{ zzcy -> 0x0159 }
        r9 = "Task Context initialization must not be called from the UI thread.";	 Catch:{ zzcy -> 0x0159 }
        r8.<init>(r9);	 Catch:{ zzcy -> 0x0159 }
        throw r8;	 Catch:{ zzcy -> 0x0159 }
    L_0x006f:
        r1 = new com.google.android.gms.internal.ads.zzcm;	 Catch:{ zzcy -> 0x0159 }
        r2 = 0;	 Catch:{ zzcy -> 0x0159 }
        r1.<init>(r2);	 Catch:{ zzcy -> 0x0159 }
        r0.f9361e = r1;	 Catch:{ zzcy -> 0x0159 }
        r1 = r0.f9361e;	 Catch:{ zzcn -> 0x0152 }
        r9 = r1.m10485a(r9);	 Catch:{ zzcn -> 0x0152 }
        r0.f9362f = r9;	 Catch:{ zzcn -> 0x0152 }
        r9 = r0.f9358a;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r9 = r9.getCacheDir();	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        if (r9 != 0) goto L_0x0098;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x0087:
        r9 = r0.f9358a;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r1 = "dex";	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r9 = r9.getDir(r1, r11);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        if (r9 == 0) goto L_0x0092;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x0091:
        goto L_0x0098;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x0092:
        r8 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r8.<init>();	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        throw r8;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x0098:
        r1 = "1529567361524";	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4 = "%s/%s.jar";	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r5 = 2;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r6 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r6[r11] = r9;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r6[r8] = r1;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4 = java.lang.String.format(r4, r6);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3.<init>(r4);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4 = r3.exists();	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        if (r4 != 0) goto L_0x00c9;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x00b2:
        r4 = r0.f9361e;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r6 = r0.f9362f;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r10 = r4.m10486a(r6, r10);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3.createNewFile();	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4.<init>(r3);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r6 = r10.length;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4.write(r10, r11, r6);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r4.close();	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x00c9:
        r0.m10501b(r9, r1);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r10 = new dalvik.system.DexClassLoader;	 Catch:{ all -> 0x011f }
        r4 = r3.getAbsolutePath();	 Catch:{ all -> 0x011f }
        r6 = r9.getAbsolutePath();	 Catch:{ all -> 0x011f }
        r7 = r0.f9358a;	 Catch:{ all -> 0x011f }
        r7 = r7.getClassLoader();	 Catch:{ all -> 0x011f }
        r10.<init>(r4, r6, r2, r7);	 Catch:{ all -> 0x011f }
        r0.f9360d = r10;	 Catch:{ all -> 0x011f }
        m10495a(r3);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r0.m10496a(r9, r1);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r10 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3[r11] = r9;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3[r8] = r1;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r9 = java.lang.String.format(r10, r3);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        m10497a(r9);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r9 = r0.f9375s;	 Catch:{ zzcy -> 0x0159 }
        if (r9 != 0) goto L_0x0115;	 Catch:{ zzcy -> 0x0159 }
    L_0x00fa:
        r9 = new android.content.IntentFilter;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>();	 Catch:{ zzcy -> 0x0159 }
        r10 = "android.intent.action.USER_PRESENT";	 Catch:{ zzcy -> 0x0159 }
        r9.addAction(r10);	 Catch:{ zzcy -> 0x0159 }
        r10 = "android.intent.action.SCREEN_OFF";	 Catch:{ zzcy -> 0x0159 }
        r9.addAction(r10);	 Catch:{ zzcy -> 0x0159 }
        r10 = r0.f9358a;	 Catch:{ zzcy -> 0x0159 }
        r11 = new com.google.android.gms.internal.ads.zzdb$a;	 Catch:{ zzcy -> 0x0159 }
        r11.<init>();	 Catch:{ zzcy -> 0x0159 }
        r10.registerReceiver(r11, r9);	 Catch:{ zzcy -> 0x0159 }
        r0.f9375s = r8;	 Catch:{ zzcy -> 0x0159 }
    L_0x0115:
        r9 = new com.google.android.gms.internal.ads.zzce;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r0);	 Catch:{ zzcy -> 0x0159 }
        r0.f9369m = r9;	 Catch:{ zzcy -> 0x0159 }
        r0.f9373q = r8;	 Catch:{ zzcy -> 0x0159 }
        goto L_0x0159;
    L_0x011f:
        r10 = move-exception;
        m10495a(r3);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r0.m10496a(r9, r1);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r2 = "%s/%s.dex";	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3 = new java.lang.Object[r5];	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3[r11] = r9;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r3[r8] = r1;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        r8 = java.lang.String.format(r2, r3);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        m10497a(r8);	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
        throw r10;	 Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcn -> 0x013d, NullPointerException -> 0x0136 }
    L_0x0136:
        r8 = move-exception;
        r9 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r8);	 Catch:{ zzcy -> 0x0159 }
        throw r9;	 Catch:{ zzcy -> 0x0159 }
    L_0x013d:
        r8 = move-exception;	 Catch:{ zzcy -> 0x0159 }
        r9 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r8);	 Catch:{ zzcy -> 0x0159 }
        throw r9;	 Catch:{ zzcy -> 0x0159 }
    L_0x0144:
        r8 = move-exception;	 Catch:{ zzcy -> 0x0159 }
        r9 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r8);	 Catch:{ zzcy -> 0x0159 }
        throw r9;	 Catch:{ zzcy -> 0x0159 }
    L_0x014b:
        r8 = move-exception;	 Catch:{ zzcy -> 0x0159 }
        r9 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r8);	 Catch:{ zzcy -> 0x0159 }
        throw r9;	 Catch:{ zzcy -> 0x0159 }
    L_0x0152:
        r8 = move-exception;	 Catch:{ zzcy -> 0x0159 }
        r9 = new com.google.android.gms.internal.ads.zzcy;	 Catch:{ zzcy -> 0x0159 }
        r9.<init>(r8);	 Catch:{ zzcy -> 0x0159 }
        throw r9;	 Catch:{ zzcy -> 0x0159 }
    L_0x0159:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzdb");
    }

    /* renamed from: a */
    public final Context m10504a() {
        return this.f9358a;
    }

    /* renamed from: b */
    public final boolean m10509b() {
        return this.f9373q;
    }

    /* renamed from: c */
    public final ExecutorService m10510c() {
        return this.f9359c;
    }

    /* renamed from: d */
    public final DexClassLoader m10511d() {
        return this.f9360d;
    }

    /* renamed from: e */
    public final zzcm m10512e() {
        return this.f9361e;
    }

    /* renamed from: f */
    public final byte[] m10513f() {
        return this.f9362f;
    }

    /* renamed from: g */
    public final boolean m10514g() {
        return this.f9370n;
    }

    /* renamed from: h */
    public final zzce m10515h() {
        return this.f9369m;
    }

    /* renamed from: i */
    public final boolean m10516i() {
        return this.f9371o;
    }

    /* renamed from: j */
    public final boolean m10517j() {
        return this.f9374r;
    }

    /* renamed from: k */
    public final zzbb m10518k() {
        return this.f9367k;
    }

    /* renamed from: l */
    public final Future m10519l() {
        return this.f9368l;
    }

    private zzdb(Context context) {
        boolean z = true;
        this.f9374r = true;
        this.f9375s = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.f9366j = z;
        if (this.f9366j) {
            context = applicationContext;
        }
        this.f9358a = context;
        this.f9372p = new HashMap();
    }

    /* renamed from: a */
    private final void m10496a(java.io.File r8, java.lang.String r9) {
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
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r8;
        r5 = 1;
        r3[r5] = r9;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x001b;
    L_0x001a:
        return;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r8;
        r2[r5] = r9;
        r8 = java.lang.String.format(r3, r2);
        r1.<init>(r8);
        r8 = r1.exists();
        if (r8 != 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r2 = r1.length();
        r5 = 0;
        r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r8 > 0) goto L_0x003e;
    L_0x003d:
        return;
    L_0x003e:
        r8 = (int) r2;
        r8 = new byte[r8];
        r2 = 0;
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r3.<init>(r1);	 Catch:{ IOException -> 0x00af, IOException -> 0x00af, IOException -> 0x00af, all -> 0x009f }
        r5 = r3.read(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        if (r5 > 0) goto L_0x0054;
    L_0x004d:
        r3.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        m10495a(r1);
        return;
    L_0x0054:
        r5 = new com.google.android.gms.internal.ads.zzbf;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.<init>();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f20063d = r6;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r9.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f20062c = r9;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = r7.f9361e;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r6 = r7.f9362f;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r9.m10484a(r6, r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = r8.getBytes();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f20060a = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = com.google.android.gms.internal.ads.oa.m9350a(r8);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r5.f20061b = r8;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r0.createNewFile();	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r8.<init>(r0);	 Catch:{ IOException -> 0x00b0, IOException -> 0x00b0, IOException -> 0x00b0, all -> 0x009d }
        r9 = com.google.android.gms.internal.ads.zzbgz.m10450a(r5);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r0 = r9.length;	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.write(r9, r4, r0);	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r8.close();	 Catch:{ IOException -> 0x009b, IOException -> 0x009b, IOException -> 0x009b, all -> 0x0098 }
        r3.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r8.close();	 Catch:{ IOException -> 0x0094 }
    L_0x0094:
        m10495a(r1);
        return;
    L_0x0098:
        r9 = move-exception;
        r2 = r8;
        goto L_0x00a1;
    L_0x009b:
        r2 = r8;
        goto L_0x00b0;
    L_0x009d:
        r9 = move-exception;
        goto L_0x00a1;
    L_0x009f:
        r9 = move-exception;
        r3 = r2;
    L_0x00a1:
        if (r3 == 0) goto L_0x00a6;
    L_0x00a3:
        r3.close();	 Catch:{ IOException -> 0x00a6 }
    L_0x00a6:
        if (r2 == 0) goto L_0x00ab;
    L_0x00a8:
        r2.close();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        m10495a(r1);
        throw r9;
    L_0x00af:
        r3 = r2;
    L_0x00b0:
        if (r3 == 0) goto L_0x00b5;
    L_0x00b2:
        r3.close();	 Catch:{ IOException -> 0x00b5 }
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r2.close();	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        m10495a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m10497a(String str) {
        m10495a(new File(str));
    }

    /* renamed from: a */
    private static void m10495a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(f9357b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    /* renamed from: b */
    private final boolean m10501b(java.io.File r10, java.lang.String r11) {
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
        r9 = this;
        r0 = new java.io.File;
        r1 = "%s/%s.tmp";
        r2 = 2;
        r3 = new java.lang.Object[r2];
        r4 = 0;
        r3[r4] = r10;
        r5 = 1;
        r3[r5] = r11;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1);
        r1 = r0.exists();
        if (r1 != 0) goto L_0x001b;
    L_0x001a:
        return r4;
    L_0x001b:
        r1 = new java.io.File;
        r3 = "%s/%s.dex";
        r2 = new java.lang.Object[r2];
        r2[r4] = r10;
        r2[r5] = r11;
        r10 = java.lang.String.format(r3, r2);
        r1.<init>(r10);
        r10 = r1.exists();
        if (r10 == 0) goto L_0x0033;
    L_0x0032:
        return r4;
    L_0x0033:
        r10 = 0;
        r2 = r0.length();	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = 0;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        if (r8 > 0) goto L_0x0042;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x003e:
        m10495a(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        return r4;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
    L_0x0042:
        r2 = (int) r2;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r2 = new byte[r2];	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x00d0, IOException -> 0x00d0, IOException -> 0x00d0, all -> 0x00c3 }
        r6 = r3.read(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r6 > 0) goto L_0x005e;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0050:
        r11 = f9357b;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1 = "Cannot read the cache data.";	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        android.util.Log.d(r11, r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        m10495a(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x005d }
    L_0x005d:
        return r4;
    L_0x005e:
        r6 = new com.google.android.gms.internal.ads.zzbf;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = com.google.android.gms.internal.ads.zzbgz.m10448a(r6, r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = (com.google.android.gms.internal.ads.zzbf) r2;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r7 = r2.f20062c;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r7);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.equals(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0076:
        r11 = r2.f20061b;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r2.f20060a;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = com.google.android.gms.internal.ads.oa.m9350a(r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 == 0) goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0084:
        r11 = r2.f20063d;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = android.os.Build.VERSION.SDK;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = r6.getBytes();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = java.util.Arrays.equals(r11, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        if (r11 != 0) goto L_0x0093;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0092:
        goto L_0x00ba;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
    L_0x0093:
        r11 = r9.f9361e;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = r9.f9362f;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6 = new java.lang.String;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r2 = r2.f20060a;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r6.<init>(r2);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r11 = r11.m10486a(r0, r6);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r1.createNewFile();	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r10 = r11.length;	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r0.write(r11, r4, r10);	 Catch:{ IOException -> 0x00b8, IOException -> 0x00b8, IOException -> 0x00b8, all -> 0x00b5 }
        r3.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x00b1:
        r0.close();	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        return r5;
    L_0x00b5:
        r11 = move-exception;
        r10 = r0;
        goto L_0x00c5;
    L_0x00b8:
        r10 = r0;
        goto L_0x00d1;
    L_0x00ba:
        m10495a(r0);	 Catch:{ IOException -> 0x00d1, IOException -> 0x00d1, IOException -> 0x00d1, all -> 0x00c1 }
        r3.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00c0:
        return r4;
    L_0x00c1:
        r11 = move-exception;
        goto L_0x00c5;
    L_0x00c3:
        r11 = move-exception;
        r3 = r10;
    L_0x00c5:
        if (r3 == 0) goto L_0x00ca;
    L_0x00c7:
        r3.close();	 Catch:{ IOException -> 0x00ca }
    L_0x00ca:
        if (r10 == 0) goto L_0x00cf;
    L_0x00cc:
        r10.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00cf:
        throw r11;
    L_0x00d0:
        r3 = r10;
    L_0x00d1:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d3:
        r3.close();	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        if (r10 == 0) goto L_0x00db;
    L_0x00d8:
        r10.close();	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.b(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean m10507a(String str, String str2, Class<?>... clsArr) {
        if (this.f9372p.containsKey(new Pair(str, str2))) {
            return null;
        }
        this.f9372p.put(new Pair(str, str2), new zzei(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: a */
    public final Method m10505a(String str, String str2) {
        zzei zzei = (zzei) this.f9372p.get(new Pair(str, str2));
        if (zzei == null) {
            return null;
        }
        return zzei.m10541a();
    }

    /* renamed from: o */
    private final void m10502o() {
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
        r2 = this;
        r0 = r2.f9363g;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 != 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0004:
        r0 = r2.f9366j;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0008:
        r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r1 = r2.f9358a;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.<init>(r1);	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r0.start();	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
        r2.f9363g = r0;	 Catch:{ GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015, GooglePlayServicesNotAvailableException -> 0x0015 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = 0;
        r2.f9363g = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.o():void");
    }

    /* renamed from: a */
    final void m10506a(int i, boolean z) {
        if (this.f9371o) {
            z = this.f9359c.submit(new pc(this, i, z));
            if (i == 0) {
                this.f9368l = z;
            }
        }
    }

    /* renamed from: b */
    final com.google.android.gms.internal.ads.zzbb m10508b(int r1, boolean r2) {
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
        r0 = this;
        if (r1 <= 0) goto L_0x000a;
    L_0x0002:
        if (r2 == 0) goto L_0x000a;
    L_0x0004:
        r1 = r1 * 1000;
        r1 = (long) r1;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x000a }
    L_0x000a:
        r1 = r0.m10503p();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.b(int, boolean):com.google.android.gms.internal.ads.zzbb");
    }

    /* renamed from: b */
    private static boolean m10500b(int i, zzbb zzbb) {
        if (i < 4) {
            if (zzbb == null) {
                return true;
            }
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bq)).booleanValue() && (zzbb.f19997n == null || zzbb.f19997n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) zzkd.m10713e().m10897a(zznw.br)).booleanValue() && (zzbb.f19983Y == null || zzbb.f19983Y.f20064a == null || zzbb.f19983Y.f20064a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final com.google.android.gms.internal.ads.zzbb m10503p() {
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
        r0 = r3.f9358a;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageManager();	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.f9358a;	 Catch:{ Throwable -> 0x0024 }
        r1 = r1.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r2 = 0;	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ Throwable -> 0x0024 }
        r1 = r3.f9358a;	 Catch:{ Throwable -> 0x0024 }
        r2 = r3.f9358a;	 Catch:{ Throwable -> 0x0024 }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x0024 }
        r0 = r0.versionCode;	 Catch:{ Throwable -> 0x0024 }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ Throwable -> 0x0024 }
        r0 = com.google.android.gms.internal.ads.zzavd.m10179a(r1, r2, r0);	 Catch:{ Throwable -> 0x0024 }
        goto L_0x0025;
    L_0x0024:
        r0 = 0;
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.p():com.google.android.gms.internal.ads.zzbb");
    }

    /* renamed from: m */
    public final com.google.android.gms.ads.identifier.AdvertisingIdClient m10520m() {
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
        r0 = r5.f9364h;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r5.f9363g;
        if (r0 == 0) goto L_0x000d;
    L_0x000a:
        r0 = r5.f9363g;
        return r0;
    L_0x000d:
        r0 = r5.f9365i;
        if (r0 == 0) goto L_0x0023;
    L_0x0011:
        r0 = r5.f9365i;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r0.get(r2, r4);	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        r5.f9365i = r1;	 Catch:{ InterruptedException -> 0x0023, InterruptedException -> 0x0023, TimeoutException -> 0x001d }
        goto L_0x0023;
    L_0x001d:
        r0 = r5.f9365i;
        r1 = 1;
        r0.cancel(r1);
    L_0x0023:
        r0 = r5.f9363g;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.m():com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* renamed from: n */
    public final int m10521n() {
        return this.f9369m != null ? zzce.m10470a() : Integer.MIN_VALUE;
    }
}
