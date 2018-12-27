package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzv;

public final class zzbh implements ServiceConnection {
    /* renamed from: a */
    final /* synthetic */ zzbg f10770a;
    /* renamed from: b */
    private final String f10771b;

    zzbh(zzbg zzbg, String str) {
        this.f10770a = zzbg;
        this.f10771b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f10770a.f10769a.mo3172r().m28540i().m12354a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            componentName = zzv.m22630a(iBinder);
            if (componentName == null) {
                this.f10770a.f10769a.mo3172r().m28540i().m12354a("Install Referrer Service implementation was not found");
                return;
            }
            this.f10770a.f10769a.mo3172r().m28553v().m12354a("Install Referrer Service connected");
            this.f10770a.f10769a.mo3171q().m28568a(new C2488n(this, componentName, this));
        } catch (ComponentName componentName2) {
            this.f10770a.f10769a.mo3172r().m28540i().m12355a("Exception occurred while calling Install Referrer API", componentName2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10770a.f10769a.mo3172r().m28553v().m12354a("Install Referrer Service disconnected");
    }
}
