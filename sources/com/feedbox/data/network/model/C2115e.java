package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.util.ArrayList;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.data.network.model.e */
public final class C2115e {
    @C2621c(a = "video")
    @C2619a
    /* renamed from: a */
    private final Content f6463a;
    @C2621c(a = "related")
    @C2619a
    /* renamed from: b */
    private final ArrayList<Content> f6464b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2115e) {
                C2115e c2115e = (C2115e) obj;
                if (C2885g.m13909a(this.f6463a, c2115e.f6463a) && C2885g.m13909a(this.f6464b, c2115e.f6464b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Content content = this.f6463a;
        int i = 0;
        int hashCode = (content != null ? content.hashCode() : 0) * 31;
        ArrayList arrayList = this.f6464b;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RelatedModel(content=");
        stringBuilder.append(this.f6463a);
        stringBuilder.append(", relatedList=");
        stringBuilder.append(this.f6464b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final Content m7712a() {
        return this.f6463a;
    }

    /* renamed from: b */
    public final ArrayList<Content> m7713b() {
        return this.f6464b;
    }
}
