package okhttp3;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.C4389x.C4388a;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.n */
public final class C2974n {
    /* renamed from: a */
    private int f12584a = 64;
    /* renamed from: b */
    private int f12585b = 5;
    @Nullable
    /* renamed from: c */
    private Runnable f12586c;
    @Nullable
    /* renamed from: d */
    private ExecutorService f12587d;
    /* renamed from: e */
    private final Deque<C4388a> f12588e = new ArrayDeque();
    /* renamed from: f */
    private final Deque<C4388a> f12589f = new ArrayDeque();
    /* renamed from: g */
    private final Deque<C4389x> f12590g = new ArrayDeque();

    /* renamed from: a */
    public synchronized ExecutorService m14499a() {
        if (this.f12587d == null) {
            this.f12587d = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C2933c.m14192a("OkHttp Dispatcher", false));
        }
        return this.f12587d;
    }

    /* renamed from: c */
    private void m14498c() {
        if (this.f12589f.size() < this.f12584a && !this.f12588e.isEmpty()) {
            Iterator it = this.f12588e.iterator();
            while (it.hasNext()) {
                C4388a c4388a = (C4388a) it.next();
                if (m14497b(c4388a) < this.f12585b) {
                    it.remove();
                    this.f12589f.add(c4388a);
                    m14499a().execute(c4388a);
                }
                if (this.f12589f.size() >= this.f12584a) {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private int m14497b(C4388a c4388a) {
        int i = 0;
        for (C4388a c4388a2 : this.f12589f) {
            if (!c4388a2.m23928b().f18258d) {
                if (c4388a2.m23927a().equals(c4388a.m23927a())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    synchronized void m14501a(C4389x c4389x) {
        this.f12590g.add(c4389x);
    }

    /* renamed from: a */
    void m14500a(C4388a c4388a) {
        m14496a(this.f12589f, c4388a, true);
    }

    /* renamed from: b */
    void m14503b(C4389x c4389x) {
        m14496a(this.f12590g, c4389x, false);
    }

    /* renamed from: a */
    private <T> void m14496a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t) != null) {
                if (z) {
                    m14498c();
                }
                deque = m14502b();
                t = this.f12586c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (deque == null && t != null) {
            t.run();
        }
    }

    /* renamed from: b */
    public synchronized int m14502b() {
        return this.f12589f.size() + this.f12590g.size();
    }
}
