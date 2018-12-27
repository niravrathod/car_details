package com.google.android.gms.internal.ads;

public final class zzdu extends zzek {
    public zzdu(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 24);
    }

    /* renamed from: b */
    public final Void mo2436b() {
        if (this.a.m10509b()) {
            return super.mo2436b();
        }
        if (this.a.m10514g()) {
            m21656c();
        }
        return null;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (this.a.m10514g()) {
            m21656c();
            return;
        }
        synchronized (this.b) {
            this.b.f19979U = (String) this.c.invoke(null, new Object[]{this.a.m10504a()});
        }
    }

    /* renamed from: c */
    private final void m21656c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.a;
        r0 = r0.m10520m();
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r0.getInfo();	 Catch:{ IOException -> 0x0039 }
        r1 = r0.getId();	 Catch:{ IOException -> 0x0039 }
        r1 = com.google.android.gms.internal.ads.zzdi.m10524a(r1);	 Catch:{ IOException -> 0x0039 }
        if (r1 == 0) goto L_0x0038;	 Catch:{ IOException -> 0x0039 }
    L_0x0017:
        r2 = r4.b;	 Catch:{ IOException -> 0x0039 }
        monitor-enter(r2);	 Catch:{ IOException -> 0x0039 }
        r3 = r4.b;	 Catch:{ all -> 0x0035 }
        r3.f19979U = r1;	 Catch:{ all -> 0x0035 }
        r1 = r4.b;	 Catch:{ all -> 0x0035 }
        r0 = r0.isLimitAdTrackingEnabled();	 Catch:{ all -> 0x0035 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0035 }
        r1.f19981W = r0;	 Catch:{ all -> 0x0035 }
        r0 = r4.b;	 Catch:{ all -> 0x0035 }
        r1 = 5;	 Catch:{ all -> 0x0035 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0035 }
        r0.f19980V = r1;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        return;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;	 Catch:{ IOException -> 0x0039 }
    L_0x0038:
        return;
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdu.c():void");
    }

    public final /* synthetic */ Object call() {
        return mo2436b();
    }
}
