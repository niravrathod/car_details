package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.p017f.C3131a;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzfs;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzyz;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzx extends zzh implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: k */
    private boolean f21690k;
    /* renamed from: l */
    private boolean f21691l;
    /* renamed from: m */
    private WeakReference<Object> f21692m = new WeakReference(null);

    public zzx(Context context, zzjo zzjo, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        super(context, zzjo, str, zzyn, zzaop, zzv);
    }

    /* renamed from: a */
    protected final zzasg mo4982a(zzakn zzakn, zzw zzw, zzajy zzajy) {
        if (this.e.zzadk.f20233g == null && this.e.zzadk.f20235i) {
            zzjo zzjo;
            zzbw zzbw = this.e;
            if (zzakn.f8807b.f19810y) {
                zzjo = this.e.zzadk;
            } else {
                AdSize adSize;
                String str = zzakn.f8807b.f19797l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    adSize = this.e.zzadk.m26619b();
                }
                zzjo = new zzjo(this.e.zzrx, adSize);
            }
            zzbw.zzadk = zzjo;
        }
        return super.mo4982a(zzakn, zzw, zzajy);
    }

    public final boolean zzb(zzjk zzjk) {
        zzjk zzjk2 = zzjk;
        this.f21691l = false;
        this.h = null;
        if (zzjk2.f20213h != this.f21690k) {
            boolean z;
            int i = zzjk2.f20206a;
            long j = zzjk2.f20207b;
            Bundle bundle = zzjk2.f20208c;
            int i2 = zzjk2.f20209d;
            List list = zzjk2.f20210e;
            boolean z2 = zzjk2.f20211f;
            int i3 = zzjk2.f20212g;
            if (!zzjk2.f20213h) {
                if (!r0.f21690k) {
                    z = false;
                    zzjk2 = new zzjk(i, j, bundle, i2, list, z2, i3, z, zzjk2.f20214i, zzjk2.f20215j, zzjk2.f20216k, zzjk2.f20217l, zzjk2.f20218m, zzjk2.f20219n, zzjk2.f20220o, zzjk2.f20221p, zzjk2.f20222q, zzjk2.f20223r, null, zzjk2.f20225t, zzjk2.f20226u);
                }
            }
            z = true;
            zzjk2 = new zzjk(i, j, bundle, i2, list, z2, i3, z, zzjk2.f20214i, zzjk2.f20215j, zzjk2.f20216k, zzjk2.f20217l, zzjk2.f20218m, zzjk2.f20219n, zzjk2.f20220o, zzjk2.f20221p, zzjk2.f20222q, zzjk2.f20223r, null, zzjk2.f20225t, zzjk2.f20226u);
        }
        return super.zzb(zzjk2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzakm r5, com.google.android.gms.internal.ads.zzakm r6) {
        /*
        r4 = this;
        r0 = super.zza(r5, r6);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r4.e;
        r0 = r0.zzfn();
        if (r0 == 0) goto L_0x0025;
    L_0x0010:
        r5 = r4.m29846a(r5, r6);
        if (r5 != 0) goto L_0x0025;
    L_0x0016:
        r5 = r6.f8770K;
        if (r5 == 0) goto L_0x0021;
    L_0x001a:
        r5 = r6.f8770K;
        r6 = com.google.android.gms.internal.ads.zzhx.zza.zzb.AD_FAILED_TO_LOAD;
        r5.m10684a(r6);
    L_0x0021:
        r4.mo4933a(r1);
        return r1;
    L_0x0025:
        r4.m28081b(r6, r1);
        r5 = r6.f8791l;
        r0 = 0;
        if (r5 == 0) goto L_0x0064;
    L_0x002d:
        r4.m29850c(r6);
        com.google.android.gms.ads.internal.zzbv.zzfi();
        r5 = r4.e;
        r5 = r5.f7794c;
        com.google.android.gms.internal.ads.zzaqa.m10047a(r5, r4);
        com.google.android.gms.ads.internal.zzbv.zzfi();
        r5 = r4.e;
        r5 = r5.f7794c;
        com.google.android.gms.internal.ads.zzaqa.m10048a(r5, r4);
        r5 = r6.f8792m;
        if (r5 != 0) goto L_0x0081;
    L_0x0048:
        r5 = new com.google.android.gms.ads.internal.au;
        r5.<init>(r4);
        r1 = r6.f8781b;
        if (r1 == 0) goto L_0x0058;
    L_0x0051:
        r1 = r6.f8781b;
        r1 = r1.mo4782u();
        goto L_0x0059;
    L_0x0058:
        r1 = r0;
    L_0x0059:
        if (r1 == 0) goto L_0x0081;
    L_0x005b:
        r2 = new com.google.android.gms.ads.internal.av;
        r2.<init>(r6, r5);
        r1.mo2396a(r2);
        goto L_0x0081;
    L_0x0064:
        r5 = r4.e;
        r5 = r5.zzfo();
        if (r5 == 0) goto L_0x007e;
    L_0x006c:
        r5 = com.google.android.gms.internal.ads.zznw.bv;
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r5 = r2.m10897a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0081;
    L_0x007e:
        r4.mo4989a(r6, r1);
    L_0x0081:
        r5 = r6.f8781b;
        if (r5 == 0) goto L_0x00a5;
    L_0x0085:
        r5 = r6.f8781b;
        r5 = r5.mo4198b();
        r1 = r6.f8781b;
        r1 = r1.mo4782u();
        if (r1 == 0) goto L_0x0096;
    L_0x0093:
        r1.mo2400g();
    L_0x0096:
        r1 = r4.e;
        r1 = r1.f7807p;
        if (r1 == 0) goto L_0x00a5;
    L_0x009c:
        if (r5 == 0) goto L_0x00a5;
    L_0x009e:
        r1 = r4.e;
        r1 = r1.f7807p;
        r5.m26362a(r1);
    L_0x00a5:
        r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich();
        if (r5 == 0) goto L_0x0142;
    L_0x00ab:
        r5 = r4.e;
        r5 = r5.zzfn();
        if (r5 == 0) goto L_0x011e;
    L_0x00b3:
        r5 = r6.f8781b;
        if (r5 == 0) goto L_0x0139;
    L_0x00b7:
        r5 = r6.f8790k;
        if (r5 == 0) goto L_0x00c4;
    L_0x00bb:
        r5 = r4.g;
        r0 = r4.e;
        r0 = r0.zzadk;
        r5.m21682a(r0, r6);
    L_0x00c4:
        r5 = r6.f8781b;
        r0 = r5.getView();
        r5 = new com.google.android.gms.internal.ads.zzfs;
        r1 = r4.e;
        r1 = r1.zzrx;
        r5.<init>(r1, r0);
        r1 = com.google.android.gms.ads.internal.zzbv.zzfj();
        r2 = r4.e;
        r2 = r2.zzrx;
        r1 = r1.m9668a(r2);
        if (r1 == 0) goto L_0x0103;
    L_0x00e1:
        r1 = r6.f8780a;
        r1 = com.google.android.gms.ads.internal.zza.m25937a(r1);
        if (r1 == 0) goto L_0x0103;
    L_0x00e9:
        r1 = r4.e;
        r1 = r1.zzade;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0103;
    L_0x00f3:
        r1 = new com.google.android.gms.internal.ads.zzakc;
        r2 = r4.e;
        r2 = r2.zzrx;
        r3 = r4.e;
        r3 = r3.zzade;
        r1.<init>(r2, r3);
        r5.m10604a(r1);
    L_0x0103:
        r1 = r6.m9689a();
        if (r1 == 0) goto L_0x010f;
    L_0x0109:
        r1 = r6.f8781b;
        r5.m10604a(r1);
        goto L_0x0139;
    L_0x010f:
        r1 = r6.f8781b;
        r1 = r1.mo4782u();
        r2 = new com.google.android.gms.ads.internal.a;
        r2.<init>(r5, r6);
        r1.mo2395a(r2);
        goto L_0x0139;
    L_0x011e:
        r5 = r4.e;
        r5 = r5.f7816y;
        if (r5 == 0) goto L_0x0139;
    L_0x0124:
        r5 = r6.f8790k;
        if (r5 == 0) goto L_0x0139;
    L_0x0128:
        r5 = r4.g;
        r0 = r4.e;
        r0 = r0.zzadk;
        r1 = r4.e;
        r1 = r1.f7816y;
        r5.m21683a(r0, r6, r1);
        r5 = r4.e;
        r0 = r5.f7816y;
    L_0x0139:
        r5 = r6.f8793n;
        if (r5 != 0) goto L_0x0142;
    L_0x013d:
        r5 = r4.e;
        r5.m8816a(r0);
    L_0x0142:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.ads.zzakm, com.google.android.gms.internal.ads.zzakm):boolean");
    }

    /* renamed from: a */
    private final boolean m29846a(zzakm zzakm, zzakm zzakm2) {
        if (zzakm2.f8793n) {
            View zze = zzas.zze(zzakm2);
            if (zze == null) {
                zzaok.m10007e("Could not get mediation view");
                return false;
            }
            View nextView = this.e.f7794c.getNextView();
            if (nextView != null) {
                if (nextView instanceof zzasg) {
                    ((zzasg) nextView).destroy();
                }
                this.e.f7794c.removeView(nextView);
            }
            if (!zzas.zzf(zzakm2)) {
                try {
                    if (zzbv.zzfj().m9668a(this.e.zzrx)) {
                        new zzfs(this.e.zzrx, zze).m10604a(new zzakc(this.e.zzrx, this.e.zzade));
                    }
                    if (zzakm2.f8800u != null) {
                        this.e.f7794c.setMinimumWidth(zzakm2.f8800u.f20232f);
                        this.e.f7794c.setMinimumHeight(zzakm2.f8800u.f20229c);
                    }
                    m25942a(zze);
                } catch (Throwable e) {
                    zzbv.zzeo().m9714a(e, "BannerAdManager.swapViews");
                    zzaok.m10004c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(zzakm2.f8800u == null || zzakm2.f8781b == null)) {
            zzakm2.f8781b.mo4737a(zzatt.m10130a(zzakm2.f8800u));
            this.e.f7794c.removeAllViews();
            this.e.f7794c.setMinimumWidth(zzakm2.f8800u.f20232f);
            this.e.f7794c.setMinimumHeight(zzakm2.f8800u.f20229c);
            m25942a(zzakm2.f8781b.getView());
        }
        if (this.e.f7794c.getChildCount() > 1) {
            this.e.f7794c.showNext();
        }
        if (zzakm != null) {
            zzakm = this.e.f7794c.getNextView();
            if ((zzakm instanceof zzasg) != null) {
                ((zzasg) zzakm).destroy();
            } else if (zzakm != null) {
                this.e.f7794c.removeView(zzakm);
            }
            this.e.zzfm();
        }
        this.e.f7794c.setVisibility(0);
        return true;
    }

    /* renamed from: d */
    protected final void mo4937d() {
        zzasg zzasg = this.e.zzadl != null ? this.e.zzadl.f8781b : null;
        if (!(this.f21691l || zzasg == null)) {
            m29847c(zzasg);
        }
        super.mo4937d();
    }

    /* renamed from: c */
    private final void m29847c(zzasg zzasg) {
        if (m28939h()) {
            WebView webView = zzasg.getWebView();
            if (webView != null) {
                View view = zzasg.getView();
                if (view != null && zzbv.zzfb().m9454a(this.e.zzrx)) {
                    int i = this.e.zzadg.f19894b;
                    int i2 = this.e.zzadg.f19895c;
                    StringBuilder stringBuilder = new StringBuilder(23);
                    stringBuilder.append(i);
                    stringBuilder.append(".");
                    stringBuilder.append(i2);
                    this.h = zzbv.zzfb().m9450a(stringBuilder.toString(), webView, "", "javascript", m25948g());
                    if (this.h != null) {
                        zzbv.zzfb().m9453a(this.h, view);
                        zzasg.mo4736a(this.h);
                        zzbv.zzfb().m9452a(this.h);
                        this.f21691l = true;
                    }
                }
            }
        }
    }

    /* renamed from: j */
    protected final boolean mo4990j() {
        boolean z;
        zzbv.zzek();
        if (zzalo.m9800a(this.e.zzrx, "android.permission.INTERNET")) {
            z = true;
        } else {
            zzkd.m10709a().m9975a(this.e.f7794c, this.e.zzadk, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbv.zzek();
        if (!zzalo.m9799a(this.e.zzrx)) {
            zzkd.m10709a().m9975a(this.e.f7794c, this.e.zzadk, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.e.f7794c == null)) {
            this.e.f7794c.setVisibility(0);
        }
        return z;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.f21690k = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void onGlobalLayout() {
        m29850c(this.e.zzadl);
    }

    public final void onScrollChanged() {
        m29850c(this.e.zzadl);
    }

    /* renamed from: a */
    protected final void mo4989a(zzakm zzakm, boolean z) {
        zzasg zzasg;
        if (m28939h()) {
            zzasg = zzakm != null ? zzakm.f8781b : null;
            if (zzasg != null) {
                if (!this.f21691l) {
                    m29847c(zzasg);
                }
                if (this.h != null) {
                    zzasg.mo4743a("onSdkImpression", new C3131a());
                }
            }
        }
        super.mo4989a(zzakm, z);
        if (zzas.zzf(zzakm)) {
            z = new zzab(this);
            if (zzakm != null && zzas.zzf(zzakm)) {
                zzasg = zzakm.f8781b;
                Object view = zzasg != null ? zzasg.getView() : null;
                if (view == null) {
                    zzaok.m10007e("AdWebView is null");
                    return;
                }
                try {
                    List list = zzakm.f8794o != null ? zzakm.f8794o.f9853r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            zzyz h = zzakm.f8795p != null ? zzakm.f8795p.mo2777h() : null;
                            zzakm = zzakm.f8795p != null ? zzakm.f8795p.mo2778i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo2806b(ObjectWrapper.m26019a(view));
                                if (h.mo2815j() == null) {
                                    h.mo2814i();
                                }
                                zzasg.mo4740a("/nativeExpressViewClicked", zzas.m8803a(h, null, z));
                                return;
                            } else if (!list.contains("1") || zzakm == null) {
                                zzaok.m10007e("No matching template id and mapper");
                                return;
                            } else {
                                zzakm.mo2827b(ObjectWrapper.m26019a(view));
                                if (!zzakm.mo2834h()) {
                                    zzakm.mo2833g();
                                }
                                zzasg.mo4740a("/nativeExpressViewClicked", zzas.m8803a(null, zzakm, z));
                                return;
                            }
                        }
                    }
                    zzaok.m10007e("No template ids present in mediation response");
                } catch (zzakm zzakm2) {
                    zzaok.m10004c("Error occurred while recording impression and registering for clicks", zzakm2);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    final void m29850c(zzakm zzakm) {
        if (!(zzakm == null || zzakm.f8792m || this.e.f7794c == null || !zzbv.zzek().m9838a(this.e.f7794c, this.e.zzrx))) {
            if (this.e.f7794c.getGlobalVisibleRect(new Rect(), null)) {
                if (!(zzakm == null || zzakm.f8781b == null || zzakm.f8781b.mo4782u() == null)) {
                    zzakm.f8781b.mo4782u().mo2396a(null);
                }
                mo4989a(zzakm, false);
                zzakm.f8792m = true;
            }
        }
    }

    public final zzly getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        return (this.e.zzadl == null || this.e.zzadl.f8781b == null) ? null : this.e.zzadl.f8781b.mo4198b();
    }

    public final void zzda() {
        this.d.zzdz();
    }
}
