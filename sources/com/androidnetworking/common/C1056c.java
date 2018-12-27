package com.androidnetworking.common;

import com.androidnetworking.p044d.C1059c;

/* renamed from: com.androidnetworking.common.c */
public class C1056c {
    /* renamed from: a */
    private static C1056c f3549a;
    /* renamed from: b */
    private ConnectionQuality f3550b = ConnectionQuality.UNKNOWN;
    /* renamed from: c */
    private int f3551c = 0;
    /* renamed from: d */
    private int f3552d = 0;
    /* renamed from: e */
    private int f3553e = 0;
    /* renamed from: f */
    private C1059c f3554f;

    /* renamed from: com.androidnetworking.common.c$1 */
    class C10551 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1056c f3548a;

        C10551(C1056c c1056c) {
            this.f3548a = c1056c;
        }

        public void run() {
            this.f3548a.f3554f.m4507a(this.f3548a.f3550b, this.f3548a.f3553e);
        }
    }

    /* renamed from: a */
    public static C1056c m4500a() {
        if (f3549a == null) {
            synchronized (C1056c.class) {
                if (f3549a == null) {
                    f3549a = new C1056c();
                }
            }
        }
        return f3549a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void m4503a(long r4, long r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x00b6;
    L_0x0007:
        r0 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x00b6;
    L_0x000d:
        r4 = (double) r4;
        r0 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        java.lang.Double.isNaN(r4);
        r4 = r4 * r0;
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r4 = r4 / r6;
        r6 = 4620693217682128896; // 0x4020000000000000 float:0.0 double:8.0;
        r4 = r4 * r6;
        r6 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0026;
    L_0x0024:
        goto L_0x00b6;
    L_0x0026:
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        r7 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        r6 = r6 * r7;
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r0 = 0;
        r6 = r6 + r4;
        r4 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        r4 = r4 + 1;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r6 = r6 / r4;
        r4 = (int) r6;
        r3.f3551c = r4;	 Catch:{ all -> 0x00b3 }
        r4 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        r4 = r4 + 1;
        r3.f3552d = r4;	 Catch:{ all -> 0x00b3 }
        r4 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        r5 = 5;
        if (r4 == r5) goto L_0x0054;
    L_0x0049:
        r4 = r3.f3550b;	 Catch:{ all -> 0x00b3 }
        r6 = com.androidnetworking.common.ConnectionQuality.UNKNOWN;	 Catch:{ all -> 0x00b3 }
        if (r4 != r6) goto L_0x00b1;
    L_0x004f:
        r4 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        r6 = 2;
        if (r4 != r6) goto L_0x00b1;
    L_0x0054:
        r4 = r3.f3550b;	 Catch:{ all -> 0x00b3 }
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        r3.f3553e = r6;	 Catch:{ all -> 0x00b3 }
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        if (r6 > 0) goto L_0x0063;
    L_0x005e:
        r6 = com.androidnetworking.common.ConnectionQuality.UNKNOWN;	 Catch:{ all -> 0x00b3 }
        r3.f3550b = r6;	 Catch:{ all -> 0x00b3 }
        goto L_0x008c;
    L_0x0063:
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        r7 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        if (r6 >= r7) goto L_0x006e;
    L_0x0069:
        r6 = com.androidnetworking.common.ConnectionQuality.POOR;	 Catch:{ all -> 0x00b3 }
        r3.f3550b = r6;	 Catch:{ all -> 0x00b3 }
        goto L_0x008c;
    L_0x006e:
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        r7 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        if (r6 >= r7) goto L_0x0079;
    L_0x0074:
        r6 = com.androidnetworking.common.ConnectionQuality.MODERATE;	 Catch:{ all -> 0x00b3 }
        r3.f3550b = r6;	 Catch:{ all -> 0x00b3 }
        goto L_0x008c;
    L_0x0079:
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        r7 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        if (r6 >= r7) goto L_0x0084;
    L_0x007f:
        r6 = com.androidnetworking.common.ConnectionQuality.GOOD;	 Catch:{ all -> 0x00b3 }
        r3.f3550b = r6;	 Catch:{ all -> 0x00b3 }
        goto L_0x008c;
    L_0x0084:
        r6 = r3.f3551c;	 Catch:{ all -> 0x00b3 }
        if (r6 <= r7) goto L_0x008c;
    L_0x0088:
        r6 = com.androidnetworking.common.ConnectionQuality.EXCELLENT;	 Catch:{ all -> 0x00b3 }
        r3.f3550b = r6;	 Catch:{ all -> 0x00b3 }
    L_0x008c:
        r6 = r3.f3552d;	 Catch:{ all -> 0x00b3 }
        if (r6 != r5) goto L_0x0095;
    L_0x0090:
        r5 = 0;
        r3.f3551c = r5;	 Catch:{ all -> 0x00b3 }
        r3.f3552d = r5;	 Catch:{ all -> 0x00b3 }
    L_0x0095:
        r5 = r3.f3550b;	 Catch:{ all -> 0x00b3 }
        if (r5 == r4) goto L_0x00b1;
    L_0x0099:
        r4 = r3.f3554f;	 Catch:{ all -> 0x00b3 }
        if (r4 == 0) goto L_0x00b1;
    L_0x009d:
        r4 = com.androidnetworking.p043b.C1040b.m4416a();	 Catch:{ all -> 0x00b3 }
        r4 = r4.m4417b();	 Catch:{ all -> 0x00b3 }
        r4 = r4.mo903c();	 Catch:{ all -> 0x00b3 }
        r5 = new com.androidnetworking.common.c$1;	 Catch:{ all -> 0x00b3 }
        r5.<init>(r3);	 Catch:{ all -> 0x00b3 }
        r4.execute(r5);	 Catch:{ all -> 0x00b3 }
    L_0x00b1:
        monitor-exit(r3);
        return;
    L_0x00b3:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
    L_0x00b6:
        monitor-exit(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidnetworking.common.c.a(long, long):void");
    }
}
