package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class cp {
    /* renamed from: A */
    private boolean f10576A;
    /* renamed from: B */
    private long f10577B;
    /* renamed from: C */
    private long f10578C;
    /* renamed from: a */
    private final zzbt f10579a;
    /* renamed from: b */
    private final String f10580b;
    /* renamed from: c */
    private String f10581c;
    /* renamed from: d */
    private String f10582d;
    /* renamed from: e */
    private String f10583e;
    /* renamed from: f */
    private String f10584f;
    /* renamed from: g */
    private long f10585g;
    /* renamed from: h */
    private long f10586h;
    /* renamed from: i */
    private long f10587i;
    /* renamed from: j */
    private String f10588j;
    /* renamed from: k */
    private long f10589k;
    /* renamed from: l */
    private String f10590l;
    /* renamed from: m */
    private long f10591m;
    /* renamed from: n */
    private long f10592n;
    /* renamed from: o */
    private boolean f10593o;
    /* renamed from: p */
    private long f10594p;
    /* renamed from: q */
    private boolean f10595q;
    /* renamed from: r */
    private boolean f10596r;
    /* renamed from: s */
    private String f10597s;
    /* renamed from: t */
    private long f10598t;
    /* renamed from: u */
    private long f10599u;
    /* renamed from: v */
    private long f10600v;
    /* renamed from: w */
    private long f10601w;
    /* renamed from: x */
    private long f10602x;
    /* renamed from: y */
    private long f10603y;
    /* renamed from: z */
    private String f10604z;

    cp(zzbt zzbt, String str) {
        Preconditions.checkNotNull(zzbt);
        Preconditions.checkNotEmpty(str);
        this.f10579a = zzbt;
        this.f10580b = str;
        this.f10579a.mo3171q().mo4395d();
    }

    /* renamed from: a */
    public final void m12250a() {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A = false;
    }

    /* renamed from: b */
    public final String m12254b() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10580b;
    }

    /* renamed from: c */
    public final String m12258c() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10581c;
    }

    /* renamed from: a */
    public final void m12252a(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10581c, str) ^ 1;
        this.f10581c = str;
    }

    /* renamed from: d */
    public final String m12262d() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10582d;
    }

    /* renamed from: b */
    public final void m12256b(String str) {
        this.f10579a.mo3171q().mo4395d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10576A |= zzfk.m28604c(this.f10582d, str) ^ 1;
        this.f10582d = str;
    }

    /* renamed from: e */
    public final String m12265e() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10597s;
    }

    /* renamed from: c */
    public final void m12260c(String str) {
        this.f10579a.mo3171q().mo4395d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10576A |= zzfk.m28604c(this.f10597s, str) ^ 1;
        this.f10597s = str;
    }

    /* renamed from: f */
    public final String m12268f() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10583e;
    }

    /* renamed from: d */
    public final void m12264d(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10583e, str) ^ 1;
        this.f10583e = str;
    }

    /* renamed from: g */
    public final String m12271g() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10584f;
    }

    /* renamed from: e */
    public final void m12267e(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10584f, str) ^ 1;
        this.f10584f = str;
    }

    /* renamed from: h */
    public final long m12274h() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10586h;
    }

    /* renamed from: a */
    public final void m12251a(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10586h != j ? 1 : 0;
        this.f10586h = j;
    }

    /* renamed from: i */
    public final long m12277i() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10587i;
    }

    /* renamed from: b */
    public final void m12255b(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10587i != j ? 1 : 0;
        this.f10587i = j;
    }

    /* renamed from: j */
    public final String m12279j() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10588j;
    }

    /* renamed from: f */
    public final void m12270f(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10588j, str) ^ 1;
        this.f10588j = str;
    }

    /* renamed from: k */
    public final long m12281k() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10589k;
    }

    /* renamed from: c */
    public final void m12259c(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10589k != j ? 1 : 0;
        this.f10589k = j;
    }

    /* renamed from: l */
    public final String m12283l() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10590l;
    }

    /* renamed from: g */
    public final void m12273g(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10590l, str) ^ 1;
        this.f10590l = str;
    }

    /* renamed from: m */
    public final long m12285m() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10591m;
    }

    /* renamed from: d */
    public final void m12263d(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10591m != j ? 1 : 0;
        this.f10591m = j;
    }

    /* renamed from: n */
    public final long m12287n() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10592n;
    }

    /* renamed from: e */
    public final void m12266e(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10592n != j ? 1 : 0;
        this.f10592n = j;
    }

    /* renamed from: o */
    public final boolean m12290o() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10593o;
    }

    /* renamed from: a */
    public final void m12253a(boolean z) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10593o != z ? 1 : 0;
        this.f10593o = z;
    }

    /* renamed from: f */
    public final void m12269f(long j) {
        int i = 0;
        Preconditions.checkArgument(j >= 0);
        this.f10579a.mo3171q().mo4395d();
        boolean z = this.f10576A;
        if (this.f10585g != j) {
            i = 1;
        }
        this.f10576A = i | z;
        this.f10585g = j;
    }

    /* renamed from: p */
    public final long m12291p() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10585g;
    }

    /* renamed from: q */
    public final long m12292q() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10577B;
    }

    /* renamed from: g */
    public final void m12272g(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10577B != j ? 1 : 0;
        this.f10577B = j;
    }

    /* renamed from: r */
    public final long m12293r() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10578C;
    }

    /* renamed from: h */
    public final void m12275h(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10578C != j ? 1 : 0;
        this.f10578C = j;
    }

    /* renamed from: s */
    public final void m12294s() {
        this.f10579a.mo3171q().mo4395d();
        long j = this.f10585g + 1;
        if (j > 2147483647L) {
            this.f10579a.mo3172r().m28540i().m12355a("Bundle index overflow. appId", zzap.m28525a(this.f10580b));
            j = 0;
        }
        this.f10576A = true;
        this.f10585g = j;
    }

    /* renamed from: t */
    public final long m12295t() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10598t;
    }

    /* renamed from: i */
    public final void m12278i(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10598t != j ? 1 : 0;
        this.f10598t = j;
    }

    /* renamed from: u */
    public final long m12296u() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10599u;
    }

    /* renamed from: j */
    public final void m12280j(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10599u != j ? 1 : 0;
        this.f10599u = j;
    }

    /* renamed from: v */
    public final long m12297v() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10600v;
    }

    /* renamed from: k */
    public final void m12282k(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10600v != j ? 1 : 0;
        this.f10600v = j;
    }

    /* renamed from: w */
    public final long m12298w() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10601w;
    }

    /* renamed from: l */
    public final void m12284l(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10601w != j ? 1 : 0;
        this.f10601w = j;
    }

    /* renamed from: x */
    public final long m12299x() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10603y;
    }

    /* renamed from: m */
    public final void m12286m(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10603y != j ? 1 : 0;
        this.f10603y = j;
    }

    /* renamed from: y */
    public final long m12300y() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10602x;
    }

    /* renamed from: n */
    public final void m12288n(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10602x != j ? 1 : 0;
        this.f10602x = j;
    }

    /* renamed from: z */
    public final String m12301z() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10604z;
    }

    /* renamed from: A */
    public final String m12246A() {
        this.f10579a.mo3171q().mo4395d();
        String str = this.f10604z;
        m12276h(null);
        return str;
    }

    /* renamed from: h */
    public final void m12276h(String str) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= zzfk.m28604c(this.f10604z, str) ^ 1;
        this.f10604z = str;
    }

    /* renamed from: B */
    public final long m12247B() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10594p;
    }

    /* renamed from: o */
    public final void m12289o(long j) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A |= this.f10594p != j ? 1 : 0;
        this.f10594p = j;
    }

    /* renamed from: C */
    public final boolean m12248C() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10595q;
    }

    /* renamed from: b */
    public final void m12257b(boolean z) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A = this.f10595q != z;
        this.f10595q = z;
    }

    /* renamed from: D */
    public final boolean m12249D() {
        this.f10579a.mo3171q().mo4395d();
        return this.f10596r;
    }

    /* renamed from: c */
    public final void m12261c(boolean z) {
        this.f10579a.mo3171q().mo4395d();
        this.f10576A = this.f10596r != z;
        this.f10596r = z;
    }
}
