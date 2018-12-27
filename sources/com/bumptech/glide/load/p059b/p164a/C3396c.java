package com.bumptech.glide.load.p059b.p164a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.p058a.C1183b;
import com.bumptech.glide.load.p057a.p058a.C3380c;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C1213r;
import com.bumptech.glide.p163f.C3370b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.c */
public class C3396c implements C1206n<Uri, InputStream> {
    /* renamed from: a */
    private final Context f14290a;

    /* renamed from: com.bumptech.glide.load.b.a.c$a */
    public static class C3395a implements C1207o<Uri, InputStream> {
        /* renamed from: a */
        private final Context f14289a;

        public C3395a(Context context) {
            this.f14289a = context;
        }

        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3396c(this.f14289a);
        }
    }

    public C3396c(Context context) {
        this.f14290a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1205a<InputStream> m17358a(Uri uri, int i, int i2, C3452e c3452e) {
        return C1183b.m4913a(i, i2) != 0 ? new C1205a(new C3370b(uri), C3380c.m17302a(this.f14290a, uri)) : null;
    }

    /* renamed from: a */
    public boolean m17360a(Uri uri) {
        return C1183b.m4916c(uri);
    }
}
