package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzagx extends zzafy {
    /* renamed from: a */
    private static final Object f19840a = new Object();
    @GuardedBy("sLock")
    /* renamed from: b */
    private static zzagx f19841b;
    /* renamed from: c */
    private final Context f19842c;
    /* renamed from: d */
    private final zzagw f19843d;
    /* renamed from: e */
    private final ScheduledExecutorService f19844e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public static zzagx m26193a(Context context, zzagw zzagw) {
        synchronized (f19840a) {
            if (f19841b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zznw.m10901a(context);
                f19841b = new zzagx(context, zzagw);
                if (context.getApplicationContext() != null) {
                    zzbv.zzek().m9844c(context);
                }
                zzale.m9742a(context);
            }
            context = f19841b;
        }
        return context;
    }

    /* renamed from: a */
    public final void mo2234a(zzagi zzagi, zzagd zzagd) {
        zzalg.m21225a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo2235b(zzagi zzagi, zzagd zzagd) {
        zzalg.m21225a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.ads.zzaft m26191a(android.content.Context r19, com.google.android.gms.internal.ads.zzagw r20, com.google.android.gms.internal.ads.zzafp r21, java.util.concurrent.ScheduledExecutorService r22) {
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
        r1 = r19;
        r8 = r20;
        r0 = r21;
        r2 = r22;
        r3 = "Starting ad request from service using: google.afma.request.getAdDictionary";
        com.google.android.gms.internal.ads.zzaok.m10001b(r3);
        r9 = new com.google.android.gms.internal.ads.zzoj;
        r3 = com.google.android.gms.internal.ads.zznw.f9685J;
        r4 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r3 = r4.m10897a(r3);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r4 = "load_ad";
        r5 = r0.f19736d;
        r5 = r5.f20227a;
        r9.<init>(r3, r4, r5);
        r3 = r0.f19733a;
        r4 = 10;
        if (r3 <= r4) goto L_0x0045;
    L_0x002e:
        r3 = r0.f19707A;
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0045;
    L_0x0036:
        r3 = r0.f19707A;
        r3 = r9.m10926a(r3);
        r4 = "cts";
        r4 = new java.lang.String[]{r4};
        r9.m10931a(r3, r4);
    L_0x0045:
        r10 = r9.m10925a();
        r3 = r8.f8611h;
        r3 = r3.mo2217a(r1);
        r4 = com.google.android.gms.internal.ads.zznw.bS;
        r5 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r4 = r5.m10897a(r4);
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r3 = com.google.android.gms.internal.ads.zzaox.m10020a(r3, r4, r6, r2);
        r4 = 0;
        r5 = com.google.android.gms.internal.ads.zzaox.m10019a(r4);
        r6 = com.google.android.gms.internal.ads.zznw.cD;
        r7 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r6 = r7.m10897a(r6);
        r6 = (java.lang.Boolean) r6;
        r6 = r6.booleanValue();
        if (r6 == 0) goto L_0x0086;
    L_0x007c:
        r5 = r8.f8606c;
        r6 = r0.f19739g;
        r6 = r6.packageName;
        r5 = r5.mo2330a(r6);
    L_0x0086:
        r6 = r8.f8606c;
        r7 = r0.f19739g;
        r7 = r7.packageName;
        r6 = r6.mo2331b(r7);
        r7 = r8.f8612i;
        r11 = r0.f19740h;
        r12 = r0.f19739g;
        r7 = r7.mo2333a(r11, r12);
        r11 = com.google.android.gms.ads.internal.zzbv.zzev();
        r11 = r11.m9556a(r1);
        r12 = com.google.android.gms.internal.ads.zzaox.m10019a(r4);
        r13 = r0.f19735c;
        r13 = r13.f20208c;
        if (r13 == 0) goto L_0x00b6;
    L_0x00ac:
        r15 = "_ad";
        r13 = r13.getString(r15);
        if (r13 == 0) goto L_0x00b6;
    L_0x00b4:
        r13 = 1;
        goto L_0x00b7;
    L_0x00b6:
        r13 = 0;
    L_0x00b7:
        r15 = r0.f19713G;
        if (r15 == 0) goto L_0x00c5;
    L_0x00bb:
        if (r13 != 0) goto L_0x00c5;
    L_0x00bd:
        r12 = r8.f8609f;
        r13 = r0.f19738f;
        r12 = r12.mo2750a(r13);
    L_0x00c5:
        r13 = com.google.android.gms.internal.ads.zznw.bJ;
        r15 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r13 = r15.m10897a(r13);
        r13 = (java.lang.Long) r13;
        r14 = r13.longValue();
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r12 = com.google.android.gms.internal.ads.zzaox.m10020a(r12, r14, r13, r2);
        r13 = com.google.android.gms.internal.ads.zzaox.m10019a(r4);
        r14 = com.google.android.gms.internal.ads.zznw.av;
        r15 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r14 = r15.m10897a(r14);
        r14 = (java.lang.Boolean) r14;
        r14 = r14.booleanValue();
        if (r14 == 0) goto L_0x010d;
    L_0x00f1:
        r13 = r8.f8612i;
        r13 = r13.mo2332a(r1);
        r14 = com.google.android.gms.internal.ads.zznw.aw;
        r15 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r14 = r15.m10897a(r14);
        r14 = (java.lang.Long) r14;
        r14 = r14.longValue();
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r13 = com.google.android.gms.internal.ads.zzaox.m10020a(r13, r14, r4, r2);
    L_0x010d:
        r4 = r0.f19733a;
        r14 = 4;
        if (r4 < r14) goto L_0x0119;
    L_0x0112:
        r4 = r0.f19747o;
        if (r4 == 0) goto L_0x0119;
    L_0x0116:
        r4 = r0.f19747o;
        goto L_0x011a;
    L_0x0119:
        r4 = 0;
    L_0x011a:
        com.google.android.gms.ads.internal.zzbv.zzek();
        r14 = "android.permission.ACCESS_NETWORK_STATE";
        r14 = com.google.android.gms.internal.ads.zzalo.m9800a(r1, r14);
        if (r14 == 0) goto L_0x0138;
    L_0x0125:
        r14 = "connectivity";
        r14 = r1.getSystemService(r14);
        r14 = (android.net.ConnectivityManager) r14;
        r14 = r14.getActiveNetworkInfo();
        if (r14 != 0) goto L_0x0138;
    L_0x0133:
        r14 = "Device is offline.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r14);
    L_0x0138:
        r14 = r0.f19733a;
        r15 = 7;
        if (r14 < r15) goto L_0x0140;
    L_0x013d:
        r14 = r0.f19754v;
        goto L_0x0148;
    L_0x0140:
        r14 = java.util.UUID.randomUUID();
        r14 = r14.toString();
    L_0x0148:
        r15 = r0.f19735c;
        r15 = r15.f20208c;
        if (r15 == 0) goto L_0x015f;
    L_0x014e:
        r15 = r0.f19735c;
        r15 = r15.f20208c;
        r2 = "_ad";
        r2 = r15.getString(r2);
        if (r2 == 0) goto L_0x015f;
    L_0x015a:
        r0 = com.google.android.gms.internal.ads.zzahc.m9525a(r1, r0, r2);
        return r0;
    L_0x015f:
        r2 = r8.f8607d;
        r15 = r0.f19755w;
        r2 = r2.mo2569a(r15);
        r15 = com.google.android.gms.internal.ads.zznw.bS;
        r16 = r9;
        r9 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r9 = r9.m10897a(r15);
        r9 = (java.lang.Long) r9;
        r17 = r10;
        r9 = r9.longValue();
        r15 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r18 = r14;
        r14 = 0;
        r3 = com.google.android.gms.internal.ads.zzaox.m10025a(r3, r14, r9, r15);
        r3 = (android.os.Bundle) r3;
        r9 = com.google.android.gms.internal.ads.zzaox.m10024a(r12, r14);
        r9 = (android.location.Location) r9;
        r10 = com.google.android.gms.internal.ads.zzaox.m10024a(r13, r14);
        r10 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r10;
        r7 = com.google.android.gms.internal.ads.zzaox.m10024a(r7, r14);
        r7 = (java.lang.String) r7;
        r5 = com.google.android.gms.internal.ads.zzaox.m10024a(r5, r14);
        r5 = (java.lang.String) r5;
        r6 = com.google.android.gms.internal.ads.zzaox.m10024a(r6, r14);
        r6 = (java.lang.String) r6;
        r11 = com.google.android.gms.internal.ads.zzaox.m10024a(r11, r14);
        r11 = (com.google.android.gms.internal.ads.zzahg) r11;
        if (r11 != 0) goto L_0x01b8;
    L_0x01ac:
        r0 = "Error fetching device info. This is not recoverable.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        r0 = new com.google.android.gms.internal.ads.zzaft;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x01b8:
        r12 = new com.google.android.gms.internal.ads.zzagv;
        r12.<init>();
        r12.f8600i = r0;
        r12.f8601j = r11;
        r12.f8595d = r9;
        r12.f8593b = r3;
        r12.f8598g = r7;
        r12.f8599h = r10;
        if (r2 != 0) goto L_0x01d0;
    L_0x01cb:
        r3 = r12.f8594c;
        r3.clear();
    L_0x01d0:
        r12.f8594c = r2;
        r12.f8592a = r4;
        r12.f8596e = r5;
        r12.f8597f = r6;
        r2 = r8.f8605b;
        r2 = r2.mo2457a(r1);
        r12.f8602k = r2;
        r2 = r8.f8613j;
        r12.f8603l = r2;
        r2 = com.google.android.gms.internal.ads.zzahc.m9529a(r1, r12);
        if (r2 != 0) goto L_0x01f1;
    L_0x01ea:
        r0 = new com.google.android.gms.internal.ads.zzaft;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x01f1:
        r3 = r0.f19733a;
        r4 = 7;
        if (r3 >= r4) goto L_0x01ff;
    L_0x01f6:
        r3 = "request_id";	 Catch:{ JSONException -> 0x01fe }
        r14 = r18;	 Catch:{ JSONException -> 0x01fe }
        r2.put(r3, r14);	 Catch:{ JSONException -> 0x01fe }
        goto L_0x01ff;
    L_0x01ff:
        r3 = "arc";
        r3 = new java.lang.String[]{r3};
        r9 = r16;
        r10 = r17;
        r9.m10931a(r10, r3);
        r3 = r8.f8614k;
        r3 = r3.mo2240a();
        r2 = r3.mo4302b(r2);
        r3 = com.google.android.gms.internal.ads.bu.f16446a;
        r4 = r22;
        r2 = com.google.android.gms.internal.ads.zzaox.m10021a(r2, r3, r4);
        r11 = 10;
        r3 = java.util.concurrent.TimeUnit.SECONDS;
        r2 = com.google.android.gms.internal.ads.zzaox.m10020a(r2, r11, r3, r4);
        r3 = r8.f8608e;
        r3 = r3.mo2237a();
        if (r3 == 0) goto L_0x0233;
    L_0x022e:
        r4 = "AdRequestServiceImpl.loadAd.flags";
        com.google.android.gms.internal.ads.zzaov.m10017a(r3, r4);
    L_0x0233:
        r14 = 0;
        r2 = com.google.android.gms.internal.ads.zzaox.m10024a(r2, r14);
        r11 = r2;
        r11 = (com.google.android.gms.internal.ads.zzahf) r11;
        if (r11 != 0) goto L_0x0244;
    L_0x023d:
        r0 = new com.google.android.gms.internal.ads.zzaft;
        r1 = 0;
        r0.<init>(r1);
        return r0;
    L_0x0244:
        r2 = r11.m9539a();
        r3 = -2;
        if (r2 == r3) goto L_0x0255;
    L_0x024b:
        r0 = new com.google.android.gms.internal.ads.zzaft;
        r1 = r11.m9539a();
        r0.<init>(r1);
        return r0;
    L_0x0255:
        r9.m10934d();
        r2 = r11.m9544f();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x026b;
    L_0x0262:
        r2 = r11.m9544f();
        r4 = com.google.android.gms.internal.ads.zzahc.m9525a(r1, r0, r2);
        r14 = r4;
    L_0x026b:
        if (r14 != 0) goto L_0x028d;
    L_0x026d:
        r2 = r11.m9542d();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x028d;
    L_0x0277:
        r2 = r0.f19743k;
        r2 = r2.f19893a;
        r3 = r11.m9542d();
        r0 = r21;
        r1 = r19;
        r4 = r5;
        r5 = r6;
        r6 = r11;
        r7 = r9;
        r8 = r20;
        r14 = m26192a(r0, r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x028d:
        if (r14 != 0) goto L_0x0295;
    L_0x028f:
        r14 = new com.google.android.gms.internal.ads.zzaft;
        r0 = 0;
        r14.<init>(r0);
    L_0x0295:
        r0 = "tts";
        r0 = new java.lang.String[]{r0};
        r9.m10931a(r10, r0);
        r0 = r9.m10932b();
        r14.f19808w = r0;
        r0 = r11.m9546h();
        r14.f19780U = r0;
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagx.a(android.content.Context, com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzafp, java.util.concurrent.ScheduledExecutorService):com.google.android.gms.internal.ads.zzaft");
    }

    /* renamed from: a */
    private static void m26195a(String str, Map<String, List<String>> map, String str2, int i) {
        if (zzaok.m10000a(2)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 39);
            stringBuilder.append("Http Response: {\n  URL:\n    ");
            stringBuilder.append(str);
            stringBuilder.append("\n  Headers:");
            zzalg.m21225a(stringBuilder.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    stringBuilder2.append("    ");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(":");
                    zzalg.m21225a(stringBuilder2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf2);
                        zzalg.m21225a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            zzalg.m21225a("  Body:");
            if (str2 != null) {
                str = null;
                while (str < Math.min(str2.length(), 100000)) {
                    int i2 = str + 1000;
                    zzalg.m21225a(str2.substring(str, Math.min(str2.length(), i2)));
                    str = i2;
                }
            } else {
                zzalg.m21225a("    null");
            }
            map = new StringBuilder(34);
            map.append("  Response Code:\n    ");
            map.append(i);
            map.append("\n}");
            zzalg.m21225a(map.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.zzaft m26192a(com.google.android.gms.internal.ads.zzafp r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.google.android.gms.internal.ads.zzahf r24, com.google.android.gms.internal.ads.zzoj r25, com.google.android.gms.internal.ads.zzagw r26) {
        /*
        r0 = r18;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        if (r2 == 0) goto L_0x000f;
    L_0x000a:
        r5 = r25.m10925a();
        goto L_0x0010;
    L_0x000f:
        r5 = 0;
    L_0x0010:
        r6 = new com.google.android.gms.internal.ads.zzahd;	 Catch:{ IOException -> 0x01d4 }
        r7 = r24.m9540b();	 Catch:{ IOException -> 0x01d4 }
        r6.<init>(r0, r7);	 Catch:{ IOException -> 0x01d4 }
        r7 = "AdRequestServiceImpl: Sending request: ";
        r8 = java.lang.String.valueOf(r21);	 Catch:{ IOException -> 0x01d4 }
        r9 = r8.length();	 Catch:{ IOException -> 0x01d4 }
        if (r9 == 0) goto L_0x002a;
    L_0x0025:
        r7 = r7.concat(r8);	 Catch:{ IOException -> 0x01d4 }
        goto L_0x0030;
    L_0x002a:
        r8 = new java.lang.String;	 Catch:{ IOException -> 0x01d4 }
        r8.<init>(r7);	 Catch:{ IOException -> 0x01d4 }
        r7 = r8;
    L_0x0030:
        com.google.android.gms.internal.ads.zzaok.m10001b(r7);	 Catch:{ IOException -> 0x01d4 }
        r7 = new java.net.URL;	 Catch:{ IOException -> 0x01d4 }
        r8 = r21;
        r7.<init>(r8);	 Catch:{ IOException -> 0x01d4 }
        r8 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ IOException -> 0x01d4 }
        r8 = r8.elapsedRealtime();	 Catch:{ IOException -> 0x01d4 }
        r10 = 0;
        r11 = 0;
    L_0x0044:
        if (r3 == 0) goto L_0x004b;
    L_0x0046:
        r12 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r12.mo2238a();	 Catch:{ IOException -> 0x01d4 }
    L_0x004b:
        r12 = r7.openConnection();	 Catch:{ IOException -> 0x01d4 }
        r12 = (java.net.HttpURLConnection) r12;	 Catch:{ IOException -> 0x01d4 }
        r13 = com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x01c8 }
        r14 = r19;
        r15 = r20;
        r13.m9836a(r14, r15, r10, r12);	 Catch:{ all -> 0x01c8 }
        r13 = r24.m9543e();	 Catch:{ all -> 0x01c8 }
        if (r13 == 0) goto L_0x0080;
    L_0x0062:
        r13 = android.text.TextUtils.isEmpty(r22);	 Catch:{ all -> 0x01c8 }
        if (r13 != 0) goto L_0x0070;
    L_0x0068:
        r13 = "x-afma-drt-cookie";
        r10 = r22;
        r12.addRequestProperty(r13, r10);	 Catch:{ all -> 0x01c8 }
        goto L_0x0072;
    L_0x0070:
        r10 = r22;
    L_0x0072:
        r13 = android.text.TextUtils.isEmpty(r23);	 Catch:{ all -> 0x01c8 }
        if (r13 != 0) goto L_0x0082;
    L_0x0078:
        r13 = "x-afma-drt-v2-cookie";
        r4 = r23;
        r12.addRequestProperty(r13, r4);	 Catch:{ all -> 0x01c8 }
        goto L_0x0084;
    L_0x0080:
        r10 = r22;
    L_0x0082:
        r4 = r23;
    L_0x0084:
        r13 = r0.f19714H;	 Catch:{ all -> 0x01c8 }
        r17 = android.text.TextUtils.isEmpty(r13);	 Catch:{ all -> 0x01c8 }
        if (r17 != 0) goto L_0x0096;
    L_0x008c:
        r17 = "Sending webview cookie in ad request header.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r17);	 Catch:{ all -> 0x01c8 }
        r4 = "Cookie";
        r12.addRequestProperty(r4, r13);	 Catch:{ all -> 0x01c8 }
    L_0x0096:
        r4 = 1;
        if (r1 == 0) goto L_0x00cd;
    L_0x0099:
        r13 = r24.m9541c();	 Catch:{ all -> 0x01c8 }
        r13 = android.text.TextUtils.isEmpty(r13);	 Catch:{ all -> 0x01c8 }
        if (r13 != 0) goto L_0x00cd;
    L_0x00a3:
        r12.setDoOutput(r4);	 Catch:{ all -> 0x01c8 }
        r13 = r24.m9541c();	 Catch:{ all -> 0x01c8 }
        r13 = r13.getBytes();	 Catch:{ all -> 0x01c8 }
        r4 = r13.length;	 Catch:{ all -> 0x01c8 }
        r12.setFixedLengthStreamingMode(r4);	 Catch:{ all -> 0x01c8 }
        r4 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x00c6 }
        r10 = r12.getOutputStream();	 Catch:{ all -> 0x00c6 }
        r4.<init>(r10);	 Catch:{ all -> 0x00c6 }
        r4.write(r13);	 Catch:{ all -> 0x00c2 }
        com.google.android.gms.common.util.IOUtils.closeQuietly(r4);	 Catch:{ all -> 0x01c8 }
        goto L_0x00ce;
    L_0x00c2:
        r0 = move-exception;
        r16 = r4;
        goto L_0x00c9;
    L_0x00c6:
        r0 = move-exception;
        r16 = 0;
    L_0x00c9:
        com.google.android.gms.common.util.IOUtils.closeQuietly(r16);	 Catch:{ all -> 0x01c8 }
        throw r0;	 Catch:{ all -> 0x01c8 }
    L_0x00cd:
        r13 = 0;
    L_0x00ce:
        r4 = new com.google.android.gms.internal.ads.zzaoe;	 Catch:{ all -> 0x01c8 }
        r10 = r0.f19754v;	 Catch:{ all -> 0x01c8 }
        r4.<init>(r10);	 Catch:{ all -> 0x01c8 }
        r4.m9995a(r12, r13);	 Catch:{ all -> 0x01c8 }
        r10 = r12.getResponseCode();	 Catch:{ all -> 0x01c8 }
        r13 = r12.getHeaderFields();	 Catch:{ all -> 0x01c8 }
        r4.m9994a(r12, r10);	 Catch:{ all -> 0x01c8 }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r14 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r10 < r0) goto L_0x0130;
    L_0x00e9:
        if (r10 >= r14) goto L_0x0130;
    L_0x00eb:
        r0 = r7.toString();	 Catch:{ all -> 0x01c8 }
        r7 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0129 }
        r11 = r12.getInputStream();	 Catch:{ all -> 0x0129 }
        r7.<init>(r11);	 Catch:{ all -> 0x0129 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0125 }
        r11 = com.google.android.gms.internal.ads.zzalo.m9784a(r7);	 Catch:{ all -> 0x0125 }
        com.google.android.gms.common.util.IOUtils.closeQuietly(r7);	 Catch:{ all -> 0x01c8 }
        r4.m9992a(r11);	 Catch:{ all -> 0x01c8 }
        m26195a(r0, r13, r11, r10);	 Catch:{ all -> 0x01c8 }
        r6.m9537a(r0, r13, r11);	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x0116;
    L_0x010d:
        r0 = "ufe";
        r0 = new java.lang.String[]{r0};	 Catch:{ all -> 0x01c8 }
        r2.m10931a(r5, r0);	 Catch:{ all -> 0x01c8 }
    L_0x0116:
        r0 = r6.m9536a(r8, r1);	 Catch:{ all -> 0x01c8 }
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x0124;
    L_0x011f:
        r1 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r1.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x0124:
        return r0;
    L_0x0125:
        r0 = move-exception;
        r16 = r7;
        goto L_0x012c;
    L_0x0129:
        r0 = move-exception;
        r16 = 0;
    L_0x012c:
        com.google.android.gms.common.util.IOUtils.closeQuietly(r16);	 Catch:{ all -> 0x01c8 }
        throw r0;	 Catch:{ all -> 0x01c8 }
    L_0x0130:
        r0 = r7.toString();	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        m26195a(r0, r13, r4, r10);	 Catch:{ all -> 0x01c8 }
        if (r10 < r14) goto L_0x01a1;
    L_0x013a:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r10 >= r0) goto L_0x01a1;
    L_0x013e:
        r0 = "Location";
        r0 = r12.getHeaderField(r0);	 Catch:{ all -> 0x01c8 }
        r7 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x01c8 }
        if (r7 == 0) goto L_0x0160;
    L_0x014a:
        r0 = "No location header to follow redirect.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ all -> 0x01c8 }
        r0 = new com.google.android.gms.internal.ads.zzaft;	 Catch:{ all -> 0x01c8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01c8 }
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x015f;
    L_0x015a:
        r1 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r1.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x015f:
        return r0;
    L_0x0160:
        r7 = new java.net.URL;	 Catch:{ all -> 0x01c8 }
        r7.<init>(r0);	 Catch:{ all -> 0x01c8 }
        r0 = 1;
        r11 = r11 + r0;
        r0 = com.google.android.gms.internal.ads.zznw.cx;	 Catch:{ all -> 0x01c8 }
        r10 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x01c8 }
        r0 = r10.m10897a(r0);	 Catch:{ all -> 0x01c8 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x01c8 }
        r0 = r0.intValue();	 Catch:{ all -> 0x01c8 }
        if (r11 <= r0) goto L_0x018f;
    L_0x0179:
        r0 = "Too many redirects.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ all -> 0x01c8 }
        r0 = new com.google.android.gms.internal.ads.zzaft;	 Catch:{ all -> 0x01c8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01c8 }
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x018e;
    L_0x0189:
        r1 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r1.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x018e:
        return r0;
    L_0x018f:
        r6.m9538a(r13);	 Catch:{ all -> 0x01c8 }
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x019c;
    L_0x0197:
        r0 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r0.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x019c:
        r0 = r18;
        r10 = 0;
        goto L_0x0044;
    L_0x01a1:
        r0 = 46;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01c8 }
        r1.<init>(r0);	 Catch:{ all -> 0x01c8 }
        r0 = "Received error HTTP response code: ";
        r1.append(r0);	 Catch:{ all -> 0x01c8 }
        r1.append(r10);	 Catch:{ all -> 0x01c8 }
        r0 = r1.toString();	 Catch:{ all -> 0x01c8 }
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ all -> 0x01c8 }
        r0 = new com.google.android.gms.internal.ads.zzaft;	 Catch:{ all -> 0x01c8 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ all -> 0x01c8 }
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x01c7;
    L_0x01c2:
        r1 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r1.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x01c7:
        return r0;
    L_0x01c8:
        r0 = move-exception;
        r12.disconnect();	 Catch:{ IOException -> 0x01d4 }
        if (r3 == 0) goto L_0x01d3;
    L_0x01ce:
        r1 = r3.f8610g;	 Catch:{ IOException -> 0x01d4 }
        r1.mo2239b();	 Catch:{ IOException -> 0x01d4 }
    L_0x01d3:
        throw r0;	 Catch:{ IOException -> 0x01d4 }
    L_0x01d4:
        r0 = move-exception;
        r1 = "Error while connecting to ad server: ";
        r0 = r0.getMessage();
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x01ea;
    L_0x01e5:
        r0 = r1.concat(r0);
        goto L_0x01ef;
    L_0x01ea:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x01ef:
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        r0 = new com.google.android.gms.internal.ads.zzaft;
        r1 = 2;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagx.a(com.google.android.gms.internal.ads.zzafp, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzahf, com.google.android.gms.internal.ads.zzoj, com.google.android.gms.internal.ads.zzagw):com.google.android.gms.internal.ads.zzaft");
    }

    private zzagx(Context context, zzagw zzagw) {
        this.f19842c = context;
        this.f19843d = zzagw;
    }

    /* renamed from: a */
    public final zzaft mo2232a(zzafp zzafp) {
        return m26191a(this.f19842c, this.f19843d, zzafp, this.f19844e);
    }

    /* renamed from: a */
    public final void mo2233a(zzafp zzafp, zzaga zzaga) {
        zzbv.zzeo().m9712a(this.f19842c, zzafp.f19743k);
        zzafp = zzalm.m9772a(new bv(this, zzafp, zzaga));
        zzbv.zzfa().m9925a();
        zzbv.zzfa().m9926b().postDelayed(new bx(this, zzafp), 60000);
    }
}
