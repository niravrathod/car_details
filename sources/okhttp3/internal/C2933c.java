package okhttp3.internal;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.C2991z;
import okhttp3.HttpUrl;
import okhttp3.ab;
import okio.ByteString;
import okio.C4394e;
import okio.C4755c;

/* renamed from: okhttp3.internal.c */
public final class C2933c {
    /* renamed from: a */
    public static final byte[] f12352a = new byte[0];
    /* renamed from: b */
    public static final String[] f12353b = new String[0];
    /* renamed from: c */
    public static final ab f12354c = ab.m14026a(null, f12352a);
    /* renamed from: d */
    public static final C2991z f12355d = C2991z.m14633a(null, f12352a);
    /* renamed from: e */
    public static final Charset f12356e = Charset.forName("UTF-8");
    /* renamed from: f */
    public static final Charset f12357f = Charset.forName("ISO-8859-1");
    /* renamed from: g */
    public static final TimeZone f12358g = TimeZone.getTimeZone("GMT");
    /* renamed from: h */
    public static final Comparator<String> f12359h = new C29301();
    /* renamed from: i */
    private static final ByteString f12360i = ByteString.m14644c("efbbbf");
    /* renamed from: j */
    private static final ByteString f12361j = ByteString.m14644c("feff");
    /* renamed from: k */
    private static final ByteString f12362k = ByteString.m14644c("fffe");
    /* renamed from: l */
    private static final ByteString f12363l = ByteString.m14644c("0000ffff");
    /* renamed from: m */
    private static final ByteString f12364m = ByteString.m14644c("ffff0000");
    /* renamed from: n */
    private static final Charset f12365n = Charset.forName("UTF-16BE");
    /* renamed from: o */
    private static final Charset f12366o = Charset.forName("UTF-16LE");
    /* renamed from: p */
    private static final Charset f12367p = Charset.forName("UTF-32BE");
    /* renamed from: q */
    private static final Charset f12368q = Charset.forName("UTF-32LE");
    /* renamed from: r */
    private static final Pattern f12369r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: okhttp3.internal.c$1 */
    class C29301 implements Comparator<String> {
        C29301() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m14177a((String) obj, (String) obj2);
        }

        /* renamed from: a */
        public int m14177a(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: okhttp3.internal.c$2 */
    class C29312 implements ThreadFactory {
        /* renamed from: a */
        final /* synthetic */ String f12350a;
        /* renamed from: b */
        final /* synthetic */ boolean f12351b;

        C29312(String str, boolean z) {
            this.f12350a = str;
            this.f12351b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f12350a);
            thread.setDaemon(this.f12351b);
            return thread;
        }
    }

    /* renamed from: a */
    public static int m14178a(char c) {
        return (c < '0' || c > '9') ? (c < 'a' || c > 'f') ? (c < 'A' || c > 'F') ? -1 : (c - 65) + 10 : (c - 97) + 10 : c - 48;
    }

    /* renamed from: a */
    public static void m14193a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static boolean m14197a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m14194a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public static void m14195a(java.net.Socket r1) {
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
        if (r1 == 0) goto L_0x0011;
    L_0x0002:
        r1.close();	 Catch:{ AssertionError -> 0x0008, RuntimeException -> 0x0006, Exception -> 0x0011 }
        goto L_0x0011;
    L_0x0006:
        r1 = move-exception;
        throw r1;
    L_0x0008:
        r1 = move-exception;
        r0 = okhttp3.internal.C2933c.m14196a(r1);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        throw r1;
    L_0x0011:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.a(java.net.Socket):void");
    }

