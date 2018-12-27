package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public final class zzafn extends zzafj implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    /* renamed from: a */
    private Context f19700a;
    /* renamed from: b */
    private zzaop f19701b;
    /* renamed from: c */
    private zzapu<zzafp> f19702c;
    /* renamed from: d */
    private zzami f19703d;
    /* renamed from: e */
    private final zzafh f19704e;
    /* renamed from: f */
    private final Object f19705f = new Object();
    @VisibleForTesting
    /* renamed from: g */
    private zzafo f19706g;

    public zzafn(Context context, zzaop zzaop, zzapu<zzafp> zzapu, zzafh zzafh) {
        super(zzapu, zzafh);
        this.f19700a = context;
        this.f19701b = zzaop;
        this.f19702c = zzapu;
        this.f19704e = zzafh;
        this.f19706g = new zzafo(context, zzbv.zzfa().m9925a(), this, this);
        this.f19706g.checkAvailabilityAndConnect();
    }

    /* renamed from: d */
    public final com.google.android.gms.internal.ads.zzafx mo4170d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f19705f;
        monitor-enter(r0);
        r1 = r2.f19706g;	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        r1 = r1.m26175a();	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r1 = move-exception;	 Catch:{ all -> 0x000b }
        goto L_0x0010;	 Catch:{ all -> 0x000b }
    L_0x000d:
        r1 = 0;	 Catch:{ all -> 0x000b }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.d():com.google.android.gms.internal.ads.zzafx");
    }

    /* renamed from: a */
    public final void mo4169a() {
        synchronized (this.f19705f) {
            if (this.f19706g.isConnected() || this.f19706g.isConnecting()) {
                this.f19706g.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzaok.m10001b("Cannot connect to remote service, fallback to local instance.");
        this.f19703d = new zzafm(this.f19700a, this.f19702c, this.f19704e);
        this.f19703d.mo2219c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbv.zzek().m9841b(this.f19700a, this.f19701b.f19893a, "gmob-apps", bundle, true);
    }

    public final void onConnected(Bundle bundle) {
        mo2219c();
    }

    public final void onConnectionSuspended(int i) {
        zzaok.m10001b("Disconnected from remote ad request service.");
    }
}
