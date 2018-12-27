package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zzxy {
    /* renamed from: a */
    public final List<zzxx> f9857a;
    /* renamed from: b */
    public final long f9858b;
    /* renamed from: c */
    public final List<String> f9859c;
    /* renamed from: d */
    public final List<String> f9860d;
    /* renamed from: e */
    public final List<String> f9861e;
    /* renamed from: f */
    public final List<String> f9862f;
    /* renamed from: g */
    public final List<String> f9863g;
    /* renamed from: h */
    public final boolean f9864h;
    /* renamed from: i */
    public final String f9865i;
    /* renamed from: j */
    public final long f9866j;
    /* renamed from: k */
    public final String f9867k;
    /* renamed from: l */
    public final int f9868l;
    /* renamed from: m */
    public final int f9869m;
    /* renamed from: n */
    public final long f9870n;
    /* renamed from: o */
    public final boolean f9871o;
    /* renamed from: p */
    public final boolean f9872p;
    /* renamed from: q */
    public final boolean f9873q;
    /* renamed from: r */
    public final boolean f9874r;
    /* renamed from: s */
    public int f9875s;
    /* renamed from: t */
    public int f9876t;
    /* renamed from: u */
    public boolean f9877u;

    public zzxy(List<zzxx> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f9857a = list;
        this.f9858b = j;
        this.f9859c = list2;
        this.f9860d = list3;
        this.f9861e = list4;
        this.f9862f = list5;
        this.f9863g = list6;
        this.f9864h = z;
        this.f9865i = str;
        this.f9866j = -1;
        this.f9875s = 0;
        this.f9876t = 1;
        this.f9867k = null;
        this.f9868l = 0;
        this.f9869m = -1;
        this.f9870n = -1;
        this.f9871o = false;
        this.f9872p = false;
        this.f9873q = false;
        this.f9874r = false;
        this.f9877u = false;
    }

    public zzxy(String str) {
        this(new JSONObject(str));
    }

    public zzxy(org.json.JSONObject r11) {
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
        r10 = this;
        r10.<init>();
        r0 = 2;
        r1 = com.google.android.gms.internal.ads.zzaok.m10000a(r0);
        if (r1 == 0) goto L_0x0027;
    L_0x000a:
        r1 = "Mediation Response JSON: ";
        r0 = r11.toString(r0);
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r1.concat(r0);
        goto L_0x0024;
    L_0x001f:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x0024:
        com.google.android.gms.internal.ads.zzalg.m21225a(r0);
    L_0x0027:
        r0 = "ad_networks";
        r0 = r11.getJSONArray(r0);
        r1 = new java.util.ArrayList;
        r2 = r0.length();
        r1.<init>(r2);
        r2 = -1;
        r3 = 0;
        r4 = 0;
        r5 = -1;
    L_0x003a:
        r6 = r0.length();
        if (r4 >= r6) goto L_0x0079;
    L_0x0040:
        r6 = new com.google.android.gms.internal.ads.zzxx;	 Catch:{ JSONException -> 0x0076 }
        r7 = r0.getJSONObject(r4);	 Catch:{ JSONException -> 0x0076 }
        r6.<init>(r7);	 Catch:{ JSONException -> 0x0076 }
        r7 = r6.m11187a();
        r8 = 1;
        if (r7 == 0) goto L_0x0052;
    L_0x0050:
        r10.f9877u = r8;
    L_0x0052:
        r1.add(r6);
        if (r5 >= 0) goto L_0x0076;
    L_0x0057:
        r6 = r6.f9838c;
        r6 = r6.iterator();
    L_0x005d:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0072;
    L_0x0063:
        r7 = r6.next();
        r7 = (java.lang.String) r7;
        r9 = "com.google.ads.mediation.admob.AdMobAdapter";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x005d;
    L_0x0071:
        goto L_0x0073;
    L_0x0072:
        r8 = 0;
    L_0x0073:
        if (r8 == 0) goto L_0x0076;
    L_0x0075:
        r5 = r4;
    L_0x0076:
        r4 = r4 + 1;
        goto L_0x003a;
    L_0x0079:
        r10.f9875s = r5;
        r0 = r0.length();
        r10.f9876t = r0;
        r0 = java.util.Collections.unmodifiableList(r1);
        r10.f9857a = r0;
        r0 = "qdata";
        r0 = r11.optString(r0);
        r10.f9865i = r0;
        r0 = "fs_model_type";
        r0 = r11.optInt(r0, r2);
        r10.f9869m = r0;
        r0 = "timeout_ms";
        r1 = -1;
        r4 = r11.optLong(r0, r1);
        r10.f9870n = r4;
        r0 = "settings";
        r11 = r11.optJSONObject(r0);
        r0 = 0;
        if (r11 == 0) goto L_0x013d;
    L_0x00aa:
        r4 = "ad_network_timeout_millis";
        r4 = r11.optLong(r4, r1);
        r10.f9858b = r4;
        com.google.android.gms.ads.internal.zzbv.zzfe();
        r4 = "click_urls";
        r4 = com.google.android.gms.internal.ads.zzyg.m11194a(r11, r4);
        r10.f9859c = r4;
        com.google.android.gms.ads.internal.zzbv.zzfe();
        r4 = "imp_urls";
        r4 = com.google.android.gms.internal.ads.zzyg.m11194a(r11, r4);
        r10.f9860d = r4;
        com.google.android.gms.ads.internal.zzbv.zzfe();
        r4 = "downloaded_imp_urls";
        r4 = com.google.android.gms.internal.ads.zzyg.m11194a(r11, r4);
        r10.f9861e = r4;
        com.google.android.gms.ads.internal.zzbv.zzfe();
        r4 = "nofill_urls";
        r4 = com.google.android.gms.internal.ads.zzyg.m11194a(r11, r4);
        r10.f9862f = r4;
        com.google.android.gms.ads.internal.zzbv.zzfe();
        r4 = "remote_ping_urls";
        r4 = com.google.android.gms.internal.ads.zzyg.m11194a(r11, r4);
        r10.f9863g = r4;
        r4 = "render_in_browser";
        r4 = r11.optBoolean(r4, r3);
        r10.f9864h = r4;
        r4 = "refresh";
        r4 = r11.optLong(r4, r1);
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x0101;
    L_0x00fd:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 * r4;
    L_0x0101:
        r10.f9866j = r1;
        r1 = "rewards";
        r1 = r11.optJSONArray(r1);
        r1 = com.google.android.gms.internal.ads.zzajk.m26268a(r1);
        if (r1 != 0) goto L_0x0114;
    L_0x010f:
        r10.f9867k = r0;
        r10.f9868l = r3;
        goto L_0x011c;
    L_0x0114:
        r0 = r1.f19880a;
        r10.f9867k = r0;
        r0 = r1.f19881b;
        r10.f9868l = r0;
    L_0x011c:
        r0 = "use_displayed_impression";
        r0 = r11.optBoolean(r0, r3);
        r10.f9871o = r0;
        r0 = "allow_pub_rendered_attribution";
        r0 = r11.optBoolean(r0, r3);
        r10.f9872p = r0;
        r0 = "allow_pub_owned_ad_view";
        r0 = r11.optBoolean(r0, r3);
        r10.f9873q = r0;
        r0 = "allow_custom_click_gesture";
        r11 = r11.optBoolean(r0, r3);
        r10.f9874r = r11;
        return;
    L_0x013d:
        r10.f9858b = r1;
        r10.f9859c = r0;
        r10.f9860d = r0;
        r10.f9861e = r0;
        r10.f9862f = r0;
        r10.f9863g = r0;
        r10.f9866j = r1;
        r10.f9867k = r0;
        r10.f9868l = r3;
        r10.f9871o = r3;
        r10.f9864h = r3;
        r10.f9872p = r3;
        r10.f9873q = r3;
        r10.f9874r = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxy.<init>(org.json.JSONObject):void");
    }
}
