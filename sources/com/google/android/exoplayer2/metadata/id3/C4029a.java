package com.google.android.exoplayer2.metadata.id3;

import android.util.Log;
import com.google.android.exoplayer2.metadata.C2284a;
import com.google.android.exoplayer2.metadata.C4690c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.metadata.id3.a */
public final class C4029a implements C2284a {
    /* renamed from: a */
    public static final int f16207a = C2186s.m8062e("ID3");
    /* renamed from: b */
    private final C2297a f16208b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$a */
    public interface C2297a {
        /* renamed from: a */
        boolean mo1622a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$b */
    private static final class C2298b {
        /* renamed from: a */
        private final int f7245a;
        /* renamed from: b */
        private final boolean f7246b;
        /* renamed from: c */
        private final int f7247c;

        public C2298b(int i, boolean z, int i2) {
            this.f7245a = i;
            this.f7246b = z;
            this.f7247c = i2;
        }
    }

    /* renamed from: a */
    private static String m20186a(int i) {
        switch (i) {
            case 0:
                return "ISO-8859-1";
            case 1:
                return "UTF-16";
            case 2:
                return "UTF-16BE";
            case 3:
                return "UTF-8";
            default:
                return "ISO-8859-1";
        }
    }

    /* renamed from: b */
    private static int m20189b(int i) {
        if (i != 0) {
            if (i != 3) {
                return 2;
            }
        }
        return 1;
    }

    public C4029a() {
        this(null);
    }

    public C4029a(C2297a c2297a) {
        this.f16208b = c2297a;
    }

    /* renamed from: a */
    public Metadata mo1644a(C4690c c4690c) {
        c4690c = c4690c.b;
        return m20200a(c4690c.array(), c4690c.limit());
    }

    /* renamed from: a */
    public Metadata m20200a(byte[] bArr, int i) {
        List arrayList = new ArrayList();
        C2175k c2175k = new C2175k(bArr, i);
        bArr = C4029a.m20185a(c2175k);
        if (bArr == null) {
            return null;
        }
        int d = c2175k.m7980d();
        int i2 = bArr.f7245a == 2 ? 6 : 10;
        int b = bArr.f7247c;
        if (bArr.f7246b) {
            b = C4029a.m20198f(c2175k, bArr.f7247c);
        }
        c2175k.m7977b(d + b);
        boolean z = false;
        if (!C4029a.m20188a(c2175k, bArr.f7245a, i2, false)) {
            if (bArr.f7245a == 4 && C4029a.m20188a(c2175k, 4, i2, true)) {
                z = true;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to validate ID3 tag with majorVersion=");
                stringBuilder.append(bArr.f7245a);
                Log.w("Id3Decoder", stringBuilder.toString());
                return null;
            }
        }
        while (c2175k.m7976b() >= i2) {
            i = C4029a.m20182a(bArr.f7245a, c2175k, z, i2, this.f16208b);
            if (i != 0) {
                arrayList.add(i);
            }
        }
        return new Metadata(arrayList);
    }

