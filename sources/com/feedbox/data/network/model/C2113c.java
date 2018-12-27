package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.util.ArrayList;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.data.network.model.c */
public final class C2113c {
    @C2621c(a = "contents")
    @C2619a
    /* renamed from: a */
    private final ArrayList<Content> f6456a;

    public C2113c() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2113c) {
                if (C2885g.m13909a(this.f6456a, ((C2113c) obj).f6456a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ArrayList arrayList = this.f6456a;
        return arrayList != null ? arrayList.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PackageDetails(contents=");
        stringBuilder.append(this.f6456a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C2113c(ArrayList<Content> arrayList) {
        this.f6456a = arrayList;
    }

    public /* synthetic */ C2113c(ArrayList arrayList, int i, C2884f c2884f) {
        if ((i & 1) != 0) {
            arrayList = null;
        }
        this(arrayList);
    }

    /* renamed from: a */
    public final ArrayList<Content> m7707a() {
        return this.f6456a;
    }
}
