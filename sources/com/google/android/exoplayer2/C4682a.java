package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2169g;
import com.google.android.exoplayer2.source.C2323e;

/* renamed from: com.google.android.exoplayer2.a */
public abstract class C4682a implements C4023l, C2277m {
    /* renamed from: a */
    private final int f19322a;
    /* renamed from: b */
    private C2307n f19323b;
    /* renamed from: c */
    private int f19324c;
    /* renamed from: d */
    private int f19325d;
    /* renamed from: e */
    private C2323e f19326e;
    /* renamed from: f */
    private long f19327f;
    /* renamed from: g */
    private boolean f19328g = true;
    /* renamed from: h */
    private boolean f19329h;

    /* renamed from: a */
    public void mo4030a(int i, Object obj) {
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
    }

    /* renamed from: a */
    protected void mo4675a(boolean z) {
    }

    /* renamed from: a */
    protected void mo4681a(Format[] formatArr) {
    }

    /* renamed from: b */
    public final C2277m mo4034b() {
        return this;
    }

    /* renamed from: c */
    public C2169g mo4035c() {
        return null;
    }

    /* renamed from: m */
    public int mo4045m() {
        return 0;
    }

    /* renamed from: n */
    protected void mo4676n() {
    }

    /* renamed from: o */
    protected void mo4677o() {
    }

    /* renamed from: p */
    protected void mo4678p() {
    }

    public C4682a(int i) {
        this.f19322a = i;
    }

    /* renamed from: a */
    public final int mo4028a() {
        return this.f19322a;
    }

    /* renamed from: a */
    public final void mo4029a(int i) {
        this.f19324c = i;
    }

    /* renamed from: d */
    public final int mo4036d() {
        return this.f19325d;
    }

    /* renamed from: a */
    public final void mo4032a(C2307n c2307n, Format[] formatArr, C2323e c2323e, long j, boolean z, long j2) {
        C2163a.m7918b(this.f19325d == 0);
        this.f19323b = c2307n;
        this.f19325d = 1;
        mo4675a(z);
        mo4033a(formatArr, c2323e, j2);
        mo4674a(j, z);
    }

    /* renamed from: e */
    public final void mo4037e() {
        boolean z = true;
        if (this.f19325d != 1) {
            z = false;
        }
        C2163a.m7918b(z);
        this.f19325d = 2;
        mo4676n();
    }

    /* renamed from: a */
    public final void mo4033a(Format[] formatArr, C2323e c2323e, long j) {
        C2163a.m7918b(this.f19329h ^ 1);
        this.f19326e = c2323e;
        this.f19328g = null;
        this.f19327f = j;
        mo4681a(formatArr);
    }

    /* renamed from: f */
    public final C2323e mo4038f() {
        return this.f19326e;
    }

    /* renamed from: g */
    public final boolean mo4039g() {
        return this.f19328g;
    }

    /* renamed from: h */
    public final void mo4040h() {
        this.f19329h = true;
    }

    /* renamed from: i */
    public final boolean mo4041i() {
        return this.f19329h;
    }

    /* renamed from: j */
    public final void mo4042j() {
        this.f19326e.mo1671b();
    }

    /* renamed from: a */
    public final void mo4031a(long j) {
        this.f19329h = false;
        this.f19328g = false;
        mo4674a(j, false);
    }

    /* renamed from: k */
    public final void mo4043k() {
        C2163a.m7918b(this.f19325d == 2);
        this.f19325d = 1;
        mo4677o();
    }

    /* renamed from: l */
    public final void mo4044l() {
        boolean z = true;
        if (this.f19325d != 1) {
            z = false;
        }
        C2163a.m7918b(z);
        this.f19325d = 0;
        this.f19326e = null;
        this.f19329h = false;
        mo4678p();
    }

    /* renamed from: q */
    protected final C2307n m25744q() {
        return this.f19323b;
    }

    /* renamed from: r */
    protected final int m25745r() {
        return this.f19324c;
    }

    /* renamed from: a */
    protected final int m25719a(C2274i c2274i, C3946e c3946e, boolean z) {
        z = this.f19326e.mo1668a(c2274i, c3946e, z);
        int i = -4;
        if (z) {
            if (c3946e.m7762c() != null) {
                this.f19328g = true;
                if (this.f19329h == null) {
                    i = -3;
                }
                return i;
            }
            c3946e.f15689c += this.f19327f;
        } else if (z) {
            c3946e = c2274i.f7223a;
            if (c3946e.f6506w != Long.MAX_VALUE) {
                c2274i.f7223a = c3946e.m7755a(c3946e.f6506w + this.f19327f);
            }
        }
        return z;
    }

    /* renamed from: b */
    protected void m25729b(long j) {
        this.f19326e.mo1669a(j - this.f19327f);
    }

    /* renamed from: s */
    protected final boolean m25746s() {
        return this.f19328g ? this.f19329h : this.f19326e.mo1670a();
    }
}
