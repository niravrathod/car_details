package io.branch.indexing;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.indexing.b */
public class C2699b {
    /* renamed from: a */
    private static C2699b f11289a;
    /* renamed from: b */
    private JSONObject f11290b;
    /* renamed from: c */
    private String f11291c;
    /* renamed from: d */
    private int f11292d = 0;
    /* renamed from: e */
    private int f11293e = 1;
    /* renamed from: f */
    private int f11294f = 0;
    /* renamed from: g */
    private boolean f11295g = false;
    /* renamed from: h */
    private JSONArray f11296h;
    /* renamed from: i */
    private SharedPreferences f11297i;
    /* renamed from: j */
    private final String f11298j = "BNC_CD_MANIFEST";

    /* renamed from: io.branch.indexing.b$a */
    class C2698a {
        /* renamed from: a */
        final JSONObject f11284a;
        /* renamed from: b */
        final /* synthetic */ C2699b f11285b;
        /* renamed from: c */
        private boolean f11286c;
        /* renamed from: d */
        private int f11287d;
        /* renamed from: e */
        private int f11288e = 15;

        /* renamed from: a */
        int m13062a() {
            return this.f11287d;
        }

        /* renamed from: b */
        int m13063b() {
            return this.f11288e;
        }

        C2698a(C2699b c2699b, JSONObject jSONObject) {
            this.f11285b = c2699b;
            this.f11284a = jSONObject;
            if (jSONObject.has("h") != null) {
                try {
                    this.f11286c = jSONObject.getBoolean("h") ^ 1;
                } catch (C2699b c2699b2) {
                    c2699b2.printStackTrace();
                }
            }
            try {
                if (jSONObject.has("dri") != null) {
                    this.f11287d = jSONObject.getInt("dri");
                }
                if (jSONObject.has("mdr") != null) {
                    this.f11288e = jSONObject.getInt("mdr");
                }
            } catch (C2699b c2699b22) {
                c2699b22.printStackTrace();
            }
        }

