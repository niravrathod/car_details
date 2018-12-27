package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.c.a */
abstract class C2203a {
    /* renamed from: A */
    public static final int f6831A = C2186s.m8062e("sidx");
    /* renamed from: B */
    public static final int f6832B = C2186s.m8062e("moov");
    /* renamed from: C */
    public static final int f6833C = C2186s.m8062e("mvhd");
    /* renamed from: D */
    public static final int f6834D = C2186s.m8062e("trak");
    /* renamed from: E */
    public static final int f6835E = C2186s.m8062e("mdia");
    /* renamed from: F */
    public static final int f6836F = C2186s.m8062e("minf");
    /* renamed from: G */
    public static final int f6837G = C2186s.m8062e("stbl");
    /* renamed from: H */
    public static final int f6838H = C2186s.m8062e("avcC");
    /* renamed from: I */
    public static final int f6839I = C2186s.m8062e("hvcC");
    /* renamed from: J */
    public static final int f6840J = C2186s.m8062e("esds");
    /* renamed from: K */
    public static final int f6841K = C2186s.m8062e("moof");
    /* renamed from: L */
    public static final int f6842L = C2186s.m8062e("traf");
    /* renamed from: M */
    public static final int f6843M = C2186s.m8062e("mvex");
    /* renamed from: N */
    public static final int f6844N = C2186s.m8062e("mehd");
    /* renamed from: O */
    public static final int f6845O = C2186s.m8062e("tkhd");
    /* renamed from: P */
    public static final int f6846P = C2186s.m8062e("edts");
    /* renamed from: Q */
    public static final int f6847Q = C2186s.m8062e("elst");
    /* renamed from: R */
    public static final int f6848R = C2186s.m8062e("mdhd");
    /* renamed from: S */
    public static final int f6849S = C2186s.m8062e("hdlr");
    /* renamed from: T */
    public static final int f6850T = C2186s.m8062e("stsd");
    /* renamed from: U */
    public static final int f6851U = C2186s.m8062e("pssh");
    /* renamed from: V */
    public static final int f6852V = C2186s.m8062e("sinf");
    /* renamed from: W */
    public static final int f6853W = C2186s.m8062e("schm");
    /* renamed from: X */
    public static final int f6854X = C2186s.m8062e("schi");
    /* renamed from: Y */
    public static final int f6855Y = C2186s.m8062e("tenc");
    /* renamed from: Z */
    public static final int f6856Z = C2186s.m8062e("encv");
    /* renamed from: a */
    public static final int f6857a = C2186s.m8062e("ftyp");
    public static final int aA = C2186s.m8062e("udta");
    public static final int aB = C2186s.m8062e("meta");
    public static final int aC = C2186s.m8062e("ilst");
    public static final int aD = C2186s.m8062e("mean");
    public static final int aE = C2186s.m8062e("name");
    public static final int aF = C2186s.m8062e("data");
    public static final int aG = C2186s.m8062e("emsg");
    public static final int aH = C2186s.m8062e("st3d");
    public static final int aI = C2186s.m8062e("sv3d");
    public static final int aJ = C2186s.m8062e("proj");
    public static final int aK = C2186s.m8062e("vp08");
    public static final int aL = C2186s.m8062e("vp09");
    public static final int aM = C2186s.m8062e("vpcC");
    public static final int aN = C2186s.m8062e("camm");
    public static final int aO = C2186s.m8062e("alac");
    public static final int aa = C2186s.m8062e("enca");
    public static final int ab = C2186s.m8062e("frma");
    public static final int ac = C2186s.m8062e("saiz");
    public static final int ad = C2186s.m8062e("saio");
    public static final int ae = C2186s.m8062e("sbgp");
    public static final int af = C2186s.m8062e("sgpd");
    public static final int ag = C2186s.m8062e("uuid");
    public static final int ah = C2186s.m8062e("senc");
    public static final int ai = C2186s.m8062e("pasp");
    public static final int aj = C2186s.m8062e("TTML");
    public static final int ak = C2186s.m8062e("vmhd");
    public static final int al = C2186s.m8062e("mp4v");
    public static final int am = C2186s.m8062e("stts");
    public static final int an = C2186s.m8062e("stss");
    public static final int ao = C2186s.m8062e("ctts");
    public static final int ap = C2186s.m8062e("stsc");
    public static final int aq = C2186s.m8062e("stsz");
    public static final int ar = C2186s.m8062e("stz2");
    public static final int as = C2186s.m8062e("stco");
    public static final int at = C2186s.m8062e("co64");
    public static final int au = C2186s.m8062e("tx3g");
    public static final int av = C2186s.m8062e("wvtt");
    public static final int aw = C2186s.m8062e("stpp");
    public static final int ax = C2186s.m8062e("c608");
    public static final int ay = C2186s.m8062e("samr");
    public static final int az = C2186s.m8062e("sawb");
    /* renamed from: b */
    public static final int f6858b = C2186s.m8062e("avc1");
    /* renamed from: c */
    public static final int f6859c = C2186s.m8062e("avc3");
    /* renamed from: d */
    public static final int f6860d = C2186s.m8062e("hvc1");
    /* renamed from: e */
    public static final int f6861e = C2186s.m8062e("hev1");
    /* renamed from: f */
    public static final int f6862f = C2186s.m8062e("s263");
    /* renamed from: g */
    public static final int f6863g = C2186s.m8062e("d263");
    /* renamed from: h */
    public static final int f6864h = C2186s.m8062e("mdat");
    /* renamed from: i */
    public static final int f6865i = C2186s.m8062e("mp4a");
    /* renamed from: j */
    public static final int f6866j = C2186s.m8062e(".mp3");
    /* renamed from: k */
    public static final int f6867k = C2186s.m8062e("wave");
    /* renamed from: l */
    public static final int f6868l = C2186s.m8062e("lpcm");
    /* renamed from: m */
    public static final int f6869m = C2186s.m8062e("sowt");
    /* renamed from: n */
    public static final int f6870n = C2186s.m8062e("ac-3");
    /* renamed from: o */
    public static final int f6871o = C2186s.m8062e("dac3");
    /* renamed from: p */
    public static final int f6872p = C2186s.m8062e("ec-3");
    /* renamed from: q */
    public static final int f6873q = C2186s.m8062e("dec3");
    /* renamed from: r */
    public static final int f6874r = C2186s.m8062e("dtsc");
    /* renamed from: s */
    public static final int f6875s = C2186s.m8062e("dtsh");
    /* renamed from: t */
    public static final int f6876t = C2186s.m8062e("dtsl");
    /* renamed from: u */
    public static final int f6877u = C2186s.m8062e("dtse");
    /* renamed from: v */
    public static final int f6878v = C2186s.m8062e("ddts");
    /* renamed from: w */
    public static final int f6879w = C2186s.m8062e("tfdt");
    /* renamed from: x */
    public static final int f6880x = C2186s.m8062e("tfhd");
    /* renamed from: y */
    public static final int f6881y = C2186s.m8062e("trex");
    /* renamed from: z */
    public static final int f6882z = C2186s.m8062e("trun");
    public final int aP;

