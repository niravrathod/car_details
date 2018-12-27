package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzael implements zzaep {
    /* renamed from: a */
    private static final Object f16791a = new Object();
    @VisibleForTesting
    /* renamed from: b */
    private static zzaep f16792b = null;
    @VisibleForTesting
    /* renamed from: c */
    private static zzaep f16793c = null;
    /* renamed from: d */
    private final Object f16794d;
    /* renamed from: e */
    private final Context f16795e;
    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f16796f;
    /* renamed from: g */
    private final ExecutorService f16797g;
    /* renamed from: h */
    private final zzaop f16798h;

    /* renamed from: a */
    public static zzaep m21106a(Context context) {
        synchronized (f16791a) {
            if (f16792b == null) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.f9703b)).booleanValue()) {
                    f16792b = new zzael(context);
                } else {
                    f16792b = new zzaeq();
                }
            }
        }
        return f16792b;
    }

    /* renamed from: a */
    public static zzaep m21107a(Context context, zzaop zzaop) {
        synchronized (f16791a) {
            if (f16793c == null) {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.f9703b)).booleanValue()) {
                    zzaep zzael = new zzael(context, zzaop);
                    context = Looper.getMainLooper().getThread();
                    if (context != null) {
                        synchronized (zzael.f16794d) {
                            zzael.f16796f.put(context, Boolean.valueOf(true));
                        }
                        context.setUncaughtExceptionHandler(new ay(zzael, context.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new ax(zzael, Thread.getDefaultUncaughtExceptionHandler()));
                    f16793c = zzael;
                } else {
                    f16793c = new zzaeq();
                }
            }
        }
        return f16793c;
    }

    private zzael(Context context) {
        this(context, zzaop.m26280a());
    }

    private zzael(Context context, zzaop zzaop) {
        this.f16794d = new Object();
        this.f16796f = new WeakHashMap();
        this.f16797g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f16795e = context;
        this.f16798h = zzaop;
    }

    /* renamed from: a */
    protected final void m21108a(Thread thread, Throwable th) {
        thread = true;
        if (th != null) {
            Throwable th2 = th;
            Object obj = null;
            Object obj2 = null;
            while (th2 != null) {
                Object obj3 = obj2;
                obj2 = obj;
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (zzaoa.m9966b(stackTraceElement.getClassName())) {
                        obj2 = 1;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        obj3 = 1;
                    }
                }
                th2 = th2.getCause();
                obj = obj2;
                obj2 = obj3;
            }
            if (obj != null && obj2 == null) {
                if (thread != null) {
                    mo2230a(th, "", 1.0f);
                }
            }
        }
        thread = null;
        if (thread != null) {
            mo2230a(th, "", 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo2229a(Throwable th, String str) {
        mo2230a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo2230a(Throwable th, String str, float f) {
        if (zzaoa.m9957a(th) != null) {
            String name = th.getClass().getName();
            Writer stringWriter = new StringWriter();
            zzbbe.m10255a(th, new PrintWriter(stringWriter));
            th = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            Object obj = Math.random() < ((double) f) ? 1 : null;
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (obj != null) {
                f = new ArrayList();
                f.add(m21105a(name, th, str, i2).toString());
                ArrayList arrayList = (ArrayList) f;
                th = arrayList.size();
                while (i < th) {
                    str = arrayList.get(i);
                    i++;
                    this.f16797g.submit(new az(this, new zzaoo(), str));
                }
            }
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private final android.net.Uri.Builder m21105a(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
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
        r0 = r7.f16795e;	 Catch:{ Throwable -> 0x000b }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ Throwable -> 0x000b }
        r0 = r0.isCallerInstantApp();	 Catch:{ Throwable -> 0x000b }
        goto L_0x0012;
    L_0x000b:
        r0 = move-exception;
        r1 = "Error fetching instant app info";
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r0);
        r0 = 0;
    L_0x0012:
        r1 = "unknown";
        r2 = r7.f16795e;	 Catch:{ Throwable -> 0x001c }
        r2 = r2.getPackageName();	 Catch:{ Throwable -> 0x001c }
        r1 = r2;
        goto L_0x0021;
    L_0x001c:
        r2 = "Cannot obtain package name, proceeding.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
    L_0x0021:
        r2 = new android.net.Uri$Builder;
        r2.<init>();
        r3 = "https";
        r2 = r2.scheme(r3);
        r3 = "//pagead2.googlesyndication.com/pagead/gen_204";
        r2 = r2.path(r3);
        r3 = "is_aia";
        r0 = java.lang.Boolean.toString(r0);
        r0 = r2.appendQueryParameter(r3, r0);
        r2 = "id";
        r3 = "gmob-apps-report-exception";
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "os";
        r3 = android.os.Build.VERSION.RELEASE;
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "api";
        r3 = android.os.Build.VERSION.SDK_INT;
        r3 = java.lang.String.valueOf(r3);
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "device";
        r3 = android.os.Build.MANUFACTURER;
        r4 = android.os.Build.MODEL;
        r5 = r4.startsWith(r3);
        if (r5 == 0) goto L_0x0065;
    L_0x0064:
        goto L_0x008c;
    L_0x0065:
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 1;
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r6.append(r3);
        r3 = " ";
        r6.append(r3);
        r6.append(r4);
        r4 = r6.toString();
    L_0x008c:
        r0 = r0.appendQueryParameter(r2, r4);
        r2 = "js";
        r3 = r7.f16798h;
        r3 = r3.f19893a;
        r0 = r0.appendQueryParameter(r2, r3);
        r2 = "appid";
        r0 = r0.appendQueryParameter(r2, r1);
        r1 = "exceptiontype";
        r8 = r0.appendQueryParameter(r1, r8);
        r0 = "stacktrace";
        r8 = r8.appendQueryParameter(r0, r9);
        r9 = "eids";
        r0 = ",";
        r1 = com.google.android.gms.internal.ads.zznw.m10900a();
        r0 = android.text.TextUtils.join(r0, r1);
        r8 = r8.appendQueryParameter(r9, r0);
        r9 = "exceptionkey";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "cl";
        r10 = "215809645";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "rc";
        r10 = "dev";
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "session_id";
        r10 = com.google.android.gms.internal.ads.zzkd.m10714f();
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "sampling_rate";
        r10 = java.lang.Integer.toString(r11);
        r8 = r8.appendQueryParameter(r9, r10);
        r9 = "pb_tm";
        r10 = com.google.android.gms.internal.ads.zznw.cF;
        r11 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r10 = r11.m10897a(r10);
        r10 = java.lang.String.valueOf(r10);
        r8 = r8.appendQueryParameter(r9, r10);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzael.a(java.lang.String, java.lang.String, java.lang.String, int):android.net.Uri$Builder");
    }
}
