package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okhttp3.internal.p156b.C2923d;

/* renamed from: okhttp3.l */
public final class C2971l {
    /* renamed from: a */
    private static final Pattern f12564a = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* renamed from: b */
    private static final Pattern f12565b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* renamed from: c */
    private static final Pattern f12566c = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* renamed from: d */
    private static final Pattern f12567d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    /* renamed from: e */
    private final String f12568e;
    /* renamed from: f */
    private final String f12569f;
    /* renamed from: g */
    private final long f12570g;
    /* renamed from: h */
    private final String f12571h;
    /* renamed from: i */
    private final String f12572i;
    /* renamed from: j */
    private final boolean f12573j;
    /* renamed from: k */
    private final boolean f12574k;
    /* renamed from: l */
    private final boolean f12575l;
    /* renamed from: m */
    private final boolean f12576m;

    /* renamed from: okhttp3.l$a */
    public static final class C2970a {
        /* renamed from: a */
        String f12555a;
        /* renamed from: b */
        String f12556b;
        /* renamed from: c */
        long f12557c = 253402300799999L;
        /* renamed from: d */
        String f12558d;
        /* renamed from: e */
        String f12559e = "/";
        /* renamed from: f */
        boolean f12560f;
        /* renamed from: g */
        boolean f12561g;
        /* renamed from: h */
        boolean f12562h;
        /* renamed from: i */
        boolean f12563i;

        /* renamed from: a */
        public C2970a m14466a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f12555a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        /* renamed from: b */
        public C2970a m14468b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.f12556b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        /* renamed from: a */
        public C2970a m14465a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.f12557c = j;
            this.f12562h = 1;
            return this;
        }

        /* renamed from: c */
        public C2970a m14469c(String str) {
            return m14463a(str, false);
        }

        /* renamed from: d */
        public C2970a m14471d(String str) {
            return m14463a(str, true);
        }

