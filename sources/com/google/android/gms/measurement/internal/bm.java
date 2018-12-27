package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class bm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f10509a;
    /* renamed from: b */
    private final /* synthetic */ boolean f10510b;
    /* renamed from: c */
    private final /* synthetic */ zzl f10511c;
    /* renamed from: d */
    private final /* synthetic */ zzh f10512d;
    /* renamed from: e */
    private final /* synthetic */ zzl f10513e;
    /* renamed from: f */
    private final /* synthetic */ zzdr f10514f;

    bm(zzdr zzdr, boolean z, boolean z2, zzl zzl, zzh zzh, zzl zzl2) {
        this.f10514f = zzdr;
        this.f10509a = z;
        this.f10510b = z2;
        this.f10511c = zzl;
        this.f10512d = zzh;
        this.f10513e = zzl2;
    }

    public final void run() {
        zzag d = this.f10514f.f21656b;
        if (d == null) {
            this.f10514f.mo3172r().v_().m12354a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f10509a) {
            this.f10514f.m29676a(d, this.f10510b ? null : this.f10511c, this.f10512d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10513e.f20707a)) {
                    d.mo3188a(this.f10511c, this.f10512d);
                } else {
                    d.mo3187a(this.f10511c);
                }
            } catch (RemoteException e) {
                this.f10514f.mo3172r().v_().m12355a("Failed to send conditional user property to the service", e);
            }
        }
        this.f10514f.m29657I();
    }
}
