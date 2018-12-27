package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.C1700b;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.adapters.p082a.C1730g;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p081a.C1716e;
import com.facebook.ads.internal.p085d.C1774a;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.settings.C1963a.C1962a;
import com.facebook.ads.internal.view.C1980a;
import com.facebook.ads.p080a.C1698a;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.k */
public class C4592k extends C3768d {
    /* renamed from: a */
    private static final ConcurrentMap<String, C1980a> f18998a = new ConcurrentHashMap();
    /* renamed from: b */
    private final String f18999b = UUID.randomUUID().toString();
    /* renamed from: c */
    private String f19000c;
    /* renamed from: d */
    private long f19001d;
    /* renamed from: e */
    private Context f19002e;
    /* renamed from: f */
    private C1755t f19003f;
    /* renamed from: g */
    private C1743e f19004g;
    /* renamed from: h */
    private boolean f19005h = false;
    /* renamed from: i */
    private C3791z f19006i;
    /* renamed from: j */
    private C1747a f19007j = C1747a.UNSPECIFIED;
    /* renamed from: k */
    private C1730g f19008k;
    /* renamed from: l */
    private C1962a f19009l;
    /* renamed from: m */
    private boolean f19010m;

    /* renamed from: com.facebook.ads.internal.adapters.k$a */
    public enum C1747a {
        UNSPECIFIED,
        VERTICAL,
        HORIZONTAL;

