package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.C1700b;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p083b.C1762b;
import com.facebook.ads.internal.p083b.C1764c;
import com.facebook.ads.internal.p085d.C1774a;
import com.facebook.ads.internal.p085d.C1779b;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1926p;
import com.facebook.ads.internal.p101q.p104c.C1948d;
import com.facebook.ads.internal.p101q.p104c.C1948d.C1947a;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.C3903c;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3866a;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3869d;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p119c.C3894d;
import com.facebook.ads.internal.view.p116f.p119c.C3894d.C2054a;
import com.facebook.ads.internal.view.p116f.p119c.C4618a;
import com.facebook.ads.internal.view.p116f.p119c.C4622b;
import com.facebook.ads.internal.view.p116f.p119c.C4623c;
import com.facebook.ads.internal.view.p116f.p119c.C4628e;
import com.facebook.ads.internal.view.p116f.p119c.C4636i;
import com.facebook.ads.internal.view.p116f.p119c.C4640k;
import com.facebook.ads.internal.view.p116f.p119c.C4644l;
import com.facebook.ads.p080a.C1698a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.s */
public class C4596s extends ac implements C1926p<Bundle> {
    /* renamed from: e */
    static final /* synthetic */ boolean f19036e = (C4596s.class.desiredAssertionStatus() ^ 1);
    /* renamed from: a */
    protected C1827c f19037a;
    /* renamed from: b */
    protected C3859a f19038b;
    /* renamed from: c */
    protected JSONObject f19039c;
    /* renamed from: d */
    protected Context f19040d;
    /* renamed from: f */
    private final C1817f<C3867b> f19041f = new C37821(this);
    /* renamed from: g */
    private final C1817f<C3877l> f19042g = new C37832(this);
    /* renamed from: h */
    private final C1817f<C3869d> f19043h = new C37843(this);
    /* renamed from: i */
    private final C1817f<C3866a> f19044i = new C37854(this);
    /* renamed from: j */
    private C1698a f19045j;
    /* renamed from: k */
    private String f19046k;
    /* renamed from: l */
    private boolean f19047l = false;
    /* renamed from: m */
    private C3903c f19048m;
    /* renamed from: n */
    private String f19049n;
    /* renamed from: o */
    private boolean f19050o = false;
    /* renamed from: p */
    private C1779b f19051p;

    /* renamed from: com.facebook.ads.internal.adapters.s$1 */
    class C37821 extends C1817f<C3867b> {
        /* renamed from: a */
        final /* synthetic */ C4596s f15163a;

        C37821(C4596s c4596s) {
            this.f15163a = c4596s;
        }

        /* renamed from: a */
        public Class<C3867b> mo1340a() {
            return C3867b.class;
        }

