package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzef implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    /* renamed from: a */
    final /* synthetic */ zzdr f17600a;
    /* renamed from: b */
    private volatile boolean f17601b;
    /* renamed from: c */
    private volatile zzao f17602c;

    protected zzef(zzdr zzdr) {
        this.f17600a = zzdr;
    }

    /* renamed from: a */
    public final void m22748a(Intent intent) {
        this.f17600a.mo4395d();
        Context n = this.f17600a.mo3170n();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.f17601b) {
                this.f17600a.mo3172r().m28555x().m12354a("Connection attempt already in progress");
                return;
            }
            this.f17600a.mo3172r().m28555x().m12354a("Using local app measurement service");
            this.f17601b = true;
            instance.bindService(n, intent, this.f17600a.f21655a, 129);
        }
    }

    /* renamed from: a */
    public final void m22747a() {
        if (this.f17602c != null && (this.f17602c.isConnected() || this.f17602c.isConnecting())) {
            this.f17602c.disconnect();
        }
        this.f17602c = null;
    }

    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r4 = "MeasurementServiceConnection.onServiceConnected";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r4);
        monitor-enter(r3);
        r4 = 0;
        if (r5 != 0) goto L_0x001f;
    L_0x0009:
        r3.f17601b = r4;	 Catch:{ all -> 0x001c }
        r4 = r3.f17600a;	 Catch:{ all -> 0x001c }
        r4 = r4.mo3172r();	 Catch:{ all -> 0x001c }
        r4 = r4.v_();	 Catch:{ all -> 0x001c }
        r5 = "Service connected with null binder";	 Catch:{ all -> 0x001c }
        r4.m12354a(r5);	 Catch:{ all -> 0x001c }
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
        return;
    L_0x001c:
        r4 = move-exception;
        goto L_0x009a;
    L_0x001f:
        r0 = 0;
        r1 = r5.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0063 }
        r2 = "com.google.android.gms.measurement.internal.IMeasurementService";	 Catch:{ RemoteException -> 0x0063 }
        r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x0063 }
        if (r2 == 0) goto L_0x0053;	 Catch:{ RemoteException -> 0x0063 }
    L_0x002c:
        if (r5 != 0) goto L_0x002f;	 Catch:{ RemoteException -> 0x0063 }
    L_0x002e:
        goto L_0x0043;	 Catch:{ RemoteException -> 0x0063 }
    L_0x002f:
        r1 = "com.google.android.gms.measurement.internal.IMeasurementService";	 Catch:{ RemoteException -> 0x0063 }
        r1 = r5.queryLocalInterface(r1);	 Catch:{ RemoteException -> 0x0063 }
        r2 = r1 instanceof com.google.android.gms.measurement.internal.zzag;	 Catch:{ RemoteException -> 0x0063 }
        if (r2 == 0) goto L_0x003d;	 Catch:{ RemoteException -> 0x0063 }
    L_0x0039:
        r1 = (com.google.android.gms.measurement.internal.zzag) r1;	 Catch:{ RemoteException -> 0x0063 }
    L_0x003b:
        r0 = r1;	 Catch:{ RemoteException -> 0x0063 }
        goto L_0x0043;	 Catch:{ RemoteException -> 0x0063 }
    L_0x003d:
        r1 = new com.google.android.gms.measurement.internal.zzai;	 Catch:{ RemoteException -> 0x0063 }
        r1.<init>(r5);	 Catch:{ RemoteException -> 0x0063 }
        goto L_0x003b;	 Catch:{ RemoteException -> 0x0063 }
    L_0x0043:
        r5 = r3.f17600a;	 Catch:{ RemoteException -> 0x0063 }
        r5 = r5.mo3172r();	 Catch:{ RemoteException -> 0x0063 }
        r5 = r5.m28555x();	 Catch:{ RemoteException -> 0x0063 }
        r1 = "Bound to IMeasurementService interface";	 Catch:{ RemoteException -> 0x0063 }
        r5.m12354a(r1);	 Catch:{ RemoteException -> 0x0063 }
        goto L_0x0072;	 Catch:{ RemoteException -> 0x0063 }
    L_0x0053:
        r5 = r3.f17600a;	 Catch:{ RemoteException -> 0x0063 }
        r5 = r5.mo3172r();	 Catch:{ RemoteException -> 0x0063 }
        r5 = r5.v_();	 Catch:{ RemoteException -> 0x0063 }
        r2 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x0063 }
        r5.m12355a(r2, r1);	 Catch:{ RemoteException -> 0x0063 }
        goto L_0x0072;
    L_0x0063:
        r5 = r3.f17600a;	 Catch:{ all -> 0x001c }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x001c }
        r5 = r5.v_();	 Catch:{ all -> 0x001c }
        r1 = "Service connect failed to get IMeasurementService";	 Catch:{ all -> 0x001c }
        r5.m12354a(r1);	 Catch:{ all -> 0x001c }
    L_0x0072:
        if (r0 != 0) goto L_0x008a;	 Catch:{ all -> 0x001c }
    L_0x0074:
        r3.f17601b = r4;	 Catch:{ all -> 0x001c }
        r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r5 = r3.f17600a;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r5 = r5.mo3170n();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r0 = r3.f17600a;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r0 = r0.f21655a;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4.unbindService(r5, r0);	 Catch:{ IllegalArgumentException -> 0x0098 }
        goto L_0x0098;
    L_0x008a:
        r4 = r3.f17600a;	 Catch:{ all -> 0x001c }
        r4 = r4.mo3171q();	 Catch:{ all -> 0x001c }
        r5 = new com.google.android.gms.measurement.internal.br;	 Catch:{ all -> 0x001c }
        r5.<init>(r3, r0);	 Catch:{ all -> 0x001c }
        r4.m28568a(r5);	 Catch:{ all -> 0x001c }
    L_0x0098:
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
        return;	 Catch:{ all -> 0x001c }
    L_0x009a:
        monitor-exit(r3);	 Catch:{ all -> 0x001c }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f17600a.mo3172r().m28554w().m12354a("Service disconnected");
        this.f17600a.mo3171q().m28568a(new bs(this, componentName));
    }

    /* renamed from: b */
    public final void m22749b() {
        this.f17600a.mo4395d();
        Context n = this.f17600a.mo3170n();
        synchronized (this) {
            if (this.f17601b) {
                this.f17600a.mo3172r().m28555x().m12354a("Connection attempt already in progress");
            } else if (this.f17602c == null || !(!zzn.m27333x() || this.f17602c.isConnecting() || this.f17602c.isConnected())) {
                this.f17602c = new zzao(n, Looper.getMainLooper(), this, this);
                this.f17600a.mo3172r().m28555x().m12354a("Connecting to remote service");
                this.f17601b = true;
                this.f17602c.checkAvailabilityAndConnect();
            } else {
                this.f17600a.mo3172r().m28555x().m12354a("Already awaiting connection attempt");
            }
        }
    }

    public final void onConnected(android.os.Bundle r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r4 = "MeasurementServiceConnection.onConnected";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r4);
        monitor-enter(r3);
        r4 = 0;
        r0 = r3.f17602c;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r0 = r0.getService();	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r0 = (com.google.android.gms.measurement.internal.zzag) r0;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r1 = com.google.android.gms.measurement.internal.zzn.m27333x();	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        if (r1 != 0) goto L_0x0017;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
    L_0x0015:
        r3.f17602c = r4;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
    L_0x0017:
        r1 = r3.f17600a;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r1 = r1.mo3171q();	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r2 = new com.google.android.gms.measurement.internal.bt;	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r2.<init>(r3, r0);	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        r1.m28568a(r2);	 Catch:{ DeadObjectException -> 0x0028, DeadObjectException -> 0x0028 }
        goto L_0x002d;
    L_0x0026:
        r4 = move-exception;
        goto L_0x002f;
    L_0x0028:
        r3.f17602c = r4;	 Catch:{ all -> 0x0026 }
        r4 = 0;	 Catch:{ all -> 0x0026 }
        r3.f17601b = r4;	 Catch:{ all -> 0x0026 }
    L_0x002d:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        return;	 Catch:{ all -> 0x0026 }
    L_0x002f:
        monitor-exit(r3);	 Catch:{ all -> 0x0026 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzef.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f17600a.mo3172r().m28554w().m12354a("Service connection suspended");
        this.f17600a.mo3171q().m28568a(new bu(this));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzap d = this.f17600a.r.m22723d();
        if (d != null) {
            d.m28540i().m12355a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f17601b = null;
            this.f17602c = null;
        }
        this.f17600a.mo3171q().m28568a(new bv(this));
    }
}
