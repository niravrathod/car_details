package com.facebook.ads.internal.p101q.p104c;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.ads.internal.p084c.C1770b;
import com.facebook.ads.internal.p088g.C1800b;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p097p.p098a.C1856a;
import com.facebook.ads.internal.settings.C1964b;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.q.c.d */
public class C1948d {
    /* renamed from: a */
    private static String f5976a;
    /* renamed from: b */
    private static final Set<String> f5977b = new HashSet(1);
    /* renamed from: c */
    private static final Set<String> f5978c = new HashSet(2);

    /* renamed from: com.facebook.ads.internal.q.c.d$a */
    public enum C1947a {
        UNKNOWN(0),
        NONE(0),
        MOBILE_INTERNET(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        MOBILE_4G(4);
        
        /* renamed from: g */
        public final int f5975g;

        private C1947a(int i) {
            this.f5975g = i;
        }
    }

    static {
        f5977b.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f5978c.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f5978c.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f5978c.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f5978c.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    /* renamed from: a */
    public static C1856a m7354a(Context context) {
        return C1948d.m7355a(context, true);
    }

    /* renamed from: a */
    public static C1856a m7355a(Context context, boolean z) {
        C1856a c1856a = new C1856a();
        C1948d.m7357a(context, c1856a, z);
        return c1856a;
    }

    /* renamed from: a */
    private static String m7356a(Context context, String str, String str2) {
        Class cls = Class.forName(str);
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class, Class.forName(str2)});
        declaredConstructor.setAccessible(true);
        try {
            String str3 = (String) cls.getMethod("getUserAgentString", new Class[0]).invoke(declaredConstructor.newInstance(new Object[]{context, null}), new Object[0]);
            return str3;
        } finally {
            declaredConstructor.setAccessible(false);
        }
    }

    /* renamed from: a */
    private static void m7357a(Context context, C1856a c1856a, boolean z) {
        C1800b c1800b = new C1800b(context);
        c1856a.m7101c(30000);
        c1856a.m7099b(3);
        if (C1820a.m6857l(context)) {
            c1856a.m7084a("X-FB-Pool-Routing-Token", C1770b.f5345b);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1948d.m7362c(context, z));
        stringBuilder.append(" [FBAN/AudienceNetworkForAndroid;FBSN/");
        stringBuilder.append("Android");
        stringBuilder.append(";FBSV/");
        stringBuilder.append(C1800b.f5433a);
        stringBuilder.append(";FBAB/");
        stringBuilder.append(c1800b.m6778f());
        stringBuilder.append(";FBAV/");
        stringBuilder.append(c1800b.m6779g());
        stringBuilder.append(";FBBV/");
        stringBuilder.append(c1800b.m6780h());
        stringBuilder.append(";FBVS/");
        stringBuilder.append("4.99.0");
        stringBuilder.append(";FBLC/");
        stringBuilder.append(Locale.getDefault().toString());
        stringBuilder.append("]");
        c1856a.m7084a("user-agent", stringBuilder.toString());
    }

    /* renamed from: a */
    public static boolean m7358a() {
        Object b = C1964b.m7436b();
        return !TextUtils.isEmpty(b) && b.endsWith(".sb");
    }

    /* renamed from: b */
    public static C1856a m7359b(Context context) {
        return C1948d.m7360b(context, true);
    }

    /* renamed from: b */
    public static C1856a m7360b(Context context, boolean z) {
        C1856a c1856a = new C1856a();
        C1948d.m7357a(context, c1856a, z);
        if (!C1948d.m7358a()) {
            c1856a.m7100b(f5978c);
            c1856a.m7093a(f5977b);
        }
        return c1856a;
    }

    /* renamed from: c */
    public static C1947a m7361c(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return C1947a.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() != 0) {
                    return C1947a.MOBILE_INTERNET;
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return C1947a.MOBILE_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return C1947a.MOBILE_3G;
                    case 13:
                        return C1947a.MOBILE_4G;
                    default:
                        return C1947a.UNKNOWN;
                }
            }
        }
        return C1947a.NONE;
    }

    /* renamed from: c */
    private static java.lang.String m7362c(android.content.Context r2, boolean r3) {
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
        if (r2 != 0) goto L_0x0005;
    L_0x0002:
        r2 = "Unknown";
        return r2;
    L_0x0005:
        if (r3 == 0) goto L_0x000e;
    L_0x0007:
        r2 = "http.agent";
        r2 = java.lang.System.getProperty(r2);
        return r2;
    L_0x000e:
        r3 = f5976a;
        if (r3 == 0) goto L_0x0015;
    L_0x0012:
        r2 = f5976a;
        return r2;
    L_0x0015:
        r3 = com.facebook.ads.internal.p101q.p104c.C1948d.class;
        monitor-enter(r3);
        r0 = f5976a;	 Catch:{ all -> 0x0060 }
        if (r0 == 0) goto L_0x0020;	 Catch:{ all -> 0x0060 }
    L_0x001c:
        r2 = f5976a;	 Catch:{ all -> 0x0060 }
        monitor-exit(r3);	 Catch:{ all -> 0x0060 }
        return r2;	 Catch:{ all -> 0x0060 }
    L_0x0020:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0060 }
        r1 = 17;
        if (r0 < r1) goto L_0x0030;
    L_0x0026:
        r0 = com.facebook.ads.internal.p101q.p104c.C1948d.m7363d(r2);	 Catch:{ Exception -> 0x0030 }
        f5976a = r0;	 Catch:{ Exception -> 0x0030 }
        r0 = f5976a;	 Catch:{ Exception -> 0x0030 }
        monitor-exit(r3);	 Catch:{ all -> 0x0060 }
        return r0;
    L_0x0030:
        r0 = "android.webkit.WebSettings";	 Catch:{ Exception -> 0x003b }
        r1 = "android.webkit.WebView";	 Catch:{ Exception -> 0x003b }
        r0 = com.facebook.ads.internal.p101q.p104c.C1948d.m7356a(r2, r0, r1);	 Catch:{ Exception -> 0x003b }
        f5976a = r0;	 Catch:{ Exception -> 0x003b }
        goto L_0x005c;
    L_0x003b:
        r0 = "android.webkit.WebSettingsClassic";	 Catch:{ Exception -> 0x0046 }
        r1 = "android.webkit.WebViewClassic";	 Catch:{ Exception -> 0x0046 }
        r0 = com.facebook.ads.internal.p101q.p104c.C1948d.m7356a(r2, r0, r1);	 Catch:{ Exception -> 0x0046 }
        f5976a = r0;	 Catch:{ Exception -> 0x0046 }
        goto L_0x005c;
    L_0x0046:
        r0 = new android.webkit.WebView;	 Catch:{ all -> 0x0060 }
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x0060 }
        r0.<init>(r2);	 Catch:{ all -> 0x0060 }
        r2 = r0.getSettings();	 Catch:{ all -> 0x0060 }
        r2 = r2.getUserAgentString();	 Catch:{ all -> 0x0060 }
        f5976a = r2;	 Catch:{ all -> 0x0060 }
        r0.destroy();	 Catch:{ all -> 0x0060 }
    L_0x005c:
        monitor-exit(r3);	 Catch:{ all -> 0x0060 }
        r2 = f5976a;
        return r2;
    L_0x0060:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0060 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.q.c.d.c(android.content.Context, boolean):java.lang.String");
    }

    @TargetApi(17)
    /* renamed from: d */
    private static String m7363d(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
