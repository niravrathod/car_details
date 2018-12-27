package com.androidnetworking.p043b;

import com.androidnetworking.common.Priority;
import com.androidnetworking.p045e.C1085e;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.androidnetworking.b.a */
public class C1039a extends ThreadPoolExecutor {

    /* renamed from: com.androidnetworking.b.a$a */
    private static final class C1038a extends FutureTask<C1085e> implements Comparable<C1038a> {
        /* renamed from: a */
        private final C1085e f3440a;

        public /* synthetic */ int compareTo(Object obj) {
            return m4415a((C1038a) obj);
        }

        public C1038a(C1085e c1085e) {
            super(c1085e, null);
            this.f3440a = c1085e;
        }

        /* renamed from: a */
        public int m4415a(C1038a c1038a) {
            Priority a = this.f3440a.m4578a();
            Priority a2 = c1038a.f3440a.m4578a();
            return a == a2 ? this.f3440a.f3585a - c1038a.f3440a.f3585a : a2.ordinal() - a.ordinal();
        }
    }

    C1039a(int i, ThreadFactory threadFactory) {
        super(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    public Future<?> submit(Runnable runnable) {
        Object c1038a = new C1038a((C1085e) runnable);
        execute(c1038a);
        return c1038a;
    }
}
