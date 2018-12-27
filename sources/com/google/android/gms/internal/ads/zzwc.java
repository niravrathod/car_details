package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzwc {
    /* renamed from: a */
    private final Object f9816a;
    /* renamed from: b */
    private final Context f9817b;
    /* renamed from: c */
    private final String f9818c;
    /* renamed from: d */
    private final zzaop f9819d;
    /* renamed from: e */
    private zzamu<zzvr> f9820e;
    /* renamed from: f */
    private zzamu<zzvr> f9821f;
    /* renamed from: g */
    private zzwt f9822g;
    /* renamed from: h */
    private int f9823h;

    public zzwc(Context context, zzaop zzaop, String str) {
        this.f9816a = new Object();
        this.f9823h = 1;
        this.f9818c = str;
        this.f9817b = context.getApplicationContext();
        this.f9819d = zzaop;
        this.f9820e = new zzwo();
        this.f9821f = new zzwo();
    }

    public zzwc(Context context, zzaop zzaop, String str, zzamu<zzvr> zzamu, zzamu<zzvr> zzamu2) {
        this(context, zzaop, str);
        this.f9820e = zzamu;
        this.f9821f = zzamu2;
    }

    /* renamed from: a */
    protected final zzwt m11172a(zzck zzck) {
        zzapy zzwt = new zzwt(this.f9821f);
        zzapn.f8961a.execute(new vk(this, zzck, zzwt));
        zzwt.mo2373a(new vs(this, zzwt), new vt(this, zzwt));
        return zzwt;
    }

    /* renamed from: b */
    public final zzwp m11175b(zzck zzck) {
        synchronized (this.f9816a) {
            zzwp c;
            if (this.f9822g != null) {
                if (this.f9822g.m21295b() != -1) {
                    if (this.f9823h == 0) {
                        c = this.f9822g.m26861c();
                        return c;
                    } else if (this.f9823h == 1) {
                        this.f9823h = 2;
                        m11172a(null);
                        c = this.f9822g.m26861c();
                        return c;
                    } else if (this.f9823h == 2) {
                        c = this.f9822g.m26861c();
                        return c;
                    } else {
                        c = this.f9822g.m26861c();
                        return c;
                    }
                }
            }
            this.f9823h = 2;
            this.f9822g = m11172a(null);
            c = this.f9822g.m26861c();
            return c;
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m11173a(zzck zzck, zzwt zzwt) {
        try {
            zzvr zzve;
            Context context = this.f9817b;
            zzaop zzaop = this.f9819d;
            if (((Boolean) zzkd.m10713e().m10897a(zznw.am)).booleanValue()) {
                zzve = new zzve(context, zzaop);
            } else {
                zzve = new zzvt(context, zzaop, zzck, null);
            }
            zzve.mo4816a(new vl(this, zzwt, zzve));
            zzve.mo4821a("/jsLoaded", new vo(this, zzwt, zzve));
            zzanq zzanq = new zzanq();
            zzu vpVar = new vp(this, zzck, zzve, zzanq);
            zzanq.m9932a(vpVar);
            zzve.mo4821a("/requestReload", vpVar);
            if (this.f9818c.endsWith(".js") != null) {
                zzve.mo4817a(this.f9818c);
            } else if (this.f9818c.startsWith("<html>") != null) {
                zzve.mo4819c(this.f9818c);
            } else {
                zzve.mo4820d(this.f9818c);
            }
            zzalo.f8872a.postDelayed(new vq(this, zzwt, zzve), (long) vu.f8460a);
        } catch (Throwable th) {
            zzaok.m10002b("Error creating webview.", th);
            zzbv.zzeo().m9714a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzwt.m21292a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final /* synthetic */ void m11174a(com.google.android.gms.internal.ads.zzwt r4, com.google.android.gms.internal.ads.zzvr r5) {
        /*
        r3 = this;
        r0 = r3.f9816a;
        monitor-enter(r0);
        r1 = r4.m21295b();	 Catch:{ all -> 0x002a }
        r2 = -1;
        if (r1 == r2) goto L_0x0028;
    L_0x000a:
        r1 = r4.m21295b();	 Catch:{ all -> 0x002a }
        r2 = 1;
        if (r1 != r2) goto L_0x0012;
    L_0x0011:
        goto L_0x0028;
    L_0x0012:
        r4.m21292a();	 Catch:{ all -> 0x002a }
        r4 = com.google.android.gms.internal.ads.zzapn.f8961a;	 Catch:{ all -> 0x002a }
        r5.getClass();	 Catch:{ all -> 0x002a }
        r5 = com.google.android.gms.internal.ads.vn.m9403a(r5);	 Catch:{ all -> 0x002a }
        r4.execute(r5);	 Catch:{ all -> 0x002a }
        r4 = "Could not receive loaded message in a timely manner. Rejecting.";
        com.google.android.gms.internal.ads.zzalg.m21225a(r4);	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x002a:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.a(com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzvr):void");
    }
}
