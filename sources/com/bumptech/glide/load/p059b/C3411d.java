package com.bumptech.glide.load.p059b;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p055g.C1171a;
import com.bumptech.glide.p163f.C3370b;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.d */
public class C3411d implements C1206n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.b.d$a */
    private static final class C3409a implements C1188d<ByteBuffer> {
        /* renamed from: a */
        private final File f14302a;

        /* renamed from: b */
        public void mo961b() {
        }

        /* renamed from: c */
        public void mo962c() {
        }

        C3409a(File file) {
            this.f14302a = file;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super ByteBuffer> c1187a) {
            try {
                c1187a.mo986a(C1171a.m4854a(this.f14302a));
            } catch (Exception e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                c1187a.mo985a(e);
            }
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo959a() {
            return ByteBuffer.class;
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.d$b */
    public static class C3410b implements C1207o<File, ByteBuffer> {
        /* renamed from: a */
        public C1206n<File, ByteBuffer> mo970a(C1213r c1213r) {
            return new C3411d();
        }
    }

    /* renamed from: a */
    public boolean m17404a(File file) {
        return true;
    }

    /* renamed from: a */
    public C1205a<ByteBuffer> m17402a(File file, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(file), new C3409a(file));
    }
}
