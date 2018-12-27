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
import com.bumptech.glide.load.resource.bitmap.C3532w;
import com.bumptech.glide.p163f.C3370b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.d */
public class C3398d implements C1206n<Uri, InputStream> {
    /* renamed from: a */
    private final Context f14292a;

    /* renamed from: com.bumptech.glide.load.b.a.d$a */
    public static class C3397a implements C1207o<Uri, InputStream> {
        /* renamed from: a */
        private final Context f14291a;

        public C3397a(Context context) {
            this.f14291a = context;
        }

        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3398d(this.f14291a);
        }
    }

    public C3398d(Context context) {
        this.f14292a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C1205a<InputStream> m17364a(Uri uri, int i, int i2, C3452e c3452e) {
        return (C1183b.m4913a(i, i2) == 0 || m17363a(c3452e) == 0) ? null : new C1205a(new C3370b(uri), C3380c.m17304b(this.f14292a, uri));
    }

    /* renamed from: a */
    private boolean m17363a(C3452e c3452e) {
        Long l = (Long) c3452e.m17523a(C3532w.f14565a);
        return (l == null || l.longValue() != -1) ? null : true;
    }

    /* renamed from: a */
    public boolean m17366a(Uri uri) {
        return C1183b.m4915b(uri);
    }
}