        /* renamed from: a */
        public void m18919a(C3867b c3867b) {
            if (this.f15163a.f19045j != null) {
                this.f15163a.f19045j.mo1327d(this.f15163a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.s$2 */
    class C37832 extends C1817f<C3877l> {
        /* renamed from: a */
        final /* synthetic */ C4596s f15164a;

        C37832(C4596s c4596s) {
            this.f15164a = c4596s;
        }

        /* renamed from: a */
        public Class<C3877l> mo1340a() {
            return C3877l.class;
        }

        /* renamed from: a */
        public void m18922a(C3877l c3877l) {
            this.f15164a.f19047l = true;
            if (this.f15164a.f19045j != null) {
                this.f15164a.f19045j.mo1322a(this.f15164a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.s$3 */
    class C37843 extends C1817f<C3869d> {
        /* renamed from: a */
        final /* synthetic */ C4596s f15165a;

        C37843(C4596s c4596s) {
            this.f15165a = c4596s;
        }

        /* renamed from: a */
        public Class<C3869d> mo1340a() {
            return C3869d.class;
        }

        /* renamed from: a */
        public void m18925a(C3869d c3869d) {
            if (this.f15165a.f19045j != null) {
                this.f15165a.f19045j.mo1324a(this.f15165a, C1700b.f5123e);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.s$4 */
    class C37854 extends C1817f<C3866a> {
        /* renamed from: a */
        final /* synthetic */ C4596s f15166a;

        C37854(C4596s c4596s) {
            this.f15166a = c4596s;
        }

        /* renamed from: a */
        public Class<C3866a> mo1340a() {
            return C3866a.class;
        }

        /* renamed from: a */
        public void m18928a(C3866a c3866a) {
            if (this.f15166a.f19045j != null) {
                this.f15166a.f19045j.mo1325b(this.f15166a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.s$6 */
    class C37876 implements C1774a {
        /* renamed from: a */
        final /* synthetic */ C4596s f15168a;

        C37876(C4596s c4596s) {
            this.f15168a = c4596s;
        }

        /* renamed from: a */
        public void mo1334a() {
            this.f15168a.f19038b.setVideoURI(this.f15168a.mo4663j());
        }

        /* renamed from: b */
        public void mo1335b() {
            this.f15168a.f19038b.setVideoURI(this.f15168a.mo4663j());
        }
    }

    /* renamed from: a */
    private void m25368a(Context context, C1698a c1698a, JSONObject jSONObject, C1827c c1827c, Bundle bundle, EnumSet<CacheFlag> enumSet, int i) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        Bundle bundle2 = bundle;
        this.f19040d = context2;
        this.f19045j = c1698a;
        this.f19037a = c1827c;
        this.f19039c = jSONObject2;
        this.f19047l = false;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("video");
        this.f19049n = jSONObject2.optString("ct");
        this.f19038b = new C3859a(context2);
        this.f19038b.setVideoProgressReportIntervalMs(i);
        mo4662a();
        this.f19038b.getEventBus().m6830a(this.f19041f, this.f19042g, this.f19043h, this.f19044i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1762b(this, 1.0E-7d, -1.0d, 0.001d, false) {
            /* renamed from: a */
            final /* synthetic */ C4596s f15167a;

            /* renamed from: a */
            protected void mo1342a(boolean z, boolean z2, C1764c c1764c) {
                this.f15167a.m25379h();
            }
        });
        if (bundle2 != null) {
            r9.f19048m = new C4617b(context, c1827c, r9.f19038b, arrayList, r9.f19049n, bundle2.getBundle("logger"), null);
        } else {
            r9.f19048m = new C4617b(context, c1827c, r9.f19038b, (List) arrayList, r9.f19049n);
        }
        r9.f19045j.mo1323a(r9, r9.f19038b);
        String str = (C1948d.m7361c(context) == C1947a.MOBILE_INTERNET && jSONObject3.has("videoHDURL") && !jSONObject3.isNull("videoHDURL")) ? "videoHDURL" : "videoURL";
        r9.f19046k = jSONObject3.getString(str);
        if (enumSet.contains(CacheFlag.VIDEO)) {
            r9.f19051p = new C1779b(context2);
            r9.f19051p.m6688a(r9.f19046k);
            r9.f19051p.m6687a(new C37876(r9));
            return;
        }
        r9.f19038b.setVideoURI(mo4663j());
    }

    /* renamed from: j */
    private String mo4663j() {
        Object obj = "";
        if (!(this.f19051p == null || this.f19046k == null)) {
            obj = this.f19051p.m6690b(this.f19046k);
        }
        return TextUtils.isEmpty(obj) ? this.f19046k : obj;
    }

    /* renamed from: a */
    protected void mo4662a() {
        if (!f19036e) {
            if (this.f19040d == null) {
                throw new AssertionError();
            }
        }
        if (!f19036e) {
            if (this.f19039c == null) {
                throw new AssertionError();
            }
        }
        JSONObject optJSONObject = this.f19039c.optJSONObject("text");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f19038b.m19256a(new C4640k(this.f19040d));
        C2039b c4644l = new C4644l(this.f19040d);
        this.f19038b.m19256a(c4644l);
        this.f19038b.m19256a(new C3894d(c4644l, C2054a.INVSIBLE));
        this.f19038b.m19256a(new C4622b(this.f19040d));
        String b = m25374b();
        if (b != null) {
            C2039b c4623c = new C4623c(this.f19040d, b);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            c4623c.setLayoutParams(layoutParams);
            c4623c.setCountdownTextColor(-1);
            this.f19038b.m19256a(c4623c);
        }
        if (this.f19039c.has("cta") && !this.f19039c.isNull("cta")) {
            JSONObject jSONObject = this.f19039c.getJSONObject("cta");
            C2039b c4628e = new C4628e(this.f19040d, jSONObject.getString(ImagesContract.URL), this.f19037a, this.f19049n, jSONObject.getString("text"));
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            c4628e.setLayoutParams(layoutParams);
            this.f19038b.m19256a(c4628e);
        }
        Object f = m25377f();
        if (!TextUtils.isEmpty(f)) {
            this.f19038b.m19256a(new C4618a(this.f19040d, f, this.f19049n, new float[]{0.0f, 0.0f, 8.0f, 0.0f}));
        }
        int c = m25375c();
        if (c > 0) {
            c4628e = new C4636i(this.f19040d, c, optJSONObject.optString("skipAdIn", "Skip Ad in"), optJSONObject.optString("skipAd", "Skip Ad"));
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(11);
            c4628e.setLayoutParams(layoutParams2);
            c4628e.setPadding(0, 0, 0, 30);
            this.f19038b.m19256a(c4628e);
        }
    }

    /* renamed from: a */
    public final void mo3971a(android.content.Context r10, com.facebook.ads.p080a.C1698a r11, java.util.Map<java.lang.String, java.lang.Object> r12, com.facebook.ads.internal.p094m.C1827c r13, java.util.EnumSet<com.facebook.ads.CacheFlag> r14) {
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
        r9 = this;
        r0 = "data";	 Catch:{ JSONException -> 0x0027 }
        r0 = r12.get(r0);	 Catch:{ JSONException -> 0x0027 }
        r4 = r0;	 Catch:{ JSONException -> 0x0027 }
        r4 = (org.json.JSONObject) r4;	 Catch:{ JSONException -> 0x0027 }
        r0 = "definition";	 Catch:{ JSONException -> 0x0027 }
        r12 = r12.get(r0);	 Catch:{ JSONException -> 0x0027 }
        r12 = (com.facebook.ads.internal.p089h.C1804d) r12;	 Catch:{ JSONException -> 0x0027 }
        if (r12 != 0) goto L_0x0018;	 Catch:{ JSONException -> 0x0027 }
    L_0x0013:
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ JSONException -> 0x0027 }
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ JSONException -> 0x0027 }
        goto L_0x001d;	 Catch:{ JSONException -> 0x0027 }
    L_0x0018:
        r12 = r12.m6804k();	 Catch:{ JSONException -> 0x0027 }
        r8 = r12;	 Catch:{ JSONException -> 0x0027 }
    L_0x001d:
        r6 = 0;	 Catch:{ JSONException -> 0x0027 }
        r1 = r9;	 Catch:{ JSONException -> 0x0027 }
        r2 = r10;	 Catch:{ JSONException -> 0x0027 }
        r3 = r11;	 Catch:{ JSONException -> 0x0027 }
        r5 = r13;	 Catch:{ JSONException -> 0x0027 }
        r7 = r14;	 Catch:{ JSONException -> 0x0027 }
        r1.m25368a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ JSONException -> 0x0027 }
        goto L_0x002c;
    L_0x0027:
        r10 = com.facebook.ads.C1700b.f5123e;
        r11.mo1324a(r9, r10);
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.s.a(android.content.Context, com.facebook.ads.a.a, java.util.Map, com.facebook.ads.internal.m.c, java.util.EnumSet):void");
    }

    /* renamed from: b */
    protected String m25374b() {
        if (!f19036e) {
            if (this.f19039c == null) {
                throw new AssertionError();
            }
        }
        try {
            JSONObject jSONObject = this.f19039c.getJSONObject("capabilities");
            if (jSONObject.has("countdown")) {
                if (!jSONObject.isNull("countdown")) {
                    jSONObject = jSONObject.getJSONObject("countdown");
                    if (jSONObject.has("format")) {
                        return jSONObject.optString("format");
                    }
                }
            }
            return null;
        } catch (Throwable e) {
            Log.w(String.valueOf(C4596s.class), "Invalid JSON", e);
            return null;
        }
    }

    /* renamed from: c */
    protected int m25375c() {
        if (!f19036e) {
            if (this.f19039c == null) {
                throw new AssertionError();
            }
        }
        try {
            JSONObject jSONObject = this.f19039c.getJSONObject("capabilities");
            if (jSONObject.has("skipButton")) {
                if (!jSONObject.isNull("skipButton")) {
                    jSONObject = jSONObject.getJSONObject("skipButton");
                    if (jSONObject.has("skippableSeconds")) {
                        return jSONObject.getInt("skippableSeconds");
                    }
                }
            }
            return -1;
        } catch (Throwable e) {
            Log.w(String.valueOf(C4596s.class), "Invalid JSON", e);
            return -1;
        }
    }

    /* renamed from: e */
    public void mo3946e() {
        if (this.f19038b != null) {
            this.f19038b.m19261d();
            this.f19038b.m19266i();
        }
        this.f19045j = null;
        this.f19037a = null;
        this.f19046k = null;
        this.f19047l = false;
        this.f19049n = null;
        this.f19038b = null;
        this.f19048m = null;
        this.f19039c = null;
        this.f19040d = null;
        this.f19050o = false;
    }

    /* renamed from: f */
    protected String m25377f() {
        if (!f19036e) {
            if (this.f19039c == null) {
                throw new AssertionError();
            }
        }
        try {
            JSONObject jSONObject = this.f19039c.getJSONObject("capabilities");
            if (jSONObject.has("adChoices")) {
                if (!jSONObject.isNull("adChoices")) {
                    jSONObject = jSONObject.getJSONObject("adChoices");
                    if (jSONObject.has(ImagesContract.URL)) {
                        return jSONObject.getString(ImagesContract.URL);
                    }
                }
            }
            return null;
        } catch (Throwable e) {
            Log.w(String.valueOf(C4596s.class), "Invalid JSON", e);
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo3972g() {
        if (this.f19047l) {
            if (this.f19038b != null) {
                if (this.f19048m.m19402j() > 0) {
                    this.f19038b.m19253a(this.f19048m.m19402j());
                }
                this.f19038b.m19255a(C2038a.AUTO_STARTED);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    protected void m25379h() {
        if (this.f19037a != null && !this.f19050o) {
            this.f19050o = true;
            this.f19037a.mo1355a(this.f19049n, new HashMap());
            if (this.f19045j != null) {
                this.f19045j.mo1326c(this);
            }
        }
    }

    /* renamed from: i */
    public Bundle mo1347i() {
        if (this.f19048m != null) {
            if (this.f19039c != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("logger", this.f19048m.mo1347i());
                bundle.putString("ad_response", this.f19039c.toString());
                return bundle;
            }
        }
        return null;
    }
}
