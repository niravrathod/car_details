package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.h */
public final class C2170h {
    /* renamed from: a */
    public static boolean m7942a(String str) {
        return "audio".equals(C2170h.m7946e(str));
    }

    /* renamed from: b */
    public static boolean m7943b(String str) {
        return "video".equals(C2170h.m7946e(str));
    }

    /* renamed from: c */
    public static boolean m7944c(String str) {
        return "text".equals(C2170h.m7946e(str));
    }

    /* renamed from: d */
    public static String m7945d(String str) {
        if (str == null) {
            return null;
        }
        str = str.trim();
        if (!str.startsWith("avc1")) {
            if (!str.startsWith("avc3")) {
                if (!str.startsWith("hev1")) {
                    if (!str.startsWith("hvc1")) {
                        if (str.startsWith("vp9")) {
                            return "video/x-vnd.on2.vp9";
                        }
                        if (str.startsWith("vp8")) {
                            return "video/x-vnd.on2.vp8";
                        }
                        if (str.startsWith("mp4a")) {
                            return "audio/mp4a-latm";
                        }
                        if (!str.startsWith("ac-3")) {
                            if (!str.startsWith("dac3")) {
                                if (!str.startsWith("ec-3")) {
                                    if (!str.startsWith("dec3")) {
                                        if (!str.startsWith("dtsc")) {
                                            if (!str.startsWith("dtse")) {
                                                if (!str.startsWith("dtsh")) {
                                                    if (!str.startsWith("dtsl")) {
                                                        if (str.startsWith("opus")) {
                                                            return "audio/opus";
                                                        }
                                                        if (str.startsWith("vorbis") != null) {
                                                            return "audio/vorbis";
                                                        }
                                                        return null;
                                                    }
                                                }
                                                return "audio/vnd.dts.hd";
                                            }
                                        }
                                        return "audio/vnd.dts";
                                    }
                                }
                                return "audio/eac3";
                            }
                        }
                        return "audio/ac3";
                    }
                }
                return "video/hevc";
            }
        }
        return "video/avc";
    }

    /* renamed from: e */
    private static String m7946e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid mime type: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
