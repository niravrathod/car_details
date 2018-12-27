package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class bn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10515a;
    /* renamed from: b */
    private final /* synthetic */ String f10516b;
    /* renamed from: c */
    private final /* synthetic */ String f10517c;
    /* renamed from: d */
    private final /* synthetic */ String f10518d;
    /* renamed from: e */
    private final /* synthetic */ zzh f10519e;
    /* renamed from: f */
    private final /* synthetic */ zzdr f10520f;

    bn(zzdr zzdr, AtomicReference atomicReference, String str, String str2, String str3, zzh zzh) {
        this.f10520f = zzdr;
        this.f10515a = atomicReference;
        this.f10516b = str;
        this.f10517c = str2;
        this.f10518d = str3;
        this.f10519e = zzh;
    }

    public final void run() {
        synchronized (this.f10515a) {
            try {
                zzag d = this.f10520f.f21656b;
                if (d == null) {
                    this.f10520f.mo3172r().v_().m12357a("Failed to get conditional properties", zzap.m28525a(this.f10516b), this.f10517c, this.f10518d);
                    this.f10515a.set(Collections.emptyList());
                    this.f10515a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10516b)) {
                    this.f10515a.set(d.mo3178a(this.f10517c, this.f10518d, this.f10519e));
                } else {
                    this.f10515a.set(d.mo3179a(this.f10516b, this.f10517c, this.f10518d));
                }
                this.f10520f.m29657I();
                this.f10515a.notify();
            } catch (RemoteException e) {
                try {
                    this.f10520f.mo3172r().v_().m12357a("Failed to get conditional properties", zzap.m28525a(this.f10516b), this.f10517c, e);
                    this.f10515a.set(Collections.emptyList());
                    this.f10515a.notify();
                } catch (Throwable th) {
                    this.f10515a.notify();
                }
            }
        }
    }
}
