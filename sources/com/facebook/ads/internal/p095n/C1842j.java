package com.facebook.ads.internal.p095n;

import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.ads.internal.settings.C1964b;
import com.google.ads.mediation.facebook.FacebookAdapter;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.n.j */
public class C1842j {
    /* renamed from: a */
    private Typeface f5619a = Typeface.DEFAULT;
    /* renamed from: b */
    private int f5620b = -1;
    /* renamed from: c */
    private int f5621c = -16777216;
    /* renamed from: d */
    private int f5622d = -11643291;
    /* renamed from: e */
    private int f5623e = 0;
    /* renamed from: f */
    private int f5624f = -12420889;
    /* renamed from: g */
    private int f5625g = -12420889;
    /* renamed from: h */
    private boolean f5626h = C1964b.m7439d();
    /* renamed from: i */
    private boolean f5627i = C1964b.m7440e();

    public C1842j(JSONObject jSONObject) {
        int parseColor = jSONObject.getBoolean("background_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BACKGROUND_COLOR));
        int parseColor2 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_TITLE_TEXT_COLOR));
        int parseColor3 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_DESCRIPTION_TEXT_COLOR));
        int parseColor4 = jSONObject.getBoolean("button_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_COLOR));
        int parseColor5 = jSONObject.getBoolean("button_border_transparent") ? 0 : Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_BORDER_COLOR));
        int parseColor6 = Color.parseColor(jSONObject.getString(FacebookAdapter.KEY_BUTTON_TEXT_COLOR));
        Typeface create = Typeface.create(jSONObject.getString("android_typeface"), 0);
        this.f5620b = parseColor;
        this.f5621c = parseColor2;
        this.f5622d = parseColor3;
        this.f5623e = parseColor4;
        this.f5625g = parseColor5;
        this.f5624f = parseColor6;
        this.f5619a = create;
    }

    /* renamed from: a */
    public Typeface m7022a() {
        return this.f5619a;
    }

    /* renamed from: b */
    public int m7023b() {
        return this.f5620b;
    }

    /* renamed from: c */
    public int m7024c() {
        return this.f5621c;
    }

    /* renamed from: d */
    public int m7025d() {
        return this.f5622d;
    }

    /* renamed from: e */
    public int m7026e() {
        return this.f5623e;
    }

    /* renamed from: f */
    public int m7027f() {
        return this.f5624f;
    }

    /* renamed from: g */
    public int m7028g() {
        return this.f5625g;
    }

    /* renamed from: h */
    public int m7029h() {
        return 16;
    }

    /* renamed from: i */
    public int m7030i() {
        return 10;
    }

    /* renamed from: j */
    public boolean m7031j() {
        return this.f5626h;
    }
}
