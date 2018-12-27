package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzhx.zza.zzb;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
public final class zzaeu extends zzalc implements zzafh {
    /* renamed from: a */
    private final zzaet f19687a;
    /* renamed from: b */
    private final zzafq f19688b;
    /* renamed from: c */
    private final Object f19689c = new Object();
    /* renamed from: d */
    private final Context f19690d;
    /* renamed from: e */
    private final zzhv f19691e;
    /* renamed from: f */
    private final zzia f19692f;
    @VisibleForTesting
    /* renamed from: g */
    private zzafp f19693g;
    /* renamed from: h */
    private Runnable f19694h;
    @GuardedBy("mCancelLock")
    @VisibleForTesting
    /* renamed from: i */
    private boolean f19695i;
    @GuardedBy("mCancelLock")
    @VisibleForTesting
    /* renamed from: j */
    private zzami f19696j;
    @VisibleForTesting
    /* renamed from: k */
    private zzaft f19697k;
    @VisibleForTesting
    /* renamed from: l */
    private zzxy f19698l;

    public zzaeu(Context context, zzafq zzafq, zzaet zzaet, zzia zzia) {
        this.f19687a = zzaet;
        this.f19690d = context;
        this.f19688b = zzafq;
        this.f19692f = zzia;
        this.f19691e = new zzhv(this.f19692f);
        this.f19691e.m10683a(new ba(this));
        context = new zziz();
        context.f20177a = Integer.valueOf(this.f19688b.f8575j.f19894b);
        context.f20178b = Integer.valueOf(this.f19688b.f8575j.f19895c);
        context.f20179c = Integer.valueOf(this.f19688b.f8575j.f19896d != null ? null : 2);
        this.f19691e.m10683a(new bb(context));
        if (this.f19688b.f8571f != null) {
            this.f19691e.m10683a(new bc(this));
        }
        context = this.f19688b.f8568c;
        if (context.f20230d != null && "interstitial_mb".equals(context.f20227a) != null) {
            this.f19691e.m10683a(bd.f16436a);
        } else if (context.f20230d != null && "reward_mb".equals(context.f20227a) != null) {
            this.f19691e.m10683a(be.f16437a);
        } else if (context.f20234h == null && context.f20230d == null) {
            this.f19691e.m10683a(bf.f16438a);
        } else {
            this.f19691e.m10683a(bg.f16439a);
        }
        this.f19691e.m10684a(zzb.AD_REQUEST);
    }

    /* renamed from: a */
    public final void mo4075a() {
        zzaok.m10001b("AdLoaderBackgroundTask started.");
        this.f19694h = new bh(this);
        zzalo.f8872a.postDelayed(this.f19694h, ((Long) zzkd.m10713e().m10897a(zznw.ba)).longValue());
        long elapsedRealtime = zzbv.zzer().elapsedRealtime();
        if (this.f19688b.f8567b.f20208c != null) {
            String string = this.f19688b.f8567b.f20208c.getString("_ad");
            if (string != null) {
                this.f19693g = new zzafp(this.f19688b, elapsedRealtime, null, null, null, null);
                mo2231a(zzahc.m9525a(this.f19690d, this.f19693g, string));
                return;
            }
        }
        zzapu zzapy = new zzapy();
        zzalm.m9772a(new bi(this, zzapy));
        this.f19693g = new zzafp(this.f19688b, elapsedRealtime, zzbv.zzfj().m9671c(this.f19690d), zzbv.zzfj().m9673d(this.f19690d), zzbv.zzfj().m9675e(this.f19690d), zzbv.zzfj().m9677f(this.f19690d));
        zzapy.mo2374a(this.f19693g);
    }

