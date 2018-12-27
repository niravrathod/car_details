package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzqt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzvx = new WeakHashMap();
    /* renamed from: a */
    private zzqt f7632a;
    /* renamed from: b */
    private WeakReference<View> f7633b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (!(view instanceof NativeAdView)) {
            if (!(view instanceof UnifiedNativeAdView)) {
                if (zzvx.get(view) != null) {
                    zzaok.m10003c("The provided containerView is already in use with another NativeAdViewHolder.");
                    return;
                }
                zzvx.put(view, this);
                this.f7633b = new WeakReference(view);
                this.f7632a = zzkd.m10710b().m10708a(view, m8762a((Map) map), m8762a((Map) map2));
                return;
            }
        }
        zzaok.m10003c("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
    }

    /* renamed from: a */
    private static HashMap<String, View> m8762a(Map<String, View> map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setNativeAd(NativeAd nativeAd) {
        m8763a((IObjectWrapper) nativeAd.mo4274a());
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        m8763a((IObjectWrapper) unifiedNativeAd.mo2718a());
    }

    /* renamed from: a */
    private final void m8763a(IObjectWrapper iObjectWrapper) {
        Object obj = this.f7633b != null ? (View) this.f7633b.get() : null;
        if (obj == null) {
            zzaok.m10007e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzvx.containsKey(obj)) {
            zzvx.put(obj, this);
        }
        if (this.f7632a != null) {
            try {
                this.f7632a.mo2626a(iObjectWrapper);
            } catch (IObjectWrapper iObjectWrapper2) {
                zzaok.m10002b("Unable to call setNativeAd on delegate", iObjectWrapper2);
            }
        }
    }

    public final void unregisterNativeAd() {
        if (this.f7632a != null) {
            try {
                this.f7632a.mo2625a();
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        Object obj = this.f7633b != null ? (View) this.f7633b.get() : null;
        if (obj != null) {
            zzvx.remove(obj);
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f7632a.mo2627b(ObjectWrapper.m26019a((Object) view));
        } catch (View view2) {
            zzaok.m10002b("Unable to call setClickConfirmingView on delegate", view2);
        }
    }
}
