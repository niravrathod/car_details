package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Callable;

final class by implements Callable<zzahg> {
    /* renamed from: a */
    private final /* synthetic */ Context f7938a;
    /* renamed from: b */
    private final /* synthetic */ zzahi f7939b;

    by(zzahi zzahi, Context context) {
        this.f7939b = zzahi;
        this.f7938a = context;
    }

    public final /* synthetic */ Object call() {
        zzahg a;
        bz bzVar = (bz) this.f7939b.f8726a.get(this.f7938a);
        if (bzVar != null) {
            if ((bzVar.f7940a + ((Long) zzkd.m10713e().m10897a(zznw.aW)).longValue() < zzbv.zzer().currentTimeMillis() ? 1 : null) == null) {
                a = new zzahh(this.f7938a, bzVar.f7941b).m9554a();
                this.f7939b.f8726a.put(this.f7938a, new bz(this.f7939b, a));
                return a;
            }
        }
        a = new zzahh(this.f7938a).m9554a();
        this.f7939b.f8726a.put(this.f7938a, new bz(this.f7939b, a));
        return a;
    }
}
