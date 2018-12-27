package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabw;
import com.google.android.gms.internal.ads.zzacg;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzahu;
import com.google.android.gms.internal.ads.zzaid;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkp;
import com.google.android.gms.internal.ads.zzku;
import com.google.android.gms.internal.ads.zzlg;
import com.google.android.gms.internal.ads.zzll;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzqc;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzqt;
import com.google.android.gms.internal.ads.zzyn;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@Keep
@KeepForSdkWithMembers
@DynamiteApi
@zzaer
@RetainForClient
@ParametersAreNonnullByDefault
public class ClientApi extends zzlg {
    public zzacg createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public zzaid createRewardedVideoAdSku(IObjectWrapper iObjectWrapper, int i) {
        return null;
    }

    public zzll getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public zzku createBannerAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        zzbv.zzek();
        return new zzx(context, zzjo, str, zzyn, new zzaop(13000000, i, true, zzalo.m9827l(context)), zzv.zzc(context));
    }

    public zzku createSearchAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, int i) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        zzbv.zzek();
        return new zzbp(context, zzjo, str, new zzaop(13000000, i, true, zzalo.m9827l(context)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzku createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.internal.ads.zzjo r9, java.lang.String r10, com.google.android.gms.internal.ads.zzyn r11, int r12) {
        /*
        r7 = this;
        r8 = com.google.android.gms.dynamic.ObjectWrapper.m26020a(r8);
        r1 = r8;
        r1 = (android.content.Context) r1;
        com.google.android.gms.internal.ads.zznw.m10901a(r1);
        r5 = new com.google.android.gms.internal.ads.zzaop;
        com.google.android.gms.ads.internal.zzbv.zzek();
        r8 = com.google.android.gms.internal.ads.zzalo.m9827l(r1);
        r0 = 1;
        r2 = 13000000; // 0xc65d40 float:1.821688E-38 double:6.4228534E-317;
        r5.<init>(r2, r12, r0, r8);
        r8 = "reward_mb";
        r12 = r9.f20227a;
        r8 = r8.equals(r12);
        if (r8 != 0) goto L_0x0036;
    L_0x0024:
        r12 = com.google.android.gms.internal.ads.zznw.aB;
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r12 = r2.m10897a(r12);
        r12 = (java.lang.Boolean) r12;
        r12 = r12.booleanValue();
        if (r12 != 0) goto L_0x004c;
    L_0x0036:
        if (r8 == 0) goto L_0x004b;
    L_0x0038:
        r8 = com.google.android.gms.internal.ads.zznw.aC;
        r12 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r8 = r12.m10897a(r8);
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        if (r0 == 0) goto L_0x005d;
    L_0x004e:
        r8 = new com.google.android.gms.internal.ads.zzva;
        r9 = com.google.android.gms.ads.internal.zzv.zzc(r1);
        r0 = r8;
        r2 = r10;
        r3 = r11;
        r4 = r5;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        return r8;
    L_0x005d:
        r8 = new com.google.android.gms.ads.internal.zzal;
        r6 = com.google.android.gms.ads.internal.zzv.zzc(r1);
        r0 = r8;
        r2 = r9;
        r3 = r10;
        r4 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzjo, java.lang.String, com.google.android.gms.internal.ads.zzyn, int):com.google.android.gms.internal.ads.zzku");
    }

    public zzkp createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzyn zzyn, int i) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        zzbv.zzek();
        return new zzak(context, str, zzyn, new zzaop(13000000, i, true, zzalo.m9827l(context)), zzv.zzc(context));
    }

    public zzll getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        zzbv.zzek();
        return zzay.zza(context, new zzaop(13000000, i, true, zzalo.m9827l(context)));
    }

    public zzqo createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzqa((FrameLayout) ObjectWrapper.m26020a(iObjectWrapper), (FrameLayout) ObjectWrapper.m26020a(iObjectWrapper2));
    }

    public zzqt createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzqc((View) ObjectWrapper.m26020a(iObjectWrapper), (HashMap) ObjectWrapper.m26020a(iObjectWrapper2), (HashMap) ObjectWrapper.m26020a(iObjectWrapper3));
    }

    public zzaid createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzyn zzyn, int i) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        zzbv.zzek();
        return new zzahu(context, zzv.zzc(context), zzyn, new zzaop(13000000, i, true, zzalo.m9827l(context)));
    }

    public zzabw createAdOverlay(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.m26020a(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        switch (zzc.zzccf) {
            case 1:
                return new zzq(activity);
            case 2:
                return new zzx(activity);
            case 3:
                return new zzy(activity);
            case 4:
                return new zzs(activity, zzc);
            default:
                return new zzr(activity);
        }
    }
}
