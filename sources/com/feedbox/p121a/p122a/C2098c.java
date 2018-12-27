package com.feedbox.p121a.p122a;

import com.google.gson.p140a.C2621c;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.a.a.c */
public final class C2098c {
    @C2621c(a = "sidebarUrl")
    /* renamed from: a */
    private final String f6428a;
    @C2621c(a = "themeColor")
    /* renamed from: b */
    private final String f6429b;
    @C2621c(a = "title")
    /* renamed from: c */
    private final String f6430c;

    public C2098c() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2098c) {
                C2098c c2098c = (C2098c) obj;
                if (C2885g.m13909a(this.f6428a, c2098c.f6428a) && C2885g.m13909a(this.f6429b, c2098c.f6429b) && C2885g.m13909a(this.f6430c, c2098c.f6430c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6428a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6429b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f6430c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UiData(sidebarUrl=");
        stringBuilder.append(this.f6428a);
        stringBuilder.append(", themeColor=");
        stringBuilder.append(this.f6429b);
        stringBuilder.append(", homePageTitle=");
        stringBuilder.append(this.f6430c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C2098c(String str, String str2, String str3) {
        C2885g.m13910b(str, "sidebarUrl");
        C2885g.m13910b(str2, "themeColor");
        C2885g.m13910b(str3, "homePageTitle");
        this.f6428a = str;
        this.f6429b = str2;
        this.f6430c = str3;
    }

    public /* synthetic */ C2098c(String str, String str2, String str3, int i, C2884f c2884f) {
        if ((i & 1) != null) {
            str = "";
        }
        if ((i & 2) != null) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        this(str, str2, str3);
    }

    /* renamed from: a */
    public final String m7659a() {
        return this.f6430c;
    }
}
