package com.google.android.exoplayer2.extractor.p127a;

import android.util.SparseArray;
import com.google.android.exoplayer2.C2162b;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.C3965a;
import com.google.android.exoplayer2.p126c.C2168f;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.a.d */
public final class C3964d implements C2259f {
    /* renamed from: a */
    public static final C2262i f15777a = new C39621();
    /* renamed from: b */
    private static final byte[] f15778b = new byte[]{(byte) 49, (byte) 10, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 45, (byte) 45, (byte) 62, (byte) 32, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 58, (byte) 48, (byte) 48, (byte) 44, (byte) 48, (byte) 48, (byte) 48, (byte) 10};
    /* renamed from: c */
    private static final byte[] f15779c = new byte[]{(byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32, (byte) 32};
    /* renamed from: d */
    private static final UUID f15780d = new UUID(72057594037932032L, -9223371306706625679L);
    /* renamed from: A */
    private long f15781A;
    /* renamed from: B */
    private boolean f15782B;
    /* renamed from: C */
    private long f15783C;
    /* renamed from: D */
    private long f15784D;
    /* renamed from: E */
    private long f15785E;
    /* renamed from: F */
    private C2168f f15786F;
    /* renamed from: G */
    private C2168f f15787G;
    /* renamed from: H */
    private boolean f15788H;
    /* renamed from: I */
    private int f15789I;
    /* renamed from: J */
    private long f15790J;
    /* renamed from: K */
    private long f15791K;
    /* renamed from: L */
    private int f15792L;
    /* renamed from: M */
    private int f15793M;
    /* renamed from: N */
    private int[] f15794N;
    /* renamed from: O */
    private int f15795O;
    /* renamed from: P */
    private int f15796P;
    /* renamed from: Q */
    private int f15797Q;
    /* renamed from: R */
    private int f15798R;
    /* renamed from: S */
    private boolean f15799S;
    /* renamed from: T */
    private boolean f15800T;
    /* renamed from: U */
    private boolean f15801U;
    /* renamed from: V */
    private boolean f15802V;
    /* renamed from: W */
    private byte f15803W;
    /* renamed from: X */
    private int f15804X;
    /* renamed from: Y */
    private int f15805Y;
    /* renamed from: Z */
    private int f15806Z;
    private boolean aa;
    private boolean ab;
    private C2261h ac;
    /* renamed from: e */
    private final C2198b f15807e;
    /* renamed from: f */
    private final C2202f f15808f;
    /* renamed from: g */
    private final SparseArray<C2200b> f15809g;
    /* renamed from: h */
    private final boolean f15810h;
    /* renamed from: i */
    private final C2175k f15811i;
    /* renamed from: j */
    private final C2175k f15812j;
    /* renamed from: k */
    private final C2175k f15813k;
    /* renamed from: l */
    private final C2175k f15814l;
    /* renamed from: m */
    private final C2175k f15815m;
    /* renamed from: n */
    private final C2175k f15816n;
    /* renamed from: o */
    private final C2175k f15817o;
    /* renamed from: p */
    private final C2175k f15818p;
    /* renamed from: q */
    private final C2175k f15819q;
    /* renamed from: r */
    private ByteBuffer f15820r;
    /* renamed from: s */
    private long f15821s;
    /* renamed from: t */
    private long f15822t;
    /* renamed from: u */
    private long f15823u;
    /* renamed from: v */
    private long f15824v;
    /* renamed from: w */
    private long f15825w;
    /* renamed from: x */
    private C2200b f15826x;
    /* renamed from: y */
    private boolean f15827y;
    /* renamed from: z */
    private int f15828z;

    /* renamed from: com.google.android.exoplayer2.extractor.a.d$b */
    private static final class C2200b {
        /* renamed from: A */
        public float f6783A;
        /* renamed from: B */
        public float f6784B;
        /* renamed from: C */
        public float f6785C;
        /* renamed from: D */
        public float f6786D;
        /* renamed from: E */
        public float f6787E;
        /* renamed from: F */
        public float f6788F;
        /* renamed from: G */
        public int f6789G;
        /* renamed from: H */
        public int f6790H;
        /* renamed from: I */
        public int f6791I;
        /* renamed from: J */
        public long f6792J;
        /* renamed from: K */
        public long f6793K;
        /* renamed from: L */
        public boolean f6794L;
        /* renamed from: M */
        public boolean f6795M;
        /* renamed from: N */
        public C2267n f6796N;
        /* renamed from: O */
        public int f6797O;
        /* renamed from: P */
        private String f6798P;
        /* renamed from: a */
        public String f6799a;
        /* renamed from: b */
        public int f6800b;
        /* renamed from: c */
        public int f6801c;
        /* renamed from: d */
        public int f6802d;
        /* renamed from: e */
        public boolean f6803e;
        /* renamed from: f */
        public byte[] f6804f;
        /* renamed from: g */
        public byte[] f6805g;
        /* renamed from: h */
        public byte[] f6806h;
        /* renamed from: i */
        public DrmInitData f6807i;
        /* renamed from: j */
        public int f6808j;
        /* renamed from: k */
        public int f6809k;
        /* renamed from: l */
        public int f6810l;
        /* renamed from: m */
        public int f6811m;
        /* renamed from: n */
        public int f6812n;
        /* renamed from: o */
        public byte[] f6813o;
        /* renamed from: p */
        public int f6814p;
        /* renamed from: q */
        public boolean f6815q;
        /* renamed from: r */
        public int f6816r;
        /* renamed from: s */
        public int f6817s;
        /* renamed from: t */
        public int f6818t;
        /* renamed from: u */
        public int f6819u;
        /* renamed from: v */
        public int f6820v;
        /* renamed from: w */
        public float f6821w;
        /* renamed from: x */
        public float f6822x;
        /* renamed from: y */
        public float f6823y;
        /* renamed from: z */
        public float f6824z;

        private C2200b() {
            this.f6808j = -1;
            this.f6809k = -1;
            this.f6810l = -1;
            this.f6811m = -1;
            this.f6812n = 0;
            this.f6813o = null;
            this.f6814p = -1;
            this.f6815q = false;
            this.f6816r = -1;
            this.f6817s = -1;
            this.f6818t = -1;
            this.f6819u = 1000;
            this.f6820v = 200;
            this.f6821w = -1.0f;
            this.f6822x = -1.0f;
            this.f6823y = -1.0f;
            this.f6824z = -1.0f;
            this.f6783A = -1.0f;
            this.f6784B = -1.0f;
            this.f6785C = -1.0f;
            this.f6786D = -1.0f;
            this.f6787E = -1.0f;
            this.f6788F = -1.0f;
            this.f6789G = 1;
            this.f6790H = -1;
            this.f6791I = 8000;
            this.f6792J = 0;
            this.f6793K = 0;
            this.f6795M = true;
            this.f6798P = "eng";
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void m8121a(com.google.android.exoplayer2.extractor.C2261h r27, int r28) {
            /*
            r26 = this;
            r0 = r26;
            r1 = r0.f6799a;
            r2 = r1.hashCode();
            r3 = 4;
            r4 = 8;
            r5 = 1;
            r6 = 2;
            r7 = 0;
            r8 = 3;
            r9 = -1;
            switch(r2) {
                case -2095576542: goto L_0x014a;
                case -2095575984: goto L_0x0140;
                case -1985379776: goto L_0x0135;
                case -1784763192: goto L_0x012a;
                case -1730367663: goto L_0x011f;
                case -1482641358: goto L_0x0114;
                case -1482641357: goto L_0x0109;
                case -1373388978: goto L_0x00fe;
                case -933872740: goto L_0x00f3;
                case -538363189: goto L_0x00e8;
                case -538363109: goto L_0x00dd;
                case -425012669: goto L_0x00d1;
                case -356037306: goto L_0x00c5;
                case 62923557: goto L_0x00b9;
                case 62923603: goto L_0x00ad;
                case 62927045: goto L_0x00a1;
                case 82338133: goto L_0x0096;
                case 82338134: goto L_0x008b;
                case 99146302: goto L_0x007f;
                case 444813526: goto L_0x0073;
                case 542569478: goto L_0x0067;
                case 725957860: goto L_0x005b;
                case 855502857: goto L_0x0050;
                case 1422270023: goto L_0x0044;
                case 1809237540: goto L_0x0039;
                case 1950749482: goto L_0x002d;
                case 1950789798: goto L_0x0021;
                case 1951062397: goto L_0x0015;
                default: goto L_0x0013;
            };
        L_0x0013:
            goto L_0x0154;
        L_0x0015:
            r2 = "A_OPUS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x001d:
            r1 = 11;
            goto L_0x0155;
        L_0x0021:
            r2 = "A_FLAC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0029:
            r1 = 21;
            goto L_0x0155;
        L_0x002d:
            r2 = "A_EAC3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0035:
            r1 = 16;
            goto L_0x0155;
        L_0x0039:
            r2 = "V_MPEG2";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0041:
            r1 = 2;
            goto L_0x0155;
        L_0x0044:
            r2 = "S_TEXT/UTF8";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x004c:
            r1 = 24;
            goto L_0x0155;
        L_0x0050:
            r2 = "V_MPEGH/ISO/HEVC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0058:
            r1 = 7;
            goto L_0x0155;
        L_0x005b:
            r2 = "A_PCM/INT/LIT";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0063:
            r1 = 23;
            goto L_0x0155;
        L_0x0067:
            r2 = "A_DTS/EXPRESS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x006f:
            r1 = 19;
            goto L_0x0155;
        L_0x0073:
            r2 = "V_THEORA";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x007b:
            r1 = 9;
            goto L_0x0155;
        L_0x007f:
            r2 = "S_HDMV/PGS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0087:
            r1 = 26;
            goto L_0x0155;
        L_0x008b:
            r2 = "V_VP9";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0093:
            r1 = 1;
            goto L_0x0155;
        L_0x0096:
            r2 = "V_VP8";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x009e:
            r1 = 0;
            goto L_0x0155;
        L_0x00a1:
            r2 = "A_DTS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00a9:
            r1 = 18;
            goto L_0x0155;
        L_0x00ad:
            r2 = "A_AC3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00b5:
            r1 = 15;
            goto L_0x0155;
        L_0x00b9:
            r2 = "A_AAC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00c1:
            r1 = 12;
            goto L_0x0155;
        L_0x00c5:
            r2 = "A_DTS/LOSSLESS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00cd:
            r1 = 20;
            goto L_0x0155;
        L_0x00d1:
            r2 = "S_VOBSUB";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00d9:
            r1 = 25;
            goto L_0x0155;
        L_0x00dd:
            r2 = "V_MPEG4/ISO/AVC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00e5:
            r1 = 6;
            goto L_0x0155;
        L_0x00e8:
            r2 = "V_MPEG4/ISO/ASP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00f0:
            r1 = 4;
            goto L_0x0155;
        L_0x00f3:
            r2 = "S_DVBSUB";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x00fb:
            r1 = 27;
            goto L_0x0155;
        L_0x00fe:
            r2 = "V_MS/VFW/FOURCC";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0106:
            r1 = 8;
            goto L_0x0155;
        L_0x0109:
            r2 = "A_MPEG/L3";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0111:
            r1 = 14;
            goto L_0x0155;
        L_0x0114:
            r2 = "A_MPEG/L2";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x011c:
            r1 = 13;
            goto L_0x0155;
        L_0x011f:
            r2 = "A_VORBIS";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0127:
            r1 = 10;
            goto L_0x0155;
        L_0x012a:
            r2 = "A_TRUEHD";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0132:
            r1 = 17;
            goto L_0x0155;
        L_0x0135:
            r2 = "A_MS/ACM";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x013d:
            r1 = 22;
            goto L_0x0155;
        L_0x0140:
            r2 = "V_MPEG4/ISO/SP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0148:
            r1 = 3;
            goto L_0x0155;
        L_0x014a:
            r2 = "V_MPEG4/ISO/AP";
            r1 = r1.equals(r2);
            if (r1 == 0) goto L_0x0154;
        L_0x0152:
            r1 = 5;
            goto L_0x0155;
        L_0x0154:
            r1 = -1;
        L_0x0155:
            r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            r10 = 0;
            switch(r1) {
                case 0: goto L_0x030d;
                case 1: goto L_0x030a;
                case 2: goto L_0x0307;
                case 3: goto L_0x02f6;
                case 4: goto L_0x02f6;
                case 5: goto L_0x02f6;
                case 6: goto L_0x02e0;
                case 7: goto L_0x02cc;
                case 8: goto L_0x02ad;
                case 9: goto L_0x02aa;
                case 10: goto L_0x029a;
                case 11: goto L_0x0254;
                case 12: goto L_0x0249;
                case 13: goto L_0x0241;
                case 14: goto L_0x023e;
                case 15: goto L_0x023a;
                case 16: goto L_0x0236;
                case 17: goto L_0x0232;
                case 18: goto L_0x022e;
                case 19: goto L_0x022e;
                case 20: goto L_0x022a;
                case 21: goto L_0x0221;
                case 22: goto L_0x01cc;
                case 23: goto L_0x0197;
                case 24: goto L_0x0193;
                case 25: goto L_0x0189;
                case 26: goto L_0x0185;
                case 27: goto L_0x0163;
                default: goto L_0x015b;
            };
        L_0x015b:
            r1 = new com.google.android.exoplayer2.ParserException;
            r2 = "Unrecognized codec identifier.";
            r1.<init>(r2);
            throw r1;
        L_0x0163:
            r1 = "application/dvbsubs";
            r2 = new byte[r3];
            r3 = r0.f6806h;
            r3 = r3[r7];
            r2[r7] = r3;
            r3 = r0.f6806h;
            r3 = r3[r5];
            r2[r5] = r3;
            r3 = r0.f6806h;
            r3 = r3[r6];
            r2[r6] = r3;
            r3 = r0.f6806h;
            r3 = r3[r8];
            r2[r8] = r3;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0251;
        L_0x0185:
            r1 = "application/pgs";
            goto L_0x030f;
        L_0x0189:
            r1 = "application/vobsub";
            r2 = r0.f6806h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0251;
        L_0x0193:
            r1 = "application/x-subrip";
            goto L_0x030f;
        L_0x0197:
            r1 = "audio/raw";
            r2 = r0.f6790H;
            r2 = com.google.android.exoplayer2.p126c.C2186s.m8054b(r2);
            if (r2 != 0) goto L_0x01c5;
        L_0x01a1:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Unsupported PCM bit depth: ";
            r3.append(r4);
            r4 = r0.f6790H;
            r3.append(r4);
            r4 = ". Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x030f;
        L_0x01c5:
            r12 = r1;
            r18 = r2;
            r2 = r10;
            r15 = -1;
            goto L_0x0314;
        L_0x01cc:
            r1 = "audio/raw";
            r2 = new com.google.android.exoplayer2.c.k;
            r3 = r0.f6806h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.extractor.p127a.C3964d.C2200b.m8120b(r2);
            if (r2 == 0) goto L_0x0207;
        L_0x01db:
            r2 = r0.f6790H;
            r2 = com.google.android.exoplayer2.p126c.C2186s.m8054b(r2);
            if (r2 != 0) goto L_0x01c5;
        L_0x01e3:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Unsupported PCM bit depth: ";
            r3.append(r4);
            r4 = r0.f6790H;
            r3.append(r4);
            r4 = ". Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x030f;
        L_0x0207:
            r1 = "audio/x-unknown";
            r2 = "MatroskaExtractor";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
            r3.append(r4);
            r3.append(r1);
            r3 = r3.toString();
            android.util.Log.w(r2, r3);
            goto L_0x030f;
        L_0x0221:
            r1 = "audio/x-flac";
            r2 = r0.f6806h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0251;
        L_0x022a:
            r1 = "audio/vnd.dts.hd";
            goto L_0x030f;
        L_0x022e:
            r1 = "audio/vnd.dts";
            goto L_0x030f;
        L_0x0232:
            r1 = "audio/true-hd";
            goto L_0x030f;
        L_0x0236:
            r1 = "audio/eac3";
            goto L_0x030f;
        L_0x023a:
            r1 = "audio/ac3";
            goto L_0x030f;
        L_0x023e:
            r1 = "audio/mpeg";
            goto L_0x0243;
        L_0x0241:
            r1 = "audio/mpeg-L2";
        L_0x0243:
            r12 = r1;
            r2 = r10;
            r15 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
            goto L_0x0312;
        L_0x0249:
            r1 = "audio/mp4a-latm";
            r2 = r0.f6806h;
            r2 = java.util.Collections.singletonList(r2);
        L_0x0251:
            r12 = r1;
            goto L_0x0311;
        L_0x0254:
            r1 = "audio/opus";
            r2 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            r3 = new java.util.ArrayList;
            r3.<init>(r8);
            r11 = r0.f6806h;
            r3.add(r11);
            r11 = java.nio.ByteBuffer.allocate(r4);
            r12 = java.nio.ByteOrder.nativeOrder();
            r11 = r11.order(r12);
            r12 = r0.f6792J;
            r11 = r11.putLong(r12);
            r11 = r11.array();
            r3.add(r11);
            r4 = java.nio.ByteBuffer.allocate(r4);
            r11 = java.nio.ByteOrder.nativeOrder();
            r4 = r4.order(r11);
            r11 = r0.f6793K;
            r4 = r4.putLong(r11);
            r4 = r4.array();
            r3.add(r4);
            r12 = r1;
            r2 = r3;
            r15 = 5760; // 0x1680 float:8.071E-42 double:2.846E-320;
            goto L_0x0312;
        L_0x029a:
            r1 = "audio/vorbis";
            r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            r3 = r0.f6806h;
            r3 = com.google.android.exoplayer2.extractor.p127a.C3964d.C2200b.m8118a(r3);
            r12 = r1;
            r2 = r3;
            r15 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
            goto L_0x0312;
        L_0x02aa:
            r1 = "video/x-unknown";
            goto L_0x030f;
        L_0x02ad:
            r1 = new com.google.android.exoplayer2.c.k;
            r2 = r0.f6806h;
            r1.<init>(r2);
            r1 = com.google.android.exoplayer2.extractor.p127a.C3964d.C2200b.m8117a(r1);
            if (r1 == 0) goto L_0x02c2;
        L_0x02ba:
            r2 = "video/wvc1";
        L_0x02bc:
            r12 = r2;
            r15 = -1;
            r18 = -1;
            r2 = r1;
            goto L_0x0314;
        L_0x02c2:
            r2 = "MatroskaExtractor";
            r3 = "Unsupported FourCC. Setting mimeType to video/x-unknown";
            android.util.Log.w(r2, r3);
            r2 = "video/x-unknown";
            goto L_0x02bc;
        L_0x02cc:
            r1 = "video/hevc";
            r2 = new com.google.android.exoplayer2.c.k;
            r3 = r0.f6806h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.video.C2376b.m8714a(r2);
            r3 = r2.f7544a;
            r2 = r2.f7545b;
            r0.f6797O = r2;
            goto L_0x02f3;
        L_0x02e0:
            r1 = "video/avc";
            r2 = new com.google.android.exoplayer2.c.k;
            r3 = r0.f6806h;
            r2.<init>(r3);
            r2 = com.google.android.exoplayer2.video.C2375a.m8712a(r2);
            r3 = r2.f7539a;
            r2 = r2.f7540b;
            r0.f6797O = r2;
        L_0x02f3:
            r12 = r1;
            r2 = r3;
            goto L_0x0311;
        L_0x02f6:
            r1 = "video/mp4v-es";
            r2 = r0.f6806h;
            if (r2 != 0) goto L_0x02ff;
        L_0x02fc:
            r2 = r10;
            goto L_0x0251;
        L_0x02ff:
            r2 = r0.f6806h;
            r2 = java.util.Collections.singletonList(r2);
            goto L_0x0251;
        L_0x0307:
            r1 = "video/mpeg2";
            goto L_0x030f;
        L_0x030a:
            r1 = "video/x-vnd.on2.vp9";
            goto L_0x030f;
        L_0x030d:
            r1 = "video/x-vnd.on2.vp8";
        L_0x030f:
            r12 = r1;
            r2 = r10;
        L_0x0311:
            r15 = -1;
        L_0x0312:
            r18 = -1;
        L_0x0314:
            r1 = r0.f6795M;
            r1 = r1 | r7;
            r3 = r0.f6794L;
            if (r3 == 0) goto L_0x031c;
        L_0x031b:
            r7 = 2;
        L_0x031c:
            r1 = r1 | r7;
            r3 = com.google.android.exoplayer2.p126c.C2170h.m7942a(r12);
            if (r3 == 0) goto L_0x0344;
        L_0x0323:
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r3 = r0.f6789G;
            r4 = r0.f6791I;
            r6 = r0.f6807i;
            r7 = r0.f6798P;
            r16 = r3;
            r17 = r4;
            r19 = r2;
            r20 = r6;
            r21 = r1;
            r22 = r7;
            r1 = com.google.android.exoplayer2.Format.m7740a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
            r8 = 1;
            goto L_0x040d;
        L_0x0344:
            r3 = com.google.android.exoplayer2.p126c.C2170h.m7943b(r12);
            if (r3 == 0) goto L_0x03bd;
        L_0x034a:
            r1 = r0.f6812n;
            if (r1 != 0) goto L_0x0364;
        L_0x034e:
            r1 = r0.f6810l;
            if (r1 != r9) goto L_0x0355;
        L_0x0352:
            r1 = r0.f6808j;
            goto L_0x0357;
        L_0x0355:
            r1 = r0.f6810l;
        L_0x0357:
            r0.f6810l = r1;
            r1 = r0.f6811m;
            if (r1 != r9) goto L_0x0360;
        L_0x035d:
            r1 = r0.f6809k;
            goto L_0x0362;
        L_0x0360:
            r1 = r0.f6811m;
        L_0x0362:
            r0.f6811m = r1;
        L_0x0364:
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r3 = r0.f6810l;
            if (r3 == r9) goto L_0x0380;
        L_0x036a:
            r3 = r0.f6811m;
            if (r3 == r9) goto L_0x0380;
        L_0x036e:
            r1 = r0.f6809k;
            r3 = r0.f6810l;
            r1 = r1 * r3;
            r1 = (float) r1;
            r3 = r0.f6808j;
            r4 = r0.f6811m;
            r3 = r3 * r4;
            r3 = (float) r3;
            r1 = r1 / r3;
            r21 = r1;
            goto L_0x0382;
        L_0x0380:
            r21 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        L_0x0382:
            r1 = r0.f6815q;
            if (r1 == 0) goto L_0x0395;
        L_0x0386:
            r1 = r26.m8119a();
            r10 = new com.google.android.exoplayer2.video.ColorInfo;
            r3 = r0.f6816r;
            r4 = r0.f6818t;
            r5 = r0.f6817s;
            r10.<init>(r3, r4, r5, r1);
        L_0x0395:
            r24 = r10;
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r1 = r0.f6808j;
            r3 = r0.f6809k;
            r18 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r20 = -1;
            r4 = r0.f6813o;
            r5 = r0.f6814p;
            r7 = r0.f6807i;
            r16 = r1;
            r17 = r3;
            r19 = r2;
            r22 = r4;
            r23 = r5;
            r25 = r7;
            r1 = com.google.android.exoplayer2.Format.m7738a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
            r8 = 2;
            goto L_0x040d;
        L_0x03bd:
            r3 = "application/x-subrip";
            r3 = r3.equals(r12);
            if (r3 == 0) goto L_0x03d9;
        L_0x03c5:
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r2 = r0.f6798P;
            r3 = r0.f6807i;
            r15 = r1;
            r16 = r2;
            r17 = r3;
            r1 = com.google.android.exoplayer2.Format.m7744a(r11, r12, r13, r14, r15, r16, r17);
            goto L_0x040d;
        L_0x03d9:
            r1 = "application/vobsub";
            r1 = r1.equals(r12);
            if (r1 != 0) goto L_0x03fa;
        L_0x03e1:
            r1 = "application/pgs";
            r1 = r1.equals(r12);
            if (r1 != 0) goto L_0x03fa;
        L_0x03e9:
            r1 = "application/dvbsubs";
            r1 = r1.equals(r12);
            if (r1 == 0) goto L_0x03f2;
        L_0x03f1:
            goto L_0x03fa;
        L_0x03f2:
            r1 = new com.google.android.exoplayer2.ParserException;
            r2 = "Unexpected MIME type.";
            r1.<init>(r2);
            throw r1;
        L_0x03fa:
            r11 = java.lang.Integer.toString(r28);
            r13 = 0;
            r14 = -1;
            r1 = r0.f6798P;
            r3 = r0.f6807i;
            r15 = r2;
            r16 = r1;
            r17 = r3;
            r1 = com.google.android.exoplayer2.Format.m7746a(r11, r12, r13, r14, r15, r16, r17);
        L_0x040d:
            r2 = r0.f6800b;
            r3 = r27;
            r2 = r3.mo4053a(r2, r8);
            r0.f6796N = r2;
            r2 = r0.f6796N;
            r2.mo1606a(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.a.d.b.a(com.google.android.exoplayer2.extractor.h, int):void");
        }

        /* renamed from: a */
        private byte[] m8119a() {
            if (!(this.f6821w == -1.0f || this.f6822x == -1.0f || this.f6823y == -1.0f || this.f6824z == -1.0f || this.f6783A == -1.0f || this.f6784B == -1.0f || this.f6785C == -1.0f || this.f6786D == -1.0f || this.f6787E == -1.0f)) {
                if (this.f6788F != -1.0f) {
                    byte[] bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((int) ((this.f6821w * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6822x * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6823y * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6824z * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6783A * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6784B * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6785C * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) ((this.f6786D * 50000.0f) + 0.5f)));
                    wrap.putShort((short) ((int) (this.f6787E + 0.5f)));
                    wrap.putShort((short) ((int) (this.f6788F + 0.5f)));
                    wrap.putShort((short) this.f6819u);
                    wrap.putShort((short) this.f6820v);
                    return bArr;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static java.util.List<byte[]> m8117a(com.google.android.exoplayer2.p126c.C2175k r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = 16;
            r5.m7981d(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r0 = r5.m7992m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r2 = 826496599; // 0x31435657 float:2.8425313E-9 double:4.08343576E-315;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r4 == 0) goto L_0x0012;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0010:
            r5 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0012:
            r0 = r5.m7980d();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r0 = r0 + 20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r5 = r5.f6735a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x001a:
            r1 = r5.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r1 = r1 + -4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r0 >= r1) goto L_0x0045;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x001f:
            r1 = r5[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r1 != 0) goto L_0x0042;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0023:
            r1 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r1 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r1 != 0) goto L_0x0042;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0029:
            r1 = r0 + 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r1 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r2 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r1 != r2) goto L_0x0042;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0030:
            r1 = r0 + 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r1 = r5[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r2 = 15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            if (r1 != r2) goto L_0x0042;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0038:
            r1 = r5.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r5 = java.util.Arrays.copyOfRange(r5, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r5 = java.util.Collections.singletonList(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            return r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0042:
            r0 = r0 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            goto L_0x001a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x0045:
            r5 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r0 = "Failed to find FourCC VC1 initialization data";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            r5.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
            throw r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004d }
        L_0x004d:
            r5 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing FourCC VC1 codec private";
            r5.<init>(r0);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.a.d.b.a(com.google.android.exoplayer2.c.k):java.util.List<byte[]>");
        }

        /* renamed from: a */
        private static java.util.List<byte[]> m8118a(byte[] r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = r8[r0];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r2 = 2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r1 != r2) goto L_0x0069;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0006:
            r1 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0009:
            r5 = r8[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = -1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r5 != r6) goto L_0x0013;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x000e:
            r4 = r4 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            goto L_0x0009;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0013:
            r5 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r8[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r4 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0019:
            r7 = r8[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r7 != r6) goto L_0x0022;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x001d:
            r3 = r3 + 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            goto L_0x0019;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0022:
            r6 = r5 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r8[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 + r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r5 != r1) goto L_0x0061;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x002b:
            r1 = new byte[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            java.lang.System.arraycopy(r8, r6, r1, r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r6 = r6 + r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r5 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r4 != r5) goto L_0x0059;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0036:
            r6 = r6 + r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r8[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = 5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            if (r3 != r4) goto L_0x0051;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x003c:
            r3 = r8.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = r3 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r3 = new byte[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r8.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r4 = r4 - r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            java.lang.System.arraycopy(r8, r6, r3, r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8 = new java.util.ArrayList;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.add(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            return r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0051:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0059:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0061:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0069:
            r8 = new com.google.android.exoplayer2.ParserException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r0 = "Error parsing vorbis codec private";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            r8.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
            throw r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0071 }
        L_0x0071:
            r8 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing vorbis codec private";
            r8.<init>(r0);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.a.d.b.a(byte[]):java.util.List<byte[]>");
        }

        /* renamed from: b */
        private static boolean m8120b(com.google.android.exoplayer2.p126c.C2175k r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = r8.m7988i();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r1 = 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != r1) goto L_0x0008;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0007:
            return r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0008:
            r2 = 65534; // 0xfffe float:9.1833E-41 double:3.2378E-319;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r3 = 0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != r2) goto L_0x0036;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x000e:
            r0 = 24;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8.m7979c(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r4 = r8.m7995p();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r0 = com.google.android.exoplayer2.extractor.p127a.C3964d.f15780d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r6 = r0.getMostSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            if (r0 != 0) goto L_0x0034;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        L_0x0023:
            r4 = r8.m7995p();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8 = com.google.android.exoplayer2.extractor.p127a.C3964d.f15780d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r6 = r8.getLeastSignificantBits();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
            r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r8 != 0) goto L_0x0034;
        L_0x0033:
            goto L_0x0035;
        L_0x0034:
            r1 = 0;
        L_0x0035:
            return r1;
        L_0x0036:
            return r3;
        L_0x0037:
            r8 = new com.google.android.exoplayer2.ParserException;
            r0 = "Error parsing MS/ACM codec private";
            r8.<init>(r0);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.a.d.b.b(com.google.android.exoplayer2.c.k):boolean");
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a.d$1 */
    static class C39621 implements C2262i {
        C39621() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3964d()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.a.d$a */
    private final class C3963a implements C2199c {
        /* renamed from: a */
        final /* synthetic */ C3964d f15776a;

        private C3963a(C3964d c3964d) {
            this.f15776a = c3964d;
        }

        /* renamed from: a */
        public int mo1565a(int i) {
            return this.f15776a.m19743a(i);
        }

        /* renamed from: b */
        public boolean mo1571b(int i) {
            return this.f15776a.m19753b(i);
        }

        /* renamed from: a */
        public void mo1569a(int i, long j, long j2) {
            this.f15776a.m19748a(i, j, j2);
        }

        /* renamed from: c */
        public void mo1572c(int i) {
            this.f15776a.m19755c(i);
        }

        /* renamed from: a */
        public void mo1568a(int i, long j) {
            this.f15776a.m19747a(i, j);
        }

        /* renamed from: a */
        public void mo1566a(int i, double d) {
            this.f15776a.m19745a(i, d);
        }

        /* renamed from: a */
        public void mo1570a(int i, String str) {
            this.f15776a.m19749a(i, str);
        }

        /* renamed from: a */
        public void mo1567a(int i, int i2, C2260g c2260g) {
            this.f15776a.m19746a(i, i2, c2260g);
        }
    }

    /* renamed from: a */
    int m19743a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    boolean m19753b(int i) {
        if (!(i == 357149030 || i == 524531317 || i == 475249515)) {
            if (i != 374648427) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C3964d() {
        this(0);
    }

    public C3964d(int i) {
        this(new C3961a(), i);
    }

    C3964d(C2198b c2198b, int i) {
        this.f15822t = -1;
        this.f15823u = -9223372036854775807L;
        this.f15824v = -9223372036854775807L;
        this.f15825w = -9223372036854775807L;
        this.f15783C = -1;
        this.f15784D = -1;
        this.f15785E = -9223372036854775807L;
        this.f15807e = c2198b;
        this.f15807e.mo1562a(new C3963a());
        c2198b = true;
        if ((i & 1) != 0) {
            c2198b = null;
        }
        this.f15810h = c2198b;
        this.f15808f = new C2202f();
        this.f15809g = new SparseArray();
        this.f15813k = new C2175k(4);
        this.f15814l = new C2175k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15815m = new C2175k(4);
        this.f15811i = new C2175k(C2173i.f6727a);
        this.f15812j = new C2175k(4);
        this.f15816n = new C2175k();
        this.f15817o = new C2175k();
        this.f15818p = new C2175k(8);
        this.f15819q = new C2175k();
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        return new C2201e().m8123a(c2260g);
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.ac = c2261h;
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15785E = -9223372036854775807L;
        this.f15789I = 0;
        this.f15807e.mo1561a();
        this.f15808f.m8127a();
        m19741b();
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        int i = 0;
        this.aa = false;
        boolean z = true;
        while (z && !this.aa) {
            z = this.f15807e.mo1563a(c2260g);
            if (z && m19738a(c2265l, c2260g.mo1589c())) {
                return 1;
            }
        }
        if (!z) {
            i = -1;
        }
        return i;
    }

    /* renamed from: a */
    void m19748a(int i, long j, long j2) {
        if (i == 160) {
            this.ab = false;
        } else if (i == 174) {
            this.f15826x = new C2200b();
        } else if (i == 187) {
            this.f15788H = false;
        } else if (i == 19899) {
            this.f15828z = -1;
            this.f15781A = -1;
        } else if (i == 20533) {
            this.f15826x.f6803e = true;
        } else if (i == 21968) {
            this.f15826x.f6815q = true;
        } else if (i == 25152) {
        } else {
            if (i == 408125543) {
                if (this.f15822t != -1) {
                    if (this.f15822t != j) {
                        throw new ParserException("Multiple Segment elements not supported");
                    }
                }
                this.f15822t = j;
                this.f15821s = j2;
            } else if (i == 475249515) {
                this.f15786F = new C2168f();
                this.f15787G = new C2168f();
            } else if (i == 524531317) {
                if (this.f15827y != 0) {
                    return;
                }
                if (this.f15810h == 0 || this.f15783C == -1) {
                    this.ac.mo4057a(new C4021a(this.f15825w));
                    this.f15827y = true;
                    return;
                }
                this.f15782B = true;
            }
        }
    }

    /* renamed from: c */
    void m19755c(int i) {
        if (i != 160) {
            if (i == 174) {
                if (C3964d.m19739a(this.f15826x.f6799a) != 0) {
                    this.f15826x.m8121a(this.ac, this.f15826x.f6800b);
                    this.f15809g.put(this.f15826x.f6800b, this.f15826x);
                }
                this.f15826x = 0;
            } else if (i != 19899) {
                if (i != 25152) {
                    if (i != 28032) {
                        if (i == 357149030) {
                            if (this.f15823u == -9223372036854775807L) {
                                this.f15823u = 1000000;
                            }
                            if (this.f15824v != -9223372036854775807L) {
                                this.f15825w = m19730a(this.f15824v);
                            }
                        } else if (i != 374648427) {
                            if (i == 475249515) {
                                if (this.f15827y == 0) {
                                    this.ac.mo4057a(m19742d());
                                    this.f15827y = true;
                                }
                            }
                        } else if (this.f15809g.size() != 0) {
                            this.ac.mo4054a();
                        } else {
                            throw new ParserException("No valid tracks were found");
                        }
                    } else if (this.f15826x.f6803e != 0) {
                        if (this.f15826x.f6804f != 0) {
                            throw new ParserException("Combining encryption and compression is not supported");
                        }
                    }
                } else if (this.f15826x.f6803e != 0) {
                    if (this.f15826x.f6805g != 0) {
                        this.f15826x.f6807i = new DrmInitData(new SchemeData(C2162b.f6692b, "video/webm", this.f15826x.f6805g));
                    } else {
                        throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                    }
                }
            } else if (this.f15828z == -1 || this.f15781A == -1) {
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (this.f15828z == 475249515) {
                this.f15783C = this.f15781A;
            }
        } else if (this.f15789I == 2) {
            if (this.ab == 0) {
                this.f15797Q |= 1;
            }
            m19733a((C2200b) this.f15809g.get(this.f15795O), this.f15790J);
            this.f15789I = 0;
        }
    }

    /* renamed from: a */
    void m19747a(int i, long j) {
        boolean z = false;
        StringBuilder stringBuilder;
        switch (i) {
            case 131:
                this.f15826x.f6801c = (int) j;
                return;
            case 136:
                i = this.f15826x;
                if (j == 1) {
                    z = true;
                }
                i.f6794L = z;
                return;
            case 155:
                this.f15791K = m19730a(j);
                return;
            case 159:
                this.f15826x.f6789G = (int) j;
                return;
            case 176:
                this.f15826x.f6808j = (int) j;
                return;
            case 179:
                this.f15786F.m7937a(m19730a(j));
                return;
            case 186:
                this.f15826x.f6809k = (int) j;
                return;
            case 215:
                this.f15826x.f6800b = (int) j;
                return;
            case 231:
                this.f15785E = m19730a(j);
                return;
            case 241:
                if (this.f15788H == 0) {
                    this.f15787G.m7937a(j);
                    this.f15788H = true;
                    return;
                }
                return;
            case 251:
                this.ab = true;
                return;
            case 16980:
                if (j != 3) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentCompAlgo ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DocTypeReadVersion ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("EBMLReadVersion ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncAlgo ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("AESSettingsCipherMode ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncodingOrder ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ContentEncodingScope ");
                    stringBuilder.append(j);
                    stringBuilder.append(" not supported");
                    throw new ParserException(stringBuilder.toString());
                }
                return;
            case 21420:
                this.f15781A = j + this.f15822t;
                return;
            case 21432:
                i = (int) j;
                if (i == 3) {
                    this.f15826x.f6814p = 1;
                    return;
                } else if (i != 15) {
                    switch (i) {
                        case 0:
                            this.f15826x.f6814p = 0;
                            return;
                        case 1:
                            this.f15826x.f6814p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f15826x.f6814p = 3;
                    return;
                }
            case 21680:
                this.f15826x.f6810l = (int) j;
                return;
            case 21682:
                this.f15826x.f6812n = (int) j;
                return;
            case 21690:
                this.f15826x.f6811m = (int) j;
                return;
            case 21930:
                i = this.f15826x;
                if (j == 1) {
                    z = true;
                }
                i.f6795M = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.f15826x.f6818t = 2;
                        return;
                    case 2:
                        this.f15826x.f6818t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                i = (int) j;
                if (i != 1) {
                    if (i == 16) {
                        this.f15826x.f6817s = 6;
                        return;
                    } else if (i != 18) {
                        switch (i) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.f15826x.f6817s = 7;
                        return;
                    }
                }
                this.f15826x.f6817s = 3;
                return;
            case 21947:
                this.f15826x.f6815q = true;
                i = (int) j;
                if (i == 1) {
                    this.f15826x.f6816r = 1;
                    return;
                } else if (i != 9) {
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f15826x.f6816r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f15826x.f6816r = 6;
                    return;
                }
            case 21948:
                this.f15826x.f6819u = (int) j;
                return;
            case 21949:
                this.f15826x.f6820v = (int) j;
                return;
            case 22186:
                this.f15826x.f6792J = j;
                return;
            case 22203:
                this.f15826x.f6793K = j;
                return;
            case 25188:
                this.f15826x.f6790H = (int) j;
                return;
            case 2352003:
                this.f15826x.f6802d = (int) j;
                return;
            case 2807729:
                this.f15823u = j;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m19745a(int i, double d) {
        if (i == 181) {
            this.f15826x.f6791I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f15826x.f6821w = (float) d;
                    return;
                case 21970:
                    this.f15826x.f6822x = (float) d;
                    return;
                case 21971:
                    this.f15826x.f6823y = (float) d;
                    return;
                case 21972:
                    this.f15826x.f6824z = (float) d;
                    return;
                case 21973:
                    this.f15826x.f6783A = (float) d;
                    return;
                case 21974:
                    this.f15826x.f6784B = (float) d;
                    return;
                case 21975:
                    this.f15826x.f6785C = (float) d;
                    return;
                case 21976:
                    this.f15826x.f6786D = (float) d;
                    return;
                case 21977:
                    this.f15826x.f6787E = (float) d;
                    return;
                case 21978:
                    this.f15826x.f6788F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f15824v = (long) d;
        }
    }

    /* renamed from: a */
    void m19749a(int i, String str) {
        if (i == 134) {
            this.f15826x.f6799a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f15826x.f6798P = str;
            }
        } else if ("webm".equals(str) != 0) {
        } else {
            if ("matroska".equals(str) == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DocType ");
                stringBuilder.append(str);
                stringBuilder.append(" not supported");
                throw new ParserException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    void m19746a(int i, int i2, C2260g c2260g) {
        C3964d c3964d = this;
        int i3 = i;
        int i4 = i2;
        C2260g c2260g2 = c2260g;
        boolean z = false;
        if (i3 == 161 || i3 == 163) {
            long j = 8;
            if (c3964d.f15789I == 0) {
                c3964d.f15795O = (int) c3964d.f15808f.m8126a(c2260g2, false, true, 8);
                c3964d.f15796P = c3964d.f15808f.m8128b();
                c3964d.f15791K = -9223372036854775807L;
                c3964d.f15789I = 1;
                c3964d.f15813k.m7971a();
            }
            C2200b c2200b = (C2200b) c3964d.f15809g.get(c3964d.f15795O);
            if (c2200b == null) {
                c2260g2.mo1586b(i4 - c3964d.f15796P);
                c3964d.f15789I = 0;
                return;
            }
            if (c3964d.f15789I == 1) {
                int i5;
                m19734a(c2260g2, 3);
                int i6 = (c3964d.f15813k.f6735a[2] & 6) >> 1;
                int i7 = 255;
                if (i6 == 0) {
                    c3964d.f15793M = 1;
                    c3964d.f15794N = C3964d.m19740a(c3964d.f15794N, 1);
                    c3964d.f15794N[0] = (i4 - c3964d.f15796P) - 3;
                } else if (i3 == 163) {
                    m19734a(c2260g2, 4);
                    c3964d.f15793M = (c3964d.f15813k.f6735a[3] & 255) + 1;
                    c3964d.f15794N = C3964d.m19740a(c3964d.f15794N, c3964d.f15793M);
                    if (i6 == 2) {
                        Arrays.fill(c3964d.f15794N, 0, c3964d.f15793M, ((i4 - c3964d.f15796P) - 4) / c3964d.f15793M);
                    } else if (i6 == 1) {
                        r10 = 4;
                        i6 = 0;
                        for (r6 = 0; r6 < c3964d.f15793M - 1; r6++) {
                            c3964d.f15794N[r6] = 0;
                            do {
                                r10++;
                                m19734a(c2260g2, r10);
                                r14 = c3964d.f15813k.f6735a[r10 - 1] & 255;
                                int[] iArr = c3964d.f15794N;
                                iArr[r6] = iArr[r6] + r14;
                            } while (r14 == 255);
                            i6 += c3964d.f15794N[r6];
                        }
                        c3964d.f15794N[c3964d.f15793M - 1] = ((i4 - c3964d.f15796P) - r10) - i6;
                    } else if (i6 == 3) {
                        r6 = 0;
                        r10 = 4;
                        i6 = 0;
                        while (r6 < c3964d.f15793M - 1) {
                            c3964d.f15794N[r6] = z;
                            r10++;
                            m19734a(c2260g2, r10);
                            int i8 = r10 - 1;
                            if (c3964d.f15813k.f6735a[i8] != (byte) 0) {
                                long j2;
                                long j3 = 0;
                                r14 = 0;
                                while (r14 < j) {
                                    int i9 = 1 << (7 - r14);
                                    if ((c3964d.f15813k.f6735a[i8] & i9) != 0) {
                                        r10 += r14;
                                        m19734a(c2260g2, r10);
                                        i5 = i8 + 1;
                                        j3 = (long) ((c3964d.f15813k.f6735a[i8] & i7) & (i9 ^ -1));
                                        while (i5 < r10) {
                                            i5++;
                                            j3 = ((long) (c3964d.f15813k.f6735a[i5] & 255)) | (j3 << j);
                                            j = 8;
                                        }
                                        if (r6 > 0) {
                                            j3 -= (1 << ((r14 * 7) + 6)) - 1;
                                        }
                                        j2 = j3;
                                        if (j2 >= -2147483648L || j2 > 2147483647L) {
                                            throw new ParserException("EBML lacing sample size out of range.");
                                        }
                                        i5 = (int) j2;
                                        int[] iArr2 = c3964d.f15794N;
                                        if (r6 != 0) {
                                            i5 += c3964d.f15794N[r6 - 1];
                                        }
                                        iArr2[r6] = i5;
                                        i6 += c3964d.f15794N[r6];
                                        r6++;
                                        z = false;
                                        j = 8;
                                        i7 = 255;
                                    } else {
                                        r14++;
                                        j = 8;
                                        i7 = 255;
                                    }
                                }
                                j2 = j3;
                                if (j2 >= -2147483648L) {
                                }
                                throw new ParserException("EBML lacing sample size out of range.");
                            }
                            throw new ParserException("No valid varint length mask found");
                        }
                        c3964d.f15794N[c3964d.f15793M - 1] = ((i4 - c3964d.f15796P) - r10) - i6;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected lacing value: ");
                        stringBuilder.append(i6);
                        throw new ParserException(stringBuilder.toString());
                    }
                } else {
                    throw new ParserException("Lacing only supported in SimpleBlocks.");
                }
                c3964d.f15790J = c3964d.f15785E + m19730a((long) ((c3964d.f15813k.f6735a[0] << 8) | (c3964d.f15813k.f6735a[1] & 255)));
                Object obj = (c3964d.f15813k.f6735a[2] & 8) == 8 ? 1 : null;
                if (c2200b.f6801c != 2) {
                    if (i3 != 163 || (c3964d.f15813k.f6735a[2] & 128) != 128) {
                        i5 = 0;
                        c3964d.f15797Q = i5 | (obj == null ? Integer.MIN_VALUE : 0);
                        c3964d.f15789I = 2;
                        c3964d.f15792L = 0;
                    }
                }
                i5 = 1;
                if (obj == null) {
                }
                c3964d.f15797Q = i5 | (obj == null ? Integer.MIN_VALUE : 0);
                c3964d.f15789I = 2;
                c3964d.f15792L = 0;
            }
            if (i3 == 163) {
                while (c3964d.f15792L < c3964d.f15793M) {
                    m19735a(c2260g2, c2200b, c3964d.f15794N[c3964d.f15792L]);
                    m19733a(c2200b, c3964d.f15790J + ((long) ((c3964d.f15792L * c2200b.f6802d) / 1000)));
                    c3964d.f15792L++;
                }
                c3964d.f15789I = 0;
            } else {
                m19735a(c2260g2, c2200b, c3964d.f15794N[0]);
            }
        } else if (i3 == 16981) {
            c3964d.f15826x.f6804f = new byte[i4];
            c2260g2.mo1587b(c3964d.f15826x.f6804f, 0, i4);
        } else if (i3 == 18402) {
            c3964d.f15826x.f6805g = new byte[i4];
            c2260g2.mo1587b(c3964d.f15826x.f6805g, 0, i4);
        } else if (i3 == 21419) {
            Arrays.fill(c3964d.f15815m.f6735a, (byte) 0);
            c2260g2.mo1587b(c3964d.f15815m.f6735a, 4 - i4, i4);
            c3964d.f15815m.m7979c(0);
            c3964d.f15828z = (int) c3964d.f15815m.m7991l();
        } else if (i3 == 25506) {
            c3964d.f15826x.f6806h = new byte[i4];
            c2260g2.mo1587b(c3964d.f15826x.f6806h, 0, i4);
        } else if (i3 == 30322) {
            c3964d.f15826x.f6813o = new byte[i4];
            c2260g2.mo1587b(c3964d.f15826x.f6813o, 0, i4);
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unexpected id: ");
            stringBuilder2.append(i3);
            throw new ParserException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    private void m19733a(C2200b c2200b, long j) {
        if ("S_TEXT/UTF8".equals(c2200b.f6799a)) {
            m19732a(c2200b);
        }
        c2200b.f6796N.mo1605a(j, this.f15797Q, this.f15806Z, 0, c2200b.f6805g);
        this.aa = true;
        m19741b();
    }

    /* renamed from: b */
    private void m19741b() {
        this.f15798R = 0;
        this.f15806Z = 0;
        this.f15805Y = 0;
        this.f15799S = false;
        this.f15800T = false;
        this.f15802V = false;
        this.f15804X = 0;
        this.f15803W = (byte) 0;
        this.f15801U = false;
        this.f15816n.m7971a();
    }

    /* renamed from: a */
    private void m19734a(C2260g c2260g, int i) {
        if (this.f15813k.m7978c() < i) {
            if (this.f15813k.m7982e() < i) {
                this.f15813k.m7974a(Arrays.copyOf(this.f15813k.f6735a, Math.max(this.f15813k.f6735a.length * 2, i)), this.f15813k.m7978c());
            }
            c2260g.mo1587b(this.f15813k.f6735a, this.f15813k.m7978c(), i - this.f15813k.m7978c());
            this.f15813k.m7977b(i);
        }
    }

    /* renamed from: a */
    private void m19735a(C2260g c2260g, C2200b c2200b, int i) {
        if ("S_TEXT/UTF8".equals(c2200b.f6799a)) {
            c2200b = f15778b.length + i;
            if (this.f15817o.m7982e() < c2200b) {
                this.f15817o.f6735a = Arrays.copyOf(f15778b, c2200b + i);
            }
            c2260g.mo1587b(this.f15817o.f6735a, f15778b.length, i);
            this.f15817o.m7979c(0);
            this.f15817o.m7977b(c2200b);
            return;
        }
        C2267n c2267n = c2200b.f6796N;
        if (!this.f15799S) {
            if (c2200b.f6803e) {
                this.f15797Q &= -1073741825;
                int i2 = 128;
                if (!this.f15800T) {
                    c2260g.mo1587b(this.f15813k.f6735a, 0, 1);
                    this.f15798R++;
                    if ((this.f15813k.f6735a[0] & 128) != 128) {
                        this.f15803W = this.f15813k.f6735a[0];
                        this.f15800T = true;
                    } else {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                }
                if (((this.f15803W & 1) == 1 ? 1 : null) != null) {
                    Object obj = (this.f15803W & 2) == 2 ? 1 : null;
                    this.f15797Q |= 1073741824;
                    if (!this.f15801U) {
                        c2260g.mo1587b(this.f15818p.f6735a, 0, 8);
                        this.f15798R += 8;
                        this.f15801U = true;
                        byte[] bArr = this.f15813k.f6735a;
                        if (obj == null) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.f15813k.m7979c(0);
                        c2267n.mo1607a(this.f15813k, 1);
                        this.f15806Z++;
                        this.f15818p.m7979c(0);
                        c2267n.mo1607a(this.f15818p, 8);
                        this.f15806Z += 8;
                    }
                    if (obj != null) {
                        if (!this.f15802V) {
                            c2260g.mo1587b(this.f15813k.f6735a, 0, 1);
                            this.f15798R++;
                            this.f15813k.m7979c(0);
                            this.f15804X = this.f15813k.m7986g();
                            this.f15802V = true;
                        }
                        int i3 = this.f15804X * 4;
                        this.f15813k.m7972a(i3);
                        c2260g.mo1587b(this.f15813k.f6735a, 0, i3);
                        this.f15798R += i3;
                        short s = (short) ((this.f15804X / 2) + 1);
                        i2 = (s * 6) + 2;
                        if (this.f15820r == null || this.f15820r.capacity() < i2) {
                            this.f15820r = ByteBuffer.allocate(i2);
                        }
                        this.f15820r.position(0);
                        this.f15820r.putShort(s);
                        i3 = 0;
                        int i4 = 0;
                        while (i3 < this.f15804X) {
                            int t = this.f15813k.m7999t();
                            if (i3 % 2 == 0) {
                                this.f15820r.putShort((short) (t - i4));
                            } else {
                                this.f15820r.putInt(t - i4);
                            }
                            i3++;
                            i4 = t;
                        }
                        i3 = (i - this.f15798R) - i4;
                        if (this.f15804X % 2 == 1) {
                            this.f15820r.putInt(i3);
                        } else {
                            this.f15820r.putShort((short) i3);
                            this.f15820r.putInt(0);
                        }
                        this.f15819q.m7974a(this.f15820r.array(), i2);
                        c2267n.mo1607a(this.f15819q, i2);
                        this.f15806Z += i2;
                    }
                }
            } else if (c2200b.f6804f != null) {
                this.f15816n.m7974a(c2200b.f6804f, c2200b.f6804f.length);
            }
            this.f15799S = true;
        }
        i += this.f15816n.m7978c();
        if (!"V_MPEG4/ISO/AVC".equals(c2200b.f6799a)) {
            if (!"V_MPEGH/ISO/HEVC".equals(c2200b.f6799a)) {
                while (this.f15798R < i) {
                    m19729a(c2260g, c2267n, i - this.f15798R);
                }
                if ("A_VORBIS".equals(c2200b.f6799a) != null) {
                    this.f15814l.m7979c(0);
                    c2267n.mo1607a(this.f15814l, 4);
                    this.f15806Z += 4;
                }
            }
        }
        byte[] bArr2 = this.f15812j.f6735a;
        bArr2[0] = (byte) 0;
        bArr2[1] = (byte) 0;
        bArr2[2] = (byte) 0;
        int i5 = c2200b.f6797O;
        int i6 = 4 - c2200b.f6797O;
        while (this.f15798R < i) {
            if (this.f15805Y == 0) {
                m19736a(c2260g, bArr2, i6, i5);
                this.f15812j.m7979c(0);
                this.f15805Y = this.f15812j.m7999t();
                this.f15811i.m7979c(0);
                c2267n.mo1607a(this.f15811i, 4);
                this.f15806Z += 4;
            } else {
                this.f15805Y -= m19729a(c2260g, c2267n, this.f15805Y);
            }
        }
        if ("A_VORBIS".equals(c2200b.f6799a) != null) {
            this.f15814l.m7979c(0);
            c2267n.mo1607a(this.f15814l, 4);
            this.f15806Z += 4;
        }
    }

    /* renamed from: a */
    private void m19732a(C2200b c2200b) {
        C3964d.m19737a(this.f15817o.f6735a, this.f15791K);
        c2200b.f6796N.mo1607a(this.f15817o, this.f15817o.m7978c());
        this.f15806Z += this.f15817o.m7978c();
    }

    /* renamed from: a */
    private static void m19737a(byte[] bArr, long j) {
        if (j == -9223372036854775807L) {
            j = f15779c;
        } else {
            j -= ((long) ((int) (j / 3600000000L))) * 3600000000L;
            j -= (long) (60000000 * ((int) (j / 60000000)));
            j = (int) ((j - ((long) (1000000 * ((int) (j / 1000000))))) / 1000);
            j = C2186s.m8060c(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(r3), Integer.valueOf(r1), Integer.valueOf(r2), Integer.valueOf(j)}));
        }
        System.arraycopy(j, 0, bArr, 19, 12);
    }

    /* renamed from: a */
    private void m19736a(C2260g c2260g, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f15816n.m7976b());
        c2260g.mo1587b(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f15816n.m7975a(bArr, i, min);
        }
        this.f15798R += i2;
    }

    /* renamed from: a */
    private int m19729a(C2260g c2260g, C2267n c2267n, int i) {
        int b = this.f15816n.m7976b();
        if (b > 0) {
            c2260g = Math.min(i, b);
            c2267n.mo1607a(this.f15816n, c2260g);
        } else {
            c2260g = c2267n.mo1604a(c2260g, i, false);
        }
        this.f15798R += c2260g;
        this.f15806Z += c2260g;
        return c2260g;
    }

    /* renamed from: d */
    private C2266m m19742d() {
        if (!(this.f15822t == -1 || this.f15825w == -9223372036854775807L || this.f15786F == null || this.f15786F.m7935a() == 0 || this.f15787G == null)) {
            if (this.f15787G.m7935a() == this.f15786F.m7935a()) {
                int i;
                int a = this.f15786F.m7935a();
                int[] iArr = new int[a];
                long[] jArr = new long[a];
                long[] jArr2 = new long[a];
                long[] jArr3 = new long[a];
                int i2 = 0;
                for (i = 0; i < a; i++) {
                    jArr3[i] = this.f15786F.m7936a(i);
                    jArr[i] = this.f15822t + this.f15787G.m7936a(i);
                }
                while (true) {
                    i = a - 1;
                    if (i2 < i) {
                        i = i2 + 1;
                        iArr[i2] = (int) (jArr[i] - jArr[i2]);
                        jArr2[i2] = jArr3[i] - jArr3[i2];
                        i2 = i;
                    } else {
                        iArr[i] = (int) ((this.f15822t + this.f15821s) - jArr[i]);
                        jArr2[i] = this.f15825w - jArr3[i];
                        this.f15786F = null;
                        this.f15787G = null;
                        return new C3965a(iArr, jArr, jArr2, jArr3);
                    }
                }
            }
        }
        this.f15786F = null;
        this.f15787G = null;
        return new C4021a(this.f15825w);
    }

    /* renamed from: a */
    private boolean m19738a(C2265l c2265l, long j) {
        if (this.f15782B) {
            this.f15784D = j;
            c2265l.f7191a = this.f15783C;
            this.f15782B = false;
            return true;
        } else if (this.f15827y == null || this.f15784D == -1) {
            return false;
        } else {
            c2265l.f7191a = this.f15784D;
            this.f15784D = -1;
            return true;
        }
    }

    /* renamed from: a */
    private long m19730a(long j) {
        if (this.f15823u != -9223372036854775807L) {
            return C2186s.m8057b(j, this.f15823u, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static boolean m19739a(String str) {
        if (!("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str))) {
            if ("S_DVBSUB".equals(str) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m19740a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
