package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public final class zzgj {
    /* renamed from: a */
    private final Object f9490a = new Object();
    @GuardedBy("mActivityTrackerLock")
    /* renamed from: b */
    private qh f9491b = null;
    @GuardedBy("mActivityTrackerLock")
    /* renamed from: c */
    private boolean f9492c = false;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m10631a(android.content.Context r5) {
        /*
        r4 = this;
        r0 = r4.f9490a;
        monitor-enter(r0);
        r1 = r4.f9492c;	 Catch:{ all -> 0x003c }
        if (r1 != 0) goto L_0x003a;
    L_0x0007:
        r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich();	 Catch:{ all -> 0x003c }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        return;
    L_0x000f:
        r1 = 0;
        r2 = r5.getApplicationContext();	 Catch:{ all -> 0x003c }
        if (r2 != 0) goto L_0x0017;
    L_0x0016:
        r2 = r5;
    L_0x0017:
        r3 = r2 instanceof android.app.Application;	 Catch:{ all -> 0x003c }
        if (r3 == 0) goto L_0x001e;
    L_0x001b:
        r1 = r2;
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x003c }
    L_0x001e:
        if (r1 != 0) goto L_0x0027;
    L_0x0020:
        r5 = "Can not cast Context to Application";
        com.google.android.gms.internal.ads.zzaok.m10007e(r5);	 Catch:{ all -> 0x003c }
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        return;
    L_0x0027:
        r2 = r4.f9491b;	 Catch:{ all -> 0x003c }
        if (r2 != 0) goto L_0x0032;
    L_0x002b:
        r2 = new com.google.android.gms.internal.ads.qh;	 Catch:{ all -> 0x003c }
        r2.<init>();	 Catch:{ all -> 0x003c }
        r4.f9491b = r2;	 Catch:{ all -> 0x003c }
    L_0x0032:
        r2 = r4.f9491b;	 Catch:{ all -> 0x003c }
        r2.m9364a(r1, r5);	 Catch:{ all -> 0x003c }
        r5 = 1;
        r4.f9492c = r5;	 Catch:{ all -> 0x003c }
    L_0x003a:
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        return;
    L_0x003c:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003c }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgj.a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m10632a(zzgm zzgm) {
        synchronized (this.f9490a) {
            if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                if (this.f9491b == null) {
                    this.f9491b = new qh();
                }
                this.f9491b.m9365a(zzgm);
                return;
            }
        }
    }

    /* renamed from: a */
    public final Activity m10630a() {
        synchronized (this.f9490a) {
            if (!PlatformVersion.isAtLeastIceCreamSandwich()) {
                return null;
            } else if (this.f9491b != null) {
                Activity a = this.f9491b.m9363a();
                return a;
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public final Context m10633b() {
        synchronized (this.f9490a) {
            if (!PlatformVersion.isAtLeastIceCreamSandwich()) {
                return null;
            } else if (this.f9491b != null) {
                Context b = this.f9491b.m9366b();
                return b;
            } else {
                return null;
            }
        }
    }
}
