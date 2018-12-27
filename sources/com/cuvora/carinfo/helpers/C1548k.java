package com.cuvora.carinfo.helpers;

import android.os.Bundle;

/* renamed from: com.cuvora.carinfo.helpers.k */
public class C1548k {
    /* renamed from: a */
    public static void m5918a(android.app.Activity r5, android.os.Bundle r6) {
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
        r0 = "appLink";
        r0 = r6.containsKey(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x0008:
        r0 = "appLink";
        r6 = r6.getString(r0);
        r0 = com.cuvora.carinfo.helpers.C1562q.m5946a(r6);
        if (r0 == 0) goto L_0x0027;
    L_0x0014:
        r6 = android.net.Uri.parse(r6);
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r0.<init>(r1, r6);
        r6 = 1208483840; // 0x48080000 float:139264.0 double:5.97070349E-315;
        r0.addFlags(r6);
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0027 }
    L_0x0027:
        return;
    L_0x0028:
        r0 = "deepLink";
        r0 = r6.containsKey(r0);
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2 = 0;
        if (r0 == 0) goto L_0x0182;
    L_0x0033:
        r0 = "deepLink";
        r0 = r6.getString(r0);
        r3 = com.cuvora.carinfo.helpers.C1562q.m5946a(r0);
        if (r3 == 0) goto L_0x0182;
    L_0x003f:
        r3 = "carinfo://searchNumber";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0066;
    L_0x0047:
        r6 = "/";
        r6 = r0.split(r6);
        r0 = r6.length;
        r0 = r0 + -1;
        r6 = r6[r0];
        r0 = com.cuvora.carinfo.helpers.C1562q.m5946a(r6);
        if (r0 == 0) goto L_0x0182;
    L_0x0058:
        r2 = new android.content.Intent;
        r0 = com.cuvora.carinfo.SearchActivity.class;
        r2.<init>(r5, r0);
        r0 = "KEY_VEHICLE_NUMBER";
        r2.putExtra(r0, r6);
        goto L_0x0182;
    L_0x0066:
        r3 = "carinfo://openTrending";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0087;
    L_0x006e:
        r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r5);
        r0 = "KEY_TRENDING_SEARCH_RESULT_JSON";
        r6 = r6.getString(r0, r2);
        r6 = com.cuvora.carinfo.helpers.C1562q.m5946a(r6);
        if (r6 == 0) goto L_0x0182;
    L_0x007e:
        r2 = new android.content.Intent;
        r6 = com.cuvora.carinfo.TrendingSearchActivity.class;
        r2.<init>(r5, r6);
        goto L_0x0182;
    L_0x0087:
        r3 = "carinfo://webview";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00b8;
    L_0x008f:
        r3 = "webview_url";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x00b8;
    L_0x0097:
        r2 = new android.content.Intent;
        r0 = com.cuvora.carinfo.GenericWebViewActivity.class;
        r2.<init>(r5, r0);
        r0 = "KEY_WEB_VIEW_URL";
        r3 = "webview_url";
        r3 = r6.getString(r3);
        r2.putExtra(r0, r3);
        r0 = "KEY_WEB_VIEW_TITLE";
        r3 = "webview_title";
        r4 = "Car info";
        r6 = r6.getString(r3, r4);
        r2.putExtra(r0, r6);
        goto L_0x0182;
    L_0x00b8:
        r3 = "carinfo://playVideo";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00d6;
    L_0x00c0:
        r3 = "videoId";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x00d6;
    L_0x00c8:
        r0 = com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity.f21911n;
        r2 = "videoId";
        r6 = r6.getString(r2);
        r2 = r0.m6122a(r5, r6);
        goto L_0x0182;
    L_0x00d6:
        r3 = "carinfo://vehicleResult";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0101;
    L_0x00de:
        r3 = "payload";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x0101;
    L_0x00e6:
        r0 = "payload";
        r6 = r6.getString(r0);
        r6 = com.cuvora.carinfo.helpers.C1545h.m5871a(r6);
        if (r6 == 0) goto L_0x0182;
    L_0x00f2:
        r0 = new android.content.Intent;
        r2 = com.cuvora.carinfo.VehicleInfoActivity.class;
        r0.<init>(r5, r2);
        r2 = "KEY_VEHICLE_INFO";
        r0.putExtra(r2, r6);
        r2 = r0;
        goto L_0x0182;
    L_0x0101:
        r3 = "carinfo://car/variant";
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0173;
    L_0x0109:
        r0 = android.support.v4.app.ad.m1156a(r5);
        r3 = "brand_id";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x0136;
    L_0x0115:
        r3 = "brand_id";
        r3 = r6.getString(r3);
        r3 = com.cuvora.carinfo.helpers.C1562q.m5946a(r3);
        if (r3 == 0) goto L_0x0136;
    L_0x0121:
        r2 = new android.content.Intent;
        r3 = com.cuvora.carinfo.CarListParticularBrandActivity.class;
        r2.<init>(r5, r3);
        r3 = "KEY_BRAND_ID";
        r4 = "brand_id";
        r4 = r6.getString(r4);
        r2.putExtra(r3, r4);
        r0.m1163b(r2);
    L_0x0136:
        r3 = "model_id";
        r3 = r6.containsKey(r3);
        if (r3 == 0) goto L_0x015f;
    L_0x013e:
        r3 = "model_id";
        r3 = r6.getString(r3);
        r3 = com.cuvora.carinfo.helpers.C1562q.m5946a(r3);
        if (r3 == 0) goto L_0x015f;
    L_0x014a:
        r2 = new android.content.Intent;
        r3 = com.cuvora.carinfo.CarDetailActivity.class;
        r2.<init>(r5, r3);
        r3 = "KEY_MODEL_ID";
        r4 = "model_id";
        r6 = r6.getString(r4);
        r2.putExtra(r3, r6);
        r0.m1161a(r2);
    L_0x015f:
        if (r2 != 0) goto L_0x016f;
    L_0x0161:
        r6 = new android.content.Intent;
        r0 = com.cuvora.carinfo.activity.HomePageActivity.class;
        r6.<init>(r5, r0);
        r6.addFlags(r1);
        r5.startActivity(r6);
        goto L_0x0172;
    L_0x016f:
        r0.m1164b();
    L_0x0172:
        return;
    L_0x0173:
        r6 = "carinfo://cars";
        r6 = r0.contains(r6);
        if (r6 == 0) goto L_0x0182;
    L_0x017b:
        r2 = new android.content.Intent;
        r6 = com.cuvora.carinfo.CarsBrandsActivity.class;
        r2.<init>(r5, r6);
    L_0x0182:
        if (r2 != 0) goto L_0x0192;
    L_0x0184:
        r6 = new android.content.Intent;
        r0 = com.cuvora.carinfo.activity.HomePageActivity.class;
        r6.<init>(r5, r0);
        r6.addFlags(r1);
        r5.startActivity(r6);
        goto L_0x01a0;
    L_0x0192:
        r5 = android.support.v4.app.ad.m1156a(r5);
        r6 = r5.m1163b(r2);
        r6.m1164b();
        r5.m1164b();
    L_0x01a0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.k.a(android.app.Activity, android.os.Bundle):void");
    }

    /* renamed from: a */
    public static boolean m5919a(Bundle bundle) {
        return "no".equalsIgnoreCase(bundle.getString("initApiCalls")) != null ? null : true;
    }
}
