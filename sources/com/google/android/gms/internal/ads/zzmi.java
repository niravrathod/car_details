package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

@zzaer
public final class zzmi {
    /* renamed from: a */
    private final zzym f9622a;
    /* renamed from: b */
    private final zzjn f9623b;
    /* renamed from: c */
    private final AtomicBoolean f9624c;
    /* renamed from: d */
    private final VideoController f9625d;
    @VisibleForTesting
    /* renamed from: e */
    private final zzkf f9626e;
    /* renamed from: f */
    private zzjc f9627f;
    /* renamed from: g */
    private AdListener f9628g;
    /* renamed from: h */
    private AdSize[] f9629h;
    /* renamed from: i */
    private AppEventListener f9630i;
    /* renamed from: j */
    private Correlator f9631j;
    /* renamed from: k */
    private zzku f9632k;
    /* renamed from: l */
    private OnCustomRenderedAdLoadedListener f9633l;
    /* renamed from: m */
    private VideoOptions f9634m;
    /* renamed from: n */
    private String f9635n;
    /* renamed from: o */
    private ViewGroup f9636o;
    /* renamed from: p */
    private int f9637p;
    /* renamed from: q */
    private boolean f9638q;

    /* renamed from: a */
    private static boolean m10808a(int i) {
        return i == 1;
    }

