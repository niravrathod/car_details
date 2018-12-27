package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafq;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzgn;
import com.google.android.gms.internal.ads.zzhx.zza.zzb;
import com.google.android.gms.internal.ads.zzia;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.ads.zzyn;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public abstract class zzc extends zza implements zzn, zzbo, zzxz {
    /* renamed from: j */
    protected final zzyn f21249j;
    /* renamed from: k */
    private transient boolean f21250k;

    public zzc(Context context, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        this(new zzbw(context, zzjo, str, zzaop), zzyn, null, zzv);
    }

    @VisibleForTesting
    private zzc(zzbw zzbw, zzyn zzyn, zzbl zzbl, zzv zzv) {
        super(zzbw, null, zzv);
        this.f21249j = zzyn;
        this.f21250k = null;
    }

    public final boolean zza(zzjk zzjk, zzoj zzoj, int i) {
        if (!mo4990j()) {
            return false;
        }
        Bundle bundle;
        zzakq h;
        zzbv.zzek();
        zzgn n = zzbv.zzeo().m9726k().mo2362n();
        String str = null;
        if (n == null) {
            bundle = null;
        } else {
            bundle = zzalo.m9776a(n);
        }
        this.d.cancel();
        this.e.zzaen = 0;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bK)).booleanValue()) {
            h = zzbv.zzeo().m9726k().mo2356h();
            zzad zzes = zzbv.zzes();
            Context context = this.e.zzrx;
            zzaop zzaop = this.e.zzadg;
            String str2 = this.e.zzade;
            if (h != null) {
                str = h.m9704d();
            }
            zzes.m8802a(context, zzaop, false, h, str, str2, null);
        } else {
            h = null;
        }
        return zza(m28076a(zzjk, bundle, h, i), zzoj);
    }

    public final boolean zza(zzafq zzafq, zzoj zzoj) {
        zzalc zzagk;
        this.a = zzoj;
        zzoj.m10929a("seq_num", zzafq.f8572g);
        zzoj.m10929a("request_id", zzafq.f8587v);
        zzoj.m10929a("session_id", zzafq.f8573h);
        if (zzafq.f8571f != null) {
            zzoj.m10929a("app_version", String.valueOf(zzafq.f8571f.versionCode));
        }
        zzoj = this.e;
        zzbv.zzeg();
        Context context = this.e.zzrx;
        zzia zzia = this.i.zzxm;
        if (zzafq.f8567b.f20208c.getBundle("sdk_less_server_data") != null) {
            zzagk = new zzagk(context, zzafq, this, zzia);
        } else {
            zzagk = new zzaeu(context, zzafq, this, zzia);
        }
        zzagk.m21224h();
        zzoj.zzadi = zzagk;
        return true;
    }

    public boolean zza(zzjk zzjk, zzoj zzoj) {
        return zza(zzjk, zzoj, 1);
    }

    public final void zzb(zzakm zzakm) {
        super.zzb(zzakm);
        if (zzakm.f8794o != null) {
            zzaok.m10001b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.e.f7794c != null) {
                this.e.f7794c.zzft();
            }
            zzaok.m10001b("Pinging network fill URLs.");
            zzbv.zzfe();
            zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, false, zzakm.f8794o.f9845j);
            if (!(zzakm.f8797r == null || zzakm.f8797r.f9863g == null || zzakm.f8797r.f9863g.size() <= 0)) {
                zzaok.m10001b("Pinging urls remotely");
                zzbv.zzek().m9837a(this.e.zzrx, zzakm.f8797r.f9863g);
            }
        } else {
            zzaok.m10001b("Enable the debug gesture detector on the admob ad frame.");
            if (this.e.f7794c != null) {
                this.e.f7794c.zzfs();
            }
        }
        if (zzakm.f8783d == 3 && zzakm.f8797r != null && zzakm.f8797r.f9862f != null) {
            zzaok.m10001b("Pinging no fill URLs.");
            zzbv.zzfe();
            zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, false, zzakm.f8797r.f9862f);
        }
    }

    protected boolean zza(zzakm zzakm, zzakm zzakm2) {
        if (!(zzakm == null || zzakm.f8798s == null)) {
            zzakm.f8798s.m26894a(null);
        }
        if (zzakm2.f8798s != null) {
            zzakm2.f8798s.m26894a((zzxz) this);
        }
        int i = 0;
        if (zzakm2.f8797r != null) {
            i = zzakm2.f8797r.f9875s;
            zzakm = zzakm2.f8797r.f9876t;
        } else {
            zzakm = null;
        }
        this.e.zzael.m9739a(i, zzakm);
        return true;
    }

    public void onAdClicked() {
        if (this.e.zzadl == null) {
            zzaok.m10007e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.e.zzadl.f8797r == null || this.e.zzadl.f8797r.f9859c == null)) {
            zzbv.zzfe();
            zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, this.e.zzadl, this.e.zzade, false, m25939a(this.e.zzadl.f8797r.f9859c, this.e.zzadl.f8775P));
        }
        if (!(this.e.zzadl.f8794o == null || this.e.zzadl.f8794o.f9841f == null)) {
            zzbv.zzfe();
            zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, this.e.zzadl, this.e.zzade, false, this.e.zzadl.f8794o.f9841f);
        }
        super.onAdClicked();
    }

    /* renamed from: a */
    final boolean mo4691a(zzakm zzakm) {
        zzjk zzjk;
        boolean z = false;
        if (this.f != null) {
            zzjk = this.f;
            this.f = null;
        } else {
            zzjk = zzakm.f8780a;
            if (zzjk.f20208c != null) {
                z = zzjk.f20208c.getBoolean("_noRefresh", false);
            }
        }
        return mo4936a(zzjk, zzakm, z);
    }

    /* renamed from: a */
    protected boolean mo4936a(zzjk zzjk, zzakm zzakm, boolean z) {
        if (!z && this.e.zzfn()) {
            if (zzakm.f8788i > 0) {
                this.d.zza(zzjk, zzakm.f8788i);
            } else if (zzakm.f8797r && zzakm.f8797r.f9866j > 0) {
                this.d.zza(zzjk, zzakm.f8797r.f9866j);
            } else if (!zzakm.f8793n && zzakm.f8783d == true) {
                this.d.zzg(zzjk);
            }
        }
        return this.d.zzea();
    }

    public void pause() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = "pause must be called on the main UI thread.";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r0);
        r0 = r2.e;
        r0 = r0.zzadl;
        if (r0 == 0) goto L_0x0027;
    L_0x000b:
        r0 = r2.e;
        r0 = r0.zzadl;
        r0 = r0.f8781b;
        if (r0 == 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.e;
        r0 = r0.zzfn();
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        com.google.android.gms.ads.internal.zzbv.zzem();
        r0 = r2.e;
        r0 = r0.zzadl;
        r0 = r0.f8781b;
        com.google.android.gms.internal.ads.zzalw.m9850a(r0);
    L_0x0027:
        r0 = r2.e;
        r0 = r0.zzadl;
        if (r0 == 0) goto L_0x0044;
    L_0x002d:
        r0 = r2.e;
        r0 = r0.zzadl;
        r0 = r0.f8795p;
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r0 = r2.e;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.zzadl;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.f8795p;	 Catch:{ RemoteException -> 0x003f }
        r0.mo2773d();	 Catch:{ RemoteException -> 0x003f }
        goto L_0x0044;
    L_0x003f:
        r0 = "Could not pause mediation adapter.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0044:
        r0 = r2.g;
        r1 = r2.e;
        r1 = r1.zzadl;
        r0.m21687c(r1);
        r0 = r2.d;
        r0.pause();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzc.pause():void");
    }

    public void resume() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = "resume must be called on the main UI thread.";
        com.google.android.gms.common.internal.Preconditions.checkMainThread(r0);
        r0 = r2.e;
        r0 = r0.zzadl;
        if (r0 == 0) goto L_0x001a;
    L_0x000b:
        r0 = r2.e;
        r0 = r0.zzadl;
        r0 = r0.f8781b;
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r0 = r2.e;
        r0 = r0.zzadl;
        r0 = r0.f8781b;
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 == 0) goto L_0x0031;
    L_0x001d:
        r1 = r2.e;
        r1 = r1.zzfn();
        if (r1 == 0) goto L_0x0031;
    L_0x0025:
        com.google.android.gms.ads.internal.zzbv.zzem();
        r1 = r2.e;
        r1 = r1.zzadl;
        r1 = r1.f8781b;
        com.google.android.gms.internal.ads.zzalw.m9851b(r1);
    L_0x0031:
        r1 = r2.e;
        r1 = r1.zzadl;
        if (r1 == 0) goto L_0x004e;
    L_0x0037:
        r1 = r2.e;
        r1 = r1.zzadl;
        r1 = r1.f8795p;
        if (r1 == 0) goto L_0x004e;
    L_0x003f:
        r1 = r2.e;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.zzadl;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.f8795p;	 Catch:{ RemoteException -> 0x0049 }
        r1.mo2774e();	 Catch:{ RemoteException -> 0x0049 }
        goto L_0x004e;
    L_0x0049:
        r1 = "Could not resume mediation adapter.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
    L_0x004e:
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r0.mo4724D();
        if (r0 != 0) goto L_0x005b;
    L_0x0056:
        r0 = r2.d;
        r0.resume();
    L_0x005b:
        r0 = r2.g;
        r1 = r2.e;
        r1 = r1.zzadl;
        r0.m21688d(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzc.resume():void");
    }

    /* renamed from: b */
    protected final boolean mo4692b(zzjk zzjk) {
        return (super.mo4692b(zzjk) == null || this.f21250k != null) ? null : true;
    }

    /* renamed from: j */
    protected boolean mo4990j() {
        zzbv.zzek();
        if (zzalo.m9800a(this.e.zzrx, "android.permission.INTERNET")) {
            zzbv.zzek();
            if (zzalo.m9799a(this.e.zzrx)) {
                return true;
            }
        }
        return false;
    }

    public void zzca() {
        this.f21250k = false;
        n_();
        this.e.zzadn.m9698c();
    }

    public void zzcb() {
        this.f21250k = true;
        q_();
    }

    public final void onPause() {
        this.g.m21687c(this.e.zzadl);
    }

    public final void onResume() {
        this.g.m21688d(this.e.zzadl);
    }

    public void zzcc() {
        zzaok.m10007e("Mediated ad does not support onVideoEnd callback");
    }

    public void zzcd() {
        onAdClicked();
    }

    public final void zzce() {
        zzca();
    }

    public final void zzcf() {
        p_();
    }

    public final void zzcg() {
        zzcb();
    }

    public final void zzch() {
        if (this.e.zzadl != null) {
            String str = this.e.zzadl.f8796q;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 74);
            stringBuilder.append("Mediation adapter ");
            stringBuilder.append(str);
            stringBuilder.append(" refreshed, but mediation adapters should never refresh.");
            zzaok.m10007e(stringBuilder.toString());
        }
        mo4989a(this.e.zzadl, true);
        m28081b(this.e.zzadl, true);
        mo4937d();
    }

    public void zzci() {
        recordImpression();
    }

    public final void zzb(String str, String str2) {
        onAppEvent(str, str2);
    }

    public final void zza(zzrg zzrg, String str) {
        zzrq zzrq = null;
        if (zzrg != null) {
            try {
                Object b = zzrg.mo2666b();
            } catch (zzrg zzrg2) {
                zzaok.m10004c("Unable to call onCustomClick.", zzrg2);
                return;
            }
        }
        b = null;
        if (!(this.e.f7804m == null || b == null)) {
            zzrq = (zzrq) this.e.f7804m.get(b);
        }
        if (zzrq == null) {
            zzaok.m10007e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzrq.mo2685a(zzrg2, str);
        }
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.ads.zzafq m28076a(com.google.android.gms.internal.ads.zzjk r59, android.os.Bundle r60, com.google.android.gms.internal.ads.zzakq r61, int r62) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r58 = this;
        r0 = r58;
        r1 = r0.e;
        r1 = r1.zzrx;
        r7 = r1.getApplicationInfo();
        r1 = 0;
        r2 = r0.e;	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r2.zzrx;	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2);	 Catch:{ NameNotFoundException -> 0x001b }
        r4 = r7.packageName;	 Catch:{ NameNotFoundException -> 0x001b }
        r2 = r2.getPackageInfo(r4, r1);	 Catch:{ NameNotFoundException -> 0x001b }
        r8 = r2;
        goto L_0x001c;
    L_0x001b:
        r8 = 0;
    L_0x001c:
        r2 = r0.e;
        r2 = r2.zzrx;
        r2 = r2.getResources();
        r4 = r2.getDisplayMetrics();
        r2 = r0.e;
        r2 = r2.f7794c;
        if (r2 == 0) goto L_0x0094;
    L_0x002e:
        r2 = r0.e;
        r2 = r2.f7794c;
        r2 = r2.getParent();
        if (r2 == 0) goto L_0x0094;
    L_0x0038:
        r2 = 2;
        r2 = new int[r2];
        r5 = r0.e;
        r5 = r5.f7794c;
        r5.getLocationOnScreen(r2);
        r5 = r2[r1];
        r6 = 1;
        r2 = r2[r6];
        r9 = r0.e;
        r9 = r9.f7794c;
        r9 = r9.getWidth();
        r10 = r0.e;
        r10 = r10.f7794c;
        r10 = r10.getHeight();
        r11 = r0.e;
        r11 = r11.f7794c;
        r11 = r11.isShown();
        if (r11 == 0) goto L_0x0072;
    L_0x0061:
        r11 = r5 + r9;
        if (r11 <= 0) goto L_0x0072;
    L_0x0065:
        r11 = r2 + r10;
        if (r11 <= 0) goto L_0x0072;
    L_0x0069:
        r11 = r4.widthPixels;
        if (r5 > r11) goto L_0x0072;
    L_0x006d:
        r11 = r4.heightPixels;
        if (r2 > r11) goto L_0x0072;
    L_0x0071:
        goto L_0x0073;
    L_0x0072:
        r6 = 0;
    L_0x0073:
        r11 = new android.os.Bundle;
        r12 = 5;
        r11.<init>(r12);
        r12 = "x";
        r11.putInt(r12, r5);
        r5 = "y";
        r11.putInt(r5, r2);
        r2 = "width";
        r11.putInt(r2, r9);
        r2 = "height";
        r11.putInt(r2, r10);
        r2 = "visible";
        r11.putInt(r2, r6);
        r12 = r11;
        goto L_0x0095;
    L_0x0094:
        r12 = 0;
    L_0x0095:
        r2 = r0.e;
        r5 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r5 = r5.m9729n();
        r6 = com.google.android.gms.ads.internal.zzbv.zzer();
        r9 = r0.e;
        r9 = r9.zzade;
        r5 = r5.m21212a(r6, r9);
        r2.zzadn = r5;
        r2 = r0.e;
        r2 = r2.zzadn;
        r14 = r59;
        r2.m9693a(r14);
        com.google.android.gms.ads.internal.zzbv.zzek();
        r2 = r0.e;
        r2 = r2.zzrx;
        r5 = r0.e;
        r5 = r5.f7794c;
        r6 = r0.e;
        r6 = r6.zzadk;
        r20 = com.google.android.gms.internal.ads.zzalo.m9782a(r2, r5, r6);
        r5 = 0;
        r2 = r0.e;
        r2 = r2.f7799h;
        if (r2 == 0) goto L_0x00e1;
    L_0x00d1:
        r2 = r0.e;	 Catch:{ RemoteException -> 0x00dc }
        r2 = r2.f7799h;	 Catch:{ RemoteException -> 0x00dc }
        r9 = r2.mo2536b();	 Catch:{ RemoteException -> 0x00dc }
        r21 = r9;
        goto L_0x00e3;
    L_0x00dc:
        r2 = "Cannot get correlation id, default to 0.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
    L_0x00e1:
        r21 = r5;
    L_0x00e3:
        r2 = java.util.UUID.randomUUID();
        r23 = r2.toString();
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = r2.m9729n();
        r5 = r0.e;
        r5 = r5.zzrx;
        r15 = r2.m21211a(r5, r0);
        r13 = new java.util.ArrayList;
        r13.<init>();
        r11 = new java.util.ArrayList;
        r11.<init>();
        r2 = 0;
    L_0x0106:
        r5 = r0.e;
        r5 = r5.f7805n;
        r5 = r5.size();
        if (r2 >= r5) goto L_0x0137;
    L_0x0110:
        r5 = r0.e;
        r5 = r5.f7805n;
        r5 = r5.m1585b(r2);
        r5 = (java.lang.String) r5;
        r13.add(r5);
        r6 = r0.e;
        r6 = r6.f7804m;
        r6 = r6.containsKey(r5);
        if (r6 == 0) goto L_0x0134;
    L_0x0127:
        r6 = r0.e;
        r6 = r6.f7804m;
        r6 = r6.get(r5);
        if (r6 == 0) goto L_0x0134;
    L_0x0131:
        r11.add(r5);
    L_0x0134:
        r2 = r2 + 1;
        goto L_0x0106;
    L_0x0137:
        r2 = new com.google.android.gms.ads.internal.ah;
        r2.<init>(r0);
        r34 = com.google.android.gms.internal.ads.zzalm.m9773a(r2);
        r2 = new com.google.android.gms.ads.internal.ai;
        r2.<init>(r0);
        r44 = com.google.android.gms.internal.ads.zzalm.m9773a(r2);
        if (r61 == 0) goto L_0x0152;
    L_0x014b:
        r2 = r61.m9703c();
        r35 = r2;
        goto L_0x0154;
    L_0x0152:
        r35 = 0;
    L_0x0154:
        r2 = r0.e;
        r2 = r2.f7815x;
        if (r2 == 0) goto L_0x01ac;
    L_0x015a:
        r2 = r0.e;
        r2 = r2.f7815x;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x01ac;
    L_0x0164:
        if (r8 == 0) goto L_0x0168;
    L_0x0166:
        r1 = r8.versionCode;
    L_0x0168:
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = r2.m9726k();
        r2 = r2.mo2355g();
        if (r1 <= r2) goto L_0x018d;
    L_0x0176:
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = r2.m9726k();
        r2.mo2361m();
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = r2.m9726k();
        r2.mo2334a(r1);
        goto L_0x01ac;
    L_0x018d:
        r1 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r1 = r1.m9726k();
        r1 = r1.mo2360l();
        if (r1 == 0) goto L_0x01ac;
    L_0x019b:
        r2 = r0.e;
        r2 = r2.zzade;
        r1 = r1.optJSONArray(r2);
        if (r1 == 0) goto L_0x01ac;
    L_0x01a5:
        r1 = r1.toString();
        r46 = r1;
        goto L_0x01ae;
    L_0x01ac:
        r46 = 0;
    L_0x01ae:
        r1 = new com.google.android.gms.internal.ads.zzafq;
        r2 = r1;
        r5 = r0.e;
        r5 = r5.zzadk;
        r6 = r0.e;
        r6 = r6.zzade;
        r9 = r0.e;
        r9 = r9.zzadn;
        r9 = r9.m9700e();
        r10 = com.google.android.gms.internal.ads.zzkd.m10714f();
        r3 = r0.e;
        r3 = r3.zzadg;
        r47 = r11;
        r11 = r3;
        r3 = r0.e;
        r3 = r3.f7815x;
        r48 = r13;
        r13 = r3;
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r3 = r3.m9726k();
        r16 = r3.mo2339a();
        r3 = r4.widthPixels;
        r17 = r3;
        r3 = r4.heightPixels;
        r18 = r3;
        r3 = r4.density;
        r19 = r3;
        r24 = com.google.android.gms.internal.ads.zznw.m10900a();
        r3 = r0.e;
        r3 = r3.f7792a;
        r25 = r3;
        r3 = r0.e;
        r3 = r3.f7806o;
        r26 = r3;
        r3 = r0.e;
        r27 = r3.zzfp();
        r3 = com.google.android.gms.ads.internal.zzbv.zzep();
        r28 = r3.m9876a();
        r3 = com.google.android.gms.ads.internal.zzbv.zzep();
        r29 = r3.m9879b();
        com.google.android.gms.ads.internal.zzbv.zzek();
        r3 = r0.e;
        r3 = r3.zzrx;
        r30 = com.google.android.gms.internal.ads.zzalo.m9825j(r3);
        com.google.android.gms.ads.internal.zzbv.zzek();
        r3 = r0.e;
        r3 = r3.f7794c;
        r31 = com.google.android.gms.internal.ads.zzalo.m9813d(r3);
        r3 = r0.e;
        r3 = r3.zzrx;
        r3 = r3 instanceof android.app.Activity;
        r32 = r3;
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r3 = r3.m9726k();
        r33 = r3.mo2354f();
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r36 = r3.m9718c();
        r3 = com.google.android.gms.ads.internal.zzbv.zzfh();
        r37 = r3.m10085a();
        com.google.android.gms.ads.internal.zzbv.zzek();
        r38 = com.google.android.gms.internal.ads.zzalo.m9808c();
        r3 = com.google.android.gms.ads.internal.zzbv.zzeu();
        r39 = r3.m9903a();
        r3 = r0.e;
        r3 = r3.f7809r;
        r40 = r3;
        r3 = com.google.android.gms.ads.internal.zzbv.zzeu();
        r41 = r3.m9907b();
        r3 = com.google.android.gms.internal.ads.zzuz.m11133a();
        r42 = r3.m11143j();
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r3 = r3.m9726k();
        r4 = r0.e;
        r4 = r4.zzade;
        r43 = r3.mo2352e(r4);
        r3 = r0.e;
        r3 = r3.f7811t;
        r45 = r3;
        r3 = r0.e;
        r3 = r3.zzrx;
        r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3);
        r49 = r3.isCallerInstantApp();
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r50 = r3.m9719d();
        com.google.android.gms.ads.internal.zzbv.zzem();
        r51 = com.google.android.gms.internal.ads.zzalw.m9852e();
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r3 = r3.m9728m();
        r56 = r1;
        r57 = r2;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r14 = 0;
        r1 = com.google.android.gms.internal.ads.zzaox.m10025a(r3, r14, r1, r4);
        r52 = r1;
        r52 = (java.util.ArrayList) r52;
        r1 = com.google.android.gms.ads.internal.zzbv.zzek();
        r2 = r0.e;
        r2 = r2.zzrx;
        r53 = r1.m9848m(r2);
        r1 = r0.e;
        r1 = r1.f7808q;
        r54 = r1;
        r1 = com.google.android.gms.ads.internal.zzbv.zzek();
        r2 = r0.e;
        r2 = r2.zzrx;
        r55 = r1.m9849n(r2);
        r3 = r12;
        r4 = r59;
        r12 = r15;
        r14 = r48;
        r15 = r60;
        r48 = r62;
        r2 = r57;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55);
        return r56;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzc.a(com.google.android.gms.internal.ads.zzjk, android.os.Bundle, com.google.android.gms.internal.ads.zzakq, int):com.google.android.gms.internal.ads.zzafq");
    }

    public final void recordImpression() {
        mo4989a(this.e.zzadl, false);
    }

    /* renamed from: a */
    protected void mo4989a(zzakm zzakm, boolean z) {
        if (zzakm == null) {
            zzaok.m10007e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (zzakm == null) {
            zzaok.m10007e("Ad state was null when trying to ping impression URLs.");
        } else {
            zzaok.m10001b("Pinging Impression URLs.");
            if (this.f19534e.zzadn != null) {
                this.f19534e.zzadn.m9691a();
            }
            zzakm.f8770K.m10684a(zzb.AD_IMPRESSION);
            if (!(zzakm.f8784e == null || zzakm.f8763D)) {
                zzbv.zzek();
                zzalo.m9792a(this.f19534e.zzrx, this.f19534e.zzadg.f19893a, m25939a(zzakm.f8784e, zzakm.f8775P));
                zzakm.f8763D = true;
            }
        }
        if (!zzakm.f8765F || z) {
            if (!(zzakm.f8797r == null || zzakm.f8797r.f9860d == null)) {
                zzbv.zzfe();
                zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, z, m25939a(zzakm.f8797r.f9860d, zzakm.f8775P));
            }
            if (!(zzakm.f8794o == null || zzakm.f8794o.f9842g == null)) {
                zzbv.zzfe();
                zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, z, zzakm.f8794o.f9842g);
            }
            zzakm.f8765F = true;
        }
    }

    /* renamed from: b */
    protected final void m28081b(zzakm zzakm, boolean z) {
        if (zzakm != null) {
            if (!(zzakm == null || zzakm.f8785f == null || zzakm.f8764E)) {
                zzbv.zzek();
                zzalo.m9792a(this.f19534e.zzrx, this.f19534e.zzadg.f19893a, m25938a(zzakm.f8785f));
                zzakm.f8764E = true;
            }
            if (!zzakm.f8766G || z) {
                if (!(zzakm.f8797r == null || zzakm.f8797r.f9861e == null)) {
                    zzbv.zzfe();
                    zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, z, m25938a(zzakm.f8797r.f9861e));
                }
                if (!(zzakm.f8794o == null || zzakm.f8794o.f9843h == null)) {
                    zzbv.zzfe();
                    zzyg.m11195a(this.e.zzrx, this.e.zzadg.f19893a, zzakm, this.e.zzade, z, zzakm.f8794o.f9843h);
                }
                zzakm.f8766G = true;
            }
        }
    }

    public final String getMediationAdapterClassName() {
        if (this.e.zzadl == null) {
            return null;
        }
        return this.e.zzadl.f8796q;
    }

    public final String zzcj() {
        if (this.e.zzadl == null) {
            return null;
        }
        return m28077b(this.e.zzadl);
    }

    /* renamed from: b */
    static java.lang.String m28077b(com.google.android.gms.internal.ads.zzakm r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        if (r2 != 0) goto L_0x0004;
    L_0x0002:
        r2 = 0;
        return r2;
    L_0x0004:
        r0 = r2.f8796q;
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0019;
    L_0x000e:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r1 = 0;
        goto L_0x001a;
    L_0x0019:
        r1 = 1;
    L_0x001a:
        if (r1 == 0) goto L_0x0030;
    L_0x001c:
        r1 = r2.f8794o;
        if (r1 == 0) goto L_0x0030;
    L_0x0020:
        r2 = r2.f8794o;
        r2 = r2.f9846k;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = "class_name";	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = r1.getString(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        return r2;
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzc.b(com.google.android.gms.internal.ads.zzakm):java.lang.String");
    }

    public void showInterstitial() {
        zzaok.m10007e("showInterstitial is not supported for current ad type");
    }

    public final void zzck() {
        Executor executor = zzapn.f8961a;
        zzbl zzbl = this.d;
        zzbl.getClass();
        executor.execute(af.m8777a(zzbl));
    }

    public final void zzcl() {
        Executor executor = zzapn.f8961a;
        zzbl zzbl = this.d;
        zzbl.getClass();
        executor.execute(ag.m8778a(zzbl));
    }
}
