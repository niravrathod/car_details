package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzva extends zzkv {
    /* renamed from: a */
    private final String f20399a;
    /* renamed from: b */
    private boolean f20400b;
    /* renamed from: c */
    private final zztr f20401c;
    /* renamed from: d */
    private zzal f20402d;
    /* renamed from: e */
    private final uo f20403e;

    @VisibleForTesting
    private zzva(String str, zztr zztr) {
        this.f20399a = str;
        this.f20401c = zztr;
        this.f20403e = new uo();
        zzbv.zzey().m11131a(zztr);
    }

    public final void setUserId(String str) {
    }

    public final void zzr(String str) {
    }

    public zzva(Context context, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        this(str, new zztr(context, zzyn, zzaop, zzv));
    }

    public final IObjectWrapper zzbj() {
        return this.f20402d != null ? this.f20402d.zzbj() : null;
    }

    public final void destroy() {
        if (this.f20402d != null) {
            this.f20402d.destroy();
        }
    }

    public final boolean isReady() {
        return this.f20402d != null && this.f20402d.isReady();
    }

    public final boolean zzb(zzjk zzjk) {
        if (!zzuv.m11119a(zzjk).contains("gw")) {
            m26850a();
        }
        if (zzuv.m11119a(zzjk).contains("_skipMediation")) {
            m26850a();
        }
        if (zzjk.f20215j != null) {
            m26850a();
        }
        if (this.f20402d != null) {
            return this.f20402d.zzb(zzjk);
        }
        zzuv zzey = zzbv.zzey();
        if (zzuv.m11119a(zzjk).contains("_ad")) {
            zzey.m11132b(zzjk, this.f20399a);
        }
        ut a = zzey.m11129a(zzjk, this.f20399a);
        if (a != null) {
            if (a.f8418e == null) {
                a.m9398a();
                zzuz.m11133a().m11138e();
            } else {
                zzuz.m11133a().m11137d();
            }
            this.f20402d = a.f8414a;
            a.f8416c.m9382a(this.f20403e);
            this.f20403e.m9384a(this.f20402d);
            return a.f8419f;
        }
        m26850a();
        zzuz.m11133a().m11138e();
        return this.f20402d.zzb(zzjk);
    }

    public final void pause() {
        if (this.f20402d != null) {
            this.f20402d.pause();
        }
    }

    public final void resume() {
        if (this.f20402d != null) {
            this.f20402d.resume();
        }
    }

    public final void zza(zzkj zzkj) {
        this.f20403e.f8401a = zzkj;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final void zza(zzaii zzaii) {
        this.f20403e.f8406f = zzaii;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final void zza(zzlc zzlc) {
        this.f20403e.f8403c = zzlc;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final void zza(zzkz zzkz) {
        this.f20403e.f8402b = zzkz;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final Bundle getAdMetadata() {
        if (this.f20402d != null) {
            return this.f20402d.getAdMetadata();
        }
        return new Bundle();
    }

    public final void showInterstitial() {
        if (this.f20402d != null) {
            this.f20402d.setImmersiveMode(this.f20400b);
            this.f20402d.showInterstitial();
            return;
        }
        zzaok.m10007e("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        if (this.f20402d != null) {
            this.f20402d.stopLoading();
        }
    }

    public final void zzbm() {
        if (this.f20402d != null) {
            this.f20402d.zzbm();
        } else {
            zzaok.m10007e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final zzjo zzbk() {
        return this.f20402d != null ? this.f20402d.zzbk() : null;
    }

    public final void zza(zzjo zzjo) {
        if (this.f20402d != null) {
            this.f20402d.zza(zzjo);
        }
    }

    public final void zza(zzacd zzacd) {
        zzaok.m10007e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzacj zzacj, String str) {
        zzaok.m10007e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final String getMediationAdapterClassName() {
        return this.f20402d != null ? this.f20402d.getMediationAdapterClassName() : null;
    }

    public final String zzcj() {
        return this.f20402d != null ? this.f20402d.zzcj() : null;
    }

    public final void zza(zzop zzop) {
        this.f20403e.f8404d = zzop;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final void zza(zzkg zzkg) {
        this.f20403e.f8405e = zzkg;
        if (this.f20402d != null) {
            this.f20403e.m9384a(this.f20402d);
        }
    }

    public final void zza(zzli zzli) {
        m26850a();
        if (this.f20402d != null) {
            this.f20402d.zza(zzli);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        m26850a();
        if (this.f20402d != null) {
            this.f20402d.setManualImpressionsEnabled(z);
        }
    }

    public final boolean isLoading() {
        return this.f20402d != null && this.f20402d.isLoading();
    }

    public final zzly getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final zzlc zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzkj zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(zznf zznf) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void zza(zzme zzme) {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        this.f20400b = z;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m26850a() {
        if (this.f20402d == null) {
            this.f20402d = this.f20401c.m11116a(this.f20399a);
            this.f20403e.m9384a(this.f20402d);
        }
    }
}
