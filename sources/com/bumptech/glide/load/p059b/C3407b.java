package com.bumptech.glide.load.p059b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p163f.C3370b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.b */
public class C3407b<Data> implements C1206n<byte[], Data> {
    /* renamed from: a */
    private final C1196b<Data> f14301a;

    /* renamed from: com.bumptech.glide.load.b.b$b */
    public interface C1196b<Data> {
        /* renamed from: a */
        Class<Data> mo973a();

        /* renamed from: b */
        Data mo974b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.b.b$a */
    public static class C3403a implements C1207o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.b.b$a$1 */
        class C34021 implements C1196b<ByteBuffer> {
            /* renamed from: a */
            final /* synthetic */ C3403a f14297a;

            C34021(C3403a c3403a) {
                this.f14297a = c3403a;
            }

            /* renamed from: b */
            public /* synthetic */ Object mo974b(byte[] bArr) {
                return m17378a(bArr);
            }

            /* renamed from: a */
            public ByteBuffer m17378a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo973a() {
                return ByteBuffer.class;
            }
        }

        /* renamed from: a */
        public C1206n<byte[], ByteBuffer> mo970a(C1213r c1213r) {
            return new C3407b(new C34021(this));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.b$c */
    private static class C3404c<Data> implements C1188d<Data> {
        /* renamed from: a */
        private final byte[] f14298a;
        /* renamed from: b */
        private final C1196b<Data> f14299b;

        /* renamed from: b */
        public void mo961b() {
        }

        /* renamed from: c */
        public void mo962c() {
        }

        C3404c(byte[] bArr, C1196b<Data> c1196b) {
            this.f14298a = bArr;
            this.f14299b = c1196b;
        }

        /* renamed from: a */
        public void mo960a(Priority priority, C1187a<? super Data> c1187a) {
            c1187a.mo986a(this.f14299b.mo974b(this.f14298a));
        }

        /* renamed from: a */
        public Class<Data> mo959a() {
            return this.f14299b.mo973a();
        }

        /* renamed from: d */
        public DataSource mo963d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.b$d */
    public static class C3406d implements C1207o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.b.b$d$1 */
        class C34051 implements C1196b<InputStream> {
            /* renamed from: a */
            final /* synthetic */ C3406d f14300a;

            C34051(C3406d c3406d) {
                this.f14300a = c3406d;
            }

            /* renamed from: b */
            public /* synthetic */ Object mo974b(byte[] bArr) {
                return m17386a(bArr);
            }

            /* renamed from: a */
            public InputStream m17386a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            /* renamed from: a */
            public Class<InputStream> mo973a() {
                return InputStream.class;
            }
        }

        /* renamed from: a */
        public C1206n<byte[], InputStream> mo970a(C1213r c1213r) {
            return new C3407b(new C34051(this));
        }
    }

    /* renamed from: a */
    public boolean m17393a(byte[] bArr) {
        return true;
    }

    public C3407b(C1196b<Data> c1196b) {
        this.f14301a = c1196b;
    }

    /* renamed from: a */
    public C1205a<Data> m17391a(byte[] bArr, int i, int i2, C3452e c3452e) {
        return new C1205a(new C3370b(bArr), new C3404c(bArr, this.f14301a));
    }
}
