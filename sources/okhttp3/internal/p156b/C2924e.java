package okhttp3.internal.p156b;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import okhttp3.C2971l;
import okhttp3.C2973m;
import okhttp3.C2981s;
import okhttp3.C2981s.C2980a;
import okhttp3.C2990y;
import okhttp3.HttpUrl;
import okhttp3.aa;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.internal.b.e */
public final class C2924e {
    /* renamed from: a */
    private static final Pattern f12345a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    /* renamed from: a */
    public static long m14155a(aa aaVar) {
        return C2924e.m14156a(aaVar.m14016g());
    }

    /* renamed from: a */
    public static long m14156a(C2981s c2981s) {
        return C2924e.m14154a(c2981s.m14548a("Content-Length"));
    }

    /* renamed from: a */
    private static long m14154a(java.lang.String r4) {
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
        r0 = -1;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x000a }
        return r2;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.e.a(java.lang.String):long");
    }

    /* renamed from: a */
    public static boolean m14159a(aa aaVar, C2981s c2981s, C2990y c2990y) {
        for (String str : C2924e.m14166e(aaVar)) {
            if (!C2933c.m14197a(c2981s.m14550b(str), c2990y.m14625b(str))) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m14161b(aa aaVar) {
        return C2924e.m14162b(aaVar.m14016g());
    }

    /* renamed from: b */
    public static boolean m14162b(C2981s c2981s) {
        return C2924e.m14163c(c2981s).contains("*");
    }

    /* renamed from: e */
    private static Set<String> m14166e(aa aaVar) {
        return C2924e.m14163c(aaVar.m14016g());
    }

    /* renamed from: c */
    public static Set<String> m14163c(C2981s c2981s) {
        Set<String> emptySet = Collections.emptySet();
        int a = c2981s.m14546a();
        Set<String> set = emptySet;
        for (int i = 0; i < a; i++) {
            if ("Vary".equalsIgnoreCase(c2981s.m14547a(i))) {
                String b = c2981s.m14549b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: c */
    public static C2981s m14164c(aa aaVar) {
        return C2924e.m14157a(aaVar.m14019j().m14010a().m14626c(), aaVar.m14016g());
    }

    /* renamed from: a */
    public static C2981s m14157a(C2981s c2981s, C2981s c2981s2) {
        c2981s2 = C2924e.m14163c(c2981s2);
        if (c2981s2.isEmpty()) {
            return new C2980a().m14539a();
        }
        C2980a c2980a = new C2980a();
        int a = c2981s.m14546a();
        for (int i = 0; i < a; i++) {
            String a2 = c2981s.m14547a(i);
            if (c2981s2.contains(a2)) {
                c2980a.m14538a(a2, c2981s.m14549b(i));
            }
        }
        return c2980a.m14539a();
    }

    /* renamed from: a */
    public static void m14158a(C2973m c2973m, HttpUrl httpUrl, C2981s c2981s) {
        if (c2973m != C2973m.f12583a) {
            c2981s = C2971l.m14476a(httpUrl, c2981s);
            if (!c2981s.isEmpty()) {
                c2973m.mo3676a(httpUrl, c2981s);
            }
        }
    }

    /* renamed from: d */
    public static boolean m14165d(aa aaVar) {
        if (aaVar.m14010a().m14624b().equals("HEAD")) {
            return false;
        }
        int c = aaVar.m14012c();
        if (((c >= 100 && c < 200) || c == 204 || c == 304) && C2924e.m14155a(aaVar) == -1) {
            if ("chunked".equalsIgnoreCase(aaVar.m14008a("Transfer-Encoding")) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m14153a(String str, int i, String str2) {
        while (i < str.length()) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m14152a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m14160b(java.lang.String r3, int r4) {
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
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x000f;
    L_0x000b:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        return r3;
    L_0x000f:
        r3 = 0;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x0017;
    L_0x0015:
        r3 = 0;
        return r3;
    L_0x0017:
        r3 = (int) r0;
        return r3;
    L_0x0019:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.e.b(java.lang.String, int):int");
    }
}
