package com.feedbox.p121a.p122a;

import com.google.gson.p140a.C2621c;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.a.a.a */
public final class C2096a {
    @C2621c(a = "enabled")
    /* renamed from: a */
    private boolean f6415a;
    @C2621c(a = "admobAppId")
    /* renamed from: b */
    private final String f6416b;
    @C2621c(a = "bannerAdHomePageId")
    /* renamed from: c */
    private final String f6417c;
    @C2621c(a = "bannerAdDetailPageId")
    /* renamed from: d */
    private final String f6418d;
    @C2621c(a = "bannerAdPlayerPageId")
    /* renamed from: e */
    private final String f6419e;
    @C2621c(a = "interstitialAdExitScreenId")
    /* renamed from: f */
    private final String f6420f;

    public C2096a() {
        this(false, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2096a) {
                C2096a c2096a = (C2096a) obj;
                if ((this.f6415a == c2096a.f6415a ? 1 : null) != null && C2885g.m13909a(this.f6416b, c2096a.f6416b) && C2885g.m13909a(this.f6417c, c2096a.f6417c) && C2885g.m13909a(this.f6418d, c2096a.f6418d) && C2885g.m13909a(this.f6419e, c2096a.f6419e) && C2885g.m13909a(this.f6420f, c2096a.f6420f)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f6415a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        String str = this.f6416b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6417c;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6418d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6419e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6420f;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdsData(enabled=");
        stringBuilder.append(this.f6415a);
        stringBuilder.append(", admobAppId=");
        stringBuilder.append(this.f6416b);
        stringBuilder.append(", bannerAdHomePageId=");
        stringBuilder.append(this.f6417c);
        stringBuilder.append(", bannerAdDetailPageId=");
        stringBuilder.append(this.f6418d);
        stringBuilder.append(", bannerAdPlayerPageId=");
        stringBuilder.append(this.f6419e);
        stringBuilder.append(", interstitialAdExitScreenId=");
        stringBuilder.append(this.f6420f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C2096a(boolean z, String str, String str2, String str3, String str4, String str5) {
        C2885g.m13910b(str, "admobAppId");
        C2885g.m13910b(str2, "bannerAdHomePageId");
        C2885g.m13910b(str3, "bannerAdDetailPageId");
        C2885g.m13910b(str4, "bannerAdPlayerPageId");
        C2885g.m13910b(str5, "interstitialAdExitScreenId");
        this.f6415a = z;
        this.f6416b = str;
        this.f6417c = str2;
        this.f6418d = str3;
        this.f6419e = str4;
        this.f6420f = str5;
    }

    /* renamed from: a */
    public final void m7649a(boolean z) {
        this.f6415a = z;
    }

    /* renamed from: a */
    public final boolean m7650a() {
        return this.f6415a;
    }

    /* renamed from: b */
    public final String m7651b() {
        return this.f6417c;
    }

    /* renamed from: c */
    public final String m7652c() {
        return this.f6418d;
    }

    /* renamed from: d */
    public final String m7653d() {
        return this.f6419e;
    }

    public /* synthetic */ C2096a(boolean z, String str, String str2, String str3, String str4, String str5, int i, C2884f c2884f) {
        if ((i & 1) != null) {
            z = false;
        }
        if ((i & 2) != null) {
            str = "ca-app-pub-8646722329420776~7776091435";
        }
        String str6 = str;
        if ((i & 4) != null) {
            str2 = "ca-app-pub-8646722329420776/1489884684";
        }
        String str7 = str2;
        if ((i & 8) != null) {
            str3 = "ca-app-pub-8646722329420776/6407169440";
        }
        String str8 = str3;
        if ((i & 16) != null) {
            str4 = "ca-app-pub-8646722329420776/3049969241";
        }
        String str9 = str4;
        if ((i & 32) != null) {
            str5 = "ca-app-pub-8646722329420776/1636159655";
        }
        this(z, str6, str7, str8, str9, str5);
    }
}
