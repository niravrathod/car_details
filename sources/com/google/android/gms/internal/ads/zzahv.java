package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONObject;

@zzaer
public final class zzahv extends zzc implements zzaiy {
    /* renamed from: k */
    private static zzahv f21608k;
    /* renamed from: l */
    private boolean f21609l;
    /* renamed from: m */
    private boolean f21610m;
    @VisibleForTesting
    /* renamed from: n */
    private final zzakc f21611n;
    /* renamed from: o */
    private final zzahr f21612o = new zzahr(this.e, this.j, this, this, this);

    /* renamed from: h */
    public static zzahv m28951h() {
        return f21608k;
    }

    /* renamed from: a */
    protected final boolean mo4936a(zzjk zzjk, zzakm zzakm, boolean z) {
        return false;
    }

    public zzahv(Context context, zzv zzv, zzjo zzjo, zzyn zzyn, zzaop zzaop) {
        super(context, zzjo, null, zzyn, zzaop, zzv);
        f21608k = this;
        this.f21611n = new zzakc(context, null);
    }

    /* renamed from: a */
    public final void m28955a(zzaio zzaio) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzaio.f19853b)) {
            zzaok.m10007e("Invalid ad unit id. Aborting.");
            zzalo.f8872a.post(new cb(this));
            return;
        }
        this.f21609l = false;
        this.e.zzade = zzaio.f19853b;
        this.f21611n.m21205a(zzaio.f19853b);
        super.zzb((zzjk) zzaio.f19852a);
    }

    public final void zza(zzakn zzakn, zzoj zzoj) {
        if (zzakn.f8810e != -2) {
            zzalo.f8872a.post(new cc(this, zzakn));
            return;
        }
        this.e.zzadm = zzakn;
        if (zzakn.f8808c == null) {
            this.e.zzadm = m28949a(zzakn);
        }
        this.f21612o.m9567c();
    }

    /* renamed from: a */
    public final zzajf mo4955a(String str) {
        return this.f21612o.m9562a(str);
    }

    public final boolean zza(zzakm zzakm, zzakm zzakm2) {
        m28081b(zzakm2, false);
        return zzahr.m9560a(zzakm, zzakm2);
    }

    public final void pause() {
        this.f21612o.m9568d();
    }

    public final void resume() {
        this.f21612o.m9569e();
    }

    public final void destroy() {
        this.f21612o.m9570f();
        super.destroy();
    }

    public final void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f21610m = z;
    }

    /* renamed from: i */
    public final void m28961i() {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (m28962k()) {
            this.f21612o.m9565a(this.f21610m);
        } else {
            zzaok.m10007e("The reward video has not loaded.");
        }
    }

    /* renamed from: k */
    public final boolean m28962k() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.e.zzadi == null && this.e.zzadj == null && this.e.zzadl != null;
    }

    /* renamed from: a */
    public final void mo1715a() {
        if (zzbv.zzfj().m9668a(this.e.zzrx)) {
            this.f21611n.m21206a(true);
        }
        mo4989a(this.e.zzadl, false);
        q_();
    }

    /* renamed from: b */
    public final void mo1717b() {
        this.f21612o.m9571g();
        r_();
    }

    /* renamed from: f */
    public final void mo1720f() {
        this.f21612o.m9572h();
        s_();
    }

    /* renamed from: c */
    public final void mo1718c() {
        if (zzbv.zzfj().m9668a(this.e.zzrx)) {
            this.f21611n.m21206a(false);
        }
        n_();
    }

    protected final void n_() {
        this.e.zzadl = null;
        super.n_();
    }

    public final void a_(zzajk zzajk) {
        zzajk = this.f21612o.m9563a(zzajk);
        if (zzbv.zzfj().m9668a(this.e.zzrx) && zzajk != null) {
            zzbv.zzfj().m9667a(this.e.zzrx, zzbv.zzfj().m9675e(this.e.zzrx), this.e.zzade, zzajk.f19880a, zzajk.f19881b);
        }
        m25943a(zzajk);
    }

    public final void o_() {
        onAdClicked();
    }

    /* renamed from: e */
    public final void mo1719e() {
        p_();
    }

    /* renamed from: a */
    public final void m28954a(Context context) {
        this.f21612o.m9564a(context);
    }

    /* renamed from: a */
    private static zzakn m28949a(zzakn zzakn) {
        zzakn zzakn2 = zzakn;
        zzalg.m21225a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            zzahc.m9530a(zzakn2.f8807b).remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzakn2.f8806a.f19737e);
            String jSONObject2 = jSONObject.toString();
            zzxy zzxy = new zzxy(Arrays.asList(new zzxx[]{new zzxx(zzahc.m9530a(zzakn2.f8807b).toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1)}), ((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            return new zzakn(zzakn2.f8806a, zzakn2.f8807b, zzxy, zzakn2.f8809d, zzakn2.f8810e, zzakn2.f8811f, zzakn2.f8812g, zzakn2.f8813h, zzakn2.f8814i, null);
        } catch (Throwable e) {
            zzaok.m10002b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zzakn(zzakn2.f8806a, zzakn2.f8807b, null, zzakn2.f8809d, 0, zzakn2.f8811f, zzakn2.f8812g, zzakn2.f8813h, zzakn2.f8814i, null);
        }
    }
}
