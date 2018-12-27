package com.bumptech.glide.load.resource.p065d;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.C1159f;
import com.bumptech.glide.C3377g;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.C1265h;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p051b.C1129a;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p163f.C3370b;
import com.bumptech.glide.request.C1313e;
import com.bumptech.glide.request.p067a.C4785f;
import com.bumptech.glide.request.p068b.C1308b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.g */
class C1298g {
    /* renamed from: a */
    final C3377g f4077a;
    /* renamed from: b */
    private final C1129a f4078b;
    /* renamed from: c */
    private final Handler f4079c;
    /* renamed from: d */
    private final List<C1295b> f4080d;
    /* renamed from: e */
    private final C1232e f4081e;
    /* renamed from: f */
    private boolean f4082f;
    /* renamed from: g */
    private boolean f4083g;
    /* renamed from: h */
    private boolean f4084h;
    /* renamed from: i */
    private C1159f<Bitmap> f4085i;
    /* renamed from: j */
    private C4846a f4086j;
    /* renamed from: k */
    private boolean f4087k;
    /* renamed from: l */
    private C4846a f4088l;
    /* renamed from: m */
    private Bitmap f4089m;
    /* renamed from: n */
    private C3500h<Bitmap> f4090n;
    /* renamed from: o */
    private C4846a f4091o;
    /* renamed from: p */
    private C1297d f4092p;

    /* renamed from: com.bumptech.glide.load.resource.d.g$b */
    public interface C1295b {
        /* renamed from: f */
        void mo1071f();
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$c */
    private class C1296c implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1298g f4076a;

        C1296c(C1298g c1298g) {
            this.f4076a = c1298g;
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                this.f4076a.m5240a((C4846a) message.obj);
                return true;
            }
            if (message.what == 2) {
                this.f4076a.f4077a.m17288a((C4846a) message.obj);
            }
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$d */
    interface C1297d {
        /* renamed from: a */
        void m5230a();
    }

    /* renamed from: com.bumptech.glide.load.resource.d.g$a */
    static class C4846a extends C4785f<Bitmap> {
        /* renamed from: a */
        final int f21474a;
        /* renamed from: b */
        private final Handler f21475b;
        /* renamed from: c */
        private final long f21476c;
        /* renamed from: d */
        private Bitmap f21477d;

        C4846a(Handler handler, int i, long j) {
            this.f21475b = handler;
            this.f21474a = i;
            this.f21476c = j;
        }

        /* renamed from: a */
        Bitmap m28714a() {
            return this.f21477d;
        }

        /* renamed from: a */
        public void m28715a(Bitmap bitmap, C1308b<? super Bitmap> c1308b) {
            this.f21477d = bitmap;
            this.f21475b.sendMessageAtTime(this.f21475b.obtainMessage(1, this), this.f21476c);
        }
    }

    C1298g(C1143c c1143c, C1129a c1129a, int i, int i2, C3500h<Bitmap> c3500h, Bitmap bitmap) {
        this(c1143c.m4776a(), C1143c.m4771b(c1143c.m4782c()), c1129a, null, C1298g.m5231a(C1143c.m4771b(c1143c.m4782c()), i, i2), c3500h, bitmap);
    }

