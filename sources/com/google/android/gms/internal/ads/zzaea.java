package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import org.json.JSONObject;

@zzaer
public final class zzaea implements zzadw<zzasg> {
    /* renamed from: a */
    private zzapi<zzasg> f16783a;
    /* renamed from: b */
    private final zzaa f16784b = new zzaa(this.f16786d);
    /* renamed from: c */
    private final zzpr f16785c;
    /* renamed from: d */
    private final Context f16786d;
    /* renamed from: e */
    private final zzaop f16787e;
    /* renamed from: f */
    private final zzbb f16788f;
    /* renamed from: g */
    private final zzck f16789g;
    /* renamed from: h */
    private String f16790h;

    public zzaea(Context context, zzbb zzbb, String str, zzck zzck, zzaop zzaop) {
        zzaok.m10005d("Webview loading for native ads.");
        this.f16786d = context;
        this.f16788f = zzbb;
        this.f16789g = zzck;
        this.f16787e = zzaop;
        this.f16790h = str;
        zzbv.zzel();
        zzapi a = zzasm.m10091a(this.f16786d, this.f16787e, (String) zzkd.m10713e().m10897a(zznw.bw), this.f16789g, this.f16788f.zzbi());
        this.f16785c = new zzpr(zzbb, str);
        this.f16783a = zzaox.m10021a(a, new an(this), zzapn.f8962b);
        zzaov.m10017a(this.f16783a, "WebViewNativeAdsUtil.constructor");
    }

    /* renamed from: a */
    public final zzapi<JSONObject> mo2221a(JSONObject jSONObject) {
        return zzaox.m10021a(this.f16783a, new ao(this, jSONObject), zzapn.f8961a);
    }

    /* renamed from: b */
    public final zzapi<JSONObject> mo2225b(JSONObject jSONObject) {
        return zzaox.m10021a(this.f16783a, new ap(this, jSONObject), zzapn.f8961a);
    }

    /* renamed from: c */
    public final zzapi<JSONObject> mo2227c(JSONObject jSONObject) {
        return zzaox.m10021a(this.f16783a, new aq(this, jSONObject), zzapn.f8961a);
    }

    /* renamed from: d */
    public final zzapi<JSONObject> mo2228d(JSONObject jSONObject) {
        return zzaox.m10021a(this.f16783a, new ar(this, jSONObject), zzapn.f8961a);
    }

    /* renamed from: a */
    public final void mo2223a(String str, zzu<? super zzasg> zzu) {
        zzaox.m10026a(this.f16783a, new at(this, str, zzu), zzapn.f8961a);
    }

    /* renamed from: b */
    public final void mo2226b(String str, zzu<? super zzasg> zzu) {
        zzaox.m10026a(this.f16783a, new au(this, str, zzu), zzapn.f8961a);
    }

    /* renamed from: a */
    public final void mo2224a(String str, JSONObject jSONObject) {
        zzaox.m10026a(this.f16783a, new av(this, str, jSONObject), zzapn.f8961a);
    }

    /* renamed from: a */
    public final void mo2222a() {
        zzaox.m10026a(this.f16783a, new aw(this), zzapn.f8961a);
    }

    /* renamed from: a */
    final /* synthetic */ zzapi m21094a(JSONObject jSONObject, zzasg zzasg) {
        jSONObject.put("ads_id", this.f16790h);
        zzasg.mo4750b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return zzaox.m10019a(new JSONObject());
    }

    /* renamed from: b */
    final /* synthetic */ zzapi m21099b(JSONObject jSONObject, zzasg zzasg) {
        jSONObject.put("ads_id", this.f16790h);
        zzasg.mo4750b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return zzaox.m10019a(new JSONObject());
    }

    /* renamed from: c */
    final /* synthetic */ zzapi m21102c(JSONObject jSONObject, zzasg zzasg) {
        jSONObject.put("ads_id", this.f16790h);
        zzasg.mo4750b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return zzaox.m10019a(new JSONObject());
    }

    /* renamed from: d */
    final /* synthetic */ zzapi m21104d(JSONObject jSONObject, zzasg zzasg) {
        jSONObject.put("ads_id", this.f16790h);
        zzapi zzaps = new zzaps();
        zzasg.mo4740a("/nativeAdPreProcess", new as(this, zzasg, zzaps));
        zzasg.mo4750b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return zzaps;
    }

    /* renamed from: a */
    final /* synthetic */ zzapi m21092a(zzasg zzasg) {
        zzaok.m10005d("Javascript has loaded for native ads.");
        zzasg.mo4782u().mo2397a(this.f16788f, this.f16788f, this.f16788f, this.f16788f, this.f16788f, false, null, new zzw(this.f16786d, null, null), null, null);
        zzasg.mo4740a("/logScionEvent", this.f16784b);
        zzasg.mo4740a("/logScionEvent", this.f16785c);
        return zzaox.m10019a((Object) zzasg);
    }
}
