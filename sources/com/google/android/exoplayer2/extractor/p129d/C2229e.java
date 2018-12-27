package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.io.EOFException;

/* renamed from: com.google.android.exoplayer2.extractor.d.e */
final class C2229e {
    /* renamed from: k */
    private static final int f7026k = C2186s.m8062e("OggS");
    /* renamed from: a */
    public int f7027a;
    /* renamed from: b */
    public int f7028b;
    /* renamed from: c */
    public long f7029c;
    /* renamed from: d */
    public long f7030d;
    /* renamed from: e */
    public long f7031e;
    /* renamed from: f */
    public long f7032f;
    /* renamed from: g */
    public int f7033g;
    /* renamed from: h */
    public int f7034h;
    /* renamed from: i */
    public int f7035i;
    /* renamed from: j */
    public final int[] f7036j = new int[255];
    /* renamed from: l */
    private final C2175k f7037l = new C2175k(255);

    C2229e() {
    }

    /* renamed from: a */
    public void m8209a() {
        this.f7027a = 0;
        this.f7028b = 0;
        this.f7029c = 0;
        this.f7030d = 0;
        this.f7031e = 0;
        this.f7032f = 0;
        this.f7033g = 0;
        this.f7034h = 0;
        this.f7035i = 0;
    }

    /* renamed from: a */
    public boolean m8210a(C2260g c2260g, boolean z) {
        Object obj;
        this.f7037l.m7971a();
        m8209a();
        int i = 0;
        if (c2260g.mo1592d() != -1) {
            if (c2260g.mo1592d() - c2260g.mo1585b() < 27) {
                obj = null;
                if (obj != null) {
                    if (!c2260g.mo1588b(this.f7037l.f6735a, 0, 27, true)) {
                        if (this.f7037l.m7991l() != ((long) f7026k)) {
                            this.f7027a = this.f7037l.m7986g();
                            if (this.f7027a != 0) {
                                this.f7028b = this.f7037l.m7986g();
                                this.f7029c = this.f7037l.m7996q();
                                this.f7030d = this.f7037l.m7992m();
                                this.f7031e = this.f7037l.m7992m();
                                this.f7032f = this.f7037l.m7992m();
                                this.f7033g = this.f7037l.m7986g();
                                this.f7034h = this.f7033g + true;
                                this.f7037l.m7971a();
                                c2260g.mo1591c(this.f7037l.f6735a, 0, this.f7033g);
                                while (i < this.f7033g) {
                                    this.f7036j[i] = this.f7037l.m7986g();
                                    this.f7035i += this.f7036j[i];
                                    i++;
                                }
                                return true;
                            } else if (z) {
                                return false;
                            } else {
                                throw new ParserException("unsupported bit stream revision");
                            }
                        } else if (z) {
                            return false;
                        } else {
                            throw new ParserException("expected OggS capture pattern at begin of page");
                        }
                    }
                }
                if (z) {
                    return false;
                }
                throw new EOFException();
            }
        }
        obj = 1;
        if (obj != null) {
            if (!c2260g.mo1588b(this.f7037l.f6735a, 0, 27, true)) {
                if (this.f7037l.m7991l() != ((long) f7026k)) {
                    this.f7027a = this.f7037l.m7986g();
                    if (this.f7027a != 0) {
                        this.f7028b = this.f7037l.m7986g();
                        this.f7029c = this.f7037l.m7996q();
                        this.f7030d = this.f7037l.m7992m();
                        this.f7031e = this.f7037l.m7992m();
                        this.f7032f = this.f7037l.m7992m();
                        this.f7033g = this.f7037l.m7986g();
                        this.f7034h = this.f7033g + true;
                        this.f7037l.m7971a();
                        c2260g.mo1591c(this.f7037l.f6735a, 0, this.f7033g);
                        while (i < this.f7033g) {
                            this.f7036j[i] = this.f7037l.m7986g();
                            this.f7035i += this.f7036j[i];
                            i++;
                        }
                        return true;
                    } else if (z) {
                        return false;
                    } else {
                        throw new ParserException("unsupported bit stream revision");
                    }
                } else if (z) {
                    return false;
                } else {
                    throw new ParserException("expected OggS capture pattern at begin of page");
                }
            }
        }
        if (z) {
            return false;
        }
        throw new EOFException();
    }
}
