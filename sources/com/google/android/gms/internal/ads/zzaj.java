package com.google.android.gms.internal.ads;

public class zzaj implements zzm {
    /* renamed from: a */
    private static final boolean f16815a = zzaf.f8537a;
    @Deprecated
    /* renamed from: b */
    private final zzar f16816b;
    /* renamed from: c */
    private final zzai f16817c;
    /* renamed from: d */
    private final zzak f16818d;

    @Deprecated
    public zzaj(zzar zzar) {
        this(zzar, new zzak(4096));
    }

    @Deprecated
    private zzaj(zzar zzar, zzak zzak) {
        this.f16816b = zzar;
        this.f16817c = new bw(zzar);
        this.f16818d = zzak;
    }

    public zzaj(zzai zzai) {
        this(zzai, new zzak(4096));
    }

    private zzaj(zzai zzai, zzak zzak) {
        this.f16817c = zzai;
        this.f16816b = zzai;
        this.f16818d = zzak;
    }

    /* renamed from: a */
    public com.google.android.gms.internal.ads.zzp mo2294a(com.google.android.gms.internal.ads.zzr<?> r22) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r21 = this;
        r1 = r21;
        r2 = r22;
        r3 = android.os.SystemClock.elapsedRealtime();
    L_0x0008:
        r5 = java.util.Collections.emptyList();
        r6 = 1;
        r7 = 2;
        r9 = 0;
        r0 = r22.m11036g();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        if (r0 != 0) goto L_0x001a;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x0015:
        r0 = java.util.Collections.emptyMap();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        goto L_0x003e;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x001a:
        r10 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r10.<init>();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r11 = r0.f9327b;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        if (r11 == 0) goto L_0x002a;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x0023:
        r11 = "If-None-Match";	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r12 = r0.f9327b;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r10.put(r11, r12);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x002a:
        r11 = r0.f9329d;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r13 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        if (r15 <= 0) goto L_0x003d;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x0032:
        r11 = "If-Modified-Since";	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r12 = r0.f9329d;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r0 = com.google.android.gms.internal.ads.zzap.m10033a(r12);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r10.put(r11, r0);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x003d:
        r0 = r10;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
    L_0x003e:
        r10 = r1.f16817c;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r10 = r10.mo4152a(r2, r0);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a8 }
        r12 = r10.m10043a();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a4 }
        r11 = r10.m10044b();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x01a4 }
        r0 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r12 != r0) goto L_0x011d;
    L_0x0050:
        r0 = r22.m11036g();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r0 != 0) goto L_0x006b;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0056:
        r0 = new com.google.android.gms.internal.ads.zzp;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r16 = 1;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r5 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r17 = r12 - r3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r19 = r11;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13.<init>(r14, r15, r16, r17, r19);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        return r0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x006b:
        r5 = new java.util.TreeSet;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r12 = java.lang.String.CASE_INSENSITIVE_ORDER;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r5.<init>(r12);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r12 = r11.isEmpty();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r12 != 0) goto L_0x0090;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0078:
        r12 = r11.iterator();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x007c:
        r13 = r12.hasNext();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r13 == 0) goto L_0x0090;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0082:
        r13 = r12.next();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = (com.google.android.gms.internal.ads.zzl) r13;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.m10728a();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r5.add(r13);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        goto L_0x007c;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0090:
        r12 = new java.util.ArrayList;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r12.<init>(r11);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r0.f9333h;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r13 == 0) goto L_0x00c1;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0099:
        r13 = r0.f9333h;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.isEmpty();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r13 != 0) goto L_0x0100;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00a1:
        r13 = r0.f9333h;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.iterator();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00a7:
        r14 = r13.hasNext();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r14 == 0) goto L_0x0100;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00ad:
        r14 = r13.next();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = (com.google.android.gms.internal.ads.zzl) r14;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = r14.m10728a();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = r5.contains(r15);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r15 != 0) goto L_0x00a7;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00bd:
        r12.add(r14);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        goto L_0x00a7;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00c1:
        r13 = r0.f9332g;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.isEmpty();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r13 != 0) goto L_0x0100;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00c9:
        r13 = r0.f9332g;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.entrySet();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = r13.iterator();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00d3:
        r14 = r13.hasNext();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r14 == 0) goto L_0x0100;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00d9:
        r14 = r13.next();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = r14.getKey();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = r5.contains(r15);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        if (r15 != 0) goto L_0x00d3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x00e9:
        r15 = new com.google.android.gms.internal.ads.zzl;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r16 = r14.getKey();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r8 = r16;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r8 = (java.lang.String) r8;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = r14.getValue();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = (java.lang.String) r14;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15.<init>(r8, r14);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r12.add(r15);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        goto L_0x00d3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
    L_0x0100:
        r5 = new com.google.android.gms.internal.ads.zzp;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r15 = 304; // 0x130 float:4.26E-43 double:1.5E-321;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r0 = r0.f9326a;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r17 = 1;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r8 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r18 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14 = r5;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r16 = r0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r20 = r12;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r14.<init>(r15, r16, r17, r18, r20);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        return r5;
    L_0x0118:
        r0 = move-exception;
        r17 = r11;
        goto L_0x01ac;
    L_0x011d:
        r0 = r10.m10046d();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x019f }
        if (r0 == 0) goto L_0x012c;
    L_0x0123:
        r5 = r10.m10045c();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        r0 = r1.m21170a(r0, r5);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0118 }
        goto L_0x012e;
    L_0x012c:
        r0 = new byte[r9];	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x019f }
    L_0x012e:
        r5 = r0;
        r13 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r0 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r13 = r13 - r3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r0 = f16815a;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        if (r0 != 0) goto L_0x013f;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x0139:
        r15 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        if (r0 <= 0) goto L_0x0176;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x013f:
        r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8 = 5;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8 = new java.lang.Object[r8];	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8[r9] = r2;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r13 = java.lang.Long.valueOf(r13);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8[r6] = r13;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        if (r5 == 0) goto L_0x0159;
    L_0x014e:
        r13 = r5.length;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0154 }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0154 }
        goto L_0x015b;
    L_0x0154:
        r0 = move-exception;
        r13 = r5;
        r17 = r11;
        goto L_0x01ad;
    L_0x0159:
        r13 = "null";	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x015b:
        r8[r7] = r13;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r13 = 3;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r14 = java.lang.Integer.valueOf(r12);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8[r13] = r14;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r13 = 4;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r14 = r22.m11040k();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r14 = r14.mo2455b();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8[r13] = r14;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        com.google.android.gms.internal.ads.zzaf.m9510b(r0, r8);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x0176:
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        if (r12 < r0) goto L_0x0190;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x017a:
        r0 = 299; // 0x12b float:4.19E-43 double:1.477E-321;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        if (r12 > r0) goto L_0x0190;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
    L_0x017e:
        r0 = new com.google.android.gms.internal.ads.zzp;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r14 = 0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r15 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0199 }
        r8 = 0;
        r15 = r15 - r3;
        r8 = r11;
        r11 = r0;
        r13 = r5;
        r17 = r8;
        r11.<init>(r12, r13, r14, r15, r17);	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
        return r0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
    L_0x0190:
        r8 = r11;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
        r0 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
        r0.<init>();	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0241, MalformedURLException -> 0x0220, IOException -> 0x0197 }
    L_0x0197:
        r0 = move-exception;
        goto L_0x019b;
    L_0x0199:
        r0 = move-exception;
        r8 = r11;
    L_0x019b:
        r13 = r5;
        r17 = r8;
        goto L_0x01ad;
    L_0x019f:
        r0 = move-exception;
        r8 = r11;
        r17 = r8;
        goto L_0x01ac;
    L_0x01a4:
        r0 = move-exception;
        r17 = r5;
        goto L_0x01ac;
    L_0x01a8:
        r0 = move-exception;
        r17 = r5;
        r10 = 0;
    L_0x01ac:
        r13 = 0;
    L_0x01ad:
        if (r10 == 0) goto L_0x021a;
    L_0x01af:
        r0 = r10.m10043a();
        r5 = "Unexpected response code %d for %s";
        r7 = new java.lang.Object[r7];
        r8 = java.lang.Integer.valueOf(r0);
        r7[r9] = r8;
        r8 = r22.m11034e();
        r7[r6] = r8;
        com.google.android.gms.internal.ads.zzaf.m9511c(r5, r7);
        if (r13 == 0) goto L_0x020e;
    L_0x01c8:
        r5 = new com.google.android.gms.internal.ads.zzp;
        r14 = 0;
        r6 = android.os.SystemClock.elapsedRealtime();
        r15 = r6 - r3;
        r11 = r5;
        r12 = r0;
        r11.<init>(r12, r13, r14, r15, r17);
        r6 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r0 == r6) goto L_0x0202;
    L_0x01da:
        r6 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r0 != r6) goto L_0x01df;
    L_0x01de:
        goto L_0x0202;
    L_0x01df:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r0 < r2) goto L_0x01ee;
    L_0x01e3:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r0 <= r2) goto L_0x01e8;
    L_0x01e7:
        goto L_0x01ee;
    L_0x01e8:
        r0 = new com.google.android.gms.internal.ads.zzg;
        r0.<init>(r5);
        throw r0;
    L_0x01ee:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r0 < r2) goto L_0x01fc;
    L_0x01f2:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r0 > r2) goto L_0x01fc;
    L_0x01f6:
        r0 = new com.google.android.gms.internal.ads.zzac;
        r0.<init>(r5);
        throw r0;
    L_0x01fc:
        r0 = new com.google.android.gms.internal.ads.zzac;
        r0.<init>(r5);
        throw r0;
    L_0x0202:
        r0 = "auth";
        r6 = new com.google.android.gms.internal.ads.zza;
        r6.<init>(r5);
        m21169a(r0, r2, r6);
        goto L_0x0008;
    L_0x020e:
        r0 = "network";
        r5 = new com.google.android.gms.internal.ads.zzo;
        r5.<init>();
        m21169a(r0, r2, r5);
        goto L_0x0008;
    L_0x021a:
        r2 = new com.google.android.gms.internal.ads.zzq;
        r2.<init>(r0);
        throw r2;
    L_0x0220:
        r0 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = "Bad URL ";
        r2 = r22.m11034e();
        r2 = java.lang.String.valueOf(r2);
        r5 = r2.length();
        if (r5 == 0) goto L_0x0238;
    L_0x0233:
        r2 = r4.concat(r2);
        goto L_0x023d;
    L_0x0238:
        r2 = new java.lang.String;
        r2.<init>(r4);
    L_0x023d:
        r3.<init>(r2, r0);
        throw r3;
    L_0x0241:
        r0 = "socket";
        r5 = new com.google.android.gms.internal.ads.zzad;
        r5.<init>();
        m21169a(r0, r2, r5);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaj.a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    /* renamed from: a */
    private static void m21169a(String str, zzr<?> zzr, zzae zzae) {
        zzab k = zzr.m11040k();
        int j = zzr.m11039j();
        try {
            k.mo2454a(zzae);
            zzr.m11030b(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(j)}));
        } catch (zzae zzae2) {
            zzr.m11030b(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(j)}));
            throw zzae2;
        }
    }

    /* renamed from: a */
    private final byte[] m21170a(java.io.InputStream r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = new com.google.android.gms.internal.ads.zzav;
        r1 = r5.f16818d;
        r0.<init>(r1, r7);
        r7 = 0;
        r1 = 0;
        if (r6 == 0) goto L_0x003d;
    L_0x000b:
        r2 = r5.f16818d;	 Catch:{ all -> 0x0043 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ all -> 0x0043 }
        r2 = r2.m9653a(r3);	 Catch:{ all -> 0x0043 }
    L_0x0013:
        r1 = r6.read(r2);	 Catch:{ all -> 0x0038 }
        r3 = -1;	 Catch:{ all -> 0x0038 }
        if (r1 == r3) goto L_0x001e;	 Catch:{ all -> 0x0038 }
    L_0x001a:
        r0.write(r2, r7, r1);	 Catch:{ all -> 0x0038 }
        goto L_0x0013;	 Catch:{ all -> 0x0038 }
    L_0x001e:
        r1 = r0.toByteArray();	 Catch:{ all -> 0x0038 }
        if (r6 == 0) goto L_0x002f;
    L_0x0024:
        r6.close();	 Catch:{ IOException -> 0x0028 }
        goto L_0x002f;
    L_0x0028:
        r6 = "Error occurred when closing InputStream";
        r7 = new java.lang.Object[r7];
        com.google.android.gms.internal.ads.zzaf.m9508a(r6, r7);
    L_0x002f:
        r6 = r5.f16818d;
        r6.m9652a(r2);
        r0.close();
        return r1;
    L_0x0038:
        r1 = move-exception;
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x0044;
    L_0x003d:
        r2 = new com.google.android.gms.internal.ads.zzac;	 Catch:{ all -> 0x0043 }
        r2.<init>();	 Catch:{ all -> 0x0043 }
        throw r2;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r2 = move-exception;
    L_0x0044:
        if (r6 == 0) goto L_0x0051;
    L_0x0046:
        r6.close();	 Catch:{ IOException -> 0x004a }
        goto L_0x0051;
    L_0x004a:
        r6 = new java.lang.Object[r7];
        r7 = "Error occurred when closing InputStream";
        com.google.android.gms.internal.ads.zzaf.m9508a(r7, r6);
    L_0x0051:
        r6 = r5.f16818d;
        r6.m9652a(r1);
        r0.close();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaj.a(java.io.InputStream, int):byte[]");
    }
}
