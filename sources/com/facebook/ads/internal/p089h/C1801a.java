package com.facebook.ads.internal.p089h;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.a */
public class C1801a {
    /* renamed from: a */
    private final String f5435a;
    /* renamed from: b */
    private final JSONObject f5436b;
    /* renamed from: c */
    private final Map<C1805e, List<String>> f5437c = new HashMap();

    public C1801a(java.lang.String r6, org.json.JSONObject r7, org.json.JSONArray r8) {
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
        r5 = this;
        r5.<init>();
        r0 = new java.util.HashMap;
        r0.<init>();
        r5.f5437c = r0;
        r5.f5435a = r6;
        r5.f5436b = r7;
        if (r8 == 0) goto L_0x0065;
    L_0x0010:
        r6 = r8.length();
        if (r6 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0065;
    L_0x0017:
        r6 = com.facebook.ads.internal.p089h.C1805e.values();
        r7 = r6.length;
        r0 = 0;
        r1 = 0;
    L_0x001e:
        if (r1 >= r7) goto L_0x002f;
    L_0x0020:
        r2 = r6[r1];
        r3 = r5.f5437c;
        r4 = new java.util.LinkedList;
        r4.<init>();
        r3.put(r2, r4);
        r1 = r1 + 1;
        goto L_0x001e;
    L_0x002f:
        r6 = r8.length();
        if (r0 >= r6) goto L_0x0065;
    L_0x0035:
        r6 = r8.getJSONObject(r0);	 Catch:{ Exception -> 0x0062 }
        r7 = "type";	 Catch:{ Exception -> 0x0062 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0062 }
        r1 = "url";	 Catch:{ Exception -> 0x0062 }
        r6 = r6.getString(r1);	 Catch:{ Exception -> 0x0062 }
        r1 = java.util.Locale.US;	 Catch:{ Exception -> 0x0062 }
        r7 = r7.toUpperCase(r1);	 Catch:{ Exception -> 0x0062 }
        r7 = com.facebook.ads.internal.p089h.C1805e.valueOf(r7);	 Catch:{ Exception -> 0x0062 }
        if (r7 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x0062 }
    L_0x0051:
        r1 = android.text.TextUtils.isEmpty(r6);	 Catch:{ Exception -> 0x0062 }
        if (r1 != 0) goto L_0x0062;	 Catch:{ Exception -> 0x0062 }
    L_0x0057:
        r1 = r5.f5437c;	 Catch:{ Exception -> 0x0062 }
        r7 = r1.get(r7);	 Catch:{ Exception -> 0x0062 }
        r7 = (java.util.List) r7;	 Catch:{ Exception -> 0x0062 }
        r7.add(r6);	 Catch:{ Exception -> 0x0062 }
    L_0x0062:
        r0 = r0 + 1;
        goto L_0x002f;
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.a.<init>(java.lang.String, org.json.JSONObject, org.json.JSONArray):void");
    }

    /* renamed from: a */
    public String m6783a() {
        return this.f5435a;
    }

    /* renamed from: a */
    public List<String> m6784a(C1805e c1805e) {
        return (List) this.f5437c.get(c1805e);
    }

    /* renamed from: b */
    public JSONObject m6785b() {
        return this.f5436b;
    }
}
