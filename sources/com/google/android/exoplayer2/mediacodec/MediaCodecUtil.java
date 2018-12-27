package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil {
    /* renamed from: a */
    private static final C2281a f7230a = C2281a.m8381a("OMX.google.raw.decoder");
    /* renamed from: b */
    private static final Pattern f7231b = Pattern.compile("^\\D?(\\d+)$");
    /* renamed from: c */
    private static final HashMap<C2279a, List<C2281a>> f7232c = new HashMap();
    /* renamed from: d */
    private static final SparseIntArray f7233d = new SparseIntArray();
    /* renamed from: e */
    private static final SparseIntArray f7234e = new SparseIntArray();
    /* renamed from: f */
    private static final Map<String, Integer> f7235f = new HashMap();
    /* renamed from: g */
    private static int f7236g = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a */
    private static final class C2279a {
        /* renamed from: a */
        public final String f7228a;
        /* renamed from: b */
        public final boolean f7229b;

        public C2279a(String str, boolean z) {
            this.f7228a = str;
            this.f7229b = z;
        }

        public int hashCode() {
            return (((this.f7228a == null ? 0 : this.f7228a.hashCode()) + 31) * 31) + (this.f7229b ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (obj.getClass() == C2279a.class) {
                    C2279a c2279a = (C2279a) obj;
                    if (!TextUtils.equals(this.f7228a, c2279a.f7228a) || this.f7229b != c2279a.f7229b) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    private interface C2280b {
        /* renamed from: a */
        int mo1636a();

        /* renamed from: a */
        MediaCodecInfo mo1637a(int i);

        /* renamed from: a */
        boolean mo1638a(String str, CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo1639b();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    private static final class C4024c implements C2280b {
        /* renamed from: b */
        public boolean mo1639b() {
            return false;
        }

        private C4024c() {
        }

        /* renamed from: a */
        public int mo1636a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public MediaCodecInfo mo1637a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo1638a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    private static final class C4025d implements C2280b {
        /* renamed from: a */
        private final int f16198a;
        /* renamed from: b */
        private MediaCodecInfo[] f16199b;

        /* renamed from: b */
        public boolean mo1639b() {
            return true;
        }

        public C4025d(boolean z) {
            this.f16198a = z;
        }

        /* renamed from: a */
        public int mo1636a() {
            m20169c();
            return this.f16199b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo1637a(int i) {
            m20169c();
            return this.f16199b[i];
        }

        /* renamed from: a */
        public boolean mo1638a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: c */
        private void m20169c() {
            if (this.f16199b == null) {
                this.f16199b = new MediaCodecList(this.f16198a).getCodecInfos();
            }
        }
    }

    /* renamed from: a */
    private static int m8370a(int i) {
        switch (i) {
            case 1:
                return 25344;
            case 2:
                return 25344;
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    static {
        f7233d.put(66, 1);
        f7233d.put(77, 2);
        f7233d.put(88, 4);
        f7233d.put(100, 8);
        f7234e.put(10, 1);
        f7234e.put(11, 4);
        f7234e.put(12, 8);
        f7234e.put(13, 16);
        f7234e.put(20, 32);
        f7234e.put(21, 64);
        f7234e.put(22, 128);
        f7234e.put(30, 256);
        f7234e.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        f7234e.put(32, 1024);
        f7234e.put(40, 2048);
        f7234e.put(41, 4096);
        f7234e.put(42, 8192);
        f7234e.put(50, 16384);
        f7234e.put(51, 32768);
        f7234e.put(52, 65536);
        f7235f.put("L30", Integer.valueOf(1));
        f7235f.put("L60", Integer.valueOf(4));
        f7235f.put("L63", Integer.valueOf(16));
        f7235f.put("L90", Integer.valueOf(64));
        f7235f.put("L93", Integer.valueOf(256));
        f7235f.put("L120", Integer.valueOf(1024));
        f7235f.put("L123", Integer.valueOf(4096));
        f7235f.put("L150", Integer.valueOf(16384));
        f7235f.put("L153", Integer.valueOf(65536));
        f7235f.put("L156", Integer.valueOf(262144));
        f7235f.put("L180", Integer.valueOf(1048576));
        f7235f.put("L183", Integer.valueOf(4194304));
        f7235f.put("L186", Integer.valueOf(16777216));
        f7235f.put("H30", Integer.valueOf(2));
        f7235f.put("H60", Integer.valueOf(8));
        f7235f.put("H63", Integer.valueOf(32));
        f7235f.put("H90", Integer.valueOf(128));
        f7235f.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        f7235f.put("H120", Integer.valueOf(2048));
        f7235f.put("H123", Integer.valueOf(8192));
        f7235f.put("H150", Integer.valueOf(32768));
        f7235f.put("H153", Integer.valueOf(131072));
        f7235f.put("H156", Integer.valueOf(524288));
        f7235f.put("H180", Integer.valueOf(2097152));
        f7235f.put("H183", Integer.valueOf(8388608));
        f7235f.put("H186", Integer.valueOf(33554432));
    }

    /* renamed from: a */
    public static C2281a m8373a() {
        return f7230a;
    }

    /* renamed from: a */
    public static C2281a m8374a(String str, boolean z) {
        str = m8379b(str, z);
        return str.isEmpty() ? null : (C2281a) str.get(false);
    }

    /* renamed from: b */
    public static synchronized List<C2281a> m8379b(String str, boolean z) {
        synchronized (MediaCodecUtil.class) {
            C2279a c2279a = new C2279a(str, z);
            List<C2281a> list = (List) f7232c.get(c2279a);
            if (list != null) {
                return list;
            }
            List a = m8375a(c2279a, C2186s.f6761a >= 21 ? new C4025d(z) : new C4024c());
            if (z && a.isEmpty() && true <= C2186s.f6761a && C2186s.f6761a <= true) {
                a = m8375a(c2279a, new C4024c());
                if (!a.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("MediaCodecList API didn't list secure decoder for: ");
                    stringBuilder.append(str);
                    stringBuilder.append(". Assuming: ");
                    stringBuilder.append(((C2281a) a.get(null)).f7237a);
                    Log.w("MediaCodecUtil", stringBuilder.toString());
                }
            }
            str = Collections.unmodifiableList(a);
            f7232c.put(c2279a, str);
            return str;
        }
    }

    /* renamed from: b */
    public static int m8377b() {
        if (f7236g == -1) {
            int i = 0;
            C2281a a = m8374a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.m8393a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m8370a(a2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C2186s.f6761a >= 21 ? 345600 : 172800);
            }
            f7236g = i;
        }
        return f7236g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m8371a(java.lang.String r6) {
        /*
        r0 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = "\\.";
        r1 = r6.split(r1);
        r2 = 0;
        r3 = r1[r2];
        r4 = -1;
        r5 = r3.hashCode();
        switch(r5) {
            case 3006243: goto L_0x0033;
            case 3006244: goto L_0x0029;
            case 3199032: goto L_0x0020;
            case 3214780: goto L_0x0016;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x003d;
    L_0x0016:
        r2 = "hvc1";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x001e:
        r2 = 1;
        goto L_0x003e;
    L_0x0020:
        r5 = "hev1";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x003d;
    L_0x0028:
        goto L_0x003e;
    L_0x0029:
        r2 = "avc2";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x0031:
        r2 = 3;
        goto L_0x003e;
    L_0x0033:
        r2 = "avc1";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x003b:
        r2 = 2;
        goto L_0x003e;
    L_0x003d:
        r2 = -1;
    L_0x003e:
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0047;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x0041;
        };
    L_0x0041:
        return r0;
    L_0x0042:
        r6 = m8378b(r6, r1);
        return r6;
    L_0x0047:
        r6 = m8372a(r6, r1);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.a(java.lang.String):android.util.Pair<java.lang.Integer, java.lang.Integer>");
    }

    /* renamed from: a */
    private static List<C2281a> m8375a(C2279a c2279a, C2280b c2280b) {
        String str;
        StringBuilder stringBuilder;
        C2279a c2279a2 = c2279a;
        C2280b c2280b2 = c2280b;
        String name;
        try {
            List<C2281a> arrayList = new ArrayList();
            String str2 = c2279a2.f7228a;
            int a = c2280b.mo1636a();
            boolean b = c2280b.mo1639b();
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = c2280b2.mo1637a(i);
                name = a2.getName();
                if (m8376a(a2, name, b)) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        str = supportedTypes[i2];
                        if (str.equalsIgnoreCase(str2)) {
                            CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str);
                            boolean a3 = c2280b2.mo1638a(str2, capabilitiesForType);
                            boolean b2 = m8380b(name);
                            if ((b && c2279a2.f7229b == a3) || (!b && !c2279a2.f7229b)) {
                                arrayList.add(C2281a.m8382a(name, str2, capabilitiesForType, b2));
                            } else if (!b && a3) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(name);
                                stringBuilder.append(".secure");
                                arrayList.add(C2281a.m8382a(stringBuilder.toString(), str2, capabilitiesForType, b2));
                                return arrayList;
                            }
                        }
                        i2++;
                        c2280b2 = c2280b;
                    }
                    continue;
                }
                i++;
                c2280b2 = c2280b;
            }
            return arrayList;
        } catch (Exception e) {
            if (C2186s.f6761a > 23 || arrayList.isEmpty()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to query codec ");
                stringBuilder.append(name);
                stringBuilder.append(" (");
                stringBuilder.append(str);
                stringBuilder.append(")");
                Log.e("MediaCodecUtil", stringBuilder.toString());
                throw e;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Skipping codec ");
            stringBuilder.append(name);
            stringBuilder.append(" (failed to query capabilities)");
            Log.e("MediaCodecUtil", stringBuilder.toString());
        } catch (Throwable e2) {
            throw new DecoderQueryException(e2);
        }
    }

    /* renamed from: a */
    private static boolean m8376a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() == null) {
            if (z || str.endsWith(".secure") == null) {
                if (C2186s.f6761a < true && ("CIPAACDecoder".equals(str) != null || "CIPMP3Decoder".equals(str) != null || "CIPVorbisDecoder".equals(str) != null || "CIPAMRNBDecoder".equals(str) != null || "AACDecoder".equals(str) != null || "MP3Decoder".equals(str) != null)) {
                    return false;
                }
                if (C2186s.f6761a < 18 && "OMX.SEC.MP3.Decoder".equals(str) != null) {
                    return false;
                }
                if (C2186s.f6761a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) != null && "a70".equals(C2186s.f6762b) != null) {
                    return false;
                }
                if (C2186s.f6761a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) != null && ("dlxu".equals(C2186s.f6762b) != null || "protou".equals(C2186s.f6762b) != null || "ville".equals(C2186s.f6762b) != null || "villeplus".equals(C2186s.f6762b) != null || "villec2".equals(C2186s.f6762b) != null || C2186s.f6762b.startsWith("gee") != null || "C6602".equals(C2186s.f6762b) != null || "C6603".equals(C2186s.f6762b) != null || "C6606".equals(C2186s.f6762b) != null || "C6616".equals(C2186s.f6762b) != null || "L36h".equals(C2186s.f6762b) != null || "SO-02E".equals(C2186s.f6762b) != null)) {
                    return false;
                }
                if (C2186s.f6761a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) != null && ("C1504".equals(C2186s.f6762b) != null || "C1505".equals(C2186s.f6762b) != null || "C1604".equals(C2186s.f6762b) != null || "C1605".equals(C2186s.f6762b) != null)) {
                    return false;
                }
                if (C2186s.f6761a <= 19 && "OMX.SEC.vp8.dec".equals(str) != null && "samsung".equals(C2186s.f6763c) != null && (C2186s.f6762b.startsWith("d2") != null || C2186s.f6762b.startsWith("serrano") != null || C2186s.f6762b.startsWith("jflte") != null || C2186s.f6762b.startsWith("santos") != null || C2186s.f6762b.startsWith("t0") != null)) {
                    return false;
                }
                if (C2186s.f6761a > 19 || C2186s.f6762b.startsWith("jflte") == null || "OMX.qcom.video.decoder.vp8".equals(str) == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8380b(String str) {
        return (C2186s.f6761a > 22 || (!(C2186s.f6764d.equals("ODROID-XU3") || C2186s.f6764d.equals("Nexus 10")) || (!"OMX.Exynos.AVC.Decoder".equals(str) && "OMX.Exynos.AVC.Decoder.secure".equals(str) == null))) ? null : true;
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m8372a(String str, String[] strArr) {
        if (strArr.length < 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed HEVC codec string: ");
            stringBuilder.append(str);
            Log.w("MediaCodecUtil", stringBuilder.toString());
            return null;
        }
        Matcher matcher = f7231b.matcher(strArr[1]);
        if (matcher.matches()) {
            str = matcher.group(1);
            if ("1".equals(str)) {
                str = true;
            } else if ("2".equals(str)) {
                str = 2;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown HEVC profile string: ");
                stringBuilder.append(str);
                Log.w("MediaCodecUtil", stringBuilder.toString());
                return null;
            }
            Integer num = (Integer) f7235f.get(strArr[3]);
            if (num != null) {
                return new Pair(Integer.valueOf(str), num);
            }
            strArr = new StringBuilder();
            strArr.append("Unknown HEVC level string: ");
            strArr.append(matcher.group(1));
            Log.w("MediaCodecUtil", strArr.toString());
            return null;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring malformed HEVC codec string: ");
        stringBuilder.append(str);
        Log.w("MediaCodecUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: b */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m8378b(java.lang.String r5, java.lang.String[] r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = r6.length;
        r1 = 2;
        r2 = 0;
        if (r0 >= r1) goto L_0x001c;
    L_0x0005:
        r6 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Ignoring malformed AVC codec string: ";
        r0.append(r1);
        r0.append(r5);
        r5 = r0.toString();
        android.util.Log.w(r6, r5);
        return r2;
    L_0x001c:
        r0 = 1;
        r3 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cb }
        r3 = r3.length();	 Catch:{ NumberFormatException -> 0x00cb }
        r4 = 6;	 Catch:{ NumberFormatException -> 0x00cb }
        if (r3 != r4) goto L_0x0048;	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x0026:
        r3 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cb }
        r4 = 0;	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = r3.substring(r4, r1);	 Catch:{ NumberFormatException -> 0x00cb }
        r3 = 16;	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = java.lang.Integer.parseInt(r1, r3);	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = 4;	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = r6.substring(r0);	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = java.lang.Integer.parseInt(r6, r3);	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = r1;	 Catch:{ NumberFormatException -> 0x00cb }
        goto L_0x0060;	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x0048:
        r3 = r6.length;	 Catch:{ NumberFormatException -> 0x00cb }
        r4 = 3;	 Catch:{ NumberFormatException -> 0x00cb }
        if (r3 < r4) goto L_0x00b4;	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x004c:
        r0 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = r6[r1];	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x0060:
        r5 = f7233d;
        r1 = r0.intValue();
        r5 = r5.get(r1);
        r5 = java.lang.Integer.valueOf(r5);
        if (r5 != 0) goto L_0x0087;
    L_0x0070:
        r5 = "MediaCodecUtil";
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r1 = "Unknown AVC profile: ";
        r6.append(r1);
        r6.append(r0);
        r6 = r6.toString();
        android.util.Log.w(r5, r6);
        return r2;
    L_0x0087:
        r0 = f7234e;
        r1 = r6.intValue();
        r0 = r0.get(r1);
        r0 = java.lang.Integer.valueOf(r0);
        if (r0 != 0) goto L_0x00ae;
    L_0x0097:
        r5 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unknown AVC level: ";
        r0.append(r1);
        r0.append(r6);
        r6 = r0.toString();
        android.util.Log.w(r5, r6);
        return r2;
    L_0x00ae:
        r6 = new android.util.Pair;
        r6.<init>(r5, r0);
        return r6;
    L_0x00b4:
        r6 = "MediaCodecUtil";	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00cb }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = "Ignoring malformed AVC codec string: ";	 Catch:{ NumberFormatException -> 0x00cb }
        r0.append(r1);	 Catch:{ NumberFormatException -> 0x00cb }
        r0.append(r5);	 Catch:{ NumberFormatException -> 0x00cb }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00cb }
        android.util.Log.w(r6, r0);	 Catch:{ NumberFormatException -> 0x00cb }
        return r2;
    L_0x00cb:
        r6 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Ignoring malformed AVC codec string: ";
        r0.append(r1);
        r0.append(r5);
        r5 = r0.toString();
        android.util.Log.w(r6, r5);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b(java.lang.String, java.lang.String[]):android.util.Pair<java.lang.Integer, java.lang.Integer>");
    }
}
