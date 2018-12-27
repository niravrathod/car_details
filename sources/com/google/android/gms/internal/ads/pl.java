package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class pl implements ti {
    /* renamed from: a */
    private final Map<String, List<zzr<?>>> f16595a = new HashMap();
    /* renamed from: b */
    private final zzd f16596b;

    pl(zzd zzd) {
        this.f16596b = zzd;
    }

    /* renamed from: a */
    public final void mo2162a(zzr<?> zzr, zzx<?> zzx) {
        if (zzx.f9825b != null) {
            if (!zzx.f9825b.m10469a()) {
                List<zzr> list;
                zzr = zzr.m11035f();
                synchronized (this) {
                    list = (List) this.f16595a.remove(zzr);
                }
                if (list != null) {
                    if (zzaf.f8537a) {
                        zzaf.m9508a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzr);
                    }
                    for (zzr a : list) {
                        this.f16596b.f9353e.mo2459a(a, (zzx) zzx);
                    }
                }
                return;
            }
        }
        mo2161a(zzr);
    }

    /* renamed from: a */
    public final synchronized void mo2161a(zzr<?> zzr) {
        zzr = zzr.m11035f();
        List list = (List) this.f16595a.remove(zzr);
        if (!(list == null || list.isEmpty())) {
            if (zzaf.f8537a) {
                zzaf.m9508a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzr);
            }
            zzr zzr2 = (zzr) list.remove(0);
            this.f16595a.put(zzr, list);
            zzr2.m11024a((ti) this);
            try {
                this.f16596b.f9351c.put(zzr2);
            } catch (zzr<?> zzr3) {
                zzaf.m9511c("Couldn't add request to queue. %s", zzr3.toString());
                Thread.currentThread().interrupt();
                this.f16596b.m10491a();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final synchronized boolean m20922b(com.google.android.gms.internal.ads.zzr<?> r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r6.m11035f();	 Catch:{ all -> 0x0052 }
        r1 = r5.f16595a;	 Catch:{ all -> 0x0052 }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0052 }
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x003a;
    L_0x000f:
        r1 = r5.f16595a;	 Catch:{ all -> 0x0052 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0052 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x001e;
    L_0x0019:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0052 }
        r1.<init>();	 Catch:{ all -> 0x0052 }
    L_0x001e:
        r4 = "waiting-for-response";
        r6.m11030b(r4);	 Catch:{ all -> 0x0052 }
        r1.add(r6);	 Catch:{ all -> 0x0052 }
        r6 = r5.f16595a;	 Catch:{ all -> 0x0052 }
        r6.put(r0, r1);	 Catch:{ all -> 0x0052 }
        r6 = com.google.android.gms.internal.ads.zzaf.f8537a;	 Catch:{ all -> 0x0052 }
        if (r6 == 0) goto L_0x0038;
    L_0x002f:
        r6 = "Request for cacheKey=%s is in flight, putting on hold.";
        r1 = new java.lang.Object[r2];	 Catch:{ all -> 0x0052 }
        r1[r3] = r0;	 Catch:{ all -> 0x0052 }
        com.google.android.gms.internal.ads.zzaf.m9510b(r6, r1);	 Catch:{ all -> 0x0052 }
    L_0x0038:
        monitor-exit(r5);
        return r2;
    L_0x003a:
        r1 = r5.f16595a;	 Catch:{ all -> 0x0052 }
        r4 = 0;
        r1.put(r0, r4);	 Catch:{ all -> 0x0052 }
        r6.m11024a(r5);	 Catch:{ all -> 0x0052 }
        r6 = com.google.android.gms.internal.ads.zzaf.f8537a;	 Catch:{ all -> 0x0052 }
        if (r6 == 0) goto L_0x0050;
    L_0x0047:
        r6 = "new request, sending to network %s";
        r1 = new java.lang.Object[r2];	 Catch:{ all -> 0x0052 }
        r1[r3] = r0;	 Catch:{ all -> 0x0052 }
        com.google.android.gms.internal.ads.zzaf.m9510b(r6, r1);	 Catch:{ all -> 0x0052 }
    L_0x0050:
        monitor-exit(r5);
        return r3;
    L_0x0052:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pl.b(com.google.android.gms.internal.ads.zzr):boolean");
    }
}