        /* renamed from: a */
        public static C1747a m6624a(int i) {
            return i == 0 ? UNSPECIFIED : i == 2 ? HORIZONTAL : VERTICAL;
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$4 */
    class C37744 implements C1774a {
        /* renamed from: a */
        final /* synthetic */ C4592k f15144a;

        C37744(C4592k c4592k) {
            this.f15144a = c4592k;
        }

        /* renamed from: c */
        private void m18902c() {
            this.f15144a.f19005h = true;
            this.f15144a.f19004g.mo1312a(this.f15144a);
        }

        /* renamed from: a */
        public void mo1334a() {
            m18902c();
        }

        /* renamed from: b */
        public void mo1335b() {
            m18902c();
        }
    }

    /* renamed from: a */
    public static C1980a m25302a(String str) {
        return (C1980a) f18998a.get(str);
    }

    /* renamed from: a */
    public static void m25303a(C1980a c1980a) {
        for (Entry entry : f18998a.entrySet()) {
            if (entry.getValue() == c1980a) {
                f18998a.remove(entry.getKey());
            }
        }
    }

    /* renamed from: b */
    private int m25306b() {
        int rotation = ((WindowManager) this.f19002e.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.f19007j == C1747a.UNSPECIFIED) {
            return -1;
        }
        if (this.f19007j != C1747a.HORIZONTAL) {
            return rotation != 2 ? 1 : 9;
        } else {
            switch (rotation) {
                case 2:
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: b */
    private static void m25308b(String str, C1980a c1980a) {
        f18998a.put(str, c1980a);
    }

    /* renamed from: a */
    public void mo3968a(Context context, C1743e c1743e, Map<String, Object> map, C1827c c1827c, final EnumSet<CacheFlag> enumSet) {
        this.f19002e = context;
        this.f19004g = c1743e;
        this.f19000c = (String) map.get("placementId");
        this.f19001d = ((Long) map.get("requestTime")).longValue();
        JSONObject jSONObject = (JSONObject) map.get("data");
        C1804d c1804d = (C1804d) map.get("definition");
        if (jSONObject.has("markup")) {
            this.f19009l = C1962a.INTERSTITIAL_WEB_VIEW;
            this.f19006i = C3791z.m18950a(jSONObject);
            if (C1716e.m6469a(context, this.f19006i, c1827c)) {
                c1743e.mo1313a(this, C1700b.f5120b);
                return;
            }
            this.f19003f = new C1755t(context, this.f18999b, this, this.f19004g);
            this.f19003f.m6642a();
            Map f = this.f19006i.m18958f();
            if (f.containsKey("orientation")) {
                this.f19007j = C1747a.m6624a(Integer.parseInt((String) f.get("orientation")));
            }
            this.f19005h = true;
            if (this.f19004g != null) {
                this.f19004g.mo1312a(this);
            }
        } else if (jSONObject.has("video")) {
            this.f19009l = C1962a.INTERSTITIAL_OLD_NATIVE_VIDEO;
            this.f19003f = new C1755t(context, this.f18999b, this, this.f19004g);
            this.f19003f.m6642a();
            final C4812u c4812u = new C4812u();
            c4812u.mo3971a(context, new C1698a(this) {
                /* renamed from: b */
                final /* synthetic */ C4592k f15139b;

                /* renamed from: a */
                public void mo1322a(ac acVar) {
                    this.f15139b.f19005h = true;
                    if (this.f15139b.f19004g != null) {
                        this.f15139b.f19004g.mo1312a(this.f15139b);
                    }
                }

                /* renamed from: a */
                public void mo1323a(ac acVar, View view) {
                    this.f15139b.f19007j = c4812u.m27910m();
                    C4592k.m25308b(this.f15139b.f18999b, c4812u);
                }

                /* renamed from: a */
                public void mo1324a(ac acVar, C1700b c1700b) {
                    c4812u.m27911n();
                    this.f15139b.f19004g.mo1313a(this.f15139b, c1700b);
                }

                /* renamed from: b */
                public void mo1325b(ac acVar) {
                    this.f15139b.f19004g.mo1314a(this.f15139b, "", true);
                }

                /* renamed from: c */
                public void mo1326c(ac acVar) {
                    this.f15139b.f19004g.mo1315b(this.f15139b);
                }

                /* renamed from: d */
                public void mo1327d(ac acVar) {
                }
            }, map, c1827c, enumSet);
        } else {
            C1779b c1779b;
            C1774a c37722;
            this.f19008k = C1730g.m6539a(jSONObject, context);
            if (c1804d != null) {
                this.f19008k.m6542a(c1804d.m6804k());
            }
            if (this.f19008k.m6545d().size() == 0) {
                this.f19004g.mo1313a(this, C1700b.f5120b);
            }
            this.f19003f = new C1755t(context, this.f18999b, this, this.f19004g);
            this.f19003f.m6642a();
            if (jSONObject.has("carousel")) {
                this.f19009l = C1962a.INTERSTITIAL_NATIVE_CAROUSEL;
                c1779b = new C1779b(context);
                c1779b.m6689a(this.f19008k.m6541a().m6564b(), -1, -1);
                List<C1731h> d = this.f19008k.m6545d();
                boolean contains = enumSet.contains(CacheFlag.VIDEO);
                for (C1731h c1731h : d) {
                    c1779b.m6689a(c1731h.m6553c().m6509g(), c1731h.m6553c().m6511i(), c1731h.m6553c().m6510h());
                    if (contains && !TextUtils.isEmpty(c1731h.m6553c().m6502a())) {
                        c1779b.m6688a(c1731h.m6553c().m6509g());
                    }
                }
                c37722 = new C1774a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4592k f15141b;

                    /* renamed from: a */
                    private void m18896a(boolean z) {
                        int contains = enumSet.contains(CacheFlag.NONE) ^ 1;
                        C4592k c4592k = this.f15141b;
                        z = z && contains != 0;
                        c4592k.f19010m = z;
                        this.f15141b.f19005h = true;
                        this.f15141b.f19004g.mo1312a(this.f15141b);
                    }

                    /* renamed from: a */
                    public void mo1334a() {
                        m18896a(true);
                    }

                    /* renamed from: b */
                    public void mo1335b() {
                        m18896a(false);
                    }
                };
            } else if (jSONObject.has("video_url")) {
                this.f19009l = C1962a.INTERSTITIAL_NATIVE_VIDEO;
                c1779b = new C1779b(context);
                r7 = ((C1731h) this.f19008k.m6545d().get(0)).m6553c();
                c1779b.m6689a(r7.m6509g(), r7.m6511i(), r7.m6510h());
                c1779b.m6689a(this.f19008k.m6541a().m6564b(), -1, -1);
                if (enumSet.contains(CacheFlag.VIDEO)) {
                    c1779b.m6688a(r7.m6502a());
                }
                c37722 = new C1774a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4592k f15143b;

                    /* renamed from: a */
                    private void m18899a(boolean z) {
                        this.f15143b.f19010m = z;
                        this.f15143b.f19005h = true;
                        this.f15143b.f19004g.mo1312a(this.f15143b);
                    }

                    /* renamed from: a */
                    public void mo1334a() {
                        m18899a(enumSet.contains(CacheFlag.VIDEO));
                    }

                    /* renamed from: b */
                    public void mo1335b() {
                        m18899a(false);
                    }
                };
            } else {
                this.f19009l = C1962a.INTERSTITIAL_NATIVE_IMAGE;
                c1779b = new C1779b(context);
                r7 = ((C1731h) this.f19008k.m6545d().get(0)).m6553c();
                c1779b.m6689a(r7.m6509g(), r7.m6511i(), r7.m6510h());
                c1779b.m6689a(this.f19008k.m6541a().m6564b(), -1, -1);
                c37722 = new C37744(this);
            }
            c1779b.m6687a(c37722);
        }
    }

    /* renamed from: a */
    public boolean mo3969a() {
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
        r0 = r4.f19005h;
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = r4.f19004g;
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r4.f19004g;
        r1 = com.facebook.ads.C1700b.f5123e;
        r0.mo1313a(r4, r1);
    L_0x000f:
        r0 = 0;
        return r0;
    L_0x0011:
        r0 = new android.content.Intent;
        r1 = r4.f19002e;
        r2 = com.facebook.ads.AudienceNetworkActivity.class;
        r0.<init>(r1, r2);
        r1 = "predefinedOrientationKey";
        r2 = r4.m25306b();
        r0.putExtra(r1, r2);
        r1 = "uniqueId";
        r2 = r4.f18999b;
        r0.putExtra(r1, r2);
        r1 = "placementId";
        r2 = r4.f19000c;
        r0.putExtra(r1, r2);
        r1 = "requestTime";
        r2 = r4.f19001d;
        r0.putExtra(r1, r2);
        r1 = "viewType";
        r2 = r4.f19009l;
        r0.putExtra(r1, r2);
        r1 = "useCache";
        r2 = r4.f19010m;
        r0.putExtra(r1, r2);
        r1 = r4.f19008k;
        if (r1 == 0) goto L_0x0052;
    L_0x004a:
        r1 = "ad_data_bundle";
        r2 = r4.f19008k;
        r0.putExtra(r1, r2);
        goto L_0x005b;
    L_0x0052:
        r1 = r4.f19006i;
        if (r1 == 0) goto L_0x005b;
    L_0x0056:
        r1 = r4.f19006i;
        r1.m18953a(r0);
    L_0x005b:
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r1 = r4.f19002e;	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        goto L_0x0072;
    L_0x0066:
        r1 = r4.f19002e;
        r2 = com.facebook.ads.InterstitialAdActivity.class;
        r0.setClass(r1, r2);
        r1 = r4.f19002e;
        r1.startActivity(r0);
    L_0x0072:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.k.a():boolean");
    }

    /* renamed from: e */
    public void mo3946e() {
        if (this.f19003f != null) {
            this.f19003f.m6643b();
        }
    }
}
