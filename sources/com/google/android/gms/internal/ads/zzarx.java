package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzaer
public final class zzarx extends zzarr {
    /* renamed from: b */
    private static final Set<String> f19918b = Collections.synchronizedSet(new HashSet());
    /* renamed from: c */
    private static final DecimalFormat f19919c = new DecimalFormat("#,###");
    /* renamed from: d */
    private File f19920d;
    /* renamed from: e */
    private boolean f19921e;

    public zzarx(zzarg zzarg) {
        super(zzarg);
        zzarg = this.a.getCacheDir();
        if (zzarg == null) {
            zzaok.m10007e("Context.getCacheDir() returned null");
            return;
        }
        this.f19920d = new File(zzarg, "admobVideoStreams");
        if (this.f19920d.isDirectory() == null && this.f19920d.mkdirs() == null) {
            zzarg = "Could not create preload cache directory at ";
            String valueOf = String.valueOf(this.f19920d.getAbsolutePath());
            zzaok.m10007e(valueOf.length() != 0 ? zzarg.concat(valueOf) : new String(zzarg));
            this.f19920d = null;
            return;
        }
        if (this.f19920d.setReadable(true, false) != null) {
            if (this.f19920d.setExecutable(true, false) != null) {
                return;
            }
        }
        zzarg = "Could not set cache file permissions at ";
        valueOf = String.valueOf(this.f19920d.getAbsolutePath());
        zzaok.m10007e(valueOf.length() != 0 ? zzarg.concat(valueOf) : new String(zzarg));
        this.f19920d = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo4196a(java.lang.String r31) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r30 = this;
        r8 = r30;
        r9 = r31;
        r0 = r8.f19920d;
        r10 = 0;
        r11 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000a:
        r0 = "noCacheDir";
        r8.m21370a(r9, r10, r0, r10);
        return r11;
    L_0x0010:
        r0 = r8.f19920d;
        if (r0 != 0) goto L_0x0016;
    L_0x0014:
        r3 = 0;
        goto L_0x0034;
    L_0x0016:
        r0 = r8.f19920d;
        r0 = r0.listFiles();
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
    L_0x001f:
        if (r2 >= r1) goto L_0x0034;
    L_0x0021:
        r4 = r0[r2];
        r4 = r4.getName();
        r5 = ".done";
        r4 = r4.endsWith(r5);
        if (r4 != 0) goto L_0x0031;
    L_0x002f:
        r3 = r3 + 1;
    L_0x0031:
        r2 = r2 + 1;
        goto L_0x001f;
    L_0x0034:
        r0 = com.google.android.gms.internal.ads.zznw.f9715m;
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r0 = r1.m10897a(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        if (r3 <= r0) goto L_0x009a;
    L_0x0046:
        r0 = r8.f19920d;
        if (r0 != 0) goto L_0x004c;
    L_0x004a:
        r0 = 0;
        goto L_0x008d;
    L_0x004c:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2 = r8.f19920d;
        r2 = r2.listFiles();
        r3 = r2.length;
        r4 = r0;
        r1 = r10;
        r0 = 0;
    L_0x005b:
        if (r0 >= r3) goto L_0x0078;
    L_0x005d:
        r6 = r2[r0];
        r7 = r6.getName();
        r12 = ".done";
        r7 = r7.endsWith(r12);
        if (r7 != 0) goto L_0x0075;
    L_0x006b:
        r12 = r6.lastModified();
        r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x0075;
    L_0x0073:
        r1 = r6;
        r4 = r12;
    L_0x0075:
        r0 = r0 + 1;
        goto L_0x005b;
    L_0x0078:
        if (r1 == 0) goto L_0x004a;
    L_0x007a:
        r0 = r1.delete();
        r1 = r8.m26300a(r1);
        r2 = r1.isFile();
        if (r2 == 0) goto L_0x008d;
    L_0x0088:
        r1 = r1.delete();
        r0 = r0 & r1;
    L_0x008d:
        if (r0 != 0) goto L_0x0010;
    L_0x008f:
        r0 = "Unable to expire stream cache";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        r0 = "expireFailed";
        r8.m21370a(r9, r10, r0, r10);
        return r11;
    L_0x009a:
        com.google.android.gms.internal.ads.zzkd.m10709a();
        r0 = com.google.android.gms.internal.ads.zzaoa.m9955a(r31);
        r12 = new java.io.File;
        r1 = r8.f19920d;
        r12.<init>(r1, r0);
        r0 = r8.m26300a(r12);
        r1 = r12.isFile();
        r13 = 1;
        if (r1 == 0) goto L_0x00e0;
    L_0x00b3:
        r1 = r0.isFile();
        if (r1 == 0) goto L_0x00e0;
    L_0x00b9:
        r0 = r12.length();
        r0 = (int) r0;
        r1 = "Stream cache hit at ";
        r2 = java.lang.String.valueOf(r31);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00cf;
    L_0x00ca:
        r1 = r1.concat(r2);
        goto L_0x00d5;
    L_0x00cf:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r1 = r2;
    L_0x00d5:
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
        r1 = r12.getAbsolutePath();
        r8.m21369a(r9, r1, r0);
        return r13;
    L_0x00e0:
        r1 = r8.f19920d;
        r1 = r1.getAbsolutePath();
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r31);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00fa;
    L_0x00f4:
        r1 = r1.concat(r2);
        r14 = r1;
        goto L_0x0100;
    L_0x00fa:
        r2 = new java.lang.String;
        r2.<init>(r1);
        r14 = r2;
    L_0x0100:
        r1 = f19918b;
        monitor-enter(r1);
        r2 = f19918b;	 Catch:{ all -> 0x05a6 }
        r2 = r2.contains(r14);	 Catch:{ all -> 0x05a6 }
        if (r2 == 0) goto L_0x0130;	 Catch:{ all -> 0x05a6 }
    L_0x010b:
        r0 = "Stream cache already in progress at ";	 Catch:{ all -> 0x05a6 }
        r2 = java.lang.String.valueOf(r31);	 Catch:{ all -> 0x05a6 }
        r3 = r2.length();	 Catch:{ all -> 0x05a6 }
        if (r3 == 0) goto L_0x011c;	 Catch:{ all -> 0x05a6 }
    L_0x0117:
        r0 = r0.concat(r2);	 Catch:{ all -> 0x05a6 }
        goto L_0x0122;	 Catch:{ all -> 0x05a6 }
    L_0x011c:
        r2 = new java.lang.String;	 Catch:{ all -> 0x05a6 }
        r2.<init>(r0);	 Catch:{ all -> 0x05a6 }
        r0 = r2;	 Catch:{ all -> 0x05a6 }
    L_0x0122:
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ all -> 0x05a6 }
        r0 = r12.getAbsolutePath();	 Catch:{ all -> 0x05a6 }
        r2 = "inProgress";	 Catch:{ all -> 0x05a6 }
        r8.m21370a(r9, r0, r2, r10);	 Catch:{ all -> 0x05a6 }
        monitor-exit(r1);	 Catch:{ all -> 0x05a6 }
        return r11;	 Catch:{ all -> 0x05a6 }
    L_0x0130:
        r2 = f19918b;	 Catch:{ all -> 0x05a6 }
        r2.add(r14);	 Catch:{ all -> 0x05a6 }
        monitor-exit(r1);	 Catch:{ all -> 0x05a6 }
        r15 = "error";
        com.google.android.gms.ads.internal.zzbv.zzex();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = com.google.android.gms.internal.ads.zznw.f9720r;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = r2.m10897a(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = (java.lang.Integer) r1;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = r1.intValue();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2.<init>(r9);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r3 = r2;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = 0;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
    L_0x0152:
        r2 = r2 + r13;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4 = 20;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        if (r2 > r4) goto L_0x04fe;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
    L_0x0157:
        r5 = r3.openConnection();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r5.setConnectTimeout(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r5.setReadTimeout(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6 = r5 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        if (r6 == 0) goto L_0x04f3;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
    L_0x0165:
        r5 = (java.net.HttpURLConnection) r5;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6 = new com.google.android.gms.internal.ads.zzaoe;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6.<init>();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6.m9995a(r5, r10);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r5.setInstanceFollowRedirects(r11);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r7 = r5.getResponseCode();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6.m9994a(r5, r7);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r7 = r7 / 100;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r6 = 3;
        if (r7 != r6) goto L_0x01f3;
    L_0x017e:
        r4 = "Location";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r4 = r5.getHeaderField(r4);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r4 == 0) goto L_0x01e6;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0186:
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r6.<init>(r3, r4);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r3 = r6.getProtocol();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r3 == 0) goto L_0x01de;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0191:
        r7 = "http";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r7 = r3.equals(r7);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r7 != 0) goto L_0x01be;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0199:
        r7 = "https";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r7 = r3.equals(r7);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r7 != 0) goto L_0x01be;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01a1:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = "Unsupported scheme: ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r3 = r2.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r3 == 0) goto L_0x01b4;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01af:
        r1 = r1.concat(r2);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        goto L_0x01ba;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01b4:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.<init>(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = r2;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01ba:
        r0.<init>(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        throw r0;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01be:
        r3 = "Redirecting to ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r7 = r4.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r7 == 0) goto L_0x01cf;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01ca:
        r3 = r3.concat(r4);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        goto L_0x01d5;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01cf:
        r4 = new java.lang.String;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r4.<init>(r3);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r3 = r4;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01d5:
        com.google.android.gms.internal.ads.zzaok.m10001b(r3);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r5.disconnect();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r3 = r6;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        goto L_0x0152;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01de:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = "Protocol is null";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0.<init>(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        throw r0;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01e6:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = "Missing Location header in redirect";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0.<init>(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        throw r0;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x01ee:
        r0 = move-exception;
    L_0x01ef:
        r3 = r10;
    L_0x01f0:
        r1 = r14;
        goto L_0x0513;
    L_0x01f3:
        r1 = r5 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        if (r1 == 0) goto L_0x024e;
    L_0x01f7:
        r1 = r5;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = r1.getResponseCode();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r1 < r2) goto L_0x024e;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0202:
        r2 = "badUrl";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = "HTTP request failed. Code: ";	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        r3 = java.lang.Integer.toString(r1);	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        r4 = r3.length();	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        if (r4 == 0) goto L_0x021a;	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
    L_0x0214:
        r0 = r0.concat(r3);	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        r3 = r0;	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        goto L_0x021f;	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
    L_0x021a:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
        r3.<init>(r0);	 Catch:{ IOException -> 0x024b, IOException -> 0x024b }
    L_0x021f:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r4 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r4 = r4.length();	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r4 = r4 + 32;	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r4 = "HTTP status code ";	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5.append(r4);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5.append(r1);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r1 = " at ";	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5.append(r1);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r5.append(r9);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r1 = r5.toString();	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
        throw r0;	 Catch:{ IOException -> 0x0248, IOException -> 0x0248 }
    L_0x0248:
        r0 = move-exception;
        r15 = r2;
        goto L_0x01f0;
    L_0x024b:
        r0 = move-exception;
        r15 = r2;
        goto L_0x01ef;
    L_0x024e:
        r7 = r5.getContentLength();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        if (r7 >= 0) goto L_0x027d;
    L_0x0254:
        r0 = "Stream cache aborted, missing content-length header at ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = r1.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r2 == 0) goto L_0x0265;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0260:
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        goto L_0x026b;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x0265:
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r1;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x026b:
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = "contentLengthMissing";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r8.m21370a(r9, r0, r1, r10);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = f19918b;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0.remove(r14);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        return r11;
    L_0x027d:
        r1 = f19919c;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = (long) r7;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = r1.format(r2);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = com.google.android.gms.internal.ads.zznw.f9716n;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r3 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = r3.m10897a(r2);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r3 = r2.intValue();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        if (r7 <= r3) goto L_0x02eb;
    L_0x0296:
        r0 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r0.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r0 + 33;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = r2.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r0 + r2;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.<init>(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = "Content length ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.append(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.append(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = " exceeds limit at ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.append(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2.append(r9);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r2.toString();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = r1.length();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        if (r2 == 0) goto L_0x02d6;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x02d1:
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        goto L_0x02dc;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x02d6:
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = r1;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
    L_0x02dc:
        r1 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r2 = "sizeExceeded";	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r8.m21370a(r9, r1, r2, r0);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0 = f19918b;	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        r0.remove(r14);	 Catch:{ IOException -> 0x01ee, IOException -> 0x01ee }
        return r11;
    L_0x02eb:
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = r2.length();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = r2 + r4;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4 = r4.length();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = r2 + r4;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.<init>(r2);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = "Caching ";	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.append(r2);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.append(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = " bytes from ";	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.append(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.append(r9);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = r4.toString();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r1 = r5.getInputStream();	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r5 = java.nio.channels.Channels.newChannel(r1);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r4.<init>(r12);	 Catch:{ IOException -> 0x050d, IOException -> 0x050d }
        r2 = r4.getChannel();	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r1 = java.nio.ByteBuffer.allocate(r1);	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r16 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r17 = r16.currentTimeMillis();	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r6 = com.google.android.gms.internal.ads.zznw.f9719q;	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r10 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r6 = r10.m10897a(r6);	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r6 = (java.lang.Long) r6;	 Catch:{ IOException -> 0x04e9, IOException -> 0x04e9 }
        r20 = r14;
        r13 = r6.longValue();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r10 = new com.google.android.gms.internal.ads.zzanp;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r10.<init>(r13);	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r6 = com.google.android.gms.internal.ads.zznw.f9718p;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r13 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r6 = r13.m10897a(r6);	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r6 = (java.lang.Long) r6;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r13 = r6.longValue();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r6 = 0;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x0360:
        r21 = r5.read(r1);	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        if (r21 < 0) goto L_0x046c;
    L_0x0366:
        r6 = r6 + r21;
        if (r6 <= r3) goto L_0x03a1;
    L_0x036a:
        r1 = "sizeExceeded";	 Catch:{ IOException -> 0x039b, IOException -> 0x039b }
        r0 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r2 = java.lang.Integer.toString(r6);	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r3 = r2.length();	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        if (r3 == 0) goto L_0x0382;	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
    L_0x037c:
        r0 = r0.concat(r2);	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r10 = r0;	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        goto L_0x0388;	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
    L_0x0382:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0398, IOException -> 0x0398 }
        r10 = r2;
    L_0x0388:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0390, IOException -> 0x0390 }
        r2 = "stream cache file size limit exceeded";	 Catch:{ IOException -> 0x0390, IOException -> 0x0390 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0390, IOException -> 0x0390 }
        throw r0;	 Catch:{ IOException -> 0x0390, IOException -> 0x0390 }
    L_0x0390:
        r0 = move-exception;
        r15 = r1;
        r3 = r10;
        r1 = r20;
        r10 = r4;
        goto L_0x0513;
    L_0x0398:
        r0 = move-exception;
        r15 = r1;
        goto L_0x039c;
    L_0x039b:
        r0 = move-exception;
    L_0x039c:
        r10 = r4;
        r1 = r20;
        goto L_0x04f1;
    L_0x03a1:
        r1.flip();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x03a4:
        r21 = r2.write(r1);	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        if (r21 > 0) goto L_0x03a4;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x03aa:
        r1.clear();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r21 = r16.currentTimeMillis();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r23 = 0;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r21 = r21 - r17;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r23 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r23 = r23 * r13;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r25 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1));	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        if (r25 > 0) goto L_0x042f;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x03bd:
        r11 = r8.f19921e;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        if (r11 != 0) goto L_0x0421;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x03c1:
        r11 = r10.m9930a();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        if (r11 == 0) goto L_0x03fa;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
    L_0x03c7:
        r11 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r26 = r10;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r10 = com.google.android.gms.internal.ads.zzaoa.f8948a;	 Catch:{ IOException -> 0x04e1, IOException -> 0x04e1 }
        r27 = r15;
        r15 = new com.google.android.gms.internal.ads.ge;	 Catch:{ IOException -> 0x03f5, IOException -> 0x03f5 }
        r21 = 0;
        r22 = r1;
        r1 = r15;
        r23 = r2;
        r2 = r30;
        r24 = r3;
        r3 = r31;
        r25 = r4;
        r4 = r11;
        r11 = r5;
        r5 = r6;
        r19 = r6;
        r28 = 3;
        r6 = r7;
        r29 = r7;
        r7 = r21;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r10.post(r15);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        goto L_0x040d;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x03f5:
        r0 = move-exception;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r25 = r4;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        goto L_0x04da;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x03fa:
        r22 = r1;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r23 = r2;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r24 = r3;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r25 = r4;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r11 = r5;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r19 = r6;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r29 = r7;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r26 = r10;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r27 = r15;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r28 = 3;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x040d:
        r5 = r11;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r6 = r19;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = r22;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = r23;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3 = r24;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r4 = r25;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r10 = r26;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r15 = r27;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r7 = r29;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r11 = 0;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        goto L_0x0360;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x0421:
        r25 = r4;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r27 = r15;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r15 = "externalAbort";	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r1 = "abort requested";	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        throw r0;	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
    L_0x042f:
        r25 = r4;
        r27 = r15;
        r15 = "downloadTimeout";	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r0 = java.lang.Long.toString(r13);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r1 = r1.length();	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r1 = r1 + 29;	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r1 = "Timeout exceeded. Limit: ";	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r2.append(r1);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r2.append(r0);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r0 = " sec";	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r2.append(r0);	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r10 = r2.toString();	 Catch:{ IOException -> 0x0469, IOException -> 0x0469 }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0461, IOException -> 0x0461 }
        r1 = "stream cache time limit exceeded";	 Catch:{ IOException -> 0x0461, IOException -> 0x0461 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0461, IOException -> 0x0461 }
        throw r0;	 Catch:{ IOException -> 0x0461, IOException -> 0x0461 }
    L_0x0461:
        r0 = move-exception;
        r3 = r10;
        r1 = r20;
        r10 = r25;
        goto L_0x0513;
    L_0x0469:
        r0 = move-exception;
        goto L_0x04e6;
    L_0x046c:
        r25 = r4;
        r27 = r15;
        r28 = 3;
        r25.close();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = com.google.android.gms.internal.ads.zzaok.m10000a(r28);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        if (r1 == 0) goto L_0x04b1;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x047b:
        r1 = f19919c;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = (long) r6;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = r1.format(r2);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = r2.length();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = r2 + 22;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3 = r3.length();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = r2 + r3;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = "Preloaded ";	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3.append(r2);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3.append(r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = " bytes from ";	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3.append(r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r3.append(r9);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = r3.toString();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x04b1:
        r1 = 0;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r2 = 1;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r12.setReadable(r2, r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = r0.isFile();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        if (r1 == 0) goto L_0x04c4;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
    L_0x04bc:
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r0.setLastModified(r1);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        goto L_0x04c7;
    L_0x04c4:
        r0.createNewFile();	 Catch:{ IOException -> 0x04c7 }
    L_0x04c7:
        r0 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r8.m21369a(r9, r0, r6);	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r0 = f19918b;	 Catch:{ IOException -> 0x04d9, IOException -> 0x04d9 }
        r1 = r20;
        r0.remove(r1);	 Catch:{ IOException -> 0x04d7, IOException -> 0x04d7 }
        r0 = 1;
        return r0;
    L_0x04d7:
        r0 = move-exception;
        goto L_0x04dc;
    L_0x04d9:
        r0 = move-exception;
    L_0x04da:
        r1 = r20;
    L_0x04dc:
        r10 = r25;
        r15 = r27;
        goto L_0x04f1;
    L_0x04e1:
        r0 = move-exception;
        r25 = r4;
        r27 = r15;
    L_0x04e6:
        r1 = r20;
        goto L_0x04ef;
    L_0x04e9:
        r0 = move-exception;
        r25 = r4;
        r1 = r14;
        r27 = r15;
    L_0x04ef:
        r10 = r25;
    L_0x04f1:
        r3 = 0;
        goto L_0x0513;
    L_0x04f3:
        r1 = r14;
        r27 = r15;
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r2 = "Invalid protocol.";	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        throw r0;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
    L_0x04fe:
        r1 = r14;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r27 = r15;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r2 = "Too many redirects (20)";	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
        throw r0;	 Catch:{ IOException -> 0x0509, IOException -> 0x0509 }
    L_0x0509:
        r0 = move-exception;
        r15 = r27;
        goto L_0x0511;
    L_0x050d:
        r0 = move-exception;
        r1 = r14;
        r27 = r15;
    L_0x0511:
        r3 = 0;
        r10 = 0;
    L_0x0513:
        r2 = r0 instanceof java.lang.RuntimeException;
        if (r2 == 0) goto L_0x0520;
    L_0x0517:
        r2 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r4 = "VideoStreamFullFileCache.preload";
        r2.m9714a(r0, r4);
    L_0x0520:
        r10.close();	 Catch:{ IOException -> 0x0523, IOException -> 0x0523 }
    L_0x0523:
        r2 = r8.f19921e;
        if (r2 == 0) goto L_0x054b;
    L_0x0527:
        r0 = java.lang.String.valueOf(r31);
        r0 = r0.length();
        r0 = r0 + 26;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Preload aborted for URL \"";
        r2.append(r0);
        r2.append(r9);
        r0 = "\"";
        r2.append(r0);
        r0 = r2.toString();
        com.google.android.gms.internal.ads.zzaok.m10005d(r0);
        goto L_0x056e;
    L_0x054b:
        r2 = java.lang.String.valueOf(r31);
        r2 = r2.length();
        r2 = r2 + 25;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r2);
        r2 = "Preload failed for URL \"";
        r4.append(r2);
        r4.append(r9);
        r2 = "\"";
        r4.append(r2);
        r2 = r4.toString();
        com.google.android.gms.internal.ads.zzaok.m10004c(r2, r0);
    L_0x056e:
        r0 = r12.exists();
        if (r0 == 0) goto L_0x0598;
    L_0x0574:
        r0 = r12.delete();
        if (r0 != 0) goto L_0x0598;
    L_0x057a:
        r0 = "Could not delete partial cache file at ";
        r2 = r12.getAbsolutePath();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x058f;
    L_0x058a:
        r0 = r0.concat(r2);
        goto L_0x0595;
    L_0x058f:
        r2 = new java.lang.String;
        r2.<init>(r0);
        r0 = r2;
    L_0x0595:
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0598:
        r0 = r12.getAbsolutePath();
        r8.m21370a(r9, r0, r15, r3);
        r0 = f19918b;
        r0.remove(r1);
        r1 = 0;
        return r1;
    L_0x05a6:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x05a6 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarx.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo4195a() {
        this.f19921e = true;
    }

    /* renamed from: a */
    private final File m26300a(File file) {
        return new File(this.f19920d, String.valueOf(file.getName()).concat(".done"));
    }
}
