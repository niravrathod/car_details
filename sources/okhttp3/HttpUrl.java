package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okio.C4755c;

public final class HttpUrl {
    /* renamed from: d */
    private static final char[] f12118d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* renamed from: a */
    final String f12119a;
    /* renamed from: b */
    final String f12120b;
    /* renamed from: c */
    final int f12121c;
    /* renamed from: e */
    private final String f12122e;
    /* renamed from: f */
    private final String f12123f;
    /* renamed from: g */
    private final List<String> f12124g;
    @Nullable
    /* renamed from: h */
    private final List<String> f12125h;
    @Nullable
    /* renamed from: i */
    private final String f12126i;
    /* renamed from: j */
    private final String f12127j;

    public static final class Builder {
        @Nullable
        /* renamed from: a */
        String f12110a;
        /* renamed from: b */
        String f12111b = "";
        /* renamed from: c */
        String f12112c = "";
        @Nullable
        /* renamed from: d */
        String f12113d;
        /* renamed from: e */
        int f12114e = -1;
        /* renamed from: f */
        final List<String> f12115f = new ArrayList();
        @Nullable
        /* renamed from: g */
        List<String> f12116g;
        @Nullable
        /* renamed from: h */
        String f12117h;

        enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            this.f12115f.add("");
        }

        /* renamed from: a */
        public Builder m13938a(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f12110a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f12110a = "https";
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unexpected scheme: ");
                    stringBuilder.append(str);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: b */
        public Builder m13941b(String str) {
            if (str != null) {
                this.f12111b = HttpUrl.m13949a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        /* renamed from: c */
        public Builder m13942c(String str) {
            if (str != null) {
                this.f12112c = HttpUrl.m13949a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: d */
        public Builder m13944d(String str) {
            if (str != null) {
                String e = m13931e(str, 0, str.length());
                if (e != null) {
                    this.f12113d = e;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected host: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: a */
        public Builder m13937a(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected port: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f12114e = i;
            return this;
        }

        /* renamed from: a */
        int m13935a() {
            return this.f12114e != -1 ? this.f12114e : HttpUrl.m13946a(this.f12110a);
        }

        /* renamed from: e */
        public Builder m13945e(@Nullable String str) {
            if (str != null) {
                str = HttpUrl.m13957b(HttpUrl.m13949a(str, " \"'<>#", true, false, true, true));
            } else {
                str = null;
            }
            this.f12116g = str;
            return this;
        }

        /* renamed from: a */
        public Builder m13939a(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f12116g == null) {
                    this.f12116g = new ArrayList();
                }
                this.f12116g.add(HttpUrl.m13949a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                str = this.f12116g;
                if (str2 != null) {
                    str2 = HttpUrl.m13949a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str2 = null;
                }
                str.add(str2);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: b */
        Builder m13940b() {
            int size = this.f12115f.size();
            for (int i = 0; i < size; i++) {
                this.f12115f.set(i, HttpUrl.m13949a((String) this.f12115f.get(i), "[]", true, true, false, true));
            }
            if (this.f12116g != null) {
                size = this.f12116g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) this.f12116g.get(i2);
                    if (str != null) {
                        this.f12116g.set(i2, HttpUrl.m13949a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            if (this.f12117h != null) {
                this.f12117h = HttpUrl.m13949a(this.f12117h, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: c */
        public HttpUrl m13943c() {
            if (this.f12110a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f12113d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12110a);
            stringBuilder.append("://");
            if (!(this.f12111b.isEmpty() && this.f12112c.isEmpty())) {
                stringBuilder.append(this.f12111b);
                if (!this.f12112c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.f12112c);
                }
                stringBuilder.append('@');
            }
            if (this.f12113d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.f12113d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.f12113d);
            }
            int a = m13935a();
            if (a != HttpUrl.m13946a(this.f12110a)) {
                stringBuilder.append(':');
                stringBuilder.append(a);
            }
            HttpUrl.m13953a(stringBuilder, this.f12115f);
            if (this.f12116g != null) {
                stringBuilder.append('?');
                HttpUrl.m13958b(stringBuilder, this.f12116g);
            }
            if (this.f12117h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.f12117h);
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        ParseResult m13936a(@Nullable HttpUrl httpUrl, String str) {
            int a;
            Builder builder = this;
            HttpUrl httpUrl2 = httpUrl;
            String str2 = str;
            int a2 = C2933c.m14179a(str2, 0, str.length());
            int b = C2933c.m14203b(str2, a2, str.length());
            if (m13927b(str2, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    builder.f12110a = "https";
                    a2 += "https:".length();
                } else {
                    if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                        return ParseResult.UNSUPPORTED_SCHEME;
                    }
                    builder.f12110a = "http";
                    a2 += "http:".length();
                }
            } else if (httpUrl2 == null) {
                return ParseResult.MISSING_SCHEME;
            } else {
                builder.f12110a = httpUrl2.f12119a;
            }
            int c = m13928c(str2, a2, b);
            char c2 = '#';
            if (c < 2 && httpUrl2 != null) {
                if (httpUrl2.f12119a.equals(builder.f12110a)) {
                    builder.f12111b = httpUrl.m13964d();
                    builder.f12112c = httpUrl.m13966e();
                    builder.f12113d = httpUrl2.f12120b;
                    builder.f12114e = httpUrl2.f12121c;
                    builder.f12115f.clear();
                    builder.f12115f.addAll(httpUrl.m13970i());
                    if (a2 == b || str2.charAt(a2) == '#') {
                        m13945e(httpUrl.m13971j());
                    }
                    int i = a2;
                    a = C2933c.m14181a(str2, i, b, "?#");
                    m13925a(str2, i, a);
                    if (a < b && str2.charAt(a) == '?') {
                        int a3 = C2933c.m14180a(str2, a, b, '#');
                        builder.f12116g = HttpUrl.m13957b(HttpUrl.m13947a(str, a + 1, a3, " \"'<>#", true, false, true, true, null));
                        a = a3;
                    }
                    if (a < b && str2.charAt(a) == '#') {
                        builder.f12117h = HttpUrl.m13947a(str, 1 + a, b, "", true, false, false, false, null);
                    }
                    return ParseResult.SUCCESS;
                }
            }
            c = a2 + c;
            Object obj = null;
            Object obj2 = null;
            while (true) {
                a2 = C2933c.m14181a(str2, c, b, "@/\\?#");
                char charAt = a2 != b ? str2.charAt(a2) : '￿';
                if (!(charAt == '￿' || charAt == r13 || charAt == '/' || charAt == '\\')) {
                    switch (charAt) {
                        case '?':
                            break;
                        case '@':
                            if (obj == null) {
                                int a4 = C2933c.m14180a(str2, c, a2, ':');
                                int i2 = a4;
                                i = a2;
                                String a5 = HttpUrl.m13947a(str, c, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (obj2 != null) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(builder.f12111b);
                                    stringBuilder.append("%40");
                                    stringBuilder.append(a5);
                                    a5 = stringBuilder.toString();
                                }
                                builder.f12111b = a5;
                                if (i2 != i) {
                                    builder.f12112c = HttpUrl.m13947a(str, i2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    obj = 1;
                                }
                                obj2 = 1;
                            } else {
                                i = a2;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(builder.f12112c);
                                stringBuilder2.append("%40");
                                stringBuilder2.append(HttpUrl.m13947a(str, c, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                builder.f12112c = stringBuilder2.toString();
                            }
                            c = i + 1;
                            continue;
                        default:
                            continue;
                    }
                }
                i = a2;
                a = m13929d(str2, c, i);
                int i3 = a + 1;
                if (i3 < i) {
                    builder.f12113d = m13931e(str2, c, a);
                    builder.f12114e = m13932f(str2, i3, i);
                    if (builder.f12114e == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                }
                builder.f12113d = m13931e(str2, c, a);
                builder.f12114e = HttpUrl.m13946a(builder.f12110a);
                if (builder.f12113d == null) {
                    return ParseResult.INVALID_HOST;
                }
                a = C2933c.m14181a(str2, i, b, "?#");
                m13925a(str2, i, a);
                int a32 = C2933c.m14180a(str2, a, b, '#');
                builder.f12116g = HttpUrl.m13957b(HttpUrl.m13947a(str, a + 1, a32, " \"'<>#", true, false, true, true, null));
                a = a32;
                builder.f12117h = HttpUrl.m13947a(str, 1 + a, b, "", true, false, false, false, null);
                return ParseResult.SUCCESS;
                c2 = '#';
            }
        }

        /* renamed from: a */
        private void m13925a(String str, int i, int i2) {
            if (i != i2) {
                int i3;
                boolean z;
                char charAt = str.charAt(i);
                if (charAt != '/') {
                    if (charAt != '\\') {
                        this.f12115f.set(this.f12115f.size() - 1, "");
                        while (true) {
                            i3 = i;
                            if (i3 < i2) {
                                i = C2933c.m14181a(str, i3, i2, "/\\");
                                z = i >= i2;
                                m13926a(str, i3, i, z, true);
                                if (z) {
                                    i++;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                this.f12115f.clear();
                this.f12115f.add("");
                i++;
                while (true) {
                    i3 = i;
                    if (i3 < i2) {
                        i = C2933c.m14181a(str, i3, i2, "/\\");
                        if (i >= i2) {
                        }
                        m13926a(str, i3, i, z, true);
                        if (z) {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m13926a(String str, int i, int i2, boolean z, boolean z2) {
            str = HttpUrl.m13947a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m13933f(str) == 0) {
                if (m13934g(str) != 0) {
                    m13930d();
                    return;
                }
                if (((String) this.f12115f.get(this.f12115f.size() - 1)).isEmpty() != 0) {
                    this.f12115f.set(this.f12115f.size() - 1, str);
                } else {
                    this.f12115f.add(str);
                }
                if (z) {
                    this.f12115f.add("");
                }
            }
        }

        /* renamed from: f */
        private boolean m13933f(String str) {
            if (!str.equals(".")) {
                if (str.equalsIgnoreCase("%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: g */
        private boolean m13934g(String str) {
            if (!(str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e"))) {
                if (str.equalsIgnoreCase("%2e%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: d */
        private void m13930d() {
            if (!((String) this.f12115f.remove(this.f12115f.size() - 1)).isEmpty() || this.f12115f.isEmpty()) {
                this.f12115f.add("");
            } else {
                this.f12115f.set(this.f12115f.size() - 1, "");
            }
        }

        /* renamed from: b */
        private static int m13927b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                if (charAt >= 'A') {
                    if (charAt > 'Z') {
                    }
                }
                return -1;
            }
            while (true) {
                i++;
                if (i < i2) {
                    charAt = str.charAt(i);
                    if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '-'))) {
                        if (charAt != '.') {
                            break;
                        }
                    }
                } else {
                    return -1;
                }
            }
            if (charAt == ':') {
                return i;
            }
            return -1;
        }

        /* renamed from: c */
        private static int m13928c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m13929d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: e */
        private static String m13931e(String str, int i, int i2) {
            return C2933c.m14185a(HttpUrl.m13948a(str, i, i2, false));
        }

        /* renamed from: f */
        private static int m13932f(java.lang.String r10, int r11, int r12) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = -1;
            r4 = "";	 Catch:{ NumberFormatException -> 0x001c }
            r5 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r6 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r7 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r8 = 1;	 Catch:{ NumberFormatException -> 0x001c }
            r9 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r1 = r10;	 Catch:{ NumberFormatException -> 0x001c }
            r2 = r11;	 Catch:{ NumberFormatException -> 0x001c }
            r3 = r12;	 Catch:{ NumberFormatException -> 0x001c }
            r10 = okhttp3.HttpUrl.m13947a(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ NumberFormatException -> 0x001c }
            r10 = java.lang.Integer.parseInt(r10);	 Catch:{ NumberFormatException -> 0x001c }
            if (r10 <= 0) goto L_0x001b;
        L_0x0015:
            r11 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            if (r10 > r11) goto L_0x001b;
        L_0x001a:
            return r10;
        L_0x001b:
            return r0;
        L_0x001c:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.f(java.lang.String, int, int):int");
        }
    }

    HttpUrl(Builder builder) {
        this.f12119a = builder.f12110a;
        this.f12122e = m13951a(builder.f12111b, false);
        this.f12123f = m13951a(builder.f12112c, false);
        this.f12120b = builder.f12113d;
        this.f12121c = builder.m13935a();
        this.f12124g = m13952a(builder.f12115f, false);
        String str = null;
        this.f12125h = builder.f12116g != null ? m13952a(builder.f12116g, true) : null;
        if (builder.f12117h != null) {
            str = m13951a(builder.f12117h, false);
        }
        this.f12126i = str;
        this.f12127j = builder.toString();
    }

    /* renamed from: a */
    public java.net.URI m13960a() {
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
        r4 = this;
        r0 = r4.m13975n();
        r0 = r0.m13940b();
        r0 = r0.toString();
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0012 }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = move-exception;
        r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";	 Catch:{ Exception -> 0x0020 }
        r3 = "";	 Catch:{ Exception -> 0x0020 }
        r0 = r0.replaceAll(r2, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = java.net.URI.create(r0);	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.a():java.net.URI");
    }

    /* renamed from: b */
    public String m13961b() {
        return this.f12119a;
    }

    /* renamed from: c */
    public boolean m13963c() {
        return this.f12119a.equals("https");
    }

    /* renamed from: d */
    public String m13964d() {
        if (this.f12122e.isEmpty()) {
            return "";
        }
        int length = this.f12119a.length() + 3;
        return this.f12127j.substring(length, C2933c.m14181a(this.f12127j, length, this.f12127j.length(), ":@"));
    }

    /* renamed from: e */
    public String m13966e() {
        if (this.f12123f.isEmpty()) {
            return "";
        }
        return this.f12127j.substring(this.f12127j.indexOf(58, this.f12119a.length() + 3) + 1, this.f12127j.indexOf(64));
    }

    /* renamed from: f */
    public String m13967f() {
        return this.f12120b;
    }

    /* renamed from: g */
    public int m13968g() {
        return this.f12121c;
    }

    /* renamed from: a */
    public static int m13946a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") != null ? 443 : -1;
    }

    /* renamed from: h */
    public String m13969h() {
        int indexOf = this.f12127j.indexOf(47, this.f12119a.length() + 3);
        return this.f12127j.substring(indexOf, C2933c.m14181a(this.f12127j, indexOf, this.f12127j.length(), "?#"));
    }

    /* renamed from: a */
    static void m13953a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    /* renamed from: i */
    public List<String> m13970i() {
        int indexOf = this.f12127j.indexOf(47, this.f12119a.length() + 3);
        int a = C2933c.m14181a(this.f12127j, indexOf, this.f12127j.length(), "?#");
        List<String> arrayList = new ArrayList();
        while (indexOf < a) {
            indexOf++;
            int a2 = C2933c.m14180a(this.f12127j, indexOf, a, '/');
            arrayList.add(this.f12127j.substring(indexOf, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: j */
    public String m13971j() {
        if (this.f12125h == null) {
            return null;
        }
        int indexOf = this.f12127j.indexOf(63) + 1;
        return this.f12127j.substring(indexOf, C2933c.m14180a(this.f12127j, indexOf, this.f12127j.length(), '#'));
    }

    /* renamed from: b */
    static void m13958b(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(str);
            if (str2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(str2);
            }
        }
    }

    /* renamed from: b */
    static List<String> m13957b(String str) {
        List<String> arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1) {
                if (indexOf2 <= indexOf) {
                    arrayList.add(str.substring(i, indexOf2));
                    arrayList.add(str.substring(indexOf2 + 1, indexOf));
                    i = indexOf + 1;
                }
            }
            arrayList.add(str.substring(i, indexOf));
            arrayList.add(null);
            i = indexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: k */
    public String m13972k() {
        if (this.f12125h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        m13958b(stringBuilder, this.f12125h);
        return stringBuilder.toString();
    }

    @Nullable
    /* renamed from: l */
    public String m13973l() {
        if (this.f12126i == null) {
            return null;
        }
        return this.f12127j.substring(this.f12127j.indexOf(35) + 1);
    }

    /* renamed from: m */
    public String m13974m() {
        return m13965d("/...").m13941b("").m13942c("").m13943c().toString();
    }

    @Nullable
    /* renamed from: c */
    public HttpUrl m13962c(String str) {
        str = m13965d(str);
        return str != null ? str.m13943c() : null;
    }

    /* renamed from: n */
    public Builder m13975n() {
        Builder builder = new Builder();
        builder.f12110a = this.f12119a;
        builder.f12111b = m13964d();
        builder.f12112c = m13966e();
        builder.f12113d = this.f12120b;
        builder.f12114e = this.f12121c != m13946a(this.f12119a) ? this.f12121c : -1;
        builder.f12115f.clear();
        builder.f12115f.addAll(m13970i());
        builder.m13945e(m13971j());
        builder.f12117h = m13973l();
        return builder;
    }

    @Nullable
    /* renamed from: d */
    public Builder m13965d(String str) {
        Builder builder = new Builder();
        return builder.m13936a(this, str) == ParseResult.SUCCESS ? builder : null;
    }

    @Nullable
    /* renamed from: e */
    public static HttpUrl m13959e(String str) {
        Builder builder = new Builder();
        if (builder.m13936a(null, str) == ParseResult.SUCCESS) {
            return builder.m13943c();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof HttpUrl) || ((HttpUrl) obj).f12127j.equals(this.f12127j) == null) ? null : true;
    }

    public int hashCode() {
        return this.f12127j.hashCode();
    }

    public String toString() {
        return this.f12127j;
    }

    /* renamed from: a */
    static String m13951a(String str, boolean z) {
        return m13948a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m13952a(List<String> list, boolean z) {
        int size = list.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m13951a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m13948a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                }
            }
            C4755c c4755c = new C4755c();
            c4755c.m27493a(str, i, i3);
            m13955a(c4755c, str, i3, i2, z);
            return c4755c.mo4575p();
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m13955a(C4755c c4755c, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C2933c.m14178a(str.charAt(i + 1));
                    int a2 = C2933c.m14178a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        c4755c.m27503b((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    c4755c.m27491a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                c4755c.m27503b(32);
                i += Character.charCount(codePointAt);
            }
            c4755c.m27491a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m13956a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != 37 || C2933c.m14178a(str.charAt(i + 1)) == -1 || C2933c.m14178a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m13947a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int codePointAt;
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            codePointAt = str.codePointAt(i4);
            String str4;
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                str4 = str2;
            } else {
                str4 = str2;
                if (str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || m13956a(str, i4, i2))))) {
                    if (codePointAt != 43 || !z3) {
                        i4 += Character.charCount(codePointAt);
                    }
                }
            }
            C4755c c4755c = new C4755c();
            codePointAt = i;
            c4755c.m27493a(str, i, i4);
            m13954a(c4755c, str, i4, i2, str2, z, z2, z3, z4, charset);
            return c4755c.mo4575p();
        }
        codePointAt = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m13954a(C4755c c4755c, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C4755c c4755c2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (z) {
                if (!(codePointAt == 9 || codePointAt == 10 || codePointAt == 12)) {
                    if (codePointAt == 13) {
                    }
                }
                i += Character.charCount(codePointAt);
            }
            if (codePointAt == 43 && z3) {
                c4755c.m27492a(z ? "+" : "%2B");
                i += Character.charCount(codePointAt);
            } else {
                int h;
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1)) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2 && !m13956a(str, i, i2)) {
                            }
                        }
                    }
                    c4755c.m27491a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
                if (c4755c2 == null) {
                    c4755c2 = new C4755c();
                }
                if (charset != null) {
                    if (!charset.equals(C2933c.f12356e)) {
                        c4755c2.m27494a(str, i, Character.charCount(codePointAt) + i, charset);
                        while (!c4755c2.mo4557e()) {
                            h = c4755c2.mo4560h() & 255;
                            c4755c.m27503b(37);
                            c4755c.m27503b(f12118d[(h >> 4) & 15]);
                            c4755c.m27503b(f12118d[h & 15]);
                        }
                        i += Character.charCount(codePointAt);
                    }
                }
                c4755c2.m27491a(codePointAt);
                while (!c4755c2.mo4557e()) {
                    h = c4755c2.mo4560h() & 255;
                    c4755c.m27503b(37);
                    c4755c.m27503b(f12118d[(h >> 4) & 15]);
                    c4755c.m27503b(f12118d[h & 15]);
                }
                i += Character.charCount(codePointAt);
            }
        }
    }

    /* renamed from: a */
    static String m13950a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m13947a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m13949a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m13947a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
