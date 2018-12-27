package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzvm.zze;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class ck<T> implements cu<T> {
    /* renamed from: a */
    private static final int[] f17450a = new int[0];
    /* renamed from: b */
    private static final Unsafe f17451b = dp.m11761c();
    /* renamed from: c */
    private final int[] f17452c;
    /* renamed from: d */
    private final Object[] f17453d;
    /* renamed from: e */
    private final int f17454e;
    /* renamed from: f */
    private final int f17455f;
    /* renamed from: g */
    private final zzwt f17456g;
    /* renamed from: h */
    private final boolean f17457h;
    /* renamed from: i */
    private final boolean f17458i;
    /* renamed from: j */
    private final boolean f17459j;
    /* renamed from: k */
    private final boolean f17460k;
    /* renamed from: l */
    private final int[] f17461l;
    /* renamed from: m */
    private final int f17462m;
    /* renamed from: n */
    private final int f17463n;
    /* renamed from: o */
    private final cm f17464o;
    /* renamed from: p */
    private final bv f17465p;
    /* renamed from: q */
    private final dl<?, ?> f17466q;
    /* renamed from: r */
    private final bi<?> f17467r;
    /* renamed from: s */
    private final ce f17468s;

    private ck(int[] iArr, Object[] objArr, int i, int i2, zzwt zzwt, boolean z, boolean z2, int[] iArr2, int i3, int i4, cm cmVar, bv bvVar, dl<?, ?> dlVar, bi<?> biVar, ce ceVar) {
        this.f17452c = iArr;
        this.f17453d = objArr;
        this.f17454e = i;
        this.f17455f = i2;
        this.f17458i = zzwt instanceof zzvm;
        this.f17459j = z;
        objArr = (biVar == null || biVar.mo3045a(zzwt) == null) ? null : 1;
        this.f17457h = objArr;
        this.f17460k = null;
        this.f17461l = iArr2;
        this.f17462m = i3;
        this.f17463n = i4;
        this.f17464o = cmVar;
        this.f17465p = bvVar;
        this.f17466q = dlVar;
        this.f17467r = biVar;
        this.f17456g = zzwt;
        this.f17468s = ceVar;
    }

    /* renamed from: f */
    private static boolean m22374f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: a */
    public final void mo3065a(T r18, com.google.android.gms.internal.measurement.ct r19, com.google.android.gms.internal.measurement.zzuz r20) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Incorrect nodes count for selectOther: B:278:0x05eb in [B:178:0x05e0, B:278:0x05eb, B:275:0x00a2]
	at jadx.core.utils.BlockUtils.selectOther(BlockUtils.java:53)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:64)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
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
        r17 = this;
        r1 = r17;
        r2 = r18;
        r0 = r19;
        r10 = r20;
        if (r10 == 0) goto L_0x05f1;
    L_0x000a:
        r11 = r1.f17466q;
        r12 = r1.f17467r;
        r13 = 0;
        r3 = r13;
        r14 = r3;
    L_0x0011:
        r4 = r19.mo2954a();	 Catch:{ all -> 0x05d9 }
        r5 = r1.f17454e;	 Catch:{ all -> 0x05d9 }
        r6 = -1;	 Catch:{ all -> 0x05d9 }
        if (r4 < r5) goto L_0x003e;	 Catch:{ all -> 0x05d9 }
    L_0x001a:
        r5 = r1.f17455f;	 Catch:{ all -> 0x05d9 }
        if (r4 > r5) goto L_0x003e;	 Catch:{ all -> 0x05d9 }
    L_0x001e:
        r5 = 0;	 Catch:{ all -> 0x05d9 }
        r7 = r1.f17452c;	 Catch:{ all -> 0x05d9 }
        r7 = r7.length;	 Catch:{ all -> 0x05d9 }
        r7 = r7 / 3;	 Catch:{ all -> 0x05d9 }
        r7 = r7 + -1;	 Catch:{ all -> 0x05d9 }
    L_0x0026:
        if (r5 > r7) goto L_0x003e;	 Catch:{ all -> 0x05d9 }
    L_0x0028:
        r8 = r7 + r5;	 Catch:{ all -> 0x05d9 }
        r8 = r8 >>> 1;	 Catch:{ all -> 0x05d9 }
        r9 = r8 * 3;	 Catch:{ all -> 0x05d9 }
        r15 = r1.f17452c;	 Catch:{ all -> 0x05d9 }
        r15 = r15[r9];	 Catch:{ all -> 0x05d9 }
        if (r4 != r15) goto L_0x0036;
    L_0x0034:
        r6 = r9;
        goto L_0x003e;
    L_0x0036:
        if (r4 >= r15) goto L_0x003b;
    L_0x0038:
        r7 = r8 + -1;
        goto L_0x0026;
    L_0x003b:
        r5 = r8 + 1;
        goto L_0x0026;
    L_0x003e:
        if (r6 >= 0) goto L_0x00a8;
    L_0x0040:
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r4 != r5) goto L_0x005c;
    L_0x0045:
        r0 = r1.f17462m;
    L_0x0047:
        r3 = r1.f17463n;
        if (r0 >= r3) goto L_0x0056;
    L_0x004b:
        r3 = r1.f17461l;
        r3 = r3[r0];
        r14 = r1.m22349a(r2, r3, r14, r11);
        r0 = r0 + 1;
        goto L_0x0047;
    L_0x0056:
        if (r14 == 0) goto L_0x005b;
    L_0x0058:
        r11.mo3092b(r2, r14);
    L_0x005b:
        return;
    L_0x005c:
        r5 = r1.f17457h;	 Catch:{ all -> 0x05d9 }
        if (r5 != 0) goto L_0x0062;	 Catch:{ all -> 0x05d9 }
    L_0x0060:
        r5 = r13;	 Catch:{ all -> 0x05d9 }
        goto L_0x0069;	 Catch:{ all -> 0x05d9 }
    L_0x0062:
        r5 = r1.f17456g;	 Catch:{ all -> 0x05d9 }
        r4 = r12.mo3040a(r10, r5, r4);	 Catch:{ all -> 0x05d9 }
        r5 = r4;	 Catch:{ all -> 0x05d9 }
    L_0x0069:
        if (r5 == 0) goto L_0x0081;	 Catch:{ all -> 0x05d9 }
    L_0x006b:
        if (r3 != 0) goto L_0x0071;	 Catch:{ all -> 0x05d9 }
    L_0x006d:
        r3 = r12.mo3046b(r2);	 Catch:{ all -> 0x05d9 }
    L_0x0071:
        r15 = r3;	 Catch:{ all -> 0x05d9 }
        r3 = r12;	 Catch:{ all -> 0x05d9 }
        r4 = r19;	 Catch:{ all -> 0x05d9 }
        r6 = r20;	 Catch:{ all -> 0x05d9 }
        r7 = r15;	 Catch:{ all -> 0x05d9 }
        r8 = r14;	 Catch:{ all -> 0x05d9 }
        r9 = r11;	 Catch:{ all -> 0x05d9 }
        r3 = r3.mo3039a(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x05d9 }
        r14 = r3;	 Catch:{ all -> 0x05d9 }
        r3 = r15;	 Catch:{ all -> 0x05d9 }
        goto L_0x0011;	 Catch:{ all -> 0x05d9 }
    L_0x0081:
        r11.mo3088a(r0);	 Catch:{ all -> 0x05d9 }
        if (r14 != 0) goto L_0x008b;	 Catch:{ all -> 0x05d9 }
    L_0x0086:
        r4 = r11.mo3093c(r2);	 Catch:{ all -> 0x05d9 }
        r14 = r4;	 Catch:{ all -> 0x05d9 }
    L_0x008b:
        r4 = r11.m11716a(r14, r0);	 Catch:{ all -> 0x05d9 }
        if (r4 != 0) goto L_0x0011;
    L_0x0091:
        r0 = r1.f17462m;
    L_0x0093:
        r3 = r1.f17463n;
        if (r0 >= r3) goto L_0x00a2;
    L_0x0097:
        r3 = r1.f17461l;
        r3 = r3[r0];
        r14 = r1.m22349a(r2, r3, r14, r11);
        r0 = r0 + 1;
        goto L_0x0093;
    L_0x00a2:
        if (r14 == 0) goto L_0x00a7;
    L_0x00a4:
        r11.mo3092b(r2, r14);
    L_0x00a7:
        return;
    L_0x00a8:
        r5 = r1.m22370d(r6);	 Catch:{ all -> 0x05d9 }
        r7 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r7 = r7 & r5;
        r7 = r7 >>> 20;
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        switch(r7) {
            case 0: goto L_0x0585;
            case 1: goto L_0x0576;
            case 2: goto L_0x0567;
            case 3: goto L_0x0558;
            case 4: goto L_0x0549;
            case 5: goto L_0x053a;
            case 6: goto L_0x052b;
            case 7: goto L_0x051c;
            case 8: goto L_0x0514;
            case 9: goto L_0x04e3;
            case 10: goto L_0x04d4;
            case 11: goto L_0x04c5;
            case 12: goto L_0x04a3;
            case 13: goto L_0x0494;
            case 14: goto L_0x0485;
            case 15: goto L_0x0476;
            case 16: goto L_0x0467;
            case 17: goto L_0x0436;
            case 18: goto L_0x0429;
            case 19: goto L_0x041c;
            case 20: goto L_0x040f;
            case 21: goto L_0x0402;
            case 22: goto L_0x03f5;
            case 23: goto L_0x03e8;
            case 24: goto L_0x03db;
            case 25: goto L_0x03ce;
            case 26: goto L_0x03ae;
            case 27: goto L_0x039d;
            case 28: goto L_0x0390;
            case 29: goto L_0x0383;
            case 30: goto L_0x036d;
            case 31: goto L_0x0360;
            case 32: goto L_0x0353;
            case 33: goto L_0x0346;
            case 34: goto L_0x0339;
            case 35: goto L_0x032c;
            case 36: goto L_0x031f;
            case 37: goto L_0x0312;
            case 38: goto L_0x0305;
            case 39: goto L_0x02f8;
            case 40: goto L_0x02eb;
            case 41: goto L_0x02de;
            case 42: goto L_0x02d1;
            case 43: goto L_0x02c4;
            case 44: goto L_0x02af;
            case 45: goto L_0x02a2;
            case 46: goto L_0x0295;
            case 47: goto L_0x0288;
            case 48: goto L_0x027b;
            case 49: goto L_0x0269;
            case 50: goto L_0x0227;
            case 51: goto L_0x0215;
            case 52: goto L_0x0203;
            case 53: goto L_0x01f1;
            case 54: goto L_0x01df;
            case 55: goto L_0x01cd;
            case 56: goto L_0x01bb;
            case 57: goto L_0x01a9;
            case 58: goto L_0x0197;
            case 59: goto L_0x018f;
            case 60: goto L_0x015e;
            case 61: goto L_0x0150;
            case 62: goto L_0x013e;
            case 63: goto L_0x0119;
            case 64: goto L_0x0107;
            case 65: goto L_0x00f5;
            case 66: goto L_0x00e3;
            case 67: goto L_0x00d1;
            case 68: goto L_0x00bf;
            default: goto L_0x00b7;
        };
    L_0x00b7:
        if (r14 != 0) goto L_0x0595;
    L_0x00b9:
        r4 = r11.mo3080a();	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0594;	 Catch:{ zzvu -> 0x05b2 }
    L_0x00bf:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r5 = r0.mo2960b(r5, r10);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x00d1:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2995t();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Long.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x00e3:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2994s();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x00f5:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2993r();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Long.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0107:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2991q();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0119:
        r7 = r19.mo2989p();	 Catch:{ zzvu -> 0x05b2 }
        r9 = r1.m22368c(r6);	 Catch:{ zzvu -> 0x05b2 }
        if (r9 == 0) goto L_0x0130;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0123:
        r9 = r9.mo2920a(r7);	 Catch:{ zzvu -> 0x05b2 }
        if (r9 == 0) goto L_0x012a;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0129:
        goto L_0x0130;	 Catch:{ zzvu -> 0x05b2 }
    L_0x012a:
        r4 = com.google.android.gms.internal.measurement.cw.m11633a(r4, r7, r14, r11);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0380;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0130:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r8 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r7);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r8, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x013e:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2987o();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0150:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2985n();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x015e:
        r7 = r1.m22358a(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        if (r7 == 0) goto L_0x017a;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0164:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r2, r7);	 Catch:{ zzvu -> 0x05b2 }
        r9 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r9 = r0.mo2955a(r9, r10);	 Catch:{ zzvu -> 0x05b2 }
        r5 = com.google.android.gms.internal.measurement.zzvo.m12070a(r5, r9);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x018a;	 Catch:{ zzvu -> 0x05b2 }
    L_0x017a:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r5 = r0.mo2955a(r5, r10);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
    L_0x018a:
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x018f:
        r1.m22355a(r2, r5, r0);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0197:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2980k();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x01a9:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2977j();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x01bb:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2975i();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Long.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x01cd:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2973h();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x01df:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2969f();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Long.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x01f1:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2971g();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Long.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0203:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r19.mo2967e();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0215:
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r7 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r15 = r19.mo2965d();	 Catch:{ zzvu -> 0x05b2 }
        r5 = java.lang.Double.valueOf(r15);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r7, r5);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22364b(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0227:
        r4 = r1.m22362b(r6);	 Catch:{ zzvu -> 0x05b2 }
        r5 = r1.m22370d(r6);	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r7 = com.google.android.gms.internal.measurement.dp.m11773f(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        if (r7 != 0) goto L_0x0241;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0237:
        r7 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r7.mo3061e(r4);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r5, r7);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0258;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0241:
        r8 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r8 = r8.mo3059c(r7);	 Catch:{ zzvu -> 0x05b2 }
        if (r8 == 0) goto L_0x0258;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0249:
        r8 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r8 = r8.mo3061e(r4);	 Catch:{ zzvu -> 0x05b2 }
        r9 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r9.mo3056a(r8, r7);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r5, r8);	 Catch:{ zzvu -> 0x05b2 }
        r7 = r8;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0258:
        r5 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5.mo3057a(r7);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.f17468s;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r6.mo3062f(r4);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2958a(r5, r4, r10);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0269:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r7 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r7.mo3050a(r2, r4);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2962b(r4, r6, r10);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x027b:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2992q(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0288:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2990p(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0295:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2988o(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02a2:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2986n(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02af:
        r7 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r8 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r7.mo3050a(r2, r8);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2984m(r5);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.m22368c(r6);	 Catch:{ zzvu -> 0x05b2 }
        r4 = com.google.android.gms.internal.measurement.cw.m11634a(r4, r5, r6, r14, r11);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0380;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02c4:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2982l(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02d1:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2974h(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02de:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2972g(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02eb:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2970f(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x02f8:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2968e(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0305:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2963c(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0312:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2966d(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x031f:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2961b(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x032c:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2956a(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0339:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2992q(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0346:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2990p(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0353:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2988o(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0360:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2986n(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x036d:
        r7 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r8 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r7.mo3050a(r2, r8);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2984m(r5);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.m22368c(r6);	 Catch:{ zzvu -> 0x05b2 }
        r4 = com.google.android.gms.internal.measurement.cw.m11634a(r4, r5, r6, r14, r11);	 Catch:{ zzvu -> 0x05b2 }
    L_0x0380:
        r14 = r4;	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0383:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2982l(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0390:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2979k(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x039d:
        r4 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r7.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2957a(r5, r4, r10);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03ae:
        r4 = m22374f(r5);	 Catch:{ zzvu -> 0x05b2 }
        if (r4 == 0) goto L_0x03c1;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03b4:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2978j(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03c1:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2976i(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03ce:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2974h(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03db:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2972g(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03e8:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2970f(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x03f5:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2968e(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0402:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2963c(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x040f:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2966d(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x041c:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2961b(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0429:
        r4 = r1.f17465p;	 Catch:{ zzvu -> 0x05b2 }
        r5 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r5 = (long) r5;	 Catch:{ zzvu -> 0x05b2 }
        r4 = r4.mo3050a(r2, r5);	 Catch:{ zzvu -> 0x05b2 }
        r0.mo2956a(r4);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0436:
        r4 = r1.m22357a(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        if (r4 == 0) goto L_0x0454;	 Catch:{ zzvu -> 0x05b2 }
    L_0x043c:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = com.google.android.gms.internal.measurement.dp.m11773f(r2, r4);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r0.mo2960b(r6, r10);	 Catch:{ zzvu -> 0x05b2 }
        r6 = com.google.android.gms.internal.measurement.zzvo.m12070a(r7, r6);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0454:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r7 = r0.mo2960b(r7, r10);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0467:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2995t();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11750a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0476:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2994s();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0485:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2993r();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11750a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0494:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2991q();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04a3:
        r7 = r19.mo2989p();	 Catch:{ zzvu -> 0x05b2 }
        r9 = r1.m22368c(r6);	 Catch:{ zzvu -> 0x05b2 }
        if (r9 == 0) goto L_0x04ba;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04ad:
        r9 = r9.mo2920a(r7);	 Catch:{ zzvu -> 0x05b2 }
        if (r9 == 0) goto L_0x04b4;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04b3:
        goto L_0x04ba;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04b4:
        r4 = com.google.android.gms.internal.measurement.cw.m11633a(r4, r7, r14, r11);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0380;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04ba:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04c5:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2987o();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04d4:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2985n();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04e3:
        r4 = r1.m22357a(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        if (r4 == 0) goto L_0x0501;	 Catch:{ zzvu -> 0x05b2 }
    L_0x04e9:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = com.google.android.gms.internal.measurement.dp.m11773f(r2, r4);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r6 = r0.mo2955a(r6, r10);	 Catch:{ zzvu -> 0x05b2 }
        r6 = com.google.android.gms.internal.measurement.zzvo.m12070a(r7, r6);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r4, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0501:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r1.m22347a(r6);	 Catch:{ zzvu -> 0x05b2 }
        r7 = r0.mo2955a(r7, r10);	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11751a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0514:
        r1.m22355a(r2, r5, r0);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x051c:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2980k();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11752a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x052b:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2977j();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x053a:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2975i();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11750a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0549:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2973h();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11749a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0558:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2969f();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11750a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0567:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2971g();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11750a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0576:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2967e();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11748a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0585:
        r4 = r5 & r8;	 Catch:{ zzvu -> 0x05b2 }
        r4 = (long) r4;	 Catch:{ zzvu -> 0x05b2 }
        r7 = r19.mo2965d();	 Catch:{ zzvu -> 0x05b2 }
        com.google.android.gms.internal.measurement.dp.m11747a(r2, r4, r7);	 Catch:{ zzvu -> 0x05b2 }
        r1.m22363b(r2, r6);	 Catch:{ zzvu -> 0x05b2 }
        goto L_0x0011;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0594:
        r14 = r4;	 Catch:{ zzvu -> 0x05b2 }
    L_0x0595:
        r4 = r11.m11716a(r14, r0);	 Catch:{ zzvu -> 0x05b2 }
        if (r4 != 0) goto L_0x0011;
    L_0x059b:
        r0 = r1.f17462m;
    L_0x059d:
        r3 = r1.f17463n;
        if (r0 >= r3) goto L_0x05ac;
    L_0x05a1:
        r3 = r1.f17461l;
        r3 = r3[r0];
        r14 = r1.m22349a(r2, r3, r14, r11);
        r0 = r0 + 1;
        goto L_0x059d;
    L_0x05ac:
        if (r14 == 0) goto L_0x05b1;
    L_0x05ae:
        r11.mo3092b(r2, r14);
    L_0x05b1:
        return;
    L_0x05b2:
        r11.mo3088a(r0);	 Catch:{ all -> 0x05d9 }
        if (r14 != 0) goto L_0x05bc;	 Catch:{ all -> 0x05d9 }
    L_0x05b7:
        r4 = r11.mo3093c(r2);	 Catch:{ all -> 0x05d9 }
        r14 = r4;	 Catch:{ all -> 0x05d9 }
    L_0x05bc:
        r4 = r11.m11716a(r14, r0);	 Catch:{ all -> 0x05d9 }
        if (r4 != 0) goto L_0x0011;
    L_0x05c2:
        r0 = r1.f17462m;
    L_0x05c4:
        r3 = r1.f17463n;
        if (r0 >= r3) goto L_0x05d3;
    L_0x05c8:
        r3 = r1.f17461l;
        r3 = r3[r0];
        r14 = r1.m22349a(r2, r3, r14, r11);
        r0 = r0 + 1;
        goto L_0x05c4;
    L_0x05d3:
        if (r14 == 0) goto L_0x05d8;
    L_0x05d5:
        r11.mo3092b(r2, r14);
    L_0x05d8:
        return;
    L_0x05d9:
        r0 = move-exception;
        r3 = r1.f17462m;
    L_0x05dc:
        r4 = r1.f17463n;
        if (r3 >= r4) goto L_0x05eb;
    L_0x05e0:
        r4 = r1.f17461l;
        r4 = r4[r3];
        r14 = r1.m22349a(r2, r4, r14, r11);
        r3 = r3 + 1;
        goto L_0x05dc;
    L_0x05eb:
        if (r14 == 0) goto L_0x05f0;
    L_0x05ed:
        r11.mo3092b(r2, r14);
    L_0x05f0:
        throw r0;
    L_0x05f1:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ck.a(java.lang.Object, com.google.android.gms.internal.measurement.ct, com.google.android.gms.internal.measurement.zzuz):void");
    }

    /* renamed from: a */
    static <T> ck<T> m22346a(Class<T> cls, ch chVar, cm cmVar, bv bvVar, dl<?, ?> dlVar, bi<?> biVar, ce ceVar) {
        ch chVar2 = chVar;
        if (chVar2 instanceof cs) {
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
            cs csVar = (cs) chVar2;
            int i10 = 0;
            boolean z2 = csVar.mo3073a() == zze.f10275i;
            String d = csVar.m22399d();
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
                iArr = f17450a;
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
            Unsafe unsafe = f17451b;
            Object[] e = csVar.m22400e();
            Class cls2 = csVar.mo3075c().getClass();
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
                if (i10 > zzvg.MAP.m12064a()) {
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
                    if (i10 != zzvg.MESSAGE.m12064a() + 51) {
                        if (i10 != zzvg.GROUP.m12064a() + 51) {
                            if (i10 == zzvg.ENUM.m12064a() + 51) {
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
                                        field = m22350a(cls2, (String) obj);
                                        e[length] = field;
                                    }
                                    c3 = c;
                                    i3 = (int) unsafe.objectFieldOffset(field);
                                    length++;
                                    obj = e[length];
                                    if (obj instanceof Field) {
                                        field = (Field) obj;
                                    } else {
                                        field = m22350a(cls2, (String) obj);
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
                                field = m22350a(cls2, (String) obj);
                                e[length] = field;
                            } else {
                                field = (Field) obj;
                            }
                            c3 = c;
                            i3 = (int) unsafe.objectFieldOffset(field);
                            length++;
                            obj = e[length];
                            if (obj instanceof Field) {
                                field = m22350a(cls2, (String) obj);
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
                        field = m22350a(cls2, (String) obj);
                        e[length] = field;
                    }
                    c3 = c;
                    i3 = (int) unsafe.objectFieldOffset(field);
                    length++;
                    obj = e[length];
                    if (obj instanceof Field) {
                        field = (Field) obj;
                    } else {
                        field = m22350a(cls2, (String) obj);
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
                    field = m22350a(cls2, (String) e[i15]);
                    if (i10 != zzvg.MESSAGE.m12064a()) {
                        if (i10 != zzvg.GROUP.m12064a()) {
                            if (i10 != zzvg.MESSAGE_LIST.m12064a()) {
                                if (i10 != zzvg.GROUP_LIST.m12064a()) {
                                    if (!(i10 == zzvg.ENUM.m12064a() || i10 == zzvg.ENUM_LIST.m12064a())) {
                                        if (i10 != zzvg.ENUM_LIST_PACKED.m12064a()) {
                                            if (i10 == zzvg.MAP.m12064a()) {
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
                                                if ((charAt2 & 1) == 1 || i10 > zzvg.GROUP.m12064a()) {
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
                                                        field2 = m22350a(cls2, (String) obj2);
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
            return new ck(iArr3, objArr, c, c2, csVar.mo3075c(), z2, false, iArr, i10, i9, cmVar, bvVar, dlVar, biVar, ceVar);
        }
        ((dh) chVar2).mo3073a();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    private static java.lang.reflect.Field m22350a(java.lang.Class<?> r5, java.lang.String r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ck.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: a */
    public final T mo3064a() {
        return this.f17464o.mo3072a(this.f17456g);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo3067a(T r10, T r11) {
        /*
        r9 = this;
        r0 = r9.f17452c;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        r3 = 1;
        if (r2 >= r0) goto L_0x01b9;
    L_0x0008:
        r4 = r9.m22370d(r2);
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
        r4 = r9.m22372e(r2);
        r4 = r4 & r5;
        r4 = (long) r4;
        r8 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r4);
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r4);
        if (r8 != r4) goto L_0x01b1;
    L_0x002c:
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r4 = com.google.android.gms.internal.measurement.cw.m11642a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x003a:
        goto L_0x01b1;
    L_0x003c:
        r3 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r3 = com.google.android.gms.internal.measurement.cw.m11642a(r3, r4);
        goto L_0x01b2;
    L_0x004a:
        r3 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r3 = com.google.android.gms.internal.measurement.cw.m11642a(r3, r4);
        goto L_0x01b2;
    L_0x0058:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x005e:
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r4 = com.google.android.gms.internal.measurement.cw.m11642a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x006c:
        goto L_0x01b1;
    L_0x006e:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0074:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x0080:
        goto L_0x01b1;
    L_0x0082:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0088:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0092:
        goto L_0x01b1;
    L_0x0094:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x009a:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x00a6:
        goto L_0x01b1;
    L_0x00a8:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00ae:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00b8:
        goto L_0x01b1;
    L_0x00ba:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00c0:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00ca:
        goto L_0x01b1;
    L_0x00cc:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00d2:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x00dc:
        goto L_0x01b1;
    L_0x00de:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00e4:
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r4 = com.google.android.gms.internal.measurement.cw.m11642a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x00f2:
        goto L_0x01b1;
    L_0x00f4:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x00fa:
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r4 = com.google.android.gms.internal.measurement.cw.m11642a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x0108:
        goto L_0x01b1;
    L_0x010a:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0110:
        r4 = com.google.android.gms.internal.measurement.dp.m11773f(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r11, r6);
        r4 = com.google.android.gms.internal.measurement.cw.m11642a(r4, r5);
        if (r4 != 0) goto L_0x01b2;
    L_0x011e:
        goto L_0x01b1;
    L_0x0120:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0126:
        r4 = com.google.android.gms.internal.measurement.dp.m11765c(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11765c(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0130:
        goto L_0x01b1;
    L_0x0132:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0138:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0142:
        goto L_0x01b1;
    L_0x0144:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x014a:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x0156:
        goto L_0x01b1;
    L_0x0157:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x015d:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x0167:
        goto L_0x01b1;
    L_0x0168:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x016e:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x017a:
        goto L_0x01b1;
    L_0x017b:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0181:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x01b2;
    L_0x018d:
        goto L_0x01b1;
    L_0x018e:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x0194:
        r4 = com.google.android.gms.internal.measurement.dp.m11742a(r10, r6);
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r11, r6);
        if (r4 == r5) goto L_0x01b2;
    L_0x019e:
        goto L_0x01b1;
    L_0x019f:
        r4 = r9.m22369c(r10, r11, r2);
        if (r4 == 0) goto L_0x01b1;
    L_0x01a5:
        r4 = com.google.android.gms.internal.measurement.dp.m11757b(r10, r6);
        r6 = com.google.android.gms.internal.measurement.dp.m11757b(r11, r6);
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
        r0 = r9.f17466q;
        r0 = r0.mo3089b(r10);
        r2 = r9.f17466q;
        r2 = r2.mo3089b(r11);
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x01cc;
    L_0x01cb:
        return r1;
    L_0x01cc:
        r0 = r9.f17457h;
        if (r0 == 0) goto L_0x01e1;
    L_0x01d0:
        r0 = r9.f17467r;
        r10 = r0.mo3038a(r10);
        r0 = r9.f17467r;
        r11 = r0.mo3038a(r11);
        r10 = r10.equals(r11);
        return r10;
    L_0x01e1:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ck.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo3063a(T t) {
        int length = this.f17452c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m22370d(i2);
            int i3 = this.f17452c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            Object f;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + zzvo.m12067a(Double.doubleToLongBits(dp.m11770e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(dp.m11766d(t, j));
                    break;
                case 2:
                    i = (i * 53) + zzvo.m12067a(dp.m11757b(t, j));
                    break;
                case 3:
                    i = (i * 53) + zzvo.m12067a(dp.m11757b(t, j));
                    break;
                case 4:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + zzvo.m12067a(dp.m11757b(t, j));
                    break;
                case 6:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + zzvo.m12068a(dp.m11765c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) dp.m11773f(t, j)).hashCode();
                    break;
                case 9:
                    f = dp.m11773f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + zzvo.m12067a(dp.m11757b(t, j));
                    break;
                case 15:
                    i = (i * 53) + dp.m11742a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + zzvo.m12067a(dp.m11757b(t, j));
                    break;
                case 17:
                    f = dp.m11773f(t, j);
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
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                case 51:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(Double.doubleToLongBits(m22361b((Object) t, j)));
                    break;
                case 52:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + Float.floatToIntBits(m22367c(t, j));
                    break;
                case 53:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(m22373e(t, j));
                    break;
                case 54:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(m22373e(t, j));
                    break;
                case 55:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 56:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(m22373e(t, j));
                    break;
                case 57:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 58:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12068a(m22375f(t, j));
                    break;
                case 59:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ((String) dp.m11773f(t, j)).hashCode();
                    break;
                case 60:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                case 61:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                case 62:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 63:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 64:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 65:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(m22373e(t, j));
                    break;
                case 66:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + m22371d(t, j);
                    break;
                case 67:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + zzvo.m12067a(m22373e(t, j));
                    break;
                case 68:
                    if (!m22358a((Object) t, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + dp.m11773f(t, j).hashCode();
                    break;
                default:
                    break;
            }
        }
        i = (i * 53) + this.f17466q.mo3089b(t).hashCode();
        return this.f17457h ? (i * 53) + this.f17467r.mo3038a((Object) t).hashCode() : i;
    }

    /* renamed from: b */
    public final void mo3069b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f17452c.length; i += 3) {
                int d = m22370d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f17452c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11747a((Object) t, j, dp.m11770e(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 1:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11748a((Object) t, j, dp.m11766d(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 2:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11750a((Object) t, j, dp.m11757b(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 3:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11750a((Object) t, j, dp.m11757b(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 4:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 5:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11750a((Object) t, j, dp.m11757b(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 6:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 7:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11752a((Object) t, j, dp.m11765c(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 8:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11751a((Object) t, j, dp.m11773f(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 9:
                        m22356a((Object) t, (Object) t2, i);
                        break;
                    case 10:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11751a((Object) t, j, dp.m11773f(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 11:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 12:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 13:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 14:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11750a((Object) t, j, dp.m11757b(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 15:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11749a((Object) t, j, dp.m11742a((Object) t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 16:
                        if (!m22357a((Object) t2, i)) {
                            break;
                        }
                        dp.m11750a((Object) t, j, dp.m11757b(t2, j));
                        m22363b((Object) t, i);
                        break;
                    case 17:
                        m22356a((Object) t, (Object) t2, i);
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
                        this.f17465p.mo3051a(t, t2, j);
                        break;
                    case 50:
                        cw.m11639a(this.f17468s, (Object) t, (Object) t2, j);
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
                        if (!m22358a((Object) t2, i2, i)) {
                            break;
                        }
                        dp.m11751a((Object) t, j, dp.m11773f(t2, j));
                        m22364b((Object) t, i2, i);
                        break;
                    case 60:
                        m22366b((Object) t, (Object) t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m22358a((Object) t2, i2, i)) {
                            break;
                        }
                        dp.m11751a((Object) t, j, dp.m11773f(t2, j));
                        m22364b((Object) t, i2, i);
                        break;
                    case 68:
                        m22366b((Object) t, (Object) t2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.f17459j) {
                cw.m11640a(this.f17466q, (Object) t, (Object) t2);
                if (this.f17457h) {
                    cw.m11638a(this.f17467r, (Object) t, (Object) t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m22356a(T t, T t2, int i) {
        long d = (long) (m22370d(i) & 1048575);
        if (m22357a((Object) t2, i)) {
            Object f = dp.m11773f(t, d);
            Object f2 = dp.m11773f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    dp.m11751a((Object) t, d, f2);
                    m22363b((Object) t, i);
                }
                return;
            }
            dp.m11751a((Object) t, d, zzvo.m12070a(f, f2));
            m22363b((Object) t, i);
        }
    }

    /* renamed from: b */
    private final void m22366b(T t, T t2, int i) {
        int d = m22370d(i);
        int i2 = this.f17452c[i];
        long j = (long) (d & 1048575);
        if (m22358a((Object) t2, i2, i)) {
            Object f = dp.m11773f(t, j);
            Object f2 = dp.m11773f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    dp.m11751a((Object) t, j, f2);
                    m22364b((Object) t, i2, i);
                }
                return;
            }
            dp.m11751a((Object) t, j, zzvo.m12070a(f, f2));
            m22364b((Object) t, i2, i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final int mo3068b(T r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r0.f17459j;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r4 = 0;
        r7 = 1;
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r9 = 0;
        r11 = 0;
        if (r2 == 0) goto L_0x055f;
    L_0x0012:
        r2 = f17451b;
        r12 = 0;
        r13 = 0;
    L_0x0016:
        r14 = r0.f17452c;
        r14 = r14.length;
        if (r12 >= r14) goto L_0x0557;
    L_0x001b:
        r14 = r0.m22370d(r12);
        r15 = r14 & r3;
        r15 = r15 >>> 20;
        r3 = r0.f17452c;
        r3 = r3[r12];
        r14 = r14 & r8;
        r5 = (long) r14;
        r14 = com.google.android.gms.internal.measurement.zzvg.DOUBLE_LIST_PACKED;
        r14 = r14.m12064a();
        if (r15 < r14) goto L_0x0041;
    L_0x0031:
        r14 = com.google.android.gms.internal.measurement.zzvg.SINT64_LIST_PACKED;
        r14 = r14.m12064a();
        if (r15 > r14) goto L_0x0041;
    L_0x0039:
        r14 = r0.f17452c;
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
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x004d:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r5 = (com.google.android.gms.internal.measurement.zzwt) r5;
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.zzut.m22562c(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x005e:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0064:
        r5 = m22373e(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22574f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x006f:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0075:
        r5 = m22371d(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22581h(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0080:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0086:
        r3 = com.google.android.gms.internal.measurement.zzut.m22582h(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x008d:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0093:
        r3 = com.google.android.gms.internal.measurement.zzut.m22588j(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x009a:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00a0:
        r5 = m22371d(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22590k(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00ab:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00b1:
        r5 = m22371d(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22577g(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00bc:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00c2:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r5 = (com.google.android.gms.internal.measurement.zzud) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22560c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00cf:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00d5:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.cw.m11626a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00e4:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x00ea:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.measurement.zzud;
        if (r6 == 0) goto L_0x00fb;
    L_0x00f2:
        r5 = (com.google.android.gms.internal.measurement.zzud) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22560c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x00fb:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22552b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0104:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x010a:
        r3 = com.google.android.gms.internal.measurement.zzut.m22553b(r3, r7);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0111:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0117:
        r3 = com.google.android.gms.internal.measurement.zzut.m22585i(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x011e:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0124:
        r3 = com.google.android.gms.internal.measurement.zzut.m22578g(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x012b:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0131:
        r5 = m22371d(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22573f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x013c:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0142:
        r5 = m22373e(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22570e(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x014d:
        r14 = r0.m22358a(r1, r3, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0153:
        r5 = m22373e(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22565d(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x015e:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0164:
        r3 = com.google.android.gms.internal.measurement.zzut.m22549b(r3, r4);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x016b:
        r5 = r0.m22358a(r1, r3, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0171:
        r5 = 0;
        r3 = com.google.android.gms.internal.measurement.zzut.m22548b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x017a:
        r14 = r0.f17468s;
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r6 = r0.m22362b(r12);
        r3 = r14.mo3055a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x018b:
        r5 = m22351a(r1, r5);
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.cw.m11644b(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x019a:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11652c(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01a6:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x01ae;
    L_0x01aa:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01ae:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01bb:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11667g(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01c7:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x01cf;
    L_0x01cb:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01cf:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01dc:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11673i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x01e8:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x01f0;
    L_0x01ec:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x01f0:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x01fd:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11670h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0209:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0211;
    L_0x020d:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0211:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x021e:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11656d(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x022a:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0232;
    L_0x022e:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0232:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x023f:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11664f(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x024b:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0253;
    L_0x024f:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0253:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0260:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11676j(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x026c:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0274;
    L_0x0270:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0274:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0281:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11670h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x028d:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0295;
    L_0x0291:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0295:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02a2:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11673i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02ae:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x02b6;
    L_0x02b2:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02b6:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02c3:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11660e(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02cf:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x02d7;
    L_0x02d3:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02d7:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x02e4:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11646b(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x02f0:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x02f8;
    L_0x02f4:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x02f8:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0305:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11630a(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0311:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x0319;
    L_0x0315:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x0319:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0326:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11670h(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0332:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x033a;
    L_0x0336:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x033a:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0347:
        r5 = r2.getObject(r1, r5);
        r5 = (java.util.List) r5;
        r5 = com.google.android.gms.internal.measurement.cw.m11673i(r5);
        if (r5 <= 0) goto L_0x0551;
    L_0x0353:
        r6 = r0.f17460k;
        if (r6 == 0) goto L_0x035b;
    L_0x0357:
        r14 = (long) r14;
        r2.putInt(r1, r14, r5);
    L_0x035b:
        r3 = com.google.android.gms.internal.measurement.zzut.m22569e(r3);
        r6 = com.google.android.gms.internal.measurement.zzut.m22576g(r5);
        r3 = r3 + r6;
        r3 = r3 + r5;
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0368:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11651c(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0373:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11666g(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x037e:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11672i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0389:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11669h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0394:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11655d(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x039f:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11663f(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03aa:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11643b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03b5:
        r5 = m22351a(r1, r5);
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.cw.m11628a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03c4:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11627a(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03cf:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11675j(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03da:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11669h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03e5:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11672i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03f0:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11659e(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x03fb:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11645b(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0406:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11629a(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0411:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11669h(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x041c:
        r5 = m22351a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.cw.m11672i(r3, r5, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0427:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x042d:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r5 = (com.google.android.gms.internal.measurement.zzwt) r5;
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.zzut.m22562c(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x043e:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0444:
        r5 = com.google.android.gms.internal.measurement.dp.m11757b(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22574f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x044f:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0455:
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22581h(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0460:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0466:
        r3 = com.google.android.gms.internal.measurement.zzut.m22582h(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x046d:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0473:
        r3 = com.google.android.gms.internal.measurement.zzut.m22588j(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x047a:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0480:
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22590k(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x048b:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x0491:
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22577g(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x049c:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04a2:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r5 = (com.google.android.gms.internal.measurement.zzud) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22560c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04af:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04b5:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r6 = r0.m22347a(r12);
        r3 = com.google.android.gms.internal.measurement.cw.m11626a(r3, r5, r6);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04c4:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x04ca:
        r5 = com.google.android.gms.internal.measurement.dp.m11773f(r1, r5);
        r6 = r5 instanceof com.google.android.gms.internal.measurement.zzud;
        if (r6 == 0) goto L_0x04db;
    L_0x04d2:
        r5 = (com.google.android.gms.internal.measurement.zzud) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22560c(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04db:
        r5 = (java.lang.String) r5;
        r3 = com.google.android.gms.internal.measurement.zzut.m22552b(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04e4:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x04ea:
        r3 = com.google.android.gms.internal.measurement.zzut.m22553b(r3, r7);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04f0:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x04f6:
        r3 = com.google.android.gms.internal.measurement.zzut.m22585i(r3, r11);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x04fc:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x0502:
        r3 = com.google.android.gms.internal.measurement.zzut.m22578g(r3, r9);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0508:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x050e:
        r5 = com.google.android.gms.internal.measurement.dp.m11742a(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22573f(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0518:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x051e:
        r5 = com.google.android.gms.internal.measurement.dp.m11757b(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22570e(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0528:
        r14 = r0.m22357a(r1, r12);
        if (r14 == 0) goto L_0x0551;
    L_0x052e:
        r5 = com.google.android.gms.internal.measurement.dp.m11757b(r1, r5);
        r3 = com.google.android.gms.internal.measurement.zzut.m22565d(r3, r5);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0538:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x053e:
        r3 = com.google.android.gms.internal.measurement.zzut.m22549b(r3, r4);
        r13 = r13 + r3;
        goto L_0x0551;
    L_0x0544:
        r5 = r0.m22357a(r1, r12);
        if (r5 == 0) goto L_0x0551;
    L_0x054a:
        r5 = 0;
        r3 = com.google.android.gms.internal.measurement.zzut.m22548b(r3, r5);
        r13 = r13 + r3;
    L_0x0551:
        r12 = r12 + 3;
        r3 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        goto L_0x0016;
    L_0x0557:
        r2 = r0.f17466q;
        r1 = m22345a(r2, r1);
        r13 = r13 + r1;
        return r13;
    L_0x055f:
        r2 = f17451b;
        r3 = -1;
        r3 = 0;
        r5 = 0;
        r6 = -1;
        r12 = 0;
    L_0x0566:
        r13 = r0.f17452c;
        r13 = r13.length;
        if (r3 >= r13) goto L_0x0af7;
    L_0x056b:
        r13 = r0.m22370d(r3);
        r14 = r0.f17452c;
        r14 = r14[r3];
        r15 = 267386880; // 0xff00000 float:2.3665827E-29 double:1.321066716E-315;
        r16 = r13 & r15;
        r15 = r16 >>> 20;
        r4 = 17;
        if (r15 > r4) goto L_0x0592;
    L_0x057d:
        r4 = r0.f17452c;
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
        r4 = r0.f17460k;
        if (r4 == 0) goto L_0x05b0;
    L_0x0596:
        r4 = com.google.android.gms.internal.measurement.zzvg.DOUBLE_LIST_PACKED;
        r4 = r4.m12064a();
        if (r15 < r4) goto L_0x05b0;
    L_0x059e:
        r4 = com.google.android.gms.internal.measurement.zzvg.SINT64_LIST_PACKED;
        r4 = r4.m12064a();
        if (r15 > r4) goto L_0x05b0;
    L_0x05a6:
        r4 = r0.f17452c;
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
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05c1:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.measurement.zzwt) r4;
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.zzut.m22562c(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05d2:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05d8:
        r9 = m22373e(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22574f(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05e3:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05e9:
        r4 = m22371d(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22581h(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x05f4:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x05fa:
        r9 = 0;
        r4 = com.google.android.gms.internal.measurement.zzut.m22582h(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0603:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0609:
        r4 = 0;
        r9 = com.google.android.gms.internal.measurement.zzut.m22588j(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0611:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0617:
        r4 = m22371d(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22590k(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0622:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0628:
        r4 = m22371d(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22577g(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0633:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0639:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.measurement.zzud) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22560c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0646:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x064c:
        r4 = r2.getObject(r1, r9);
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.cw.m11626a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x065b:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0661:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.measurement.zzud;
        if (r9 == 0) goto L_0x0672;
    L_0x0669:
        r4 = (com.google.android.gms.internal.measurement.zzud) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22560c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0672:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22552b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x067b:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x0681:
        r4 = com.google.android.gms.internal.measurement.zzut.m22553b(r14, r7);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0688:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x068e:
        r4 = 0;
        r9 = com.google.android.gms.internal.measurement.zzut.m22585i(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0696:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x069c:
        r9 = 0;
        r4 = com.google.android.gms.internal.measurement.zzut.m22578g(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06a5:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06ab:
        r4 = m22371d(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22573f(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06b6:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06bc:
        r9 = m22373e(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22570e(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06c7:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06cd:
        r9 = m22373e(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22565d(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06d8:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06de:
        r4 = 0;
        r9 = com.google.android.gms.internal.measurement.zzut.m22549b(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x06e6:
        r4 = r0.m22358a(r1, r14, r3);
        if (r4 == 0) goto L_0x09ca;
    L_0x06ec:
        r9 = 0;
        r4 = com.google.android.gms.internal.measurement.zzut.m22548b(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x06f5:
        r4 = r0.f17468s;
        r9 = r2.getObject(r1, r9);
        r10 = r0.m22362b(r3);
        r4 = r4.mo3055a(r14, r9, r10);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0706:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.cw.m11644b(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0717:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11652c(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0723:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x072b;
    L_0x0727:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x072b:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0738:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11667g(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0744:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x074c;
    L_0x0748:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x074c:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0759:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11673i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0765:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x076d;
    L_0x0769:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x076d:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x077a:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11670h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x0786:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x078e;
    L_0x078a:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x078e:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x079b:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11656d(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07a7:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x07af;
    L_0x07ab:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07af:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07bc:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11664f(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07c8:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x07d0;
    L_0x07cc:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07d0:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07dd:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11676j(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x07e9:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x07f1;
    L_0x07ed:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x07f1:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x07fe:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11670h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x080a:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x0812;
    L_0x080e:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0812:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x081f:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11673i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x082b:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x0833;
    L_0x082f:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0833:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0840:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11660e(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x084c:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x0854;
    L_0x0850:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0854:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0861:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11646b(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x086d:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x0875;
    L_0x0871:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0875:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0882:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11630a(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x088e:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x0896;
    L_0x0892:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x0896:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08a3:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11670h(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x08af:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x08b7;
    L_0x08b3:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x08b7:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08c4:
        r9 = r2.getObject(r1, r9);
        r9 = (java.util.List) r9;
        r9 = com.google.android.gms.internal.measurement.cw.m11673i(r9);
        if (r9 <= 0) goto L_0x09ca;
    L_0x08d0:
        r10 = r0.f17460k;
        if (r10 == 0) goto L_0x08d8;
    L_0x08d4:
        r10 = (long) r4;
        r2.putInt(r1, r10, r9);
    L_0x08d8:
        r4 = com.google.android.gms.internal.measurement.zzut.m22569e(r14);
        r10 = com.google.android.gms.internal.measurement.zzut.m22576g(r9);
        r4 = r4 + r10;
        r4 = r4 + r9;
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08e5:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.measurement.cw.m11651c(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x08f3:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11666g(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0901:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11672i(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x090f:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11669h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x091d:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11655d(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x092b:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11663f(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0939:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11643b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0946:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.cw.m11628a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0957:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11627a(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0963:
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r11 = 0;
        r4 = com.google.android.gms.internal.measurement.cw.m11675j(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0970:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11669h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x097d:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11672i(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x098a:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11659e(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0997:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11645b(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09a4:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11629a(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09b1:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11669h(r14, r4, r11);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09be:
        r11 = 0;
        r4 = r2.getObject(r1, r9);
        r4 = (java.util.List) r4;
        r4 = com.google.android.gms.internal.measurement.cw.m11672i(r14, r4, r11);
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
        r4 = (com.google.android.gms.internal.measurement.zzwt) r4;
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.zzut.m22562c(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09e6:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x09ea:
        r9 = r2.getLong(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22574f(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x09f4:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x09f8:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22581h(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a02:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a06:
        r9 = 0;
        r4 = com.google.android.gms.internal.measurement.zzut.m22582h(r14, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a0e:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a12:
        r4 = 0;
        r9 = com.google.android.gms.internal.measurement.zzut.m22588j(r14, r4);
        r5 = r5 + r9;
        goto L_0x09ca;
    L_0x0a19:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a1d:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22590k(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a27:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a2b:
        r4 = r2.getInt(r1, r9);
        r4 = com.google.android.gms.internal.measurement.zzut.m22577g(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a35:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a39:
        r4 = r2.getObject(r1, r9);
        r4 = (com.google.android.gms.internal.measurement.zzud) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22560c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a45:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a49:
        r4 = r2.getObject(r1, r9);
        r9 = r0.m22347a(r3);
        r4 = com.google.android.gms.internal.measurement.cw.m11626a(r14, r4, r9);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a58:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a5c:
        r4 = r2.getObject(r1, r9);
        r9 = r4 instanceof com.google.android.gms.internal.measurement.zzud;
        if (r9 == 0) goto L_0x0a6d;
    L_0x0a64:
        r4 = (com.google.android.gms.internal.measurement.zzud) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22560c(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a6d:
        r4 = (java.lang.String) r4;
        r4 = com.google.android.gms.internal.measurement.zzut.m22552b(r14, r4);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a76:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a7a:
        r4 = com.google.android.gms.internal.measurement.zzut.m22553b(r14, r7);
        r5 = r5 + r4;
        goto L_0x09ca;
    L_0x0a81:
        r4 = r12 & r16;
        if (r4 == 0) goto L_0x09ca;
    L_0x0a85:
        r4 = 0;
        r9 = com.google.android.gms.internal.measurement.zzut.m22585i(r14, r4);
        r5 = r5 + r9;
        goto L_0x09cb;
    L_0x0a8d:
        r4 = 0;
        r9 = r12 & r16;
        if (r9 == 0) goto L_0x09cb;
    L_0x0a92:
        r9 = 0;
        r11 = com.google.android.gms.internal.measurement.zzut.m22578g(r14, r9);
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
        r9 = com.google.android.gms.internal.measurement.zzut.m22573f(r14, r9);
        r5 = r5 + r9;
        goto L_0x0ace;
    L_0x0aad:
        r4 = 0;
        r18 = 0;
        r11 = r12 & r16;
        if (r11 == 0) goto L_0x0ace;
    L_0x0ab4:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.measurement.zzut.m22570e(r14, r9);
        r5 = r5 + r9;
        goto L_0x0ace;
    L_0x0abe:
        r4 = 0;
        r18 = 0;
        r11 = r12 & r16;
        if (r11 == 0) goto L_0x0ace;
    L_0x0ac5:
        r9 = r2.getLong(r1, r9);
        r9 = com.google.android.gms.internal.measurement.zzut.m22565d(r14, r9);
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
        r10 = com.google.android.gms.internal.measurement.zzut.m22549b(r14, r9);
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
        r13 = com.google.android.gms.internal.measurement.zzut.m22548b(r14, r10);
        r5 = r5 + r13;
    L_0x0aef:
        r3 = r3 + 3;
        r9 = r18;
        r4 = 0;
        r11 = 0;
        goto L_0x0566;
    L_0x0af7:
        r2 = r0.f17466q;
        r2 = m22345a(r2, r1);
        r5 = r5 + r2;
        r2 = r0.f17457h;
        if (r2 == 0) goto L_0x0b0d;
    L_0x0b02:
        r2 = r0.f17467r;
        r1 = r2.mo3038a(r1);
        r1 = r1.m11536h();
        r5 = r5 + r1;
    L_0x0b0d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ck.b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m22345a(dl<UT, UB> dlVar, T t) {
        return dlVar.mo3097f(dlVar.mo3089b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m22351a(Object obj, long j) {
        return (List) dp.m11773f(obj, j);
    }

    /* renamed from: a */
    public final void mo3066a(T t, dx dxVar) {
        bl a;
        Iterator f;
        Entry entry;
        int length;
        int i;
        if (dxVar.mo2996a() == zze.f10277k) {
            int d;
            m22353a(this.f17466q, (Object) t, dxVar);
            if (this.f17457h) {
                a = this.f17467r.mo3038a((Object) t);
                if (!a.m11530b()) {
                    f = a.m11534f();
                    entry = (Entry) f.next();
                    for (length = this.f17452c.length - 3; length >= 0; length -= 3) {
                        d = m22370d(length);
                        i = this.f17452c[length];
                        while (entry != null && this.f17467r.mo3037a(entry) > i) {
                            this.f17467r.mo3042a(dxVar, entry);
                            entry = f.hasNext() ? (Entry) f.next() : null;
                        }
                        switch ((d & 267386880) >>> 20) {
                            case 0:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo2998a(i, dp.m11770e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 1:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo2999a(i, dp.m11766d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 2:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3001a(i, dp.m11757b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 3:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3019c(i, dp.m11757b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 4:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3018c(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 5:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3022d(i, dp.m11757b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 6:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3021d(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 7:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3010a(i, dp.m11765c(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 8:
                                if (!m22357a((Object) t, length)) {
                                    m22352a(i, dp.m11773f(t, (long) (d & 1048575)), dxVar);
                                    break;
                                }
                                break;
                            case 9:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3005a(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                                    break;
                                }
                                break;
                            case 10:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3003a(i, (zzud) dp.m11773f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 11:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3024e(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 12:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3012b(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 13:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3000a(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 14:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3013b(i, dp.m11757b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 15:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3027f(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 16:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3025e(i, dp.m11757b(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 17:
                                if (!m22357a((Object) t, length)) {
                                    dxVar.mo3014b(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                                    break;
                                }
                                break;
                            case 18:
                                cw.m11637a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 19:
                                cw.m11650b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 20:
                                cw.m11654c(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 21:
                                cw.m11658d(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 22:
                                cw.m11671h(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 23:
                                cw.m11665f(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 24:
                                cw.m11678k(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 25:
                                cw.m11681n(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 26:
                                cw.m11635a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar);
                                break;
                            case 27:
                                cw.m11636a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, m22347a(length));
                                break;
                            case 28:
                                cw.m11648b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar);
                                break;
                            case 29:
                                cw.m11674i(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 30:
                                cw.m11680m(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 31:
                                cw.m11679l(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 32:
                                cw.m11668g(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 33:
                                cw.m11677j(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 34:
                                cw.m11662e(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                                break;
                            case 35:
                                cw.m11637a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 36:
                                cw.m11650b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 37:
                                cw.m11654c(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 38:
                                cw.m11658d(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 39:
                                cw.m11671h(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 40:
                                cw.m11665f(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 41:
                                cw.m11678k(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 42:
                                cw.m11681n(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 43:
                                cw.m11674i(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 44:
                                cw.m11680m(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 45:
                                cw.m11679l(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 46:
                                cw.m11668g(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 47:
                                cw.m11677j(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 48:
                                cw.m11662e(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                                break;
                            case 49:
                                cw.m11649b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, m22347a(length));
                                break;
                            case 50:
                                m22354a(dxVar, i, dp.m11773f(t, (long) (d & 1048575)), length);
                                break;
                            case 51:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo2998a(i, m22361b((Object) t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 52:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo2999a(i, m22367c(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 53:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3001a(i, m22373e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 54:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3019c(i, m22373e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 55:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3018c(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 56:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3022d(i, m22373e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 57:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3021d(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 58:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3010a(i, m22375f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 59:
                                if (!m22358a((Object) t, i, length)) {
                                    m22352a(i, dp.m11773f(t, (long) (d & 1048575)), dxVar);
                                    break;
                                }
                                break;
                            case 60:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3005a(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                                    break;
                                }
                                break;
                            case 61:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3003a(i, (zzud) dp.m11773f(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 62:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3024e(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 63:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3012b(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 64:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3000a(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 65:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3013b(i, m22373e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 66:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3027f(i, m22371d(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 67:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3025e(i, m22373e(t, (long) (d & 1048575)));
                                    break;
                                }
                                break;
                            case 68:
                                if (!m22358a((Object) t, i, length)) {
                                    dxVar.mo3014b(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    while (entry != null) {
                        this.f17467r.mo3042a(dxVar, entry);
                        entry = f.hasNext() == null ? (Entry) f.next() : null;
                    }
                }
            }
            f = null;
            entry = f;
            for (length = this.f17452c.length - 3; length >= 0; length -= 3) {
                d = m22370d(length);
                i = this.f17452c[length];
                while (entry != null) {
                    this.f17467r.mo3042a(dxVar, entry);
                    if (f.hasNext()) {
                    }
                }
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo2998a(i, dp.m11770e(t, (long) (d & 1048575)));
                        break;
                    case 1:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo2999a(i, dp.m11766d(t, (long) (d & 1048575)));
                        break;
                    case 2:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3001a(i, dp.m11757b(t, (long) (d & 1048575)));
                        break;
                    case 3:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3019c(i, dp.m11757b(t, (long) (d & 1048575)));
                        break;
                    case 4:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3018c(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 5:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3022d(i, dp.m11757b(t, (long) (d & 1048575)));
                        break;
                    case 6:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3021d(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 7:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3010a(i, dp.m11765c(t, (long) (d & 1048575)));
                        break;
                    case 8:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        m22352a(i, dp.m11773f(t, (long) (d & 1048575)), dxVar);
                        break;
                    case 9:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3005a(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                        break;
                    case 10:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3003a(i, (zzud) dp.m11773f(t, (long) (d & 1048575)));
                        break;
                    case 11:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3024e(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 12:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3012b(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 13:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3000a(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 14:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3013b(i, dp.m11757b(t, (long) (d & 1048575)));
                        break;
                    case 15:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3027f(i, dp.m11742a((Object) t, (long) (d & 1048575)));
                        break;
                    case 16:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3025e(i, dp.m11757b(t, (long) (d & 1048575)));
                        break;
                    case 17:
                        if (!m22357a((Object) t, length)) {
                            break;
                        }
                        dxVar.mo3014b(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                        break;
                    case 18:
                        cw.m11637a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 19:
                        cw.m11650b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 20:
                        cw.m11654c(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 21:
                        cw.m11658d(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 22:
                        cw.m11671h(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 23:
                        cw.m11665f(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 24:
                        cw.m11678k(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 25:
                        cw.m11681n(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 26:
                        cw.m11635a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar);
                        break;
                    case 27:
                        cw.m11636a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, m22347a(length));
                        break;
                    case 28:
                        cw.m11648b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar);
                        break;
                    case 29:
                        cw.m11674i(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 30:
                        cw.m11680m(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 31:
                        cw.m11679l(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 32:
                        cw.m11668g(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 33:
                        cw.m11677j(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 34:
                        cw.m11662e(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, false);
                        break;
                    case 35:
                        cw.m11637a(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 36:
                        cw.m11650b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 37:
                        cw.m11654c(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 38:
                        cw.m11658d(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 39:
                        cw.m11671h(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 40:
                        cw.m11665f(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 41:
                        cw.m11678k(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 42:
                        cw.m11681n(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 43:
                        cw.m11674i(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 44:
                        cw.m11680m(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 45:
                        cw.m11679l(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 46:
                        cw.m11668g(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 47:
                        cw.m11677j(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 48:
                        cw.m11662e(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, true);
                        break;
                    case 49:
                        cw.m11649b(this.f17452c[length], (List) dp.m11773f(t, (long) (d & 1048575)), dxVar, m22347a(length));
                        break;
                    case 50:
                        m22354a(dxVar, i, dp.m11773f(t, (long) (d & 1048575)), length);
                        break;
                    case 51:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo2998a(i, m22361b((Object) t, (long) (d & 1048575)));
                        break;
                    case 52:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo2999a(i, m22367c(t, (long) (d & 1048575)));
                        break;
                    case 53:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3001a(i, m22373e(t, (long) (d & 1048575)));
                        break;
                    case 54:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3019c(i, m22373e(t, (long) (d & 1048575)));
                        break;
                    case 55:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3018c(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 56:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3022d(i, m22373e(t, (long) (d & 1048575)));
                        break;
                    case 57:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3021d(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 58:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3010a(i, m22375f(t, (long) (d & 1048575)));
                        break;
                    case 59:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        m22352a(i, dp.m11773f(t, (long) (d & 1048575)), dxVar);
                        break;
                    case 60:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3005a(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                        break;
                    case 61:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3003a(i, (zzud) dp.m11773f(t, (long) (d & 1048575)));
                        break;
                    case 62:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3024e(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 63:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3012b(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 64:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3000a(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 65:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3013b(i, m22373e(t, (long) (d & 1048575)));
                        break;
                    case 66:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3027f(i, m22371d(t, (long) (d & 1048575)));
                        break;
                    case 67:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3025e(i, m22373e(t, (long) (d & 1048575)));
                        break;
                    case 68:
                        if (!m22358a((Object) t, i, length)) {
                            break;
                        }
                        dxVar.mo3014b(i, dp.m11773f(t, (long) (d & 1048575)), m22347a(length));
                        break;
                    default:
                        break;
                }
            }
            while (entry != null) {
                this.f17467r.mo3042a(dxVar, entry);
                if (f.hasNext() == null) {
                }
            }
        } else if (this.f17459j) {
            Entry entry2;
            int i2;
            int i3;
            if (this.f17457h) {
                a = this.f17467r.mo3038a((Object) t);
                if (!a.m11530b()) {
                    f = a.m11533e();
                    entry = (Entry) f.next();
                    length = this.f17452c.length;
                    entry2 = entry;
                    for (i2 = 0; i2 < length; i2 += 3) {
                        i = m22370d(i2);
                        i3 = this.f17452c[i2];
                        while (entry2 != null && this.f17467r.mo3037a(entry2) <= i3) {
                            this.f17467r.mo3042a(dxVar, entry2);
                            entry2 = f.hasNext() ? (Entry) f.next() : null;
                        }
                        switch ((i & 267386880) >>> 20) {
                            case 0:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo2998a(i3, dp.m11770e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 1:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo2999a(i3, dp.m11766d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 2:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3001a(i3, dp.m11757b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 3:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3019c(i3, dp.m11757b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 4:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3018c(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 5:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3022d(i3, dp.m11757b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 6:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3021d(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 7:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3010a(i3, dp.m11765c(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 8:
                                if (!m22357a((Object) t, i2)) {
                                    m22352a(i3, dp.m11773f(t, (long) (i & 1048575)), dxVar);
                                    break;
                                }
                                break;
                            case 9:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3005a(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                                    break;
                                }
                                break;
                            case 10:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3003a(i3, (zzud) dp.m11773f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 11:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3024e(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 12:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3012b(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 13:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3000a(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 14:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3013b(i3, dp.m11757b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 15:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3027f(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 16:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3025e(i3, dp.m11757b(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 17:
                                if (!m22357a((Object) t, i2)) {
                                    dxVar.mo3014b(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                                    break;
                                }
                                break;
                            case 18:
                                cw.m11637a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 19:
                                cw.m11650b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 20:
                                cw.m11654c(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 21:
                                cw.m11658d(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 22:
                                cw.m11671h(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 23:
                                cw.m11665f(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 24:
                                cw.m11678k(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 25:
                                cw.m11681n(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 26:
                                cw.m11635a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar);
                                break;
                            case 27:
                                cw.m11636a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, m22347a(i2));
                                break;
                            case 28:
                                cw.m11648b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar);
                                break;
                            case 29:
                                cw.m11674i(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 30:
                                cw.m11680m(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 31:
                                cw.m11679l(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 32:
                                cw.m11668g(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 33:
                                cw.m11677j(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 34:
                                cw.m11662e(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                                break;
                            case 35:
                                cw.m11637a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 36:
                                cw.m11650b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 37:
                                cw.m11654c(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 38:
                                cw.m11658d(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 39:
                                cw.m11671h(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 40:
                                cw.m11665f(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 41:
                                cw.m11678k(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 42:
                                cw.m11681n(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 43:
                                cw.m11674i(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 44:
                                cw.m11680m(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 45:
                                cw.m11679l(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 46:
                                cw.m11668g(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 47:
                                cw.m11677j(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 48:
                                cw.m11662e(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                                break;
                            case 49:
                                cw.m11649b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, m22347a(i2));
                                break;
                            case 50:
                                m22354a(dxVar, i3, dp.m11773f(t, (long) (i & 1048575)), i2);
                                break;
                            case 51:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo2998a(i3, m22361b((Object) t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 52:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo2999a(i3, m22367c(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 53:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3001a(i3, m22373e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 54:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3019c(i3, m22373e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 55:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3018c(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 56:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3022d(i3, m22373e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 57:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3021d(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 58:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3010a(i3, m22375f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 59:
                                if (!m22358a((Object) t, i3, i2)) {
                                    m22352a(i3, dp.m11773f(t, (long) (i & 1048575)), dxVar);
                                    break;
                                }
                                break;
                            case 60:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3005a(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                                    break;
                                }
                                break;
                            case 61:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3003a(i3, (zzud) dp.m11773f(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 62:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3024e(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 63:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3012b(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 64:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3000a(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 65:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3013b(i3, m22373e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 66:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3027f(i3, m22371d(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 67:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3025e(i3, m22373e(t, (long) (i & 1048575)));
                                    break;
                                }
                                break;
                            case 68:
                                if (!m22358a((Object) t, i3, i2)) {
                                    dxVar.mo3014b(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    while (entry2 != null) {
                        this.f17467r.mo3042a(dxVar, entry2);
                        entry2 = f.hasNext() ? (Entry) f.next() : null;
                    }
                    m22353a(this.f17466q, (Object) t, dxVar);
                }
            }
            f = null;
            entry = f;
            length = this.f17452c.length;
            entry2 = entry;
            for (i2 = 0; i2 < length; i2 += 3) {
                i = m22370d(i2);
                i3 = this.f17452c[i2];
                while (entry2 != null) {
                    this.f17467r.mo3042a(dxVar, entry2);
                    if (f.hasNext()) {
                    }
                }
                switch ((i & 267386880) >>> 20) {
                    case 0:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo2998a(i3, dp.m11770e(t, (long) (i & 1048575)));
                        break;
                    case 1:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo2999a(i3, dp.m11766d(t, (long) (i & 1048575)));
                        break;
                    case 2:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3001a(i3, dp.m11757b(t, (long) (i & 1048575)));
                        break;
                    case 3:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3019c(i3, dp.m11757b(t, (long) (i & 1048575)));
                        break;
                    case 4:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3018c(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 5:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3022d(i3, dp.m11757b(t, (long) (i & 1048575)));
                        break;
                    case 6:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3021d(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 7:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3010a(i3, dp.m11765c(t, (long) (i & 1048575)));
                        break;
                    case 8:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        m22352a(i3, dp.m11773f(t, (long) (i & 1048575)), dxVar);
                        break;
                    case 9:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3005a(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                        break;
                    case 10:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3003a(i3, (zzud) dp.m11773f(t, (long) (i & 1048575)));
                        break;
                    case 11:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3024e(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 12:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3012b(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 13:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3000a(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 14:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3013b(i3, dp.m11757b(t, (long) (i & 1048575)));
                        break;
                    case 15:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3027f(i3, dp.m11742a((Object) t, (long) (i & 1048575)));
                        break;
                    case 16:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3025e(i3, dp.m11757b(t, (long) (i & 1048575)));
                        break;
                    case 17:
                        if (!m22357a((Object) t, i2)) {
                            break;
                        }
                        dxVar.mo3014b(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                        break;
                    case 18:
                        cw.m11637a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 19:
                        cw.m11650b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 20:
                        cw.m11654c(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 21:
                        cw.m11658d(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 22:
                        cw.m11671h(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 23:
                        cw.m11665f(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 24:
                        cw.m11678k(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 25:
                        cw.m11681n(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 26:
                        cw.m11635a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar);
                        break;
                    case 27:
                        cw.m11636a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, m22347a(i2));
                        break;
                    case 28:
                        cw.m11648b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar);
                        break;
                    case 29:
                        cw.m11674i(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 30:
                        cw.m11680m(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 31:
                        cw.m11679l(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 32:
                        cw.m11668g(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 33:
                        cw.m11677j(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 34:
                        cw.m11662e(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, false);
                        break;
                    case 35:
                        cw.m11637a(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 36:
                        cw.m11650b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 37:
                        cw.m11654c(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 38:
                        cw.m11658d(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 39:
                        cw.m11671h(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 40:
                        cw.m11665f(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 41:
                        cw.m11678k(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 42:
                        cw.m11681n(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 43:
                        cw.m11674i(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 44:
                        cw.m11680m(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 45:
                        cw.m11679l(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 46:
                        cw.m11668g(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 47:
                        cw.m11677j(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 48:
                        cw.m11662e(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, true);
                        break;
                    case 49:
                        cw.m11649b(this.f17452c[i2], (List) dp.m11773f(t, (long) (i & 1048575)), dxVar, m22347a(i2));
                        break;
                    case 50:
                        m22354a(dxVar, i3, dp.m11773f(t, (long) (i & 1048575)), i2);
                        break;
                    case 51:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo2998a(i3, m22361b((Object) t, (long) (i & 1048575)));
                        break;
                    case 52:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo2999a(i3, m22367c(t, (long) (i & 1048575)));
                        break;
                    case 53:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3001a(i3, m22373e(t, (long) (i & 1048575)));
                        break;
                    case 54:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3019c(i3, m22373e(t, (long) (i & 1048575)));
                        break;
                    case 55:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3018c(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 56:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3022d(i3, m22373e(t, (long) (i & 1048575)));
                        break;
                    case 57:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3021d(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 58:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3010a(i3, m22375f(t, (long) (i & 1048575)));
                        break;
                    case 59:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        m22352a(i3, dp.m11773f(t, (long) (i & 1048575)), dxVar);
                        break;
                    case 60:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3005a(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                        break;
                    case 61:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3003a(i3, (zzud) dp.m11773f(t, (long) (i & 1048575)));
                        break;
                    case 62:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3024e(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 63:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3012b(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 64:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3000a(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 65:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3013b(i3, m22373e(t, (long) (i & 1048575)));
                        break;
                    case 66:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3027f(i3, m22371d(t, (long) (i & 1048575)));
                        break;
                    case 67:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3025e(i3, m22373e(t, (long) (i & 1048575)));
                        break;
                    case 68:
                        if (!m22358a((Object) t, i3, i2)) {
                            break;
                        }
                        dxVar.mo3014b(i3, dp.m11773f(t, (long) (i & 1048575)), m22347a(i2));
                        break;
                    default:
                        break;
                }
            }
            while (entry2 != null) {
                this.f17467r.mo3042a(dxVar, entry2);
                if (f.hasNext()) {
                }
            }
            m22353a(this.f17466q, (Object) t, dxVar);
        } else {
            m22365b((Object) t, dxVar);
        }
    }

    /* renamed from: b */
    private final void m22365b(T t, dx dxVar) {
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
        dx dxVar2 = dxVar;
        if (this.f17457h) {
            bl a = r0.f17467r.mo3038a(obj);
            if (!a.m11530b()) {
                e = a.m11533e();
                entry = (Entry) e.next();
                i = -1;
                length = r0.f17452c.length;
                unsafe = f17451b;
                entry2 = entry;
                i2 = 0;
                for (i3 = 0; i3 < length; i3 = d + 3) {
                    d = m22370d(i3);
                    i4 = r0.f17452c[i3];
                    i5 = (267386880 & d) >>> 20;
                    if (!r0.f17459j || i5 > 17) {
                        i6 = i3;
                        i7 = 0;
                    } else {
                        int i8 = r0.f17452c[i3 + 2];
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
                    while (entry2 != null && r0.f17467r.mo3037a(entry2) <= i4) {
                        r0.f17467r.mo3042a(dxVar2, entry2);
                        entry2 = e.hasNext() ? (Entry) e.next() : null;
                    }
                    j = (long) (d & 1048575);
                    switch (i5) {
                        case 0:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                break;
                            }
                            dxVar2.mo2998a(i4, dp.m11770e(obj, j));
                            continue;
                            continue;
                        case 1:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo2999a(i4, dp.m11766d(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 2:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3001a(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 3:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3019c(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 4:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3018c(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 5:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3022d(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 6:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3021d(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 7:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3010a(i4, dp.m11765c(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 8:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                m22352a(i4, unsafe.getObject(obj, j), dxVar2);
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 9:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3005a(i4, unsafe.getObject(obj, j), m22347a(d));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 10:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3003a(i4, (zzud) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 11:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3024e(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 12:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3012b(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 13:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3000a(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 14:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3013b(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 15:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3027f(i4, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 16:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3025e(i4, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 17:
                            d = i6;
                            if ((i7 & i2) != 0) {
                                dxVar2.mo3014b(i4, unsafe.getObject(obj, j), m22347a(d));
                                break;
                            } else {
                                continue;
                                continue;
                            }
                        case 18:
                            d = i6;
                            cw.m11637a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 19:
                            d = i6;
                            cw.m11650b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 20:
                            d = i6;
                            cw.m11654c(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 21:
                            d = i6;
                            cw.m11658d(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 22:
                            d = i6;
                            cw.m11671h(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 23:
                            d = i6;
                            cw.m11665f(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 24:
                            d = i6;
                            cw.m11678k(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 25:
                            d = i6;
                            cw.m11681n(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            continue;
                            continue;
                        case 26:
                            d = i6;
                            cw.m11635a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2);
                            break;
                        case 27:
                            d = i6;
                            cw.m11636a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, m22347a(d));
                            break;
                        case 28:
                            d = i6;
                            cw.m11648b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2);
                            break;
                        case 29:
                            d = i6;
                            cw.m11674i(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 30:
                            d = i6;
                            cw.m11680m(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 31:
                            d = i6;
                            cw.m11679l(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 32:
                            d = i6;
                            cw.m11668g(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 33:
                            d = i6;
                            cw.m11677j(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 34:
                            d = i6;
                            cw.m11662e(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                            break;
                        case 35:
                            d = i6;
                            cw.m11637a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 36:
                            d = i6;
                            cw.m11650b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 37:
                            d = i6;
                            cw.m11654c(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 38:
                            d = i6;
                            cw.m11658d(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 39:
                            d = i6;
                            cw.m11671h(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 40:
                            d = i6;
                            cw.m11665f(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 41:
                            d = i6;
                            cw.m11678k(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 42:
                            d = i6;
                            cw.m11681n(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 43:
                            d = i6;
                            cw.m11674i(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 44:
                            d = i6;
                            cw.m11680m(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 45:
                            d = i6;
                            cw.m11679l(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 46:
                            d = i6;
                            cw.m11668g(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 47:
                            d = i6;
                            cw.m11677j(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 48:
                            d = i6;
                            cw.m11662e(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                            break;
                        case 49:
                            d = i6;
                            cw.m11649b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, m22347a(d));
                            break;
                        case 50:
                            d = i6;
                            m22354a(dxVar2, i4, unsafe.getObject(obj, j), d);
                            break;
                        case 51:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo2998a(i4, m22361b(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo2999a(i4, m22367c(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3001a(i4, m22373e(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3019c(i4, m22373e(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3018c(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3022d(i4, m22373e(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3021d(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3010a(i4, m22375f(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                m22352a(i4, unsafe.getObject(obj, j), dxVar2);
                                break;
                            }
                            break;
                        case 60:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3005a(i4, unsafe.getObject(obj, j), m22347a(d));
                                break;
                            }
                            break;
                        case 61:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3003a(i4, (zzud) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3024e(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3012b(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3000a(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3013b(i4, m22373e(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3027f(i4, m22371d(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3025e(i4, m22373e(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            d = i6;
                            if (m22358a(obj, i4, d)) {
                                dxVar2.mo3014b(i4, unsafe.getObject(obj, j), m22347a(d));
                                break;
                            }
                            break;
                        default:
                            d = i6;
                            break;
                    }
                }
                while (entry2 != null) {
                    r0.f17467r.mo3042a(dxVar2, entry2);
                    entry2 = e.hasNext() ? (Entry) e.next() : null;
                }
                m22353a(r0.f17466q, obj, dxVar2);
            }
        }
        e = null;
        entry = null;
        i = -1;
        length = r0.f17452c.length;
        unsafe = f17451b;
        entry2 = entry;
        i2 = 0;
        while (i3 < length) {
            d = m22370d(i3);
            i4 = r0.f17452c[i3];
            i5 = (267386880 & d) >>> 20;
            if (r0.f17459j) {
            }
            i6 = i3;
            i7 = 0;
            while (entry2 != null) {
                r0.f17467r.mo3042a(dxVar2, entry2);
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
                    dxVar2.mo2998a(i4, dp.m11770e(obj, j));
                    continue;
                    continue;
                case 1:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo2999a(i4, dp.m11766d(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 2:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3001a(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 3:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3019c(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 4:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3018c(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 5:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3022d(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 6:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3021d(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 7:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3010a(i4, dp.m11765c(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 8:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        m22352a(i4, unsafe.getObject(obj, j), dxVar2);
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 9:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3005a(i4, unsafe.getObject(obj, j), m22347a(d));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 10:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3003a(i4, (zzud) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 11:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3024e(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 12:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3012b(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 13:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3000a(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 14:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3013b(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 15:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3027f(i4, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 16:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3025e(i4, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 17:
                    d = i6;
                    if ((i7 & i2) != 0) {
                        dxVar2.mo3014b(i4, unsafe.getObject(obj, j), m22347a(d));
                        break;
                    } else {
                        continue;
                        continue;
                    }
                case 18:
                    d = i6;
                    cw.m11637a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 19:
                    d = i6;
                    cw.m11650b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 20:
                    d = i6;
                    cw.m11654c(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 21:
                    d = i6;
                    cw.m11658d(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 22:
                    d = i6;
                    cw.m11671h(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 23:
                    d = i6;
                    cw.m11665f(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 24:
                    d = i6;
                    cw.m11678k(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 25:
                    d = i6;
                    cw.m11681n(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    continue;
                    continue;
                case 26:
                    d = i6;
                    cw.m11635a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2);
                    break;
                case 27:
                    d = i6;
                    cw.m11636a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, m22347a(d));
                    break;
                case 28:
                    d = i6;
                    cw.m11648b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2);
                    break;
                case 29:
                    d = i6;
                    cw.m11674i(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 30:
                    d = i6;
                    cw.m11680m(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 31:
                    d = i6;
                    cw.m11679l(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 32:
                    d = i6;
                    cw.m11668g(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 33:
                    d = i6;
                    cw.m11677j(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 34:
                    d = i6;
                    cw.m11662e(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, false);
                    break;
                case 35:
                    d = i6;
                    cw.m11637a(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 36:
                    d = i6;
                    cw.m11650b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 37:
                    d = i6;
                    cw.m11654c(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 38:
                    d = i6;
                    cw.m11658d(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 39:
                    d = i6;
                    cw.m11671h(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 40:
                    d = i6;
                    cw.m11665f(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 41:
                    d = i6;
                    cw.m11678k(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 42:
                    d = i6;
                    cw.m11681n(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 43:
                    d = i6;
                    cw.m11674i(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 44:
                    d = i6;
                    cw.m11680m(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 45:
                    d = i6;
                    cw.m11679l(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 46:
                    d = i6;
                    cw.m11668g(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 47:
                    d = i6;
                    cw.m11677j(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 48:
                    d = i6;
                    cw.m11662e(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, true);
                    break;
                case 49:
                    d = i6;
                    cw.m11649b(r0.f17452c[d], (List) unsafe.getObject(obj, j), dxVar2, m22347a(d));
                    break;
                case 50:
                    d = i6;
                    m22354a(dxVar2, i4, unsafe.getObject(obj, j), d);
                    break;
                case 51:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo2998a(i4, m22361b(obj, j));
                        break;
                    }
                    break;
                case 52:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo2999a(i4, m22367c(obj, j));
                        break;
                    }
                    break;
                case 53:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3001a(i4, m22373e(obj, j));
                        break;
                    }
                    break;
                case 54:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3019c(i4, m22373e(obj, j));
                        break;
                    }
                    break;
                case 55:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3018c(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 56:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3022d(i4, m22373e(obj, j));
                        break;
                    }
                    break;
                case 57:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3021d(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 58:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3010a(i4, m22375f(obj, j));
                        break;
                    }
                    break;
                case 59:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        m22352a(i4, unsafe.getObject(obj, j), dxVar2);
                        break;
                    }
                    break;
                case 60:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3005a(i4, unsafe.getObject(obj, j), m22347a(d));
                        break;
                    }
                    break;
                case 61:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3003a(i4, (zzud) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3024e(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 63:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3012b(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 64:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3000a(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 65:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3013b(i4, m22373e(obj, j));
                        break;
                    }
                    break;
                case 66:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3027f(i4, m22371d(obj, j));
                        break;
                    }
                    break;
                case 67:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3025e(i4, m22373e(obj, j));
                        break;
                    }
                    break;
                case 68:
                    d = i6;
                    if (m22358a(obj, i4, d)) {
                        dxVar2.mo3014b(i4, unsafe.getObject(obj, j), m22347a(d));
                        break;
                    }
                    break;
                default:
                    d = i6;
                    break;
            }
        }
        while (entry2 != null) {
            r0.f17467r.mo3042a(dxVar2, entry2);
            if (e.hasNext()) {
            }
        }
        m22353a(r0.f17466q, obj, dxVar2);
    }

    /* renamed from: a */
    private final <K, V> void m22354a(dx dxVar, int i, Object obj, int i2) {
        if (obj != null) {
            dxVar.mo3002a(i, this.f17468s.mo3062f(m22362b(i2)), this.f17468s.mo3058b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m22353a(dl<UT, UB> dlVar, T t, dx dxVar) {
        dlVar.mo3086a(dlVar.mo3089b(t), dxVar);
    }

    /* renamed from: a */
    private final cu m22347a(int i) {
        i = (i / 3) << 1;
        cu cuVar = (cu) this.f17453d[i];
        if (cuVar != null) {
            return cuVar;
        }
        cuVar = cq.m11570a().m11572a((Class) this.f17453d[i + 1]);
        this.f17453d[i] = cuVar;
        return cuVar;
    }

    /* renamed from: b */
    private final Object m22362b(int i) {
        return this.f17453d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final zzvr m22368c(int i) {
        return (zzvr) this.f17453d[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo3070c(T t) {
        int i;
        for (i = this.f17462m; i < this.f17463n; i++) {
            long d = (long) (m22370d(this.f17461l[i]) & 1048575);
            Object f = dp.m11773f(t, d);
            if (f != null) {
                dp.m11751a((Object) t, d, this.f17468s.mo3060d(f));
            }
        }
        i = this.f17461l.length;
        for (int i2 = this.f17463n; i2 < i; i2++) {
            this.f17465p.mo3052b(t, (long) this.f17461l[i2]);
        }
        this.f17466q.mo3095d(t);
        if (this.f17457h) {
            this.f17467r.mo3047c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m22349a(Object obj, int i, UB ub, dl<UT, UB> dlVar) {
        int i2 = this.f17452c[i];
        obj = dp.m11773f(obj, (long) (m22370d(i) & 1048575));
        if (obj == null) {
            return ub;
        }
        zzvr c = m22368c(i);
        if (c == null) {
            return ub;
        }
        return m22348a(i, i2, this.f17468s.mo3057a(obj), c, ub, dlVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m22348a(int i, int i2, Map<K, V> map, zzvr zzvr, UB ub, dl<UT, UB> dlVar) {
        i = this.f17468s.mo3062f(m22362b(i));
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (!zzvr.mo2920a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = dlVar.mo3080a();
                }
                ay b = zzud.m12011b(zzwl.m12099a(i, entry.getKey(), entry.getValue()));
                try {
                    zzwl.m12100a(b.m11498b(), i, entry.getKey(), entry.getValue());
                    dlVar.mo3084a((Object) ub, i2, b.m11497a());
                    map.remove();
                } catch (int i3) {
                    throw new RuntimeException(i3);
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    public final boolean mo3071d(T t) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f17462m) {
                return (this.f17457h && this.f17467r.mo3038a((Object) t).m11535g() == null) ? false : true;
            } else {
                int i4;
                int i5;
                int i6 = this.f17461l[i];
                int i7 = this.f17452c[i6];
                int d = m22370d(i6);
                if (this.f17459j) {
                    i4 = 0;
                } else {
                    i4 = this.f17452c[i6 + 2];
                    i5 = i4 & 1048575;
                    i4 = 1 << (i4 >>> 20);
                    if (i5 != i2) {
                        i3 = f17451b.getInt(t, (long) i5);
                        i2 = i5;
                    }
                }
                if (((268435456 & d) != 0 ? 1 : null) != null && !m22359a((Object) t, i6, i3, i4)) {
                    return false;
                }
                i5 = (267386880 & d) >>> 20;
                if (i5 != 9 && i5 != 17) {
                    cu cuVar;
                    if (i5 != 27) {
                        if (i5 != 60 && i5 != 68) {
                            switch (i5) {
                                case 49:
                                    break;
                                case 50:
                                    Map b = this.f17468s.mo3058b(dp.m11773f(t, (long) (d & 1048575)));
                                    if (!b.isEmpty()) {
                                        if (this.f17468s.mo3062f(m22362b(i6)).f10063c.m12122a() == zzyv.MESSAGE) {
                                            cuVar = null;
                                            for (Object next : b.values()) {
                                                if (cuVar == null) {
                                                    cuVar = cq.m11570a().m11572a(next.getClass());
                                                }
                                                if (!cuVar.mo3071d(next)) {
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
                        } else if (m22358a((Object) t, i7, i6) && !m22360a((Object) t, d, m22347a(i6))) {
                            return false;
                        }
                    }
                    List list = (List) dp.m11773f(t, (long) (d & 1048575));
                    if (!list.isEmpty()) {
                        cuVar = m22347a(i6);
                        d = 0;
                        while (d < list.size()) {
                            if (cuVar.mo3071d(list.get(d))) {
                                d++;
                            } else {
                                z = false;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else if (m22359a((Object) t, i6, i3, i4) && !m22360a((Object) t, d, m22347a(i6))) {
                    return false;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private static boolean m22360a(Object obj, int i, cu cuVar) {
        return cuVar.mo3071d(dp.m11773f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m22352a(int i, Object obj, dx dxVar) {
        if (obj instanceof String) {
            dxVar.mo3006a(i, (String) obj);
        } else {
            dxVar.mo3003a(i, (zzud) obj);
        }
    }

    /* renamed from: a */
    private final void m22355a(Object obj, int i, ct ctVar) {
        if (m22374f(i)) {
            dp.m11751a(obj, (long) (i & 1048575), ctVar.mo2983m());
        } else if (this.f17458i) {
            dp.m11751a(obj, (long) (i & 1048575), ctVar.mo2981l());
        } else {
            dp.m11751a(obj, (long) (i & 1048575), ctVar.mo2985n());
        }
    }

    /* renamed from: d */
    private final int m22370d(int i) {
        return this.f17452c[i + 1];
    }

    /* renamed from: e */
    private final int m22372e(int i) {
        return this.f17452c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m22361b(T t, long j) {
        return ((Double) dp.m11773f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m22367c(T t, long j) {
        return ((Float) dp.m11773f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m22371d(T t, long j) {
        return ((Integer) dp.m11773f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m22373e(T t, long j) {
        return ((Long) dp.m11773f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m22375f(T t, long j) {
        return ((Boolean) dp.m11773f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m22369c(T t, T t2, int i) {
        return m22357a((Object) t, i) == m22357a((Object) t2, i) ? true : null;
    }

    /* renamed from: a */
    private final boolean m22359a(T t, int i, int i2, int i3) {
        if (this.f17459j) {
            return m22357a((Object) t, i);
        }
        return (i2 & i3) != null ? true : null;
    }

    /* renamed from: a */
    private final boolean m22357a(T t, int i) {
        if (this.f17459j) {
            i = m22370d(i);
            long j = (long) (i & 1048575);
            switch ((i & 267386880) >>> 20) {
                case 0:
                    return dp.m11770e(t, j) != null;
                case 1:
                    return dp.m11766d(t, j) != null;
                case 2:
                    return dp.m11757b(t, j) != null;
                case 3:
                    return dp.m11757b(t, j) != null;
                case 4:
                    return dp.m11742a((Object) t, j) != null;
                case 5:
                    return dp.m11757b(t, j) != null;
                case 6:
                    return dp.m11742a((Object) t, j) != null;
                case 7:
                    return dp.m11765c(t, j);
                case 8:
                    t = dp.m11773f(t, j);
                    if ((t instanceof String) != 0) {
                        return ((String) t).isEmpty() == null;
                    } else {
                        if ((t instanceof zzud) != 0) {
                            return zzud.f10195a.equals(t) == null;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                case 9:
                    return dp.m11773f(t, j) != null;
                case 10:
                    return zzud.f10195a.equals(dp.m11773f(t, j)) == null;
                case 11:
                    return dp.m11742a((Object) t, j) != null;
                case 12:
                    return dp.m11742a((Object) t, j) != null;
                case 13:
                    return dp.m11742a((Object) t, j) != null;
                case 14:
                    return dp.m11757b(t, j) != null;
                case 15:
                    return dp.m11742a((Object) t, j) != null;
                case 16:
                    return dp.m11757b(t, j) != null;
                case 17:
                    return dp.m11773f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        i = m22372e(i);
        return (dp.m11742a((Object) t, (long) (i & 1048575)) & (1 << (i >>> 20))) != null;
    }

    /* renamed from: b */
    private final void m22363b(T t, int i) {
        if (!this.f17459j) {
            i = m22372e(i);
            long j = (long) (i & 1048575);
            dp.m11749a((Object) t, j, dp.m11742a((Object) t, j) | (1 << (i >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m22358a(T t, int i, int i2) {
        return dp.m11742a((Object) t, (long) (m22372e(i2) & 1048575)) == i ? true : null;
    }

    /* renamed from: b */
    private final void m22364b(T t, int i, int i2) {
        dp.m11749a((Object) t, (long) (m22372e(i2) & 1048575), i);
    }
}
