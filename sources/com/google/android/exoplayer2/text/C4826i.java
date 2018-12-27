package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C2274i;
import com.google.android.exoplayer2.C4682a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2170h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.i */
public final class C4826i extends C4682a implements Callback {
    /* renamed from: a */
    private final Handler f21231a;
    /* renamed from: b */
    private final C2358a f21232b;
    /* renamed from: c */
    private final C2357f f21233c;
    /* renamed from: d */
    private final C2274i f21234d;
    /* renamed from: e */
    private boolean f21235e;
    /* renamed from: f */
    private boolean f21236f;
    /* renamed from: g */
    private int f21237g;
    /* renamed from: h */
    private Format f21238h;
    /* renamed from: i */
    private C4046e f21239i;
    /* renamed from: j */
    private C4694g f21240j;
    /* renamed from: k */
    private C4695h f21241k;
    /* renamed from: l */
    private C4695h f21242l;
    /* renamed from: m */
    private int f21243m;

    /* renamed from: com.google.android.exoplayer2.text.i$a */
    public interface C2358a {
        /* renamed from: a */
        void mo1654a(List<C2333a> list);
    }

    /* renamed from: t */
    public boolean mo4679t() {
        return true;
    }

    public C4826i(C2358a c2358a, Looper looper) {
        this(c2358a, looper, C2357f.f7496a);
    }

    public C4826i(C2358a c2358a, Looper looper, C2357f c2357f) {
        super(3);
        this.f21232b = (C2358a) C2163a.m7914a((Object) c2358a);
        if (looper == null) {
            c2358a = null;
        } else {
            c2358a = new Handler(looper, this);
        }
        this.f21231a = c2358a;
        this.f21233c = c2357f;
        this.f21234d = new C2274i();
    }

    /* renamed from: a */
    public int mo4672a(Format format) {
        if (this.f21233c.mo1682a(format)) {
            return 3;
        }
        return C2170h.m7944c(format.f6489f) != null ? 1 : null;
    }

    /* renamed from: a */
    protected void mo4681a(Format[] formatArr) {
        this.f21238h = formatArr[0];
        if (this.f21239i != null) {
            this.f21237g = 1;
        } else {
            this.f21239i = this.f21233c.mo1683b(this.f21238h);
        }
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
        m28066z();
        this.f21235e = false;
        this.f21236f = false;
        if (this.f21237g != null) {
            m28064x();
            return;
        }
        m28062v();
        this.f21239i.mo1524c();
    }

    /* renamed from: a */
    public void mo4673a(long j, long j2) {
        if (this.f21236f == null) {
            if (this.f21242l == null) {
                this.f21239i.mo4068a(j);
                try {
                    this.f21242l = (C4695h) this.f21239i.mo1523b();
                } catch (long j3) {
                    throw ExoPlaybackException.m7732a(j3, m25745r());
                }
            }
            if (mo4036d() == 2) {
                if (this.f21241k != null) {
                    long y = m28065y();
                    j2 = null;
                    while (y <= j3) {
                        this.f21243m++;
                        y = m28065y();
                        j2 = 1;
                    }
                } else {
                    j2 = null;
                }
                if (this.f21242l != null) {
                    if (this.f21242l.m7762c()) {
                        if (j2 == null && m28065y() == Long.MAX_VALUE) {
                            if (this.f21237g == 2) {
                                m28064x();
                            } else {
                                m28062v();
                                this.f21236f = true;
                            }
                        }
                    } else if (this.f21242l.a <= j3) {
                        if (this.f21241k != null) {
                            this.f21241k.mo4688e();
                        }
                        this.f21241k = this.f21242l;
                        this.f21242l = null;
                        this.f21243m = this.f21241k.mo1678a(j3);
                        j2 = 1;
                    }
                }
                if (j2 != null) {
                    m28060a(this.f21241k.mo1681b(j3));
                }
                if (this.f21237g != 2) {
                    while (this.f21235e == null) {
                        try {
                            if (this.f21240j == null) {
                                this.f21240j = (C4694g) this.f21239i.mo1521a();
                                if (this.f21240j == null) {
                                    return;
                                }
                            }
                            if (this.f21237g == 1) {
                                this.f21240j.a_(4);
                                this.f21239i.mo1522a(this.f21240j);
                                this.f21240j = null;
                                this.f21237g = 2;
                                return;
                            }
                            j3 = m25719a((C2274i) this.f21234d, this.f21240j, false);
                            if (j3 == -4) {
                                if (this.f21240j.m7762c() != null) {
                                    this.f21235e = true;
                                } else {
                                    this.f21240j.f19475d = this.f21234d.f7223a.f6506w;
                                    this.f21240j.m19610h();
                                }
                                this.f21239i.mo1522a(this.f21240j);
                                this.f21240j = null;
                            } else if (j3 == -3) {
                                return;
                            }
                        } catch (long j32) {
                            throw ExoPlaybackException.m7732a(j32, m25745r());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    protected void mo4678p() {
        this.f21238h = null;
        m28066z();
        m28063w();
    }

    /* renamed from: u */
    public boolean mo4680u() {
        return this.f21236f;
    }

    /* renamed from: v */
    private void m28062v() {
        this.f21240j = null;
        this.f21243m = -1;
        if (this.f21241k != null) {
            this.f21241k.mo4688e();
            this.f21241k = null;
        }
        if (this.f21242l != null) {
            this.f21242l.mo4688e();
            this.f21242l = null;
        }
    }

    /* renamed from: w */
    private void m28063w() {
        m28062v();
        this.f21239i.mo1525d();
        this.f21239i = null;
        this.f21237g = 0;
    }

    /* renamed from: x */
    private void m28064x() {
        m28063w();
        this.f21239i = this.f21233c.mo1683b(this.f21238h);
    }

    /* renamed from: y */
    private long m28065y() {
        if (this.f21243m != -1) {
            if (this.f21243m < this.f21241k.mo1680b()) {
                return this.f21241k.mo1679a(this.f21243m);
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: a */
    private void m28060a(List<C2333a> list) {
        if (this.f21231a != null) {
            this.f21231a.obtainMessage(0, list).sendToTarget();
        } else {
            m28061b(list);
        }
    }

    /* renamed from: z */
    private void m28066z() {
        m28060a(Collections.emptyList());
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m28061b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private void m28061b(List<C2333a> list) {
        this.f21232b.mo1654a(list);
    }
}
