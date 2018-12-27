package com.bumptech.glide.load.engine.p061b;

import com.bumptech.glide.p055g.C1178i;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.b.c */
final class C1245c {
    /* renamed from: a */
    private final Map<String, C1243a> f3951a = new HashMap();
    /* renamed from: b */
    private final C1244b f3952b = new C1244b();

    /* renamed from: com.bumptech.glide.load.engine.b.c$a */
    private static class C1243a {
        /* renamed from: a */
        final Lock f3948a = new ReentrantLock();
        /* renamed from: b */
        int f3949b;

        C1243a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b.c$b */
    private static class C1244b {
        /* renamed from: a */
        private final Queue<C1243a> f3950a = new ArrayDeque();

        C1244b() {
        }

        /* renamed from: a */
        C1243a m5067a() {
            C1243a c1243a;
            synchronized (this.f3950a) {
                c1243a = (C1243a) this.f3950a.poll();
            }
            return c1243a == null ? new C1243a() : c1243a;
        }

        /* renamed from: a */
        void m5068a(C1243a c1243a) {
            synchronized (this.f3950a) {
                if (this.f3950a.size() < 10) {
                    this.f3950a.offer(c1243a);
                }
            }
        }
    }

    C1245c() {
    }

    /* renamed from: a */
    void m5069a(String str) {
        C1243a c1243a;
        synchronized (this) {
            c1243a = (C1243a) this.f3951a.get(str);
            if (c1243a == null) {
                c1243a = this.f3952b.m5067a();
                this.f3951a.put(str, c1243a);
            }
            c1243a.f3949b++;
        }
        c1243a.f3948a.lock();
    }

    /* renamed from: b */
    void m5070b(String str) {
        C1243a c1243a;
        synchronized (this) {
            c1243a = (C1243a) C1178i.m4880a(this.f3951a.get(str));
            if (c1243a.f3949b >= 1) {
                c1243a.f3949b--;
                if (c1243a.f3949b == 0) {
                    C1243a c1243a2 = (C1243a) this.f3951a.remove(str);
                    if (c1243a2.equals(c1243a)) {
                        this.f3952b.m5068a(c1243a2);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Removed the wrong lock, expected to remove: ");
                        stringBuilder.append(c1243a);
                        stringBuilder.append(", but actually removed: ");
                        stringBuilder.append(c1243a2);
                        stringBuilder.append(", safeKey: ");
                        stringBuilder.append(str);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Cannot release a lock that is not held, safeKey: ");
                stringBuilder2.append(str);
                stringBuilder2.append(", interestedThreads: ");
                stringBuilder2.append(c1243a.f3949b);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        c1243a.f3948a.unlock();
    }
}
