package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.p017f.C0433m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaib;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzakz;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzanp;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzkg;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkz;
import com.google.android.gms.internal.ads.zzlc;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzop;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzrw;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzti;
import com.google.android.gms.internal.ads.zzto;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzbw implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: A */
    private HashSet<zzako> f7785A;
    /* renamed from: B */
    private int f7786B;
    /* renamed from: C */
    private int f7787C;
    /* renamed from: D */
    private zzanp f7788D;
    /* renamed from: E */
    private boolean f7789E;
    /* renamed from: F */
    private boolean f7790F;
    /* renamed from: G */
    private boolean f7791G;
    /* renamed from: a */
    final String f7792a;
    /* renamed from: b */
    final zzck f7793b;
    /* renamed from: c */
    zzbx f7794c;
    /* renamed from: d */
    zzkg f7795d;
    /* renamed from: e */
    zzkj f7796e;
    /* renamed from: f */
    zzlc f7797f;
    /* renamed from: g */
    zzkz f7798g;
    /* renamed from: h */
    zzli f7799h;
    /* renamed from: i */
    zzrk f7800i;
    /* renamed from: j */
    zzrn f7801j;
    /* renamed from: k */
    zzrz f7802k;
    /* renamed from: l */
    zzto f7803l;
    /* renamed from: m */
    C0433m<String, zzrq> f7804m;
    /* renamed from: n */
    C0433m<String, zzrt> f7805n;
    /* renamed from: o */
    zzpy f7806o;
    /* renamed from: p */
    zznf f7807p;
    /* renamed from: q */
    zzti f7808q;
    /* renamed from: r */
    zzme f7809r;
    /* renamed from: s */
    zzrw f7810s;
    /* renamed from: t */
    List<Integer> f7811t;
    /* renamed from: u */
    zzop f7812u;
    /* renamed from: v */
    zzaii f7813v;
    /* renamed from: w */
    zzaib f7814w;
    /* renamed from: x */
    List<String> f7815x;
    /* renamed from: y */
    View f7816y;
    /* renamed from: z */
    boolean f7817z;
    public String zzade;
    public final zzaop zzadg;
    public zzalc zzadi;
    public zzami zzadj;
    public zzjo zzadk;
    public zzakm zzadl;
    public zzakn zzadm;
    public zzako zzadn;
    public String zzaei;
    public String zzaej;
    public zzakz zzael;
    public int zzaen;
    public final Context zzrx;

    public zzbw(Context context, zzjo zzjo, String str, zzaop zzaop) {
        this(context, zzjo, str, zzaop, null);
    }

    private zzbw(Context context, zzjo zzjo, String str, zzaop zzaop, zzck zzck) {
        this.zzael = null;
        this.f7816y = null;
        this.zzaen = 0;
        this.f7817z = false;
        this.f7785A = null;
        this.f7786B = -1;
        this.f7787C = -1;
        this.f7789E = true;
        this.f7790F = true;
        this.f7791G = false;
        zznw.m10901a(context);
        if (zzbv.zzeo().m9711a() != null) {
            List b = zznw.m10903b();
            if (zzaop.f19894b != 0) {
                b.add(Integer.toString(zzaop.f19894b));
            }
            zzbv.zzeo().m9711a().m10913a(b);
        }
        this.f7792a = UUID.randomUUID().toString();
        if (!zzjo.f20230d) {
            if (!zzjo.f20234h) {
                this.f7794c = new zzbx(context, str, zzaop.f19893a, this, this);
                this.f7794c.setMinimumWidth(zzjo.f20232f);
                this.f7794c.setMinimumHeight(zzjo.f20229c);
                this.f7794c.setVisibility(4);
                this.zzadk = zzjo;
                this.zzade = str;
                this.zzrx = context;
                this.zzadg = zzaop;
                this.f7793b = new zzck(new zzag(this));
                this.f7788D = new zzanp(200);
                this.f7805n = new C0433m();
            }
        }
        this.f7794c = null;
        this.zzadk = zzjo;
        this.zzade = str;
        this.zzrx = context;
        this.zzadg = zzaop;
        this.f7793b = new zzck(new zzag(this));
        this.f7788D = new zzanp(200);
        this.f7805n = new C0433m();
    }

    /* renamed from: a */
    final void m8816a(View view) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bg)).booleanValue()) {
            zzcg a = this.f7793b.m10479a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    public final void zza(HashSet<zzako> hashSet) {
        this.f7785A = hashSet;
    }

    public final HashSet<zzako> zzfk() {
        return this.f7785A;
    }

    public final void zzfl() {
        if (this.zzadl != null && this.zzadl.f8781b != null) {
            this.zzadl.f8781b.destroy();
        }
    }

    public final void zzfm() {
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
        r1 = this;
        r0 = r1.zzadl;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r1.zzadl;
        r0 = r0.f8795p;
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = r1.zzadl;	 Catch:{ RemoteException -> 0x0012 }
        r0 = r0.f8795p;	 Catch:{ RemoteException -> 0x0012 }
        r0.mo2772c();	 Catch:{ RemoteException -> 0x0012 }
        return;
    L_0x0012:
        r0 = "Could not destroy mediation adapter.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbw.zzfm():void");
    }

    public final boolean zzfn() {
        return this.zzaen == 0;
    }

    public final boolean zzfo() {
        return this.zzaen == 1;
    }

    public final void onGlobalLayout() {
        m8815a(false);
    }

    public final void onScrollChanged() {
        m8815a(true);
        this.f7791G = true;
    }

    /* renamed from: a */
    private final void m8815a(boolean z) {
        if (!(this.f7794c == null || this.zzadl == null || this.zzadl.f8781b == null)) {
            if (this.zzadl.f8781b.mo4782u() != null) {
                if (!z || this.f7788D.m9930a()) {
                    if (this.zzadl.f8781b.mo4782u().mo2398b()) {
                        int[] iArr = new int[2];
                        this.f7794c.getLocationOnScreen(iArr);
                        zzkd.m10709a();
                        int b = zzaoa.m9962b(this.zzrx, iArr[0]);
                        zzkd.m10709a();
                        int b2 = zzaoa.m9962b(this.zzrx, iArr[1]);
                        if (!(b == this.f7786B && b2 == this.f7787C)) {
                            this.f7786B = b;
                            this.f7787C = b2;
                            this.zzadl.f8781b.mo4782u().mo2391a(this.f7786B, this.f7787C, z ^ true);
                        }
                    }
                    if (this.f7794c) {
                        z = this.f7794c.getRootView().findViewById(16908290);
                        if (z) {
                            Rect rect = new Rect();
                            Rect rect2 = new Rect();
                            this.f7794c.getGlobalVisibleRect(rect);
                            z.getGlobalVisibleRect(rect2);
                            if (rect.top != rect2.top) {
                                this.f7789E = false;
                            }
                            if (rect.bottom != rect2.bottom) {
                                this.f7790F = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String zzfp() {
        if (this.f7789E && this.f7790F) {
            return "";
        }
        if (this.f7789E) {
            return this.f7791G ? "top-scrollable" : "top-locked";
        } else {
            if (this.f7790F) {
                return this.f7791G ? "bottom-scrollable" : "bottom-locked";
            } else {
                return "";
            }
        }
    }

    public final void zzg(boolean z) {
        if (!(this.zzaen != 0 || this.zzadl == null || this.zzadl.f8781b == null)) {
            this.zzadl.f8781b.stopLoading();
        }
        if (this.zzadi != null) {
            this.zzadi.mo2218b();
        }
        if (this.zzadj != null) {
            this.zzadj.mo2218b();
        }
        if (z) {
            this.zzadl = false;
        }
    }
}
