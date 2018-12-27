package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.l */
final class C4078l implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f16362a;

    C4078l(CountDownLatch countDownLatch) {
        this.f16362a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        zzaok.m10007e("Adapter returned an ad, but assets substitution failed");
        this.f16362a.countDown();
        zzasg.destroy();
    }
}
