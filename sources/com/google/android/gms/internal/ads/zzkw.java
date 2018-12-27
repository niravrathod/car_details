package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzkw extends zzem implements zzku {
    zzkw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final IObjectWrapper zzbj() {
        Parcel a = m10545a(1, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void destroy() {
        m10546b(2, t_());
    }

    public final boolean isReady() {
        Parcel a = m10545a(3, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    public final boolean zzb(zzjk zzjk) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjk);
        zzjk = m10545a(4, t_);
        boolean a = zzeo.m10552a(zzjk);
        zzjk.recycle();
        return a;
    }

    public final void pause() {
        m10546b(5, t_());
    }

    public final void resume() {
        m10546b(6, t_());
    }

    public final void zza(zzkj zzkj) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzkj);
        m10546b(7, t_);
    }

    public final void zza(zzlc zzlc) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzlc);
        m10546b(8, t_);
    }

    public final void showInterstitial() {
        m10546b(9, t_());
    }

    public final void stopLoading() {
        m10546b(10, t_());
    }

    public final void zzbm() {
        m10546b(11, t_());
    }

    public final zzjo zzbk() {
        Parcel a = m10545a(12, t_());
        zzjo zzjo = (zzjo) zzeo.m10548a(a, zzjo.CREATOR);
        a.recycle();
        return zzjo;
    }

    public final void zza(zzjo zzjo) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjo);
        m10546b(13, t_);
    }

    public final void zza(zzacd zzacd) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzacd);
        m10546b(14, t_);
    }

    public final void zza(zzacj zzacj, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzacj);
        t_.writeString(str);
        m10546b(15, t_);
    }

    public final String getMediationAdapterClassName() {
        Parcel a = m10545a(18, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(zzop zzop) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzop);
        m10546b(19, t_);
    }

    public final void zza(zzkg zzkg) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzkg);
        m10546b(20, t_);
    }

    public final void zza(zzli zzli) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzli);
        m10546b(21, t_);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }

    public final boolean isLoading() {
        Parcel a = m10545a(23, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    public final void zza(zzaii zzaii) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzaii);
        m10546b(24, t_);
    }

    public final void setUserId(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(25, t_);
    }

    public final zzly getVideoController() {
        zzly zzly;
        Parcel a = m10545a(26, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzly = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzly) {
                zzly = (zzly) queryLocalInterface;
            } else {
                zzly = new zzma(readStrongBinder);
            }
        }
        a.recycle();
        return zzly;
    }

    public final void zza(zznf zznf) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zznf);
        m10546b(29, t_);
    }

    public final void zza(zzme zzme) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzme);
        m10546b(30, t_);
    }

    public final String getAdUnitId() {
        Parcel a = m10545a(31, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzlc zzbw() {
        zzlc zzlc;
        Parcel a = m10545a(32, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzlc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzlc) {
                zzlc = (zzlc) queryLocalInterface;
            } else {
                zzlc = new zzle(readStrongBinder);
            }
        }
        a.recycle();
        return zzlc;
    }

    public final zzkj zzbx() {
        zzkj zzkj;
        Parcel a = m10545a(33, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzkj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzkj) {
                zzkj = (zzkj) queryLocalInterface;
            } else {
                zzkj = new zzkl(readStrongBinder);
            }
        }
        a.recycle();
        return zzkj;
    }

    public final void setImmersiveMode(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }

    public final String zzcj() {
        Parcel a = m10545a(35, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(zzkz zzkz) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzkz);
        m10546b(36, t_);
    }

    public final Bundle getAdMetadata() {
        Parcel a = m10545a(37, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void zzr(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(38, t_);
    }
}
