package com.bumptech.glide.load.p059b;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C4508a;
import com.bumptech.glide.load.p057a.C4510i;
import com.bumptech.glide.load.p057a.C4512n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.w */
public class C3448w<Data> implements C1206n<Uri, Data> {
    /* renamed from: a */
    private static final Set<String> f14352a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    /* renamed from: b */
    private final C1214c<Data> f14353b;

    /* renamed from: com.bumptech.glide.load.b.w$c */
    public interface C1214c<Data> {
        /* renamed from: a */
        C1188d<Data> mo987a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.b.w$a */
    public static final class C3445a implements C1207o<Uri, AssetFileDescriptor>, C1214c<AssetFileDescriptor> {
        /* renamed from: a */
        private final ContentResolver f14349a;

        public C3445a(ContentResolver contentResolver) {
            this.f14349a = contentResolver;
        }

        /* renamed from: a */
        public C1206n<Uri, AssetFileDescriptor> mo970a(C1213r c1213r) {
            return new C3448w(this);
        }

        /* renamed from: a */
        public C1188d<AssetFileDescriptor> mo987a(Uri uri) {
            return new C4508a(this.f14349a, uri);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$b */
    public static class C3446b implements C1207o<Uri, ParcelFileDescriptor>, C1214c<ParcelFileDescriptor> {
        /* renamed from: a */
        private final ContentResolver f14350a;

        public C3446b(ContentResolver contentResolver) {
            this.f14350a = contentResolver;
        }

        /* renamed from: a */
        public C1188d<ParcelFileDescriptor> mo987a(Uri uri) {
            return new C4510i(this.f14350a, uri);
        }

        /* renamed from: a */
        public C1206n<Uri, ParcelFileDescriptor> mo970a(C1213r c1213r) {
            return new C3448w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$d */
    public static class C3447d implements C1207o<Uri, InputStream>, C1214c<InputStream> {
        /* renamed from: a */
        private final ContentResolver f14351a;

        public C3447d(ContentResolver contentResolver) {
            this.f14351a = contentResolver;
        }

        /* renamed from: a */
        public C1188d<InputStream> mo987a(Uri uri) {
            return new C4512n(this.f14351a, uri);
        }

        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3448w(this);
        }
    }

    public C3448w(C1214c<Data> c1214c) {
        this.f14353b = c1214c;
    }

    /* renamed from: a */
    public C1205a<Data> m17511a(Uri uri, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(uri), this.f14353b.mo987a(uri));
    }

    /* renamed from: a */
    public boolean m17513a(Uri uri) {
        return f14352a.contains(uri.getScheme());
    }
}
