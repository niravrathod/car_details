package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final class vp implements zzu<zzwy> {
    /* renamed from: a */
    private final /* synthetic */ zzck f16700a;
    /* renamed from: b */
    private final /* synthetic */ zzvr f16701b;
    /* renamed from: c */
    private final /* synthetic */ zzanq f16702c;
    /* renamed from: d */
    private final /* synthetic */ zzwc f16703d;

    vp(zzwc zzwc, zzck zzck, zzvr zzvr, zzanq zzanq) {
        this.f16703d = zzwc;
        this.f16700a = zzck;
        this.f16701b = zzvr;
        this.f16702c = zzanq;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f16703d.f9816a) {
            zzaok.m10005d("JS Engine is requesting an update");
            if (this.f16703d.f9823h == null) {
                zzaok.m10005d("Starting reload.");
                this.f16703d.f9823h = 2;
                this.f16703d.m11172a(this.f16700a);
            }
            this.f16701b.mo4822b("/requestReload", (zzu) this.f16702c.m9931a());
        }
    }
}
