package com.google.android.exoplayer2.extractor.p128c;

import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.c.f */
final class C2215f {
    /* renamed from: A */
    private static final int f6925A = C2186s.m8062e("sosn");
    /* renamed from: B */
    private static final int f6926B = C2186s.m8062e("tvsh");
    /* renamed from: C */
    private static final int f6927C = C2186s.m8062e("----");
    /* renamed from: D */
    private static final String[] f6928D = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    /* renamed from: a */
    private static final int f6929a = C2186s.m8062e("nam");
    /* renamed from: b */
    private static final int f6930b = C2186s.m8062e("trk");
    /* renamed from: c */
    private static final int f6931c = C2186s.m8062e("cmt");
    /* renamed from: d */
    private static final int f6932d = C2186s.m8062e("day");
    /* renamed from: e */
    private static final int f6933e = C2186s.m8062e("ART");
    /* renamed from: f */
    private static final int f6934f = C2186s.m8062e("too");
    /* renamed from: g */
    private static final int f6935g = C2186s.m8062e("alb");
    /* renamed from: h */
    private static final int f6936h = C2186s.m8062e("com");
    /* renamed from: i */
    private static final int f6937i = C2186s.m8062e("wrt");
    /* renamed from: j */
    private static final int f6938j = C2186s.m8062e("lyr");
    /* renamed from: k */
    private static final int f6939k = C2186s.m8062e("gen");
    /* renamed from: l */
    private static final int f6940l = C2186s.m8062e("covr");
    /* renamed from: m */
    private static final int f6941m = C2186s.m8062e("gnre");
    /* renamed from: n */
    private static final int f6942n = C2186s.m8062e("grp");
    /* renamed from: o */
    private static final int f6943o = C2186s.m8062e("disk");
    /* renamed from: p */
    private static final int f6944p = C2186s.m8062e("trkn");
    /* renamed from: q */
    private static final int f6945q = C2186s.m8062e("tmpo");
    /* renamed from: r */
    private static final int f6946r = C2186s.m8062e("cpil");
    /* renamed from: s */
    private static final int f6947s = C2186s.m8062e("aART");
    /* renamed from: t */
    private static final int f6948t = C2186s.m8062e("sonm");
    /* renamed from: u */
    private static final int f6949u = C2186s.m8062e("soal");
    /* renamed from: v */
    private static final int f6950v = C2186s.m8062e("soar");
    /* renamed from: w */
    private static final int f6951w = C2186s.m8062e("soaa");
    /* renamed from: x */
    private static final int f6952x = C2186s.m8062e("soco");
    /* renamed from: y */
    private static final int f6953y = C2186s.m8062e("rtng");
    /* renamed from: z */
    private static final int f6954z = C2186s.m8062e("pgap");

