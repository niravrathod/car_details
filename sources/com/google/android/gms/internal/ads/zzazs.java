package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zzb;
import com.google.android.gms.internal.ads.zzbdd.zze;
import java.util.List;

public final class zzazs extends zzbdd<zzazs, zza> implements zzben {
    private static volatile zzbew<zzazs> zzaky;
    private static final zzazs zzdqg = new zzazs();
    private int zzamm;
    private String zzdqe = "";
    private zzbdk<zzazc> zzdqf = zzbdd.m28353n();

    public static final class zza extends com.google.android.gms.internal.ads.zzbdd.zza<zzazs, zza> implements zzben {
        private zza() {
            super(zzazs.zzdqg);
        }

        /* renamed from: a */
        public final zza m29269a(String str) {
            m28335b();
            ((zzazs) this.a).m29273a(str);
            return this;
        }

        /* renamed from: a */
        public final zza m29268a(zzazc zzazc) {
            m28335b();
            ((zzazs) this.a).m29270a(zzazc);
            return this;
        }
    }

    private zzazs() {
    }

    /* renamed from: a */
    private final void m29273a(String str) {
        if (str != null) {
            this.zzdqe = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public final List<zzazc> m29277a() {
        return this.zzdqf;
    }

    /* renamed from: a */
    private final void m29270a(zzazc zzazc) {
        if (zzazc != null) {
            if (!this.zzdqf.mo1969a()) {
                zzbdk zzbdk = this.zzdqf;
                int size = zzbdk.size();
                this.zzdqf = zzbdk.mo4159a(size == 0 ? 10 : size << 1);
            }
            this.zzdqf.add(zzazc);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static zza m29274b() {
        return (zza) ((com.google.android.gms.internal.ads.zzbdd.zza) zzdqg.mo4959a(zze.f9170e, null, null));
    }

    /* renamed from: a */
    protected final Object mo4959a(int i, Object obj, Object obj2) {
        switch (js.f8196a[i - 1]) {
            case 1:
                return new zzazs();
            case 2:
                return new zza();
            case 3:
                i = new Object[]{"zzamm", "zzdqe", "zzdqf", zzazc.class};
                return zzbdd.m28347a((zzbel) zzdqg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", (Object[]) i);
            case 4:
                return zzdqg;
            case 5:
                i = zzaky;
                if (i == 0) {
                    synchronized (zzazs.class) {
                        i = zzaky;
                        if (i == 0) {
                            i = new zzb(zzdqg);
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
        zzbdd.m28349a(zzazs.class, zzdqg);
    }
}
