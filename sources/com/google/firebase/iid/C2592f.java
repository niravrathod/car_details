package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.firebase_messaging.zza;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.f */
final class C2592f implements ServiceConnection {
    @GuardedBy("this")
    /* renamed from: a */
    int f11026a;
    /* renamed from: b */
    final Messenger f11027b;
    /* renamed from: c */
    C2597k f11028c;
    @GuardedBy("this")
    /* renamed from: d */
    final Queue<C2598m<?>> f11029d;
    @GuardedBy("this")
    /* renamed from: e */
    final SparseArray<C2598m<?>> f11030e;
    /* renamed from: f */
    final /* synthetic */ C2590d f11031f;

    private C2592f(C2590d c2590d) {
        this.f11031f = c2590d;
        this.f11026a = null;
        this.f11027b = new Messenger(new zza(Looper.getMainLooper(), new C2593g(this)));
        this.f11029d = new ArrayDeque();
        this.f11030e = new SparseArray();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final synchronized boolean m12747a(com.google.firebase.iid.C2598m r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f11026a;	 Catch:{ all -> 0x008e }
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 0: goto L_0x001e;
            case 1: goto L_0x0017;
            case 2: goto L_0x000d;
            case 3: goto L_0x000b;
            case 4: goto L_0x000b;
            default: goto L_0x0008;
        };	 Catch:{ all -> 0x008e }
    L_0x0008:
        r6 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x008e }
        goto L_0x0075;
    L_0x000b:
        monitor-exit(r5);
        return r1;
    L_0x000d:
        r0 = r5.f11029d;	 Catch:{ all -> 0x008e }
        r0.add(r6);	 Catch:{ all -> 0x008e }
        r5.m12742c();	 Catch:{ all -> 0x008e }
        monitor-exit(r5);
        return r2;
    L_0x0017:
        r0 = r5.f11029d;	 Catch:{ all -> 0x008e }
        r0.add(r6);	 Catch:{ all -> 0x008e }
        monitor-exit(r5);
        return r2;
    L_0x001e:
        r0 = r5.f11029d;	 Catch:{ all -> 0x008e }
        r0.add(r6);	 Catch:{ all -> 0x008e }
        r6 = r5.f11026a;	 Catch:{ all -> 0x008e }
        if (r6 != 0) goto L_0x0029;
    L_0x0027:
        r6 = 1;
        goto L_0x002a;
    L_0x0029:
        r6 = 0;
    L_0x002a:
        com.google.android.gms.common.internal.Preconditions.checkState(r6);	 Catch:{ all -> 0x008e }
        r6 = "MessengerIpcClient";
        r0 = 2;
        r6 = android.util.Log.isLoggable(r6, r0);	 Catch:{ all -> 0x008e }
        if (r6 == 0) goto L_0x003d;
    L_0x0036:
        r6 = "MessengerIpcClient";
        r0 = "Starting bind to GmsCore";
        android.util.Log.v(r6, r0);	 Catch:{ all -> 0x008e }
    L_0x003d:
        r5.f11026a = r2;	 Catch:{ all -> 0x008e }
        r6 = new android.content.Intent;	 Catch:{ all -> 0x008e }
        r0 = "com.google.android.c2dm.intent.REGISTER";
        r6.<init>(r0);	 Catch:{ all -> 0x008e }
        r0 = "com.google.android.gms";
        r6.setPackage(r0);	 Catch:{ all -> 0x008e }
        r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ all -> 0x008e }
        r3 = r5.f11031f;	 Catch:{ all -> 0x008e }
        r3 = r3.f11022b;	 Catch:{ all -> 0x008e }
        r6 = r0.bindService(r3, r6, r5, r2);	 Catch:{ all -> 0x008e }
        if (r6 != 0) goto L_0x0061;
    L_0x005b:
        r6 = "Unable to bind to service";
        r5.m12745a(r1, r6);	 Catch:{ all -> 0x008e }
        goto L_0x0073;
    L_0x0061:
        r6 = r5.f11031f;	 Catch:{ all -> 0x008e }
        r6 = r6.f11023c;	 Catch:{ all -> 0x008e }
        r0 = new com.google.firebase.iid.h;	 Catch:{ all -> 0x008e }
        r0.<init>(r5);	 Catch:{ all -> 0x008e }
        r3 = 30;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x008e }
        r6.schedule(r0, r3, r1);	 Catch:{ all -> 0x008e }
    L_0x0073:
        monitor-exit(r5);
        return r2;
    L_0x0075:
        r0 = r5.f11026a;	 Catch:{ all -> 0x008e }
        r1 = 26;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008e }
        r2.<init>(r1);	 Catch:{ all -> 0x008e }
        r1 = "Unknown state: ";
        r2.append(r1);	 Catch:{ all -> 0x008e }
        r2.append(r0);	 Catch:{ all -> 0x008e }
        r0 = r2.toString();	 Catch:{ all -> 0x008e }
        r6.<init>(r0);	 Catch:{ all -> 0x008e }
        throw r6;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.f.a(com.google.firebase.iid.m):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final boolean m12746a(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r5.arg1;
        r1 = "MessengerIpcClient";
        r2 = 3;
        r1 = android.util.Log.isLoggable(r1, r2);
        if (r1 == 0) goto L_0x0023;
    L_0x000b:
        r1 = "MessengerIpcClient";
        r2 = 41;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Received response to request: ";
        r3.append(r2);
        r3.append(r0);
        r2 = r3.toString();
        android.util.Log.d(r1, r2);
    L_0x0023:
        monitor-enter(r4);
        r1 = r4.f11030e;	 Catch:{ all -> 0x006f }
        r1 = r1.get(r0);	 Catch:{ all -> 0x006f }
        r1 = (com.google.firebase.iid.C2598m) r1;	 Catch:{ all -> 0x006f }
        r2 = 1;
        if (r1 != 0) goto L_0x0049;
    L_0x002f:
        r5 = "MessengerIpcClient";
        r1 = 50;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006f }
        r3.<init>(r1);	 Catch:{ all -> 0x006f }
        r1 = "Received response for unknown request: ";
        r3.append(r1);	 Catch:{ all -> 0x006f }
        r3.append(r0);	 Catch:{ all -> 0x006f }
        r0 = r3.toString();	 Catch:{ all -> 0x006f }
        android.util.Log.w(r5, r0);	 Catch:{ all -> 0x006f }
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        return r2;
    L_0x0049:
        r3 = r4.f11030e;	 Catch:{ all -> 0x006f }
        r3.remove(r0);	 Catch:{ all -> 0x006f }
        r4.m12743a();	 Catch:{ all -> 0x006f }
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        r5 = r5.getData();
        r0 = "unsupported";
        r3 = 0;
        r0 = r5.getBoolean(r0, r3);
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r5 = new com.google.firebase.iid.zzal;
        r0 = 4;
        r3 = "Not supported by GmsCore";
        r5.<init>(r0, r3);
        r1.m12751a(r5);
        goto L_0x006e;
    L_0x006b:
        r1.mo3328a(r5);
    L_0x006e:
        return r2;
    L_0x006f:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x006f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.f.a(android.os.Message):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2) != null) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            m12745a(0, "Null service connection");
            return;
        }
        try {
            this.f11028c = new C2597k(iBinder);
            this.f11026a = 2;
            m12742c();
        } catch (IBinder iBinder2) {
            m12745a(0, iBinder2.getMessage());
        }
    }

    /* renamed from: c */
    private final void m12742c() {
        this.f11031f.f11023c.execute(new C2595i(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2) != null) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        m12745a(2, "Service disconnected");
    }

    /* renamed from: a */
    final synchronized void m12745a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        switch (this.f11026a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f11026a = 4;
                ConnectionTracker.getInstance().unbindService(this.f11031f.f11022b, this);
                zzal zzal = new zzal(i, str);
                for (C2598m a : this.f11029d) {
                    a.m12751a(zzal);
                }
                this.f11029d.clear();
                for (i = 0; i < this.f11030e.size(); i++) {
                    ((C2598m) this.f11030e.valueAt(i)).m12751a(zzal);
                }
                this.f11030e.clear();
                return;
            case 3:
                this.f11026a = 4;
                return;
            case 4:
                return;
            default:
                str = this.f11026a;
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("Unknown state: ");
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final synchronized void m12743a() {
        if (this.f11026a == 2 && this.f11029d.isEmpty() && this.f11030e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f11026a = 3;
            ConnectionTracker.getInstance().unbindService(this.f11031f.f11022b, this);
        }
    }

    /* renamed from: b */
    final synchronized void m12748b() {
        if (this.f11026a == 1) {
            m12745a(1, "Timed out while binding");
        }
    }

    /* renamed from: a */
    final synchronized void m12744a(int i) {
        C2598m c2598m = (C2598m) this.f11030e.get(i);
        if (c2598m != null) {
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("Timing out request: ");
            stringBuilder.append(i);
            Log.w("MessengerIpcClient", stringBuilder.toString());
            this.f11030e.remove(i);
            c2598m.m12751a(new zzal(3, "Timed out waiting for response"));
            m12743a();
        }
    }
}
