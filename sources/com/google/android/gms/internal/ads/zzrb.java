package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzrb extends NativeAppInstallAd {
    /* renamed from: a */
    private final zzqy f20370a;
    /* renamed from: b */
    private final List<Image> f20371b = new ArrayList();
    /* renamed from: c */
    private final zzqn f20372c;
    /* renamed from: d */
    private final VideoController f20373d = new VideoController();
    /* renamed from: e */
    private final AdChoicesInfo f20374e;

    public zzrb(zzqy zzqy) {
        zzqn zzqn;
        this.f20370a = zzqy;
        zzqy = null;
        try {
            List f = this.f20370a.mo2633f();
            if (f != null) {
                for (Object next : f) {
                    zzqk zzqm;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            zzqm = queryLocalInterface instanceof zzqk ? (zzqk) queryLocalInterface : new zzqm(iBinder);
                            if (zzqm != null) {
                                this.f20371b.add(new zzqn(zzqm));
                            }
                        }
                    }
                    zzqm = null;
                    if (zzqm != null) {
                        this.f20371b.add(new zzqn(zzqm));
                    }
                }
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        try {
            zzqk h = this.f20370a.mo2635h();
            if (h != null) {
                zzqn = new zzqn(h);
                this.f20372c = zzqn;
                if (this.f20370a.mo2645r() != null) {
                    zzqy = new zzqj(this.f20370a.mo2645r());
                }
                this.f20374e = zzqy;
            }
        } catch (Throwable e2) {
            zzaok.m10002b("", e2);
        }
        zzqn = null;
        this.f20372c = zzqn;
        try {
            if (this.f20370a.mo2645r() != null) {
                zzqy = new zzqj(this.f20370a.mo2645r());
            }
        } catch (Throwable e22) {
            zzaok.m10002b("", e22);
        }
        this.f20374e = zzqy;
    }

    /* renamed from: b */
    private final IObjectWrapper m26835b() {
        try {
            return this.f20370a.mo2641n();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f20370a.mo2629a(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f20370a.mo2630b(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
            return null;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f20370a.mo2631c(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f20370a.mo2632e();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.f20371b;
    }

    public final CharSequence getBody() {
        try {
            return this.f20370a.mo2634g();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Image getIcon() {
        return this.f20372c;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f20370a.mo2636i();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double j = this.f20370a.mo2637j();
            if (j == -1.0d) {
                return null;
            }
            return Double.valueOf(j);
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.f20370a.mo2638k();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.f20370a.mo2639l();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f20370a.mo2640m() != null) {
                this.f20373d.zza(this.f20370a.mo2640m());
            }
        } catch (Throwable e) {
            zzaok.m10002b("Exception occurred while getting video controller", e);
        }
        return this.f20373d;
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f20374e;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.f20370a.mo2644q();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f20370a.mo2642o();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f20370a.mo2646s();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo4274a() {
        return m26835b();
    }
}
