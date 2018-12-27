package com.facebook.ads.internal.p081a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p104c.C1952g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.f */
public class C4590f extends C3763h {
    /* renamed from: e */
    private static final String f18985e = "f";
    /* renamed from: f */
    private final Uri f18986f;
    /* renamed from: g */
    private final Map<String, String> f18987g;

    public C4590f(Context context, C1827c c1827c, String str, Uri uri, Map<String, String> map, C1719l c1719l) {
        super(context, c1827c, str, c1719l);
        this.f18986f = uri;
        this.f18987g = map;
    }

    /* renamed from: a */
    private Intent m25262a(C1717g c1717g) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (!(TextUtils.isEmpty(c1717g.m6472a()) || TextUtils.isEmpty(c1717g.m6473b()))) {
            intent.setComponent(new ComponentName(c1717g.m6472a(), c1717g.m6473b()));
        }
        if (!TextUtils.isEmpty(c1717g.m6474c())) {
            intent.setData(Uri.parse(c1717g.m6474c()));
        }
        return intent;
    }

    /* renamed from: b */
    private Intent m25263b(C1717g c1717g) {
        if (TextUtils.isEmpty(c1717g.m6472a()) || !C1716e.m6470a(this.a, c1717g.m6472a())) {
            return null;
        }
        CharSequence c = c1717g.m6474c();
        if (!TextUtils.isEmpty(c) && (c.startsWith("tel:") || c.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (TextUtils.isEmpty(c1717g.m6473b()) && TextUtils.isEmpty(c)) {
            return packageManager.getLaunchIntentForPackage(c1717g.m6472a());
        }
        Intent a = m25262a(c1717g);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(a, 65536);
        if (a.getComponent() == null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(c1717g.m6472a())) {
                    a.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    break;
                }
            }
        }
        if (!queryIntentActivities.isEmpty()) {
            if (a.getComponent() != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: f */
    private List<C1717g> m25264f() {
        Object queryParameter = this.f18986f.getQueryParameter("appsite_data");
        if (!TextUtils.isEmpty(queryParameter)) {
            if (!"[]".equals(queryParameter)) {
                List<C1717g> arrayList = new ArrayList();
                try {
                    JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            C1717g a = C1717g.m6471a(optJSONArray.optJSONObject(i));
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                    }
                } catch (Throwable e) {
                    Log.w(f18985e, "Error parsing appsite_data", e);
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m25265g() {
        List<Intent> d = m25269d();
        if (d == null) {
            return false;
        }
        for (Intent startActivity : d) {
            try {
                this.a.startActivity(startActivity);
                return true;
            } catch (Throwable e) {
                Log.d(f18985e, "Failed to open app intent, falling back", e);
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m25266h() {
        C1952g c1952g = new C1952g();
        try {
            C1952g.m7374a(c1952g, this.a, m25268c(), this.c);
            return true;
        } catch (Throwable e) {
            String str = f18985e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open market url: ");
            stringBuilder.append(this.f18986f.toString());
            Log.d(str, stringBuilder.toString(), e);
            String queryParameter = this.f18986f.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                C1952g.m7374a(c1952g, this.a, Uri.parse(queryParameter), this.c);
            }
            return false;
        }
    }

    /* renamed from: a */
    public C1810a mo1329a() {
        return C1810a.OPEN_STORE;
    }

    /* renamed from: c */
    protected Uri m25268c() {
        Object queryParameter = this.f18986f.getQueryParameter("store_url");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        String queryParameter2 = this.f18986f.getQueryParameter("store_id");
        return Uri.parse(String.format("market://details?id=%s", new Object[]{queryParameter2}));
    }

    /* renamed from: d */
    protected List<Intent> m25269d() {
        List<C1717g> f = m25264f();
        List<Intent> arrayList = new ArrayList();
        if (f != null) {
            for (C1717g b : f) {
                Intent b2 = m25263b(b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    void mo3938e() {
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
        r0 = "opened_deeplink";
        r1 = r4.m25265g();
        r2 = 0;
        if (r1 != 0) goto L_0x001f;
    L_0x0009:
        r1 = r4.m25266h();	 Catch:{ Exception -> 0x0016 }
        if (r1 == 0) goto L_0x0012;	 Catch:{ Exception -> 0x0016 }
    L_0x000f:
        r1 = "opened_store_url";	 Catch:{ Exception -> 0x0016 }
        goto L_0x0014;	 Catch:{ Exception -> 0x0016 }
    L_0x0012:
        r1 = "opened_store_fallback_url";	 Catch:{ Exception -> 0x0016 }
    L_0x0014:
        r0 = r1;
        goto L_0x001f;
    L_0x0016:
        r1 = f18985e;
        r2 = "Failed to open all options including fallback url, can't open anything";
        android.util.Log.d(r1, r2);
        r2 = com.facebook.ads.internal.p081a.C1711a.CANNOT_OPEN;
    L_0x001f:
        r1 = r4.f18987g;
        r3 = 1;
        r3 = java.lang.String.valueOf(r3);
        r1.put(r0, r3);
        r0 = r4.f18987g;
        r4.m18786a(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.a.f.e():void");
    }
}
