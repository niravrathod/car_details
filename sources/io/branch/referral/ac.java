package io.branch.referral;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class ac {
    /* renamed from: a */
    static String f11504a;
    /* renamed from: b */
    int f11505b = 0;
    /* renamed from: c */
    private Context f11506c;
    /* renamed from: d */
    private boolean f11507d;

    /* renamed from: io.branch.referral.ac$a */
    interface C2728a {
        /* renamed from: e */
        void mo3530e();
    }

    /* renamed from: io.branch.referral.ac$b */
    private class C4273b extends C2733c<Void, Void, Void> {
        /* renamed from: a */
        final /* synthetic */ ac f17954a;
        /* renamed from: b */
        private final C2728a f17955b;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m23470a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m23471a((Void) obj);
        }

        public C4273b(ac acVar, C2728a c2728a) {
            this.f17954a = acVar;
            this.f17955b = c2728a;
        }

        /* renamed from: a */
        protected Void m23470a(Void... voidArr) {
            voidArr = new CountDownLatch(1);
            new Thread(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C4273b f11503b;

                public void run() {
                    Process.setThreadPriority(-19);
                    Object a = this.f11503b.f17954a.m13223n();
                    this.f11503b.f17954a.m13219a(a);
                    this.f11503b.f17954a.m13221b(a);
                    voidArr.countDown();
                }
            }).start();
            try {
                voidArr.await(1500, TimeUnit.MILLISECONDS);
            } catch (Void[] voidArr2) {
                voidArr2.printStackTrace();
            }
            return null;
        }

        /* renamed from: a */
        protected void m23471a(Void voidR) {
            super.onPostExecute(voidR);
            if (this.f17955b != null) {
                this.f17955b.mo3530e();
            }
        }
    }

    /* renamed from: h */
    String m13233h() {
        return "Android";
    }

    ac(Context context) {
        this.f11506c = context;
        this.f11507d = true;
    }

    /* renamed from: a */
    String m13224a(boolean z) {
        if (this.f11506c == null) {
            return "bnc_no_value";
        }
        String str = null;
        if (!(z || Branch.f17915a)) {
            str = Secure.getString(this.f11506c.getContentResolver(), "android_id");
        }
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.f11507d = false;
        }
        return str;
    }

    /* renamed from: a */
    boolean m13225a() {
        return this.f11507d;
    }

    /* renamed from: b */
    String m13227b() {
        String str = "";
        try {
            return this.f11506c.getPackageManager().getPackageInfo(this.f11506c.getPackageName(), 0).packageName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: c */
    java.lang.String m13228c() {
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
        r0 = r3.f11506c;	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r3.f11506c;	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x001b }
        r0 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x001b }
        r1 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x001b }
        if (r1 == 0) goto L_0x0018;	 Catch:{ NameNotFoundException -> 0x001b }
    L_0x0015:
        r0 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x001b }
        return r0;	 Catch:{ NameNotFoundException -> 0x001b }
    L_0x0018:
        r0 = "bnc_no_value";	 Catch:{ NameNotFoundException -> 0x001b }
        return r0;
    L_0x001b:
        r0 = "bnc_no_value";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.c():java.lang.String");
    }

    /* renamed from: d */
    String m13229d() {
        return Build.MANUFACTURER;
    }

    /* renamed from: e */
    String m13230e() {
        return Build.MODEL;
    }

    /* renamed from: f */
    String m13231f() {
        return Locale.getDefault() != null ? Locale.getDefault().getCountry() : "";
    }

    /* renamed from: g */
    String m13232g() {
        return Locale.getDefault() != null ? Locale.getDefault().getLanguage() : "";
    }

    /* renamed from: i */
    int m13234i() {
        return VERSION.SDK_INT;
    }

    /* renamed from: j */
    DisplayMetrics m13235j() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f11506c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: k */
    public boolean m13236k() {
        boolean z = false;
        if (this.f11506c.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        NetworkInfo networkInfo = ((ConnectivityManager) this.f11506c.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    private java.lang.Object m13223n() {
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
        r0 = 0;
        r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient";	 Catch:{ Throwable -> 0x0020 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0020 }
        r2 = "getAdvertisingIdInfo";	 Catch:{ Throwable -> 0x0020 }
        r3 = 1;	 Catch:{ Throwable -> 0x0020 }
        r4 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x0020 }
        r5 = android.content.Context.class;	 Catch:{ Throwable -> 0x0020 }
        r6 = 0;	 Catch:{ Throwable -> 0x0020 }
        r4[r6] = r5;	 Catch:{ Throwable -> 0x0020 }
        r1 = r1.getMethod(r2, r4);	 Catch:{ Throwable -> 0x0020 }
        r2 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0020 }
        r3 = r7.f11506c;	 Catch:{ Throwable -> 0x0020 }
        r2[r6] = r3;	 Catch:{ Throwable -> 0x0020 }
        r1 = r1.invoke(r0, r2);	 Catch:{ Throwable -> 0x0020 }
        r0 = r1;
    L_0x0020:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.n():java.lang.Object");
    }

    /* renamed from: a */
    private java.lang.String m13219a(java.lang.Object r5) {
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
        r4 = this;
        r0 = r5.getClass();	 Catch:{ Exception -> 0x0017 }
        r1 = "getId";	 Catch:{ Exception -> 0x0017 }
        r2 = 0;	 Catch:{ Exception -> 0x0017 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0017 }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Exception -> 0x0017 }
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0017 }
        r5 = r0.invoke(r5, r1);	 Catch:{ Exception -> 0x0017 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0017 }
        f11504a = r5;	 Catch:{ Exception -> 0x0017 }
    L_0x0017:
        r5 = f11504a;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.a(java.lang.Object):java.lang.String");
    }

    /* renamed from: b */
    private int m13221b(java.lang.Object r5) {
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
        r4 = this;
        r0 = r5.getClass();	 Catch:{ Exception -> 0x001b }
        r1 = "isLimitAdTrackingEnabled";	 Catch:{ Exception -> 0x001b }
        r2 = 0;	 Catch:{ Exception -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001b }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Exception -> 0x001b }
        r1 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x001b }
        r5 = r0.invoke(r5, r1);	 Catch:{ Exception -> 0x001b }
        r5 = (java.lang.Boolean) r5;	 Catch:{ Exception -> 0x001b }
        r5 = r5.booleanValue();	 Catch:{ Exception -> 0x001b }
        r4.f11505b = r5;	 Catch:{ Exception -> 0x001b }
    L_0x001b:
        r5 = r4.f11505b;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.b(java.lang.Object):int");
    }

    /* renamed from: a */
    boolean m13226a(C2728a c2728a) {
        if (!TextUtils.isEmpty(f11504a)) {
            return false;
        }
        new C4273b(this, c2728a).m13251a(new Void[0]);
        return true;
    }

    /* renamed from: l */
    static java.lang.String m13222l() {
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
        r0 = "";
        r1 = java.net.NetworkInterface.getNetworkInterfaces();	 Catch:{ Throwable -> 0x004b }
        r1 = java.util.Collections.list(r1);	 Catch:{ Throwable -> 0x004b }
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x000e:
        r2 = r1.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r2 == 0) goto L_0x004b;	 Catch:{ Throwable -> 0x004b }
    L_0x0014:
        r2 = r1.next();	 Catch:{ Throwable -> 0x004b }
        r2 = (java.net.NetworkInterface) r2;	 Catch:{ Throwable -> 0x004b }
        r2 = r2.getInetAddresses();	 Catch:{ Throwable -> 0x004b }
        r2 = java.util.Collections.list(r2);	 Catch:{ Throwable -> 0x004b }
        r2 = r2.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x0026:
        r3 = r2.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r3 == 0) goto L_0x000e;	 Catch:{ Throwable -> 0x004b }
    L_0x002c:
        r3 = r2.next();	 Catch:{ Throwable -> 0x004b }
        r3 = (java.net.InetAddress) r3;	 Catch:{ Throwable -> 0x004b }
        r4 = r3.isLoopbackAddress();	 Catch:{ Throwable -> 0x004b }
        if (r4 != 0) goto L_0x0026;	 Catch:{ Throwable -> 0x004b }
    L_0x0038:
        r3 = r3.getHostAddress();	 Catch:{ Throwable -> 0x004b }
        r4 = 58;	 Catch:{ Throwable -> 0x004b }
        r4 = r3.indexOf(r4);	 Catch:{ Throwable -> 0x004b }
        if (r4 >= 0) goto L_0x0046;
    L_0x0044:
        r4 = 1;
        goto L_0x0047;
    L_0x0046:
        r4 = 0;
    L_0x0047:
        if (r4 == 0) goto L_0x0026;
    L_0x0049:
        r0 = r3;
        goto L_0x000e;
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ac.l():java.lang.String");
    }

    /* renamed from: m */
    String m13237m() {
        switch (((UiModeManager) this.f11506c.getSystemService("uimode")).getCurrentModeType()) {
            case 0:
                return "UI_MODE_TYPE_UNDEFINED";
            case 1:
                return "UI_MODE_TYPE_NORMAL";
            case 2:
                return "UI_MODE_TYPE_DESK";
            case 3:
                return "UI_MODE_TYPE_CAR";
            case 4:
                return "UI_MODE_TYPE_TELEVISION";
            case 5:
                return "UI_MODE_TYPE_APPLIANCE";
            case 6:
                return "UI_MODE_TYPE_WATCH";
            default:
                return "UI_MODE_TYPE_UNDEFINED";
        }
    }
}