        /* renamed from: a */
        private C2970a m14463a(String str, boolean z) {
            if (str != null) {
                String a = C2933c.m14185a(str);
                if (a != null) {
                    this.f12558d = a;
                    this.f12563i = z;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected domain: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new NullPointerException("domain == null");
        }

        /* renamed from: e */
        public C2970a m14472e(String str) {
            if (str.startsWith("/")) {
                this.f12559e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        /* renamed from: a */
        public C2970a m14464a() {
            this.f12560f = true;
            return this;
        }

        /* renamed from: b */
        public C2970a m14467b() {
            this.f12561g = true;
            return this;
        }

        /* renamed from: c */
        public C2971l m14470c() {
            return new C2971l(this);
        }
    }

    private C2971l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12568e = str;
        this.f12569f = str2;
        this.f12570g = j;
        this.f12571h = str3;
        this.f12572i = str4;
        this.f12573j = z;
        this.f12574k = z2;
        this.f12576m = z3;
        this.f12575l = z4;
    }

    C2971l(C2970a c2970a) {
        if (c2970a.f12555a == null) {
            throw new NullPointerException("builder.name == null");
        } else if (c2970a.f12556b == null) {
            throw new NullPointerException("builder.value == null");
        } else if (c2970a.f12558d != null) {
            this.f12568e = c2970a.f12555a;
            this.f12569f = c2970a.f12556b;
            this.f12570g = c2970a.f12557c;
            this.f12571h = c2970a.f12558d;
            this.f12572i = c2970a.f12559e;
            this.f12573j = c2970a.f12560f;
            this.f12574k = c2970a.f12561g;
            this.f12575l = c2970a.f12562h;
            this.f12576m = c2970a.f12563i;
        } else {
            throw new NullPointerException("builder.domain == null");
        }
    }

    /* renamed from: a */
    public String m14482a() {
        return this.f12568e;
    }

    /* renamed from: b */
    public String m14485b() {
        return this.f12569f;
    }

    /* renamed from: c */
    public boolean m14486c() {
        return this.f12575l;
    }

    /* renamed from: d */
    public long m14487d() {
        return this.f12570g;
    }

    /* renamed from: e */
    public boolean m14488e() {
        return this.f12576m;
    }

    /* renamed from: f */
    public String m14489f() {
        return this.f12571h;
    }

    /* renamed from: g */
    public String m14490g() {
        return this.f12572i;
    }

    /* renamed from: h */
    public boolean m14491h() {
        return this.f12574k;
    }

    /* renamed from: i */
    public boolean m14492i() {
        return this.f12573j;
    }

    /* renamed from: a */
    public boolean m14484a(HttpUrl httpUrl) {
        boolean equals;
        if (this.f12576m) {
            equals = httpUrl.m13967f().equals(this.f12571h);
        } else {
            equals = C2971l.m14479a(httpUrl.m13967f(), this.f12571h);
        }
        if (!equals || !C2971l.m14481b(httpUrl, this.f12572i)) {
            return false;
        }
        if (this.f12573j && httpUrl.m13963c() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m14479a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == 46 && C2933c.m14207c(str) == null) {
            return true;
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m14481b(HttpUrl httpUrl, String str) {
        httpUrl = httpUrl.m13969h();
        if (httpUrl.equals(str)) {
            return true;
        }
        if (httpUrl.startsWith(str) && (str.endsWith("/") || httpUrl.charAt(str.length()) == 47)) {
            return true;
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static C2971l m14478a(HttpUrl httpUrl, String str) {
        return C2971l.m14477a(System.currentTimeMillis(), httpUrl, str);
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    static okhttp3.C2971l m14477a(long r25, okhttp3.HttpUrl r27, java.lang.String r28) {
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
        r2 = r28;
        r3 = r28.length();
        r4 = 59;
        r5 = 0;
        r6 = okhttp3.internal.C2933c.m14180a(r2, r5, r3, r4);
        r7 = 61;
        r8 = okhttp3.internal.C2933c.m14180a(r2, r5, r6, r7);
        r9 = 0;
        if (r8 != r6) goto L_0x0017;
    L_0x0016:
        return r9;
    L_0x0017:
        r11 = okhttp3.internal.C2933c.m14206c(r2, r5, r8);
        r10 = r11.isEmpty();
        if (r10 != 0) goto L_0x014e;
    L_0x0021:
        r10 = okhttp3.internal.C2933c.m14202b(r11);
        r12 = -1;
        if (r10 == r12) goto L_0x002a;
    L_0x0028:
        goto L_0x014e;
    L_0x002a:
        r10 = 1;
        r8 = r8 + r10;
        r8 = okhttp3.internal.C2933c.m14206c(r2, r8, r6);
        r13 = okhttp3.internal.C2933c.m14202b(r8);
        if (r13 == r12) goto L_0x0037;
    L_0x0036:
        return r9;
    L_0x0037:
        r6 = r6 + r10;
        r12 = -1;
        r14 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r10 = r9;
        r21 = r10;
        r16 = r12;
        r22 = r14;
        r18 = 0;
        r19 = 0;
        r20 = 1;
        r24 = 0;
    L_0x004e:
        if (r6 >= r3) goto L_0x00c3;
    L_0x0050:
        r9 = okhttp3.internal.C2933c.m14180a(r2, r6, r3, r4);
        r4 = okhttp3.internal.C2933c.m14180a(r2, r6, r9, r7);
        r6 = okhttp3.internal.C2933c.m14206c(r2, r6, r4);
        if (r4 >= r9) goto L_0x0065;
    L_0x005e:
        r4 = r4 + 1;
        r4 = okhttp3.internal.C2933c.m14206c(r2, r4, r9);
        goto L_0x0067;
    L_0x0065:
        r4 = "";
    L_0x0067:
        r7 = "expires";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x007c;
    L_0x006f:
        r6 = r4.length();	 Catch:{ IllegalArgumentException -> 0x00bb }
        r6 = okhttp3.C2971l.m14475a(r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x00bb }
        r22 = r6;
    L_0x0079:
        r24 = 1;
        goto L_0x00bb;
    L_0x007c:
        r7 = "max-age";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x008b;
    L_0x0084:
        r6 = okhttp3.C2971l.m14474a(r4);	 Catch:{  }
        r16 = r6;
        goto L_0x0079;
    L_0x008b:
        r7 = "domain";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x009b;
    L_0x0093:
        r4 = okhttp3.C2971l.m14480b(r4);	 Catch:{ IllegalArgumentException -> 0x00bb }
        r10 = r4;
        r20 = 0;
        goto L_0x00bb;
    L_0x009b:
        r7 = "path";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x00a6;
    L_0x00a3:
        r21 = r4;
        goto L_0x00bb;
    L_0x00a6:
        r4 = "secure";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x00b1;
    L_0x00ae:
        r18 = 1;
        goto L_0x00bb;
    L_0x00b1:
        r4 = "httponly";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x00bb;
    L_0x00b9:
        r19 = 1;
    L_0x00bb:
        r6 = r9 + 1;
        r4 = 59;
        r7 = 61;
        r9 = 0;
        goto L_0x004e;
    L_0x00c3:
        r2 = -9223372036854775808;
        r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x00cb;
    L_0x00c9:
        r13 = r2;
        goto L_0x00f1;
    L_0x00cb:
        r2 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1));
        if (r2 == 0) goto L_0x00ef;
    L_0x00cf:
        r2 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x00dd;
    L_0x00d8:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 * r2;
        goto L_0x00e2;
    L_0x00dd:
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00e2:
        r2 = 0;
        r2 = r25 + r16;
        r4 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1));
        if (r4 < 0) goto L_0x00ed;
    L_0x00e9:
        r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c9;
    L_0x00ed:
        r13 = r14;
        goto L_0x00f1;
    L_0x00ef:
        r13 = r22;
    L_0x00f1:
        r0 = r27.m13967f();
        if (r10 != 0) goto L_0x00fa;
    L_0x00f7:
        r15 = r0;
        r1 = 0;
        goto L_0x0104;
    L_0x00fa:
        r1 = okhttp3.C2971l.m14479a(r0, r10);
        if (r1 != 0) goto L_0x0102;
    L_0x0100:
        r1 = 0;
        return r1;
    L_0x0102:
        r1 = 0;
        r15 = r10;
    L_0x0104:
        r0 = r0.length();
        r2 = r15.length();
        if (r0 == r2) goto L_0x0119;
    L_0x010e:
        r0 = okhttp3.internal.p160f.C2946a.m14284a();
        r0 = r0.m14288a(r15);
        if (r0 != 0) goto L_0x0119;
    L_0x0118:
        return r1;
    L_0x0119:
        r9 = r21;
        if (r9 == 0) goto L_0x0129;
    L_0x011d:
        r0 = "/";
        r0 = r9.startsWith(r0);
        if (r0 != 0) goto L_0x0126;
    L_0x0125:
        goto L_0x0129;
    L_0x0126:
        r16 = r9;
        goto L_0x013e;
    L_0x0129:
        r0 = r27.m13969h();
        r1 = 47;
        r1 = r0.lastIndexOf(r1);
        if (r1 == 0) goto L_0x013a;
    L_0x0135:
        r0 = r0.substring(r5, r1);
        goto L_0x013c;
    L_0x013a:
        r0 = "/";
    L_0x013c:
        r16 = r0;
    L_0x013e:
        r0 = new okhttp3.l;
        r10 = r0;
        r12 = r8;
        r17 = r18;
        r18 = r19;
        r19 = r20;
        r20 = r24;
        r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20);
        return r0;
    L_0x014e:
        r0 = r9;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.l.a(long, okhttp3.HttpUrl, java.lang.String):okhttp3.l");
    }

    /* renamed from: a */
    private static long m14475a(String str, int i, int i2) {
        i = C2971l.m14473a(str, i, i2, false);
        Matcher matcher = f12567d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i < i2) {
            int a = C2971l.m14473a(str, i + 1, i2, true);
            matcher.region(i, a);
            if (i3 == -1 && matcher.usePattern(f12567d).matches() != 0) {
                i = Integer.parseInt(matcher.group(1));
                i3 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = i3;
                i3 = i;
            } else if (i5 == -1 && matcher.usePattern(f12566c).matches() != 0) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f12565b).matches() != 0) {
                i6 = f12565b.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f12564a).matches() != 0) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            i = C2971l.m14473a(str, a + 1, i2, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            str = new GregorianCalendar(C2933c.f12358g);
            str.setLenient(false);
            str.set(1, i4);
            str.set(2, i6 - 1);
            str.set(5, i5);
            str.set(11, i3);
            str.set(12, i7);
            str.set(13, i8);
            str.set(14, 0);
            return str.getTimeInMillis();
        }
    }

    /* renamed from: a */
    private static int m14473a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            int i3;
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < '' && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')))) {
                if (charAt != ':') {
                    i3 = 0;
                    if (i3 == (z ^ 1)) {
                        return i;
                    }
                    i++;
                }
            }
            i3 = 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m14474a(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (str.startsWith("-") == null) {
                    j = Long.MAX_VALUE;
                }
                return j;
            }
            throw e;
        }
    }

    /* renamed from: b */
    private static String m14480b(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        str = C2933c.m14185a(str);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static List<C2971l> m14476a(HttpUrl httpUrl, C2981s c2981s) {
        c2981s = c2981s.m14550b("Set-Cookie");
        int size = c2981s.size();
        List list = null;
        for (int i = 0; i < size; i++) {
            C2971l a = C2971l.m14478a(httpUrl, (String) c2981s.get(i));
            if (a != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a);
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public String toString() {
        return m14483a(false);
    }

    /* renamed from: a */
    String m14483a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12568e);
        stringBuilder.append('=');
        stringBuilder.append(this.f12569f);
        if (this.f12575l) {
            if (this.f12570g == Long.MIN_VALUE) {
                stringBuilder.append("; max-age=0");
            } else {
                stringBuilder.append("; expires=");
                stringBuilder.append(C2923d.m14150a(new Date(this.f12570g)));
            }
        }
        if (!this.f12576m) {
            stringBuilder.append("; domain=");
            if (z) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.f12571h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.f12572i);
        if (this.f12573j) {
            stringBuilder.append("; secure");
        }
        if (this.f12574k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = false;
        if (!(obj instanceof C2971l)) {
            return false;
        }
        C2971l c2971l = (C2971l) obj;
        if (c2971l.f12568e.equals(this.f12568e) && c2971l.f12569f.equals(this.f12569f) && c2971l.f12571h.equals(this.f12571h) && c2971l.f12572i.equals(this.f12572i) && c2971l.f12570g == this.f12570g && c2971l.f12573j == this.f12573j && c2971l.f12574k == this.f12574k && c2971l.f12575l == this.f12575l && c2971l.f12576m == this.f12576m) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f12568e.hashCode()) * 31) + this.f12569f.hashCode()) * 31) + this.f12571h.hashCode()) * 31) + this.f12572i.hashCode()) * 31) + ((int) (this.f12570g ^ (this.f12570g >>> 32)))) * 31) + (this.f12573j ^ 1)) * 31) + (this.f12574k ^ 1)) * 31) + (this.f12575l ^ 1)) * 31) + (this.f12576m ^ 1);
    }
}
