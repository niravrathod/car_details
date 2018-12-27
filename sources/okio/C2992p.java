package okio;

import javax.annotation.Nullable;

/* renamed from: okio.p */
final class C2992p {
    /* renamed from: a */
    final byte[] f12684a;
    /* renamed from: b */
    int f12685b;
    /* renamed from: c */
    int f12686c;
    /* renamed from: d */
    boolean f12687d;
    /* renamed from: e */
    boolean f12688e;
    /* renamed from: f */
    C2992p f12689f;
    /* renamed from: g */
    C2992p f12690g;

    C2992p() {
        this.f12684a = new byte[8192];
        this.f12688e = true;
        this.f12687d = false;
    }

    C2992p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f12684a = bArr;
        this.f12685b = i;
        this.f12686c = i2;
        this.f12687d = z;
        this.f12688e = z2;
    }

    /* renamed from: a */
    C2992p m14662a() {
        this.f12687d = true;
        return new C2992p(this.f12684a, this.f12685b, this.f12686c, true, false);
    }

    @Nullable
    /* renamed from: b */
    public C2992p m14666b() {
        C2992p c2992p = this.f12689f != this ? this.f12689f : null;
        this.f12690g.f12689f = this.f12689f;
        this.f12689f.f12690g = this.f12690g;
        this.f12689f = null;
        this.f12690g = null;
        return c2992p;
    }

    /* renamed from: a */
    public C2992p m14664a(C2992p c2992p) {
        c2992p.f12690g = this;
        c2992p.f12689f = this.f12689f;
        this.f12689f.f12690g = c2992p;
        this.f12689f = c2992p;
        return c2992p;
    }

    /* renamed from: a */
    public C2992p m14663a(int i) {
        if (i <= 0 || i > this.f12686c - this.f12685b) {
            throw new IllegalArgumentException();
        }
        C2992p a;
        if (i >= 1024) {
            a = m14662a();
        } else {
            a = C2993q.m14668a();
            System.arraycopy(this.f12684a, this.f12685b, a.f12684a, 0, i);
        }
        a.f12686c = a.f12685b + i;
        this.f12685b += i;
        this.f12690g.m14664a(a);
        return a;
    }

    /* renamed from: c */
    public void m14667c() {
        if (this.f12690g == this) {
            throw new IllegalStateException();
        } else if (this.f12690g.f12688e) {
            int i = this.f12686c - this.f12685b;
            if (i <= (8192 - this.f12690g.f12686c) + (this.f12690g.f12687d ? 0 : this.f12690g.f12685b)) {
                m14665a(this.f12690g, i);
                m14666b();
                C2993q.m14669a(this);
            }
        }
    }

    /* renamed from: a */
    public void m14665a(C2992p c2992p, int i) {
        if (c2992p.f12688e) {
            if (c2992p.f12686c + i > 8192) {
                if (c2992p.f12687d) {
                    throw new IllegalArgumentException();
                } else if ((c2992p.f12686c + i) - c2992p.f12685b <= 8192) {
                    System.arraycopy(c2992p.f12684a, c2992p.f12685b, c2992p.f12684a, 0, c2992p.f12686c - c2992p.f12685b);
                    c2992p.f12686c -= c2992p.f12685b;
                    c2992p.f12685b = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f12684a, this.f12685b, c2992p.f12684a, c2992p.f12686c, i);
            c2992p.f12686c += i;
            this.f12685b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
