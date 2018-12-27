package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzrf extends NativeContentAd {
    /* renamed from: a */
    private final zzrc f20375a;
    /* renamed from: b */
    private final List<Image> f20376b = new ArrayList();
    /* renamed from: c */
    private final zzqn f20377c;
    /* renamed from: d */
    private final VideoController f20378d = new VideoController();
    /* renamed from: e */
    private final AdChoicesInfo f20379e;

    public zzrf(zzrc zzrc) {
        zzqn zzqn;
        this.f20375a = zzrc;
        zzrc = null;
        try {
            List f = this.f20375a.mo2651f();
            if (f != null) {
                for (Object next : f) {
                    zzqk zzqm;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            zzqm = queryLocalInterface instanceof zzqk ? (zzqk) queryLocalInterface : new zzqm(iBinder);
                            if (zzqm != null) {
                                this.f20376b.add(new zzqn(zzqm));
                            }
                        }
                    }
                    zzqm = null;
                    if (zzqm != null) {
                        this.f20376b.add(new zzqn(zzqm));
                    }
                }
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        try {
            zzqk j = this.f20375a.mo2655j();
            if (j != null) {
                zzqn = new zzqn(j);
                this.f20377c = zzqn;
                if (this.f20375a.mo2661p() != null) {
                    zzrc = new zzqj(this.f20375a.mo2661p());
                }
                this.f20379e = zzrc;
            }
        } catch (Throwable e2) {
            zzaok.m10002b("", e2);
        }
        zzqn = null;
        this.f20377c = zzqn;
        try {
            if (this.f20375a.mo2661p() != null) {
                zzrc = new zzqj(this.f20375a.mo2661p());
            }
        } catch (Throwable e22) {
            zzaok.m10002b("", e22);
        }
        this.f20379e = zzrc;
    }

    /* renamed from: b */
    private final IObjectWrapper m26837b() {
        try {
            return this.f20375a.mo2659n();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f20375a.mo2647a(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f20375a.mo2648b(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
            return null;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f20375a.mo2649c(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f20375a.mo2650e();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.f20376b;
    }

    public final CharSequence getBody() {
        try {
            return this.f20375a.mo2654i();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Image getLogo() {
        return this.f20377c;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f20375a.mo2656k();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.f20375a.mo2657l();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f20375a.mo2658m() != null) {
                this.f20378d.zza(this.f20375a.mo2658m());
            }
        } catch (Throwable e) {
            zzaok.m10002b("Exception occurred while getting video controller", e);
        }
        return this.f20378d;
    }

    public final Bundle getExtras() {
        try {
            return this.f20375a.mo2660o();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f20379e;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f20375a.mo2653h();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f20375a.mo2662q();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo4274a() {
        return m26837b();
    }
}
