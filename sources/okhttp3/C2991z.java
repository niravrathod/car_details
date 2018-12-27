package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okio.C4393d;
import okio.C4905m;

/* renamed from: okhttp3.z */
public abstract class C2991z {

    /* renamed from: okhttp3.z$1 */
    class C43901 extends C2991z {
        /* renamed from: a */
        final /* synthetic */ C2984u f18261a;
        /* renamed from: b */
        final /* synthetic */ int f18262b;
        /* renamed from: c */
        final /* synthetic */ byte[] f18263c;
        /* renamed from: d */
        final /* synthetic */ int f18264d;

        C43901(C2984u c2984u, int i, byte[] bArr, int i2) {
            this.f18261a = c2984u;
            this.f18262b = i;
            this.f18263c = bArr;
            this.f18264d = i2;
        }

        @Nullable
        /* renamed from: a */
        public C2984u mo911a() {
            return this.f18261a;
        }

        /* renamed from: b */
        public long mo913b() {
            return (long) this.f18262b;
        }

        /* renamed from: a */
        public void mo912a(C4393d c4393d) {
            c4393d.mo4555c(this.f18263c, this.f18264d, this.f18262b);
        }
    }

    /* renamed from: okhttp3.z$2 */
    class C43912 extends C2991z {
        /* renamed from: a */
        final /* synthetic */ C2984u f18265a;
        /* renamed from: b */
        final /* synthetic */ File f18266b;

        C43912(C2984u c2984u, File file) {
            this.f18265a = c2984u;
            this.f18266b = file;
        }

        @Nullable
        /* renamed from: a */
        public C2984u mo911a() {
            return this.f18265a;
        }

        /* renamed from: b */
        public long mo913b() {
            return this.f18266b.length();
        }

        /* renamed from: a */
        public void mo912a(C4393d c4393d) {
            Closeable closeable = null;
            try {
                Closeable a = C4905m.a(this.f18266b);
                try {
                    c4393d.mo4545a(a);
                    C2933c.m14194a(a);
                } catch (Throwable th) {
                    c4393d = th;
                    closeable = a;
                    C2933c.m14194a(closeable);
                    throw c4393d;
                }
            } catch (Throwable th2) {
                c4393d = th2;
                C2933c.m14194a(closeable);
                throw c4393d;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract C2984u mo911a();

    /* renamed from: a */
    public abstract void mo912a(C4393d c4393d);

    /* renamed from: b */
    public long mo913b() {
        return -1;
    }

    /* renamed from: a */
    public static C2991z m14632a(@Nullable C2984u c2984u, String str) {
        Charset charset = C2933c.f12356e;
        if (c2984u != null) {
            charset = c2984u.m14563b();
            if (charset == null) {
                charset = C2933c.f12356e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c2984u);
                stringBuilder.append("; charset=utf-8");
                c2984u = C2984u.m14560a(stringBuilder.toString());
            }
        }
        return C2991z.m14633a(c2984u, str.getBytes(charset));
    }

    /* renamed from: a */
    public static C2991z m14633a(@Nullable C2984u c2984u, byte[] bArr) {
        return C2991z.m14634a(c2984u, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C2991z m14634a(@Nullable C2984u c2984u, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C2933c.m14193a((long) bArr.length, (long) i, (long) i2);
            return new C43901(c2984u, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public static C2991z m14631a(@Nullable C2984u c2984u, File file) {
        if (file != null) {
            return new C43912(c2984u, file);
        }
        throw new NullPointerException("content == null");
    }
}
