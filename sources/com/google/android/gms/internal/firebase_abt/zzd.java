package com.google.android.gms.internal.firebase_abt;

public abstract class zzd<M extends zzd<M>> extends zzj {
    /* renamed from: a */
    protected zzf f17406a;

    /* renamed from: a */
    public final /* synthetic */ zzj mo2916a() {
        return (zzd) clone();
    }

    /* renamed from: a */
    protected final boolean m22155a(zza zza, int i) {
        int f = zza.m11467f();
        if (!zza.m11463b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C2465b c2465b = new C2465b(i, zza.m11460a(f, zza.m11467f() - f));
        C2464a c2464a = null;
        if (this.f17406a == null) {
            this.f17406a = new zzf();
        } else {
            c2464a = this.f17406a.m11475a(i2);
        }
        if (c2464a == null) {
            c2464a = new C2464a();
            this.f17406a.m11476a(i2, c2464a);
        }
        c2464a.m11452a(c2465b);
        return true;
    }

    public /* synthetic */ Object clone() {
        zzd zzd = (zzd) super.mo2916a();
        zzh.m11477a(this, zzd);
        return zzd;
    }
}
