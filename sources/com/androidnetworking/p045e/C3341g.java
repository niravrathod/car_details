package com.androidnetworking.p045e;

import com.androidnetworking.model.Progress;
import com.androidnetworking.p044d.C1061e;
import okhttp3.C2984u;
import okhttp3.ab;
import okio.C2995s;
import okio.C4394e;
import okio.C4755c;
import okio.C4905m;
import okio.C4911h;

/* renamed from: com.androidnetworking.e.g */
public class C3341g extends ab {
    /* renamed from: a */
    private final ab f14179a;
    /* renamed from: b */
    private C4394e f14180b;
    /* renamed from: c */
    private C1082c f14181c;

    public C3341g(ab abVar, C1061e c1061e) {
        this.f14179a = abVar;
        if (c1061e != null) {
            this.f14181c = new C1082c(c1061e);
        }
    }

    /* renamed from: a */
    public C2984u mo914a() {
        return this.f14179a.mo914a();
    }

    /* renamed from: b */
    public long mo915b() {
        return this.f14179a.mo915b();
    }

    /* renamed from: c */
    public C4394e mo916c() {
        if (this.f14180b == null) {
            this.f14180b = C4905m.a(m17176a(this.f14179a.mo916c()));
        }
        return this.f14180b;
    }

    /* renamed from: a */
    private C2995s m17176a(C2995s c2995s) {
        return new C4911h(this, c2995s) {
            /* renamed from: a */
            long f18809a;
            /* renamed from: b */
            final /* synthetic */ C3341g f18810b;

            /* renamed from: a */
            public long m24902a(C4755c c4755c, long j) {
                c4755c = super.a(c4755c, j);
                this.f18809a += c4755c != -1 ? c4755c : 0;
                if (this.f18810b.f14181c != null) {
                    this.f18810b.f14181c.obtainMessage(1, new Progress(this.f18809a, this.f18810b.f14179a.mo915b())).sendToTarget();
                }
                return c4755c;
            }
        };
    }
}
