package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzku extends IInterface {
    void destroy();

    Bundle getAdMetadata();

    String getAdUnitId();

    String getMediationAdapterClassName();

    zzly getVideoController();

    boolean isLoading();

    boolean isReady();

    void pause();

    void resume();

    void setImmersiveMode(boolean z);

    void setManualImpressionsEnabled(boolean z);

    void setUserId(String str);

    void showInterstitial();

    void stopLoading();

    void zza(zzacd zzacd);

    void zza(zzacj zzacj, String str);

    void zza(zzaii zzaii);

    void zza(zzjo zzjo);

    void zza(zzkg zzkg);

    void zza(zzkj zzkj);

    void zza(zzkz zzkz);

    void zza(zzlc zzlc);

    void zza(zzli zzli);

    void zza(zzme zzme);

    void zza(zznf zznf);

    void zza(zzop zzop);

    boolean zzb(zzjk zzjk);

    IObjectWrapper zzbj();

    zzjo zzbk();

    void zzbm();

    zzlc zzbw();

    zzkj zzbx();

    String zzcj();

    void zzr(String str);
}
