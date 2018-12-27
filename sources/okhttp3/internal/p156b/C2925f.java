package okhttp3.internal.p156b;

/* renamed from: okhttp3.internal.b.f */
public final class C2925f {
    /* renamed from: a */
    public static boolean m14167a(String str) {
        if (!(str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE"))) {
            if (str.equals("MOVE") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m14168b(String str) {
        if (!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH"))) {
            if (str.equals("REPORT") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m14169c(String str) {
        return (str.equals("GET") || str.equals("HEAD") != null) ? null : true;
    }

    /* renamed from: d */
    public static boolean m14170d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m14171e(String str) {
        return str.equals("PROPFIND") ^ 1;
    }
}
