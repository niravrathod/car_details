package com.cuvora.carinfo.p070c;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.c.b */
public final class C1472b {
    /* renamed from: a */
    public static final java.lang.String m5718a(java.lang.String r7) {
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
        r0 = "$receiver";
        kotlin.jvm.internal.C2885g.m13910b(r7, r0);
        r1 = r7;	 Catch:{ Exception -> 0x0059 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ Exception -> 0x0059 }
        r0 = " ";	 Catch:{ Exception -> 0x0059 }
        r2 = new java.lang.String[]{r0};	 Catch:{ Exception -> 0x0059 }
        r3 = 0;	 Catch:{ Exception -> 0x0059 }
        r4 = 0;	 Catch:{ Exception -> 0x0059 }
        r5 = 6;	 Catch:{ Exception -> 0x0059 }
        r6 = 0;	 Catch:{ Exception -> 0x0059 }
        r0 = kotlin.text.C4886o.m30239b(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0059 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0059 }
        r1.<init>();	 Catch:{ Exception -> 0x0059 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ Exception -> 0x0059 }
        r0 = r0.iterator();	 Catch:{ Exception -> 0x0059 }
    L_0x0021:
        r2 = r0.hasNext();	 Catch:{ Exception -> 0x0059 }
        if (r2 == 0) goto L_0x003a;	 Catch:{ Exception -> 0x0059 }
    L_0x0027:
        r2 = r0.next();	 Catch:{ Exception -> 0x0059 }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x0059 }
        r2 = com.cuvora.carinfo.p070c.C1472b.m5719b(r2);	 Catch:{ Exception -> 0x0059 }
        r1.append(r2);	 Catch:{ Exception -> 0x0059 }
        r2 = " ";	 Catch:{ Exception -> 0x0059 }
        r1.append(r2);	 Catch:{ Exception -> 0x0059 }
        goto L_0x0021;	 Catch:{ Exception -> 0x0059 }
    L_0x003a:
        r0 = r1.toString();	 Catch:{ Exception -> 0x0059 }
        r1 = "stringBuilder.toString()";	 Catch:{ Exception -> 0x0059 }
        kotlin.jvm.internal.C2885g.m13907a(r0, r1);	 Catch:{ Exception -> 0x0059 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x0059 }
    L_0x0045:
        r0 = (java.lang.CharSequence) r0;	 Catch:{ Exception -> 0x0059 }
        r0 = kotlin.text.C4886o.m30237b(r0);	 Catch:{ Exception -> 0x0059 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0059 }
        r7 = r0;	 Catch:{ Exception -> 0x0059 }
        goto L_0x0059;	 Catch:{ Exception -> 0x0059 }
    L_0x0051:
        r0 = new kotlin.TypeCastException;	 Catch:{ Exception -> 0x0059 }
        r1 = "null cannot be cast to non-null type kotlin.CharSequence";	 Catch:{ Exception -> 0x0059 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0059 }
        throw r0;	 Catch:{ Exception -> 0x0059 }
    L_0x0059:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.c.b.a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static final String m5719b(String str) {
        C2885g.m13910b(str, "$receiver");
        if (str.length() <= 0) {
            return str;
        }
        if (str.length() == 1) {
            Object toUpperCase = str.toUpperCase();
            C2885g.m13907a(toUpperCase, "(this as java.lang.String).toUpperCase()");
            return toUpperCase;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object substring = str.substring(0, 1);
        C2885g.m13907a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            substring = substring.toUpperCase();
            C2885g.m13907a(substring, "(this as java.lang.String).toUpperCase()");
            stringBuilder.append(substring);
            toUpperCase = str.substring(1);
            C2885g.m13907a(toUpperCase, "(this as java.lang.String).substring(startIndex)");
            if (toUpperCase != null) {
                toUpperCase = toUpperCase.toLowerCase();
                C2885g.m13907a(toUpperCase, "(this as java.lang.String).toLowerCase()");
                stringBuilder.append(toUpperCase);
                return stringBuilder.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
