package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;

final class ut {
    /* renamed from: a */
    zzal f8414a;
    /* renamed from: b */
    zzjk f8415b;
    /* renamed from: c */
    to f8416c;
    /* renamed from: d */
    long f8417d;
    /* renamed from: e */
    boolean f8418e;
    /* renamed from: f */
    boolean f8419f;
    /* renamed from: g */
    private final /* synthetic */ us f8420g;

    ut(us usVar, zztr zztr) {
        this.f8420g = usVar;
        this.f8414a = zztr.m11117b(usVar.f8411c);
        this.f8416c = new to();
        usVar = this.f8416c;
        zztr = this.f8414a;
        zztr.zza(new tp(usVar));
        zztr.zza(new tx(usVar));
        zztr.zza(new tz(usVar));
        zztr.zza(new ub(usVar));
        zztr.zza(new ud(usVar));
    }

    ut(us usVar, zztr zztr, zzjk zzjk) {
        this(usVar, zztr);
        this.f8415b = zzjk;
    }

    /* renamed from: a */
    final boolean m9398a() {
        if (this.f8418e) {
            return false;
        }
        this.f8419f = this.f8414a.zzb(zzuv.m11123b(this.f8415b != null ? this.f8415b : this.f8420g.f8410b));
        this.f8418e = true;
        this.f8417d = zzbv.zzer().currentTimeMillis();
        return true;
    }
}
