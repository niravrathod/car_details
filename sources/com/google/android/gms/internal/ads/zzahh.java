package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

public final class zzahh {
    /* renamed from: A */
    private int f8697A;
    /* renamed from: B */
    private String f8698B;
    /* renamed from: C */
    private boolean f8699C;
    /* renamed from: a */
    private int f8700a;
    /* renamed from: b */
    private boolean f8701b;
    /* renamed from: c */
    private boolean f8702c;
    /* renamed from: d */
    private int f8703d;
    /* renamed from: e */
    private int f8704e;
    /* renamed from: f */
    private int f8705f;
    /* renamed from: g */
    private String f8706g;
    /* renamed from: h */
    private int f8707h;
    /* renamed from: i */
    private int f8708i;
    /* renamed from: j */
    private int f8709j;
    /* renamed from: k */
    private boolean f8710k;
    /* renamed from: l */
    private int f8711l;
    /* renamed from: m */
    private double f8712m;
    /* renamed from: n */
    private boolean f8713n;
    /* renamed from: o */
    private String f8714o;
    /* renamed from: p */
    private String f8715p;
    /* renamed from: q */
    private boolean f8716q;
    /* renamed from: r */
    private boolean f8717r;
    /* renamed from: s */
    private String f8718s;
    /* renamed from: t */
    private boolean f8719t;
    /* renamed from: u */
    private final boolean f8720u;
    /* renamed from: v */
    private boolean f8721v;
    /* renamed from: w */
    private String f8722w;
    /* renamed from: x */
    private String f8723x;
    /* renamed from: y */
    private float f8724y;
    /* renamed from: z */
    private int f8725z;

