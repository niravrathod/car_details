package com.google.android.gms.internal.ads;

import android.content.Context;

@zzaer
public final class zzakc implements zzfw {
    /* renamed from: a */
    private final Context f16837a;
    /* renamed from: b */
    private final Object f16838b;
    /* renamed from: c */
    private String f16839c;
    /* renamed from: d */
    private boolean f16840d;

    public zzakc(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f16837a = context;
        this.f16839c = str;
        this.f16840d = null;
        this.f16838b = new Object();
    }

    /* renamed from: a */
    public final void m21205a(String str) {
        this.f16839c = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m21206a(boolean r4) {
        /*
        r3 = this;
        r0 = com.google.android.gms.ads.internal.zzbv.zzfj();
        r1 = r3.f16837a;
        r0 = r0.m9668a(r1);
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r3.f16838b;
        monitor-enter(r0);
        r1 = r3.f16840d;	 Catch:{ all -> 0x003f }
        if (r1 != r4) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0016:
        r3.f16840d = r4;	 Catch:{ all -> 0x003f }
        r4 = r3.f16839c;	 Catch:{ all -> 0x003f }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x0022:
        r4 = r3.f16840d;	 Catch:{ all -> 0x003f }
        if (r4 == 0) goto L_0x0032;
    L_0x0026:
        r4 = com.google.android.gms.ads.internal.zzbv.zzfj();	 Catch:{ all -> 0x003f }
        r1 = r3.f16837a;	 Catch:{ all -> 0x003f }
        r2 = r3.f16839c;	 Catch:{ all -> 0x003f }
        r4.m9665a(r1, r2);	 Catch:{ all -> 0x003f }
        goto L_0x003d;
    L_0x0032:
        r4 = com.google.android.gms.ads.internal.zzbv.zzfj();	 Catch:{ all -> 0x003f }
        r1 = r3.f16837a;	 Catch:{ all -> 0x003f }
        r2 = r3.f16839c;	 Catch:{ all -> 0x003f }
        r4.m9670b(r1, r2);	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakc.a(boolean):void");
    }

    /* renamed from: a */
    public final void mo2329a(zzfv zzfv) {
        m21206a(zzfv.f9458a);
    }
}
