package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1837d.C1836c;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1842j;
import com.facebook.ads.internal.p095n.C1844m;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1894a;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.InMobiNative.NativeAdListener;
import com.inmobi.sdk.InMobiSdk;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class ab extends ai implements af {
    /* renamed from: a */
    private aj f18991a;
    /* renamed from: b */
    private InMobiNative f18992b;
    /* renamed from: c */
    private boolean f18993c;
    /* renamed from: d */
    private View f18994d;
    /* renamed from: e */
    private String f18995e;
    /* renamed from: f */
    private C1839f f18996f;
    /* renamed from: g */
    private C1839f f18997g;

    /* renamed from: a */
    public void mo3939a(int i) {
    }

    /* renamed from: a */
    public void mo3940a(final Context context, aj ajVar, C1827c c1827c, Map<String, Object> map, C1836c c1836c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ag.m6591a(mo3967x()));
        stringBuilder.append(" Loading");
        C1909d.m7258a(context, stringBuilder.toString());
        JSONObject jSONObject = (JSONObject) map.get("data");
        Object optString = jSONObject.optString("account_id");
        Long valueOf = Long.valueOf(jSONObject.optLong("placement_id"));
        if (!TextUtils.isEmpty(optString)) {
            if (valueOf != null) {
                this.f18991a = ajVar;
                InMobiSdk.init(context, optString);
                this.f18992b = new InMobiNative(valueOf.longValue(), new NativeAdListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ ab f5250b;
                });
                this.f18992b.load();
                return;
            }
        }
        ajVar.mo1319a(this, new C1894a(AdErrorType.MEDIATION_ERROR, "Mediation Error"));
    }

    /* renamed from: a */
    public void mo3941a(View view, List<View> list) {
        this.f18994d = view;
        if (k_()) {
            InMobiNative inMobiNative = this.f18992b;
            InMobiNative.bind(this.f18994d, this.f18992b);
        }
    }

    /* renamed from: a */
    public void mo3942a(aj ajVar) {
        this.f18991a = ajVar;
    }

    /* renamed from: a */
    public void mo3943a(Map<String, String> map) {
        this.f18991a.mo1320b(this);
    }

    /* renamed from: b */
    public void mo3944b(Map<String, String> map) {
        if (k_()) {
            this.f18991a.mo1321c(this);
            this.f18992b.reportAdClickAndOpenLandingPage(null);
        }
    }

    /* renamed from: c */
    public String mo3945c() {
        return null;
    }

    /* renamed from: e */
    public void mo3946e() {
        j_();
        this.f18992b = null;
        this.f18991a = null;
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
        if (k_()) {
            InMobiNative inMobiNative = this.f18992b;
            InMobiNative.unbind(this.f18994d);
        }
        this.f18994d = null;
    }

    /* renamed from: k */
    public C1839f mo3953k() {
        return this.f18996f;
    }

    public boolean k_() {
        return this.f18992b != null && this.f18993c;
    }

    /* renamed from: l */
    public C1839f mo3955l() {
        return this.f18997g;
    }

    /* renamed from: m */
    public C1842j mo3956m() {
        return null;
    }

    /* renamed from: n */
    public String mo3957n() {
        return this.f18995e;
    }

    /* renamed from: o */
    public String mo3958o() {
        return null;
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
        return C1744f.INMOBI;
    }
}
