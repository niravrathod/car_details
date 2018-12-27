package p173;

import android.location.LocationManager;

/* renamed from: c */
public final class C4895c {
    /* renamed from: a */
    LocationManager f21922a;
    /* renamed from: b */
    boolean f21923b = false;
    /* renamed from: c */
    boolean f21924c = false;

    /* renamed from: a */
    public final android.location.Location m30256a(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f21922a;
        if (r0 != 0) goto L_0x000e;
    L_0x0004:
        r0 = "location";
        r3 = r3.getSystemService(r0);
        r3 = (android.location.LocationManager) r3;
        r2.f21922a = r3;
    L_0x000e:
        r3 = r2.f21922a;	 Catch:{ Exception -> 0x0018 }
        r0 = "gps";	 Catch:{ Exception -> 0x0018 }
        r3 = r3.isProviderEnabled(r0);	 Catch:{ Exception -> 0x0018 }
        r2.f21923b = r3;	 Catch:{ Exception -> 0x0018 }
    L_0x0018:
        r3 = r2.f21922a;	 Catch:{ Exception -> 0x0022 }
        r0 = "network";	 Catch:{ Exception -> 0x0022 }
        r3 = r3.isProviderEnabled(r0);	 Catch:{ Exception -> 0x0022 }
        r2.f21924c = r3;	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        r3 = 0;
        r0 = r2.f21923b;
        if (r0 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r2.f21922a;	 Catch:{ Exception -> 0x0030 }
        r1 = "gps";	 Catch:{ Exception -> 0x0030 }
        r0 = r0.getLastKnownLocation(r1);	 Catch:{ Exception -> 0x0030 }
        r3 = r0;
    L_0x0030:
        r0 = r2.f21924c;
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        if (r3 != 0) goto L_0x003f;
    L_0x0036:
        r0 = r2.f21922a;	 Catch:{ Exception -> 0x003f }
        r1 = "network";	 Catch:{ Exception -> 0x003f }
        r0 = r0.getLastKnownLocation(r1);	 Catch:{ Exception -> 0x003f }
        r3 = r0;
    L_0x003f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a(android.content.Context):android.location.Location");
    }
}
