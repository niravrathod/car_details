package okhttp3;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okhttp3.internal.connection.C2935d;
import okhttp3.internal.connection.C2939f;
import okhttp3.internal.connection.C2939f.C2938a;
import okhttp3.internal.connection.C4353c;
import okhttp3.internal.p159e.C2945f;

/* renamed from: okhttp3.j */
public final class C2967j {
    /* renamed from: c */
    static final /* synthetic */ boolean f12535c = (C2967j.class.desiredAssertionStatus() ^ true);
    /* renamed from: d */
    private static final Executor f12536d = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C2933c.m14192a("OkHttp ConnectionPool", true));
    /* renamed from: a */
    final C2935d f12537a;
    /* renamed from: b */
    boolean f12538b;
    /* renamed from: e */
    private final int f12539e;
    /* renamed from: f */
    private final long f12540f;
    /* renamed from: g */
    private final Runnable f12541g;
    /* renamed from: h */
    private final Deque<C4353c> f12542h;

    /* renamed from: okhttp3.j$1 */
    class C29661 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2967j f12534a;

        C29661(C2967j c2967j) {
            this.f12534a = c2967j;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r6 = this;
        L_0x0000:
            r0 = r6.f12534a;
            r1 = java.lang.System.nanoTime();
            r0 = r0.m14445a(r1);
            r2 = -1;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0011;
        L_0x0010:
            return;
        L_0x0011:
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0000;
        L_0x0017:
            r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r4 = r0 / r2;
            r2 = r2 * r4;
            r0 = r0 - r2;
            r2 = r6.f12534a;
            monitor-enter(r2);
            r3 = r6.f12534a;	 Catch:{ InterruptedException -> 0x002b }
            r0 = (int) r0;	 Catch:{ InterruptedException -> 0x002b }
            r3.wait(r4, r0);	 Catch:{ InterruptedException -> 0x002b }
            goto L_0x002b;
        L_0x0029:
            r0 = move-exception;
            goto L_0x002d;
        L_0x002b:
            monitor-exit(r2);	 Catch:{ all -> 0x0029 }
            goto L_0x0000;	 Catch:{ all -> 0x0029 }
        L_0x002d:
            monitor-exit(r2);	 Catch:{ all -> 0x0029 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.j.1.run():void");
        }
    }

    public C2967j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C2967j(int i, long j, TimeUnit timeUnit) {
        this.f12541g = new C29661(this);
        this.f12542h = new ArrayDeque();
        this.f12537a = new C2935d();
        this.f12539e = i;
        this.f12540f = timeUnit.toNanos(j);
        if (j <= 0) {
            timeUnit = new StringBuilder();
            timeUnit.append("keepAliveDuration <= 0: ");
            timeUnit.append(j);
            throw new IllegalArgumentException(timeUnit.toString());
        }
    }

    @Nullable
    /* renamed from: a */
    C4353c m14447a(C2895a c2895a, C2939f c2939f, ac acVar) {
        if (!f12535c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        for (C4353c c4353c : this.f12542h) {
            if (c4353c.m23810a(c2895a, acVar)) {
                c2939f.m14240a(c4353c, true);
                return c4353c;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    Socket m14446a(C2895a c2895a, C2939f c2939f) {
        if (!f12535c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        for (C4353c c4353c : this.f12542h) {
            if (c4353c.m23810a(c2895a, null) && c4353c.m23816f() && c4353c != c2939f.m14243c()) {
                return c2939f.m14236a(c4353c);
            }
        }
        return null;
    }

    /* renamed from: a */
    void m14448a(C4353c c4353c) {
        if (!f12535c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.f12538b) {
            this.f12538b = true;
            f12536d.execute(this.f12541g);
        }
        this.f12542h.add(c4353c);
    }

    /* renamed from: b */
    boolean m14449b(C4353c c4353c) {
        if (!f12535c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!c4353c.f18135a) {
            if (this.f12539e != 0) {
                notifyAll();
                return null;
            }
        }
        this.f12542h.remove(c4353c);
        return true;
    }

    /* renamed from: a */
    long m14445a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C4353c c4353c = null;
            int i = 0;
            int i2 = 0;
            for (C4353c c4353c2 : this.f12542h) {
                if (m14444a(c4353c2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c4353c2.f18139e;
                    if (j3 > j2) {
                        c4353c = c4353c2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f12540f) {
                if (i <= this.f12539e) {
                    if (i > 0) {
                        j = this.f12540f - j2;
                        return j;
                    } else if (i2 > 0) {
                        j = this.f12540f;
                        return j;
                    } else {
                        this.f12538b = false;
                        return -1;
                    }
                }
            }
            this.f12542h.remove(c4353c);
            C2933c.m14195a(c4353c.m23814d());
            return 0;
        }
    }

    /* renamed from: a */
    private int m14444a(C4353c c4353c, long j) {
        List list = c4353c.f18138d;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C2938a c2938a = (C2938a) reference;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("A connection to ");
                stringBuilder.append(c4353c.m23812b().m14034a().m13980a());
                stringBuilder.append(" was leaked. Did you forget to close a response body?");
                C2945f.m14270c().mo3652a(stringBuilder.toString(), c2938a.f12386a);
                list.remove(i);
                c4353c.f18135a = true;
                if (list.isEmpty()) {
                    c4353c.f18139e = j - this.f12540f;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
