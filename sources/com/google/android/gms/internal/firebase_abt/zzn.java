package com.google.android.gms.internal.firebase_abt;

public final class zzn extends zzd<zzn> {
    /* renamed from: d */
    private static volatile zzn[] f20487d;
    /* renamed from: c */
    public String f20488c;

    public zzn() {
        this.f20488c = "";
        this.a = null;
        this.b = -1;
    }

    /* renamed from: b */
    public static zzn[] m27060b() {
        if (f20487d == null) {
            synchronized (zzh.f10013b) {
                if (f20487d == null) {
                    f20487d = new zzn[0];
                }
            }
        }
        return f20487d;
    }

    /* renamed from: a */
    public final /* synthetic */ zzj mo4338a(zza zza) {
        while (true) {
            int a = zza.m11457a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20488c = zza.m11465d();
            } else if (!super.m22155a(zza, a)) {
                return this;
            }
        }
    }
}
