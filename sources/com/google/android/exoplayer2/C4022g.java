package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.C2195e.C2192a;
import com.google.android.exoplayer2.C2195e.C2194c;
import com.google.android.exoplayer2.C2313q.C2311a;
import com.google.android.exoplayer2.C2313q.C2312b;
import com.google.android.exoplayer2.C4689h.C2271b;
import com.google.android.exoplayer2.C4689h.C2273d;
import com.google.android.exoplayer2.p125b.C2157f;
import com.google.android.exoplayer2.p125b.C2158g;
import com.google.android.exoplayer2.p125b.C2160h;
import com.google.android.exoplayer2.p125b.C2161i;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2321d;
import com.google.android.exoplayer2.source.C2327i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.g */
final class C4022g implements C2195e {
    /* renamed from: a */
    private final C4023l[] f16175a;
    /* renamed from: b */
    private final C2160h f16176b;
    /* renamed from: c */
    private final C2158g f16177c;
    /* renamed from: d */
    private final Handler f16178d;
    /* renamed from: e */
    private final C4689h f16179e;
    /* renamed from: f */
    private final CopyOnWriteArraySet<C2192a> f16180f;
    /* renamed from: g */
    private final C2312b f16181g;
    /* renamed from: h */
    private final C2311a f16182h;
    /* renamed from: i */
    private boolean f16183i;
    /* renamed from: j */
    private boolean f16184j;
    /* renamed from: k */
    private int f16185k;
    /* renamed from: l */
    private int f16186l;
    /* renamed from: m */
    private int f16187m;
    /* renamed from: n */
    private boolean f16188n;
    /* renamed from: o */
    private C2313q f16189o;
    /* renamed from: p */
    private Object f16190p;
    /* renamed from: q */
    private C2327i f16191q;
    /* renamed from: r */
    private C2158g f16192r;
    /* renamed from: s */
    private C2276k f16193s;
    /* renamed from: t */
    private C2271b f16194t;
    /* renamed from: u */
    private int f16195u;
    /* renamed from: v */
    private int f16196v;
    /* renamed from: w */
    private long f16197w;

