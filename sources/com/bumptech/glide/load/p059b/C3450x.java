package com.bumptech.glide.load.p059b;

import android.net.Uri;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.x */
public class C3450x<Data> implements C1206n<Uri, Data> {
    /* renamed from: a */
    private static final Set<String> f14354a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    /* renamed from: b */
    private final C1206n<C3421g, Data> f14355b;

    /* renamed from: com.bumptech.glide.load.b.x$a */
    public static class C3449a implements C1207o<Uri, InputStream> {
        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3450x(c1213r.m4977a(C3421g.class, InputStream.class));
        }
    }

    public C3450x(C1206n<C3421g, Data> c1206n) {
        this.f14355b = c1206n;
    }

    /* renamed from: a */
    public C1205a<Data> m17516a(Uri uri, int i, int i2, C3452e c3452e) {
        return this.f14355b.mo971a(new C3421g(uri.toString()), i, i2, c3452e);
    }

    /* renamed from: a */
    public boolean m17518a(Uri uri) {
        return f14354a.contains(uri.getScheme());
    }
}
