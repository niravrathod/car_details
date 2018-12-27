package okhttp3.internal.http2;

import okhttp3.internal.C2933c;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.a */
public final class C2950a {
    /* renamed from: a */
    public static final ByteString f12435a = ByteString.m14641a(":");
    /* renamed from: b */
    public static final ByteString f12436b = ByteString.m14641a(":status");
    /* renamed from: c */
    public static final ByteString f12437c = ByteString.m14641a(":method");
    /* renamed from: d */
    public static final ByteString f12438d = ByteString.m14641a(":path");
    /* renamed from: e */
    public static final ByteString f12439e = ByteString.m14641a(":scheme");
    /* renamed from: f */
    public static final ByteString f12440f = ByteString.m14641a(":authority");
    /* renamed from: g */
    public final ByteString f12441g;
    /* renamed from: h */
    public final ByteString f12442h;
    /* renamed from: i */
    final int f12443i;

    public C2950a(String str, String str2) {
        this(ByteString.m14641a(str), ByteString.m14641a(str2));
    }

    public C2950a(ByteString byteString, String str) {
        this(byteString, ByteString.m14641a(str));
    }

    public C2950a(ByteString byteString, ByteString byteString2) {
        this.f12441g = byteString;
        this.f12442h = byteString2;
        this.f12443i = (byteString.m14660h() + 32) + byteString2.m14660h();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C2950a)) {
            return false;
        }
        C2950a c2950a = (C2950a) obj;
        if (this.f12441g.equals(c2950a.f12441g) && this.f12442h.equals(c2950a.f12442h) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f12441g.hashCode()) * 31) + this.f12442h.hashCode();
    }

    public String toString() {
        return C2933c.m14186a("%s: %s", this.f12441g.m14647a(), this.f12442h.m14647a());
    }
}
