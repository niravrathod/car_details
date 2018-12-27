package com.crashlytics.android.core;

import java.util.regex.Pattern;

final class af {
    /* renamed from: a */
    private static final Pattern f4243a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    /* renamed from: a */
    public static com.crashlytics.android.core.ae m5472a(java.lang.String r11) {
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
        r0 = f4243a;
        r0 = r0.matcher(r11);
        r1 = r0.matches();
        r2 = 0;
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r1 = 1;
        r1 = r0.group(r1);	 Catch:{ Exception -> 0x003e }
        r3 = 16;	 Catch:{ Exception -> 0x003e }
        r1 = java.lang.Long.valueOf(r1, r3);	 Catch:{ Exception -> 0x003e }
        r5 = r1.longValue();	 Catch:{ Exception -> 0x003e }
        r1 = 2;	 Catch:{ Exception -> 0x003e }
        r1 = r0.group(r1);	 Catch:{ Exception -> 0x003e }
        r1 = java.lang.Long.valueOf(r1, r3);	 Catch:{ Exception -> 0x003e }
        r3 = r1.longValue();	 Catch:{ Exception -> 0x003e }
        r1 = 0;	 Catch:{ Exception -> 0x003e }
        r7 = r3 - r5;	 Catch:{ Exception -> 0x003e }
        r1 = 3;	 Catch:{ Exception -> 0x003e }
        r9 = r0.group(r1);	 Catch:{ Exception -> 0x003e }
        r1 = 4;	 Catch:{ Exception -> 0x003e }
        r10 = r0.group(r1);	 Catch:{ Exception -> 0x003e }
        r0 = new com.crashlytics.android.core.ae;	 Catch:{ Exception -> 0x003e }
        r4 = r0;	 Catch:{ Exception -> 0x003e }
        r4.<init>(r5, r7, r9, r10);	 Catch:{ Exception -> 0x003e }
        return r0;
    L_0x003e:
        r0 = io.fabric.sdk.android.C2766c.m13524h();
        r1 = "CrashlyticsCore";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Could not parse map entry: ";
        r3.append(r4);
        r3.append(r11);
        r11 = r3.toString();
        r0.mo3554a(r1, r11);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.af.a(java.lang.String):com.crashlytics.android.core.ae");
    }
}
