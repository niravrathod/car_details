package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzop;
import com.google.android.gms.internal.ads.zzyn;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public abstract class zzh extends zzc implements zzaf, zzabs {
    /* renamed from: k */
    private boolean f21604k;

    public zzh(Context context, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        super(context, zzjo, str, zzyn, zzaop, zzv);
    }

    /* renamed from: a */
    protected zzasg mo4982a(zzakn zzakn, zzw zzw, zzajy zzajy) {
        zzakn zzakn2 = zzakn;
        View nextView = this.e.f7794c.getNextView();
        if (nextView instanceof zzasg) {
            ((zzasg) nextView).destroy();
        }
        if (nextView != null) {
            r11.e.f7794c.removeView(nextView);
        }
        zzbv.zzel();
        zzasg a = zzasm.m10092a(r11.e.zzrx, zzatt.m10130a(r11.e.zzadk), r11.e.zzadk.f20227a, false, false, r11.e.f7793b, r11.e.zzadg, r11.a, this, r11.i, zzakn2.f8814i);
        if (r11.e.zzadk.f20233g == null) {
            m25942a(a.getView());
        }
        a.mo4782u().mo2397a(this, this, this, this, this, false, null, zzw, this, zzajy);
        m28936a(a);
        a.mo4739a(zzakn2.f8806a.f19754v);
        return a;
    }

    /* renamed from: a */
    protected final void m28936a(zzasg zzasg) {
        zzasg.mo4740a("/trackActiveViewUnit", new aj(this));
    }

    /* renamed from: d */
    protected void mo4937d() {
        super.mo4937d();
        if (this.f21604k) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bB)).booleanValue()) {
                m28937b(this.e.zzadl.f8781b);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    final void m28937b(zzasg zzasg) {
        if (this.e.zzadl != null) {
            this.g.m21684a(this.e.zzadk, this.e.zzadl, zzasg.getView(), zzasg);
            this.f21604k = null;
            return;
        }
        this.f21604k = true;
        zzaok.m10007e("Request to enable ActiveView before adState is available.");
    }

    protected void zza(zzakn zzakn, zzoj zzoj) {
        if (zzakn.f8810e != -2) {
            zzalo.f8872a.post(new ak(this, zzakn));
            return;
        }
        if (zzakn.f8809d != null) {
            this.e.zzadk = zzakn.f8809d;
        }
        if (!zzakn.f8807b.f19792g || zzakn.f8807b.f19811z) {
            zzalo.f8872a.post(new al(this, zzakn, this.i.zzxl.mo2327a(this.e.zzrx, this.e.zzadg, zzakn.f8807b), zzoj));
            return;
        }
        this.e.zzaen = 0;
        zzbw zzbw = this.e;
        zzbv.zzej();
        zzbw.zzadj = zzacs.m9460a(this.e.zzrx, this, zzakn, this.e.f7793b, null, this.j, this, zzoj);
    }

    protected boolean zza(com.google.android.gms.internal.ads.zzakm r3, com.google.android.gms.internal.ads.zzakm r4) {
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
        r0 = r2.e;
        r0 = r0.zzfn();
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r0 = r2.e;
        r0 = r0.f7794c;
        if (r0 == 0) goto L_0x001b;
    L_0x000e:
        r0 = r2.e;
        r0 = r0.f7794c;
        r0 = r0.zzfq();
        r1 = r4.f8760A;
        r0.m9893c(r1);
    L_0x001b:
        r0 = r4.f8781b;	 Catch:{ RuntimeException -> 0x003f }
        if (r0 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x003f }
    L_0x001f:
        r0 = r4.f8793n;	 Catch:{ RuntimeException -> 0x003f }
        if (r0 != 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x003f }
    L_0x0023:
        r0 = r4.f8772M;	 Catch:{ RuntimeException -> 0x003f }
        if (r0 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x003f }
    L_0x0027:
        r0 = r4.f8780a;	 Catch:{ RuntimeException -> 0x003f }
        r0 = r0.f20208c;	 Catch:{ RuntimeException -> 0x003f }
        r1 = "sdk_less_server_data";	 Catch:{ RuntimeException -> 0x003f }
        r0 = r0.containsKey(r1);	 Catch:{ RuntimeException -> 0x003f }
        if (r0 != 0) goto L_0x0044;
    L_0x0033:
        r0 = r4.f8781b;	 Catch:{ Throwable -> 0x0039 }
        r0.mo4730J();	 Catch:{ Throwable -> 0x0039 }
        goto L_0x0044;
    L_0x0039:
        r0 = "Could not render test Ad label.";	 Catch:{ RuntimeException -> 0x003f }
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);	 Catch:{ RuntimeException -> 0x003f }
        goto L_0x0044;
    L_0x003f:
        r0 = "Could not render test AdLabel.";
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
    L_0x0044:
        if (r4 == 0) goto L_0x0051;
    L_0x0046:
        r0 = r4.f8781b;
        if (r0 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r4.f8781b;
        r1 = r4.f8775P;
        r0.mo4758f(r1);
    L_0x0051:
        r3 = super.zza(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzh.zza(com.google.android.gms.internal.ads.zzakm, com.google.android.gms.internal.ads.zzakm):boolean");
    }

    public final void zza(zzop zzop) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.e.f7812u = zzop;
    }

    public final void zzh(View view) {
        this.e.f7816y = view;
        zzb(new zzakm(this.e.zzadm, null, null, null, null, null, null, null));
    }

    public final void zzcm() {
        onAdClicked();
    }

    public final void zzcn() {
        recordImpression();
        zzbm();
    }

    /* renamed from: h */
    protected final boolean m28939h() {
        return (this.e.zzadm == null || this.e.zzadm.f8807b == null || !this.e.zzadm.f8807b.f19776Q) ? false : true;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        q_();
    }

    public final void zzcp() {
        n_();
    }
}
