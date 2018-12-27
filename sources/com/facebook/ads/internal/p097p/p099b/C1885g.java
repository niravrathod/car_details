package com.facebook.ads.internal.p097p.p099b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.p097p.p099b.p100a.C3820b;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.p.b.g */
final class C1885g {
    /* renamed from: a */
    private final AtomicInteger f5736a = new AtomicInteger(0);
    /* renamed from: b */
    private final String f5737b;
    /* renamed from: c */
    private volatile C3823e f5738c;
    /* renamed from: d */
    private final List<C1875b> f5739d = new CopyOnWriteArrayList();
    /* renamed from: e */
    private final C1875b f5740e;
    /* renamed from: f */
    private final C1876c f5741f;

    /* renamed from: com.facebook.ads.internal.p.b.g$a */
    private static final class C3824a extends Handler implements C1875b {
        /* renamed from: a */
        private final String f15259a;
        /* renamed from: b */
        private final List<C1875b> f15260b;

        public C3824a(String str, List<C1875b> list) {
            super(Looper.getMainLooper());
            this.f15259a = str;
            this.f15260b = list;
        }

        /* renamed from: a */
        public void mo1401a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        public void handleMessage(Message message) {
            for (C1875b a : this.f15260b) {
                a.mo1401a((File) message.obj, this.f15259a, message.arg1);
            }
        }
    }

    public C1885g(String str, C1876c c1876c) {
        this.f5737b = (String) C1886j.m7191a(str);
        this.f5741f = (C1876c) C1886j.m7191a(c1876c);
        this.f5740e = new C3824a(str, this.f5739d);
    }

    /* renamed from: c */
    private synchronized void m7185c() {
        this.f5738c = this.f5738c == null ? m7187e() : this.f5738c;
    }

    /* renamed from: d */
    private synchronized void m7186d() {
        if (this.f5736a.decrementAndGet() <= 0) {
            this.f5738c.m7204a();
            this.f5738c = null;
        }
    }

    /* renamed from: e */
    private C3823e m7187e() {
        C3823e c3823e = new C3823e(new C3825h(this.f5737b), new C3820b(this.f5741f.m7155a(this.f5737b), this.f5741f.f5712c));
        c3823e.m19082a(this.f5740e);
        return c3823e;
    }

    /* renamed from: a */
    public void m7188a() {
        this.f5739d.clear();
        if (this.f5738c != null) {
            this.f5738c.m19082a(null);
            this.f5738c.m7204a();
            this.f5738c = null;
        }
        this.f5736a.set(0);
    }

    /* renamed from: a */
    public void m7189a(C1877d c1877d, Socket socket) {
        m7185c();
        try {
            this.f5736a.incrementAndGet();
            this.f5738c.m19083a(c1877d, socket);
        } finally {
            m7186d();
        }
    }

    /* renamed from: b */
    public int m7190b() {
        return this.f5736a.get();
    }
}
