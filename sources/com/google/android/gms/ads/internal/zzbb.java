package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p017f.C0433m;
import android.util.Log;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzadw;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzop;
import com.google.android.gms.internal.ads.zzoz;
import com.google.android.gms.internal.ads.zzpb;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzpf;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzpk;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzpm;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zzpo;
import com.google.android.gms.internal.ads.zzpq;
import com.google.android.gms.internal.ads.zzqk;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzbb extends zzc implements zzpn {
    /* renamed from: k */
    private final Object f21595k;
    @VisibleForTesting
    /* renamed from: l */
    private boolean f21596l;
    /* renamed from: m */
    private zzaps<zzpo> f21597m;
    /* renamed from: n */
    private zzasg f21598n;
    /* renamed from: o */
    private zzasg f21599o;
    /* renamed from: p */
    private boolean f21600p;
    /* renamed from: q */
    private int f21601q;
    @GuardedBy("mLock")
    /* renamed from: r */
    private zzadw f21602r;
    /* renamed from: s */
    private final String f21603s;

    public zzbb(Context context, zzv zzv, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop) {
        this(context, zzv, zzjo, str, zzyn, zzaop, false);
    }

    public zzbb(Context context, zzv zzv, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop, boolean z) {
        super(context, zzjo, str, zzyn, zzaop, zzv);
        this.f21595k = new Object();
        this.f21597m = new zzaps();
        this.f21601q = 1;
        this.f21603s = UUID.randomUUID().toString();
        this.f21596l = z;
    }

    public final String getUuid() {
        return this.f21603s;
    }

    public final boolean zza(zzjk zzjk, zzoj zzoj) {
        try {
            m28933h();
            return super.zza(zzjk, zzoj, this.f21601q);
        } catch (zzjk zzjk2) {
            zzoj = "Error initializing webview.";
            if (zzaok.m10000a(4)) {
                Log.i(AdRequest.LOGTAG, zzoj, zzjk2);
            }
            return null;
        }
    }

    /* renamed from: h */
    final void m28933h() {
        synchronized (this.f21595k) {
            zzalg.m21225a("Initializing webview native ads utills");
            this.f21602r = new zzaea(this.e.zzrx, this, this.f21603s, this.e.f7793b, this.e.zzadg);
        }
    }

    public final zzadw zzds() {
        zzadw zzadw;
        synchronized (this.f21595k) {
            zzadw = this.f21602r;
        }
        return zzadw;
    }

    public final void zza(zzakn zzakn, zzoj zzoj) {
        if (zzakn.f8809d != null) {
            this.e.zzadk = zzakn.f8809d;
        }
        if (zzakn.f8810e != -2) {
            zzalo.f8872a.post(new C2413q(this, zzakn));
            return;
        }
        int i = zzakn.f8806a.f19731Y;
        int i2 = 0;
        if (i == 1) {
            this.e.zzaen = 0;
            zzbw zzbw = this.e;
            zzbv.zzej();
            zzbw.zzadj = zzacs.m9460a(this.e.zzrx, this, zzakn, this.e.f7793b, null, this.j, this, zzoj);
            zzakn = "AdRenderer: ";
            zzoj = String.valueOf(this.e.zzadj.getClass().getName());
            zzaok.m10001b(zzoj.length() != 0 ? zzakn.concat(zzoj) : new String(zzakn));
            return;
        }
        zzoj = new JSONArray();
        try {
            JSONArray jSONArray = new JSONObject(zzakn.f8807b.f19787b).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONArray optJSONArray = jSONArray.getJSONObject(i3).optJSONArray("ads");
                int i4 = 0;
                while (optJSONArray != null && i4 < optJSONArray.length()) {
                    zzoj.put(optJSONArray.get(i4));
                    i4++;
                }
            }
            m28926m();
            List arrayList = new ArrayList();
            for (int i5 = 0; i5 < i; i5++) {
                arrayList.add(zzalm.m9773a(new C2415s(this, i5, zzoj, i, zzakn)));
            }
            while (i2 < arrayList.size()) {
                try {
                    zzalo.f8872a.post(new C2416t(this, (zzpo) ((zzapi) arrayList.get(i2)).get(((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue(), TimeUnit.MILLISECONDS), i2, arrayList));
                } catch (zzakn zzakn2) {
                    zzaok.m10004c("", zzakn2);
                    Thread.currentThread().interrupt();
                } catch (zzakn zzakn22) {
                    zzaok.m10004c("", zzakn22);
                }
                i2++;
            }
        } catch (zzakn zzakn222) {
            zzaok.m10004c("Malformed native ad response", zzakn222);
            mo4933a(0);
        }
    }

    /* renamed from: a */
    protected final void mo4933a(int i) {
        mo4934a(i, false);
    }

    /* renamed from: a */
    protected final void mo4934a(int i, boolean z) {
        m28926m();
        super.mo4934a(i, z);
    }

    /* renamed from: a */
    protected final boolean mo4936a(zzjk zzjk, zzakm zzakm, boolean z) {
        return this.d.zzea();
    }

    protected final boolean zza(zzakm zzakm, zzakm zzakm2) {
        zzakm zzakm3 = zzakm2;
        List list = null;
        zzc(null);
        if (this.e.zzfn()) {
            if (zzakm3.f8793n) {
                m28926m();
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
                        m28921a(zzpi);
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
                        m28921a(zzpi);
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
                        m28919a(zzpb);
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
                        m28921a(zzpi2);
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
                        zzpd zzpd = r10;
                        zzpd.mo4264a(new zzpl(r7.e.zzrx, (zzpn) this, r7.e.f7793b, r5, r10));
                        m28920a(zzpd);
                    } else if (n == null || r7.e.f7805n == null || r7.e.f7805n.get(n.mo2666b()) == null) {
                        zzaok.m10007e("No matching mapper/listener for retrieved native ad template.");
                        mo4933a(0);
                        return false;
                    } else {
                        zzalo.f8872a.post(new C2421y(r7, n));
                    }
                } catch (Throwable e2) {
                    zzaok.m10006d("#007 Could not call remote method.", e2);
                }
            } else {
                zzpo zzpo = zzakm3.f8762C;
                if (r7.f21596l) {
                    m28922a("Google", zzakm3.f8773N);
                    r7.f21597m.m21290b(zzpo);
                } else {
                    boolean z = zzpo instanceof zzpd;
                    if (z && r7.e.f7802k != null) {
                        m28922a("Google", zzakm3.f8773N);
                        m28921a(m28923b(zzakm3.f8762C));
                    } else if (!z || r7.e.f7801j == null) {
                        z = zzpo instanceof zzpb;
                        if (z && r7.e.f7802k != null) {
                            m28922a("Google", zzakm3.f8773N);
                            m28921a(m28923b(zzakm3.f8762C));
                        } else if (!z || r7.e.f7800i == null) {
                            if ((zzpo instanceof zzpf) && r7.e.f7805n != null) {
                                zzpf zzpf = (zzpf) zzpo;
                                if (r7.e.f7805n.get(zzpf.mo4265b()) != null) {
                                    zzalo.f8872a.post(new C2420x(r7, zzpf.mo4265b(), zzakm3));
                                }
                            }
                            if (!(zzpo instanceof zzoz) || r7.e.f7803l == null) {
                                zzaok.m10007e("No matching listener for retrieved native ad template.");
                                mo4933a(0);
                                return false;
                            }
                            zzalo.f8872a.post(new C2414r(r7, (zzoz) zzpo));
                        } else {
                            m28922a("Google", zzakm3.f8773N);
                            m28919a((zzpb) zzakm3.f8762C);
                        }
                    } else {
                        m28922a("Google", zzakm3.f8773N);
                        m28920a((zzpd) zzakm3.f8762C);
                    }
                }
            }
            return super.zza(zzakm, zzakm2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* renamed from: a */
    protected final void m28929a(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = iObjectWrapper != null ? ObjectWrapper.m26020a(iObjectWrapper) : null;
        if (iObjectWrapper instanceof zzpm) {
            ((zzpm) iObjectWrapper).mo2602e();
        }
        super.m28081b(this.e.zzadl, false);
    }

    /* renamed from: i */
    protected final Future<zzpo> m28934i() {
        return this.f21597m;
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* renamed from: a */
    private final void m28919a(zzpb zzpb) {
        zzalo.f8872a.post(new C2417u(this, zzpb));
    }

    /* renamed from: a */
    private final void m28921a(zzpi zzpi) {
        zzalo.f8872a.post(new C2418v(this, zzpi));
    }

    /* renamed from: a */
    private final void m28920a(zzpd zzpd) {
        zzalo.f8872a.post(new C2419w(this, zzpd));
    }

    /* renamed from: a */
    private final void m28922a(String str, boolean z) {
        if (!z) {
            return;
        }
        if (this.f21599o || this.f21598n) {
            String str2;
            Object obj = null;
            z = this.f21599o;
            if (this.f21598n != null) {
                obj = 1;
            }
            zzasg zzasg = null;
            if (z) {
                str2 = null;
                zzasg = this.f21599o;
            } else if (obj != null) {
                zzasg = this.f21598n;
                str2 = "javascript";
            } else {
                str2 = null;
            }
            if (zzasg.getWebView() && zzbv.zzfb().m9454a(this.e.zzrx)) {
                z = this.e.zzadg.f19894b;
                int i = this.e.zzadg.f19895c;
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append(z);
                stringBuilder.append(".");
                stringBuilder.append(i);
                this.h = zzbv.zzfb().m9451a(stringBuilder.toString(), zzasg.getWebView(), "", "javascript", str2, str);
                if (this.h != null) {
                    zzasg.mo4736a(this.h);
                    if (obj != null) {
                        str = this.h;
                        z = this.f21598n.getView();
                        if (z) {
                            zzbv.zzfb().m9453a(str, z);
                        }
                    }
                    zzbv.zzfb().m9452a(this.h);
                }
            }
        }
    }

    /* renamed from: k */
    private final boolean m28924k() {
        return this.e.zzadl != null && this.e.zzadl.f8773N;
    }

    public final void zzi(View view) {
        Object obj = this.f21599o != null ? 1 : null;
        if (m28924k() && this.h != null && obj != null && view != null) {
            zzbv.zzfb().m9453a(this.h, view);
        }
    }

    public final void zzcq() {
        if (m28924k() && this.h != null) {
            zzasg zzasg = null;
            if (this.f21599o != null) {
                zzasg = this.f21599o;
            } else if (this.f21598n != null) {
                zzasg = this.f21598n;
            }
            if (zzasg != null) {
                zzasg.mo4743a("onSdkImpression", new HashMap());
            }
        }
    }

    /* renamed from: d */
    protected final void mo4937d() {
        mo4935a(false);
    }

    /* renamed from: a */
    protected final void mo4935a(boolean z) {
        super.mo4935a(z);
        if (this.f21600p) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bB)).booleanValue()) {
                zzdu();
            }
        }
    }

    public final void zza(zzpm zzpm) {
        if (this.e.zzadl.f8790k != null && this.e.f7808q == null) {
            zzbv.zzeo().m9721f().m21685a(this.e.zzadk, this.e.zzadl, new zzey(zzpm), (zzasg) null);
        }
    }

    public final void zzdu() {
        if (this.e.zzadl != null) {
            if (this.f21598n != null) {
                zzbv.zzeo().m9721f().m21684a(this.e.zzadk, this.e.zzadl, this.f21598n.getView(), this.f21598n);
                this.f21600p = false;
                return;
            }
        }
        this.f21600p = true;
        zzaok.m10007e("Request to enable ActiveView before adState is available.");
    }

    public final void zzdv() {
        this.f21600p = false;
        if (this.e.zzadl != null) {
            if (this.f21598n != null) {
                zzbv.zzeo().m9721f().m21680a(this.e.zzadl);
                return;
            }
        }
        zzaok.m10007e("Request to enable ActiveView before adState is available.");
    }

    public final String getAdUnitId() {
        return this.e.zzade;
    }

    public final void zzc(List<String> list) {
        Preconditions.checkMainThread("setNativeTemplates must be called on the main UI thread.");
        this.e.f7815x = list;
    }

    public final zzrq zzt(String str) {
        Preconditions.checkMainThread("getOnCustomClickListener must be called on the main UI thread.");
        if (this.e.f7804m == null) {
            return null;
        }
        return (zzrq) this.e.f7804m.get(str);
    }

    public final C0433m<String, zzrt> zzdw() {
        Preconditions.checkMainThread("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.e.f7805n;
    }

    public final void zzj(int i) {
        Preconditions.checkMainThread("setMaxNumberOfAds must be called on the main UI thread.");
        this.f21601q = i;
    }

    public final void zzf(zzasg zzasg) {
        this.f21598n = zzasg;
    }

    public final void zzg(zzasg zzasg) {
        this.f21599o = zzasg;
    }

    public final void zzcs() {
        if (this.f21598n != null) {
            this.f21598n.destroy();
            this.f21598n = null;
        }
    }

    public final void zzcr() {
        this.h = null;
        if (this.f21599o != null) {
            this.f21599o.destroy();
            this.f21599o = null;
        }
    }

    public final void zza(zzpk zzpk) {
        if (this.f21598n != null) {
            this.f21598n.mo4738a(zzpk);
        }
    }

    public final void zzdx() {
        if (this.f21598n == null || this.f21598n.mo4198b() == null || this.e.f7806o == null || this.e.f7806o.f20345f == null) {
            if (!(this.e.f7803l == null || this.f21598n == null || this.f21598n.mo4198b() == null)) {
                this.f21598n.mo4198b().m26365a(false, true, false);
            }
            return;
        }
        this.f21598n.mo4198b().m26362a(this.e.f7806o.f20345f);
    }

    public final boolean zzct() {
        return m28925l() != null ? m28925l().f9872p : false;
    }

    public final boolean zzcu() {
        return m28925l() != null ? m28925l().f9873q : false;
    }

    public final boolean zzcv() {
        return m28925l() != null ? m28925l().f9874r : false;
    }

    /* renamed from: l */
    private final zzxy m28925l() {
        return (this.e.zzadl == null || !this.e.zzadl.f8793n) ? null : this.e.zzadl.f8797r;
    }

    public final void zza(zzacd zzacd) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void zza(zzop zzop) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zzcd() {
        if (this.e.zzadl == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzadl.f8796q)) {
            super.zzcd();
        } else {
            zzbs();
        }
    }

    public final void zzci() {
        if (this.e.zzadl == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzadl.f8796q)) {
            super.zzci();
        } else {
            zzbr();
        }
    }

    public final void zzcc() {
        zzakm zzakm = this.e.zzadl;
        if (zzakm.f8795p == null) {
            super.zzcc();
            return;
        }
        try {
            zzyq zzyq = zzakm.f8795p;
            zzly zzly = null;
            zzyz h = zzyq.mo2777h();
            if (h != null) {
                zzly = h.mo2818m();
            } else {
                zzzc i = zzyq.mo2778i();
                if (i != null) {
                    zzly = i.mo2838l();
                } else {
                    zzrg n = zzyq.mo2783n();
                    if (n != null) {
                        zzly = n.mo2670g();
                    }
                }
            }
            if (zzly != null) {
                zzmb h2 = zzly.mo2561h();
                if (h2 != null) {
                    h2.mo2568d();
                }
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    private static zzpi m28923b(zzpo zzpo) {
        Object a;
        zzpi zzpi;
        zzpo zzpo2 = zzpo;
        Object obj = null;
        if (zzpo2 instanceof zzpd) {
            zzpd zzpd = (zzpd) zzpo2;
            zzpi zzpi2 = new zzpi(zzpd.mo2650e(), zzpd.mo2633f(), zzpd.mo2654i(), zzpd.mo2655j(), zzpd.mo2656k(), zzpd.mo2657l(), -1.0d, null, null, zzpd.mo4266c(), zzpd.mo2658m(), zzpd.mo4267d(), zzpd.mo2652g(), zzpd.mo2653h(), zzpd.mo2660o());
            if (zzpd.mo2659n() != null) {
                a = ObjectWrapper.m26020a(zzpd.mo2659n());
            }
            if (obj instanceof zzpq) {
                zzpi.mo4264a((zzpq) obj);
            }
            return zzpi;
        }
        if (zzpo2 instanceof zzpb) {
            zzpb zzpb = (zzpb) zzpo2;
            zzpi2 = new zzpi(zzpb.mo2632e(), zzpb.mo2633f(), zzpb.mo2634g(), zzpb.mo2635h(), zzpb.mo2636i(), null, zzpb.mo2637j(), zzpb.mo2638k(), zzpb.mo2639l(), zzpb.mo4266c(), zzpb.mo2640m(), zzpb.mo4267d(), zzpb.mo2643p(), zzpb.mo2644q(), zzpb.mo2642o());
            if (zzpb.mo2641n() != null) {
                a = ObjectWrapper.m26020a(zzpb.mo2641n());
            }
        } else {
            zzpi = null;
        }
        if (obj instanceof zzpq) {
            zzpi.mo4264a((zzpq) obj);
        }
        return zzpi;
        obj = a;
        if (obj instanceof zzpq) {
            zzpi.mo4264a((zzpq) obj);
        }
        return zzpi;
    }

    /* renamed from: a */
    private static void m28918a(zzbw zzbw, zzbw zzbw2) {
        if (zzbw2.f7800i == null) {
            zzbw2.f7800i = zzbw.f7800i;
        }
        if (zzbw2.f7801j == null) {
            zzbw2.f7801j = zzbw.f7801j;
        }
        if (zzbw2.f7804m == null) {
            zzbw2.f7804m = zzbw.f7804m;
        }
        if (zzbw2.f7805n == null) {
            zzbw2.f7805n = zzbw.f7805n;
        }
        if (zzbw2.f7807p == null) {
            zzbw2.f7807p = zzbw.f7807p;
        }
        if (zzbw2.f7806o == null) {
            zzbw2.f7806o = zzbw.f7806o;
        }
        if (zzbw2.f7815x == null) {
            zzbw2.f7815x = zzbw.f7815x;
        }
        if (zzbw2.zzadn == null) {
            zzbw2.zzadn = zzbw.zzadn;
        }
        if (zzbw2.zzael == null) {
            zzbw2.zzael = zzbw.zzael;
        }
        if (zzbw2.f7795d == null) {
            zzbw2.f7795d = zzbw.f7795d;
        }
        if (zzbw2.f7796e == null) {
            zzbw2.f7796e = zzbw.f7796e;
        }
        if (zzbw2.zzadk == null) {
            zzbw2.zzadk = zzbw.zzadk;
        }
        if (zzbw2.zzadl == null) {
            zzbw2.zzadl = zzbw.zzadl;
        }
        if (zzbw2.zzadm == null) {
            zzbw2.zzadm = zzbw.zzadm;
        }
    }

    /* renamed from: m */
    private final void m28926m() {
        zzadw zzds = zzds();
        if (zzds != null) {
            zzds.mo2222a();
        }
    }
}
