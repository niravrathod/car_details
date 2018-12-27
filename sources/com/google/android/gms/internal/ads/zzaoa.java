package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.LinkedList;

@zzaer
public final class zzaoa {
    /* renamed from: a */
    public static final Handler f8948a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private static final String f8949b = AdView.class.getName();
    /* renamed from: c */
    private static final String f8950c = InterstitialAd.class.getName();
    /* renamed from: d */
    private static final String f8951d = PublisherAdView.class.getName();
    /* renamed from: e */
    private static final String f8952e = PublisherInterstitialAd.class.getName();
    /* renamed from: f */
    private static final String f8953f = SearchAdView.class.getName();
    /* renamed from: g */
    private static final String f8954g = AdLoader.class.getName();

    /* renamed from: a */
    public static void m9960a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static int m9952a(Context context, int i) {
        return m9953a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m9953a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: b */
    public static int m9962b(Context context, int i) {
        context = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        context.getMetrics(displayMetrics);
        return m9963b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m9963b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    public final void m9975a(ViewGroup viewGroup, zzjo zzjo, String str, String str2) {
        zzaok.m10007e(str2);
        m9959a(viewGroup, zzjo, str, -65536, -16777216);
    }

    /* renamed from: a */
    public final void m9974a(ViewGroup viewGroup, zzjo zzjo, String str) {
        m9959a(viewGroup, zzjo, str, -16777216, -1);
    }

    /* renamed from: a */
    private final void m9959a(ViewGroup viewGroup, zzjo zzjo, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            str = new FrameLayout(context);
            str.setBackgroundColor(i);
            i = m9952a(context, 3);
            str.addView(textView, new LayoutParams(zzjo.f20232f - i, zzjo.f20229c - i, 17));
            viewGroup.addView(str, zzjo.f20232f, zzjo.f20229c);
        }
    }

    /* renamed from: a */
    public static String m9954a(Context context) {
        String str;
        context = context.getContentResolver();
        if (context == null) {
            str = null;
        } else {
            str = Secure.getString(context, "android_id");
        }
        if (str == null || m9961a()) {
            str = "emulator";
        }
        return m9955a(str);
    }

    /* renamed from: b */
    public static String m9964b(Context context) {
        context = context.getContentResolver();
        if (context == null) {
            return null;
        }
        return Secure.getString(context, "android_id");
    }

    /* renamed from: a */
    public static boolean m9961a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static boolean m9965b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static java.lang.String m9955a(java.lang.String r9) {
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
        r0 = 0;
        r1 = 0;
    L_0x0002:
        r2 = 2;
        r3 = 0;
        if (r1 >= r2) goto L_0x002e;
    L_0x0006:
        r2 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.security.MessageDigest.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = r9.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2.update(r4);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r4 = java.util.Locale.US;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r5 = "%032X";	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r6 = 1;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7 = new java.lang.Object[r6];	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = r2.digest();	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r8.<init>(r6, r2);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r7[r0] = r8;	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        r2 = java.lang.String.format(r4, r5, r7);	 Catch:{ NoSuchAlgorithmException -> 0x002b, ArithmeticException -> 0x002a }
        return r2;
    L_0x002a:
        return r3;
    L_0x002b:
        r1 = r1 + 1;
        goto L_0x0002;
    L_0x002e:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.a(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m9969c(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == null ? true : null;
    }

    /* renamed from: c */
    public static boolean m9968c(Context context) {
        context = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (context != null) {
            if (context != 2) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m9970d(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        context = context.getResources().getDisplayMetrics();
        if (((int) (((float) context.heightPixels) / context.density)) < 600) {
            return true;
        }
        return false;
    }

    @android.annotation.TargetApi(17)
    /* renamed from: e */
    public static boolean m9971e(android.content.Context r6) {
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
        r0 = r6.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = "window";
        r6 = r6.getSystemService(r1);
        r6 = (android.view.WindowManager) r6;
        r6 = r6.getDefaultDisplay();
        r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1();
        r2 = 0;
        if (r1 == 0) goto L_0x0023;
    L_0x001b:
        r6.getRealMetrics(r0);
        r1 = r0.heightPixels;
        r3 = r0.widthPixels;
        goto L_0x004f;
    L_0x0023:
        r1 = android.view.Display.class;	 Catch:{ Exception -> 0x005d }
        r3 = "getRawHeight";	 Catch:{ Exception -> 0x005d }
        r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005d }
        r1 = r1.getMethod(r3, r4);	 Catch:{ Exception -> 0x005d }
        r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005d }
        r1 = r1.invoke(r6, r3);	 Catch:{ Exception -> 0x005d }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x005d }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x005d }
        r3 = android.view.Display.class;	 Catch:{ Exception -> 0x005d }
        r4 = "getRawWidth";	 Catch:{ Exception -> 0x005d }
        r5 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x005d }
        r3 = r3.getMethod(r4, r5);	 Catch:{ Exception -> 0x005d }
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x005d }
        r3 = r3.invoke(r6, r4);	 Catch:{ Exception -> 0x005d }
        r3 = (java.lang.Integer) r3;	 Catch:{ Exception -> 0x005d }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x005d }
    L_0x004f:
        r6.getMetrics(r0);
        r6 = r0.heightPixels;
        r0 = r0.widthPixels;
        if (r6 != r1) goto L_0x005c;
    L_0x0058:
        if (r0 != r3) goto L_0x005c;
    L_0x005a:
        r6 = 1;
        return r6;
    L_0x005c:
        return r2;
    L_0x005d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.e(android.content.Context):boolean");
    }

    /* renamed from: f */
    public static int m9972f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    public static java.lang.String m9956a(java.lang.StackTraceElement[] r5, java.lang.String r6) {
        /*
        r0 = 0;
    L_0x0001:
        r1 = r0 + 1;
        r2 = r5.length;
        r3 = 0;
        if (r1 >= r2) goto L_0x0052;
    L_0x0007:
        r0 = r5[r0];
        r2 = r0.getClassName();
        r0 = r0.getMethodName();
        r4 = "loadAd";
        r0 = r4.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x0019:
        r0 = f8949b;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0021:
        r0 = f8950c;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0029:
        r0 = f8951d;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0031:
        r0 = f8952e;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0039:
        r0 = f8953f;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 != 0) goto L_0x0049;
    L_0x0041:
        r0 = f8954g;
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r5 = r5[r1];
        r5 = r5.getClassName();
        goto L_0x0053;
    L_0x0050:
        r0 = r1;
        goto L_0x0001;
    L_0x0052:
        r5 = r3;
    L_0x0053:
        if (r6 == 0) goto L_0x0094;
    L_0x0055:
        r0 = ".";
        r1 = new java.util.StringTokenizer;
        r1.<init>(r6, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 2;
        r4 = r1.hasMoreElements();
        if (r4 == 0) goto L_0x008b;
    L_0x0068:
        r6 = r1.nextToken();
        r0.append(r6);
    L_0x006f:
        r6 = r2 + -1;
        if (r2 <= 0) goto L_0x0087;
    L_0x0073:
        r2 = r1.hasMoreElements();
        if (r2 == 0) goto L_0x0087;
    L_0x0079:
        r2 = ".";
        r0.append(r2);
        r2 = r1.nextToken();
        r0.append(r2);
        r2 = r6;
        goto L_0x006f;
    L_0x0087:
        r6 = r0.toString();
    L_0x008b:
        if (r5 == 0) goto L_0x0094;
    L_0x008d:
        r6 = r5.contains(r6);
        if (r6 != 0) goto L_0x0094;
    L_0x0093:
        return r5;
    L_0x0094:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.a(java.lang.StackTraceElement[], java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void m9973a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m9958a(context, str, str2, bundle, true, new eh(this));
    }

    /* renamed from: a */
    public static void m9958a(Context context, String str, String str2, Bundle bundle, boolean z, zzaod zzaod) {
        if (z) {
            z = context.getApplicationContext();
            if (!z) {
                z = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", z.getPackageName());
            if (str == null) {
                context = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
                z = new StringBuilder(20);
                z.append(context);
                z.append(".13000000");
                str = z.toString();
            }
            bundle.putString("js", str);
        }
        context = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(FacebookAdapter.KEY_ID, str2);
        for (String str22 : bundle.keySet()) {
            context.appendQueryParameter(str22, bundle.getString(str22));
        }
        zzaod.mo1944a(context.toString());
    }

    /* renamed from: c */
    public static java.lang.String m9967c() {
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
        r0 = java.util.UUID.randomUUID();
        r1 = r0.getLeastSignificantBits();
        r1 = java.math.BigInteger.valueOf(r1);
        r1 = r1.toByteArray();
        r2 = r0.getMostSignificantBits();
        r0 = java.math.BigInteger.valueOf(r2);
        r0 = r0.toByteArray();
        r2 = new java.math.BigInteger;
        r3 = 1;
        r2.<init>(r3, r1);
        r2 = r2.toString();
        r4 = 0;
        r5 = r2;
        r2 = 0;
    L_0x0029:
        r6 = 2;
        if (r2 >= r6) goto L_0x0050;
    L_0x002c:
        r6 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = java.security.MessageDigest.getInstance(r6);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r1);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.update(r0);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r7 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r8 = new byte[r7];	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.digest();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        java.lang.System.arraycopy(r6, r4, r8, r4, r7);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = new java.math.BigInteger;	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6.<init>(r3, r8);	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r6 = r6.toString();	 Catch:{ NoSuchAlgorithmException -> 0x004d }
        r5 = r6;
    L_0x004d:
        r2 = r2 + 1;
        goto L_0x0029;
    L_0x0050:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoa.c():java.lang.String");
    }

    /* renamed from: a */
    public static Throwable m9957a(Throwable th) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.f9705d)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        th = null;
        while (!linkedList.isEmpty()) {
            Throwable th2 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th2.getClass().getName(), "<filtered>", "<filtered>", 1));
            Object obj = null;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m9966b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    obj = 1;
                } else {
                    String className = stackTraceElement.getClassName();
                    Object obj2 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                    if (obj2 != null) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (obj != null) {
                if (th == null) {
                    th = new Throwable(th2.getMessage());
                } else {
                    th = new Throwable(th2.getMessage(), th);
                }
                th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th;
    }

    @VisibleForTesting
    /* renamed from: b */
    public static boolean m9966b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) zzkd.m10713e().m10897a(zznw.f9707e))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzaer.class);
        } catch (Throwable e) {
            String str2 = "Fail to check class type for class ";
            str = String.valueOf(str);
            zzaok.m9999a(str.length() != 0 ? str2.concat(str) : new String(str2), e);
            return false;
        }
    }
}
