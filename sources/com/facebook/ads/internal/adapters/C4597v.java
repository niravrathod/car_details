package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p081a.C1714d;
import com.facebook.ads.internal.p081a.C1716e;
import com.facebook.ads.internal.p081a.C1716e.C1715a;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1837d.C1836c;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1841i;
import com.facebook.ads.internal.p095n.C1842j;
import com.facebook.ads.internal.p095n.C1844m;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1938y;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1894a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.v */
public class C4597v extends ai implements C1715a {
    /* renamed from: a */
    private static final String f19052a = "v";
    /* renamed from: A */
    private int f19053A;
    /* renamed from: B */
    private String f19054B;
    /* renamed from: C */
    private String f19055C;
    /* renamed from: D */
    private C1844m f19056D;
    /* renamed from: E */
    private int f19057E = 200;
    /* renamed from: F */
    private String f19058F;
    /* renamed from: G */
    private C1839f f19059G;
    /* renamed from: H */
    private String f19060H;
    /* renamed from: I */
    private String f19061I;
    /* renamed from: J */
    private C1842j f19062J;
    /* renamed from: K */
    private List<C1837d> f19063K;
    /* renamed from: L */
    private int f19064L = -1;
    /* renamed from: M */
    private int f19065M;
    /* renamed from: N */
    private String f19066N;
    /* renamed from: O */
    private boolean f19067O;
    /* renamed from: P */
    private boolean f19068P;
    /* renamed from: Q */
    private boolean f19069Q;
    /* renamed from: R */
    private boolean f19070R;
    /* renamed from: S */
    private boolean f19071S;
    /* renamed from: T */
    private long f19072T = 0;
    /* renamed from: U */
    private C1810a f19073U = null;
    /* renamed from: V */
    private C1827c f19074V;
    /* renamed from: W */
    private C1836c f19075W;
    /* renamed from: b */
    private Context f19076b;
    /* renamed from: c */
    private aj f19077c;
    /* renamed from: d */
    private Uri f19078d;
    /* renamed from: e */
    private String f19079e;
    /* renamed from: f */
    private String f19080f;
    /* renamed from: g */
    private String f19081g;
    /* renamed from: h */
    private String f19082h;
    /* renamed from: i */
    private String f19083i;
    /* renamed from: j */
    private String f19084j;
    /* renamed from: k */
    private String f19085k;
    /* renamed from: l */
    private String f19086l;
    /* renamed from: m */
    private String f19087m;
    /* renamed from: n */
    private String f19088n;
    /* renamed from: o */
    private String f19089o;
    /* renamed from: p */
    private C1839f f19090p;
    /* renamed from: q */
    private C1839f f19091q;
    /* renamed from: r */
    private C1841i f19092r;
    /* renamed from: s */
    private String f19093s;
    /* renamed from: t */
    private C1714d f19094t;
    /* renamed from: u */
    private Collection<String> f19095u;
    /* renamed from: v */
    private boolean f19096v;
    /* renamed from: w */
    private boolean f19097w;
    /* renamed from: x */
    private int f19098x;
    /* renamed from: y */
    private int f19099y;
    /* renamed from: z */
    private int f19100z;

    /* renamed from: a */
    private void m25382a(Context context, JSONObject jSONObject, C1827c c1827c, String str, int i, int i2) {
        this.f19067O = true;
        this.f19076b = context;
        this.f19074V = c1827c;
        this.f19064L = i;
        this.f19065M = i2;
        m25384a(jSONObject, str);
    }

    /* renamed from: a */
    private void m25383a(java.util.Map<java.lang.String, java.lang.String> r3, final java.util.Map<java.lang.String, java.lang.String> r4) {
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
        r3 = r2.m25386c(r3);	 Catch:{ Exception -> 0x0016 }
        r0 = new android.os.Handler;	 Catch:{ Exception -> 0x0016 }
        r0.<init>();	 Catch:{ Exception -> 0x0016 }
        r1 = new com.facebook.ads.internal.adapters.v$1;	 Catch:{ Exception -> 0x0016 }
        r1.<init>(r2, r4, r3);	 Catch:{ Exception -> 0x0016 }
        r3 = r2.f19098x;	 Catch:{ Exception -> 0x0016 }
        r3 = r3 * 1000;	 Catch:{ Exception -> 0x0016 }
        r3 = (long) r3;	 Catch:{ Exception -> 0x0016 }
        r0.postDelayed(r1, r3);	 Catch:{ Exception -> 0x0016 }
    L_0x0016:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.v.a(java.util.Map, java.util.Map):void");
    }

