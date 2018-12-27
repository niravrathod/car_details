package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.data.network.model.d */
public final class C2114d {
    @C2621c(a = "id")
    @C2619a
    /* renamed from: a */
    private final String f6457a;
    @C2621c(a = "title")
    @C2619a
    /* renamed from: b */
    private final String f6458b;
    @C2621c(a = "railType")
    @C2619a
    /* renamed from: c */
    private final String f6459c;
    @C2621c(a = "packageId")
    @C2619a
    /* renamed from: d */
    private final String f6460d;
    @C2621c(a = "hasMore")
    @C2619a
    /* renamed from: e */
    private final boolean f6461e;
    @C2621c(a = "bgUrl")
    @C2619a
    /* renamed from: f */
    private final String f6462f;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2114d) {
                C2114d c2114d = (C2114d) obj;
                if (C2885g.m13909a(this.f6457a, c2114d.f6457a) && C2885g.m13909a(this.f6458b, c2114d.f6458b) && C2885g.m13909a(this.f6459c, c2114d.f6459c) && C2885g.m13909a(this.f6460d, c2114d.f6460d)) {
                    if ((this.f6461e == c2114d.f6461e ? 1 : null) != null && C2885g.m13909a(this.f6462f, c2114d.f6462f)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6457a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6458b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f6459c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f6460d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.f6461e;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.f6462f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rail(id=");
        stringBuilder.append(this.f6457a);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f6458b);
        stringBuilder.append(", railType=");
        stringBuilder.append(this.f6459c);
        stringBuilder.append(", packageId=");
        stringBuilder.append(this.f6460d);
        stringBuilder.append(", hasMore=");
        stringBuilder.append(this.f6461e);
        stringBuilder.append(", bgUrl=");
        stringBuilder.append(this.f6462f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m7708a() {
        return this.f6458b;
    }

    /* renamed from: b */
    public final String m7709b() {
        return this.f6459c;
    }

    /* renamed from: c */
    public final String m7710c() {
        return this.f6460d;
    }

    /* renamed from: d */
    public final boolean m7711d() {
        return this.f6461e;
    }
}