    C1298g(C1232e c1232e, C3377g c3377g, C1129a c1129a, Handler handler, C1159f<Bitmap> c1159f, C3500h<Bitmap> c3500h, Bitmap bitmap) {
        this.f4080d = new ArrayList();
        this.f4077a = c3377g;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C1296c(this));
        }
        this.f4081e = c1232e;
        this.f4079c = handler;
        this.f4085i = c1159f;
        this.f4078b = c1129a;
        m5239a(c3500h, bitmap);
    }

    /* renamed from: a */
    void m5239a(C3500h<Bitmap> c3500h, Bitmap bitmap) {
        this.f4090n = (C3500h) C1178i.m4880a((Object) c3500h);
        this.f4089m = (Bitmap) C1178i.m4880a((Object) bitmap);
        this.f4085i = this.f4085i.m4830a(new C1313e().m5312a((C3500h) c3500h));
    }

    /* renamed from: a */
    Bitmap m5238a() {
        return this.f4089m;
    }

    /* renamed from: a */
    void m5241a(C1295b c1295b) {
        if (this.f4087k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (this.f4080d.contains(c1295b)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        } else {
            boolean isEmpty = this.f4080d.isEmpty();
            this.f4080d.add(c1295b);
            if (isEmpty) {
                m5233k();
            }
        }
    }

    /* renamed from: b */
    void m5243b(C1295b c1295b) {
        this.f4080d.remove(c1295b);
        if (this.f4080d.isEmpty() != null) {
            m5234l();
        }
    }

    /* renamed from: b */
    int m5242b() {
        return m5250i().getWidth();
    }

    /* renamed from: c */
    int m5244c() {
        return m5250i().getHeight();
    }

    /* renamed from: d */
    int m5245d() {
        return this.f4078b.mo939g() + m5232j();
    }

    /* renamed from: e */
    int m5246e() {
        return this.f4086j != null ? this.f4086j.f21474a : -1;
    }

    /* renamed from: j */
    private int m5232j() {
        return C1180j.m4887a(m5250i().getWidth(), m5250i().getHeight(), m5250i().getConfig());
    }

    /* renamed from: f */
    ByteBuffer m5247f() {
        return this.f4078b.mo932a().asReadOnlyBuffer();
    }

    /* renamed from: g */
    int m5248g() {
        return this.f4078b.mo936d();
    }

    /* renamed from: k */
    private void m5233k() {
        if (!this.f4082f) {
            this.f4082f = true;
            this.f4087k = false;
            m5235m();
        }
    }

    /* renamed from: l */
    private void m5234l() {
        this.f4082f = false;
    }

    /* renamed from: h */
    void m5249h() {
        this.f4080d.clear();
        m5236n();
        m5234l();
        if (this.f4086j != null) {
            this.f4077a.m17288a(this.f4086j);
            this.f4086j = null;
        }
        if (this.f4088l != null) {
            this.f4077a.m17288a(this.f4088l);
            this.f4088l = null;
        }
        if (this.f4091o != null) {
            this.f4077a.m17288a(this.f4091o);
            this.f4091o = null;
        }
        this.f4078b.mo941i();
        this.f4087k = true;
    }

    /* renamed from: i */
    Bitmap m5250i() {
        return this.f4086j != null ? this.f4086j.m28714a() : this.f4089m;
    }

    /* renamed from: m */
    private void m5235m() {
        if (this.f4082f) {
            if (!this.f4083g) {
                if (this.f4084h) {
                    C1178i.m4884a(this.f4091o == null, "Pending target must be null when starting from the first frame");
                    this.f4078b.mo938f();
                    this.f4084h = false;
                }
                if (this.f4091o != null) {
                    C4846a c4846a = this.f4091o;
                    this.f4091o = null;
                    m5240a(c4846a);
                    return;
                }
                this.f4083g = true;
                long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f4078b.mo935c());
                this.f4078b.mo934b();
                this.f4088l = new C4846a(this.f4079c, this.f4078b.mo937e(), uptimeMillis);
                this.f4085i.m4830a(C1313e.m5289a(C1298g.m5237o())).m4831a(this.f4078b).m4833a(this.f4088l);
            }
        }
    }

    /* renamed from: n */
    private void m5236n() {
        if (this.f4089m != null) {
            this.f4081e.mo1005a(this.f4089m);
            this.f4089m = null;
        }
    }

    /* renamed from: a */
    void m5240a(C4846a c4846a) {
        if (this.f4092p != null) {
            this.f4092p.m5230a();
        }
        this.f4083g = false;
        if (this.f4087k) {
            this.f4079c.obtainMessage(2, c4846a).sendToTarget();
        } else if (this.f4082f) {
            if (c4846a.m28714a() != null) {
                m5236n();
                C4846a c4846a2 = this.f4086j;
                this.f4086j = c4846a;
                for (c4846a = this.f4080d.size() - 1; c4846a >= null; c4846a--) {
                    ((C1295b) this.f4080d.get(c4846a)).mo1071f();
                }
                if (c4846a2 != null) {
                    this.f4079c.obtainMessage(2, c4846a2).sendToTarget();
                }
            }
            m5235m();
        } else {
            this.f4091o = c4846a;
        }
    }

    /* renamed from: a */
    private static C1159f<Bitmap> m5231a(C3377g c3377g, int i, int i2) {
        return c3377g.m17297f().m4830a(C1313e.m5290a(C1265h.f4009b).m5316a(true).m5322b(true).m5308a(i, i2));
    }

    /* renamed from: o */
    private static C1216c m5237o() {
        return new C3370b(Double.valueOf(Math.random()));
    }
}
