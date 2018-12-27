package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;

final class ks implements mk {
    /* renamed from: a */
    private final zzbcf f16531a;
    /* renamed from: b */
    private int f16532b;
    /* renamed from: c */
    private int f16533c;
    /* renamed from: d */
    private int f16534d = 0;

    /* renamed from: a */
    public static ks m20632a(zzbcf zzbcf) {
        if (zzbcf.f9099c != null) {
            return zzbcf.f9099c;
        }
        return new ks(zzbcf);
    }

    private ks(zzbcf zzbcf) {
        this.f16531a = (zzbcf) zzbdf.m10330a((Object) zzbcf, "input");
        this.f16531a.f9099c = this;
    }

    /* renamed from: a */
    public final int mo2000a() {
        if (this.f16534d != 0) {
            this.f16532b = this.f16534d;
            this.f16534d = 0;
        } else {
            this.f16532b = this.f16531a.mo1973a();
        }
        if (this.f16532b != 0) {
            if (this.f16532b != this.f16533c) {
                return this.f16532b >>> 3;
            }
        }
        return BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public final int mo2005b() {
        return this.f16532b;
    }

    /* renamed from: c */
    public final boolean mo2010c() {
        if (!this.f16531a.mo1998t()) {
            if (this.f16532b != this.f16533c) {
                return this.f16531a.mo1977b(this.f16532b);
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m20634a(int i) {
        if ((this.f16532b & 7) != i) {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: d */
    public final double mo2011d() {
        m20634a(1);
        return this.f16531a.mo1976b();
    }

    /* renamed from: e */
    public final float mo2013e() {
        m20634a(5);
        return this.f16531a.mo1978c();
    }

    /* renamed from: f */
    public final long mo2015f() {
        m20634a(0);
        return this.f16531a.mo1980d();
    }

    /* renamed from: g */
    public final long mo2017g() {
        m20634a(0);
        return this.f16531a.mo1981e();
    }

    /* renamed from: h */
    public final int mo2019h() {
        m20634a(0);
        return this.f16531a.mo1983f();
    }

    /* renamed from: i */
    public final long mo2021i() {
        m20634a(1);
        return this.f16531a.mo1985g();
    }

    /* renamed from: j */
    public final int mo2023j() {
        m20634a(5);
        return this.f16531a.mo1986h();
    }

    /* renamed from: k */
    public final boolean mo2026k() {
        m20634a(0);
        return this.f16531a.mo1987i();
    }

    /* renamed from: l */
    public final String mo2027l() {
        m20634a(2);
        return this.f16531a.mo1988j();
    }

    /* renamed from: m */
    public final String mo2029m() {
        m20634a(2);
        return this.f16531a.mo1989k();
    }

    /* renamed from: a */
    public final <T> T mo2001a(ml<T> mlVar, zzbcq zzbcq) {
        m20634a(2);
        return m20637c(mlVar, zzbcq);
    }

    /* renamed from: b */
    public final <T> T mo2006b(ml<T> mlVar, zzbcq zzbcq) {
        m20634a(3);
        return m20639d(mlVar, zzbcq);
    }

    /* renamed from: c */
    private final <T> T m20637c(ml<T> mlVar, zzbcq zzbcq) {
        int m = this.f16531a.mo1991m();
        if (this.f16531a.f9097a < this.f16531a.f9098b) {
            m = this.f16531a.mo1979d(m);
            T a = mlVar.mo2109a();
            zzbcf zzbcf = this.f16531a;
            zzbcf.f9097a++;
            mlVar.mo2110a(a, this, zzbcq);
            mlVar.mo2116c(a);
            this.f16531a.mo1975a((int) null);
            mlVar = this.f16531a;
            mlVar.f9097a--;
            this.f16531a.mo1982e(m);
            return a;
        }
        throw zzbdl.m10346g();
    }

    /* renamed from: d */
    private final <T> T m20639d(ml<T> mlVar, zzbcq zzbcq) {
        int i = this.f16533c;
        T t = ((this.f16532b >>> 3) << 3) | 4;
        this.f16533c = t;
        try {
            t = mlVar.mo2109a();
            mlVar.mo2110a(t, this, zzbcq);
            mlVar.mo2116c(t);
            if (this.f16532b == this.f16533c) {
                return t;
            }
            throw zzbdl.m10347h();
        } finally {
            this.f16533c = i;
        }
    }

    /* renamed from: n */
    public final zzbbu mo2031n() {
        m20634a(2);
        return this.f16531a.mo1990l();
    }

    /* renamed from: o */
    public final int mo2033o() {
        m20634a(0);
        return this.f16531a.mo1991m();
    }

    /* renamed from: p */
    public final int mo2035p() {
        m20634a(0);
        return this.f16531a.mo1992n();
    }

    /* renamed from: q */
    public final int mo2037q() {
        m20634a(5);
        return this.f16531a.mo1993o();
    }

    /* renamed from: r */
    public final long mo2039r() {
        m20634a(1);
        return this.f16531a.mo1994p();
    }

    /* renamed from: s */
    public final int mo2040s() {
        m20634a(0);
        return this.f16531a.mo1995q();
    }

    /* renamed from: t */
    public final long mo2041t() {
        m20634a(0);
        return this.f16531a.mo1996r();
    }

    /* renamed from: a */
    public final void mo2002a(List<Double> list) {
        int m;
        int u;
        if (list instanceof kw) {
            kw kwVar = (kw) list;
            switch (this.f16532b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f16531a.mo1991m();
                    m20636b(m);
                    u = this.f16531a.mo1999u() + m;
                    do {
                        kwVar.m26068a(this.f16531a.mo1976b());
                    } while (this.f16531a.mo1999u() < u);
                    return;
                default:
                    throw zzbdl.m10345f();
            }
            do {
                kwVar.m26068a(this.f16531a.mo1976b());
                if (!this.f16531a.mo1998t()) {
                    m = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (m == this.f16532b);
            this.f16534d = m;
            return;
        }
        switch (this.f16532b & 7) {
            case 1:
                break;
            case 2:
                m = this.f16531a.mo1991m();
                m20636b(m);
                u = this.f16531a.mo1999u() + m;
                do {
                    list.add(Double.valueOf(this.f16531a.mo1976b()));
                } while (this.f16531a.mo1999u() < u);
                return;
            default:
                throw zzbdl.m10345f();
        }
        do {
            list.add(Double.valueOf(this.f16531a.mo1976b()));
            if (!this.f16531a.mo1998t()) {
                m = this.f16531a.mo1973a();
            } else {
                return;
            }
        } while (m == this.f16532b);
        this.f16534d = m;
    }

    /* renamed from: b */
    public final void mo2007b(List<Float> list) {
        if (list instanceof le) {
            le leVar = (le) list;
            list = this.f16532b & 7;
            if (list == 2) {
                int m = this.f16531a.mo1991m();
                m20638c(m);
                int u = this.f16531a.mo1999u() + m;
                do {
                    leVar.m26073a(this.f16531a.mo1978c());
                } while (this.f16531a.mo1999u() < u);
                return;
            } else if (list == 5) {
                do {
                    leVar.m26073a(this.f16531a.mo1978c());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 2) {
            i = this.f16531a.mo1991m();
            m20638c(i);
            int u2 = this.f16531a.mo1999u() + i;
            do {
                list.add(Float.valueOf(this.f16531a.mo1978c()));
            } while (this.f16531a.mo1999u() < u2);
        } else if (i == 5) {
            do {
                list.add(Float.valueOf(this.f16531a.mo1978c()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: c */
    public final void mo2009c(List<Long> list) {
        int u;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lpVar.m26085a(this.f16531a.mo1980d());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lpVar.m26085a(this.f16531a.mo1980d());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f16531a.mo1980d()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Long.valueOf(this.f16531a.mo1980d()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: d */
    public final void mo2012d(List<Long> list) {
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lpVar.m26085a(this.f16531a.mo1981e());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lpVar.m26085a(this.f16531a.mo1981e());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f16531a.mo1981e()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Long.valueOf(this.f16531a.mo1981e()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: e */
    public final void mo2014e(List<Integer> list) {
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lhVar.m26080c(this.f16531a.mo1983f());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lhVar.m26080c(this.f16531a.mo1983f());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1983f()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Integer.valueOf(this.f16531a.mo1983f()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: f */
    public final void mo2016f(List<Long> list) {
        int m;
        int u;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            switch (this.f16532b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f16531a.mo1991m();
                    m20636b(m);
                    u = this.f16531a.mo1999u() + m;
                    do {
                        lpVar.m26085a(this.f16531a.mo1985g());
                    } while (this.f16531a.mo1999u() < u);
                    return;
                default:
                    throw zzbdl.m10345f();
            }
            do {
                lpVar.m26085a(this.f16531a.mo1985g());
                if (!this.f16531a.mo1998t()) {
                    m = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (m == this.f16532b);
            this.f16534d = m;
            return;
        }
        switch (this.f16532b & 7) {
            case 1:
                break;
            case 2:
                m = this.f16531a.mo1991m();
                m20636b(m);
                u = this.f16531a.mo1999u() + m;
                do {
                    list.add(Long.valueOf(this.f16531a.mo1985g()));
                } while (this.f16531a.mo1999u() < u);
                return;
            default:
                throw zzbdl.m10345f();
        }
        do {
            list.add(Long.valueOf(this.f16531a.mo1985g()));
            if (!this.f16531a.mo1998t()) {
                m = this.f16531a.mo1973a();
            } else {
                return;
            }
        } while (m == this.f16532b);
        this.f16534d = m;
    }

    /* renamed from: g */
    public final void mo2018g(List<Integer> list) {
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == 2) {
                int m = this.f16531a.mo1991m();
                m20638c(m);
                int u = this.f16531a.mo1999u() + m;
                do {
                    lhVar.m26080c(this.f16531a.mo1986h());
                } while (this.f16531a.mo1999u() < u);
                return;
            } else if (list == 5) {
                do {
                    lhVar.m26080c(this.f16531a.mo1986h());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 2) {
            i = this.f16531a.mo1991m();
            m20638c(i);
            int u2 = this.f16531a.mo1999u() + i;
            do {
                list.add(Integer.valueOf(this.f16531a.mo1986h()));
            } while (this.f16531a.mo1999u() < u2);
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1986h()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: h */
    public final void mo2020h(List<Boolean> list) {
        if (list instanceof kj) {
            kj kjVar = (kj) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    kjVar.m26063a(this.f16531a.mo1987i());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    kjVar.m26063a(this.f16531a.mo1987i());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(this.f16531a.mo1987i()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Boolean.valueOf(this.f16531a.mo1987i()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: i */
    public final void mo2022i(List<String> list) {
        m20635a((List) list, false);
    }

    /* renamed from: j */
    public final void mo2024j(List<String> list) {
        m20635a((List) list, true);
    }

    /* renamed from: a */
    private final void m20635a(List<String> list, boolean z) {
        if ((this.f16532b & 7) != 2) {
            throw zzbdl.m10345f();
        } else if (!(list instanceof zzbdu) || z) {
            int a;
            do {
                list.add(z ? mo2029m() : mo2027l());
                if (!this.f16531a.mo1998t()) {
                    a = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (a == this.f16532b);
            this.f16534d = a;
        } else {
            zzbdu zzbdu = (zzbdu) list;
            do {
                zzbdu.mo2424a(mo2031n());
                if (this.f16531a.mo1998t() == null) {
                    list = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (list == this.f16532b);
            this.f16534d = list;
        }
    }

    /* renamed from: a */
    public final <T> void mo2003a(List<T> list, ml<T> mlVar, zzbcq zzbcq) {
        if ((this.f16532b & 7) == 2) {
            int a;
            int i = this.f16532b;
            do {
                list.add(m20637c(mlVar, zzbcq));
                if (!this.f16531a.mo1998t()) {
                    if (this.f16534d == 0) {
                        a = this.f16531a.mo1973a();
                    }
                }
                return;
            } while (a == i);
            this.f16534d = a;
            return;
        }
        throw zzbdl.m10345f();
    }

    /* renamed from: b */
    public final <T> void mo2008b(List<T> list, ml<T> mlVar, zzbcq zzbcq) {
        if ((this.f16532b & 7) == 3) {
            int a;
            int i = this.f16532b;
            do {
                list.add(m20639d(mlVar, zzbcq));
                if (!this.f16531a.mo1998t()) {
                    if (this.f16534d == 0) {
                        a = this.f16531a.mo1973a();
                    }
                }
                return;
            } while (a == i);
            this.f16534d = a;
            return;
        }
        throw zzbdl.m10345f();
    }

    /* renamed from: k */
    public final void mo2025k(List<zzbbu> list) {
        if ((this.f16532b & 7) == 2) {
            int a;
            do {
                list.add(mo2031n());
                if (!this.f16531a.mo1998t()) {
                    a = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (a == this.f16532b);
            this.f16534d = a;
            return;
        }
        throw zzbdl.m10345f();
    }

    /* renamed from: l */
    public final void mo2028l(List<Integer> list) {
        int u;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lhVar.m26080c(this.f16531a.mo1991m());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lhVar.m26080c(this.f16531a.mo1991m());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1991m()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Integer.valueOf(this.f16531a.mo1991m()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: m */
    public final void mo2030m(List<Integer> list) {
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lhVar.m26080c(this.f16531a.mo1992n());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lhVar.m26080c(this.f16531a.mo1992n());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1992n()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Integer.valueOf(this.f16531a.mo1992n()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: n */
    public final void mo2032n(List<Integer> list) {
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == 2) {
                int m = this.f16531a.mo1991m();
                m20638c(m);
                int u = this.f16531a.mo1999u() + m;
                do {
                    lhVar.m26080c(this.f16531a.mo1993o());
                } while (this.f16531a.mo1999u() < u);
                return;
            } else if (list == 5) {
                do {
                    lhVar.m26080c(this.f16531a.mo1993o());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 2) {
            i = this.f16531a.mo1991m();
            m20638c(i);
            int u2 = this.f16531a.mo1999u() + i;
            do {
                list.add(Integer.valueOf(this.f16531a.mo1993o()));
            } while (this.f16531a.mo1999u() < u2);
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1993o()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: o */
    public final void mo2034o(List<Long> list) {
        int m;
        int u;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            switch (this.f16532b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f16531a.mo1991m();
                    m20636b(m);
                    u = this.f16531a.mo1999u() + m;
                    do {
                        lpVar.m26085a(this.f16531a.mo1994p());
                    } while (this.f16531a.mo1999u() < u);
                    return;
                default:
                    throw zzbdl.m10345f();
            }
            do {
                lpVar.m26085a(this.f16531a.mo1994p());
                if (!this.f16531a.mo1998t()) {
                    m = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (m == this.f16532b);
            this.f16534d = m;
            return;
        }
        switch (this.f16532b & 7) {
            case 1:
                break;
            case 2:
                m = this.f16531a.mo1991m();
                m20636b(m);
                u = this.f16531a.mo1999u() + m;
                do {
                    list.add(Long.valueOf(this.f16531a.mo1994p()));
                } while (this.f16531a.mo1999u() < u);
                return;
            default:
                throw zzbdl.m10345f();
        }
        do {
            list.add(Long.valueOf(this.f16531a.mo1994p()));
            if (!this.f16531a.mo1998t()) {
                m = this.f16531a.mo1973a();
            } else {
                return;
            }
        } while (m == this.f16532b);
        this.f16534d = m;
    }

    /* renamed from: p */
    public final void mo2036p(List<Integer> list) {
        int u;
        if (list instanceof lh) {
            lh lhVar = (lh) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lhVar.m26080c(this.f16531a.mo1995q());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lhVar.m26080c(this.f16531a.mo1995q());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f16531a.mo1995q()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Integer.valueOf(this.f16531a.mo1995q()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: q */
    public final void mo2038q(List<Long> list) {
        int u;
        if (list instanceof lp) {
            lp lpVar = (lp) list;
            list = this.f16532b & 7;
            if (list == null) {
                do {
                    lpVar.m26085a(this.f16531a.mo1996r());
                    if (this.f16531a.mo1998t() == null) {
                        list = this.f16531a.mo1973a();
                    } else {
                        return;
                    }
                } while (list == this.f16532b);
                this.f16534d = list;
                return;
            } else if (list == 2) {
                u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
                do {
                    lpVar.m26085a(this.f16531a.mo1996r());
                } while (this.f16531a.mo1999u() < u);
                m20640d(u);
                return;
            } else {
                throw zzbdl.m10345f();
            }
        }
        int i = this.f16532b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f16531a.mo1996r()));
                if (!this.f16531a.mo1998t()) {
                    i = this.f16531a.mo1973a();
                } else {
                    return;
                }
            } while (i == this.f16532b);
            this.f16534d = i;
        } else if (i == 2) {
            u = this.f16531a.mo1999u() + this.f16531a.mo1991m();
            do {
                list.add(Long.valueOf(this.f16531a.mo1996r()));
            } while (this.f16531a.mo1999u() < u);
            m20640d(u);
        } else {
            throw zzbdl.m10345f();
        }
    }

    /* renamed from: b */
    private static void m20636b(int i) {
        if ((i & 7) != 0) {
            throw zzbdl.m10347h();
        }
    }

    /* renamed from: a */
    public final <K, V> void mo2004a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.lt<K, V> r7, com.google.android.gms.internal.ads.zzbcq r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = 2;
        r5.m20634a(r0);
        r0 = r5.f16531a;
        r0 = r0.mo1991m();
        r1 = r5.f16531a;
        r0 = r1.mo1979d(r0);
        r1 = r7.f8231b;
        r2 = r7.f8233d;
    L_0x0014:
        r3 = r5.mo2000a();	 Catch:{ all -> 0x0067 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ all -> 0x0067 }
        if (r3 == r4) goto L_0x005e;	 Catch:{ all -> 0x0067 }
    L_0x001d:
        r4 = r5.f16531a;	 Catch:{ all -> 0x0067 }
        r4 = r4.mo1998t();	 Catch:{ all -> 0x0067 }
        if (r4 != 0) goto L_0x005e;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x003b;
            case 2: goto L_0x002d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5.mo2010c();	 Catch:{ zzbdm -> 0x004f }
        goto L_0x0044;	 Catch:{ zzbdm -> 0x004f }
    L_0x002d:
        r3 = r7.f8232c;	 Catch:{ zzbdm -> 0x004f }
        r4 = r7.f8233d;	 Catch:{ zzbdm -> 0x004f }
        r4 = r4.getClass();	 Catch:{ zzbdm -> 0x004f }
        r3 = r5.m20633a(r3, r4, r8);	 Catch:{ zzbdm -> 0x004f }
        r2 = r3;	 Catch:{ zzbdm -> 0x004f }
        goto L_0x0014;	 Catch:{ zzbdm -> 0x004f }
    L_0x003b:
        r3 = r7.f8230a;	 Catch:{ zzbdm -> 0x004f }
        r4 = 0;	 Catch:{ zzbdm -> 0x004f }
        r3 = r5.m20633a(r3, r4, r4);	 Catch:{ zzbdm -> 0x004f }
        r1 = r3;	 Catch:{ zzbdm -> 0x004f }
        goto L_0x0014;	 Catch:{ zzbdm -> 0x004f }
    L_0x0044:
        if (r3 == 0) goto L_0x0047;	 Catch:{ zzbdm -> 0x004f }
    L_0x0046:
        goto L_0x0014;	 Catch:{ zzbdm -> 0x004f }
    L_0x0047:
        r3 = new com.google.android.gms.internal.ads.zzbdl;	 Catch:{ zzbdm -> 0x004f }
        r4 = "Unable to parse map entry.";	 Catch:{ zzbdm -> 0x004f }
        r3.<init>(r4);	 Catch:{ zzbdm -> 0x004f }
        throw r3;	 Catch:{ zzbdm -> 0x004f }
    L_0x004f:
        r3 = r5.mo2010c();	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x0067 }
    L_0x0055:
        goto L_0x0014;	 Catch:{ all -> 0x0067 }
    L_0x0056:
        r6 = new com.google.android.gms.internal.ads.zzbdl;	 Catch:{ all -> 0x0067 }
        r7 = "Unable to parse map entry.";	 Catch:{ all -> 0x0067 }
        r6.<init>(r7);	 Catch:{ all -> 0x0067 }
        throw r6;	 Catch:{ all -> 0x0067 }
    L_0x005e:
        r6.put(r1, r2);	 Catch:{ all -> 0x0067 }
        r6 = r5.f16531a;
        r6.mo1982e(r0);
        return;
    L_0x0067:
        r6 = move-exception;
        r7 = r5.f16531a;
        r7.mo1982e(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ks.a(java.util.Map, com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.zzbcq):void");
    }

    /* renamed from: a */
    private final Object m20633a(zzbgj zzbgj, Class<?> cls, zzbcq zzbcq) {
        switch (kt.f8211a[zzbgj.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo2026k());
            case 2:
                return mo2031n();
            case 3:
                return Double.valueOf(mo2011d());
            case 4:
                return Integer.valueOf(mo2035p());
            case 5:
                return Integer.valueOf(mo2023j());
            case 6:
                return Long.valueOf(mo2021i());
            case 7:
                return Float.valueOf(mo2013e());
            case 8:
                return Integer.valueOf(mo2019h());
            case 9:
                return Long.valueOf(mo2017g());
            case 10:
                m20634a(2);
                return m20637c(mh.m9048a().m9050a((Class) cls), zzbcq);
            case 11:
                return Integer.valueOf(mo2037q());
            case 12:
                return Long.valueOf(mo2039r());
            case 13:
                return Integer.valueOf(mo2040s());
            case 14:
                return Long.valueOf(mo2041t());
            case 15:
                return mo2029m();
            case 16:
                return Integer.valueOf(mo2033o());
            case 17:
                return Long.valueOf(mo2015f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m20638c(int i) {
        if ((i & 3) != 0) {
            throw zzbdl.m10347h();
        }
    }

    /* renamed from: d */
    private final void m20640d(int i) {
        if (this.f16531a.mo1999u() != i) {
            throw zzbdl.m10340a();
        }
    }
}
