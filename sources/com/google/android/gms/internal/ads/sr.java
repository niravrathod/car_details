package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;

final class sr implements zzu<Object> {
    /* renamed from: a */
    private final /* synthetic */ zzow f16662a;

    sr(zzow zzow) {
        this.f16662a = zzow;
    }

    public final void zza(java.lang.Object r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r3 = r2.f16662a;	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = "timestamp";	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = r4.get(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        r3.f9757b = r0;	 Catch:{ NumberFormatException -> 0x0015 }
        goto L_0x001a;
    L_0x0015:
        r3 = "Failed to call parse unconfirmedClickTimestamp.";
        com.google.android.gms.internal.ads.zzaok.m10003c(r3);
    L_0x001a:
        r3 = r2.f16662a;
        r0 = "id";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r3.f9756a = r0;
        r3 = "asset_id";
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r4 = r2.f16662a;
        r4 = r4.f9760e;
        if (r4 != 0) goto L_0x003c;
    L_0x0036:
        r3 = "Received unconfirmed click but UnconfirmedClickListener is null.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r3);
        return;
    L_0x003c:
        r4 = r2.f16662a;	 Catch:{ RemoteException -> 0x0046 }
        r4 = r4.f9760e;	 Catch:{ RemoteException -> 0x0046 }
        r4.mo2690a(r3);	 Catch:{ RemoteException -> 0x0046 }
        return;
    L_0x0046:
        r3 = move-exception;
        r4 = "#007 Could not call remote method.";
        com.google.android.gms.internal.ads.zzaok.m10006d(r4, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sr.zza(java.lang.Object, java.util.Map):void");
    }
}
