package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.ac;

/* renamed from: okhttp3.internal.connection.d */
public final class C2935d {
    /* renamed from: a */
    private final Set<ac> f12375a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m14216a(ac acVar) {
        this.f12375a.add(acVar);
    }

    /* renamed from: b */
    public synchronized void m14217b(ac acVar) {
        this.f12375a.remove(acVar);
    }

    /* renamed from: c */
    public synchronized boolean m14218c(ac acVar) {
        return this.f12375a.contains(acVar);
    }
}
