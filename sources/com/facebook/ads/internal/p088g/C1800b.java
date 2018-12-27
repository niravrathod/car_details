package com.facebook.ads.internal.p088g;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.facebook.ads.internal.p101q.p102a.C1912e;

/* renamed from: com.facebook.ads.internal.g.b */
public class C1800b {
    /* renamed from: a */
    public static final String f5433a = VERSION.RELEASE;
    /* renamed from: b */
    private final Context f5434b;

    public C1800b(Context context) {
        this.f5434b = context.getApplicationContext();
    }

    /* renamed from: a */
    public String m6773a() {
        return (Build.MANUFACTURER == null || Build.MANUFACTURER.length() <= 0) ? "" : Build.MANUFACTURER;
    }

    /* renamed from: b */
    public String m6774b() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? "" : Build.MODEL;
    }

    /* renamed from: c */
    public String m6775c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f5434b.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null && networkOperatorName.length() > 0) {
                return networkOperatorName;
            }
        }
        return "";
    }

    /* renamed from: d */
    public java.lang.String m6776d() {
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
        r3 = this;
        r0 = r3.f5434b;	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0026 }
        r1 = r3.m6778f();	 Catch:{ NameNotFoundException -> 0x0026 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r0.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0026 }
        r1 = r3.f5434b;	 Catch:{ NameNotFoundException -> 0x0026 }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0026 }
        r0 = r1.getApplicationLabel(r0);	 Catch:{ NameNotFoundException -> 0x0026 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ NameNotFoundException -> 0x0026 }
    L_0x001b:
        r1 = r0.length();	 Catch:{ NameNotFoundException -> 0x0026 }
        if (r1 <= 0) goto L_0x0026;	 Catch:{ NameNotFoundException -> 0x0026 }
    L_0x0021:
        r0 = r0.toString();	 Catch:{ NameNotFoundException -> 0x0026 }
        return r0;
    L_0x0026:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.b.d():java.lang.String");
    }

    /* renamed from: e */
    public java.lang.String m6777e() {
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
        r0 = r2.m6778f();	 Catch:{ Exception -> 0x001f }
        if (r0 == 0) goto L_0x001f;	 Catch:{ Exception -> 0x001f }
    L_0x0006:
        r1 = r0.length();	 Catch:{ Exception -> 0x001f }
        if (r1 < 0) goto L_0x001f;	 Catch:{ Exception -> 0x001f }
    L_0x000c:
        r1 = r2.f5434b;	 Catch:{ Exception -> 0x001f }
        r1 = r1.getPackageManager();	 Catch:{ Exception -> 0x001f }
        r0 = r1.getInstallerPackageName(r0);	 Catch:{ Exception -> 0x001f }
        if (r0 == 0) goto L_0x001f;	 Catch:{ Exception -> 0x001f }
    L_0x0018:
        r1 = r0.length();	 Catch:{ Exception -> 0x001f }
        if (r1 <= 0) goto L_0x001f;
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.b.e():java.lang.String");
    }

    /* renamed from: f */
    public String m6778f() {
        PendingIntent activity = PendingIntent.getActivity(this.f5434b, 0, new Intent(), 0);
        return VERSION.SDK_INT >= 17 ? activity.getCreatorPackage() : activity.getTargetPackage();
    }

    /* renamed from: g */
    public String m6779g() {
        try {
            return this.f5434b.getPackageManager().getPackageInfo(m6778f(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public int m6780h() {
        try {
            return this.f5434b.getPackageManager().getPackageInfo(m6778f(), 0).versionCode;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public boolean m6781i() {
        return this.f5434b.checkCallingOrSelfPermission("android.permission.BIND_ACCESSIBILITY_SERVICE") == 0;
    }

    /* renamed from: j */
    public int m6782j() {
        return C1912e.m7263b(this.f5434b);
    }
}
