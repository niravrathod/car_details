package com.bumptech.glide.load.p059b;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.s */
public class C3436s<Data> implements C1206n<Integer, Data> {
    /* renamed from: a */
    private final C1206n<Uri, Data> f14342a;
    /* renamed from: b */
    private final Resources f14343b;

    /* renamed from: com.bumptech.glide.load.b.s$a */
    public static final class C3432a implements C1207o<Integer, AssetFileDescriptor> {
        /* renamed from: a */
        private final Resources f14338a;

        public C3432a(Resources resources) {
            this.f14338a = resources;
        }

        /* renamed from: a */
        public C1206n<Integer, AssetFileDescriptor> mo970a(C1213r c1213r) {
            return new C3436s(this.f14338a, c1213r.m4977a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$b */
    public static class C3433b implements C1207o<Integer, ParcelFileDescriptor> {
        /* renamed from: a */
        private final Resources f14339a;

        public C3433b(Resources resources) {
            this.f14339a = resources;
        }

        /* renamed from: a */
        public C1206n<Integer, ParcelFileDescriptor> mo970a(C1213r c1213r) {
            return new C3436s(this.f14339a, c1213r.m4977a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$c */
    public static class C3434c implements C1207o<Integer, InputStream> {
        /* renamed from: a */
        private final Resources f14340a;

        public C3434c(Resources resources) {
            this.f14340a = resources;
        }

        /* renamed from: a */
        public C1206n<Integer, InputStream> mo970a(C1213r c1213r) {
            return new C3436s(this.f14340a, c1213r.m4977a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$d */
    public static class C3435d implements C1207o<Integer, Uri> {
        /* renamed from: a */
        private final Resources f14341a;

        public C3435d(Resources resources) {
            this.f14341a = resources;
        }

        /* renamed from: a */
        public C1206n<Integer, Uri> mo970a(C1213r c1213r) {
            return new C3436s(this.f14341a, C3444v.m17502a());
        }
    }

    /* renamed from: a */
    public boolean m17482a(Integer num) {
        return true;
    }

    public C3436s(Resources resources, C1206n<Uri, Data> c1206n) {
        this.f14343b = resources;
        this.f14342a = c1206n;
    }

    /* renamed from: a */
    public C1205a<Data> m17480a(Integer num, int i, int i2, C3452e c3452e) {
        num = m17479b(num);
        if (num == null) {
            return null;
        }
        return this.f14342a.mo971a(num, i, i2, c3452e);
    }

    /* renamed from: b */
    private Uri m17479b(Integer num) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(this.f14343b.getResourcePackageName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f14343b.getResourceTypeName(num.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.f14343b.getResourceEntryName(num.intValue()));
            return Uri.parse(stringBuilder.toString());
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Received invalid resource id: ");
                stringBuilder2.append(num);
                Log.w("ResourceLoader", stringBuilder2.toString(), e);
            }
            return null;
        }
    }
}
