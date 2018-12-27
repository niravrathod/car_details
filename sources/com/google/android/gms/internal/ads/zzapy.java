package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzaer
public class zzapy<T> implements zzapu<T> {
    /* renamed from: a */
    private final Object f16886a = new Object();
    /* renamed from: b */
    private int f16887b = 0;
    /* renamed from: c */
    private final BlockingQueue<ff> f16888c = new LinkedBlockingQueue();
    /* renamed from: d */
    private T f16889d;

    /* renamed from: a */
    public final void mo2373a(zzapx<T> zzapx, zzapv zzapv) {
        synchronized (this.f16886a) {
            if (this.f16887b == 1) {
                zzapx.mo1939a(this.f16889d);
            } else if (this.f16887b == -1) {
                zzapv.mo1940a();
            } else if (this.f16887b == 0) {
                this.f16888c.add(new ff(this, zzapx, zzapv));
            }
        }
    }

    /* renamed from: a */
    public final void mo2374a(T t) {
        synchronized (this.f16886a) {
            if (this.f16887b == 0) {
                this.f16889d = t;
                this.f16887b = 1;
                for (ff ffVar : this.f16888c) {
                    ffVar.f8051a.mo1939a(t);
                }
                this.f16888c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: a */
    public final void m21292a() {
        synchronized (this.f16886a) {
            if (this.f16887b == 0) {
                this.f16887b = -1;
                for (ff ffVar : this.f16888c) {
                    ffVar.f8052b.mo1940a();
                }
                this.f16888c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: b */
    public final int m21295b() {
        return this.f16887b;
    }
}
