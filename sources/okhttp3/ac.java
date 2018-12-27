package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import javax.annotation.Nullable;

public final class ac {
    /* renamed from: a */
    final C2895a f12181a;
    /* renamed from: b */
    final Proxy f12182b;
    /* renamed from: c */
    final InetSocketAddress f12183c;

    public ac(C2895a c2895a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c2895a == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f12181a = c2895a;
            this.f12182b = proxy;
            this.f12183c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C2895a m14034a() {
        return this.f12181a;
    }

    /* renamed from: b */
    public Proxy m14035b() {
        return this.f12182b;
    }

    /* renamed from: c */
    public InetSocketAddress m14036c() {
        return this.f12183c;
    }

    /* renamed from: d */
    public boolean m14037d() {
        return this.f12181a.f12148i != null && this.f12182b.type() == Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            if (acVar.f12181a.equals(this.f12181a) && acVar.f12182b.equals(this.f12182b) && acVar.f12183c.equals(this.f12183c) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        return ((((527 + this.f12181a.hashCode()) * 31) + this.f12182b.hashCode()) * 31) + this.f12183c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Route{");
        stringBuilder.append(this.f12183c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
