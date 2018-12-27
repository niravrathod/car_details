package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.support.v4.content.C0397e;
import android.util.Log;
import javax.annotation.Nullable;

public abstract class zzsl<T> {
    /* renamed from: b */
    private static final Object f10175b = new Object();
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: c */
    private static Context f10176c = null;
    /* renamed from: d */
    private static boolean f10177d = false;
    /* renamed from: e */
    private static volatile Boolean f10178e = null;
    /* renamed from: a */
    final String f10179a;
    /* renamed from: f */
    private final zzsv f10180f;
    /* renamed from: g */
    private final String f10181g;
    /* renamed from: h */
    private final T f10182h;
    /* renamed from: i */
    private T f10183i;
    /* renamed from: j */
    private volatile zzsi f10184j;
    /* renamed from: k */
    private volatile SharedPreferences f10185k;

    /* renamed from: a */
    public static void m11978a(Context context) {
        synchronized (f10175b) {
            if (VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (f10176c != context) {
                f10178e = null;
            }
            f10176c = context;
        }
        f10177d = null;
    }

    /* renamed from: a */
    protected abstract T mo2922a(String str);

    private zzsl(zzsv zzsv, String str, T t) {
        this.f10183i = null;
        this.f10184j = null;
        this.f10185k = null;
        if (zzsv.f10187b != null) {
            this.f10180f = zzsv;
            String valueOf = String.valueOf(zzsv.f10188c);
            String valueOf2 = String.valueOf(str);
            this.f10181g = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            zzsv = String.valueOf(zzsv.f10189d);
            str = String.valueOf(str);
            this.f10179a = str.length() != 0 ? zzsv.concat(str) : new String(zzsv);
            this.f10182h = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    public final T m11990a() {
        return this.f10182h;
    }

    /* renamed from: b */
    public final T m11992b() {
        if (f10176c != null) {
            zzsv zzsv = this.f10180f;
            T d = m11986d();
            if (d != null) {
                return d;
            }
            d = m11987e();
            if (d != null) {
                return d;
            }
            return this.f10182h;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    @TargetApi(24)
    @Nullable
    /* renamed from: d */
    private final T m11986d() {
        zzsv zzsv = this.f10180f;
        String str;
        if (m11979a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            str = "PhenotypeFlag";
            String str2 = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(this.f10179a);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (this.f10180f.f10187b != null) {
            zzsi f = m11988f();
            if (f != null) {
                str = (String) m11977a(new ae(this, f));
                if (str != null) {
                    return mo2922a(str);
                }
            }
        } else {
            zzsv = this.f10180f;
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    private final T m11987e() {
        zzsv zzsv = this.f10180f;
        if (m11989g()) {
            try {
                String str = (String) m11977a(new af(this));
                if (str != null) {
                    return mo2922a(str);
                }
            } catch (Throwable e) {
                String str2 = "PhenotypeFlag";
                String str3 = "Unable to read GServices for flag: ";
                String valueOf = String.valueOf(this.f10179a);
                Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static <V> V m11977a(com.google.android.gms.internal.measurement.am<V> r2) {
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
        r0 = r2.mo2921a();	 Catch:{ SecurityException -> 0x0006 }
        r2 = r0;
        goto L_0x0011;
    L_0x0006:
        r0 = android.os.Binder.clearCallingIdentity();
        r2 = r2.mo2921a();	 Catch:{ all -> 0x0012 }
        android.os.Binder.restoreCallingIdentity(r0);
    L_0x0011:
        return r2;
    L_0x0012:
        r2 = move-exception;
        android.os.Binder.restoreCallingIdentity(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzsl.a(com.google.android.gms.internal.measurement.am):V");
    }

    /* renamed from: f */
    private final com.google.android.gms.internal.measurement.zzsi m11988f() {
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
        r2 = this;
        r0 = r2.f10184j;
        if (r0 != 0) goto L_0x0016;
    L_0x0004:
        r0 = f10176c;	 Catch:{ SecurityException -> 0x0016 }
        r0 = r0.getContentResolver();	 Catch:{ SecurityException -> 0x0016 }
        r1 = r2.f10180f;	 Catch:{ SecurityException -> 0x0016 }
        r1 = r1.f10187b;	 Catch:{ SecurityException -> 0x0016 }
        r0 = com.google.android.gms.internal.measurement.zzsi.m11965a(r0, r1);	 Catch:{ SecurityException -> 0x0016 }
        r2.f10184j = r0;	 Catch:{ SecurityException -> 0x0016 }
    L_0x0016:
        r0 = r2.f10184j;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzsl.f():com.google.android.gms.internal.measurement.zzsi");
    }

    /* renamed from: a */
    static boolean m11979a(String str, boolean z) {
        try {
            if (m11989g()) {
                return ((Boolean) m11977a(new ag(str, false))).booleanValue();
            }
            return false;
        } catch (String str2) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", str2);
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m11989g() {
        if (f10178e == null) {
            boolean z = false;
            if (f10176c == null) {
                return false;
            }
            if (C0397e.m1471a(f10176c, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f10178e = Boolean.valueOf(z);
        }
        return f10178e.booleanValue();
    }

    /* renamed from: b */
    private static zzsl<Long> m11982b(zzsv zzsv, String str, long j) {
        return new ah(zzsv, str, Long.valueOf(j));
    }

    /* renamed from: b */
    private static zzsl<Integer> m11981b(zzsv zzsv, String str, int i) {
        return new ai(zzsv, str, Integer.valueOf(i));
    }

    /* renamed from: b */
    private static zzsl<Boolean> m11984b(zzsv zzsv, String str, boolean z) {
        return new aj(zzsv, str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    private static zzsl<Double> m11980b(zzsv zzsv, String str, double d) {
        return new ak(zzsv, str, Double.valueOf(d));
    }

    /* renamed from: b */
    private static zzsl<String> m11983b(zzsv zzsv, String str, String str2) {
        return new al(zzsv, str, str2);
    }

    /* renamed from: c */
    final /* synthetic */ String m11993c() {
        return zzsg.m11957a(f10176c.getContentResolver(), this.f10181g, null);
    }
}
