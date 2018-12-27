package com.cuvora.carinfo.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.cuvora.carinfo.helpers.c */
public class C1539c {
    /* renamed from: a */
    public static long f4661a = 1000;
    /* renamed from: b */
    public static long f4662b = (f4661a * 60);
    /* renamed from: c */
    public static long f4663c = (f4662b * 60);
    /* renamed from: d */
    public static long f4664d = (f4663c * 24);
    /* renamed from: e */
    public static int f4665e = 86400;
    /* renamed from: f */
    public static int f4666f = (f4665e * 30);
    /* renamed from: g */
    public static final long f4667g = f4668h.getTime();
    /* renamed from: h */
    public static final Date f4668h;

    static {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        f4668h = instance.getTime();
    }

    /* renamed from: a */
    public static java.util.Date m5804a(java.lang.String r2, java.lang.String r3) {
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
        if (r3 == 0) goto L_0x0021;
    L_0x0003:
        r1 = "";
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0021;
    L_0x000b:
        if (r2 == 0) goto L_0x0021;
    L_0x000d:
        r1 = "";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0021;
    L_0x0015:
        r1 = new java.text.SimpleDateFormat;
        r1.<init>(r2);
        r2 = r1.parse(r3);	 Catch:{ ParseException -> 0x0020, IllegalArgumentException -> 0x001f }
        goto L_0x0022;
    L_0x001f:
        return r0;
    L_0x0020:
        return r0;
    L_0x0021:
        r2 = r0;
    L_0x0022:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.c.a(java.lang.String, java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public static String m5803a(Date date, String str) {
        if (!(date == null || str == null)) {
            if (!"".equals(str)) {
                return new SimpleDateFormat(str).format(date);
            }
        }
        return null;
    }
}
