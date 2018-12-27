package com.bumptech.glide.load.p059b.p164a;

import android.net.Uri;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C1213r;
import com.bumptech.glide.load.p059b.C3421g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.a.b */
public class C3394b implements C1206n<Uri, InputStream> {
    /* renamed from: a */
    private static final Set<String> f14287a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    /* renamed from: b */
    private final C1206n<C3421g, InputStream> f14288b;

    /* renamed from: com.bumptech.glide.load.b.a.b$a */
    public static class C3393a implements C1207o<Uri, InputStream> {
        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3394b(c1213r.m4977a(C3421g.class, InputStream.class));
        }
    }

    public C3394b(C1206n<C3421g, InputStream> c1206n) {
        this.f14288b = c1206n;
    }

    /* renamed from: a */
    public C1205a<InputStream> m17353a(Uri uri, int i, int i2, C3452e c3452e) {
        return this.f14288b.mo971a(new C3421g(uri.toString()), i, i2, c3452e);
    }

    /* renamed from: a */
    public boolean m17355a(Uri uri) {
        return f14287a.contains(uri.getScheme());
    }
}
