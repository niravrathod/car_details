package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2797h;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ah {
    /* renamed from: a */
    static final Map<String, String> f4244a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* renamed from: b */
    private static final short[] f4245b = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    /* renamed from: c */
    private final Object f4246c = new Object();
    /* renamed from: d */
    private final C1392o f4247d;
    /* renamed from: e */
    private final String f4248e;
    /* renamed from: f */
    private final C1351c f4249f;
    /* renamed from: g */
    private final C1350b f4250g;
    /* renamed from: h */
    private Thread f4251h;

    /* renamed from: com.crashlytics.android.core.ah$b */
    interface C1350b {
        /* renamed from: a */
        boolean mo1150a();
    }

    /* renamed from: com.crashlytics.android.core.ah$c */
    interface C1351c {
        /* renamed from: a */
        File[] mo1147a();

        /* renamed from: b */
        File[] mo1148b();

        /* renamed from: c */
        File[] mo1149c();
    }

    /* renamed from: com.crashlytics.android.core.ah$d */
    interface C1352d {
        /* renamed from: a */
        boolean mo1137a();
    }

    /* renamed from: com.crashlytics.android.core.ah$a */
    static final class C3570a implements C1352d {
        /* renamed from: a */
        public boolean mo1137a() {
            return true;
        }

        C3570a() {
        }
    }

    /* renamed from: com.crashlytics.android.core.ah$e */
    private class C3571e extends C2797h {
        /* renamed from: a */
        final /* synthetic */ ah f14684a;
        /* renamed from: b */
        private final float f14685b;
        /* renamed from: c */
        private final C1352d f14686c;

        C3571e(ah ahVar, float f, C1352d c1352d) {
            this.f14684a = ahVar;
            this.f14685b = f;
            this.f14686c = c1352d;
        }

        /* renamed from: a */
        public void mo1138a() {
            try {
                m18110b();
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            this.f14684a.f4251h = null;
        }

        /* renamed from: b */
        private void m18110b() {
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
            r8 = this;
            r0 = io.fabric.sdk.android.C2766c.m13524h();
            r1 = "CrashlyticsCore";
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Starting report processing in ";
            r2.append(r3);
            r3 = r8.f14685b;
            r2.append(r3);
            r3 = " second(s)...";
            r2.append(r3);
            r2 = r2.toString();
            r0.mo3554a(r1, r2);
            r0 = r8.f14685b;
            r1 = 0;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 <= 0) goto L_0x003b;
        L_0x0028:
            r0 = r8.f14685b;	 Catch:{ InterruptedException -> 0x0033 }
            r1 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ InterruptedException -> 0x0033 }
            r0 = r0 * r1;	 Catch:{ InterruptedException -> 0x0033 }
            r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0033 }
            java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0033 }
            goto L_0x003b;
        L_0x0033:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
            return;
        L_0x003b:
            r0 = r8.f14684a;
            r0 = r0.m5481a();
            r1 = r8.f14684a;
            r1 = r1.f4250g;
            r1 = r1.mo1150a();
            if (r1 == 0) goto L_0x004e;
        L_0x004d:
            return;
        L_0x004e:
            r1 = r0.isEmpty();
            if (r1 != 0) goto L_0x0094;
        L_0x0054:
            r1 = r8.f14686c;
            r1 = r1.mo1137a();
            if (r1 != 0) goto L_0x0094;
        L_0x005c:
            r1 = io.fabric.sdk.android.C2766c.m13524h();
            r2 = "CrashlyticsCore";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "User declined to send. Removing ";
            r3.append(r4);
            r4 = r0.size();
            r3.append(r4);
            r4 = " Report(s).";
            r3.append(r4);
            r3 = r3.toString();
            r1.mo3554a(r2, r3);
            r0 = r0.iterator();
        L_0x0083:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0093;
        L_0x0089:
            r1 = r0.next();
            r1 = (com.crashlytics.android.core.Report) r1;
            r1.mo1134f();
            goto L_0x0083;
        L_0x0093:
            return;
        L_0x0094:
            r1 = 0;
        L_0x0095:
            r2 = r0.isEmpty();
            if (r2 != 0) goto L_0x0132;
        L_0x009b:
            r2 = r8.f14684a;
            r2 = r2.f4250g;
            r2 = r2.mo1150a();
            if (r2 == 0) goto L_0x00a8;
        L_0x00a7:
            return;
        L_0x00a8:
            r2 = io.fabric.sdk.android.C2766c.m13524h();
            r3 = "CrashlyticsCore";
            r4 = new java.lang.StringBuilder;
            r4.<init>();
            r5 = "Attempting to send ";
            r4.append(r5);
            r5 = r0.size();
            r4.append(r5);
            r5 = " report(s)";
            r4.append(r5);
            r4 = r4.toString();
            r2.mo3554a(r3, r4);
            r0 = r0.iterator();
        L_0x00cf:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x00e1;
        L_0x00d5:
            r2 = r0.next();
            r2 = (com.crashlytics.android.core.Report) r2;
            r3 = r8.f14684a;
            r3.m5483a(r2);
            goto L_0x00cf;
        L_0x00e1:
            r0 = r8.f14684a;
            r0 = r0.m5481a();
            r2 = r0.isEmpty();
            if (r2 != 0) goto L_0x0095;
        L_0x00ed:
            r2 = com.crashlytics.android.core.ah.f4245b;
            r3 = r1 + 1;
            r4 = com.crashlytics.android.core.ah.f4245b;
            r4 = r4.length;
            r4 = r4 + -1;
            r1 = java.lang.Math.min(r1, r4);
            r1 = r2[r1];
            r1 = (long) r1;
            r4 = io.fabric.sdk.android.C2766c.m13524h();
            r5 = "CrashlyticsCore";
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r7 = "Report submisson: scheduling delayed retry in ";
            r6.append(r7);
            r6.append(r1);
            r7 = " seconds";
            r6.append(r7);
            r6 = r6.toString();
            r4.mo3554a(r5, r6);
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r1 = r1 * r4;
            java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x012a }
            r1 = r3;
            goto L_0x0095;
        L_0x012a:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
            return;
        L_0x0132:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ah.e.b():void");
        }
    }

    public ah(String str, C1392o c1392o, C1351c c1351c, C1350b c1350b) {
        if (c1392o != null) {
            this.f4247d = c1392o;
            this.f4248e = str;
            this.f4249f = c1351c;
            this.f4250g = c1350b;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* renamed from: a */
    public synchronized void m5482a(float f, C1352d c1352d) {
        if (this.f4251h != null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Report upload has already been started.");
            return;
        }
        this.f4251h = new Thread(new C3571e(this, f, c1352d), "Crashlytics Report Uploader");
        this.f4251h.start();
    }

    /* renamed from: a */
    boolean m5483a(Report report) {
        boolean z;
        synchronized (this.f4246c) {
            z = false;
            try {
                boolean a = this.f4247d.mo1128a(new C1391n(this.f4248e, report));
                C2774k h = C2766c.m13524h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Crashlytics report upload ");
                stringBuilder.append(a ? "complete: " : "FAILED: ");
                stringBuilder.append(report.mo1130b());
                h.mo3558c(str, stringBuilder.toString());
                if (a) {
                    report.mo1134f();
                    z = true;
                }
            } catch (Throwable e) {
                h = C2766c.m13524h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error occurred sending report ");
                stringBuilder.append(report);
                h.mo3562e(str, stringBuilder.toString(), e);
            }
        }
        return z;
    }

    /* renamed from: a */
    List<Report> m5481a() {
        C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "Checking for crash reports...");
        synchronized (this.f4246c) {
            File[] a = this.f4249f.mo1147a();
            File[] b = this.f4249f.mo1148b();
            File[] c = this.f4249f.mo1149c();
        }
        List<Report> linkedList = new LinkedList();
        if (a != null) {
            for (File file : a) {
                C2774k h = C2766c.m13524h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found crash report ");
                stringBuilder.append(file.getPath());
                h.mo3554a(str, stringBuilder.toString());
                linkedList.add(new aj(file));
            }
        }
        Map hashMap = new HashMap();
        if (b != null) {
            for (File file2 : b) {
                String a2 = C1386j.m5569a(file2);
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, new LinkedList());
                }
                ((List) hashMap.get(a2)).add(file2);
            }
        }
        for (String str2 : hashMap.keySet()) {
            C2774k h2 = C2766c.m13524h();
            String str3 = CrashlyticsCore.TAG;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Found invalid session: ");
            stringBuilder2.append(str2);
            h2.mo3554a(str3, stringBuilder2.toString());
            List list = (List) hashMap.get(str2);
            linkedList.add(new C3584v(str2, (File[]) list.toArray(new File[list.size()])));
        }
        if (c != null) {
            for (File acVar : c) {
                linkedList.add(new ac(acVar));
            }
        }
        if (linkedList.isEmpty()) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "No reports found.");
        }
        return linkedList;
    }
}