    /* renamed from: a */
    private void m25384a(org.json.JSONObject r13, java.lang.String r14) {
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
        r12 = this;
        r0 = r12.f19068P;
        if (r0 != 0) goto L_0x01c7;
    L_0x0004:
        if (r13 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r12.f19076b;
        r1 = "Audience Network Loaded";
        com.facebook.ads.internal.p101q.p102a.C1909d.m7258a(r0, r1);
        r12.f19066N = r14;
        r0 = "fbad_command";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x001d:
        r0 = r2;
        goto L_0x0023;
    L_0x001f:
        r0 = android.net.Uri.parse(r0);
    L_0x0023:
        r12.f19078d = r0;
        r0 = "advertiser_name";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19079e = r0;
        r0 = "title";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19080f = r0;
        r0 = "subtitle";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19081g = r0;
        r0 = "headline";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19082h = r0;
        r0 = "body";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19083i = r0;
        r0 = "call_to_action";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19084j = r0;
        r0 = r12.f19084j;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x005f;
    L_0x005d:
        r12.f19084j = r2;
    L_0x005f:
        r0 = "social_context";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19085k = r0;
        r0 = "link_description";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19086l = r0;
        r0 = "sponsored_translation";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19087m = r0;
        r0 = "ad_translation";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19088n = r0;
        r0 = "promoted_translation";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19089o = r0;
        r0 = "icon";
        r0 = r13.optJSONObject(r0);
        r0 = com.facebook.ads.internal.p095n.C1839f.m7017a(r0);
        r12.f19090p = r0;
        r0 = "image";
        r0 = r13.optJSONObject(r0);
        r0 = com.facebook.ads.internal.p095n.C1839f.m7017a(r0);
        r12.f19091q = r0;
        r0 = "star_rating";
        r0 = r13.optJSONObject(r0);
        r0 = com.facebook.ads.internal.p095n.C1841i.m7021a(r0);
        r12.f19092r = r0;
        r0 = "used_report_url";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19093s = r0;
        r0 = "enable_view_log";
        r0 = r13.optBoolean(r0);
        r12.f19096v = r0;
        r0 = "enable_snapshot_log";
        r0 = r13.optBoolean(r0);
        r12.f19097w = r0;
        r0 = "snapshot_log_delay_second";
        r1 = 4;
        r0 = r13.optInt(r0, r1);
        r12.f19098x = r0;
        r0 = "snapshot_compress_quality";
        r1 = 0;
        r0 = r13.optInt(r0, r1);
        r12.f19099y = r0;
        r0 = "viewability_check_initial_delay";
        r0 = r13.optInt(r0, r1);
        r12.f19100z = r0;
        r0 = "viewability_check_interval";
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r13.optInt(r0, r3);
        r12.f19053A = r0;
        r0 = "ad_choices_icon";
        r0 = r13.optJSONObject(r0);
        r3 = "native_ui_config";
        r3 = r13.optJSONObject(r3);
        if (r3 == 0) goto L_0x0102;
    L_0x00f5:
        r4 = r3.length();	 Catch:{ JSONException -> 0x0106 }
        if (r4 != 0) goto L_0x00fc;	 Catch:{ JSONException -> 0x0106 }
    L_0x00fb:
        goto L_0x0102;	 Catch:{ JSONException -> 0x0106 }
    L_0x00fc:
        r4 = new com.facebook.ads.internal.n.j;	 Catch:{ JSONException -> 0x0106 }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x0106 }
        goto L_0x0103;	 Catch:{ JSONException -> 0x0106 }
    L_0x0102:
        r4 = r2;	 Catch:{ JSONException -> 0x0106 }
    L_0x0103:
        r12.f19062J = r4;	 Catch:{ JSONException -> 0x0106 }
        goto L_0x0108;
    L_0x0106:
        r12.f19062J = r2;
    L_0x0108:
        if (r0 == 0) goto L_0x0110;
    L_0x010a:
        r0 = com.facebook.ads.internal.p095n.C1839f.m7017a(r0);
        r12.f19059G = r0;
    L_0x0110:
        r0 = "ad_choices_link_url";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19060H = r0;
        r0 = "request_id";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19061I = r0;
        r0 = "invalidation_behavior";
        r0 = r13.optString(r0);
        r0 = com.facebook.ads.internal.p081a.C1714d.m6464a(r0);
        r12.f19094t = r0;
        r0 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0138 }
        r3 = "detection_strings";	 Catch:{ JSONException -> 0x0138 }
        r3 = r13.optString(r3);	 Catch:{ JSONException -> 0x0138 }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x0138 }
        goto L_0x013d;
    L_0x0138:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r2;
    L_0x013d:
        r0 = com.facebook.ads.internal.p081a.C1716e.m6468a(r0);
        r12.f19095u = r0;
        r0 = "video_url";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19054B = r0;
        r0 = "video_mpd";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19055C = r0;
        r0 = "video_autoplay_enabled";
        r0 = r13.has(r0);
        if (r0 != 0) goto L_0x0160;
    L_0x015b:
        r0 = com.facebook.ads.internal.p095n.C1844m.DEFAULT;
    L_0x015d:
        r12.f19056D = r0;
        goto L_0x016e;
    L_0x0160:
        r0 = "video_autoplay_enabled";
        r0 = r13.optBoolean(r0);
        if (r0 == 0) goto L_0x016b;
    L_0x0168:
        r0 = com.facebook.ads.internal.p095n.C1844m.ON;
        goto L_0x015d;
    L_0x016b:
        r0 = com.facebook.ads.internal.p095n.C1844m.OFF;
        goto L_0x015d;
    L_0x016e:
        r0 = "video_report_url";
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7294a(r13, r0);
        r12.f19058F = r0;
        r0 = "carousel";	 Catch:{ JSONException -> 0x01b5 }
        r13 = r13.optJSONArray(r0);	 Catch:{ JSONException -> 0x01b5 }
        if (r13 == 0) goto L_0x01bd;	 Catch:{ JSONException -> 0x01b5 }
    L_0x017e:
        r0 = r13.length();	 Catch:{ JSONException -> 0x01b5 }
        if (r0 <= 0) goto L_0x01bd;	 Catch:{ JSONException -> 0x01b5 }
    L_0x0184:
        r0 = r13.length();	 Catch:{ JSONException -> 0x01b5 }
        r10 = new java.util.ArrayList;	 Catch:{ JSONException -> 0x01b5 }
        r10.<init>(r0);	 Catch:{ JSONException -> 0x01b5 }
    L_0x018d:
        if (r1 >= r0) goto L_0x01b2;	 Catch:{ JSONException -> 0x01b5 }
    L_0x018f:
        r11 = new com.facebook.ads.internal.adapters.v;	 Catch:{ JSONException -> 0x01b5 }
        r11.<init>();	 Catch:{ JSONException -> 0x01b5 }
        r4 = r12.f19076b;	 Catch:{ JSONException -> 0x01b5 }
        r5 = r13.getJSONObject(r1);	 Catch:{ JSONException -> 0x01b5 }
        r6 = r12.f19074V;	 Catch:{ JSONException -> 0x01b5 }
        r3 = r11;	 Catch:{ JSONException -> 0x01b5 }
        r7 = r14;	 Catch:{ JSONException -> 0x01b5 }
        r8 = r1;	 Catch:{ JSONException -> 0x01b5 }
        r9 = r0;	 Catch:{ JSONException -> 0x01b5 }
        r3.m25382a(r4, r5, r6, r7, r8, r9);	 Catch:{ JSONException -> 0x01b5 }
        r3 = new com.facebook.ads.internal.n.d;	 Catch:{ JSONException -> 0x01b5 }
        r4 = r12.f19076b;	 Catch:{ JSONException -> 0x01b5 }
        r5 = r12.f19075W;	 Catch:{ JSONException -> 0x01b5 }
        r3.<init>(r4, r11, r2, r5);	 Catch:{ JSONException -> 0x01b5 }
        r10.add(r3);	 Catch:{ JSONException -> 0x01b5 }
        r1 = r1 + 1;	 Catch:{ JSONException -> 0x01b5 }
        goto L_0x018d;	 Catch:{ JSONException -> 0x01b5 }
    L_0x01b2:
        r12.f19063K = r10;	 Catch:{ JSONException -> 0x01b5 }
        goto L_0x01bd;
    L_0x01b5:
        r13 = move-exception;
        r14 = f19052a;
        r0 = "Unable to parse carousel data.";
        android.util.Log.e(r14, r0, r13);
    L_0x01bd:
        r13 = 1;
        r12.f19068P = r13;
        r13 = r12.m25387y();
        r12.f19069Q = r13;
        return;
    L_0x01c7:
        r13 = new java.lang.IllegalStateException;
        r14 = "Adapter already loaded data";
        r13.<init>(r14);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.v.a(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: c */
    private Map<String, String> m25386c(Map<String, String> map) {
        Map<String, String> hashMap = new HashMap();
        if (map.containsKey("view")) {
            hashMap.put("view", map.get("view"));
        }
        if (map.containsKey("snapshot")) {
            hashMap.put("snapshot", map.get("snapshot"));
        }
        return hashMap;
    }

    /* renamed from: y */
    private boolean m25387y() {
        return (!(this.f19067O || TextUtils.isEmpty(this.f19079e)) || (!TextUtils.isEmpty(this.f19080f) && this.f19067O)) && ((this.f19090p != null || this.f19067O) && (this.f19091q != null || mo1333d() == AdPlacementType.NATIVE_BANNER));
    }

    /* renamed from: z */
    private void m25388z() {
        if (!this.f19071S) {
            if (this.f19074V != null) {
                this.f19074V.mo1354a(this.f19093s);
            }
            this.f19071S = true;
        }
    }

    /* renamed from: a */
    public C1714d mo1344a() {
        return this.f19094t;
    }

    /* renamed from: a */
    public void mo3939a(int i) {
        if (k_() && i == 0 && this.f19072T > 0 && this.f19073U != null) {
            C1813b.m6823a(C1812a.m6818a(this.f19072T, this.f19073U, this.f19061I));
            this.f19072T = 0;
            this.f19073U = null;
        }
    }

    /* renamed from: a */
    public void mo3940a(Context context, aj ajVar, C1827c c1827c, Map<String, Object> map, C1836c c1836c) {
        this.f19076b = context;
        this.f19077c = ajVar;
        this.f19074V = c1827c;
        this.f19075W = c1836c;
        JSONObject jSONObject = (JSONObject) map.get("data");
        C1804d c1804d = (C1804d) map.get("definition");
        this.f19057E = c1804d != null ? c1804d.m6804k() : 200;
        m25384a(jSONObject, C1921k.m7294a(jSONObject, "ct"));
        if (C1716e.m6469a(context, this, c1827c)) {
            ajVar.mo1319a(this, new C1894a(AdErrorType.NO_FILL, "No Fill"));
            return;
        }
        if (ajVar != null) {
            ajVar.mo1318a(this);
        }
        C1812a.f5492a = this.f19061I;
    }

    /* renamed from: a */
    public void mo3941a(View view, List<View> list) {
    }

    /* renamed from: a */
    public void mo3942a(aj ajVar) {
        this.f19077c = ajVar;
    }

    /* renamed from: a */
    public void mo3943a(Map<String, String> map) {
        if (k_() && !this.f19070R) {
            if (this.f19077c != null) {
                this.f19077c.mo1320b(this);
            }
            Map hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.f19067O) {
                hashMap.put("cardind", String.valueOf(this.f19064L));
                hashMap.put("cardcnt", String.valueOf(this.f19065M));
            }
            if (!(TextUtils.isEmpty(mo3945c()) || this.f19074V == null)) {
                this.f19074V.mo1355a(mo3945c(), hashMap);
            }
            if (mo3948g() || mo3947f()) {
                m25383a((Map) map, hashMap);
            }
            this.f19070R = true;
        }
    }

    /* renamed from: b */
    public Collection<String> mo1345b() {
        return this.f19095u;
    }

    /* renamed from: b */
    public void mo3944b(Map<String, String> map) {
        if (!k_()) {
            return;
        }
        if (C1820a.m6848c(this.f19076b) && C1938y.m7335a((Map) map)) {
            Log.e(f19052a, "Click happened on lockscreen ad");
            return;
        }
        Map hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        C1909d.m7258a(this.f19076b, "Click logged");
        if (this.f19077c != null) {
            this.f19077c.mo1321c(this);
        }
        if (this.f19067O) {
            hashMap.put("cardind", String.valueOf(this.f19064L));
            hashMap.put("cardcnt", String.valueOf(this.f19065M));
        }
        C1712b a = C1713c.m6462a(this.f19076b, this.f19074V, this.f19066N, this.f19078d, hashMap);
        if (a != null) {
            try {
                this.f19072T = System.currentTimeMillis();
                this.f19073U = a.mo1329a();
                a.mo1328b();
            } catch (Throwable e) {
                Log.e(f19052a, "Error executing action", e);
            }
        }
    }

    /* renamed from: c */
    public String mo3945c() {
        return this.f19066N;
    }

    /* renamed from: e */
    public void mo3946e() {
    }

    /* renamed from: f */
    public boolean mo3947f() {
        return k_() && this.f19097w;
    }

    /* renamed from: g */
    public boolean mo3948g() {
        return k_() && this.f19096v;
    }

    /* renamed from: h */
    public int mo3949h() {
        if (this.f19099y >= 0) {
            if (this.f19099y <= 100) {
                return this.f19099y;
            }
        }
        return 0;
    }

    /* renamed from: i */
    public int mo3950i() {
        return this.f19100z;
    }

    /* renamed from: j */
    public int mo3951j() {
        return this.f19053A;
    }

    public void j_() {
        if (this.f19063K != null && !this.f19063K.isEmpty()) {
            for (C1837d q : this.f19063K) {
                q.m7016q();
            }
        }
    }

    /* renamed from: k */
    public C1839f mo3953k() {
        return !k_() ? null : this.f19090p;
    }

    public boolean k_() {
        return this.f19068P && this.f19069Q;
    }

    /* renamed from: l */
    public C1839f mo3955l() {
        return !k_() ? null : this.f19091q;
    }

    /* renamed from: m */
    public C1842j mo3956m() {
        return !k_() ? null : this.f19062J;
    }

    /* renamed from: n */
    public String mo3957n() {
        if (!k_()) {
            return null;
        }
        m25388z();
        return this.f19084j;
    }

    /* renamed from: o */
    public String mo3958o() {
        if (!k_()) {
            return null;
        }
        m25388z();
        return this.f19085k;
    }

    /* renamed from: p */
    public String mo3959p() {
        return !k_() ? null : this.f19054B;
    }

    /* renamed from: q */
    public String mo3960q() {
        return !k_() ? null : this.f19055C;
    }

    /* renamed from: r */
    public C1844m mo3961r() {
        return !k_() ? C1844m.DEFAULT : this.f19056D;
    }

    /* renamed from: s */
    public int mo3962s() {
        return this.f19057E;
    }

    /* renamed from: t */
    public String mo3963t() {
        return this.f19058F;
    }

    /* renamed from: u */
    public List<C1837d> mo3964u() {
        return !k_() ? null : this.f19063K;
    }

    /* renamed from: v */
    public int mo3965v() {
        return this.f19064L;
    }

    /* renamed from: w */
    public int mo3966w() {
        return this.f19065M;
    }

    /* renamed from: x */
    public boolean m25417x() {
        return this.f19067O;
    }
}