    /* renamed from: a */
    public static boolean m14199a(okio.C2995s r0, int r1, java.util.concurrent.TimeUnit r2) {
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
        r0 = okhttp3.internal.C2933c.m14205b(r0, r1, r2);	 Catch:{ IOException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.a(okio.s, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public static boolean m14205b(okio.C2995s r11, int r12, java.util.concurrent.TimeUnit r13) {
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
        r0 = java.lang.System.nanoTime();
        r2 = r11.mo3616a();
        r2 = r2.A_();
        r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r2 == 0) goto L_0x001d;
    L_0x0013:
        r2 = r11.mo3616a();
        r5 = r2.m14675d();
        r5 = r5 - r0;
        goto L_0x001e;
    L_0x001d:
        r5 = r3;
    L_0x001e:
        r2 = r11.mo3616a();
        r7 = (long) r12;
        r12 = r13.toNanos(r7);
        r12 = java.lang.Math.min(r5, r12);
        r12 = r12 + r0;
        r2.m14673a(r12);
        r12 = new okio.c;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r12.<init>();	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
    L_0x0034:
        r7 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r7 = r11.mo3615a(r12, r7);	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r9 = -1;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        if (r13 == 0) goto L_0x0044;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
    L_0x0040:
        r12.m27548t();	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        goto L_0x0034;
    L_0x0044:
        r12 = 1;
        r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x0051;
    L_0x0049:
        r11 = r11.mo3616a();
        r11.m14676f();
        goto L_0x0059;
    L_0x0051:
        r11 = r11.mo3616a();
        r0 = r0 + r5;
        r11.m14673a(r0);
    L_0x0059:
        return r12;
    L_0x005a:
        r12 = move-exception;
        r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x0067;
    L_0x005f:
        r11 = r11.mo3616a();
        r11.m14676f();
        goto L_0x006f;
    L_0x0067:
        r11 = r11.mo3616a();
        r0 = r0 + r5;
        r11.m14673a(r0);
    L_0x006f:
        throw r12;
        r12 = 0;
        r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x007e;
    L_0x0076:
        r11 = r11.mo3616a();
        r11.m14676f();
        goto L_0x0086;
    L_0x007e:
        r11 = r11.mo3616a();
        r0 = r0 + r5;
        r11.m14673a(r0);
    L_0x0086:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.b(okio.s, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: a */
    public static <T> List<T> m14190a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m14191a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static ThreadFactory m14192a(String str, boolean z) {
        return new C29312(str, z);
    }

    /* renamed from: a */
    public static String[] m14200a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        List arrayList = new ArrayList();
        for (Object obj : strArr) {
            for (Object compare : strArr2) {
                if (comparator.compare(obj, compare) == 0) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public static boolean m14204b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0)) {
            if (strArr2.length != 0) {
                for (Object obj : strArr) {
                    for (Object compare : strArr2) {
                        if (comparator.compare(obj, compare) == 0) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m14187a(HttpUrl httpUrl, boolean z) {
        String stringBuilder;
        if (httpUrl.m13967f().contains(":")) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("[");
            stringBuilder2.append(httpUrl.m13967f());
            stringBuilder2.append("]");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = httpUrl.m13967f();
        }
        if (!z && httpUrl.m13968g() == HttpUrl.m13946a(httpUrl.m13961b())) {
            return stringBuilder;
        }
        z = new StringBuilder();
        z.append(stringBuilder);
        z.append(":");
        z.append(httpUrl.m13968g());
        return z.toString();
    }

    /* renamed from: a */
    public static boolean m14196a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || assertionError.getMessage().contains("getsockname failed") == null) ? null : true;
    }

    /* renamed from: a */
    public static int m14183a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String[] m14201a(String[] strArr, String str) {
        Object obj = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, obj, 0, strArr.length);
        obj[obj.length - 1] = str;
        return obj;
    }

    /* renamed from: a */
    public static int m14179a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static int m14203b(String str, int i, int i2) {
        i2--;
        while (i2 >= i) {
            switch (str.charAt(i2)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i2--;
                default:
                    return i2 + 1;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static String m14206c(String str, int i, int i2) {
        i = C2933c.m14179a(str, i, i2);
        return str.substring(i, C2933c.m14203b(str, i, i2));
    }

    /* renamed from: a */
    public static int m14181a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m14180a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static java.lang.String m14185a(java.lang.String r3) {
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
        r0 = ":";
        r0 = r3.contains(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x005a;
    L_0x0009:
        r0 = "[";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x0024;
    L_0x0011:
        r0 = "]";
        r0 = r3.endsWith(r0);
        if (r0 == 0) goto L_0x0024;
    L_0x0019:
        r0 = r3.length();
        r2 = 1;
        r0 = r0 - r2;
        r0 = okhttp3.internal.C2933c.m14208d(r3, r2, r0);
        goto L_0x002d;
    L_0x0024:
        r0 = 0;
        r2 = r3.length();
        r0 = okhttp3.internal.C2933c.m14208d(r3, r0, r2);
    L_0x002d:
        if (r0 != 0) goto L_0x0030;
    L_0x002f:
        return r1;
    L_0x0030:
        r0 = r0.getAddress();
        r1 = r0.length;
        r2 = 16;
        if (r1 != r2) goto L_0x003e;
    L_0x0039:
        r3 = okhttp3.internal.C2933c.m14188a(r0);
        return r3;
    L_0x003e:
        r0 = new java.lang.AssertionError;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid IPv6 address: '";
        r1.append(r2);
        r1.append(r3);
        r3 = "'";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
    L_0x005a:
        r3 = java.net.IDN.toASCII(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = r3.toLowerCase(r0);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = r3.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r0 == 0) goto L_0x006b;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x006a:
        return r1;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x006b:
        r0 = okhttp3.internal.C2933c.m14209d(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r0 == 0) goto L_0x0072;
    L_0x0071:
        return r1;
    L_0x0072:
        return r3;
    L_0x0073:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.a(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static boolean m14209d(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > '\u001f') {
                if (charAt < '') {
                    if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        return true;
                    }
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m14202b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt > '\u001f') {
                if (charAt < '') {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m14207c(String str) {
        return f12369r.matcher(str).matches();
    }

    /* renamed from: a */
    public static String m14186a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static Charset m14189a(C4394e c4394e, Charset charset) {
        if (c4394e.mo4549a(0, f12360i)) {
            c4394e.mo4565i((long) f12360i.m14660h());
            return f12356e;
        } else if (c4394e.mo4549a(0, f12361j)) {
            c4394e.mo4565i((long) f12361j.m14660h());
            return f12365n;
        } else if (c4394e.mo4549a(0, f12362k)) {
            c4394e.mo4565i((long) f12362k.m14660h());
            return f12366o;
        } else if (c4394e.mo4549a(0, f12363l)) {
            c4394e.mo4565i((long) f12363l.m14660h());
            return f12367p;
        } else if (!c4394e.mo4549a(0, f12364m)) {
            return charset;
        } else {
            c4394e.mo4565i((long) f12364m.m14660h());
            return f12368q;
        }
    }

    /* renamed from: a */
    public static int m14182a(String str, long j, TimeUnit timeUnit) {
        StringBuilder stringBuilder;
        if (j < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" < 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit != null) {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis <= 2147483647L) {
                if (toMillis == 0) {
                    if (j > 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" too small.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                return (int) toMillis;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" too large.");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public static java.lang.AssertionError m14184a(java.lang.String r1, java.lang.Exception r2) {
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
        r0 = new java.lang.AssertionError;
        r0.<init>(r1);
        r0.initCause(r2);	 Catch:{ IllegalStateException -> 0x0008 }
    L_0x0008:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.a(java.lang.String, java.lang.Exception):java.lang.AssertionError");
    }

    @javax.annotation.Nullable
    /* renamed from: d */
    private static java.net.InetAddress m14208d(java.lang.String r10, int r11, int r12) {
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
        r0 = 16;
        r0 = new byte[r0];
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r4 = -1;
        r5 = -1;
    L_0x0009:
        r6 = 0;
        if (r11 >= r12) goto L_0x007c;
    L_0x000c:
        r7 = r0.length;
        if (r3 != r7) goto L_0x0010;
    L_0x000f:
        return r6;
    L_0x0010:
        r7 = r11 + 2;
        if (r7 > r12) goto L_0x0029;
    L_0x0014:
        r8 = "::";
        r9 = 2;
        r8 = r10.regionMatches(r11, r8, r2, r9);
        if (r8 == 0) goto L_0x0029;
    L_0x001d:
        if (r4 == r1) goto L_0x0020;
    L_0x001f:
        return r6;
    L_0x0020:
        r3 = r3 + 2;
        if (r7 != r12) goto L_0x0026;
    L_0x0024:
        r4 = r3;
        goto L_0x007c;
    L_0x0026:
        r4 = r3;
        r5 = r7;
        goto L_0x004d;
    L_0x0029:
        if (r3 == 0) goto L_0x004c;
    L_0x002b:
        r7 = ":";
        r8 = 1;
        r7 = r10.regionMatches(r11, r7, r2, r8);
        if (r7 == 0) goto L_0x0037;
    L_0x0034:
        r11 = r11 + 1;
        goto L_0x004c;
    L_0x0037:
        r7 = ".";
        r11 = r10.regionMatches(r11, r7, r2, r8);
        if (r11 == 0) goto L_0x004b;
    L_0x003f:
        r11 = r3 + -2;
        r10 = okhttp3.internal.C2933c.m14198a(r10, r5, r12, r0, r11);
        if (r10 != 0) goto L_0x0048;
    L_0x0047:
        return r6;
    L_0x0048:
        r3 = r3 + 2;
        goto L_0x007c;
    L_0x004b:
        return r6;
    L_0x004c:
        r5 = r11;
    L_0x004d:
        r11 = r5;
        r7 = 0;
    L_0x004f:
        if (r11 >= r12) goto L_0x0062;
    L_0x0051:
        r8 = r10.charAt(r11);
        r8 = okhttp3.internal.C2933c.m14178a(r8);
        if (r8 != r1) goto L_0x005c;
    L_0x005b:
        goto L_0x0062;
    L_0x005c:
        r7 = r7 << 4;
        r7 = r7 + r8;
        r11 = r11 + 1;
        goto L_0x004f;
    L_0x0062:
        r8 = r11 - r5;
        if (r8 == 0) goto L_0x007b;
    L_0x0066:
        r9 = 4;
        if (r8 <= r9) goto L_0x006a;
    L_0x0069:
        goto L_0x007b;
    L_0x006a:
        r6 = r3 + 1;
        r8 = r7 >>> 8;
        r8 = r8 & 255;
        r8 = (byte) r8;
        r0[r3] = r8;
        r3 = r6 + 1;
        r7 = r7 & 255;
        r7 = (byte) r7;
        r0[r6] = r7;
        goto L_0x0009;
    L_0x007b:
        return r6;
    L_0x007c:
        r10 = r0.length;
        if (r3 == r10) goto L_0x008f;
    L_0x007f:
        if (r4 != r1) goto L_0x0082;
    L_0x0081:
        return r6;
    L_0x0082:
        r10 = r0.length;
        r11 = r3 - r4;
        r10 = r10 - r11;
        java.lang.System.arraycopy(r0, r4, r0, r10, r11);
        r10 = r0.length;
        r10 = r10 - r3;
        r10 = r10 + r4;
        java.util.Arrays.fill(r0, r4, r10, r2);
    L_0x008f:
        r10 = java.net.InetAddress.getByAddress(r0);	 Catch:{ UnknownHostException -> 0x0094 }
        return r10;
    L_0x0094:
        r10 = new java.lang.AssertionError;
        r10.<init>();
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.d(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a */
    private static boolean m14198a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0') {
                    break;
                } else if (charAt > '9') {
                    break;
                } else if (i6 == 0 && i != i5) {
                    return false;
                } else {
                    i6 = ((i6 * 10) + charAt) - 48;
                    if (i6 > 255) {
                        return false;
                    }
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            i = i4 + 1;
            bArr[i4] = (byte) i6;
            i4 = i;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m14188a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (i2 < bArr.length) {
            int i5 = i2;
            while (i5 < 16 && bArr[i5] == (byte) 0 && bArr[i5 + 1] == (byte) 0) {
                i5 += 2;
            }
            int i6 = i5 - i2;
            if (i6 > i3 && i6 >= 4) {
                i4 = i2;
                i3 = i6;
            }
            i2 = i5 + 2;
        }
        C4755c c4755c = new C4755c();
        while (i < bArr.length) {
            if (i == i4) {
                c4755c.m27503b(58);
                i += i3;
                if (i == 16) {
                    c4755c.m27503b(58);
                }
            } else {
                if (i > 0) {
                    c4755c.m27503b(58);
                }
                c4755c.m27535k((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return c4755c.mo4575p();
    }
}
