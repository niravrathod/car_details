package com.google.android.exoplayer2.text.p135f;

import android.text.TextUtils;
import com.google.android.exoplayer2.p126c.C2165c;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.f.a */
final class C2349a {
    /* renamed from: a */
    private static final Pattern f7454a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    /* renamed from: b */
    private final C2175k f7455b = new C2175k();
    /* renamed from: c */
    private final StringBuilder f7456c = new StringBuilder();

    /* renamed from: a */
    public C2350d m8605a(C2175k c2175k) {
        this.f7456c.setLength(0);
        int d = c2175k.m7980d();
        C2349a.m8600c(c2175k);
        this.f7455b.m7974a(c2175k.f6735a, c2175k.m7980d());
        this.f7455b.m7979c(d);
        String b = C2349a.m8597b(this.f7455b, this.f7456c);
        C2350d c2350d = null;
        if (b != null) {
            if ("{".equals(C2349a.m8594a(this.f7455b, this.f7456c))) {
                C2350d c2350d2 = new C2350d();
                m8596a(c2350d2, b);
                Object obj = null;
                c2175k = null;
                while (c2175k == null) {
                    C2175k c2175k2;
                    c2175k = this.f7455b.m7980d();
                    obj = C2349a.m8594a(this.f7455b, this.f7456c);
                    if (obj != null) {
                        if (!"}".equals(obj)) {
                            c2175k2 = null;
                            if (c2175k2 == null) {
                                this.f7455b.m7979c(c2175k);
                                C2349a.m8595a(this.f7455b, c2350d2, this.f7456c);
                            }
                            c2175k = c2175k2;
                        }
                    }
                    c2175k2 = true;
                    if (c2175k2 == null) {
                        this.f7455b.m7979c(c2175k);
                        C2349a.m8595a(this.f7455b, c2350d2, this.f7456c);
                    }
                    c2175k = c2175k2;
                }
                if ("}".equals(obj) != null) {
                    c2350d = c2350d2;
                }
                return c2350d;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m8597b(C2175k c2175k, StringBuilder stringBuilder) {
        C2349a.m8598b(c2175k);
        if (c2175k.m7976b() < 5) {
            return null;
        }
        if (!"::cue".equals(c2175k.m7983e(5))) {
            return null;
        }
        int d = c2175k.m7980d();
        String a = C2349a.m8594a(c2175k, stringBuilder);
        if (a == null) {
            return null;
        }
        if ("{".equals(a)) {
            c2175k.m7979c(d);
            return "";
        }
        String d2 = "(".equals(a) ? C2349a.m8601d(c2175k) : null;
        c2175k = C2349a.m8594a(c2175k, stringBuilder);
        if (")".equals(c2175k) != null) {
            if (c2175k != null) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static String m8601d(C2175k c2175k) {
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        Object obj = null;
        while (d < c && r3 == null) {
            int i = d + 1;
            obj = ((char) c2175k.f6735a[d]) == ')' ? 1 : null;
            d = i;
        }
        return c2175k.m7983e((d - 1) - c2175k.m7980d()).trim();
    }

    /* renamed from: a */
    private static void m8595a(C2175k c2175k, C2350d c2350d, StringBuilder stringBuilder) {
        C2349a.m8598b(c2175k);
        String d = C2349a.m8602d(c2175k, stringBuilder);
        if (!"".equals(d) && ":".equals(C2349a.m8594a(c2175k, stringBuilder))) {
            C2349a.m8598b(c2175k);
            String c = C2349a.m8599c(c2175k, stringBuilder);
            if (c != null) {
                if (!"".equals(c)) {
                    int d2 = c2175k.m7980d();
                    stringBuilder = C2349a.m8594a(c2175k, stringBuilder);
                    if (!";".equals(stringBuilder)) {
                        if ("}".equals(stringBuilder) != null) {
                            c2175k.m7979c(d2);
                        } else {
                            return;
                        }
                    }
                    if ("color".equals(d) != null) {
                        c2350d.m8608a(C2165c.m7929b(c));
                    } else if ("background-color".equals(d) != null) {
                        c2350d.m8614b(C2165c.m7929b(c));
                    } else if ("text-decoration".equals(d) != null) {
                        if ("underline".equals(c) != null) {
                            c2350d.m8609a(true);
                        }
                    } else if ("font-family".equals(d) != null) {
                        c2350d.m8620d(c);
                    } else if ("font-weight".equals(d) != null) {
                        if ("bold".equals(c) != null) {
                            c2350d.m8615b(true);
                        }
                    } else if (!("font-style".equals(d) == null || "italic".equals(c) == null)) {
                        c2350d.m8617c(true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static void m8598b(C2175k c2175k) {
        while (true) {
            Object obj = 1;
            while (c2175k.m7976b() > 0 && r1 != null) {
                if (!C2349a.m8603e(c2175k)) {
                    if (!C2349a.m8604f(c2175k)) {
                        obj = null;
                    }
                }
            }
            return;
        }
    }

    /* renamed from: a */
    static String m8594a(C2175k c2175k, StringBuilder stringBuilder) {
        C2349a.m8598b(c2175k);
        if (c2175k.m7976b() == 0) {
            return null;
        }
        stringBuilder = C2349a.m8602d(c2175k, stringBuilder);
        if (!"".equals(stringBuilder)) {
            return stringBuilder;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char) c2175k.m7986g());
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private static boolean m8603e(C2175k c2175k) {
        switch (C2349a.m8593a(c2175k, c2175k.m7980d())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c2175k.m7981d(1);
                return true;
            default:
                return null;
        }
    }

    /* renamed from: c */
    static void m8600c(C2175k c2175k) {
        do {
        } while (!TextUtils.isEmpty(c2175k.m8004y()));
    }

    /* renamed from: a */
    private static char m8593a(C2175k c2175k, int i) {
        return (char) c2175k.f6735a[i];
    }

    /* renamed from: c */
    private static String m8599c(C2175k c2175k, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        Object obj = null;
        while (obj == null) {
            int d = c2175k.m7980d();
            String a = C2349a.m8594a(c2175k, stringBuilder);
            if (a == null) {
                return null;
            }
            if (!"}".equals(a)) {
                if (!";".equals(a)) {
                    stringBuilder2.append(a);
                }
            }
            c2175k.m7979c(d);
            obj = 1;
        }
        return stringBuilder2.toString();
    }

    /* renamed from: f */
    private static boolean m8604f(C2175k c2175k) {
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        byte[] bArr = c2175k.f6735a;
        if (d + 2 <= c) {
            int i = d + 1;
            if (bArr[d] == (byte) 47) {
                d = i + 1;
                if (bArr[i] == (byte) 42) {
                    while (true) {
                        i = d + 1;
                        if (i >= c) {
                            c2175k.m7981d(c - c2175k.m7980d());
                            return true;
                        } else if (((char) bArr[d]) == '*' && ((char) bArr[i]) == '/') {
                            d = i + 1;
                            c = d;
                        } else {
                            d = i;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static String m8602d(C2175k c2175k, StringBuilder stringBuilder) {
        int i = 0;
        stringBuilder.setLength(0);
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        while (d < c && r0 == 0) {
            char c2 = (char) c2175k.f6735a[d];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.'))) {
                if (c2 != '_') {
                    i = 1;
                }
            }
            d++;
            stringBuilder.append(c2);
        }
        c2175k.m7981d(d - c2175k.m7980d());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m8596a(C2350d c2350d, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f7454a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    c2350d.m8618c(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            str = str.split("\\.");
            String str2 = str[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                c2350d.m8616b(str2.substring(0, indexOf2));
                c2350d.m8611a(str2.substring(indexOf2 + 1));
            } else {
                c2350d.m8616b(str2);
            }
            if (str.length > 1) {
                c2350d.m8612a((String[]) Arrays.copyOfRange(str, 1, str.length));
            }
        }
    }
}
