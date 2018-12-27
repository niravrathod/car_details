package com.bumptech.glide.load.p059b;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.p055g.C1178i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.n */
public interface C1206n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.b.n$a */
    public static class C1205a<Data> {
        /* renamed from: a */
        public final C1216c f3882a;
        /* renamed from: b */
        public final List<C1216c> f3883b;
        /* renamed from: c */
        public final C1188d<Data> f3884c;

        public C1205a(C1216c c1216c, C1188d<Data> c1188d) {
            this(c1216c, Collections.emptyList(), c1188d);
        }

        public C1205a(C1216c c1216c, List<C1216c> list, C1188d<Data> c1188d) {
            this.f3882a = (C1216c) C1178i.m4880a((Object) c1216c);
            this.f3883b = (List) C1178i.m4880a((Object) list);
            this.f3884c = (C1188d) C1178i.m4880a((Object) c1188d);
        }
    }

    /* renamed from: a */
    C1205a<Data> mo971a(Model model, int i, int i2, C3452e c3452e);

    /* renamed from: a */
    boolean mo972a(Model model);
}