    public zzmi(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzjn.f9565a, 0);
    }

    public zzmi(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzjn.f9565a, i);
    }

    public zzmi(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzjn.f9565a, 0);
    }

    public zzmi(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzjn.f9565a, i);
    }

    @VisibleForTesting
    private zzmi(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzjn zzjn, zzku zzku, int i) {
        this.f9622a = new zzym();
        this.f9625d = new VideoController();
        this.f9626e = new rx(this);
        this.f9636o = viewGroup;
        this.f9623b = zzjn;
        this.f9632k = null;
        this.f9624c = new AtomicBoolean(false);
        this.f9637p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                i = new zzjr(context, attributeSet);
                this.f9629h = i.m10695a(z);
                this.f9635n = i.m10694a();
                if (viewGroup.isInEditMode() != null) {
                    attributeSet = zzkd.m10709a();
                    AdSize adSize = this.f9629h[0];
                    int i2 = this.f9637p;
                    zzjo zzjo = new zzjo(context, adSize);
                    zzjo.f20236j = m10808a(i2);
                    attributeSet.m9974a(viewGroup, zzjo, "Ads by Google");
                }
            } catch (AttributeSet attributeSet2) {
                zzkd.m10709a().m9975a(viewGroup, new zzjo(context, AdSize.BANNER), attributeSet2.getMessage(), attributeSet2.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzmi(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzjn zzjn, int i) {
        this(viewGroup, attributeSet, z, zzjn, null, i);
    }

    /* renamed from: a */
    public final void m10809a() {
        try {
            if (this.f9632k != null) {
                this.f9632k.destroy();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final AdListener m10821b() {
        return this.f9628g;
    }

    /* renamed from: c */
    public final AdSize m10823c() {
        try {
            if (this.f9632k != null) {
                zzjo zzbk = this.f9632k.zzbk();
                if (zzbk != null) {
                    return zzbk.m26619b();
                }
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        return this.f9629h != null ? this.f9629h[0] : null;
    }

    /* renamed from: d */
    public final AdSize[] m10824d() {
        return this.f9629h;
    }

    /* renamed from: e */
    public final String m10825e() {
        if (this.f9635n == null && this.f9632k != null) {
            try {
                this.f9635n = this.f9632k.getAdUnitId();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
        return this.f9635n;
    }

    /* renamed from: f */
    public final AppEventListener m10826f() {
        return this.f9630i;
    }

    /* renamed from: g */
    public final OnCustomRenderedAdLoadedListener m10827g() {
        return this.f9633l;
    }

    /* renamed from: a */
    public final void m10816a(zzmg zzmg) {
        try {
            if (this.f9632k == null) {
                if ((this.f9629h == null || this.f9635n == null) && this.f9632k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                zzku zzku;
                Context context = this.f9636o.getContext();
                zzjo a = m10807a(context, this.f9629h, this.f9637p);
                if ("search_v2".equals(a.f20227a)) {
                    zzku = (zzku) new ro(zzkd.m10710b(), context, a, this.f9635n).m9372a(context, false);
                } else {
                    zzku = (zzku) new rm(zzkd.m10710b(), context, a, this.f9635n, this.f9622a).m9372a(context, false);
                }
                this.f9632k = zzku;
                this.f9632k.zza(new zzjg(this.f9626e));
                if (this.f9627f != null) {
                    this.f9632k.zza(new zzjd(this.f9627f));
                }
                if (this.f9630i != null) {
                    this.f9632k.zza(new zzjq(this.f9630i));
                }
                if (this.f9633l != null) {
                    this.f9632k.zza(new zzos(this.f9633l));
                }
                if (this.f9631j != null) {
                    this.f9632k.zza(this.f9631j.zzaz());
                }
                if (this.f9634m != null) {
                    this.f9632k.zza(new zznf(this.f9634m));
                }
                this.f9632k.setManualImpressionsEnabled(this.f9638q);
                try {
                    IObjectWrapper zzbj = this.f9632k.zzbj();
                    if (zzbj != null) {
                        this.f9636o.addView((View) ObjectWrapper.m26020a(zzbj));
                    }
                } catch (Throwable e) {
                    zzaok.m10006d("#007 Could not call remote method.", e);
                }
            }
            if (this.f9632k.zzb(zzjn.m10692a(this.f9636o.getContext(), zzmg))) {
                this.f9622a.m26910a(zzmg.m10766j());
            }
        } catch (zzmg zzmg2) {
            zzaok.m10006d("#007 Could not call remote method.", zzmg2);
        }
    }

    /* renamed from: h */
    public final void m10828h() {
        try {
            if (this.f9632k != null) {
                this.f9632k.pause();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void m10829i() {
        if (!this.f9624c.getAndSet(true)) {
            try {
                if (this.f9632k != null) {
                    this.f9632k.zzbm();
                }
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: j */
    public final void m10830j() {
        try {
            if (this.f9632k != null) {
                this.f9632k.resume();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void m10810a(AdListener adListener) {
        this.f9628g = adListener;
        this.f9626e.m21744a(adListener);
    }

    /* renamed from: a */
    public final void m10815a(zzjc zzjc) {
        try {
            this.f9627f = zzjc;
            if (this.f9632k != null) {
                this.f9632k.zza(zzjc != null ? new zzjd(zzjc) : null);
            }
        } catch (zzjc zzjc2) {
            zzaok.m10006d("#007 Could not call remote method.", zzjc2);
        }
    }

    /* renamed from: a */
    public final void m10819a(AdSize... adSizeArr) {
        if (this.f9629h == null) {
            m10822b(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: b */
    public final void m10822b(AdSize... adSizeArr) {
        this.f9629h = adSizeArr;
        try {
            if (this.f9632k != null) {
                this.f9632k.zza(m10807a(this.f9636o.getContext(), this.f9629h, this.f9637p));
            }
        } catch (AdSize[] adSizeArr2) {
            zzaok.m10006d("#007 Could not call remote method.", adSizeArr2);
        }
        this.f9636o.requestLayout();
    }

    /* renamed from: a */
    public final void m10817a(String str) {
        if (this.f9635n == null) {
            this.f9635n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void m10813a(AppEventListener appEventListener) {
        try {
            this.f9630i = appEventListener;
            if (this.f9632k != null) {
                this.f9632k.zza(appEventListener != null ? new zzjq(appEventListener) : null);
            }
        } catch (AppEventListener appEventListener2) {
            zzaok.m10006d("#007 Could not call remote method.", appEventListener2);
        }
    }

    /* renamed from: a */
    public final void m10814a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f9633l = onCustomRenderedAdLoadedListener;
        try {
            if (this.f9632k != null) {
                this.f9632k.zza(onCustomRenderedAdLoadedListener != null ? new zzos(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener2) {
            zzaok.m10006d("#007 Could not call remote method.", onCustomRenderedAdLoadedListener2);
        }
    }

    /* renamed from: a */
    public final void m10818a(boolean z) {
        this.f9638q = z;
        try {
            if (this.f9632k) {
                this.f9632k.setManualImpressionsEnabled(this.f9638q);
            }
        } catch (boolean z2) {
            zzaok.m10006d("#007 Could not call remote method.", z2);
        }
    }

    /* renamed from: a */
    public final void m10811a(Correlator correlator) {
        this.f9631j = correlator;
        try {
            if (this.f9632k != null) {
                this.f9632k.zza(this.f9631j == null ? null : this.f9631j.zzaz());
            }
        } catch (Correlator correlator2) {
            zzaok.m10006d("#007 Could not call remote method.", correlator2);
        }
    }

    /* renamed from: k */
    public final String m10831k() {
        try {
            if (this.f9632k != null) {
                return this.f9632k.zzcj();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m10832l() {
        try {
            if (this.f9632k != null) {
                return this.f9632k.isLoading();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        return false;
    }

    /* renamed from: m */
    public final VideoController m10833m() {
        return this.f9625d;
    }

    /* renamed from: n */
    public final zzly m10834n() {
        if (this.f9632k == null) {
            return null;
        }
        try {
            return this.f9632k.getVideoController();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void m10812a(VideoOptions videoOptions) {
        this.f9634m = videoOptions;
        try {
            if (this.f9632k != null) {
                zznf zznf;
                zzku zzku = this.f9632k;
                if (videoOptions == null) {
                    zznf = null;
                } else {
                    zznf = new zznf(videoOptions);
                }
                zzku.zza(zznf);
            }
        } catch (VideoOptions videoOptions2) {
            zzaok.m10006d("#007 Could not call remote method.", videoOptions2);
        }
    }

    /* renamed from: o */
    public final VideoOptions m10835o() {
        return this.f9634m;
    }

    /* renamed from: a */
    public final boolean m10820a(zzku zzku) {
        if (zzku == null) {
            return false;
        }
        try {
            IObjectWrapper zzbj = zzku.zzbj();
            if (zzbj == null || ((View) ObjectWrapper.m26020a(zzbj)).getParent() != null) {
                return false;
            }
            this.f9636o.addView((View) ObjectWrapper.m26020a(zzbj));
            this.f9632k = zzku;
            return true;
        } catch (zzku zzku2) {
            zzaok.m10006d("#007 Could not call remote method.", zzku2);
            return false;
        }
    }

    /* renamed from: a */
    private static zzjo m10807a(Context context, AdSize[] adSizeArr, int i) {
        zzjo zzjo = new zzjo(context, adSizeArr);
        zzjo.f20236j = m10808a(i);
        return zzjo;
    }
}
