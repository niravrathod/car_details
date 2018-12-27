package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbdd.zze;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class ma<T> implements ml<T> {
    /* renamed from: a */
    private static final int[] f16541a = new int[0];
    /* renamed from: b */
    private static final Unsafe f16542b = ng.m9240c();
    /* renamed from: c */
    private final int[] f16543c;
    /* renamed from: d */
    private final Object[] f16544d;
    /* renamed from: e */
    private final int f16545e;
    /* renamed from: f */
    private final int f16546f;
    /* renamed from: g */
    private final zzbel f16547g;
    /* renamed from: h */
    private final boolean f16548h;
    /* renamed from: i */
    private final boolean f16549i;
    /* renamed from: j */
    private final boolean f16550j;
    /* renamed from: k */
    private final boolean f16551k;
    /* renamed from: l */
    private final int[] f16552l;
    /* renamed from: m */
    private final int f16553m;
    /* renamed from: n */
    private final int f16554n;
    /* renamed from: o */
    private final md f16555o;
    /* renamed from: p */
    private final ll f16556p;
    /* renamed from: q */
    private final nc<?, ?> f16557q;
    /* renamed from: r */
    private final ky<?> f16558r;
    /* renamed from: s */
    private final lu f16559s;

    private ma(int[] iArr, Object[] objArr, int i, int i2, zzbel zzbel, boolean z, boolean z2, int[] iArr2, int i3, int i4, md mdVar, ll llVar, nc<?, ?> ncVar, ky<?> kyVar, lu luVar) {
        this.f16543c = iArr;
        this.f16544d = objArr;
        this.f16545e = i;
        this.f16546f = i2;
        this.f16549i = zzbel instanceof zzbdd;
        this.f16550j = z;
        objArr = (kyVar == null || kyVar.mo2091a(zzbel) == null) ? null : 1;
        this.f16548h = objArr;
        this.f16551k = null;
        this.f16552l = iArr2;
        this.f16553m = i3;
        this.f16554n = i4;
        this.f16555o = mdVar;
        this.f16556p = llVar;
        this.f16557q = ncVar;
        this.f16558r = kyVar;
        this.f16547g = zzbel;
        this.f16559s = luVar;
    }

    /* renamed from: f */
    private static boolean m20804f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: a */
    public final void mo2110a(T r13, com.google.android.gms.internal.ads.mk r14, com.google.android.gms.internal.ads.zzbcq r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Incorrect nodes count for selectOther: B:262:0x05da in [B:166:0x05cf, B:262:0x05da, B:259:0x0073]
	at jadx.core.utils.BlockUtils.selectOther(BlockUtils.java:53)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:64)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r12 = this;
        if (r15 == 0) goto L_0x05e0;
    L_0x0002:
        r7 = r12.f16557q;
        r8 = r12.f16558r;
        r9 = 0;
        r0 = r9;
        r10 = r0;
    L_0x0009:
        r1 = r14.mo2000a();	 Catch:{ all -> 0x05c8 }
        r2 = r12.m20806g(r1);	 Catch:{ all -> 0x05c8 }
        if (r2 >= 0) goto L_0x0079;
    L_0x0013:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 != r2) goto L_0x002f;
    L_0x0018:
        r14 = r12.f16553m;
    L_0x001a:
        r15 = r12.f16554n;
        if (r14 >= r15) goto L_0x0029;
    L_0x001e:
        r15 = r12.f16552l;
        r15 = r15[r14];
        r10 = r12.m20777a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x001a;
    L_0x0029:
        if (r10 == 0) goto L_0x002e;
    L_0x002b:
        r7.mo2138b(r13, r10);
    L_0x002e:
        return;
    L_0x002f:
        r2 = r12.f16548h;	 Catch:{ all -> 0x05c8 }
        if (r2 != 0) goto L_0x0035;	 Catch:{ all -> 0x05c8 }
    L_0x0033:
        r2 = r9;	 Catch:{ all -> 0x05c8 }
        goto L_0x003c;	 Catch:{ all -> 0x05c8 }
    L_0x0035:
        r2 = r12.f16547g;	 Catch:{ all -> 0x05c8 }
        r1 = r8.mo2086a(r15, r2, r1);	 Catch:{ all -> 0x05c8 }
        r2 = r1;	 Catch:{ all -> 0x05c8 }
    L_0x003c:
        if (r2 == 0) goto L_0x0052;	 Catch:{ all -> 0x05c8 }
    L_0x003e:
        if (r0 != 0) goto L_0x0044;	 Catch:{ all -> 0x05c8 }
    L_0x0040:
        r0 = r8.mo2092b(r13);	 Catch:{ all -> 0x05c8 }
    L_0x0044:
        r11 = r0;	 Catch:{ all -> 0x05c8 }
        r0 = r8;	 Catch:{ all -> 0x05c8 }
        r1 = r14;	 Catch:{ all -> 0x05c8 }
        r3 = r15;	 Catch:{ all -> 0x05c8 }
        r4 = r11;	 Catch:{ all -> 0x05c8 }
        r5 = r10;	 Catch:{ all -> 0x05c8 }
        r6 = r7;	 Catch:{ all -> 0x05c8 }
        r0 = r0.mo2085a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x05c8 }
        r10 = r0;	 Catch:{ all -> 0x05c8 }
        r0 = r11;	 Catch:{ all -> 0x05c8 }
        goto L_0x0009;	 Catch:{ all -> 0x05c8 }
    L_0x0052:
        r7.mo2134a(r14);	 Catch:{ all -> 0x05c8 }
        if (r10 != 0) goto L_0x005c;	 Catch:{ all -> 0x05c8 }
    L_0x0057:
        r1 = r7.mo2139c(r13);	 Catch:{ all -> 0x05c8 }
        r10 = r1;	 Catch:{ all -> 0x05c8 }
    L_0x005c:
        r1 = r7.m9195a(r10, r14);	 Catch:{ all -> 0x05c8 }
        if (r1 != 0) goto L_0x0009;
    L_0x0062:
        r14 = r12.f16553m;
    L_0x0064:
        r15 = r12.f16554n;
        if (r14 >= r15) goto L_0x0073;
    L_0x0068:
        r15 = r12.f16552l;
        r15 = r15[r14];
        r10 = r12.m20777a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x0064;
    L_0x0073:
        if (r10 == 0) goto L_0x0078;
    L_0x0075:
        r7.mo2138b(r13, r10);
    L_0x0078:
        return;
    L_0x0079:
        r3 = r12.m20799d(r2);	 Catch:{ all -> 0x05c8 }
        r4 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r3;
        r4 = r4 >>> 20;
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        switch(r4) {
            case 0: goto L_0x0574;
            case 1: goto L_0x0565;
            case 2: goto L_0x0556;
            case 3: goto L_0x0547;
            case 4: goto L_0x0538;
            case 5: goto L_0x0529;
            case 6: goto L_0x051a;
            case 7: goto L_0x050b;
            case 8: goto L_0x0503;
            case 9: goto L_0x04d2;
            case 10: goto L_0x04c3;
            case 11: goto L_0x04b4;
            case 12: goto L_0x0492;
            case 13: goto L_0x0483;
            case 14: goto L_0x0474;
            case 15: goto L_0x0465;
            case 16: goto L_0x0456;
            case 17: goto L_0x0425;
            case 18: goto L_0x0417;
            case 19: goto L_0x0409;
            case 20: goto L_0x03fb;
            case 21: goto L_0x03ed;
            case 22: goto L_0x03df;
            case 23: goto L_0x03d1;
            case 24: goto L_0x03c3;
            case 25: goto L_0x03b5;
            case 26: goto L_0x0393;
            case 27: goto L_0x0381;
            case 28: goto L_0x0373;
            case 29: goto L_0x0365;
            case 30: goto L_0x034f;
            case 31: goto L_0x0341;
            case 32: goto L_0x0333;
            case 33: goto L_0x0325;
            case 34: goto L_0x0317;
            case 35: goto L_0x0309;
            case 36: goto L_0x02fb;
            case 37: goto L_0x02ed;
            case 38: goto L_0x02df;
            case 39: goto L_0x02d1;
            case 40: goto L_0x02c3;
            case 41: goto L_0x02b5;
            case 42: goto L_0x02a7;
            case 43: goto L_0x0299;
            case 44: goto L_0x0284;
            case 45: goto L_0x0276;
            case 46: goto L_0x0268;
            case 47: goto L_0x025a;
            case 48: goto L_0x024c;
            case 49: goto L_0x023a;
            case 50: goto L_0x01f8;
            case 51: goto L_0x01e6;
            case 52: goto L_0x01d4;
            case 53: goto L_0x01c2;
            case 54: goto L_0x01b0;
            case 55: goto L_0x019e;
            case 56: goto L_0x018c;
            case 57: goto L_0x017a;
            case 58: goto L_0x0168;
            case 59: goto L_0x0160;
            case 60: goto L_0x012f;
            case 61: goto L_0x0121;
            case 62: goto L_0x010f;
            case 63: goto L_0x00ea;
            case 64: goto L_0x00d8;
            case 65: goto L_0x00c6;
            case 66: goto L_0x00b4;
            case 67: goto L_0x00a2;
            case 68: goto L_0x0090;
            default: goto L_0x0088;
        };
    L_0x0088:
        if (r10 != 0) goto L_0x0584;
    L_0x008a:
        r1 = r7.mo2126a();	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0583;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0090:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2006b(r5, r15);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00a2:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2041t();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00b4:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2040s();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00c6:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2039r();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00d8:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2037q();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00ea:
        r4 = r14.mo2035p();	 Catch:{ zzbdm -> 0x05a1 }
        r6 = r12.m20797c(r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r6 == 0) goto L_0x0101;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00f4:
        r6 = r6.mo2158a(r4);	 Catch:{ zzbdm -> 0x05a1 }
        if (r6 == 0) goto L_0x00fb;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00fa:
        goto L_0x0101;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x00fb:
        r1 = com.google.android.gms.internal.ads.mn.m9112a(r1, r4, r10, r7);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0362;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0101:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r5, r3);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x010f:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2033o();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0121:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2031n();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x012f:
        r4 = r12.m20786a(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r4 == 0) goto L_0x014b;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0135:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r13, r3);	 Catch:{ zzbdm -> 0x05a1 }
        r6 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r6 = r14.mo2001a(r6, r15);	 Catch:{ zzbdm -> 0x05a1 }
        r5 = com.google.android.gms.internal.ads.zzbdf.m10329a(r5, r6);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x015b;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x014b:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2001a(r5, r15);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
    L_0x015b:
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0160:
        r12.m20783a(r13, r3, r14);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0168:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2026k();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x017a:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2023j();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x018c:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2021i();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x019e:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2019h();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x01b0:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2015f();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x01c2:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2017g();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x01d4:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2013e();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x01e6:
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2011d();	 Catch:{ zzbdm -> 0x05a1 }
        r5 = java.lang.Double.valueOf(r5);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20793b(r13, r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x01f8:
        r1 = r12.m20791b(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.m20799d(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r2 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r4 != 0) goto L_0x0212;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0208:
        r4 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r4 = r4.mo2106e(r1);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r2, r4);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0229;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0212:
        r5 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r5.mo2104c(r4);	 Catch:{ zzbdm -> 0x05a1 }
        if (r5 == 0) goto L_0x0229;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x021a:
        r5 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r5.mo2106e(r1);	 Catch:{ zzbdm -> 0x05a1 }
        r6 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r6.mo2101a(r5, r4);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r2, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r4 = r5;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0229:
        r2 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r2.mo2102a(r4);	 Catch:{ zzbdm -> 0x05a1 }
        r3 = r12.f16559s;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r3.mo2107f(r1);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2004a(r2, r1, r15);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x023a:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r2.mo2096a(r13, r3);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2008b(r2, r1, r15);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x024c:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2038q(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x025a:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2036p(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0268:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2034o(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0276:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2032n(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0284:
        r4 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = r4.mo2096a(r13, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2030m(r3);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.m20797c(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.mn.m9113a(r1, r3, r2, r10, r7);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0362;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0299:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2028l(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02a7:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2020h(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02b5:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2018g(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02c3:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2016f(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02d1:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2014e(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02df:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2009c(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02ed:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2012d(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x02fb:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2007b(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0309:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2002a(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0317:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2038q(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0325:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2036p(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0333:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2034o(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0341:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2032n(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x034f:
        r4 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = (long) r3;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = r4.mo2096a(r13, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2030m(r3);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.m20797c(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.mn.m9113a(r1, r3, r2, r10, r7);	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0362:
        r10 = r1;	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0365:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2028l(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0373:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2025k(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0381:
        r1 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r4 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r4.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2003a(r2, r1, r15);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0393:
        r1 = m20804f(r3);	 Catch:{ zzbdm -> 0x05a1 }
        if (r1 == 0) goto L_0x03a7;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0399:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2024j(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03a7:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2022i(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03b5:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2020h(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03c3:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2018g(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03d1:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2016f(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03df:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2014e(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03ed:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2009c(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x03fb:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2012d(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0409:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2007b(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0417:
        r1 = r12.f16556p;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r2 = (long) r2;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r1.mo2096a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        r14.mo2002a(r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0425:
        r1 = r12.m20785a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r1 == 0) goto L_0x0443;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x042b:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.ng.m9252f(r13, r3);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r14.mo2006b(r2, r15);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.zzbdf.m10329a(r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0443:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2006b(r1, r15);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0456:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2041t();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9229a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0465:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2040s();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0474:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2039r();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9229a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0483:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2037q();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0492:
        r4 = r14.mo2035p();	 Catch:{ zzbdm -> 0x05a1 }
        r6 = r12.m20797c(r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r6 == 0) goto L_0x04a9;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x049c:
        r6 = r6.mo2158a(r4);	 Catch:{ zzbdm -> 0x05a1 }
        if (r6 == 0) goto L_0x04a3;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04a2:
        goto L_0x04a9;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04a3:
        r1 = com.google.android.gms.internal.ads.mn.m9112a(r1, r4, r10, r7);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0362;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04a9:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r5, r4);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04b4:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2033o();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04c3:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2031n();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04d2:
        r1 = r12.m20785a(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        if (r1 == 0) goto L_0x04f0;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04d8:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.ng.m9252f(r13, r3);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r2 = r14.mo2001a(r2, r15);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = com.google.android.gms.internal.ads.zzbdf.m10329a(r1, r2);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x04f0:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r12.m20775a(r2);	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2001a(r1, r15);	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9230a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0503:
        r12.m20783a(r13, r3, r14);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x050b:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2026k();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9231a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x051a:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2023j();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0529:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2021i();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9229a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0538:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2019h();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9228a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0547:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2015f();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9229a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0556:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2017g();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9229a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0565:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r1 = r14.mo2013e();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9227a(r13, r3, r1);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0574:
        r1 = r3 & r5;	 Catch:{ zzbdm -> 0x05a1 }
        r3 = (long) r1;	 Catch:{ zzbdm -> 0x05a1 }
        r5 = r14.mo2011d();	 Catch:{ zzbdm -> 0x05a1 }
        com.google.android.gms.internal.ads.ng.m9226a(r13, r3, r5);	 Catch:{ zzbdm -> 0x05a1 }
        r12.m20792b(r13, r2);	 Catch:{ zzbdm -> 0x05a1 }
        goto L_0x0009;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0583:
        r10 = r1;	 Catch:{ zzbdm -> 0x05a1 }
    L_0x0584:
        r1 = r7.m9195a(r10, r14);	 Catch:{ zzbdm -> 0x05a1 }
        if (r1 != 0) goto L_0x0009;
    L_0x058a:
        r14 = r12.f16553m;
    L_0x058c:
        r15 = r12.f16554n;
        if (r14 >= r15) goto L_0x059b;
    L_0x0590:
        r15 = r12.f16552l;
        r15 = r15[r14];
        r10 = r12.m20777a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x058c;
    L_0x059b:
        if (r10 == 0) goto L_0x05a0;
    L_0x059d:
        r7.mo2138b(r13, r10);
    L_0x05a0:
        return;
    L_0x05a1:
        r7.mo2134a(r14);	 Catch:{ all -> 0x05c8 }
        if (r10 != 0) goto L_0x05ab;	 Catch:{ all -> 0x05c8 }
    L_0x05a6:
        r1 = r7.mo2139c(r13);	 Catch:{ all -> 0x05c8 }
        r10 = r1;	 Catch:{ all -> 0x05c8 }
    L_0x05ab:
        r1 = r7.m9195a(r10, r14);	 Catch:{ all -> 0x05c8 }
        if (r1 != 0) goto L_0x0009;
    L_0x05b1:
        r14 = r12.f16553m;
    L_0x05b3:
        r15 = r12.f16554n;
        if (r14 >= r15) goto L_0x05c2;
    L_0x05b7:
        r15 = r12.f16552l;
        r15 = r15[r14];
        r10 = r12.m20777a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x05b3;
    L_0x05c2:
        if (r10 == 0) goto L_0x05c7;
    L_0x05c4:
        r7.mo2138b(r13, r10);
    L_0x05c7:
        return;
    L_0x05c8:
        r14 = move-exception;
        r15 = r12.f16553m;
    L_0x05cb:
        r0 = r12.f16554n;
        if (r15 >= r0) goto L_0x05da;
    L_0x05cf:
        r0 = r12.f16552l;
        r0 = r0[r15];
        r10 = r12.m20777a(r13, r0, r10, r7);
        r15 = r15 + 1;
        goto L_0x05cb;
    L_0x05da:
        if (r10 == 0) goto L_0x05df;
    L_0x05dc:
        r7.mo2138b(r13, r10);
    L_0x05df:
        throw r14;
    L_0x05e0:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, com.google.android.gms.internal.ads.mk, com.google.android.gms.internal.ads.zzbcq):void");
    }

    /* renamed from: a */
    static <T> ma<T> m20774a(Class<T> cls, lx lxVar, md mdVar, ll llVar, nc<?, ?> ncVar, ky<?> kyVar, lu luVar) {
        lx lxVar2 = lxVar;
        if (lxVar2 instanceof mj) {
            int i;
            int i2;
            int i3;
            int i4;
            char charAt;
            int[] iArr;
            char c;
            char c2;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            boolean z;
            mj mjVar = (mj) lxVar2;
            int i10 = 0;
            boolean z2 = mjVar.mo2119a() == zze.f9174i;
            String d = mjVar.m20832d();
            int length = d.length();
            int charAt2 = d.charAt(0);
            if (charAt2 >= 55296) {
                char charAt3;
                i = charAt2 & 8191;
                charAt2 = 1;
                i2 = 13;
                while (true) {
                    i3 = charAt2 + 1;
                    charAt3 = d.charAt(charAt2);
                    if (charAt3 < '?') {
                        break;
                    }
                    i |= (charAt3 & 8191) << i2;
                    i2 += 13;
                    charAt2 = i3;
                }
                charAt2 = (charAt3 << i2) | i;
            } else {
                i3 = 1;
            }
            i = i3 + 1;
            i2 = d.charAt(i3);
            if (i2 >= 55296) {
                i2 &= 8191;
                i3 = 13;
                while (true) {
                    i4 = i + 1;
                    charAt = d.charAt(i);
                    if (charAt < '?') {
                        break;
                    }
                    i2 |= (charAt & 8191) << i3;
                    i3 += 13;
                    i = i4;
                }
                i2 |= charAt << i3;
            } else {
                i4 = i;
            }
            if (i2 == 0) {
                iArr = f16541a;
                i = 0;
                i2 = 0;
                c = '\u0000';
                c2 = '\u0000';
                i5 = 0;
                i6 = 0;
            } else {
                int i11;
                int i12;
                char charAt4;
                i = i4 + 1;
                i2 = d.charAt(i4);
                if (i2 >= 55296) {
                    i2 &= 8191;
                    i3 = 13;
                    while (true) {
                        i4 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < '?') {
                            break;
                        }
                        i2 |= (charAt & 8191) << i3;
                        i3 += 13;
                        i = i4;
                    }
                    i2 = (charAt << i3) | i2;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                i3 = d.charAt(i4);
                if (i3 >= 55296) {
                    i3 &= 8191;
                    i4 = 13;
                    while (true) {
                        i7 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < '?') {
                            break;
                        }
                        i3 |= (charAt & 8191) << i4;
                        i4 += 13;
                        i = i7;
                    }
                    i3 |= charAt << i4;
                } else {
                    i7 = i;
                }
                i = i7 + 1;
                char charAt5 = d.charAt(i7);
                if (charAt5 >= '?') {
                    i4 = charAt5 & 8191;
                    i7 = 13;
                    while (true) {
                        i5 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < '?') {
                            break;
                        }
                        i4 |= (charAt & 8191) << i7;
                        i7 += 13;
                        i = i5;
                    }
                    charAt5 = (charAt << i7) | i4;
                } else {
                    i5 = i;
                }
                i = i5 + 1;
                c2 = d.charAt(i5);
                if (c2 >= '?') {
                    i7 = c2 & 8191;
                    i5 = 13;
                    while (true) {
                        i6 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < '?') {
                            break;
                        }
                        i7 |= (charAt & 8191) << i5;
                        i5 += 13;
                        i = i6;
                    }
                    c2 = (charAt << i5) | i7;
                } else {
                    i6 = i;
                }
                i = i6 + 1;
                i5 = d.charAt(i6);
                if (i5 >= 55296) {
                    i5 &= 8191;
                    i6 = 13;
                    while (true) {
                        i11 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < '?') {
                            break;
                        }
                        i5 |= (charAt & 8191) << i6;
                        i6 += 13;
                        i = i11;
                    }
                    i5 = (charAt << i6) | i5;
                    i = i11;
                }
                i6 = i + 1;
                i = d.charAt(i);
                if (i >= 55296) {
                    i &= 8191;
                    i11 = 13;
                    while (true) {
                        i12 = i6 + 1;
                        charAt4 = d.charAt(i6);
                        if (charAt4 < '?') {
                            break;
                        }
                        i |= (charAt4 & 8191) << i11;
                        i11 += 13;
                        i6 = i12;
                    }
                    i |= charAt4 << i11;
                    i6 = i12;
                }
                i11 = i6 + 1;
                i6 = d.charAt(i6);
                if (i6 >= 55296) {
                    i12 = 13;
                    i8 = i11;
                    i11 = i6 & 8191;
                    i6 = i8;
                    while (true) {
                        i9 = i6 + 1;
                        charAt4 = d.charAt(i6);
                        if (charAt4 < '?') {
                            break;
                        }
                        i11 |= (charAt4 & 8191) << i12;
                        i12 += 13;
                        i6 = i9;
                    }
                    i6 = i11 | (charAt4 << i12);
                    i10 = i9;
                } else {
                    i10 = i11;
                }
                i11 = i10 + 1;
                i10 = d.charAt(i10);
                if (i10 >= 55296) {
                    char charAt6;
                    i12 = 13;
                    i8 = i11;
                    i11 = i10 & 8191;
                    i10 = i8;
                    while (true) {
                        i9 = i10 + 1;
                        charAt6 = d.charAt(i10);
                        if (charAt6 < '?') {
                            break;
                        }
                        i11 |= (charAt6 & 8191) << i12;
                        i12 += 13;
                        i10 = i9;
                    }
                    i10 = i11 | (charAt6 << i12);
                    i11 = i9;
                }
                int[] iArr2 = new int[((i10 + i) + i6)];
                i6 = (i2 << 1) + i3;
                c = charAt5;
                i4 = i11;
                iArr = iArr2;
            }
            Unsafe unsafe = f16542b;
            Object[] e = mjVar.m20833e();
            Class cls2 = mjVar.mo2121c().getClass();
            int i13 = i4;
            int[] iArr3 = new int[(i5 * 3)];
            Object[] objArr = new Object[(i5 << 1)];
            i9 = i10 + i;
            int i14 = i10;
            int i15 = i6;
            i = i13;
            i6 = 0;
            int i16 = 0;
            i13 = i9;
            while (i < length) {
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                char c3;
                char c4;
                Object[] objArr2;
                int i22 = i + 1;
                i = d.charAt(i);
                char c5 = '?';
                if (i >= 55296) {
                    i17 = 13;
                    i8 = i22;
                    i22 = i & 8191;
                    i = i8;
                    while (true) {
                        i18 = i + 1;
                        charAt = d.charAt(i);
                        if (charAt < c5) {
                            break;
                        }
                        i22 |= (charAt & 8191) << i17;
                        i17 += 13;
                        i = i18;
                        c5 = '?';
                    }
                    i = i22 | (charAt << i17);
                    i19 = i18;
                } else {
                    i19 = i22;
                }
                i22 = i19 + 1;
                i19 = d.charAt(i19);
                int i23 = length;
                char c6 = '?';
                if (i19 >= 55296) {
                    i17 = 13;
                    i8 = i22;
                    i22 = i19 & 8191;
                    i19 = i8;
                    while (true) {
                        i18 = i19 + 1;
                        c5 = d.charAt(i19);
                        if (c5 < c6) {
                            break;
                        }
                        i22 |= (c5 & 8191) << i17;
                        i17 += 13;
                        i19 = i18;
                        c6 = '?';
                    }
                    i19 = i22 | (c5 << i17);
                    length = i18;
                } else {
                    length = i22;
                }
                int i24 = i10;
                i10 = i19 & 255;
                z = z2;
                if ((i19 & 1024) != 0) {
                    i20 = i6 + 1;
                    iArr[i6] = i16;
                    i6 = i20;
                }
                Field field;
                if (i10 > zzbcx.MAP.m10323a()) {
                    Object obj;
                    i20 = length + 1;
                    length = d.charAt(length);
                    int i25 = i20;
                    char c7 = '?';
                    if (length >= 55296) {
                        i22 = length & 8191;
                        length = i25;
                        i17 = 13;
                        while (true) {
                            i18 = length + 1;
                            c6 = d.charAt(length);
                            if (c6 < c7) {
                                break;
                            }
                            i22 |= (c6 & 8191) << i17;
                            i17 += 13;
                            length = i18;
                            c7 = '?';
                        }
                        length = i22 | (c6 << i17);
                    } else {
                        i18 = i25;
                    }
                    if (i10 != zzbcx.MESSAGE.m10323a() + 51) {
                        if (i10 != zzbcx.GROUP.m10323a() + 51) {
                            if (i10 == zzbcx.ENUM.m10323a() + 51) {
                                i21 = i6;
                                if ((charAt2 & 1) == 1) {
                                    i6 = i15 + 1;
                                    objArr[((i16 / 3) << 1) + 1] = e[i15];
                                    i22 = i6;
                                    i6 = 1;
                                    length <<= i6;
                                    obj = e[length];
                                    if (obj instanceof Field) {
                                        field = (Field) obj;
                                    } else {
                                        field = m20778a(cls2, (String) obj);
                                        e[length] = field;
                                    }
                                    c3 = c;
                                    i3 = (int) unsafe.objectFieldOffset(field);
                                    length++;
                                    obj = e[length];
                                    if (obj instanceof Field) {
                                        field = (Field) obj;
                                    } else {
                                        field = m20778a(cls2, (String) obj);
                                        e[length] = field;
                                    }
                                    c4 = c2;
                                    objArr2 = objArr;
                                    i15 = i22;
                                    i20 = i3;
                                    i5 = (int) unsafe.objectFieldOffset(field);
                                    length = 0;
                                }
                            } else {
                                i21 = i6;
                            }
                            i22 = i15;
                            i6 = 1;
                            length <<= i6;
                            obj = e[length];
                            if (obj instanceof Field) {
                                field = m20778a(cls2, (String) obj);
                                e[length] = field;
                            } else {
                                field = (Field) obj;
                            }
                            c3 = c;
                            i3 = (int) unsafe.objectFieldOffset(field);
                            length++;
                            obj = e[length];
                            if (obj instanceof Field) {
                                field = m20778a(cls2, (String) obj);
                                e[length] = field;
                            } else {
                                field = (Field) obj;
                            }
                            c4 = c2;
                            objArr2 = objArr;
                            i15 = i22;
                            i20 = i3;
                            i5 = (int) unsafe.objectFieldOffset(field);
                            length = 0;
                        }
                    }
                    i21 = i6;
                    i6 = 1;
                    i22 = i15 + 1;
                    objArr[((i16 / 3) << 1) + 1] = e[i15];
                    length <<= i6;
                    obj = e[length];
                    if (obj instanceof Field) {
                        field = (Field) obj;
                    } else {
                        field = m20778a(cls2, (String) obj);
                        e[length] = field;
                    }
                    c3 = c;
                    i3 = (int) unsafe.objectFieldOffset(field);
                    length++;
                    obj = e[length];
                    if (obj instanceof Field) {
                        field = (Field) obj;
                    } else {
                        field = m20778a(cls2, (String) obj);
                        e[length] = field;
                    }
                    c4 = c2;
                    objArr2 = objArr;
                    i15 = i22;
                    i20 = i3;
                    i5 = (int) unsafe.objectFieldOffset(field);
                    length = 0;
                } else {
                    c3 = c;
                    i21 = i6;
                    i3 = i15 + 1;
                    field = m20778a(cls2, (String) e[i15]);
                    if (i10 != zzbcx.MESSAGE.m10323a()) {
                        if (i10 != zzbcx.GROUP.m10323a()) {
                            if (i10 != zzbcx.MESSAGE_LIST.m10323a()) {
                                if (i10 != zzbcx.GROUP_LIST.m10323a()) {
                                    if (!(i10 == zzbcx.ENUM.m10323a() || i10 == zzbcx.ENUM_LIST.m10323a())) {
                                        if (i10 != zzbcx.ENUM_LIST_PACKED.m10323a()) {
                                            if (i10 == zzbcx.MAP.m10323a()) {
                                                i6 = i14 + 1;
                                                iArr[i14] = i16;
                                                i15 = (i16 / 3) << 1;
                                                i14 = i3 + 1;
                                                objArr[i15] = e[i3];
                                                if ((i19 & 2048) != 0) {
                                                    i3 = i14 + 1;
                                                    objArr[i15 + 1] = e[i14];
                                                    c4 = c2;
                                                    objArr2 = objArr;
                                                } else {
                                                    c4 = c2;
                                                    objArr2 = objArr;
                                                    i3 = i14;
                                                }
                                                i14 = i6;
                                                i20 = (int) unsafe.objectFieldOffset(field);
                                                if ((charAt2 & 1) == 1 || i10 > zzbcx.GROUP.m10323a()) {
                                                    i18 = length;
                                                    i15 = i3;
                                                    length = 0;
                                                    i5 = 0;
                                                } else {
                                                    Field field2;
                                                    i7 = length + 1;
                                                    length = d.charAt(length);
                                                    if (length >= 55296) {
                                                        length &= 8191;
                                                        i6 = 13;
                                                        while (true) {
                                                            i15 = i7 + 1;
                                                            c2 = d.charAt(i7);
                                                            if (c2 < '?') {
                                                                break;
                                                            }
                                                            length |= (c2 & 8191) << i6;
                                                            i6 += 13;
                                                            i7 = i15;
                                                        }
                                                        length |= c2 << i6;
                                                        i7 = i15;
                                                    }
                                                    i15 = (i2 << 1) + (length / 32);
                                                    Object obj2 = e[i15];
                                                    if (obj2 instanceof Field) {
                                                        field2 = (Field) obj2;
                                                    } else {
                                                        field2 = m20778a(cls2, (String) obj2);
                                                        e[i15] = field2;
                                                    }
                                                    i5 = (int) unsafe.objectFieldOffset(field2);
                                                    length %= 32;
                                                    i15 = i3;
                                                    i18 = i7;
                                                }
                                            } else {
                                                c4 = c2;
                                                objArr2 = objArr;
                                                i20 = (int) unsafe.objectFieldOffset(field);
                                                if ((charAt2 & 1) == 1) {
                                                }
                                                i18 = length;
                                                i15 = i3;
                                                length = 0;
                                                i5 = 0;
                                            }
                                        }
                                    }
                                    c4 = c2;
                                    if ((charAt2 & 1) == 1) {
                                        i15 = i3 + 1;
                                        objArr[((i16 / 3) << 1) + 1] = e[i3];
                                        objArr2 = objArr;
                                        i3 = i15;
                                        i20 = (int) unsafe.objectFieldOffset(field);
                                        if ((charAt2 & 1) == 1) {
                                        }
                                        i18 = length;
                                        i15 = i3;
                                        length = 0;
                                        i5 = 0;
                                    }
                                    objArr2 = objArr;
                                    i20 = (int) unsafe.objectFieldOffset(field);
                                    if ((charAt2 & 1) == 1) {
                                    }
                                    i18 = length;
                                    i15 = i3;
                                    length = 0;
                                    i5 = 0;
                                }
                            }
                            c4 = c2;
                            i15 = i3 + 1;
                            objArr[((i16 / 3) << 1) + 1] = e[i3];
                            objArr2 = objArr;
                            i3 = i15;
                            i20 = (int) unsafe.objectFieldOffset(field);
                            if ((charAt2 & 1) == 1) {
                            }
                            i18 = length;
                            i15 = i3;
                            length = 0;
                            i5 = 0;
                        }
                    }
                    c4 = c2;
                    objArr[((i16 / 3) << 1) + 1] = field.getType();
                    objArr2 = objArr;
                    i20 = (int) unsafe.objectFieldOffset(field);
                    if ((charAt2 & 1) == 1) {
                    }
                    i18 = length;
                    i15 = i3;
                    length = 0;
                    i5 = 0;
                }
                if (i10 >= 18 && i10 <= 49) {
                    i3 = i13 + 1;
                    iArr[i13] = i20;
                    i13 = i3;
                }
                i3 = i16 + 1;
                iArr3[i16] = i;
                i = i3 + 1;
                iArr3[i3] = ((i10 << 20) | (((i19 & 256) != 0 ? 268435456 : 0) | ((i19 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0))) | i20;
                i16 = i + 1;
                iArr3[i] = (length << 20) | i5;
                i = i18;
                length = i23;
                i10 = i24;
                z2 = z;
                i6 = i21;
                c = c3;
                c2 = c4;
                objArr = objArr2;
            }
            z = z2;
            return new ma(iArr3, objArr, c, c2, mjVar.mo2121c(), z2, false, iArr, i10, i9, mdVar, llVar, ncVar, kyVar, luVar);
        }
        ((my) lxVar2).mo2119a();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    private static java.lang.reflect.Field m20778a(java.lang.Class<?> r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r5.getDeclaredField(r6);	 Catch:{ NoSuchFieldException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = r5.getDeclaredFields();
        r1 = r0.length;
        r2 = 0;
    L_0x000b:
        if (r2 >= r1) goto L_0x001d;
    L_0x000d:
        r3 = r0[r2];
        r4 = r3.getName();
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x001a;
    L_0x0019:
        return r3;
    L_0x001a:
        r2 = r2 + 1;
        goto L_0x000b;
    L_0x001d:
        r1 = new java.lang.RuntimeException;
        r5 = r5.getName();
        r0 = java.util.Arrays.toString(r0);
        r2 = java.lang.String.valueOf(r6);
        r2 = r2.length();
        r2 = r2 + 40;
        r3 = java.lang.String.valueOf(r5);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Field ";
        r3.append(r2);
        r3.append(r6);
        r6 = " for ";
        r3.append(r6);
        r3.append(r5);
        r5 = " not found. Known fields are ";
        r3.append(r5);
        r3.append(r0);
        r5 = r3.toString();
        r1.<init>(r5);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: a */
    public final T mo2109a() {
        return this.f16555o.mo2118a(this.f16547g);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo2113a(T r10, T r11) {
        /*
        r9 = this;
        r0 = r9.f16543c;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        r3 = 1;
        if (r2 >= r0) goto L_0x01b9;
    L_0x0008:
        r4 = r9.m20799d(r2);
        r5 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r6 = r4 & r5;
        r6 = (long) r6;
        r8 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = r4 & r8;
        r4 = r4 >>> 20;
        switch(r4) {
            case 0: goto L_0x019f;
            case 1: goto L_0x018e;
            case 2: goto L_0x017b;
            case 3: goto L_0x0168;
            case 4: goto L_0x0157;
            case 5: goto L_0x0144;
            case 6: goto L_0x0132;
            case 7: goto L_0x0120;
            case 8: goto L_0x010a;
            case 9: goto L_0x00f4;
            case 10: goto L_0x00de;
            case 11: goto L_0x00cc;
            case 12: goto L_0x00ba;
            case 13: goto L_0x00a8;
            case 14: goto L_0x0094;
            case 15: goto L_0x0082;
            case 16: goto L_0x006e;
            case 17: goto L_0x0058;
            case 18: goto L_0x004a;
            case 19: goto L_0x004a;
            case 20: goto L_0x004a;
            case 21: goto L_0x004a;
            case 22: goto L_0x004a;
            case 23: goto L_0x004a;
            case 24: goto L_0x004a;
            case 25: goto L_0x004a;
            case 26: goto L_0x004a;
            case 27: goto L_0x004a;
            case 28: goto L_0x004a;
            case 29: goto L_0x004a;
            case 30: goto L_0x004a;
            case 31: goto L_0x004a;
            case 32: goto L_0x004a;
            case 33: goto L_0x004a;
            case 34: goto L_0x004a;
            case 35: goto L_0x004a;
            case 36: goto L_0x004a;
            case 37: goto L_0x004a;
            case 38: goto L_0x004a;
            case 39: goto L_0x004a;
            case 40: goto L_0x004a;
            case 41: goto L_0x004a;
            case 42: goto L_0x004a;
            case 43: goto L_0x004a;
            case 44: goto L_0x004a;
            case 45: goto L_0x004a;
            case 46: goto L_0x004a;
            case 47: goto L_0x004a;
            case 48: goto L_0x004a;
            case 49: goto L_0x004a;
            case 50: goto L_0x003c;
            case 51: goto L_0x001c;
            case 52: goto L_0x001c;
            case 53: goto L_0x001c;
            case 54: goto L_0x001c;
            case 55: goto L_0x001c;
            case 56: goto L_0x001c;
            case 57: goto L_0x001c;
            case 58: goto L_0x001c;
            case 59: goto L_0x001c;
            case 60: goto L_0x001c;
            case 61: goto L_0x001c;
            case 62: goto L_0x001c;
            case 63: goto L_0x001c;
            case 64: goto L_0x001c;
            case 65: goto L_0x001c;
            case 66: goto L_0x001c;
            case 67: goto L_0x001c;
            case 68: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x01b2;
    L_0x001c:
        r4 = r9.m20801e(r2);
        r4 = r4 & r5;
        r4 = (long) r4;
        r8 = com.google.android.gms.internal.ads.ng.m9221a(r10, r4);
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r11, r4);
        if (r8 != r4) goto L_0x01b1;
    L_0x002c:
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r4 = com.google.android.gms.internal.ads.mn.m9121a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x003a:
        goto L_0x01b1;
    L_0x003c:
        r3 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r3 = com.google.android.gms.internal.ads.mn.m9121a(r3, r4);
        goto L_0x01b2;
    L_0x004a:
        r3 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r3 = com.google.android.gms.internal.ads.mn.m9121a(r3, r4);
        goto L_0x01b2;
    L_0x0058:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x005e:
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r4 = com.google.android.gms.internal.ads.mn.m9121a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x006c:
        goto L_0x01b1;
    L_0x006e:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0074:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x0080:
        goto L_0x01b1;
    L_0x0082:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0088:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0092:
        goto L_0x01b1;
    L_0x0094:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x009a:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x00a6:
        goto L_0x01b1;
    L_0x00a8:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00ae:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00b8:
        goto L_0x01b1;
    L_0x00ba:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00c0:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00ca:
        goto L_0x01b1;
    L_0x00cc:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00d2:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00dc:
        goto L_0x01b1;
    L_0x00de:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00e4:
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r4 = com.google.android.gms.internal.ads.mn.m9121a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x00f2:
        goto L_0x01b1;
    L_0x00f4:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00fa:
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r4 = com.google.android.gms.internal.ads.mn.m9121a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x0108:
        goto L_0x01b1;
    L_0x010a:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0110:
        r4 = com.google.android.gms.internal.ads.ng.m9252f(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r11, r6);
        r4 = com.google.android.gms.internal.ads.mn.m9121a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x011e:
        goto L_0x01b1;
    L_0x0120:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0126:
        r4 = com.google.android.gms.internal.ads.ng.m9244c(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9244c(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0130:
        goto L_0x01b1;
    L_0x0132:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0138:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0142:
        goto L_0x01b1;
    L_0x0144:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x014a:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x0156:
        goto L_0x01b1;
    L_0x0157:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x015d:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0167:
        goto L_0x01b1;
    L_0x0168:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x016e:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x017a:
        goto L_0x01b1;
    L_0x017b:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0181:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x018d:
        goto L_0x01b1;
    L_0x018e:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0194:
        r4 = com.google.android.gms.internal.ads.ng.m9221a(r10, r6);
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x019e:
        goto L_0x01b1;
    L_0x019f:
        r4 = r9.m20798c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x01a5:
        r4 = com.google.android.gms.internal.ads.ng.m9236b(r10, r6);
        r6 = com.google.android.gms.internal.ads.ng.m9236b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x01b1:
        r3 = 0;
    L_0x01b2:
        if (r3 != 0) goto L_0x01b5;
    L_0x01b4:
        return r1;
    L_0x01b5:
        r2 = r2 + 3;
        goto L_0x0005;
    L_0x01b9:
        r0 = r9.f16557q;
        r0 = r0.mo2135b(r10);
        r2 = r9.f16557q;
        r2 = r2.mo2135b(r11);
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x01cc;
    L_0x01cb:
        return r1;
    L_0x01cc:
        r0 = r9.f16548h;
        if (r0 == 0) goto L_0x01e1;
    L_0x01d0:
        r0 = r9.f16558r;
        r10 = r0.mo2084a(r10);
        r0 = r9.f16558r;
        r11 = r0.mo2084a(r11);
        r10 = r10.equals(r11);
        return r10;
    L_0x01e1:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo2108a(T t) {
        int length = this.f16543c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m20799d(i2);
            int i3 = this.f16543c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            Object f;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + zzbdf.m10326a(Double.doubleToLongBits(ng.m9249e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(ng.m9245d(t, j));
                    break;
                case 2:
                    i = (i * 53) + zzbdf.m10326a(ng.m9236b(t, j));
                    break;
                case 3:
                    i = (i * 53) + zzbdf.m10326a(ng.m9236b(t, j));
                    break;
                case 4:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + zzbdf.m10326a(ng.m9236b(t, j));
                    break;
                case 6:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + zzbdf.m10327a(ng.m9244c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) ng.m9252f(t, j)).hashCode();
                    break;
                case 9:
                    f = ng.m9252f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + zzbdf.m10326a(ng.m9236b(t, j));
                    break;
                case 15:
                    i = (i * 53) + ng.m9221a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + zzbdf.m10326a(ng.m9236b(t, j));
                    break;
                case 17:
                    f = ng.m9252f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                case 51:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(Double.doubleToLongBits(m20789b((Object) t, j)));
                    break;
                case 52:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + Float.floatToIntBits(m20796c(t, j));
                    break;
                case 53:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(m20802e(t, j));
                    break;
                case 54:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(m20802e(t, j));
                    break;
                case 55:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 56:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(m20802e(t, j));
                    break;
                case 57:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 58:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10327a(m20805f(t, j));
                    break;
                case 59:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ((String) ng.m9252f(t, j)).hashCode();
                    break;
                case 60:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                case 61:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                case 62:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 63:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 64:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 65:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(m20802e(t, j));
                    break;
                case 66:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m20800d(t, j);
                    break;
                case 67:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzbdf.m10326a(m20802e(t, j));
                    break;
                case 68:
                    if (!m20786a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ng.m9252f(t, j).hashCode();
                    break;
                default:
                    break;
            }
        }
        i = (i * 53) + this.f16557q.mo2135b(t).hashCode();
        return this.f16548h ? (i * 53) + this.f16558r.mo2084a((Object) t).hashCode() : i;
    }

    /* renamed from: b */
    public final void mo2115b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f16543c.length; i += 3) {
                int d = m20799d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f16543c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9226a((Object) t, j, ng.m9249e(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 1:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9227a((Object) t, j, ng.m9245d(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 2:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9229a((Object) t, j, ng.m9236b(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 3:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9229a((Object) t, j, ng.m9236b(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 4:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 5:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9229a((Object) t, j, ng.m9236b(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 6:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 7:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9231a((Object) t, j, ng.m9244c(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 8:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9230a((Object) t, j, ng.m9252f(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 9:
                        m20784a((Object) t, (Object) t2, i);
                        break;
                    case 10:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9230a((Object) t, j, ng.m9252f(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 11:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 12:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 13:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 14:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9229a((Object) t, j, ng.m9236b(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 15:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9228a((Object) t, j, ng.m9221a((Object) t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 16:
                        if (!m20785a((Object) t2, i)) {
                            break;
                        }
                        ng.m9229a((Object) t, j, ng.m9236b(t2, j));
                        m20792b((Object) t, i);
                        break;
                    case 17:
                        m20784a((Object) t, (Object) t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f16556p.mo2097a(t, t2, j);
                        break;
                    case 50:
                        mn.m9118a(this.f16559s, (Object) t, (Object) t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m20786a((Object) t2, i2, i)) {
                            break;
                        }
                        ng.m9230a((Object) t, j, ng.m9252f(t2, j));
                        m20793b((Object) t, i2, i);
                        break;
                    case 60:
                        m20795b((Object) t, (Object) t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m20786a((Object) t2, i2, i)) {
                            break;
                        }
                        ng.m9230a((Object) t, j, ng.m9252f(t2, j));
                        m20793b((Object) t, i2, i);
                        break;
                    case 68:
                        m20795b((Object) t, (Object) t2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.f16550j) {
                mn.m9119a(this.f16557q, (Object) t, (Object) t2);
                if (this.f16548h) {
                    mn.m9117a(this.f16558r, (Object) t, (Object) t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m20784a(T t, T t2, int i) {
        long d = (long) (m20799d(i) & 1048575);
        if (m20785a((Object) t2, i)) {
            Object f = ng.m9252f(t, d);
            Object f2 = ng.m9252f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    ng.m9230a((Object) t, d, f2);
                    m20792b((Object) t, i);
                }
                return;
            }
            ng.m9230a((Object) t, d, zzbdf.m10329a(f, f2));
            m20792b((Object) t, i);
        }
    }

    /* renamed from: b */
    private final void m20795b(T t, T t2, int i) {
        int d = m20799d(i);
        int i2 = this.f16543c[i];
        long j = (long) (d & 1048575);
        if (m20786a((Object) t2, i2, i)) {
            Object f = ng.m9252f(t, j);
            Object f2 = ng.m9252f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    ng.m9230a((Object) t, j, f2);
                    m20793b((Object) t, i2, i);
                }
                return;
            }
            ng.m9230a((Object) t, j, zzbdf.m10329a(f, f2));
            m20793b((Object) t, i2, i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final int mo2114b(T r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r0.f16550j;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = 0;
        r7 = 1;
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r9 = 0;
        r11 = 0;
        if (r2 == 0) goto L_0x055f;
    L_0x0012:
        r2 = f16542b;
        r12 = 0;
        r13 = 0;
    L_0x0016:
        r14 = r0.f16543c;
        r14 = r14.length;
        if (r12 >= r14) goto L_0x0557;
    L_0x001b:
        r14 = r0.m20799d(r12);
        r15 = r14 & r3;
        r15 = r15 >>> 20;
        r3 = r0.f16543c;
        r3 = r3[r12];
        r14 = r14 & r8;
        r5 = (long) r14;
        r14 = com.google.android.gms.internal.ads.zzbcx.DOUBLE_LIST_PACKED;
        r14 = r14.m10323a();
        if (r15 < r14) goto L_0x0041;
    L_0x0031:
        r14 = com.google.android.gms.internal.ads.zzbcx.SINT64_LIST_PACKED;
        r14 = r14.m10323a();
        if (r15 > r14) goto L_0x0041;
    L_0x0039:
        r14 = r0.f16543c;
        r17 = r12 + 2;
        r14 = r14[r17];
        r14 = r14 & r8;
        goto L_0x0042;
    L_0x0041:
        r14 = 0;
    L_0x0042:
        switch(r15) {
            case 0: goto L_0x0544;
            case 1: goto L_0x0538;
            case 2: goto L_0x0528;
            case 3: goto L_0x0518;
            case 4: goto L_0x0508;
            case 5: goto L_0x04fc;
            case 6: goto L_0x04f0;
            case 7: goto L_0x04e4;
            case 8: goto L_0x04c4;
            case 9: goto L_0x04af;
            case 10: goto L_0x049c;
            case 11: goto L_0x048b;
            case 12: goto L_0x047a;
            case 13: goto L_0x046d;
            case 14: goto L_0x0460;
            case 15: goto L_0x044f;
            case 16: goto L_0x043e;
            case 17: goto L_0x0427;
            case 18: goto L_0x041c;
            case 19: goto L_0x0411;
            case 20: goto L_0x0406;
            case 21: goto L_0x03fb;
            case 22: goto L_0x03f0;
            case 23: goto L_0x03e5;
            case 24: goto L_0x03da;
            case 25: goto L_0x03cf;
            case 26: goto L_0x03c4;
            case 27: goto L_0x03b5;
            case 28: goto L_0x03aa;
            case 29: goto L_0x039f;
            case 30: goto L_0x0394;
            case 31: goto L_0x0389;
            case 32: goto L_0x037e;
            case 33: goto L_0x0373;
            case 34: goto L_0x0368;
            case 35: goto L_0x0347;
            case 36: goto L_0x0326;
            case 37: goto L_0x0305;
            case 38: goto L_0x02e4;
            case 39: goto L_0x02c3;
            case 40: goto L_0x02a2;
            case 41: goto L_0x0281;
            case 42: goto L_0x0260;
            case 43: goto L_0x023f;
            case 44: goto L_0x021e;
            case 45: goto L_0x01fd;
            case 46: goto L_0x01dc;
            case 47: goto L_0x01bb;
            case 48: goto L_0x019a;
            case 49: goto L_0x018b;
            case 50: goto L_0x017a;
            case 51: goto L_0x016b;
            case 52: goto L_0x015e;
            case 53: goto L_0x014d;
            case 54: goto L_0x013c;
            case 55: goto L_0x012b;
            case 56: goto L_0x011e;
            case 57: goto L_0x0111;
            case 58: goto L_0x0104;
            case 59: goto L_0x00e4;
            case 60: goto L_0x00cf;
            case 61: goto L_0x00bc;
            case 62: goto L_0x00ab;
            case 63: goto L_0x009a;
            case 64: goto L_0x008d;
            case 65: goto L_0x0080;
            case 66: goto L_0x006f;
            case 67: goto L_0x005e;
            case 68: goto L_0x0047;
            default: goto L_0x0045;
        };
    L_0x0045:
        goto L_0x0551;
    L_0x0047:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x004d:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r5 = (com.google.android.gms.internal.ads.zzbel) r5;
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.zzbck.m21530c(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x005e:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0064:
        r5 = m20802e(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21542f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x006f:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0075:
        r5 = m20800d(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21549h(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0080:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0086:
        r3 = com.google.android.gms.internal.ads.zzbck.m21550h(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x008d:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0093:
        r3 = com.google.android.gms.internal.ads.zzbck.m21556j(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x009a:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00a0:
        r5 = m20800d(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21558k(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00ab:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00b1:
        r5 = m20800d(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21545g(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00bc:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00c2:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r5 = (com.google.android.gms.internal.ads.zzbbu) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21528c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00cf:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00d5:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.mn.m9105a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00e4:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00ea:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.ads.zzbbu;
        if (r6 == 0) goto L_0x00fb;
    L_0x00f2:
        r5 = (com.google.android.gms.internal.ads.zzbbu) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21528c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00fb:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21520b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0104:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x010a:
        r3 = com.google.android.gms.internal.ads.zzbck.m21521b(r3, r7);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0111:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0117:
        r3 = com.google.android.gms.internal.ads.zzbck.m21553i(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x011e:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0124:
        r3 = com.google.android.gms.internal.ads.zzbck.m21546g(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x012b:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0131:
        r5 = m20800d(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21541f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x013c:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0142:
        r5 = m20802e(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21538e(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x014d:
        r14 = r0.m20786a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0153:
        r5 = m20802e(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21532d(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x015e:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0164:
        r3 = com.google.android.gms.internal.ads.zzbck.m21517b(r3, r4);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x016b:
        r5 = r0.m20786a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0171:
        r5 = 0;
        r3 = com.google.android.gms.internal.ads.zzbck.m21516b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x017a:
        r14 = r0.f16559s;
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r6 = r0.m20791b(r12);
        r3 = r14.mo2100a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x018b:
        r5 = m20779a(r1, r5);
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.mn.m9123b(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x019a:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9131c(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01a6:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x01ae;
    L_0x01aa:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01ae:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01bb:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9146g(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01c7:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x01cf;
    L_0x01cb:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01cf:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01dc:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9152i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01e8:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x01f0;
    L_0x01ec:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01f0:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01fd:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9149h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0209:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0211;
    L_0x020d:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0211:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x021e:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9135d(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x022a:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0232;
    L_0x022e:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0232:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x023f:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9143f(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x024b:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0253;
    L_0x024f:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0253:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0260:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9155j(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x026c:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0274;
    L_0x0270:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0274:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0281:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9149h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x028d:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0295;
    L_0x0291:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0295:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02a2:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9152i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02ae:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x02b6;
    L_0x02b2:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02b6:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02c3:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9139e(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02cf:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x02d7;
    L_0x02d3:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02d7:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02e4:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9125b(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02f0:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x02f8;
    L_0x02f4:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02f8:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0305:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9109a(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0311:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x0319;
    L_0x0315:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0319:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0326:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9149h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0332:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x033a;
    L_0x0336:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x033a:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0347:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.ads.mn.m9152i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0353:
        r6 = r0.f16551k;
        if (r6 == 0) goto L_0x035b;
    L_0x0357:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x035b:
        r3 = com.google.android.gms.internal.ads.zzbck.m21537e(r3);
        r6 = com.google.android.gms.internal.ads.zzbck.m21544g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0368:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9130c(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0373:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9145g(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x037e:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9151i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0389:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9148h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0394:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9134d(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x039f:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9142f(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03aa:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9122b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03b5:
        r5 = m20779a(r1, r5);
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.mn.m9107a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03c4:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9106a(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03cf:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9154j(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03da:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9148h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03e5:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9151i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03f0:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9138e(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03fb:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9124b(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0406:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9108a(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0411:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9148h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x041c:
        r5 = m20779a(r1, r5);
        r3 = com.google.android.gms.internal.ads.mn.m9151i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0427:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x042d:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r5 = (com.google.android.gms.internal.ads.zzbel) r5;
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.zzbck.m21530c(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x043e:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0444:
        r5 = com.google.android.gms.internal.ads.ng.m9236b(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21542f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x044f:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0455:
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21549h(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0460:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0466:
        r3 = com.google.android.gms.internal.ads.zzbck.m21550h(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x046d:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0473:
        r3 = com.google.android.gms.internal.ads.zzbck.m21556j(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x047a:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0480:
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21558k(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x048b:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0491:
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21545g(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x049c:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04a2:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r5 = (com.google.android.gms.internal.ads.zzbbu) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21528c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04af:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04b5:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r6 = r0.m20775a(r12);
        r3 = com.google.android.gms.internal.ads.mn.m9105a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04c4:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04ca:
        r5 = com.google.android.gms.internal.ads.ng.m9252f(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.ads.zzbbu;
        if (r6 == 0) goto L_0x04db;
    L_0x04d2:
        r5 = (com.google.android.gms.internal.ads.zzbbu) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21528c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04db:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.ads.zzbck.m21520b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04e4:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x04ea:
        r3 = com.google.android.gms.internal.ads.zzbck.m21521b(r3, r7);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04f0:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x04f6:
        r3 = com.google.android.gms.internal.ads.zzbck.m21553i(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04fc:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0502:
        r3 = com.google.android.gms.internal.ads.zzbck.m21546g(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0508:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x050e:
        r5 = com.google.android.gms.internal.ads.ng.m9221a(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21541f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0518:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x051e:
        r5 = com.google.android.gms.internal.ads.ng.m9236b(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21538e(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0528:
        r14 = r0.m20785a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x052e:
        r5 = com.google.android.gms.internal.ads.ng.m9236b(r1, r5);
        r3 = com.google.android.gms.internal.ads.zzbck.m21532d(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0538:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x053e:
        r3 = com.google.android.gms.internal.ads.zzbck.m21517b(r3, r4);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0544:
        r5 = r0.m20785a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x054a:
        r5 = 0;
        r3 = com.google.android.gms.internal.ads.zzbck.m21516b(r3, r5);
        r13 = r13 + r3;
    L_0x0551:
        r12 = r12 + 3;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        goto L_0x0016;
    L_0x0557:
        r2 = r0.f16557q;
        r1 = m20768a(r2, r1);
        r13 = r13 + r1;
        return r13;
    L_0x055f:
        r2 = f16542b;
        r3 = -1;
        r3 = 0;
        r5 = 0;
        r6 = -1;
        r12 = 0;
    L_0x0566:
        r13 = r0.f16543c;
        r13 = r13.length;
        if (r3 >= r13) goto L_0x0af7;
    L_0x056b:
        r13 = r0.m20799d(r3);
        r14 = r0.f16543c;
        r14 = r14[r3];
        r15 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r16 = r13 & r15;
        r15 = r16 >>> 20;
        r4 = 17;
        if (r15 > r4) goto L_0x0592;
    L_0x057d:
        r4 = r0.f16543c;
        r16 = r3 + 2;
        r4 = r4[r16];
        r11 = r4 & r8;
        r16 = r4 >>> 20;
        r16 = r7 << r16;
        if (r11 == r6) goto L_0x05b3;
    L_0x058b:
        r9 = (long) r11;
        r12 = r2.getInt(r1, r9);
        r6 = r11;
        goto L_0x05b3;
    L_0x0592:
        r4 = r0.f16551k;
        if (r4 == 0) goto L_0x05b0;
    L_0x0596:
        r4 = com.google.android.gms.internal.ads.zzbcx.DOUBLE_LIST_PACKED;
        r4 = r4.m10323a();
        if (r15 < r4) goto L_0x05b0;
    L_0x059e:
        r4 = com.google.android.gms.internal.ads.zzbcx.SINT64_LIST_PACKED;
        r4 = r4.m10323a();
        if (r15 > r4) goto L_0x05b0;
    L_0x05a6:
        r4 = r0.f16543c;
        r9 = r3 + 2;
        r4 = r4[r9];
        r11 = r4 & r8;
        r4 = r11;
        goto L_0x05b1;
    L_0x05b0:
        r4 = 0;
    L_0x05b1:
        r16 = 0;
    L_0x05b3:
        r9 = r13 & r8;
        r9 = (long) r9;
        switch(r15) {
            case 0: goto L_0x0ae0;
            case 1: goto L_0x0ad0;
            case 2: goto L_0x0abe;
            case 3: goto L_0x0aad;
            case 4: goto L_0x0a9c;
            case 5: goto L_0x0a8d;
            case 6: goto L_0x0a81;
            case 7: goto L_0x0a76;
            case 8: goto L_0x0a58;
            case 9: goto L_0x0a45;
            case 10: goto L_0x0a35;
            case 11: goto L_0x0a27;
            case 12: goto L_0x0a19;
            case 13: goto L_0x0a0e;
            case 14: goto L_0x0a02;
            case 15: goto L_0x09f4;
            case 16: goto L_0x09e6;
            case 17: goto L_0x09d2;
            case 18: goto L_0x09be;
            case 19: goto L_0x09b1;
            case 20: goto L_0x09a4;
            case 21: goto L_0x0997;
            case 22: goto L_0x098a;
            case 23: goto L_0x097d;
            case 24: goto L_0x0970;
            case 25: goto L_0x0963;
            case 26: goto L_0x0957;
            case 27: goto L_0x0946;
            case 28: goto L_0x0939;
            case 29: goto L_0x092b;
            case 30: goto L_0x091d;
            case 31: goto L_0x090f;
            case 32: goto L_0x0901;
            case 33: goto L_0x08f3;
            case 34: goto L_0x08e5;
            case 35: goto L_0x08c4;
            case 36: goto L_0x08a3;
            case 37: goto L_0x0882;
            case 38: goto L_0x0861;
            case 39: goto L_0x0840;
            case 40: goto L_0x081f;
            case 41: goto L_0x07fe;
            case 42: goto L_0x07dd;
            case 43: goto L_0x07bc;
            case 44: goto L_0x079b;
            case 45: goto L_0x077a;
            case 46: goto L_0x0759;
            case 47: goto L_0x0738;
            case 48: goto L_0x0717;
            case 49: goto L_0x0706;
            case 50: goto L_0x06f5;
            case 51: goto L_0x06e6;
            case 52: goto L_0x06d8;
            case 53: goto L_0x06c7;
            case 54: goto L_0x06b6;
            case 55: goto L_0x06a5;
            case 56: goto L_0x0696;
            case 57: goto L_0x0688;
            case 58: goto L_0x067b;
            case 59: goto L_0x065b;
            case 60: goto L_0x0646;
            case 61: goto L_0x0633;
            case 62: goto L_0x0622;
            case 63: goto L_0x0611;
            case 64: goto L_0x0603;
            case 65: goto L_0x05f4;
            case 66: goto L_0x05e3;
            case 67: goto L_0x05d2;
            case 68: goto L_0x05bb;
            default: goto L_0x05b9;
        };
    L_0x05b9:
        goto L_0x09ca;
    L_0x05bb:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05c1:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.ads.zzbel) r4;
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.zzbck.m21530c(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05d2:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05d8:
        r9 = m20802e(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21542f(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05e3:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05e9:
        r4 = m20800d(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21549h(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05f4:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05fa:
        r9 = 0;
        r4 = com.google.android.gms.internal.ads.zzbck.m21550h(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0603:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0609:
        r4 = 0;
        r9 = com.google.android.gms.internal.ads.zzbck.m21556j(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0611:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0617:
        r4 = m20800d(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21558k(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0622:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0628:
        r4 = m20800d(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21545g(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0633:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0639:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.ads.zzbbu) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21528c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0646:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x064c:
        r4 = r2.getObject(r1, r9);
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.mn.m9105a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x065b:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0661:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.ads.zzbbu;
        if (r9 == 0) goto L_0x0672;
    L_0x0669:
        r4 = (com.google.android.gms.internal.ads.zzbbu) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21528c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0672:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21520b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x067b:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0681:
        r4 = com.google.android.gms.internal.ads.zzbck.m21521b(r14, r7);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0688:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x068e:
        r4 = 0;
        r9 = com.google.android.gms.internal.ads.zzbck.m21553i(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0696:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x069c:
        r9 = 0;
        r4 = com.google.android.gms.internal.ads.zzbck.m21546g(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06a5:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06ab:
        r4 = m20800d(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21541f(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06b6:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06bc:
        r9 = m20802e(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21538e(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06c7:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06cd:
        r9 = m20802e(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21532d(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06d8:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06de:
        r4 = 0;
        r9 = com.google.android.gms.internal.ads.zzbck.m21517b(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x06e6:
        r4 = r0.m20786a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06ec:
        r9 = 0;
        r4 = com.google.android.gms.internal.ads.zzbck.m21516b(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06f5:
        r4 = r0.f16559s;
        r9 = r2.getObject(r1, r9);
        r10 = r0.m20791b(r3);
        r4 = r4.mo2100a(r14, r9, r10);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0706:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.mn.m9123b(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0717:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9131c(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0723:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x072b;
    L_0x0727:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x072b:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0738:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9146g(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0744:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x074c;
    L_0x0748:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x074c:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0759:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9152i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0765:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x076d;
    L_0x0769:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x076d:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x077a:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9149h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0786:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x078e;
    L_0x078a:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x078e:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x079b:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9135d(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07a7:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x07af;
    L_0x07ab:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07af:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07bc:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9143f(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07c8:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x07d0;
    L_0x07cc:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07d0:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07dd:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9155j(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07e9:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x07f1;
    L_0x07ed:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07f1:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07fe:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9149h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x080a:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x0812;
    L_0x080e:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0812:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x081f:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9152i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x082b:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x0833;
    L_0x082f:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0833:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0840:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9139e(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x084c:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x0854;
    L_0x0850:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0854:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0861:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9125b(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x086d:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x0875;
    L_0x0871:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0875:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0882:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9109a(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x088e:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x0896;
    L_0x0892:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0896:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08a3:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9149h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x08af:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x08b7;
    L_0x08b3:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x08b7:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08c4:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.ads.mn.m9152i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x08d0:
        r10 = r0.f16551k;
        if (r10 == 0) goto L_0x08d8;
    L_0x08d4:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x08d8:
        r4 = com.google.android.gms.internal.ads.zzbck.m21537e(r14);
        r10 = com.google.android.gms.internal.ads.zzbck.m21544g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08e5:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.ads.mn.m9130c(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08f3:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9145g(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0901:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9151i(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x090f:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9148h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x091d:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9134d(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x092b:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9142f(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0939:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9122b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0946:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.mn.m9107a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0957:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9106a(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0963:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.ads.mn.m9154j(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0970:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9148h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x097d:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9151i(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x098a:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9138e(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0997:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9124b(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09a4:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9108a(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09b1:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9148h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09be:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.ads.mn.m9151i(r14, r4, r11);
        r5 = r5 + r4;
    L_0x09ca:
        r4 = 0;
    L_0x09cb:
        r9 = 0;
        r10 = 0;
        r18 = 0;
        goto L_0x0aef;
    L_0x09d2:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x09d6:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.ads.zzbel) r4;
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.zzbck.m21530c(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09e6:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x09ea:
        r9 = r2.getLong(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21542f(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09f4:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x09f8:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21549h(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a02:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a06:
        r9 = 0;
        r4 = com.google.android.gms.internal.ads.zzbck.m21550h(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a0e:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a12:
        r4 = 0;
        r9 = com.google.android.gms.internal.ads.zzbck.m21556j(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0a19:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a1d:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21558k(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a27:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a2b:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.ads.zzbck.m21545g(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a35:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a39:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.ads.zzbbu) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21528c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a45:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a49:
        r4 = r2.getObject(r1, r9);
        r9 = r0.m20775a(r3);
        r4 = com.google.android.gms.internal.ads.mn.m9105a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a58:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a5c:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.ads.zzbbu;
        if (r9 == 0) goto L_0x0a6d;
    L_0x0a64:
        r4 = (com.google.android.gms.internal.ads.zzbbu) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21528c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a6d:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.ads.zzbck.m21520b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a76:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a7a:
        r4 = com.google.android.gms.internal.ads.zzbck.m21521b(r14, r7);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a81:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a85:
        r4 = 0;
        r9 = com.google.android.gms.internal.ads.zzbck.m21553i(r14, r4);
        r5 = r5 + r9;
        goto L_0x09cb;
    L_0x0a8d:
        r4 = 0;
        r9 = r12 & r16;
        if (r9 == 0) goto L_0x09cb;
    L_0x0a92:
        r9 = 0;
        r11 = com.google.android.gms.internal.ads.zzbck.m21546g(r14, r9);
        r5 = r5 + r11;
        r18 = r9;
        goto L_0x0ace;
    L_0x0a9c:
        r4 = 0;
        r18 = 0;
        r11 = r12 & r16;
        if (r11 == 0) goto L_0x0ace;
    L_0x0aa3:
        r9 = r2.getInt(r1, r9);
        r9 = com.google.android.gms.internal.ads.zzbck.m21541f(r14, r9);
        r5 = r5 + r9;
        goto L_0x0ace;
    L_0x0aad:
        r4 = 0;
        r18 = 0;
        r11 = r12 & r16;
        if (r11 == 0) goto L_0x0ace;
    L_0x0ab4:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.ads.zzbck.m21538e(r14, r9);
        r5 = r5 + r9;
        goto L_0x0ace;
    L_0x0abe:
        r4 = 0;
        r18 = 0;
        r11 = r12 & r16;
        if (r11 == 0) goto L_0x0ace;
    L_0x0ac5:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.ads.zzbck.m21532d(r14, r9);
        r5 = r5 + r9;
    L_0x0ace:
        r9 = 0;
        goto L_0x0add;
    L_0x0ad0:
        r4 = 0;
        r18 = 0;
        r9 = r12 & r16;
        if (r9 == 0) goto L_0x0ace;
    L_0x0ad7:
        r9 = 0;
        r10 = com.google.android.gms.internal.ads.zzbck.m21517b(r14, r9);
        r5 = r5 + r10;
    L_0x0add:
        r10 = 0;
        goto L_0x0aef;
    L_0x0ae0:
        r4 = 0;
        r9 = 0;
        r18 = 0;
        r10 = r12 & r16;
        if (r10 == 0) goto L_0x0add;
    L_0x0ae8:
        r10 = 0;
        r13 = com.google.android.gms.internal.ads.zzbck.m21516b(r14, r10);
        r5 = r5 + r13;
    L_0x0aef:
        r3 = r3 + 3;
        r9 = r18;
        r4 = 0;
        r11 = 0;
        goto L_0x0566;
    L_0x0af7:
        r2 = r0.f16557q;
        r2 = m20768a(r2, r1);
        r5 = r5 + r2;
        r2 = r0.f16548h;
        if (r2 == 0) goto L_0x0b0d;
    L_0x0b02:
        r2 = r0.f16558r;
        r1 = r2.mo2084a(r1);
        r1 = r1.m9014h();
        r5 = r5 + r1;
    L_0x0b0d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m20768a(nc<UT, UB> ncVar, T t) {
        return ncVar.mo2143f(ncVar.mo2135b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m20779a(Object obj, long j) {
        return (List) ng.m9252f(obj, j);
    }

    /* renamed from: a */
    public final void mo2111a(T t, no noVar) {
        lb a;
        Iterator f;
        Entry entry;
        int length;
        int i;
        if (noVar.mo2042a() == zze.f9176k) {
            int d;
            m20781a(this.f16557q, (Object) t, noVar);
            if (this.f16548h) {
                a = this.f16558r.mo2084a((Object) t);
                if (!a.m9008b()) {
                    f = a.m9012f();
                    entry = (Entry) f.next();
                    for (length = this.f16543c.length - 3; length >= 0; length -= 3) {
                        d = m20799d(length);
                        i = this.f16543c[length];
                        while (entry != null && this.f16558r.mo2083a(entry) > i) {
                            this.f16558r.mo2088a(noVar, entry);
                            entry = f.hasNext() ? (Entry) f.next() : null;
                        }
                        switch ((d & 267386880) >>> 20) {
                            case 0:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2044a(i, ng.m9249e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 1:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2045a(i, ng.m9245d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 2:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2047a(i, ng.m9236b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 3:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2065c(i, ng.m9236b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 4:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2064c(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 5:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2068d(i, ng.m9236b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 6:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2067d(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 7:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2056a(i, ng.m9244c(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 8:
                                if (!m20785a((Object) t, length)) {
                                    m20780a(i, ng.m9252f(t, (long) (d & 1048575)), noVar);
                                    break;
                                }
                                break;
                            case 9:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2051a(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                                    break;
                                }
                                break;
                            case 10:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2049a(i, (zzbbu) ng.m9252f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 11:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2070e(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 12:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2058b(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 13:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2046a(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 14:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2059b(i, ng.m9236b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 15:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2073f(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 16:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2071e(i, ng.m9236b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 17:
                                if (!m20785a((Object) t, length)) {
                                    noVar.mo2060b(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                                    break;
                                }
                                break;
                            case 18:
                                mn.m9116a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 19:
                                mn.m9129b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 20:
                                mn.m9133c(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 21:
                                mn.m9137d(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 22:
                                mn.m9150h(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 23:
                                mn.m9144f(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 24:
                                mn.m9157k(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 25:
                                mn.m9160n(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 26:
                                mn.m9114a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar);
                                break;
                            case 27:
                                mn.m9115a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, m20775a(length));
                                break;
                            case 28:
                                mn.m9127b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar);
                                break;
                            case 29:
                                mn.m9153i(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 30:
                                mn.m9159m(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 31:
                                mn.m9158l(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 32:
                                mn.m9147g(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 33:
                                mn.m9156j(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 34:
                                mn.m9141e(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                                break;
                            case 35:
                                mn.m9116a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 36:
                                mn.m9129b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 37:
                                mn.m9133c(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 38:
                                mn.m9137d(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 39:
                                mn.m9150h(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 40:
                                mn.m9144f(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 41:
                                mn.m9157k(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 42:
                                mn.m9160n(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 43:
                                mn.m9153i(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 44:
                                mn.m9159m(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 45:
                                mn.m9158l(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 46:
                                mn.m9147g(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 47:
                                mn.m9156j(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 48:
                                mn.m9141e(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                                break;
                            case 49:
                                mn.m9128b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, m20775a(length));
                                break;
                            case 50:
                                m20782a(noVar, i, ng.m9252f(t, (long) (d & 1048575)), length);
                                break;
                            case 51:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2044a(i, m20789b((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 52:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2045a(i, m20796c(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 53:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2047a(i, m20802e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 54:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2065c(i, m20802e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 55:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2064c(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 56:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2068d(i, m20802e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 57:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2067d(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 58:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2056a(i, m20805f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 59:
                                if (!m20786a((Object) t, i, length)) {
                                    m20780a(i, ng.m9252f(t, (long) (d & 1048575)), noVar);
                                    break;
                                }
                                break;
                            case 60:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2051a(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                                    break;
                                }
                                break;
                            case 61:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2049a(i, (zzbbu) ng.m9252f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 62:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2070e(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 63:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2058b(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 64:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2046a(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 65:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2059b(i, m20802e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 66:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2073f(i, m20800d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 67:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2071e(i, m20802e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 68:
                                if (!m20786a((Object) t, i, length)) {
                                    noVar.mo2060b(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    while (entry != null) {
                        this.f16558r.mo2088a(noVar, entry);
                        entry = f.hasNext() == null ? (Entry) f.next() : null;
                    }
                }
            }
            f = null;
            entry = f;
            for (length = this.f16543c.length - 3; length >= 0; length -= 3) {
                d = m20799d(length);
                i = this.f16543c[length];
                while (entry != null) {
                    this.f16558r.mo2088a(noVar, entry);
                    if (f.hasNext()) {
                    }
                }
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2044a(i, ng.m9249e(t, (long) (d & 1048575)));
                        break;
                    case 1:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2045a(i, ng.m9245d(t, (long) (d & 1048575)));
                        break;
                    case 2:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2047a(i, ng.m9236b(t, (long) (d & 1048575)));
                        break;
                    case 3:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2065c(i, ng.m9236b(t, (long) (d & 1048575)));
                        break;
                    case 4:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2064c(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 5:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2068d(i, ng.m9236b(t, (long) (d & 1048575)));
                        break;
                    case 6:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2067d(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 7:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2056a(i, ng.m9244c(t, (long) (d & 1048575)));
                        break;
                    case 8:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        m20780a(i, ng.m9252f(t, (long) (d & 1048575)), noVar);
                        break;
                    case 9:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2051a(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                        break;
                    case 10:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2049a(i, (zzbbu) ng.m9252f(t, (long) (d & 1048575)));
                        break;
                    case 11:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2070e(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 12:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2058b(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 13:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2046a(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 14:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2059b(i, ng.m9236b(t, (long) (d & 1048575)));
                        break;
                    case 15:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2073f(i, ng.m9221a((Object) t, (long) (d & 1048575)));
                        break;
                    case 16:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2071e(i, ng.m9236b(t, (long) (d & 1048575)));
                        break;
                    case 17:
                        if (!m20785a((Object) t, length)) {
                            break;
                        }
                        noVar.mo2060b(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                        break;
                    case 18:
                        mn.m9116a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 19:
                        mn.m9129b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 20:
                        mn.m9133c(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 21:
                        mn.m9137d(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 22:
                        mn.m9150h(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 23:
                        mn.m9144f(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 24:
                        mn.m9157k(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 25:
                        mn.m9160n(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 26:
                        mn.m9114a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar);
                        break;
                    case 27:
                        mn.m9115a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, m20775a(length));
                        break;
                    case 28:
                        mn.m9127b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar);
                        break;
                    case 29:
                        mn.m9153i(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 30:
                        mn.m9159m(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 31:
                        mn.m9158l(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 32:
                        mn.m9147g(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 33:
                        mn.m9156j(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 34:
                        mn.m9141e(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, false);
                        break;
                    case 35:
                        mn.m9116a(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 36:
                        mn.m9129b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 37:
                        mn.m9133c(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 38:
                        mn.m9137d(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 39:
                        mn.m9150h(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 40:
                        mn.m9144f(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 41:
                        mn.m9157k(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 42:
                        mn.m9160n(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 43:
                        mn.m9153i(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 44:
                        mn.m9159m(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 45:
                        mn.m9158l(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 46:
                        mn.m9147g(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 47:
                        mn.m9156j(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 48:
                        mn.m9141e(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, true);
                        break;
                    case 49:
                        mn.m9128b(this.f16543c[length], (List) ng.m9252f(t, (long) (d & 1048575)), noVar, m20775a(length));
                        break;
                    case 50:
                        m20782a(noVar, i, ng.m9252f(t, (long) (d & 1048575)), length);
                        break;
                    case 51:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2044a(i, m20789b((Object) t, (long) (d & 1048575)));
                        break;
                    case 52:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2045a(i, m20796c(t, (long) (d & 1048575)));
                        break;
                    case 53:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2047a(i, m20802e(t, (long) (d & 1048575)));
                        break;
                    case 54:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2065c(i, m20802e(t, (long) (d & 1048575)));
                        break;
                    case 55:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2064c(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 56:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2068d(i, m20802e(t, (long) (d & 1048575)));
                        break;
                    case 57:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2067d(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 58:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2056a(i, m20805f(t, (long) (d & 1048575)));
                        break;
                    case 59:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        m20780a(i, ng.m9252f(t, (long) (d & 1048575)), noVar);
                        break;
                    case 60:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2051a(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                        break;
                    case 61:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2049a(i, (zzbbu) ng.m9252f(t, (long) (d & 1048575)));
                        break;
                    case 62:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2070e(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 63:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2058b(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 64:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2046a(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 65:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2059b(i, m20802e(t, (long) (d & 1048575)));
                        break;
                    case 66:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2073f(i, m20800d(t, (long) (d & 1048575)));
                        break;
                    case 67:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2071e(i, m20802e(t, (long) (d & 1048575)));
                        break;
                    case 68:
                        if (!m20786a((Object) t, i, length)) {
                            break;
                        }
                        noVar.mo2060b(i, ng.m9252f(t, (long) (d & 1048575)), m20775a(length));
                        break;
                    default:
                        break;
                }
            }
            while (entry != null) {
                this.f16558r.mo2088a(noVar, entry);
                if (f.hasNext() == null) {
                }
            }
        } else if (this.f16550j) {
            Entry entry2;
            int i2;
            int i3;
            if (this.f16548h) {
                a = this.f16558r.mo2084a((Object) t);
                if (!a.m9008b()) {
                    f = a.m9011e();
                    entry = (Entry) f.next();
                    length = this.f16543c.length;
                    entry2 = entry;
                    for (i2 = 0; i2 < length; i2 += 3) {
                        i = m20799d(i2);
                        i3 = this.f16543c[i2];
                        while (entry2 != null && this.f16558r.mo2083a(entry2) <= i3) {
                            this.f16558r.mo2088a(noVar, entry2);
                            entry2 = f.hasNext() ? (Entry) f.next() : null;
                        }
                        switch ((i & 267386880) >>> 20) {
                            case 0:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2044a(i3, ng.m9249e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 1:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2045a(i3, ng.m9245d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 2:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2047a(i3, ng.m9236b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 3:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2065c(i3, ng.m9236b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 4:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2064c(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 5:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2068d(i3, ng.m9236b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 6:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2067d(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 7:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2056a(i3, ng.m9244c(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 8:
                                if (!m20785a((Object) t, i2)) {
                                    m20780a(i3, ng.m9252f(t, (long) (i & 1048575)), noVar);
                                    break;
                                }
                                break;
                            case 9:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2051a(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                                    break;
                                }
                                break;
                            case 10:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2049a(i3, (zzbbu) ng.m9252f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 11:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2070e(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 12:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2058b(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 13:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2046a(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 14:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2059b(i3, ng.m9236b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 15:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2073f(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 16:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2071e(i3, ng.m9236b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 17:
                                if (!m20785a((Object) t, i2)) {
                                    noVar.mo2060b(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                                    break;
                                }
                                break;
                            case 18:
                                mn.m9116a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 19:
                                mn.m9129b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 20:
                                mn.m9133c(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 21:
                                mn.m9137d(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 22:
                                mn.m9150h(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 23:
                                mn.m9144f(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 24:
                                mn.m9157k(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 25:
                                mn.m9160n(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 26:
                                mn.m9114a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar);
                                break;
                            case 27:
                                mn.m9115a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, m20775a(i2));
                                break;
                            case 28:
                                mn.m9127b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar);
                                break;
                            case 29:
                                mn.m9153i(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 30:
                                mn.m9159m(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 31:
                                mn.m9158l(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 32:
                                mn.m9147g(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 33:
                                mn.m9156j(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 34:
                                mn.m9141e(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                                break;
                            case 35:
                                mn.m9116a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 36:
                                mn.m9129b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 37:
                                mn.m9133c(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 38:
                                mn.m9137d(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 39:
                                mn.m9150h(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 40:
                                mn.m9144f(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 41:
                                mn.m9157k(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 42:
                                mn.m9160n(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 43:
                                mn.m9153i(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 44:
                                mn.m9159m(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 45:
                                mn.m9158l(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 46:
                                mn.m9147g(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 47:
                                mn.m9156j(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 48:
                                mn.m9141e(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                                break;
                            case 49:
                                mn.m9128b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, m20775a(i2));
                                break;
                            case 50:
                                m20782a(noVar, i3, ng.m9252f(t, (long) (i & 1048575)), i2);
                                break;
                            case 51:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2044a(i3, m20789b((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 52:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2045a(i3, m20796c(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 53:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2047a(i3, m20802e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 54:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2065c(i3, m20802e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 55:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2064c(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 56:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2068d(i3, m20802e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 57:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2067d(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 58:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2056a(i3, m20805f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 59:
                                if (!m20786a((Object) t, i3, i2)) {
                                    m20780a(i3, ng.m9252f(t, (long) (i & 1048575)), noVar);
                                    break;
                                }
                                break;
                            case 60:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2051a(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                                    break;
                                }
                                break;
                            case 61:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2049a(i3, (zzbbu) ng.m9252f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 62:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2070e(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 63:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2058b(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 64:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2046a(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 65:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2059b(i3, m20802e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 66:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2073f(i3, m20800d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 67:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2071e(i3, m20802e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 68:
                                if (!m20786a((Object) t, i3, i2)) {
                                    noVar.mo2060b(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.f16558r.mo2088a(noVar, entry2);
                        entry2 = f.hasNext() ? (Entry) f.next() : null;
                    }
                    m20781a(this.f16557q, (Object) t, noVar);
                }
            }
            f = null;
            entry = f;
            length = this.f16543c.length;
            entry2 = entry;
            for (i2 = 0; i2 < length; i2 += 3) {
                i = m20799d(i2);
                i3 = this.f16543c[i2];
                while (entry2 != null) {
                    this.f16558r.mo2088a(noVar, entry2);
                    if (f.hasNext()) {
                    }
                }
                switch ((i & 267386880) >>> 20) {
                    case 0:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2044a(i3, ng.m9249e(t, (long) (i & 1048575)));
                        break;
                    case 1:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2045a(i3, ng.m9245d(t, (long) (i & 1048575)));
                        break;
                    case 2:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2047a(i3, ng.m9236b(t, (long) (i & 1048575)));
                        break;
                    case 3:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2065c(i3, ng.m9236b(t, (long) (i & 1048575)));
                        break;
                    case 4:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2064c(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 5:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2068d(i3, ng.m9236b(t, (long) (i & 1048575)));
                        break;
                    case 6:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2067d(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 7:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2056a(i3, ng.m9244c(t, (long) (i & 1048575)));
                        break;
                    case 8:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        m20780a(i3, ng.m9252f(t, (long) (i & 1048575)), noVar);
                        break;
                    case 9:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2051a(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                        break;
                    case 10:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2049a(i3, (zzbbu) ng.m9252f(t, (long) (i & 1048575)));
                        break;
                    case 11:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2070e(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 12:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2058b(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 13:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2046a(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 14:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2059b(i3, ng.m9236b(t, (long) (i & 1048575)));
                        break;
                    case 15:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2073f(i3, ng.m9221a((Object) t, (long) (i & 1048575)));
                        break;
                    case 16:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2071e(i3, ng.m9236b(t, (long) (i & 1048575)));
                        break;
                    case 17:
                        if (!m20785a((Object) t, i2)) {
                            break;
                        }
                        noVar.mo2060b(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                        break;
                    case 18:
                        mn.m9116a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 19:
                        mn.m9129b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 20:
                        mn.m9133c(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 21:
                        mn.m9137d(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 22:
                        mn.m9150h(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 23:
                        mn.m9144f(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 24:
                        mn.m9157k(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 25:
                        mn.m9160n(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 26:
                        mn.m9114a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar);
                        break;
                    case 27:
                        mn.m9115a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, m20775a(i2));
                        break;
                    case 28:
                        mn.m9127b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar);
                        break;
                    case 29:
                        mn.m9153i(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 30:
                        mn.m9159m(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 31:
                        mn.m9158l(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 32:
                        mn.m9147g(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 33:
                        mn.m9156j(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 34:
                        mn.m9141e(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, false);
                        break;
                    case 35:
                        mn.m9116a(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 36:
                        mn.m9129b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 37:
                        mn.m9133c(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 38:
                        mn.m9137d(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 39:
                        mn.m9150h(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 40:
                        mn.m9144f(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 41:
                        mn.m9157k(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 42:
                        mn.m9160n(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 43:
                        mn.m9153i(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 44:
                        mn.m9159m(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 45:
                        mn.m9158l(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 46:
                        mn.m9147g(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 47:
                        mn.m9156j(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 48:
                        mn.m9141e(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, true);
                        break;
                    case 49:
                        mn.m9128b(this.f16543c[i2], (List) ng.m9252f(t, (long) (i & 1048575)), noVar, m20775a(i2));
                        break;
                    case 50:
                        m20782a(noVar, i3, ng.m9252f(t, (long) (i & 1048575)), i2);
                        break;
                    case 51:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2044a(i3, m20789b((Object) t, (long) (i & 1048575)));
                        break;
                    case 52:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2045a(i3, m20796c(t, (long) (i & 1048575)));
                        break;
                    case 53:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2047a(i3, m20802e(t, (long) (i & 1048575)));
                        break;
                    case 54:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2065c(i3, m20802e(t, (long) (i & 1048575)));
                        break;
                    case 55:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2064c(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 56:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2068d(i3, m20802e(t, (long) (i & 1048575)));
                        break;
                    case 57:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2067d(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 58:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2056a(i3, m20805f(t, (long) (i & 1048575)));
                        break;
                    case 59:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        m20780a(i3, ng.m9252f(t, (long) (i & 1048575)), noVar);
                        break;
                    case 60:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2051a(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                        break;
                    case 61:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2049a(i3, (zzbbu) ng.m9252f(t, (long) (i & 1048575)));
                        break;
                    case 62:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2070e(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 63:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2058b(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 64:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2046a(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 65:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2059b(i3, m20802e(t, (long) (i & 1048575)));
                        break;
                    case 66:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2073f(i3, m20800d(t, (long) (i & 1048575)));
                        break;
                    case 67:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2071e(i3, m20802e(t, (long) (i & 1048575)));
                        break;
                    case 68:
                        if (!m20786a((Object) t, i3, i2)) {
                            break;
                        }
                        noVar.mo2060b(i3, ng.m9252f(t, (long) (i & 1048575)), m20775a(i2));
                        break;
                    default:
                        break;
                }
            }
            while (entry2 != null) {
                this.f16558r.mo2088a(noVar, entry2);
                if (f.hasNext()) {
                }
            }
            m20781a(this.f16557q, (Object) t, noVar);
        } else {
            m20794b((Object) t, noVar);
        }
    }

    /* renamed from: b */
    private final void m20794b(T t, no noVar) {
        Iterator e;
        Entry entry;
        int i;
        int length;
        Unsafe unsafe;
        Entry entry2;
        int i2;
        int i3;
        int d;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        Object obj = t;
        no noVar2 = noVar;
        if (this.f16548h) {
            lb a = r0.f16558r.mo2084a(obj);
            if (!a.m9008b()) {
                e = a.m9011e();
                entry = (Entry) e.next();
                i = -1;
                length = r0.f16543c.length;
                unsafe = f16542b;
                entry2 = entry;
                i2 = 0;
                for (i3 = 0; i3 < length; i3 = d + 3) {
                    d = m20799d(i3);
                    i4 = r0.f16543c[i3];
                    i5 = (267386880 & d) >>> 20;
                    if (!r0.f16550j || i5 > 17) {
                        i6 = i3;
                        i7 = 0;
                    } else {
                        int i8 = r0.f16543c[i3 + 2];
                        i7 = i8 & 1048575;
                        if (i7 != i) {
                            i6 = i3;
                            i2 = unsafe.getInt(obj, (long) i7);
                            i = i7;
                        } else {
                            i6 = i3;
                        }
                        i7 = 1 << (i8 >>> 20);
                    }
                    while (entry2 != null && r0.f16558r.mo2083a(entry2) <= i4) {
                        r0.f16558r.mo2088a(noVar2, entry2);
                        entry2 = e.hasNext() ? (Entry) e.next() : null;
                    }
                    j = (long) (d & 1048575);
                    switch (i5) {
                        case 0:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                break;
                            }
                            noVar2.mo2044a(i4, ng.m9249e(obj, j));
                            continue;
                            continue;
                        case 1:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2045a(i4, ng.m9245d(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 2:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2047a(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 3:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2065c(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 4:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2064c(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 5:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2068d(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 6:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2067d(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 7:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2056a(i4, ng.m9244c(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 8:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                m20780a(i4, unsafe.getObject(obj, j), noVar2);
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 9:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2051a(i4, unsafe.getObject(obj, j), m20775a(d));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 10:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2049a(i4, (zzbbu) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 11:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2070e(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 12:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2058b(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 13:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2046a(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 14:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2059b(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 15:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2073f(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 16:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2071e(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 17:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                noVar2.mo2060b(i4, unsafe.getObject(obj, j), m20775a(d));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 18:
                            d = i6;
                            mn.m9116a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 19:
                            d = i6;
                            mn.m9129b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 20:
                            d = i6;
                            mn.m9133c(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 21:
                            d = i6;
                            mn.m9137d(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 22:
                            d = i6;
                            mn.m9150h(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 23:
                            d = i6;
                            mn.m9144f(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 24:
                            d = i6;
                            mn.m9157k(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 25:
                            d = i6;
                            mn.m9160n(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            continue;
                            continue;
                        case 26:
                            d = i6;
                            mn.m9114a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2);
                            break;
                        case 27:
                            d = i6;
                            mn.m9115a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, m20775a(d));
                            break;
                        case 28:
                            d = i6;
                            mn.m9127b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2);
                            break;
                        case 29:
                            d = i6;
                            mn.m9153i(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 30:
                            d = i6;
                            mn.m9159m(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 31:
                            d = i6;
                            mn.m9158l(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 32:
                            d = i6;
                            mn.m9147g(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 33:
                            d = i6;
                            mn.m9156j(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 34:
                            d = i6;
                            mn.m9141e(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                            break;
                        case 35:
                            d = i6;
                            mn.m9116a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 36:
                            d = i6;
                            mn.m9129b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 37:
                            d = i6;
                            mn.m9133c(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 38:
                            d = i6;
                            mn.m9137d(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 39:
                            d = i6;
                            mn.m9150h(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 40:
                            d = i6;
                            mn.m9144f(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 41:
                            d = i6;
                            mn.m9157k(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 42:
                            d = i6;
                            mn.m9160n(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 43:
                            d = i6;
                            mn.m9153i(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 44:
                            d = i6;
                            mn.m9159m(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 45:
                            d = i6;
                            mn.m9158l(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 46:
                            d = i6;
                            mn.m9147g(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 47:
                            d = i6;
                            mn.m9156j(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 48:
                            d = i6;
                            mn.m9141e(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                            break;
                        case 49:
                            d = i6;
                            mn.m9128b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, m20775a(d));
                            break;
                        case 50:
                            d = i6;
                            m20782a(noVar2, i4, unsafe.getObject(obj, j), d);
                            break;
                        case 51:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2044a(i4, m20789b(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2045a(i4, m20796c(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2047a(i4, m20802e(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2065c(i4, m20802e(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2064c(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2068d(i4, m20802e(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2067d(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2056a(i4, m20805f(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                m20780a(i4, unsafe.getObject(obj, j), noVar2);
                                break;
                            }
                            break;
                        case 60:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2051a(i4, unsafe.getObject(obj, j), m20775a(d));
                                break;
                            }
                            break;
                        case 61:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2049a(i4, (zzbbu) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2070e(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2058b(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2046a(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2059b(i4, m20802e(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2073f(i4, m20800d(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2071e(i4, m20802e(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            d = i6;
                            if (m20786a(obj, i4, d)) {
                                noVar2.mo2060b(i4, unsafe.getObject(obj, j), m20775a(d));
                                break;
                            }
                            break;
                        default:
                            d = i6;
                            break;
                    }
                }
                while (entry2 != null) {
                    r0.f16558r.mo2088a(noVar2, entry2);
                    entry2 = e.hasNext() ? (Entry) e.next() : null;
                }
                m20781a(r0.f16557q, obj, noVar2);
            }
        }
        e = null;
        entry = null;
        i = -1;
        length = r0.f16543c.length;
        unsafe = f16542b;
        entry2 = entry;
        i2 = 0;
        while (i3 < length) {
            d = m20799d(i3);
            i4 = r0.f16543c[i3];
            i5 = (267386880 & d) >>> 20;
            if (r0.f16550j) {
            }
            i6 = i3;
            i7 = 0;
            while (entry2 != null) {
                r0.f16558r.mo2088a(noVar2, entry2);
                if (e.hasNext()) {
                }
            }
            j = (long) (d & 1048575);
            switch (i5) {
                case 0:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        break;
                    }
                    noVar2.mo2044a(i4, ng.m9249e(obj, j));
                    continue;
                    continue;
                case 1:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2045a(i4, ng.m9245d(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 2:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2047a(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 3:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2065c(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 4:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2064c(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 5:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2068d(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 6:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2067d(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 7:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2056a(i4, ng.m9244c(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 8:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        m20780a(i4, unsafe.getObject(obj, j), noVar2);
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 9:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2051a(i4, unsafe.getObject(obj, j), m20775a(d));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 10:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2049a(i4, (zzbbu) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 11:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2070e(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 12:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2058b(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 13:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2046a(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 14:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2059b(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 15:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2073f(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 16:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2071e(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 17:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        noVar2.mo2060b(i4, unsafe.getObject(obj, j), m20775a(d));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 18:
                    d = i6;
                    mn.m9116a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 19:
                    d = i6;
                    mn.m9129b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 20:
                    d = i6;
                    mn.m9133c(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 21:
                    d = i6;
                    mn.m9137d(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 22:
                    d = i6;
                    mn.m9150h(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 23:
                    d = i6;
                    mn.m9144f(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 24:
                    d = i6;
                    mn.m9157k(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 25:
                    d = i6;
                    mn.m9160n(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    continue;
                    continue;
                case 26:
                    d = i6;
                    mn.m9114a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2);
                    break;
                case 27:
                    d = i6;
                    mn.m9115a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, m20775a(d));
                    break;
                case 28:
                    d = i6;
                    mn.m9127b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2);
                    break;
                case 29:
                    d = i6;
                    mn.m9153i(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 30:
                    d = i6;
                    mn.m9159m(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 31:
                    d = i6;
                    mn.m9158l(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 32:
                    d = i6;
                    mn.m9147g(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 33:
                    d = i6;
                    mn.m9156j(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 34:
                    d = i6;
                    mn.m9141e(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, false);
                    break;
                case 35:
                    d = i6;
                    mn.m9116a(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 36:
                    d = i6;
                    mn.m9129b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 37:
                    d = i6;
                    mn.m9133c(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 38:
                    d = i6;
                    mn.m9137d(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 39:
                    d = i6;
                    mn.m9150h(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 40:
                    d = i6;
                    mn.m9144f(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 41:
                    d = i6;
                    mn.m9157k(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 42:
                    d = i6;
                    mn.m9160n(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 43:
                    d = i6;
                    mn.m9153i(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 44:
                    d = i6;
                    mn.m9159m(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 45:
                    d = i6;
                    mn.m9158l(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 46:
                    d = i6;
                    mn.m9147g(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 47:
                    d = i6;
                    mn.m9156j(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 48:
                    d = i6;
                    mn.m9141e(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, true);
                    break;
                case 49:
                    d = i6;
                    mn.m9128b(r0.f16543c[d], (List) unsafe.getObject(obj, j), noVar2, m20775a(d));
                    break;
                case 50:
                    d = i6;
                    m20782a(noVar2, i4, unsafe.getObject(obj, j), d);
                    break;
                case 51:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2044a(i4, m20789b(obj, j));
                        break;
                    }
                    break;
                case 52:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2045a(i4, m20796c(obj, j));
                        break;
                    }
                    break;
                case 53:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2047a(i4, m20802e(obj, j));
                        break;
                    }
                    break;
                case 54:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2065c(i4, m20802e(obj, j));
                        break;
                    }
                    break;
                case 55:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2064c(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 56:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2068d(i4, m20802e(obj, j));
                        break;
                    }
                    break;
                case 57:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2067d(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 58:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2056a(i4, m20805f(obj, j));
                        break;
                    }
                    break;
                case 59:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        m20780a(i4, unsafe.getObject(obj, j), noVar2);
                        break;
                    }
                    break;
                case 60:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2051a(i4, unsafe.getObject(obj, j), m20775a(d));
                        break;
                    }
                    break;
                case 61:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2049a(i4, (zzbbu) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2070e(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 63:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2058b(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 64:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2046a(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 65:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2059b(i4, m20802e(obj, j));
                        break;
                    }
                    break;
                case 66:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2073f(i4, m20800d(obj, j));
                        break;
                    }
                    break;
                case 67:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2071e(i4, m20802e(obj, j));
                        break;
                    }
                    break;
                case 68:
                    d = i6;
                    if (m20786a(obj, i4, d)) {
                        noVar2.mo2060b(i4, unsafe.getObject(obj, j), m20775a(d));
                        break;
                    }
                    break;
                default:
                    d = i6;
                    break;
            }
        }
        while (entry2 != null) {
            r0.f16558r.mo2088a(noVar2, entry2);
            if (e.hasNext()) {
            }
        }
        m20781a(r0.f16557q, obj, noVar2);
    }

    /* renamed from: a */
    private final <K, V> void m20782a(no noVar, int i, Object obj, int i2) {
        if (obj != null) {
            noVar.mo2048a(i, this.f16559s.mo2107f(m20791b(i2)), this.f16559s.mo2103b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m20781a(nc<UT, UB> ncVar, T t, no noVar) {
        ncVar.mo2132a(ncVar.mo2135b(t), noVar);
    }

    /* renamed from: e */
    private static zzbfv m20803e(Object obj) {
        zzbdd zzbdd = (zzbdd) obj;
        zzbfv zzbfv = zzbdd.zzdxs;
        if (zzbfv != zzbfv.m10372a()) {
            return zzbfv;
        }
        zzbfv = zzbfv.m10375b();
        zzbdd.zzdxs = zzbfv;
        return zzbfv;
    }

    /* renamed from: a */
    private static int m20767a(ml mlVar, byte[] bArr, int i, int i2, ki kiVar) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = kh.m8963a(i, bArr, i3, kiVar);
            i = kiVar.f8206a;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw zzbdl.m10340a();
        }
        i2 = mlVar.mo2109a();
        i += i4;
        mlVar.mo2112a(i2, bArr, i4, i, kiVar);
        mlVar.mo2116c(i2);
        kiVar.f8208c = i2;
        return i;
    }

    /* renamed from: a */
    private static int m20766a(ml mlVar, byte[] bArr, int i, int i2, int i3, ki kiVar) {
        ma maVar = (ma) mlVar;
        Object a = maVar.mo2109a();
        bArr = maVar.m20772a(a, bArr, i, i2, i3, kiVar);
        maVar.mo2116c(a);
        kiVar.f8208c = a;
        return bArr;
    }

    /* renamed from: a */
    private static int m20765a(ml<?> mlVar, int i, byte[] bArr, int i2, int i3, zzbdk<?> zzbdk, ki kiVar) {
        i2 = m20767a((ml) mlVar, bArr, i2, i3, kiVar);
        zzbdk.add(kiVar.f8208c);
        while (i2 < i3) {
            int a = kh.m8965a(bArr, i2, kiVar);
            if (i != kiVar.f8206a) {
                break;
            }
            i2 = m20767a((ml) mlVar, bArr, a, i3, kiVar);
            zzbdk.add(kiVar.f8208c);
        }
        return i2;
    }

    /* renamed from: a */
    private static int m20773a(byte[] bArr, int i, int i2, zzbgj zzbgj, Class<?> cls, ki kiVar) {
        switch (mb.f8237a[zzbgj.ordinal()]) {
            case 1:
                bArr = kh.m8967b(bArr, i, kiVar);
                kiVar.f8208c = Boolean.valueOf(kiVar.f8207b != null ? 1 : 0);
                return bArr;
            case 2:
                return kh.m8973e(bArr, i, kiVar);
            case 3:
                kiVar.f8208c = Double.valueOf(kh.m8969c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                kiVar.f8208c = Integer.valueOf(kh.m8964a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                kiVar.f8208c = Long.valueOf(kh.m8968b(bArr, i));
                return i + 8;
            case 8:
                kiVar.f8208c = Float.valueOf(kh.m8971d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                bArr = kh.m8965a(bArr, i, kiVar);
                kiVar.f8208c = Integer.valueOf(kiVar.f8206a);
                return bArr;
            case 12:
            case 13:
                bArr = kh.m8967b(bArr, i, kiVar);
                kiVar.f8208c = Long.valueOf(kiVar.f8207b);
                return bArr;
            case 14:
                return m20767a(mh.m9048a().m9050a((Class) cls), bArr, i, i2, kiVar);
            case 15:
                bArr = kh.m8965a(bArr, i, kiVar);
                kiVar.f8208c = Integer.valueOf(zzbcf.m10282g(kiVar.f8206a));
                return bArr;
            case 16:
                bArr = kh.m8967b(bArr, i, kiVar);
                kiVar.f8208c = Long.valueOf(zzbcf.m10279a(kiVar.f8207b));
                return bArr;
            case 17:
                return kh.m8972d(bArr, i, kiVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: a */
    private static int m20764a(int i, byte[] bArr, int i2, int i3, Object obj, ki kiVar) {
        return kh.m8962a(i, bArr, i2, i3, m20803e(obj), kiVar);
    }

    /* renamed from: a */
    private final int m20770a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.ki r30) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r2 = r21;
        r6 = r23;
        r8 = r24;
        r9 = r28;
        r7 = r30;
        r11 = f16542b;
        r11 = r11.getObject(r1, r9);
        r11 = (com.google.android.gms.internal.ads.zzbdk) r11;
        r12 = r11.mo1969a();
        r13 = 1;
        if (r12 != 0) goto L_0x0036;
    L_0x0023:
        r12 = r11.size();
        if (r12 != 0) goto L_0x002c;
    L_0x0029:
        r12 = 10;
        goto L_0x002d;
    L_0x002c:
        r12 = r12 << r13;
    L_0x002d:
        r11 = r11.mo4159a(r12);
        r12 = f16542b;
        r12.putObject(r1, r9, r11);
    L_0x0036:
        r9 = 5;
        r14 = 0;
        r10 = 2;
        switch(r27) {
            case 18: goto L_0x03f2;
            case 19: goto L_0x03b2;
            case 20: goto L_0x0371;
            case 21: goto L_0x0371;
            case 22: goto L_0x0357;
            case 23: goto L_0x0316;
            case 24: goto L_0x02d5;
            case 25: goto L_0x027e;
            case 26: goto L_0x01c4;
            case 27: goto L_0x01aa;
            case 28: goto L_0x0151;
            case 29: goto L_0x0357;
            case 30: goto L_0x0119;
            case 31: goto L_0x02d5;
            case 32: goto L_0x0316;
            case 33: goto L_0x00cc;
            case 34: goto L_0x007f;
            case 35: goto L_0x03f2;
            case 36: goto L_0x03b2;
            case 37: goto L_0x0371;
            case 38: goto L_0x0371;
            case 39: goto L_0x0357;
            case 40: goto L_0x0316;
            case 41: goto L_0x02d5;
            case 42: goto L_0x027e;
            case 43: goto L_0x0357;
            case 44: goto L_0x0119;
            case 45: goto L_0x02d5;
            case 46: goto L_0x0316;
            case 47: goto L_0x00cc;
            case 48: goto L_0x007f;
            case 49: goto L_0x003f;
            default: goto L_0x003d;
        };
    L_0x003d:
        goto L_0x0432;
    L_0x003f:
        r1 = 3;
        if (r6 != r1) goto L_0x0432;
    L_0x0042:
        r1 = r0.m20775a(r8);
        r6 = r2 & -8;
        r6 = r6 | 4;
        r22 = r1;
        r23 = r18;
        r24 = r19;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = m20766a(r22, r23, r24, r25, r26, r27);
        r8 = r7.f8208c;
        r11.add(r8);
    L_0x005f:
        if (r4 >= r5) goto L_0x0432;
    L_0x0061:
        r8 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r9 = r7.f8206a;
        if (r2 != r9) goto L_0x0432;
    L_0x0069:
        r22 = r1;
        r23 = r18;
        r24 = r8;
        r25 = r20;
        r26 = r6;
        r27 = r30;
        r4 = m20766a(r22, r23, r24, r25, r26, r27);
        r8 = r7.f8208c;
        r11.add(r8);
        goto L_0x005f;
    L_0x007f:
        if (r6 != r10) goto L_0x00a3;
    L_0x0081:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x008a:
        if (r1 >= r2) goto L_0x009a;
    L_0x008c:
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r1, r7);
        r4 = r7.f8207b;
        r4 = com.google.android.gms.internal.ads.zzbcf.m10279a(r4);
        r11.m26085a(r4);
        goto L_0x008a;
    L_0x009a:
        if (r1 != r2) goto L_0x009e;
    L_0x009c:
        goto L_0x0433;
    L_0x009e:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x00a3:
        if (r6 != 0) goto L_0x0432;
    L_0x00a5:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r7);
        r8 = r7.f8207b;
        r8 = com.google.android.gms.internal.ads.zzbcf.m10279a(r8);
        r11.m26085a(r8);
    L_0x00b4:
        if (r1 >= r5) goto L_0x0433;
    L_0x00b6:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x00be:
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r7);
        r8 = r7.f8207b;
        r8 = com.google.android.gms.internal.ads.zzbcf.m10279a(r8);
        r11.m26085a(r8);
        goto L_0x00b4;
    L_0x00cc:
        if (r6 != r10) goto L_0x00f0;
    L_0x00ce:
        r11 = (com.google.android.gms.internal.ads.lh) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x00d7:
        if (r1 >= r2) goto L_0x00e7;
    L_0x00d9:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r4 = r7.f8206a;
        r4 = com.google.android.gms.internal.ads.zzbcf.m10282g(r4);
        r11.m26080c(r4);
        goto L_0x00d7;
    L_0x00e7:
        if (r1 != r2) goto L_0x00eb;
    L_0x00e9:
        goto L_0x0433;
    L_0x00eb:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x00f0:
        if (r6 != 0) goto L_0x0432;
    L_0x00f2:
        r11 = (com.google.android.gms.internal.ads.lh) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        r4 = com.google.android.gms.internal.ads.zzbcf.m10282g(r4);
        r11.m26080c(r4);
    L_0x0101:
        if (r1 >= r5) goto L_0x0433;
    L_0x0103:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x010b:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        r4 = com.google.android.gms.internal.ads.zzbcf.m10282g(r4);
        r11.m26080c(r4);
        goto L_0x0101;
    L_0x0119:
        if (r6 != r10) goto L_0x0120;
    L_0x011b:
        r2 = com.google.android.gms.internal.ads.kh.m8966a(r3, r4, r11, r7);
        goto L_0x0131;
    L_0x0120:
        if (r6 != 0) goto L_0x0432;
    L_0x0122:
        r2 = r21;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r11;
        r7 = r30;
        r2 = com.google.android.gms.internal.ads.kh.m8961a(r2, r3, r4, r5, r6, r7);
    L_0x0131:
        r1 = (com.google.android.gms.internal.ads.zzbdd) r1;
        r3 = r1.zzdxs;
        r4 = com.google.android.gms.internal.ads.zzbfv.m10372a();
        if (r3 != r4) goto L_0x013c;
    L_0x013b:
        r3 = 0;
    L_0x013c:
        r4 = r0.m20797c(r8);
        r5 = r0.f16557q;
        r6 = r22;
        r3 = com.google.android.gms.internal.ads.mn.m9113a(r6, r11, r4, r3, r5);
        r3 = (com.google.android.gms.internal.ads.zzbfv) r3;
        if (r3 == 0) goto L_0x014e;
    L_0x014c:
        r1.zzdxs = r3;
    L_0x014e:
        r1 = r2;
        goto L_0x0433;
    L_0x0151:
        if (r6 != r10) goto L_0x0432;
    L_0x0153:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x01a5;
    L_0x015b:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x01a0;
    L_0x015f:
        if (r4 != 0) goto L_0x0167;
    L_0x0161:
        r4 = com.google.android.gms.internal.ads.zzbbu.f9094a;
        r11.add(r4);
        goto L_0x016f;
    L_0x0167:
        r6 = com.google.android.gms.internal.ads.zzbbu.m10261a(r3, r1, r4);
        r11.add(r6);
        r1 = r1 + r4;
    L_0x016f:
        if (r1 >= r5) goto L_0x0433;
    L_0x0171:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x0179:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x019b;
    L_0x0181:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x0196;
    L_0x0185:
        if (r4 != 0) goto L_0x018d;
    L_0x0187:
        r4 = com.google.android.gms.internal.ads.zzbbu.f9094a;
        r11.add(r4);
        goto L_0x016f;
    L_0x018d:
        r6 = com.google.android.gms.internal.ads.zzbbu.m10261a(r3, r1, r4);
        r11.add(r6);
        r1 = r1 + r4;
        goto L_0x016f;
    L_0x0196:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x019b:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x01a0:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x01a5:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x01aa:
        if (r6 != r10) goto L_0x0432;
    L_0x01ac:
        r1 = r0.m20775a(r8);
        r22 = r1;
        r23 = r21;
        r24 = r18;
        r25 = r19;
        r26 = r20;
        r27 = r11;
        r28 = r30;
        r1 = m20765a(r22, r23, r24, r25, r26, r27, r28);
        goto L_0x0433;
    L_0x01c4:
        if (r6 != r10) goto L_0x0432;
    L_0x01c6:
        r8 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r8 = r25 & r8;
        r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r1 != 0) goto L_0x021a;
    L_0x01cf:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x0215;
    L_0x01d7:
        if (r4 != 0) goto L_0x01df;
    L_0x01d9:
        r4 = "";
        r11.add(r4);
        goto L_0x01ea;
    L_0x01df:
        r6 = new java.lang.String;
        r8 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r6.<init>(r3, r1, r4, r8);
        r11.add(r6);
        r1 = r1 + r4;
    L_0x01ea:
        if (r1 >= r5) goto L_0x0433;
    L_0x01ec:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x01f4:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x0210;
    L_0x01fc:
        if (r4 != 0) goto L_0x0204;
    L_0x01fe:
        r4 = "";
        r11.add(r4);
        goto L_0x01ea;
    L_0x0204:
        r6 = new java.lang.String;
        r8 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r6.<init>(r3, r1, r4, r8);
        r11.add(r6);
        r1 = r1 + r4;
        goto L_0x01ea;
    L_0x0210:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x0215:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x021a:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x0279;
    L_0x0222:
        if (r4 != 0) goto L_0x022a;
    L_0x0224:
        r4 = "";
        r11.add(r4);
        goto L_0x023d;
    L_0x022a:
        r6 = r1 + r4;
        r8 = com.google.android.gms.internal.ads.ni.m9271a(r3, r1, r6);
        if (r8 == 0) goto L_0x0274;
    L_0x0232:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r8.<init>(r3, r1, r4, r9);
        r11.add(r8);
    L_0x023c:
        r1 = r6;
    L_0x023d:
        if (r1 >= r5) goto L_0x0433;
    L_0x023f:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x0247:
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        if (r4 < 0) goto L_0x026f;
    L_0x024f:
        if (r4 != 0) goto L_0x0257;
    L_0x0251:
        r4 = "";
        r11.add(r4);
        goto L_0x023d;
    L_0x0257:
        r6 = r1 + r4;
        r8 = com.google.android.gms.internal.ads.ni.m9271a(r3, r1, r6);
        if (r8 == 0) goto L_0x026a;
    L_0x025f:
        r8 = new java.lang.String;
        r9 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r8.<init>(r3, r1, r4, r9);
        r11.add(r8);
        goto L_0x023c;
    L_0x026a:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10348i();
        throw r1;
    L_0x026f:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x0274:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10348i();
        throw r1;
    L_0x0279:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10341b();
        throw r1;
    L_0x027e:
        r1 = 0;
        if (r6 != r10) goto L_0x02a6;
    L_0x0281:
        r11 = (com.google.android.gms.internal.ads.kj) r11;
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r4 = r7.f8206a;
        r4 = r4 + r2;
    L_0x028a:
        if (r2 >= r4) goto L_0x029d;
    L_0x028c:
        r2 = com.google.android.gms.internal.ads.kh.m8967b(r3, r2, r7);
        r5 = r7.f8207b;
        r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1));
        if (r8 == 0) goto L_0x0298;
    L_0x0296:
        r5 = 1;
        goto L_0x0299;
    L_0x0298:
        r5 = 0;
    L_0x0299:
        r11.m26063a(r5);
        goto L_0x028a;
    L_0x029d:
        if (r2 != r4) goto L_0x02a1;
    L_0x029f:
        goto L_0x014e;
    L_0x02a1:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x02a6:
        if (r6 != 0) goto L_0x0432;
    L_0x02a8:
        r11 = (com.google.android.gms.internal.ads.kj) r11;
        r4 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r7);
        r8 = r7.f8207b;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x02b6;
    L_0x02b4:
        r6 = 1;
        goto L_0x02b7;
    L_0x02b6:
        r6 = 0;
    L_0x02b7:
        r11.m26063a(r6);
    L_0x02ba:
        if (r4 >= r5) goto L_0x0432;
    L_0x02bc:
        r6 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r8 = r7.f8206a;
        if (r2 != r8) goto L_0x0432;
    L_0x02c4:
        r4 = com.google.android.gms.internal.ads.kh.m8967b(r3, r6, r7);
        r8 = r7.f8207b;
        r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x02d0;
    L_0x02ce:
        r6 = 1;
        goto L_0x02d1;
    L_0x02d0:
        r6 = 0;
    L_0x02d1:
        r11.m26063a(r6);
        goto L_0x02ba;
    L_0x02d5:
        if (r6 != r10) goto L_0x02f5;
    L_0x02d7:
        r11 = (com.google.android.gms.internal.ads.lh) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x02e0:
        if (r1 >= r2) goto L_0x02ec;
    L_0x02e2:
        r4 = com.google.android.gms.internal.ads.kh.m8964a(r3, r1);
        r11.m26080c(r4);
        r1 = r1 + 4;
        goto L_0x02e0;
    L_0x02ec:
        if (r1 != r2) goto L_0x02f0;
    L_0x02ee:
        goto L_0x0433;
    L_0x02f0:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x02f5:
        if (r6 != r9) goto L_0x0432;
    L_0x02f7:
        r11 = (com.google.android.gms.internal.ads.lh) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8964a(r18, r19);
        r11.m26080c(r1);
        r1 = r4 + 4;
    L_0x0302:
        if (r1 >= r5) goto L_0x0433;
    L_0x0304:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x030c:
        r1 = com.google.android.gms.internal.ads.kh.m8964a(r3, r4);
        r11.m26080c(r1);
        r1 = r4 + 4;
        goto L_0x0302;
    L_0x0316:
        if (r6 != r10) goto L_0x0336;
    L_0x0318:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x0321:
        if (r1 >= r2) goto L_0x032d;
    L_0x0323:
        r4 = com.google.android.gms.internal.ads.kh.m8968b(r3, r1);
        r11.m26085a(r4);
        r1 = r1 + 8;
        goto L_0x0321;
    L_0x032d:
        if (r1 != r2) goto L_0x0331;
    L_0x032f:
        goto L_0x0433;
    L_0x0331:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x0336:
        if (r6 != r13) goto L_0x0432;
    L_0x0338:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r8 = com.google.android.gms.internal.ads.kh.m8968b(r18, r19);
        r11.m26085a(r8);
        r1 = r4 + 8;
    L_0x0343:
        if (r1 >= r5) goto L_0x0433;
    L_0x0345:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x034d:
        r8 = com.google.android.gms.internal.ads.kh.m8968b(r3, r4);
        r11.m26085a(r8);
        r1 = r4 + 8;
        goto L_0x0343;
    L_0x0357:
        if (r6 != r10) goto L_0x035f;
    L_0x0359:
        r1 = com.google.android.gms.internal.ads.kh.m8966a(r3, r4, r11, r7);
        goto L_0x0433;
    L_0x035f:
        if (r6 != 0) goto L_0x0432;
    L_0x0361:
        r22 = r18;
        r23 = r19;
        r24 = r20;
        r25 = r11;
        r26 = r30;
        r1 = com.google.android.gms.internal.ads.kh.m8961a(r21, r22, r23, r24, r25, r26);
        goto L_0x0433;
    L_0x0371:
        if (r6 != r10) goto L_0x0391;
    L_0x0373:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x037c:
        if (r1 >= r2) goto L_0x0388;
    L_0x037e:
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r1, r7);
        r4 = r7.f8207b;
        r11.m26085a(r4);
        goto L_0x037c;
    L_0x0388:
        if (r1 != r2) goto L_0x038c;
    L_0x038a:
        goto L_0x0433;
    L_0x038c:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x0391:
        if (r6 != 0) goto L_0x0432;
    L_0x0393:
        r11 = (com.google.android.gms.internal.ads.lp) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r7);
        r8 = r7.f8207b;
        r11.m26085a(r8);
    L_0x039e:
        if (r1 >= r5) goto L_0x0433;
    L_0x03a0:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x03a8:
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r7);
        r8 = r7.f8207b;
        r11.m26085a(r8);
        goto L_0x039e;
    L_0x03b2:
        if (r6 != r10) goto L_0x03d1;
    L_0x03b4:
        r11 = (com.google.android.gms.internal.ads.le) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x03bd:
        if (r1 >= r2) goto L_0x03c9;
    L_0x03bf:
        r4 = com.google.android.gms.internal.ads.kh.m8971d(r3, r1);
        r11.m26073a(r4);
        r1 = r1 + 4;
        goto L_0x03bd;
    L_0x03c9:
        if (r1 != r2) goto L_0x03cc;
    L_0x03cb:
        goto L_0x0433;
    L_0x03cc:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x03d1:
        if (r6 != r9) goto L_0x0432;
    L_0x03d3:
        r11 = (com.google.android.gms.internal.ads.le) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8971d(r18, r19);
        r11.m26073a(r1);
        r1 = r4 + 4;
    L_0x03de:
        if (r1 >= r5) goto L_0x0433;
    L_0x03e0:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x03e8:
        r1 = com.google.android.gms.internal.ads.kh.m8971d(r3, r4);
        r11.m26073a(r1);
        r1 = r4 + 4;
        goto L_0x03de;
    L_0x03f2:
        if (r6 != r10) goto L_0x0411;
    L_0x03f4:
        r11 = (com.google.android.gms.internal.ads.kw) r11;
        r1 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r7);
        r2 = r7.f8206a;
        r2 = r2 + r1;
    L_0x03fd:
        if (r1 >= r2) goto L_0x0409;
    L_0x03ff:
        r4 = com.google.android.gms.internal.ads.kh.m8969c(r3, r1);
        r11.m26068a(r4);
        r1 = r1 + 8;
        goto L_0x03fd;
    L_0x0409:
        if (r1 != r2) goto L_0x040c;
    L_0x040b:
        goto L_0x0433;
    L_0x040c:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r1;
    L_0x0411:
        if (r6 != r13) goto L_0x0432;
    L_0x0413:
        r11 = (com.google.android.gms.internal.ads.kw) r11;
        r8 = com.google.android.gms.internal.ads.kh.m8969c(r18, r19);
        r11.m26068a(r8);
        r1 = r4 + 8;
    L_0x041e:
        if (r1 >= r5) goto L_0x0433;
    L_0x0420:
        r4 = com.google.android.gms.internal.ads.kh.m8965a(r3, r1, r7);
        r6 = r7.f8206a;
        if (r2 != r6) goto L_0x0433;
    L_0x0428:
        r8 = com.google.android.gms.internal.ads.kh.m8969c(r3, r4);
        r11.m26068a(r8);
        r1 = r4 + 8;
        goto L_0x041e;
    L_0x0432:
        r1 = r4;
    L_0x0433:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.ki):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final <K, V> int m20771a(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.ki r15) {
        /*
        r7 = this;
        r0 = f16542b;
        r12 = r7.m20791b(r12);
        r1 = r0.getObject(r8, r13);
        r2 = r7.f16559s;
        r2 = r2.mo2104c(r1);
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r2 = r7.f16559s;
        r2 = r2.mo2106e(r12);
        r3 = r7.f16559s;
        r3.mo2101a(r2, r1);
        r0.putObject(r8, r13, r2);
        r1 = r2;
    L_0x0021:
        r8 = r7.f16559s;
        r8 = r8.mo2107f(r12);
        r12 = r7.f16559s;
        r12 = r12.mo2102a(r1);
        r10 = com.google.android.gms.internal.ads.kh.m8965a(r9, r10, r15);
        r13 = r15.f8206a;
        if (r13 < 0) goto L_0x0094;
    L_0x0035:
        r14 = r11 - r10;
        if (r13 > r14) goto L_0x0094;
    L_0x0039:
        r13 = r13 + r10;
        r14 = r8.f8231b;
        r0 = r8.f8233d;
    L_0x003e:
        if (r10 >= r13) goto L_0x0089;
    L_0x0040:
        r1 = r10 + 1;
        r10 = r9[r10];
        if (r10 >= 0) goto L_0x004c;
    L_0x0046:
        r1 = com.google.android.gms.internal.ads.kh.m8963a(r10, r9, r1, r15);
        r10 = r15.f8206a;
    L_0x004c:
        r2 = r1;
        r1 = r10 >>> 3;
        r3 = r10 & 7;
        switch(r1) {
            case 1: goto L_0x006f;
            case 2: goto L_0x0055;
            default: goto L_0x0054;
        };
    L_0x0054:
        goto L_0x0084;
    L_0x0055:
        r1 = r8.f8232c;
        r1 = r1.m10384b();
        if (r3 != r1) goto L_0x0084;
    L_0x005d:
        r4 = r8.f8232c;
        r10 = r8.f8233d;
        r5 = r10.getClass();
        r1 = r9;
        r3 = r11;
        r6 = r15;
        r10 = m20773a(r1, r2, r3, r4, r5, r6);
        r0 = r15.f8208c;
        goto L_0x003e;
    L_0x006f:
        r1 = r8.f8230a;
        r1 = r1.m10384b();
        if (r3 != r1) goto L_0x0084;
    L_0x0077:
        r4 = r8.f8230a;
        r5 = 0;
        r1 = r9;
        r3 = r11;
        r6 = r15;
        r10 = m20773a(r1, r2, r3, r4, r5, r6);
        r14 = r15.f8208c;
        goto L_0x003e;
    L_0x0084:
        r10 = com.google.android.gms.internal.ads.kh.m8960a(r10, r9, r2, r11, r15);
        goto L_0x003e;
    L_0x0089:
        if (r10 != r13) goto L_0x008f;
    L_0x008b:
        r12.put(r14, r0);
        return r13;
    L_0x008f:
        r8 = com.google.android.gms.internal.ads.zzbdl.m10347h();
        throw r8;
    L_0x0094:
        r8 = com.google.android.gms.internal.ads.zzbdl.m10340a();
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.ki):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final int m20769a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.ki r29) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r2 = r21;
        r8 = r22;
        r5 = r23;
        r9 = r26;
        r6 = r28;
        r11 = r29;
        r12 = f16542b;
        r7 = r0.f16543c;
        r13 = r6 + 2;
        r7 = r7[r13];
        r13 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r7 = r7 & r13;
        r13 = (long) r7;
        r7 = 5;
        r15 = 2;
        switch(r25) {
            case 51: goto L_0x0191;
            case 52: goto L_0x0181;
            case 53: goto L_0x0171;
            case 54: goto L_0x0171;
            case 55: goto L_0x0161;
            case 56: goto L_0x0150;
            case 57: goto L_0x0140;
            case 58: goto L_0x0127;
            case 59: goto L_0x00f3;
            case 60: goto L_0x00c5;
            case 61: goto L_0x00b8;
            case 62: goto L_0x0161;
            case 63: goto L_0x008a;
            case 64: goto L_0x0140;
            case 65: goto L_0x0150;
            case 66: goto L_0x0075;
            case 67: goto L_0x0060;
            case 68: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x01a5;
    L_0x0028:
        r7 = 3;
        if (r5 != r7) goto L_0x01a5;
    L_0x002b:
        r2 = r2 & -8;
        r7 = r2 | 4;
        r2 = r0.m20775a(r6);
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r7;
        r7 = r29;
        r2 = m20766a(r2, r3, r4, r5, r6, r7);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x004b;
    L_0x0046:
        r15 = r12.getObject(r1, r9);
        goto L_0x004c;
    L_0x004b:
        r15 = 0;
    L_0x004c:
        if (r15 != 0) goto L_0x0055;
    L_0x004e:
        r3 = r11.f8208c;
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0055:
        r3 = r11.f8208c;
        r3 = com.google.android.gms.internal.ads.zzbdf.m10329a(r15, r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0060:
        if (r5 != 0) goto L_0x01a5;
    L_0x0062:
        r2 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r11);
        r3 = r11.f8207b;
        r3 = com.google.android.gms.internal.ads.zzbcf.m10279a(r3);
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0075:
        if (r5 != 0) goto L_0x01a5;
    L_0x0077:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r11);
        r3 = r11.f8206a;
        r3 = com.google.android.gms.internal.ads.zzbcf.m10282g(r3);
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x008a:
        if (r5 != 0) goto L_0x01a5;
    L_0x008c:
        r3 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r11);
        r4 = r11.f8206a;
        r5 = r0.m20797c(r6);
        if (r5 == 0) goto L_0x00ae;
    L_0x0098:
        r5 = r5.mo2158a(r4);
        if (r5 == 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00ae;
    L_0x009f:
        r1 = m20803e(r17);
        r4 = (long) r4;
        r4 = java.lang.Long.valueOf(r4);
        r1.m10376a(r2, r4);
        r2 = r3;
        goto L_0x01a6;
    L_0x00ae:
        r2 = java.lang.Integer.valueOf(r4);
        r12.putObject(r1, r9, r2);
        r2 = r3;
        goto L_0x01a1;
    L_0x00b8:
        if (r5 != r15) goto L_0x01a5;
    L_0x00ba:
        r2 = com.google.android.gms.internal.ads.kh.m8973e(r3, r4, r11);
        r3 = r11.f8208c;
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x00c5:
        if (r5 != r15) goto L_0x01a5;
    L_0x00c7:
        r2 = r0.m20775a(r6);
        r5 = r20;
        r2 = m20767a(r2, r3, r4, r5, r11);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x00dc;
    L_0x00d7:
        r15 = r12.getObject(r1, r9);
        goto L_0x00dd;
    L_0x00dc:
        r15 = 0;
    L_0x00dd:
        if (r15 != 0) goto L_0x00e5;
    L_0x00df:
        r3 = r11.f8208c;
        r12.putObject(r1, r9, r3);
        goto L_0x00ee;
    L_0x00e5:
        r3 = r11.f8208c;
        r3 = com.google.android.gms.internal.ads.zzbdf.m10329a(r15, r3);
        r12.putObject(r1, r9, r3);
    L_0x00ee:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x00f3:
        if (r5 != r15) goto L_0x01a5;
    L_0x00f5:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r11);
        r4 = r11.f8206a;
        if (r4 != 0) goto L_0x0103;
    L_0x00fd:
        r3 = "";
        r12.putObject(r1, r9, r3);
        goto L_0x0122;
    L_0x0103:
        r5 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r24 & r5;
        if (r5 == 0) goto L_0x0117;
    L_0x0109:
        r5 = r2 + r4;
        r5 = com.google.android.gms.internal.ads.ni.m9271a(r3, r2, r5);
        if (r5 == 0) goto L_0x0112;
    L_0x0111:
        goto L_0x0117;
    L_0x0112:
        r1 = com.google.android.gms.internal.ads.zzbdl.m10348i();
        throw r1;
    L_0x0117:
        r5 = new java.lang.String;
        r6 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r5.<init>(r3, r2, r4, r6);
        r12.putObject(r1, r9, r5);
        r2 = r2 + r4;
    L_0x0122:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x0127:
        if (r5 != 0) goto L_0x01a5;
    L_0x0129:
        r2 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r11);
        r3 = r11.f8207b;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0137;
    L_0x0135:
        r15 = 1;
        goto L_0x0138;
    L_0x0137:
        r15 = 0;
    L_0x0138:
        r3 = java.lang.Boolean.valueOf(r15);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0140:
        if (r5 != r7) goto L_0x01a5;
    L_0x0142:
        r2 = com.google.android.gms.internal.ads.kh.m8964a(r18, r19);
        r2 = java.lang.Integer.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
        goto L_0x01a1;
    L_0x0150:
        r2 = 1;
        if (r5 != r2) goto L_0x01a5;
    L_0x0153:
        r2 = com.google.android.gms.internal.ads.kh.m8968b(r18, r19);
        r2 = java.lang.Long.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
        goto L_0x01a1;
    L_0x0161:
        if (r5 != 0) goto L_0x01a5;
    L_0x0163:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r3, r4, r11);
        r3 = r11.f8206a;
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0171:
        if (r5 != 0) goto L_0x01a5;
    L_0x0173:
        r2 = com.google.android.gms.internal.ads.kh.m8967b(r3, r4, r11);
        r3 = r11.f8207b;
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        goto L_0x01a1;
    L_0x0181:
        if (r5 != r7) goto L_0x01a5;
    L_0x0183:
        r2 = com.google.android.gms.internal.ads.kh.m8971d(r18, r19);
        r2 = java.lang.Float.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
        goto L_0x01a1;
    L_0x0191:
        r2 = 1;
        if (r5 != r2) goto L_0x01a5;
    L_0x0194:
        r2 = com.google.android.gms.internal.ads.kh.m8969c(r18, r19);
        r2 = java.lang.Double.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
    L_0x01a1:
        r12.putInt(r1, r13, r8);
        goto L_0x01a6;
    L_0x01a5:
        r2 = r4;
    L_0x01a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.ki):int");
    }

    /* renamed from: a */
    private final ml m20775a(int i) {
        i = (i / 3) << 1;
        ml mlVar = (ml) this.f16544d[i];
        if (mlVar != null) {
            return mlVar;
        }
        mlVar = mh.m9048a().m9050a((Class) this.f16544d[i + 1]);
        this.f16544d[i] = mlVar;
        return mlVar;
    }

    /* renamed from: b */
    private final Object m20791b(int i) {
        return this.f16544d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final zzbdi m20797c(int i) {
        return (zzbdi) this.f16544d[((i / 3) << 1) + 1];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final int m20772a(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.ads.ki r36) {
        /*
        r30 = this;
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r10 = f16542b;
        r16 = 0;
        r0 = r33;
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r6 = 0;
        r7 = -1;
    L_0x0017:
        if (r0 >= r13) goto L_0x0404;
    L_0x0019:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0028;
    L_0x001f:
        r0 = com.google.android.gms.internal.ads.kh.m8963a(r0, r12, r3, r9);
        r3 = r9.f8206a;
        r4 = r0;
        r5 = r3;
        goto L_0x002a;
    L_0x0028:
        r5 = r0;
        r4 = r3;
    L_0x002a:
        r3 = r5 >>> 3;
        r0 = r5 & 7;
        r8 = 3;
        if (r3 <= r1) goto L_0x0039;
    L_0x0031:
        r2 = r2 / r8;
        r1 = r15.m20763a(r3, r2);
    L_0x0036:
        r2 = r1;
        r1 = -1;
        goto L_0x003e;
    L_0x0039:
        r1 = r15.m20806g(r3);
        goto L_0x0036;
    L_0x003e:
        if (r2 != r1) goto L_0x004f;
    L_0x0040:
        r17 = r3;
        r2 = r4;
        r20 = r6;
        r25 = r7;
        r28 = r10;
        r6 = r11;
        r19 = 0;
        r7 = r5;
        goto L_0x03c5;
    L_0x004f:
        r1 = r15.f16543c;
        r18 = r2 + 1;
        r1 = r1[r18];
        r18 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r18 = r1 & r18;
        r8 = r18 >>> 20;
        r18 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r20 = r5;
        r5 = r1 & r18;
        r11 = (long) r5;
        r5 = 17;
        r21 = r1;
        if (r8 > r5) goto L_0x02c7;
    L_0x0069:
        r5 = r15.f16543c;
        r22 = r2 + 2;
        r5 = r5[r22];
        r22 = r5 >>> 20;
        r1 = 1;
        r22 = r1 << r22;
        r5 = r5 & r18;
        if (r5 == r7) goto L_0x008c;
    L_0x0078:
        r13 = -1;
        if (r7 == r13) goto L_0x0082;
    L_0x007b:
        r24 = r2;
        r1 = (long) r7;
        r10.putInt(r14, r1, r6);
        goto L_0x0084;
    L_0x0082:
        r24 = r2;
    L_0x0084:
        r1 = (long) r5;
        r1 = r10.getInt(r14, r1);
        r6 = r1;
        r7 = r5;
        goto L_0x008f;
    L_0x008c:
        r24 = r2;
        r13 = -1;
    L_0x008f:
        r1 = 5;
        switch(r8) {
            case 0: goto L_0x0297;
            case 1: goto L_0x027d;
            case 2: goto L_0x025e;
            case 3: goto L_0x025e;
            case 4: goto L_0x0244;
            case 5: goto L_0x021e;
            case 6: goto L_0x01fb;
            case 7: goto L_0x01d7;
            case 8: goto L_0x01b0;
            case 9: goto L_0x0177;
            case 10: goto L_0x015b;
            case 11: goto L_0x0244;
            case 12: goto L_0x0128;
            case 13: goto L_0x01fb;
            case 14: goto L_0x021e;
            case 15: goto L_0x010c;
            case 16: goto L_0x00e9;
            case 17: goto L_0x00a0;
            default: goto L_0x0093;
        };
    L_0x0093:
        r17 = r3;
        r11 = r4;
        r13 = r20;
        r8 = r24;
    L_0x009a:
        r12 = r32;
    L_0x009c:
        r18 = -1;
        goto L_0x02bb;
    L_0x00a0:
        r2 = 3;
        if (r0 != r2) goto L_0x00e1;
    L_0x00a3:
        r0 = r3 << 3;
        r5 = r0 | 4;
        r2 = r24;
        r0 = r15.m20775a(r2);
        r1 = r32;
        r8 = r2;
        r2 = r4;
        r17 = r3;
        r3 = r34;
        r4 = r5;
        r13 = r20;
        r5 = r36;
        r0 = m20766a(r0, r1, r2, r3, r4, r5);
        r1 = r6 & r22;
        if (r1 != 0) goto L_0x00c8;
    L_0x00c2:
        r1 = r9.f8208c;
        r10.putObject(r14, r11, r1);
        goto L_0x00d5;
    L_0x00c8:
        r1 = r10.getObject(r14, r11);
        r2 = r9.f8208c;
        r1 = com.google.android.gms.internal.ads.zzbdf.m10329a(r1, r2);
        r10.putObject(r14, r11, r1);
    L_0x00d5:
        r6 = r6 | r22;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r11 = r35;
        r12 = r32;
        goto L_0x02b7;
    L_0x00e1:
        r17 = r3;
        r13 = r20;
        r8 = r24;
        r11 = r4;
        goto L_0x009a;
    L_0x00e9:
        r17 = r3;
        r13 = r20;
        r8 = r24;
        if (r0 != 0) goto L_0x0108;
    L_0x00f1:
        r2 = r11;
        r12 = r32;
        r11 = com.google.android.gms.internal.ads.kh.m8967b(r12, r4, r9);
        r0 = r9.f8207b;
        r4 = com.google.android.gms.internal.ads.zzbcf.m10279a(r0);
        r0 = r10;
        r1 = r31;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r22;
        goto L_0x027a;
    L_0x0108:
        r12 = r32;
        goto L_0x0174;
    L_0x010c:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r12 = r32;
        if (r0 != 0) goto L_0x0174;
    L_0x0117:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r4, r9);
        r1 = r9.f8206a;
        r1 = com.google.android.gms.internal.ads.zzbcf.m10282g(r1);
        r10.putInt(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x0128:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r12 = r32;
        if (r0 != 0) goto L_0x0174;
    L_0x0133:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r4, r9);
        r1 = r9.f8206a;
        r4 = r15.m20797c(r8);
        if (r4 == 0) goto L_0x0154;
    L_0x013f:
        r4 = r4.mo2158a(r1);
        if (r4 == 0) goto L_0x0146;
    L_0x0145:
        goto L_0x0154;
    L_0x0146:
        r2 = m20803e(r31);
        r3 = (long) r1;
        r1 = java.lang.Long.valueOf(r3);
        r2.m10376a(r13, r1);
        goto L_0x02b1;
    L_0x0154:
        r10.putInt(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x015b:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r1 = 2;
        r12 = r32;
        if (r0 != r1) goto L_0x0174;
    L_0x0167:
        r0 = com.google.android.gms.internal.ads.kh.m8973e(r12, r4, r9);
        r1 = r9.f8208c;
        r10.putObject(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x0174:
        r11 = r4;
        goto L_0x009c;
    L_0x0177:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r1 = 2;
        r12 = r32;
        if (r0 != r1) goto L_0x01aa;
    L_0x0183:
        r0 = r15.m20775a(r8);
        r11 = r34;
        r18 = -1;
        r0 = m20767a(r0, r12, r4, r11, r9);
        r1 = r6 & r22;
        if (r1 != 0) goto L_0x0199;
    L_0x0193:
        r1 = r9.f8208c;
        r10.putObject(r14, r2, r1);
        goto L_0x01a6;
    L_0x0199:
        r1 = r10.getObject(r14, r2);
        r4 = r9.f8208c;
        r1 = com.google.android.gms.internal.ads.zzbdf.m10329a(r1, r4);
        r10.putObject(r14, r2, r1);
    L_0x01a6:
        r6 = r6 | r22;
        goto L_0x0215;
    L_0x01aa:
        r11 = r34;
        r18 = -1;
        goto L_0x0241;
    L_0x01b0:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r1 = 2;
        r11 = r34;
        r12 = r32;
        r18 = -1;
        if (r0 != r1) goto L_0x0241;
    L_0x01c0:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r21 & r0;
        if (r0 != 0) goto L_0x01cb;
    L_0x01c6:
        r0 = com.google.android.gms.internal.ads.kh.m8970c(r12, r4, r9);
        goto L_0x01cf;
    L_0x01cb:
        r0 = com.google.android.gms.internal.ads.kh.m8972d(r12, r4, r9);
    L_0x01cf:
        r1 = r9.f8208c;
        r10.putObject(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x0215;
    L_0x01d7:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r11 = r34;
        r12 = r32;
        r18 = -1;
        if (r0 != 0) goto L_0x0241;
    L_0x01e6:
        r0 = com.google.android.gms.internal.ads.kh.m8967b(r12, r4, r9);
        r4 = r9.f8207b;
        r19 = 0;
        r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1));
        if (r1 == 0) goto L_0x01f4;
    L_0x01f2:
        r1 = 1;
        goto L_0x01f5;
    L_0x01f4:
        r1 = 0;
    L_0x01f5:
        com.google.android.gms.internal.ads.ng.m9231a(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x0215;
    L_0x01fb:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r11 = r34;
        r12 = r32;
        r18 = -1;
        if (r0 != r1) goto L_0x0241;
    L_0x020a:
        r0 = com.google.android.gms.internal.ads.kh.m8964a(r12, r4);
        r10.putInt(r14, r2, r0);
        r0 = r4 + 4;
        r6 = r6 | r22;
    L_0x0215:
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
        r11 = r35;
        goto L_0x0017;
    L_0x021e:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r1 = 1;
        r11 = r34;
        r12 = r32;
        r18 = -1;
        if (r0 != r1) goto L_0x0241;
    L_0x022e:
        r19 = com.google.android.gms.internal.ads.kh.m8968b(r12, r4);
        r0 = r10;
        r1 = r31;
        r11 = r4;
        r4 = r19;
        r0.putLong(r1, r2, r4);
        r0 = r11 + 8;
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x0241:
        r11 = r4;
        goto L_0x02bb;
    L_0x0244:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r12 = r32;
        r18 = -1;
        r11 = r4;
        if (r0 != 0) goto L_0x02bb;
    L_0x0252:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r11, r9);
        r1 = r9.f8206a;
        r10.putInt(r14, r2, r1);
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x025e:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r12 = r32;
        r18 = -1;
        r11 = r4;
        if (r0 != 0) goto L_0x02bb;
    L_0x026c:
        r11 = com.google.android.gms.internal.ads.kh.m8967b(r12, r11, r9);
        r4 = r9.f8207b;
        r0 = r10;
        r1 = r31;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r22;
    L_0x027a:
        r2 = r8;
        r0 = r11;
        goto L_0x02b2;
    L_0x027d:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r12 = r32;
        r18 = -1;
        r11 = r4;
        if (r0 != r1) goto L_0x02bb;
    L_0x028b:
        r0 = com.google.android.gms.internal.ads.kh.m8971d(r12, r11);
        com.google.android.gms.internal.ads.ng.m9227a(r14, r2, r0);
        r0 = r11 + 4;
        r6 = r6 | r22;
        goto L_0x02b1;
    L_0x0297:
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r8 = r24;
        r1 = 1;
        r12 = r32;
        r18 = -1;
        r11 = r4;
        if (r0 != r1) goto L_0x02bb;
    L_0x02a6:
        r0 = com.google.android.gms.internal.ads.kh.m8969c(r12, r11);
        com.google.android.gms.internal.ads.ng.m9226a(r14, r2, r0);
        r0 = r11 + 8;
        r6 = r6 | r22;
    L_0x02b1:
        r2 = r8;
    L_0x02b2:
        r3 = r13;
        r1 = r17;
    L_0x02b5:
        r11 = r35;
    L_0x02b7:
        r13 = r34;
        goto L_0x0017;
    L_0x02bb:
        r20 = r6;
        r25 = r7;
        r19 = r8;
        r28 = r10;
        r2 = r11;
        r7 = r13;
        goto L_0x03a5;
    L_0x02c7:
        r5 = r2;
        r17 = r3;
        r2 = r11;
        r13 = r20;
        r12 = r32;
        r18 = -1;
        r11 = r4;
        r1 = 27;
        if (r8 != r1) goto L_0x0322;
    L_0x02d6:
        r1 = 2;
        if (r0 != r1) goto L_0x0315;
    L_0x02d9:
        r0 = r10.getObject(r14, r2);
        r0 = (com.google.android.gms.internal.ads.zzbdk) r0;
        r1 = r0.mo1969a();
        if (r1 != 0) goto L_0x02f7;
    L_0x02e5:
        r1 = r0.size();
        if (r1 != 0) goto L_0x02ee;
    L_0x02eb:
        r1 = 10;
        goto L_0x02f0;
    L_0x02ee:
        r1 = r1 << 1;
    L_0x02f0:
        r0 = r0.mo4159a(r1);
        r10.putObject(r14, r2, r0);
    L_0x02f7:
        r8 = r0;
        r0 = r15.m20775a(r5);
        r1 = r13;
        r2 = r32;
        r3 = r11;
        r4 = r34;
        r19 = r5;
        r5 = r8;
        r20 = r6;
        r6 = r36;
        r0 = m20765a(r0, r1, r2, r3, r4, r5, r6);
        r3 = r13;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        goto L_0x02b5;
    L_0x0315:
        r19 = r5;
        r20 = r6;
        r25 = r7;
        r28 = r10;
        r15 = r11;
        r29 = r13;
        goto L_0x03a2;
    L_0x0322:
        r19 = r5;
        r20 = r6;
        r1 = 49;
        if (r8 > r1) goto L_0x0372;
    L_0x032a:
        r1 = r21;
        r5 = (long) r1;
        r4 = r0;
        r0 = r30;
        r1 = r31;
        r21 = r2;
        r2 = r32;
        r3 = r11;
        r26 = r4;
        r4 = r34;
        r23 = r5;
        r5 = r13;
        r6 = r17;
        r25 = r7;
        r7 = r26;
        r27 = r8;
        r15 = -1;
        r8 = r19;
        r28 = r10;
        r9 = r23;
        r15 = r11;
        r11 = r27;
        r29 = r13;
        r12 = r21;
        r14 = r36;
        r0 = r0.m20770a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x035e;
    L_0x035c:
        r2 = r0;
        goto L_0x03a3;
    L_0x035e:
        r12 = r32;
        r9 = r36;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        r7 = r25;
        r10 = r28;
        r3 = r29;
    L_0x036e:
        r11 = r35;
        goto L_0x03e9;
    L_0x0372:
        r26 = r0;
        r25 = r7;
        r27 = r8;
        r28 = r10;
        r15 = r11;
        r29 = r13;
        r1 = r21;
        r21 = r2;
        r0 = 50;
        r9 = r27;
        if (r9 != r0) goto L_0x03a8;
    L_0x0387:
        r7 = r26;
        r0 = 2;
        if (r7 != r0) goto L_0x03a2;
    L_0x038c:
        r0 = r30;
        r1 = r31;
        r2 = r32;
        r3 = r15;
        r4 = r34;
        r5 = r19;
        r6 = r21;
        r8 = r36;
        r0 = r0.m20771a(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x035e;
    L_0x03a1:
        goto L_0x035c;
    L_0x03a2:
        r2 = r15;
    L_0x03a3:
        r7 = r29;
    L_0x03a5:
        r6 = r35;
        goto L_0x03c5;
    L_0x03a8:
        r7 = r26;
        r0 = r30;
        r8 = r1;
        r1 = r31;
        r2 = r32;
        r3 = r15;
        r4 = r34;
        r5 = r29;
        r6 = r17;
        r10 = r21;
        r12 = r19;
        r13 = r36;
        r0 = r0.m20769a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x03f1;
    L_0x03c4:
        goto L_0x035c;
    L_0x03c5:
        if (r7 != r6) goto L_0x03cc;
    L_0x03c7:
        if (r6 != 0) goto L_0x03ca;
    L_0x03c9:
        goto L_0x03cc;
    L_0x03ca:
        r3 = r7;
        goto L_0x040c;
    L_0x03cc:
        r0 = r7;
        r1 = r32;
        r3 = r34;
        r4 = r31;
        r5 = r36;
        r0 = m20764a(r0, r1, r2, r3, r4, r5);
        r12 = r32;
        r9 = r36;
        r11 = r6;
        r3 = r7;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        r7 = r25;
        r10 = r28;
    L_0x03e9:
        r13 = r34;
        r14 = r31;
        r15 = r30;
        goto L_0x0017;
    L_0x03f1:
        r7 = r29;
        r12 = r32;
        r9 = r36;
        r3 = r7;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        r7 = r25;
        r10 = r28;
        goto L_0x036e;
    L_0x0404:
        r20 = r6;
        r25 = r7;
        r28 = r10;
        r6 = r11;
        r2 = r0;
    L_0x040c:
        r1 = r20;
        r0 = r25;
        r4 = -1;
        if (r0 == r4) goto L_0x041c;
    L_0x0413:
        r4 = (long) r0;
        r7 = r28;
        r0 = r31;
        r7.putInt(r0, r4, r1);
        goto L_0x041e;
    L_0x041c:
        r0 = r31;
    L_0x041e:
        r1 = 0;
        r4 = r30;
        r5 = r4.f16553m;
    L_0x0423:
        r7 = r4.f16554n;
        if (r5 >= r7) goto L_0x0436;
    L_0x0427:
        r7 = r4.f16552l;
        r7 = r7[r5];
        r8 = r4.f16557q;
        r1 = r4.m20777a(r0, r7, r1, r8);
        r1 = (com.google.android.gms.internal.ads.zzbfv) r1;
        r5 = r5 + 1;
        goto L_0x0423;
    L_0x0436:
        if (r1 == 0) goto L_0x043d;
    L_0x0438:
        r5 = r4.f16557q;
        r5.mo2138b(r0, r1);
    L_0x043d:
        if (r6 != 0) goto L_0x0449;
    L_0x043f:
        r0 = r34;
        if (r2 != r0) goto L_0x0444;
    L_0x0443:
        goto L_0x044f;
    L_0x0444:
        r0 = com.google.android.gms.internal.ads.zzbdl.m10347h();
        throw r0;
    L_0x0449:
        r0 = r34;
        if (r2 > r0) goto L_0x0450;
    L_0x044d:
        if (r3 != r6) goto L_0x0450;
    L_0x044f:
        return r2;
    L_0x0450:
        r0 = com.google.android.gms.internal.ads.zzbdl.m10347h();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ki):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2112a(T r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.ads.ki r33) {
        /*
        r28 = this;
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r0 = r15.f16550j;
        if (r0 == 0) goto L_0x025e;
    L_0x000e:
        r9 = f16542b;
        r10 = -1;
        r16 = 0;
        r0 = r31;
        r1 = -1;
        r2 = 0;
    L_0x0017:
        if (r0 >= r13) goto L_0x0255;
    L_0x0019:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x0029;
    L_0x001f:
        r0 = com.google.android.gms.internal.ads.kh.m8963a(r0, r12, r3, r11);
        r3 = r11.f8206a;
        r8 = r0;
        r17 = r3;
        goto L_0x002c;
    L_0x0029:
        r17 = r0;
        r8 = r3;
    L_0x002c:
        r7 = r17 >>> 3;
        r6 = r17 & 7;
        if (r7 <= r1) goto L_0x003a;
    L_0x0032:
        r2 = r2 / 3;
        r0 = r15.m20763a(r7, r2);
    L_0x0038:
        r4 = r0;
        goto L_0x003f;
    L_0x003a:
        r0 = r15.m20806g(r7);
        goto L_0x0038;
    L_0x003f:
        if (r4 != r10) goto L_0x004c;
    L_0x0041:
        r25 = r7;
        r2 = r8;
        r18 = r9;
        r19 = 0;
        r27 = -1;
        goto L_0x0234;
    L_0x004c:
        r0 = r15.f16543c;
        r1 = r4 + 1;
        r5 = r0[r1];
        r0 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r0 = r0 & r5;
        r3 = r0 >>> 20;
        r0 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r0 = r0 & r5;
        r1 = (long) r0;
        r0 = 17;
        r10 = 2;
        if (r3 > r0) goto L_0x0175;
    L_0x0061:
        r0 = 1;
        switch(r3) {
            case 0: goto L_0x015a;
            case 1: goto L_0x014b;
            case 2: goto L_0x0139;
            case 3: goto L_0x0139;
            case 4: goto L_0x012b;
            case 5: goto L_0x0119;
            case 6: goto L_0x0108;
            case 7: goto L_0x00f2;
            case 8: goto L_0x00db;
            case 9: goto L_0x00ba;
            case 10: goto L_0x00ad;
            case 11: goto L_0x012b;
            case 12: goto L_0x009e;
            case 13: goto L_0x0108;
            case 14: goto L_0x0119;
            case 15: goto L_0x008b;
            case 16: goto L_0x0070;
            default: goto L_0x0065;
        };
    L_0x0065:
        r19 = r4;
        r25 = r7;
        r15 = r8;
        r18 = r9;
    L_0x006c:
        r27 = -1;
        goto L_0x0215;
    L_0x0070:
        if (r6 != 0) goto L_0x0065;
    L_0x0072:
        r6 = com.google.android.gms.internal.ads.kh.m8967b(r12, r8, r11);
        r20 = r1;
        r0 = r11.f8207b;
        r22 = com.google.android.gms.internal.ads.zzbcf.m10279a(r0);
        r0 = r9;
        r2 = r20;
        r1 = r29;
        r10 = r4;
        r4 = r22;
        r0.putLong(r1, r2, r4);
        goto L_0x0149;
    L_0x008b:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x016c;
    L_0x008f:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r8, r11);
        r1 = r11.f8206a;
        r1 = com.google.android.gms.internal.ads.zzbcf.m10282g(r1);
        r9.putInt(r14, r2, r1);
        goto L_0x0167;
    L_0x009e:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x016c;
    L_0x00a2:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r8, r11);
        r1 = r11.f8206a;
        r9.putInt(r14, r2, r1);
        goto L_0x0167;
    L_0x00ad:
        r2 = r1;
        if (r6 != r10) goto L_0x0065;
    L_0x00b0:
        r0 = com.google.android.gms.internal.ads.kh.m8973e(r12, r8, r11);
        r1 = r11.f8208c;
        r9.putObject(r14, r2, r1);
        goto L_0x0115;
    L_0x00ba:
        r2 = r1;
        if (r6 != r10) goto L_0x0065;
    L_0x00bd:
        r0 = r15.m20775a(r4);
        r0 = m20767a(r0, r12, r8, r13, r11);
        r1 = r9.getObject(r14, r2);
        if (r1 != 0) goto L_0x00d1;
    L_0x00cb:
        r1 = r11.f8208c;
        r9.putObject(r14, r2, r1);
        goto L_0x0115;
    L_0x00d1:
        r5 = r11.f8208c;
        r1 = com.google.android.gms.internal.ads.zzbdf.m10329a(r1, r5);
        r9.putObject(r14, r2, r1);
        goto L_0x0115;
    L_0x00db:
        r2 = r1;
        if (r6 != r10) goto L_0x0065;
    L_0x00de:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r5;
        if (r0 != 0) goto L_0x00e8;
    L_0x00e3:
        r0 = com.google.android.gms.internal.ads.kh.m8970c(r12, r8, r11);
        goto L_0x00ec;
    L_0x00e8:
        r0 = com.google.android.gms.internal.ads.kh.m8972d(r12, r8, r11);
    L_0x00ec:
        r1 = r11.f8208c;
        r9.putObject(r14, r2, r1);
        goto L_0x0115;
    L_0x00f2:
        r2 = r1;
        if (r6 != 0) goto L_0x0065;
    L_0x00f5:
        r1 = com.google.android.gms.internal.ads.kh.m8967b(r12, r8, r11);
        r5 = r11.f8207b;
        r19 = 0;
        r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1));
        if (r8 == 0) goto L_0x0102;
    L_0x0101:
        goto L_0x0103;
    L_0x0102:
        r0 = 0;
    L_0x0103:
        com.google.android.gms.internal.ads.ng.m9231a(r14, r2, r0);
        r0 = r1;
        goto L_0x0115;
    L_0x0108:
        r2 = r1;
        r0 = 5;
        if (r6 != r0) goto L_0x0065;
    L_0x010c:
        r0 = com.google.android.gms.internal.ads.kh.m8964a(r12, r8);
        r9.putInt(r14, r2, r0);
        r0 = r8 + 4;
    L_0x0115:
        r2 = r4;
        r1 = r7;
        goto L_0x0169;
    L_0x0119:
        r2 = r1;
        if (r6 != r0) goto L_0x0065;
    L_0x011c:
        r5 = com.google.android.gms.internal.ads.kh.m8968b(r12, r8);
        r0 = r9;
        r1 = r29;
        r10 = r4;
        r4 = r5;
        r0.putLong(r1, r2, r4);
        r0 = r8 + 8;
        goto L_0x0167;
    L_0x012b:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x016c;
    L_0x012f:
        r0 = com.google.android.gms.internal.ads.kh.m8965a(r12, r8, r11);
        r1 = r11.f8206a;
        r9.putInt(r14, r2, r1);
        goto L_0x0167;
    L_0x0139:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x016c;
    L_0x013d:
        r6 = com.google.android.gms.internal.ads.kh.m8967b(r12, r8, r11);
        r4 = r11.f8207b;
        r0 = r9;
        r1 = r29;
        r0.putLong(r1, r2, r4);
    L_0x0149:
        r0 = r6;
        goto L_0x0167;
    L_0x014b:
        r2 = r1;
        r10 = r4;
        r0 = 5;
        if (r6 != r0) goto L_0x016c;
    L_0x0150:
        r0 = com.google.android.gms.internal.ads.kh.m8971d(r12, r8);
        com.google.android.gms.internal.ads.ng.m9227a(r14, r2, r0);
        r0 = r8 + 4;
        goto L_0x0167;
    L_0x015a:
        r2 = r1;
        r10 = r4;
        if (r6 != r0) goto L_0x016c;
    L_0x015e:
        r0 = com.google.android.gms.internal.ads.kh.m8969c(r12, r8);
        com.google.android.gms.internal.ads.ng.m9226a(r14, r2, r0);
        r0 = r8 + 8;
    L_0x0167:
        r1 = r7;
        r2 = r10;
    L_0x0169:
        r10 = -1;
        goto L_0x0017;
    L_0x016c:
        r25 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
        goto L_0x006c;
    L_0x0175:
        r0 = 27;
        if (r3 != r0) goto L_0x01b1;
    L_0x0179:
        if (r6 != r10) goto L_0x0065;
    L_0x017b:
        r0 = r9.getObject(r14, r1);
        r0 = (com.google.android.gms.internal.ads.zzbdk) r0;
        r3 = r0.mo1969a();
        if (r3 != 0) goto L_0x0199;
    L_0x0187:
        r3 = r0.size();
        if (r3 != 0) goto L_0x0190;
    L_0x018d:
        r3 = 10;
        goto L_0x0192;
    L_0x0190:
        r3 = r3 << 1;
    L_0x0192:
        r0 = r0.mo4159a(r3);
        r9.putObject(r14, r1, r0);
    L_0x0199:
        r5 = r0;
        r0 = r15.m20775a(r4);
        r1 = r17;
        r2 = r30;
        r3 = r8;
        r19 = r4;
        r4 = r32;
        r6 = r33;
        r0 = m20765a(r0, r1, r2, r3, r4, r5, r6);
        r1 = r7;
        r2 = r19;
        goto L_0x0169;
    L_0x01b1:
        r19 = r4;
        r0 = 49;
        if (r3 > r0) goto L_0x01e8;
    L_0x01b7:
        r4 = (long) r5;
        r0 = r28;
        r20 = r1;
        r1 = r29;
        r2 = r30;
        r10 = r3;
        r3 = r8;
        r22 = r4;
        r4 = r32;
        r5 = r17;
        r24 = r6;
        r6 = r7;
        r25 = r7;
        r7 = r24;
        r15 = r8;
        r8 = r19;
        r18 = r9;
        r26 = r10;
        r27 = -1;
        r9 = r22;
        r11 = r26;
        r12 = r20;
        r14 = r33;
        r0 = r0.m20770a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x0242;
    L_0x01e6:
        r2 = r0;
        goto L_0x0234;
    L_0x01e8:
        r20 = r1;
        r26 = r3;
        r24 = r6;
        r25 = r7;
        r15 = r8;
        r18 = r9;
        r27 = -1;
        r0 = 50;
        r9 = r26;
        if (r9 != r0) goto L_0x0217;
    L_0x01fb:
        r7 = r24;
        if (r7 != r10) goto L_0x0215;
    L_0x01ff:
        r0 = r28;
        r1 = r29;
        r2 = r30;
        r3 = r15;
        r4 = r32;
        r5 = r19;
        r6 = r20;
        r8 = r33;
        r0 = r0.m20771a(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x0242;
    L_0x0214:
        goto L_0x01e6;
    L_0x0215:
        r2 = r15;
        goto L_0x0234;
    L_0x0217:
        r7 = r24;
        r0 = r28;
        r1 = r29;
        r2 = r30;
        r3 = r15;
        r4 = r32;
        r8 = r5;
        r5 = r17;
        r6 = r25;
        r10 = r20;
        r12 = r19;
        r13 = r33;
        r0 = r0.m20769a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x0242;
    L_0x0233:
        goto L_0x01e6;
    L_0x0234:
        r0 = r17;
        r1 = r30;
        r3 = r32;
        r4 = r29;
        r5 = r33;
        r0 = m20764a(r0, r1, r2, r3, r4, r5);
    L_0x0242:
        r14 = r29;
        r12 = r30;
        r11 = r33;
        r9 = r18;
        r2 = r19;
        r1 = r25;
        r10 = -1;
        r13 = r32;
        r15 = r28;
        goto L_0x0017;
    L_0x0255:
        r4 = r13;
        if (r0 != r4) goto L_0x0259;
    L_0x0258:
        return;
    L_0x0259:
        r0 = com.google.android.gms.internal.ads.zzbdl.m10347h();
        throw r0;
    L_0x025e:
        r4 = r13;
        r5 = 0;
        r0 = r28;
        r1 = r29;
        r2 = r30;
        r3 = r31;
        r4 = r32;
        r6 = r33;
        r0.m20772a(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ma.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.ki):void");
    }

    /* renamed from: c */
    public final void mo2116c(T t) {
        int i;
        for (i = this.f16553m; i < this.f16554n; i++) {
            long d = (long) (m20799d(this.f16552l[i]) & 1048575);
            Object f = ng.m9252f(t, d);
            if (f != null) {
                ng.m9230a((Object) t, d, this.f16559s.mo2105d(f));
            }
        }
        i = this.f16552l.length;
        for (int i2 = this.f16554n; i2 < i; i2++) {
            this.f16556p.mo2098b(t, (long) this.f16552l[i2]);
        }
        this.f16557q.mo2141d(t);
        if (this.f16548h) {
            this.f16558r.mo2093c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m20777a(Object obj, int i, UB ub, nc<UT, UB> ncVar) {
        int i2 = this.f16543c[i];
        obj = ng.m9252f(obj, (long) (m20799d(i) & 1048575));
        if (obj == null) {
            return ub;
        }
        zzbdi c = m20797c(i);
        if (c == null) {
            return ub;
        }
        return m20776a(i, i2, this.f16559s.mo2102a(obj), c, (Object) ub, (nc) ncVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m20776a(int i, int i2, Map<K, V> map, zzbdi zzbdi, UB ub, nc<UT, UB> ncVar) {
        i = this.f16559s.mo2107f(m20791b(i));
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (!zzbdi.mo2158a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = ncVar.mo2126a();
                }
                ko b = zzbbu.m10264b(zzbed.m10359a(i, entry.getKey(), entry.getValue()));
                try {
                    zzbed.m10360a(b.m8976b(), i, entry.getKey(), entry.getValue());
                    ncVar.mo2130a((Object) ub, i2, b.m8975a());
                    map.remove();
                } catch (int i3) {
                    throw new RuntimeException(i3);
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public final boolean mo2117d(T t) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f16553m) {
                return (this.f16548h && this.f16558r.mo2084a((Object) t).m9013g() == null) ? false : true;
            } else {
                int i4;
                int i5;
                int i6 = this.f16552l[i];
                int i7 = this.f16543c[i6];
                int d = m20799d(i6);
                if (this.f16550j) {
                    i4 = 0;
                } else {
                    i4 = this.f16543c[i6 + 2];
                    i5 = i4 & 1048575;
                    i4 = 1 << (i4 >>> 20);
                    if (i5 != i2) {
                        i3 = f16542b.getInt(t, (long) i5);
                        i2 = i5;
                    }
                }
                if (((268435456 & d) != 0 ? 1 : null) != null && !m20787a((Object) t, i6, i3, i4)) {
                    return false;
                }
                i5 = (267386880 & d) >>> 20;
                if (i5 != 9 && i5 != 17) {
                    ml mlVar;
                    if (i5 != 27) {
                        if (i5 != 60 && i5 != 68) {
                            switch (i5) {
                                case 49:
                                    break;
                                case 50:
                                    Map b = this.f16559s.mo2103b(ng.m9252f(t, (long) (d & 1048575)));
                                    if (!b.isEmpty()) {
                                        if (this.f16559s.mo2107f(m20791b(i6)).f8232c.m10383a() == zzbgo.MESSAGE) {
                                            mlVar = null;
                                            for (Object next : b.values()) {
                                                if (mlVar == null) {
                                                    mlVar = mh.m9048a().m9050a(next.getClass());
                                                }
                                                if (!mlVar.mo2117d(next)) {
                                                    z = false;
                                                }
                                            }
                                        }
                                    }
                                    if (!z) {
                                        return false;
                                    }
                                    continue;
                                default:
                                    continue;
                            }
                        } else if (m20786a((Object) t, i7, i6) && !m20788a((Object) t, d, m20775a(i6))) {
                            return false;
                        }
                    }
                    List list = (List) ng.m9252f(t, (long) (d & 1048575));
                    if (!list.isEmpty()) {
                        mlVar = m20775a(i6);
                        d = 0;
                        while (d < list.size()) {
                            if (mlVar.mo2117d(list.get(d))) {
                                d++;
                            } else {
                                z = false;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else if (m20787a((Object) t, i6, i3, i4) && !m20788a((Object) t, d, m20775a(i6))) {
                    return false;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private static boolean m20788a(Object obj, int i, ml mlVar) {
        return mlVar.mo2117d(ng.m9252f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m20780a(int i, Object obj, no noVar) {
        if (obj instanceof String) {
            noVar.mo2052a(i, (String) obj);
        } else {
            noVar.mo2049a(i, (zzbbu) obj);
        }
    }

    /* renamed from: a */
    private final void m20783a(Object obj, int i, mk mkVar) {
        if (m20804f(i)) {
            ng.m9230a(obj, (long) (i & 1048575), mkVar.mo2029m());
        } else if (this.f16549i) {
            ng.m9230a(obj, (long) (i & 1048575), mkVar.mo2027l());
        } else {
            ng.m9230a(obj, (long) (i & 1048575), mkVar.mo2031n());
        }
    }

    /* renamed from: d */
    private final int m20799d(int i) {
        return this.f16543c[i + 1];
    }

    /* renamed from: e */
    private final int m20801e(int i) {
        return this.f16543c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m20789b(T t, long j) {
        return ((Double) ng.m9252f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m20796c(T t, long j) {
        return ((Float) ng.m9252f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m20800d(T t, long j) {
        return ((Integer) ng.m9252f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m20802e(T t, long j) {
        return ((Long) ng.m9252f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m20805f(T t, long j) {
        return ((Boolean) ng.m9252f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m20798c(T t, T t2, int i) {
        return m20785a((Object) t, i) == m20785a((Object) t2, i) ? true : null;
    }

    /* renamed from: a */
    private final boolean m20787a(T t, int i, int i2, int i3) {
        if (this.f16550j) {
            return m20785a((Object) t, i);
        }
        return (i2 & i3) != null ? true : null;
    }

    /* renamed from: a */
    private final boolean m20785a(T t, int i) {
        if (this.f16550j) {
            i = m20799d(i);
            long j = (long) (i & 1048575);
            switch ((i & 267386880) >>> 20) {
                case 0:
                    return ng.m9249e(t, j) != null;
                case 1:
                    return ng.m9245d(t, j) != null;
                case 2:
                    return ng.m9236b(t, j) != null;
                case 3:
                    return ng.m9236b(t, j) != null;
                case 4:
                    return ng.m9221a((Object) t, j) != null;
                case 5:
                    return ng.m9236b(t, j) != null;
                case 6:
                    return ng.m9221a((Object) t, j) != null;
                case 7:
                    return ng.m9244c(t, j);
                case 8:
                    t = ng.m9252f(t, j);
                    if ((t instanceof String) != 0) {
                        return ((String) t).isEmpty() == null;
                    } else {
                        if ((t instanceof zzbbu) != 0) {
                            return zzbbu.f9094a.equals(t) == null;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return ng.m9252f(t, j) != null;
                case 10:
                    return zzbbu.f9094a.equals(ng.m9252f(t, j)) == null;
                case 11:
                    return ng.m9221a((Object) t, j) != null;
                case 12:
                    return ng.m9221a((Object) t, j) != null;
                case 13:
                    return ng.m9221a((Object) t, j) != null;
                case 14:
                    return ng.m9236b(t, j) != null;
                case 15:
                    return ng.m9221a((Object) t, j) != null;
                case 16:
                    return ng.m9236b(t, j) != null;
                case 17:
                    return ng.m9252f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        i = m20801e(i);
        return (ng.m9221a((Object) t, (long) (i & 1048575)) & (1 << (i >>> 20))) != null;
    }

    /* renamed from: b */
    private final void m20792b(T t, int i) {
        if (!this.f16550j) {
            i = m20801e(i);
            long j = (long) (i & 1048575);
            ng.m9228a((Object) t, j, ng.m9221a((Object) t, j) | (1 << (i >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m20786a(T t, int i, int i2) {
        return ng.m9221a((Object) t, (long) (m20801e(i2) & 1048575)) == i ? true : null;
    }

    /* renamed from: b */
    private final void m20793b(T t, int i, int i2) {
        ng.m9228a((Object) t, (long) (m20801e(i2) & 1048575), i);
    }

    /* renamed from: g */
    private final int m20806g(int i) {
        return (i < this.f16545e || i > this.f16546f) ? -1 : m20790b(i, 0);
    }

    /* renamed from: a */
    private final int m20763a(int i, int i2) {
        return (i < this.f16545e || i > this.f16546f) ? -1 : m20790b(i, i2);
    }

    /* renamed from: b */
    private final int m20790b(int i, int i2) {
        int length = (this.f16543c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f16543c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
