package com.bumptech.glide.load.p059b.p164a;

import com.bumptech.glide.load.C1218d;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.C3385j;
import com.bumptech.glide.load.p059b.C1204m;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C1213r;
import com.bumptech.glide.load.p059b.C3421g;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.a */
public class C3392a implements C1206n<C3421g, InputStream> {
    /* renamed from: a */
    public static final C1218d<Integer> f14285a = C1218d.m4988a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    /* renamed from: b */
    private final C1204m<C3421g, C3421g> f14286b;

    /* renamed from: com.bumptech.glide.load.b.a.a$a */
    public static class C3391a implements C1207o<C3421g, InputStream> {
        /* renamed from: a */
        private final C1204m<C3421g, C3421g> f14284a = new C1204m(500);

        /* renamed from: a */
        public C1206n<C3421g, InputStream> mo970a(C1213r c1213r) {
            return new C3392a(this.f14284a);
        }
    }

    /* renamed from: a */
    public boolean m17350a(C3421g c3421g) {
        return true;
    }

    public C3392a() {
        this(null);
    }

    public C3392a(C1204m<C3421g, C3421g> c1204m) {
        this.f14286b = c1204m;
    }

    /* renamed from: a */
    public C1205a<InputStream> m17348a(C3421g c3421g, int i, int i2, C3452e c3452e) {
        if (this.f14286b != 0) {
            C3421g c3421g2 = (C3421g) this.f14286b.m4958a(c3421g, 0, 0);
            if (c3421g2 == null) {
                this.f14286b.m4959a(c3421g, 0, 0, c3421g);
            } else {
                c3421g = c3421g2;
            }
        }
        return new C1205a(c3421g, new C3385j(c3421g, ((Integer) c3452e.m17523a(f14285a)).intValue()));
    }
}
