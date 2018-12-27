package com.cuvora.carinfo.videomodule.ui.model;

import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.util.ArrayList;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.model.b */
public final class C3729b implements C1596b {
    @C2621c(a = "title")
    @C2619a
    /* renamed from: a */
    private final String f14951a;
    @C2621c(a = "seeAll")
    @C2619a
    /* renamed from: b */
    private final boolean f14952b;
    @C2621c(a = "railId")
    @C2619a
    /* renamed from: c */
    private final String f14953c;
    @C2621c(a = "railType")
    @C2619a
    /* renamed from: d */
    private final String f14954d;
    @C2621c(a = "rail")
    @C2619a
    /* renamed from: e */
    private final ArrayList<C3730d> f14955e;
    @C2621c(a = "aspectRatio")
    @C2619a
    /* renamed from: f */
    private final String f14956f;

    /* renamed from: c */
    public int mo1249c() {
        return 2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3729b) {
                C3729b c3729b = (C3729b) obj;
                if (C2885g.m13909a(this.f14951a, c3729b.f14951a)) {
                    if ((this.f14952b == c3729b.f14952b ? 1 : null) != null && C2885g.m13909a(this.f14953c, c3729b.f14953c) && C2885g.m13909a(this.f14954d, c3729b.f14954d) && C2885g.m13909a(this.f14955e, c3729b.f14955e) && C2885g.m13909a(this.f14956f, c3729b.f14956f)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f14951a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.f14952b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str2 = this.f14953c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f14954d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f14955e;
        hashCode = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        str2 = this.f14956f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HomeRailModel(title=");
        stringBuilder.append(this.f14951a);
        stringBuilder.append(", showSeeAll=");
        stringBuilder.append(this.f14952b);
        stringBuilder.append(", railId=");
        stringBuilder.append(this.f14953c);
        stringBuilder.append(", railType=");
        stringBuilder.append(this.f14954d);
        stringBuilder.append(", rails=");
        stringBuilder.append(this.f14955e);
        stringBuilder.append(", aspectRatio=");
        stringBuilder.append(this.f14956f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C3729b(String str, boolean z, String str2, String str3, ArrayList<C3730d> arrayList, String str4) {
        C2885g.m13910b(str, "title");
        C2885g.m13910b(str2, "railId");
        C2885g.m13910b(str3, "railType");
        C2885g.m13910b(arrayList, "rails");
        C2885g.m13910b(str4, "aspectRatio");
        this.f14951a = str;
        this.f14952b = z;
        this.f14953c = str2;
        this.f14954d = str3;
        this.f14955e = arrayList;
        this.f14956f = str4;
    }

    /* renamed from: d */
    public final String m18586d() {
        return this.f14951a;
    }

    /* renamed from: e */
    public final boolean m18587e() {
        return this.f14952b;
    }

    /* renamed from: f */
    public final String m18588f() {
        return this.f14953c;
    }

    /* renamed from: g */
    public final ArrayList<C3730d> m18589g() {
        return this.f14955e;
    }

    /* renamed from: h */
    public final String m18590h() {
        return this.f14956f;
    }

    /* renamed from: a */
    public int mo1247a() {
        String str = this.f14954d;
        switch (str.hashCode()) {
            case -1256220002:
                return str.equals("COLLECTION") ? R.layout.row_home_rail_collection : R.layout.row_home_rail_banner;
            case 2061072:
                return str.equals("CARD") ? R.layout.row_home_rail_card : R.layout.row_home_rail_banner;
            case 2228139:
                return str.equals("HTML") ? R.layout.row_home_rail_html : R.layout.row_home_rail_banner;
            case 62359119:
                return str.equals("ALBUM") ? R.layout.row_home_rail : R.layout.row_home_rail_banner;
            case 785535204:
                return str.equals("CAROUSAL") ? R.layout.row_home_rail_caraosal : R.layout.row_home_rail_banner;
            case 1951953708:
                boolean equals = str.equals("BANNER");
                return R.layout.row_home_rail_banner;
            default:
                return R.layout.row_home_rail_banner;
        }
    }

    /* renamed from: b */
    public Object mo1248b() {
        return this.f14953c;
    }
}
