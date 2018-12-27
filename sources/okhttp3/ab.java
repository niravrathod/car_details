package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okio.C4394e;
import okio.C4755c;

public abstract class ab implements Closeable {
    /* renamed from: a */
    private Reader f12180a;

    /* renamed from: okhttp3.ab$a */
    static final class C2897a extends Reader {
        /* renamed from: a */
        private final C4394e f12176a;
        /* renamed from: b */
        private final Charset f12177b;
        /* renamed from: c */
        private boolean f12178c;
        /* renamed from: d */
        private Reader f12179d;

        C2897a(C4394e c4394e, Charset charset) {
            this.f12176a = c4394e;
            this.f12177b = charset;
        }

        public int read(char[] cArr, int i, int i2) {
            if (this.f12178c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f12179d;
            if (reader == null) {
                Reader inputStreamReader = new InputStreamReader(this.f12176a.mo4558f(), C2933c.m14189a(this.f12176a, this.f12177b));
                this.f12179d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        public void close() {
            this.f12178c = true;
            if (this.f12179d != null) {
                this.f12179d.close();
            } else {
                this.f12176a.close();
            }
        }
    }

    /* renamed from: okhttp3.ab$1 */
    class C43361 extends ab {
        /* renamed from: a */
        final /* synthetic */ C2984u f18076a;
        /* renamed from: b */
        final /* synthetic */ long f18077b;
        /* renamed from: c */
        final /* synthetic */ C4394e f18078c;

        C43361(C2984u c2984u, long j, C4394e c4394e) {
            this.f18076a = c2984u;
            this.f18077b = j;
            this.f18078c = c4394e;
        }

        @Nullable
        /* renamed from: a */
        public C2984u mo914a() {
            return this.f18076a;
        }

        /* renamed from: b */
        public long mo915b() {
            return this.f18077b;
        }

        /* renamed from: c */
        public C4394e mo916c() {
            return this.f18078c;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract C2984u mo914a();

    /* renamed from: b */
    public abstract long mo915b();

    /* renamed from: c */
    public abstract C4394e mo916c();

    /* renamed from: d */
    public final InputStream m14031d() {
        return mo916c().mo4558f();
    }

    /* renamed from: e */
    public final Reader m14032e() {
        Reader reader = this.f12180a;
        if (reader != null) {
            return reader;
        }
        reader = new C2897a(mo916c(), m14027g());
        this.f12180a = reader;
        return reader;
    }

    /* renamed from: f */
    public final String m14033f() {
        Closeable c = mo916c();
        try {
            String a = c.mo4546a(C2933c.m14189a((C4394e) c, m14027g()));
            return a;
        } finally {
            C2933c.m14194a(c);
        }
    }

    /* renamed from: g */
    private Charset m14027g() {
        C2984u a = mo914a();
        return a != null ? a.m14562a(C2933c.f12356e) : C2933c.f12356e;
    }

    public void close() {
        C2933c.m14194a(mo916c());
    }

    /* renamed from: a */
    public static ab m14026a(@Nullable C2984u c2984u, byte[] bArr) {
        return m14025a(c2984u, (long) bArr.length, new C4755c().m27504b(bArr));
    }

    /* renamed from: a */
    public static ab m14025a(@Nullable C2984u c2984u, long j, C4394e c4394e) {
        if (c4394e != null) {
            return new C43361(c2984u, j, c4394e);
        }
        throw new NullPointerException("source == null");
    }
}
