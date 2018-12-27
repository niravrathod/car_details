package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;

@zzaer
public final class zzrj implements NativeCustomTemplateAd {
    /* renamed from: a */
    private static WeakHashMap<IBinder, zzrj> f17325a = new WeakHashMap();
    /* renamed from: b */
    private final zzrg f17326b;
    /* renamed from: c */
    private final MediaView f17327c;
    /* renamed from: d */
    private final VideoController f17328d = new VideoController();

    @VisibleForTesting
    private zzrj(zzrg zzrg) {
        this.f17326b = zzrg;
        MediaView mediaView = null;
        try {
            zzrg = (Context) ObjectWrapper.m26020a(zzrg.mo2672i());
        } catch (zzrg zzrg2) {
            zzaok.m10002b("", zzrg2);
            zzrg2 = null;
        }
        if (zzrg2 != null) {
            MediaView mediaView2 = new MediaView(zzrg2);
            try {
                if (this.f17326b.mo2664a(ObjectWrapper.m26019a((Object) mediaView2)) != null) {
                    mediaView = mediaView2;
                }
            } catch (zzrg zzrg22) {
                zzaok.m10002b("", zzrg22);
            }
        }
        this.f17327c = mediaView;
    }

    /* renamed from: a */
    public static zzrj m21914a(zzrg zzrg) {
        synchronized (f17325a) {
            zzrj zzrj = (zzrj) f17325a.get(zzrg.asBinder());
            if (zzrj != null) {
                return zzrj;
            }
            zzrj = new zzrj(zzrg);
            f17325a.put(zzrg.asBinder(), zzrj);
            return zzrj;
        }
    }

    /* renamed from: a */
    public final zzrg m21915a() {
        return this.f17326b;
    }

    public final CharSequence getText(String str) {
        try {
            return this.f17326b.mo2663a(str);
        } catch (String str2) {
            zzaok.m10002b("", str2);
            return null;
        }
    }

    public final Image getImage(String str) {
        try {
            str = this.f17326b.mo2665b(str);
            if (str != null) {
                return new zzqn(str);
            }
        } catch (String str2) {
            zzaok.m10002b("", str2);
        }
        return null;
    }

    public final VideoController getVideoController() {
        try {
            zzly g = this.f17326b.mo2670g();
            if (g != null) {
                this.f17328d.zza(g);
            }
        } catch (Throwable e) {
            zzaok.m10002b("Exception occurred while getting video controller", e);
        }
        return this.f17328d;
    }

    public final MediaView getVideoMediaView() {
        return this.f17327c;
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f17326b.mo2668e();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f17326b.mo2666b();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.f17326b.mo2667c(str);
        } catch (String str2) {
            zzaok.m10002b("", str2);
        }
    }

    public final void recordImpression() {
        try {
            this.f17326b.mo2671h();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
    }

    public final void destroy() {
        try {
            this.f17326b.mo2673j();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
    }
}
