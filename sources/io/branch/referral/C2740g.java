package io.branch.referral;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.branch.referral.Defines.Jsonkey;

/* renamed from: io.branch.referral.g */
class C2740g {
    /* renamed from: h */
    private static C2740g f11531h = null;
    /* renamed from: j */
    private static int f11532j = 750;
    /* renamed from: a */
    Object f11533a = null;
    /* renamed from: b */
    boolean f11534b = false;
    /* renamed from: c */
    Class<?> f11535c;
    /* renamed from: d */
    Class<?> f11536d;
    /* renamed from: e */
    Class<?> f11537e;
    /* renamed from: f */
    Class<?> f11538f;
    /* renamed from: g */
    Class<?> f11539g;
    /* renamed from: i */
    private final Handler f11540i;
    /* renamed from: k */
    private boolean f11541k = true;

    /* renamed from: io.branch.referral.g$a */
    private abstract class C2738a implements ServiceConnection {
        /* renamed from: h */
        final /* synthetic */ C2740g f11530h;

        /* renamed from: a */
        public abstract void mo3532a(ComponentName componentName, Object obj);

        public C2738a(C2740g c2740g) {
            this.f11530h = c2740g;
        }

        public final void onServiceConnected(android.content.ComponentName r10, android.os.IBinder r11) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r9 = this;
            r0 = 0;
            r1 = r9.f11530h;	 Catch:{ Throwable -> 0x0043 }
            r1 = r1.f11535c;	 Catch:{ Throwable -> 0x0043 }
            r2 = 2;	 Catch:{ Throwable -> 0x0043 }
            r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x0043 }
            r4 = r9.f11530h;	 Catch:{ Throwable -> 0x0043 }
            r4 = r4.f11539g;	 Catch:{ Throwable -> 0x0043 }
            r5 = 0;	 Catch:{ Throwable -> 0x0043 }
            r3[r5] = r4;	 Catch:{ Throwable -> 0x0043 }
            r4 = android.content.ComponentName.class;	 Catch:{ Throwable -> 0x0043 }
            r6 = 1;	 Catch:{ Throwable -> 0x0043 }
            r3[r6] = r4;	 Catch:{ Throwable -> 0x0043 }
            r1 = r1.getDeclaredConstructor(r3);	 Catch:{ Throwable -> 0x0043 }
            r1.setAccessible(r6);	 Catch:{ Throwable -> 0x0043 }
            r3 = "android.support.customtabs.h$a";	 Catch:{ Throwable -> 0x0043 }
            r3 = java.lang.Class.forName(r3);	 Catch:{ Throwable -> 0x0043 }
            r4 = "asInterface";	 Catch:{ Throwable -> 0x0043 }
            r7 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x0043 }
            r8 = android.os.IBinder.class;	 Catch:{ Throwable -> 0x0043 }
            r7[r5] = r8;	 Catch:{ Throwable -> 0x0043 }
            r3 = r3.getMethod(r4, r7);	 Catch:{ Throwable -> 0x0043 }
            r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0043 }
            r4 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0043 }
            r4[r5] = r11;	 Catch:{ Throwable -> 0x0043 }
            r11 = r3.invoke(r0, r4);	 Catch:{ Throwable -> 0x0043 }
            r2[r5] = r11;	 Catch:{ Throwable -> 0x0043 }
            r2[r6] = r10;	 Catch:{ Throwable -> 0x0043 }
            r11 = r1.newInstance(r2);	 Catch:{ Throwable -> 0x0043 }
            r9.mo3532a(r10, r11);	 Catch:{ Throwable -> 0x0043 }
            goto L_0x0046;
        L_0x0043:
            r9.mo3532a(r0, r0);
        L_0x0046:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.g.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }
    }

    /* renamed from: io.branch.referral.g$b */
    interface C2739b {
        /* renamed from: a */
        void mo3525a();
    }

    private C2740g() {
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
        r2.<init>();
        r0 = 0;
        r2.f11533a = r0;
        r0 = 1;
        r2.f11541k = r0;
        r0 = 0;
        r2.f11534b = r0;
        r1 = "android.support.customtabs.b";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f11535c = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.d";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f11536d = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.a";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f11537e = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.e";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f11538f = r1;	 Catch:{ Throwable -> 0x0035 }
        r1 = "android.support.customtabs.h";	 Catch:{ Throwable -> 0x0035 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Throwable -> 0x0035 }
        r2.f11539g = r1;	 Catch:{ Throwable -> 0x0035 }
        goto L_0x0037;
    L_0x0035:
        r2.f11541k = r0;
    L_0x0037:
        r0 = new android.os.Handler;
        r0.<init>();
        r2.f11540i = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.g.<init>():void");
    }

    /* renamed from: a */
    public static C2740g m13277a() {
        if (f11531h == null) {
            f11531h = new C2740g();
        }
        return f11531h;
    }

    /* renamed from: a */
    public void m13280a(android.content.Context r13, java.lang.String r14, io.branch.referral.C2752l r15, io.branch.referral.C2754n r16, io.branch.referral.ac r17, io.branch.referral.C2740g.C2739b r18) {
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
        r12 = this;
        r8 = r12;
        r9 = r18;
        r6 = 0;
        r8.f11534b = r6;
        r0 = java.lang.System.currentTimeMillis();
        r2 = r16.m13352E();
        r0 = r0 - r2;
        r2 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x001f;
    L_0x0018:
        r0 = r8.f11534b;
        r12.m13278a(r9, r0);
        goto L_0x00cd;
    L_0x001f:
        r0 = r8.f11541k;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = r8.f11534b;
        r12.m13278a(r9, r0);
        goto L_0x00cd;
    L_0x002a:
        r0 = r15.m13333d();	 Catch:{ Throwable -> 0x00c8 }
        if (r0 == 0) goto L_0x00bb;	 Catch:{ Throwable -> 0x00c8 }
    L_0x0030:
        r0 = r12;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r14;	 Catch:{ Throwable -> 0x00c8 }
        r2 = r15;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r16;	 Catch:{ Throwable -> 0x00c8 }
        r4 = r17;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r13;	 Catch:{ Throwable -> 0x00c8 }
        r4 = r0.m13276a(r1, r2, r3, r4, r5);	 Catch:{ Throwable -> 0x00c8 }
        if (r4 == 0) goto L_0x00b5;	 Catch:{ Throwable -> 0x00c8 }
    L_0x003e:
        r0 = r8.f11540i;	 Catch:{ Throwable -> 0x00c8 }
        r1 = new io.branch.referral.g$1;	 Catch:{ Throwable -> 0x00c8 }
        r1.<init>(r12, r9);	 Catch:{ Throwable -> 0x00c8 }
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ Throwable -> 0x00c8 }
        r0.postDelayed(r1, r2);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f11535c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "bindCustomTabsService";	 Catch:{ Throwable -> 0x00c8 }
        r2 = 3;	 Catch:{ Throwable -> 0x00c8 }
        r3 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x00c8 }
        r5 = android.content.Context.class;	 Catch:{ Throwable -> 0x00c8 }
        r3[r6] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = java.lang.String.class;	 Catch:{ Throwable -> 0x00c8 }
        r7 = 1;	 Catch:{ Throwable -> 0x00c8 }
        r3[r7] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r8.f11536d;	 Catch:{ Throwable -> 0x00c8 }
        r10 = 2;	 Catch:{ Throwable -> 0x00c8 }
        r3[r10] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r0.getMethod(r1, r3);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f11535c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "warmup";	 Catch:{ Throwable -> 0x00c8 }
        r3 = new java.lang.Class[r7];	 Catch:{ Throwable -> 0x00c8 }
        r5 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00c8 }
        r3[r6] = r5;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r0.getMethod(r1, r3);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f11535c;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "newSession";	 Catch:{ Throwable -> 0x00c8 }
        r5 = new java.lang.Class[r7];	 Catch:{ Throwable -> 0x00c8 }
        r11 = r8.f11537e;	 Catch:{ Throwable -> 0x00c8 }
        r5[r6] = r11;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r0.getMethod(r1, r5);	 Catch:{ Throwable -> 0x00c8 }
        r0 = r8.f11538f;	 Catch:{ Throwable -> 0x00c8 }
        r1 = "mayLaunchUrl";	 Catch:{ Throwable -> 0x00c8 }
        r2 = new java.lang.Class[r2];	 Catch:{ Throwable -> 0x00c8 }
        r11 = android.net.Uri.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r6] = r11;	 Catch:{ Throwable -> 0x00c8 }
        r6 = android.os.Bundle.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r7] = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = java.util.List.class;	 Catch:{ Throwable -> 0x00c8 }
        r2[r10] = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = r0.getMethod(r1, r2);	 Catch:{ Throwable -> 0x00c8 }
        r10 = new android.content.Intent;	 Catch:{ Throwable -> 0x00c8 }
        r0 = "android.support.customtabs.action.CustomTabsService";	 Catch:{ Throwable -> 0x00c8 }
        r10.<init>(r0);	 Catch:{ Throwable -> 0x00c8 }
        r0 = "com.android.chrome";	 Catch:{ Throwable -> 0x00c8 }
        r10.setPackage(r0);	 Catch:{ Throwable -> 0x00c8 }
        r11 = new io.branch.referral.g$2;	 Catch:{ Throwable -> 0x00c8 }
        r0 = r11;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r12;	 Catch:{ Throwable -> 0x00c8 }
        r2 = r3;	 Catch:{ Throwable -> 0x00c8 }
        r3 = r5;	 Catch:{ Throwable -> 0x00c8 }
        r5 = r6;	 Catch:{ Throwable -> 0x00c8 }
        r6 = r16;	 Catch:{ Throwable -> 0x00c8 }
        r7 = r18;	 Catch:{ Throwable -> 0x00c8 }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Throwable -> 0x00c8 }
        r0 = 33;	 Catch:{ Throwable -> 0x00c8 }
        r1 = r13;	 Catch:{ Throwable -> 0x00c8 }
        r13.bindService(r10, r11, r0);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;	 Catch:{ Throwable -> 0x00c8 }
    L_0x00b5:
        r0 = r8.f11534b;	 Catch:{ Throwable -> 0x00c8 }
        r12.m13278a(r9, r0);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;	 Catch:{ Throwable -> 0x00c8 }
    L_0x00bb:
        r0 = r8.f11534b;	 Catch:{ Throwable -> 0x00c8 }
        r12.m13278a(r9, r0);	 Catch:{ Throwable -> 0x00c8 }
        r0 = "BranchSDK";	 Catch:{ Throwable -> 0x00c8 }
        r1 = "Cannot use cookie-based matching since device id is not available";	 Catch:{ Throwable -> 0x00c8 }
        android.util.Log.d(r0, r1);	 Catch:{ Throwable -> 0x00c8 }
        goto L_0x00cd;
    L_0x00c8:
        r0 = r8.f11534b;
        r12.m13278a(r9, r0);
    L_0x00cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.g.a(android.content.Context, java.lang.String, io.branch.referral.l, io.branch.referral.n, io.branch.referral.ac, io.branch.referral.g$b):void");
    }

    /* renamed from: a */
    private void m13278a(final C2739b c2739b, boolean z) {
        if (c2739b == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C2740g f11529b;

                public void run() {
                    c2739b.mo3525a();
                }
            }, (long) f11532j);
        } else {
            c2739b.mo3525a();
        }
    }

    /* renamed from: a */
    private Uri m13276a(String str, C2752l c2752l, C2754n c2754n, ac acVar, Context context) {
        if (TextUtils.isEmpty(str) != null) {
            return null;
        }
        acVar = new StringBuilder();
        acVar.append("https://");
        acVar.append(str);
        acVar.append("/_strong_match?os=");
        acVar.append(c2752l.m13334e());
        str = acVar.toString();
        acVar = new StringBuilder();
        acVar.append(str);
        acVar.append("&");
        acVar.append(Jsonkey.HardwareID.m13131a());
        acVar.append(SimpleComparison.EQUAL_TO_OPERATION);
        acVar.append(c2752l.m13333d());
        str = acVar.toString();
        acVar = (c2752l.m13332c() != null ? Jsonkey.HardwareIDTypeVendor : Jsonkey.HardwareIDTypeRandom).m13131a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("&");
        stringBuilder.append(Jsonkey.HardwareIDType.m13131a());
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(acVar);
        str = stringBuilder.toString();
        if (ac.f11504a != null && C2742i.m13287a(context) == null) {
            acVar = new StringBuilder();
            acVar.append(str);
            acVar.append("&");
            acVar.append(Jsonkey.GoogleAdvertisingID.m13131a());
            acVar.append(SimpleComparison.EQUAL_TO_OPERATION);
            acVar.append(ac.f11504a);
            str = acVar.toString();
        }
        if (c2754n.m13382g().equals("bnc_no_value") == null) {
            acVar = new StringBuilder();
            acVar.append(str);
            acVar.append("&");
            acVar.append(Jsonkey.DeviceFingerprintID.m13131a());
            acVar.append(SimpleComparison.EQUAL_TO_OPERATION);
            acVar.append(c2754n.m13382g());
            str = acVar.toString();
        }
        if (c2752l.m13331b().equals("bnc_no_value") == null) {
            acVar = new StringBuilder();
            acVar.append(str);
            acVar.append("&");
            acVar.append(Jsonkey.AppVersion.m13131a());
            acVar.append(SimpleComparison.EQUAL_TO_OPERATION);
            acVar.append(c2752l.m13331b());
            str = acVar.toString();
        }
        if (c2754n.m13380f().equals("bnc_no_value") == null) {
            c2752l = new StringBuilder();
            c2752l.append(str);
            c2752l.append("&");
            c2752l.append(Jsonkey.BranchKey.m13131a());
            c2752l.append(SimpleComparison.EQUAL_TO_OPERATION);
            c2752l.append(c2754n.m13380f());
            str = c2752l.toString();
        }
        c2752l = new StringBuilder();
        c2752l.append(str);
        c2752l.append("&sdk=android2.19.5");
        return Uri.parse(c2752l.toString());
    }
}
