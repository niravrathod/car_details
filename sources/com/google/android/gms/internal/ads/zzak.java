package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class zzak {
    /* renamed from: e */
    private static final Comparator<byte[]> f8744e = new cw();
    /* renamed from: a */
    private final List<byte[]> f8745a = new ArrayList();
    /* renamed from: b */
    private final List<byte[]> f8746b = new ArrayList(64);
    /* renamed from: c */
    private int f8747c = 0;
    /* renamed from: d */
    private final int f8748d = 4096;

    public zzak(int i) {
    }

    /* renamed from: a */
    public final synchronized byte[] m9653a(int i) {
        for (int i2 = 0; i2 < this.f8746b.size(); i2++) {
            byte[] bArr = (byte[]) this.f8746b.get(i2);
            if (bArr.length >= i) {
                this.f8747c -= bArr.length;
                this.f8746b.remove(i2);
                this.f8745a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void m9652a(byte[] r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 == 0) goto L_0x002e;
    L_0x0003:
        r0 = r3.length;	 Catch:{ all -> 0x002b }
        r1 = r2.f8748d;	 Catch:{ all -> 0x002b }
        if (r0 <= r1) goto L_0x0009;
    L_0x0008:
        goto L_0x002e;
    L_0x0009:
        r0 = r2.f8745a;	 Catch:{ all -> 0x002b }
        r0.add(r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f8746b;	 Catch:{ all -> 0x002b }
        r1 = f8744e;	 Catch:{ all -> 0x002b }
        r0 = java.util.Collections.binarySearch(r0, r3, r1);	 Catch:{ all -> 0x002b }
        if (r0 >= 0) goto L_0x001b;
    L_0x0018:
        r0 = -r0;
        r0 = r0 + -1;
    L_0x001b:
        r1 = r2.f8746b;	 Catch:{ all -> 0x002b }
        r1.add(r0, r3);	 Catch:{ all -> 0x002b }
        r0 = r2.f8747c;	 Catch:{ all -> 0x002b }
        r3 = r3.length;	 Catch:{ all -> 0x002b }
        r0 = r0 + r3;
        r2.f8747c = r0;	 Catch:{ all -> 0x002b }
        r2.m9651a();	 Catch:{ all -> 0x002b }
        monitor-exit(r2);
        return;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
    L_0x002e:
        monitor-exit(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.a(byte[]):void");
    }

    /* renamed from: a */
    private final synchronized void m9651a() {
        while (this.f8747c > this.f8748d) {
            byte[] bArr = (byte[]) this.f8745a.remove(0);
            this.f8746b.remove(bArr);
            this.f8747c -= bArr.length;
        }
    }
}
