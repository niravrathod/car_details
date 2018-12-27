package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpb;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzpo;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.t */
final class C2416t implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpo f7724a;
    /* renamed from: b */
    private final /* synthetic */ int f7725b;
    /* renamed from: c */
    private final /* synthetic */ List f7726c;
    /* renamed from: d */
    private final /* synthetic */ zzbb f7727d;

    C2416t(zzbb zzbb, zzpo zzpo, int i, List list) {
        this.f7727d = zzbb;
        this.f7724a = zzpo;
        this.f7725b = i;
        this.f7726c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            zzbb zzbb;
            Object a;
            if ((this.f7724a instanceof zzpd) && this.f7727d.e.f7802k != null) {
                zzbb = this.f7727d;
                if (this.f7725b != this.f7726c.size() - 1) {
                    z = true;
                }
                zzbb.c = z;
                a = zzbb.m28923b(this.f7724a);
                this.f7727d.e.f7802k.mo2688a(a);
                this.f7727d.m28929a(a.mo2709q());
            } else if ((this.f7724a instanceof zzpd) && this.f7727d.e.f7801j != null) {
                zzbb = this.f7727d;
                if (this.f7725b != this.f7726c.size() - 1) {
                    z = true;
                }
                zzbb.c = z;
                zzpd zzpd = (zzpd) this.f7724a;
                this.f7727d.e.f7801j.mo2684a(zzpd);
                this.f7727d.m28929a(zzpd.mo2659n());
            } else if ((this.f7724a instanceof zzpb) && this.f7727d.e.f7802k != null) {
                zzbb = this.f7727d;
                if (this.f7725b != this.f7726c.size() - 1) {
                    z = true;
                }
                zzbb.c = z;
                a = zzbb.m28923b(this.f7724a);
                this.f7727d.e.f7802k.mo2688a(a);
                this.f7727d.m28929a(a.mo2709q());
            } else if (!(this.f7724a instanceof zzpb) || this.f7727d.e.f7800i == null) {
                zza zza = this.f7727d;
                if (this.f7725b != this.f7726c.size() - 1) {
                    z = true;
                }
                zza.mo4934a(3, z);
            } else {
                zzbb = this.f7727d;
                if (this.f7725b != this.f7726c.size() - 1) {
                    z = true;
                }
                zzbb.c = z;
                zzpb zzpb = (zzpb) this.f7724a;
                this.f7727d.e.f7800i.mo2683a(zzpb);
                this.f7727d.m28929a(zzpb.mo2641n());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
