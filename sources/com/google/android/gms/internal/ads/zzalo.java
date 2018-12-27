package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzaer
public final class zzalo {
    /* renamed from: a */
    public static final Handler f8872a = new zzalh(Looper.getMainLooper());
    /* renamed from: b */
    private final Object f8873b = new Object();
    /* renamed from: c */
    private boolean f8874c = true;
    @GuardedBy("mLock")
    /* renamed from: d */
    private String f8875d;
    /* renamed from: e */
    private boolean f8876e = false;
    /* renamed from: f */
    private boolean f8877f = false;
    @GuardedBy("this")
    /* renamed from: g */
    private Pattern f8878g;
    @GuardedBy("this")
    /* renamed from: h */
    private Pattern f8879h;

    /* renamed from: a */
    public final void m9836a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m9840b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m9799a(Context context) {
        context = zzaht.m9573a(context);
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        boolean z = false;
        try {
            context = context.getPackageManager().resolveActivity(intent, 65536);
            if (context != null) {
                if (context.activityInfo != null) {
                    boolean z2;
                    String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                    if ((context.activityInfo.configChanges & 16) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"keyboard"}));
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if ((context.activityInfo.configChanges & 32) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"keyboardHidden"}));
                        z2 = false;
                    }
                    if ((context.activityInfo.configChanges & 128) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"orientation"}));
                        z2 = false;
                    }
                    if ((context.activityInfo.configChanges & 256) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"screenLayout"}));
                        z2 = false;
                    }
                    if ((context.activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"uiMode"}));
                        z2 = false;
                    }
                    if ((context.activityInfo.configChanges & 1024) == 0) {
                        zzaok.m10007e(String.format(str, new Object[]{"screenSize"}));
                        z2 = false;
                    }
                    if ((context.activityInfo.configChanges & 2048) == null) {
                        zzaok.m10007e(String.format(str, new Object[]{"smallestScreenSize"}));
                    } else {
                        z = z2;
                    }
                    return z;
                }
            }
            zzaok.m10007e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return z;
        } catch (Throwable e) {
            zzaok.m10004c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            zzbv.zzeo().m9714a(e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9800a(Context context, String str) {
        context = zzaht.m9573a(context);
        return Wrappers.packageManager(context).checkPermission(str, context.getPackageName()) == null ? true : null;
    }

    /* renamed from: a */
    public static void m9792a(Context context, String str, List<String> list) {
        for (String zzano : list) {
            new zzano(context, str, zzano).mo2219c();
        }
    }

    /* renamed from: a */
    public static void m9791a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m9792a(context, str, arrayList);
    }

    /* renamed from: a */
    public final void m9837a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(zzbhv.m10460a(activity))) {
                if (list == null) {
                    zzalg.m21225a("Cannot ping urls: empty list.");
                } else if (zzot.m21793a(context)) {
                    zzot zzot = new zzot();
                    zzot.m21797a(new de(this, list, zzot, context));
                    zzot.m21799b(activity);
                } else {
                    zzalg.m21225a("Cannot ping url because custom tabs is not supported");
                }
            }
        }
    }

    /* renamed from: a */
    public static String m9784a(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public final boolean m9842b(Context context) {
        if (this.f8876e) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new di(), intentFilter);
        this.f8876e = true;
        return true;
    }

    /* renamed from: c */
    public final boolean m9844c(Context context) {
        if (this.f8877f) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new dh(), intentFilter);
        this.f8877f = true;
        return true;
    }

    /* renamed from: a */
    public final void m9834a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m9840b(context, str));
    }

    /* renamed from: d */
    private static String m9814d() {
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuilder.append(" ");
            stringBuilder.append(VERSION.RELEASE);
        }
        stringBuilder.append("; ");
        stringBuilder.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuilder.append("; ");
            stringBuilder.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuilder.append(" Build/");
                stringBuilder.append(Build.DISPLAY);
            }
        }
        stringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final java.lang.String m9840b(android.content.Context r5, java.lang.String r6) {
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
        r4 = this;
        r0 = r4.f8873b;
        monitor-enter(r0);
        r1 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x00d2 }
    L_0x0007:
        r5 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x000b:
        if (r6 != 0) goto L_0x0013;	 Catch:{ all -> 0x00d2 }
    L_0x000d:
        r5 = m9814d();	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;
    L_0x0013:
        r1 = com.google.android.gms.ads.internal.zzbv.zzem();	 Catch:{ Exception -> 0x001d }
        r1 = r1.mo4992a(r5);	 Catch:{ Exception -> 0x001d }
        r4.f8875d = r1;	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        r1 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x00d2 }
    L_0x0025:
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x00d2 }
        r1 = com.google.android.gms.internal.ads.zzaoa.m9965b();	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x0068;	 Catch:{ all -> 0x00d2 }
    L_0x002e:
        r1 = 0;	 Catch:{ all -> 0x00d2 }
        r4.f8875d = r1;	 Catch:{ all -> 0x00d2 }
        r1 = f8872a;	 Catch:{ all -> 0x00d2 }
        r2 = new com.google.android.gms.internal.ads.df;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x00d2 }
        r1.post(r2);	 Catch:{ all -> 0x00d2 }
    L_0x003b:
        r1 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x006e;
    L_0x003f:
        r1 = r4.f8873b;	 Catch:{ InterruptedException -> 0x0045 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0045 }
        goto L_0x003b;
    L_0x0045:
        r1 = m9814d();	 Catch:{ all -> 0x00d2 }
        r4.f8875d = r1;	 Catch:{ all -> 0x00d2 }
        r1 = "Interrupted, use default user agent: ";	 Catch:{ all -> 0x00d2 }
        r2 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00d2 }
        r3 = r2.length();	 Catch:{ all -> 0x00d2 }
        if (r3 == 0) goto L_0x005e;	 Catch:{ all -> 0x00d2 }
    L_0x0059:
        r1 = r1.concat(r2);	 Catch:{ all -> 0x00d2 }
        goto L_0x0064;	 Catch:{ all -> 0x00d2 }
    L_0x005e:
        r2 = new java.lang.String;	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        r1 = r2;	 Catch:{ all -> 0x00d2 }
    L_0x0064:
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x003b;	 Catch:{ all -> 0x00d2 }
    L_0x0068:
        r1 = m9815d(r5);	 Catch:{ all -> 0x00d2 }
        r4.f8875d = r1;	 Catch:{ all -> 0x00d2 }
    L_0x006e:
        r1 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d2 }
        r2 = r2.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + 10;	 Catch:{ all -> 0x00d2 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00d2 }
        r3 = r3.length();	 Catch:{ all -> 0x00d2 }
        r2 = r2 + r3;	 Catch:{ all -> 0x00d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r3.<init>(r2);	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r1 = " (Mobile; ";	 Catch:{ all -> 0x00d2 }
        r3.append(r1);	 Catch:{ all -> 0x00d2 }
        r3.append(r6);	 Catch:{ all -> 0x00d2 }
        r6 = r3.toString();	 Catch:{ all -> 0x00d2 }
        r4.f8875d = r6;	 Catch:{ all -> 0x00d2 }
        r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5);	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.isCallerInstantApp();	 Catch:{ Exception -> 0x00b6 }
        if (r5 == 0) goto L_0x00c0;	 Catch:{ Exception -> 0x00b6 }
    L_0x00a7:
        r5 = r4.f8875d;	 Catch:{ Exception -> 0x00b6 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ Exception -> 0x00b6 }
        r6 = ";aia";	 Catch:{ Exception -> 0x00b6 }
        r5 = r5.concat(r6);	 Catch:{ Exception -> 0x00b6 }
        r4.f8875d = r5;	 Catch:{ Exception -> 0x00b6 }
        goto L_0x00c0;
    L_0x00b6:
        r5 = move-exception;
        r6 = com.google.android.gms.ads.internal.zzbv.zzeo();	 Catch:{ all -> 0x00d2 }
        r1 = "AdUtil.getUserAgent";	 Catch:{ all -> 0x00d2 }
        r6.m9714a(r5, r1);	 Catch:{ all -> 0x00d2 }
    L_0x00c0:
        r5 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00d2 }
        r6 = ")";	 Catch:{ all -> 0x00d2 }
        r5 = r5.concat(r6);	 Catch:{ all -> 0x00d2 }
        r4.f8875d = r5;	 Catch:{ all -> 0x00d2 }
        r5 = r4.f8875d;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        return r5;	 Catch:{ all -> 0x00d2 }
    L_0x00d2:
        r5 = move-exception;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d2 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.b(android.content.Context, java.lang.String):java.lang.String");
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: d */
    protected static java.lang.String m9815d(android.content.Context r1) {
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
        r0 = new android.webkit.WebView;	 Catch:{ Throwable -> 0x000e }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x000e }
        r1 = r0.getSettings();	 Catch:{ Throwable -> 0x000e }
        r1 = r1.getUserAgentString();	 Catch:{ Throwable -> 0x000e }
        return r1;
    L_0x000e:
        r1 = m9814d();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.d(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m9785a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public final JSONObject m9833a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m9796a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (Map<String, ?> map2) {
            String str2 = "Could not convert map to JSON: ";
            map2 = String.valueOf(map2.getMessage());
            throw new JSONException(map2.length() != 0 ? str2.concat(map2) : new String(str2));
        }
    }

    /* renamed from: a */
    public final JSONObject m9832a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m9788a(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("Error converting Bundle to JSON", bundle2);
            return null;
        }
    }

    /* renamed from: a */
    private final JSONObject m9788a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m9796a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONArray m9787a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m9795a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m9795a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m9788a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m9833a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m9787a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m9795a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m9796a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m9788a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m9833a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m9787a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m9787a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m9786a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Map hashMap = new HashMap();
        for (String str : zzbv.zzem().mo4177a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m9781a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static int m9803b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (String str2) {
            str2 = String.valueOf(str2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 22);
            stringBuilder.append("Could not parse value:");
            stringBuilder.append(str2);
            zzaok.m10007e(stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static String m9805b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private static int[] m9818e() {
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public static int[] m9802a(Activity activity) {
        activity = activity.getWindow();
        if (activity == null || activity.findViewById(16908290) == null) {
            return m9818e();
        }
        return new int[]{activity.findViewById(16908290).getWidth(), activity.findViewById(16908290).getHeight()};
    }

    /* renamed from: b */
    public final int[] m9843b(Activity activity) {
        int[] a = m9802a(activity);
        r1 = new int[2];
        zzkd.m10709a();
        r1[0] = zzaoa.m9962b((Context) activity, a[0]);
        zzkd.m10709a();
        r1[1] = zzaoa.m9962b((Context) activity, a[1]);
        return r1;
    }

    /* renamed from: c */
    public final int[] m9845c(Activity activity) {
        Window window = activity.getWindow();
        int[] e = (window == null || window.findViewById(16908290) == null) ? m9818e() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r0 = new int[2];
        zzkd.m10709a();
        r0[0] = zzaoa.m9962b((Context) activity, e[0]);
        zzkd.m10709a();
        r0[1] = zzaoa.m9962b((Context) activity, e[1]);
        return r0;
    }

    /* renamed from: c */
    public static boolean m9812c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: a */
    public static DisplayMetrics m9777a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: e */
    public static Builder m9816e(Context context) {
        return new Builder(context);
    }

    /* renamed from: f */
    public static zznh m9820f(Context context) {
        return new zznh(context);
    }

    /* renamed from: a */
    public static Bitmap m9775a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static PopupWindow m9779a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: p */
    private static java.lang.String m9829p(android.content.Context r2) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Exception -> 0x002d }
        r2 = r2.getSystemService(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 != 0) goto L_0x000c;	 Catch:{ Exception -> 0x002d }
    L_0x000b:
        return r0;	 Catch:{ Exception -> 0x002d }
    L_0x000c:
        r1 = 1;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getRunningTasks(r1);	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0013:
        r1 = r2.isEmpty();	 Catch:{ Exception -> 0x002d }
        if (r1 != 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0019:
        r1 = 0;	 Catch:{ Exception -> 0x002d }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x002d }
        r2 = (android.app.ActivityManager.RunningTaskInfo) r2;	 Catch:{ Exception -> 0x002d }
        if (r2 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0022:
        r1 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x002d }
    L_0x0026:
        r2 = r2.topActivity;	 Catch:{ Exception -> 0x002d }
        r2 = r2.getClassName();	 Catch:{ Exception -> 0x002d }
        return r2;
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.p(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public static String m9782a(Context context, View view, zzjo zzjo) {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.aa)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzjo.f20231e);
            jSONObject2.put("height", zzjo.f20228b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m9829p(context));
            if (zzjo.f20230d == null) {
                context = new JSONArray();
                while (view != null) {
                    zzjo = view.getParent();
                    if (zzjo != null) {
                        int i = -1;
                        if (zzjo instanceof ViewGroup) {
                            i = ((ViewGroup) zzjo).indexOfChild(view);
                        }
                        view = new JSONObject();
                        view.put("type", zzjo.getClass().getName());
                        view.put("index_of_child", i);
                        context.put(view);
                    }
                    view = (zzjo == null || (zzjo instanceof View) == null) ? null : (View) zzjo;
                }
                if (context.length() > null) {
                    jSONObject.put("parents", context);
                }
            }
            return jSONObject.toString();
        } catch (Context context2) {
            zzaok.m10004c("Fail to get view hierarchy json", context2);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m9822g(android.content.Context r6) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Throwable -> 0x004b }
        r1 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x004b }
        r1 = (android.app.ActivityManager) r1;	 Catch:{ Throwable -> 0x004b }
        r2 = "keyguard";	 Catch:{ Throwable -> 0x004b }
        r2 = r6.getSystemService(r2);	 Catch:{ Throwable -> 0x004b }
        r2 = (android.app.KeyguardManager) r2;	 Catch:{ Throwable -> 0x004b }
        if (r1 == 0) goto L_0x004a;	 Catch:{ Throwable -> 0x004b }
    L_0x0013:
        if (r2 != 0) goto L_0x0016;	 Catch:{ Throwable -> 0x004b }
    L_0x0015:
        goto L_0x004a;	 Catch:{ Throwable -> 0x004b }
    L_0x0016:
        r1 = r1.getRunningAppProcesses();	 Catch:{ Throwable -> 0x004b }
        if (r1 != 0) goto L_0x001d;	 Catch:{ Throwable -> 0x004b }
    L_0x001c:
        return r0;	 Catch:{ Throwable -> 0x004b }
    L_0x001d:
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x0021:
        r3 = r1.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r3 == 0) goto L_0x0049;	 Catch:{ Throwable -> 0x004b }
    L_0x0027:
        r3 = r1.next();	 Catch:{ Throwable -> 0x004b }
        r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3;	 Catch:{ Throwable -> 0x004b }
        r4 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x004b }
        r5 = r3.pid;	 Catch:{ Throwable -> 0x004b }
        if (r4 != r5) goto L_0x0021;	 Catch:{ Throwable -> 0x004b }
    L_0x0035:
        r1 = r3.importance;	 Catch:{ Throwable -> 0x004b }
        r3 = 100;	 Catch:{ Throwable -> 0x004b }
        if (r1 != r3) goto L_0x0049;	 Catch:{ Throwable -> 0x004b }
    L_0x003b:
        r1 = r2.inKeyguardRestrictedInputMode();	 Catch:{ Throwable -> 0x004b }
        if (r1 != 0) goto L_0x0049;	 Catch:{ Throwable -> 0x004b }
    L_0x0041:
        r6 = m9830q(r6);	 Catch:{ Throwable -> 0x004b }
        if (r6 == 0) goto L_0x0049;
    L_0x0047:
        r6 = 1;
        return r6;
    L_0x0049:
        return r0;
    L_0x004a:
        return r0;
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.g(android.content.Context):boolean");
    }

    /* renamed from: h */
    public static boolean m9823h(android.content.Context r6) {
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
        r0 = 0;
        r1 = "activity";	 Catch:{ Throwable -> 0x004b }
        r1 = r6.getSystemService(r1);	 Catch:{ Throwable -> 0x004b }
        r1 = (android.app.ActivityManager) r1;	 Catch:{ Throwable -> 0x004b }
        r2 = "keyguard";	 Catch:{ Throwable -> 0x004b }
        r2 = r6.getSystemService(r2);	 Catch:{ Throwable -> 0x004b }
        r2 = (android.app.KeyguardManager) r2;	 Catch:{ Throwable -> 0x004b }
        if (r1 == 0) goto L_0x004a;	 Catch:{ Throwable -> 0x004b }
    L_0x0013:
        if (r2 != 0) goto L_0x0016;	 Catch:{ Throwable -> 0x004b }
    L_0x0015:
        goto L_0x004a;	 Catch:{ Throwable -> 0x004b }
    L_0x0016:
        r1 = r1.getRunningAppProcesses();	 Catch:{ Throwable -> 0x004b }
        if (r1 != 0) goto L_0x001d;	 Catch:{ Throwable -> 0x004b }
    L_0x001c:
        return r0;	 Catch:{ Throwable -> 0x004b }
    L_0x001d:
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x004b }
    L_0x0021:
        r3 = r1.hasNext();	 Catch:{ Throwable -> 0x004b }
        if (r3 == 0) goto L_0x0048;	 Catch:{ Throwable -> 0x004b }
    L_0x0027:
        r3 = r1.next();	 Catch:{ Throwable -> 0x004b }
        r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3;	 Catch:{ Throwable -> 0x004b }
        r4 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x004b }
        r5 = r3.pid;	 Catch:{ Throwable -> 0x004b }
        if (r4 != r5) goto L_0x0021;	 Catch:{ Throwable -> 0x004b }
    L_0x0035:
        r1 = r3.importance;	 Catch:{ Throwable -> 0x004b }
        r3 = 100;	 Catch:{ Throwable -> 0x004b }
        if (r1 != r3) goto L_0x0048;	 Catch:{ Throwable -> 0x004b }
    L_0x003b:
        r1 = r2.inKeyguardRestrictedInputMode();	 Catch:{ Throwable -> 0x004b }
        if (r1 != 0) goto L_0x0048;	 Catch:{ Throwable -> 0x004b }
    L_0x0041:
        r6 = m9830q(r6);	 Catch:{ Throwable -> 0x004b }
        if (r6 == 0) goto L_0x0048;
    L_0x0047:
        return r0;
    L_0x0048:
        r6 = 1;
        return r6;
    L_0x004a:
        return r0;
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.h(android.content.Context):boolean");
    }

    /* renamed from: q */
    private static boolean m9830q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return null;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    public final void m9835a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            zzbv.zzek();
            bundle.putString("device", m9805b());
            bundle.putString("eids", TextUtils.join(",", zznw.m10900a()));
        }
        zzkd.m10709a();
        zzaoa.m9958a(context, str, str2, bundle, z, new dg(this, context, str));
    }

    /* renamed from: b */
    public final void m9841b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aX)).booleanValue()) {
            m9835a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: a */
    public static void m9794a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzalm.m9772a(runnable);
        }
    }

    /* renamed from: b */
    public static Bitmap m9804b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m9819f(view);
        if (f == null) {
            f = m9817e(view);
        }
        return f;
    }

    /* renamed from: e */
    private static Bitmap m9817e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzaok.m10007e("Width or height of view is zero");
            return null;
        } catch (View view2) {
            zzaok.m10002b("Fail to capture the webview", view2);
            return null;
        }
    }

    /* renamed from: f */
    private static Bitmap m9819f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (View view2) {
            zzaok.m10002b("Fail to capture the web view", view2);
        }
        return bitmap;
    }

    /* renamed from: i */
    public static Bitmap m9824i(Context context) {
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            context = ((Activity) context).getWindow();
            if (context != null) {
                bitmap = m9819f(context.getDecorView().getRootView());
            }
        } catch (Context context2) {
            zzaok.m10002b("Fail to capture screen shot", context2);
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m9789a(android.content.Context r1, android.content.Intent r2) {
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
        r1.startActivity(r2);	 Catch:{ Throwable -> 0x0004 }
        return;
    L_0x0004:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2.addFlags(r0);
        r1.startActivity(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.a(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: j */
    public static int m9825j(Context context) {
        context = context.getApplicationInfo();
        if (context == null) {
            return null;
        }
        return context.targetSdkVersion;
    }

    /* renamed from: a */
    public final boolean m9838a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m9839a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m9831r(context));
    }

    /* renamed from: r */
    private static KeyguardManager m9831r(Context context) {
        context = context.getSystemService("keyguard");
        return (context == null || !(context instanceof KeyguardManager)) ? null : (KeyguardManager) context;
    }

    /* renamed from: a */
    public final boolean m9839a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        if (!zzbv.zzek().f8874c) {
            if (keyguardManager == null) {
                keyguardManager = null;
            } else {
                keyguardManager = keyguardManager.inKeyguardRestrictedInputMode();
            }
            if (keyguardManager != null) {
                if (m9811c(view) == null) {
                    keyguardManager = null;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if (powerManager != null) {
                            if (powerManager.isScreenOn() != null) {
                                powerManager = null;
                                if (!(powerManager == null || r6 == null)) {
                                    if (!(((Boolean) zzkd.m10713e().m10897a(zznw.aU)).booleanValue() == null && view.getLocalVisibleRect(new Rect()) == null && view.getGlobalVisibleRect(new Rect()) == null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        powerManager = true;
                        if (((Boolean) zzkd.m10713e().m10897a(zznw.aU)).booleanValue() == null) {
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        keyguardManager = true;
        if (powerManager != null) {
            if (powerManager.isScreenOn() != null) {
                powerManager = null;
                if (((Boolean) zzkd.m10713e().m10897a(zznw.aU)).booleanValue() == null) {
                }
                return true;
            }
        }
        powerManager = true;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.aU)).booleanValue() == null) {
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m9811c(View view) {
        view = view.getRootView();
        LayoutParams layoutParams = null;
        if (view != null) {
            view = view.getContext();
            if (view instanceof Activity) {
                view = (Activity) view;
                if (view == null) {
                    return false;
                }
                view = view.getWindow();
                if (view == null) {
                    layoutParams = view.getAttributes();
                }
                if (layoutParams != null || (layoutParams.flags & 524288) == null) {
                    return false;
                }
                return true;
            }
        }
        view = null;
        if (view == null) {
            return false;
        }
        view = view.getWindow();
        if (view == null) {
            layoutParams = view.getAttributes();
        }
        if (layoutParams != null) {
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: k */
    public static boolean m9826k(Context context) {
        if (context != null) {
            if (PlatformVersion.isAtLeastJellyBean()) {
                context = m9831r(context);
                if (context == null || context.isKeyguardLocked() == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static int m9813d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: l */
    public static boolean m9827l(android.content.Context r3) {
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
        r0 = 0;
        r3 = r3.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r1 = "com.google.android.gms.ads.internal.ClientApi";	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        r3.loadClass(r1);	 Catch:{ ClassNotFoundException -> 0x001b, Throwable -> 0x000b }
        return r0;
    L_0x000b:
        r3 = move-exception;
        r1 = "Error loading class.";
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r3);
        r1 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r2 = "AdUtil.isLiteSdk";
        r1.m9714a(r3, r2);
        return r0;
    L_0x001b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.l(android.content.Context):boolean");
    }

    /* renamed from: c */
    public static Bundle m9808c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.f9677B)).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            Runtime runtime = Runtime.getRuntime();
            bundle.putLong("runtime_free_memory", runtime.freeMemory());
            bundle.putLong("runtime_max_memory", runtime.maxMemory());
            bundle.putLong("runtime_total_memory", runtime.totalMemory());
            bundle.putInt("web_view_count", zzbv.zzeo().m9725j());
        } catch (Throwable e) {
            zzaok.m10004c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m9790a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m9806b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            context = uri.toString();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(context).length() + 26);
            stringBuilder.append("Opening ");
            stringBuilder.append(context);
            stringBuilder.append(" in a new browser.");
            zzaok.m10001b(stringBuilder.toString());
        } catch (Context context2) {
            zzaok.m10002b("No browser is found.", context2);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m9806b(Context context, Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m9807b(Context context, String str, String str2) {
        try {
            context = context.openFileOutput(str, 0);
            context.write(str2.getBytes("UTF-8"));
            context.close();
        } catch (Context context2) {
            zzaok.m10002b("Error writing to file in internal storage.", context2);
        }
    }

    /* renamed from: c */
    public static java.lang.String m9810c(android.content.Context r1, java.lang.String r2) {
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
        r1 = r1.openFileInput(r2);	 Catch:{ IOException -> 0x0011 }
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x0011 }
        r0 = 1;	 Catch:{ IOException -> 0x0011 }
        r1 = com.google.android.gms.common.util.IOUtils.readInputStreamFully(r1, r0);	 Catch:{ IOException -> 0x0011 }
        r0 = "UTF-8";	 Catch:{ IOException -> 0x0011 }
        r2.<init>(r1, r0);	 Catch:{ IOException -> 0x0011 }
        return r2;
    L_0x0011:
        r1 = "Error reading from internal storage.";
        com.google.android.gms.internal.ads.zzaok.m10001b(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.c(android.content.Context, java.lang.String):java.lang.String");
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m9798a(Activity activity, Configuration configuration) {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.co)).booleanValue()) {
            return activity.isInMultiWindowMode() == null;
        } else {
            zzkd.m10709a();
            int a = zzaoa.m9952a((Context) activity, configuration.screenHeightDp);
            int a2 = zzaoa.m9952a((Context) activity, configuration.screenWidthDp);
            DisplayMetrics a3 = m9777a((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = a3.heightPixels;
            int i2 = a3.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            identifier = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = (double) activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzkd.m10713e().m10897a(zznw.cl)).intValue();
            return m9797a(i, a + identifier, round) && m9797a(i2, a2, round) != null;
        }
    }

    /* renamed from: d */
    public final boolean m9846d(java.lang.String r4) {
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
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.f8878g;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.ads.zznw.ac;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0043 }
        r0 = r2.m10897a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.f8878g;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.ads.zznw.ac;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0043 }
        r0 = r2.m10897a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.f8878g = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.f8878g;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final boolean m9847e(java.lang.String r4) {
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
        r3 = this;
        r0 = android.text.TextUtils.isEmpty(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        monitor-enter(r3);	 Catch:{ PatternSyntaxException -> 0x0046 }
        r0 = r3.f8879h;	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0043 }
    L_0x000d:
        r0 = com.google.android.gms.internal.ads.zznw.ad;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0043 }
        r0 = r2.m10897a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r2 = r3.f8879h;	 Catch:{ all -> 0x0043 }
        r2 = r2.pattern();	 Catch:{ all -> 0x0043 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ all -> 0x0043 }
    L_0x0025:
        r0 = com.google.android.gms.internal.ads.zznw.ad;	 Catch:{ all -> 0x0043 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0043 }
        r0 = r2.m10897a(r0);	 Catch:{ all -> 0x0043 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0043 }
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ all -> 0x0043 }
        r3.f8879h = r0;	 Catch:{ all -> 0x0043 }
    L_0x0037:
        r0 = r3.f8879h;	 Catch:{ all -> 0x0043 }
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x0043 }
        r4 = r4.matches();	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        return r4;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r4 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);	 Catch:{ all -> 0x0043 }
        throw r4;	 Catch:{ PatternSyntaxException -> 0x0046 }
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.e(java.lang.String):boolean");
    }

    @VisibleForTesting
    /* renamed from: a */
    private static boolean m9797a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static Bundle m9776a(zzgn zzgn) {
        if (zzgn == null) {
            return null;
        }
        if (zzbv.zzeo().m9726k().mo2344b() && zzbv.zzeo().m9726k().mo2350d()) {
            return null;
        }
        String b;
        String c;
        if (zzgn.m10643d()) {
            zzgn.m10642c();
        }
        zzgn = zzgn.m10641b();
        if (zzgn != null) {
            b = zzgn.m10616b();
            c = zzgn.m10618c();
            zzgn = zzgn.m10619d();
            if (b != null) {
                zzbv.zzeo().m9726k().mo2336a(b);
            }
            if (zzgn != null) {
                zzbv.zzeo().m9726k().mo2342b((String) zzgn);
            }
        } else {
            b = zzbv.zzeo().m9726k().mo2345c();
            zzgn = zzbv.zzeo().m9726k().mo2351e();
            c = null;
        }
        Bundle bundle = new Bundle(1);
        if (!(zzgn == null || zzbv.zzeo().m9726k().mo2350d())) {
            bundle.putString("v_fp_vertical", zzgn);
        }
        if (b != null && zzbv.zzeo().m9726k().mo2344b() == null) {
            bundle.putString("fingerprint", b);
            if (b.equals(c) == null) {
                bundle.putString("v_fp", c);
            }
        }
        if (bundle.isEmpty() == null) {
            return bundle;
        }
        return null;
    }

    /* renamed from: c */
    public static WebResourceResponse m9809c(Context context, String str, String str2) {
        try {
            Map hashMap = new HashMap();
            hashMap.put("User-Agent", zzbv.zzek().m9840b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzamz(context).m9920a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (Context context2) {
            zzaok.m10004c("Could not fetch MRAID JS.", context2);
        }
        return null;
    }

    /* renamed from: a */
    public static WebResourceResponse m9778a(HttpURLConnection httpURLConnection) {
        String str;
        zzbv.zzek();
        Object contentType = httpURLConnection.getContentType();
        if (TextUtils.isEmpty(contentType)) {
            str = "";
        } else {
            str = contentType.split(";")[0].trim();
        }
        String str2 = str;
        zzbv.zzek();
        contentType = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType)) {
            String[] split = contentType.split(";");
            if (split.length != 1) {
                for (int i = 1; i < split.length; i++) {
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split(SimpleComparison.EQUAL_TO_OPERATION);
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                }
            }
        }
        str = "";
        String str3 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        Map hashMap = new HashMap(headerFields.size());
        for (Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzbv.zzem().mo5045a(str2, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static void m9793a(android.content.Context r3, java.lang.Throwable r4) {
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
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = 0;
        r1 = com.google.android.gms.internal.ads.zznw.f9704c;	 Catch:{ IllegalStateException -> 0x0015 }
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = r2.m10897a(r1);	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = r1.booleanValue();	 Catch:{ IllegalStateException -> 0x0015 }
        r0 = r1;
    L_0x0015:
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r3, r4);
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.a(android.content.Context, java.lang.Throwable):void");
    }

    @java.lang.Deprecated
    /* renamed from: m */
    public final java.lang.String m9848m(android.content.Context r3) {
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
        r2 = this;
        r0 = com.google.android.gms.internal.ads.zznw.cK;
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r0 = r1.m10897a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        r3 = "";
        return r3;
    L_0x0015:
        r0 = new com.google.android.gms.internal.ads.dc;	 Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0025 }
        r0.<init>(r2, r3);	 Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0025 }
        r3 = com.google.android.gms.internal.ads.zzalm.m9773a(r0);	 Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0025 }
        r3 = r3.get();	 Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0025 }
        r3 = (java.lang.String) r3;	 Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0025 }
        return r3;
    L_0x0025:
        r3 = "";
        return r3;
    L_0x0028:
        java.lang.Thread.interrupted();
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.m(android.content.Context):java.lang.String");
    }

    @java.lang.Deprecated
    /* renamed from: n */
    public final android.os.Bundle m9849n(android.content.Context r3) {
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
        r2 = this;
        r0 = com.google.android.gms.internal.ads.zznw.cL;
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r0 = r1.m10897a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = new com.google.android.gms.internal.ads.dd;	 Catch:{ InterruptedException -> 0x0025, ExecutionException -> 0x0024 }
        r0.<init>(r2, r3);	 Catch:{ InterruptedException -> 0x0025, ExecutionException -> 0x0024 }
        r3 = com.google.android.gms.internal.ads.zzalm.m9773a(r0);	 Catch:{ InterruptedException -> 0x0025, ExecutionException -> 0x0024 }
        r3 = r3.get();	 Catch:{ InterruptedException -> 0x0025, ExecutionException -> 0x0024 }
        r3 = (android.os.Bundle) r3;	 Catch:{ InterruptedException -> 0x0025, ExecutionException -> 0x0024 }
        return r3;
    L_0x0024:
        return r1;
    L_0x0025:
        java.lang.Thread.interrupted();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.n(android.content.Context):android.os.Bundle");
    }

    /* renamed from: o */
    public static boolean m9828o(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        context = ((Activity) context).getWindow();
        if (context != null) {
            if (context.getDecorView() != null) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                context.getDecorView().getGlobalVisibleRect(rect, null);
                context.getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (rect.bottom == null || rect2.bottom == null || rect.top != rect2.top) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m9821f(String str) {
        if (!zzaoe.m9991c()) {
            return false;
        }
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.ct)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzkd.m10713e().m10897a(zznw.cv);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        str2 = (String) zzkd.m10713e().m10897a(zznw.cu);
        if (str2.isEmpty()) {
            return true;
        }
        for (String equals2 : str2.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
