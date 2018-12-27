package com.androidnetworking.p045e;

import com.androidnetworking.model.Progress;
import com.androidnetworking.p044d.C1074q;
import okhttp3.C2984u;
import okhttp3.C2991z;
import okio.C2994r;
import okio.C4393d;
import okio.C4755c;
import okio.C4905m;
import okio.C4910g;

/* renamed from: com.androidnetworking.e.f */
public class C3340f extends C2991z {
    /* renamed from: a */
    private final C2991z f14176a;
    /* renamed from: b */
    private C4393d f14177b;
    /* renamed from: c */
    private C1086h f14178c;

    public C3340f(C2991z c2991z, C1074q c1074q) {
        this.f14176a = c2991z;
        if (c1074q != null) {
            this.f14178c = new C1086h(c1074q);
        }
    }

    /* renamed from: a */
    public C2984u mo911a() {
        return this.f14176a.mo911a();
    }

    /* renamed from: b */
    public long mo913b() {
        return this.f14176a.mo913b();
    }

    /* renamed from: a */
    public void mo912a(C4393d c4393d) {
        if (this.f14177b == null) {
            this.f14177b = C4905m.a(m17171a((C2994r) c4393d));
        }
        this.f14176a.mo912a(this.f14177b);
        this.f14177b.flush();
    }

    /* renamed from: a */
    private C2994r m17171a(C2994r c2994r) {
        return new C4910g(this, c2994r) {
            /* renamed from: a */
            long f18806a = 0;
            /* renamed from: b */
            long f18807b = 0;
            /* renamed from: c */
            final /* synthetic */ C3340f f18808c;

            public void a_(C4755c c4755c, long j) {
                super.a_(c4755c, j);
                if (this.f18807b == 0) {
                    this.f18807b = this.f18808c.mo913b();
                }
                this.f18806a += j;
                if (this.f18808c.f14178c != null) {
                    this.f18808c.f14178c.obtainMessage(1, new Progress(this.f18806a, this.f18807b)).sendToTarget();
                }
            }
        };
    }
}
