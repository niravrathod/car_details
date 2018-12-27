package com.bumptech.glide.load.p059b.p164a;

import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C1213r;
import com.bumptech.glide.load.p059b.C3421g;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.b.a.e */
public class C3400e implements C1206n<URL, InputStream> {
    /* renamed from: a */
    private final C1206n<C3421g, InputStream> f14293a;

    /* renamed from: com.bumptech.glide.load.b.a.e$a */
    public static class C3399a implements C1207o<URL, InputStream> {
        /* renamed from: a */
        public C1206n<URL, InputStream> mo970a(C1213r c1213r) {
            return new C3400e(c1213r.m4977a(C3421g.class, InputStream.class));
        }
    }

    /* renamed from: a */
    public boolean m17372a(URL url) {
        return true;
    }

    public C3400e(C1206n<C3421g, InputStream> c1206n) {
        this.f14293a = c1206n;
    }

    /* renamed from: a */
    public C1205a<InputStream> m17370a(URL url, int i, int i2, C3452e c3452e) {
        return this.f14293a.mo971a(new C3421g(url), i, i2, c3452e);
    }
}
