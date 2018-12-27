package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: okhttp3.p */
public abstract class C2977p {
    /* renamed from: a */
    public static final C2977p f12592a = new C43831();

    /* renamed from: okhttp3.p$a */
    public interface C2976a {
        /* renamed from: a */
        C2977p mo3678a(C2903e c2903e);
    }

    /* renamed from: okhttp3.p$1 */
    class C43831 extends C2977p {
        C43831() {
        }
    }

    /* renamed from: okhttp3.p$2 */
    class C43842 implements C2976a {
        /* renamed from: a */
        final /* synthetic */ C2977p f18236a;

        C43842(C2977p c2977p) {
            this.f18236a = c2977p;
        }

        /* renamed from: a */
        public C2977p mo3678a(C2903e c2903e) {
            return this.f18236a;
        }
    }

    /* renamed from: a */
    public void m14507a(C2903e c2903e) {
    }

    /* renamed from: a */
    public void m14508a(C2903e c2903e, long j) {
    }

    /* renamed from: a */
    public void m14509a(C2903e c2903e, IOException iOException) {
    }

    /* renamed from: a */
    public void m14510a(C2903e c2903e, String str) {
    }

    /* renamed from: a */
    public void m14511a(C2903e c2903e, String str, List<InetAddress> list) {
    }

    /* renamed from: a */
    public void m14512a(C2903e c2903e, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    /* renamed from: a */
    public void m14513a(C2903e c2903e, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
    }

    /* renamed from: a */
    public void m14514a(C2903e c2903e, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
    }

    /* renamed from: a */
    public void m14515a(C2903e c2903e, aa aaVar) {
    }

    /* renamed from: a */
    public void m14516a(C2903e c2903e, C2910i c2910i) {
    }

    /* renamed from: a */
    public void m14517a(C2903e c2903e, @Nullable C2979r c2979r) {
    }

    /* renamed from: a */
    public void m14518a(C2903e c2903e, C2990y c2990y) {
    }

    /* renamed from: b */
    public void m14519b(C2903e c2903e) {
    }

    /* renamed from: b */
    public void m14520b(C2903e c2903e, long j) {
    }

    /* renamed from: b */
    public void m14521b(C2903e c2903e, C2910i c2910i) {
    }

    /* renamed from: c */
    public void m14522c(C2903e c2903e) {
    }

    /* renamed from: d */
    public void m14523d(C2903e c2903e) {
    }

    /* renamed from: e */
    public void m14524e(C2903e c2903e) {
    }

    /* renamed from: f */
    public void m14525f(C2903e c2903e) {
    }

    /* renamed from: g */
    public void m14526g(C2903e c2903e) {
    }

    /* renamed from: a */
    static C2976a m14506a(C2977p c2977p) {
        return new C43842(c2977p);
    }
}
