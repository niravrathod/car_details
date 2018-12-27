package com.facebook.ads.internal.protocol;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.protocol.h */
public final class C1904h {
    /* renamed from: a */
    private final C1903a f5837a;
    /* renamed from: b */
    private final Long f5838b;
    /* renamed from: c */
    private final String f5839c;
    /* renamed from: d */
    private final String f5840d;

    /* renamed from: com.facebook.ads.internal.protocol.h$a */
    private enum C1903a {
        ID,
        CREATIVE,
        NONE
    }

    public C1904h(Context context, String str, String str2, C1900f c1900f) {
        if (TextUtils.isEmpty(str)) {
            this.f5837a = C1903a.NONE;
            this.f5838b = null;
            this.f5840d = null;
            this.f5839c = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C1903a.valueOf(jSONObject.getString("type").toUpperCase())) {
                case ID:
                    this.f5837a = C1903a.ID;
                    this.f5838b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5840d = jSONObject.getString("device_id");
                    this.f5839c = null;
                    break;
                case CREATIVE:
                    this.f5837a = C1903a.CREATIVE;
                    this.f5838b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5840d = jSONObject.getString("device_id");
                    this.f5839c = new JSONObject(jSONObject.getString("payload")).toString();
                    break;
                default:
                    AdErrorType adErrorType = AdErrorType.BID_PAYLOAD_ERROR;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported BidPayload type ");
                    stringBuilder.append(jSONObject.getString("type"));
                    throw new C1895b(adErrorType, stringBuilder.toString());
            }
            if (!jSONObject.getString("sdk_version").equals("4.99.0")) {
                throw new C1895b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for SDK version %s being used on SDK version %s", new Object[]{this.f5838b, jSONObject.getString("sdk_version"), "4.99.0"}));
            } else if (!jSONObject.getString("resolved_placement_id").equals(str2)) {
                throw new C1895b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for placement %s being used on placement %s", new Object[]{this.f5838b, jSONObject.getString("resolved_placement_id"), str2}));
            } else if (jSONObject.getInt("template") != c1900f.m7240a()) {
                throw new C1895b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for template %s being used on template %s", new Object[]{this.f5838b, Integer.valueOf(jSONObject.getInt("template")), c1900f}));
            }
        } catch (Exception e) {
            C1953a.m7382a(context, "api", C1954b.f5990d, e);
            throw new C1895b(AdErrorType.BID_PAYLOAD_ERROR, "Invalid BidPayload", e);
        }
    }

    /* renamed from: a */
    public void m7244a(String str) {
        if (!this.f5840d.equals(str)) {
            throw new C1895b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for IDFA %s being used on IDFA %s", new Object[]{this.f5838b, this.f5840d, str}));
        }
    }

    /* renamed from: a */
    public boolean m7245a() {
        return this.f5837a == C1903a.CREATIVE;
    }

    /* renamed from: b */
    public String m7246b() {
        return this.f5839c;
    }

    /* renamed from: c */
    public boolean m7247c() {
        return this.f5837a != C1903a.NONE;
    }

    /* renamed from: d */
    public String m7248d() {
        return this.f5838b == null ? null : this.f5838b.toString();
    }
}
