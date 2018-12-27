package com.bumptech.glide.load.p059b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;

/* renamed from: com.bumptech.glide.load.b.v */
public class C3444v<Model> implements C1206n<Model, Model> {
    /* renamed from: a */
    private static final C3444v<?> f14348a = new C3444v();

    /* renamed from: com.bumptech.glide.load.b.v$a */
    public static class C3442a<Model> implements C1207o<Model, Model> {
        /* renamed from: a */
        private static final C3442a<?> f14346a = new C3442a();

        /* renamed from: a */
        public static <T> C3442a<T> m17495a() {
            return f14346a;
        }

        /* renamed from: a */
        public C1206n<Model, Model> mo970a(C1213r c1213r) {
            return C3444v.m17502a();
        }
    }

    /* renamed from: com.bumptech.glide.load.b.v$b */
    private static class C3443b<Model> implements C1188d<Model> {
        /* renamed from: a */
        private final Model f14347a;

        /* renamed from: b */
        public void mo961b() {
        }

        /* renamed from: c */
        public void mo962c() {
        }

        C3443b(Model model) {
            this.f14347a = model;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super Model> c1187a) {
            c1187a.mo986a(this.f14347a);
        }

        /* renamed from: a */
        public Class<Model> mo959a() {
            return this.f14347a.getClass();
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: a */
    public boolean mo972a(Model model) {
        return true;
    }

    /* renamed from: a */
    public static <T> C3444v<T> m17502a() {
        return f14348a;
    }

    /* renamed from: a */
    public C1205a<Model> mo971a(Model model, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(model), new C3443b(model));
    }
}
