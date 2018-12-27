package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzok;
import com.google.android.gms.internal.ads.zzom;

final class al implements Runnable {
    /* renamed from: a */
    final /* synthetic */ zzakn f7652a;
    /* renamed from: b */
    final /* synthetic */ zzajy f7653b;
    /* renamed from: c */
    final /* synthetic */ zzh f7654c;
    /* renamed from: d */
    private final /* synthetic */ zzoj f7655d;

    al(zzh zzh, zzakn zzakn, zzajy zzajy, zzoj zzoj) {
        this.f7654c = zzh;
        this.f7652a = zzakn;
        this.f7653b = zzajy;
        this.f7655d = zzoj;
    }

    public final void run() {
        if (this.f7652a.f8807b.f19803r && this.f7654c.e.f7812u != null) {
            String str = null;
            if (this.f7652a.f8807b.f19786a != null) {
                zzbv.zzek();
                str = zzalo.m9785a(this.f7652a.f8807b.f19786a);
            }
            zzom zzok = new zzok(this.f7654c, str, this.f7652a.f8807b.f19787b);
            this.f7654c.e.zzaen = 1;
            try {
                this.f7654c.c = false;
                this.f7654c.e.f7812u.mo2580a(zzok);
                return;
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
                this.f7654c.c = true;
            }
        }
        zzw zzw = new zzw(this.f7654c.e.zzrx, this.f7653b, this.f7652a.f8807b.f19764E);
        try {
            zzasg a = this.f7654c.mo4982a(this.f7652a, zzw, this.f7653b);
            a.mo4758f(this.f7654c.e.zzadm.f8807b.f19781V);
            a.setOnTouchListener(new an(this, zzw));
            a.setOnClickListener(new ao(this, zzw));
            this.f7654c.e.zzaen = 0;
            zzbw zzbw = this.f7654c.e;
            zzbv.zzej();
            zzbw.zzadj = zzacs.m9460a(this.f7654c.e.zzrx, this.f7654c, this.f7652a, this.f7654c.e.f7793b, a, this.f7654c.j, this.f7654c, this.f7655d);
        } catch (Throwable e2) {
            zzaok.m10002b("Could not obtain webview.", e2);
            zzalo.f8872a.post(new am(this));
        }
    }
}
