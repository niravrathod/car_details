package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzagk extends zzalc {
    @VisibleForTesting
    /* renamed from: a */
    private static final long f19826a = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: b */
    private static final Object f19827b = new Object();
    @GuardedBy("sLock")
    @VisibleForTesting
    /* renamed from: c */
    private static boolean f19828c = false;
    /* renamed from: d */
    private static zzwc f19829d = null;
    /* renamed from: e */
    private static HttpClient f19830e = null;
    /* renamed from: f */
    private static zzz f19831f = null;
    /* renamed from: g */
    private static zzu<Object> f19832g = null;
    /* renamed from: h */
    private final zzaet f19833h;
    /* renamed from: i */
    private final zzafq f19834i;
    /* renamed from: j */
    private final Object f19835j = new Object();
    /* renamed from: k */
    private final Context f19836k;
    /* renamed from: l */
    private zzwp f19837l;
    /* renamed from: m */
    private zzia f19838m;

    public zzagk(Context context, zzafq zzafq, zzaet zzaet, zzia zzia) {
        super(true);
        this.f19833h = zzaet;
        this.f19836k = context;
        this.f19834i = zzafq;
        this.f19838m = zzia;
        synchronized (f19827b) {
            if (f19828c == null) {
                f19831f = new zzz();
                f19830e = new HttpClient(context.getApplicationContext(), zzafq.f8575j);
                f19832g = new zzags();
                f19829d = new zzwc(this.f19836k.getApplicationContext(), this.f19834i.f8575j, (String) zzkd.m10713e().m10897a(zznw.f9702a), new zzagr(), new zzagq());
                f19828c = true;
            }
        }
    }

    /* renamed from: a */
    protected static void m26185a(zzvr zzvr) {
        zzvr.mo4821a("/loadAd", f19831f);
        zzvr.mo4821a("/fetchHttpRequest", f19830e);
        zzvr.mo4821a("/invalidRequest", f19832g);
    }

    /* renamed from: b */
    protected static void m26187b(zzvr zzvr) {
        zzvr.mo4822b("/loadAd", f19831f);
        zzvr.mo4822b("/fetchHttpRequest", f19830e);
        zzvr.mo4822b("/invalidRequest", f19832g);
    }

    /* renamed from: a */
    public final void mo4075a() {
        zzaok.m10001b("SdkLessAdLoaderBackgroundTask started.");
        String e = zzbv.zzfj().m9675e(this.f19836k);
        zzafp zzafp = new zzafp(this.f19834i, -1, zzbv.zzfj().m9671c(this.f19836k), zzbv.zzfj().m9673d(this.f19836k), e, zzbv.zzfj().m9677f(this.f19836k));
        zzaft a = m26182a(zzafp);
        if ((a.f19789d == -2 || a.f19789d == 3) && !TextUtils.isEmpty(e)) {
            zzbv.zzfj().m9678f(this.f19836k, e);
        }
        long elapsedRealtime = zzbv.zzer().elapsedRealtime();
        zzaoa.f8948a.post(new bp(this, new zzakn(zzafp, a, null, null, a.f19789d, elapsedRealtime, a.f19798m, null, this.f19838m)));
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.ads.zzaft m26182a(com.google.android.gms.internal.ads.zzafp r9) {
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
        r8 = this;
        com.google.android.gms.ads.internal.zzbv.zzek();
        r0 = com.google.android.gms.internal.ads.zzalo.m9781a();
        r1 = r8.m26184a(r9, r0);
        r2 = 0;
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r9.<init>(r2);
        return r9;
    L_0x0014:
        r3 = com.google.android.gms.ads.internal.zzbv.zzer();
        r3 = r3.elapsedRealtime();
        r5 = f19831f;
        r5 = r5.zzav(r0);
        r6 = com.google.android.gms.internal.ads.zzaoa.f8948a;
        r7 = new com.google.android.gms.internal.ads.bq;
        r7.<init>(r8, r1, r0);
        r6.post(r7);
        r0 = f19826a;
        r6 = com.google.android.gms.ads.internal.zzbv.zzer();
        r6 = r6.elapsedRealtime();
        r6 = r6 - r3;
        r0 = r0 - r6;
        r3 = -1;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException -> 0x0075, CancellationException -> 0x0075, TimeoutException -> 0x006e, ExecutionException -> 0x0068 }
        r0 = r5.get(r0, r4);	 Catch:{ CancellationException -> 0x0075, CancellationException -> 0x0075, TimeoutException -> 0x006e, ExecutionException -> 0x0068 }
        r0 = (org.json.JSONObject) r0;	 Catch:{ CancellationException -> 0x0075, CancellationException -> 0x0075, TimeoutException -> 0x006e, ExecutionException -> 0x0068 }
        if (r0 != 0) goto L_0x0049;
    L_0x0043:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r9.<init>(r3);
        return r9;
    L_0x0049:
        r1 = r8.f19836k;
        r0 = r0.toString();
        r9 = com.google.android.gms.internal.ads.zzahc.m9525a(r1, r9, r0);
        r0 = r9.f19789d;
        r1 = -3;
        if (r0 == r1) goto L_0x0067;
    L_0x0058:
        r0 = r9.f19787b;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0067;
    L_0x0060:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r0 = 3;
        r9.<init>(r0);
        return r9;
    L_0x0067:
        return r9;
    L_0x0068:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r9.<init>(r2);
        return r9;
    L_0x006e:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r0 = 2;
        r9.<init>(r0);
        return r9;
    L_0x0075:
        r9 = new com.google.android.gms.internal.ads.zzaft;
        r9.<init>(r3);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagk.a(com.google.android.gms.internal.ads.zzafp):com.google.android.gms.internal.ads.zzaft");
    }

    /* renamed from: a */
    private final org.json.JSONObject m26184a(com.google.android.gms.internal.ads.zzafp r6, java.lang.String r7) {
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
        r5 = this;
        r0 = r6.f19735c;
        r0 = r0.f20208c;
        r1 = "sdk_less_server_data";
        r0 = r0.getBundle(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r2 = com.google.android.gms.ads.internal.zzbv.zzev();	 Catch:{ Exception -> 0x001f }
        r3 = r5.f19836k;	 Catch:{ Exception -> 0x001f }
        r2 = r2.m9556a(r3);	 Catch:{ Exception -> 0x001f }
        r2 = r2.get();	 Catch:{ Exception -> 0x001f }
        r2 = (com.google.android.gms.internal.ads.zzahg) r2;	 Catch:{ Exception -> 0x001f }
        goto L_0x0026;
    L_0x001f:
        r2 = move-exception;
        r3 = "Error grabbing device info: ";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
        r2 = r1;
    L_0x0026:
        r3 = r5.f19836k;
        r4 = new com.google.android.gms.internal.ads.zzagv;
        r4.<init>();
        r4.f8600i = r6;
        r4.f8601j = r2;
        r6 = com.google.android.gms.internal.ads.zzahc.m9529a(r3, r4);
        if (r6 != 0) goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r5.f19836k;	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        r2 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r2);	 Catch:{ IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f, IOException -> 0x003f }
        goto L_0x0046;
    L_0x003f:
        r2 = move-exception;
        r3 = "Cannot get advertising id info";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
        r2 = r1;
    L_0x0046:
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = "request_id";
        r3.put(r4, r7);
        r7 = "request_param";
        r3.put(r7, r6);
        r6 = "data";
        r3.put(r6, r0);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r6 = "adid";
        r7 = r2.getId();
        r3.put(r6, r7);
        r6 = "lat";
        r7 = r2.isLimitAdTrackingEnabled();
        r7 = java.lang.Integer.valueOf(r7);
        r3.put(r6, r7);
    L_0x0072:
        r6 = com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ JSONException -> 0x007b }
        r6 = r6.m9833a(r3);	 Catch:{ JSONException -> 0x007b }
        return r6;
    L_0x007b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagk.a(com.google.android.gms.internal.ads.zzafp, java.lang.String):org.json.JSONObject");
    }

    public final void m_() {
        synchronized (this.f19835j) {
            zzaoa.f8948a.post(new bt(this));
        }
    }
}
