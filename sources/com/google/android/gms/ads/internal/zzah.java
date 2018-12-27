package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p017f.C0433m;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkn;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzrw;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzti;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzyn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzah extends zzkn {
    /* renamed from: a */
    private final Context f19542a;
    /* renamed from: b */
    private final zzkj f19543b;
    /* renamed from: c */
    private final zzyn f19544c;
    /* renamed from: d */
    private final zzrk f19545d;
    /* renamed from: e */
    private final zzrz f19546e;
    /* renamed from: f */
    private final zzto f19547f;
    /* renamed from: g */
    private final zzrn f19548g;
    /* renamed from: h */
    private final zzrw f19549h;
    /* renamed from: i */
    private final zzjo f19550i;
    /* renamed from: j */
    private final PublisherAdViewOptions f19551j;
    /* renamed from: k */
    private final C0433m<String, zzrt> f19552k;
    /* renamed from: l */
    private final C0433m<String, zzrq> f19553l;
    /* renamed from: m */
    private final zzpy f19554m;
    /* renamed from: n */
    private final zzti f19555n;
    /* renamed from: o */
    private final zzli f19556o;
    /* renamed from: p */
    private final String f19557p;
    /* renamed from: q */
    private final zzaop f19558q;
    /* renamed from: r */
    private WeakReference<zzc> f19559r;
    /* renamed from: s */
    private final zzv f19560s;
    /* renamed from: t */
    private final Object f19561t = new Object();

    zzah(Context context, String str, zzyn zzyn, zzaop zzaop, zzkj zzkj, zzrk zzrk, zzrz zzrz, zzto zzto, zzrn zzrn, C0433m<String, zzrt> c0433m, C0433m<String, zzrq> c0433m2, zzpy zzpy, zzti zzti, zzli zzli, zzv zzv, zzrw zzrw, zzjo zzjo, PublisherAdViewOptions publisherAdViewOptions) {
        this.f19542a = context;
        this.f19557p = str;
        this.f19544c = zzyn;
        this.f19558q = zzaop;
        this.f19543b = zzkj;
        this.f19548g = zzrn;
        this.f19545d = zzrk;
        this.f19546e = zzrz;
        this.f19547f = zzto;
        this.f19552k = c0433m;
        this.f19553l = c0433m2;
        this.f19554m = zzpy;
        this.f19555n = zzti;
        this.f19556o = zzli;
        this.f19560s = zzv;
        this.f19549h = zzrw;
        this.f19550i = zzjo;
        this.f19551j = publisherAdViewOptions;
        zznw.m10901a(this.f19542a);
    }

    public final void zzd(zzjk zzjk) {
        m25955a(new C2398c(this, zzjk));
    }

    public final void zza(zzjk zzjk, int i) {
        if (i > 0) {
            m25955a(new C2399d(this, zzjk, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* renamed from: a */
    private final void m25950a(int i) {
        if (this.f19543b != 0) {
            try {
                this.f19543b.mo2463a(0);
            } catch (int i2) {
                zzaok.m10004c("Failed calling onAdFailedToLoad.", i2);
            }
        }
    }

    /* renamed from: a */
    private final void m25953a(zzjk zzjk) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bG)).booleanValue() || this.f19546e == null) {
            zza zzp = new zzp(this.f19542a, this.f19560s, this.f19550i, this.f19557p, this.f19544c, this.f19558q);
            this.f19559r = new WeakReference(zzp);
            zzrw zzrw = this.f19549h;
            Preconditions.checkMainThread("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            zzp.e.f7810s = zzrw;
            if (this.f19551j != null) {
                if (this.f19551j.zzbg() != null) {
                    zzp.zza(this.f19551j.zzbg());
                }
                zzp.setManualImpressionsEnabled(this.f19551j.getManualImpressionsEnabled());
            }
            zzrk zzrk = this.f19545d;
            Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            zzp.e.f7800i = zzrk;
            zzrz zzrz = this.f19546e;
            Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            zzp.e.f7802k = zzrz;
            zzrn zzrn = this.f19548g;
            Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
            zzp.e.f7801j = zzrn;
            C0433m c0433m = this.f19552k;
            Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            zzp.e.f7805n = c0433m;
            c0433m = this.f19553l;
            Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
            zzp.e.f7804m = c0433m;
            zzpy zzpy = this.f19554m;
            Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
            zzp.e.f7806o = zzpy;
            zzp.zzc(m25959c());
            zzp.zza(this.f19543b);
            zzp.zza(this.f19556o);
            List arrayList = new ArrayList();
            if (m25957b()) {
                arrayList.add(Integer.valueOf(1));
            }
            if (this.f19549h != null) {
                arrayList.add(Integer.valueOf(2));
            }
            zzp.zzd(arrayList);
            if (m25957b()) {
                zzjk.f20208c.putBoolean("ina", true);
            }
            if (this.f19549h != null) {
                zzjk.f20208c.putBoolean("iba", true);
            }
            zzp.zzb(zzjk);
            return;
        }
        m25950a((int) null);
    }

    /* renamed from: a */
    private final void m25954a(zzjk zzjk, int i) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bG)).booleanValue() || this.f19546e == null) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bH)).booleanValue() || this.f19547f == null) {
                zza zzbb = new zzbb(this.f19542a, this.f19560s, zzjo.m26616a(this.f19542a), this.f19557p, this.f19544c, this.f19558q);
                this.f19559r = new WeakReference(zzbb);
                zzrk zzrk = this.f19545d;
                Preconditions.checkMainThread("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
                zzbb.e.f7800i = zzrk;
                zzrz zzrz = this.f19546e;
                Preconditions.checkMainThread("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
                zzbb.e.f7802k = zzrz;
                zzto zzto = this.f19547f;
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setInstreamAdLoadCallback");
                zzbb.e.f7803l = zzto;
                zzrn zzrn = this.f19548g;
                Preconditions.checkMainThread("setOnContentAdLoadedListener must be called on the main UI thread.");
                zzbb.e.f7801j = zzrn;
                C0433m c0433m = this.f19552k;
                Preconditions.checkMainThread("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
                zzbb.e.f7805n = c0433m;
                zzbb.zza(this.f19543b);
                c0433m = this.f19553l;
                Preconditions.checkMainThread("setOnCustomClickListener must be called on the main UI thread.");
                zzbb.e.f7804m = c0433m;
                zzbb.zzc(m25959c());
                zzpy zzpy = this.f19554m;
                Preconditions.checkMainThread("setNativeAdOptions must be called on the main UI thread.");
                zzbb.e.f7806o = zzpy;
                zzti zzti = this.f19555n;
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setInstreamAdConfiguration");
                zzbb.e.f7808q = zzti;
                zzbb.zza(this.f19556o);
                zzbb.zzj(i);
                zzbb.zzb(zzjk);
                return;
            }
            m25950a(0);
            return;
        }
        m25950a(0);
    }

    /* renamed from: a */
    private final boolean m25956a() {
        return this.f19547f == null && this.f19549h != null;
    }

    /* renamed from: b */
    private final boolean m25957b() {
        if (this.f19545d == null && this.f19548g == null && this.f19546e == null) {
            if (this.f19552k == null || this.f19552k.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r0 = r3.f19561t;
        monitor-enter(r0);
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzc) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.getMediationAdapterClassName();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzcj() {
        /*
        r3 = this;
        r0 = r3.f19561t;
        monitor-enter(r0);
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzc) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.zzcj();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.zzcj():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isLoading() {
        /*
        r3 = this;
        r0 = r3.f19561t;
        monitor-enter(r0);
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0008:
        r1 = r3.f19559r;	 Catch:{ all -> 0x001a }
        r1 = r1.get();	 Catch:{ all -> 0x001a }
        r1 = (com.google.android.gms.ads.internal.zzc) r1;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r2 = r1.isLoading();	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r2;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzah.isLoading():boolean");
    }

    /* renamed from: c */
    private final List<String> m25959c() {
        List<String> arrayList = new ArrayList();
        if (this.f19548g != null) {
            arrayList.add("1");
        }
        if (this.f19545d != null) {
            arrayList.add("2");
        }
        if (this.f19546e != null) {
            arrayList.add("6");
        }
        if (this.f19552k.size() > 0) {
            arrayList.add("3");
        }
        if (this.f19547f != null) {
            arrayList.add("2");
            arrayList.add("1");
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m25955a(Runnable runnable) {
        zzalo.f8872a.post(runnable);
    }
}
