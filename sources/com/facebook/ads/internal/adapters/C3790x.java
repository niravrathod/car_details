package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.p095n.C1843l;
import com.facebook.ads.internal.p107r.C1958a;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.x */
public class C3790x extends C1749m {
    /* renamed from: c */
    private final ai f15173c;
    /* renamed from: d */
    private C1843l f15174d;
    /* renamed from: e */
    private boolean f15175e;
    /* renamed from: f */
    private boolean f15176f;
    /* renamed from: g */
    private boolean f15177g;
    /* renamed from: h */
    private boolean f15178h;
    /* renamed from: i */
    private boolean f15179i;
    /* renamed from: j */
    private View f15180j;
    /* renamed from: k */
    private List<View> f15181k;
    /* renamed from: l */
    private C1760a f15182l = C1760a.ALL;

    /* renamed from: com.facebook.ads.internal.adapters.x$a */
    public enum C1760a {
        ALL("all"),
        NONE("none"),
        MANUAL("manual");
        
        /* renamed from: d */
        private final String f5311d;

        private C1760a(String str) {
            this.f5311d = str;
        }

        public String toString() {
            return this.f5311d;
        }
    }

    public C3790x(Context context, C1750n c1750n, C1958a c1958a, ai aiVar) {
        super(context, c1750n, c1958a);
        this.f15173c = aiVar;
    }

    /* renamed from: b */
    private java.lang.String m18936b(android.view.View r1) {
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
        r0 = this;
        r1 = r0.m18937c(r1);	 Catch:{ JSONException -> 0x0009 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0009 }
        return r1;
    L_0x0009:
        r1 = "Json exception";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.x.b(android.view.View):java.lang.String");
    }

    /* renamed from: c */
    private JSONObject m18937c(View view) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(FacebookAdapter.KEY_ID, Integer.valueOf(view.getId()));
        jSONObject.putOpt("class", view.getClass());
        r4 = new Object[2];
        int i = 0;
        r4[0] = Integer.valueOf(view.getTop());
        boolean z = true;
        r4[1] = Integer.valueOf(view.getLeft());
        jSONObject.putOpt("origin", String.format("{x:%d, y:%d}", r4));
        jSONObject.putOpt("size", String.format("{h:%d, w:%d}", new Object[]{Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())}));
        if (this.f15181k == null || !this.f15181k.contains(view)) {
            z = false;
        }
        jSONObject.putOpt("clickable", Boolean.valueOf(z));
        Object obj = "unknown";
        if (view instanceof Button) {
            obj = "button";
        } else if (view instanceof TextView) {
            obj = "text";
        } else if (view instanceof ImageView) {
            obj = "image";
        } else if (view instanceof MediaView) {
            obj = "mediaview";
        } else if (view instanceof ViewGroup) {
            obj = "viewgroup";
        }
        jSONObject.putOpt("type", obj);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray jSONArray = new JSONArray();
            while (i < viewGroup.getChildCount()) {
                jSONArray.put(m18937c(viewGroup.getChildAt(i)));
                i++;
            }
            jSONObject.putOpt("list", jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: d */
    private java.lang.String m18938d(android.view.View r4) {
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
        r0 = r4.getWidth();
        if (r0 <= 0) goto L_0x004d;
    L_0x0006:
        r0 = r4.getHeight();
        if (r0 > 0) goto L_0x000d;
    L_0x000c:
        goto L_0x004d;
    L_0x000d:
        r0 = r4.getWidth();	 Catch:{ Exception -> 0x004a }
        r1 = r4.getHeight();	 Catch:{ Exception -> 0x004a }
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ Exception -> 0x004a }
        r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2);	 Catch:{ Exception -> 0x004a }
        r1 = r4.getResources();	 Catch:{ Exception -> 0x004a }
        r1 = r1.getDisplayMetrics();	 Catch:{ Exception -> 0x004a }
        r1 = r1.densityDpi;	 Catch:{ Exception -> 0x004a }
        r0.setDensity(r1);	 Catch:{ Exception -> 0x004a }
        r1 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x004a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x004a }
        r4.draw(r1);	 Catch:{ Exception -> 0x004a }
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x004a }
        r4.<init>();	 Catch:{ Exception -> 0x004a }
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ Exception -> 0x004a }
        r2 = r3.f15173c;	 Catch:{ Exception -> 0x004a }
        r2 = r2.mo3949h();	 Catch:{ Exception -> 0x004a }
        r0.compress(r1, r2, r4);	 Catch:{ Exception -> 0x004a }
        r4 = r4.toByteArray();	 Catch:{ Exception -> 0x004a }
        r0 = 0;	 Catch:{ Exception -> 0x004a }
        r4 = android.util.Base64.encodeToString(r4, r0);	 Catch:{ Exception -> 0x004a }
        return r4;
    L_0x004a:
        r4 = "";
        return r4;
    L_0x004d:
        r4 = "";
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.x.d(android.view.View):java.lang.String");
    }

    /* renamed from: a */
    public void m18939a(View view) {
        this.f15180j = view;
    }

    /* renamed from: a */
    public void m18940a(C1760a c1760a) {
        this.f15182l = c1760a;
    }

    /* renamed from: a */
    public void m18941a(C1843l c1843l) {
        this.f15174d = c1843l;
    }

    /* renamed from: a */
    public void m18942a(List<View> list) {
        this.f15181k = list;
    }

    /* renamed from: a */
    protected void mo1332a(Map<String, String> map) {
        if (this.f15173c != null) {
            if (this.f15174d != null) {
                map.put("nti", String.valueOf(this.f15174d.m7032a()));
            }
            if (this.f15175e) {
                map.put("nhs", Boolean.TRUE.toString());
            }
            if (this.f15176f) {
                map.put("nmv", Boolean.TRUE.toString());
            }
            if (this.f15177g) {
                map.put("nmvap", Boolean.TRUE.toString());
            }
            if (this.f15180j != null && this.f15173c.mo3948g()) {
                map.put("view", m18936b(this.f15180j));
            }
            if (this.f15180j != null && this.f15173c.mo3947f()) {
                map.put("snapshot", m18938d(this.f15180j));
            }
            if (this.f15178h) {
                map.put("niv", Boolean.TRUE.toString());
            }
            if (this.f15182l != null) {
                map.put("precache_media", this.f15182l.toString());
            }
            if (this.f15179i) {
                map.put("ucvr", Boolean.TRUE.toString());
            }
            this.f15173c.mo3943a((Map) map);
        }
    }

    /* renamed from: a */
    public void m18944a(boolean z) {
        this.f15175e = z;
    }

    /* renamed from: b */
    public void m18945b(boolean z) {
        this.f15176f = z;
    }

    /* renamed from: c */
    public void m18946c(boolean z) {
        this.f15177g = z;
    }

    /* renamed from: d */
    public void m18947d(boolean z) {
        this.f15178h = z;
    }

    /* renamed from: e */
    public void m18948e(boolean z) {
        this.f15179i = z;
    }
}
