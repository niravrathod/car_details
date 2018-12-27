package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.k */
final class C4077k implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f16361a;

    C4077k(CountDownLatch countDownLatch) {
        this.f16361a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        this.f16361a.countDown();
        zzasg.getView().setVisibility(null);
    }
}
