package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzahy;
import com.google.android.gms.internal.ads.zzaib;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzakz;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjl;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzkg;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkv;
import com.google.android.gms.internal.ads.zzkz;
import com.google.android.gms.internal.ads.zzlc;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzoh;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzop;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public abstract class zza extends zzkv implements zzb, zzd, zzt, zzact, zzaet, zzakx, zzjc {
    /* renamed from: a */
    protected zzoj f19530a;
    /* renamed from: b */
    protected zzoh f19531b;
    /* renamed from: c */
    protected boolean f19532c = false;
    /* renamed from: d */
    protected final zzbl f19533d;
    /* renamed from: e */
    protected final zzbw f19534e;
    /* renamed from: f */
    protected transient zzjk f19535f;
    /* renamed from: g */
    protected final zzev f19536g;
    /* renamed from: h */
    protected IObjectWrapper f19537h;
    /* renamed from: i */
    protected final zzv f19538i;
    /* renamed from: j */
    private zzoh f19539j;
    /* renamed from: k */
    private final Bundle f19540k = new Bundle();
    /* renamed from: l */
    private boolean f19541l = false;

    /* renamed from: a */
    protected static boolean m25937a(zzjk zzjk) {
        zzjk = zzjk.f20218m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (zzjk != null) {
            if (zzjk.containsKey("gw") != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    boolean mo4691a(zzakm zzakm) {
        return false;
    }

    public zzly getVideoController() {
        return null;
    }

    protected abstract void zza(zzakn zzakn, zzoj zzoj);

    protected abstract boolean zza(zzakm zzakm, zzakm zzakm2);

    protected abstract boolean zza(zzjk zzjk, zzoj zzoj);

    public final zzv zzbi() {
        return this.f19538i;
    }

    @VisibleForTesting
    zza(zzbw zzbw, zzbl zzbl, zzv zzv) {
        this.f19534e = zzbw;
        this.f19533d = new zzbl(this);
        this.f19538i = zzv;
        zzbv.zzek().m9842b(this.f19534e.zzrx);
        zzbv.zzek().m9844c(this.f19534e.zzrx);
        zzale.m9742a(this.f19534e.zzrx);
        zzbv.zzew().m11153a(this.f19534e.zzrx);
        zzbv.zzeo().m9712a(this.f19534e.zzrx, this.f19534e.zzadg);
        zzbv.zzeq().m10674a(this.f19534e.zzrx);
        this.f19536g = zzbv.zzeo().m9721f();
        zzbv.zzen().m10631a(this.f19534e.zzrx);
        zzbv.zzfg().m9939a(this.f19534e.zzrx);
    }

    public final void zza(zzoh zzoh) {
        this.f19530a = new zzoj(((Boolean) zzkd.m10713e().m10897a(zznw.f9685J)).booleanValue(), "load_ad", this.f19534e.zzadk.f20227a);
        this.f19539j = new zzoh(-1, null, null);
        if (zzoh == null) {
            this.f19531b = new zzoh(-1, null, null);
        } else {
            this.f19531b = new zzoh(zzoh.m10919a(), zzoh.m10920b(), zzoh.m10921c());
        }
    }

    public void destroy() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: destroy");
        this.f19533d.cancel();
        this.f19536g.m21686b(this.f19534e.zzadl);
        zzbw zzbw = this.f19534e;
        if (zzbw.f7794c != null) {
            zzbw.f7794c.zzfr();
        }
        zzbw.f7796e = null;
        zzbw.f7798g = null;
        zzbw.f7797f = null;
        zzbw.f7812u = null;
        zzbw.f7799h = null;
        zzbw.zzg(false);
        if (zzbw.f7794c != null) {
            zzbw.f7794c.removeAllViews();
        }
        zzbw.zzfl();
        zzbw.zzfm();
        zzbw.zzadl = null;
        this.f19537h = null;
    }

    public final IObjectWrapper zzbj() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: getAdFrame");
        return ObjectWrapper.m26019a(this.f19534e.f7794c);
    }

    public final zzjo zzbk() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: getAdSize");
        return this.f19534e.zzadk == null ? null : new zznd(this.f19534e.zzadk);
    }

    public final boolean isReady() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: isLoaded");
        return this.f19534e.zzadi == null && this.f19534e.zzadj == null && this.f19534e.zzadl != null;
    }

    public void setManualImpressionsEnabled(boolean z) {
        zzaok.m10007e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean zzb(zzjk zzjk) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: loadAd");
        zzbv.zzeq().m10673a();
        this.f19540k.clear();
        this.f19541l = false;
        zzjk = zzjk.m26613a();
        zzjk.f20208c.putInt("dv", DynamiteModule.m8890b(this.f19534e.zzrx, ModuleDescriptor.MODULE_ID));
        zzjk.f20208c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
        if (DeviceProperties.isSidewinder(this.f19534e.zzrx) && zzjk.f20216k != null) {
            zzjk = new zzjl(zzjk).m10691a(null).m10690a();
        }
        if (this.f19534e.zzadi == null) {
            if (this.f19534e.zzadj == null) {
                zzaok.m10005d("Starting ad request.");
                String str = "SDK version: ";
                String valueOf = String.valueOf(this.f19534e.zzadg.f19893a);
                zzaok.m10005d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                zza(null);
                this.f19531b = this.f19530a.m10925a();
                if (zzjk.f20211f) {
                    zzaok.m10005d("This request is sent from a test device.");
                } else {
                    zzkd.m10709a();
                    str = zzaoa.m9954a(this.f19534e.zzrx);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
                    stringBuilder.append("Use AdRequest.Builder.addTestDevice(\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\") to get test ads on this device.");
                    zzaok.m10005d(stringBuilder.toString());
                }
                this.f19533d.zzf(zzjk);
                this.f19532c = zza(zzjk, this.f19530a);
                return this.f19532c;
            }
        }
        if (this.f19535f != null) {
            zzaok.m10007e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            zzaok.m10007e("Loading already in progress, saving this object for future refreshes.");
        }
        this.f19535f = zzjk;
        return false;
    }

    public final void zza(zzakn zzakn) {
        if (!(zzakn.f8807b.f19798m == -1 || TextUtils.isEmpty(zzakn.f8807b.f19808w))) {
            long a = mo4955a(zzakn.f8807b.f19808w);
            if (a != -1) {
                this.f19530a.m10931a(this.f19530a.m10926a(zzakn.f8807b.f19798m + a), "stc");
            }
        }
        this.f19530a.m10928a(zzakn.f8807b.f19808w);
        this.f19530a.m10931a(this.f19531b, "arf");
        this.f19539j = this.f19530a.m10925a();
        this.f19530a.m10929a("gqi", zzakn.f8807b.f19809x);
        this.f19534e.zzadi = null;
        this.f19534e.zzadm = zzakn;
        zzakn.f8814i.m10683a(new C4080o(this, zzakn));
        zzakn.f8814i.m10684a(com.google.android.gms.internal.ads.zzhx.zza.zzb.AD_LOADED);
        zza(zzakn, this.f19530a);
    }

    public void zzb(zzakm zzakm) {
        this.f19530a.m10931a(this.f19539j, "awr");
        this.f19534e.zzadj = null;
        if (!(zzakm.f8783d == -2 || zzakm.f8783d == 3 || this.f19534e.zzfk() == null)) {
            zzbv.zzeo().m9729n().m21217a(this.f19534e.zzfk());
        }
        if (zzakm.f8783d == -1) {
            this.f19532c = null;
            return;
        }
        if (mo4691a(zzakm)) {
            zzaok.m10001b("Ad refresh scheduled.");
        }
        if (zzakm.f8783d != -2) {
            if (zzakm.f8783d == 3) {
                zzakm.f8770K.m10684a(com.google.android.gms.internal.ads.zzhx.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL);
            } else {
                zzakm.f8770K.m10684a(com.google.android.gms.internal.ads.zzhx.zza.zzb.AD_FAILED_TO_LOAD);
            }
            mo4933a(zzakm.f8783d);
            return;
        }
        if (this.f19534e.zzael == null) {
            this.f19534e.zzael = new zzakz(this.f19534e.zzade);
        }
        if (this.f19534e.f7794c != null) {
            this.f19534e.f7794c.zzfq().m9895d(zzakm.f8761B);
        }
        this.f19536g.m21680a(this.f19534e.zzadl);
        if (zza(this.f19534e.zzadl, zzakm)) {
            this.f19534e.zzadl = zzakm;
            zzbw zzbw = this.f19534e;
            if (zzbw.zzadn != null) {
                if (zzbw.zzadl != null) {
                    zzbw.zzadn.m9692a(zzbw.zzadl.f8804y);
                    zzbw.zzadn.m9696b(zzbw.zzadl.f8805z);
                    zzbw.zzadn.m9697b(zzbw.zzadl.f8793n);
                }
                zzbw.zzadn.m9694a(zzbw.zzadk.f20230d);
            }
            this.f19530a.m10929a("is_mraid", this.f19534e.zzadl.m9689a() ? "1" : "0");
            this.f19530a.m10929a("is_mediation", this.f19534e.zzadl.f8793n ? "1" : "0");
            if (!(this.f19534e.zzadl.f8781b == null || this.f19534e.zzadl.f8781b.mo4782u() == null)) {
                this.f19530a.m10929a("is_delay_pl", this.f19534e.zzadl.f8781b.mo4782u().mo2399f() ? "1" : "0");
            }
            this.f19530a.m10931a(this.f19531b, "ttc");
            if (zzbv.zzeo().m9711a() != null) {
                zzbv.zzeo().m9711a().m10914a(this.f19530a);
            }
            zzbv();
            if (this.f19534e.zzfn()) {
                mo4937d();
            }
        }
        if (zzakm.f8769J != null) {
            zzbv.zzek().m9837a(this.f19534e.zzrx, zzakm.f8769J);
        }
    }

    public void onAdClicked() {
        if (this.f19534e.zzadl == null) {
            zzaok.m10007e("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzaok.m10001b("Pinging click URLs.");
        if (this.f19534e.zzadn != null) {
            this.f19534e.zzadn.m9695b();
        }
        if (this.f19534e.zzadl.f8782c != null) {
            zzbv.zzek();
            zzalo.m9792a(this.f19534e.zzrx, this.f19534e.zzadg.f19893a, m25939a(this.f19534e.zzadl.f8782c, this.f19534e.zzadl.f8775P));
        }
        if (this.f19534e.f7795d != null) {
            try {
                this.f19534e.f7795d.mo2461a();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzbl() {
        p_();
    }

    public final void zza(String str, Bundle bundle) {
        this.f19540k.putAll(bundle);
        if (!(this.f19541l == null || this.f19534e.f7798g == null)) {
            try {
                this.f19534e.f7798g.mo2522a();
            } catch (String str2) {
                zzaok.m10006d("#007 Could not call remote method.", str2);
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        if (this.f19534e.f7797f != null) {
            try {
                this.f19534e.f7797f.mo2523a(str, str2);
            } catch (String str3) {
                zzaok.m10006d("#007 Could not call remote method.", str3);
            }
        }
    }

    public final void zzbm() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f19534e.zzadl == null) {
            zzaok.m10007e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzaok.m10001b("Pinging manual tracking URLs.");
        if (!this.f19534e.zzadl.f8767H) {
            List arrayList = new ArrayList();
            if (this.f19534e.zzadl.f8786g != null) {
                arrayList.addAll(this.f19534e.zzadl.f8786g);
            }
            if (!(this.f19534e.zzadl.f8794o == null || this.f19534e.zzadl.f8794o.f9844i == null)) {
                arrayList.addAll(this.f19534e.zzadl.f8794o.f9844i);
            }
            if (!arrayList.isEmpty()) {
                zzbv.zzek();
                zzalo.m9792a(this.f19534e.zzrx, this.f19534e.zzadg.f19893a, arrayList);
                this.f19534e.zzadl.f8767H = true;
            }
        }
    }

    public void pause() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: pause");
    }

    public void resume() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: resume");
    }

    /* renamed from: b */
    protected boolean mo4692b(zzjk zzjk) {
        if (this.f19534e.f7794c == null) {
            return false;
        }
        zzjk = this.f19534e.f7794c.getParent();
        if (!(zzjk instanceof View)) {
            return false;
        }
        View view = (View) zzjk;
        return zzbv.zzek().m9838a(view, view.getContext());
    }

    public final void zza(zzkj zzkj) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdListener");
        this.f19534e.f7796e = zzkj;
    }

    public final void zza(zzaii zzaii) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f19534e.f7813v = zzaii;
    }

    public final void zza(zzaib zzaib) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f19534e.f7814w = zzaib;
    }

    public final void setUserId(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setUserId");
        this.f19534e.zzaei = str;
    }

    public final void zzr(String str) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.f19534e.zzaej = str;
    }

    public final void zza(zzkg zzkg) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f19534e.f7795d = zzkg;
    }

    public final void zza(zzjo zzjo) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAdSize");
        this.f19534e.zzadk = zzjo;
        if (!(this.f19534e.zzadl == null || this.f19534e.zzadl.f8781b == null || this.f19534e.zzaen != 0)) {
            this.f19534e.zzadl.f8781b.mo4737a(zzatt.m10130a(zzjo));
        }
        if (this.f19534e.f7794c != null) {
            if (this.f19534e.f7794c.getChildCount() > 1) {
                this.f19534e.f7794c.removeView(this.f19534e.f7794c.getNextView());
            }
            this.f19534e.f7794c.setMinimumWidth(zzjo.f20232f);
            this.f19534e.f7794c.setMinimumHeight(zzjo.f20229c);
            this.f19534e.f7794c.requestLayout();
        }
    }

    public final void zza(zzlc zzlc) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f19534e.f7797f = zzlc;
    }

    public final void zza(zzkz zzkz) {
        this.f19534e.f7798g = zzkz;
    }

    public final Bundle getAdMetadata() {
        if (this.f19541l) {
            return this.f19540k;
        }
        return new Bundle();
    }

    public void zza(zzacd zzacd) {
        zzaok.m10007e("#006 Unexpected call to a deprecated method.");
    }

    public void zza(zzop zzop) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    public final void zza(zzacj zzacj, String str) {
        zzaok.m10007e("#006 Unexpected call to a deprecated method.");
    }

    public final void zza(zzli zzli) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f19534e.f7799h = zzli;
    }

    public final void stopLoading() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: stopLoading");
        this.f19532c = false;
        this.f19534e.zzg(true);
    }

    public final boolean isLoading() {
        return this.f19532c;
    }

    public final void zza(zznf zznf) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f19534e.f7807p = zznf;
    }

    public final void zza(zzme zzme) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f19534e.f7809r = zzme;
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @VisibleForTesting
    /* renamed from: a */
    private static long mo4955a(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (String str2) {
            zzaok.m10002b("", str2);
            return -1;
        }
    }

    /* renamed from: a */
    protected final void m25942a(View view) {
        zzbx zzbx = this.f19534e.f7794c;
        if (zzbx != null) {
            zzbx.addView(view, zzbv.zzem().mo5040d());
        }
    }

    protected void n_() {
        zzalg.m21225a("Ad closing.");
        if (this.f19534e.f7796e != null) {
            try {
                this.f19534e.f7796e.mo2462a();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
        if (this.f19534e.f7813v != null) {
            try {
                this.f19534e.f7813v.mo2271d();
            } catch (Throwable e2) {
                zzaok.m10006d("#007 Could not call remote method.", e2);
            }
        }
    }

    protected final void p_() {
        zzalg.m21225a("Ad leaving application.");
        if (this.f19534e.f7796e != null) {
            try {
                this.f19534e.f7796e.mo2464b();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
        if (this.f19534e.f7813v != null) {
            try {
                this.f19534e.f7813v.mo2272e();
            } catch (Throwable e2) {
                zzaok.m10006d("#007 Could not call remote method.", e2);
            }
        }
    }

    protected final void q_() {
        zzalg.m21225a("Ad opening.");
        if (this.f19534e.f7796e != null) {
            try {
                this.f19534e.f7796e.mo2466d();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
        if (this.f19534e.f7813v != null) {
            try {
                this.f19534e.f7813v.mo2269b();
            } catch (Throwable e2) {
                zzaok.m10006d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* renamed from: d */
    protected void mo4937d() {
        mo4935a(false);
    }

    /* renamed from: a */
    protected void mo4935a(boolean z) {
        zzalg.m21225a("Ad finished loading.");
        this.f19532c = z;
        this.f19541l = true;
        if (this.f19534e.f7796e) {
            try {
                this.f19534e.f7796e.mo2465c();
            } catch (boolean z2) {
                zzaok.m10006d("#007 Could not call remote method.", z2);
            }
        }
        if (this.f19534e.f7813v) {
            try {
                this.f19534e.f7813v.mo2266a();
            } catch (boolean z22) {
                zzaok.m10006d("#007 Could not call remote method.", z22);
            }
        }
        if (this.f19534e.f7798g) {
            try {
                this.f19534e.f7798g.mo2522a();
            } catch (boolean z222) {
                zzaok.m10006d("#007 Could not call remote method.", z222);
            }
        }
    }

    /* renamed from: a */
    protected void mo4933a(int i) {
        mo4934a(i, false);
    }

    /* renamed from: a */
    protected void mo4934a(int i, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Failed to load ad: ");
        stringBuilder.append(i);
        zzaok.m10007e(stringBuilder.toString());
        this.f19532c = z;
        if (this.f19534e.f7796e) {
            try {
                this.f19534e.f7796e.mo2463a(i);
            } catch (boolean z2) {
                zzaok.m10006d("#007 Could not call remote method.", z2);
            }
        }
        if (this.f19534e.f7813v) {
            try {
                this.f19534e.f7813v.mo2267a(i);
            } catch (boolean z22) {
                zzaok.m10006d("#007 Could not call remote method.", z22);
            }
        }
        if (this.f19534e.f7803l) {
            try {
                this.f19534e.f7803l.mo2746a(i);
            } catch (int i2) {
                zzaok.m10006d("#007 Could not call remote method.", i2);
            }
        }
    }

    public final void zzbr() {
        zzaok.m10005d("Ad impression.");
        if (this.f19534e.f7796e != null) {
            try {
                this.f19534e.f7796e.mo2468f();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzbs() {
        zzaok.m10005d("Ad clicked.");
        if (this.f19534e.f7796e != null) {
            try {
                this.f19534e.f7796e.mo2467e();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    protected final void r_() {
        if (this.f19534e.f7813v != null) {
            try {
                this.f19534e.f7813v.mo2270c();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    protected final void m25943a(zzajk zzajk) {
        if (this.f19534e.f7813v != null) {
            try {
                String str = "";
                int i = 1;
                if (zzajk != null) {
                    str = zzajk.f19880a;
                    i = zzajk.f19881b;
                }
                zzahy zzahs = new zzahs(str, i);
                this.f19534e.f7813v.mo2268a(zzahs);
                if (this.f19534e.f7814w != null) {
                    this.f19534e.f7814w.mo2245a(zzahs, this.f19534e.zzadm.f8806a.f19754v);
                }
            } catch (zzajk zzajk2) {
                zzaok.m10006d("#007 Could not call remote method.", zzajk2);
            }
        }
    }

    protected final void s_() {
        if (this.f19534e.f7813v != null) {
            try {
                this.f19534e.f7813v.mo2273f();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    protected final List<String> m25938a(List<String> list) {
        List arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(zzakg.m9682a(a, this.f19534e.zzrx));
        }
        return arrayList;
    }

    public final void zzbv() {
        zzakm zzakm = this.f19534e.zzadl;
        if (!(zzakm == null || TextUtils.isEmpty(zzakm.f8761B) || zzakm.f8768I)) {
            if (zzbv.zzeu().m9907b()) {
                zzaok.m10001b("Sending troubleshooting signals to the server.");
                zzbv.zzeu().m9906b(this.f19534e.zzrx, this.f19534e.zzadg.f19893a, zzakm.f8761B, this.f19534e.zzade);
                zzakm.f8768I = true;
            }
        }
    }

    public final void zza(HashSet<zzako> hashSet) {
        this.f19534e.zza(hashSet);
    }

    /* renamed from: a */
    protected final List<String> m25939a(List<String> list, boolean z) {
        List arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(zzakg.m9683a(a, this.f19534e.zzrx, z));
        }
        return arrayList;
    }

    public String getAdUnitId() {
        return this.f19534e.zzade;
    }

    public final zzlc zzbw() {
        return this.f19534e.f7797f;
    }

    public final zzkj zzbx() {
        return this.f19534e.f7796e;
    }

    /* renamed from: g */
    protected final String m25948g() {
        zzakn zzakn = this.f19534e.zzadm;
        if (zzakn == null) {
            return "javascript";
        }
        if (zzakn.f8807b == null) {
            return "javascript";
        }
        Object obj = zzakn.f8807b.f19779T;
        if (TextUtils.isEmpty(obj)) {
            return "javascript";
        }
        try {
            return new JSONObject(obj).optInt("media_type", -1) == 0 ? null : "javascript";
        } catch (Throwable e) {
            zzaok.m10004c("", e);
            return "javascript";
        }
    }
}
