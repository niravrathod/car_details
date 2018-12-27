package com.facebook.ads.internal.adapters.p082a;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.d */
public class C1727d implements Serializable {
    /* renamed from: a */
    public static final int f5199a = Color.parseColor("#90949c");
    /* renamed from: b */
    public static final int f5200b = Color.parseColor("#4b4f56");
    /* renamed from: c */
    public static final int f5201c = Color.parseColor("#f6f7f9");
    /* renamed from: d */
    public static final int f5202d = Color.parseColor("#ff4080ff");
    /* renamed from: e */
    public static final int f5203e = Color.parseColor("#23272F");
    /* renamed from: f */
    public static final int f5204f = Color.parseColor("#ff4080ff");
    private static final long serialVersionUID = 8946536326456653736L;
    /* renamed from: g */
    private int f5205g = f5199a;
    /* renamed from: h */
    private int f5206h = f5200b;
    /* renamed from: i */
    private int f5207i = -16777216;
    /* renamed from: j */
    private int f5208j = f5201c;
    /* renamed from: k */
    private int f5209k = f5202d;
    /* renamed from: l */
    private int f5210l = -1;
    /* renamed from: m */
    private int f5211m = -16777216;

    /* renamed from: a */
    public static C1727d m6523a(JSONObject jSONObject) {
        C1727d c1727d = new C1727d();
        if (jSONObject != null) {
            Object optString = jSONObject.optString("accent_color");
            Object optString2 = jSONObject.optString("body_color");
            Object optString3 = jSONObject.optString("subtitle_color");
            Object optString4 = jSONObject.optString("bg_color");
            Object optString5 = jSONObject.optString("cta_color");
            Object optString6 = jSONObject.optString("cta_text_color");
            Object optString7 = jSONObject.optString("title_color");
            if (!TextUtils.isEmpty(optString)) {
                c1727d.f5205g = Color.parseColor(optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                c1727d.f5206h = Color.parseColor(optString2);
            }
            if (!TextUtils.isEmpty(optString3)) {
                c1727d.f5207i = Color.parseColor(optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                c1727d.f5208j = Color.parseColor(optString4);
            }
            if (!TextUtils.isEmpty(optString5)) {
                c1727d.f5209k = Color.parseColor(optString5);
            }
            if (!TextUtils.isEmpty(optString6)) {
                c1727d.f5210l = Color.parseColor(optString6);
            }
            if (!TextUtils.isEmpty(optString7)) {
                c1727d.f5211m = Color.parseColor(optString7);
            }
        }
        return c1727d;
    }

    /* renamed from: a */
    public int m6524a(boolean z) {
        return z ? -1 : this.f5205g;
    }

    /* renamed from: b */
    public int m6525b(boolean z) {
        return z ? -1 : this.f5206h;
    }

    /* renamed from: c */
    public int m6526c(boolean z) {
        return z ? -1 : this.f5207i;
    }

    /* renamed from: d */
    public int m6527d(boolean z) {
        return z ? f5203e : this.f5208j;
    }

    /* renamed from: e */
    public int m6528e(boolean z) {
        return z ? -1 : this.f5209k;
    }

    /* renamed from: f */
    public int m6529f(boolean z) {
        return z ? f5204f : this.f5210l;
    }

    /* renamed from: g */
    public int m6530g(boolean z) {
        return z ? -1 : this.f5211m;
    }
}