    public zzahh(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m9550a(context);
        m9551b(context);
        m9552c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f8716q = m9548a(packageManager, "geo:0,0?q=donuts") != null;
        if (m9548a(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.f8717r = z;
        this.f8718s = locale.getCountry();
        zzkd.m10709a();
        this.f8719t = zzaoa.m9961a();
        this.f8720u = DeviceProperties.isLatchsky(context);
        this.f8721v = DeviceProperties.isSidewinder(context);
        this.f8722w = locale.getLanguage();
        this.f8723x = m9549a(context, packageManager);
        this.f8698B = m9553d(context);
        context = context.getResources();
        if (context != null) {
            context = context.getDisplayMetrics();
            if (context != null) {
                this.f8724y = context.density;
                this.f8725z = context.widthPixels;
                this.f8697A = context.heightPixels;
            }
        }
    }

    public zzahh(Context context, zzahg zzahg) {
        m9550a(context);
        m9551b(context);
        m9552c(context);
        this.f8714o = Build.FINGERPRINT;
        this.f8715p = Build.DEVICE;
        context = (!PlatformVersion.isAtLeastIceCreamSandwichMR1() || zzot.m21793a(context) == null) ? null : true;
        this.f8699C = context;
        this.f8716q = zzahg.f8672b;
        this.f8717r = zzahg.f8673c;
        this.f8718s = zzahg.f8675e;
        this.f8719t = zzahg.f8676f;
        this.f8720u = zzahg.f8677g;
        this.f8721v = zzahg.f8678h;
        this.f8722w = zzahg.f8681k;
        this.f8723x = zzahg.f8682l;
        this.f8698B = zzahg.f8683m;
        this.f8724y = zzahg.f8690t;
        this.f8725z = zzahg.f8691u;
        this.f8697A = zzahg.f8692v;
    }

    /* renamed from: a */
    private final void m9550a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f8700a = audioManager.getMode();
                this.f8701b = audioManager.isMusicActive();
                this.f8702c = audioManager.isSpeakerphoneOn();
                this.f8703d = audioManager.getStreamVolume(3);
                this.f8704e = audioManager.getRingerMode();
                this.f8705f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzbv.zzeo().m9714a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f8700a = -2;
        this.f8701b = false;
        this.f8702c = false;
        this.f8703d = 0;
        this.f8704e = 0;
        this.f8705f = 0;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m9551b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8706g = telephonyManager.getNetworkOperator();
        this.f8708i = telephonyManager.getNetworkType();
        this.f8709j = telephonyManager.getPhoneType();
        this.f8707h = -2;
        this.f8710k = false;
        this.f8711l = -1;
        zzbv.zzek();
        if (zzalo.m9800a(context, "android.permission.ACCESS_NETWORK_STATE") != null) {
            context = connectivityManager.getActiveNetworkInfo();
            if (context != null) {
                this.f8707h = context.getType();
                this.f8711l = context.getDetailedState().ordinal();
            } else {
                this.f8707h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f8710k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m9552c(Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (context != null) {
            int intExtra = context.getIntExtra("status", -1);
            this.f8712m = (double) (((float) context.getIntExtra("level", -1)) / ((float) context.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f8713n = z;
            return;
        }
        this.f8712m = -1.0d;
        this.f8713n = false;
    }

    /* renamed from: d */
    private static java.lang.String m9553d(android.content.Context r4) {
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
        r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4);	 Catch:{ Exception -> 0x0033 }
        r1 = "com.android.vending";	 Catch:{ Exception -> 0x0033 }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0033 }
        r4 = r4.getPackageInfo(r1, r2);	 Catch:{ Exception -> 0x0033 }
        if (r4 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x0033 }
    L_0x000f:
        r1 = r4.versionCode;	 Catch:{ Exception -> 0x0033 }
        r4 = r4.packageName;	 Catch:{ Exception -> 0x0033 }
        r2 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0033 }
        r2 = r2.length();	 Catch:{ Exception -> 0x0033 }
        r2 = r2 + 12;	 Catch:{ Exception -> 0x0033 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0033 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x0033 }
        r3.append(r1);	 Catch:{ Exception -> 0x0033 }
        r1 = ".";	 Catch:{ Exception -> 0x0033 }
        r3.append(r1);	 Catch:{ Exception -> 0x0033 }
        r3.append(r4);	 Catch:{ Exception -> 0x0033 }
        r4 = r3.toString();	 Catch:{ Exception -> 0x0033 }
        return r4;
    L_0x0032:
        return r0;
    L_0x0033:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahh.d(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static java.lang.String m9549a(android.content.Context r3, android.content.pm.PackageManager r4) {
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
        r0 = "market://details?id=com.google.android.gms.ads";
        r4 = m9548a(r4, r0);
        r0 = 0;
        if (r4 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r4 = r4.activityInfo;
        if (r4 != 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3);	 Catch:{ NameNotFoundException -> 0x0040 }
        r1 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x0040 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0040 }
        r3 = r3.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0040 }
        if (r3 == 0) goto L_0x003f;	 Catch:{ NameNotFoundException -> 0x0040 }
    L_0x001c:
        r3 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x0040 }
        r4 = r4.packageName;	 Catch:{ NameNotFoundException -> 0x0040 }
        r1 = java.lang.String.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x0040 }
        r1 = r1.length();	 Catch:{ NameNotFoundException -> 0x0040 }
        r1 = r1 + 12;	 Catch:{ NameNotFoundException -> 0x0040 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0040 }
        r2.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0040 }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x0040 }
        r3 = ".";	 Catch:{ NameNotFoundException -> 0x0040 }
        r2.append(r3);	 Catch:{ NameNotFoundException -> 0x0040 }
        r2.append(r4);	 Catch:{ NameNotFoundException -> 0x0040 }
        r3 = r2.toString();	 Catch:{ NameNotFoundException -> 0x0040 }
        return r3;
    L_0x003f:
        return r0;
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahh.a(android.content.Context, android.content.pm.PackageManager):java.lang.String");
    }

    /* renamed from: a */
    private static ResolveInfo m9548a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzbv.zzeo().m9714a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    public final zzahg m9554a() {
        return new zzahg(this.f8700a, this.f8716q, this.f8717r, this.f8706g, this.f8718s, this.f8719t, this.f8720u, this.f8721v, this.f8701b, this.f8702c, this.f8722w, this.f8723x, this.f8698B, this.f8703d, this.f8707h, this.f8708i, this.f8709j, this.f8704e, this.f8705f, this.f8724y, this.f8725z, this.f8697A, this.f8712m, this.f8713n, this.f8710k, this.f8711l, this.f8714o, this.f8699C, this.f8715p);
    }
}
