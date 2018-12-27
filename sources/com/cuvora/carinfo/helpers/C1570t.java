package com.cuvora.carinfo.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.support.v7.app.C4455c;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.android.billingclient.api.C1025g;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.loaders.C1580t;
import com.cuvora.carinfo.models.AdFreeSubscriptionModel;
import com.cuvora.carinfo.models.DlTemplateModel;
import com.cuvora.carinfo.models.GarageResult;
import com.cuvora.carinfo.models.RewardedVideoSubModel;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.cuvora.carinfo.models.homepage.Element;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import com.cuvora.carinfo.models.homepage.StateCityData;
import com.google.gson.p141b.C2624a;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import okhttp3.C2984u;
import okhttp3.C2991z;
import okhttp3.aa;
import okhttp3.internal.C2933c;
import okio.C4393d;
import okio.C4755c;
import okio.C4905m;
import okio.C4913j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.t */
public class C1570t {
    /* renamed from: a */
    private static String f4721a = "t";

    /* renamed from: com.cuvora.carinfo.helpers.t$1 */
    static class C37021 extends C2624a<Map<String, List<AdFreeSubscriptionModel>>> {
        C37021() {
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.t$2 */
    static class C37032 extends C2624a<RewardedVideoSubModel> {
        C37032() {
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.t$4 */
    static class C37044 extends C2624a<DlTemplateModel> {
        C37044() {
        }
    }

    /* renamed from: g */
    public static long m6020g() {
        return 567648000000L;
    }

    /* renamed from: a */
    public static void m5983a(Context context, View view) {
        if (context != null) {
            if (view != null) {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: a */
    public static String m5974a(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: b */
    public static java.lang.Integer m5994b(android.content.Context r2) {
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
        r0 = r2.getPackageManager();	 Catch:{ Exception -> 0x0014 }
        r2 = r2.getPackageName();	 Catch:{ Exception -> 0x0014 }
        r1 = 0;	 Catch:{ Exception -> 0x0014 }
        r2 = r0.getPackageInfo(r2, r1);	 Catch:{ Exception -> 0x0014 }
        r2 = r2.versionCode;	 Catch:{ Exception -> 0x0014 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0014 }
        goto L_0x0015;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.b(android.content.Context):java.lang.Integer");
    }

    /* renamed from: c */
    public static java.lang.String m6004c(android.content.Context r2) {
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
        r0 = r2.getPackageManager();	 Catch:{ Exception -> 0x0010 }
        r2 = r2.getPackageName();	 Catch:{ Exception -> 0x0010 }
        r1 = 0;	 Catch:{ Exception -> 0x0010 }
        r2 = r0.getPackageInfo(r2, r1);	 Catch:{ Exception -> 0x0010 }
        r2 = r2.versionName;	 Catch:{ Exception -> 0x0010 }
        goto L_0x0011;
    L_0x0010:
        r2 = 0;
    L_0x0011:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.c(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m5991a(String str) {
        if (str != null) {
            if (str.isEmpty() == null) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m5985a(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    /* renamed from: b */
    public static void m5997b(android.content.Context r4, java.lang.String r5) {
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
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "market://details?id=";
        r0.append(r1);
        r0.append(r5);
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
        r1 = new android.content.Intent;
        r2 = "android.intent.action.VIEW";
        r1.<init>(r2, r0);
        r0 = 1208483840; // 0x48080000 float:139264.0 double:5.97070349E-315;
        r1.addFlags(r0);
        r4.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0025 }
        goto L_0x0044;
    L_0x0025:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "http://play.google.com/store/apps/details?id=";
        r2.append(r3);
        r2.append(r5);
        r5 = r2.toString();
        r5 = android.net.Uri.parse(r5);
        r0.<init>(r1, r5);
        r4.startActivity(r0);
    L_0x0044:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.b(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public static void m6006c(android.content.Context r4, java.lang.String r5) {
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
        r0 = r4.getPackageManager();
        r0 = r0.getLaunchIntentForPackage(r5);
        if (r0 != 0) goto L_0x0029;
    L_0x000a:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r0.<init>(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "market://details?id=";
        r1.append(r2);
        r1.append(r5);
        r1 = r1.toString();
        r1 = android.net.Uri.parse(r1);
        r0.setData(r1);
    L_0x0029:
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r4.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0032 }
        goto L_0x0051;
    L_0x0032:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "http://play.google.com/store/apps/details?id=";
        r2.append(r3);
        r2.append(r5);
        r5 = r2.toString();
        r5 = android.net.Uri.parse(r5);
        r0.<init>(r1, r5);
        r4.startActivity(r0);
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.c(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m5986a(Context context, String str, String str2) {
        String y = C1570t.m6040y(context);
        if (str2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(y);
            stringBuilder.append("Licence number: ");
            stringBuilder.append(str2);
            stringBuilder.append("\n");
            y = stringBuilder.toString();
        }
        if (str != null) {
            str2 = new StringBuilder();
            str2.append(y);
            str2.append("Vehicle number: ");
            str2.append(str);
            str2.append("\n");
            y = str2.toString();
        }
        C1570t.m6007c(context, context.getResources().getString(R.string.contact_carinfo_for_error), y);
    }

    /* renamed from: d */
    public static void m6012d(Context context, String str) {
        C1570t.m6013d(context, C1570t.m6040y(context), str);
    }

    /* renamed from: d */
    private static void m6013d(Context context, String str, String str2) {
        String str3;
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            str3 = null;
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "contact@cuvora.com", null));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" ");
        stringBuilder.append(str3);
        intent.putExtra("android.intent.extra.SUBJECT", stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("\n\n\n\n");
        stringBuilder2.append(str);
        intent.putExtra("android.intent.extra.TEXT", stringBuilder2.toString());
        intent.addFlags(268435456);
        context.startActivity(Intent.createChooser(intent, "Send email using..."));
    }

    /* renamed from: b */
    public static void m5998b(Context context, String str, String str2) {
        String str3;
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            str3 = null;
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "contact@cuvora.com", null));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str3);
        intent.putExtra("android.intent.extra.SUBJECT", stringBuilder.toString());
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.addFlags(268435456);
        context.startActivity(Intent.createChooser(intent, "Send email using..."));
    }

    /* renamed from: y */
    private static String m6040y(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------------------------------\n");
        stringBuilder.append("Device model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("\n");
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("Android version: ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append("\n");
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("Device: ");
        stringBuilder.append(Build.DEVICE);
        stringBuilder.append("\n");
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("User Id: ");
        stringBuilder.append(C1570t.m6027l(context));
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static void m5978a(Activity activity) {
        Toast.makeText(activity, activity.getResources().getString(R.string.no_internet_connectivity), 0).show();
    }

    /* renamed from: d */
    public static int m6009d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("KEY_RATING_DIALOG_LOGIC_COUNT", 0);
    }

    /* renamed from: e */
    public static boolean m6016e(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("key_force_show_ads", false);
    }

    /* renamed from: a */
    public static void m5987a(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("key_force_show_ads", z).commit();
    }

    /* renamed from: a */
    public static void m5980a(Context context, int i) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("KEY_RATING_DIALOG_LOGIC_COUNT", C1570t.m6009d(context) + i).commit();
    }

    /* renamed from: a */
    public static int m5973a() {
        return C1541e.m5855b("ratingDialogActionCount").intValue();
    }

    /* renamed from: f */
    public static int m6017f(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("KEY_SEARCH_COUNT", 0);
    }

    /* renamed from: g */
    public static void m6021g(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("KEY_SEARCH_COUNT", C1570t.m6017f(context) + 1).commit();
    }

    /* renamed from: h */
    public static boolean m6023h(Context context) {
        if (C1570t.m6024i(context) && C1570t.m6032q(context) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m6024i(Context context) {
        return (!C1541e.m5856c("adsEnable") || C1541e.m5855b("adsVisibleAfterCount").intValue() > C1570t.m6017f(context)) ? null : true;
    }

    /* renamed from: c */
    public static void m6007c(Context context, String str, String str2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_custom_contact_carinfo, null);
        C0661a c0661a = new C0661a(context);
        c0661a.m2642b(inflate);
        final C4455c b = c0661a.m2645b();
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.tv_ok);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.tv_cancel);
        final EditText editText = (EditText) inflate.findViewById(R.id.et_message);
        final EditText editText2 = editText;
        final Context context2 = context;
        final String str3 = str;
        final String str4 = str2;
        final C4455c c4455c = b;
        appCompatTextView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                view = editText2.getText().toString();
                if (view.length() > 20) {
                    Context context = context2;
                    String str = str3;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(view);
                    stringBuilder.append("\n\n\n\n");
                    stringBuilder.append(str4 == null ? C1570t.m6040y(context2) : str4);
                    C1570t.m5998b(context, str, stringBuilder.toString());
                    c4455c.dismiss();
                    return;
                }
                editText2.setError(context2.getResources().getString(R.string.contact_carinfo_error));
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                editText.setError("");
            }
        });
        appCompatTextView2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                b.dismiss();
            }
        });
        b.show();
    }

    /* renamed from: j */
    public static String m6025j(Context context) {
        String str = "";
        if (context != null) {
            context = C1570t.m6026k(context);
            if (context != null) {
                str = context.getMobileNumber();
            }
        }
        return C1562q.m5947b(str) != null ? "" : str;
    }

    /* renamed from: k */
    public static com.cuvora.carinfo.models.GarageResult m6026k(android.content.Context r2) {
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
        r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2);
        r0 = "KEY_GARAGE_RESULT_JSON";
        r1 = 0;
        r2 = r2.getString(r0, r1);
        if (r2 == 0) goto L_0x002e;
    L_0x000d:
        r0 = com.cuvora.carinfo.helpers.C1545h.m5875a();	 Catch:{ JsonSyntaxException -> 0x001a }
        r1 = com.cuvora.carinfo.models.GarageResult.class;	 Catch:{ JsonSyntaxException -> 0x001a }
        r0 = r0.m12880a(r2, r1);	 Catch:{ JsonSyntaxException -> 0x001a }
        r0 = (com.cuvora.carinfo.models.GarageResult) r0;	 Catch:{ JsonSyntaxException -> 0x001a }
        return r0;
    L_0x001a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = " GSON JSON SYNTAX EXCEPTION - ";
        r0.append(r1);
        r0.append(r2);
        r2 = r0.toString();
        com.crashlytics.android.Crashlytics.log(r2);
    L_0x002e:
        r2 = new com.cuvora.carinfo.models.GarageResult;
        r2.<init>();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.k(android.content.Context):com.cuvora.carinfo.models.GarageResult");
    }

    /* renamed from: a */
    public static void m5984a(Context context, GarageResult garageResult) {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        context.edit().putString("KEY_GARAGE_RESULT_JSON", C1545h.m5875a().m12883a((Object) garageResult)).apply();
        context.edit().putString("KEY_USER_ID", garageResult.getUserId()).apply();
        context.edit().putString("KEY_USER_NAME", garageResult.getName()).apply();
        context.edit().putBoolean("KEY_GARAGE_UPDATED", true).apply();
    }

    /* renamed from: e */
    public static void m6015e(Context context, String str) {
        if (context != null) {
            GarageResult k = C1570t.m6026k(context);
            if (k == null) {
                k = new GarageResult();
            }
            k.setMobileNumber(str);
            k.setLastModifiedTime(System.currentTimeMillis());
            C1570t.m5984a(context, k);
        }
    }

    /* renamed from: b */
    public static boolean m6001b(String str) {
        return (C1562q.m5946a(str) && str.matches("[0-9]+") && str.length() == 10) ? true : null;
    }

    /* renamed from: b */
    public static void m5996b(Context context, View view) {
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public static int m5993b(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 1056964608);
    }

    /* renamed from: c */
    public static boolean m6008c(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }

    /* renamed from: b */
    public static int m5992b(Activity activity) {
        if (activity == null) {
            return -1;
        }
        activity = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        activity.getSize(point);
        return point.x;
    }

    /* renamed from: l */
    public static String m6027l(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("KEY_USER_ID", null);
    }

    /* renamed from: a */
    public static void m5979a(Activity activity, View view) {
        view.requestFocus();
        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(view, 1);
    }

    /* renamed from: c */
    public static void m6005c(Activity activity) {
        if (activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    /* renamed from: m */
    public static StateCityData m6028m(Context context) {
        return C1545h.m5889f(PreferenceManager.getDefaultSharedPreferences(context).getString("KEY_STATES_DATA", null));
    }

    /* renamed from: n */
    public static int[] m6029n(Context context) {
        int i;
        context = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT >= 17) {
            Point point = new Point();
            context.getSize(point);
            context = point.x;
            i = point.y;
        } else {
            int width = context.getWidth();
            i = context.getHeight();
            context = width;
        }
        return new int[]{context, i};
    }

    /* renamed from: f */
    public static void m6019f(Context context, String str) {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        if (context.getString("KEY_HOME_PAGE_DATA_JSON", null) != null) {
            context.edit().remove("KEY_HOME_PAGE_DATA_JSON").apply();
        }
        context.edit().putString("KEY_HOME_PAGE_TAB_DATA_JSON", str).apply();
    }

    /* renamed from: o */
    public static HomeTabData m6030o(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("KEY_HOME_PAGE_TAB_DATA_JSON", null);
        if (C1562q.m5946a(string)) {
            try {
                return C1545h.m5874a(context, new JSONObject(string));
            } catch (Context context2) {
                context2.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m5988a(aa aaVar) {
        if (aaVar != null && aaVar.m14017h() != null) {
            C2933c.m14194a(aaVar.m14017h());
        }
    }

    /* renamed from: d */
    public static Integer m6011d(String str) {
        try {
            if (str.length() > 4) {
                return Integer.valueOf(str.substring(str.length() - 4));
            }
        } catch (String str2) {
            str2.printStackTrace();
        }
        return null;
    }

    /* renamed from: p */
    public static String m6031p(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("KEY_USER_NAME", null);
        if (C1562q.m5947b(string)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("My Garage");
            stringBuilder.append(C1570t.m6041z(context));
            return stringBuilder.toString();
        } else if (string.contains(" ")) {
            r1 = new StringBuilder();
            r1.append(string.substring(0, string.indexOf(" ")));
            r1.append("'s Garage");
            r1.append(C1570t.m6041z(context));
            return r1.toString();
        } else {
            r1 = new StringBuilder();
            r1.append(string);
            r1.append("'s Garage");
            r1.append(C1570t.m6041z(context));
            return r1.toString();
        }
    }

    /* renamed from: z */
    private static String m6041z(Context context) {
        context = C1570t.m6026k(context);
        context = (context == null || context.getMyGarageVehicles() == null || context.getMyGarageVehicles().size() <= 0) ? null : context.getMyGarageVehicles().size();
        if (context == null) {
            return "";
        }
        if (context == 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" (");
            stringBuilder.append(context);
            stringBuilder.append(" Vehicle)");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(" (");
        stringBuilder.append(context);
        stringBuilder.append(" Vehicles)");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static JSONArray m5977a(List<C1025g> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    jSONArray.put(new JSONObject(((C1025g) list.get(i)).m4387f()));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static boolean m6002b(List<C1025g> list) {
        AdFreeSubscriptionModel d = C1570t.m6010d();
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (((C1025g) list.get(i)).m4383b().contains(d.baseProductId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m5981a(Context context, int i, List<C1025g> list) {
        if (i == 0) {
            new C1580t(context, "active_purchases", C1570t.m5977a((List) list)).execute(new Void[0]);
            C1570t.m5999b(context, C1570t.m6002b((List) list));
        }
    }

    /* renamed from: b */
    public static boolean m6000b() {
        return new Random().nextInt(100) < C1541e.m5855b("hairStrandThreshold").intValue();
    }

    /* renamed from: a */
    public static C2991z m5976a(final C2991z c2991z) {
        final Object c4755c = new C4755c();
        c2991z.mo912a(c4755c);
        return new C2991z() {
            /* renamed from: a */
            public C2984u mo911a() {
                return c2991z.mo911a();
            }

            /* renamed from: b */
            public long mo913b() {
                return c4755c.m27502b();
            }

            /* renamed from: a */
            public void mo912a(C4393d c4393d) {
                c4393d.mo4551b(c4755c.m27550v());
            }
        };
    }

    /* renamed from: b */
    public static C2991z m5995b(final C2991z c2991z) {
        return new C2991z() {
            /* renamed from: b */
            public long mo913b() {
                return -1;
            }

            /* renamed from: a */
            public C2984u mo911a() {
                return c2991z.mo911a();
            }

            /* renamed from: a */
            public void mo912a(C4393d c4393d) {
                c4393d = C4905m.a(new C4913j(c4393d));
                c2991z.mo912a(c4393d);
                c4393d.close();
            }
        };
    }

    /* renamed from: q */
    public static boolean m6032q(Context context) {
        if (C1570t.m6016e(context)) {
            return false;
        }
        if (!C1570t.m6033r(context) && C1570t.m5989a(C1570t.m6034s(context)) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5989a(long j) {
        return j > System.currentTimeMillis() ? 1 : 0;
    }

    /* renamed from: b */
    public static void m5999b(Context context, boolean z) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("KEY_AD_FREE_SUBSCRIBED", z).apply();
    }

    /* renamed from: r */
    public static boolean m6033r(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("KEY_AD_FREE_SUBSCRIBED", false);
    }

    /* renamed from: a */
    public static void m5982a(Context context, long j) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("rewarded_video_expiry_time", j).apply();
    }

    /* renamed from: s */
    public static long m6034s(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong("rewarded_video_expiry_time", 0);
    }

    /* renamed from: a */
    public static boolean m5990a(Element element) {
        return (element == null || element.getAction() == null || !(element.getAction().getType() == ActionTypeEnum.REWARDED || element.getAction().getType() == ActionTypeEnum.REWARDED_INAPP || element.getAction().getType() == ActionTypeEnum.INAPP)) ? null : true;
    }

    /* renamed from: c */
    public static long m6003c() {
        return (((long) (((C1570t.m6014e().validity * 24) * 60) * 60)) * 1000) + System.currentTimeMillis();
    }

    /* renamed from: d */
    public static AdFreeSubscriptionModel m6010d() {
        try {
            return (AdFreeSubscriptionModel) ((List) ((Map) C1541e.m5851a(new C37021().getType(), "inAppProducts")).get("go_ad_free_revised")).get(0);
        } catch (Exception e) {
            e.printStackTrace();
            AdFreeSubscriptionModel adFreeSubscriptionModel = new AdFreeSubscriptionModel();
            adFreeSubscriptionModel.productId = "sub.ad.free";
            adFreeSubscriptionModel.productDesc = "Get 100% Ad-Free experience forever at just ₹ 1.66 per month when you pay for a year.";
            adFreeSubscriptionModel.productCta = "Pay Now";
            adFreeSubscriptionModel.price = "10";
            adFreeSubscriptionModel.baseProductId = "sub.ad.free";
            return adFreeSubscriptionModel;
        }
    }

    /* renamed from: e */
    public static RewardedVideoSubModel m6014e() {
        try {
            return (RewardedVideoSubModel) C1541e.m5851a(new C37032().getType(), "rewardedVideoSubData");
        } catch (Exception e) {
            e.printStackTrace();
            return new RewardedVideoSubModel();
        }
    }

    /* renamed from: t */
    public static void m6035t(final android.content.Context r6) {
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
        r0 = r6.getPackageName();
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4.<init>();	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r5 = "market://details?id=";	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4.append(r5);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4.append(r0);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4 = r4.toString();	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4 = android.net.Uri.parse(r4);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2.<init>(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2.addFlags(r1);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r6.startActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2 = new android.os.Handler;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r3 = new com.cuvora.carinfo.helpers.t$3;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r3.<init>(r6);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r2.postDelayed(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        goto L_0x005a;
    L_0x0038:
        r2 = new android.content.Intent;
        r3 = "android.intent.action.VIEW";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "https://play.google.com/store/apps/details?id=";
        r4.append(r5);
        r4.append(r0);
        r0 = r4.toString();
        r0 = android.net.Uri.parse(r0);
        r2.<init>(r3, r0);
        r2.addFlags(r1);
        r6.startActivity(r2);
    L_0x005a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.t(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m5975a(GarageResult garageResult) {
        if (garageResult == null) {
            return "<No Name>";
        }
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence name = garageResult.getName();
        String mobileNumber = garageResult.getMobileNumber();
        garageResult = garageResult.getEmail();
        if (!TextUtils.isEmpty(name)) {
            stringBuilder.append(name);
        }
        if (!TextUtils.isEmpty(garageResult)) {
            if (TextUtils.isEmpty(name)) {
                stringBuilder.append(garageResult);
            } else {
                stringBuilder.append("  ● ");
                stringBuilder.append(garageResult);
                stringBuilder.append(" ● ");
            }
        }
        if (TextUtils.isEmpty(mobileNumber) == null) {
            if (stringBuilder.length() > null) {
                stringBuilder.append("\n");
                stringBuilder.append(mobileNumber);
            } else {
                stringBuilder.append(mobileNumber);
            }
        }
        if (stringBuilder.length() == null) {
            stringBuilder.append("<No Name>");
        }
        return stringBuilder.toString();
    }

    /* renamed from: u */
    public static void m6036u(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("prem_user_show_welcome_dialog", true).apply();
    }

    /* renamed from: v */
    public static void m6037v(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("prem_user_show_welcome_dialog", false).apply();
    }

    /* renamed from: w */
    public static boolean m6038w(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("prem_user_show_welcome_dialog", false);
    }

    /* renamed from: f */
    public static com.cuvora.carinfo.models.DlTemplateModel m6018f() {
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
        r0 = new com.cuvora.carinfo.helpers.t$4;	 Catch:{ Exception -> 0x0012 }
        r0.<init>();	 Catch:{ Exception -> 0x0012 }
        r0 = r0.getType();	 Catch:{ Exception -> 0x0012 }
        r1 = "dlTemplateData";	 Catch:{ Exception -> 0x0012 }
        r0 = com.cuvora.carinfo.helpers.C1541e.m5851a(r0, r1);	 Catch:{ Exception -> 0x0012 }
        r0 = (com.cuvora.carinfo.models.DlTemplateModel) r0;	 Catch:{ Exception -> 0x0012 }
        return r0;
    L_0x0012:
        r0 = new com.cuvora.carinfo.models.DlTemplateModel;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.t.f():com.cuvora.carinfo.models.DlTemplateModel");
    }

    /* renamed from: g */
    public static void m6022g(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("sections_data", str).apply();
    }
}
