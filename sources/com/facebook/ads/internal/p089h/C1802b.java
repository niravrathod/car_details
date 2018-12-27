package com.facebook.ads.internal.p089h;

import com.google.android.gms.common.internal.ImagesContract;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.b */
public class C1802b {
    /* renamed from: a */
    public String f5438a;
    /* renamed from: b */
    public String f5439b;
    /* renamed from: c */
    public String f5440c;
    /* renamed from: d */
    public Date f5441d;
    /* renamed from: e */
    public boolean f5442e;

    public C1802b(String str, String str2, String str3, Date date) {
        this.f5438a = str;
        this.f5439b = str2;
        this.f5440c = str3;
        this.f5441d = date;
        boolean z = (str2 == null || str3 == null) ? false : true;
        this.f5442e = z;
    }

    public C1802b(JSONObject jSONObject) {
        this(jSONObject.optString(ImagesContract.URL), jSONObject.optString("key"), jSONObject.optString("value"), new Date(jSONObject.optLong("expiration") * 1000));
    }

    /* renamed from: a */
    public static java.util.List<com.facebook.ads.internal.p089h.C1802b> m6786a(java.lang.String r5) {
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
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x000a }
        r1.<init>(r5);	 Catch:{ JSONException -> 0x000a }
        goto L_0x000b;
    L_0x000a:
        r1 = r0;
    L_0x000b:
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r0;
    L_0x000e:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r2 = 0;
    L_0x0014:
        r3 = r1.length();
        if (r2 >= r3) goto L_0x002d;
    L_0x001a:
        r3 = r1.getJSONObject(r2);	 Catch:{ JSONException -> 0x001f }
        goto L_0x0020;
    L_0x001f:
        r3 = r0;
    L_0x0020:
        if (r3 == 0) goto L_0x002a;
    L_0x0022:
        r4 = new com.facebook.ads.internal.h.b;
        r4.<init>(r3);
        r5.add(r4);
    L_0x002a:
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x002d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.b.a(java.lang.String):java.util.List<com.facebook.ads.internal.h.b>");
    }

    /* renamed from: a */
    public String m6787a() {
        Date date = this.f5441d;
        if (date == null) {
            date = new Date();
            date.setTime(date.getTime() + 3600000);
        }
        DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    /* renamed from: b */
    public boolean m6788b() {
        return (this.f5439b == null || this.f5440c == null || this.f5438a == null) ? false : true;
    }
}
