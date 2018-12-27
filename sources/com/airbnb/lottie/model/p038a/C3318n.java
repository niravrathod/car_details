package com.airbnb.lottie.model.p038a;

import com.airbnb.lottie.p037e.C0959a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.n */
abstract class C3318n<V, O> implements C0980m<V, O> {
    /* renamed from: a */
    final List<C0959a<V>> f14079a;

    C3318n(V v) {
        this(Collections.singletonList(new C0959a(v)));
    }

    C3318n(List<C0959a<V>> list) {
        this.f14079a = list;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.f14079a.isEmpty()) {
            stringBuilder.append("values=");
            stringBuilder.append(Arrays.toString(this.f14079a.toArray()));
        }
        return stringBuilder.toString();
    }
}
