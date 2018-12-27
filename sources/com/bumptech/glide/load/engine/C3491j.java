package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob.C1220a;
import com.bumptech.glide.load.engine.p062c.C1256a;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p055g.p056a.C1167a.C1165c;
import com.bumptech.glide.p055g.p056a.C1170c;
import com.bumptech.glide.request.C1314f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.j */
class C3491j<R> implements C1165c, C1220a<R> {
    /* renamed from: a */
    private static final C1269a f14468a = new C1269a();
    /* renamed from: b */
    private static final Handler f14469b = new Handler(Looper.getMainLooper(), new C1270b());
    /* renamed from: c */
    private final List<C1314f> f14470c;
    /* renamed from: d */
    private final C1170c f14471d;
    /* renamed from: e */
    private final C0430a<C3491j<?>> f14472e;
    /* renamed from: f */
    private final C1269a f14473f;
    /* renamed from: g */
    private final C1271k f14474g;
    /* renamed from: h */
    private final C1256a f14475h;
    /* renamed from: i */
    private final C1256a f14476i;
    /* renamed from: j */
    private final C1256a f14477j;
    /* renamed from: k */
    private final C1256a f14478k;
    /* renamed from: l */
    private C1216c f14479l;
    /* renamed from: m */
    private boolean f14480m;
    /* renamed from: n */
    private boolean f14481n;
    /* renamed from: o */
    private boolean f14482o;
    /* renamed from: p */
    private boolean f14483p;
    /* renamed from: q */
    private C1277s<?> f14484q;
    /* renamed from: r */
    private DataSource f14485r;
    /* renamed from: s */
    private boolean f14486s;
    /* renamed from: t */
    private GlideException f14487t;
    /* renamed from: u */
    private boolean f14488u;
    /* renamed from: v */
    private List<C1314f> f14489v;
    /* renamed from: w */
    private C3493n<?> f14490w;
    /* renamed from: x */
    private DecodeJob<R> f14491x;
    /* renamed from: y */
    private volatile boolean f14492y;

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    static class C1269a {
        C1269a() {
        }

        /* renamed from: a */
        public <R> C3493n<R> m5139a(C1277s<R> c1277s, boolean z) {
            return new C3493n(c1277s, z, true);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    private static class C1270b implements Callback {
        C1270b() {
        }

        public boolean handleMessage(Message message) {
            C3491j c3491j = (C3491j) message.obj;
            switch (message.what) {
                case 1:
                    c3491j.m17719c();
                    break;
                case 2:
                    c3491j.m17721f();
                    break;
                case 3:
                    c3491j.m17720e();
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unrecognized message: ");
                    stringBuilder.append(message.what);
                    throw new IllegalStateException(stringBuilder.toString());
            }
            return true;
        }
    }

    C3491j(C1256a c1256a, C1256a c1256a2, C1256a c1256a3, C1256a c1256a4, C1271k c1271k, C0430a<C3491j<?>> c0430a) {
        this(c1256a, c1256a2, c1256a3, c1256a4, c1271k, c0430a, f14468a);
    }

    C3491j(C1256a c1256a, C1256a c1256a2, C1256a c1256a3, C1256a c1256a4, C1271k c1271k, C0430a<C3491j<?>> c0430a, C1269a c1269a) {
        this.f14470c = new ArrayList(2);
        this.f14471d = C1170c.m4851a();
        this.f14475h = c1256a;
        this.f14476i = c1256a2;
        this.f14477j = c1256a3;
        this.f14478k = c1256a4;
        this.f14474g = c1271k;
        this.f14472e = c0430a;
        this.f14473f = c1269a;
    }

    /* renamed from: a */
    C3491j<R> m17710a(C1216c c1216c, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14479l = c1216c;
        this.f14480m = z;
        this.f14481n = z2;
        this.f14482o = z3;
        this.f14483p = z4;
        return this;
    }

    /* renamed from: b */
    public void m17717b(DecodeJob<R> decodeJob) {
        C1256a c1256a;
        this.f14491x = decodeJob;
        if (decodeJob.m17552a()) {
            c1256a = this.f14475h;
        } else {
            c1256a = m17709g();
        }
        c1256a.execute(decodeJob);
    }

    /* renamed from: a */
    void m17714a(C1314f c1314f) {
        C1180j.m4896a();
        this.f14471d.mo957b();
        if (this.f14486s) {
            c1314f.mo1076a(this.f14490w, this.f14485r);
        } else if (this.f14488u) {
            c1314f.mo1075a(this.f14487t);
        } else {
            this.f14470c.add(c1314f);
        }
    }

    /* renamed from: b */
    void m17718b(C1314f c1314f) {
        C1180j.m4896a();
        this.f14471d.mo957b();
        if (!this.f14486s) {
            if (!this.f14488u) {
                this.f14470c.remove(c1314f);
                if (this.f14470c.isEmpty() != null) {
                    m17716b();
                    return;
                }
                return;
            }
        }
        m17707c(c1314f);
    }

    /* renamed from: a */
    boolean m17715a() {
        return this.f14483p;
    }

    /* renamed from: g */
    private C1256a m17709g() {
        if (this.f14481n) {
            return this.f14477j;
        }
        return this.f14482o ? this.f14478k : this.f14476i;
    }

    /* renamed from: c */
    private void m17707c(C1314f c1314f) {
        if (this.f14489v == null) {
            this.f14489v = new ArrayList(2);
        }
        if (!this.f14489v.contains(c1314f)) {
            this.f14489v.add(c1314f);
        }
    }

    /* renamed from: d */
    private boolean m17708d(C1314f c1314f) {
        return (this.f14489v == null || this.f14489v.contains(c1314f) == null) ? null : true;
    }

    /* renamed from: b */
    void m17716b() {
        if (!(this.f14488u || this.f14486s)) {
            if (!this.f14492y) {
                this.f14492y = true;
                this.f14491x.m17553b();
                this.f14474g.mo1039a(this, this.f14479l);
            }
        }
    }

    /* renamed from: c */
    void m17719c() {
        this.f14471d.mo957b();
        if (this.f14492y) {
            this.f14484q.mo1048f();
            m17706a(false);
        } else if (this.f14470c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else if (this.f14486s) {
            throw new IllegalStateException("Already have resource");
        } else {
            this.f14490w = this.f14473f.m5139a(this.f14484q, this.f14480m);
            this.f14486s = true;
            this.f14490w.m17730g();
            this.f14474g.mo1040a(this, this.f14479l, this.f14490w);
            int size = this.f14470c.size();
            for (int i = 0; i < size; i++) {
                C1314f c1314f = (C1314f) this.f14470c.get(i);
                if (!m17708d(c1314f)) {
                    this.f14490w.m17730g();
                    c1314f.mo1076a(this.f14490w, this.f14485r);
                }
            }
            this.f14490w.m17731h();
            m17706a(false);
        }
    }

    /* renamed from: e */
    void m17720e() {
        this.f14471d.mo957b();
        if (this.f14492y) {
            this.f14474g.mo1039a(this, this.f14479l);
            m17706a(false);
            return;
        }
        throw new IllegalStateException("Not cancelled");
    }

    /* renamed from: a */
    private void m17706a(boolean z) {
        C1180j.m4896a();
        this.f14470c.clear();
        this.f14479l = null;
        this.f14490w = null;
        this.f14484q = null;
        if (this.f14489v != null) {
            this.f14489v.clear();
        }
        this.f14488u = false;
        this.f14492y = false;
        this.f14486s = false;
        this.f14491x.m17551a(z);
        this.f14491x = null;
        this.f14487t = null;
        this.f14485r = null;
        this.f14472e.mo339a(this);
    }

    /* renamed from: a */
    public void mo1044a(C1277s<R> c1277s, DataSource dataSource) {
        this.f14484q = c1277s;
        this.f14485r = dataSource;
        f14469b.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: a */
    public void mo1043a(GlideException glideException) {
        this.f14487t = glideException;
        f14469b.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: a */
    public void mo1042a(DecodeJob<?> decodeJob) {
        m17709g().execute(decodeJob);
    }

    /* renamed from: f */
    void m17721f() {
        this.f14471d.mo957b();
        if (this.f14492y) {
            m17706a(false);
        } else if (this.f14470c.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (this.f14488u) {
            throw new IllegalStateException("Already failed once");
        } else {
            this.f14488u = true;
            this.f14474g.mo1040a(this, this.f14479l, null);
            for (C1314f c1314f : this.f14470c) {
                if (!m17708d(c1314f)) {
                    c1314f.mo1075a(this.f14487t);
                }
            }
            m17706a(false);
        }
    }

    public C1170c e_() {
        return this.f14471d;
    }
}
