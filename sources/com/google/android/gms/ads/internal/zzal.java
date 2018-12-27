package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzah;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaft;
import com.google.android.gms.internal.ads.zzahc;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzatn;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzxx;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyn;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzal extends zzh implements zzah, zzy {
    /* renamed from: k */
    private transient boolean f21681k;
    /* renamed from: l */
    private int f21682l = -1;
    /* renamed from: m */
    private boolean f21683m;
    /* renamed from: n */
    private float f21684n;
    /* renamed from: o */
    private boolean f21685o;
    /* renamed from: p */
    private zzakc f21686p;
    /* renamed from: q */
    private String f21687q;
    /* renamed from: r */
    private final String f21688r;
    /* renamed from: s */
    private final zzahr f21689s;

    public zzal(Context context, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        super(context, zzjo, str, zzyn, zzaop, zzv);
        context = null;
        this.f21681k = false;
        if (!(zzjo == null || "reward_mb".equals(zzjo.f20227a) == null)) {
            context = true;
        }
        this.f21688r = context != null ? "/Rewarded" : "/Interstitial";
        if (context != null) {
            Context zzahr = new zzahr(this.e, this.j, new C4060f(this), this, this);
        } else {
            context = null;
        }
        this.f21689s = context;
    }

    /* renamed from: b */
    private final boolean m29841b(boolean z) {
        return this.f21689s != null && z;
    }

    public final boolean zza(zzjk zzjk, zzoj zzoj) {
        if (this.e.zzadl != null) {
            zzaok.m10007e("An interstitial is already loading. Aborting.");
            return null;
        }
        if (this.f21686p == null && zza.m25937a(zzjk) && zzbv.zzfj().m9668a(this.e.zzrx) && !TextUtils.isEmpty(this.e.zzade)) {
            this.f21686p = new zzakc(this.e.zzrx, this.e.zzade);
        }
        return super.zza(zzjk, zzoj);
    }

    public final void zza(zzakn zzakn, zzoj zzoj) {
        if (zzakn.f8810e != -2) {
            super.zza(zzakn, zzoj);
            return;
        }
        if (m29841b(zzakn.f8808c != null)) {
            this.f21689s.m9567c();
            return;
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aB)).booleanValue()) {
            int i = zzakn.f8807b.f19792g ^ 1;
            if (zza.m25937a(zzakn.f8806a.f19735c) && i != 0) {
                this.e.zzadm = m29837a(zzakn);
            }
            super.zza(this.e.zzadm, zzoj);
            return;
        }
        super.zza(zzakn, zzoj);
    }

    /* renamed from: a */
    protected final zzasg mo4982a(zzakn zzakn, zzw zzw, zzajy zzajy) {
        zzbv.zzel();
        zzasg a = zzasm.m10092a(this.e.zzrx, zzatt.m10130a(this.e.zzadk), this.e.zzadk.f20227a, false, false, this.e.f7793b, this.e.zzadg, this.a, this, this.i, zzakn.f8814i);
        a.mo4782u().mo2397a(this, this, null, this, this, true, this, zzw, this, zzajy);
        m28936a(a);
        a.mo4739a(zzakn.f8806a.f19754v);
        a.mo4740a("/reward", new zzag(this));
        return a;
    }

    /* renamed from: a */
    protected final boolean mo4936a(zzjk zzjk, zzakm zzakm, boolean z) {
        if (!(this.e.zzfn() == null || zzakm.f8781b == null)) {
            zzbv.zzem();
            zzalw.m9850a(zzakm.f8781b);
        }
        return this.d.zzea();
    }

    public final boolean zza(zzakm zzakm, zzakm zzakm2) {
        if (m29841b(zzakm2.f8793n)) {
            return zzahr.m9560a(zzakm, zzakm2);
        }
        if (super.zza(zzakm, zzakm2) == null) {
            return false;
        }
        if (!(this.e.zzfn() != null || this.e.f7816y == null || zzakm2.f8790k == null)) {
            this.g.m21683a(this.e.zzadk, zzakm2, this.e.f7816y);
        }
        m28081b(zzakm2, false);
        return true;
    }

    public final void zzcb() {
        recordImpression();
        super.zzcb();
        if (!(this.e.zzadl == null || this.e.zzadl.f8781b == null)) {
            zzatn u = this.e.zzadl.f8781b.mo4782u();
            if (u != null) {
                u.mo2400g();
            }
        }
        if (!(!zzbv.zzfj().m9668a(this.e.zzrx) || this.e.zzadl == null || this.e.zzadl.f8781b == null)) {
            zzbv.zzfj().m9672c(this.e.zzadl.f8781b.getContext(), this.f21687q);
        }
        if (this.f21686p != null) {
            this.f21686p.m21206a(true);
        }
        if (this.h != null && this.e.zzadl != null && this.e.zzadl.f8781b != null) {
            this.e.zzadl.f8781b.mo4743a("onSdkImpression", new HashMap());
        }
    }

    public final void zzca() {
        super.zzca();
        this.g.m21680a(this.e.zzadl);
        if (this.f21686p != null) {
            this.f21686p.m21206a(false);
        }
        this.h = null;
    }

    protected final void n_() {
        zzdj();
        super.n_();
    }

    public final void zzd(boolean z) {
        this.e.f7817z = z;
    }

    public final void zza(boolean z, float f) {
        this.f21683m = z;
        this.f21684n = f;
    }

    public final void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        boolean z = this.e.zzadl != null && this.e.zzadl.f8793n;
        if (m29841b(z)) {
            this.f21689s.m9565a(this.f21685o);
            return;
        }
        if (zzbv.zzfj().m9668a(this.e.zzrx)) {
            this.f21687q = zzbv.zzfj().m9669b(this.e.zzrx);
            String valueOf = String.valueOf(this.f21687q);
            String valueOf2 = String.valueOf(this.f21688r);
            this.f21687q = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.e.zzadl == null) {
            zzaok.m10007e("The interstitial has not loaded.");
            return;
        }
        if (!this.f21681k) {
            if (!((Boolean) zzkd.m10713e().m10897a(zznw.cC)).booleanValue()) {
                return;
            }
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ak)).booleanValue()) {
            zzbv.zzek();
            if (zzalo.m9823h(this.e.zzrx)) {
                zzaok.m10007e("It is not recommended to show an interstitial when app is not in foreground.");
                return;
            }
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aX)).booleanValue()) {
            Bundle bundle;
            if (this.e.zzrx.getApplicationContext() != null) {
                valueOf = this.e.zzrx.getApplicationContext().getPackageName();
            } else {
                valueOf = this.e.zzrx.getPackageName();
            }
            if (!this.f21681k) {
                zzaok.m10007e("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m29838a(bundle);
            }
            zzbv.zzek();
            if (!zzalo.m9822g(this.e.zzrx)) {
                zzaok.m10007e("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                m29838a(bundle);
            }
        }
        if (!this.e.zzfo()) {
            if (this.e.zzadl.f8793n && this.e.zzadl.f8795p != null) {
                try {
                    this.e.zzadl.f8795p.mo2770a(this.f21685o);
                    this.e.zzadl.f8795p.mo2771b();
                } catch (Throwable e) {
                    zzaok.m10004c("Could not show interstitial.", e);
                    zzdj();
                }
            } else if (this.e.zzadl.f8781b == null) {
                zzaok.m10007e("The interstitial failed to load.");
            } else if (this.e.zzadl.f8781b.mo4208z()) {
                zzaok.m10007e("The interstitial is already showing.");
            } else {
                Bitmap i;
                this.e.zzadl.f8781b.mo4751b(true);
                this.e.m8816a(this.e.zzadl.f8781b.getView());
                if (this.e.zzadl.f8790k != null) {
                    this.g.m21682a(this.e.zzadk, this.e.zzadl);
                }
                if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                    zzakm zzakm = this.e.zzadl;
                    if (zzakm.m9689a()) {
                        new zzfs(this.e.zzrx, zzakm.f8781b.getView()).m10604a(zzakm.f8781b);
                    } else {
                        zzakm.f8781b.mo4782u().mo2395a(new C4059e(this, zzakm));
                    }
                }
                if (this.e.f7817z) {
                    zzbv.zzek();
                    i = zzalo.m9824i(this.e.zzrx);
                } else {
                    i = null;
                }
                this.f21682l = zzbv.zzff().m9927a(i);
                if (i != null) {
                    new C4698g(this, this.f21682l).m21224h();
                    return;
                }
                boolean z2 = this.e.f7817z;
                zzbv.zzek();
                zzaq zzaq = new zzaq(z2, zzalo.m9828o(this.e.zzrx), false, 0.0f, -1, this.f21685o, this.e.zzadl.f8771L, this.e.zzadl.f8774O);
                int requestedOrientation = this.e.zzadl.f8781b.getRequestedOrientation();
                if (requestedOrientation == -1) {
                    requestedOrientation = this.e.zzadl.f8787h;
                }
                AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.zzadl.f8781b, requestedOrientation, this.e.zzadg, this.e.zzadl.f8760A, zzaq);
                zzbv.zzei();
                zzl.zza(this.e.zzrx, adOverlayInfoParcel, true);
            }
        }
    }

    public final void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f21685o = z;
    }

    /* renamed from: a */
    private final void m29838a(Bundle bundle) {
        zzbv.zzek().m9841b(this.e.zzrx, this.e.zzadg.f19893a, "gmob-apps", bundle, false);
    }

    /* renamed from: d */
    protected final void mo4937d() {
        zzasg zzasg = this.e.zzadl != null ? this.e.zzadl.f8781b : null;
        zzakn zzakn = this.e.zzadm;
        if (!(zzakn == null || zzakn.f8807b == null || !zzakn.f8807b.f19776Q || zzasg == null || !zzbv.zzfb().m9454a(this.e.zzrx))) {
            int i = this.e.zzadg.f19894b;
            int i2 = this.e.zzadg.f19895c;
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(i);
            stringBuilder.append(".");
            stringBuilder.append(i2);
            this.h = zzbv.zzfb().m9450a(stringBuilder.toString(), zzasg.getWebView(), "", "javascript", m25948g());
            if (!(this.h == null || zzasg.getView() == null)) {
                zzbv.zzfb().m9453a(this.h, zzasg.getView());
                zzasg.mo4736a(this.h);
                zzbv.zzfb().m9452a(this.h);
            }
        }
        super.mo4937d();
        this.f21681k = true;
    }

    public final void zzdj() {
        zzbv.zzff().m9929b(Integer.valueOf(this.f21682l));
        if (this.e.zzfn()) {
            this.e.zzfl();
            this.e.zzadl = null;
            this.e.f7817z = false;
            this.f21681k = false;
        }
    }

    public final void zzdk() {
        boolean z = this.e.zzadl != null && this.e.zzadl.f8793n;
        if (m29841b(z)) {
            this.f21689s.m9571g();
            r_();
            return;
        }
        if (!(this.e.zzadl == null || this.e.zzadl.f8802w == null)) {
            zzbv.zzek();
            zzalo.m9792a(this.e.zzrx, this.e.zzadg.f19893a, this.e.zzadl.f8802w);
        }
        r_();
    }

    public final void zzb(zzajk zzajk) {
        boolean z = this.e.zzadl != null && this.e.zzadl.f8793n;
        if (m29841b(z)) {
            m25943a(this.f21689s.m9563a(zzajk));
            return;
        }
        if (this.e.zzadl != null) {
            if (this.e.zzadl.f8803x != null) {
                zzbv.zzek();
                zzalo.m9792a(this.e.zzrx, this.e.zzadg.f19893a, this.e.zzadl.f8803x);
            }
            if (this.e.zzadl.f8801v != null) {
                zzajk = this.e.zzadl.f8801v;
            }
        }
        m25943a(zzajk);
    }

    public final void zzdl() {
        boolean z = this.e.zzadl != null && this.e.zzadl.f8793n;
        if (m29841b(z)) {
            this.f21689s.m9572h();
        }
        s_();
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzakn m29837a(zzakn zzakn) {
        zzakn zzakn2 = zzakn;
        try {
            String jSONObject = zzahc.m9530a(zzakn2.f8807b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzakn2.f8806a.f19737e);
            zzxx zzxx = new zzxx(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaft zzaft = zzakn2.f8807b;
            zzxy zzxy = new zzxy(Collections.singletonList(zzxx), ((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaft.f19767H, zzaft.f19768I, "", -1, 0, 1, null, 0, -1, -1, false);
            return new zzakn(zzakn2.f8806a, new zzaft(zzakn2.f8806a, zzaft.f19786a, zzaft.f19787b, Collections.emptyList(), Collections.emptyList(), zzaft.f19791f, true, zzaft.f19793h, Collections.emptyList(), zzaft.f19795j, zzaft.f19796k, zzaft.f19797l, zzaft.f19798m, zzaft.f19799n, zzaft.f19800o, zzaft.f19801p, null, zzaft.f19803r, zzaft.f19804s, zzaft.f19805t, zzaft.f19806u, zzaft.f19807v, zzaft.f19809x, zzaft.f19810y, zzaft.f19811z, null, Collections.emptyList(), Collections.emptyList(), zzaft.f19763D, zzaft.f19764E, zzaft.f19765F, zzaft.f19766G, zzaft.f19767H, zzaft.f19768I, zzaft.f19769J, null, zzaft.f19771L, zzaft.f19772M, zzaft.f19773N, zzaft.f19774O, 0, zzaft.f19776Q, Collections.emptyList(), zzaft.f19778S, zzaft.f19779T, zzaft.f19780U, zzaft.f19781V), zzxy, zzakn2.f8809d, zzakn2.f8810e, zzakn2.f8811f, zzakn2.f8812g, null, zzakn2.f8814i, null);
        } catch (Throwable e) {
            zzaok.m10002b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return zzakn2;
        }
    }

    public final void zzda() {
        zzd q = this.e.zzadl.f8781b.mo4775q();
        if (q != null) {
            q.close();
        }
    }
}
