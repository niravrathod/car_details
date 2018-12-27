package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzop;
import com.google.android.gms.internal.ads.zzpb;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzpk;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzpm;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zzpo;
import com.google.android.gms.internal.ads.zzqk;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzp extends zzc implements zzpn {
    /* renamed from: k */
    private boolean f21605k;
    /* renamed from: l */
    private zzakm f21606l;
    /* renamed from: m */
    private boolean f21607m = null;

    public zzp(Context context, zzv zzv, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop) {
        super(context, zzjo, str, zzyn, zzaop, zzv);
    }

    /* renamed from: a */
    protected final boolean mo4936a(zzjk zzjk, zzakm zzakm, boolean z) {
        return false;
    }

    public final zzly getVideoController() {
        return null;
    }

    public final boolean zzb(zzjk zzjk) {
        zzjk zzjk2 = zzjk;
        Object obj = (this.e.f7811t != null && r0.e.f7811t.size() == 1 && ((Integer) r0.e.f7811t.get(0)).intValue() == 2) ? 1 : null;
        if (obj != null) {
            zzaok.m10003c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            mo4933a(0);
            return false;
        } else if (r0.e.f7810s == null) {
            return super.zzb(zzjk);
        } else {
            if (zzjk2.f20213h != r0.f21605k) {
                boolean z;
                int i = zzjk2.f20206a;
                long j = zzjk2.f20207b;
                Bundle bundle = zzjk2.f20208c;
                int i2 = zzjk2.f20209d;
                List list = zzjk2.f20210e;
                boolean z2 = zzjk2.f20211f;
                int i3 = zzjk2.f20212g;
                if (!zzjk2.f20213h) {
                    if (!r0.f21605k) {
                        z = false;
                        zzjk2 = new zzjk(i, j, bundle, i2, list, z2, i3, z, zzjk2.f20214i, zzjk2.f20215j, zzjk2.f20216k, zzjk2.f20217l, zzjk2.f20218m, zzjk2.f20219n, zzjk2.f20220o, zzjk2.f20221p, zzjk2.f20222q, zzjk2.f20223r, null, zzjk2.f20225t, zzjk2.f20226u);
                    }
                }
                z = true;
                zzjk2 = new zzjk(i, j, bundle, i2, list, z2, i3, z, zzjk2.f20214i, zzjk2.f20215j, zzjk2.f20216k, zzjk2.f20217l, zzjk2.f20218m, zzjk2.f20219n, zzjk2.f20220o, zzjk2.f20221p, zzjk2.f20222q, zzjk2.f20223r, null, zzjk2.f20225t, zzjk2.f20226u);
            }
            return super.zzb(zzjk2);
        }
    }

    public final void zza(zzakn zzakn, zzoj zzoj) {
        this.f21606l = null;
        if (zzakn.f8810e != -2) {
            this.f21606l = m28940a(zzakn, zzakn.f8810e);
        } else if (!zzakn.f8807b.f19792g) {
            zzaok.m10007e("partialAdState is not mediation");
            this.f21606l = m28940a(zzakn, 0);
        }
        if (this.f21606l != null) {
            zzalo.f8872a.post(new ap(this));
            return;
        }
        if (zzakn.f8809d != null) {
            this.e.zzadk = zzakn.f8809d;
        }
        this.e.zzaen = 0;
        zzbw zzbw = this.e;
        zzbv.zzej();
        zzbw.zzadj = zzacs.m9460a(this.e.zzrx, this, zzakn, this.e.f7793b, null, this.j, this, zzoj);
    }

    /* renamed from: a */
    private static zzakm m28940a(zzakn zzakn, int i) {
        zzakn zzakn2 = zzakn;
        return new zzakm(zzakn2.f8806a.f19735c, null, zzakn2.f8807b.f19788c, i, zzakn2.f8807b.f19790e, zzakn2.f8807b.f19794i, zzakn2.f8807b.f19796k, zzakn2.f8807b.f19795j, zzakn2.f8806a.f19741i, zzakn2.f8807b.f19792g, null, null, null, zzakn2.f8808c, null, zzakn2.f8807b.f19793h, zzakn2.f8809d, zzakn2.f8807b.f19791f, zzakn2.f8811f, zzakn2.f8812g, zzakn2.f8807b.f19799n, zzakn2.f8813h, null, zzakn2.f8807b.f19760A, zzakn2.f8807b.f19761B, zzakn2.f8807b.f19761B, zzakn2.f8807b.f19763D, zzakn2.f8807b.f19764E, null, zzakn2.f8807b.f19767H, zzakn2.f8807b.f19771L, zzakn2.f8814i, zzakn2.f8807b.f19774O, zzakn2.f8815j, zzakn2.f8807b.f19776Q, zzakn2.f8807b.f19777R, zzakn2.f8807b.f19778S, zzakn2.f8807b.f19779T, zzakn2.f8807b.f19781V);
    }

    protected final boolean zza(zzakm zzakm, zzakm zzakm2) {
        if (!this.e.zzfn()) {
            throw new IllegalStateException("AdLoader API does not support custom rendering.");
        } else if (zzakm2.f8793n) {
            if (zzakm2.f8794o != null && zzakm2.f8794o.m11187a()) {
                if (this.e.zzfn() && this.e.f7794c != null) {
                    this.e.f7794c.zzfq().m9893c(zzakm2.f8760A);
                }
                if (super.zza(zzakm, zzakm2)) {
                    if (this.e.zzfn() && m28943b(zzakm, zzakm2) == null) {
                        mo4933a(0);
                    } else {
                        if (this.e.zzfo() == null) {
                            super.mo4989a(zzakm2, false);
                        }
                        zzakm = true;
                        if (zzakm == null) {
                            return false;
                        }
                        this.f21607m = true;
                    }
                }
                zzakm = null;
                if (zzakm == null) {
                    return false;
                }
                this.f21607m = true;
            } else if (zzakm2.f8794o == null || !zzakm2.f8794o.m11188b()) {
                mo4933a(0);
                zzaok.m10007e("Response is neither banner nor native.");
                return false;
            } else if (m28942a(zzakm, zzakm2) == null) {
                return false;
            }
            zzd(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(2)})));
            return true;
        } else {
            mo4933a(0);
            zzaok.m10007e("newState is not mediation.");
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m28942a(zzakm zzakm, zzakm zzakm2) {
        zzakm zzakm3 = zzakm2;
        List list = null;
        zzc(null);
        if (this.e.zzfn()) {
            try {
                zzzf p = zzakm3.f8795p != null ? zzakm3.f8795p.mo2785p() : null;
                zzyz h = zzakm3.f8795p != null ? zzakm3.f8795p.mo2777h() : null;
                zzzc i = zzakm3.f8795p != null ? zzakm3.f8795p.mo2778i() : null;
                zzrg n = zzakm3.f8795p != null ? zzakm3.f8795p.mo2783n() : null;
                String b = zzc.m28077b(zzakm2);
                String a;
                List b2;
                String c;
                zzqk d;
                String e;
                String f;
                double g;
                String h2;
                String i2;
                zzly j;
                zzpi zzpi;
                if (p != null && r7.e.f7802k != null) {
                    a = p.mo2842a();
                    b2 = p.mo2845b();
                    c = p.mo2847c();
                    d = p.mo2848d() != null ? p.mo2848d() : null;
                    e = p.mo2849e();
                    f = p.mo2850f();
                    g = p.mo2851g();
                    h2 = p.mo2852h();
                    i2 = p.mo2853i();
                    j = p.mo2854j();
                    if (p.mo2857m() != null) {
                        list = (View) ObjectWrapper.m26020a(p.mo2857m());
                    }
                    zzpi = new zzpi(a, b2, c, d, e, f, g, h2, i2, null, j, list, p.mo2858n(), b, p.mo2859o());
                    zzpi.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, p, (zzpo) zzpi));
                    m28941a(zzpi);
                } else if (h != null && r7.e.f7802k != null) {
                    a = h.mo2802a();
                    b2 = h.mo2805b();
                    c = h.mo2807c();
                    d = h.mo2809d() != null ? h.mo2809d() : null;
                    e = h.mo2810e();
                    g = h.mo2811f();
                    h2 = h.mo2812g();
                    i2 = h.mo2813h();
                    j = h.mo2818m();
                    if (h.mo2821p() != null) {
                        list = (View) ObjectWrapper.m26020a(h.mo2821p());
                    }
                    zzpi = new zzpi(a, b2, c, d, e, null, g, h2, i2, null, j, list, h.mo2822q(), b, h.mo2817l());
                    zzpi.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, h, (zzpo) zzpi));
                    m28941a(zzpi);
                } else if (h != null && r7.e.f7800i != null) {
                    a = h.mo2802a();
                    b2 = h.mo2805b();
                    c = h.mo2807c();
                    d = h.mo2809d() != null ? h.mo2809d() : null;
                    e = h.mo2810e();
                    double f2 = h.mo2811f();
                    String g2 = h.mo2812g();
                    h2 = h.mo2813h();
                    Bundle l = h.mo2817l();
                    j = h.mo2818m();
                    if (h.mo2821p() != null) {
                        list = (View) ObjectWrapper.m26020a(h.mo2821p());
                    }
                    zzpb zzpb = new zzpb(a, b2, c, d, e, f2, g2, h2, null, l, j, list, h.mo2822q(), b);
                    zzpb.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, h, (zzpo) zzpb));
                    zzalo.f8872a.post(new ar(r7, zzpb));
                } else if (i != null && r7.e.f7802k != null) {
                    a = i.mo2823a();
                    b2 = i.mo2826b();
                    c = i.mo2828c();
                    d = i.mo2830d() != null ? i.mo2830d() : null;
                    e = i.mo2831e();
                    f = i.mo2832f();
                    j = i.mo2838l();
                    if (i.mo2840n() != null) {
                        list = (View) ObjectWrapper.m26020a(i.mo2840n());
                    }
                    r10 = new zzpi(a, b2, c, d, e, f, -1.0d, null, null, null, j, list, i.mo2841o(), b, i.mo2836j());
                    r5 = i;
                    zzpi zzpi2 = r10;
                    zzpi2.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, r5, r10));
                    m28941a(zzpi2);
                } else if (i != null && r7.e.f7801j != null) {
                    a = i.mo2823a();
                    b2 = i.mo2826b();
                    c = i.mo2828c();
                    d = i.mo2830d() != null ? i.mo2830d() : null;
                    e = i.mo2831e();
                    f = i.mo2832f();
                    Bundle j2 = i.mo2836j();
                    zzly l2 = i.mo2838l();
                    if (i.mo2840n() != null) {
                        list = (View) ObjectWrapper.m26020a(i.mo2840n());
                    }
                    r10 = new zzpd(a, b2, c, d, e, f, null, j2, l2, list, i.mo2841o(), b);
                    r5 = i;
                    zzpo zzpo = r10;
                    zzpo.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, r5, r10));
                    zzalo.f8872a.post(new as(r7, zzpo));
                } else if (n == null || r7.e.f7805n == null || r7.e.f7805n.get(n.mo2666b()) == null) {
                    zzaok.m10007e("No matching mapper/listener for retrieved native ad template.");
                    mo4933a(0);
                    return false;
                } else {
                    zzalo.f8872a.post(new at(r7, n));
                }
                return super.zza(zzakm, zzakm2);
            } catch (Throwable e2) {
                zzaok.m10006d("#007 Could not call remote method.", e2);
                mo4933a(0);
                return false;
            }
        }
        zzaok.m10007e("Native ad does not have custom rendering mode.");
        mo4933a(0);
        return false;
    }

    /* renamed from: a */
    protected final void m28945a(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = iObjectWrapper != null ? ObjectWrapper.m26020a(iObjectWrapper) : null;
        if (iObjectWrapper instanceof zzpm) {
            ((zzpm) iObjectWrapper).mo2602e();
        }
        super.m28081b(this.e.zzadl, false);
    }

    /* renamed from: a */
    private final void m28941a(zzpi zzpi) {
        zzalo.f8872a.post(new aq(this, zzpi));
    }

    public final void zzi(View view) {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zzcq() {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zzcr() {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zza(zzpm zzpm) {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zzcs() {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void zza(zzpk zzpk) {
        zzaok.m10006d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final boolean zzct() {
        return m28944i() != null ? m28944i().f9872p : false;
    }

    public final boolean zzcu() {
        return m28944i() != null ? m28944i().f9873q : false;
    }

    public final boolean zzcv() {
        return m28944i() != null ? m28944i().f9874r : false;
    }

    /* renamed from: i */
    private final zzxy m28944i() {
        return (this.e.zzadl == null || !this.e.zzadl.f8793n) ? null : this.e.zzadl.f8797r;
    }

    /* renamed from: b */
    private final boolean m28943b(zzakm zzakm, zzakm zzakm2) {
        View zze = zzas.zze(zzakm2);
        if (zze == null) {
            return false;
        }
        View nextView = this.e.f7794c.getNextView();
        if (nextView != null) {
            if (nextView instanceof zzasg) {
                ((zzasg) nextView).destroy();
            }
            this.e.f7794c.removeView(nextView);
        }
        if (zzas.zzf(zzakm2) == null) {
            try {
                m25942a(zze);
            } catch (Throwable th) {
                zzbv.zzeo().m9714a(th, "AdLoaderManager.swapBannerViews");
                zzaok.m10004c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.e.f7794c.getChildCount() > 1) {
            this.e.f7794c.showNext();
        }
        if (zzakm != null) {
            zzakm = this.e.f7794c.getNextView();
            if (zzakm != null) {
                this.e.f7794c.removeView(zzakm);
            }
            this.e.zzfm();
        }
        this.e.f7794c.setMinimumWidth(zzbk().f20232f);
        this.e.f7794c.setMinimumHeight(zzbk().f20229c);
        this.e.f7794c.requestLayout();
        this.e.f7794c.setVisibility(0);
        return true;
    }

    public final void pause() {
        if (this.f21607m) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.f21607m) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void zzc(List<String> list) {
        Preconditions.checkMainThread("setNativeTemplates must be called on the main UI thread.");
        this.e.f7815x = list;
    }

    public final zzrq zzt(String str) {
        Preconditions.checkMainThread("getOnCustomClickListener must be called on the main UI thread.");
        return (zzrq) this.e.f7804m.get(str);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.f21605k = z;
    }

    public final void zza(zzop zzop) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zzd(List<Integer> list) {
        Preconditions.checkMainThread("setAllowedAdTypes must be called on the main UI thread.");
        this.e.f7811t = list;
    }

    /* renamed from: d */
    protected final void mo4937d() {
        super.mo4937d();
        zzakm zzakm = this.e.zzadl;
        if (!(zzakm == null || zzakm.f8794o == null || !zzakm.f8794o.m11187a() || this.e.f7810s == null)) {
            try {
                this.e.f7810s.mo2687a(this, ObjectWrapper.m26019a(this.e.zzrx));
                super.m28081b(this.e.zzadl, false);
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzcd() {
        if (this.e.zzadl == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzadl.f8796q) || this.e.zzadl.f8794o == null || !this.e.zzadl.f8794o.m11188b()) {
            super.zzcd();
        } else {
            zzbs();
        }
    }

    public final void zzci() {
        if (this.e.zzadl == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzadl.f8796q) || this.e.zzadl.f8794o == null || !this.e.zzadl.f8794o.m11188b()) {
            super.zzci();
        } else {
            zzbr();
        }
    }

    /* renamed from: h */
    final /* synthetic */ void m28948h() {
        zzb(this.f21606l);
    }
}