    /* renamed from: a */
    public static Entry m8165a(C2175k c2175k) {
        Entry b;
        int d = c2175k.m7980d() + c2175k.m7993n();
        int n = c2175k.m7993n();
        int i = (n >> 24) & 255;
        if (i != 169) {
            if (i != 65533) {
                try {
                    if (n == f6941m) {
                        b = C2215f.m8171b(c2175k);
                        return b;
                    } else if (n == f6943o) {
                        b = C2215f.m8170b(n, "TPOS", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6944p) {
                        b = C2215f.m8170b(n, "TRCK", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6945q) {
                        b = C2215f.m8167a(n, "TBPM", c2175k, true, false);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6946r) {
                        b = C2215f.m8167a(n, "TCMP", c2175k, true, true);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6940l) {
                        b = C2215f.m8172c(c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6947s) {
                        b = C2215f.m8169a(n, "TPE2", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6948t) {
                        b = C2215f.m8169a(n, "TSOT", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6949u) {
                        b = C2215f.m8169a(n, "TSO2", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6950v) {
                        b = C2215f.m8169a(n, "TSOA", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6951w) {
                        b = C2215f.m8169a(n, "TSOP", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6952x) {
                        b = C2215f.m8169a(n, "TSOC", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6953y) {
                        b = C2215f.m8167a(n, "ITUNESADVISORY", c2175k, false, false);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6954z) {
                        b = C2215f.m8167a(n, "ITUNESGAPLESS", c2175k, false, true);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6925A) {
                        b = C2215f.m8169a(n, "TVSHOWSORT", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else if (n == f6926B) {
                        b = C2215f.m8169a(n, "TVSHOW", c2175k);
                        c2175k.m7979c(d);
                        return b;
                    } else {
                        if (n == f6927C) {
                            b = C2215f.m8168a(c2175k, d);
                            c2175k.m7979c(d);
                            return b;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Skipped unknown metadata entry: ");
                        stringBuilder.append(C2203a.m8131c(n));
                        Log.d("MetadataUtil", stringBuilder.toString());
                        c2175k.m7979c(d);
                        return null;
                    }
                } finally {
                    c2175k.m7979c(d);
                }
            }
        }
        i = 16777215 & n;
        if (i == f6931c) {
            b = C2215f.m8166a(n, c2175k);
            c2175k.m7979c(d);
            return b;
        }
        if (i != f6929a) {
            if (i != f6930b) {
                if (i != f6936h) {
                    if (i != f6937i) {
                        if (i == f6932d) {
                            b = C2215f.m8169a(n, "TDRC", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else if (i == f6933e) {
                            b = C2215f.m8169a(n, "TPE1", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else if (i == f6934f) {
                            b = C2215f.m8169a(n, "TSSE", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else if (i == f6935g) {
                            b = C2215f.m8169a(n, "TALB", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else if (i == f6938j) {
                            b = C2215f.m8169a(n, "USLT", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else if (i == f6939k) {
                            b = C2215f.m8169a(n, "TCON", c2175k);
                            c2175k.m7979c(d);
                            return b;
                        } else {
                            if (i == f6942n) {
                                b = C2215f.m8169a(n, "TIT1", c2175k);
                                c2175k.m7979c(d);
                                return b;
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Skipped unknown metadata entry: ");
                            stringBuilder2.append(C2203a.m8131c(n));
                            Log.d("MetadataUtil", stringBuilder2.toString());
                            c2175k.m7979c(d);
                            return null;
                        }
                    }
                }
                b = C2215f.m8169a(n, "TCOM", c2175k);
                c2175k.m7979c(d);
                return b;
            }
        }
        b = C2215f.m8169a(n, "TIT2", c2175k);
        c2175k.m7979c(d);
        return b;
    }

    /* renamed from: a */
    private static TextInformationFrame m8169a(int i, String str, C2175k c2175k) {
        int n = c2175k.m7993n();
        if (c2175k.m7993n() == C2203a.aF) {
            c2175k.m7981d(8);
            return new TextInformationFrame(str, null, c2175k.m7985f(n - 16));
        }
        c2175k = new StringBuilder();
        c2175k.append("Failed to parse text attribute: ");
        c2175k.append(C2203a.m8131c(i));
        Log.w("MetadataUtil", c2175k.toString());
        return null;
    }

    /* renamed from: a */
    private static CommentFrame m8166a(int i, C2175k c2175k) {
        int n = c2175k.m7993n();
        if (c2175k.m7993n() == C2203a.aF) {
            c2175k.m7981d(8);
            i = c2175k.m7985f(n - 16);
            return new CommentFrame("und", i, i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse comment attribute: ");
        stringBuilder.append(C2203a.m8131c(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return 0;
    }

    /* renamed from: a */
    private static Id3Frame m8167a(int i, String str, C2175k c2175k, boolean z, boolean z2) {
        c2175k = C2215f.m8173d(c2175k);
        if (z2) {
            c2175k = Math.min(true, c2175k);
        }
        if (c2175k >= null) {
            if (z) {
                i = new TextInformationFrame(str, null, Integer.toString(c2175k));
            } else {
                i = new CommentFrame("und", str, Integer.toString(c2175k));
            }
            return i;
        }
        c2175k = new StringBuilder();
        c2175k.append("Failed to parse uint8 attribute: ");
        c2175k.append(C2203a.m8131c(i));
        Log.w("MetadataUtil", c2175k.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m8170b(int i, String str, C2175k c2175k) {
        int n = c2175k.m7993n();
        if (c2175k.m7993n() == C2203a.aF && n >= 22) {
            c2175k.m7981d(10);
            n = c2175k.m7987h();
            if (n > 0) {
                i = new StringBuilder();
                i.append("");
                i.append(n);
                i = i.toString();
                c2175k = c2175k.m7987h();
                if (c2175k > null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append("/");
                    stringBuilder.append(c2175k);
                    i = stringBuilder.toString();
                }
                return new TextInformationFrame(str, null, i);
            }
        }
        c2175k = new StringBuilder();
        c2175k.append("Failed to parse index/count attribute: ");
        c2175k.append(C2203a.m8131c(i));
        Log.w("MetadataUtil", c2175k.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m8171b(C2175k c2175k) {
        c2175k = C2215f.m8173d(c2175k);
        c2175k = (c2175k <= null || c2175k > f6928D.length) ? null : f6928D[c2175k - 1];
        if (c2175k != null) {
            return new TextInformationFrame("TCON", null, c2175k);
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: c */
    private static ApicFrame m8172c(C2175k c2175k) {
        int n = c2175k.m7993n();
        if (c2175k.m7993n() == C2203a.aF) {
            int b = C2203a.m8130b(c2175k.m7993n());
            String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized cover art flags: ");
                stringBuilder.append(b);
                Log.w("MetadataUtil", stringBuilder.toString());
                return null;
            }
            c2175k.m7981d(4);
            byte[] bArr = new byte[(n - 16)];
            c2175k.m7975a(bArr, 0, bArr.length);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: a */
    private static Id3Frame m8168a(C2175k c2175k, int i) {
        Object obj = null;
        String str = obj;
        int i2 = -1;
        int i3 = -1;
        while (c2175k.m7980d() < i) {
            int d = c2175k.m7980d();
            int n = c2175k.m7993n();
            int n2 = c2175k.m7993n();
            c2175k.m7981d(4);
            if (n2 == C2203a.aD) {
                obj = c2175k.m7985f(n - 12);
            } else if (n2 == C2203a.aE) {
                str = c2175k.m7985f(n - 12);
            } else {
                if (n2 == C2203a.aF) {
                    i2 = d;
                    i3 = n;
                }
                c2175k.m7981d(n - 12);
            }
        }
        if (!("com.apple.iTunes".equals(obj) == 0 || "iTunSMPB".equals(str) == 0)) {
            if (i2 != -1) {
                c2175k.m7979c(i2);
                c2175k.m7981d(16);
                return new CommentFrame("und", str, c2175k.m7985f(i3 - 16));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m8173d(C2175k c2175k) {
        c2175k.m7981d(4);
        if (c2175k.m7993n() == C2203a.aF) {
            c2175k.m7981d(8);
            return c2175k.m7986g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
