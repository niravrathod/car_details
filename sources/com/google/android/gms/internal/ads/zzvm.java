package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final /* synthetic */ class zzvm {
    /* renamed from: a */
    public static void m11151a(zzvl zzvl, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzvl.mo4786a(str, jSONObject.toString());
    }

    /* renamed from: a */
    public static void m11149a(zzvl zzvl, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(str2);
        stringBuilder.append(");");
        zzvl.mo2749b(stringBuilder.toString());
    }

    /* renamed from: b */
    public static void m11152b(zzvl zzvl, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject);
        stringBuilder.append(");");
        str = "Dispatching AFMA event: ";
        jSONObject = String.valueOf(stringBuilder.toString());
        zzaok.m10001b(jSONObject.length() != 0 ? str.concat(jSONObject) : new String(str));
        zzvl.mo2749b(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m11150a(com.google.android.gms.internal.ads.zzvl r1, java.lang.String r2, java.util.Map r3) {
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
        r0 = com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ JSONException -> 0x000c }
        r3 = r0.m9833a(r3);	 Catch:{ JSONException -> 0x000c }
        r1.mo2748a(r2, r3);
        return;
    L_0x000c:
        r1 = "Could not convert parameters to JSON.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvm.a(com.google.android.gms.internal.ads.zzvl, java.lang.String, java.util.Map):void");
    }
}