    /* renamed from: a */
    private static C2298b m20185a(C2175k c2175k) {
        if (c2175k.m7976b() < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int k = c2175k.m7990k();
        if (k != f16207a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected first three bytes of ID3 tag header: ");
            stringBuilder.append(k);
            Log.w("Id3Decoder", stringBuilder.toString());
            return null;
        }
        k = c2175k.m7986g();
        boolean z = true;
        c2175k.m7981d(1);
        int g = c2175k.m7986g();
        int s = c2175k.m7998s();
        if (k == 2) {
            if (((g & 64) != null ? true : null) != null) {
                Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (k == 3) {
            if (((g & 64) != 0 ? 1 : null) != null) {
                r1 = c2175k.m7993n();
                c2175k.m7981d(r1);
                s -= r1 + 4;
            }
        } else if (k == 4) {
            if (((g & 64) != 0 ? 1 : null) != null) {
                r1 = c2175k.m7998s();
                c2175k.m7981d(r1 - 4);
                s -= r1;
            }
            if (((g & 16) != null ? true : null) != null) {
                s -= 10;
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Skipped ID3 tag with unsupported majorVersion=");
            stringBuilder.append(k);
            Log.w("Id3Decoder", stringBuilder.toString());
            return null;
        }
        if (k >= 4 || (g & 128) == null) {
            z = false;
        }
        return new C2298b(k, z, s);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static boolean m20188a(com.google.android.exoplayer2.p126c.C2175k r18, int r19, int r20, boolean r21) {
        /*
        r1 = r18;
        r0 = r19;
        r2 = r18.m7980d();
    L_0x0008:
        r3 = r18.m7976b();	 Catch:{ all -> 0x00b2 }
        r4 = 1;
        r5 = r20;
        if (r3 < r5) goto L_0x00ae;
    L_0x0011:
        r3 = 3;
        r6 = 0;
        if (r0 < r3) goto L_0x0022;
    L_0x0015:
        r7 = r18.m7993n();	 Catch:{ all -> 0x00b2 }
        r8 = r18.m7991l();	 Catch:{ all -> 0x00b2 }
        r10 = r18.m7987h();	 Catch:{ all -> 0x00b2 }
        goto L_0x002c;
    L_0x0022:
        r7 = r18.m7990k();	 Catch:{ all -> 0x00b2 }
        r8 = r18.m7990k();	 Catch:{ all -> 0x00b2 }
        r8 = (long) r8;
        r10 = 0;
    L_0x002c:
        r11 = 0;
        if (r7 != 0) goto L_0x003a;
    L_0x0030:
        r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r7 != 0) goto L_0x003a;
    L_0x0034:
        if (r10 != 0) goto L_0x003a;
    L_0x0036:
        r1.m7979c(r2);
        return r4;
    L_0x003a:
        r7 = 4;
        if (r0 != r7) goto L_0x006b;
    L_0x003d:
        if (r21 != 0) goto L_0x006b;
    L_0x003f:
        r13 = 8421504; // 0x808080 float:1.180104E-38 double:4.160776E-317;
        r13 = r13 & r8;
        r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r15 == 0) goto L_0x004b;
    L_0x0047:
        r1.m7979c(r2);
        return r6;
    L_0x004b:
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r13 = r8 & r11;
        r15 = 8;
        r15 = r8 >> r15;
        r15 = r15 & r11;
        r17 = 7;
        r15 = r15 << r17;
        r13 = r13 | r15;
        r15 = 16;
        r15 = r8 >> r15;
        r15 = r15 & r11;
        r17 = 14;
        r15 = r15 << r17;
        r13 = r13 | r15;
        r15 = 24;
        r8 = r8 >> r15;
        r8 = r8 & r11;
        r11 = 21;
        r8 = r8 << r11;
        r8 = r8 | r13;
    L_0x006b:
        if (r0 != r7) goto L_0x007a;
    L_0x006d:
        r3 = r10 & 64;
        if (r3 == 0) goto L_0x0073;
    L_0x0071:
        r3 = 1;
        goto L_0x0074;
    L_0x0073:
        r3 = 0;
    L_0x0074:
        r7 = r10 & 1;
        if (r7 == 0) goto L_0x0089;
    L_0x0078:
        r7 = 1;
        goto L_0x008a;
    L_0x007a:
        if (r0 != r3) goto L_0x0088;
    L_0x007c:
        r3 = r10 & 32;
        if (r3 == 0) goto L_0x0082;
    L_0x0080:
        r3 = 1;
        goto L_0x0083;
    L_0x0082:
        r3 = 0;
    L_0x0083:
        r7 = r10 & 128;
        if (r7 == 0) goto L_0x0089;
    L_0x0087:
        goto L_0x0078;
    L_0x0088:
        r3 = 0;
    L_0x0089:
        r7 = 0;
    L_0x008a:
        if (r3 == 0) goto L_0x008d;
    L_0x008c:
        goto L_0x008e;
    L_0x008d:
        r4 = 0;
    L_0x008e:
        if (r7 == 0) goto L_0x0092;
    L_0x0090:
        r4 = r4 + 4;
    L_0x0092:
        r3 = (long) r4;
        r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r7 >= 0) goto L_0x009b;
    L_0x0097:
        r1.m7979c(r2);
        return r6;
    L_0x009b:
        r3 = r18.m7976b();	 Catch:{ all -> 0x00b2 }
        r3 = (long) r3;
        r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00a8;
    L_0x00a4:
        r1.m7979c(r2);
        return r6;
    L_0x00a8:
        r3 = (int) r8;
        r1.m7981d(r3);	 Catch:{ all -> 0x00b2 }
        goto L_0x0008;
    L_0x00ae:
        r1.m7979c(r2);
        return r4;
    L_0x00b2:
        r0 = move-exception;
        r1.m7979c(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.a(com.google.android.exoplayer2.c.k, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m20182a(int r19, com.google.android.exoplayer2.p126c.C2175k r20, boolean r21, int r22, com.google.android.exoplayer2.metadata.id3.C4029a.C2297a r23) {
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
        r0 = r19;
        r7 = r20;
        r8 = r20.m7986g();
        r9 = r20.m7986g();
        r10 = r20.m7986g();
        r11 = 3;
        if (r0 < r11) goto L_0x0019;
    L_0x0013:
        r1 = r20.m7986g();
        r13 = r1;
        goto L_0x001a;
    L_0x0019:
        r13 = 0;
    L_0x001a:
        r14 = 4;
        if (r0 != r14) goto L_0x003c;
    L_0x001d:
        r1 = r20.m7999t();
        if (r21 != 0) goto L_0x003a;
    L_0x0023:
        r2 = r1 & 255;
        r3 = r1 >> 8;
        r3 = r3 & 255;
        r3 = r3 << 7;
        r2 = r2 | r3;
        r3 = r1 >> 16;
        r3 = r3 & 255;
        r3 = r3 << 14;
        r2 = r2 | r3;
        r1 = r1 >> 24;
        r1 = r1 & 255;
        r1 = r1 << 21;
        r1 = r1 | r2;
    L_0x003a:
        r15 = r1;
        goto L_0x0048;
    L_0x003c:
        if (r0 != r11) goto L_0x0043;
    L_0x003e:
        r1 = r20.m7999t();
        goto L_0x003a;
    L_0x0043:
        r1 = r20.m7990k();
        goto L_0x003a;
    L_0x0048:
        if (r0 < r11) goto L_0x0050;
    L_0x004a:
        r1 = r20.m7987h();
        r6 = r1;
        goto L_0x0051;
    L_0x0050:
        r6 = 0;
    L_0x0051:
        r16 = 0;
        if (r8 != 0) goto L_0x0067;
    L_0x0055:
        if (r9 != 0) goto L_0x0067;
    L_0x0057:
        if (r10 != 0) goto L_0x0067;
    L_0x0059:
        if (r13 != 0) goto L_0x0067;
    L_0x005b:
        if (r15 != 0) goto L_0x0067;
    L_0x005d:
        if (r6 != 0) goto L_0x0067;
    L_0x005f:
        r0 = r20.m7978c();
        r7.m7979c(r0);
        return r16;
    L_0x0067:
        r1 = r20.m7980d();
        r5 = r1 + r15;
        r1 = r20.m7978c();
        if (r5 <= r1) goto L_0x0082;
    L_0x0073:
        r0 = "Id3Decoder";
        r1 = "Frame size exceeds remaining tag data";
        android.util.Log.w(r0, r1);
        r0 = r20.m7978c();
        r7.m7979c(r0);
        return r16;
    L_0x0082:
        if (r23 == 0) goto L_0x0098;
    L_0x0084:
        r1 = r23;
        r2 = r19;
        r3 = r8;
        r4 = r9;
        r12 = r5;
        r5 = r10;
        r14 = r6;
        r6 = r13;
        r1 = r1.mo1622a(r2, r3, r4, r5, r6);
        if (r1 != 0) goto L_0x009a;
    L_0x0094:
        r7.m7979c(r12);
        return r16;
    L_0x0098:
        r12 = r5;
        r14 = r6;
    L_0x009a:
        r1 = 1;
        if (r0 != r11) goto L_0x00b7;
    L_0x009d:
        r2 = r14 & 128;
        if (r2 == 0) goto L_0x00a3;
    L_0x00a1:
        r2 = 1;
        goto L_0x00a4;
    L_0x00a3:
        r2 = 0;
    L_0x00a4:
        r3 = r14 & 64;
        if (r3 == 0) goto L_0x00aa;
    L_0x00a8:
        r3 = 1;
        goto L_0x00ab;
    L_0x00aa:
        r3 = 0;
    L_0x00ab:
        r4 = r14 & 32;
        if (r4 == 0) goto L_0x00b1;
    L_0x00af:
        r4 = 1;
        goto L_0x00b2;
    L_0x00b1:
        r4 = 0;
    L_0x00b2:
        r17 = r3;
        r5 = 0;
        r3 = r2;
        goto L_0x00ee;
    L_0x00b7:
        r2 = 4;
        if (r0 != r2) goto L_0x00e8;
    L_0x00ba:
        r2 = r14 & 64;
        if (r2 == 0) goto L_0x00c0;
    L_0x00be:
        r2 = 1;
        goto L_0x00c1;
    L_0x00c0:
        r2 = 0;
    L_0x00c1:
        r3 = r14 & 8;
        if (r3 == 0) goto L_0x00c7;
    L_0x00c5:
        r3 = 1;
        goto L_0x00c8;
    L_0x00c7:
        r3 = 0;
    L_0x00c8:
        r4 = r14 & 4;
        if (r4 == 0) goto L_0x00ce;
    L_0x00cc:
        r4 = 1;
        goto L_0x00cf;
    L_0x00ce:
        r4 = 0;
    L_0x00cf:
        r5 = r14 & 2;
        if (r5 == 0) goto L_0x00d5;
    L_0x00d3:
        r5 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r5 = 0;
    L_0x00d6:
        r6 = r14 & 1;
        if (r6 == 0) goto L_0x00dd;
    L_0x00da:
        r17 = 1;
        goto L_0x00df;
    L_0x00dd:
        r17 = 0;
    L_0x00df:
        r18 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r17;
        r17 = r18;
        goto L_0x00ee;
    L_0x00e8:
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r17 = 0;
    L_0x00ee:
        if (r2 != 0) goto L_0x021d;
    L_0x00f0:
        if (r17 == 0) goto L_0x00f4;
    L_0x00f2:
        goto L_0x021d;
    L_0x00f4:
        if (r4 == 0) goto L_0x00fb;
    L_0x00f6:
        r15 = r15 + -1;
        r7.m7981d(r1);
    L_0x00fb:
        if (r3 == 0) goto L_0x0103;
    L_0x00fd:
        r15 = r15 + -4;
        r1 = 4;
        r7.m7981d(r1);
    L_0x0103:
        r1 = r15;
        if (r5 == 0) goto L_0x010a;
    L_0x0106:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20198f(r7, r1);
    L_0x010a:
        r11 = r1;
        r1 = 84;
        r2 = 88;
        r3 = 2;
        if (r8 != r1) goto L_0x0120;
    L_0x0112:
        if (r9 != r2) goto L_0x0120;
    L_0x0114:
        if (r10 != r2) goto L_0x0120;
    L_0x0116:
        if (r0 == r3) goto L_0x011a;
    L_0x0118:
        if (r13 != r2) goto L_0x0120;
    L_0x011a:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20183a(r7, r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0120:
        if (r8 != r1) goto L_0x012f;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0122:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20187a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20184a(r7, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x012c:
        r0 = move-exception;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x0219;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x012f:
        r4 = 87;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r8 != r4) goto L_0x0141;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0133:
        if (r9 != r2) goto L_0x0141;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0135:
        if (r10 != r2) goto L_0x0141;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0137:
        if (r0 == r3) goto L_0x013b;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0139:
        if (r13 != r2) goto L_0x0141;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x013b:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20192b(r7, r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0141:
        r2 = 87;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r8 != r2) goto L_0x014f;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0145:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20187a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20193b(r7, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x014f:
        r2 = 73;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r4 = 80;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r8 != r4) goto L_0x0165;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0155:
        r5 = 82;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r9 != r5) goto L_0x0165;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0159:
        if (r10 != r2) goto L_0x0165;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x015b:
        r5 = 86;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r13 != r5) goto L_0x0165;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x015f:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20195c(r7, r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0165:
        r5 = 71;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r6 = 79;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r8 != r5) goto L_0x017d;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x016b:
        r5 = 69;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r9 != r5) goto L_0x017d;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x016f:
        if (r10 != r6) goto L_0x017d;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0171:
        r5 = 66;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r13 == r5) goto L_0x0177;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0175:
        if (r0 != r3) goto L_0x017d;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0177:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20196d(r7, r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x017d:
        r5 = 67;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r0 != r3) goto L_0x0188;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0181:
        if (r8 != r4) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0183:
        if (r9 != r2) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0185:
        if (r10 != r5) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0187:
        goto L_0x0192;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0188:
        r14 = 65;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r8 != r14) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x018c:
        if (r9 != r4) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x018e:
        if (r10 != r2) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0190:
        if (r13 != r5) goto L_0x0197;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0192:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20180a(r7, r11, r0);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0197:
        if (r8 != r5) goto L_0x01aa;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x0199:
        if (r9 != r6) goto L_0x01aa;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x019b:
        r2 = 77;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r10 != r2) goto L_0x01aa;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x019f:
        r2 = 77;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r13 == r2) goto L_0x01a5;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01a3:
        if (r0 != r3) goto L_0x01aa;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01a5:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20197e(r7, r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01aa:
        if (r8 != r5) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01ac:
        r2 = 72;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r9 != r2) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01b0:
        r2 = 65;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        if (r10 != r2) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01b4:
        if (r13 != r4) goto L_0x01c6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01b6:
        r1 = r20;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r2 = r11;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3 = r19;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r4 = r21;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r5 = r22;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r6 = r23;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20181a(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01c6:
        if (r8 != r5) goto L_0x01de;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01c8:
        if (r9 != r1) goto L_0x01de;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01ca:
        if (r10 != r6) goto L_0x01de;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01cc:
        if (r13 != r5) goto L_0x01de;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01ce:
        r1 = r20;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r2 = r11;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3 = r19;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r4 = r21;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r5 = r22;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r6 = r23;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20191b(r1, r2, r3, r4, r5, r6);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        goto L_0x01e6;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01de:
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20187a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r1 = com.google.android.exoplayer2.metadata.id3.C4029a.m20194c(r7, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01e6:
        if (r1 != 0) goto L_0x020a;	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x01e8:
        r2 = "Id3Decoder";	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3.<init>();	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r4 = "Failed to decode frame: id=";	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3.append(r4);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r0 = com.google.android.exoplayer2.metadata.id3.C4029a.m20187a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r0 = ", frameSize=";	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r3.append(r11);	 Catch:{ UnsupportedEncodingException -> 0x020e }
        r0 = r3.toString();	 Catch:{ UnsupportedEncodingException -> 0x020e }
        android.util.Log.w(r2, r0);	 Catch:{ UnsupportedEncodingException -> 0x020e }
    L_0x020a:
        r7.m7979c(r12);
        return r1;
    L_0x020e:
        r0 = "Id3Decoder";	 Catch:{ all -> 0x012c }
        r1 = "Unsupported character encoding";	 Catch:{ all -> 0x012c }
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x012c }
        r7.m7979c(r12);
        return r16;
    L_0x0219:
        r7.m7979c(r12);
        throw r0;
    L_0x021d:
        r0 = "Id3Decoder";
        r1 = "Skipping unsupported compressed or encrypted frame";
        android.util.Log.w(r0, r1);
        r7.m7979c(r12);
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.a(int, com.google.android.exoplayer2.c.k, boolean, int, com.google.android.exoplayer2.metadata.id3.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: a */
    private static TextInformationFrame m20183a(C2175k c2175k, int i) {
        if (i < 1) {
            return null;
        }
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        i--;
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        c2175k = C4029a.m20179a(bArr, 0, g);
        i = new String(bArr, 0, c2175k, a);
        int b = c2175k + C4029a.m20189b(g);
        return new TextInformationFrame("TXXX", i, b < bArr.length ? new String(bArr, b, C4029a.m20179a(bArr, b, g) - b, a) : "");
    }

    /* renamed from: a */
    private static TextInformationFrame m20184a(C2175k c2175k, int i, String str) {
        if (i < 1) {
            return null;
        }
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        i--;
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        return new TextInformationFrame(str, null, new String(bArr, 0, C4029a.m20179a(bArr, 0, g), a));
    }

    /* renamed from: b */
    private static UrlLinkFrame m20192b(C2175k c2175k, int i) {
        if (i < 1) {
            return null;
        }
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        i--;
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        c2175k = C4029a.m20179a(bArr, 0, g);
        i = new String(bArr, 0, c2175k, a);
        int b = c2175k + C4029a.m20189b(g);
        return new UrlLinkFrame("WXXX", i, b < bArr.length ? new String(bArr, b, C4029a.m20190b(bArr, b) - b, "ISO-8859-1") : "");
    }

    /* renamed from: b */
    private static UrlLinkFrame m20193b(C2175k c2175k, int i, String str) {
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, C4029a.m20190b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: c */
    private static PrivFrame m20195c(C2175k c2175k, int i) {
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        c2175k = C4029a.m20190b(bArr, 0);
        i = new String(bArr, 0, c2175k, "ISO-8859-1");
        c2175k++;
        if (c2175k < bArr.length) {
            c2175k = Arrays.copyOfRange(bArr, c2175k, bArr.length);
        } else {
            c2175k = new byte[0];
        }
        return new PrivFrame(i, c2175k);
    }

    /* renamed from: d */
    private static GeobFrame m20196d(C2175k c2175k, int i) {
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        i--;
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        c2175k = C4029a.m20190b(bArr, 0);
        i = new String(bArr, 0, c2175k, "ISO-8859-1");
        int i2 = c2175k + 1;
        int a2 = C4029a.m20179a(bArr, i2, g);
        String str = new String(bArr, i2, a2 - i2, a);
        a2 += C4029a.m20189b(g);
        c2175k = C4029a.m20179a(bArr, a2, g);
        return new GeobFrame(i, str, new String(bArr, a2, c2175k - a2, a), Arrays.copyOfRange(bArr, c2175k + C4029a.m20189b(g), bArr.length));
    }

    /* renamed from: a */
    private static ApicFrame m20180a(C2175k c2175k, int i, int i2) {
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        i--;
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        if (i2 == 2) {
            i = new StringBuilder();
            i.append("image/");
            i.append(C2186s.m8061d(new String(bArr, 0, 3, "ISO-8859-1")));
            i = i.toString();
            if (i.equals("image/jpg") != 0) {
                i = "image/jpeg";
            }
            i2 = i;
            i = 2;
        } else {
            i = C4029a.m20190b(bArr, 0);
            i2 = C2186s.m8061d(new String(bArr, 0, i, "ISO-8859-1"));
            if (i2.indexOf(47) == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("image/");
                stringBuilder.append(i2);
                i2 = stringBuilder.toString();
            }
        }
        int i3 = bArr[i + 1] & 255;
        i += 2;
        c2175k = C4029a.m20179a(bArr, i, g);
        return new ApicFrame(i2, new String(bArr, i, c2175k - i, a), i3, Arrays.copyOfRange(bArr, c2175k + C4029a.m20189b(g), bArr.length));
    }

    /* renamed from: e */
    private static CommentFrame m20197e(C2175k c2175k, int i) {
        if (i < 4) {
            return null;
        }
        int g = c2175k.m7986g();
        String a = C4029a.m20186a(g);
        byte[] bArr = new byte[3];
        c2175k.m7975a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        i -= 4;
        byte[] bArr2 = new byte[i];
        c2175k.m7975a(bArr2, 0, i);
        c2175k = C4029a.m20179a(bArr2, 0, g);
        i = new String(bArr2, 0, c2175k, a);
        int b = c2175k + C4029a.m20189b(g);
        return new CommentFrame(str, i, b < bArr2.length ? new String(bArr2, b, C4029a.m20179a(bArr2, b, g) - b, a) : "");
    }

    /* renamed from: a */
    private static ChapterFrame m20181a(C2175k c2175k, int i, int i2, boolean z, int i3, C2297a c2297a) {
        C2175k c2175k2 = c2175k;
        int d = c2175k.m7980d();
        int b = C4029a.m20190b(c2175k2.f6735a, d);
        String str = new String(c2175k2.f6735a, d, b - d, "ISO-8859-1");
        c2175k.m7979c(b + 1);
        int n = c2175k.m7993n();
        int n2 = c2175k.m7993n();
        long l = c2175k.m7991l();
        long j = l == 4294967295L ? -1 : l;
        l = c2175k.m7991l();
        long j2 = l == 4294967295L ? -1 : l;
        ArrayList arrayList = new ArrayList();
        d += i;
        while (c2175k.m7980d() < d) {
            Id3Frame a = C4029a.m20182a(i2, c2175k, z, i3, c2297a);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, n, n2, j, j2, id3FrameArr);
    }

    /* renamed from: b */
    private static ChapterTocFrame m20191b(C2175k c2175k, int i, int i2, boolean z, int i3, C2297a c2297a) {
        C2175k c2175k2 = c2175k;
        int d = c2175k.m7980d();
        int b = C4029a.m20190b(c2175k2.f6735a, d);
        String str = new String(c2175k2.f6735a, d, b - d, "ISO-8859-1");
        c2175k.m7979c(b + 1);
        b = c2175k.m7986g();
        int i4 = (b & 2) != 0 ? 1 : 0;
        boolean z2 = (b & 1) != 0;
        int g = c2175k.m7986g();
        String[] strArr = new String[g];
        for (int i5 = 0; i5 < g; i5++) {
            int d2 = c2175k.m7980d();
            int b2 = C4029a.m20190b(c2175k2.f6735a, d2);
            strArr[i5] = new String(c2175k2.f6735a, d2, b2 - d2, "ISO-8859-1");
            c2175k.m7979c(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        d += i;
        while (c2175k.m7980d() < d) {
            Id3Frame a = C4029a.m20182a(i2, c2175k, z, i3, c2297a);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, i4, z2, strArr, id3FrameArr);
    }

    /* renamed from: c */
    private static BinaryFrame m20194c(C2175k c2175k, int i, String str) {
        byte[] bArr = new byte[i];
        c2175k.m7975a(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: f */
    private static int m20198f(C2175k c2175k, int i) {
        Object obj = c2175k.f6735a;
        c2175k = c2175k.m7980d();
        while (true) {
            int i2 = c2175k + 1;
            if (i2 >= i) {
                return i;
            }
            if ((obj[c2175k] & 255) == 255 && obj[i2] == (byte) 0) {
                System.arraycopy(obj, c2175k + 2, obj, i2, (i - c2175k) - 2);
                i--;
            }
            c2175k = i2;
        }
    }

    /* renamed from: a */
    private static String m20187a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static int m20179a(byte[] bArr, int i, int i2) {
        i = C4029a.m20190b(bArr, i);
        if (i2 != 0) {
            if (i2 != 3) {
                while (i < bArr.length - 1) {
                    if (i % 2 == 0 && bArr[i + 1] == 0) {
                        return i;
                    }
                    i = C4029a.m20190b(bArr, i + 1);
                }
                return bArr.length;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m20190b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == (byte) 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }
}
