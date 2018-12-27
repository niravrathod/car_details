package io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

public class ab {
    /* renamed from: a */
    private int f11499a;
    /* renamed from: b */
    private String f11500b;
    /* renamed from: c */
    private Object f11501c;

    public ab(String str, int i) {
        this.f11500b = str;
        this.f11499a = i;
    }

    /* renamed from: a */
    public int m13211a() {
        return this.f11499a;
    }

    /* renamed from: a */
    public void m13212a(Object obj) {
        this.f11501c = obj;
    }

    /* renamed from: b */
    public JSONObject m13213b() {
        if (this.f11501c instanceof JSONObject) {
            return (JSONObject) this.f11501c;
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public JSONArray m13214c() {
        return this.f11501c instanceof JSONArray ? (JSONArray) this.f11501c : null;
    }

    /* renamed from: d */
    public java.lang.String m13215d() {
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
        r0 = "";
        r1 = r4.m13213b();	 Catch:{ Exception -> 0x0049 }
        if (r1 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x0008:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r2 = r1.has(r2);	 Catch:{ Exception -> 0x0049 }
        if (r2 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x0010:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r2 = r1.getJSONObject(r2);	 Catch:{ Exception -> 0x0049 }
        r3 = "message";	 Catch:{ Exception -> 0x0049 }
        r2 = r2.has(r3);	 Catch:{ Exception -> 0x0049 }
        if (r2 == 0) goto L_0x0049;	 Catch:{ Exception -> 0x0049 }
    L_0x001e:
        r2 = "error";	 Catch:{ Exception -> 0x0049 }
        r1 = r1.getJSONObject(r2);	 Catch:{ Exception -> 0x0049 }
        r2 = "message";	 Catch:{ Exception -> 0x0049 }
        r1 = r1.getString(r2);	 Catch:{ Exception -> 0x0049 }
        if (r1 == 0) goto L_0x0048;
    L_0x002c:
        r0 = r1.trim();	 Catch:{ Exception -> 0x0048 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0048 }
        if (r0 <= 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x0036:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0048 }
        r0.<init>();	 Catch:{ Exception -> 0x0048 }
        r0.append(r1);	 Catch:{ Exception -> 0x0048 }
        r2 = ".";	 Catch:{ Exception -> 0x0048 }
        r0.append(r2);	 Catch:{ Exception -> 0x0048 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0048 }
        goto L_0x0049;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ab.d():java.lang.String");
    }
}
