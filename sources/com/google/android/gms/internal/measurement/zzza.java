package com.google.android.gms.internal.measurement;

public abstract class zzza<M extends zzza<M>> extends zzzg {
    /* renamed from: J */
    protected zzzc f17553J;

    /* renamed from: b */
    protected int mo3161b() {
        if (this.f17553J == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f17553J.m12184a(); i2++) {
            i += this.f17553J.m12187b(i2).m11863a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo3160a(zzyy zzyy) {
        if (this.f17553J != null) {
            for (int i = 0; i < this.f17553J.m12184a(); i++) {
                this.f17553J.m12187b(i).m11865a(zzyy);
            }
        }
    }

    /* renamed from: a */
    protected final boolean m22647a(zzyx zzyx, int i) {
        int i2 = zzyx.m12147i();
        if (!zzyx.m12137b(i)) {
            return null;
        }
        int i3 = i >>> 3;
        dz dzVar = new dz(i, zzyx.m12134a(i2, zzyx.m12147i() - i2));
        zzyx = null;
        if (this.f17553J == 0) {
            this.f17553J = new zzzc();
        } else {
            zzyx = this.f17553J.m12185a(i3);
        }
        if (zzyx == null) {
            zzyx = new dy();
            this.f17553J.m12186a(i3, zzyx);
        }
        zzyx.m11864a(dzVar);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ zzzg mo3162c() {
        return (zzza) clone();
    }

    public /* synthetic */ Object clone() {
        zzza zzza = (zzza) super.mo3162c();
        zzze.m12191a(this, zzza);
        return zzza;
    }
}
