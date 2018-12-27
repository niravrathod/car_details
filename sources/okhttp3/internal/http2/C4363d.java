package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C2981s;
import okhttp3.C2981s.C2980a;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.Protocol;
import okhttp3.aa;
import okhttp3.aa.C2896a;
import okhttp3.ab;
import okhttp3.internal.C2920a;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.p156b.C2921c;
import okhttp3.internal.p156b.C2924e;
import okhttp3.internal.p156b.C2926i;
import okhttp3.internal.p156b.C2927k;
import okhttp3.internal.p156b.C4346h;
import okio.ByteString;
import okio.C2994r;
import okio.C2995s;
import okio.C4755c;
import okio.C4905m;
import okio.C4911h;

/* renamed from: okhttp3.internal.http2.d */
public final class C4363d implements C2921c {
    /* renamed from: b */
    private static final ByteString f18168b = ByteString.m14641a("connection");
    /* renamed from: c */
    private static final ByteString f18169c = ByteString.m14641a("host");
    /* renamed from: d */
    private static final ByteString f18170d = ByteString.m14641a("keep-alive");
    /* renamed from: e */
    private static final ByteString f18171e = ByteString.m14641a("proxy-connection");
    /* renamed from: f */
    private static final ByteString f18172f = ByteString.m14641a("transfer-encoding");
    /* renamed from: g */
    private static final ByteString f18173g = ByteString.m14641a("te");
    /* renamed from: h */
    private static final ByteString f18174h = ByteString.m14641a("encoding");
    /* renamed from: i */
    private static final ByteString f18175i = ByteString.m14641a("upgrade");
    /* renamed from: j */
    private static final List<ByteString> f18176j = C2933c.m14191a(f18168b, f18169c, f18170d, f18171e, f18173g, f18172f, f18174h, f18175i, C2950a.f12437c, C2950a.f12438d, C2950a.f12439e, C2950a.f12440f);
    /* renamed from: k */
    private static final List<ByteString> f18177k = C2933c.m14191a(f18168b, f18169c, f18170d, f18171e, f18173g, f18172f, f18174h, f18175i);
    /* renamed from: a */
    final C2939f f18178a;
    /* renamed from: l */
    private final C2988w f18179l;
    /* renamed from: m */
    private final C2982a f18180m;
    /* renamed from: n */
    private final C2957e f18181n;
    /* renamed from: o */
    private C2960g f18182o;

    /* renamed from: okhttp3.internal.http2.d$a */
    class C4753a extends C4911h {
        /* renamed from: a */
        boolean f20807a = null;
        /* renamed from: b */
        long f20808b = null;
        /* renamed from: c */
        final /* synthetic */ C4363d f20809c;

        C4753a(C4363d c4363d, C2995s c2995s) {
            this.f20809c = c4363d;
            super(c2995s);
        }

        /* renamed from: a */
        public long m27480a(C4755c c4755c, long j) {
            try {
                c4755c = b().mo3615a(c4755c, j);
                if (c4755c > 0) {
                    this.f20808b += c4755c;
                }
                return c4755c;
            } catch (C4755c c4755c2) {
                m27479a(c4755c2);
                throw c4755c2;
            }
        }

        public void close() {
            super.close();
            m27479a(null);
        }

        /* renamed from: a */
        private void m27479a(IOException iOException) {
            if (!this.f20807a) {
                this.f20807a = true;
                this.f20809c.f18178a.m14241a(false, this.f20809c, this.f20808b, iOException);
            }
        }
    }

    public C4363d(C2988w c2988w, C2982a c2982a, C2939f c2939f, C2957e c2957e) {
        this.f18179l = c2988w;
        this.f18180m = c2982a;
        this.f18178a = c2939f;
        this.f18181n = c2957e;
    }

    /* renamed from: a */
    public C2994r mo3630a(C2990y c2990y, long j) {
        return this.f18182o.m14402h();
    }

    /* renamed from: a */
    public void mo3632a(C2990y c2990y) {
        if (this.f18182o == null) {
            this.f18182o = this.f18181n.m14344a(C4363d.m23855b(c2990y), c2990y.m14627d() != null);
            this.f18182o.m14399e().m14674a((long) this.f18180m.mo3622d(), TimeUnit.MILLISECONDS);
            this.f18182o.m14400f().m14674a((long) this.f18180m.mo3623e(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public void mo3631a() {
        this.f18181n.m14357b();
    }

    /* renamed from: b */
    public void mo3633b() {
        this.f18182o.m14402h().close();
    }

    /* renamed from: a */
    public C2896a mo3628a(boolean z) {
        C2896a a = C4363d.m23854a(this.f18182o.m14398d());
        return (z && C2920a.f12341a.mo3679a(a)) ? false : a;
    }

    /* renamed from: b */
    public static List<C2950a> m23855b(C2990y c2990y) {
        C2981s c = c2990y.m14626c();
        List<C2950a> arrayList = new ArrayList(c.m14546a() + 4);
        arrayList.add(new C2950a(C2950a.f12437c, c2990y.m14624b()));
        arrayList.add(new C2950a(C2950a.f12438d, C2926i.m14172a(c2990y.m14623a())));
        String a = c2990y.m14622a("Host");
        if (a != null) {
            arrayList.add(new C2950a(C2950a.f12440f, a));
        }
        arrayList.add(new C2950a(C2950a.f12439e, c2990y.m14623a().m13961b()));
        int a2 = c.m14546a();
        for (int i = null; i < a2; i++) {
            ByteString a3 = ByteString.m14641a(c.m14547a(i).toLowerCase(Locale.US));
            if (!f18176j.contains(a3)) {
                arrayList.add(new C2950a(a3, c.m14549b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C2896a m23854a(List<C2950a> list) {
        C2980a c2980a = new C2980a();
        int size = list.size();
        C2980a c2980a2 = c2980a;
        C2927k c2927k = null;
        for (int i = 0; i < size; i++) {
            C2950a c2950a = (C2950a) list.get(i);
            if (c2950a != null) {
                ByteString byteString = c2950a.f12441g;
                String a = c2950a.f12442h.m14647a();
                if (byteString.equals(C2950a.f12436b)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("HTTP/1.1 ");
                    stringBuilder.append(a);
                    c2927k = C2927k.m14175a(stringBuilder.toString());
                } else if (!f18177k.contains(byteString)) {
                    C2920a.f12341a.mo3685a(c2980a2, byteString.m14647a(), a);
                }
            } else if (c2927k != null && c2927k.f12347b == 100) {
                c2980a2 = new C2980a();
                c2927k = null;
            }
        }
        if (c2927k != null) {
            return new C2896a().m13998a(Protocol.HTTP_2).m13994a(c2927k.f12347b).m13996a(c2927k.f12348c).m14002a(c2980a2.m14539a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public ab mo3629a(aa aaVar) {
        this.f18178a.f12390c.m14525f(this.f18178a.f12389b);
        return new C4346h(aaVar.m14008a("Content-Type"), C2924e.m14155a(aaVar), C4905m.a(new C4753a(this, this.f18182o.m14401g())));
    }

    /* renamed from: c */
    public void mo3634c() {
        if (this.f18182o != null) {
            this.f18182o.m14394b(ErrorCode.CANCEL);
        }
    }
}