    /* renamed from: a */
    private final void m26164a(int i, String str) {
        zzafp zzafp;
        zzaeu zzaeu = this;
        int i2 = i;
        if (i2 != 3) {
            if (i2 != -1) {
                zzaok.m10007e(str);
                if (zzaeu.f19697k != null) {
                    zzaeu.f19697k = new zzaft(i2);
                } else {
                    zzaeu.f19697k = new zzaft(i2, zzaeu.f19697k.f19795j);
                }
                if (zzaeu.f19693g == null) {
                    zzafp = zzaeu.f19693g;
                } else {
                    zzafp zzafp2 = new zzafp(zzaeu.f19688b, -1, null, null, null, null);
                }
                zzaeu.f19687a.zza(new zzakn(zzafp, zzaeu.f19697k, zzaeu.f19698l, null, i, -1, zzaeu.f19697k.f19798m, null, zzaeu.f19691e, null));
            }
        }
        zzaok.m10005d(str);
        if (zzaeu.f19697k != null) {
            zzaeu.f19697k = new zzaft(i2, zzaeu.f19697k.f19795j);
        } else {
            zzaeu.f19697k = new zzaft(i2);
        }
        if (zzaeu.f19693g == null) {
            zzafp zzafp22 = new zzafp(zzaeu.f19688b, -1, null, null, null, null);
        } else {
            zzafp = zzaeu.f19693g;
        }
        zzaeu.f19687a.zza(new zzakn(zzafp, zzaeu.f19697k, zzaeu.f19698l, null, i, -1, zzaeu.f19697k.f19798m, null, zzaeu.f19691e, null));
    }