    /* renamed from: com.google.android.exoplayer2.extractor.c.a$a */
    static final class C3970a extends C2203a {
        public final long aQ;
        public final List<C3971b> aR = new ArrayList();
        public final List<C3970a> aS = new ArrayList();

        public C3970a(int i, long j) {
            super(i);
            this.aQ = j;
        }

        /* renamed from: a */
        public void m19795a(C3971b c3971b) {
            this.aR.add(c3971b);
        }

        /* renamed from: a */
        public void m19794a(C3970a c3970a) {
            this.aS.add(c3970a);
        }

        /* renamed from: d */
        public C3971b m19796d(int i) {
            int size = this.aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3971b c3971b = (C3971b) this.aR.get(i2);
                if (c3971b.aP == i) {
                    return c3971b;
                }
            }
            return 0;
        }

        /* renamed from: e */
        public C3970a m19797e(int i) {
            int size = this.aS.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3970a c3970a = (C3970a) this.aS.get(i2);
                if (c3970a.aP == i) {
                    return c3970a;
                }
            }
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C2203a.m8131c(this.aP));
            stringBuilder.append(" leaves: ");
            stringBuilder.append(Arrays.toString(this.aR.toArray()));
            stringBuilder.append(" containers: ");
            stringBuilder.append(Arrays.toString(this.aS.toArray()));
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.a$b */
    static final class C3971b extends C2203a {
        public final C2175k aQ;

        public C3971b(int i, C2175k c2175k) {
            super(i);
            this.aQ = c2175k;
        }
    }

    /* renamed from: a */
    public static int m8129a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static int m8130b(int i) {
        return i & 16777215;
    }

    public C2203a(int i) {
        this.aP = i;
    }

    public String toString() {
        return C2203a.m8131c(this.aP);
    }

    /* renamed from: c */
    public static String m8131c(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) ((i >> 24) & 255));
        stringBuilder.append((char) ((i >> 16) & 255));
        stringBuilder.append((char) ((i >> 8) & 255));
        stringBuilder.append((char) (i & 255));
        return stringBuilder.toString();
    }
}
