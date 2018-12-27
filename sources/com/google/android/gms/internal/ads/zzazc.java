package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;

public final class zzazc extends zzbdd<zzazc, zza> implements zzben {
    private static volatile zzbew<zzazc> zzaky;
    private static final zzazc zzdpd = new zzazc();
    private String zzdog = "";
    private String zzdoz = "";
    private int zzdpa;
    private boolean zzdpb;
    private String zzdpc = "";

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazc, zza> implements zzben {
        private zza() {
            super(zzazc.zzdpd);
        }

        /* renamed from: a */
        public final zza m29174a(String str) {
            m28335b();
            ((zzazc) this.a).m29181a(str);
            return this;
        }

        /* renamed from: b */
        public final zza m29176b(String str) {
            m28335b();
            ((zzazc) this.a).m29185b(str);
            return this;
        }

        /* renamed from: a */
        public final zza m29173a(int i) {
            m28335b();
            ((zzazc) this.a).m29183b(0);
            return this;
        }

        /* renamed from: a */
        public final zza m29175a(boolean z) {
            m28335b();
            ((zzazc) this.a).m29182a(true);
            return this;
        }

        /* renamed from: c */
        public final zza m29177c(String str) {
            m28335b();
            ((zzazc) this.a).m29187c(str);
            return this;
        }
    }

    private zzazc() {
    }

    /* renamed from: a */
    public final String m29191a() {
        return this.zzdoz;
    }

    /* renamed from: a */
    private final void m29181a(String str) {
        if (str != null) {
            this.zzdoz = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final String m29192b() {
        return this.zzdog;
    }

    /* renamed from: b */
    private final void m29185b(String str) {
        if (str != null) {
            this.zzdog = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final int m29193c() {
        return this.zzdpa;
    }

    /* renamed from: b */
    private final void m29183b(int i) {
        this.zzdpa = i;
    }

    /* renamed from: d */
    public final boolean m29194d() {
        return this.zzdpb;
    }

    /* renamed from: a */
    private final void m29182a(boolean z) {
        this.zzdpb = z;
    }

    /* renamed from: e */
    public final String m29195e() {
        return this.zzdpc;
    }

    /* renamed from: c */
    private final void m29187c(String str) {
        if (str != null) {
            this.zzdpc = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: f */
    public static zza m29188f() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdpd.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (jk.f8189a[i - 1]) {
            case 1:
                return new zzazc();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzdoz", "zzdog", "zzdpa", "zzdpb", "zzdpc"};
                return zzbdd.m28347a((zzbel) zzdpd, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", (Object[]) i);
            case 4:
                return zzdpd;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazc.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdpd);
                            zzaky = i;
                        }
                    }
                }
                return i;
            case 6:
                return Byte.valueOf((byte) 1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzbdd.m28349a(zzazc.class, zzdpd);
    }
}