    /* renamed from: a */
    public final void mo2231a(zzaft zzaft) {
        zzaok.m10001b("Received ad response.");
        this.f19697k = zzaft;
        zzaft = this.f19697k.f19780U;
        if (!TextUtils.isEmpty(zzaft)) {
            zzbv.zzfj().m9678f(this.f19690d, zzaft);
        }
        long elapsedRealtime = zzbv.zzer().elapsedRealtime();
        synchronized (this.f19689c) {
            Boolean bool = null;
            this.f19696j = null;
        }
        zzbv.zzeo().m9726k().mo2349d(this.f19697k.f19765F);
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aB)).booleanValue() != null) {
            if (this.f19697k.f19773N != null) {
                zzbv.zzeo().m9726k().mo2346c(this.f19693g.f19737e);
            } else {
                zzbv.zzeo().m9726k().mo2348d(this.f19693g.f19737e);
            }
        }
        try {
            JSONObject jSONObject;
            Bundle bundle;
            Boolean bool2;
            Bundle bundle2;
            if (this.f19697k.f19789d != -2) {
                if (this.f19697k.f19789d != -3) {
                    int i = this.f19697k.f19789d;
                    StringBuilder stringBuilder = new StringBuilder(66);
                    stringBuilder.append("There was a problem getting an ad response. ErrorCode: ");
                    stringBuilder.append(i);
                    throw new zzafe(stringBuilder.toString(), this.f19697k.f19789d);
                }
            }
            if (this.f19697k.f19789d != -3) {
                if (TextUtils.isEmpty(this.f19697k.f19787b) == null) {
                    zzbv.zzeo().m9726k().mo2338a(this.f19697k.f19805t);
                    if (this.f19697k.f19792g != null) {
                        this.f19698l = new zzxy(this.f19697k.f19787b);
                        zzbv.zzeo().m9715a(this.f19698l.f9864h);
                    } else {
                        zzbv.zzeo().m9715a(this.f19697k.f19768I);
                    }
                    if (TextUtils.isEmpty(this.f19697k.f19766G) == null) {
                        zzaok.m10001b("Received cookie from server. Setting webview cookie in CookieManager.");
                        zzaft = zzbv.zzem().mo5046c(this.f19690d);
                        if (zzaft != null) {
                            zzaft.setCookie("googleads.g.doubleclick.net", this.f19697k.f19766G);
                        }
                    }
                } else {
                    throw new zzafe("No fill from ad server.", 3);
                }
            }
            zzjo a = this.f19693g.f19736d.f20233g != null ? m26163a(this.f19693g) : null;
            zzbv.zzeo().m9726k().mo2343b(this.f19697k.f19806u);
            zzbv.zzeo().m9726k().mo2347c(this.f19697k.f19772M);
            if (TextUtils.isEmpty(this.f19697k.f19802q) == null) {
                try {
                    jSONObject = new JSONObject(this.f19697k.f19802q);
                } catch (zzaft zzaft2) {
                    zzaok.m10002b("Error parsing the JSON for Active View.", zzaft2);
                }
                zzaft2 = this.f19693g.f19735c.f20218m;
                if (this.f19697k.f19775P == 2) {
                    bool = Boolean.valueOf(true);
                    bundle = zzaft2.getBundle(AdMobAdapter.class.getName());
                    if (bundle == null) {
                        bundle = new Bundle();
                        zzaft2.putBundle(AdMobAdapter.class.getName(), bundle);
                    }
                    bundle.putBoolean("render_test_ad_label", true);
                } else if (this.f19697k.f19775P == 1) {
                    bool = Boolean.valueOf(false);
                } else if (this.f19697k.f19775P == 0) {
                    bool = Boolean.valueOf(zzans.m9935a(zzaft2));
                }
                bool2 = bool;
                if (this.f19697k.f19781V) {
                    bundle2 = zzaft2.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        zzaft2.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("is_analytics_logging_enabled", true);
                }
                this.f19687a.zza(new zzakn(this.f19693g, this.f19697k, this.f19698l, a, -2, elapsedRealtime, this.f19697k.f19798m, jSONObject, this.f19691e, bool2));
                zzalo.f8872a.removeCallbacks(this.f19694h);
            }
            jSONObject = null;
            zzaft2 = this.f19693g.f19735c.f20218m;
            if (this.f19697k.f19775P == 2) {
                bool = Boolean.valueOf(true);
                bundle = zzaft2.getBundle(AdMobAdapter.class.getName());
                if (bundle == null) {
                    bundle = new Bundle();
                    zzaft2.putBundle(AdMobAdapter.class.getName(), bundle);
                }
                bundle.putBoolean("render_test_ad_label", true);
            } else if (this.f19697k.f19775P == 1) {
                bool = Boolean.valueOf(false);
            } else if (this.f19697k.f19775P == 0) {
                bool = Boolean.valueOf(zzans.m9935a(zzaft2));
            }
            bool2 = bool;
            if (this.f19697k.f19781V) {
                bundle2 = zzaft2.getBundle(AdMobAdapter.class.getName());
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                    zzaft2.putBundle(AdMobAdapter.class.getName(), bundle2);
                }
                bundle2.putBoolean("is_analytics_logging_enabled", true);
            }
            this.f19687a.zza(new zzakn(this.f19693g, this.f19697k, this.f19698l, a, -2, elapsedRealtime, this.f19697k.f19798m, jSONObject, this.f19691e, bool2));
            zzalo.f8872a.removeCallbacks(this.f19694h);
        } catch (zzaft zzaft22) {
            zzaok.m10002b("Could not parse mediation config.", zzaft22);
            String str = "Could not parse mediation config: ";
            String valueOf = String.valueOf(this.f19697k.f19787b);
            throw new zzafe(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
        } catch (zzaft zzaft222) {
            m26164a(zzaft222.m9513a(), zzaft222.getMessage());
            zzalo.f8872a.removeCallbacks(this.f19694h);
        }
    }

    public final void m_() {
        synchronized (this.f19689c) {
            if (this.f19696j != null) {
                this.f19696j.mo2218b();
            }
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private final com.google.android.gms.internal.ads.zzjo m26163a(com.google.android.gms.internal.ads.zzafp r12) {
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
        r11 = this;
        r0 = r11.f19693g;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x0006:
        r0 = r11.f19693g;
        r0 = r0.f19728V;
        if (r0 == 0) goto L_0x0018;
    L_0x000c:
        r0 = r11.f19693g;
        r0 = r0.f19728V;
        r0 = r0.size();
        if (r0 <= r1) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        r0 = r11.f19698l;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r0 = r11.f19698l;
        r0 = r0.f9877u;
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        r12 = 0;
        return r12;
    L_0x0027:
        r0 = r11.f19697k;
        r0 = r0.f19810y;
        if (r0 == 0) goto L_0x0048;
    L_0x002d:
        r0 = r12.f19736d;
        r0 = r0.f20233g;
        r3 = r0.length;
        r4 = 0;
    L_0x0033:
        if (r4 >= r3) goto L_0x0048;
    L_0x0035:
        r5 = r0[r4];
        r6 = r5.f20235i;
        if (r6 == 0) goto L_0x0045;
    L_0x003b:
        r0 = new com.google.android.gms.internal.ads.zzjo;
        r12 = r12.f19736d;
        r12 = r12.f20233g;
        r0.<init>(r5, r12);
        return r0;
    L_0x0045:
        r4 = r4 + 1;
        goto L_0x0033;
    L_0x0048:
        r0 = r11.f19697k;
        r0 = r0.f19797l;
        if (r0 == 0) goto L_0x0111;
    L_0x004e:
        r0 = r11.f19697k;
        r0 = r0.f19797l;
        r3 = "x";
        r0 = r0.split(r3);
        r3 = r0.length;
        r4 = 2;
        if (r3 == r4) goto L_0x007d;
    L_0x005c:
        r12 = new com.google.android.gms.internal.ads.zzafe;
        r0 = "Invalid ad size format from the ad response: ";
        r1 = r11.f19697k;
        r1 = r1.f19797l;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0073;
    L_0x006e:
        r0 = r0.concat(r1);
        goto L_0x0079;
    L_0x0073:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0079:
        r12.<init>(r0, r2);
        throw r12;
    L_0x007d:
        r3 = r0[r2];	 Catch:{ NumberFormatException -> 0x00ef }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00ef }
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00ef }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00ef }
        r1 = r12.f19736d;
        r1 = r1.f20233g;
        r4 = r1.length;
        r5 = 0;
    L_0x008f:
        if (r5 >= r4) goto L_0x00ce;
    L_0x0091:
        r6 = r1[r5];
        r7 = r11.f19690d;
        r7 = r7.getResources();
        r7 = r7.getDisplayMetrics();
        r7 = r7.density;
        r8 = r6.f20231e;
        r9 = -1;
        if (r8 != r9) goto L_0x00aa;
    L_0x00a4:
        r8 = r6.f20232f;
        r8 = (float) r8;
        r8 = r8 / r7;
        r8 = (int) r8;
        goto L_0x00ac;
    L_0x00aa:
        r8 = r6.f20231e;
    L_0x00ac:
        r9 = r6.f20228b;
        r10 = -2;
        if (r9 != r10) goto L_0x00b7;
    L_0x00b1:
        r9 = r6.f20229c;
        r9 = (float) r9;
        r9 = r9 / r7;
        r7 = (int) r9;
        goto L_0x00b9;
    L_0x00b7:
        r7 = r6.f20228b;
    L_0x00b9:
        if (r3 != r8) goto L_0x00cb;
    L_0x00bb:
        if (r0 != r7) goto L_0x00cb;
    L_0x00bd:
        r7 = r6.f20235i;
        if (r7 != 0) goto L_0x00cb;
    L_0x00c1:
        r0 = new com.google.android.gms.internal.ads.zzjo;
        r12 = r12.f19736d;
        r12 = r12.f20233g;
        r0.<init>(r6, r12);
        return r0;
    L_0x00cb:
        r5 = r5 + 1;
        goto L_0x008f;
    L_0x00ce:
        r12 = new com.google.android.gms.internal.ads.zzafe;
        r0 = "The ad size from the ad response was not one of the requested sizes: ";
        r1 = r11.f19697k;
        r1 = r1.f19797l;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00e5;
    L_0x00e0:
        r0 = r0.concat(r1);
        goto L_0x00eb;
    L_0x00e5:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x00eb:
        r12.<init>(r0, r2);
        throw r12;
        r12 = new com.google.android.gms.internal.ads.zzafe;
        r0 = "Invalid ad size number from the ad response: ";
        r1 = r11.f19697k;
        r1 = r1.f19797l;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0107;
    L_0x0102:
        r0 = r0.concat(r1);
        goto L_0x010d;
    L_0x0107:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x010d:
        r12.<init>(r0, r2);
        throw r12;
    L_0x0111:
        r12 = new com.google.android.gms.internal.ads.zzafe;
        r0 = "The ad response must specify one of the supported ad sizes.";
        r12.<init>(r0, r2);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.a(com.google.android.gms.internal.ads.zzafp):com.google.android.gms.internal.ads.zzjo");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final /* synthetic */ void m26167a(com.google.android.gms.internal.ads.zzapu r5) {
        /*
        r4 = this;
        r0 = r4.f19689c;
        monitor-enter(r0);
        r1 = r4.f19695i;	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x000e;
    L_0x0007:
        r5 = "Request task was already canceled";
        com.google.android.gms.internal.ads.zzaok.m10007e(r5);	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x000e:
        r1 = r4.f19688b;	 Catch:{ all -> 0x0060 }
        r1 = r1.f8575j;	 Catch:{ all -> 0x0060 }
        r2 = r4.f19690d;	 Catch:{ all -> 0x0060 }
        r3 = new com.google.android.gms.internal.ads.bj;	 Catch:{ all -> 0x0060 }
        r3.<init>(r2);	 Catch:{ all -> 0x0060 }
        r3 = r3.mo1938a(r1);	 Catch:{ all -> 0x0060 }
        if (r3 == 0) goto L_0x002d;
    L_0x001f:
        r1 = "Fetching ad response from local ad request service.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);	 Catch:{ all -> 0x0060 }
        r1 = new com.google.android.gms.internal.ads.zzafm;	 Catch:{ all -> 0x0060 }
        r1.<init>(r2, r5, r4);	 Catch:{ all -> 0x0060 }
        r1.mo2219c();	 Catch:{ all -> 0x0060 }
        goto L_0x004b;
    L_0x002d:
        r3 = "Fetching ad response from remote ad request service.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r3);	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x0060 }
        r3 = 12451000; // 0xbdfcb8 float:1.7447567E-38 double:6.1516114E-317;
        r3 = com.google.android.gms.internal.ads.zzaoa.m9969c(r2, r3);	 Catch:{ all -> 0x0060 }
        if (r3 != 0) goto L_0x0045;
    L_0x003e:
        r5 = "Failed to connect to remote ad request service.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r5);	 Catch:{ all -> 0x0060 }
        r1 = 0;
        goto L_0x004b;
    L_0x0045:
        r3 = new com.google.android.gms.internal.ads.zzafn;	 Catch:{ all -> 0x0060 }
        r3.<init>(r2, r1, r5, r4);	 Catch:{ all -> 0x0060 }
        r1 = r3;
    L_0x004b:
        r4.f19696j = r1;	 Catch:{ all -> 0x0060 }
        r5 = r4.f19696j;	 Catch:{ all -> 0x0060 }
        if (r5 != 0) goto L_0x005e;
    L_0x0051:
        r5 = 0;
        r1 = "Could not start the ad request service.";
        r4.m26164a(r5, r1);	 Catch:{ all -> 0x0060 }
        r5 = com.google.android.gms.internal.ads.zzalo.f8872a;	 Catch:{ all -> 0x0060 }
        r1 = r4.f19694h;	 Catch:{ all -> 0x0060 }
        r5.removeCallbacks(r1);	 Catch:{ all -> 0x0060 }
    L_0x005e:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x0060:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.a(com.google.android.gms.internal.ads.zzapu):void");
    }

    /* renamed from: d */
    final /* synthetic */ void m26170d() {
        synchronized (this.f19689c) {
            this.f19695i = true;
            if (this.f19696j != null) {
                m_();
            }
            m26164a(2, "Timed out waiting for ad response.");
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m26168a(zziy zziy) {
        zziy.f20169c.f20155a = this.f19688b.f8571f.packageName;
    }

    /* renamed from: b */
    final /* synthetic */ void m26169b(zziy zziy) {
        zziy.f20167a = this.f19688b.f8587v;
    }
}
