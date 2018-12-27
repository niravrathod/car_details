package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

@zzaer
public abstract class zzacm implements zzami<Void>, zzato {
    /* renamed from: a */
    protected final Context f16768a;
    /* renamed from: b */
    protected final zzasg f16769b;
    /* renamed from: c */
    protected zzaft f16770c;
    /* renamed from: d */
    private final zzact f16771d;
    /* renamed from: e */
    private final zzakn f16772e;
    /* renamed from: f */
    private Runnable f16773f;
    /* renamed from: g */
    private final Object f16774g = new Object();
    /* renamed from: h */
    private AtomicBoolean f16775h = new AtomicBoolean(true);

    protected zzacm(Context context, zzakn zzakn, zzasg zzasg, zzact zzact) {
        this.f16768a = context;
        this.f16772e = zzakn;
        this.f16770c = this.f16772e.f8807b;
        this.f16769b = zzasg;
        this.f16771d = zzact;
    }

    /* renamed from: a */
    protected abstract void mo4168a();

    /* renamed from: a */
    public final void mo1722a(boolean z) {
        zzaok.m10001b("WebView finished loading.");
        int i = 0;
        if (this.f16775h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo4790a(i);
            zzalo.f8872a.removeCallbacks(this.f16773f);
        }
    }

    /* renamed from: b */
    public void mo2218b() {
        if (this.f16775h.getAndSet(false)) {
            this.f16769b.stopLoading();
            zzbv.zzem();
            zzalw.m9850a(this.f16769b);
            mo4790a(-1);
            zzalo.f8872a.removeCallbacks(this.f16773f);
        }
    }

    /* renamed from: a */
    protected void mo4790a(int i) {
        zzacm zzacm = this;
        int i2 = i;
        if (i2 != -2) {
            zzacm.f16770c = new zzaft(i2, zzacm.f16770c.f19795j);
        }
        zzacm.f16769b.mo4771o();
        zzact zzact = zzacm.f16771d;
        zzafp zzafp = zzacm.f16772e.f8806a;
        zzakm zzakm = r1;
        zzxy zzxy = null;
        zzact zzact2 = zzact;
        zzxy zzxy2 = null;
        zzakm zzakm2 = new zzakm(zzafp.f19735c, zzacm.f16769b, zzacm.f16770c.f19788c, i, zzacm.f16770c.f19790e, zzacm.f16770c.f19794i, zzacm.f16770c.f19796k, zzacm.f16770c.f19795j, zzafp.f19741i, zzacm.f16770c.f19792g, null, null, null, null, null, zzacm.f16770c.f19793h, zzacm.f16772e.f8809d, zzacm.f16770c.f19791f, zzacm.f16772e.f8811f, zzacm.f16770c.f19798m, zzacm.f16770c.f19799n, zzacm.f16772e.f8813h, null, zzacm.f16770c.f19760A, zzacm.f16770c.f19761B, zzacm.f16770c.f19762C, zzacm.f16770c.f19763D, zzacm.f16770c.f19764E, null, zzacm.f16770c.f19767H, zzacm.f16770c.f19771L, zzacm.f16772e.f8814i, zzacm.f16772e.f8807b.f19774O, zzacm.f16772e.f8815j, zzacm.f16772e.f8807b.f19776Q, zzacm.f16770c.f19777R, zzacm.f16772e.f8807b.f19778S, zzacm.f16772e.f8807b.f19779T, zzacm.f16772e.f8807b.f19781V);
        zzact2.zzb(zzakm);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2219c() {
        Preconditions.checkMainThread("Webview render task needs to be called on UI thread.");
        this.f16773f = new C2446r(this);
        zzalo.f8872a.postDelayed(this.f16773f, ((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue());
        mo4168a();
        return null;
    }
}
