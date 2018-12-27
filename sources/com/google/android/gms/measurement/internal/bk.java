package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class bk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f10503a;
    /* renamed from: b */
    private final /* synthetic */ boolean f10504b;
    /* renamed from: c */
    private final /* synthetic */ zzad f10505c;
    /* renamed from: d */
    private final /* synthetic */ zzh f10506d;
    /* renamed from: e */
    private final /* synthetic */ String f10507e;
    /* renamed from: f */
    private final /* synthetic */ zzdr f10508f;

    bk(zzdr zzdr, boolean z, boolean z2, zzad zzad, zzh zzh, String str) {
        this.f10508f = zzdr;
        this.f10503a = z;
        this.f10504b = z2;
        this.f10505c = zzad;
        this.f10506d = zzh;
        this.f10507e = str;
    }

    public final void run() {
        zzag d = this.f10508f.f21656b;
        if (d == null) {
            this.f10508f.mo3172r().v_().m12354a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f10503a) {
            this.f10508f.m29676a(d, this.f10504b ? null : this.f10505c, this.f10506d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10507e)) {
                    d.mo3183a(this.f10505c, this.f10506d);
                } else {
                    d.mo3184a(this.f10505c, this.f10507e, this.f10508f.mo3172r().m28556y());
                }
            } catch (RemoteException e) {
                this.f10508f.mo3172r().v_().m12355a("Failed to send event to the service", e);
            }
        }
        this.f10508f.m29657I();
    }
}
