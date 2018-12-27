package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzsp extends zzrx {
    /* renamed from: a */
    private final OnPublisherAdViewLoadedListener f20384a;

    public zzsp(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f20384a = onPublisherAdViewLoadedListener;
    }

    /* renamed from: a */
    public final void mo2687a(zzku zzku, IObjectWrapper iObjectWrapper) {
        if (zzku != null) {
            if (iObjectWrapper != null) {
                PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.m26020a(iObjectWrapper));
                iObjectWrapper = null;
                try {
                    if (zzku.zzbx() instanceof zzjg) {
                        zzjg zzjg = (zzjg) zzku.zzbx();
                        publisherAdView.setAdListener(zzjg != null ? zzjg.m26611g() : null);
                    }
                } catch (Throwable e) {
                    zzaok.m10002b("", e);
                }
                try {
                    if (zzku.zzbw() instanceof zzjq) {
                        zzjq zzjq = (zzjq) zzku.zzbw();
                        if (zzjq != null) {
                            iObjectWrapper = zzjq.m26620a();
                        }
                        publisherAdView.setAppEventListener(iObjectWrapper);
                    }
                } catch (IObjectWrapper iObjectWrapper2) {
                    zzaok.m10002b("", iObjectWrapper2);
                }
                zzaoa.f8948a.post(new th(this, publisherAdView, zzku));
            }
        }
    }
}
