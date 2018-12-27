package com.bumptech.glide.load.p059b;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.u */
public class C3441u<Data> implements C1206n<String, Data> {
    /* renamed from: a */
    private final C1206n<Uri, Data> f14345a;

    /* renamed from: com.bumptech.glide.load.b.u$a */
    public static final class C3438a implements C1207o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C1206n<String, AssetFileDescriptor> mo970a(C1213r c1213r) {
            return new C3441u(c1213r.m4977a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$b */
    public static class C3439b implements C1207o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C1206n<String, ParcelFileDescriptor> mo970a(C1213r c1213r) {
            return new C3441u(c1213r.m4977a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$c */
    public static class C3440c implements C1207o<String, InputStream> {
        /* renamed from: a */
        public C1206n<String, InputStream> mo970a(C1213r c1213r) {
            return new C3441u(c1213r.m4977a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: a */
    public boolean m17494a(String str) {
        return true;
    }

    public C3441u(C1206n<Uri, Data> c1206n) {
        this.f14345a = c1206n;
    }

    /* renamed from: a */
    public C1205a<Data> m17492a(String str, int i, int i2, C3452e c3452e) {
        str = C3441u.m17489b(str);
        if (str != null) {
            if (this.f14345a.mo972a(str)) {
                return this.f14345a.mo971a(str, i, i2, c3452e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Uri m17489b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            str = C3441u.m17490c(str);
        } else {
            Uri parse = Uri.parse(str);
            str = parse.getScheme() == null ? C3441u.m17490c(str) : parse;
        }
        return str;
    }

    /* renamed from: c */
    private static Uri m17490c(String str) {
        return Uri.fromFile(new File(str));
    }
}
