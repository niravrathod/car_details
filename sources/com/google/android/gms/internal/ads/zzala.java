package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@zzaer
public final class zzala implements zzgm {
    /* renamed from: a */
    private final Object f16841a = new Object();
    /* renamed from: b */
    private final zzali f16842b;
    /* renamed from: c */
    private final zzaky f16843c;
    @VisibleForTesting
    /* renamed from: d */
    private final zzakw f16844d;
    @VisibleForTesting
    /* renamed from: e */
    private final HashSet<zzako> f16845e = new HashSet();
    @VisibleForTesting
    /* renamed from: f */
    private final HashSet<zzakz> f16846f = new HashSet();

    public zzala(String str, zzali zzali) {
        this.f16844d = new zzakw(str, zzali);
        this.f16842b = zzali;
        this.f16843c = new zzaky();
    }

    /* renamed from: a */
    public final void m21215a(zzakz zzakz) {
        synchronized (this.f16841a) {
            this.f16846f.add(zzakz);
        }
    }

    /* renamed from: a */
    public final void m21214a(zzako zzako) {
        synchronized (this.f16841a) {
            this.f16845e.add(zzako);
        }
    }

    /* renamed from: a */
    public final void m21217a(HashSet<zzako> hashSet) {
        synchronized (this.f16841a) {
            this.f16845e.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final Bundle m21211a(Context context, zzakx zzakx) {
        HashSet hashSet = new HashSet();
        synchronized (this.f16841a) {
            hashSet.addAll(this.f16845e);
            this.f16845e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f16844d.m9732a(context, this.f16843c.m9737b()));
        context = new Bundle();
        Iterator it = this.f16846f.iterator();
        while (it.hasNext()) {
            zzakz zzakz = (zzakz) it.next();
            context.putBundle(zzakz.m9738a(), zzakz.m9740b());
        }
        bundle.putBundle("slots", context);
        context = new ArrayList();
        it = hashSet.iterator();
        while (it.hasNext()) {
            context.add(((zzako) it.next()).m9699d());
        }
        bundle.putParcelableArrayList("ads", context);
        zzakx.zza(hashSet);
        return bundle;
    }

    /* renamed from: a */
    public final void mo2165a(boolean z) {
        long currentTimeMillis = zzbv.zzer().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.f16842b.mo2357i() > ((Long) zzkd.m10713e().m10897a(zznw.au)).longValue()) {
                this.f16844d.f8851a = -1;
                return;
            }
            this.f16844d.f8851a = this.f16842b.mo2358j();
            return;
        }
        this.f16842b.mo2335a(currentTimeMillis);
        this.f16842b.mo2340b(this.f16844d.f8851a);
    }

    /* renamed from: a */
    public final void m21213a() {
        synchronized (this.f16841a) {
            this.f16844d.m9733a();
        }
    }

    /* renamed from: b */
    public final void m21219b() {
        synchronized (this.f16841a) {
            this.f16844d.m9735b();
        }
    }

    /* renamed from: a */
    public final void m21216a(zzjk zzjk, long j) {
        synchronized (this.f16841a) {
            this.f16844d.m9734a(zzjk, j);
        }
    }

    /* renamed from: a */
    public final zzako m21212a(Clock clock, String str) {
        return new zzako(clock, this, this.f16843c.m9736a(), str);
    }
}
