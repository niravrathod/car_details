package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzakz {
    /* renamed from: a */
    private final Object f8863a;
    @GuardedBy("mLock")
    /* renamed from: b */
    private int f8864b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private int f8865c;
    /* renamed from: d */
    private final zzala f8866d;
    /* renamed from: e */
    private final String f8867e;

    public zzakz(String str) {
        this(zzbv.zzeo().m9729n(), str);
    }

    private zzakz(zzala zzala, String str) {
        this.f8863a = new Object();
        this.f8866d = zzala;
        this.f8867e = str;
    }

    /* renamed from: a */
    public final void m9739a(int i, int i2) {
        synchronized (this.f8863a) {
            this.f8864b = i;
            this.f8865c = i2;
            this.f8866d.m21215a(this);
        }
    }

    /* renamed from: a */
    public final String m9738a() {
        return this.f8867e;
    }

    /* renamed from: b */
    public final Bundle m9740b() {
        Bundle bundle;
        synchronized (this.f8863a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f8864b);
            bundle.putInt("pmnll", this.f8865c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                zzakz zzakz = (zzakz) obj;
                if (this.f8867e != null) {
                    return this.f8867e.equals(zzakz.f8867e);
                }
                return zzakz.f8867e == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8867e != null ? this.f8867e.hashCode() : 0;
    }
}
