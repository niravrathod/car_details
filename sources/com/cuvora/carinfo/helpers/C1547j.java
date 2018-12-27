package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;

/* renamed from: com.cuvora.carinfo.helpers.j */
public class C1547j {
    /* renamed from: a */
    private static Context f4686a;

    /* renamed from: a */
    public String m5915a() {
        return "https";
    }

    /* renamed from: b */
    public String m5916b() {
        return "cuvora.com";
    }

    /* renamed from: a */
    public static void m5910a(Context context) {
        f4686a = context;
    }

    /* renamed from: b */
    public String m5917b(Context context) {
        if (context != null) {
            context = PreferenceManager.getDefaultSharedPreferences(context).getString("KEY_PREFIX", null);
            if (C1562q.m5946a(context)) {
                return context;
            }
        }
        context = new StringBuilder();
        context.append(m5915a());
        context.append("://");
        context.append(m5916b());
        return context.toString();
    }

    /* renamed from: c */
    public static C1547j m5912c() {
        return new C1547j();
    }

    /* renamed from: c */
    public static NetworkInfo m5911c(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: d */
    public static boolean m5914d(Context context) {
        context = C1547j.m5911c(context);
        return (context == null || context.isConnected() == null) ? null : true;
    }

    /* renamed from: d */
    public static boolean m5913d() {
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
        r0 = 0;
        r1 = f4686a;	 Catch:{ Exception -> 0x0011 }
        r1 = com.cuvora.carinfo.helpers.C1547j.m5911c(r1);	 Catch:{ Exception -> 0x0011 }
        if (r1 == 0) goto L_0x0010;	 Catch:{ Exception -> 0x0011 }
    L_0x0009:
        r1 = r1.isConnected();	 Catch:{ Exception -> 0x0011 }
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
    L_0x0011:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.j.d():boolean");
    }
}
