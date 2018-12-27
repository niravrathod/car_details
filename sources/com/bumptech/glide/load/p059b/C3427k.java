package com.bumptech.glide.load.p059b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p057a.p058a.C1183b;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.b.k */
public final class C3427k implements C1206n<Uri, File> {
    /* renamed from: a */
    private final Context f14328a;

    /* renamed from: com.bumptech.glide.load.b.k$a */
    public static final class C3425a implements C1207o<Uri, File> {
        /* renamed from: a */
        private final Context f14324a;

        public C3425a(Context context) {
            this.f14324a = context;
        }

        /* renamed from: a */
        public C1206n<Uri, File> mo970a(C1213r c1213r) {
            return new C3427k(this.f14324a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.k$b */
    private static class C3426b implements C1188d<File> {
        /* renamed from: a */
        private static final String[] f14325a = new String[]{"_data"};
        /* renamed from: b */
        private final Context f14326b;
        /* renamed from: c */
        private final Uri f14327c;

        /* renamed from: b */
        public void mo961b() {
        }

        /* renamed from: c */
        public void mo962c() {
        }

        C3426b(Context context, Uri uri) {
            this.f14326b = context;
            this.f14327c = uri;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super File> c1187a) {
            priority = this.f14326b.getContentResolver().query(this.f14327c, f14325a, null, null, null);
            Object obj = null;
            if (priority != null) {
                try {
                    if (priority.moveToFirst()) {
                        obj = priority.getString(priority.getColumnIndexOrThrow("_data"));
                    }
                    priority.close();
                } catch (Throwable th) {
                    priority.close();
                }
            }
            if (TextUtils.isEmpty(obj) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to find file path for: ");
                stringBuilder.append(this.f14327c);
                c1187a.mo985a(new FileNotFoundException(stringBuilder.toString()));
                return;
            }
            c1187a.mo986a(new File(obj));
        }

        /* renamed from: a */
        public Class<File> mo959a() {
            return File.class;
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    public C3427k(Context context) {
        this.f14328a = context;
    }

    /* renamed from: a */
    public C1205a<File> m17457a(Uri uri, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(uri), new C3426b(this.f14328a, uri));
    }

    /* renamed from: a */
    public boolean m17459a(Uri uri) {
        return C1183b.m4914a(uri);
    }
}
