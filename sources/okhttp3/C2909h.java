package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: okhttp3.h */
public final class C2909h {
    /* renamed from: A */
    public static final C2909h f12235A = C2909h.m14085a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    /* renamed from: B */
    public static final C2909h f12236B = C2909h.m14085a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    /* renamed from: C */
    public static final C2909h f12237C = C2909h.m14085a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    /* renamed from: D */
    public static final C2909h f12238D = C2909h.m14085a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    /* renamed from: E */
    public static final C2909h f12239E = C2909h.m14085a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    /* renamed from: F */
    public static final C2909h f12240F = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    /* renamed from: G */
    public static final C2909h f12241G = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    /* renamed from: H */
    public static final C2909h f12242H = C2909h.m14085a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    /* renamed from: I */
    public static final C2909h f12243I = C2909h.m14085a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    /* renamed from: J */
    public static final C2909h f12244J = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    /* renamed from: K */
    public static final C2909h f12245K = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    /* renamed from: L */
    public static final C2909h f12246L = C2909h.m14085a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    /* renamed from: M */
    public static final C2909h f12247M = C2909h.m14085a("TLS_RSA_WITH_NULL_SHA256", 59);
    /* renamed from: N */
    public static final C2909h f12248N = C2909h.m14085a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    /* renamed from: O */
    public static final C2909h f12249O = C2909h.m14085a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    /* renamed from: P */
    public static final C2909h f12250P = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    /* renamed from: Q */
    public static final C2909h f12251Q = C2909h.m14085a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    /* renamed from: R */
    public static final C2909h f12252R = C2909h.m14085a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    /* renamed from: S */
    public static final C2909h f12253S = C2909h.m14085a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    /* renamed from: T */
    public static final C2909h f12254T = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    /* renamed from: U */
    public static final C2909h f12255U = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    /* renamed from: V */
    public static final C2909h f12256V = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    /* renamed from: W */
    public static final C2909h f12257W = C2909h.m14085a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    /* renamed from: X */
    public static final C2909h f12258X = C2909h.m14085a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    /* renamed from: Y */
    public static final C2909h f12259Y = C2909h.m14085a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    /* renamed from: Z */
    public static final C2909h f12260Z = C2909h.m14085a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    /* renamed from: a */
    static final Comparator<String> f12261a = new C29081();
    public static final C2909h aA = C2909h.m14085a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final C2909h aB = C2909h.m14085a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final C2909h aC = C2909h.m14085a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final C2909h aD = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final C2909h aE = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final C2909h aF = C2909h.m14085a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final C2909h aG = C2909h.m14085a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final C2909h aH = C2909h.m14085a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final C2909h aI = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final C2909h aJ = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final C2909h aK = C2909h.m14085a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final C2909h aL = C2909h.m14085a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final C2909h aM = C2909h.m14085a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final C2909h aN = C2909h.m14085a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final C2909h aO = C2909h.m14085a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final C2909h aP = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final C2909h aQ = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final C2909h aR = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final C2909h aS = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final C2909h aT = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final C2909h aU = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final C2909h aV = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final C2909h aW = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final C2909h aX = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final C2909h aY = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final C2909h aZ = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
    public static final C2909h aa = C2909h.m14085a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final C2909h ab = C2909h.m14085a("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final C2909h ac = C2909h.m14085a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    public static final C2909h ad = C2909h.m14085a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final C2909h ae = C2909h.m14085a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final C2909h af = C2909h.m14085a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    public static final C2909h ag = C2909h.m14085a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final C2909h ah = C2909h.m14085a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final C2909h ai = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final C2909h aj = C2909h.m14085a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final C2909h ak = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final C2909h al = C2909h.m14085a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final C2909h am = C2909h.m14085a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final C2909h an = C2909h.m14085a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final C2909h ao = C2909h.m14085a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final C2909h ap = C2909h.m14085a("TLS_FALLBACK_SCSV", 22016);
    public static final C2909h aq = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final C2909h ar = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    public static final C2909h as = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    public static final C2909h at = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    public static final C2909h au = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    public static final C2909h av = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    public static final C2909h aw = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    public static final C2909h ax = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final C2909h ay = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final C2909h az = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    /* renamed from: b */
    public static final C2909h f12262b = C2909h.m14085a("SSL_RSA_WITH_NULL_MD5", 1);
    public static final C2909h ba = C2909h.m14085a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
    public static final C2909h bb = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    public static final C2909h bc = C2909h.m14085a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final C2909h bd = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
    public static final C2909h be = C2909h.m14085a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    public static final C2909h bf = C2909h.m14085a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
    public static final C2909h bg = C2909h.m14085a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    public static final C2909h bh = C2909h.m14085a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final C2909h bi = C2909h.m14085a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    private static final Map<String, C2909h> bk = new TreeMap(f12261a);
    /* renamed from: c */
    public static final C2909h f12263c = C2909h.m14085a("SSL_RSA_WITH_NULL_SHA", 2);
    /* renamed from: d */
    public static final C2909h f12264d = C2909h.m14085a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    /* renamed from: e */
    public static final C2909h f12265e = C2909h.m14085a("SSL_RSA_WITH_RC4_128_MD5", 4);
    /* renamed from: f */
    public static final C2909h f12266f = C2909h.m14085a("SSL_RSA_WITH_RC4_128_SHA", 5);
    /* renamed from: g */
    public static final C2909h f12267g = C2909h.m14085a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    /* renamed from: h */
    public static final C2909h f12268h = C2909h.m14085a("SSL_RSA_WITH_DES_CBC_SHA", 9);
    /* renamed from: i */
    public static final C2909h f12269i = C2909h.m14085a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    /* renamed from: j */
    public static final C2909h f12270j = C2909h.m14085a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    /* renamed from: k */
    public static final C2909h f12271k = C2909h.m14085a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    /* renamed from: l */
    public static final C2909h f12272l = C2909h.m14085a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    /* renamed from: m */
    public static final C2909h f12273m = C2909h.m14085a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    /* renamed from: n */
    public static final C2909h f12274n = C2909h.m14085a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    /* renamed from: o */
    public static final C2909h f12275o = C2909h.m14085a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    /* renamed from: p */
    public static final C2909h f12276p = C2909h.m14085a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    /* renamed from: q */
    public static final C2909h f12277q = C2909h.m14085a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    /* renamed from: r */
    public static final C2909h f12278r = C2909h.m14085a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    /* renamed from: s */
    public static final C2909h f12279s = C2909h.m14085a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    /* renamed from: t */
    public static final C2909h f12280t = C2909h.m14085a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    /* renamed from: u */
    public static final C2909h f12281u = C2909h.m14085a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    /* renamed from: v */
    public static final C2909h f12282v = C2909h.m14085a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    /* renamed from: w */
    public static final C2909h f12283w = C2909h.m14085a("TLS_KRB5_WITH_RC4_128_SHA", 32);
    /* renamed from: x */
    public static final C2909h f12284x = C2909h.m14085a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    /* renamed from: y */
    public static final C2909h f12285y = C2909h.m14085a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    /* renamed from: z */
    public static final C2909h f12286z = C2909h.m14085a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    final String bj;

    /* renamed from: okhttp3.h$1 */
    class C29081 implements Comparator<String> {
        C29081() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m14082a((String) obj, (String) obj2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public int m14082a(java.lang.String r7, java.lang.String r8) {
            /*
            r6 = this;
            r0 = r7.length();
            r1 = r8.length();
            r0 = java.lang.Math.min(r0, r1);
            r1 = 4;
        L_0x000d:
            r2 = -1;
            r3 = 1;
            if (r1 >= r0) goto L_0x0023;
        L_0x0011:
            r4 = r7.charAt(r1);
            r5 = r8.charAt(r1);
            if (r4 == r5) goto L_0x0020;
        L_0x001b:
            if (r4 >= r5) goto L_0x001e;
        L_0x001d:
            goto L_0x001f;
        L_0x001e:
            r2 = 1;
        L_0x001f:
            return r2;
        L_0x0020:
            r1 = r1 + 1;
            goto L_0x000d;
        L_0x0023:
            r7 = r7.length();
            r8 = r8.length();
            if (r7 == r8) goto L_0x0032;
        L_0x002d:
            if (r7 >= r8) goto L_0x0030;
        L_0x002f:
            goto L_0x0031;
        L_0x0030:
            r2 = 1;
        L_0x0031:
            return r2;
        L_0x0032:
            r7 = 0;
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.h.1.a(java.lang.String, java.lang.String):int");
        }
    }

    /* renamed from: a */
    public static synchronized C2909h m14084a(String str) {
        C2909h c2909h;
        synchronized (C2909h.class) {
            c2909h = (C2909h) bk.get(str);
            if (c2909h == null) {
                c2909h = new C2909h(str);
                bk.put(str, c2909h);
            }
        }
        return c2909h;
    }

    /* renamed from: a */
    static List<C2909h> m14083a(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C2909h.m14084a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private C2909h(String str) {
        if (str != null) {
            this.bj = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private static C2909h m14085a(String str, int i) {
        return C2909h.m14084a(str);
    }

    /* renamed from: a */
    public String m14086a() {
        return this.bj;
    }

    public String toString() {
        return this.bj;
    }
}