        /* renamed from: c */
        JSONArray m13064c() {
            if (this.f11284a.has("ck")) {
                try {
                    return this.f11284a.getJSONArray("ck");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* renamed from: d */
        boolean m13065d() {
            return this.f11286c;
        }

        /* renamed from: e */
        boolean m13066e() {
            JSONArray c = m13064c();
            return c != null && c.length() == 0;
        }
    }

    private C2699b(Context context) {
        this.f11297i = context.getSharedPreferences("bnc_content_discovery_manifest_storage", 0);
        m13068b(context);
    }

    /* renamed from: a */
    public static C2699b m13067a(Context context) {
        if (f11289a == null) {
            f11289a = new C2699b(context);
        }
        return f11289a;
    }

    /* renamed from: f */
    private void m13069f() {
        this.f11297i.edit().putString("BNC_CD_MANIFEST", this.f11290b.toString()).apply();
    }

    /* renamed from: b */
    private void m13068b(android.content.Context r3) {
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
        r2 = this;
        r3 = r2.f11297i;
        r0 = "BNC_CD_MANIFEST";
        r1 = 0;
        r3 = r3.getString(r0, r1);
        if (r3 == 0) goto L_0x0043;
    L_0x000b:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003b }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x003b }
        r2.f11290b = r0;	 Catch:{ JSONException -> 0x003b }
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x003b }
        r0 = "mv";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.has(r0);	 Catch:{ JSONException -> 0x003b }
        if (r3 == 0) goto L_0x0026;	 Catch:{ JSONException -> 0x003b }
    L_0x001c:
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x003b }
        r0 = "mv";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.getString(r0);	 Catch:{ JSONException -> 0x003b }
        r2.f11291c = r3;	 Catch:{ JSONException -> 0x003b }
    L_0x0026:
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x003b }
        r0 = "m";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.has(r0);	 Catch:{ JSONException -> 0x003b }
        if (r3 == 0) goto L_0x004a;	 Catch:{ JSONException -> 0x003b }
    L_0x0030:
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x003b }
        r0 = "m";	 Catch:{ JSONException -> 0x003b }
        r3 = r3.getJSONArray(r0);	 Catch:{ JSONException -> 0x003b }
        r2.f11296h = r3;	 Catch:{ JSONException -> 0x003b }
        goto L_0x004a;
    L_0x003b:
        r3 = new org.json.JSONObject;
        r3.<init>();
        r2.f11290b = r3;
        goto L_0x004a;
    L_0x0043:
        r3 = new org.json.JSONObject;
        r3.<init>();
        r2.f11290b = r3;
    L_0x004a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.b(android.content.Context):void");
    }

    /* renamed from: a */
    public void m13071a(org.json.JSONObject r3) {
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
        r2 = this;
        r0 = "cd";
        r0 = r3.has(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0008:
        r0 = 1;
        r2.f11295g = r0;
        r0 = "cd";	 Catch:{ JSONException -> 0x007c }
        r3 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x007c }
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0021;	 Catch:{ JSONException -> 0x007c }
    L_0x0019:
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f11291c = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0021:
        r0 = "mhl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0031;	 Catch:{ JSONException -> 0x007c }
    L_0x0029:
        r0 = "mhl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f11293e = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0031:
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0041;	 Catch:{ JSONException -> 0x007c }
    L_0x0039:
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getJSONArray(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f11296h = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0041:
        r0 = "mtl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0053;	 Catch:{ JSONException -> 0x007c }
    L_0x0049:
        r0 = "mtl";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 <= 0) goto L_0x0053;	 Catch:{ JSONException -> 0x007c }
    L_0x0051:
        r2.f11292d = r0;	 Catch:{ JSONException -> 0x007c }
    L_0x0053:
        r0 = "mps";	 Catch:{ JSONException -> 0x007c }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x007c }
        if (r0 == 0) goto L_0x0063;	 Catch:{ JSONException -> 0x007c }
    L_0x005b:
        r0 = "mps";	 Catch:{ JSONException -> 0x007c }
        r3 = r3.getInt(r0);	 Catch:{ JSONException -> 0x007c }
        r2.f11294f = r3;	 Catch:{ JSONException -> 0x007c }
    L_0x0063:
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x007c }
        r0 = "mv";	 Catch:{ JSONException -> 0x007c }
        r1 = r2.f11291c;	 Catch:{ JSONException -> 0x007c }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x007c }
        r3 = r2.f11290b;	 Catch:{ JSONException -> 0x007c }
        r0 = "m";	 Catch:{ JSONException -> 0x007c }
        r1 = r2.f11296h;	 Catch:{ JSONException -> 0x007c }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x007c }
        r2.m13069f();	 Catch:{ JSONException -> 0x007c }
        goto L_0x007c;
    L_0x0079:
        r3 = 0;
        r2.f11295g = r3;
    L_0x007c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    io.branch.indexing.C2699b.C2698a m13070a(android.app.Activity r5) {
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
        r4 = this;
        r0 = r4.f11296h;
        r1 = 0;
        if (r0 == 0) goto L_0x004b;
    L_0x0005:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "/";
        r0.append(r2);
        r5 = r5.getClass();
        r5 = r5.getSimpleName();
        r0.append(r5);
        r5 = r0.toString();
        r0 = 0;
    L_0x001f:
        r2 = r4.f11296h;	 Catch:{ JSONException -> 0x004b }
        r2 = r2.length();	 Catch:{ JSONException -> 0x004b }
        if (r0 >= r2) goto L_0x004b;	 Catch:{ JSONException -> 0x004b }
    L_0x0027:
        r2 = r4.f11296h;	 Catch:{ JSONException -> 0x004b }
        r2 = r2.getJSONObject(r0);	 Catch:{ JSONException -> 0x004b }
        r3 = "p";	 Catch:{ JSONException -> 0x004b }
        r3 = r2.has(r3);	 Catch:{ JSONException -> 0x004b }
        if (r3 == 0) goto L_0x0048;	 Catch:{ JSONException -> 0x004b }
    L_0x0035:
        r3 = "p";	 Catch:{ JSONException -> 0x004b }
        r3 = r2.getString(r3);	 Catch:{ JSONException -> 0x004b }
        r3 = r3.equals(r5);	 Catch:{ JSONException -> 0x004b }
        if (r3 == 0) goto L_0x0048;	 Catch:{ JSONException -> 0x004b }
    L_0x0041:
        r5 = new io.branch.indexing.b$a;	 Catch:{ JSONException -> 0x004b }
        r5.<init>(r4, r2);	 Catch:{ JSONException -> 0x004b }
        r1 = r5;
        goto L_0x004b;
    L_0x0048:
        r0 = r0 + 1;
        goto L_0x001f;
    L_0x004b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.b.a(android.app.Activity):io.branch.indexing.b$a");
    }

    /* renamed from: a */
    boolean m13072a() {
        return this.f11295g;
    }

    /* renamed from: b */
    int m13073b() {
        return this.f11292d;
    }

    /* renamed from: c */
    int m13074c() {
        return this.f11294f;
    }

    /* renamed from: d */
    int m13075d() {
        return this.f11293e;
    }

    /* renamed from: e */
    public String m13076e() {
        if (TextUtils.isEmpty(this.f11291c)) {
            return "-1";
        }
        return this.f11291c;
    }
}
