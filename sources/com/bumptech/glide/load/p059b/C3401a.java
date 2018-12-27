package com.bumptech.glide.load.p059b;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C4509h;
import com.bumptech.glide.load.p057a.C4511m;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a */
public class C3401a<Data> implements C1206n<Uri, Data> {
    /* renamed from: a */
    private static final int f14294a = "file:///android_asset/".length();
    /* renamed from: b */
    private final AssetManager f14295b;
    /* renamed from: c */
    private final C1195a<Data> f14296c;

    /* renamed from: com.bumptech.glide.load.b.a$a */
    public interface C1195a<Data> {
        /* renamed from: a */
        C1188d<Data> mo969a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.b.a$b */
    public static class C3389b implements C1195a<ParcelFileDescriptor>, C1207o<Uri, ParcelFileDescriptor> {
        /* renamed from: a */
        private final AssetManager f14282a;

        public C3389b(AssetManager assetManager) {
            this.f14282a = assetManager;
        }

        /* renamed from: a */
        public C1206n<Uri, ParcelFileDescriptor> mo970a(C1213r c1213r) {
            return new C3401a(this.f14282a, this);
        }

        /* renamed from: a */
        public C1188d<ParcelFileDescriptor> mo969a(AssetManager assetManager, String str) {
            return new C4509h(assetManager, str);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.a$c */
    public static class C3390c implements C1195a<InputStream>, C1207o<Uri, InputStream> {
        /* renamed from: a */
        private final AssetManager f14283a;

        public C3390c(AssetManager assetManager) {
            this.f14283a = assetManager;
        }

        /* renamed from: a */
        public C1206n<Uri, InputStream> mo970a(C1213r c1213r) {
            return new C3401a(this.f14283a, this);
        }

        /* renamed from: a */
        public C1188d<InputStream> mo969a(AssetManager assetManager, String str) {
            return new C4511m(assetManager, str);
        }
    }

    public C3401a(AssetManager assetManager, C1195a<Data> c1195a) {
        this.f14295b = assetManager;
        this.f14296c = c1195a;
    }

    /* renamed from: a */
    public C1205a<Data> m17373a(Uri uri, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(uri), this.f14296c.mo969a(this.f14295b, uri.toString().substring(f14294a)));
    }

    /* renamed from: a */
    public boolean m17375a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || "android_asset".equals(uri.getPathSegments().get(0)) == null) {
            return false;
        }
        return true;
    }
}
