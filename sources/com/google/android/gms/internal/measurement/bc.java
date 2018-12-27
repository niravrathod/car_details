package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;

final class bc implements ct {
    /* renamed from: a */
    private final zzuo f17436a;
    /* renamed from: b */
    private int f17437b;
    /* renamed from: c */
    private int f17438c;
    /* renamed from: d */
    private int f17439d = 0;

    /* renamed from: a */
    public static bc m22212a(zzuo zzuo) {
        if (zzuo.f10200c != null) {
            return zzuo.f10200c;
        }
        return new bc(zzuo);
    }

    private bc(zzuo zzuo) {
        this.f17436a = (zzuo) zzvo.m12071a((Object) zzuo, "input");
        this.f17436a.f10200c = this;
    }

    /* renamed from: a */
    public final int mo2954a() {
        if (this.f17439d != 0) {
            this.f17437b = this.f17439d;
            this.f17439d = 0;
        } else {
            this.f17437b = this.f17436a.mo2927a();
        }
        if (this.f17437b != 0) {
            if (this.f17437b != this.f17438c) {
                return this.f17437b >>> 3;
            }
        }
        return BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public final int mo2959b() {
        return this.f17437b;
    }

    /* renamed from: c */
    public final boolean mo2964c() {
        if (!this.f17436a.mo2952t()) {
            if (this.f17437b != this.f17438c) {
                return this.f17436a.mo2931b(this.f17437b);
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m22214a(int i) {
        if ((this.f17437b & 7) != i) {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: d */
    public final double mo2965d() {
        m22214a(1);
        return this.f17436a.mo2930b();
    }

    /* renamed from: e */
    public final float mo2967e() {
        m22214a(5);
        return this.f17436a.mo2932c();
    }

    /* renamed from: f */
    public final long mo2969f() {
        m22214a(0);
        return this.f17436a.mo2934d();
    }

    /* renamed from: g */
    public final long mo2971g() {
        m22214a(0);
        return this.f17436a.mo2935e();
    }

    /* renamed from: h */
    public final int mo2973h() {
        m22214a(0);
        return this.f17436a.mo2937f();
    }

    /* renamed from: i */
    public final long mo2975i() {
        m22214a(1);
        return this.f17436a.mo2939g();
    }

    /* renamed from: j */
    public final int mo2977j() {
        m22214a(5);
        return this.f17436a.mo2940h();
    }

    /* renamed from: k */
    public final boolean mo2980k() {
        m22214a(0);
        return this.f17436a.mo2941i();
    }

    /* renamed from: l */
    public final String mo2981l() {
        m22214a(2);
        return this.f17436a.mo2942j();
    }

    /* renamed from: m */
    public final String mo2983m() {
        m22214a(2);
        return this.f17436a.mo2943k();
    }

    /* renamed from: a */
    public final <T> T mo2955a(cu<T> cuVar, zzuz zzuz) {
        m22214a(2);
        return m22217c(cuVar, zzuz);
    }

    /* renamed from: b */
    public final <T> T mo2960b(cu<T> cuVar, zzuz zzuz) {
        m22214a(3);
        return m22219d(cuVar, zzuz);
    }

    /* renamed from: c */
    private final <T> T m22217c(cu<T> cuVar, zzuz zzuz) {
        int m = this.f17436a.mo2945m();
        if (this.f17436a.f10198a < this.f17436a.f10199b) {
            m = this.f17436a.mo2933d(m);
            T a = cuVar.mo3064a();
            zzuo zzuo = this.f17436a;
            zzuo.f10198a++;
            cuVar.mo3065a(a, this, zzuz);
            cuVar.mo3070c(a);
            this.f17436a.mo2929a(null);
            cuVar = this.f17436a;
            cuVar.f10198a--;
            this.f17436a.mo2936e(m);
            return a;
        }
        throw zzvt.m12086f();
    }

    /* renamed from: d */
    private final <T> T m22219d(cu<T> cuVar, zzuz zzuz) {
        int i = this.f17438c;
        T t = ((this.f17437b >>> 3) << 3) | 4;
        this.f17438c = t;
        try {
            t = cuVar.mo3064a();
            cuVar.mo3065a(t, this, zzuz);
            cuVar.mo3070c(t);
            if (this.f17437b == this.f17438c) {
                return t;
            }
            throw zzvt.m12087g();
        } finally {
            this.f17438c = i;
        }
    }

    /* renamed from: n */
    public final zzud mo2985n() {
        m22214a(2);
        return this.f17436a.mo2944l();
    }

    /* renamed from: o */
    public final int mo2987o() {
        m22214a(0);
        return this.f17436a.mo2945m();
    }

    /* renamed from: p */
    public final int mo2989p() {
        m22214a(0);
        return this.f17436a.mo2946n();
    }

    /* renamed from: q */
    public final int mo2991q() {
        m22214a(5);
        return this.f17436a.mo2947o();
    }

    /* renamed from: r */
    public final long mo2993r() {
        m22214a(1);
        return this.f17436a.mo2948p();
    }

    /* renamed from: s */
    public final int mo2994s() {
        m22214a(0);
        return this.f17436a.mo2949q();
    }

    /* renamed from: t */
    public final long mo2995t() {
        m22214a(0);
        return this.f17436a.mo2950r();
    }

    /* renamed from: a */
    public final void mo2956a(List<Double> list) {
        int m;
        int u;
        if (list instanceof bg) {
            bg bgVar = (bg) list;
            switch (this.f17437b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f17436a.mo2945m();
                    m22216b(m);
                    u = this.f17436a.mo2953u() + m;
                    do {
                        bgVar.m27072a(this.f17436a.mo2930b());
                    } while (this.f17436a.mo2953u() < u);
                    return;
                default:
                    throw zzvt.m12085e();
            }
            do {
                bgVar.m27072a(this.f17436a.mo2930b());
                if (!this.f17436a.mo2952t()) {
                    m = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (m == this.f17437b);
            this.f17439d = m;
            return;
        }
        switch (this.f17437b & 7) {
            case 1:
                break;
            case 2:
                m = this.f17436a.mo2945m();
                m22216b(m);
                u = this.f17436a.mo2953u() + m;
                do {
                    list.add(Double.valueOf(this.f17436a.mo2930b()));
                } while (this.f17436a.mo2953u() < u);
                return;
            default:
                throw zzvt.m12085e();
        }
        do {
            list.add(Double.valueOf(this.f17436a.mo2930b()));
            if (!this.f17436a.mo2952t()) {
                m = this.f17436a.mo2927a();
            } else {
                return;
            }
        } while (m == this.f17437b);
        this.f17439d = m;
    }

    /* renamed from: b */
    public final void mo2961b(List<Float> list) {
        if (list instanceof bo) {
            bo boVar = (bo) list;
            list = this.f17437b & 7;
            if (list == 2) {
                int m = this.f17436a.mo2945m();
                m22218c(m);
                int u = this.f17436a.mo2953u() + m;
                do {
                    boVar.m27077a(this.f17436a.mo2932c());
                } while (this.f17436a.mo2953u() < u);
                return;
            } else if (list == 5) {
                do {
                    boVar.m27077a(this.f17436a.mo2932c());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 2) {
            i = this.f17436a.mo2945m();
            m22218c(i);
            int u2 = this.f17436a.mo2953u() + i;
            do {
                list.add(Float.valueOf(this.f17436a.mo2932c()));
            } while (this.f17436a.mo2953u() < u2);
        } else if (i == 5) {
            do {
                list.add(Float.valueOf(this.f17436a.mo2932c()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: c */
    public final void mo2963c(List<Long> list) {
        int u;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    bzVar.m27088a(this.f17436a.mo2934d());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    bzVar.m27088a(this.f17436a.mo2934d());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f17436a.mo2934d()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Long.valueOf(this.f17436a.mo2934d()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: d */
    public final void mo2966d(List<Long> list) {
        int u;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    bzVar.m27088a(this.f17436a.mo2935e());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    bzVar.m27088a(this.f17436a.mo2935e());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f17436a.mo2935e()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Long.valueOf(this.f17436a.mo2935e()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: e */
    public final void mo2968e(List<Integer> list) {
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    brVar.m27083c(this.f17436a.mo2937f());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    brVar.m27083c(this.f17436a.mo2937f());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2937f()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Integer.valueOf(this.f17436a.mo2937f()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: f */
    public final void mo2970f(List<Long> list) {
        int m;
        int u;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            switch (this.f17437b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f17436a.mo2945m();
                    m22216b(m);
                    u = this.f17436a.mo2953u() + m;
                    do {
                        bzVar.m27088a(this.f17436a.mo2939g());
                    } while (this.f17436a.mo2953u() < u);
                    return;
                default:
                    throw zzvt.m12085e();
            }
            do {
                bzVar.m27088a(this.f17436a.mo2939g());
                if (!this.f17436a.mo2952t()) {
                    m = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (m == this.f17437b);
            this.f17439d = m;
            return;
        }
        switch (this.f17437b & 7) {
            case 1:
                break;
            case 2:
                m = this.f17436a.mo2945m();
                m22216b(m);
                u = this.f17436a.mo2953u() + m;
                do {
                    list.add(Long.valueOf(this.f17436a.mo2939g()));
                } while (this.f17436a.mo2953u() < u);
                return;
            default:
                throw zzvt.m12085e();
        }
        do {
            list.add(Long.valueOf(this.f17436a.mo2939g()));
            if (!this.f17436a.mo2952t()) {
                m = this.f17436a.mo2927a();
            } else {
                return;
            }
        } while (m == this.f17437b);
        this.f17439d = m;
    }

    /* renamed from: g */
    public final void mo2972g(List<Integer> list) {
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == 2) {
                int m = this.f17436a.mo2945m();
                m22218c(m);
                int u = this.f17436a.mo2953u() + m;
                do {
                    brVar.m27083c(this.f17436a.mo2940h());
                } while (this.f17436a.mo2953u() < u);
                return;
            } else if (list == 5) {
                do {
                    brVar.m27083c(this.f17436a.mo2940h());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 2) {
            i = this.f17436a.mo2945m();
            m22218c(i);
            int u2 = this.f17436a.mo2953u() + i;
            do {
                list.add(Integer.valueOf(this.f17436a.mo2940h()));
            } while (this.f17436a.mo2953u() < u2);
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2940h()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: h */
    public final void mo2974h(List<Boolean> list) {
        if (list instanceof at) {
            at atVar = (at) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    atVar.m27067a(this.f17436a.mo2941i());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    atVar.m27067a(this.f17436a.mo2941i());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(this.f17436a.mo2941i()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Boolean.valueOf(this.f17436a.mo2941i()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: i */
    public final void mo2976i(List<String> list) {
        m22215a((List) list, false);
    }

    /* renamed from: j */
    public final void mo2978j(List<String> list) {
        m22215a((List) list, true);
    }

    /* renamed from: a */
    private final void m22215a(List<String> list, boolean z) {
        if ((this.f17437b & 7) != 2) {
            throw zzvt.m12085e();
        } else if (!(list instanceof zzwc) || z) {
            int a;
            do {
                list.add(z ? mo2983m() : mo2981l());
                if (!this.f17436a.mo2952t()) {
                    a = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (a == this.f17437b);
            this.f17439d = a;
        } else {
            zzwc zzwc = (zzwc) list;
            do {
                zzwc.mo3156a(mo2985n());
                if (this.f17436a.mo2952t() == null) {
                    list = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (list == this.f17437b);
            this.f17439d = list;
        }
    }

    /* renamed from: a */
    public final <T> void mo2957a(List<T> list, cu<T> cuVar, zzuz zzuz) {
        if ((this.f17437b & 7) == 2) {
            int a;
            int i = this.f17437b;
            do {
                list.add(m22217c(cuVar, zzuz));
                if (!this.f17436a.mo2952t()) {
                    if (this.f17439d == 0) {
                        a = this.f17436a.mo2927a();
                    }
                }
                return;
            } while (a == i);
            this.f17439d = a;
            return;
        }
        throw zzvt.m12085e();
    }

    /* renamed from: b */
    public final <T> void mo2962b(List<T> list, cu<T> cuVar, zzuz zzuz) {
        if ((this.f17437b & 7) == 3) {
            int a;
            int i = this.f17437b;
            do {
                list.add(m22219d(cuVar, zzuz));
                if (!this.f17436a.mo2952t()) {
                    if (this.f17439d == 0) {
                        a = this.f17436a.mo2927a();
                    }
                }
                return;
            } while (a == i);
            this.f17439d = a;
            return;
        }
        throw zzvt.m12085e();
    }

    /* renamed from: k */
    public final void mo2979k(List<zzud> list) {
        if ((this.f17437b & 7) == 2) {
            int a;
            do {
                list.add(mo2985n());
                if (!this.f17436a.mo2952t()) {
                    a = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (a == this.f17437b);
            this.f17439d = a;
            return;
        }
        throw zzvt.m12085e();
    }

    /* renamed from: l */
    public final void mo2982l(List<Integer> list) {
        int u;
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    brVar.m27083c(this.f17436a.mo2945m());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    brVar.m27083c(this.f17436a.mo2945m());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2945m()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Integer.valueOf(this.f17436a.mo2945m()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: m */
    public final void mo2984m(List<Integer> list) {
        int u;
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    brVar.m27083c(this.f17436a.mo2946n());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    brVar.m27083c(this.f17436a.mo2946n());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2946n()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Integer.valueOf(this.f17436a.mo2946n()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: n */
    public final void mo2986n(List<Integer> list) {
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == 2) {
                int m = this.f17436a.mo2945m();
                m22218c(m);
                int u = this.f17436a.mo2953u() + m;
                do {
                    brVar.m27083c(this.f17436a.mo2947o());
                } while (this.f17436a.mo2953u() < u);
                return;
            } else if (list == 5) {
                do {
                    brVar.m27083c(this.f17436a.mo2947o());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 2) {
            i = this.f17436a.mo2945m();
            m22218c(i);
            int u2 = this.f17436a.mo2953u() + i;
            do {
                list.add(Integer.valueOf(this.f17436a.mo2947o()));
            } while (this.f17436a.mo2953u() < u2);
        } else if (i == 5) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2947o()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: o */
    public final void mo2988o(List<Long> list) {
        int m;
        int u;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            switch (this.f17437b & 7) {
                case 1:
                    break;
                case 2:
                    m = this.f17436a.mo2945m();
                    m22216b(m);
                    u = this.f17436a.mo2953u() + m;
                    do {
                        bzVar.m27088a(this.f17436a.mo2948p());
                    } while (this.f17436a.mo2953u() < u);
                    return;
                default:
                    throw zzvt.m12085e();
            }
            do {
                bzVar.m27088a(this.f17436a.mo2948p());
                if (!this.f17436a.mo2952t()) {
                    m = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (m == this.f17437b);
            this.f17439d = m;
            return;
        }
        switch (this.f17437b & 7) {
            case 1:
                break;
            case 2:
                m = this.f17436a.mo2945m();
                m22216b(m);
                u = this.f17436a.mo2953u() + m;
                do {
                    list.add(Long.valueOf(this.f17436a.mo2948p()));
                } while (this.f17436a.mo2953u() < u);
                return;
            default:
                throw zzvt.m12085e();
        }
        do {
            list.add(Long.valueOf(this.f17436a.mo2948p()));
            if (!this.f17436a.mo2952t()) {
                m = this.f17436a.mo2927a();
            } else {
                return;
            }
        } while (m == this.f17437b);
        this.f17439d = m;
    }

    /* renamed from: p */
    public final void mo2990p(List<Integer> list) {
        if (list instanceof br) {
            br brVar = (br) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    brVar.m27083c(this.f17436a.mo2949q());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                int u;
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    brVar.m27083c(this.f17436a.mo2949q());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(this.f17436a.mo2949q()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Integer.valueOf(this.f17436a.mo2949q()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: q */
    public final void mo2992q(List<Long> list) {
        int u;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            list = this.f17437b & 7;
            if (list == null) {
                do {
                    bzVar.m27088a(this.f17436a.mo2950r());
                    if (this.f17436a.mo2952t() == null) {
                        list = this.f17436a.mo2927a();
                    } else {
                        return;
                    }
                } while (list == this.f17437b);
                this.f17439d = list;
                return;
            } else if (list == 2) {
                u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
                do {
                    bzVar.m27088a(this.f17436a.mo2950r());
                } while (this.f17436a.mo2953u() < u);
                m22220d(u);
                return;
            } else {
                throw zzvt.m12085e();
            }
        }
        int i = this.f17437b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(this.f17436a.mo2950r()));
                if (!this.f17436a.mo2952t()) {
                    i = this.f17436a.mo2927a();
                } else {
                    return;
                }
            } while (i == this.f17437b);
            this.f17439d = i;
        } else if (i == 2) {
            u = this.f17436a.mo2953u() + this.f17436a.mo2945m();
            do {
                list.add(Long.valueOf(this.f17436a.mo2950r()));
            } while (this.f17436a.mo2953u() < u);
            m22220d(u);
        } else {
            throw zzvt.m12085e();
        }
    }

    /* renamed from: b */
    private static void m22216b(int i) {
        if ((i & 7) != 0) {
            throw zzvt.m12087g();
        }
    }

    /* renamed from: a */
    public final <K, V> void mo2958a(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.cd<K, V> r7, com.google.android.gms.internal.measurement.zzuz r8) {
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
        r5.m22214a(r0);
        r0 = r5.f17436a;
        r0 = r0.mo2945m();
        r1 = r5.f17436a;
        r0 = r1.mo2933d(r0);
        r1 = r7.f10062b;
        r2 = r7.f10064d;
    L_0x0014:
        r3 = r5.mo2954a();	 Catch:{ all -> 0x0067 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ all -> 0x0067 }
        if (r3 == r4) goto L_0x005e;	 Catch:{ all -> 0x0067 }
    L_0x001d:
        r4 = r5.f17436a;	 Catch:{ all -> 0x0067 }
        r4 = r4.mo2952t();	 Catch:{ all -> 0x0067 }
        if (r4 != 0) goto L_0x005e;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x003b;
            case 2: goto L_0x002d;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5.mo2964c();	 Catch:{ zzvu -> 0x004f }
        goto L_0x0044;	 Catch:{ zzvu -> 0x004f }
    L_0x002d:
        r3 = r7.f10063c;	 Catch:{ zzvu -> 0x004f }
        r4 = r7.f10064d;	 Catch:{ zzvu -> 0x004f }
        r4 = r4.getClass();	 Catch:{ zzvu -> 0x004f }
        r3 = r5.m22213a(r3, r4, r8);	 Catch:{ zzvu -> 0x004f }
        r2 = r3;	 Catch:{ zzvu -> 0x004f }
        goto L_0x0014;	 Catch:{ zzvu -> 0x004f }
    L_0x003b:
        r3 = r7.f10061a;	 Catch:{ zzvu -> 0x004f }
        r4 = 0;	 Catch:{ zzvu -> 0x004f }
        r3 = r5.m22213a(r3, r4, r4);	 Catch:{ zzvu -> 0x004f }
        r1 = r3;	 Catch:{ zzvu -> 0x004f }
        goto L_0x0014;	 Catch:{ zzvu -> 0x004f }
    L_0x0044:
        if (r3 == 0) goto L_0x0047;	 Catch:{ zzvu -> 0x004f }
    L_0x0046:
        goto L_0x0014;	 Catch:{ zzvu -> 0x004f }
    L_0x0047:
        r3 = new com.google.android.gms.internal.measurement.zzvt;	 Catch:{ zzvu -> 0x004f }
        r4 = "Unable to parse map entry.";	 Catch:{ zzvu -> 0x004f }
        r3.<init>(r4);	 Catch:{ zzvu -> 0x004f }
        throw r3;	 Catch:{ zzvu -> 0x004f }
    L_0x004f:
        r3 = r5.mo2964c();	 Catch:{ all -> 0x0067 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x0067 }
    L_0x0055:
        goto L_0x0014;	 Catch:{ all -> 0x0067 }
    L_0x0056:
        r6 = new com.google.android.gms.internal.measurement.zzvt;	 Catch:{ all -> 0x0067 }
        r7 = "Unable to parse map entry.";	 Catch:{ all -> 0x0067 }
        r6.<init>(r7);	 Catch:{ all -> 0x0067 }
        throw r6;	 Catch:{ all -> 0x0067 }
    L_0x005e:
        r6.put(r1, r2);	 Catch:{ all -> 0x0067 }
        r6 = r5.f17436a;
        r6.mo2936e(r0);
        return;
    L_0x0067:
        r6 = move-exception;
        r7 = r5.f17436a;
        r7.mo2936e(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bc.a(java.util.Map, com.google.android.gms.internal.measurement.cd, com.google.android.gms.internal.measurement.zzuz):void");
    }

    /* renamed from: a */
    private final Object m22213a(zzyq zzyq, Class<?> cls, zzuz zzuz) {
        switch (bd.f10043a[zzyq.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo2980k());
            case 2:
                return mo2985n();
            case 3:
                return Double.valueOf(mo2965d());
            case 4:
                return Integer.valueOf(mo2989p());
            case 5:
                return Integer.valueOf(mo2977j());
            case 6:
                return Long.valueOf(mo2975i());
            case 7:
                return Float.valueOf(mo2967e());
            case 8:
                return Integer.valueOf(mo2973h());
            case 9:
                return Long.valueOf(mo2971g());
            case 10:
                m22214a(2);
                return m22217c(cq.m11570a().m11572a((Class) cls), zzuz);
            case 11:
                return Integer.valueOf(mo2991q());
            case 12:
                return Long.valueOf(mo2993r());
            case 13:
                return Integer.valueOf(mo2994s());
            case 14:
                return Long.valueOf(mo2995t());
            case 15:
                return mo2983m();
            case 16:
                return Integer.valueOf(mo2987o());
            case 17:
                return Long.valueOf(mo2969f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m22218c(int i) {
        if ((i & 3) != 0) {
            throw zzvt.m12087g();
        }
    }

    /* renamed from: d */
    private final void m22220d(int i) {
        if (this.f17436a.mo2953u() != i) {
            throw zzvt.m12081a();
        }
    }
}
