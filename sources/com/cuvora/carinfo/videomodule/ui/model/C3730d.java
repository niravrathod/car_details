package com.cuvora.carinfo.videomodule.ui.model;

import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.model.d */
public final class C3730d implements C1596b {
    /* renamed from: a */
    private final String f14957a;
    /* renamed from: b */
    private final String f14958b;
    /* renamed from: c */
    private final String f14959c;
    /* renamed from: d */
    private final String f14960d;
    /* renamed from: e */
    private final String f14961e;
    /* renamed from: f */
    private final String f14962f;
    /* renamed from: g */
    private final String f14963g;
    /* renamed from: h */
    private final String f14964h;
    /* renamed from: i */
    private final String f14965i;
    /* renamed from: j */
    private final String f14966j;
    /* renamed from: k */
    private final int f14967k;
    /* renamed from: l */
    private final CtAction f14968l;
    /* renamed from: m */
    private final String f14969m;

    /* renamed from: c */
    public int mo1249c() {
        return 2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3730d) {
                C3730d c3730d = (C3730d) obj;
                if (C2885g.m13909a(this.f14957a, c3730d.f14957a) && C2885g.m13909a(this.f14958b, c3730d.f14958b) && C2885g.m13909a(this.f14959c, c3730d.f14959c) && C2885g.m13909a(this.f14960d, c3730d.f14960d) && C2885g.m13909a(this.f14961e, c3730d.f14961e) && C2885g.m13909a(this.f14962f, c3730d.f14962f) && C2885g.m13909a(this.f14963g, c3730d.f14963g) && C2885g.m13909a(this.f14964h, c3730d.f14964h) && C2885g.m13909a(this.f14965i, c3730d.f14965i) && C2885g.m13909a(this.f14966j, c3730d.f14966j)) {
                    if ((this.f14967k == c3730d.f14967k ? 1 : null) != null && C2885g.m13909a(this.f14968l, c3730d.f14968l) && C2885g.m13909a(this.f14969m, c3730d.f14969m)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f14957a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14958b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14959c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14960d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14961e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14962f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14963g;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14964h;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14965i;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14966j;
        hashCode = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f14967k) * 31;
        CtAction ctAction = this.f14968l;
        hashCode = (hashCode + (ctAction != null ? ctAction.hashCode() : 0)) * 31;
        str2 = this.f14969m;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RailItemModel(railId=");
        stringBuilder.append(this.f14957a);
        stringBuilder.append(", packId=");
        stringBuilder.append(this.f14958b);
        stringBuilder.append(", playId=");
        stringBuilder.append(this.f14959c);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f14960d);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.f14961e);
        stringBuilder.append(", subTitle=");
        stringBuilder.append(this.f14962f);
        stringBuilder.append(", views=");
        stringBuilder.append(this.f14963g);
        stringBuilder.append(", aspectRatio=");
        stringBuilder.append(this.f14964h);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.f14965i);
        stringBuilder.append(", railType=");
        stringBuilder.append(this.f14966j);
        stringBuilder.append(", index=");
        stringBuilder.append(this.f14967k);
        stringBuilder.append(", action=");
        stringBuilder.append(this.f14968l);
        stringBuilder.append(", contentType=");
        stringBuilder.append(this.f14969m);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C3730d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, CtAction ctAction, String str11) {
        C2885g.m13910b(str, "railId");
        C2885g.m13910b(str2, "packId");
        C2885g.m13910b(str3, "playId");
        C2885g.m13910b(str4, "title");
        C2885g.m13910b(str5, "imageUrl");
        C2885g.m13910b(str6, "subTitle");
        C2885g.m13910b(str7, "views");
        C2885g.m13910b(str8, "aspectRatio");
        C2885g.m13910b(str9, "duration");
        C2885g.m13910b(str10, "railType");
        C2885g.m13910b(ctAction, "action");
        C2885g.m13910b(str11, "contentType");
        this.f14957a = str;
        this.f14958b = str2;
        this.f14959c = str3;
        this.f14960d = str4;
        this.f14961e = str5;
        this.f14962f = str6;
        this.f14963g = str7;
        this.f14964h = str8;
        this.f14965i = str9;
        this.f14966j = str10;
        this.f14967k = i;
        this.f14968l = ctAction;
        this.f14969m = str11;
    }

    /* renamed from: d */
    public final String m18594d() {
        return this.f14957a;
    }

    /* renamed from: e */
    public final String m18595e() {
        return this.f14959c;
    }

    /* renamed from: f */
    public final String m18596f() {
        return this.f14960d;
    }

    /* renamed from: g */
    public final String m18597g() {
        return this.f14961e;
    }

    /* renamed from: h */
    public final String m18598h() {
        return this.f14962f;
    }

    /* renamed from: i */
    public final String m18599i() {
        return this.f14963g;
    }

    /* renamed from: j */
    public final String m18600j() {
        return this.f14964h;
    }

    /* renamed from: k */
    public final String m18601k() {
        return this.f14965i;
    }

    /* renamed from: l */
    public final int m18602l() {
        return this.f14967k;
    }

    /* renamed from: m */
    public final CtAction m18603m() {
        return this.f14968l;
    }

    /* renamed from: a */
    public int mo1247a() {
        String str = this.f14966j;
        switch (str.hashCode()) {
            case -1256220002:
                if (str.equals("COLLECTION")) {
                    return R.layout.row_collection;
                }
                break;
            case 2061072:
                if (str.equals("CARD")) {
                    return R.layout.row_card;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    return R.layout.row_album;
                }
                break;
            case 785535204:
                if (str.equals("CAROUSAL")) {
                    return R.layout.row_caraousal;
                }
                break;
            case 1808476171:
                if (str.equals("RELATED")) {
                    return R.layout.row_related_item;
                }
                break;
            case 2013072465:
                if (str.equals("DETAIL")) {
                    return R.layout.row_detail;
                }
                break;
            default:
                break;
        }
        return R.layout.row_banner;
    }

    /* renamed from: b */
    public Object mo1248b() {
        return this.f14959c;
    }
}
