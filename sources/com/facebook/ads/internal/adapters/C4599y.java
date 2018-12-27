package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1837d.C1836c;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1842j;
import com.facebook.ads.internal.p095n.C1844m;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.flurry.android.FlurryAgent;
import com.flurry.android.ads.FlurryAdNative;
import com.flurry.android.ads.FlurryAdNativeListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.y */
public class C4599y extends ai implements af {
    /* renamed from: a */
    private static volatile boolean f19112a;
    /* renamed from: b */
    private aj f19113b;
    /* renamed from: c */
    private FlurryAdNative f19114c;
    /* renamed from: d */
    private boolean f19115d;
    /* renamed from: e */
    private String f19116e;
    /* renamed from: f */
    private String f19117f;
    /* renamed from: g */
    private C1839f f19118g;
    /* renamed from: h */
    private C1839f f19119h;

    /* renamed from: a */
    public void mo3939a(int i) {
    }

    /* renamed from: a */
    public void mo3940a(final Context context, aj ajVar, C1827c c1827c, Map<String, Object> map, C1836c c1836c) {
        JSONObject jSONObject = (JSONObject) map.get("data");
        String optString = jSONObject.optString("api_key");
        String optString2 = jSONObject.optString("placement_id");
        synchronized (C4599y.class) {
            if (!f19112a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(ag.m6591a(mo3967x()));
                stringBuilder.append(" Initializing");
                C1909d.m7258a(context, stringBuilder.toString());
                FlurryAgent.setLogEnabled(true);
                FlurryAgent.init(context, optString);
                f19112a = true;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(ag.m6591a(mo3967x()));
        stringBuilder2.append(" Loading");
        C1909d.m7258a(context, stringBuilder2.toString());
        this.f19113b = ajVar;
        this.f19114c = new FlurryAdNative(context, optString2);
        this.f19114c.setListener(new FlurryAdNativeListener(this) {
            /* renamed from: b */
            final /* synthetic */ C4599y f5313b;
        });
        this.f19114c.fetchAd();
    }

    /* renamed from: a */
    public void mo3941a(View view, List<View> list) {
        if (this.f19114c != null) {
            this.f19114c.setTrackingView(view);
        }
    }

    /* renamed from: a */
    public void mo3942a(aj ajVar) {
        this.f19113b = ajVar;
    }

    /* renamed from: a */
    public void mo3943a(Map<String, String> map) {
    }

    /* renamed from: b */
    public void mo3944b(Map<String, String> map) {
    }

    /* renamed from: c */
    public String mo3945c() {
        return null;
    }

    /* renamed from: e */
    public void mo3946e() {
        j_();
        this.f19113b = null;
        if (this.f19114c != null) {
            this.f19114c.destroy();
            this.f19114c = null;
        }
    }

    /* renamed from: f */
    public boolean mo3947f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo3948g() {
        return false;
    }

    /* renamed from: h */
    public int mo3949h() {
        return 0;
    }

    /* renamed from: i */
    public int mo3950i() {
        return 0;
    }

    /* renamed from: j */
    public int mo3951j() {
        return 0;
    }

    public void j_() {
        if (this.f19114c != null) {
            this.f19114c.removeTrackingView();
        }
    }

    /* renamed from: k */
    public C1839f mo3953k() {
        return this.f19118g;
    }

    public boolean k_() {
        return this.f19115d;
    }

    /* renamed from: l */
    public C1839f mo3955l() {
        return this.f19119h;
    }

    /* renamed from: m */
    public C1842j mo3956m() {
        return null;
    }

    /* renamed from: n */
    public String mo3957n() {
        return this.f19116e;
    }

    /* renamed from: o */
    public String mo3958o() {
        return this.f19117f;
    }

    /* renamed from: p */
    public String mo3959p() {
        return null;
    }

    /* renamed from: q */
    public String mo3960q() {
        return null;
    }

    /* renamed from: r */
    public C1844m mo3961r() {
        return C1844m.DEFAULT;
    }

    /* renamed from: s */
    public int mo3962s() {
        return 0;
    }

    /* renamed from: t */
    public String mo3963t() {
        return null;
    }

    /* renamed from: u */
    public List<C1837d> mo3964u() {
        return null;
    }

    /* renamed from: v */
    public int mo3965v() {
        return 0;
    }

    /* renamed from: w */
    public int mo3966w() {
        return 0;
    }

    /* renamed from: x */
    public C1744f mo3967x() {
        return C1744f.YAHOO;
    }
}
