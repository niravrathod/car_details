package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.os.Bundle;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import com.cuvora.carinfo.models.homepage.Action;
import com.cuvora.carinfo.models.homepage.SectionTypeEnum;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.cuvora.carinfo.helpers.d */
public class C1540d {
    /* renamed from: a */
    private static FirebaseAnalytics f4669a;

    /* renamed from: a */
    public static void m5806a(Context context) {
        f4669a = FirebaseAnalytics.getInstance(context);
        f4669a.m12579a("app_version", String.valueOf(C1570t.m5994b(context)));
    }

    /* renamed from: a */
    public static void m5809a(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Search_Attempt", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Search Attempt").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: b */
    public static void m5817b(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("carBrandName", str);
            f4669a.m12578a("Brand_Clicked", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Car Brand Clicked").putCustomAttribute("carBrandName", str));
    }

    /* renamed from: a */
    public static void m5805a() {
        if (f4669a != null) {
            f4669a.m12578a("garage_opened", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("garage opened"));
    }

    /* renamed from: c */
    public static void m5822c(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Search_Successful", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Search Successful").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: d */
    public static void m5824d(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Search_unsuccessful_backend", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Search unsuccessful Backend").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: b */
    public static void m5815b() {
        if (f4669a != null) {
            f4669a.m12578a("Background_webview_success", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Background_webview_success"));
    }

    /* renamed from: c */
    public static void m5821c() {
        if (f4669a != null) {
            f4669a.m12578a("bluetooth_app_share", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("bluetooth_app_share"));
    }

    /* renamed from: d */
    public static void m5823d() {
        if (f4669a != null) {
            f4669a.m12578a("whatsapp_app_share", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("whatsapp_app_share"));
    }

    /* renamed from: e */
    public static void m5826e(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("successful_mayday", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("successful_mayday").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: e */
    public static void m5825e() {
        if (f4669a != null) {
            f4669a.m12578a("Background_webview_fail", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Background_webview_fail"));
    }

    /* renamed from: f */
    public static void m5827f() {
        if (f4669a != null) {
            f4669a.m12578a("webview_max_polling_error", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("webview_max_polling_error"));
    }

    /* renamed from: g */
    public static void m5829g() {
        if (f4669a != null) {
            f4669a.m12578a("webview_multiple_records_found", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("webview_multiple_records_found"));
    }

    /* renamed from: h */
    public static void m5831h() {
        if (f4669a != null) {
            f4669a.m12578a("Back_web_sucecess_incorrect_num", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Back web sucecess incorrect num"));
    }

    /* renamed from: f */
    public static void m5828f(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Search_Successful_WebView", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Search Successful WebView").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: i */
    public static void m5833i() {
        if (f4669a != null) {
            f4669a.m12578a("Recent_Search_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Recent Search clicked"));
    }

    /* renamed from: j */
    public static void m5835j() {
        if (f4669a != null) {
            f4669a.m12578a("Feedback_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Feedback clicked"));
    }

    /* renamed from: k */
    public static void m5837k() {
        if (f4669a != null) {
            f4669a.m12578a("About_us_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("About us clicked"));
    }

    /* renamed from: l */
    public static void m5839l() {
        if (f4669a != null) {
            f4669a.m12578a("Rate_app_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Rate app clicked"));
    }

    /* renamed from: m */
    public static void m5841m() {
        if (f4669a != null) {
            f4669a.m12578a("Share_vehicle_info_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Share vehicle info clicked"));
    }

    /* renamed from: n */
    public static void m5842n() {
        if (f4669a != null) {
            f4669a.m12578a("Trending_Search_clicked", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Trending Search clicked"));
    }

    /* renamed from: g */
    public static void m5830g(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Multiple_Registration_Details", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Multiple Registration Details").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: h */
    public static void m5832h(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("failed_vehicleNum", str);
            f4669a.m12578a("WebView_Open", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("WebView Open").putCustomAttribute("failed vehicleNum", str));
    }

    /* renamed from: a */
    public static void m5814a(boolean z) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("Clicked", z ? "Yes" : "No");
            f4669a.m12578a("Rating_popup", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Rating popup").putCustomAttribute("Clicked", (String) z ? "Yes" : "No"));
    }

    /* renamed from: i */
    public static void m5834i(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicleNum", str);
            f4669a.m12578a("Db_Referred", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Db Referred").putCustomAttribute("vehicleNum", str));
    }

    /* renamed from: o */
    public static void m5843o() {
        if (f4669a != null) {
            f4669a.m12578a("Web_view_result_scrape_success", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Web view result scrape success"));
    }

    /* renamed from: b */
    public static void m5816b(Context context) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("userId", C1570t.m6027l(context));
            f4669a.m12578a("unomer_permission_accepted", bundle);
        }
        Answers.getInstance().logCustom(new CustomEvent("Unomer permission accepted"));
    }

    /* renamed from: p */
    public static void m5844p() {
        if (f4669a != null) {
            f4669a.m12578a("reverse_search_item_click", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("Reverse Search Item Click"));
    }

    /* renamed from: a */
    public static void m5807a(Action action) {
        StringBuilder stringBuilder;
        String str = "";
        if (action.getInstantArticleData() != null) {
            str = action.getInstantArticleData().getTitle();
        } else if (action.getVideoData() != null) {
            str = action.getVideoData().getHeading();
        }
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            FirebaseAnalytics firebaseAnalytics = f4669a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("home_page_click_");
            stringBuilder.append(action.getType().name());
            firebaseAnalytics.m12578a(stringBuilder.toString(), bundle);
        }
        Answers instance = Answers.getInstance();
        stringBuilder = new StringBuilder();
        stringBuilder.append("home page click ");
        stringBuilder.append(action.getType().name());
        instance.logCustom((CustomEvent) new CustomEvent(stringBuilder.toString()).putCustomAttribute("title", str));
    }

    /* renamed from: a */
    public static void m5808a(SectionTypeEnum sectionTypeEnum) {
        if (f4669a != null) {
            FirebaseAnalytics firebaseAnalytics = f4669a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("home_page_click_");
            stringBuilder.append(sectionTypeEnum.name());
            firebaseAnalytics.m12578a(stringBuilder.toString(), null);
        }
        Answers instance = Answers.getInstance();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("home page click ");
        stringBuilder2.append(sectionTypeEnum.name());
        instance.logCustom(new CustomEvent(stringBuilder2.toString()));
    }

    /* renamed from: q */
    public static void m5845q() {
        if (f4669a != null) {
            f4669a.m12578a("vehicle_refresh_click", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("vehicle_refresh_click"));
    }

    /* renamed from: a */
    public static void m5810a(String str, int i) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("_");
            stringBuilder.append(i);
            bundle.putString("vehicleNum_scrapeCount", stringBuilder.toString());
            f4669a.m12578a("Successfully_Scrapped", bundle);
        }
        Answers instance = Answers.getInstance();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("_");
        stringBuilder2.append(i);
        instance.logCustom((CustomEvent) new CustomEvent("Successfully_Scrapped").putCustomAttribute("vehicleNum_scrapeCount", stringBuilder2.toString()));
    }

    /* renamed from: a */
    public static void m5811a(String str, String str2) {
        CustomEvent customEvent = new CustomEvent(Events.GoAdFree.name());
        customEvent.putCustomAttribute(str, str2);
        Answers.getInstance().logCustom(customEvent);
    }

    /* renamed from: b */
    public static void m5819b(String str, String str2) {
        CustomEvent customEvent = new CustomEvent(Events.DlSearch.name());
        customEvent.putCustomAttribute(str, str2);
        Answers.getInstance().logCustom(customEvent);
    }

    /* renamed from: a */
    public static void m5812a(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
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
        r2 = new com.crashlytics.android.answers.AddToCartEvent;
        r2.<init>();
        r2.putItemType(r0);
        r0 = java.lang.Long.parseLong(r1);	 Catch:{ Exception -> 0x0013 }
        r0 = java.math.BigDecimal.valueOf(r0);	 Catch:{ Exception -> 0x0013 }
        r2.putItemPrice(r0);	 Catch:{ Exception -> 0x0013 }
    L_0x0013:
        r0 = java.util.Locale.getDefault();
        r0 = java.util.Currency.getInstance(r0);
        r2.putCurrency(r0);
        r0 = com.crashlytics.android.answers.Answers.getInstance();
        r0.logAddToCart(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.d.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static void m5820b(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
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
        r0 = new com.crashlytics.android.answers.StartCheckoutEvent;
        r0.<init>();
        r1 = java.util.Locale.getDefault();
        r1 = java.util.Currency.getInstance(r1);
        r0.putCurrency(r1);
        r1 = 1;
        r0.putItemCount(r1);
        r1 = java.lang.Long.parseLong(r3);	 Catch:{ Exception -> 0x001f }
        r3 = java.math.BigDecimal.valueOf(r1);	 Catch:{ Exception -> 0x001f }
        r0.putTotalPrice(r3);	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r3 = "type";
        r0.putCustomAttribute(r3, r4);
        r3 = "cta";
        r0.putCustomAttribute(r3, r5);
        r3 = com.crashlytics.android.answers.Answers.getInstance();
        r3.logStartCheckout(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.d.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m5813a(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
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
        r0 = new com.crashlytics.android.answers.PurchaseEvent;
        r0.<init>();
        r1 = java.util.Locale.getDefault();
        r1 = java.util.Currency.getInstance(r1);
        r0.putCurrency(r1);
        r0.putItemId(r2);
        r0.putItemType(r3);
        r2 = java.lang.Long.parseLong(r4);	 Catch:{ Exception -> 0x0021 }
        r2 = java.math.BigDecimal.valueOf(r2);	 Catch:{ Exception -> 0x0021 }
        r0.putItemPrice(r2);	 Catch:{ Exception -> 0x0021 }
    L_0x0021:
        r0.putSuccess(r5);
        r2 = com.crashlytics.android.answers.Answers.getInstance();
        r2.logPurchase(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.d.a(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: r */
    public static void m5846r() {
        if (f4669a != null) {
            f4669a.m12578a("webview_load_error", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("webview_load_error"));
    }

    /* renamed from: s */
    public static void m5847s() {
        if (f4669a != null) {
            f4669a.m12578a("rate_us_lotte_click", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("rate_us_view_click"));
    }

    /* renamed from: j */
    public static void m5836j(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("vehicle_number", str);
            f4669a.m12578a("null_car_model_detail", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("null_car_model_detail").putCustomAttribute("vehicle_number", str));
    }

    /* renamed from: k */
    public static void m5838k(String str) {
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Tab_Selection").putCustomAttribute("Tab Name", str));
    }

    /* renamed from: b */
    public static void m5818b(String str, int i) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("version_name", str);
            bundle.putInt("version_code", i);
            f4669a.m12578a("app_upgraded", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) ((CustomEvent) new CustomEvent("app_upgraded").putCustomAttribute("version_name", str)).putCustomAttribute("version_code", (Number) Integer.valueOf(i)));
    }

    /* renamed from: t */
    public static void m5848t() {
        if (f4669a != null) {
            f4669a.m12578a("unified_ad_opened", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("unified_ad_opened"));
    }

    /* renamed from: l */
    public static void m5840l(String str) {
        if (f4669a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("state", str);
            f4669a.m12578a("unomer_callback", bundle);
        }
        Answers.getInstance().logCustom((CustomEvent) new CustomEvent("unomer_callback").putCustomAttribute("state", str));
    }

    /* renamed from: u */
    public static void m5849u() {
        if (f4669a != null) {
            f4669a.m12578a("native_ad_displayed", null);
        }
        Answers.getInstance().logCustom(new CustomEvent("native_ad_displayed"));
    }
}
