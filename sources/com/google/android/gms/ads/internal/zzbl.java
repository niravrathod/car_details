package com.google.android.gms.ads.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzjk;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzbl {
    /* renamed from: a */
    private final zzbn f7745a;
    /* renamed from: b */
    private final Runnable f7746b;
    /* renamed from: c */
    private zzjk f7747c;
    /* renamed from: d */
    private boolean f7748d;
    /* renamed from: e */
    private boolean f7749e;
    /* renamed from: f */
    private long f7750f;

    public zzbl(zza zza) {
        this(zza, new zzbn(zzalo.f8872a));
    }

    @VisibleForTesting
    private zzbl(zza zza, zzbn zzbn) {
        this.f7748d = false;
        this.f7749e = false;
        this.f7750f = 0;
        this.f7745a = zzbn;
        this.f7746b = new C2422z(this, new WeakReference(zza));
    }

    public final void zzf(zzjk zzjk) {
        this.f7747c = zzjk;
    }

    public final void cancel() {
        this.f7748d = false;
        this.f7745a.removeCallbacks(this.f7746b);
    }

    public final void pause() {
        this.f7749e = true;
        if (this.f7748d) {
            this.f7745a.removeCallbacks(this.f7746b);
        }
    }

    public final void resume() {
        this.f7749e = false;
        if (this.f7748d) {
            this.f7748d = false;
            zza(this.f7747c, this.f7750f);
        }
    }

    public final void zzdz() {
        this.f7749e = false;
        this.f7748d = false;
        if (!(this.f7747c == null || this.f7747c.f20208c == null)) {
            this.f7747c.f20208c.remove("_ad");
        }
        zza(this.f7747c, 0);
    }

    public final boolean zzea() {
        return this.f7748d;
    }

    public final void zzg(zzjk zzjk) {
        zza(zzjk, 60000);
    }

    public final void zza(zzjk zzjk, long j) {
        if (this.f7748d) {
            zzaok.m10007e("An ad refresh is already scheduled.");
            return;
        }
        this.f7747c = zzjk;
        this.f7748d = true;
        this.f7750f = j;
        if (this.f7749e == null) {
            StringBuilder stringBuilder = new StringBuilder(65);
            stringBuilder.append("Scheduling ad refresh ");
            stringBuilder.append(j);
            stringBuilder.append(" milliseconds from now.");
            zzaok.m10005d(stringBuilder.toString());
            this.f7745a.postDelayed(this.f7746b, j);
        }
    }
}
