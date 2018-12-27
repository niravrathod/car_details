package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.C2572b;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.o */
public final class C2599o {
    /* renamed from: a */
    private final Context f11043a;
    @GuardedBy("this")
    /* renamed from: b */
    private String f11044b;
    @GuardedBy("this")
    /* renamed from: c */
    private String f11045c;
    @GuardedBy("this")
    /* renamed from: d */
    private int f11046d;
    @GuardedBy("this")
    /* renamed from: e */
    private int f11047e = 0;

    public C2599o(Context context) {
        this.f11043a = context;
    }

    /* renamed from: a */
    public final synchronized int m12758a() {
        if (this.f11047e != 0) {
            return this.f11047e;
        }
        PackageManager packageManager = this.f11043a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent;
        if (!PlatformVersion.isAtLeastO()) {
            intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11047e = 1;
                return this.f11047e;
            }
        }
        intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.f11047e = 2;
            } else {
                this.f11047e = 1;
            }
            return this.f11047e;
        }
        this.f11047e = 2;
        return this.f11047e;
    }

    /* renamed from: a */
    public static String m12755a(C2572b c2572b) {
        String b = c2572b.m12610c().m12616b();
        if (b != null) {
            return b;
        }
        c2572b = c2572b.m12610c().m12615a();
        if (!c2572b.startsWith("1:")) {
            return c2572b;
        }
        c2572b = c2572b.split(":");
        if (c2572b.length < 2) {
            return null;
        }
        c2572b = c2572b[1];
        if (c2572b.isEmpty()) {
            return null;
        }
        return c2572b;
    }

    /* renamed from: a */
    public static java.lang.String m12756a(java.security.KeyPair r3) {
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
        r3 = r3.getPublic();
        r3 = r3.getEncoded();
        r0 = "SHA1";	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3 = r0.digest(r3);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r0 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r3[r0];	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r1 & 15;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r1 + 112;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = (byte) r1;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3[r0] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r2 = 11;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3 = android.util.Base64.encodeToString(r3, r0, r1, r2);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        return r3;
    L_0x0025:
        r3 = "FirebaseInstanceId";
        r0 = "Unexpected error, device missing required algorithms";
        android.util.Log.w(r3, r0);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.o.a(java.security.KeyPair):java.lang.String");
    }

    /* renamed from: b */
    public final synchronized String m12759b() {
        if (this.f11044b == null) {
            m12757e();
        }
        return this.f11044b;
    }

    /* renamed from: c */
    public final synchronized String m12760c() {
        if (this.f11045c == null) {
            m12757e();
        }
        return this.f11045c;
    }

    /* renamed from: d */
    public final synchronized int m12761d() {
        if (this.f11046d == 0) {
            PackageInfo a = m12754a("com.google.android.gms");
            if (a != null) {
                this.f11046d = a.versionCode;
            }
        }
        return this.f11046d;
    }

    /* renamed from: e */
    private final synchronized void m12757e() {
        PackageInfo a = m12754a(this.f11043a.getPackageName());
        if (a != null) {
            this.f11044b = Integer.toString(a.versionCode);
            this.f11045c = a.versionName;
        }
    }

    /* renamed from: a */
    private final PackageInfo m12754a(String str) {
        try {
            return this.f11043a.getPackageManager().getPackageInfo(str, 0);
        } catch (String str2) {
            str2 = String.valueOf(str2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 23);
            stringBuilder.append("Failed to find package ");
            stringBuilder.append(str2);
            Log.w("FirebaseInstanceId", stringBuilder.toString());
            return null;
        }
    }
}
