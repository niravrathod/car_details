package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.util.List;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.data.network.model.a */
public final class C2111a {
    @C2621c(a = "rails")
    @C2619a
    /* renamed from: a */
    private final List<C2114d> f6453a;

    public C2111a() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2111a) {
                if (C2885g.m13909a(this.f6453a, ((C2111a) obj).f6453a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.f6453a;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Layout(rails=");
        stringBuilder.append(this.f6453a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C2111a(List<C2114d> list) {
        this.f6453a = list;
    }

    public /* synthetic */ C2111a(List list, int i, C2884f c2884f) {
        if ((i & 1) != 0) {
            list = null;
        }
        this(list);
    }

    /* renamed from: a */
    public final List<C2114d> m7704a() {
        return this.f6453a;
    }
}
