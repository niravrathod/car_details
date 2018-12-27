package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C2274i;
import com.google.android.exoplayer2.C4682a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p126c.C2163a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.d */
public final class C4815d extends C4682a implements Callback {
    /* renamed from: a */
    private final C2285b f21162a;
    /* renamed from: b */
    private final C2286a f21163b;
    /* renamed from: c */
    private final Handler f21164c;
    /* renamed from: d */
    private final C2274i f21165d;
    /* renamed from: e */
    private final C4690c f21166e;
    /* renamed from: f */
    private final Metadata[] f21167f;
    /* renamed from: g */
    private final long[] f21168g;
    /* renamed from: h */
    private int f21169h;
    /* renamed from: i */
    private int f21170i;
    /* renamed from: j */
    private C2284a f21171j;
    /* renamed from: k */
    private boolean f21172k;

    /* renamed from: com.google.android.exoplayer2.metadata.d$a */
    public interface C2286a {
        /* renamed from: a */
        void mo1652a(Metadata metadata);
    }

    /* renamed from: t */
    public boolean mo4679t() {
        return true;
    }

    public C4815d(C2286a c2286a, Looper looper) {
        this(c2286a, looper, C2285b.f7244a);
    }

    public C4815d(C2286a c2286a, Looper looper, C2285b c2285b) {
        super(4);
        this.f21163b = (C2286a) C2163a.m7914a((Object) c2286a);
        if (looper == null) {
            c2286a = null;
        } else {
            c2286a = new Handler(looper, this);
        }
        this.f21164c = c2286a;
        this.f21162a = (C2285b) C2163a.m7914a((Object) c2285b);
        this.f21165d = new C2274i();
        this.f21166e = new C4690c();
        this.f21167f = new Metadata[5];
        this.f21168g = new long[5];
    }

    /* renamed from: a */
    public int mo4672a(Format format) {
        return this.f21162a.mo1642a(format) != null ? 3 : null;
    }

    /* renamed from: a */
    protected void mo4681a(Format[] formatArr) {
        this.f21171j = this.f21162a.mo1643b(formatArr[0]);
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
        m27967v();
        this.f21172k = 0;
    }

    /* renamed from: a */
    public void mo4673a(long j, long j2) {
        if (this.f21172k == null && this.f21170i < 5) {
            this.f21166e.mo1520a();
            if (m25719a((C2274i) this.f21165d, this.f21166e, false) == -4) {
                if (this.f21166e.m7762c() != null) {
                    this.f21172k = true;
                } else if (this.f21166e.l_() == null) {
                    this.f21166e.f19387d = this.f21165d.f7223a.f6506w;
                    this.f21166e.m19610h();
                    try {
                        j2 = (this.f21169h + this.f21170i) % 5;
                        this.f21167f[j2] = this.f21171j.mo1644a(this.f21166e);
                        this.f21168g[j2] = this.f21166e.c;
                        this.f21170i++;
                    } catch (long j3) {
                        throw ExoPlaybackException.m7732a(j3, m25745r());
                    }
                }
            }
        }
        if (this.f21170i > null && this.f21168g[this.f21169h] <= j3) {
            m27965a(this.f21167f[this.f21169h]);
            this.f21167f[this.f21169h] = 0;
            this.f21169h = (this.f21169h + 1) % 5;
            this.f21170i--;
        }
    }

    /* renamed from: p */
    protected void mo4678p() {
        m27967v();
        this.f21171j = null;
    }

    /* renamed from: u */
    public boolean mo4680u() {
        return this.f21172k;
    }

    /* renamed from: a */
    private void m27965a(Metadata metadata) {
        if (this.f21164c != null) {
            this.f21164c.obtainMessage(0, metadata).sendToTarget();
        } else {
            m27966b(metadata);
        }
    }

    /* renamed from: v */
    private void m27967v() {
        Arrays.fill(this.f21167f, null);
        this.f21169h = 0;
        this.f21170i = 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m27966b((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private void m27966b(Metadata metadata) {
        this.f21163b.mo1652a(metadata);
    }
}
