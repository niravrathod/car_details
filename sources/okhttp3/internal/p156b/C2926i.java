package okhttp3.internal.p156b;

import java.net.Proxy.Type;
import okhttp3.C2990y;
import okhttp3.HttpUrl;

/* renamed from: okhttp3.internal.b.i */
public final class C2926i {
    /* renamed from: a */
    public static String m14173a(C2990y c2990y, Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2990y.m14624b());
        stringBuilder.append(' ');
        if (C2926i.m14174b(c2990y, type) != null) {
            stringBuilder.append(c2990y.m14623a());
        } else {
            stringBuilder.append(C2926i.m14172a(c2990y.m14623a()));
        }
        stringBuilder.append(" HTTP/1.1");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static boolean m14174b(C2990y c2990y, Type type) {
        return (c2990y.m14630g() == null && type == Type.HTTP) ? true : null;
    }

    /* renamed from: a */
    public static String m14172a(HttpUrl httpUrl) {
        String h = httpUrl.m13969h();
        httpUrl = httpUrl.m13971j();
        if (httpUrl == null) {
            return h;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(h);
        stringBuilder.append('?');
        stringBuilder.append(httpUrl);
        return stringBuilder.toString();
    }
}
