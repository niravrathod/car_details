package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class bo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10521a;
    /* renamed from: b */
    private final /* synthetic */ String f10522b;
    /* renamed from: c */
    private final /* synthetic */ String f10523c;
    /* renamed from: d */
    private final /* synthetic */ String f10524d;
    /* renamed from: e */
    private final /* synthetic */ boolean f10525e;
    /* renamed from: f */
    private final /* synthetic */ zzh f10526f;
    /* renamed from: g */
    private final /* synthetic */ zzdr f10527g;

    bo(zzdr zzdr, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzh zzh) {
        this.f10527g = zzdr;
        this.f10521a = atomicReference;
        this.f10522b = str;
        this.f10523c = str2;
        this.f10524d = str3;
        this.f10525e = z;
        this.f10526f = zzh;
    }

    public final void run() {
        synchronized (this.f10521a) {
            try {
                zzag d = this.f10527g.f21656b;
                if (d == null) {
                    this.f10527g.mo3172r().v_().m12357a("Failed to get user properties", zzap.m28525a(this.f10522b), this.f10523c, this.f10524d);
                    this.f10521a.set(Collections.emptyList());
                    this.f10521a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f10522b)) {
                    this.f10521a.set(d.mo3181a(this.f10523c, this.f10524d, this.f10525e, this.f10526f));
                } else {
                    this.f10521a.set(d.mo3180a(this.f10522b, this.f10523c, this.f10524d, this.f10525e));
                }
                this.f10527g.m29657I();
                this.f10521a.notify();
            } catch (RemoteException e) {
                try {
                    this.f10527g.mo3172r().v_().m12357a("Failed to get user properties", zzap.m28525a(this.f10522b), this.f10523c, e);
                    this.f10521a.set(Collections.emptyList());
                    this.f10521a.notify();
                } catch (Throwable th) {
                    this.f10521a.notify();
                }
            }
        }
    }
}
