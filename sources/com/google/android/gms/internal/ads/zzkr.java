package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class zzkr extends zzem implements zzkp {
    zzkr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final zzkm zzdi() {
        zzkm zzkm;
        Parcel a = m10545a(1, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzkm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzkm) {
                zzkm = (zzkm) queryLocalInterface;
            } else {
                zzkm = new zzko(readStrongBinder);
            }
        }
        a.recycle();
        return zzkm;
    }

    public final void zzb(zzkj zzkj) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzkj);
        m10546b(2, t_);
    }

    public final void zza(zzrk zzrk) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrk);
        m10546b(3, t_);
    }

    public final void zza(zzrn zzrn) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrn);
        m10546b(4, t_);
    }

    public final void zza(String str, zzrt zzrt, zzrq zzrq) {
        Parcel t_ = t_();
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzrt);
        zzeo.m10549a(t_, (IInterface) zzrq);
        m10546b(5, t_);
    }

    public final void zza(zzpy zzpy) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzpy);
        m10546b(6, t_);
    }

    public final void zzb(zzli zzli) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzli);
        m10546b(7, t_);
    }

    public final void zza(zzrw zzrw, zzjo zzjo) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrw);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        m10546b(8, t_);
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) publisherAdViewOptions);
        m10546b(9, t_);
    }

    public final void zza(zzrz zzrz) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrz);
        m10546b(10, t_);
    }

    public final void zza(zzti zzti) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzti);
        m10546b(13, t_);
    }

    public final void zza(zzto zzto) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzto);
        m10546b(14, t_);
    }
}
