package com.google.android.exoplayer2.text.p132a;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4046e;
import com.google.android.exoplayer2.text.C4694g;
import com.google.android.exoplayer2.text.C4695h;
import java.util.LinkedList;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.a.d */
abstract class C4692d implements C4046e {
    /* renamed from: a */
    private final LinkedList<C4694g> f19469a = new LinkedList();
    /* renamed from: b */
    private final LinkedList<C4695h> f19470b;
    /* renamed from: c */
    private final TreeSet<C4694g> f19471c;
    /* renamed from: d */
    private C4694g f19472d;
    /* renamed from: e */
    private long f19473e;

    /* renamed from: a */
    protected abstract void mo4682a(C4694g c4694g);

    /* renamed from: d */
    public void mo1525d() {
    }

    /* renamed from: e */
    protected abstract boolean mo4684e();

    /* renamed from: f */
    protected abstract C2348d mo4685f();

    /* renamed from: a */
    public /* synthetic */ Object mo1521a() {
        return mo4687h();
    }

    /* renamed from: a */
    public /* synthetic */ void mo1522a(Object obj) {
        mo4683b((C4694g) obj);
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1523b() {
        return mo4686g();
    }

    public C4692d() {
        for (int i = 0; i < 10; i++) {
            this.f19469a.add(new C4694g());
        }
        this.f19470b = new LinkedList();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f19470b.add(new C4818e(this));
        }
        this.f19471c = new TreeSet();
    }

    /* renamed from: a */
    public void mo4068a(long j) {
        this.f19473e = j;
    }

    /* renamed from: h */
    public C4694g mo4687h() {
        C2163a.m7918b(this.f19472d == null);
        if (this.f19469a.isEmpty()) {
            return null;
        }
        this.f19472d = (C4694g) this.f19469a.pollFirst();
        return this.f19472d;
    }

    /* renamed from: b */
    public void mo4683b(C4694g c4694g) {
        boolean z = false;
        C2163a.m7916a(c4694g != null);
        if (c4694g == this.f19472d) {
            z = true;
        }
        C2163a.m7916a(z);
        if (c4694g.l_()) {
            m25879c(c4694g);
        } else {
            this.f19471c.add(c4694g);
        }
        this.f19472d = null;
    }

    /* renamed from: g */
    public C4695h mo4686g() {
        if (this.f19470b.isEmpty()) {
            return null;
        }
        while (!this.f19471c.isEmpty() && ((C4694g) this.f19471c.first()).c <= this.f19473e) {
            C4694g c4694g = (C4694g) this.f19471c.pollFirst();
            if (c4694g.m7762c()) {
                C4695h c4695h = (C4695h) this.f19470b.pollFirst();
                c4695h.m7760b(4);
                m25879c(c4694g);
                return c4695h;
            }
            mo4682a(c4694g);
            if (mo4684e()) {
                C2348d f = mo4685f();
                if (!c4694g.l_()) {
                    c4695h = (C4695h) this.f19470b.pollFirst();
                    c4695h.m25907a(c4694g.c, f, Long.MAX_VALUE);
                    m25879c(c4694g);
                    return c4695h;
                }
            }
            m25879c(c4694g);
        }
        return null;
    }

    /* renamed from: c */
    private void m25879c(C4694g c4694g) {
        c4694g.mo1520a();
        this.f19469a.add(c4694g);
    }

    /* renamed from: a */
    protected void m25883a(C4695h c4695h) {
        c4695h.mo1520a();
        this.f19470b.add(c4695h);
    }

    /* renamed from: c */
    public void mo1524c() {
        this.f19473e = 0;
        while (!this.f19471c.isEmpty()) {
            m25879c((C4694g) this.f19471c.pollFirst());
        }
        if (this.f19472d != null) {
            m25879c(this.f19472d);
            this.f19472d = null;
        }
    }
}
