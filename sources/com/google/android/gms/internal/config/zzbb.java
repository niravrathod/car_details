package com.google.android.gms.internal.config;

public abstract class zzbb<M extends zzbb<M>> extends zzbh {
    /* renamed from: f */
    protected zzbd f17402f;

    /* renamed from: a */
    protected int mo2911a() {
        if (this.f17402f == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f17402f.m11403a(); i2++) {
            i += this.f17402f.m11406b(i2).m11331a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo2912a(zzaz zzaz) {
        if (this.f17402f != null) {
            for (int i = 0; i < this.f17402f.m11403a(); i++) {
                this.f17402f.m11406b(i).m11333a(zzaz);
            }
        }
    }

    /* renamed from: a */
    protected final boolean m22142a(zzay zzay, int i) {
        int f = zzay.m11377f();
        if (!zzay.m11370a(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C2462b c2462b = new C2462b(i, zzay.m11371a(f, zzay.m11377f() - f));
        C2461a c2461a = null;
        if (this.f17402f == null) {
            this.f17402f = new zzbd();
        } else {
            c2461a = this.f17402f.m11404a(i2);
        }
        if (c2461a == null) {
            c2461a = new C2461a();
            this.f17402f.m11405a(i2, c2461a);
        }
        c2461a.m11332a(c2462b);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ zzbh mo2913c() {
        return (zzbb) clone();
    }

    public /* synthetic */ Object clone() {
        zzbb zzbb = (zzbb) super.mo2913c();
        zzbf.m11410a(this, zzbb);
        return zzbb;
    }
}