    @SuppressLint({"HandlerLeak"})
    public C4022g(C4023l[] c4023lArr, C2160h c2160h, C2275j c2275j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init ExoPlayerLib/2.4.2 [");
        stringBuilder.append(C2186s.f6765e);
        stringBuilder.append("]");
        Log.i("ExoPlayerImpl", stringBuilder.toString());
        C2163a.m7918b(c4023lArr.length > 0);
        this.f16175a = (C4023l[]) C2163a.m7914a((Object) c4023lArr);
        this.f16176b = (C2160h) C2163a.m7914a((Object) c2160h);
        this.f16184j = false;
        this.f16185k = 1;
        this.f16180f = new CopyOnWriteArraySet();
        this.f16177c = new C2158g(new C2157f[c4023lArr.length]);
        this.f16189o = C2313q.f7282a;
        this.f16181g = new C2312b();
        this.f16182h = new C2311a();
        this.f16191q = C2327i.f7298a;
        this.f16192r = this.f16177c;
        this.f16193s = C2276k.f7224a;
        this.f16178d = new Handler(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) {
            /* renamed from: a */
            final /* synthetic */ C4022g f7192a;

            public void handleMessage(Message message) {
                this.f7192a.m20130a(message);
            }
        };
        this.f16194t = new C2271b(0, 0);
        this.f16179e = new C4689h(c4023lArr, c2160h, c2275j, this.f16184j, this.f16178d, this.f16194t, this);
    }

    /* renamed from: a */
    public void mo1624a(C2192a c2192a) {
        this.f16180f.add(c2192a);
    }

    /* renamed from: a */
    public void mo1625a(C2321d c2321d) {
        m20133a(c2321d, true, true);
    }

    /* renamed from: a */
    public void m20133a(C2321d c2321d, boolean z, boolean z2) {
        if (z2) {
            if (!this.f16189o.m8468a() || this.f16190p) {
                this.f16189o = C2313q.f7282a;
                this.f16190p = null;
                z2 = this.f16180f.iterator();
                while (z2.hasNext()) {
                    ((C2192a) z2.next()).mo1456a(this.f16189o, this.f16190p);
                }
            }
            if (this.f16183i) {
                this.f16183i = false;
                this.f16191q = C2327i.f7298a;
                this.f16192r = this.f16177c;
                this.f16176b.mo1549a(null);
                z2 = this.f16180f.iterator();
                while (z2.hasNext()) {
                    ((C2192a) z2.next()).mo1457a(this.f16191q, this.f16192r);
                }
            }
        }
        this.f16187m++;
        this.f16179e.m25825a(c2321d, z);
    }

    /* renamed from: a */
    public void mo1626a(boolean z) {
        if (this.f16184j != z) {
            this.f16184j = z;
            this.f16179e.m25827a(z);
            Iterator it = this.f16180f.iterator();
            while (it.hasNext()) {
                ((C2192a) it.next()).mo1459a(z, this.f16185k);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1628a() {
        return this.f16184j;
    }

    /* renamed from: b */
    public void mo1629b() {
        m20127a(m20144h());
    }

    /* renamed from: a */
    public void m20127a(int i) {
        m20128a(i, -9223372036854775807L);
    }

    /* renamed from: a */
    public void mo1623a(long j) {
        m20128a(m20144h(), j);
    }

    /* renamed from: a */
    public void m20128a(int i, long j) {
        if (i < 0 || (!this.f16189o.m8468a() && i >= this.f16189o.mo1663b())) {
            throw new IllegalSeekPositionException(this.f16189o, i, j);
        }
        this.f16186l++;
        this.f16195u = i;
        if (this.f16189o.m8468a()) {
            this.f16196v = 0;
        } else {
            this.f16189o.m8465a(i, this.f16181g);
            long a = j == -9223372036854775807L ? this.f16181g.m8458a() : j;
            int i2 = this.f16181g.f7277f;
            long c = this.f16181g.m8461c() + C2162b.m7912b(a);
            a = this.f16189o.m8463a(i2, this.f16182h).m8455a();
            while (a != -9223372036854775807L && c >= a && i2 < this.f16181g.f7278g) {
                c -= a;
                i2++;
                a = this.f16189o.m8463a(i2, this.f16182h).m8455a();
            }
            this.f16196v = i2;
        }
        if (j == -9223372036854775807L) {
            this.f16197w = 0;
            this.f16179e.m25822a(this.f16189o, i, -9223372036854775807L);
            return;
        }
        this.f16197w = j;
        this.f16179e.m25822a(this.f16189o, i, C2162b.m7912b(j));
        i = this.f16180f.iterator();
        while (i.hasNext() != null) {
            ((C2192a) i.next()).mo1464f();
        }
    }

    /* renamed from: c */
    public void mo1631c() {
        this.f16179e.m25821a();
    }

    /* renamed from: d */
    public void mo1632d() {
        this.f16179e.m25829b();
        this.f16178d.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public void mo1627a(C2194c... c2194cArr) {
        this.f16179e.m25828a(c2194cArr);
    }

    /* renamed from: b */
    public void mo1630b(C2194c... c2194cArr) {
        this.f16179e.m25831b(c2194cArr);
    }

    /* renamed from: h */
    public int m20144h() {
        if (!this.f16189o.m8468a()) {
            if (this.f16186l <= 0) {
                return this.f16189o.m8463a(this.f16194t.f7212a, this.f16182h).f7268c;
            }
        }
        return this.f16195u;
    }

    /* renamed from: e */
    public long mo1633e() {
        if (this.f16189o.m8468a()) {
            return -9223372036854775807L;
        }
        return this.f16189o.m8465a(m20144h(), this.f16181g).m8460b();
    }

    /* renamed from: f */
    public long mo1634f() {
        if (!this.f16189o.m8468a()) {
            if (this.f16186l <= 0) {
                this.f16189o.m8463a(this.f16194t.f7212a, this.f16182h);
                return this.f16182h.m8457b() + C2162b.m7911a(this.f16194t.f7214c);
            }
        }
        return this.f16197w;
    }

    /* renamed from: i */
    public long m20145i() {
        if (!this.f16189o.m8468a()) {
            if (this.f16186l <= 0) {
                this.f16189o.m8463a(this.f16194t.f7212a, this.f16182h);
                return this.f16182h.m8457b() + C2162b.m7911a(this.f16194t.f7215d);
            }
        }
        return this.f16197w;
    }

    /* renamed from: g */
    public int mo1635g() {
        int i = 0;
        if (this.f16189o.m8468a()) {
            return 0;
        }
        long i2 = m20145i();
        long e = mo1633e();
        if (i2 != -9223372036854775807L) {
            if (e != -9223372036854775807L) {
                i = e == 0 ? 100 : C2186s.m8041a((int) ((i2 * 100) / e), 0, 100);
            }
        }
        return i;
    }

    /* renamed from: a */
    void m20130a(Message message) {
        boolean z = true;
        Iterator it;
        switch (message.what) {
            case 0:
                this.f16187m -= 1;
                return;
            case 1:
                this.f16185k = message.arg1;
                message = this.f16180f.iterator();
                while (message.hasNext()) {
                    ((C2192a) message.next()).mo1459a(this.f16184j, this.f16185k);
                }
                return;
            case 2:
                if (message.arg1 == null) {
                    z = false;
                }
                this.f16188n = z;
                message = this.f16180f.iterator();
                while (message.hasNext()) {
                    ((C2192a) message.next()).mo1460b(this.f16188n);
                }
                return;
            case 3:
                if (this.f16187m == 0) {
                    C2161i c2161i = (C2161i) message.obj;
                    this.f16183i = true;
                    this.f16191q = c2161i.f6687a;
                    this.f16192r = c2161i.f6688b;
                    this.f16176b.mo1549a(c2161i.f6689c);
                    message = this.f16180f.iterator();
                    while (message.hasNext()) {
                        ((C2192a) message.next()).mo1457a(this.f16191q, this.f16192r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f16186l - 1;
                this.f16186l = i;
                if (i == 0) {
                    this.f16194t = (C2271b) message.obj;
                    if (message.arg1 != null) {
                        message = this.f16180f.iterator();
                        while (message.hasNext()) {
                            ((C2192a) message.next()).mo1464f();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f16186l == 0) {
                    this.f16194t = (C2271b) message.obj;
                    message = this.f16180f.iterator();
                    while (message.hasNext()) {
                        ((C2192a) message.next()).mo1464f();
                    }
                    return;
                }
                return;
            case 6:
                C2273d c2273d = (C2273d) message.obj;
                this.f16186l -= c2273d.f7222d;
                if (this.f16187m == 0) {
                    this.f16189o = c2273d.f7219a;
                    this.f16190p = c2273d.f7220b;
                    this.f16194t = c2273d.f7221c;
                    message = this.f16180f.iterator();
                    while (message.hasNext()) {
                        ((C2192a) message.next()).mo1456a(this.f16189o, this.f16190p);
                    }
                    return;
                }
                return;
            case 7:
                C2276k c2276k = (C2276k) message.obj;
                if (!this.f16193s.equals(c2276k)) {
                    this.f16193s = c2276k;
                    it = this.f16180f.iterator();
                    while (it.hasNext()) {
                        ((C2192a) it.next()).mo1455a(c2276k);
                    }
                    return;
                }
                return;
            case 8:
                ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                it = this.f16180f.iterator();
                while (it.hasNext()) {
                    ((C2192a) it.next()).mo1454a(exoPlaybackException);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
