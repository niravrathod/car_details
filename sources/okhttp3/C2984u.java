package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: okhttp3.u */
public final class C2984u {
    /* renamed from: a */
    private static final Pattern f12602a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* renamed from: b */
    private static final Pattern f12603b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    /* renamed from: c */
    private final String f12604c;
    /* renamed from: d */
    private final String f12605d;
    /* renamed from: e */
    private final String f12606e;
    @Nullable
    /* renamed from: f */
    private final String f12607f;

    private C2984u(String str, String str2, String str3, @Nullable String str4) {
        this.f12604c = str;
        this.f12605d = str2;
        this.f12606e = str3;
        this.f12607f = str4;
    }

    @Nullable
    /* renamed from: a */
    public static C2984u m14560a(String str) {
        Matcher matcher = f12602a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
        String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f12603b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null) {
                if (group.equalsIgnoreCase("charset")) {
                    group = matcher2.group(2);
                    if (group == null) {
                        group = matcher2.group(3);
                    } else if (group.startsWith("'") && group.endsWith("'") && group.length() > 2) {
                        group = group.substring(1, group.length() - 1);
                    }
                    if (str2 != null && !group.equalsIgnoreCase(str2)) {
                        return null;
                    }
                    str2 = group;
                }
            }
        }
        return new C2984u(str, toLowerCase, toLowerCase2, str2);
    }

    /* renamed from: a */
    public String m14561a() {
        return this.f12605d;
    }

    @Nullable
    /* renamed from: b */
    public Charset m14563b() {
        return m14562a(null);
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    public java.nio.charset.Charset m14562a(@javax.annotation.Nullable java.nio.charset.Charset r2) {
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
        r1 = this;
        r0 = r1.f12607f;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r0 == 0) goto L_0x000b;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x0004:
        r0 = r1.f12607f;	 Catch:{ IllegalArgumentException -> 0x000c }
        r0 = java.nio.charset.Charset.forName(r0);	 Catch:{ IllegalArgumentException -> 0x000c }
        r2 = r0;
    L_0x000b:
        return r2;
    L_0x000c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.u.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public String toString() {
        return this.f12604c;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof C2984u) || ((C2984u) obj).f12604c.equals(this.f12604c) == null) ? null : true;
    }

    public int hashCode() {
        return this.f12604c.hashCode();
    }
}
