package com.airbnb.lottie.p031a.p033b;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C0987h;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
public class C0923g {
    /* renamed from: a */
    private final List<C0922a<C0987h, Path>> f3104a;
    /* renamed from: b */
    private final List<C0922a<Integer, Integer>> f3105b;
    /* renamed from: c */
    private final List<Mask> f3106c;

    public C0923g(List<Mask> list) {
        this.f3106c = list;
        this.f3104a = new ArrayList(list.size());
        this.f3105b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f3104a.add(((Mask) list.get(i)).m4244b().mo877a());
            this.f3105b.add(((Mask) list.get(i)).m4245c().mo877a());
        }
    }

    /* renamed from: a */
    public List<Mask> m3996a() {
        return this.f3106c;
    }

    /* renamed from: b */
    public List<C0922a<C0987h, Path>> m3997b() {
        return this.f3104a;
    }

    /* renamed from: c */
    public List<C0922a<Integer, Integer>> m3998c() {
        return this.f3105b;
    }
}
