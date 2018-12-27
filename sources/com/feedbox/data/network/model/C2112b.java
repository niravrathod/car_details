package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.data.network.model.b */
public final class C2112b {
    @C2621c(a = "layout")
    @C2619a
    /* renamed from: a */
    private final C2111a f6454a;
    @C2621c(a = "packages")
    @C2619a
    /* renamed from: b */
    private final HashMap<String, C2113c> f6455b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2112b) {
                C2112b c2112b = (C2112b) obj;
                if (C2885g.m13909a(this.f6454a, c2112b.f6454a) && C2885g.m13909a(this.f6455b, c2112b.f6455b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2111a c2111a = this.f6454a;
        int i = 0;
        int hashCode = (c2111a != null ? c2111a.hashCode() : 0) * 31;
        HashMap hashMap = this.f6455b;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutResponse(layout=");
        stringBuilder.append(this.f6454a);
        stringBuilder.append(", packageMap=");
        stringBuilder.append(this.f6455b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final C2111a m7705a() {
        return this.f6454a;
    }

    /* renamed from: b */
    public final HashMap<String, C2113c> m7706b() {
        return this.f6455b;
    }
}
